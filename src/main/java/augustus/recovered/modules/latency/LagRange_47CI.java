package augustus.recovered.modules.latency;
import augustus.recovered.modules.misc.Debug_47kF;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_46s;
import net.C_472S;
import net.C_472n;
import net.C_473U;
import net.C_475e;
import net.C_478i;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47H;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47WF;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.C_47bg;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47eb;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47iC;
import net.C_47j9;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import net.C_47oo;
import client.ClientGlobals;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47tf;
import net.C_47xz;
import net.C_48i;
import net.C_48q;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class LagRange_47CI extends client.module.Module implements net.C_48q,net.C_47iC,net.C_47hi,client.event.RenderListener,net.C_47xz {
    public final client.setting.NumberSetting settingPredictTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTicks = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingCorrect = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyOnGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingStop = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSTap = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingDelayAfterAttack = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingDelayBetweenLags = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingStopEarly = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyWhileKillAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingTargets2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingPreAimRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingDebug = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDebug2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyInThirdPerson = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingTimeDebugGetsDisplayed = null; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_46c; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_478i field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_478i field_46T; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47tf field_468; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47tf field_463; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_472S field_46D; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47tf field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_46V; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

   public void method_46$2c4d5d53cf(long var1, C_47H var3) {
      net.C_472S var99;
      int var104;
      augustus.recovered.modules.latency.LagRange_47CI var117;
      long var6;
      int var8;
      int var9;
      int var10;
      long var11;
      long var15;
      long var17;
      long var19;
      String var21;
      int var22;
      EntityLivingBase var23;
      label368: {
         long var4 = var1 ^ 132797893306018L;
         var6 = var1 ^ 48558774251301L;
         long var10001 = var1 ^ 6849702962884L;
         var8 = (int)((var1 ^ 6849702962884L) >>> 48);
         var9 = (int)((var1 ^ 6849702962884L) << 16 >>> 32);
         var10 = (int)(var10001 << 48 >>> 48);
         var11 = var1 ^ 74073662626348L;
         long var13 = var1 ^ 39716244248338L;
         var15 = var1 ^ 131872998763776L;
         var17 = var1 ^ 67943828600288L;
         var19 = var1 ^ 9296722184350L;
         long var10002 = 7021504736327508704L;
         BooleanSetting var26 = this.settingCorrect;
         boolean var118 = var26.method_49$aae029aa0a();
         long var10003 = 7019165140916869815L;
         long var27 = var13;
         boolean var29 = var118;
         C_47H var30 = var3;
         var30.method_47$a19f828fbe(var29, var27);
         long var10000 = 7022292303143951870L;
         String var97 = C_47eb.method_48$0e30dfc966();
         var10002 = 7019264321834496750L;
         C_47H var31 = var3;
         var22 = var31.method_48$8abf5c6871();
         var21 = var97;
         var10002 = 7019865297174349134L;
         long var32 = var4;
         LagRange_47CI var34 = this;
         var23 = var34.method_42$f2b0beb8fc(var32);
         LagRange_47CI var98 = this;
         if (var21 == null) {
            if (this.field_46D != C_472S.CHARGE2) {
               break label368;
            }

            var10002 = 7019430334555005612L;
            byte var35 = 0;
            C_47H var36 = var3;
            var36.method_49$d00df7729d(var35);
            var10002 = 7019017390760338585L;
            float var37 = 0.0F;
            C_47H var38 = var3;
            var38.method_42$24a796ab4c(var37);
            var10002 = 7022525478401753295L;
            boolean var39 = true;
            C_47H var40 = var3;
            var40.method_40$f633c984d8(var39);
            var98 = this;
         }

         var98.field_40 = System.currentTimeMillis();
      }

      byte var24;
      label362: {
         LagRange_47CI var115;
         label371: {
            C_472S var119;
            label372: {
               var24 = 0;
               if (var22 >= 1) {
                  var99 = this.field_46D;
                  var119 = C_472S.NOTHING;
                  String var135 = var21;
                  if (var1 >= 0L) {
                     if (var21 == null) {
                        label353: {
                           label352:
                           if (this.field_46D == C_472S.NOTHING) {
                              int var100 = (int) ((this.field_43a) ? 1 : 0);
                              String var120 = var21;
                              if (var1 >= 0L) {
                                 if (var21 == null) {
                                    if (this.field_43a) {
                                       this.field_43a = false;
                                    }

                                    var100 = var22;
                                 }

                                 var120 = var21;
                              }

                              if (var1 >= 0L) {
                                 if (var120 == null) {
                                    if (var100 != 1) {
                                       break label352;
                                    }

                                    double var101 = System.currentTimeMillis() - this.field_40;
                                    long var150 = 7021310991438823178L;
                                    long var41 = var15;
                                    NumberSetting var43 = this.settingDelayBetweenLags;
                                    double var154;
                                    var100 = (var154 = var101 - var43.method_44$474dfaa627(var41)) == 0.0 ? 0 : (var154 < 0.0 ? -1 : 1);
                                 }

                                 var120 = var21;
                              }

                              if (var120 == null) {
                                 if (var100 <= 0) {
                                    break label352;
                                 }

                                 var115 = this;
                                 if (var21 != null) {
                                    break label353;
                                 }

                                 long var151 = 7021310991438823178L;
                                 long var44 = var15;
                                 NumberSetting var46 = this.settingPredictTicks;
                                 int var121 = (int)var46.method_44$474dfaa627(var44);
                                 long var10004 = 7023145894648299061L;
                                 long var47 = var19;
                                 EntityLivingBase var49 = var23;
                                 int var50 = var121;
                                 LagRange_47CI var51 = this;
                                 var100 = (int) ((var51.method_42$8170b4255c(var50, var49, var47)) ? 1 : 0);
                              }

                              if (var100 != 0) {
                                 this.field_43p = 0;
                                 this.field_46D = C_472S.CHARGE1;
                                 this.field_43P = false;
                              }
                           }

                           var115 = this;
                        }

                        var99 = var115.field_46D;
                        var119 = C_472S.CHARGE1;
                     }

                     var135 = var21;
                  }

                  if (var1 > 0L) {
                     if (var135 == null) {
                        label328: {
                           label327:
                           if (var99 == var119) {
                              label378: {
                                 this.field_43p += var22;
                                 long var153 = 7023166430319258677L;
                                 long var52 = var17;
                                 EntityLivingBase var54 = var23;
                                 int var55 = this.field_43p;
                                 LagRange_47CI var56 = this;
                                 byte var25 = (byte) ((var56.method_40$8170b4255c(var55, var54, var52)) ? 1 : 0);
                                 double var103 = this.field_43p;
                                 long var152 = 7021310991438823178L;
                                 long var57 = var15;
                                 NumberSetting var59 = this.settingTicks;
                                 double var155;
                                 var104 = (var155 = var103 - var59.method_44$474dfaa627(var57)) == 0.0 ? 0 : (var155 < 0.0 ? -1 : 1);
                                 label324:
                                 if (var21 == null) {
                                    if (var104 < 0) {
                                       var104 = var25;
                                       if (var21 != null) {
                                          break label324;
                                       }

                                       if (var25 == 0) {
                                          var115 = this;
                                          if (var21 != null) {
                                             break label328;
                                          }

                                          if (!this.field_43P) {
                                             break label327;
                                          }
                                       }
                                    }

                                    this.field_43a = false;
                                    var115 = this;
                                    if (var21 != null) {
                                       break label378;
                                    }

                                    var104 = this.field_43p;
                                 }

                                 if (var104 >= 1) {
                                    var115 = this;
                                    if (var21 != null) {
                                       break label378;
                                    }

                                    if (!this.field_43P) {
                                       char var136 = (char)var8;
                                       char var10005 = (char)var10;
                                       long var10007 = 7022753701820073545L;
                                       int var60 = this.field_43p;
                                       char var61 = var10005;
                                       EntityLivingBase var62 = var23;
                                       int var63 = var9;
                                       char var64 = var136;
                                       LagRange_47CI var65 = this;
                                       this.field_43a = var65.method_42$3b6a6c9b3a(var64, var63, var62, var61, var60);
                                    }
                                 }

                                 var115 = this;
                              }

                              var115.field_46D = C_472S.TIMER1;
                           }

                           var115 = this;
                        }

                        var99 = var115.field_46D;
                        var119 = C_472S.CHARGE2;
                     }

                     var135 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var135 == null) {
                        label272: {
                           label271:
                           if (var99 == var119) {
                              label392: {
                                 this.field_42 += var22;
                                 int var107 = this.field_42;
                                 if (var21 == null) {
                                    if (this.field_42 < this.field_43p) {
                                       var115 = this;
                                       if (var21 != null) {
                                          break label272;
                                       }

                                       if (!this.field_43P) {
                                          break label271;
                                       }
                                    }

                                    var115 = this;
                                    if (var21 != null) {
                                       break label392;
                                    }

                                    var107 = (int) ((this.field_43P) ? 1 : 0);
                                 }

                                 label261:
                                 if (var107 != 0) {
                                    long var137 = 7019323939404586404L;
                                    long var66 = var6;
                                    Debug_47kF var68 = ClientGlobals.field_48.field_412;
                                    boolean var110 = var68.method_46$0dd78e0064(var66);
                                    if (var21 == null) {
                                       if (!var110) {
                                          break label261;
                                       }

                                       long var122 = 7021504736327508704L;
                                       BooleanSetting var69 = ClientGlobals.field_48.field_412.settingLagRangeDebug;
                                       var110 = var69.method_49$aae029aa0a();
                                    }

                                    if (var110) {
                                       String var123 = "Abort " + this.field_42;
                                       long var138 = 7022466911113046183L;
                                       String var70 = var123;
                                       long var71 = var11;
                                       C_475e.method_46$d07b98bfef(var71, var70);
                                    }
                                 }

                                 var115 = this;
                              }

                              var115.field_46D = C_472S.TIMER2;
                           }

                           var115 = this;
                        }

                        var99 = var115.field_46D;
                        var119 = C_472S.TIMER2;
                     }

                     var135 = var21;
                  }

                  if (var1 > 0L) {
                     if (var135 == null) {
                        if (var99 == var119) {
                           long var139 = 7019430334555005612L;
                           int var73 = this.field_42;
                           C_47H var74 = var3;
                           var74.method_49$d00df7729d(var73);
                           this.field_42 = 0;
                           this.field_46D = C_472S.NOTHING;
                           this.field_43p = 0;
                           var24 = 1;
                        }

                        var99 = this.field_46D;
                        var119 = C_472S.TIMER1;
                     }

                     var135 = var21;
                  }

                  if (var135 != null) {
                     break label372;
                  }

                  if (var99 == var119) {
                     label297: {
                        long var140 = 7019430334555005612L;
                        int var75 = this.field_43p;
                        C_47H var76 = var3;
                        var76.method_49$d00df7729d(var75);
                        var115 = this;
                        label296:
                        if (var21 == null) {
                           if (this.field_43a) {
                              var115 = this;
                              if (var21 != null) {
                                 break label296;
                              }

                              long var124 = 7021504736327508704L;
                              BooleanSetting var77 = this.settingStop;
                              if (var77.method_49$aae029aa0a()) {
                                 this.field_46D = C_472S.CHARGE2;
                                 String var112 = var21;
                                 if (var1 > 0L) {
                                    if (var21 == null) {
                                       label286: {
                                          long var141 = 7019323939404586404L;
                                          long var78 = var6;
                                          Debug_47kF var80 = ClientGlobals.field_48.field_412;
                                          boolean var113 = var80.method_46$0dd78e0064(var78);
                                          if (var1 >= 0L) {
                                             if (!var113) {
                                                break label286;
                                             }

                                             long var125 = 7021504736327508704L;
                                             BooleanSetting var81 = ClientGlobals.field_48.field_412.settingLagRangeDebug;
                                             var113 = var81.method_49$aae029aa0a();
                                          }

                                          if (var113) {
                                             StringBuilder var114 = new StringBuilder().append("TimerRange ");
                                             long var142 = 7018901270124131057L;
                                             Minecraft var82 = field_43;
                                             String var126 = var114.append(var82.field_42P.field_48y).toString();
                                             long var143 = 7022466911113046183L;
                                             String var83 = var126;
                                             long var84 = var11;
                                             C_475e.method_46$d07b98bfef(var84, var83);
                                          }
                                       }

                                       this.field_42 = 0;
                                    }

                                    var112 = var21;
                                 }

                                 if (var112 == null) {
                                    break label297;
                                 }
                              }
                           }

                           this.field_46D = C_472S.NOTHING;
                           var115 = this;
                        }

                        var115.field_43p = 0;
                     }

                     var24 = 1;
                  }
               }

               var115 = this;
               if (var21 != null) {
                  break label371;
               }

               var99 = this.field_46D;
               var119 = C_472S.CHARGE1;
            }

            if (var99 != var119) {
               break label362;
            }

            long var144 = 7019430334555005612L;
            byte var86 = 0;
            C_47H var87 = var3;
            var87.method_49$d00df7729d(var86);
            var144 = 7019017390760338585L;
            float var88 = 0.0F;
            C_47H var89 = var3;
            var89.method_42$24a796ab4c(var88);
            var144 = 7022525478401753295L;
            boolean var90 = true;
            C_47H var91 = var3;
            var91.method_40$f633c984d8(var90);
            var115 = this;
         }

         var115.field_40 = System.currentTimeMillis();
      }

      int var116 = var24;
      String var127 = var21;
      if (var1 > 0L) {
         if (var21 == null) {
            if (var24 == 0) {
               return;
            }

            long var128 = 7019264321834496750L;
            C_47H var92 = var3;
            var116 = var92.method_48$8abf5c6871();
         }

         var127 = var21;
      }

      label385: {
         if (var127 == null) {
            if (var116 <= 1) {
               return;
            }

            var117 = this;
            if (var21 != null) {
               break label385;
            }

            long var129 = 7021504736327508704L;
            BooleanSetting var93 = this.settingDebug2;
            var116 = (int) ((var93.method_49$aae029aa0a()) ? 1 : 0);
         }

         if (var116 == 0) {
            return;
         }

         long var147 = 7019264321834496750L;
         C_47H var94 = var3;
         this.field_438 = var94.method_48$8abf5c6871();
         var147 = 7018901270124131057L;
         Minecraft var95 = field_43;
         this.field_45 = var95.field_42P.method_45$6684d3c618();
         var117 = this;
      }

      long var149 = 7018901270124131057L;
      Minecraft var96 = field_43;
      var117.field_468 = var96.field_42P.method_42$41b79b67a0(1.0F);
   }









    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   private EntityLivingBase method_42$f2b0beb8fc(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 100544016163738L;
      long var5 = var1 ^ 96901317234713L;
      String var7 = recovery$indy$1(-4346969660093464794L, var1);
      EntityLivingBase var8 = recovery$indy$2(var3, -4345059570589385815L, var1);
      if (!recovery$indy$3(this.settingOnlyWhileKillAura, -4347905620169031624L, var1)) {
         if (var7 != null) {
            return var8;
         }

         if (var8 == null) {
            double var9 = 10000.0;
            Iterator var11 = recovery$indy$4(field_43, -4345911250718023290L, var1).field_44Q.iterator();

            label60:
            while (true) {
               Entity var14;
               if (var11.hasNext()) {
                  var14 = (Entity)var11.next();
               } else {
                  var14 = var8;
                  if (var1 >= 0L) {
                     return var8;
                  }
               }

               do {
                  Entity var12 = var14;
                  byte var15 = (byte) ((recovery$indy$5(this, var12, var5, -4346302455987398322L, var1)) ? 1 : 0);
                  if (var7 == null) {
                     if (var15 != 0) {
                        if (var7 == null) {
                           if (var9 > recovery$indy$6(field_43, -4345865885283921879L, var1).method_44$ee256e8a75(var12)) {
                              var8 = (EntityLivingBase)var12;
                              var9 = recovery$indy$7(field_43, -4345865885283921879L, var1).method_44$ee256e8a75(var12);
                           }

                           if (var7 == null) {
                              continue label60;
                           }
                        } else {
                           var9 = var9;
                           if (var7 == null) {
                              continue label60;
                           }
                        }
                     } else if (var7 == null) {
                        continue label60;
                     }
                  } else {
                     if (var15 > 0) {
                        var8 = (EntityLivingBase)var12;
                        var9 = recovery$indy$7(field_43, -4345865885283921879L, var1).method_44$ee256e8a75(var12);
                     }

                     if (var7 == null) {
                        continue label60;
                     }
                  }

                  var14 = var8;
               } while (var1 < 0L);

               return var8;
            }
         }
      }

      return var8;
   }



   private boolean method_42$3b6a6c9b3a(char var1, int var2, EntityLivingBase var3, char var4, int var5) {
      java.lang.String var43;
      net.C_47tf var39;
      long var6 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      long var8 = var6 ^ 23435560390043L;
      long var10 = var6 ^ 86352179941310L;
      long var12 = var6 ^ 68092969662892L;
      long var14 = var6 ^ 59002916952968L;
      long var16 = var6 ^ 124951137163364L;
      long var18 = var6 ^ 126359436936752L;
      long var10001 = var6 ^ 113074754591480L;
      int var20 = (int)((var6 ^ 113074754591480L) >>> 32);
      int var21 = (int)((var6 ^ 113074754591480L) << 32 >>> 56);
      int var22 = (int)(var10001 << 40 >>> 40);
      long var23 = var6 ^ 76557178363490L;
      String var25 = recovery$indy$8(-8950331561448358080L, var6);
      double var44;
      int var10000 = (var44 = System.currentTimeMillis() - this.field_46V - recovery$indy$9(this.settingDelayAfterAttack, var10, -8949061082463576652L, var6)) == 0.0
         ? 0
         : (var44 < 0.0 ? -1 : 1);
      if (var25 == null) {
         if (var10000 < 0) {
            return false;
         }

         var10000 = (int) ((recovery$indy$10(this.settingOnlyOnGround, -8948832632091983778L, var6)) ? 1 : 0);
      }

      String var42 = var25;
      if (var1 >= 0) {
         if (var25 == null) {
            if (var10000 != 0) {
               byte var48 = (byte) ((recovery$indy$11(field_43, -8946931736580419505L, var6).field_48M) ? 1 : 0);
               if (var25 != null) {
                  return var48 != 0;
               }

               if (var48 == 0) {
                  return false;
               }
            }

            var10000 = (int) ((recovery$indy$12(ClientGlobals.field_48.field_48Q, var8, -8946509959447249126L, var6)) ? 1 : 0);
         }

         var42 = var25;
      }

      label128: {
         label127:
         if (var42 == null) {
            if (var10000 != 0) {
               var10000 = ((int) (recovery$indy$13(ClientGlobals.field_48.field_48Q.field_473, var18, -8948651037363080869L, var6)
                  .equals(recovery$indy$14(8236, 8414474603402421175L ^ var6)) ? 1 : 0));
               var43 = var25;
               if (var4 <= 0) {
                  break label128;
               }

               if (var25 != null) {
                  break label127;
               }

               if (var10000 != 0) {
                  if (var25 != null) {
                     return ClientGlobals.field_48.field_48Q.field_43v;
                  }

                  if (ClientGlobals.field_48.field_48Q.field_43v) {
                     return false;
                  }
               }
            }

            var10000 = var3.field_48y;
         }

         var43 = var25;
      }

      if (var43 != null) {
         return var10000 != 0;
      }

      if (var10000 >= 20) {
         C_47tf var26 = recovery$indy$15(field_43, -8946931736580419505L, var6).method_49$41b79b67a0(1.0F);
         C_47tf var27 = recovery$indy$16(var3, var12, 1.0F, -8946977889930750187L, var6);
         double var45;
         var10000 = (var45 = var26.method_43$3d77d36e13(var27) - 3.0) == 0.0 ? 0 : (var45 < 0.0 ? -1 : 1);
         if (var25 == null) {
            if (var10000 > 0) {
               ArrayList var28 = recovery$indy$20(
                  recovery$indy$17(field_43, -8946931736580419505L, var6),
                  var3,
                  recovery$indy$18(field_43, -8946931736580419505L, var6).field_48y,
                  recovery$indy$19(field_43, -8946931736580419505L, var6).field_48y + var5,
                  var20,
                  true,
                  (byte)var21,
                  var22,
                  -8947247235686877257L,
                  var6
               );
               C_478i var29 = recovery$indy$22(
                  recovery$indy$21(field_43, -8946931736580419505L, var6).method_42$41b79b67a0(1.0F), var23, true, -8947180694762304598L, var6
               );
               Iterator var30 = var28.iterator();

               label101:
               while (true) {
                  Object var38;
                  if (var30.hasNext()) {
                     var38 = var30.next();
                  } else {
                     var38 = var28;
                     if (var4 >= 0) {
                        var39 = recovery$indy$24(var28, var14, 999999, -8948570461050161655L, var6);
                        break;
                     }
                  }

                  do {
                     C_47tf var31 = (C_47tf)var38;
                     C_47tf var32 = var31.method_47$a365857470(0.0, var3.method_41$bc607678b6(), 0.0);
                     var39 = recovery$indy$23(var32, var29, -8950367590333480602L, var6);
                     if (var25 != null) {
                        break label101;
                     }

                     double var46;
                     int var40 = (var46 = var39.method_43$3d77d36e13(var32) - 3.0) == 0.0 ? 0 : (var46 < 0.0 ? -1 : 1);
                     if (var25 != null) {
                        return var40 != 0;
                     }

                     if (var40 <= 0) {
                        return false;
                     }

                     if (var25 == null) {
                        continue label101;
                     }

                     var38 = var28;
                  } while (var4 < 0);

                  var39 = recovery$indy$24(var28, var14, 999999, -8948570461050161655L, var6);
                  break;
               }

               C_47tf var34 = var39;
               C_47tf var35 = recovery$indy$30(
                     recovery$indy$29(
                        var16,
                        recovery$indy$25(field_43, -8946931736580419505L, var6),
                        recovery$indy$26(field_43, -8946931736580419505L, var6).field_48y,
                        recovery$indy$27(field_43, -8946931736580419505L, var6).field_48y,
                        0,
                        recovery$indy$28(field_43, -8946931736580419505L, var6).field_48y + var5,
                        -8950440288045287755L,
                        var6
                     ),
                     var14,
                     9999,
                     -8948570461050161655L,
                     var6
                  )
                  .method_47$a365857470(0.0, recovery$indy$31(field_43, -8946931736580419505L, var6).method_41$bc607678b6(), 0.0);
               C_478i var36 = recovery$indy$32(var34, var23, true, -8947180694762304598L, var6);
               C_47tf var33 = recovery$indy$33(var35, var36, -8950367590333480602L, var6);
               double var47;
               var10000 = (var47 = var35.method_43$3d77d36e13(var33) - 3.0) == 0.0 ? 0 : (var47 < 0.0 ? -1 : 1);
               if (var25 == null) {
                  var10000 = var10000 <= 0 ? 1 : 0;
               }

               return var10000 != 0;
            }

            var10000 = 0;
         }

         return var10000 != 0;
      } else {
         return false;
      }
   }





   private boolean method_42$8170b4255c(int var1, EntityLivingBase var2, long var3) {
      boolean var16;
      int var7;
      int var8;
      int var9;
      String var12;
      int var15;
      label150: {
         long var5;
         long var10;
         label132: {
            var3 = a ^ var3;
            var5 = var3 ^ 29819312989121L;
            long var10001 = var3 ^ 53935996873248L;
            var7 = (int)((var3 ^ 53935996873248L) >>> 48);
            var8 = (int)((var3 ^ 53935996873248L) << 16 >>> 32);
            var9 = (int)(var10001 << 48 >>> 48);
            var10 = var3 ^ 137035303364714L;
            var12 = recovery$indy$34(-1328554657413770982L, var3);
            byte var10000 = (byte) ((recovery$indy$35(this.settingOnlyOnGround, -1327063891171758588L, var3)) ? 1 : 0);
            if (var12 == null) {
               if (var10000 == 0) {
                  break label132;
               }

               var10000 = (byte) ((recovery$indy$36(field_43, -1329667228517597675L, var3).field_48M) ? 1 : 0);
            }

            if (var12 != null) {
               return var10000 != 0;
            }

            if (var10000 == 0) {
               return false;
            }
         }

         if (var2 != null) {
            float var19;
            var15 = (var19 = recovery$indy$37(field_43, -1329667228517597675L, var3).method_40$ee256e8a75(var2) - 3.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
            if (var12 != null) {
               return var15 != 0;
            }

            if (var15 >= 0) {
               String var17;
               label114: {
                  var15 = (int) ((recovery$indy$38(ClientGlobals.field_48.field_48Q, var5, -1329244850231930560L, var3)) ? 1 : 0);
                  label113:
                  if (var12 == null) {
                     if (var15 != 0) {
                        var15 = ((int) (recovery$indy$39(ClientGlobals.field_48.field_48Q.field_473, var10, -1330234223658492159L, var3)
                           .equals(recovery$indy$40(10640, 7935533885967271005L ^ var3)) ? 1 : 0));
                        var17 = var12;
                        if (var3 < 0L) {
                           break label114;
                        }

                        if (var12 != null) {
                           break label113;
                        }

                        if (var15 != 0) {
                           if (var12 != null) {
                              return ClientGlobals.field_48.field_48Q.field_43v;
                           }

                           if (ClientGlobals.field_48.field_48Q.field_43v) {
                              return false;
                           }
                        }
                     }

                     var15 = var2.field_48y;
                  }

                  var17 = var12;
               }

               if (var17 != null) {
                  break label150;
               }

               if (var15 >= 20) {
                  var15 = var1;
                  break label150;
               }
            }
         }

         return false;
      }

      int var13 = var15;

      label89:
      while (true) {
         if (var13 >= 1) {
            var16 = recovery$indy$41(this, (char)var7, var8, var2, (char)var9, var1, -1328031376788157779L, var3);
            String var18 = var12;
            if (var3 > 0L) {
               if (var12 != null) {
                  break;
               }

               var18 = var12;
            }

            if (var18 != null) {
               return var16;
            }

            if (var16) {
               return true;
            }

            var13--;
            if (var12 == null) {
               continue;
            }
         }

         while (var3 <= 0L) {
            if (var12 == null) {
               continue label89;
            }
         }

         var16 = false;
         break;
      }

      return var16;
   }




    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$9035875d26(long var1, C_47ob var3) {
      if (recovery$indy$42(var3, -7191414507050546911L, var1) instanceof C_47WF) {
         this.field_46V = System.currentTimeMillis();
      }
   }



   private boolean method_40$8170b4255c(int var1, net.minecraft.entity.EntityLivingBase var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 51269856698047L;
      long var7 = var3 ^ 72388850805686L;
      long var9 = var3 ^ 129161928301722L;
      long var11 = var3 ^ 80392870843668L;
      long var13 = var3 ^ 140702496953226L;
      long var10000 = -8003403223379530652L;
      String var15 = net.C_47eb.method_48$0e30dfc966();
      if (var2 != null) {
         long var10002 = -8001868055934211010L;
         long var29 = var5;
         augustus.recovered.modules.combat.KillAura_47CY var31 = client.ClientGlobals.field_48.field_48Q;
         byte var76 = ((byte) (var31.method_46$0dd78e0064(var29) ? 1 : 0));
         if (var15 != null) {
            int var82 = var76 - 20;
            var10002 = -8002290652191882389L;
            net.minecraft.client.Minecraft var68 = field_43;
            long var97 = -8004026113792333909L;
            long var69 = var13;
            net.minecraft.entity.EntityLivingBase var70 = var2;
            net.minecraft.client.entity.EntityPlayerSP var71 = var68.field_42P;
            int var72 = var82;
            double[] var55 = net.C_47TT.method_42$13c0c059d0(var72, var71, var70, var69);
            double var93 = var55[3];
            double var96 = var55[4];
            long var98 = -8002290652191882389L;
            net.minecraft.client.Minecraft var73 = field_43;
            net.C_47tf var56 = new net.C_47tf(var93, var96 + var73.field_42P.method_41$bc607678b6(), var55[5]);
            float var57 = var2.method_42$bc607678b6();
            float var58 = var2.field_48w / 2.0F;
            double var59 = var2.field_48Q;
            double var60 = var2.field_48j;
            double var61 = var2.field_42o;
            int var62 = var2.field_47m;
            int var65 = 0;
            if (var65 < var1 && var62 > 0) {
               var59 += (var2.field_43S - var59) / var62;
               var60 += (var2.field_47B - var60) / var62;
               var61 += (var2.field_43E - var61) / var62;
               var62--;
               var65++;
            }

            if (var3 < 0L) {
               while (true) {
                  long var99;
                  int var84 = (var99 = var3 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
               }
            }

            net.C_478i var67 = new net.C_478i(var59 - var58, var60, var61 - var58, var59 + var58, var60 + var2.field_48, var61 + var58)
               .method_42$800791f322(var57, var57, var57);
            new net.C_47tf(
               net.C_47sk.method_45$4b58f7ab41(var56.field_40, var67.field_48, var67.field_42),
               net.C_47sk.method_45$4b58f7ab41(var56.field_41, var67.field_46, var67.field_47),
               net.C_47sk.method_45$4b58f7ab41(var56.field_47, var67.field_44, var67.field_40)
            );
            var10002 = -8001868055934211010L;
            long var74 = var5;
            augustus.recovered.modules.misc.Debug_47kF var75 = client.ClientGlobals.field_48.field_412;
            byte var83 = ((byte) (var75.method_46$0dd78e0064(var74) ? 1 : 0));
            if (var15 == null) {
               var83 = (byte)(var83 <= 0 ? 1 : 0);
            }

            return (((var83) & 1) != 0);
         } else {
            if (var76 != 0) {
               var10002 = -8001706064861797761L;
               long var32 = var11;
               client.setting.ModeSetting var34 = client.ClientGlobals.field_48.field_48Q.field_473;
               if (var34.method_46$5f9dc63072(var32).equals("Grim") && client.ClientGlobals.field_48.field_48Q.field_43v) {
                  return true;
               }
            }

            if (var2.field_48y >= 20) {
               long var10003 = -8004383431227847024L;
               long var35 = var9;
               client.setting.NumberSetting var37 = this.settingStopEarly;
               var1 += (int)var37.method_44$474dfaa627(var35);
               int var77 = var1 - 1;
               var10002 = -8002290652191882389L;
               net.minecraft.client.Minecraft var38 = field_43;
               long var10004 = -8004026113792333909L;
               long var39 = var13;
               net.minecraft.entity.EntityLivingBase var41 = var2;
               net.minecraft.client.entity.EntityPlayerSP var42 = var38.field_42P;
               int var43 = var77;
               double[] var16 = net.C_47TT.method_42$13c0c059d0(var43, var42, var41, var39);
               double var88 = var16[3];
               double var95 = var16[4];
               long var10005 = -8002290652191882389L;
               net.minecraft.client.Minecraft var44 = field_43;
               net.C_47tf var17 = new net.C_47tf(var88, var95 + var44.field_42P.method_41$bc607678b6(), var16[5]);
               float var18 = var2.method_42$bc607678b6();
               float var19 = var2.field_48w / 2.0F;
               double var20 = var2.field_48Q;
               double var22 = var2.field_48j;
               double var24 = var2.field_42o;
               int var26 = var2.field_47m;

               int var27;
               for (var27 = 0; var27 < var1 && var26 > 0; var27++) {
                  var20 += (var2.field_43S - var20) / var26;
                  var22 += (var2.field_47B - var22) / var26;
                  var24 += (var2.field_43E - var24) / var26;
                  var26--;
               }

               if (var3 < 0L) {
                  while (true) {
                     while (var27 >= var1 || var26 <= 0) {
                        long var102;
                        int var78 = (var102 = var3 - 0L) == 0L ? 0 : (var102 < 0L ? -1 : 1);
                     }

                     var20 += (var2.field_43S - var20) / var26;
                     var22 += (var2.field_47B - var22) / var26;
                     var24 += (var2.field_43E - var24) / var26;
                     var26--;
                     var27++;
                  }
               }

               net.C_478i var64 = new net.C_478i(var20 - var19, var22, var24 - var19, var20 + var19, var22 + var2.field_48, var24 + var19)
                  .method_42$800791f322(var18, var18, var18);
               net.C_47tf var28 = new net.C_47tf(
                  net.C_47sk.method_45$4b58f7ab41(var17.field_40, var64.field_48, var64.field_42),
                  net.C_47sk.method_45$4b58f7ab41(var17.field_41, var64.field_46, var64.field_47),
                  net.C_47sk.method_45$4b58f7ab41(var17.field_47, var64.field_44, var64.field_40)
               );
               var10002 = -8001868055934211010L;
               long var45 = var5;
               augustus.recovered.modules.misc.Debug_47kF var47 = client.ClientGlobals.field_48.field_412;
               if (var47.method_46$0dd78e0064(var45)) {
                  long var10001 = -8004189752953416838L;
                  client.setting.BooleanSetting var48 = client.ClientGlobals.field_48.field_412.settingLagRangeDebug;
                  byte var80 = ((byte) (var48.method_49$aae029aa0a() ? 1 : 0));
                  if (var3 > 0L) {
                     if (var15 == null) {
                        if (var80 != 0) {
                           StringBuilder var81 = new StringBuilder().append(var1 + 1).append("  ").append(var17.method_43$3d77d36e13(var28)).append(" ");
                           var10002 = -8002290652191882389L;
                           net.minecraft.client.Minecraft var49 = field_43;
                           String var85 = var81.append(var49.field_42P.method_49$4b58f7ab41(var2.field_43S, var2.field_47B, var2.field_43E))
                              .append(" ")
                              .append(var17.method_43$3d77d36e13(var28) < 3.0)
                              .toString();
                           var10002 = -8003227515630511811L;
                           String var50 = var85;
                           long var51 = var7;
                           net.C_475e.method_46$d07b98bfef(var51, var50);
                        }

                        double var100;
                        var80 = (byte)((var100 = var17.method_43$3d77d36e13(var28) - 3.0) == 0.0 ? 0 : (var100 < 0.0 ? -1 : 1));
                     }

                     if (var15 == null) {
                        var80 = (byte)(var80 <= 0 ? 1 : 0);
                     }

                     return (((var80) & 1) != 0);
                  } else {
                     if (var15 == null) {
                        var80 = (byte)(var80 <= 0 ? 1 : 0);
                     }

                     return (((var80) & 1) != 0);
                  }
               } else {
                  double var101;
                  int var79 = (var101 = var17.method_43$3d77d36e13(var28) - 3.0) == 0.0 ? 0 : (var101 < 0.0 ? -1 : 1);
                  if (var15 == null) {
                     var79 = var79 <= 0 ? 1 : 0;
                  }

                  return (((var79) & 1) != 0);
               }
            } else {
               return true;
            }
         }
      } else {
         return true;
      }
   }






   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 102100535268455L;
      long var10000 = -8065088087909454695L;
      String var3 = C_47eb.method_48$0e30dfc966();
      long var10001 = -8064159252648766585L;
      BooleanSetting var4 = this.settingOnlyWhileKillAura;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 49219438587088L;
      long var10000 = 7540289126703682606L;
      String var3 = C_47eb.method_48$0e30dfc966();
      long var10001 = 7539353418951109424L;
      BooleanSetting var4 = this.settingOnlyWhileKillAura;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      String var4 = recovery$indy$43(6397431683136021570L, var2);
      LagRange_47CI var10000 = this;
      if (var4 == null) {
         if (this.field_46D != C_472S.NOTHING) {
            return;
         }

         var10000 = this;
      }

      boolean var5 = var10000.field_43a;
      String var10001 = var4;
      if (var2 >= 0L) {
         if (var4 == null) {
            if (!var10000.field_43a) {
               return;
            }

            var5 = recovery$indy$44(this.settingStop, 6398888050448538460L, var2);
         }

         var10001 = var4;
      }

      if (var2 > 0L) {
         if (var10001 == null) {
            if (!var5) {
               return;
            }

            var5 = this.field_43P;
         }

         var10001 = var4;
      }

      if (var10001 == null) {
         if (var5) {
            return;
         }

         var5 = recovery$indy$45(this.settingSTap, 6398888050448538460L, var2);
      }

      if (var5) {
         recovery$indy$46(var1, -1.0F, 6398150220052727495L, var2);
         recovery$indy$47(var1, 0.0F, 6401458500511919623L, var2);
      }
   }



   private boolean method_47$8a15fc4c7b(Entity var1, long var2) {
      long var4;
      String var8;
      Entity var10;
      label44: {
         var2 = a ^ var2;
         var4 = var2 ^ 95755774286779L;
         long var6 = var2 ^ 119025167893724L;
         var8 = recovery$indy$48(1715608958989544261L, var2);
         boolean var10000 = var1 instanceof EntityPlayerSP;
         if (var8 == null) {
            if (var10000) {
               return false;
            }

            var10 = var1;
            if (var8 != null) {
               break label44;
            }

            var10000 = recovery$indy$54(
               var1,
               recovery$indy$49(C_48i.PLAYER, 1715051075185053006L, var2),
               recovery$indy$50(C_48i.MOB, 1715051075185053006L, var2),
               recovery$indy$51(C_48i.ANIMAL, 1715051075185053006L, var2),
               recovery$indy$52(C_48i.VILLAGER, 1715051075185053006L, var2),
               recovery$indy$53(C_48i.ARMOR_STAND, 1715051075185053006L, var2),
               true,
               true,
               true,
               var6,
               true,
               true,
               true,
               1716280395633715470L,
               var2
            );
         }

         if (!var10000) {
            return false;
         }

         var10 = var1;
      }

      if (var10 != recovery$indy$55(field_43, 1716721803648238666L, var2)) {
         double var12;
         int var11 = (
                  var12 = recovery$indy$56(field_43, 1716721803648238666L, var2).method_44$ee256e8a75(var1)
                     - recovery$indy$57(this.settingPreAimRange, var4, 1714628750539737521L, var2)
               )
               == 0.0
            ? 0
            : (var12 < 0.0 ? -1 : 1);
         if (var8 != null) {
            return var11 != 0;
         }

         if (var11 < 0) {
            return true;
         }
      }

      return false;
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      String var4 = recovery$indy$58(2669894709758695815L, var1);
      C_473U var5 = recovery$indy$59(var3, 2668598215186771995L, var1);
      C_473U var10000 = var5;
      if (var4 == null) {
         if (!(var5 instanceof C_46s)) {
            return;
         }

         var10000 = var5;
      }

      C_46s var6 = (C_46s)var10000;
      if (recovery$indy$60(field_43, 2670998755352721032L, var1) != null
         && var6.method_45$8abf5c6871() == recovery$indy$61(field_43, 2670998755352721032L, var1).method_49$8abf5c6871()) {
         this.field_43P = true;
      }
   }



   public void onRender3D(long var1, float var3) {
      net.minecraft.client.Minecraft var8;
      long var4 = var1 ^ 57482311646357L;
      String var6 = recovery$indy$62(8133907829718371435L, var1);
      int var10000 = (int) ((recovery$indy$63(this.settingDebug2, 8134669624583992181L, var1)) ? 1 : 0);
      if (var6 == null) {
         if (var10000 == 0) {
            return;
         }

         double var9;
         var10000 = (var9 = System.currentTimeMillis() - this.field_46c - recovery$indy$64(this.settingTimeDebugGetsDisplayed, var4, 8135179412493217439L, var1) * 1000.0) == 0.0
            ? 0
            : (var9 < 0.0 ? -1 : 1);
      }

      label46: {
         if (var6 == null) {
            if (var10000 >= 0) {
               return;
            }

            var8 = field_43;
            if (var6 != null) {
               break label46;
            }

            var10000 = recovery$indy$65(field_43, 8133837706492150752L, var1).field_44S;
         }

         if (var10000 == 0 && recovery$indy$66(this.settingOnlyInThirdPerson, 8134669624583992181L, var1)) {
            return;
         }

         var8 = field_43;
      }

      C_47j9 var7 = recovery$indy$67(var8, 8134350341547541830L, var1);
      GL11.glPushMatrix();
      RenderUtils.method_42$da8c82d5d4();
      GL11.glTranslated(-var7.method_41$fedcb3e4d3(), -var7.method_49$fedcb3e4d3(), -var7.method_45$fedcb3e4d3());
      GlStateManager.method_47$f2b6a9055b(1.0F, 0.0F, 0.0F, 1.0F);
      RenderUtils.method_41$6059593eaa(this.field_45);
      GlStateManager.method_47$f2b6a9055b(0.0F, 0.0F, 1.0F, 1.0F);
      RenderUtils.method_41$6059593eaa(this.field_46T);
      RenderUtils.method_43$da8c82d5d4();
      GL11.glPopMatrix();
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$68(this, 16, var3, -7101420028566446146L, var1);
      recovery$indy$69(this, 26, var3, -7101420028566446146L, var1);
      recovery$indy$70(this, 21, var3, -7101420028566446146L, var1);
      recovery$indy$71(this, 32, var3, -7101420028566446146L, var1);
      recovery$indy$72(this, 40, var3, -7101420028566446146L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_489$e45a9973e5(long var1) {
      augustus.recovered.modules.latency.LagRange_47CI var14;
      long var3 = var1 ^ 134908585067187L;
      long var10000 = 4173438587599684961L;
      String var5 = C_47eb.method_48$0e30dfc966();
      LagRange_47CI var12 = this;
      if (var5 == null) {
         label62: {
            label67: {
               long var10001 = 4174375847439202943L;
               BooleanSetting var6 = this.settingDebug2;
               int var13 = (int) ((var6.method_49$aae029aa0a()) ? 1 : 0);
               if (var1 > 0L) {
                  if (var13 == 0) {
                     break label67;
                  }

                  var13 = this.field_438;
               }

               label55: {
                  label68: {
                     if (var5 == null) {
                        if (var13 <= 0) {
                           return;
                        }

                        this.field_43y++;
                        if (var1 < 0L) {
                           break label55;
                        }

                        var14 = this;
                        if (var5 != null) {
                           break label68;
                        }

                        var13 = this.field_438;
                     }

                     if (var13 != this.field_43y) {
                        return;
                     }

                     this.field_46c = System.currentTimeMillis();
                     long var10002 = 4176838413273148014L;
                     Minecraft var7 = field_43;
                     this.field_46T = var7.field_42P.method_45$6684d3c618();
                     var10002 = 4176838413273148014L;
                     Minecraft var8 = field_43;
                     this.field_463 = var8.field_42P.method_42$41b79b67a0(1.0F);
                     StringBuilder var15 = new StringBuilder().append("Teleported ");
                     double var16 = this.field_468.method_43$3d77d36e13(this.field_463);
                     long var10003 = 4176801870534264102L;
                     String var17 = var15.append(C_47bg.method_47$3b014ecc56(var16, 3))
                        .append(" blocks in ")
                        .append(this.field_438)
                        .append(" ticks")
                        .toString();
                     var10002 = 4173686347585859640L;
                     String var9 = var17;
                     long var10 = var3;
                     C_475e.method_46$d07b98bfef(var10, var9);
                     this.field_438 = 0;
                     var14 = this;
                  }

                  var14.field_43y = 0;
               }

               if (var1 < 0L) {
                  break label62;
               }

               if (var5 == null) {
                  return;
               }
            }

            this.field_438 = 0;
         }

         var12 = this;
      }

      var12.field_43y = 0;
   }




   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_46D = C_472S.NOTHING;
      this.field_43p = 0;
      this.field_42 = 0;
      this.field_437 = 0;
   }



    public LagRange_47CI(long a0) {
        super((java.lang.String) ("LagRange"),(java.lang.String) ("LagDistanz"),(long) (((augustus.recovered.modules.latency.LagRange_47CI.a ^ a0) ^ 59998856529510L)),(java.awt.Color) (new java.awt.Color((int) (23),(int) (233),(int) (123))),(client.module.Category) (client.module.Category.LATENCY));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.latency.LagRange_47CI.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.latency.LagRange_47CI.a ^ a0) ^ 54532270269580L) >>> 48));
        int constructorPart4 = (int) (((((augustus.recovered.modules.latency.LagRange_47CI.a ^ a0) ^ 54532270269580L) << 16) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.latency.LagRange_47CI.a ^ a0) ^ 54532270269580L) << 32) >>> 32));
        long constructorKey6 = ((augustus.recovered.modules.latency.LagRange_47CI.a ^ a0) ^ 86193785671488L);
        long constructorKey7 = ((augustus.recovered.modules.latency.LagRange_47CI.a ^ a0) ^ 106187975665127L);
        long constructorKey8 = ((augustus.recovered.modules.latency.LagRange_47CI.a ^ a0) ^ 51390362783606L);
        long constructorKey9 = ((augustus.recovered.modules.latency.LagRange_47CI.a ^ a0) ^ 78843002034813L);
        long constructorKey10 = ((augustus.recovered.modules.latency.LagRange_47CI.a ^ a0) ^ 117566718420474L);
        long constructorKey11 = ((augustus.recovered.modules.latency.LagRange_47CI.a ^ a0) ^ 123571600785100L);
        client.setting.NumberSetting initialized12 = new client.setting.NumberSetting(this, "PredictTicks", Double.longBitsToDouble(4617315517961601024L), constructorKey10, 1.0D, Double.longBitsToDouble(4619567317775286272L), 0);
        recovery$indy$flow$502(this, initialized12);
        client.setting.NumberSetting initialized13 = new client.setting.NumberSetting(this, "Ticks", Double.longBitsToDouble(4613937818241073152L), constructorKey10, 1.0D, Double.longBitsToDouble(4619567317775286272L), 0);
        recovery$indy$flow$505(this, initialized13);
        client.setting.BooleanSetting initialized14 = new client.setting.BooleanSetting(this, constructorKey9, "Correct", false);
        recovery$indy$flow$508(this, initialized14);
        client.setting.BooleanSetting initialized15 = new client.setting.BooleanSetting(this, constructorKey9, "OnlyOnGround", false);
        recovery$indy$flow$511(this, initialized15);
        client.setting.BooleanSetting initialized16 = new client.setting.BooleanSetting(this, constructorKey9, "Stop", false);
        recovery$indy$flow$514(this, initialized16);
        client.setting.BooleanSetting initialized17 = new client.setting.BooleanSetting(this, constructorKey9, "STap", false);
        java.lang.Object initialValue18 = ((java.lang.Object)(((augustus.recovered.modules.latency.LagRange_47CI) (((java.lang.Object)(this)))).settingStop));
        java.lang.Object initialValue19 = recovery$indy$flow$518(initialValue18);
        java.lang.Object initialValue20 = recovery$indy$flow$519(initialValue18);
        java.lang.Object initialValue21 = initialValue20;
        long initialValue22 = constructorKey6;
        client.setting.BooleanSetting initialValue23 = initialized17;
        java.lang.Object initialValue24 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue25 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue21))))));
        java.lang.Object initialValue26 = recovery$indy$flow$522(initialValue24, initialValue22, initialValue25);
        java.lang.Object initialValue27 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue26))))));
        recovery$indy$flow$524(this, initialValue27);
        client.setting.NumberSetting initialized28 = new client.setting.NumberSetting(this, "Delay after attack", 0.0D, constructorKey10, 0.0D, Double.longBitsToDouble(4666723172467343360L), 0);
        recovery$indy$flow$527(this, initialized28);
        client.setting.NumberSetting initialized29 = new client.setting.NumberSetting(this, "Delay between lags", 0.0D, constructorKey10, 0.0D, Double.longBitsToDouble(4666723172467343360L), 0);
        recovery$indy$flow$530(this, initialized29);
        client.setting.NumberSetting initialized30 = new client.setting.NumberSetting(this, "Stop early", 0.0D, constructorKey10, 0.0D, Double.longBitsToDouble(4613937818241073152L), 0);
        recovery$indy$flow$533(this, initialized30);
        client.setting.SettingGroup initialized31 = new client.setting.SettingGroup(this, "Targets", constructorKey8);
        recovery$indy$flow$536(this, initialized31);
        short converted32 = (short) (constructorPart3);
        char converted33 = (char) (constructorPart4);
        java.lang.Object initialValue34 = ((java.lang.Object)(((augustus.recovered.modules.latency.LagRange_47CI) (((java.lang.Object)(this)))).settingTargets));
        client.setting.BooleanSetting initialized35 = new client.setting.BooleanSetting(this, "OnlyWhileKillAura", converted32, converted33, constructorPart5, true, (client.setting.SettingGroup) (initialValue34));
        recovery$indy$flow$540(this, initialized35);
        java.lang.Object initialValue36 = recovery$indy$flow$542();
        java.lang.Object initialValue37 = ((java.lang.Object)(((augustus.recovered.modules.latency.LagRange_47CI) (((java.lang.Object)(this)))).settingTargets));
        client.setting.MultiSelectSetting initialized38 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey7, (net.C_47OZ[]) (initialValue36), (client.setting.SettingGroup) (initialValue37));
        java.lang.Object initialValue39 = recovery$indy$flow$545(this);
        java.lang.Object initialValue40 = initialValue39;
        client.setting.MultiSelectSetting initialValue41 = initialized38;
        java.lang.Object initialValue42 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue41))))));
        java.lang.Object initialValue43 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue44 = recovery$indy$flow$548(initialValue42, initialValue43);
        recovery$indy$flow$549(this, initialValue44);
        java.lang.Object initialValue45 = ((java.lang.Object)(((augustus.recovered.modules.latency.LagRange_47CI) (((java.lang.Object)(this)))).settingTargets));
        client.setting.NumberSetting initialized46 = new client.setting.NumberSetting(this, "PreAimRange", Double.longBitsToDouble(4616189618054758400L), 0.0D, Double.longBitsToDouble(4624633867356078080L), 1, (client.setting.SettingGroup) (initialValue45), constructorKey11);
        java.lang.Object initialValue47 = recovery$indy$flow$553(this);
        java.lang.Object initialValue48 = initialValue47;
        client.setting.NumberSetting initialValue49 = initialized46;
        java.lang.Object initialValue50 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue51 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue48))))));
        java.lang.Object initialValue52 = recovery$indy$flow$556(initialValue50, initialValue51);
        recovery$indy$flow$557(this, initialValue52);
        client.setting.SettingGroup initialized53 = new client.setting.SettingGroup(this, "Debug", constructorKey8);
        recovery$indy$flow$560(this, initialized53);
        short converted54 = (short) (constructorPart3);
        char converted55 = (char) (constructorPart4);
        java.lang.Object initialValue56 = ((java.lang.Object)(((augustus.recovered.modules.latency.LagRange_47CI) (((java.lang.Object)(this)))).settingDebug));
        client.setting.BooleanSetting initialized57 = new client.setting.BooleanSetting(this, "Debug", converted54, converted55, constructorPart5, false, (client.setting.SettingGroup) (initialValue56));
        recovery$indy$flow$564(this, initialized57);
        short converted58 = (short) (constructorPart3);
        char converted59 = (char) (constructorPart4);
        java.lang.Object initialValue60 = ((java.lang.Object)(((augustus.recovered.modules.latency.LagRange_47CI) (((java.lang.Object)(this)))).settingDebug));
        client.setting.BooleanSetting initialized61 = new client.setting.BooleanSetting(this, "OnlyInThirdPerson", converted58, converted59, constructorPart5, true, (client.setting.SettingGroup) (initialValue60));
        java.lang.Object initialValue62 = ((java.lang.Object)(((augustus.recovered.modules.latency.LagRange_47CI) (((java.lang.Object)(this)))).settingDebug2));
        java.lang.Object initialValue63 = recovery$indy$flow$569(initialValue62);
        java.lang.Object initialValue64 = recovery$indy$flow$570(initialValue62);
        java.lang.Object initialValue65 = initialValue64;
        long initialValue66 = constructorKey6;
        client.setting.BooleanSetting initialValue67 = initialized61;
        java.lang.Object initialValue68 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue67))))));
        java.lang.Object initialValue69 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue65))))));
        java.lang.Object initialValue70 = recovery$indy$flow$573(initialValue68, initialValue66, initialValue69);
        java.lang.Object initialValue71 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue70))))));
        recovery$indy$flow$575(this, initialValue71);
        java.lang.Object initialValue72 = ((java.lang.Object)(((augustus.recovered.modules.latency.LagRange_47CI) (((java.lang.Object)(this)))).settingDebug));
        client.setting.NumberSetting initialized73 = new client.setting.NumberSetting(this, "Time debug gets displayed", 1.0D, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4621819117588971520L), 1, (client.setting.SettingGroup) (initialValue72), constructorKey11);
        java.lang.Object initialValue74 = ((java.lang.Object)(((augustus.recovered.modules.latency.LagRange_47CI) (((java.lang.Object)(this)))).settingDebug2));
        java.lang.Object initialValue75 = recovery$indy$flow$580(initialValue74);
        java.lang.Object initialValue76 = recovery$indy$flow$581(initialValue74);
        java.lang.Object initialValue77 = initialValue76;
        client.setting.NumberSetting initialValue78 = initialized73;
        java.lang.Object initialValue79 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue78))))));
        java.lang.Object initialValue80 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue77))))));
        java.lang.Object initialValue81 = recovery$indy$flow$584(initialValue79, initialValue80);
        recovery$indy$flow$585(this, initialValue81);
        recovery$indy$flow$586(this, 0L);
        recovery$indy$flow$587(this, 0);
        recovery$indy$flow$588(this, 0);
        recovery$indy$flow$589(this, 0);
        recovery$indy$flow$590(this, true);
        recovery$indy$flow$591(this, false);
        java.lang.Object initialValue82 = recovery$indy$flow$592();
        recovery$indy$flow$593(this, initialValue82);
        recovery$indy$flow$594(this, 0);
        recovery$indy$flow$595(this, null);
        recovery$indy$flow$596(this, 0L);
        recovery$indy$flow$597(this, 0L);
    }






    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native void recovery$indy$flow$502(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$505(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$508(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$511(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$514(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$518(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$519(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$522(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$524(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$527(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$530(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$533(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$536(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$540(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$542();

    private static native java.lang.Object recovery$indy$flow$545(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$548(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$549(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$553(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$556(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$557(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$560(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$564(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$569(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$570(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$573(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$575(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$580(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$581(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$584(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$585(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$586(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.latency.LagRange_47CI) (a0)).field_46c = a1;
        return;
    }
    private static void recovery$indy$flow$587(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.LagRange_47CI) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$588(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.LagRange_47CI) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$589(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.LagRange_47CI) (a0)).field_43p = a1;
        return;
    }
    private static void recovery$indy$flow$590(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.LagRange_47CI) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$591(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.latency.LagRange_47CI) (a0)).field_43a = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$592() {
        return net.C_472S.NOTHING;
    }
    private static void recovery$indy$flow$593(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.latency.LagRange_47CI) (a0)).field_46D = ((net.C_472S) (a1));
        return;
    }
    private static void recovery$indy$flow$594(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.latency.LagRange_47CI) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$595(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.latency.LagRange_47CI) (a0)).field_49 = ((net.C_47tf) (a1));
        return;
    }
    private static void recovery$indy$flow$596(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.latency.LagRange_47CI) (a0)).field_46V = a1;
        return;
    }
    private static void recovery$indy$flow$597(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.latency.LagRange_47CI) (a0)).field_40 = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(long var0, long var2);
   private static native EntityLivingBase recovery$indy$2(long var0, long var2, long var4);
   private static native boolean recovery$indy$3(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$4(Object var0, long var1, long var3);
   private static native boolean recovery$indy$5(Object var0, Object var1, long var2, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);
   private static native String recovery$indy$8(long var0, long var2);
   private static native double recovery$indy$9(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$10(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);
   private static native boolean recovery$indy$12(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$13(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$14(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);
   private static native C_47tf recovery$indy$16(Object var0, long var1, float var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$17(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$19(Object var0, long var1, long var3);
   private static native ArrayList recovery$indy$20(
      Object var0, Object var1, int var2, int var3, int var4, boolean var5, byte var6, int var7, long var8, long var10
   );
   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);
   private static native C_478i recovery$indy$22(Object var0, long var1, boolean var3, long var4, long var6);
   private static native C_47tf recovery$indy$23(Object var0, Object var1, long var2, long var4);
   private static native C_47tf recovery$indy$24(Object var0, long var1, int var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$25(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$26(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$27(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);
   private static native ArrayList recovery$indy$29(long var0, Object var2, int var3, int var4, int var5, int var6, long var7, long var9);
   private static native C_47tf recovery$indy$30(Object var0, long var1, int var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$31(Object var0, long var1, long var3);
   private static native C_478i recovery$indy$32(Object var0, long var1, boolean var3, long var4, long var6);
   private static native C_47tf recovery$indy$33(Object var0, Object var1, long var2, long var4);
   private static native String recovery$indy$34(long var0, long var2);
   private static native boolean recovery$indy$35(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$36(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$37(Object var0, long var1, long var3);
   private static native boolean recovery$indy$38(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$39(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$40(int var0, long var1);
   private static native boolean recovery$indy$41(Object var0, char var1, int var2, Object var3, char var4, int var5, long var6, long var8);
   private static native C_473U recovery$indy$42(Object var0, long var1, long var3);
   private static native String recovery$indy$43(long var0, long var2);
   private static native boolean recovery$indy$44(Object var0, long var1, long var3);
   private static native boolean recovery$indy$45(Object var0, long var1, long var3);
   private static native void recovery$indy$46(Object var0, float var1, long var2, long var4);
   private static native void recovery$indy$47(Object var0, float var1, long var2, long var4);
   private static native String recovery$indy$48(long var0, long var2);
   private static native boolean recovery$indy$49(Object var0, long var1, long var3);
   private static native boolean recovery$indy$50(Object var0, long var1, long var3);
   private static native boolean recovery$indy$51(Object var0, long var1, long var3);
   private static native boolean recovery$indy$52(Object var0, long var1, long var3);
   private static native boolean recovery$indy$53(Object var0, long var1, long var3);
   private static native boolean recovery$indy$54(
      Object var0,
      boolean var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      long var9,
      boolean var11,
      boolean var12,
      boolean var13,
      long var14,
      long var16
   );
   private static native EntityPlayerSP recovery$indy$55(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$56(Object var0, long var1, long var3);
   private static native double recovery$indy$57(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$58(long var0, long var2);
   private static native C_473U recovery$indy$59(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$60(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$61(Object var0, long var1, long var3);
   private static native String recovery$indy$62(long var0, long var2);
   private static native boolean recovery$indy$63(Object var0, long var1, long var3);
   private static native double recovery$indy$64(Object var0, long var1, long var3, long var5);
   private static native C_47oo recovery$indy$65(Object var0, long var1, long var3);
   private static native boolean recovery$indy$66(Object var0, long var1, long var3);
   private static native C_47j9 recovery$indy$67(Object var0, long var1, long var3);
   private static native void recovery$indy$68(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$69(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$70(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$71(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$72(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$78();
}
