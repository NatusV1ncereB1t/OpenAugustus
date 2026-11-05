package augustus.recovered.modules.movement;
import augustus.recovered.modules.combat.AntiBot_47CG;
import augustus.recovered.modules.combat.KillAura_47CY;
import augustus.recovered.modules.combat.TargetArea_47Cs;
import augustus.recovered.modules.combat.Teams_47C2;
import augustus.recovered.modules.misc.MidClick_47kc;
import java.awt.Color;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_45n;
import net.C_472n;
import net.C_475y;
import net.C_477r;
import net.C_478Q;
import net.C_478k;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47Bv;
import net.C_47EX;
import net.C_47F9;
import net.C_47Ij;
import net.C_47JT;
import net.minecraft.entity.Entity;
import net.C_47Ol;
import client.module.ModuleManager;
import net.C_47S6;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.Setting;
import client.setting.ModeSetting;
import net.C_47UZ;
import client.event.RenderListener;
import net.C_47a7;
import net.C_47aB;
import net.minecraft.entity.EntityLivingBase;
import net.C_47aO;
import net.C_47aX;
import net.C_47an;
import net.C_47cu;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47g9;
import net.C_47gg;
import net.C_47h4;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47j9;
import net.minecraft.client.Minecraft;
import net.C_47nU;
import net.C_47oO;
import net.C_47oY;
import client.ClientGlobals;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47tz;
import net.C_47xz;
import net.C_484;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoWalk_47Cb extends net.C_47Ol implements net.C_47xz,net.C_47JT,net.C_47hi,client.event.RenderListener,net.C_47oO {
    public final client.setting.BooleanSetting settingPathFinding = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDebugLine = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMaxSearchTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingUpdateTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSmooth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingKeepRotation = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingMovementmode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingRotationUpdateTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyWithKillAuraTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingNoWalkDistanceToTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingJump = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingStopWhileEating = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingStopWhileSlowness = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingAdStafeOnHit = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAdStafeTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingDelayAfterRespawn = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashSet field_47M = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47gg field_47x = null; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.ArrayList field_43h; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_47d = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43u; // Runtime access flags and ConstantValue are restored from the original class.
    private java.lang.String field_43E; // Runtime access flags and ConstantValue are restored from the original class.
    private int[] field_47w; // Runtime access flags and ConstantValue are restored from the original class.
    public float field_47i; // Runtime access flags and ConstantValue are restored from the original class.
    public long field_47E; // Runtime access flags and ConstantValue are restored from the original class.
    public long field_40; // Runtime access flags and ConstantValue are restored from the original class.
    public boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    public boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    public net.C_477r field_47_; // Runtime access flags and ConstantValue are restored from the original class.
    public long field_47e; // Runtime access flags and ConstantValue are restored from the original class.
    public net.C_477r field_47l; // Runtime access flags and ConstantValue are restored from the original class.
    public long field_47m; // Runtime access flags and ConstantValue are restored from the original class.
    private static long b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map h; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] j; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] l; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native void b();

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method h(long a0,long a1);

   public static float method_46$e70c882bc6(float var0, float var1) {
      float var2 = Math.abs(var0 - var1);
      return Math.min(var2, 360.0F - var2);
   }



    private static native int e(long a0,long a1);

    private static native java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

   public static double[] method_42$e6753f40ed(float var0, float var1, float var2, long var3) {
      var3 = b ^ var3;
      boolean var5 = recovery$indy$1(-2086815067030055292L, var3);
      float var6 = var1 * var1 + var2 * var2;
      float var14;
      int var10000 = (var14 = var6 - 1.0E-4F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
      if (!var5) {
         if (var10000 >= 0) {
            var6 = C_47sk.method_42$f6c4892e39(var6);
            float var13 = var6;
            if (var3 >= 0L) {
               float var10001 = 1.0F;
               if (!var5) {
                  if (var6 < 1.0F) {
                     var6 = 1.0F;
                  }

                  var6 = 1.0F / var6;
                  var1 *= var6;
                  var2 *= var6;
                  var13 = var0 * (float) Math.PI;
                  var10001 = 180.0F;
               }

               var13 = C_47sk.method_47$f6c4892e39(var13 / var10001);
            }

            float var7 = var13;
            float var8 = C_47sk.method_40$f6c4892e39(var0 * (float) Math.PI / 180.0F);
            return new double[]{var1 * var8 - var2 * var7, var2 * var8 + var1 * var7};
         }

         var10000 = 2;
      }

      double[] var12 = new double[var10000];
      var12[0] = 0.0;
      var12[1] = 0.0;
      return var12;
   }



    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   private static double method_41$83ff7736af(Entity var0) {
      long var1 = b ^ 37151670310398L;
      long var10001 = 3203243350482003794L;
      Minecraft var3 = field_43;
      return var3.field_42P.method_44$ee256e8a75(var0);
   }



    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   private boolean method_46_$0dd78e0064(long var1) {
      var1 = b ^ var1;
      boolean var3 = recovery$indy$2(4447995071940675636L, var1);
      boolean var10000 = recovery$indy$3(field_43, 4443981436952426122L, var1).method_48V$aae029aa0a();
      if (!var3) {
         if (var10000) {
            var10000 = recovery$indy$4(this.settingStopWhileEating, 4440650332376771793L, var1);
            if (var3) {
               return var10000;
            }

            if (var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }



   private boolean method_46s$0dd78e0064(long var1) {
      var1 = b ^ var1;
      long var3 = var1 ^ 71832370281640L;
      long var5 = var1 ^ 85127373647612L;
      return recovery$indy$6(this.field_47d, recovery$indy$5(this.settingDelayAfterRespawn, var3, -5708564195654208325L, var1), var5, -5702538756078129221L, var1);
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      recovery$indy$7(this.field_47d, 3267181436906846291L, var5);
   }



   public Entity method_49$3bb04e24c9(long var1) {
      net.minecraft.entity.Entity var15;
      var1 = b ^ var1;
      Entity var4 = null;
      double var5 = 0.0;
      boolean var10000 = recovery$indy$8(691223064158091580L, var1);
      Iterator var7 = recovery$indy$9(field_43, 687482372333066225L, var1).field_44Q.iterator();
      boolean var3 = var10000;

      label58:
      while (true) {
         var10000 = var7.hasNext();

         while (var10000) {
            Entity var13 = (Entity)var7.next();
            if (var1 <= 0L || !var3) {
               return var13;
            }

            Entity var8 = var13;
            if (!recovery$indy$10(this, var8, 688812577195335881L, var1)) {
               continue label58;
            }

            label52: {
               double var9 = recovery$indy$11(field_43, 684935254957785767L, var1).method_49$ee256e8a75(var8);
               double var14 = var9;
               if (var3) {
                  label49: {
                     if (!(var9 < var5)) {
                        var15 = var4;
                        if (!var3) {
                           break label49;
                        }

                        if (var4 != null) {
                           break label52;
                        }
                     }

                     var15 = var8;
                  }

                  var4 = var15;
                  var14 = var9;
               }

               var5 = var14;
            }

            var10000 = var3;
            if (var1 > 0L) {
               if (var3) {
                  continue label58;
               }
               break;
            }
         }

         return var4;
      }
   }



   public static int[] method_45$3ca4b376ca(float var0, float var1, long var2) {
      double var18;
      var2 = b ^ var2;
      long var4 = var2 ^ 23518211777971L;
      double[] var7 = recovery$indy$12(var1, 0.0F, 1.0F, var4, -59742284497805719L, var2);
      int[] var8 = new int[]{0, 0};
      int var10000 = (int) ((recovery$indy$13(-59988730937749631L, var2)) ? 1 : 0);
      double var9 = -1.0;
      byte var6 = (byte)var10000;
      int var11 = -1;

      label67:
      while (true) {
         var10000 = var11;

         label65:
         while (var10000 <= 1) {
            int var12 = -1;

            label61:
            do {
               var10000 = var12;
               byte var10001 = 1;

               double var14;
               do {
                  if (var10000 > var10001) {
                     break label61;
                  }

                  double[] var13 = recovery$indy$14(var0, var11, var12, var4, -59742284497805719L, var2);
                  var14 = (var13[0] - var7[0]) * (var13[0] - var7[0]) + (var13[1] - var7[1]) * (var13[1] - var7[1]);
                  double var20;
                  var10000 = (var20 = var9 - var14) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1);
                  if (var6 == 0) {
                     continue label65;
                  }

                  var10001 = var6;
               } while (var2 <= 0L);

               label58: {
                  label57: {
                     label56:
                     if (var6 != 0) {
                        if (var10000 <= 0) {
                           var18 = var9;
                           if (var2 < 0L) {
                              break label57;
                           }

                           double var21;
                           var10000 = (var21 = var9 - -1.0) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
                           if (var6 == 0) {
                              break label56;
                           }

                           if (var10000 != 0) {
                              break label58;
                           }
                        }

                        var10000 = 2;
                     }

                     int[] var19 = new int[var10000];
                     var19[0] = var11;
                     var19[1] = var12;
                     var8 = var19;
                     var18 = var14;
                  }

                  var9 = var18;
               }

               var12++;
            } while (var6 != 0);

            var11++;
            var10000 = var6;
            if (var2 >= 0L) {
               if (var6 == 0) {
                  return var8;
               }
               continue label67;
            }
         }

         return var8;
      }
   }




   public void method_45$d94fe11ca8(short var1, net.C_47nU var2, char var3, net.C_47nU var4, int var5) {
      long var6 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ b;
      long var8 = var6 ^ 116143113510L;
      long var10 = var6 ^ 45842162876831L;
      long var12 = var6 ^ 100892571928323L;
      long var14 = var6 ^ 130010625938986L;
      long var16 = var6 ^ 113970575937165L;
      long var10001 = var6 ^ 112654583895052L;
      int var18 = (int)((var6 ^ 112654583895052L) >>> 48);
      int var19 = (int)((var6 ^ 112654583895052L) << 16 >>> 32);
      int var20 = (int)(var10001 << 48 >>> 48);
      boolean var21 = recovery$indy$flow$44(5437639691707760376L, var6);
      boolean var22 = recovery$indy$flow$48(
         ((client.module.ModuleManager)recovery$indy$flow$46((client.Client)recovery$indy$flow$45(5437908905479386029L, var6), 5431813750100757379L, var6)).field_41J,
         var8,
         5432289199049601813L,
         var6
      );
      if (!var21) {
         boolean var27 = var22
            && ((String)recovery$indy$flow$53(
                  ((client.module.ModuleManager)recovery$indy$flow$50((client.Client)recovery$indy$flow$49(5437908905479386029L, var6), 5431813750100757379L, var6)).field_41J.settingMode,
                  var16,
                  5435266581276236644L,
                  var6
               ))
               .equalsIgnoreCase((String)recovery$indy$flow$54(8212, 9051371782403273565L ^ var6));
         net.C_47h4 var28 = new net.C_47h4(var2, var4, var22 && !var27, var10, var27, false);
         var28.field_47U = true;
         this.field_43h = (java.util.ArrayList)recovery$indy$flow$61(
            var28, var14, true, (long)recovery$indy$flow$60(this.settingMaxSearchTime, var12, 5434720559114260240L, var6), 5435032468638518988L, var6
         );
         this.field_47M.clear();
         if (this.field_43h != null) {
            java.util.Iterator var29 = this.field_43h.iterator();

            Object var35;
            label137:
            while (true) {
               if (var29.hasNext()) {
                  var35 = var29.next();

                  while (true) {
                     net.C_47pN var32 = (net.C_47pN)var35;
                     this.field_47M
                        .add(
                           (String)recovery$indy$flow$73(
                              (net.C_47nU)recovery$indy$flow$72(var32, 5435616489971876912L, var6), (short)var18, var19, (short)var20, 5433669218386071984L, var6
                           )
                        );
                     boolean var37 = var21;
                     if (var5 < 0) {
                        if (var21) {
                           return;
                        }

                        var37 = var21;
                     }

                     if (!var37) {
                        break;
                     }

                     var35 = this;
                     if (var5 <= 0) {
                        break label137;
                     }
                  }
               } else {
                  while (true) {
                     var35 = this;
                     if (var5 <= 0) {
                        break label137;
                     }

                     net.C_47pN var31 = (net.C_47pN)(Object) (this);
                     this.field_47M
                        .add(
                           (String)recovery$indy$flow$73(
                              (net.C_47nU)recovery$indy$flow$72(var31, 5435616489971876912L, var6), (short)var18, var19, (short)var20, 5433669218386071984L, var6
                           )
                        );
                     boolean var36 = var21;
                     if (var5 < 0) {
                        if (var21) {
                           return;
                        }

                        var36 = var21;
                     }

                     if (!var36) {
                        break;
                     }
                  }
               }
            }

            ((AutoWalk_47Cb)var35).field_43y = 0;
         }
      } else {
         boolean var23 = var22;
         net.C_47h4 var24 = new net.C_47h4(var2, var4, var22 && !var23, var10, var23, false);
         var24.field_47U = true;
         this.field_43h = (java.util.ArrayList)recovery$indy$flow$61(
            var24, var14, true, (long)recovery$indy$flow$60(this.settingMaxSearchTime, var12, 5434720559114260240L, var6), 5435032468638518988L, var6
         );
         this.field_47M.clear();
         java.util.Iterator var25 = this.field_43h.iterator();

         Object var10000;
         label176:
         while (true) {
            if (var25.hasNext()) {
               var10000 = var25.next();

               while (true) {
                  net.C_47pN var30 = (net.C_47pN)var10000;
                  this.field_47M
                     .add(
                        (String)recovery$indy$flow$73(
                           (net.C_47nU)recovery$indy$flow$72(var30, 5435616489971876912L, var6), (short)var18, var19, (short)var20, 5433669218386071984L, var6
                        )
                     );
                  boolean var34 = var21;
                  if (var5 < 0) {
                     if (var21) {
                        return;
                     }

                     var34 = var21;
                  }

                  if (!var34) {
                     break;
                  }

                  var10000 = this;
                  if (var5 <= 0) {
                     break label176;
                  }
               }
            } else {
               while (true) {
                  var10000 = this;
                  if (var5 <= 0) {
                     break label176;
                  }

                  net.C_47pN var26 = (net.C_47pN)(Object) (this);
                  this.field_47M
                     .add(
                        (String)recovery$indy$flow$73(
                           (net.C_47nU)recovery$indy$flow$72(var26, 5435616489971876912L, var6), (short)var18, var19, (short)var20, 5433669218386071984L, var6
                        )
                     );
                  boolean var33 = var21;
                  if (var5 < 0) {
                     if (var21) {
                        return;
                     }

                     var33 = var21;
                  }

                  if (!var33) {
                     break;
                  }
               }
            }
         }

         ((AutoWalk_47Cb)var10000).field_43y = 0;
      }
   }




   private boolean method_45$7c2c45e4ce(net.minecraft.entity.Entity var1) {
      long var2 = b ^ 122322566247678L;
      long var4 = var2 ^ 97129841443634L;
      long var6 = var2 ^ 135440031741931L;
      long var8 = var2 ^ 78579966659908L;
      long var10001 = var2 ^ 119051444588309L;
      int var10 = (int)((var2 ^ 119051444588309L) >>> 48);
      int var11 = (int)((var2 ^ 119051444588309L) << 16 >>> 32);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var2 ^ 3913368469783L;
      long var15 = var2 ^ 26482498077005L;
      long var17 = var2 ^ 7433128264748L;
      long var10000 = 5576081070263580908L;
      boolean var19 = Fly_47kE.method_49t$aae029aa0a();
      boolean var53 = var1 instanceof EntityPlayerSP;
      if (var19) {
         return var53;
      }

      if (!var53) {
         long var10002 = 5582002998999474956L;
         long var20 = var17;
         AutoWalk_47Cb var22 = this;
         if (var22.method_46s$0dd78e0064(var20)) {
            label240: {
               if (var1 instanceof EntityPlayer) {
                  var10001 = 5583535317878779039L;
                  net.C_47g9 var23 = net.C_47g9.PLAYER;
                  if (var23.method_43$aae029aa0a()) {
                     break label240;
                  }
               }

               if (var1 instanceof net.C_47aO || var1 instanceof net.C_47a7 || var1 instanceof C_47aX) {
                  var10001 = 5583535317878779039L;
                  net.C_47g9 var24 = net.C_47g9.MOB;
                  if (var24.method_43$aae029aa0a()) {
                     break label240;
                  }
               }

               if (var1 instanceof C_47an) {
                  var10001 = 5583535317878779039L;
                  net.C_47g9 var25 = net.C_47g9.VILLAGER;
                  if (var25.method_43$aae029aa0a()) {
                     break label240;
                  }
               }

               if (var1 instanceof C_47aB) {
                  var10001 = 5583535317878779039L;
                  net.C_47g9 var26 = net.C_47g9.ANIMAL;
                  if (var26.method_43$aae029aa0a()) {
                     break label240;
                  }
               }

               if (!(var1 instanceof C_47Bv)) {
                  return false;
               }

               var10001 = 5583535317878779039L;
               net.C_47g9 var27 = net.C_47g9.ARMOR_STAND;
               if (!var27.method_43$aae029aa0a()) {
                  return false;
               }
            }

            if (var1.method_48y$aae029aa0a()) {
               var10001 = 5583535317878779039L;
               net.C_47g9 var28 = net.C_47g9.INVISIBLE;
               if (!var28.method_43$aae029aa0a()) {
                  return false;
               }
            }

            if (var1.field_48y > 0
               && !var1.field_427
               && !var1.method_41$0e30dfc966().equals("§aShop")
               && !var1.method_41$0e30dfc966().equals("SHOP")
               && !var1.method_41$0e30dfc966().equals("UPGRADES")) {
               if (var1 instanceof EntityPlayer) {
                  short var62 = (short)var10;
                  long var10005 = 5581340411605976012L;
                  int var29 = var12;
                  net.minecraft.entity.Entity var30 = var1;
                  int var31 = var11;
                  short var32 = var62;
                  augustus.recovered.modules.combat.Teams_47C2 var33 = client.ClientGlobals.field_48.field_44Q;
                  if (var33.method_48$9e4267e589(var32, var31, var30, var29)) {
                     return false;
                  }
               }

               var10002 = 5581937356246873345L;
               long var34 = var4;
               augustus.recovered.modules.combat.TargetArea_47Cs var36 = client.ClientGlobals.field_48.field_44n;
               if (var36.method_46$0dd78e0064(var34)) {
                  long var10003 = 5575958522306576326L;
                  long var37 = var15;
                  net.minecraft.entity.Entity var39 = var1;
                  augustus.recovered.modules.combat.TargetArea_47Cs var40 = client.ClientGlobals.field_48.field_44n;
                  if (!var40.method_44$8a15fc4c7b(var39, var37)) {
                     return false;
                  }
               }

               if (var1 instanceof EntityPlayer) {
                  long var65 = 5575837111127855083L;
                  net.minecraft.entity.Entity var41 = var1;
                  long var42 = var6;
                  augustus.recovered.modules.combat.AntiBot_47CG var44 = client.ClientGlobals.field_48.field_480;
                  if (var44.method_44$5909fdf9ee(var42, var41)) {
                     return false;
                  }
               }

               if (var1 instanceof EntityPlayer) {
                  long var66 = 5583769331905822760L;
                  long var45 = var8;
                  net.minecraft.entity.Entity var47 = var1;
                  augustus.recovered.modules.misc.MidClick_47kc var48 = client.ClientGlobals.field_48.field_46Z;
                  if (var48.method_42$8a15fc4c7b(var47, var45) && !client.ClientGlobals.field_48.field_46Z.field_43P) {
                     return false;
                  }
               }

               var10002 = 5581220328402306642L;
               net.minecraft.client.Minecraft var49 = field_43;
               double var54 = var1.method_40$ee256e8a75(var49.field_42P);
               long var67 = 5582310419774408964L;
               long var50 = var13;
               client.setting.NumberSetting var52 = this.settingDistance;
               if (var54 <= var52.method_44$474dfaa627(var50)) {
                  return true;
               }
            }
         }
      }

      return false;
   }







   public void method_47$05bd94f678(net.C_472n var1, long var2) {
      net.minecraft.entity.EntityLivingBase var297;
        net.minecraft.entity.EntityLivingBase var264;
        net.minecraft.entity.EntityLivingBase var267;
        net.minecraft.entity.EntityLivingBase var268;
        int var271;
        augustus.recovered.modules.combat.KillAura_47CY var272;
        net.minecraft.entity.EntityLivingBase var274;
        int var275;
        augustus.recovered.modules.movement.AutoWalk_47Cb var276;
        net.minecraft.entity.EntityLivingBase var281;
        int var282;
        augustus.recovered.modules.movement.AutoWalk_47Cb var283;
        int var284;
        net.minecraft.entity.EntityLivingBase var285;
        augustus.recovered.modules.movement.AutoWalk_47Cb var286;
        net.minecraft.entity.EntityLivingBase var289;
        augustus.recovered.modules.movement.AutoWalk_47Cb var290;
        int var295;
        augustus.recovered.modules.combat.KillAura_47CY var296;
        int var298;
        augustus.recovered.modules.movement.AutoWalk_47Cb var299;
        int var307;
        int var342;
        int var352;
      long var4 = var2 ^ 39263005660825L;
      long var6 = var2 ^ 127788475735264L;
      long var8 = var2 ^ 132406506099900L;
      long var10 = var2 ^ 127907598370536L;
      long var12 = var2 ^ 41055838791885L;
      long var14 = var2 ^ 40469981657188L;
      long var16 = var2 ^ 74807535967538L;
      long var18 = var2 ^ 137583989051783L;
      long var10000 = 6397719322594389319L;
      byte var20 = ((byte) (Fly_47kE.method_49t$aae029aa0a() ? 1 : 0));
      var10000 = 6397494079061630994L;
      client.Client var260 = client.Client.method_44$fbc0c0be91();
      long var10001 = 6403712387957692476L;
      client.Client var23 = var260;
      long var10002 = 6403130827938521258L;
      long var24 = var4;
      FreeCam_47kJ var26 = var23.method_45$4a5eee04b7().field_41p;
      boolean var261 = var26.method_46$0dd78e0064(var24);
      if (var20 != 0) {
         if (var2 > 0L) {
            if (var20 == 0) {
               if (!var261) {
                  return;
               }

               var10001 = 6401477556876622227L;
               net.minecraft.client.Minecraft var94 = field_43;
               var261 = var94.method_44$aae029aa0a();
            }

            if (var20 == 0) {
               if (!var261) {
                  return;
               }

               var10002 = 6401252053354795398L;
               long var97 = var6;
               AutoWalk_47Cb var100 = this;
               var261 = var100.method_46_$0dd78e0064(var97);
            }

            if (var261) {
               net.minecraft.entity.EntityLivingBase var89 = null;
               if (!this.field_43h.isEmpty()) {
                  var10002 = 6401180747145576303L;
                  long var104 = var12;
                  AutoWalk_47Cb var107 = this;
                  var89 = (net.minecraft.entity.EntityLivingBase)var107.method_49$3bb04e24c9(var104);
               }

               label1488: {
                  label1305: {
                     label1304: {
                        var10002 = 6400606005042696574L;
                        long var110 = var14;
                        AutoWalk_47Cb var113 = this;
                        if (var113.method_46G$0dd78e0064(var110)) {
                           var296 = client.ClientGlobals.field_48.field_48Q;
                           long var509;
                           int var481 = (var509 = var2 - 0L) == 0L ? 0 : (var509 < 0L ? -1 : 1);
                           if (var20 != 0) {
                              break label1305;
                           }

                           long var510;
                           int var370 = (var510 = var2 - 0L) == 0L ? 0 : (var510 < 0L ? -1 : 1);
                           if (client.ClientGlobals.field_48.field_48Q.field_45z != null) {
                              break label1304;
                           }
                        }

                        if (var89 == null) {
                           break label1488;
                        }
                     }

                     var296 = client.ClientGlobals.field_48.field_48Q;
                  }

                  label1294: {
                     if (var20 == 0) {
                        var10002 = 6403130827938521258L;
                        long var121 = var4;
                        augustus.recovered.modules.combat.KillAura_47CY var127 = var296;
                        if (!var127.method_46$0dd78e0064(var121)) {
                           var297 = var89;
                           break label1294;
                        }

                        var296 = client.ClientGlobals.field_48.field_48Q;
                     }

                     var297 = var296.field_45z;
                  }

                  net.minecraft.entity.EntityLivingBase var93 = var297;
                  label1261:
                  if (var93 != null) {
                     label1286: {
                        label1285: {
                           label1456: {
                              label1283: {
                                 label1457: {
                                    var10002 = 6400408394568534235L;
                                    long var133 = var16;
                                    client.setting.ModeSetting var139 = this.settingMovementmode;
                                    var298 = ((var139.method_46$5f9dc63072(var133).equalsIgnoreCase("rotation")) ? 1 : 0);
                                    long var511;
                                    int var484 = (var511 = var2 - 0L) == 0L ? 0 : (var511 < 0L ? -1 : 1);
                                    if (var20 == 0) {
                                       if (var298 == 0) {
                                          var299 = this;
                                          long var512;
                                          int var485 = (var512 = var2 - 0L) == 0L ? 0 : (var512 < 0L ? -1 : 1);
                                          if (var20 != 0) {
                                             break label1283;
                                          }

                                          var10001 = 6400578051475491234L;
                                          client.setting.BooleanSetting var140 = this.settingPathFinding;
                                          if (var140.method_49$aae029aa0a()) {
                                             break label1457;
                                          }
                                       }

                                       var10001 = 6403839059221337081L;
                                       net.minecraft.client.Minecraft var141 = field_43;
                                       double var300 = var141.field_42P.method_40$ee256e8a75(var93);
                                       long var506 = 6400497031033298095L;
                                       long var142 = var8;
                                       client.setting.NumberSetting var143 = this.settingNoWalkDistanceToTarget;
                                       double var513;
                                       var298 = (var513 = var300 - var143.method_44$474dfaa627(var142)) == 0.0 ? 0 : (var513 < 0.0 ? -1 : 1);
                                    }

                                    if (var20 != 0) {
                                       break label1286;
                                    }

                                    if (var298 <= 0) {
                                       break label1456;
                                    }

                                    var10002 = 6400735899985049125L;
                                    float var149 = 1.0F;
                                    net.C_472n var155 = var1;
                                    var155.method_45$24a796ab4c(var149);
                                 }

                                 var299 = this;
                              }

                              if (var20 != 0) {
                                 break label1285;
                              }

                              if (var299.field_47w != null) {
                                 float var373 = this.field_47w[0];
                                 var10002 = 6400077256111301797L;
                                 float var159 = var373;
                                 net.C_472n var163 = var1;
                                 var163.method_44$24a796ab4c(var159);
                                 float var374 = this.field_47w[1];
                                 var10002 = 6400735899985049125L;
                                 float var167 = var374;
                                 net.C_472n var171 = var1;
                                 var171.method_45$24a796ab4c(var167);
                                 var298 = ((this.field_43P) ? 1 : 0);
                                 long var514;
                                 int var489 = (var514 = var2 - 0L) == 0L ? 0 : (var514 < 0L ? -1 : 1);
                                 if (var20 != 0) {
                                    break label1286;
                                 }

                                 if (this.field_43P) {
                                    var10002 = 6397834008581382574L;
                                    boolean var173 = true;
                                    net.C_472n var175 = var1;
                                    var175.method_47$f633c984d8(var173);
                                 }
                              }
                           }

                           var299 = this;
                        }

                        var10001 = 6400578051475491234L;
                        client.setting.BooleanSetting var181 = var299.settingJump;
                        var298 = ((var181.method_49$aae029aa0a()) ? 1 : 0);
                     }

                     if (var20 == 0) {
                        if (var298 != 0) {
                           var10001 = 6403839059221337081L;
                           net.minecraft.client.Minecraft var187 = field_43;
                           float var515;
                           var298 = (var515 = var187.field_42P.method_40$ee256e8a75(var93) - 6.0F) == 0.0F ? 0 : (var515 < 0.0F ? -1 : 1);
                        } else {
                           var10001 = 6400578051475491234L;
                           client.setting.BooleanSetting var199 = this.settingAdStafeOnHit;
                           var298 = ((var199.method_49$aae029aa0a()) ? 1 : 0);
                        }
                     }

                     long var516;
                     int var491 = (var516 = var2 - 0L) == 0L ? 0 : (var516 < 0L ? -1 : 1);
                     if (var20 == 0) {
                        if (var298 == 0) {
                           break label1261;
                        }

                        var10001 = 6403839059221337081L;
                        net.minecraft.client.Minecraft var202 = field_43;
                        double var517;
                        var298 = (var517 = var202.field_42P.method_40$ee256e8a75(var93) - 4.5) == 0.0 ? 0 : (var517 < 0.0 ? -1 : 1);
                     }

                     long var518;
                     int var492 = (var518 = var2 - 0L) == 0L ? 0 : (var518 < 0L ? -1 : 1);
                     if (var20 == 0) {
                        if (var298 >= 0) {
                           break label1261;
                        }

                        var298 = var93.field_432;
                     }

                     long var519;
                     int var493 = (var519 = var2 - 0L) == 0L ? 0 : (var519 < 0L ? -1 : 1);
                     if (var20 == 0) {
                        if (var298 == 9) {
                           var10001 = 6401156247312289233L;
                           net.C_47cu var207 = this.field_47;
                           var207.method_46$da8c82d5d4();
                           this.field_43u = this.field_43u;
                        }

                        net.C_47cu var302 = this.field_47;
                        long var507 = 6400497031033298095L;
                        long var212 = var8;
                        client.setting.NumberSetting var217 = this.settingAdStafeTime;
                        double var380 = var217.method_44$474dfaa627(var212);
                        var507 = 6397567842022737839L;
                        long var222 = var10;
                        double var227 = var380;
                        net.C_47cu var232 = var302;
                        var298 = ((var232.method_43$2ac7ee8710(var227, var222)) ? 1 : 0);
                     }

                     if (var298 == 0) {
                        float var381 = this.field_43u ? 1.0F : -1.0F;
                        var10002 = 6400077256111301797L;
                        float var237 = var381;
                        net.C_472n var242 = var1;
                        var242.method_44$24a796ab4c(var237);
                     }
                  }

                  long var520;
                  int var382 = (var520 = var2 - 0L) == 0L ? 0 : (var520 < 0L ? -1 : 1);
                  if (var20 == 0) {
                     return;
                  }
               }

               var10001 = 6400578051475491234L;
               client.setting.BooleanSetting var246 = this.settingOnlyWithKillAuraTarget;
               if (!var246.method_49$aae029aa0a()) {
                  var10002 = 6400735899985049125L;
                  float var252 = 1.0F;
                  net.C_472n var258 = var1;
                  var258.method_45$24a796ab4c(var252);
               }
            }
         } else {
            if (var20 == 0) {
               if (!var261) {
                  return;
               }

               var10002 = 6401252053354795398L;
               long var96 = var6;
               AutoWalk_47Cb var99 = this;
               var261 = var99.method_46_$0dd78e0064(var96);
            }

            if (var261) {
               net.minecraft.entity.EntityLivingBase var88 = null;
               if (!this.field_43h.isEmpty()) {
                  var10002 = 6401180747145576303L;
                  long var103 = var12;
                  AutoWalk_47Cb var106 = this;
                  var88 = (net.minecraft.entity.EntityLivingBase)var106.method_49$3bb04e24c9(var103);
               }

               label1427: {
                  label1459: {
                     label1505: {
                        label1460: {
                           label1461: {
                              net.minecraft.entity.EntityLivingBase var92;
                              label1462: {
                                 label1463: {
                                    label1464: {
                                       label1419: {
                                          label1494: {
                                             label1416: {
                                                label1415: {
                                                   label1466: {
                                                      var10002 = 6400606005042696574L;
                                                      long var109 = var14;
                                                      AutoWalk_47Cb var112 = this;
                                                      if (var112.method_46G$0dd78e0064(var109)) {
                                                         augustus.recovered.modules.combat.KillAura_47CY var280 = client.ClientGlobals.field_48.field_48Q;
                                                         if (var2 < 0L) {
                                                            label1373: {
                                                               if (var20 == 0) {
                                                                  var10002 = 6403130827938521258L;
                                                                  long var119 = var4;
                                                                  augustus.recovered.modules.combat.KillAura_47CY var125 = client.ClientGlobals.field_48.field_48Q;
                                                                  if (!var125.method_46$0dd78e0064(var119)) {
                                                                     var285 = var88;
                                                                     break label1373;
                                                                  }

                                                                  var280 = client.ClientGlobals.field_48.field_48Q;
                                                               }

                                                               var285 = var280.field_45z;
                                                            }

                                                            var92 = var285;
                                                            if (var92 == null) {
                                                               break label1505;
                                                            }

                                                            var10002 = 6400408394568534235L;
                                                            long var131 = var16;
                                                            client.setting.ModeSetting var137 = this.settingMovementmode;
                                                            var282 = ((var137.method_46$5f9dc63072(var131).equalsIgnoreCase("rotation")) ? 1 : 0);
                                                            long var526;
                                                            int var455 = (var526 = var2 - 0L) == 0L ? 0 : (var526 < 0L ? -1 : 1);
                                                            if (var20 == 0) {
                                                               label1364: {
                                                                  if (var282 > 0) {
                                                                     var10002 = 6400735899985049125L;
                                                                     float var147 = 1.0F;
                                                                     net.C_472n var153 = var1;
                                                                     var153.method_45$24a796ab4c(var147);
                                                                     var286 = this;
                                                                     if (var20 != 0) {
                                                                        break label1364;
                                                                     }

                                                                     if (this.field_47w != null) {
                                                                        float var344 = this.field_47w[0];
                                                                        var10002 = 6400077256111301797L;
                                                                        float var157 = var344;
                                                                        net.C_472n var161 = var1;
                                                                        var161.method_44$24a796ab4c(var157);
                                                                        float var345 = this.field_47w[1];
                                                                        var10002 = 6400735899985049125L;
                                                                        float var165 = var345;
                                                                        net.C_472n var169 = var1;
                                                                        var169.method_45$24a796ab4c(var165);
                                                                        var282 = ((this.field_43P) ? 1 : 0);
                                                                        var342 = var20;
                                                                        long var527;
                                                                        int var459 = (var527 = var2 - 0L) == 0L ? 0 : (var527 < 0L ? -1 : 1);
                                                                        break label1464;
                                                                     }
                                                                  }

                                                                  var286 = this;
                                                               }

                                                               var10001 = 6400578051475491234L;
                                                               client.setting.BooleanSetting var178 = var286.settingJump;
                                                               var282 = ((var178.method_49$aae029aa0a()) ? 1 : 0);
                                                            }

                                                            var342 = var20;
                                                            break label1464;
                                                         }

                                                         if (var20 == 0) {
                                                            long var521;
                                                            int var339 = (var521 = var2 - 0L) == 0L ? 0 : (var521 < 0L ? -1 : 1);
                                                            if (client.ClientGlobals.field_48.field_48Q.field_45z == null) {
                                                               var10001 = 6400578051475491234L;
                                                               client.setting.BooleanSetting var244 = this.settingOnlyWithKillAuraTarget;
                                                               var284 = ((var244.method_49$aae029aa0a()) ? 1 : 0);
                                                               break label1427;
                                                            }

                                                            var280 = client.ClientGlobals.field_48.field_48Q;
                                                         }

                                                         label1334: {
                                                            if (var20 == 0) {
                                                               var10002 = 6403130827938521258L;
                                                               long var118 = var4;
                                                               augustus.recovered.modules.combat.KillAura_47CY var124 = var280;
                                                               if (!var124.method_46$0dd78e0064(var118)) {
                                                                  var281 = var88;
                                                                  break label1334;
                                                               }

                                                               var280 = client.ClientGlobals.field_48.field_48Q;
                                                            }

                                                            var281 = var280.field_45z;
                                                         }

                                                         var92 = var281;
                                                         if (var92 == null) {
                                                            break label1459;
                                                         }

                                                         var10002 = 6400408394568534235L;
                                                         long var130 = var16;
                                                         client.setting.ModeSetting var136 = this.settingMovementmode;
                                                         var282 = ((var136.method_46$5f9dc63072(var130).equalsIgnoreCase("rotation")) ? 1 : 0);
                                                         long var522;
                                                         int var448 = (var522 = var2 - 0L) == 0L ? 0 : (var522 < 0L ? -1 : 1);
                                                         if (var20 != 0) {
                                                            break label1463;
                                                         }

                                                         if (var282 <= 0) {
                                                            break label1466;
                                                         }

                                                         var10002 = 6400735899985049125L;
                                                         float var146 = 1.0F;
                                                         net.C_472n var152 = var1;
                                                         var152.method_45$24a796ab4c(var146);
                                                         var283 = this;
                                                         if (var20 != 0) {
                                                            break label1416;
                                                         }

                                                         if (this.field_47w == null) {
                                                            break label1466;
                                                         }

                                                         float var340 = this.field_47w[0];
                                                         var10002 = 6400077256111301797L;
                                                         float var156 = var340;
                                                         net.C_472n var160 = var1;
                                                         var160.method_44$24a796ab4c(var156);
                                                         float var341 = this.field_47w[1];
                                                         var10002 = 6400735899985049125L;
                                                         float var164 = var341;
                                                         net.C_472n var168 = var1;
                                                         var168.method_45$24a796ab4c(var164);
                                                         var282 = ((this.field_43P) ? 1 : 0);
                                                         var342 = var20;
                                                         long var523;
                                                         int var452 = (var523 = var2 - 0L) == 0L ? 0 : (var523 < 0L ? -1 : 1);
                                                      } else {
                                                         if (var88 == null) {
                                                            var10001 = 6400578051475491234L;
                                                            client.setting.BooleanSetting var245 = this.settingOnlyWithKillAuraTarget;
                                                            var295 = ((var245.method_49$aae029aa0a()) ? 1 : 0);
                                                            break label1460;
                                                         }

                                                         label1410: {
                                                            augustus.recovered.modules.combat.KillAura_47CY var288 = client.ClientGlobals.field_48.field_48Q;
                                                            if (var20 == 0) {
                                                               var10002 = 6403130827938521258L;
                                                               long var120 = var4;
                                                               augustus.recovered.modules.combat.KillAura_47CY var126 = client.ClientGlobals.field_48.field_48Q;
                                                               if (!var126.method_46$0dd78e0064(var120)) {
                                                                  var289 = var88;
                                                                  break label1410;
                                                               }

                                                               var288 = client.ClientGlobals.field_48.field_48Q;
                                                            }

                                                            var289 = var288.field_45z;
                                                         }

                                                         var92 = var289;
                                                         if (var92 == null) {
                                                            var295 = var20;
                                                            long var524;
                                                            int var367 = (var524 = var2 - 0L) == 0L ? 0 : (var524 < 0L ? -1 : 1);
                                                            break label1460;
                                                         }

                                                         var10002 = 6400408394568534235L;
                                                         long var132 = var16;
                                                         client.setting.ModeSetting var138 = this.settingMovementmode;
                                                         var282 = ((var138.method_46$5f9dc63072(var132).equalsIgnoreCase("rotation")) ? 1 : 0);
                                                         long var525;
                                                         int var462 = (var525 = var2 - 0L) == 0L ? 0 : (var525 < 0L ? -1 : 1);
                                                         if (var20 != 0) {
                                                            break label1419;
                                                         }

                                                         if (var282 <= 0) {
                                                            break label1415;
                                                         }

                                                         var10002 = 6400735899985049125L;
                                                         float var148 = 1.0F;
                                                         net.C_472n var154 = var1;
                                                         var154.method_45$24a796ab4c(var148);
                                                         var290 = this;
                                                         if (var20 != 0) {
                                                            break label1494;
                                                         }

                                                         if (this.field_47w == null) {
                                                            break label1415;
                                                         }

                                                         float var347 = this.field_47w[0];
                                                         var10002 = 6400077256111301797L;
                                                         float var158 = var347;
                                                         net.C_472n var162 = var1;
                                                         var162.method_44$24a796ab4c(var158);
                                                         float var348 = this.field_47w[1];
                                                         var10002 = 6400735899985049125L;
                                                         float var166 = var348;
                                                         net.C_472n var170 = var1;
                                                         var170.method_45$24a796ab4c(var166);
                                                         var282 = ((this.field_43P) ? 1 : 0);
                                                         var342 = var20;
                                                         if (var2 < 0L) {
                                                            break label1464;
                                                         }
                                                      }

                                                      if (var342 != 0) {
                                                         break label1463;
                                                      }

                                                      if (var282 != 0) {
                                                         var10002 = 6397834008581382574L;
                                                         boolean var172 = true;
                                                         net.C_472n var174 = var1;
                                                         var174.method_47$f633c984d8(var172);
                                                      }
                                                   }

                                                   var283 = this;
                                                   break label1416;
                                                }

                                                var290 = this;
                                                break label1494;
                                             }

                                             var10001 = 6400578051475491234L;
                                             client.setting.BooleanSetting var179 = var283.settingJump;
                                             var282 = ((var179.method_49$aae029aa0a()) ? 1 : 0);
                                             break label1463;
                                          }

                                          var10001 = 6400578051475491234L;
                                          client.setting.BooleanSetting var180 = var290.settingJump;
                                          var282 = ((var180.method_49$aae029aa0a()) ? 1 : 0);
                                       }

                                       if (var20 == 0) {
                                          if (var282 != 0) {
                                             var10001 = 6403839059221337081L;
                                             net.minecraft.client.Minecraft var186 = field_43;
                                             float var528;
                                             var282 = (var528 = var186.field_42P.method_40$ee256e8a75(var92) - 6.0F) == 0.0F ? 0 : (var528 < 0.0F ? -1 : 1);
                                          } else {
                                             var10001 = 6400578051475491234L;
                                             client.setting.BooleanSetting var198 = this.settingAdStafeOnHit;
                                             var282 = ((var198.method_49$aae029aa0a()) ? 1 : 0);
                                          }
                                       }

                                       var352 = var20;
                                       if (var2 < 0L) {
                                          break label1461;
                                       }
                                       break label1462;
                                    }

                                    if (var342 == 0) {
                                       if (var282 != 0) {
                                          var10001 = 6403839059221337081L;
                                          net.minecraft.client.Minecraft var185 = field_43;
                                          float var529;
                                          var282 = (var529 = var185.field_42P.method_40$ee256e8a75(var92) - 6.0F) == 0.0F ? 0 : (var529 < 0.0F ? -1 : 1);
                                       } else {
                                          var10001 = 6400578051475491234L;
                                          client.setting.BooleanSetting var197 = this.settingAdStafeOnHit;
                                          var282 = ((var197.method_49$aae029aa0a()) ? 1 : 0);
                                       }
                                    }

                                    var352 = var20;
                                    long var530;
                                    int var468 = (var530 = var2 - 0L) == 0L ? 0 : (var530 < 0L ? -1 : 1);
                                    break label1461;
                                 }

                                 if (var20 == 0) {
                                    if (var282 != 0) {
                                       var10001 = 6403839059221337081L;
                                       net.minecraft.client.Minecraft var184 = field_43;
                                       float var531;
                                       var282 = (var531 = var184.field_42P.method_40$ee256e8a75(var92) - 6.0F) == 0.0F ? 0 : (var531 < 0.0F ? -1 : 1);
                                    } else {
                                       var10001 = 6400578051475491234L;
                                       client.setting.BooleanSetting var196 = this.settingAdStafeOnHit;
                                       var282 = ((var196.method_49$aae029aa0a()) ? 1 : 0);
                                    }
                                 }

                                 var352 = var20;
                                 long var532;
                                 int var467 = (var532 = var2 - 0L) == 0L ? 0 : (var532 < 0L ? -1 : 1);
                              }

                              if (var352 == 0) {
                                 if (var282 == 0) {
                                    break label1459;
                                 }

                                 var10001 = 6403839059221337081L;
                                 net.minecraft.client.Minecraft var201 = field_43;
                                 double var533;
                                 var282 = (var533 = var201.field_42P.method_40$ee256e8a75(var92) - 4.5) == 0.0 ? 0 : (var533 < 0.0 ? -1 : 1);
                              }

                              long var534;
                              int var469 = (var534 = var2 - 0L) == 0L ? 0 : (var534 < 0L ? -1 : 1);
                              if (var20 == 0) {
                                 if (var282 >= 0) {
                                    break label1459;
                                 }

                                 var282 = var92.field_432;
                              }

                              long var535;
                              int var470 = (var535 = var2 - 0L) == 0L ? 0 : (var535 < 0L ? -1 : 1);
                              if (var282 == var20) {
                                 var10001 = 6401156247312289233L;
                                 net.C_47cu var205 = this.field_47;
                                 var205.method_46$da8c82d5d4();
                                 this.field_43u = this.field_43u;
                              }

                              net.C_47cu var293 = this.field_47;
                              long var502 = 6400497031033298095L;
                              long var210 = var8;
                              client.setting.NumberSetting var215 = this.settingAdStafeTime;
                              double var360 = var215.method_44$474dfaa627(var210);
                              var502 = 6397567842022737839L;
                              long var220 = var10;
                              double var225 = var360;
                              net.C_47cu var230 = var293;
                              if (!var230.method_43$2ac7ee8710(var225, var220)) {
                                 float var361 = this.field_43u ? 1.0F : -1.0F;
                                 var10002 = 6400077256111301797L;
                                 float var235 = var361;
                                 net.C_472n var240 = var1;
                                 var240.method_44$24a796ab4c(var235);
                              }
                              break label1459;
                           }

                           long var536;
                           int var473 = (var536 = var2 - 0L) == 0L ? 0 : (var536 < 0L ? -1 : 1);
                           long var537;
                           int var474 = (var537 = var2 - 0L) == 0L ? 0 : (var537 < 0L ? -1 : 1);
                           if (var282 == var352) {
                              var10001 = 6401156247312289233L;
                              net.C_47cu var206 = this.field_47;
                              var206.method_46$da8c82d5d4();
                              this.field_43u = this.field_43u;
                           }

                           net.C_47cu var294 = this.field_47;
                           long var504 = 6400497031033298095L;
                           long var211 = var8;
                           client.setting.NumberSetting var216 = this.settingAdStafeTime;
                           double var364 = var216.method_44$474dfaa627(var211);
                           var504 = 6397567842022737839L;
                           long var221 = var10;
                           double var226 = var364;
                           net.C_47cu var231 = var294;
                           if (!var231.method_43$2ac7ee8710(var226, var221)) {
                              float var365 = this.field_43u ? 1.0F : -1.0F;
                              var10002 = 6400077256111301797L;
                              float var236 = var365;
                              net.C_472n var241 = var1;
                              var241.method_44$24a796ab4c(var236);
                           }
                           break label1505;
                        }

                        if (var295 == 0) {
                           var10002 = 6400735899985049125L;
                           float var251 = 1.0F;
                           net.C_472n var257 = var1;
                           var257.method_45$24a796ab4c(var251);
                        }

                        return;
                     }

                     long var538;
                     int var366 = (var538 = var2 - 0L) == 0L ? 0 : (var538 < 0L ? -1 : 1);
                     if (var20 == 0) {
                        var10002 = 6400735899985049125L;
                        float var250 = 1.0F;
                        net.C_472n var256 = var1;
                        var256.method_45$24a796ab4c(var250);
                     }

                     return;
                  }

                  var284 = var20;
                  long var539;
                  int var362 = (var539 = var2 - 0L) == 0L ? 0 : (var539 < 0L ? -1 : 1);
               }

               if (var284 == 0) {
                  var10002 = 6400735899985049125L;
                  float var249 = 1.0F;
                  net.C_472n var255 = var1;
                  var255.method_45$24a796ab4c(var249);
               }
            }
         }
      } else if (!var261) {
         var10002 = 6403056285510825639L;
         long var27 = var18;
         AutoWalk_47Cb var29 = this;
         boolean var262 = var29.method_46s$0dd78e0064(var27);
         if (var2 > 0L) {
            if (var20 == 0) {
               if (!var262) {
                  return;
               }

               var10001 = 6401477556876622227L;
               net.minecraft.client.Minecraft var30 = field_43;
               var262 = var30.method_44$aae029aa0a();
            }

            if (var20 == 0) {
               if (!var262) {
                  return;
               }

               var10002 = 6401252053354795398L;
               long var95 = var6;
               AutoWalk_47Cb var98 = this;
               var262 = var98.method_46_$0dd78e0064(var95);
            }

            if (var262) {
               net.minecraft.entity.EntityLivingBase var87 = null;
               var10001 = 6400578051475491234L;
               client.setting.BooleanSetting var101 = this.settingPathFinding;
               if (var101.method_49$aae029aa0a() && this.field_43h != null && !this.field_43h.isEmpty()) {
                  var10002 = 6401180747145576303L;
                  long var102 = var12;
                  AutoWalk_47Cb var105 = this;
                  var87 = (net.minecraft.entity.EntityLivingBase)var105.method_49$3bb04e24c9(var102);
               }

               var10002 = 6400606005042696574L;
               long var108 = var14;
               AutoWalk_47Cb var111 = this;
               if (var111.method_46G$0dd78e0064(var108)) {
                  return;
               }

               label1489: {
                  label1156: {
                     label1155: {
                        label1439: {
                           var272 = client.ClientGlobals.field_48.field_48Q;
                           long var540;
                           int var421 = (var540 = var2 - 0L) == 0L ? 0 : (var540 < 0L ? -1 : 1);
                           if (var20 == 0) {
                              var10002 = 6403130827938521258L;
                              long var114 = var4;
                              augustus.recovered.modules.combat.KillAura_47CY var115 = client.ClientGlobals.field_48.field_48Q;
                              if (!var115.method_46$0dd78e0064(var114)) {
                                 break label1439;
                              }

                              var272 = client.ClientGlobals.field_48.field_48Q;
                           }

                           long var541;
                           int var423 = (var541 = var2 - 0L) == 0L ? 0 : (var541 < 0L ? -1 : 1);
                           if (var20 != 0) {
                              break label1156;
                           }

                           long var542;
                           int var324 = (var542 = var2 - 0L) == 0L ? 0 : (var542 < 0L ? -1 : 1);
                           if (var272.field_45z != null) {
                              break label1155;
                           }
                        }

                        if (var87 == null) {
                           break label1489;
                        }
                     }

                     var272 = client.ClientGlobals.field_48.field_48Q;
                  }

                  label1141: {
                     label1140: {
                        if (var20 == 0) {
                           var10002 = 6403130827938521258L;
                           long var117 = var4;
                           augustus.recovered.modules.combat.KillAura_47CY var123 = var272;
                           if (!var123.method_46$0dd78e0064(var117)) {
                              break label1140;
                           }

                           var272 = client.ClientGlobals.field_48.field_48Q;
                        }

                        if (var272.field_45z != null) {
                           var274 = client.ClientGlobals.field_48.field_48Q.field_45z;
                           break label1141;
                        }
                     }

                     var274 = var87;
                  }

                  net.minecraft.entity.EntityLivingBase var91 = var274;
                  label1084:
                  if (var91 != null) {
                     label1130: {
                        label1129: {
                           label1490: {
                              var10002 = 6400408394568534235L;
                              long var129 = var16;
                              client.setting.ModeSetting var135 = this.settingMovementmode;
                              var275 = ((var135.method_46$5f9dc63072(var129).equalsIgnoreCase("rotation")) ? 1 : 0);
                              long var543;
                              int var426 = (var543 = var2 - 0L) == 0L ? 0 : (var543 < 0L ? -1 : 1);
                              if (var20 == 0) {
                                 label1124:
                                 if (var275 == 0) {
                                    var276 = this;
                                    long var544;
                                    int var427 = (var544 = var2 - 0L) == 0L ? 0 : (var544 < 0L ? -1 : 1);
                                    if (var20 == 0) {
                                       var10001 = 6400578051475491234L;
                                       client.setting.BooleanSetting var50 = this.settingPathFinding;
                                       if (!var50.method_49$aae029aa0a()) {
                                          break label1124;
                                       }

                                       var276 = this;
                                    }

                                    if (var20 != 0) {
                                       break label1129;
                                    }

                                    if (var276.field_47w != null) {
                                       float var326 = this.field_47w[0];
                                       var10002 = 6400077256111301797L;
                                       float var57 = var326;
                                       net.C_472n var58 = var1;
                                       var58.method_44$24a796ab4c(var57);
                                       float var327 = this.field_47w[1];
                                       var10002 = 6400735899985049125L;
                                       float var59 = var327;
                                       net.C_472n var60 = var1;
                                       var60.method_45$24a796ab4c(var59);
                                       var275 = ((this.field_43P) ? 1 : 0);
                                       long var545;
                                       int var430 = (var545 = var2 - 0L) == 0L ? 0 : (var545 < 0L ? -1 : 1);
                                       if (var20 != 0) {
                                          break label1130;
                                       }

                                       if (this.field_43P) {
                                          var10002 = 6397834008581382574L;
                                          boolean var61 = true;
                                          net.C_472n var62 = var1;
                                          var62.method_47$f633c984d8(var61);
                                       }
                                    }
                                    break label1490;
                                 }

                                 var10001 = 6403839059221337081L;
                                 net.minecraft.client.Minecraft var51 = field_43;
                                 double var277 = var51.field_42P.method_40$ee256e8a75(var91);
                                 long var499 = 6400497031033298095L;
                                 long var52 = var8;
                                 client.setting.NumberSetting var54 = this.settingNoWalkDistanceToTarget;
                                 double var546;
                                 var275 = (var546 = var277 - var54.method_44$474dfaa627(var52)) == 0.0 ? 0 : (var546 < 0.0 ? -1 : 1);
                              }

                              if (var20 != 0) {
                                 break label1130;
                              }

                              if (var275 > 0) {
                                 var10002 = 6400735899985049125L;
                                 float var145 = 1.0F;
                                 net.C_472n var151 = var1;
                                 var151.method_45$24a796ab4c(var145);
                              }
                           }

                           var276 = this;
                        }

                        var10001 = 6400578051475491234L;
                        client.setting.BooleanSetting var177 = var276.settingJump;
                        var275 = ((var177.method_49$aae029aa0a()) ? 1 : 0);
                     }

                     label1104:
                     if (var20 == 0) {
                        if (var275 != 0) {
                           var10001 = 6403839059221337081L;
                           net.minecraft.client.Minecraft var183 = field_43;
                           label1101:
                           if (var183.field_42P.method_40$ee256e8a75(var91) > 6.0F) {
                              label1444: {
                                 var10002 = 6400408394568534235L;
                                 long var189 = var16;
                                 client.setting.ModeSetting var191 = this.settingMovementmode;
                                 var275 = ((var191.method_46$5f9dc63072(var189).equalsIgnoreCase("silent")) ? 1 : 0);
                                 long var547;
                                 int var434 = (var547 = var2 - 0L) == 0L ? 0 : (var547 < 0L ? -1 : 1);
                                 if (var20 == 0) {
                                    if (var275 == 0) {
                                       break label1444;
                                    }

                                    var275 = ((this.field_43v) ? 1 : 0);
                                 }

                                 long var548;
                                 int var435 = (var548 = var2 - 0L) == 0L ? 0 : (var548 < 0L ? -1 : 1);
                                 if (var20 == 0) {
                                    if (var275 != 0) {
                                       break label1444;
                                    }

                                    var10001 = 6400578051475491234L;
                                    client.setting.BooleanSetting var68 = this.settingPathFinding;
                                    var275 = ((var68.method_49$aae029aa0a()) ? 1 : 0);
                                 }

                                 long var549;
                                 int var436 = (var549 = var2 - 0L) == 0L ? 0 : (var549 < 0L ? -1 : 1);
                                 if (var20 != 0) {
                                    break label1104;
                                 }

                                 if (var275 != 0) {
                                    break label1101;
                                 }
                              }

                              var10002 = 6397834008581382574L;
                              boolean var192 = true;
                              net.C_472n var193 = var1;
                              var193.method_47$f633c984d8(var192);
                           }
                        }

                        var10001 = 6400578051475491234L;
                        client.setting.BooleanSetting var195 = this.settingAdStafeOnHit;
                        var275 = ((var195.method_49$aae029aa0a()) ? 1 : 0);
                     }

                     long var550;
                     int var438 = (var550 = var2 - 0L) == 0L ? 0 : (var550 < 0L ? -1 : 1);
                     if (var20 == 0) {
                        if (var275 == 0) {
                           break label1084;
                        }

                        var10001 = 6403839059221337081L;
                        net.minecraft.client.Minecraft var200 = field_43;
                        double var551;
                        var275 = (var551 = var200.field_42P.method_40$ee256e8a75(var91) - 4.5) == 0.0 ? 0 : (var551 < 0.0 ? -1 : 1);
                     }

                     long var552;
                     int var439 = (var552 = var2 - 0L) == 0L ? 0 : (var552 < 0L ? -1 : 1);
                     if (var20 == 0) {
                        if (var275 >= 0) {
                           break label1084;
                        }

                        var275 = var91.field_432;
                     }

                     long var553;
                     int var440 = (var553 = var2 - 0L) == 0L ? 0 : (var553 < 0L ? -1 : 1);
                     if (var20 == 0) {
                        if (var275 == 9) {
                           var10001 = 6401156247312289233L;
                           net.C_47cu var204 = this.field_47;
                           var204.method_46$da8c82d5d4();
                           this.field_43u = !this.field_43u;
                        }

                        net.C_47cu var279 = this.field_47;
                        long var500 = 6400497031033298095L;
                        long var209 = var8;
                        client.setting.NumberSetting var214 = this.settingAdStafeTime;
                        double var335 = var214.method_44$474dfaa627(var209);
                        var500 = 6397567842022737839L;
                        long var219 = var10;
                        double var224 = var335;
                        net.C_47cu var229 = var279;
                        var275 = ((var229.method_43$2ac7ee8710(var224, var219)) ? 1 : 0);
                     }

                     if (var275 == 0) {
                        float var336 = this.field_43u ? 1.0F : -1.0F;
                        var10002 = 6400077256111301797L;
                        float var234 = var336;
                        net.C_472n var239 = var1;
                        var239.method_44$24a796ab4c(var234);
                     }
                  }

                  long var554;
                  int var337 = (var554 = var2 - 0L) == 0L ? 0 : (var554 < 0L ? -1 : 1);
                  if (var20 == 0) {
                     return;
                  }
               }

               var10001 = 6400578051475491234L;
               client.setting.BooleanSetting var243 = this.settingOnlyWithKillAuraTarget;
               if (!var243.method_49$aae029aa0a()) {
                  var10002 = 6400735899985049125L;
                  float var248 = 1.0F;
                  net.C_472n var254 = var1;
                  var254.method_45$24a796ab4c(var248);
               }
            }
         } else {
            if (var20 == 0) {
               if (!var262) {
                  return;
               }

               var10002 = 6401252053354795398L;
               long var31 = var6;
               AutoWalk_47Cb var33 = this;
               var262 = var33.method_46_$0dd78e0064(var31);
            }

            if (var262) {
               net.minecraft.entity.EntityLivingBase var21 = null;
               var10001 = 6400578051475491234L;
               client.setting.BooleanSetting var34 = this.settingPathFinding;
               if (var34.method_49$aae029aa0a() && this.field_43h != null && !this.field_43h.isEmpty()) {
                  var10002 = 6401180747145576303L;
                  long var35 = var12;
                  AutoWalk_47Cb var37 = this;
                  var21 = (net.minecraft.entity.EntityLivingBase)var37.method_49$3bb04e24c9(var35);
               }

               var10002 = 6400606005042696574L;
               long var38 = var14;
               AutoWalk_47Cb var40 = this;
               if (!var40.method_46G$0dd78e0064(var38)) {
                  augustus.recovered.modules.combat.KillAura_47CY var263 = client.ClientGlobals.field_48.field_48Q;
                  if (var2 >= 0L) {
                     label1492: {
                        label1448: {
                           label1449: {
                              if (var20 == 0) {
                                 var10002 = 6403130827938521258L;
                                 long var41 = var4;
                                 augustus.recovered.modules.combat.KillAura_47CY var43 = client.ClientGlobals.field_48.field_48Q;
                                 if (!var43.method_46$0dd78e0064(var41)) {
                                    var267 = var21;
                                    break label1449;
                                 }

                                 var263 = client.ClientGlobals.field_48.field_48Q;
                              }

                              long var555;
                              int var403 = (var555 = var2 - 0L) == 0L ? 0 : (var555 < 0L ? -1 : 1);
                              if (var20 != 0) {
                                 break label1448;
                              }

                              var267 = var263.field_45z;
                              long var556;
                              int var312 = (var556 = var2 - 0L) == 0L ? 0 : (var556 < 0L ? -1 : 1);
                           }

                           if (var267 == null) {
                              var10001 = 6400578051475491234L;
                              client.setting.BooleanSetting var84 = this.settingOnlyWithKillAuraTarget;
                              var271 = ((var84.method_49$aae029aa0a()) ? 1 : 0);
                              break label1492;
                           }

                           var263 = client.ClientGlobals.field_48.field_48Q;
                        }

                        label1200: {
                           label1199: {
                              if (var20 == 0) {
                                 var10002 = 6403130827938521258L;
                                 long var116 = var4;
                                 augustus.recovered.modules.combat.KillAura_47CY var122 = var263;
                                 if (!var122.method_46$0dd78e0064(var116)) {
                                    break label1199;
                                 }

                                 var263 = client.ClientGlobals.field_48.field_48Q;
                              }

                              if (var263.field_45z != null) {
                                 var268 = client.ClientGlobals.field_48.field_48Q.field_45z;
                                 break label1200;
                              }
                           }

                           var268 = var21;
                        }

                        net.minecraft.entity.EntityLivingBase var90 = var268;
                        label1181:
                        if (var90 != null) {
                           var10002 = 6400408394568534235L;
                           long var128 = var16;
                           client.setting.ModeSetting var134 = this.settingMovementmode;
                           int var269 = ((int) (var134.method_46$5f9dc63072(var128).equalsIgnoreCase("rotation") ? 1 : 0));
                           long var557;
                           int var406 = (var557 = var2 - 0L) == 0L ? 0 : (var557 < 0L ? -1 : 1);
                           if (var20 == 0) {
                              if (var269 > 0) {
                                 var10002 = 6400735899985049125L;
                                 float var144 = 1.0F;
                                 net.C_472n var150 = var1;
                                 var150.method_45$24a796ab4c(var144);
                              }

                              var10001 = 6400578051475491234L;
                              client.setting.BooleanSetting var176 = this.settingJump;
                              var269 = ((int) (var176.method_49$aae029aa0a() ? 1 : 0));
                           }

                           label1189:
                           if (var20 == 0) {
                              if (var269 != 0) {
                                 var10001 = 6403839059221337081L;
                                 net.minecraft.client.Minecraft var182 = field_43;
                                 if (var182.field_42P.method_40$ee256e8a75(var90) > 6.0F) {
                                    var10002 = 6400408394568534235L;
                                    long var188 = var16;
                                    client.setting.ModeSetting var190 = this.settingMovementmode;
                                    var269 = ((int) (var190.method_46$5f9dc63072(var188).equalsIgnoreCase("silent") ? 1 : 0));
                                    long var558;
                                    int var409 = (var558 = var2 - 0L) == 0L ? 0 : (var558 < 0L ? -1 : 1);
                                    long var559;
                                    int var410 = (var559 = var2 - 0L) == 0L ? 0 : (var559 < 0L ? -1 : 1);
                                    long var560;
                                    int var411 = (var560 = var2 - 0L) == 0L ? 0 : (var560 < 0L ? -1 : 1);
                                    if (var20 != 0) {
                                       break label1189;
                                    }

                                    if (var269 == 0) {
                                       var10002 = 6397834008581382574L;
                                       boolean var69 = true;
                                       net.C_472n var70 = var1;
                                       var70.method_47$f633c984d8(var69);
                                    }
                                 }
                              }

                              var10001 = 6400578051475491234L;
                              client.setting.BooleanSetting var194 = this.settingAdStafeOnHit;
                              var269 = ((int) (var194.method_49$aae029aa0a() ? 1 : 0));
                           }

                           long var561;
                           int var413 = (var561 = var2 - 0L) == 0L ? 0 : (var561 < 0L ? -1 : 1);
                           if (var20 == 0) {
                              if (var269 == 0) {
                                 break label1181;
                              }

                              var10001 = 6403839059221337081L;
                              net.minecraft.client.Minecraft var72 = field_43;
                              double var562;
                              var269 = (var562 = var72.field_42P.method_40$ee256e8a75(var90) - 4.5) == 0.0 ? 0 : (var562 < 0.0 ? -1 : 1);
                           }

                           long var563;
                           int var414 = (var563 = var2 - 0L) == 0L ? 0 : (var563 < 0L ? -1 : 1);
                           if (var20 == 0) {
                              if (var269 >= 0) {
                                 break label1181;
                              }

                              var269 = var90.field_432;
                           }

                           long var564;
                           int var415 = (var564 = var2 - 0L) == 0L ? 0 : (var564 < 0L ? -1 : 1);
                           if (var269 == var20) {
                              var10001 = 6401156247312289233L;
                              net.C_47cu var203 = this.field_47;
                              var203.method_46$da8c82d5d4();
                              this.field_43u = !this.field_43u;
                           }

                           net.C_47cu var270 = this.field_47;
                           long var497 = 6400497031033298095L;
                           long var208 = var8;
                           client.setting.NumberSetting var213 = this.settingAdStafeTime;
                           double var318 = var213.method_44$474dfaa627(var208);
                           var497 = 6397567842022737839L;
                           long var218 = var10;
                           double var223 = var318;
                           net.C_47cu var228 = var270;
                           if (!var228.method_43$2ac7ee8710(var223, var218)) {
                              float var319 = this.field_43u ? 1.0F : -1.0F;
                              var10002 = 6400077256111301797L;
                              float var233 = var319;
                              net.C_472n var238 = var1;
                              var238.method_44$24a796ab4c(var233);
                           }
                        }

                        var271 = var20;
                        long var565;
                        int var320 = (var565 = var2 - 0L) == 0L ? 0 : (var565 < 0L ? -1 : 1);
                     }

                     if (var271 == 0) {
                        var10002 = 6400735899985049125L;
                        float var247 = 1.0F;
                        net.C_472n var253 = var1;
                        var253.method_45$24a796ab4c(var247);
                     }
                  } else {
                     label1235: {
                        label1234: {
                           long var566;
                           int var388 = (var566 = var2 - 0L) == 0L ? 0 : (var566 < 0L ? -1 : 1);
                           if (var20 == 0) {
                              var10002 = 6403130827938521258L;
                              long var44 = var4;
                              augustus.recovered.modules.combat.KillAura_47CY var46 = client.ClientGlobals.field_48.field_48Q;
                              if (!var46.method_46$0dd78e0064(var44)) {
                                 break label1234;
                              }

                              var263 = client.ClientGlobals.field_48.field_48Q;
                           }

                           if (var263.field_45z != null) {
                              var264 = client.ClientGlobals.field_48.field_48Q.field_45z;
                              break label1235;
                           }
                        }

                        var264 = var21;
                     }

                     net.minecraft.entity.EntityLivingBase var22 = var264;
                     if (var22 != null) {
                        var10002 = 6400408394568534235L;
                        long var47 = var16;
                        client.setting.ModeSetting var49 = this.settingMovementmode;
                        byte var265 = ((byte) (var49.method_46$5f9dc63072(var47).equalsIgnoreCase("rotation") ? 1 : 0));
                        long var567;
                        int var391 = (var567 = var2 - 0L) == 0L ? 0 : (var567 < 0L ? -1 : 1);
                        if (var20 == 0) {
                           if (var265 > 0) {
                              var10002 = 6400735899985049125L;
                              float var55 = 1.0F;
                              net.C_472n var56 = var1;
                              var56.method_45$24a796ab4c(var55);
                           }

                           var10001 = 6400578051475491234L;
                           client.setting.BooleanSetting var63 = this.settingJump;
                           var265 = ((byte) (var63.method_49$aae029aa0a() ? 1 : 0));
                        }

                        label1223: {
                           if (var20 == 0) {
                              if (var265 != 0) {
                                 var10001 = 6403839059221337081L;
                                 net.minecraft.client.Minecraft var64 = field_43;
                                 if (var64.field_42P.method_40$ee256e8a75(var22) > 6.0F) {
                                    var10002 = 6400408394568534235L;
                                    long var65 = var16;
                                    client.setting.ModeSetting var67 = this.settingMovementmode;
                                    var265 = ((byte) (var67.method_46$5f9dc63072(var65).equalsIgnoreCase("silent") ? 1 : 0));
                                    var307 = var20;
                                    long var568;
                                    int var394 = (var568 = var2 - 0L) == 0L ? 0 : (var568 < 0L ? -1 : 1);
                                    long var569;
                                    int var395 = (var569 = var2 - 0L) == 0L ? 0 : (var569 < 0L ? -1 : 1);
                                    long var570;
                                    int var396 = (var570 = var2 - 0L) == 0L ? 0 : (var570 < 0L ? -1 : 1);
                                    break label1223;
                                 }
                              }

                              var10001 = 6400578051475491234L;
                              client.setting.BooleanSetting var71 = this.settingAdStafeOnHit;
                              var265 = ((byte) (var71.method_49$aae029aa0a() ? 1 : 0));
                           }

                           var307 = var20;
                        }

                        long var571;
                        int var397 = (var571 = var2 - 0L) == 0L ? 0 : (var571 < 0L ? -1 : 1);
                        long var572;
                        int var398 = (var572 = var2 - 0L) == 0L ? 0 : (var572 < 0L ? -1 : 1);
                        long var573;
                        int var399 = (var573 = var2 - 0L) == 0L ? 0 : (var573 < 0L ? -1 : 1);
                        if (var265 == var307) {
                           var10001 = 6401156247312289233L;
                           net.C_47cu var73 = this.field_47;
                           var73.method_46$da8c82d5d4();
                           this.field_43u = !this.field_43u;
                        }

                        net.C_47cu var266 = this.field_47;
                        long var10003 = 6400497031033298095L;
                        long var74 = var8;
                        client.setting.NumberSetting var76 = this.settingAdStafeTime;
                        double var309 = var76.method_44$474dfaa627(var74);
                        var10003 = 6397567842022737839L;
                        long var77 = var10;
                        double var79 = var309;
                        net.C_47cu var81 = var266;
                        if (!var81.method_43$2ac7ee8710(var79, var77)) {
                           float var310 = this.field_43u ? 1.0F : -1.0F;
                           var10002 = 6400077256111301797L;
                           float var82 = var310;
                           net.C_472n var83 = var1;
                           var83.method_44$24a796ab4c(var82);
                        }
                     }

                     long var574;
                     int var311 = (var574 = var2 - 0L) == 0L ? 0 : (var574 < 0L ? -1 : 1);
                     if (var20 == 0) {
                        var10002 = 6400735899985049125L;
                        float var85 = 1.0F;
                        net.C_472n var86 = var1;
                        var86.method_45$24a796ab4c(var85);
                     }
                  }
               }
            }
         }
      }
   }








   public void onRender3D(long var1, float var3) {
      short var7;
      org.lwjgl.opengl.GL11.glPushMatrix();
      org.lwjgl.opengl.GL11.glEnable(3042);
      org.lwjgl.opengl.GL11.glBlendFunc(770, 771);
      org.lwjgl.opengl.GL11.glEnable(2848);
      org.lwjgl.opengl.GL11.glDisable(2929);
      boolean var10000 = recovery$indy$flow$269(8133671159267475531L, var1);
      org.lwjgl.opengl.GL11.glDisable(3553);
      net.minecraft.client.renderer.GlStateManager.method_42m$da8c82d5d4();
      org.lwjgl.opengl.GL11.glDepthMask(false);
      org.lwjgl.opengl.GL11.glTranslated(
         -((net.C_47j9)recovery$indy$flow$274(field_43, 8134539552017496178L, var1)).method_41$fedcb3e4d3(),
         -((net.C_47j9)recovery$indy$flow$277(field_43, 8134539552017496178L, var1)).method_49$fedcb3e4d3(),
         -((net.C_47j9)recovery$indy$flow$280(field_43, 8134539552017496178L, var1)).method_45$fedcb3e4d3()
      );
      net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b(1.0F, 1.0F, 1.0F, 1.0F);
      boolean var4 = var10000;
      var7 = ((short) (recovery$indy$flow$285(this.settingDebugLine, 8140863225036857739L, var1) ? 1 : 0));
      label68:
      if (var4) {
         label66:
         if (var7 != 0) {
            java.util.ArrayList var8 = this.field_43h;
            if (var4) {
               if (this.field_43h == null) {
                  break label66;
               }

               var8 = this.field_43h;
            }

            var7 = ((short) (var8.isEmpty() ? 1 : 0));
            if (!var4) {
               break label68;
            }

            if (var7 == 0) {
               var7 = ((short) (recovery$indy$flow$290(this.settingPathFinding, 8140863225036857739L, var1) ? 1 : 0));
               if (!var4) {
                  break label68;
               }

               if (var7 != 0) {
                  label73: {
                     org.lwjgl.opengl.GL11.glBegin(3);
                     java.util.ArrayList var9 = this.field_43h;
                     if (var4) {
                        if (this.field_43h == null) {
                           break label73;
                        }

                        var9 = this.field_43h;
                     }

                     for (Object recovered$element$13000 : var9) {
         net.C_47pN var6 = (net.C_47pN) recovered$element$13000;
                        org.lwjgl.opengl.GL11.glVertex3d(
                           ((net.C_47nU)recovery$indy$flow$298(var6, 8140643231104417702L, var1)).field_46 + 0.5,
                           ((net.C_47nU)recovery$indy$flow$300(var6, 8140643231104417702L, var1)).field_48 + 0.01,
                           ((net.C_47nU)recovery$indy$flow$302(var6, 8140643231104417702L, var1)).field_40 + 0.5
                        );
                        var10000 = var4;
                        if (var1 >= 0L) {
                           if (!var4) {
                              return;
                           }

                           var10000 = var4;
                        }

                        if (!var10000) {
                           break;
                        }
                     }
                  }

                  if (var1 < 0L) {
                     return;
                  }

                  org.lwjgl.opengl.GL11.glEnd();
               }
            }
         }

         org.lwjgl.opengl.GL11.glPopMatrix();
         org.lwjgl.opengl.GL11.glDepthMask(true);
         net.minecraft.client.renderer.GlStateManager.method_42H$da8c82d5d4();
         org.lwjgl.opengl.GL11.glEnable(3553);
         org.lwjgl.opengl.GL11.glEnable(2929);
         org.lwjgl.opengl.GL11.glDisable(3042);
         org.lwjgl.opengl.GL11.glBlendFunc(770, 771);
         var7 = 2848;
      }

      org.lwjgl.opengl.GL11.glDisable(var7);
   }




    public void method_43$ca1f9e88a9(C_47tz c_47tz, long l) {
        block2: {
            EntityLivingBase c_47aK;
            Object object;
            long l2;
            block6: {
                boolean bl;
                Object[] objectArray;
                block4: {
                    boolean bl2;
                    block5: {
                        boolean bl3;
                        block3: {
                            long l3;
                            block1: {
                                long l4 = l;
                                l3 = l4 ^ 0x4AEE79BA2167L;
                                l2 = l4 ^ 0x914DB0EC5C3L;
                                bl2 = Fly_47kE.method_49t$aae029aa0a();
                                bl3 = this.field_43v;
                                if (bl2) break block1;
                                if (bl3) break block2;
                                BooleanSetting c_47TV = this.settingPathFinding;
                                bl3 = c_47TV.method_49$aae029aa0a();
                            }
                            if (bl2) break block3;
                            if (!bl3) break block2;
                            long l5 = l3;
                            ModeSetting c_47Tj = this.settingMovementmode;
                            bl3 = c_47Tj.method_46$5f9dc63072(l5).equalsIgnoreCase(AutoWalk_47Cb.recovery$indy$36(24585, 0x220E9DBC6CBFDCAEL ^ l));
                        }
                        if (!bl3) break block2;
                        Minecraft c_47nT = field_43;
                        objectArray = c_47nT.field_44Q.field_44Q.stream().filter(AutoWalk_47Cb.recovery$indy$37(this)).sorted(Comparator.comparingDouble(AutoWalk_47Cb.recovery$indy$38())).toArray();
                        if (objectArray.length <= 0) break block2;
                        object = this.field_43h;
                        bl = bl2;
                        if (l <= 0L) break block4;
                        if (bl) break block5;
                        if (object == null) break block2;
                        object = this.field_43h;
                    }
                    bl = bl2;
                }
                if (bl) break block6;
                if (((ArrayList)object).isEmpty()) break block2;
                object = objectArray[0];
            }
            if ((c_47aK = (EntityLivingBase)object) != null) {
                boolean bl = false;
                long l6 = l2;
                C_47tz c_47tz2 = c_47tz;
                c_47tz2.method_43$b757cde368(l6, bl);
            }
        }
    }




   private boolean method_46I$aae029aa0a() {
      long var1 = b ^ 86680210993672L;
      long var3 = var1 ^ 33533739142767L;
      long var10000 = -3777365990562349542L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = -3781990842327285591L;
      ModeSetting var6 = this.settingMovementmode;
      boolean var10 = var6.method_44$aae029aa0a();
      if (!var5) {
         if (!var10) {
            return false;
         }

         long var10002 = -3778647695310709882L;
         long var7 = var3;
         ModeSetting var9 = this.settingMovementmode;
         var10 = var9.method_46$5f9dc63072(var7).equalsIgnoreCase("silent");
      }

      return var5 ? var10 : var10;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 47076289715869L;
      long var7 = var1 ^ 49072313886417L;
      super.method_43_$e45a9973e5(var3);
      recovery$indy$39(this, 40, 1, var5, -7105158514622688368L, var1);
      recovery$indy$40(this, 36, var7, -7103816910213365951L, var1);
      recovery$indy$41(this, 32, var7, -7103816910213365951L, var1);
      recovery$indy$42(this, 17, var7, -7103816910213365951L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 0L;
      super.method_43y$e45a9973e5(var3);
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 0L;
      int var6 = (int)((var4 ^ 0L) >>> 48);
      int var7 = (int)((var4 ^ 0L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      super.method_43x$c973149af1((short)var6, var7, (char)var8);
   }



    public void method_487$da8c82d5d4() {
        region1907: {
        region1905: {
        int regionValue3410;

        region1904: {
        region1903: {
        int regionValue3403;

        region1902: {
        region1901: {
        region1899: {
        int comparison3401;

        region1898: {
        int value57;
        int regionValue3389;
        float converted3341;

        region1868: {
        region1867: {
        int regionValue3362;

        region1866: {
        region1865: {
        region1863: {
        int comparison3356;

        region1862: {
        java.lang.Object regionValue3278;
        double regionValue3280;
        double regionValue3279;
        long computed9;

        region1795: {
        java.lang.Object regionValue3215;

        region1781: {
        long computed47;
        java.lang.Object regionValue3303;

        region1740: {
        java.lang.Object regionValue3232;
        int regionValue3233;

        region1739: {
        double converted3267;
        double computed3273;
        java.lang.Object regionValue3294;

        region1736: {
        java.lang.Object regionValue3286;

        region1734: {
        long computed43;
        java.lang.Object regionValue3263;

        region1712: {
        java.lang.Object regionValue3256;

        region1710: {
        java.lang.Object regionValue3248;
        int comparison3226;

        region1709: {
        java.lang.Object regionValue3240;

        region1707: {
        java.lang.Object regionValue3222;

        region1699: {
        java.lang.Object regionValue3075;

        region1697: {
        java.lang.Object regionValue3107;

        region1696: {
        java.lang.Object regionValue3135;
        double regionValue3137;
        double regionValue3136;
        long computed49;

        region1638: {
        java.lang.Object regionValue3174;

        region1622: {
        java.lang.Object regionValue3166;

        region1620: {
        double computed3127;
        double regionValue3147;
        java.lang.Object regionValue3155;

        region1618: {
        java.lang.Object regionValue3145;

        region1616: {
        java.lang.Object regionValue3115;

        region1588: {
        java.lang.Object regionValue2994;
        int regionValue2995;

        region1587: {
        java.lang.Object regionValue3093;

        region1571: {
        java.lang.Object regionValue3084;

        region1569: {
        java.lang.Object regionValue2739;

        region1566: {
        java.lang.Object regionValue3020;

        region1459: {
        java.lang.Object regionValue3012;

        region1457: {
        int regionValue2576;
        java.lang.Object regionValue3003;

        region1456: {
        java.lang.Object regionValue2575;

        region1454: {
        long computed3;
        java.lang.Object regionValue2308;
        long computed25;

        region1433: {
        java.lang.Object value1020;
        int regionValue2636;
        java.lang.Object regionValue2635;
        long computed7;
        long computed45;

        region1225: {
        java.lang.Object regionValue2616;
        int regionValue2615;

        region1214: {
        java.lang.Object regionValue2603;
        int regionValue2602;

        region1212: {
        int regionValue1945;
        java.lang.Object regionValue2589;
        int regionValue2588;

        region1211: {
        java.lang.Object regionValue1944;
        int regionValue1943;

        region1209: {
        java.lang.Object regionValue1972;
        int regionValue1971;

        region1197: {
        java.lang.Object regionValue2124;
        int regionValue2123;

        region1195: {
        int regionValue2203;
        java.lang.Object regionValue2202;
        int regionValue2201;

        region987: {
        int regionValue2142;
        java.lang.Object regionValue2141;
        int regionValue2140;

        region986: {
        int regionValue2181;
        java.lang.Object regionValue2182;

        region974: {
        java.lang.Object regionValue2169;
        int regionValue2168;

        region972: {
        int regionValue2044;
        java.lang.Object regionValue2155;
        int regionValue2154;

        region971: {
        java.lang.Object regionValue2043;
        int regionValue2042;

        region969: {
        java.lang.Object regionValue2073;
        int regionValue2072;

        region957: {
        java.lang.Object value2026;
        int regionValue2099;
        net.C_478Q initialized2020;

        region939: {
        int regionValue2085;

        region937: {
        java.lang.Object value1921;
        int regionValue2056;
        int regionValue2060;

        region936: {
        int regionValue1997;

        region874: {
        int regionValue1984;

        region872: {
        int regionValue1957;
        int comparison1931;

        region871: {
        int regionValue1849;
        java.lang.Object regionValue1851;
        java.lang.Object regionValue1850;

        region847: {
        java.lang.Object regionValue1886;
        int regionValue1885;

        region843: {
        region826: {
        region824: {
        java.lang.Object value1835;
        java.lang.Object value1837;
        int regionValue1863;

        region810: {
        int regionValue1775;
        java.lang.Object regionValue1776;

        region802: {
        int regionValue1803;

        region789: {
        region787: {
        region785: {
        int regionValue1724;
        java.lang.Object value1763;

        region781: {
        region769: {
        region766: {
        region764: {
        int regionValue1676;

        region762: {
        region760: {
        region755: {
        region753: {
        int regionValue1688;

        region752: {
        java.lang.Object regionValue1628;

        region749: {
        region745: {
        region743: {
        java.lang.Object regionValue1640;

        region742: {
        java.lang.Object regionValue1516;

        region740: {
        region738: {
        region736: {
        net.C_47nU initialized1033;
        net.C_47nU initialized1044;
        int converted21;
        int converted17;
        int converted13;

        region705: {
        region703: {
        region694: {
        region692: {
        java.lang.Object value1504;

        region688: {
        region686: {
        region676: {
        int regionValue1307;

        region675: {
        java.lang.Object value1048;

        region670: {
        region668: {
        region636: {
        region634: {
        region601: {
        region599: {
        int regionValue1325;

        region598: {
        int regionValue1226;

        region596: {
        region566: {
        region564: {
        int regionValue1069;

        region563: {
        region561: {
        region552: {
        region550: {
        int comparison1142;

        region549: {
        region547: {
        region539: {
        region537: {
        int regionValue1087;

        region536: {
        java.lang.Object value635;
        java.lang.Object regionValue875;
        int converted37;
        int converted33;
        int converted29;

        region481: {
        region470: {
        region468: {
        java.lang.Object value694;
        java.lang.Object value956;

        region460: {
        region458: {
        region447: {
        region445: {
        java.lang.Object value857;

        region439: {
        region437: {
        region426: {
        java.lang.Object regionValue735;

        region424: {
        region420: {
        region418: {
        java.lang.Object value716;
        long computed5;

        region406: {
        region404: {
        region400: {
        long computed41;
        long computed23;

        region270: {
        region269: {
        region235: {
        region233: {
        region226: {
        region224: {
        region222: {
        region220: {
        region217: {
        int regionValue336;

        region216: {
        region205: {
        region203: {
        region200: {
        region198: {
        int regionValue254;

        region197: {
        region195: {
        region183: {
        region181: {
        int regionValue191;

        region180: {
        region178: {
        region169: {
        region168: {
        region166: {
        int regionValue106;

        region165: {
        region163: {
        long computed39;

        region149: {
        region147: {
        int regionValue127;

        region146: {
        region119: {
        long computed27;
        long computed11;
        java.lang.Object value56;
        java.lang.Object value55;
        java.lang.String value53;
        java.lang.Object value52;
        boolean value51;
        long value2;
        long computed36;
        long computed35;
        long computed32;
        long computed31;
        long computed28;
        long computed20;
        long computed19;
        long computed16;
        long computed15;
        long computed12;

        value2 = recovery$indy$flow$359();
        computed3 = value2 ^ 80078521007559L;
        computed5 = computed3 ^ 140471324494347L;
        computed7 = computed3 ^ 35964725853099L;
        computed9 = computed3 ^ 50609446552290L;
        computed11 = computed3 ^ 65696980481726L;
        computed12 = computed11 >>> 48;
        converted13 = (int) (computed12);
        computed15 = computed11 << 16;
        computed16 = computed15 >>> 48;
        converted17 = (int) (computed16);
        computed19 = computed11 << 32;
        computed20 = computed19 >>> 32;
        converted21 = (int) (computed20);
        computed23 = computed3 ^ 133181169431647L;
        computed25 = computed3 ^ 26933110702496L;
        computed27 = computed3 ^ 28228634417953L;
        computed28 = computed27 >>> 48;
        converted29 = (int) (computed28);
        computed31 = computed27 << 16;
        computed32 = computed31 >>> 32;
        converted33 = (int) (computed32);
        computed35 = computed27 << 48;
        computed36 = computed35 >>> 48;
        converted37 = (int) (computed36);
        computed39 = computed3 ^ 36654898203925L;
        computed41 = computed3 ^ 45994184790906L;
        computed43 = computed3 ^ 39702344730670L;
        computed45 = computed3 ^ 122292585304024L;
        computed47 = computed3 ^ 49379959248053L;
        computed49 = computed3 ^ 57321754007789L;
        recovery$indy$flow$360(this, true);
        value51 = recovery$indy$flow$361();
        value52 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_46));
        value53 = "None";
        value55 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value52))))));
        value56 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value53))))));
        recovery$indy$flow$365(value55, value56);
        value57 = (int) ((value51 ? 1 : 0));
        break region119;
        }
        try {
        boolean value86;
        java.lang.Object value85;
        java.lang.Object value82;
        java.lang.Object value81;
        java.lang.Object value80;
        java.lang.Object value78;

        value78 = recovery$indy$flow$366();
        value80 = ((java.lang.Object)(((client.Client) (((java.lang.Object)(value78))))));
        value81 = recovery$indy$flow$368(value80);
        value82 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value81)))).field_41p));
        value85 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(value82))))));
        value86 = recovery$indy$flow$371(value85, computed5);
        if (value57 == 0) {
            regionValue106 = (int) ((value86 ? 1 : 0));
            break region163;
        } else {
            regionValue127 = (int) ((value86 ? 1 : 0));
            break region146;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue127 != 0) {
            break region168;
        } else {
            break region147;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region149;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        boolean value171;
        java.lang.Object value170;

        value170 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this))))));
        value171 = recovery$indy$flow$373(value170, computed39);
        regionValue106 = (int) ((value171 ? 1 : 0));
        break region163;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue191 = regionValue106;
            break region178;
        } else {
            break region165;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue106 != 0) {
            break region169;
        } else {
            break region166;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region168;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        return;
        }
        try {
        boolean value234;
        java.lang.Object value233;
        java.lang.Object value231;

        value231 = recovery$indy$flow$374();
        value233 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value231))))));
        value234 = recovery$indy$flow$376(value233);
        regionValue191 = (int) ((value234 ? 1 : 0));
        break region178;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue254 = regionValue191;
            break region195;
        } else {
            break region180;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue191 == 0) {
            break region1905;
        } else {
            break region181;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region183;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        boolean value316;
        java.lang.Object value315;
        java.lang.Object value313;

        value313 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingPathFinding));
        value315 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value313))))));
        value316 = recovery$indy$flow$379(value315);
        regionValue254 = (int) ((value316 ? 1 : 0));
        break region195;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue336 = regionValue254;
            break region216;
        } else {
            break region197;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue254 == 0) {
            break region1905;
        } else {
            break region198;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region200;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            break region270;
        } else {
            break region203;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region205;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        boolean value458;
        java.lang.Object value457;
        java.lang.Object value455;

        value455 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingKeepRotation));
        value457 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value455))))));
        value458 = recovery$indy$flow$382(value457);
        regionValue336 = (int) ((value458 ? 1 : 0));
        break region216;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue336 == 0) {
            break region269;
        } else {
            break region217;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            break region270;
        } else {
            break region220;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region222;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value537;

        value537 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_47l));
        if (value537 == null) {
            break region269;
        } else {
            break region224;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region226;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        long computed578;
        long value577;
        long value576;
        int comparison579;

        value576 = recovery$indy$flow$384();
        value577 = recovery$indy$flow$385(this);
        computed578 = value576 - value577;
        comparison579 = (computed578 > 10000L ? 1 : computed578 == 10000L ? 0 : -1);
        if (comparison579 >= 0) {
            break region269;
        } else {
            break region233;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region235;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value630;
        java.lang.Object value629;
        java.lang.Object value628;
        int value624;
        java.lang.Object value622;
        java.lang.Object value621;
        java.lang.Object value619;
        java.lang.Object value618;

        value618 = recovery$indy$flow$386();
        value619 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_47l));
        value621 = ((java.lang.Object)(((net.C_477r) (((java.lang.Object)(value619))))));
        value622 = recovery$indy$flow$389(value621);
        value624 = 99;
        value628 = ((java.lang.Object)(((net.C_47S6) (((java.lang.Object)(value618))))));
        value629 = recovery$indy$flow$391(value622);
        value630 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this))))));
        recovery$indy$flow$393(value628, value629, computed47, value624, value630);
        break region269;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region270;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value693;
        java.lang.Object value692;
        java.lang.Object value691;
        java.lang.Object value690;
        java.lang.Object value680;
        java.lang.Object value679;
        java.lang.Object value677;
        double value675;
        java.lang.Object value674;
        java.lang.Object value671;
        java.lang.Object value670;
        java.lang.Object value669;
        double value667;
        java.lang.Object value666;
        java.lang.Object value663;
        java.lang.Object value662;
        java.lang.Object value661;
        double value659;
        java.lang.Object value658;
        java.lang.Object value655;
        java.lang.Object value654;
        java.lang.Object value653;
        double value651;
        java.lang.Object value650;
        java.lang.Object value647;
        java.lang.Object value646;
        java.lang.Object value645;
        java.lang.Object value644;
        java.lang.Object value643;
        java.lang.Object value640;
        java.lang.Object value639;
        java.lang.Object value638;
        java.lang.Object value637;
        java.lang.Object value634;
        java.lang.Object value633;
        int converted676;
        int converted668;
        int converted660;
        int converted652;

        value633 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this))))));
        value634 = recovery$indy$flow$395(value633, computed23);
        value635 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(value634))))));
        value637 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_47x));
        value638 = recovery$indy$flow$398();
        value639 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value638)))).field_48Q));
        value640 = ((java.lang.Object)(((augustus.recovered.modules.combat.KillAura_47CY) (((java.lang.Object)(value639)))).field_42Q));
        value643 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value640))))));
        value644 = recovery$indy$flow$402(value643, computed25);
        value645 = recovery$indy$flow$403();
        value646 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value645)))).field_48Q));
        value647 = ((java.lang.Object)(((augustus.recovered.modules.combat.KillAura_47CY) (((java.lang.Object)(value646)))).field_47l));
        value650 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value647))))));
        value651 = recovery$indy$flow$407(value650, computed43);
        converted652 = (int) (value651);
        value653 = recovery$indy$flow$408();
        value654 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value653)))).field_48Q));
        value655 = ((java.lang.Object)(((augustus.recovered.modules.combat.KillAura_47CY) (((java.lang.Object)(value654)))).field_49i));
        value658 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value655))))));
        value659 = recovery$indy$flow$412(value658, computed43);
        converted660 = (int) (value659);
        value661 = recovery$indy$flow$413();
        value662 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value661)))).field_48Q));
        value663 = ((java.lang.Object)(((augustus.recovered.modules.combat.KillAura_47CY) (((java.lang.Object)(value662)))).field_47Y));
        value666 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value663))))));
        value667 = recovery$indy$flow$417(value666, computed43);
        converted668 = (int) (value667);
        value669 = recovery$indy$flow$418();
        value670 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value669)))).field_48Q));
        value671 = ((java.lang.Object)(((augustus.recovered.modules.combat.KillAura_47CY) (((java.lang.Object)(value670)))).field_42g));
        value674 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value671))))));
        value675 = recovery$indy$flow$422(value674, computed43);
        converted676 = (int) (value675);
        value677 = recovery$indy$flow$423();
        value679 = ((java.lang.Object)(((net.C_47S6) (((java.lang.Object)(value677))))));
        value680 = recovery$indy$flow$425(value679);
        value690 = ((java.lang.Object)(((net.C_47gg) (((java.lang.Object)(value637))))));
        value691 = ((java.lang.Object)(((net.minecraft.entity.Entity) (((java.lang.Object)(value635))))));
        value692 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value644))))));
        value693 = ((java.lang.Object)(((net.C_477r) (((java.lang.Object)(value680))))));
        value694 = recovery$indy$flow$430(value690, computed41, value691, value692, converted652, converted660, converted668, converted676, value693);
        if (value635 == null) {
            break region1905;
        } else {
            break region400;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value715;

        value715 = recovery$indy$flow$431();
        value716 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value715)))).field_48Q));
        if (value57 == 0) {
            regionValue735 = value716;
            break region424;
        } else {
            break region404;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region406;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        boolean value779;
        java.lang.Object value778;

        value778 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(value716))))));
        value779 = recovery$indy$flow$434(value778, computed5);
        if ((int) ((value779 ? 1 : 0)) == 0) {
            break region470;
        } else {
            break region418;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region420;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value834;
        java.lang.Object value833;

        value833 = recovery$indy$flow$435();
        value834 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(value833)))).field_48Q));
        regionValue735 = value834;
        break region424;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value835;

        value835 = ((java.lang.Object)(((augustus.recovered.modules.combat.KillAura_47CY) (((java.lang.Object)(regionValue735)))).field_45z));
        if (value835 == null) {
            break region470;
        } else {
            break region426;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value856;
        java.lang.Object value854;

        value854 = recovery$indy$flow$438();
        value856 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value854))))));
        value857 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value856)))).field_42P));
        if (value57 == 0) {
            regionValue875 = value857;
            break region481;
        } else {
            break region437;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region439;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        double converted915;
        float value914;
        int comparison916;

        value914 = recovery$indy$flow$441(value857, value635);
        converted915 = (double) (value914);
        comparison916 = (java.lang.Double.isNaN(converted915) || java.lang.Double.isNaN(Double.longBitsToDouble(4615063718147915776L)) ? -1 : (converted915 > Double.longBitsToDouble(4615063718147915776L) ? 1 : converted915 == Double.longBitsToDouble(4615063718147915776L) ? 0 : -1));
        if (comparison916 > 0) {
            break region470;
        } else {
            break region445;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region447;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value955;
        java.lang.Object value953;

        value953 = recovery$indy$flow$442();
        value955 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value953))))));
        value956 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value955)))).field_42P));
        if (value57 == 0) {
            regionValue875 = value956;
            break region481;
        } else {
            break region458;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region460;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        boolean value998;
        double value997;
        double value996;
        double value995;

        value995 = recovery$indy$flow$445(value694);
        value996 = recovery$indy$flow$446(value694);
        value997 = recovery$indy$flow$447(value694);
        value998 = recovery$indy$flow$448(value956, value995, value996, value997);
        if ((int) ((value998 ? 1 : 0)) != 0) {
            break region1905;
        } else {
            break region468;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region470;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value1019;
        java.lang.Object value1018;
        java.lang.Object value1016;

        value1016 = recovery$indy$flow$449();
        value1018 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1016))))));
        value1019 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1018)))).field_42P));
        regionValue875 = value1019;
        break region481;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value1022;
        boolean value1051;
        java.lang.Object value1050;
        double value1042;
        double value1041;
        double value1039;
        double value1038;
        double value1036;
        double value1035;
        double value1031;
        double value1030;
        double value1028;
        double value1027;
        double value1025;
        double value1024;
        short converted1047;
        short converted1046;
        int converted1043;
        int converted1040;
        int converted1037;
        int converted1032;
        int converted1029;
        int converted1026;

        value1020 = recovery$indy$flow$452(regionValue875, 1.0F);
        value1022 = recovery$indy$flow$453(value635, 1.0F);
        value1024 = recovery$indy$flow$455(value1020);
        value1025 = recovery$indy$flow$456(value1024);
        converted1026 = (int) (value1025);
        value1027 = recovery$indy$flow$457(value1020);
        value1028 = recovery$indy$flow$458(value1027);
        converted1029 = (int) (value1028);
        value1030 = recovery$indy$flow$459(value1020);
        value1031 = recovery$indy$flow$460(value1030);
        converted1032 = (int) (value1031);
        initialized1033 = new net.C_47nU(converted1026, converted1029, converted1032);
        value1035 = recovery$indy$flow$463(value1022);
        value1036 = recovery$indy$flow$464(value1035);
        converted1037 = (int) (value1036);
        value1038 = recovery$indy$flow$465(value1022);
        value1039 = recovery$indy$flow$466(value1038);
        converted1040 = (int) (value1039);
        value1041 = recovery$indy$flow$467(value1022);
        value1042 = recovery$indy$flow$468(value1041);
        converted1043 = (int) (value1042);
        initialized1044 = new net.C_47nU(converted1037, converted1040, converted1043);
        converted1046 = (short) (converted29);
        converted1047 = (short) (converted37);
        value1048 = recovery$indy$flow$470(initialized1033, converted1046, converted33, converted1047, -4303969527970996579L, computed3);
        value1050 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43E));
        value1051 = recovery$indy$flow$472(value1050, value1048);
        if (value57 == 0) {
            regionValue1069 = (int) ((value1051 ? 1 : 0));
            break region561;
        } else {
            regionValue1087 = (int) ((value1051 ? 1 : 0));
            break region536;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue1087 == 0) {
            break region552;
        } else {
            break region537;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region539;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        long computed1141;
        long value1140;
        long value1139;

        value1139 = recovery$indy$flow$473();
        value1140 = recovery$indy$flow$474(this);
        computed1141 = value1139 - value1140;
        comparison1142 = (computed1141 > 1000L ? 1 : computed1141 == 1000L ? 0 : -1);
        if (value57 == 0) {
            regionValue1069 = comparison1142;
            break region561;
        } else {
            break region547;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region549;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (comparison1142 >= 0) {
            break region738;
        } else {
            break region550;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region552;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        double value1207;
        int comparison1208;

        value1207 = recovery$indy$flow$475(initialized1033, initialized1044, -4305440596535629512L, computed3);
        comparison1208 = (java.lang.Double.isNaN(value1207) || java.lang.Double.isNaN(Double.longBitsToDouble(4647503709213818880L)) ? 1 : (value1207 > Double.longBitsToDouble(4647503709213818880L) ? 1 : value1207 == Double.longBitsToDouble(4647503709213818880L) ? 0 : -1));
        regionValue1069 = comparison1208;
        break region561;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue1226 = regionValue1069;
            break region596;
        } else {
            break region563;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue1069 >= 0) {
            break region738;
        } else {
            break region564;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region566;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        double value1288;
        java.lang.Object value1287;
        java.lang.Object value1284;
        int value1283;
        java.lang.Object value1282;
        java.lang.Object value1281;
        java.lang.Object value1279;
        int converted1289;
        int computed1290;

        recovery$indy$flow$476(this, value1048);
        value1279 = recovery$indy$flow$477();
        value1281 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1279))))));
        value1282 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1281)))).field_42P));
        value1283 = recovery$indy$flow$480(value1282);
        value1284 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingUpdateTicks));
        value1287 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value1284))))));
        value1288 = recovery$indy$flow$483(value1287, computed43);
        converted1289 = (int) (value1288);
        computed1290 = value1283 % converted1289;
        regionValue1226 = computed1290;
        break region596;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue1307 = regionValue1226;
            break region675;
        } else {
            regionValue1325 = regionValue1226;
            break region598;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue1325 != 0) {
            break region636;
        } else {
            break region599;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region601;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        long value1388;
        java.lang.Object value1387;
        java.lang.Object value1386;
        java.lang.Object value1385;
        int value1383;
        int value1381;
        char converted1378;
        short converted1377;

        converted1377 = (short) (converted13);
        converted1378 = (char) (converted17);
        value1381 = (int) (converted1378);
        value1383 = (int) (converted1377);
        value1385 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this))))));
        value1386 = ((java.lang.Object)(((net.C_47nU) (((java.lang.Object)(initialized1033))))));
        value1387 = ((java.lang.Object)(((net.C_47nU) (((java.lang.Object)(initialized1044))))));
        recovery$indy$flow$487(value1385, (short) (value1383), value1386, (char) (value1381), value1387, converted21);
        value1388 = recovery$indy$flow$488();
        recovery$indy$flow$489(this, value1388);
        if (value57 != 0) {
            break region738;
        } else {
            break region634;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region636;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value1419;
        java.lang.Object value1418;
        java.lang.Object value1417;
        int value1416;
        java.lang.Object value1415;
        java.lang.Object value1414;
        java.lang.Object value1412;
        boolean value1411;
        java.lang.Object value1410;
        java.lang.Object value1409;
        java.lang.Object value1408;
        java.lang.Object value1406;
        java.lang.StringBuilder initialized1407;
        long computed1413;

        value1406 = recovery$indy$flow$490();
        initialized1407 = new java.lang.StringBuilder();
        value1408 = recovery$indy$flow$493(initialized1407, value1048);
        value1409 = recovery$indy$flow$494(value1408, " ");
        value1410 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_47M));
        value1411 = recovery$indy$flow$496(value1410, value1048);
        value1412 = recovery$indy$flow$497(value1409, value1411);
        computed1413 = 5194137424949306903L ^ computed3;
        value1414 = recovery$indy$flow$498(value1412, " (nodes=");
        value1415 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_47M));
        value1416 = recovery$indy$flow$500(value1415);
        value1417 = recovery$indy$flow$501(value1414, value1416);
        value1418 = recovery$indy$flow$502(value1417, ")");
        value1419 = recovery$indy$flow$503(value1418);
        recovery$indy$flow$504(value1406, value1419);
        if (value57 == 0) {
            break region736;
        } else {
            break region668;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region670;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        boolean value1469;
        java.lang.Object value1468;

        value1468 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_47M));
        value1469 = recovery$indy$flow$506(value1468, value1048);
        regionValue1307 = (int) ((value1469 ? 1 : 0));
        break region675;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue1307 == 0) {
            break region705;
        } else {
            break region676;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        int value1502;
        int computed1503;

        value1502 = recovery$indy$flow$507(this);
        computed1503 = value1502 + 1;
        recovery$indy$flow$508(this, computed1503);
        value1504 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        if (value57 == 0) {
            regionValue1516 = value1504;
            break region740;
        } else {
            break region686;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region688;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        int value1552;
        int value1551;

        value1551 = recovery$indy$flow$510(value1504);
        value1552 = recovery$indy$flow$511(this);
        if (value1551 > value1552) {
            break region738;
        } else {
            break region692;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region694;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        int value1586;
        java.lang.Object value1585;
        int computed1587;

        value1585 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        value1586 = recovery$indy$flow$513(value1585);
        computed1587 = value1586 - 1;
        recovery$indy$flow$514(this, computed1587);
        if (value57 != 0) {
            break region738;
        } else {
            break region703;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region705;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value1614;
        java.lang.Object value1613;
        java.lang.Object value1612;
        int value1610;
        int value1608;
        char converted1605;
        short converted1604;

        converted1604 = (short) (converted13);
        converted1605 = (char) (converted17);
        value1608 = (int) (converted1605);
        value1610 = (int) (converted1604);
        value1612 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this))))));
        value1613 = ((java.lang.Object)(((net.C_47nU) (((java.lang.Object)(initialized1033))))));
        value1614 = ((java.lang.Object)(((net.C_47nU) (((java.lang.Object)(initialized1044))))));
        recovery$indy$flow$518(value1612, (short) (value1610), value1613, (char) (value1608), value1614, converted21);
        break region736;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        long value1615;

        value1615 = recovery$indy$flow$519();
        recovery$indy$flow$520(this, value1615);
        break region738;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value1616;

        value1616 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        regionValue1516 = value1616;
        break region740;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue1628 = regionValue1516;
            break region749;
        } else {
            regionValue1640 = regionValue1516;
            break region742;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue1640 == null) {
            break region1905;
        } else {
            break region743;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region745;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value1663;

        value1663 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        regionValue1628 = value1663;
        break region749;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        boolean value1664;

        value1664 = recovery$indy$flow$523(regionValue1628);
        if (value57 == 0) {
            regionValue1676 = (int) ((value1664 ? 1 : 0));
            break region760;
        } else {
            regionValue1688 = (int) ((value1664 ? 1 : 0));
            break region752;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue1688 != 0) {
            break region1905;
        } else {
            break region753;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region755;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        int value1712;
        java.lang.Object value1711;

        value1711 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        value1712 = recovery$indy$flow$525(value1711);
        regionValue1676 = value1712;
        break region760;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue1724 = regionValue1676;
            break region769;
        } else {
            break region762;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue1676 <= 1) {
            break region1905;
        } else {
            break region764;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region766;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue1724 = 1;
        break region769;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value1762;
        java.lang.Object value1760;

        value1760 = recovery$indy$flow$526();
        value1762 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1760))))));
        value1763 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1762)))).field_42P));
        if (value57 == 0) {
            regionValue1775 = regionValue1724;
            regionValue1776 = value1763;
            break region802;
        } else {
            break region781;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        double value1790;
        int comparison1791;

        value1790 = recovery$indy$flow$529(value1763);
        comparison1791 = (java.lang.Double.isNaN(value1790) || java.lang.Double.isNaN(0.0D) ? -1 : (value1790 > 0.0D ? 1 : value1790 == 0.0D ? 0 : -1));
        if (comparison1791 <= 0) {
            regionValue1803 = regionValue1724;
            break region789;
        } else {
            break region785;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region787;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        int value1826;

        value1826 = 2;
        regionValue1803 = value1826;
        break region789;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value1834;
        int value1830;
        int value1829;
        java.lang.Object value1828;
        java.lang.Object value1827;
        int computed1833;
        int computed1832;
        int computed1831;

        value1827 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        value1828 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        value1829 = recovery$indy$flow$532(value1828);
        value1830 = recovery$indy$flow$533(this);
        computed1831 = value1829 - value1830;
        computed1832 = computed1831 - regionValue1803;
        computed1833 = computed1832 - 1;
        value1834 = recovery$indy$flow$534(value1827, computed1833);
        regionValue1775 = regionValue1803;
        regionValue1776 = value1834;
        break region802;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        value1835 = ((java.lang.Object)(((net.C_47pN) (((java.lang.Object)(regionValue1776))))));
        value1837 = recovery$indy$flow$536(value1835, -4304790611891254499L, computed3);
        if (value57 == 0) {
            regionValue1849 = regionValue1775;
            regionValue1850 = value1835;
            regionValue1851 = value1837;
            break region847;
        } else {
            regionValue1863 = regionValue1775;
            break region810;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        double value1872;
        double converted1867;
        java.lang.Object value1871;
        java.lang.Object value1870;
        java.lang.Object value1868;
        int value1866;
        int comparison1873;

        value1866 = recovery$indy$flow$537(value1837);
        converted1867 = (double) (value1866);
        value1868 = recovery$indy$flow$538();
        value1870 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1868))))));
        value1871 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1870)))).field_42P));
        value1872 = recovery$indy$flow$541(value1871);
        comparison1873 = (java.lang.Double.isNaN(converted1867) || java.lang.Double.isNaN(value1872) ? -1 : (converted1867 > value1872 ? 1 : converted1867 == value1872 ? 0 : -1));
        if (comparison1873 <= 0) {
            regionValue1885 = regionValue1863;
            regionValue1886 = value1835;
            break region843;
        } else {
            break region824;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region826;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        int value1909;
        java.lang.Object value1918;
        java.lang.Object value1917;
        int value1913;
        int value1912;
        java.lang.Object value1911;
        java.lang.Object value1910;
        int computed1916;
        int computed1915;
        int computed1914;

        value1909 = 3;
        value1910 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        value1911 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        value1912 = recovery$indy$flow$544(value1911);
        value1913 = recovery$indy$flow$545(this);
        computed1914 = value1912 - value1913;
        computed1915 = computed1914 - value1909;
        computed1916 = computed1915 - 1;
        value1917 = recovery$indy$flow$546(value1910, computed1916);
        value1918 = ((java.lang.Object)(((net.C_47pN) (((java.lang.Object)(value1917))))));
        regionValue1885 = value1909;
        regionValue1886 = value1918;
        break region843;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value1920;

        value1920 = recovery$indy$flow$548(regionValue1886, -4304790611891254499L, computed3);
        regionValue1849 = regionValue1885;
        regionValue1850 = regionValue1886;
        regionValue1851 = value1920;
        break region847;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        double value1930;
        double converted1925;
        java.lang.Object value1929;
        java.lang.Object value1928;
        java.lang.Object value1926;
        int value1924;
        java.lang.Object value1923;

        value1921 = recovery$indy$flow$549(regionValue1851, computed7, -4304434752675623119L, computed3);
        value1923 = recovery$indy$flow$550(regionValue1850, -4304790611891254499L, computed3);
        value1924 = recovery$indy$flow$551(value1923);
        converted1925 = (double) (value1924);
        value1926 = recovery$indy$flow$552();
        value1928 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1926))))));
        value1929 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1928)))).field_42P));
        value1930 = recovery$indy$flow$555(value1929);
        comparison1931 = (java.lang.Double.isNaN(converted1925) || java.lang.Double.isNaN(value1930) ? -1 : (converted1925 > value1930 ? 1 : converted1925 == value1930 ? 0 : -1));
        if (value57 == 0) {
            regionValue1943 = regionValue1849;
            regionValue1944 = value1921;
            regionValue1945 = comparison1931;
            break region1209;
        } else {
            regionValue1957 = regionValue1849;
            break region871;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (comparison1931 <= 0) {
            regionValue1971 = regionValue1957;
            regionValue1972 = value1921;
            break region1197;
        } else {
            regionValue1984 = regionValue1957;
            break region872;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue1997 = regionValue1984;
        break region874;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        boolean value2030;
        java.lang.Object value2028;
        java.lang.Object value2025;
        java.lang.Object value2024;
        java.lang.Object value2022;
        int value2018;
        double value2017;
        java.lang.Object value2016;
        java.lang.Object value2015;
        java.lang.Object value2013;
        int value2011;
        double value2010;
        java.lang.Object value2009;
        java.lang.Object value2008;
        java.lang.Object value2006;
        int value2004;
        double value2003;
        java.lang.Object value2002;
        java.lang.Object value2001;
        java.lang.Object value1999;

        value1999 = recovery$indy$flow$556();
        value2001 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value1999))))));
        value2002 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2001)))).field_42P));
        value2003 = recovery$indy$flow$559(value2002);
        value2004 = recovery$indy$flow$560(value2003);
        value2006 = recovery$indy$flow$561();
        value2008 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2006))))));
        value2009 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2008)))).field_42P));
        value2010 = recovery$indy$flow$564(value2009);
        value2011 = recovery$indy$flow$565(value2010);
        value2013 = recovery$indy$flow$566();
        value2015 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2013))))));
        value2016 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2015)))).field_42P));
        value2017 = recovery$indy$flow$569(value2016);
        value2018 = recovery$indy$flow$570(value2017);
        initialized2020 = new net.C_478Q(value2004, value2011, value2018);
        value2022 = recovery$indy$flow$573();
        value2024 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2022))))));
        value2025 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2024)))).field_44Q));
        value2026 = recovery$indy$flow$576(value2025, initialized2020);
        value2028 = recovery$indy$flow$577(value2026);
        value2030 = recovery$indy$flow$578(value2028);
        if (value57 == 0) {
            regionValue2042 = regionValue1997;
            regionValue2043 = value1921;
            regionValue2044 = (int) ((value2030 ? 1 : 0));
            break region969;
        } else {
            regionValue2056 = regionValue1997;
            regionValue2060 = (int) ((value2030 ? 1 : 0));
            break region936;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue2060 == 0) {
            regionValue2072 = regionValue2056;
            regionValue2073 = value1921;
            break region957;
        } else {
            regionValue2085 = regionValue2056;
            break region937;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2099 = regionValue2085;
        break region939;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        net.C_47tf initialized2110;
        java.lang.Object value2109;
        java.lang.Object value2107;
        java.lang.Object value2106;
        java.lang.Object value2104;
        java.lang.Object value2103;
        java.lang.Object value2102;

        value2102 = recovery$indy$flow$579();
        value2103 = recovery$indy$flow$580(value2026, value2102);
        value2104 = ((java.lang.Object)(((net.C_484) (((java.lang.Object)(value2103))))));
        value2106 = recovery$indy$flow$582(value2104);
        value2107 = recovery$indy$flow$583(value2106);
        value2109 = recovery$indy$flow$585(initialized2020, value2107);
        initialized2110 = new net.C_47tf((net.C_478k) (value2109));
        if (value57 != 0) {
            regionValue2123 = regionValue2099;
            regionValue2124 = initialized2110;
            break region1195;
        } else {
            regionValue2072 = regionValue2099;
            regionValue2073 = initialized2110;
            break region957;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        boolean value2128;
        java.lang.Object value2127;
        java.lang.Object value2125;

        value2125 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingSmooth));
        value2127 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value2125))))));
        value2128 = recovery$indy$flow$589(value2127);
        regionValue2042 = regionValue2072;
        regionValue2043 = regionValue2073;
        regionValue2044 = (int) ((value2128 ? 1 : 0));
        break region969;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue2140 = regionValue2042;
            regionValue2141 = regionValue2043;
            regionValue2142 = regionValue2044;
            break region986;
        } else {
            regionValue2154 = regionValue2042;
            regionValue2155 = regionValue2043;
            break region971;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue2044 == 0) {
            regionValue2123 = regionValue2154;
            regionValue2124 = regionValue2155;
            break region1195;
        } else {
            regionValue2168 = regionValue2154;
            regionValue2169 = regionValue2155;
            break region972;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2181 = regionValue2168;
        regionValue2182 = regionValue2169;
        break region974;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        int value2185;
        int value2184;
        java.lang.Object value2183;
        int computed2188;
        int computed2187;
        int computed2186;

        value2183 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        value2184 = recovery$indy$flow$591(value2183);
        value2185 = recovery$indy$flow$592(this);
        computed2186 = value2184 - value2185;
        computed2187 = computed2186 - regionValue2181;
        computed2188 = computed2187 - 1;
        regionValue2140 = regionValue2181;
        regionValue2141 = regionValue2182;
        regionValue2142 = computed2188;
        break region986;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        int value2189;

        value2189 = regionValue2142;
        regionValue2201 = regionValue2140;
        regionValue2202 = regionValue2141;
        regionValue2203 = value2189;
        break region987;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        loop987: while (true) {
        int regionValue2525;
        java.lang.Object regionValue2527;
        int regionValue2526;

        region1190: {
        int regionValue2492;
        java.lang.Object regionValue2496;
        java.lang.Object regionValue2495;
        int regionValue2494;
        java.lang.Object regionValue2493;

        region1187: {
        java.lang.Object regionValue2559;
        java.lang.Object regionValue2558;
        int regionValue2557;
        java.lang.Object regionValue2556;
        int regionValue2555;

        region1186: {
        java.lang.Object regionValue2543;
        java.lang.Object regionValue2542;
        int regionValue2541;
        java.lang.Object regionValue2540;
        int regionValue2539;

        region1184: {
        java.lang.Object regionValue2511;
        int regionValue2510;
        int regionValue2508;
        java.lang.Object regionValue2513;
        java.lang.Object regionValue2512;
        java.lang.Object regionValue2509;

        region1183: {
        java.lang.Object regionValue2342;
        java.lang.Object regionValue2340;
        int regionValue2339;
        java.lang.Object regionValue2338;
        int regionValue2337;
        java.lang.Object regionValue2341;

        region1181: {
        java.lang.Object regionValue2394;
        java.lang.Object regionValue2393;
        int regionValue2392;
        java.lang.Object regionValue2391;
        int regionValue2390;

        region1178: {
        java.lang.Object regionValue2480;
        java.lang.Object regionValue2479;
        int regionValue2478;
        java.lang.Object regionValue2477;
        int regionValue2476;

        region1176: {
        java.lang.Object regionValue2458;
        int regionValue2457;
        java.lang.Object regionValue2462;
        java.lang.Object regionValue2461;
        java.lang.Object regionValue2460;
        int regionValue2459;

        region1173: {
        java.lang.Object regionValue2445;
        java.lang.Object regionValue2444;
        java.lang.Object regionValue2443;
        int regionValue2442;
        java.lang.Object regionValue2441;
        int regionValue2440;

        region1171: {
        java.lang.Object regionValue2428;
        java.lang.Object regionValue2427;
        java.lang.Object regionValue2426;
        int regionValue2425;
        java.lang.Object regionValue2424;
        int regionValue2423;

        region1168: {
        java.lang.Object regionValue2411;
        java.lang.Object regionValue2410;
        java.lang.Object regionValue2409;
        int regionValue2408;
        java.lang.Object regionValue2407;
        int regionValue2406;

        region1166: {
        java.lang.Object regionValue2377;
        java.lang.Object regionValue2375;
        int regionValue2374;
        java.lang.Object regionValue2373;
        int regionValue2372;
        java.lang.Object regionValue2378;
        java.lang.Object regionValue2376;

        region1165: {
        java.lang.Object regionValue2360;
        java.lang.Object regionValue2359;
        java.lang.Object regionValue2358;
        java.lang.Object regionValue2357;
        int regionValue2356;
        java.lang.Object regionValue2355;
        int regionValue2354;

        region1163: {
        java.lang.Object regionValue2324;
        java.lang.Object regionValue2325;
        java.lang.Object regionValue2323;
        int regionValue2322;
        java.lang.Object regionValue2321;
        int regionValue2320;

        region1160: {
        int regionValue2217;
        java.lang.Object regionValue2216;
        int regionValue2215;

        region989: {
        try {
        if (regionValue2203 <= 0) {
            regionValue2123 = regionValue2201;
            regionValue2124 = regionValue2202;
            break region1195;
        } else {
            regionValue2215 = regionValue2201;
            regionValue2216 = regionValue2202;
            regionValue2217 = regionValue2203;
            break region989;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value2224;
        java.lang.Object value2244;
        java.lang.Object value2299;
        java.lang.Object value2298;
        float value2297;
        float value2296;
        double value2294;
        double value2292;
        double value2291;
        double value2289;
        java.lang.Object value2288;
        java.lang.Object value2287;
        java.lang.Object value2286;
        java.lang.Object value2285;
        double value2283;
        java.lang.Object value2282;
        java.lang.Object value2281;
        java.lang.Object value2280;
        java.lang.Object value2279;
        double value2277;
        java.lang.Object value2276;
        java.lang.Object value2275;
        java.lang.Object value2274;
        java.lang.Object value2273;
        double value2272;
        java.lang.Object value2271;
        java.lang.Object value2270;
        java.lang.Object value2269;
        java.lang.Object value2268;
        java.lang.Object value2267;
        java.lang.Object value2266;
        java.lang.Object value2265;
        java.lang.Object value2264;
        java.lang.Object value2263;
        java.lang.Object value2262;
        float value2261;
        float value2260;
        double value2258;
        double value2256;
        double value2255;
        double value2253;
        java.lang.Object value2252;
        java.lang.Object value2251;
        java.lang.Object value2250;
        java.lang.Object value2249;
        java.lang.Object value2248;
        java.lang.Object value2247;
        java.lang.Object value2246;
        java.lang.Object value2245;
        java.lang.Object value2243;
        java.lang.Object value2242;
        double value2240;
        double value2238;
        double value2237;
        double value2235;
        float value2232;
        java.lang.Object value2231;
        java.lang.Object value2230;
        java.lang.Object value2229;
        java.lang.Object value2228;
        double value2227;
        double value2225;
        java.lang.Object value2223;
        java.lang.Object value2222;
        java.lang.Object value2221;
        java.lang.Object value2220;
        java.lang.Object value2219;
        java.lang.Object value2218;
        net.C_47tf initialized2284;
        double converted2233;
        double computed2295;
        double computed2293;
        double computed2290;
        double computed2278;
        double computed2259;
        double computed2257;
        double computed2254;
        double computed2236;
        double computed2234;
        double computed2226;

        value2218 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        value2219 = recovery$indy$flow$594(value2218, regionValue2217);
        value2220 = ((java.lang.Object)(((net.C_47pN) (((java.lang.Object)(value2219))))));
        value2221 = value2220;
        value2222 = recovery$indy$flow$596(value2221, -4304790611891254499L, computed3);
        value2223 = recovery$indy$flow$597(value2222, computed7, -4304434752675623119L, computed3);
        value2224 = value2223;
        value2225 = recovery$indy$flow$598(value2224);
        computed2226 = value2225 + Double.longBitsToDouble(4602678819172646912L);
        value2227 = recovery$indy$flow$599(value2224);
        value2228 = recovery$indy$flow$600();
        value2229 = value2228;
        value2230 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2229))))));
        value2231 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2230)))).field_42P));
        value2232 = recovery$indy$flow$603(value2231);
        converted2233 = (double) (value2232);
        computed2234 = value2227 + converted2233;
        value2235 = recovery$indy$flow$604(value2224);
        computed2236 = value2235 + Double.longBitsToDouble(4602678819172646912L);
        value2237 = computed2236;
        value2238 = computed2234;
        value2240 = computed2226;
        value2242 = ((java.lang.Object)(((net.C_47Ol) (((java.lang.Object)(this))))));
        value2243 = recovery$indy$flow$606(value2242, value2240, computed45, value2238, value2237);
        value2244 = value2243;
        value2245 = recovery$indy$flow$607();
        value2246 = value2245;
        value2247 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2246))))));
        value2248 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2247)))).field_42P));
        value2249 = recovery$indy$flow$610();
        value2250 = value2249;
        value2251 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2250))))));
        value2252 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2251)))).field_42P));
        value2253 = recovery$indy$flow$613(value2224);
        computed2254 = value2253 + Double.longBitsToDouble(4602678819172646912L);
        value2255 = recovery$indy$flow$614(value1020);
        value2256 = recovery$indy$flow$615(value2224);
        computed2257 = value2256 + Double.longBitsToDouble(4602678819172646912L);
        value2258 = recovery$indy$flow$616(value2252, computed2254, value2255, computed2257);
        computed2259 = value2258 + Double.longBitsToDouble(4596373779694328218L);
        value2260 = recovery$indy$flow$617(value2244);
        value2261 = recovery$indy$flow$618(value2244);
        value2262 = recovery$indy$flow$619(value2248, computed2259, 1.0F, value2260, value2261);
        value2263 = value2262;
        value2264 = recovery$indy$flow$620();
        value2265 = value2264;
        value2266 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2265))))));
        value2267 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2266)))).field_42P));
        value2268 = recovery$indy$flow$624();
        value2269 = value2268;
        value2270 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2269))))));
        value2271 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2270)))).field_42P));
        value2272 = recovery$indy$flow$627(value2271);
        value2273 = recovery$indy$flow$628();
        value2274 = value2273;
        value2275 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2274))))));
        value2276 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2275)))).field_42P));
        value2277 = recovery$indy$flow$631(value2276);
        computed2278 = value2277 + Double.longBitsToDouble(4591870180066957722L);
        value2279 = recovery$indy$flow$632();
        value2280 = value2279;
        value2281 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2280))))));
        value2282 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2281)))).field_42P));
        value2283 = recovery$indy$flow$635(value2282);
        initialized2284 = new net.C_47tf(value2272, computed2278, value2283);
        value2285 = recovery$indy$flow$637();
        value2286 = value2285;
        value2287 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2286))))));
        value2288 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2287)))).field_42P));
        value2289 = recovery$indy$flow$640(value2224);
        computed2290 = value2289 + Double.longBitsToDouble(4602678819172646912L);
        value2291 = recovery$indy$flow$641(value1020);
        value2292 = recovery$indy$flow$642(value2224);
        computed2293 = value2292 + Double.longBitsToDouble(4602678819172646912L);
        value2294 = recovery$indy$flow$643(value2288, computed2290, value2291, computed2293);
        computed2295 = value2294 + Double.longBitsToDouble(4596373779694328218L);
        value2296 = recovery$indy$flow$644(value2244);
        value2297 = recovery$indy$flow$645(value2244);
        value2298 = recovery$indy$flow$646(value2267, initialized2284, computed2295, 1.0F, value2296, value2297);
        value2299 = value2298;
        if (value57 == 0) {
            regionValue2308 = regionValue2216;
            break region1433;
        } else {
            regionValue2320 = regionValue2215;
            regionValue2321 = regionValue2216;
            regionValue2322 = regionValue2217;
            regionValue2323 = value2224;
            regionValue2324 = value2263;
            regionValue2325 = value2299;
            break region1160;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue2337 = regionValue2320;
            regionValue2338 = regionValue2321;
            regionValue2339 = regionValue2322;
            regionValue2340 = regionValue2323;
            regionValue2341 = regionValue2325;
            regionValue2342 = regionValue2324;
            break region1181;
        } else {
            regionValue2354 = regionValue2320;
            regionValue2355 = regionValue2321;
            regionValue2356 = regionValue2322;
            regionValue2357 = regionValue2323;
            regionValue2358 = regionValue2324;
            regionValue2359 = regionValue2325;
            regionValue2360 = regionValue2324;
            break region1163;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2372 = regionValue2354;
        regionValue2373 = regionValue2355;
        regionValue2374 = regionValue2356;
        regionValue2375 = regionValue2357;
        regionValue2376 = regionValue2358;
        regionValue2377 = regionValue2359;
        regionValue2378 = regionValue2360;
        break region1165;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue2378 == null) {
            regionValue2390 = regionValue2372;
            regionValue2391 = regionValue2373;
            regionValue2392 = regionValue2374;
            regionValue2393 = regionValue2375;
            regionValue2394 = regionValue2377;
            break region1178;
        } else {
            regionValue2406 = regionValue2372;
            regionValue2407 = regionValue2373;
            regionValue2408 = regionValue2374;
            regionValue2409 = regionValue2375;
            regionValue2410 = regionValue2376;
            regionValue2411 = regionValue2377;
            break region1166;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2423 = regionValue2406;
        regionValue2424 = regionValue2407;
        regionValue2425 = regionValue2408;
        regionValue2426 = regionValue2409;
        regionValue2427 = regionValue2410;
        regionValue2428 = regionValue2411;
        break region1168;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue2337 = regionValue2423;
            regionValue2338 = regionValue2424;
            regionValue2339 = regionValue2425;
            regionValue2340 = regionValue2426;
            regionValue2341 = regionValue2428;
            regionValue2342 = regionValue2427;
            break region1181;
        } else {
            regionValue2440 = regionValue2423;
            regionValue2441 = regionValue2424;
            regionValue2442 = regionValue2425;
            regionValue2443 = regionValue2426;
            regionValue2444 = regionValue2428;
            regionValue2445 = regionValue2427;
            break region1171;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2457 = regionValue2440;
        regionValue2458 = regionValue2441;
        regionValue2459 = regionValue2442;
        regionValue2460 = regionValue2443;
        regionValue2461 = regionValue2444;
        regionValue2462 = regionValue2445;
        break region1173;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value2464;
        java.lang.Object value2463;

        value2463 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue2462)))).field_49));
        value2464 = recovery$indy$flow$648();
        if (((java.lang.Object) value2463) == ((java.lang.Object) value2464)) {
            regionValue2123 = regionValue2457;
            regionValue2124 = regionValue2458;
            break region1195;
        } else {
            regionValue2476 = regionValue2457;
            regionValue2477 = regionValue2458;
            regionValue2478 = regionValue2459;
            regionValue2479 = regionValue2460;
            regionValue2480 = regionValue2461;
            break region1176;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2390 = regionValue2476;
        regionValue2391 = regionValue2477;
        regionValue2392 = regionValue2478;
        regionValue2393 = regionValue2479;
        regionValue2394 = regionValue2480;
        break region1178;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2337 = regionValue2390;
        regionValue2338 = regionValue2391;
        regionValue2339 = regionValue2392;
        regionValue2340 = regionValue2393;
        regionValue2341 = regionValue2394;
        regionValue2342 = regionValue2394;
        break region1181;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue2492 = regionValue2337;
            regionValue2493 = regionValue2338;
            regionValue2494 = regionValue2339;
            regionValue2495 = regionValue2340;
            regionValue2496 = regionValue2342;
            break region1187;
        } else {
            regionValue2508 = regionValue2337;
            regionValue2509 = regionValue2338;
            regionValue2510 = regionValue2339;
            regionValue2511 = regionValue2340;
            regionValue2512 = regionValue2341;
            regionValue2513 = regionValue2342;
            break region1183;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue2513 == null) {
            regionValue2525 = regionValue2508;
            regionValue2526 = regionValue2510;
            regionValue2527 = regionValue2511;
            break region1190;
        } else {
            regionValue2539 = regionValue2508;
            regionValue2540 = regionValue2509;
            regionValue2541 = regionValue2510;
            regionValue2542 = regionValue2511;
            regionValue2543 = regionValue2512;
            break region1184;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2555 = regionValue2539;
        regionValue2556 = regionValue2540;
        regionValue2557 = regionValue2541;
        regionValue2558 = regionValue2542;
        regionValue2559 = regionValue2543;
        break region1186;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2492 = regionValue2555;
        regionValue2493 = regionValue2556;
        regionValue2494 = regionValue2557;
        regionValue2495 = regionValue2558;
        regionValue2496 = regionValue2559;
        break region1187;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value2561;
        java.lang.Object value2560;

        value2560 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue2496)))).field_49));
        value2561 = recovery$indy$flow$650();
        if (((java.lang.Object) value2560) == ((java.lang.Object) value2561)) {
            regionValue2123 = regionValue2492;
            regionValue2124 = regionValue2493;
            break region1195;
        } else {
            regionValue2525 = regionValue2492;
            regionValue2526 = regionValue2494;
            regionValue2527 = regionValue2495;
            break region1190;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value2562;
        int incremented2563;

        value2562 = regionValue2527;
        incremented2563 = regionValue2526 + (-1);
        if (value57 != 0) {
            regionValue2201 = regionValue2525;
            regionValue2202 = value2562;
            regionValue2203 = incremented2563;
            continue loop987;
        } else {
            regionValue2123 = regionValue2525;
            regionValue2124 = value2562;
            break region1195;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        }
        try {
        if (value57 != 0) {
            regionValue2308 = regionValue2124;
            break region1433;
        } else {
            regionValue1971 = regionValue2123;
            regionValue1972 = regionValue2124;
            break region1197;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        boolean value2567;
        java.lang.Object value2566;
        java.lang.Object value2564;

        value2564 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingSmooth));
        value2566 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value2564))))));
        value2567 = recovery$indy$flow$653(value2566);
        regionValue1943 = regionValue1971;
        regionValue1944 = regionValue1972;
        regionValue1945 = (int) ((value2567 ? 1 : 0));
        break region1209;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue2575 = regionValue1944;
            regionValue2576 = regionValue1945;
            break region1454;
        } else {
            regionValue2588 = regionValue1943;
            regionValue2589 = regionValue1944;
            break region1211;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue1945 == 0) {
            regionValue2308 = regionValue2589;
            break region1433;
        } else {
            regionValue2602 = regionValue2588;
            regionValue2603 = regionValue2589;
            break region1212;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2615 = regionValue2602;
        regionValue2616 = regionValue2603;
        break region1214;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        int value2619;
        int value2618;
        java.lang.Object value2617;
        int computed2622;
        int computed2621;
        int computed2620;

        value2617 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        value2618 = recovery$indy$flow$655(value2617);
        value2619 = recovery$indy$flow$656(this);
        computed2620 = value2618 - value2619;
        computed2621 = computed2620 - regionValue2615;
        computed2622 = computed2621 - 1;
        regionValue2635 = regionValue2616;
        regionValue2636 = computed2622;
        break region1225;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        loop1225: while (true) {
        java.lang.Object regionValue2945;
        int regionValue2944;

        region1428: {
        java.lang.Object regionValue2916;
        java.lang.Object regionValue2915;
        int regionValue2914;
        java.lang.Object regionValue2913;

        region1425: {
        java.lang.Object regionValue2975;
        java.lang.Object regionValue2974;
        int regionValue2973;
        java.lang.Object regionValue2972;

        region1424: {
        java.lang.Object regionValue2960;
        java.lang.Object regionValue2959;
        int regionValue2958;
        java.lang.Object regionValue2957;

        region1422: {
        java.lang.Object regionValue2930;
        int regionValue2929;
        java.lang.Object regionValue2932;
        java.lang.Object regionValue2931;
        java.lang.Object regionValue2928;

        region1421: {
        java.lang.Object regionValue2771;
        java.lang.Object regionValue2769;
        int regionValue2768;
        java.lang.Object regionValue2767;
        java.lang.Object regionValue2770;

        region1419: {
        java.lang.Object regionValue2820;
        java.lang.Object regionValue2819;
        int regionValue2818;
        java.lang.Object regionValue2817;

        region1416: {
        java.lang.Object regionValue2901;
        java.lang.Object regionValue2900;
        int regionValue2899;
        java.lang.Object regionValue2898;

        region1414: {
        java.lang.Object regionValue2880;
        java.lang.Object regionValue2884;
        java.lang.Object regionValue2883;
        java.lang.Object regionValue2882;
        int regionValue2881;

        region1411: {
        java.lang.Object regionValue2868;
        java.lang.Object regionValue2867;
        java.lang.Object regionValue2866;
        int regionValue2865;
        java.lang.Object regionValue2864;

        region1409: {
        java.lang.Object regionValue2852;
        java.lang.Object regionValue2851;
        java.lang.Object regionValue2850;
        int regionValue2849;
        java.lang.Object regionValue2848;

        region1406: {
        java.lang.Object regionValue2836;
        java.lang.Object regionValue2835;
        java.lang.Object regionValue2834;
        int regionValue2833;
        java.lang.Object regionValue2832;

        region1404: {
        java.lang.Object regionValue2804;
        java.lang.Object regionValue2802;
        int regionValue2801;
        java.lang.Object regionValue2800;
        java.lang.Object regionValue2805;
        java.lang.Object regionValue2803;

        region1403: {
        java.lang.Object regionValue2788;
        java.lang.Object regionValue2787;
        java.lang.Object regionValue2786;
        java.lang.Object regionValue2785;
        int regionValue2784;
        java.lang.Object regionValue2783;

        region1401: {
        java.lang.Object regionValue2754;
        java.lang.Object regionValue2755;
        java.lang.Object regionValue2753;
        int regionValue2752;
        java.lang.Object regionValue2751;

        region1398: {
        int regionValue2649;
        java.lang.Object regionValue2648;

        region1227: {
        try {
        if (regionValue2636 <= 0) {
            regionValue2308 = regionValue2635;
            break region1433;
        } else {
            regionValue2648 = regionValue2635;
            regionValue2649 = regionValue2636;
            break region1227;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value2656;
        java.lang.Object value2676;
        java.lang.Object value2731;
        java.lang.Object value2730;
        float value2729;
        float value2728;
        double value2726;
        double value2724;
        double value2723;
        double value2721;
        java.lang.Object value2720;
        java.lang.Object value2719;
        java.lang.Object value2718;
        java.lang.Object value2717;
        double value2715;
        java.lang.Object value2714;
        java.lang.Object value2713;
        java.lang.Object value2712;
        java.lang.Object value2711;
        double value2709;
        java.lang.Object value2708;
        java.lang.Object value2707;
        java.lang.Object value2706;
        java.lang.Object value2705;
        double value2704;
        java.lang.Object value2703;
        java.lang.Object value2702;
        java.lang.Object value2701;
        java.lang.Object value2700;
        java.lang.Object value2699;
        java.lang.Object value2698;
        java.lang.Object value2697;
        java.lang.Object value2696;
        java.lang.Object value2695;
        java.lang.Object value2694;
        float value2693;
        float value2692;
        double value2690;
        double value2688;
        double value2687;
        double value2685;
        java.lang.Object value2684;
        java.lang.Object value2683;
        java.lang.Object value2682;
        java.lang.Object value2681;
        java.lang.Object value2680;
        java.lang.Object value2679;
        java.lang.Object value2678;
        java.lang.Object value2677;
        java.lang.Object value2675;
        java.lang.Object value2674;
        double value2672;
        double value2670;
        double value2669;
        double value2667;
        float value2664;
        java.lang.Object value2663;
        java.lang.Object value2662;
        java.lang.Object value2661;
        java.lang.Object value2660;
        double value2659;
        double value2657;
        java.lang.Object value2655;
        java.lang.Object value2654;
        java.lang.Object value2653;
        java.lang.Object value2652;
        java.lang.Object value2651;
        java.lang.Object value2650;
        net.C_47tf initialized2716;
        double converted2665;
        double computed2727;
        double computed2725;
        double computed2722;
        double computed2710;
        double computed2691;
        double computed2689;
        double computed2686;
        double computed2668;
        double computed2666;
        double computed2658;

        value2650 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_43h));
        value2651 = recovery$indy$flow$658(value2650, regionValue2649);
        value2652 = ((java.lang.Object)(((net.C_47pN) (((java.lang.Object)(value2651))))));
        value2653 = value2652;
        value2654 = recovery$indy$flow$660(value2653, -4304790611891254499L, computed3);
        value2655 = recovery$indy$flow$661(value2654, computed7, -4304434752675623119L, computed3);
        value2656 = value2655;
        value2657 = recovery$indy$flow$662(value2656);
        computed2658 = value2657 + Double.longBitsToDouble(4602678819172646912L);
        value2659 = recovery$indy$flow$663(value2656);
        value2660 = recovery$indy$flow$664();
        value2661 = value2660;
        value2662 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2661))))));
        value2663 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2662)))).field_42P));
        value2664 = recovery$indy$flow$667(value2663);
        converted2665 = (double) (value2664);
        computed2666 = value2659 + converted2665;
        value2667 = recovery$indy$flow$668(value2656);
        computed2668 = value2667 + Double.longBitsToDouble(4602678819172646912L);
        value2669 = computed2668;
        value2670 = computed2666;
        value2672 = computed2658;
        value2674 = ((java.lang.Object)(((net.C_47Ol) (((java.lang.Object)(this))))));
        value2675 = recovery$indy$flow$670(value2674, value2672, computed45, value2670, value2669);
        value2676 = value2675;
        value2677 = recovery$indy$flow$671();
        value2678 = value2677;
        value2679 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2678))))));
        value2680 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2679)))).field_42P));
        value2681 = recovery$indy$flow$674();
        value2682 = value2681;
        value2683 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2682))))));
        value2684 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2683)))).field_42P));
        value2685 = recovery$indy$flow$677(value2656);
        computed2686 = value2685 + Double.longBitsToDouble(4602678819172646912L);
        value2687 = recovery$indy$flow$678(value1020);
        value2688 = recovery$indy$flow$679(value2656);
        computed2689 = value2688 + Double.longBitsToDouble(4602678819172646912L);
        value2690 = recovery$indy$flow$680(value2684, computed2686, value2687, computed2689);
        computed2691 = value2690 + Double.longBitsToDouble(4596373779694328218L);
        value2692 = recovery$indy$flow$681(value2676);
        value2693 = recovery$indy$flow$682(value2676);
        value2694 = recovery$indy$flow$683(value2680, computed2691, 1.0F, value2692, value2693);
        value2695 = value2694;
        value2696 = recovery$indy$flow$684();
        value2697 = value2696;
        value2698 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2697))))));
        value2699 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2698)))).field_42P));
        value2700 = recovery$indy$flow$688();
        value2701 = value2700;
        value2702 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2701))))));
        value2703 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2702)))).field_42P));
        value2704 = recovery$indy$flow$691(value2703);
        value2705 = recovery$indy$flow$692();
        value2706 = value2705;
        value2707 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2706))))));
        value2708 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2707)))).field_42P));
        value2709 = recovery$indy$flow$695(value2708);
        computed2710 = value2709 + Double.longBitsToDouble(4591870180066957722L);
        value2711 = recovery$indy$flow$696();
        value2712 = value2711;
        value2713 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2712))))));
        value2714 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2713)))).field_42P));
        value2715 = recovery$indy$flow$699(value2714);
        initialized2716 = new net.C_47tf(value2704, computed2710, value2715);
        value2717 = recovery$indy$flow$701();
        value2718 = value2717;
        value2719 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2718))))));
        value2720 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2719)))).field_42P));
        value2721 = recovery$indy$flow$704(value2656);
        computed2722 = value2721 + Double.longBitsToDouble(4602678819172646912L);
        value2723 = recovery$indy$flow$705(value1020);
        value2724 = recovery$indy$flow$706(value2656);
        computed2725 = value2724 + Double.longBitsToDouble(4602678819172646912L);
        value2726 = recovery$indy$flow$707(value2720, computed2722, value2723, computed2725);
        computed2727 = value2726 + Double.longBitsToDouble(4596373779694328218L);
        value2728 = recovery$indy$flow$708(value2676);
        value2729 = recovery$indy$flow$709(value2676);
        value2730 = recovery$indy$flow$710(value2699, initialized2716, computed2727, 1.0F, value2728, value2729);
        value2731 = value2730;
        if (value57 == 0) {
            regionValue2739 = regionValue2648;
            break region1566;
        } else {
            regionValue2751 = regionValue2648;
            regionValue2752 = regionValue2649;
            regionValue2753 = value2656;
            regionValue2754 = value2695;
            regionValue2755 = value2731;
            break region1398;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue2767 = regionValue2751;
            regionValue2768 = regionValue2752;
            regionValue2769 = regionValue2753;
            regionValue2770 = regionValue2755;
            regionValue2771 = regionValue2754;
            break region1419;
        } else {
            regionValue2783 = regionValue2751;
            regionValue2784 = regionValue2752;
            regionValue2785 = regionValue2753;
            regionValue2786 = regionValue2754;
            regionValue2787 = regionValue2755;
            regionValue2788 = regionValue2754;
            break region1401;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2800 = regionValue2783;
        regionValue2801 = regionValue2784;
        regionValue2802 = regionValue2785;
        regionValue2803 = regionValue2786;
        regionValue2804 = regionValue2787;
        regionValue2805 = regionValue2788;
        break region1403;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue2805 == null) {
            regionValue2817 = regionValue2800;
            regionValue2818 = regionValue2801;
            regionValue2819 = regionValue2802;
            regionValue2820 = regionValue2804;
            break region1416;
        } else {
            regionValue2832 = regionValue2800;
            regionValue2833 = regionValue2801;
            regionValue2834 = regionValue2802;
            regionValue2835 = regionValue2803;
            regionValue2836 = regionValue2804;
            break region1404;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2848 = regionValue2832;
        regionValue2849 = regionValue2833;
        regionValue2850 = regionValue2834;
        regionValue2851 = regionValue2835;
        regionValue2852 = regionValue2836;
        break region1406;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue2767 = regionValue2848;
            regionValue2768 = regionValue2849;
            regionValue2769 = regionValue2850;
            regionValue2770 = regionValue2852;
            regionValue2771 = regionValue2851;
            break region1419;
        } else {
            regionValue2864 = regionValue2848;
            regionValue2865 = regionValue2849;
            regionValue2866 = regionValue2850;
            regionValue2867 = regionValue2852;
            regionValue2868 = regionValue2851;
            break region1409;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2880 = regionValue2864;
        regionValue2881 = regionValue2865;
        regionValue2882 = regionValue2866;
        regionValue2883 = regionValue2867;
        regionValue2884 = regionValue2868;
        break region1411;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value2886;
        java.lang.Object value2885;

        value2885 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue2884)))).field_49));
        value2886 = recovery$indy$flow$712();
        if (((java.lang.Object) value2885) == ((java.lang.Object) value2886)) {
            regionValue2308 = regionValue2880;
            break region1433;
        } else {
            regionValue2898 = regionValue2880;
            regionValue2899 = regionValue2881;
            regionValue2900 = regionValue2882;
            regionValue2901 = regionValue2883;
            break region1414;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2817 = regionValue2898;
        regionValue2818 = regionValue2899;
        regionValue2819 = regionValue2900;
        regionValue2820 = regionValue2901;
        break region1416;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2767 = regionValue2817;
        regionValue2768 = regionValue2818;
        regionValue2769 = regionValue2819;
        regionValue2770 = regionValue2820;
        regionValue2771 = regionValue2820;
        break region1419;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue2913 = regionValue2767;
            regionValue2914 = regionValue2768;
            regionValue2915 = regionValue2769;
            regionValue2916 = regionValue2771;
            break region1425;
        } else {
            regionValue2928 = regionValue2767;
            regionValue2929 = regionValue2768;
            regionValue2930 = regionValue2769;
            regionValue2931 = regionValue2770;
            regionValue2932 = regionValue2771;
            break region1421;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue2932 == null) {
            regionValue2944 = regionValue2929;
            regionValue2945 = regionValue2930;
            break region1428;
        } else {
            regionValue2957 = regionValue2928;
            regionValue2958 = regionValue2929;
            regionValue2959 = regionValue2930;
            regionValue2960 = regionValue2931;
            break region1422;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2972 = regionValue2957;
        regionValue2973 = regionValue2958;
        regionValue2974 = regionValue2959;
        regionValue2975 = regionValue2960;
        break region1424;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue2913 = regionValue2972;
        regionValue2914 = regionValue2973;
        regionValue2915 = regionValue2974;
        regionValue2916 = regionValue2975;
        break region1425;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value2977;
        java.lang.Object value2976;

        value2976 = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(regionValue2916)))).field_49));
        value2977 = recovery$indy$flow$714();
        if (((java.lang.Object) value2976) == ((java.lang.Object) value2977)) {
            regionValue2308 = regionValue2913;
            break region1433;
        } else {
            regionValue2944 = regionValue2914;
            regionValue2945 = regionValue2915;
            break region1428;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value2978;
        int incremented2979;

        value2978 = regionValue2945;
        incremented2979 = regionValue2944 + (-1);
        if (value57 != 0) {
            regionValue2635 = value2978;
            regionValue2636 = incremented2979;
            continue loop1225;
        } else {
            regionValue2308 = value2978;
            break region1433;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        }
        try {
        boolean value2986;
        java.lang.Object value2984;
        java.lang.Object value2983;
        java.lang.Object value2980;
        long computed2985;

        value2980 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingMovementmode));
        value2983 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value2980))))));
        value2984 = recovery$indy$flow$717(value2983, computed25);
        computed2985 = 3815452772860741967L ^ computed3;
        value2986 = recovery$indy$flow$718(value2984, "rotation");
        regionValue2575 = regionValue2308;
        regionValue2576 = (int) ((value2986 ? 1 : 0));
        break region1454;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue2994 = regionValue2575;
            regionValue2995 = regionValue2576;
            break region1587;
        } else {
            regionValue3003 = regionValue2575;
            break region1456;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue2576 == 0) {
            regionValue2739 = regionValue3003;
            break region1566;
        } else {
            regionValue3012 = regionValue3003;
            break region1457;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3020 = regionValue3012;
        break region1459;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value3054;
        long value3068;
        java.lang.Object value3067;
        java.lang.Object value3066;
        java.lang.Object value3065;
        int value3061;
        java.lang.Object value3059;
        java.lang.Object value3058;
        java.lang.Object value3056;
        java.lang.Object value3053;
        double value3046;
        java.lang.Object value3045;
        double value3039;
        double value3036;
        java.lang.Object value3035;
        java.lang.Object value3034;
        java.lang.Object value3032;
        double value3030;
        double value3027;
        java.lang.Object value3026;
        java.lang.Object value3025;
        java.lang.Object value3023;
        double value3021;
        float converted3047;
        float converted3043;
        double computed3042;
        double computed3041;
        double computed3040;
        double computed3037;
        double computed3031;
        double computed3028;
        double computed3022;

        value3021 = recovery$indy$flow$719(regionValue3020);
        computed3022 = value3021 + Double.longBitsToDouble(4602678819172646912L);
        value3023 = recovery$indy$flow$720();
        value3025 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3023))))));
        value3026 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3025)))).field_42P));
        value3027 = recovery$indy$flow$723(value3026);
        computed3028 = computed3022 - value3027;
        value3030 = recovery$indy$flow$724(regionValue3020);
        computed3031 = value3030 + Double.longBitsToDouble(4602678819172646912L);
        value3032 = recovery$indy$flow$725();
        value3034 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3032))))));
        value3035 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3034)))).field_42P));
        value3036 = recovery$indy$flow$728(value3035);
        computed3037 = computed3031 - value3036;
        value3039 = recovery$indy$flow$729(computed3037, computed3028);
        computed3040 = value3039 * Double.longBitsToDouble(4640537203540230144L);
        computed3041 = computed3040 / Double.longBitsToDouble(4614256656552045848L);
        computed3042 = computed3041 - Double.longBitsToDouble(4636033603912859648L);
        converted3043 = (float) (computed3042);
        value3045 = recovery$indy$flow$730();
        value3046 = recovery$indy$flow$731(value3045, Double.longBitsToDouble(-4616189618054758400L), 1.0D);
        converted3047 = (float) (value3046);
        value3053 = ((java.lang.Object)(((net.C_47Ol) (((java.lang.Object)(this))))));
        value3054 = recovery$indy$flow$733(value3053, converted3043, computed49, converted3047);
        value3056 = recovery$indy$flow$734();
        value3058 = ((java.lang.Object)(((net.C_477r) (((java.lang.Object)(value3054))))));
        value3059 = recovery$indy$flow$736(value3058);
        value3061 = -10000;
        value3065 = ((java.lang.Object)(((net.C_47S6) (((java.lang.Object)(value3056))))));
        value3066 = recovery$indy$flow$738(value3059);
        value3067 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this))))));
        recovery$indy$flow$740(value3065, value3066, computed47, value3061, value3067);
        value3068 = recovery$indy$flow$741();
        recovery$indy$flow$742(this, value3068);
        recovery$indy$flow$743(this, value3054);
        if (value57 != 0) {
            break region1905;
        } else {
            regionValue2739 = regionValue3020;
            break region1566;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (value57 == 0) {
            regionValue3075 = regionValue2739;
            break region1697;
        } else {
            regionValue3084 = regionValue2739;
            break region1569;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3093 = regionValue3084;
        break region1571;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        double value3099;
        java.lang.Object value3098;
        java.lang.Object value3095;
        int comparison3100;

        value3095 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingRotationUpdateTicks));
        value3098 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value3095))))));
        value3099 = recovery$indy$flow$746(value3098, computed43);
        comparison3100 = (java.lang.Double.isNaN(value3099) || java.lang.Double.isNaN(0.0D) ? -1 : (value3099 > 0.0D ? 1 : value3099 == 0.0D ? 0 : -1));
        regionValue2994 = regionValue3093;
        regionValue2995 = comparison3100;
        break region1587;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue2995 <= 0) {
            regionValue3107 = regionValue2994;
            break region1696;
        } else {
            regionValue3115 = regionValue2994;
            break region1588;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        double value3126;
        java.lang.Object value3125;
        java.lang.Object value3122;
        int value3120;
        java.lang.Object value3119;
        java.lang.Object value3118;
        java.lang.Object value3116;
        double converted3121;

        value3116 = recovery$indy$flow$747();
        value3118 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3116))))));
        value3119 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3118)))).field_42P));
        value3120 = recovery$indy$flow$750(value3119);
        converted3121 = (double) (value3120);
        value3122 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingRotationUpdateTicks));
        value3125 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value3122))))));
        value3126 = recovery$indy$flow$753(value3125, computed43);
        computed3127 = converted3121 % value3126;
        if (value57 == 0) {
            regionValue3135 = regionValue3115;
            regionValue3136 = computed3127;
            regionValue3137 = 0.0D;
            break region1638;
        } else {
            regionValue3145 = regionValue3115;
            regionValue3147 = 0.0D;
            break region1616;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3155 = regionValue3145;
        break region1618;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        int comparison3158;

        comparison3158 = (java.lang.Double.isNaN(computed3127) || java.lang.Double.isNaN(regionValue3147) ? -1 : (computed3127 > regionValue3147 ? 1 : computed3127 == regionValue3147 ? 0 : -1));
        if (comparison3158 != 0) {
            regionValue3107 = regionValue3155;
            break region1696;
        } else {
            regionValue3166 = regionValue3155;
            break region1620;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3174 = regionValue3166;
        break region1622;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        double value3181;
        java.lang.Object value3180;
        java.lang.Object value3179;
        java.lang.Object value3177;
        double value3175;
        double computed3176;

        value3175 = recovery$indy$flow$754(regionValue3174);
        computed3176 = value3175 + Double.longBitsToDouble(4602678819172646912L);
        value3177 = recovery$indy$flow$755();
        value3179 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3177))))));
        value3180 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3179)))).field_42P));
        value3181 = recovery$indy$flow$758(value3180);
        regionValue3135 = regionValue3174;
        regionValue3136 = computed3176;
        regionValue3137 = value3181;
        break region1638;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        long value3209;
        java.lang.Object value3208;
        java.lang.Object value3207;
        double value3200;
        java.lang.Object value3199;
        double value3193;
        double value3190;
        java.lang.Object value3189;
        java.lang.Object value3188;
        java.lang.Object value3186;
        double value3184;
        float converted3201;
        float converted3197;
        double computed3196;
        double computed3195;
        double computed3194;
        double computed3191;
        double computed3185;
        double computed3182;

        computed3182 = regionValue3136 - regionValue3137;
        value3184 = recovery$indy$flow$759(regionValue3135);
        computed3185 = value3184 + Double.longBitsToDouble(4602678819172646912L);
        value3186 = recovery$indy$flow$760();
        value3188 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3186))))));
        value3189 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3188)))).field_42P));
        value3190 = recovery$indy$flow$763(value3189);
        computed3191 = computed3185 - value3190;
        value3193 = recovery$indy$flow$764(computed3191, computed3182);
        computed3194 = value3193 * Double.longBitsToDouble(4640537203540230144L);
        computed3195 = computed3194 / Double.longBitsToDouble(4614256656552045848L);
        computed3196 = computed3195 - Double.longBitsToDouble(4636033603912859648L);
        converted3197 = (float) (computed3196);
        value3199 = recovery$indy$flow$765();
        value3200 = recovery$indy$flow$766(value3199, Double.longBitsToDouble(-4616189618054758400L), 1.0D);
        converted3201 = (float) (value3200);
        value3207 = ((java.lang.Object)(((net.C_47Ol) (((java.lang.Object)(this))))));
        value3208 = recovery$indy$flow$768(value3207, converted3197, computed49, converted3201);
        recovery$indy$flow$769(this, value3208);
        value3209 = recovery$indy$flow$770();
        recovery$indy$flow$771(this, value3209);
        regionValue3107 = regionValue3135;
        break region1696;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3075 = regionValue3107;
        break region1697;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value3210;

        value3210 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_47_));
        if (value3210 == null) {
            regionValue3215 = regionValue3075;
            break region1781;
        } else {
            regionValue3222 = regionValue3075;
            break region1699;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        long computed3225;
        long value3224;
        long value3223;

        value3223 = recovery$indy$flow$773();
        value3224 = recovery$indy$flow$774(this);
        computed3225 = value3223 - value3224;
        comparison3226 = (computed3225 > 100L ? 1 : computed3225 == 100L ? 0 : -1);
        if (value57 == 0) {
            regionValue3232 = regionValue3222;
            regionValue3233 = comparison3226;
            break region1739;
        } else {
            regionValue3240 = regionValue3222;
            break region1707;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3248 = regionValue3240;
        break region1709;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (comparison3226 >= 0) {
            regionValue3215 = regionValue3248;
            break region1781;
        } else {
            regionValue3256 = regionValue3248;
            break region1710;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3263 = regionValue3256;
        break region1712;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        double value3272;
        java.lang.Object value3271;
        java.lang.Object value3268;
        long value3265;
        long value3264;
        long computed3266;

        value3264 = recovery$indy$flow$775();
        value3265 = recovery$indy$flow$776(this);
        computed3266 = value3264 - value3265;
        converted3267 = (double) (computed3266);
        value3268 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingRotationUpdateTicks));
        value3271 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(value3268))))));
        value3272 = recovery$indy$flow$779(value3271, computed43);
        computed3273 = value3272 * Double.longBitsToDouble(4632233691727265792L);
        if (value57 == 0) {
            regionValue3278 = regionValue3263;
            regionValue3279 = converted3267;
            regionValue3280 = computed3273;
            break region1795;
        } else {
            regionValue3286 = regionValue3263;
            break region1734;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3294 = regionValue3286;
        break region1736;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        int comparison3297;

        comparison3297 = (java.lang.Double.isNaN(converted3267) || java.lang.Double.isNaN(computed3273) ? 1 : (converted3267 > computed3273 ? 1 : converted3267 == computed3273 ? 0 : -1));
        regionValue3232 = regionValue3294;
        regionValue3233 = comparison3297;
        break region1739;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (regionValue3233 >= 0) {
            regionValue3215 = regionValue3232;
            break region1781;
        } else {
            regionValue3303 = regionValue3232;
            break region1740;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        java.lang.Object value3318;
        long value3317;
        java.lang.Object value3316;
        java.lang.Object value3315;
        java.lang.Object value3314;
        int value3310;
        java.lang.Object value3308;
        java.lang.Object value3307;
        java.lang.Object value3305;
        java.lang.Object value3304;

        value3304 = recovery$indy$flow$780();
        value3305 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_47_));
        value3307 = ((java.lang.Object)(((net.C_477r) (((java.lang.Object)(value3305))))));
        value3308 = recovery$indy$flow$783(value3307);
        value3310 = -10000;
        value3314 = ((java.lang.Object)(((net.C_47S6) (((java.lang.Object)(value3304))))));
        value3315 = recovery$indy$flow$785(value3308);
        value3316 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this))))));
        recovery$indy$flow$787(value3314, value3315, computed47, value3310, value3316);
        value3317 = recovery$indy$flow$788();
        recovery$indy$flow$789(this, value3317);
        value3318 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_47_));
        recovery$indy$flow$791(this, value3318);
        regionValue3215 = regionValue3303;
        break region1781;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        double value3325;
        java.lang.Object value3324;
        java.lang.Object value3323;
        java.lang.Object value3321;
        double value3319;
        double computed3320;

        value3319 = recovery$indy$flow$792(regionValue3215);
        computed3320 = value3319 + Double.longBitsToDouble(4602678819172646912L);
        value3321 = recovery$indy$flow$793();
        value3323 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3321))))));
        value3324 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3323)))).field_42P));
        value3325 = recovery$indy$flow$796(value3324);
        regionValue3278 = regionValue3215;
        regionValue3279 = computed3320;
        regionValue3280 = value3325;
        break region1795;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        double value3355;
        double value3350;
        java.lang.Object value3354;
        java.lang.Object value3353;
        java.lang.Object value3351;
        long value3349;
        java.lang.Object value3348;
        float value3347;
        java.lang.Object value3346;
        java.lang.Object value3345;
        java.lang.Object value3343;
        double value3337;
        double value3334;
        java.lang.Object value3333;
        java.lang.Object value3332;
        java.lang.Object value3330;
        double value3328;
        double computed3340;
        double computed3339;
        double computed3338;
        double computed3335;
        double computed3329;
        double computed3326;

        computed3326 = regionValue3279 - regionValue3280;
        value3328 = recovery$indy$flow$797(regionValue3278);
        computed3329 = value3328 + Double.longBitsToDouble(4602678819172646912L);
        value3330 = recovery$indy$flow$798();
        value3332 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3330))))));
        value3333 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3332)))).field_42P));
        value3334 = recovery$indy$flow$801(value3333);
        computed3335 = computed3329 - value3334;
        value3337 = recovery$indy$flow$802(computed3335, computed3326);
        computed3338 = value3337 * Double.longBitsToDouble(4640537203540230144L);
        computed3339 = computed3338 / Double.longBitsToDouble(4614256656552045848L);
        computed3340 = computed3339 - Double.longBitsToDouble(4636033603912859648L);
        converted3341 = (float) (computed3340);
        value3343 = recovery$indy$flow$803();
        value3345 = ((java.lang.Object)(((net.C_47S6) (((java.lang.Object)(value3343))))));
        value3346 = recovery$indy$flow$805(value3345);
        value3347 = recovery$indy$flow$806(value3346);
        value3348 = recovery$indy$flow$807(value3347, converted3341, computed9);
        recovery$indy$flow$808(this, value3348);
        value3349 = recovery$indy$flow$809();
        recovery$indy$flow$810(this, value3349);
        value3350 = recovery$indy$flow$811(regionValue3278);
        value3351 = recovery$indy$flow$812();
        value3353 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3351))))));
        value3354 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3353)))).field_42P));
        value3355 = recovery$indy$flow$815(value3354);
        comparison3356 = (java.lang.Double.isNaN(value3350) || java.lang.Double.isNaN(value3355) ? -1 : (value3350 > value3355 ? 1 : value3350 == value3355 ? 0 : -1));
        if (value57 == 0) {
            regionValue3362 = comparison3356;
            break region1866;
        } else {
            break region1862;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (comparison3356 <= 0) {
            break region1867;
        } else {
            break region1863;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region1865;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3362 = 1;
        break region1866;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3389 = regionValue3362;
        break region1868;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3389 = 0;
        break region1868;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        float value3399;
        float value3397;
        float value3395;
        float value3394;
        java.lang.Object value3393;
        java.lang.Object value3392;
        java.lang.Object value3390;
        float computed3398;
        float computed3396;

        recovery$indy$flow$816(this, ((regionValue3389 & 1) != 0));
        value3390 = recovery$indy$flow$817();
        value3392 = ((java.lang.Object)(((net.C_47S6) (((java.lang.Object)(value3390))))));
        value3393 = recovery$indy$flow$819(value3392);
        value3394 = recovery$indy$flow$820(value3393);
        value3395 = recovery$indy$flow$821(value3394);
        computed3396 = value3395 + Float.intBitsToFloat(1127481344);
        value3397 = recovery$indy$flow$822(converted3341);
        computed3398 = value3397 + Float.intBitsToFloat(1127481344);
        value3399 = recovery$indy$flow$823(computed3396, computed3398);
        comparison3401 = (java.lang.Float.isNaN(value3399) || java.lang.Float.isNaN(Float.intBitsToFloat(1110704128)) ? 1 : (value3399 > Float.intBitsToFloat(1110704128) ? 1 : value3399 == Float.intBitsToFloat(1110704128) ? 0 : -1));
        if (value57 == 0) {
            regionValue3403 = comparison3401;
            break region1902;
        } else {
            break region1898;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        if (comparison3401 > 0) {
            break region1903;
        } else {
            break region1899;
        }
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        break region1901;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3403 = 1;
        break region1902;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3410 = regionValue3403;
        break region1904;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        regionValue3410 = 0;
        break region1904;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        try {
        recovery$indy$flow$824(this, ((regionValue3410 & 1) != 0));
        break region1905;
        } catch (java.lang.Exception ignoredFailure) { return; }
        }
        break region1907;
        }
        return;
    }


















   private boolean method_46G$0dd78e0064(long var1) {
      var1 = b ^ var1;
      boolean var3 = recovery$indy$53(-7404442236627915600L, var1);
      if (recovery$indy$54(field_43, -7410566096431345138L, var1).method_43$1c5515a899(C_47oY.field_46X) != null) {
         boolean var10000 = recovery$indy$55(this.settingStopWhileSlowness, -7411786972431447979L, var1);
         if (var3) {
            return var10000;
         }

         if (var10000) {
            return true;
         }
      }

      return false;
   }



    public AutoWalk_47Cb(long a0) {
        super((java.lang.String) ("AutoWalk"),(java.lang.String) ("AutoLaufen"),(long) (((augustus.recovered.modules.movement.AutoWalk_47Cb.b ^ a0) ^ 37174711356600L)),(java.awt.Color) (java.awt.Color.red),(client.module.Category) (client.module.Category.MOVEMENT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.movement.AutoWalk_47Cb.b ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.movement.AutoWalk_47Cb.b ^ a0) ^ 135021611614426L);
        long constructorKey4 = ((augustus.recovered.modules.movement.AutoWalk_47Cb.b ^ a0) ^ 56925178610698L);
        int constructorPart5 = (int) ((((augustus.recovered.modules.movement.AutoWalk_47Cb.b ^ a0) ^ 11065051665035L) >>> 32));
        int constructorPart6 = (int) (((((augustus.recovered.modules.movement.AutoWalk_47Cb.b ^ a0) ^ 11065051665035L) << 32) >>> 48));
        int constructorPart7 = (int) (((((augustus.recovered.modules.movement.AutoWalk_47Cb.b ^ a0) ^ 11065051665035L) << 48) >>> 48));
        long constructorKey8 = ((augustus.recovered.modules.movement.AutoWalk_47Cb.b ^ a0) ^ 96749557879042L);
        long constructorKey9 = ((augustus.recovered.modules.movement.AutoWalk_47Cb.b ^ a0) ^ 570745814497L);
        long constructorKey10 = ((augustus.recovered.modules.movement.AutoWalk_47Cb.b ^ a0) ^ 54686741476162L);
        long constructorKey11 = ((augustus.recovered.modules.movement.AutoWalk_47Cb.b ^ a0) ^ 63859483726135L);
        long constructorKey12 = ((augustus.recovered.modules.movement.AutoWalk_47Cb.b ^ a0) ^ 25616301420208L);
        client.setting.BooleanSetting initialized13 = new client.setting.BooleanSetting(this, constructorKey11, "PathFinding", false);
        recovery$indy$flow$835(this, initialized13);
        boolean initialValue14 = recovery$indy$flow$836();
        client.setting.BooleanSetting initialized15 = new client.setting.BooleanSetting(this, constructorKey11, "DebugLine", true);
        java.lang.Object initialValue16 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingPathFinding));
        java.lang.Object initialValue17 = recovery$indy$flow$840(initialValue16);
        java.lang.Object initialValue18 = recovery$indy$flow$841(initialValue16);
        java.lang.Object initialValue19 = initialValue18;
        long initialValue20 = constructorKey4;
        client.setting.BooleanSetting initialValue21 = initialized15;
        java.lang.Object initialValue22 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue21))))));
        java.lang.Object initialValue23 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue24 = recovery$indy$flow$844(initialValue22, initialValue20, initialValue23);
        java.lang.Object initialValue25 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue24))))));
        recovery$indy$flow$846(this, initialValue25);
        client.setting.NumberSetting initialized26 = new client.setting.NumberSetting(this, "Distance", Double.longBitsToDouble(4632233691727265792L), constructorKey12, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4632233691727265792L), 1);
        java.lang.Object initialValue27 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingPathFinding));
        java.lang.Object initialValue28 = recovery$indy$flow$850(initialValue27);
        java.lang.Object initialValue29 = recovery$indy$flow$851(initialValue27);
        java.lang.Object initialValue30 = initialValue29;
        client.setting.NumberSetting initialValue31 = initialized26;
        java.lang.Object initialValue32 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue33 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue34 = recovery$indy$flow$854(initialValue32, initialValue33);
        recovery$indy$flow$855(this, initialValue34);
        client.setting.NumberSetting initialized35 = new client.setting.NumberSetting(this, "MaxSearchTime", Double.longBitsToDouble(4632233691727265792L), constructorKey12, Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4652007308841189376L), 0);
        java.lang.Object initialValue36 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingPathFinding));
        java.lang.Object initialValue37 = recovery$indy$flow$859(initialValue36);
        java.lang.Object initialValue38 = recovery$indy$flow$860(initialValue36);
        java.lang.Object initialValue39 = initialValue38;
        client.setting.NumberSetting initialValue40 = initialized35;
        java.lang.Object initialValue41 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue42 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue39))))));
        java.lang.Object initialValue43 = recovery$indy$flow$863(initialValue41, initialValue42);
        recovery$indy$flow$864(this, initialValue43);
        client.setting.NumberSetting initialized44 = new client.setting.NumberSetting(this, "UpdateTicks", 1.0D, constructorKey12, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue45 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingPathFinding));
        java.lang.Object initialValue46 = recovery$indy$flow$868(initialValue45);
        java.lang.Object initialValue47 = recovery$indy$flow$869(initialValue45);
        java.lang.Object initialValue48 = initialValue47;
        client.setting.NumberSetting initialValue49 = initialized44;
        java.lang.Object initialValue50 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue51 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue48))))));
        java.lang.Object initialValue52 = recovery$indy$flow$872(initialValue50, initialValue51);
        recovery$indy$flow$873(this, initialValue52);
        client.setting.BooleanSetting initialized53 = new client.setting.BooleanSetting(this, constructorKey11, "Smooth", true);
        java.lang.Object initialValue54 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingPathFinding));
        java.lang.Object initialValue55 = recovery$indy$flow$877(initialValue54);
        java.lang.Object initialValue56 = recovery$indy$flow$878(initialValue54);
        java.lang.Object initialValue57 = initialValue56;
        long initialValue58 = constructorKey4;
        client.setting.BooleanSetting initialValue59 = initialized53;
        java.lang.Object initialValue60 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue59))))));
        java.lang.Object initialValue61 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue62 = recovery$indy$flow$881(initialValue60, initialValue58, initialValue61);
        java.lang.Object initialValue63 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue62))))));
        recovery$indy$flow$883(this, initialValue63);
        client.setting.BooleanSetting initialized64 = new client.setting.BooleanSetting(this, constructorKey11, "KeepRotation", true);
        java.lang.Object initialValue65 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingPathFinding));
        java.lang.Object initialValue66 = recovery$indy$flow$887(initialValue65);
        java.lang.Object initialValue67 = recovery$indy$flow$888(initialValue65);
        java.lang.Object initialValue68 = initialValue67;
        long initialValue69 = constructorKey4;
        client.setting.BooleanSetting initialValue70 = initialized64;
        java.lang.Object initialValue71 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue70))))));
        java.lang.Object initialValue72 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue68))))));
        java.lang.Object initialValue73 = recovery$indy$flow$891(initialValue71, initialValue69, initialValue72);
        java.lang.Object initialValue74 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue73))))));
        recovery$indy$flow$893(this, initialValue74);
        int initialValue75 = (int) ((initialValue14 ? 1 : 0));
        java.lang.Object initialValue76 = recovery$indy$flow$895(2);
        ((java.lang.Object[]) initialValue76)[0] = "Rotation";
        ((java.lang.Object[]) initialValue76)[1] = "Silent";
        client.setting.ModeSetting initialized77 = new client.setting.ModeSetting(this, "Movementmode", constructorKey9, "Rotation", (java.lang.String[]) (initialValue76));
        java.lang.Object initialValue78 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingPathFinding));
        java.lang.Object initialValue79 = recovery$indy$flow$898(initialValue78);
        java.lang.Object initialValue80 = recovery$indy$flow$899(initialValue78);
        java.lang.Object initialValue81 = initialValue80;
        client.setting.ModeSetting initialValue82 = initialized77;
        java.lang.Object initialValue83 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue82))))));
        java.lang.Object initialValue84 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue81))))));
        java.lang.Object initialValue85 = recovery$indy$flow$902(initialValue83, initialValue84);
        recovery$indy$flow$903(this, initialValue85);
        client.setting.NumberSetting initialized86 = new client.setting.NumberSetting(this, "RotationUpdateTicks", 0.0D, constructorKey12, 0.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue87 = recovery$indy$flow$906(this);
        java.lang.Object initialValue88 = initialValue87;
        client.setting.NumberSetting initialValue89 = initialized86;
        java.lang.Object initialValue90 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue89))))));
        java.lang.Object initialValue91 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue88))))));
        java.lang.Object initialValue92 = recovery$indy$flow$909(initialValue90, initialValue91);
        recovery$indy$flow$910(this, initialValue92);
        java.lang.Object initialValue93 = recovery$indy$flow$912();
        client.setting.MultiSelectSetting initialized94 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey3, (net.C_47OZ[]) (initialValue93));
        java.lang.Object initialValue95 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingPathFinding));
        java.lang.Object initialValue96 = recovery$indy$flow$915(initialValue95);
        java.lang.Object initialValue97 = recovery$indy$flow$916(initialValue95);
        java.lang.Object initialValue98 = initialValue97;
        client.setting.MultiSelectSetting initialValue99 = initialized94;
        java.lang.Object initialValue100 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue99))))));
        java.lang.Object initialValue101 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue98))))));
        java.lang.Object initialValue102 = recovery$indy$flow$919(initialValue100, initialValue101);
        recovery$indy$flow$920(this, initialValue102);
        client.setting.BooleanSetting initialized103 = new client.setting.BooleanSetting(this, constructorKey11, "OnlyWithKillAuraTarget", true);
        recovery$indy$flow$923(this, initialized103);
        client.setting.NumberSetting initialized104 = new client.setting.NumberSetting(this, "NoWalkDistanceToTarget", 1.0D, constructorKey12, 0.0D, Double.longBitsToDouble(4618441417868443648L), 2);
        recovery$indy$flow$926(this, initialized104);
        client.setting.BooleanSetting initialized105 = new client.setting.BooleanSetting(this, constructorKey11, "Jump", true);
        recovery$indy$flow$929(this, initialized105);
        client.setting.BooleanSetting initialized106 = new client.setting.BooleanSetting(this, constructorKey11, "StopWhileEating", true);
        recovery$indy$flow$932(this, initialized106);
        client.setting.BooleanSetting initialized107 = new client.setting.BooleanSetting(this, constructorKey11, "StopWhileSlowness", false);
        recovery$indy$flow$935(this, initialized107);
        client.setting.BooleanSetting initialized108 = new client.setting.BooleanSetting(this, constructorKey11, "AdStafeOnHit", true);
        long initialValue109 = constructorKey10;
        java.lang.String initialValue110 = "AdStrafeOnHit";
        client.setting.BooleanSetting initialValue111 = initialized108;
        java.lang.Object initialValue112 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue111))))));
        java.lang.Object initialValue113 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue110))))));
        java.lang.Object initialValue114 = recovery$indy$flow$940(initialValue112, initialValue113, initialValue109);
        java.lang.Object initialValue115 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue114))))));
        recovery$indy$flow$942(this, initialValue115);
        client.setting.NumberSetting initialized116 = new client.setting.NumberSetting(this, "AdStafeTime", Double.longBitsToDouble(4641240890982006784L), constructorKey12, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0);
        short converted117 = (short) (constructorPart7);
        int initialValue118 = (int) (converted117);
        int initialValue119 = constructorPart6;
        java.lang.String initialValue120 = "AdStrafeTime";
        int initialValue121 = constructorPart5;
        client.setting.NumberSetting initialValue122 = initialized116;
        java.lang.Object initialValue123 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue122))))));
        java.lang.Object initialValue124 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue120))))));
        java.lang.Object initialValue125 = recovery$indy$flow$947(initialValue123, initialValue121, initialValue124, initialValue119, (short) (initialValue118));
        java.lang.Object initialValue126 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).settingAdStafeOnHit));
        java.lang.Object initialValue127 = recovery$indy$flow$949(initialValue126);
        java.lang.Object initialValue128 = recovery$indy$flow$950(initialValue126);
        java.lang.Object initialValue129 = initialValue128;
        java.lang.Object initialValue130 = initialValue125;
        java.lang.Object initialValue131 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue130))))));
        java.lang.Object initialValue132 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue129))))));
        java.lang.Object initialValue133 = recovery$indy$flow$953(initialValue131, initialValue132);
        recovery$indy$flow$954(this, initialValue133);
        client.setting.NumberSetting initialized134 = new client.setting.NumberSetting(this, "DelayAfterRespawn", 0.0D, constructorKey12, Double.longBitsToDouble(4656510908468559872L), Double.longBitsToDouble(4666723172467343360L), 0);
        recovery$indy$flow$957(this, initialized134);
        net.C_47cu initialized135 = new net.C_47cu();
        recovery$indy$flow$960(this, initialized135);
        java.util.HashSet initialized136 = new java.util.HashSet();
        recovery$indy$flow$963(this, initialized136);
        net.C_47gg initialized137 = new net.C_47gg(constructorKey8);
        recovery$indy$flow$966(this, initialized137);
        java.util.ArrayList initialized138 = new java.util.ArrayList();
        recovery$indy$flow$969(this, initialized138);
        net.C_47cu initialized139 = new net.C_47cu();
        recovery$indy$flow$972(this, initialized139);
        recovery$indy$flow$973(this, false);
        recovery$indy$flow$974(this, "");
        recovery$indy$flow$975(this, true);
        java.lang.Object initialValue140 = ((java.lang.Object)(((augustus.recovered.modules.movement.AutoWalk_47Cb) (((java.lang.Object)(this)))).field_46));
        java.lang.String initialValue141 = "None";
        java.lang.Object initialValue142 = initialValue140;
        java.lang.Object initialValue143 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue142))))));
        java.lang.Object initialValue144 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue141))))));
        recovery$indy$flow$979(initialValue143, initialValue144);
        java.lang.Object initialValue145 = recovery$indy$flow$980();
        if (initialValue145 == null) {
            return;
        } else {
            int comparison146 = (constructorKey2 > 0L ? 1 : constructorKey2 == 0L ? 0 : -1);
            if (comparison146 <= 0) {
                recovery$indy$flow$981((initialValue75 != 0));
                return;
            } else {
                if (initialValue75 == 0) {
                    recovery$indy$flow$981(true);
                    return;
                } else {
                    recovery$indy$flow$981(false);
                    return;
                }
            }
        }
    }







    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String c(int a0,long a1);

    private static native java.lang.String c(byte[] a0);

    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);
    private static native boolean recovery$indy$flow$44(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$45(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$46(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$48(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$49(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$50(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$53(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$54(int a0,long a1);
    private static native double recovery$indy$flow$60(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$61(java.lang.Object a0,long a1,boolean a2,long a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$72(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$73(java.lang.Object a0,short a1,int a2,short a3,long a4,long a5);
    private static native boolean recovery$indy$flow$269(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$274(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$277(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$280(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$285(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$290(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$298(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$300(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$302(java.lang.Object a0,long a1,long a2);
    private static boolean recovery$indy$flow$357(java.lang.Object a0) {
        return (a0 instanceof java.lang.Exception);
    }
    private static boolean recovery$indy$flow$358(java.lang.Object a0) {
        return (a0 instanceof java.lang.Exception);
    }
    private static long recovery$indy$flow$359() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.b;
    }
    private static void recovery$indy$flow$360(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43a = a1;
        return;
    }
    private static native boolean recovery$indy$flow$361();



    private static native void recovery$indy$flow$365(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$366();

    private static native java.lang.Object recovery$indy$flow$368(java.lang.Object a0);


    private static native boolean recovery$indy$flow$371(java.lang.Object a0,long a1);

    private static native boolean recovery$indy$flow$373(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$374() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }

    private static native boolean recovery$indy$flow$376(java.lang.Object a0);


    private static native boolean recovery$indy$flow$379(java.lang.Object a0);


    private static native boolean recovery$indy$flow$382(java.lang.Object a0);

    private static long recovery$indy$flow$384() {
        return java.lang.System.currentTimeMillis();
    }
    private static long recovery$indy$flow$385(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_47m;
    }
    private static java.lang.Object recovery$indy$flow$386() {
        return client.ClientGlobals.field_46;
    }


    private static native java.lang.Object recovery$indy$flow$389(java.lang.Object a0);

    private static java.lang.Object recovery$indy$flow$391(java.lang.Object a0) {
        return ((float[]) (a0));
    }

    private static native void recovery$indy$flow$393(java.lang.Object a0,java.lang.Object a1,long a2,int a3,java.lang.Object a4);

    private static native java.lang.Object recovery$indy$flow$395(java.lang.Object a0,long a1);


    private static java.lang.Object recovery$indy$flow$398() {
        return client.ClientGlobals.field_48;
    }



    private static native java.lang.Object recovery$indy$flow$402(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$403() {
        return client.ClientGlobals.field_48;
    }



    private static native double recovery$indy$flow$407(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$408() {
        return client.ClientGlobals.field_48;
    }



    private static native double recovery$indy$flow$412(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$413() {
        return client.ClientGlobals.field_48;
    }



    private static native double recovery$indy$flow$417(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$418() {
        return client.ClientGlobals.field_48;
    }



    private static native double recovery$indy$flow$422(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$423() {
        return client.ClientGlobals.field_46;
    }

    private static native java.lang.Object recovery$indy$flow$425(java.lang.Object a0);




    private static native java.lang.Object recovery$indy$flow$430(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3,int a4,int a5,int a6,int a7,java.lang.Object a8);
    private static java.lang.Object recovery$indy$flow$431() {
        return client.ClientGlobals.field_48;
    }


    private static native boolean recovery$indy$flow$434(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$435() {
        return client.ClientGlobals.field_48;
    }


    private static java.lang.Object recovery$indy$flow$438() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static native float recovery$indy$flow$441(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$442() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$445(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$446(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$447(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native boolean recovery$indy$flow$448(java.lang.Object a0,double a1,double a2,double a3);
    private static java.lang.Object recovery$indy$flow$449() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$452(java.lang.Object a0,float a1);
    private static native java.lang.Object recovery$indy$flow$453(java.lang.Object a0,float a1);
    private static double recovery$indy$flow$455(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$456(double a0) {
        return java.lang.Math.floor(a0);
    }
    private static double recovery$indy$flow$457(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$458(double a0) {
        return java.lang.Math.floor(a0);
    }
    private static double recovery$indy$flow$459(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$460(double a0) {
        return java.lang.Math.floor(a0);
    }
    private static double recovery$indy$flow$463(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$464(double a0) {
        return java.lang.Math.floor(a0);
    }
    private static double recovery$indy$flow$465(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$466(double a0) {
        return java.lang.Math.floor(a0);
    }
    private static double recovery$indy$flow$467(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static double recovery$indy$flow$468(double a0) {
        return java.lang.Math.floor(a0);
    }
    private static native java.lang.Object recovery$indy$flow$470(java.lang.Object a0,short a1,int a2,short a3,long a4,long a5);

    private static boolean recovery$indy$flow$472(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static long recovery$indy$flow$473() {
        return java.lang.System.currentTimeMillis();
    }
    private static long recovery$indy$flow$474(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_47e;
    }
    private static native double recovery$indy$flow$475(java.lang.Object a0,java.lang.Object a1,long a2,long a3);
    private static void recovery$indy$flow$476(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43E = ((java.lang.String) (a1));
        return;
    }
    private static java.lang.Object recovery$indy$flow$477() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static int recovery$indy$flow$480(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }


    private static native double recovery$indy$flow$483(java.lang.Object a0,long a1);



    private static native void recovery$indy$flow$487(java.lang.Object a0,short a1,java.lang.Object a2,char a3,java.lang.Object a4,int a5);
    private static long recovery$indy$flow$488() {
        return java.lang.System.currentTimeMillis();
    }
    private static void recovery$indy$flow$489(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_47e = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$490() {
        return java.lang.System.out;
    }
    private static java.lang.Object recovery$indy$flow$493(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$494(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }

    private static boolean recovery$indy$flow$496(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashSet) (a0)).contains(a1);
    }
    private static java.lang.Object recovery$indy$flow$497(java.lang.Object a0,boolean a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$498(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }

    private static int recovery$indy$flow$500(java.lang.Object a0) {
        return ((java.util.HashSet) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$501(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$502(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$503(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static void recovery$indy$flow$504(java.lang.Object a0,java.lang.Object a1) {
        ((java.io.PrintStream) (a0)).println(((java.lang.String) (a1)));
        return;
    }

    private static boolean recovery$indy$flow$506(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.HashSet) (a0)).contains(a1);
    }
    private static int recovery$indy$flow$507(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43y;
    }
    private static void recovery$indy$flow$508(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43y = a1;
        return;
    }

    private static int recovery$indy$flow$510(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }
    private static int recovery$indy$flow$511(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43y;
    }

    private static int recovery$indy$flow$513(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }
    private static void recovery$indy$flow$514(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43y = a1;
        return;
    }



    private static native void recovery$indy$flow$518(java.lang.Object a0,short a1,java.lang.Object a2,char a3,java.lang.Object a4,int a5);
    private static long recovery$indy$flow$519() {
        return java.lang.System.currentTimeMillis();
    }
    private static void recovery$indy$flow$520(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_47e = a1;
        return;
    }


    private static boolean recovery$indy$flow$523(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }

    private static int recovery$indy$flow$525(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$526() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$529(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42;
    }


    private static int recovery$indy$flow$532(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }
    private static int recovery$indy$flow$533(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43y;
    }
    private static java.lang.Object recovery$indy$flow$534(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static native java.lang.Object recovery$indy$flow$536(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$537(java.lang.Object a0) {
        return ((net.C_47nU) (a0)).field_48;
    }
    private static java.lang.Object recovery$indy$flow$538() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$541(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }


    private static int recovery$indy$flow$544(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }
    private static int recovery$indy$flow$545(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43y;
    }
    private static java.lang.Object recovery$indy$flow$546(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static native java.lang.Object recovery$indy$flow$548(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$549(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$550(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$551(java.lang.Object a0) {
        return ((net.C_47nU) (a0)).field_48;
    }
    private static java.lang.Object recovery$indy$flow$552() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$555(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }
    private static java.lang.Object recovery$indy$flow$556() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$559(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static native int recovery$indy$flow$560(double a0);
    private static java.lang.Object recovery$indy$flow$561() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$564(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }
    private static native int recovery$indy$flow$565(double a0);
    private static java.lang.Object recovery$indy$flow$566() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$569(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static native int recovery$indy$flow$570(double a0);
    private static java.lang.Object recovery$indy$flow$573() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$576(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$577(java.lang.Object a0);
    private static boolean recovery$indy$flow$578(java.lang.Object a0) {
        return (a0 instanceof net.C_47EX);
    }
    private static java.lang.Object recovery$indy$flow$579() {
        return net.C_47EX.field_44;
    }
    private static native java.lang.Object recovery$indy$flow$580(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$582(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$583(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$585(java.lang.Object a0,java.lang.Object a1);


    private static native boolean recovery$indy$flow$589(java.lang.Object a0);

    private static int recovery$indy$flow$591(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }
    private static int recovery$indy$flow$592(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43y;
    }

    private static java.lang.Object recovery$indy$flow$594(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static native java.lang.Object recovery$indy$flow$596(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$597(java.lang.Object a0,long a1,long a2,long a3);
    private static double recovery$indy$flow$598(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$599(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static java.lang.Object recovery$indy$flow$600() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static native float recovery$indy$flow$603(java.lang.Object a0);
    private static double recovery$indy$flow$604(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }

    private static native java.lang.Object recovery$indy$flow$606(java.lang.Object a0,double a1,long a2,double a3,double a4);
    private static java.lang.Object recovery$indy$flow$607() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static java.lang.Object recovery$indy$flow$610() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$613(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$614(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$615(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native double recovery$indy$flow$616(java.lang.Object a0,double a1,double a2,double a3);
    private static float recovery$indy$flow$617(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_44;
    }
    private static float recovery$indy$flow$618(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_41;
    }
    private static native java.lang.Object recovery$indy$flow$619(java.lang.Object a0,double a1,float a2,float a3,float a4);
    private static java.lang.Object recovery$indy$flow$620() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static java.lang.Object recovery$indy$flow$624() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$627(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static java.lang.Object recovery$indy$flow$628() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$631(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }
    private static java.lang.Object recovery$indy$flow$632() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$635(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static java.lang.Object recovery$indy$flow$637() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$640(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$641(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$642(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native double recovery$indy$flow$643(java.lang.Object a0,double a1,double a2,double a3);
    private static float recovery$indy$flow$644(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_44;
    }
    private static float recovery$indy$flow$645(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_41;
    }
    private static native java.lang.Object recovery$indy$flow$646(java.lang.Object a0,java.lang.Object a1,double a2,float a3,float a4,float a5);

    private static java.lang.Object recovery$indy$flow$648() {
        return net.C_47Az.BLOCK;
    }

    private static java.lang.Object recovery$indy$flow$650() {
        return net.C_47Az.BLOCK;
    }


    private static native boolean recovery$indy$flow$653(java.lang.Object a0);

    private static int recovery$indy$flow$655(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }
    private static int recovery$indy$flow$656(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43y;
    }

    private static java.lang.Object recovery$indy$flow$658(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }

    private static native java.lang.Object recovery$indy$flow$660(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$661(java.lang.Object a0,long a1,long a2,long a3);
    private static double recovery$indy$flow$662(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$663(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static java.lang.Object recovery$indy$flow$664() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static native float recovery$indy$flow$667(java.lang.Object a0);
    private static double recovery$indy$flow$668(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }

    private static native java.lang.Object recovery$indy$flow$670(java.lang.Object a0,double a1,long a2,double a3,double a4);
    private static java.lang.Object recovery$indy$flow$671() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static java.lang.Object recovery$indy$flow$674() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$677(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$678(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$679(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native double recovery$indy$flow$680(java.lang.Object a0,double a1,double a2,double a3);
    private static float recovery$indy$flow$681(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_44;
    }
    private static float recovery$indy$flow$682(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_41;
    }
    private static native java.lang.Object recovery$indy$flow$683(java.lang.Object a0,double a1,float a2,float a3,float a4);
    private static java.lang.Object recovery$indy$flow$684() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static java.lang.Object recovery$indy$flow$688() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$691(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static java.lang.Object recovery$indy$flow$692() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$695(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }
    private static java.lang.Object recovery$indy$flow$696() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$699(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static java.lang.Object recovery$indy$flow$701() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$704(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static double recovery$indy$flow$705(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static double recovery$indy$flow$706(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native double recovery$indy$flow$707(java.lang.Object a0,double a1,double a2,double a3);
    private static float recovery$indy$flow$708(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_44;
    }
    private static float recovery$indy$flow$709(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_41;
    }
    private static native java.lang.Object recovery$indy$flow$710(java.lang.Object a0,java.lang.Object a1,double a2,float a3,float a4,float a5);

    private static java.lang.Object recovery$indy$flow$712() {
        return net.C_47Az.BLOCK;
    }

    private static java.lang.Object recovery$indy$flow$714() {
        return net.C_47Az.BLOCK;
    }


    private static native java.lang.Object recovery$indy$flow$717(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$718(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equalsIgnoreCase(((java.lang.String) (a1)));
    }
    private static double recovery$indy$flow$719(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static java.lang.Object recovery$indy$flow$720() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$723(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static double recovery$indy$flow$724(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static java.lang.Object recovery$indy$flow$725() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$728(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static native double recovery$indy$flow$729(double a0,double a1);
    private static java.lang.Object recovery$indy$flow$730() {
        return java.util.concurrent.ThreadLocalRandom.current();
    }
    private static double recovery$indy$flow$731(java.lang.Object a0,double a1,double a2) {
        return ((java.util.concurrent.ThreadLocalRandom) (a0)).nextDouble(a1, a2);
    }

    private static native java.lang.Object recovery$indy$flow$733(java.lang.Object a0,float a1,long a2,float a3);
    private static java.lang.Object recovery$indy$flow$734() {
        return client.ClientGlobals.field_46;
    }

    private static native java.lang.Object recovery$indy$flow$736(java.lang.Object a0);

    private static java.lang.Object recovery$indy$flow$738(java.lang.Object a0) {
        return ((float[]) (a0));
    }

    private static native void recovery$indy$flow$740(java.lang.Object a0,java.lang.Object a1,long a2,int a3,java.lang.Object a4);
    private static long recovery$indy$flow$741() {
        return java.lang.System.currentTimeMillis();
    }
    private static void recovery$indy$flow$742(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_47m = a1;
        return;
    }
    private static void recovery$indy$flow$743(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_47l = ((net.C_477r) (a1));
        return;
    }


    private static native double recovery$indy$flow$746(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$747() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static int recovery$indy$flow$750(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }


    private static native double recovery$indy$flow$753(java.lang.Object a0,long a1);
    private static double recovery$indy$flow$754(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static java.lang.Object recovery$indy$flow$755() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$758(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static double recovery$indy$flow$759(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static java.lang.Object recovery$indy$flow$760() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$763(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static native double recovery$indy$flow$764(double a0,double a1);
    private static java.lang.Object recovery$indy$flow$765() {
        return java.util.concurrent.ThreadLocalRandom.current();
    }
    private static double recovery$indy$flow$766(java.lang.Object a0,double a1,double a2) {
        return ((java.util.concurrent.ThreadLocalRandom) (a0)).nextDouble(a1, a2);
    }

    private static native java.lang.Object recovery$indy$flow$768(java.lang.Object a0,float a1,long a2,float a3);
    private static void recovery$indy$flow$769(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_47_ = ((net.C_477r) (a1));
        return;
    }
    private static long recovery$indy$flow$770() {
        return java.lang.System.currentTimeMillis();
    }
    private static void recovery$indy$flow$771(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_40 = a1;
        return;
    }

    private static long recovery$indy$flow$773() {
        return java.lang.System.currentTimeMillis();
    }
    private static long recovery$indy$flow$774(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_47E;
    }
    private static long recovery$indy$flow$775() {
        return java.lang.System.currentTimeMillis();
    }
    private static long recovery$indy$flow$776(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_40;
    }


    private static native double recovery$indy$flow$779(java.lang.Object a0,long a1);
    private static java.lang.Object recovery$indy$flow$780() {
        return client.ClientGlobals.field_46;
    }


    private static native java.lang.Object recovery$indy$flow$783(java.lang.Object a0);

    private static java.lang.Object recovery$indy$flow$785(java.lang.Object a0) {
        return ((float[]) (a0));
    }

    private static native void recovery$indy$flow$787(java.lang.Object a0,java.lang.Object a1,long a2,int a3,java.lang.Object a4);
    private static long recovery$indy$flow$788() {
        return java.lang.System.currentTimeMillis();
    }
    private static void recovery$indy$flow$789(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_47m = a1;
        return;
    }

    private static void recovery$indy$flow$791(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_47l = ((net.C_477r) (a1));
        return;
    }
    private static double recovery$indy$flow$792(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static java.lang.Object recovery$indy$flow$793() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$796(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static double recovery$indy$flow$797(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static java.lang.Object recovery$indy$flow$798() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$801(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static native double recovery$indy$flow$802(double a0,double a1);
    private static java.lang.Object recovery$indy$flow$803() {
        return client.ClientGlobals.field_46;
    }

    private static native java.lang.Object recovery$indy$flow$805(java.lang.Object a0);
    private static float recovery$indy$flow$806(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_44;
    }
    private static native java.lang.Object recovery$indy$flow$807(float a0,float a1,long a2);
    private static void recovery$indy$flow$808(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_47w = ((int[]) (a1));
        return;
    }
    private static long recovery$indy$flow$809() {
        return java.lang.System.currentTimeMillis();
    }
    private static void recovery$indy$flow$810(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_47E = a1;
        return;
    }
    private static double recovery$indy$flow$811(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static java.lang.Object recovery$indy$flow$812() {
        return augustus.recovered.modules.movement.AutoWalk_47Cb.field_43;
    }


    private static double recovery$indy$flow$815(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }
    private static void recovery$indy$flow$816(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43P = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$817() {
        return client.ClientGlobals.field_46;
    }

    private static native java.lang.Object recovery$indy$flow$819(java.lang.Object a0);
    private static float recovery$indy$flow$820(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_44;
    }
    private static native float recovery$indy$flow$821(float a0);
    private static native float recovery$indy$flow$822(float a0);
    private static native float recovery$indy$flow$823(float a0,float a1);
    private static void recovery$indy$flow$824(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43v = a1;
        return;
    }
    private static native void recovery$indy$flow$835(java.lang.Object a0,java.lang.Object a1);
    private static native boolean recovery$indy$flow$836();

    private static java.lang.Object recovery$indy$flow$840(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$841(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$844(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$846(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$850(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$851(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$854(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$855(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$859(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$860(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$863(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$864(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$868(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$869(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$872(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$873(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$877(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$878(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$881(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$883(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$887(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$888(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$891(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$893(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$895(int a0);

    private static java.lang.Object recovery$indy$flow$898(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$899(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$902(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$903(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$906(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$909(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$910(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$912();

    private static java.lang.Object recovery$indy$flow$915(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$916(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$919(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$920(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$923(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$926(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$929(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$932(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$935(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$940(java.lang.Object a0,java.lang.Object a1,long a2);

    private static native void recovery$indy$flow$942(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$947(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);

    private static java.lang.Object recovery$indy$flow$949(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$950(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$953(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$954(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$957(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$960(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$963(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$966(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$969(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43h = ((java.util.ArrayList) (a1));
        return;
    }
    private static native void recovery$indy$flow$972(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$973(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43u = a1;
        return;
    }
    private static void recovery$indy$flow$974(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43E = ((java.lang.String) (a1));
        return;
    }
    private static void recovery$indy$flow$975(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.AutoWalk_47Cb) (a0)).field_43a = a1;
        return;
    }



    private static native void recovery$indy$flow$979(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$980();
    private static native void recovery$indy$flow$981(boolean a0);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);
   private static native boolean recovery$indy$4(Object var0, long var1, long var3);
   private static native double recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$6(Object var0, double var1, long var3, long var5, long var7);
   private static native void recovery$indy$7(Object var0, long var1, long var3);
   private static native boolean recovery$indy$8(long var0, long var2);
   private static native WorldClient recovery$indy$9(Object var0, long var1, long var3);
   private static native boolean recovery$indy$10(Object var0, Object var1, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);
   private static native double[] recovery$indy$12(float var0, float var1, float var2, long var3, long var5, long var7);
   private static native boolean recovery$indy$13(long var0, long var2);
   private static native double[] recovery$indy$14(float var0, float var1, float var2, long var3, long var5, long var7);
   private static native String recovery$indy$36(int var0, long var1);
   private static native Predicate recovery$indy$37(AutoWalk_47Cb var0);
   private static native ToDoubleFunction recovery$indy$38();
   private static native void recovery$indy$39(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$40(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$41(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$42(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$53(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$54(Object var0, long var1, long var3);
   private static native boolean recovery$indy$55(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$66();
}
