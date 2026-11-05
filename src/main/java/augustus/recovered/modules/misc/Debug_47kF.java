package augustus.recovered.modules.misc;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;
import net.C_407;
import client.Client;
import net.C_40y;
import net.C_42V;
import net.C_42q;
import net.C_43S;
import net.C_43r;
import net.C_45W;
import net.C_45n;
import net.C_46l;
import net.C_46o;
import net.C_472n;
import net.C_473U;
import net.C_473X;
import net.C_4749;
import net.C_475U;
import net.C_475e;
import net.minecraft.client.gui.ScaledResolution;
import net.C_477z;
import net.C_479E;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47DW;
import net.C_47Ij;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47S9;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47VK;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.C_47bg;
import net.C_47bi;
import net.C_47cu;
import net.C_47dR;
import net.C_47da;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47iC;
import net.C_47mK;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47oY;
import net.C_47ob;
import net.C_47rf;
import client.render.RenderUtils;
import net.C_47ru;
import net.C_47si;
import client.module.Category;
import net.C_47tf;
import net.C_47vS;
import net.C_47xz;
import net.C_47zh;
import net.C_48p;
import net.C_49S;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Debug_47kF extends client.module.Module implements net.C_47si,net.C_47iC,net.C_47xz,client.event.RenderListener,net.C_47mK,net.C_47hi,net.C_47mz,net.C_475U {
    public final client.setting.BooleanSetting settingRangeDebug = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingIgnoreBackTrack = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMinRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingDecimalPlaces = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingTimerRangeDebug = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingLagRangeDebug = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingTimeManipulation = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingHitBug = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingServersideChat = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSoundName = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBlink = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingTransaction = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyDebugChat = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingKit1V1Damage = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingAutoClickerDebug = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingPlaceDebug = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSneakDebug = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingLostHitDebug = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingMotionDebug = null; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_43Q; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_47y; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_43p; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_434; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_47e; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_43t; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_47w; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_43_; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_479; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_41; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_43r; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_47Q; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_472; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_43B; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_47W; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_47u; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.ModeSetting field_432; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_47X; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_43e; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting field_43L; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_43F; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.CopyOnWriteArrayList field_43S = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_47R = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43Z; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_477; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_47s; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_437; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43f; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_43E = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43z = null; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_473; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_47J; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.player.EntityPlayer field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.player.EntityPlayer field_43J; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43W = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43R = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_473X field_43s = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43d; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_471; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_43I; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_43A = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43n; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43U; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.LinkedList field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.LinkedList field_43w = null; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_43Y; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43b = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_431; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_43g = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.player.EntityPlayer field_43i; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_47B; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_478; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47S9 field_43H = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_47x; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_47P; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_430; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_43k; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_47U; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_43M; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_436; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_49S field_47S; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_49S field_43V; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_49S field_43l; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_47c; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47S9 field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47S9 field_43o = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47S9 field_43C = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47S9 field_43v = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47S9 field_435 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47S9 field_47v = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47S9 field_43T = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_47p; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43q; // Runtime access flags and ConstantValue are restored from the original class.
    private double field_43D; // Runtime access flags and ConstantValue are restored from the original class.
    private static int field_433; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

   public List method_46$68550b5278(long var1) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 7222826089277L;
      int var3 = (int)((var1 ^ 7222826089277L) >>> 32);
      int var4 = (int)((var1 ^ 7222826089277L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      return recovery$indy$1(this, var3, (char)var4, SourceDataLine.class, (short)var5, 2132499330006890463L, var1);
   }



   public void method_46$e535f8442d(C_47zh var1, long var2, short var4) {
      long var5 = var2 << 16 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 117607217143676L;
      long var9 = var5 ^ 13538434133415L;
      if (!recovery$indy$2(this.field_46, 500L, var7, 1773579199436412956L, var5)) {
         recovery$indy$3(var1, var9, true, 1766778891483499730L, var5);
      }
   }



    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   private float method_42$20dc3c8462(byte var1, C_47da var2, float var3, long var4, EntityPlayer var6) {
      long var7 = ((long)var1 << 56 | var4 << 8 >>> 8) ^ a;
      long var9 = var7 ^ 1828351340638L;
      if (!var2.method_49$aae029aa0a()) {
         float var11 = 25.0F - recovery$indy$4(this, var9, -2234869653704973970L, var7);
         float var12 = var3 * var11;
         var3 = var12 / 25.0F;
      }

      return var3;
   }



   public void method_42$9035875d26(long var1, C_47ob var3) {
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$39ef26e5b0(C_42q var1, long var2) {
      recovery$indy$5(4909154819693191378L, var2).getClass();
   }



   public void method_41$9035875d26(long var1, C_47ob var3) {
      int[] var72;
      long var4;
      long var8;
      long var12;
      int[] var18;
      C_473U var19;
      int var68;
      int[] var85;
      label239: {
         var4 = var1 ^ 26964132161391L;
         long var6 = var1 ^ 68431502208942L;
         var8 = var1 ^ 97909611691155L;
         long var10 = var1 ^ 19942097427407L;
         var12 = var1 ^ 122666649893823L;
         long var14 = var1 ^ 29777652721136L;
         long var16 = var1 ^ 93087810693986L;
         long var10000 = -7191062537881169219L;
         var18 = ClientSettings_47kr.method_46$d4d28024c9();
         long var10001 = -7193661757843844528L;
         C_47ob var21 = var3;
         var19 = var21.method_46$96fcbedb66();
         long var79 = -7193933311112635330L;
         BooleanSetting var22 = this.settingAutoClickerDebug;
         var68 = (int) ((var22.method_49$aae029aa0a()) ? 1 : 0);
         label238:
         if (var18 == null) {
            label236:
            if (var68 != 0) {
               long var10003 = -7192674978617533265L;
               long var23 = var10;
               long var25 = 500L;
               C_47cu var27 = this.field_43E;
               var68 = (int) ((var27.method_42$b0e346e6e3(var25, var23)) ? 1 : 0);
               var85 = var18;
               if (var1 >= 0L) {
                  if (var18 == null) {
                     if (var68 != 0) {
                        this.field_43z.clear();
                     }

                     var68 = (int) ((var19 instanceof C_479E) ? 1 : 0);
                  }

                  var85 = var18;
               }

               label233: {
                  label232:
                  if (var85 == null) {
                     if (var68 != 0) {
                        var10003 = -7192674978617533265L;
                        long var28 = var10;
                        long var30 = 250L;
                        C_47cu var32 = this.field_43E;
                        var68 = (int) ((var32.method_42$b0e346e6e3(var30, var28)) ? 1 : 0);
                        var85 = var18;
                        if (var1 < 0L) {
                           break label233;
                        }

                        if (var18 != null) {
                           break label232;
                        }

                        if (var68 == 0) {
                           this.field_43z.add(this.field_43f);

                           label225: {
                              label224: {
                                 while (true) {
                                    if (this.field_43z.size() > 20) {
                                       this.field_43z.remove(0);
                                       int[] var69 = var18;
                                       if (var1 > 0L) {
                                          if (var18 != null) {
                                             break;
                                          }

                                          var69 = var18;
                                       }

                                       if (var69 == null) {
                                          continue;
                                       }
                                    }

                                    var68 = this.field_43z.size();
                                    if (var1 <= 0L) {
                                       break label238;
                                    }

                                    if (var68 > 19) {
                                       StringBuilder var70 = new StringBuilder().append("Clicks: ");
                                       long var10004 = -7192616280712332033L;
                                       int var33 = this.field_43f;
                                       long var34 = var6;
                                       Debug_47kF var36 = this;
                                       StringBuilder var71 = var70.append(var36.method_49$f5c21a4be8(var34, var33)).append(this.field_43f).append("§r CPS: ");
                                       var10003 = -7193127398031103769L;
                                       ArrayList var37 = this.field_43z;
                                       long var38 = var16;
                                       String var82 = var71.append(
                                             recovery$indy$6(C_47bg.method_45$ca691cb1e6(var38, var37) * 20.0, var14, 0, -7193408753424511528L, var1)
                                          )
                                          .toString();
                                       long var10002 = -7192272573799087471L;
                                       String var40 = var82;
                                       long var41 = var4;
                                       C_475e.method_46$d07b98bfef(var41, var40);
                                       var72 = var18;
                                       if (var1 <= 0L) {
                                          break label225;
                                       }

                                       if (var18 == null) {
                                          break label224;
                                       }
                                    }
                                    break;
                                 }

                                 StringBuilder var73 = new StringBuilder().append("Clicks: ");
                                 long var101 = -7192616280712332033L;
                                 int var43 = this.field_43f;
                                 long var44 = var6;
                                 Debug_47kF var46 = this;
                                 String var83 = var73.append(var46.method_49$f5c21a4be8(var44, var43)).append(this.field_43f).toString();
                                 long var94 = -7192272573799087471L;
                                 String var47 = var83;
                                 long var48 = var4;
                                 C_475e.method_46$d07b98bfef(var48, var47);
                              }

                              this.field_43f = 0;
                              var72 = var18;
                           }

                           if (var72 == null) {
                              break label236;
                           }
                        }
                     }

                     var68 = (int) ((var19 instanceof C_47bi) ? 1 : 0);
                  }

                  var85 = var18;
               }

               if (var85 != null) {
                  break label238;
               }

               if (var68 != 0) {
                  long var84 = -7194213052758808879L;
                  Minecraft var50 = field_43;
                  var68 = (int) ((var50.field_44K.field_42) ? 1 : 0);
                  var85 = var18;
                  if (var1 <= 0L) {
                     break label239;
                  }

                  if (var18 != null) {
                     break label238;
                  }

                  if (!var50.field_44K.field_42) {
                     long var86 = -7194285501318211925L;
                     C_47cu var51 = this.field_43E;
                     var51.method_46$da8c82d5d4();
                     this.field_43f++;
                  }
               }
            }

            var68 = (int) ((var19 instanceof C_45W) ? 1 : 0);
         }

         var85 = var18;
      }

      label189: {
         label188:
         if (var85 == null) {
            label186:
            if (var68 != 0) {
               BooleanSetting var74 = this.field_47u;
               if (var18 == null) {
                  if (this.field_47u == null) {
                     break label186;
                  }

                  var74 = this.field_47u;
               }

               long var87 = -7193933311112635330L;
               BooleanSetting var52 = var74;
               var68 = (int) ((var52.method_49$aae029aa0a()) ? 1 : 0);
               if (var18 != null) {
                  break label188;
               }

               if (var68 != 0 && this.field_43I != null) {
                  C_40y var20 = ((C_45W)var19).method_42$c4164528f2();
                  C_40y var75 = var20;
                  C_40y var88 = C_40y.START_SPRINTING;
                  if (var18 == null) {
                     label174:
                     if (var20 == C_40y.START_SPRINTING) {
                        Debug_47kF var76 = this;
                        if (var1 >= 0L) {
                           if (var18 == null) {
                              if (this.field_43n < 0) {
                                 break label174;
                              }

                              this.field_44.add(this.field_43U);
                              this.field_43w.add(this.field_43n);
                           }

                           var76 = this;
                        }

                        var76.field_43n = -1;
                     }

                     var75 = var20;
                     var88 = C_40y.STOP_SPRINTING;
                  }

                  if (var75 == var88) {
                     long var89 = -7195852642817520333L;
                     Minecraft var53 = field_43;
                     var68 = (int) ((var53.field_42P.field_48d) ? 1 : 0);
                     var85 = var18;
                     if (var1 <= 0L) {
                        break label189;
                     }

                     if (var18 != null) {
                        break label188;
                     }

                     if (!var53.field_42P.field_48d) {
                        this.field_43n = 0;
                     }
                  }
               }
            }

            var68 = (int) ((var19 instanceof C_42V) ? 1 : 0);
         }

         var85 = var18;
      }

      if (var85 == null) {
         if (var68 == 0) {
            return;
         }

         long var91 = -7193933311112635330L;
         BooleanSetting var54 = this.settingPlaceDebug;
         var68 = (int) ((var54.method_49$aae029aa0a()) ? 1 : 0);
      }

      if (var68 != 0) {
         label148: {
            label147: {
               C_42V var67 = (C_42V)var19;
               int[] var77 = var18;
               if (var1 >= 0L) {
                  if (var18 == null) {
                     long var95 = -7192852200957474556L;
                     long var55 = var8;
                     C_47S9 var57 = this.field_43H;
                     if (!var57.method_48$0dd78e0064(var55)) {
                        break label147;
                     }

                     StringBuilder var78 = new StringBuilder().append("Delay: ").append(this.field_47B).append("  AVG: ");
                     long var100 = -7193553389576729465L;
                     long var58 = var12;
                     C_47S9 var60 = this.field_43H;
                     String var92 = var78.append(var60.method_43$474dfaa627(var58) * 20.0).toString();
                     var95 = -7192272573799087471L;
                     String var61 = var92;
                     long var62 = var4;
                     C_475e.method_46$d07b98bfef(var62, var61);
                  }

                  var77 = var18;
               }

               if (var77 == null) {
                  break label148;
               }
            }

            String var93 = "Delay: " + this.field_47B;
            long var97 = -7192272573799087471L;
            String var64 = var93;
            long var65 = var4;
            C_475e.method_46$d07b98bfef(var65, var64);
         }

         this.field_47B = 0;
         this.field_478++;
      }
   }







   public void method_41$426c33b229(C_477z var1, long var2) {
      long var4 = (var2 ^ 101388757205635L) >>> 8;
      int var6 = (int)((var2 ^ 101388757205635L) << 56 >>> 56);
      long var7 = var2 ^ 46613554740368L;
      long var9 = var2 ^ 15371207648918L;
      long var10000 = 8135525081519799918L;
      int[] var11 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 8141489559203937862L;
      C_477z var15 = var1;
      boolean var42 = var15.method_46$5927cfd1db() instanceof EntityLivingBase;
      if (var11 == null) {
         if (var42) {
            Debug_47kF var43 = this;
            if (var11 == null) {
               long var10002 = 8141489559203937862L;
               C_477z var16 = var1;
               if (this.field_43I != var16.method_46$5927cfd1db()) {
                  this.field_47p = -1;
               }

               var10002 = 8141489559203937862L;
               C_477z var17 = var1;
               this.field_43I = (EntityLivingBase)var17.method_46$5927cfd1db();
               var43 = this;
            }

            var10001 = 8141317602549086840L;
            C_47cu var18 = var43.field_43A;
            var18.method_46$da8c82d5d4();
         }

         var10001 = 8141489559203937862L;
         C_477z var19 = var1;
         var42 = var19.method_46$5927cfd1db() instanceof EntityLivingBase;
      }

      label86: {
         if (var11 == null) {
            if (var42) {
               long var62 = 8141489559203937862L;
               C_477z var20 = var1;
               this.field_431 = (EntityLivingBase)var20.method_46$5927cfd1db();
               var10001 = 8141317602549086840L;
               C_47cu var21 = this.field_43g;
               var21.method_46$da8c82d5d4();
            }

            var10000 = 8134853413999186966L;
            Client.method_44$fbc0c0be91().getClass();
            if (var11 != null) {
               break label86;
            }

            var10001 = 8140543888691949805L;
            BooleanSetting var22 = this.settingRangeDebug;
            var42 = var22.method_49$aae029aa0a();
         }

         if (var42) {
            double var12;
            label69: {
               var10001 = 8140543888691949805L;
               BooleanSetting var23 = this.settingIgnoreBackTrack;
               if (var23.method_49$aae029aa0a()) {
                  var10001 = 8138062148047970784L;
                  Minecraft var24 = field_43;
                  C_47tf var46 = var24.field_42P.method_49$41b79b67a0(1.0F);
                  long var63 = 8141057103543318228L;
                  Minecraft var25 = field_43;
                  var12 = var46.method_43$3d77d36e13(var25.field_42Y.field_45);
                  if (var11 == null) {
                     break label69;
                  }
               }

               var10001 = 8142012370181900232L;
               C_47Ij var14 = C_4749.method_48$992a97c4ca(var9);
               var10001 = 8138062148047970784L;
               Minecraft var26 = field_43;
               var12 = var26.field_42P.method_49$41b79b67a0(1.0F).method_43$3d77d36e13(var14.field_45);
            }

            long var10003 = 8140612279003693820L;
            long var27 = var7;
            NumberSetting var29 = this.settingMinRange;
            if (var12 >= var29.method_44$474dfaa627(var27)) {
               StringBuilder var57 = new StringBuilder().append(recovery$indy$7(18821, 2452393753993883013L ^ var2));
               long var10005 = 8140612279003693820L;
               long var30 = var7;
               NumberSetting var32 = this.settingDecimalPlaces;
               int var67 = (int)var32.method_44$474dfaa627(var30);
               long var10004 = 8140982662632520831L;
               String var64 = var57.append(C_47bg.method_43$f4fdfb5f6c(var12, var67)).toString();
               byte var69 = (byte)var6;
               var10004 = 8135427790199131180L;
               String var33 = var64;
               byte var34 = var69;
               long var35 = var4;
               Debug_47kF var37 = this;
               var37.method_49$2de4c0eff3(var35, var34, var33);
            }
         }

         var10000 = 8134853413999186966L;
         Client.method_44$fbc0c0be91().getClass();
      }

      var10001 = 8141057103543318228L;
      Minecraft var38 = field_43;
      C_47Ij var48 = var38.field_42Y;
      if (var11 == null) {
         if (var38.field_42Y == null) {
            return;
         }

         var10001 = 8141057103543318228L;
         Minecraft var39 = field_43;
         var48 = var39.field_42Y;
      }

      if (var48.field_47 instanceof EntityPlayer) {
         long var66 = 8141057103543318228L;
         Minecraft var40 = field_43;
         this.field_43J = (EntityPlayer)var40.field_42Y.field_47;
         var10001 = 8141317602549086840L;
         C_47cu var41 = this.field_48;
         var41.method_46$da8c82d5d4();
      }
   }





   private float method_40$bdb59743b1(long var1, float var3, float[] var4) {
      float var14;
      var1 = a ^ var1;
      float var6 = Float.MAX_VALUE;
      int[] var10000 = recovery$indy$8(6733250551867151352L, var1);
      int var7 = 0;
      int[] var5 = var10000;
      int var8 = 0;

      label48:
      while (true) {
         float[] var12;
         int var10001;
         if (var8 < var4.length) {
            var12 = var4;
            var10001 = var8;
         } else {
            var12 = var4;
            var10001 = var7;
            if (var1 > 0L) {
               var14 = var4[var7];
               break;
            }
         }

         do {
            float var9 = var12[var10001];
            float var10 = Math.abs(var9 - var3);
            var10000 = var5;
            if (var1 >= 0L) {
               if (var5 == null) {
                  if (var5 != null) {
                     return var10;
                  }

                  float var16;
                  int var15 = (var16 = var10 - var6) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
                  if (var1 > 0L) {
                     if (var15 < 0) {
                        var6 = var10;
                        var7 = var8;
                     }
                  } else {
                     var7 = var15;
                  }

                  var8++;
                  var10000 = var5;
               } else {
                  var10000 = var5;
               }
            }

            if (var10000 == null) {
               continue label48;
            }

            var12 = var4;
            var10001 = var7;
         } while (var1 <= 0L);

         var14 = var4[var7];
         break;
      }

      return var14;
   }



   public SourceDataLine method_40$604a79dbf2(int var1, int var2, String var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 65547045269599L;
      return (SourceDataLine)recovery$indy$9(this, SourceDataLine.class, var7, var3, -2294229389790959790L, var5);
   }



    public void method_40$9035875d26(long a0,net.C_47ob a1) {
        long computed9;
        long computed11;
        long computed13;
        long computed14;
        long computed16;
        long computed17;
        int converted18;
        long computed20;
        long computed21;
        int converted22;
        long computed24;
        long computed25;
        int converted26;
        long computed28;
        long computed29;
        int converted30;
        long computed32;
        long computed33;
        int converted34;
        long computed36;
        long computed37;
        int converted38;
        long computed40;
        long computed41;
        int converted42;
        long computed44;
        long computed46;
        long computed48;
        long computed50;
        long computed52;
        long computed54;
        java.lang.Object value56;
        java.lang.Object value59;
        java.lang.Object value60;
        java.lang.Object value62;
        java.lang.Object regionValue84;
        java.lang.Object value277;
        int comparison278;
        java.lang.Object regionValue300;
        java.lang.Object value528;
        boolean value529;
        java.lang.Object value635;
        java.lang.Object value637;
        java.lang.Object value638;
        boolean value876;
        java.lang.Object value1004;
        float value1006;
        float value1008;
        float computed1009;
        int comparison1011;
        int comparison1264;
        int comparison1357;
        double converted1490;
        double value1491;
        double converted1493;
        double value1494;
        int comparison1496;
        java.lang.StringBuilder initialized1566;
        java.lang.Object value1567;
        java.lang.Object value1568;
        java.lang.Object value1569;
        java.lang.Object value1570;
        java.lang.Object value1571;
        java.lang.Object value1572;
        java.lang.Object value1573;
        java.lang.Object value1576;
        java.lang.Object value1620;
        java.lang.Object edgeValue1664;
        java.lang.Object regionValue1687;
        java.lang.Object edgeValue1709;
        java.lang.Object regionValue1731;
        java.lang.Object edgeValue1753;
        java.lang.Object value1838;
        int comparison1839;
        java.lang.Object regionValue1861;
        java.lang.Object value2089;
        boolean value2090;
        java.lang.Object value2196;
        java.lang.Object value2198;
        java.lang.Object value2199;
        boolean value2305;
        int regionValue2327;
        int edgeValue2349;
        int edgeValue2393;
        java.lang.Object value2564;
        int value2565;
        java.lang.Object value2676;
        java.lang.Object value2678;
        java.lang.Object value2679;
        int value2680;
        java.lang.Object value2786;
        java.lang.Object regionValue2808;
        java.lang.Object value3024;
        java.lang.Object value3047;
        java.lang.Object value3048;
        float value3050;
        float value3051;
        java.lang.Object regionValue3073;
        java.lang.Object edgeValue3099;
        java.lang.Object regionValue3125;
        java.lang.Object edgeValue3151;
        java.lang.Object regionValue3177;
        float regionValue3178;
        float regionValue3179;
        java.lang.Object edgeValue3201;
        java.lang.Object regionValue3225;
        java.lang.Object edgeValue3250;
        java.lang.Object regionValue3275;
        java.lang.Object edgeValue3300;
        java.lang.Object edgeValue3325;
        java.lang.Object value3330;
        boolean value3332;
        java.lang.Object regionValue3354;
        float regionValue3356;
        float regionValue3357;
        int regionValue3359;
        java.lang.Object edgeValue3381;
        int edgeValue3386;
        java.lang.Object regionValue3408;
        java.lang.Object edgeValue3435;
        int edgeValue3440;
        java.lang.Object regionValue3462;
        float regionValue3464;
        float regionValue3465;
        java.lang.Object edgeValue3488;
        java.lang.Object regionValue3514;
        java.lang.Object edgeValue3539;
        java.lang.Object regionValue3564;
        java.lang.Object edgeValue3589;
        java.lang.Object value3593;
        java.lang.Object value3595;
        int value3596;
        int value3597;
        double converted3598;
        float value3600;
        float computed3601;
        double computed3603;
        float converted3604;
        boolean value3606;
        java.lang.Object regionValue3628;
        int regionValue3633;
        java.lang.Object edgeValue3655;
        int edgeValue3660;
        java.lang.Object regionValue3682;
        java.lang.Object edgeValue3710;
        int edgeValue3716;
        java.lang.Object regionValue3738;
        float regionValue3742;
        java.lang.Object edgeValue3764;
        java.lang.Object regionValue3790;
        java.lang.Object edgeValue3817;
        java.lang.Object regionValue3844;
        java.lang.Object edgeValue3871;
        int comparison3877;
        java.lang.Object edgeValue3899;
        java.lang.Object edgeValue3926;
        java.lang.Object regionValue3952;
        java.lang.Object edgeValue3978;
        java.lang.Object value3983;
        java.lang.Object value3985;
        java.lang.Object value3986;
        java.lang.Object regionValue4008;
        java.lang.Object regionValue4013;
        java.lang.Object edgeValue4035;
        java.lang.Object regionValue4062;
        java.lang.Object edgeValue4089;
        java.lang.Object regionValue4116;
        java.lang.Object edgeValue4143;
        java.lang.Object edgeValue4170;
        java.lang.Object regionValue4196;
        java.lang.Object edgeValue4222;
        java.lang.Object regionValue4248;
        java.lang.Object edgeValue4274;
        java.lang.Object value4279;
        java.lang.Object value4281;
        java.lang.Object value4282;
        java.lang.Object edgeValue4304;
        java.lang.Object value4310;
        boolean value4311;
        java.lang.Object edgeValue4333;
        java.lang.Object regionValue4359;
        java.lang.Object edgeValue4384;
        java.lang.Object value4391;
        java.lang.Object value4392;
        float value4393;
        java.lang.Object edgeValue4416;
        java.lang.Object edgeValue4442;
        float edgeValue4444;
        java.lang.Object edgeValue4466;
        float edgeValue4469;
        java.lang.Object regionValue4492;
        float regionValue4494;
        float regionValue4495;
        java.lang.Object edgeValue4519;
        float edgeValue4521;
        float edgeValue4522;
        java.lang.Object regionValue4546;
        float regionValue4548;
        float regionValue4549;
        java.lang.Object edgeValue4573;
        float edgeValue4575;
        float edgeValue4576;
        java.lang.Object regionValue4600;
        float regionValue4602;
        float regionValue4603;
        java.lang.Object edgeValue4627;
        float edgeValue4629;
        float edgeValue4630;
        boolean value4633;
        java.lang.Object edgeValue4655;
        float edgeValue4657;
        float edgeValue4658;
        int edgeValue4660;
        java.lang.Object edgeValue4682;
        float edgeValue4683;
        float edgeValue4684;
        java.lang.Object regionValue4706;
        float regionValue4708;
        float regionValue4709;
        java.lang.Object edgeValue4732;
        float edgeValue4734;
        float edgeValue4735;
        java.lang.Object edgeValue4758;
        float edgeValue4760;
        float edgeValue4761;
        java.lang.Object value4764;
        java.lang.Object value4766;
        int value4767;
        int value4768;
        double converted4769;
        float value4771;
        float computed4772;
        int comparison4774;
        java.lang.Object regionValue4796;
        float regionValue4799;
        java.lang.Object edgeValue4823;
        float edgeValue4826;
        java.lang.Object regionValue4850;
        float regionValue4853;
        java.lang.Object edgeValue4877;
        float edgeValue4880;
        double computed4883;
        float converted4884;
        java.lang.Object regionValue4906;
        float regionValue4907;
        float regionValue4908;
        float regionValue4909;
        java.lang.Object edgeValue4931;
        float edgeValue4933;
        java.lang.Object regionValue4956;
        java.lang.Object edgeValue4983;
        java.lang.Object regionValue5010;
        java.lang.Object edgeValue5037;
        java.lang.Object edgeValue5065;
        boolean value5071;
        int comparison5072;
        java.lang.Object regionValue5094;
        float regionValue5097;
        int regionValue5098;
        java.lang.Object edgeValue5120;
        float edgeValue5123;
        int edgeValue5124;
        java.lang.Object regionValue5146;
        float regionValue5149;
        java.lang.Object edgeValue5173;
        float edgeValue5176;
        int edgeValue5178;
        java.lang.Object edgeValue5200;
        float edgeValue5202;
        java.lang.Object regionValue5224;
        float regionValue5227;
        java.lang.Object edgeValue5250;
        float edgeValue5253;
        java.lang.Object regionValue5276;
        float regionValue5279;
        java.lang.Object edgeValue5302;
        float edgeValue5305;
        int comparison5307;
        java.lang.Object edgeValue5329;
        float edgeValue5332;
        java.lang.Object edgeValue5355;
        float edgeValue5357;
        java.lang.Object regionValue5379;
        float regionValue5382;
        java.lang.Object edgeValue5404;
        float edgeValue5407;
        java.lang.Object value5408;
        java.lang.Object value5410;
        java.lang.Object value5411;
        java.lang.Object regionValue5433;
        float regionValue5436;
        java.lang.Object regionValue5437;
        java.lang.Object edgeValue5459;
        float edgeValue5462;
        java.lang.Object regionValue5485;
        float regionValue5488;
        java.lang.Object edgeValue5511;
        float edgeValue5514;
        java.lang.Object regionValue5537;
        float regionValue5540;
        java.lang.Object edgeValue5563;
        float edgeValue5566;
        java.lang.Object edgeValue5589;
        float edgeValue5591;
        java.lang.Object regionValue5613;
        float regionValue5616;
        java.lang.Object edgeValue5638;
        float edgeValue5641;
        java.lang.Object regionValue5663;
        float regionValue5666;
        java.lang.Object edgeValue5688;
        float edgeValue5691;
        java.lang.Object value5692;
        java.lang.Object value5694;
        java.lang.Object value5695;
        java.lang.Object edgeValue5717;
        float edgeValue5720;
        java.lang.Object value5722;
        boolean value5723;
        java.lang.Object edgeValue5745;
        float edgeValue5747;
        java.lang.Object regionValue5769;
        java.lang.Object edgeValue5793;
        java.lang.Object value5799;
        java.lang.Object value5800;
        float value5801;
        java.lang.Object edgeValue5824;
        java.lang.Object value5827;
        float computed5828;
        byte converted5829;
        int value5830;
        int value5833;
        java.lang.Object value5834;
        int value5836;
        java.lang.Object value5839;
        java.lang.Object value5840;
        java.lang.Object value5841;
        float value5842;
        java.lang.Object edgeValue5864;
        float edgeValue5865;
        float edgeValue5866;
        float value5868;
        java.lang.Object value5869;
        float computed5870;
        float computed5871;
        byte converted5872;
        int value5873;
        int value5876;
        java.lang.Object value5877;
        int value5879;
        java.lang.Object value5882;
        java.lang.Object value5883;
        java.lang.Object value5884;
        float value5885;
        java.lang.Object value5887;
        float computed5888;
        byte converted5889;
        int value5890;
        int value5893;
        java.lang.Object value5894;
        int value5896;
        java.lang.Object value5899;
        java.lang.Object value5900;
        java.lang.Object value5901;
        float value5902;
        double value5904;
        int comparison5905;
        int comparison5906;
        int regionValue5928;
        float regionValue5974;
        float edgeValue5999;
        float regionValue6046;
        float edgeValue6070;
        float regionValue6094;
        float edgeValue6118;
        float regionValue6163;
        float edgeValue6186;
        double converted6188;
        double value6189;
        char converted6190;
        char converted6191;
        double value6192;
        int value6193;
        int value6194;
        java.lang.Object value6199;
        boolean value6200;
        int value6201;
        double converted6202;
        double value6203;
        char converted6204;
        char converted6205;
        double value6206;
        int value6207;
        int value6208;
        java.lang.Object value6213;
        boolean value6214;
        int value6215;
        int regionValue6237;
        float regionValue6281;
        float edgeValue6306;
        float regionValue6375;
        float edgeValue6399;
        float regionValue6423;
        float edgeValue6447;
        float regionValue6493;
        float edgeValue6517;
        float regionValue6541;
        float edgeValue6565;
        float regionValue6611;
        float edgeValue6634;
        float regionValue6657;
        float edgeValue6680;
        java.lang.StringBuilder initialized6682;
        java.lang.Object value6683;
        double value6684;
        java.lang.Object value6685;
        java.lang.Object value6686;
        java.lang.Object value6687;
        double converted6688;
        java.lang.Object value6689;
        java.lang.Object value6690;
        java.lang.Object value6691;
        java.lang.Object value6694;
        int comparison6888;
        java.lang.Object regionValue6911;
        long regionValue6912;
        java.lang.Object edgeValue6936;
        long edgeValue6937;
        java.lang.Object edgeValue6986;
        long edgeValue6987;
        java.lang.Object value7041;
        java.lang.Object edgeValue7148;
        long edgeValue7149;
        boolean value7172;
        int edgeValue7194;
        int edgeValue7216;
        int regionValue7239;
        int edgeValue7261;
        int regionValue7283;
        int edgeValue7305;
        java.lang.Object value7390;
        int value7391;
        java.lang.Object value7502;
        java.lang.Object value7504;
        java.lang.Object value7505;
        int value7506;
        boolean value7721;
        int edgeValue7743;
        java.lang.Object value7829;
        float value7831;
        float value7832;
        float computed7833;
        int comparison7835;
        int regionValue7859;
        double value8212;
        int comparison8213;
        java.lang.Object value8353;
        double value8378;
        double converted8379;
        double computed8380;
        float value8403;
        java.lang.Object value8425;
        java.lang.Object edgeValue8469;
        java.lang.Object regionValue8492;
        java.lang.Object edgeValue8514;
        java.lang.Object regionValue8536;
        java.lang.Object edgeValue8558;
        java.lang.Object value8643;
        java.lang.Object value8666;
        java.lang.Object value8667;
        boolean value8668;
        int regionValue8690;
        int edgeValue8712;
        int edgeValue8756;
        boolean value8862;
        int regionValue8884;
        int edgeValue8906;
        int edgeValue8950;
        java.lang.Object value9121;
        java.lang.Object value9123;
        java.lang.Object value9124;
        java.lang.Object value9230;
        int value9232;
        int comparison9233;
        int regionValue9255;
        java.lang.Object value9442;
        java.lang.Object value9444;
        java.lang.Object value9445;
        int value9446;
        java.lang.StringBuilder initialized9556;
        java.lang.Object value9557;
        int value9558;
        int value9559;
        int computed9560;
        int value9561;
        int value9562;
        int computed9563;
        int computed9564;
        double converted9565;
        double value9566;
        double computed9567;
        java.lang.Object value9568;
        java.lang.Object value9569;
        java.lang.Object value9572;
        boolean value9594;
        int edgeValue9616;
        int edgeValue9638;
        int edgeValue9661;
        int regionValue9683;
        int edgeValue9705;
        java.lang.Object value9769;
        java.lang.Object value9771;
        java.lang.Object value9772;
        java.lang.Object value9878;
        float value9880;
        float value9881;
        int comparison9882;
        int comparison9883;
        int regionValue9906;
        int regionValue10002;
        float value10206;
        float value10207;
        int comparison10208;
        int edgeValue10254;
        int comparison10256;
        int regionValue10279;
        int edgeValue10303;
        int regionValue10327;
        int edgeValue10351;
        int regionValue10375;
        int edgeValue10398;
        int regionValue10421;
        int edgeValue10444;
        int regionValue10467;
        int edgeValue10490;
        float value10557;
        float value10558;
        int comparison10559;
        int edgeValue10605;
        int comparison10607;
        int regionValue10629;
        int edgeValue10652;
        int regionValue10676;
        int edgeValue10700;
        int edgeValue10723;
        int regionValue10746;
        int edgeValue10769;
        int regionValue10792;
        int edgeValue10815;
        java.lang.StringBuilder initialized10859;
        java.lang.Object value10860;
        float value10861;
        float value10862;
        float computed10863;
        float value10864;
        float value10865;
        float computed10866;
        float computed10867;
        double converted10868;
        double value10869;
        java.lang.Object value10870;
        java.lang.Object value10871;
        java.lang.Object value10874;
        boolean value10896;
        int edgeValue10918;
        int edgeValue10940;
        int comparison10942;
        int regionValue10964;
        int edgeValue10987;
        int regionValue11010;
        int edgeValue11033;
        int regionValue11056;
        int edgeValue11078;
        int regionValue11100;
        int edgeValue11122;
        int regionValue11144;
        int edgeValue11166;
        java.lang.Object value11251;
        java.lang.Object value11253;
        java.lang.Object value11254;
        java.lang.Object value11360;
        java.lang.Object value11362;
        int length11364;
        int value11366;
        int regionValue11390;
        int regionValue11459;
        int edgeValue11483;
        int arrayValue11484;
        int value11485;
        int comparison11486;
        int regionValue11510;
        int edgeValue11535;
        int regionValue11560;
        int regionValue11561;
        int edgeValue11586;
        int edgeValue11587;
        int regionValue11612;
        int edgeValue11636;
        int regionValue11660;
        int regionValue11661;
        int edgeValue11685;
        int edgeValue11686;
        int regionValue11710;
        int regionValue11711;
        int edgeValue11735;
        int edgeValue11736;
        java.lang.Object value11737;
        java.lang.Object value11738;
        java.lang.Object value11739;
        java.lang.Object value11740;
        java.lang.Object value11741;
        boolean value11742;
        int edgeValue11764;
        int regionValue11788;
        int regionValue11789;
        int edgeValue11813;
        int edgeValue11814;
        int regionValue11838;
        int regionValue11839;
        int edgeValue11863;
        int edgeValue11864;
        int regionValue11888;
        int edgeValue11912;
        int regionValue11936;
        int edgeValue11960;
        int regionValue11984;
        int edgeValue12008;
        java.lang.Object value12009;
        java.lang.Object value12010;
        java.lang.Object value12011;
        int edgeValue12035;
        int incremented12036;
        int edgeValue12060;
        int edgeValue12084;
        int edgeValue12109;
        int comparison12131;
        boolean value12196;
        int edgeValue12218;
        int edgeValue12240;
        int regionValue12263;
        int edgeValue12285;
        int regionValue12307;
        int edgeValue12329;
        java.lang.Object value12414;
        java.lang.Object value12416;
        java.lang.Object value12417;
        java.lang.Object value12523;
        int value12525;
        java.lang.Object value12703;
        java.lang.Object value12705;
        java.lang.Object value12706;
        int value12707;
        java.lang.Object value12708;
        boolean value12710;
        int comparison12711;
        int regionValue12733;
        int edgeValue12756;
        int edgeValue12804;
        java.lang.Object value12985;
        int value12987;
        int computed12988;
        boolean value13010;
        int edgeValue13032;
        int edgeValue13054;
        int regionValue13077;
        int edgeValue13099;
        int regionValue13121;
        int edgeValue13143;
        java.lang.Object value13228;
        java.lang.Object value13230;
        java.lang.Object value13231;
        java.lang.Object value13337;
        byte value13339;
        int edgeValue13361;
        int edgeValue13407;
        java.lang.Object value13517;
        java.lang.Object value13519;
        java.lang.Object value13520;
        int value13521;
        java.lang.Object value13522;
        boolean value13524;
        int comparison13525;
        int regionValue13547;
        int edgeValue13570;
        int edgeValue13618;
        java.lang.Object value13799;
        int value13801;
        int computed13802;
        int value13803;
        int computed13804;
        int value13805;
        boolean value13827;
        int edgeValue13849;
        int edgeValue13871;
        int comparison13873;
        int regionValue13895;
        int edgeValue13918;
        int regionValue13941;
        int edgeValue13964;
        int regionValue13987;
        int edgeValue14009;
        int regionValue14031;
        int edgeValue14053;
        int regionValue14075;
        int edgeValue14097;
        java.lang.Object value14182;
        java.lang.Object value14184;
        java.lang.Object value14185;
        long value14291;
        long value14292;
        long computed14293;
        long value14295;
        java.lang.Object value14296;
        java.lang.Object value14297;
        boolean value14298;
        java.lang.Object value14341;
        int value14342;
        java.lang.Object value14406;
        java.lang.Object value14407;
        int comparison14408;
        int comparison14687;
        boolean value14776;
        int edgeValue14798;
        int edgeValue14820;
        int regionValue14843;
        int edgeValue14865;
        int regionValue14887;
        int edgeValue14909;
        java.lang.Object value14973;
        java.lang.Object value14975;
        java.lang.Object value14976;
        java.lang.Object value15082;
        byte value15084;
        int edgeValue15106;
        int edgeValue15152;
        java.lang.Object value15262;
        java.lang.Object value15264;
        java.lang.Object value15265;
        int value15266;
        java.lang.Object value15267;
        java.lang.Object value15334;
        java.lang.Object regionValue15356;
        int value15602;
        java.lang.Object value15669;
        int value15670;
        java.lang.Object value15776;
        int value15777;
        long value15993;
        java.lang.Object value15994;
        long value15995;
        long computed15996;
        int comparison15998;
        java.lang.Object value16170;
        boolean value16171;
        int comparison16172;
        int regionValue16194;
        int edgeValue16217;
        int edgeValue16263;
        java.lang.Object value16484;
        java.lang.Object value16486;
        long value16487;
        boolean value16532;
        int edgeValue16554;
        int edgeValue16576;
        int regionValue16599;
        int edgeValue16621;
        int regionValue16643;
        int edgeValue16665;
        java.lang.Object value16750;
        java.lang.Object value16752;
        java.lang.Object value16753;
        java.lang.Object value16859;
        int value16861;
        java.lang.Object value17039;
        java.lang.Object value17041;
        java.lang.Object value17042;
        int value17043;
        java.lang.Object value17044;
        java.lang.Object value17247;
        int comparison17248;
        java.lang.Object regionValue17270;
        int value17516;
        java.lang.Object value17583;
        int value17584;
        java.lang.Object value17690;
        int value17691;
        long value17907;
        java.lang.Object value17908;
        long value17909;
        long computed17910;
        int comparison17912;
        java.lang.Object value18084;
        boolean value18085;
        int comparison18086;
        int regionValue18108;
        int edgeValue18131;
        int edgeValue18177;
        java.lang.Object value18398;
        java.lang.Object value18400;
        long value18401;
        java.lang.Object value18446;
        java.lang.Object value18448;
        boolean value18449;
        int edgeValue18471;
        int edgeValue18493;
        int regionValue18515;
        int edgeValue18536;
        int regionValue18558;
        int edgeValue18580;
        boolean value18663;
        int comparison18664;
        int regionValue18685;
        int edgeValue18707;
        int edgeValue18753;
        java.lang.Object value18972;
        int value18974;
        int computed18975;
        java.lang.StringBuilder initialized18976;
        java.lang.Object value18977;
        int value18978;
        java.lang.Object value18979;
        java.lang.Object value18980;
        short value18981;
        java.lang.Object value18982;
        java.lang.Object value18983;
        boolean value18984;
        java.lang.Object value18985;
        java.lang.Object value18986;
        int value18987;
        java.lang.Object value18988;
        java.lang.Object value18989;
        java.lang.Object value18992;
        java.lang.Object value19013;
        java.lang.Object value19014;
        boolean value19015;
        int edgeValue19036;
        int edgeValue19057;
        int regionValue19079;
        int edgeValue19100;
        int regionValue19121;
        int edgeValue19142;
        java.lang.Object value19223;
        java.lang.Object value19224;
        java.lang.Object value19225;
        java.lang.Object regionValue19246;
        java.lang.Object value19452;
        java.lang.Object value19474;
        java.lang.Object value19475;
        boolean value19476;
        int comparison19477;
        int regionValue19498;
        int edgeValue19520;
        int edgeValue19564;
        int value19731;
        int regionValue19752;
        int value19978;
        int value20184;
        int value20516;
        int comparison20517;
        int regionValue20538;
        int value20744;
        int value20766;
        int computed20767;
        int value20789;
        int value20790;
        int value20791;
        int computed20792;
        int value20794;
        int value20795;
        int computed20796;
        int value20798;
        int value20799;
        int computed20800;
        java.lang.StringBuilder initialized20802;
        java.lang.Object value20803;
        int value20804;
        java.lang.Object value20805;
        java.lang.Object value20806;
        int regionValue20827;
        int regionValue20833;
        int edgeValue20854;
        int edgeValue20860;
        int regionValue20881;
        int regionValue20887;
        int edgeValue20908;
        int edgeValue20914;
        int regionValue20985;
        int edgeValue21011;
        int regionValue21037;
        int edgeValue21063;
        int edgeValue21089;
        int edgeValue21095;
        int regionValue21116;
        int edgeValue21142;
        int regionValue21168;
        int edgeValue21194;
        java.lang.StringBuilder initialized21200;
        java.lang.Object value21201;
        java.lang.Object value21202;
        java.lang.Object value21203;
        java.lang.Object regionValue21229;
        java.lang.StringBuilder initialized21256;
        java.lang.Object value21257;
        java.lang.Object value21258;
        java.lang.Object value21259;
        java.lang.Object edgeValue21311;
        java.lang.Object value21312;
        java.lang.Object value21313;
        int value21314;
        java.lang.Object value21315;
        java.lang.Object value21316;
        java.lang.StringBuilder initialized21695;
        java.lang.Object value21696;
        java.lang.Object value21697;
        java.lang.Object value21698;
        java.lang.Object regionValue21723;
        java.lang.StringBuilder initialized21749;
        java.lang.Object value21750;
        java.lang.Object value21751;
        java.lang.Object value21752;
        java.lang.Object edgeValue21802;
        java.lang.Object value21803;
        java.lang.Object value21804;
        java.lang.Object value21805;
        byte converted21806;
        int value21808;
        java.lang.Object value21811;
        java.lang.Object value21812;
        java.lang.StringBuilder initialized21813;
        java.lang.Object value21814;
        int value21815;
        java.lang.Object value21816;
        java.lang.Object value21817;
        java.lang.StringBuilder initialized22181;
        java.lang.Object value22182;
        java.lang.Object value22183;
        java.lang.Object value22184;
        java.lang.Object regionValue22208;
        java.lang.StringBuilder initialized22233;
        java.lang.Object value22234;
        java.lang.Object value22235;
        java.lang.Object value22236;
        java.lang.Object edgeValue22284;
        java.lang.Object value22285;
        java.lang.Object value22286;
        int value22287;
        java.lang.Object value22288;
        java.lang.Object value22289;
        java.lang.StringBuilder initialized22638;
        java.lang.Object value22639;
        java.lang.Object value22640;
        java.lang.Object value22641;
        java.lang.Object regionValue22664;
        java.lang.StringBuilder initialized22688;
        java.lang.Object value22689;
        java.lang.Object value22690;
        java.lang.Object value22691;
        java.lang.Object edgeValue22737;
        java.lang.Object value22738;
        java.lang.Object value22739;
        java.lang.Object value22740;
        byte converted22741;
        int value22743;
        java.lang.Object value22746;
        java.lang.Object value22747;
        boolean value22809;
        int edgeValue22830;
        int edgeValue22851;
        int regionValue22873;
        int edgeValue22894;
        int regionValue22915;
        int edgeValue22936;
        java.lang.Object value23017;
        int value23019;
        int regionValue23041;
        int regionValue23042;
        int edgeValue23065;
        int edgeValue23111;
        java.lang.Object value23238;
        java.lang.Object value23240;
        java.lang.Object value23241;
        int value23347;
        java.lang.Object value23348;
        java.lang.Object value23350;
        java.lang.Object value23351;
        int value23352;
        int value23573;
        int computed23574;
        int value23596;
        int edgeValue23684;
        java.lang.Object value23747;
        java.lang.Object regionValue23769;
        java.lang.Object value23984;
        int value24007;
        int value24073;
        int value24174;
        int computed24175;
        boolean value24196;
        int edgeValue24217;
        java.lang.Object value24388;
        java.lang.Object value24576;
        java.lang.Object value24578;
        boolean value24579;
        java.lang.Object value24671;
        double value24673;
        float value24674;
        double converted24675;
        double computed24676;
        float value24678;
        float value24679;
        java.lang.Object value24680;
        int comparison24756;
        java.lang.Object value24869;
        float regionValue25000;
        float regionValue25001;
        java.lang.Object value25158;
        boolean value25160;
        float regionValue25183;
        float regionValue25184;
        int regionValue25188;
        int edgeValue25216;
        int edgeValue25272;
        float regionValue25295;
        float regionValue25296;
        java.lang.Object value25431;
        java.lang.Object value25433;
        int value25434;
        int value25435;
        double converted25436;
        float value25438;
        float computed25439;
        double computed25441;
        float converted25442;
        boolean value25444;
        int regionValue25472;
        int edgeValue25500;
        int edgeValue25558;
        float regionValue25585;
        int comparison25725;
        java.lang.Object value25835;
        java.lang.Object value25837;
        java.lang.Object value25838;
        java.lang.Object regionValue25866;
        java.lang.Object value26142;
        java.lang.Object value26144;
        java.lang.Object value26145;
        java.lang.Object value26174;
        boolean value26175;
        java.lang.Object value26258;
        java.lang.Object value26259;
        float value26260;
        float edgeValue26311;
        float edgeValue26336;
        float regionValue26362;
        float regionValue26363;
        float edgeValue26390;
        float edgeValue26391;
        float regionValue26418;
        float regionValue26419;
        float edgeValue26446;
        float edgeValue26447;
        float regionValue26474;
        float regionValue26475;
        float edgeValue26502;
        float edgeValue26503;
        boolean value26508;
        float edgeValue26531;
        float edgeValue26532;
        int edgeValue26536;
        float edgeValue26558;
        float edgeValue26559;
        float regionValue26583;
        float regionValue26584;
        float edgeValue26610;
        float edgeValue26611;
        float edgeValue26637;
        float edgeValue26638;
        java.lang.Object value26643;
        java.lang.Object value26645;
        int value26646;
        int value26647;
        double converted26648;
        float value26650;
        float computed26651;
        int comparison26653;
        float regionValue26677;
        float edgeValue26705;
        float regionValue26733;
        float edgeValue26761;
        double computed26766;
        float converted26767;
        float regionValue26789;
        float regionValue26790;
        float regionValue26792;
        float edgeValue26815;
        boolean value26959;
        int comparison26960;
        float regionValue26984;
        int regionValue26987;
        float edgeValue27011;
        int edgeValue27014;
        float regionValue27038;
        float edgeValue27066;
        int edgeValue27070;
        float edgeValue27093;
        float regionValue27118;
        float edgeValue27145;
        float regionValue27172;
        float edgeValue27199;
        int comparison27203;
        float edgeValue27227;
        float edgeValue27253;
        float regionValue27278;
        float edgeValue27304;
        java.lang.Object value27307;
        java.lang.Object value27309;
        java.lang.Object value27310;
        float regionValue27334;
        java.lang.Object regionValue27337;
        float edgeValue27361;
        float regionValue27388;
        float edgeValue27415;
        float regionValue27442;
        float edgeValue27469;
        float edgeValue27495;
        float regionValue27520;
        float edgeValue27546;
        float regionValue27572;
        float edgeValue27598;
        java.lang.Object value27601;
        java.lang.Object value27603;
        java.lang.Object value27604;
        float edgeValue27628;
        java.lang.Object value27632;
        boolean value27633;
        float edgeValue27656;
        java.lang.Object value27711;
        java.lang.Object value27712;
        float value27713;
        java.lang.Object value27739;
        float computed27740;
        byte converted27741;
        int value27742;
        int value27745;
        int value27748;
        java.lang.Object value27751;
        java.lang.Object value27752;
        java.lang.Object value27753;
        float value27754;
        float edgeValue27776;
        float edgeValue27777;
        float value27780;
        java.lang.Object value27781;
        float computed27782;
        float computed27783;
        byte converted27784;
        int value27785;
        int value27788;
        int value27791;
        java.lang.Object value27794;
        java.lang.Object value27795;
        java.lang.Object value27796;
        float value27797;
        java.lang.Object value27799;
        float computed27800;
        byte converted27801;
        int value27802;
        int value27805;
        int value27808;
        java.lang.Object value27811;
        java.lang.Object value27812;
        java.lang.Object value27813;
        float value27814;
        java.lang.Object value27816;
        float computed27817;
        byte converted27818;
        int value27819;
        int value27822;
        int value27825;
        java.lang.Object value27828;
        java.lang.Object value27829;
        java.lang.Object value27830;
        float value27831;
        java.lang.Object value27833;
        float computed27834;
        float computed27835;
        byte converted27836;
        int value27837;
        int value27840;
        int value27843;
        java.lang.Object value27846;
        java.lang.Object value27847;
        java.lang.Object value27848;
        float value27849;
        java.lang.Object value27851;
        float computed27852;
        byte converted27853;
        int value27854;
        int value27857;
        int value27860;
        java.lang.Object value27863;
        java.lang.Object value27864;
        java.lang.Object value27865;
        float value27866;
        float regionValue27886;
        float edgeValue27911;
        float regionValue27936;
        float edgeValue27961;
        java.lang.Object value27968;
        int comparison27969;
        float regionValue27988;
        java.lang.Object regionValue27994;
        float edgeValue28013;
        float regionValue28038;
        float edgeValue28063;
        float regionValue28088;
        float edgeValue28113;
        float regionValue28138;
        float edgeValue28162;
        float regionValue28186;
        float edgeValue28210;
        float regionValue28234;
        float edgeValue28258;
        java.lang.Object value28264;
        float edgeValue28283;
        java.lang.Object value28290;
        java.lang.Object value28291;
        boolean value28292;
        int comparison28293;
        float regionValue28311;
        int regionValue28317;
        float edgeValue28336;
        int edgeValue28342;
        float regionValue28362;
        float edgeValue28388;
        int edgeValue28394;
        float regionValue28413;
        int regionValue28419;
        float edgeValue28437;
        float regionValue28462;
        float edgeValue28487;
        float regionValue28512;
        float edgeValue28537;
        float edgeValue28562;
        float regionValue28586;
        float edgeValue28610;
        java.lang.StringBuilder initialized28616;
        java.lang.Object value28617;
        java.lang.Object value28618;
        java.lang.Object value28619;
        java.lang.Object value28620;
        java.lang.Object value28621;
        java.lang.Object value28622;
        byte converted28623;
        int value28625;
        java.lang.Object value28628;
        java.lang.Object value28629;
        float edgeValue28648;
        float edgeValue28672;
        java.lang.Object value28681;
        boolean value28682;
        float edgeValue28700;
        int edgeValue28706;
        float edgeValue28724;
        int edgeValue28730;
        float regionValue28749;
        int regionValue28755;
        float edgeValue28773;
        int edgeValue28779;
        float regionValue28797;
        int regionValue28803;
        float edgeValue28821;
        int edgeValue28827;
        float regionValue28845;
        float edgeValue28868;
        float regionValue28891;
        float edgeValue28914;
        float regionValue28973;
        float edgeValue28997;
        float regionValue29021;
        float edgeValue29045;
        java.lang.Object value29052;
        int comparison29053;
        float regionValue29071;
        java.lang.Object regionValue29077;
        float edgeValue29095;
        float regionValue29119;
        float edgeValue29143;
        float regionValue29167;
        float edgeValue29191;
        float regionValue29255;
        float edgeValue29278;
        float regionValue29301;
        float edgeValue29324;
        java.lang.Object value29330;
        float edgeValue29348;
        java.lang.Object value29355;
        java.lang.Object value29356;
        boolean value29357;
        int regionValue29375;
        int edgeValue29393;
        float regionValue29411;
        float edgeValue29435;
        int edgeValue29441;
        float regionValue29479;
        float edgeValue29502;
        float regionValue29525;
        float edgeValue29548;
        float converted29554;
        float[] values29555;
        java.lang.Object value29560;
        java.lang.Object value29561;
        float value29562;
        double converted29564;
        float computed29565;
        float value29566;
        double converted29567;
        char converted29568;
        char converted29569;
        int value29571;
        int value29572;
        java.lang.Object value29577;
        boolean value29578;
        int comparison29579;
        float regionValue29597;
        int regionValue29603;
        float edgeValue29622;
        int edgeValue29628;
        float regionValue29647;
        float edgeValue29673;
        int edgeValue29680;
        float regionValue29699;
        int regionValue29705;
        float edgeValue29723;
        float regionValue29747;
        float edgeValue29772;
        float regionValue29797;
        float edgeValue29822;
        float regionValue29847;
        float edgeValue29870;
        float regionValue29893;
        float edgeValue29917;
        double converted29924;
        int comparison29925;
        float edgeValue29943;
        float edgeValue29967;
        int edgeValue29973;
        int comparison29975;
        float regionValue29993;
        int regionValue29999;
        float edgeValue30018;
        int edgeValue30024;
        float regionValue30043;
        int regionValue30049;
        float edgeValue30068;
        int edgeValue30074;
        float regionValue30093;
        int regionValue30099;
        float edgeValue30117;
        int edgeValue30123;
        float regionValue30141;
        int regionValue30147;
        float edgeValue30165;
        int edgeValue30171;
        float regionValue30189;
        int regionValue30195;
        float edgeValue30213;
        int edgeValue30219;
        float edgeValue30237;
        float regionValue30260;
        float edgeValue30283;
        double converted30289;
        char converted30290;
        char converted30291;
        double value30292;
        int value30293;
        int value30294;
        java.lang.Object value30299;
        boolean value30300;
        float edgeValue30318;
        int edgeValue30324;
        float edgeValue30342;
        int edgeValue30348;
        float regionValue30367;
        int regionValue30373;
        float edgeValue30391;
        int edgeValue30397;
        float regionValue30415;
        int regionValue30421;
        float edgeValue30439;
        int edgeValue30445;
        float edgeValue30463;
        float regionValue30486;
        float edgeValue30509;
        float regionValue30532;
        float edgeValue30556;
        float regionValue30580;
        float edgeValue30604;
        float regionValue30628;
        float edgeValue30652;
        int value30659;
        float edgeValue30677;
        float regionValue30701;
        float edgeValue30724;
        float regionValue30747;
        float edgeValue30770;
        byte converted30776;
        java.lang.String value30777;
        int value30778;
        java.lang.Object value30781;
        java.lang.Object value30782;
        float edgeValue30800;
        float edgeValue30823;
        int value30830;
        int computed30831;
        float edgeValue30849;
        float edgeValue30892;
        double converted30898;
        char converted30899;
        char converted30900;
        double value30901;
        int value30902;
        int value30903;
        java.lang.Object value30908;
        boolean value30909;
        float edgeValue30927;
        int edgeValue30933;
        float regionValue30951;
        float edgeValue30974;
        float edgeValue30997;
        double converted31003;
        char converted31004;
        char converted31005;
        double value31006;
        int value31007;
        int value31008;
        java.lang.Object value31013;
        boolean value31014;
        int edgeValue31032;
        int edgeValue31078;
        double converted31187;
        char converted31188;
        char converted31189;
        double value31190;
        int value31191;
        int value31192;
        java.lang.Object value31197;
        boolean value31198;
        int edgeValue31216;
        int edgeValue31262;
        double converted31417;
        char converted31418;
        char converted31419;
        double value31420;
        int value31421;
        int value31422;
        java.lang.Object value31427;
        boolean value31428;
        int edgeValue31446;
        int edgeValue31490;
        java.lang.StringBuilder initialized31639;
        java.lang.Object value31640;
        java.lang.Object value31641;
        java.lang.Object value31642;
        java.lang.Object value31643;
        java.lang.Object value31644;
        java.lang.Object value31645;
        java.lang.Object value31646;
        byte converted31647;
        int value31649;
        java.lang.Object value31652;
        java.lang.Object value31653;
        int value31674;
        int computed31675;
        java.lang.Object value31676;
        float converted31677;
        float[] values31678;
        java.lang.Object value31683;
        java.lang.Object value31684;
        float value31685;
        java.lang.Object value31686;
        boolean value31687;
        java.lang.Object value31706;
        float converted31707;
        java.lang.Object value31708;
        boolean value31709;
        int edgeValue31727;
        java.lang.Object value31762;
        int value31763;
        int comparison31832;
        java.lang.Object value31905;
        java.lang.Object value31906;
        java.lang.Object value32077;
        int value32078;
        int comparison32079;
        int regionValue32097;
        int regionValue32098;
        int edgeValue32116;
        int edgeValue32117;
        int regionValue32135;
        int regionValue32136;
        int edgeValue32154;
        int edgeValue32155;
        java.lang.Object value32207;
        java.lang.Object value32208;
        int comparison32209;
        java.lang.Object value32530;
        int value32531;
        int edgeValue32550;
        java.lang.Object value32682;
        java.lang.Object value32684;
        boolean value32685;
        java.lang.Object value32766;
        java.lang.Object value32767;
        java.lang.Object value32768;
        java.lang.Object value32769;
        java.lang.Object value32770;
        double value32771;
        java.lang.Object value32773;
        java.lang.Object value32774;
        java.lang.Object value32775;
        java.lang.Object value32776;
        java.lang.Object value32777;
        double value32778;
        double regionValue32792;
        double value32846;
        int comparison32849;
        char converted32922;
        char converted32923;
        int value32925;
        int value32926;
        java.lang.Object value32931;
        boolean value32932;
        byte converted33001;
        java.lang.String value33002;
        int value33003;
        java.lang.Object value33006;
        java.lang.Object value33007;
        java.lang.StringBuilder initialized33023;
        java.lang.Object value33024;
        java.lang.Object value33025;
        java.lang.Object value33026;
        java.lang.Object value33027;
        byte converted33028;
        int value33030;
        java.lang.Object value33033;
        java.lang.Object value33034;
        float value33060;
        double converted33061;
        java.lang.Object value33098;
        java.lang.Object regionValue33110;
        java.lang.Object value33279;
        java.lang.Object value33293;
        java.lang.Object value33294;
        java.lang.Object value33295;
        boolean value33296;
        int comparison33297;
        int regionValue33308;
        int edgeValue33319;
        int edgeValue33343;
        java.lang.Object value33408;
        java.lang.Object value33411;
        java.lang.Object value33412;
        boolean value33413;
        int edgeValue33424;
        int comparison33425;
        int regionValue33435;
        int edgeValue33446;
        int regionValue33458;
        int edgeValue33470;
        int regionValue33481;
        int edgeValue33491;
        int regionValue33502;
        int edgeValue33513;
        int regionValue33524;
        int edgeValue33535;
        java.lang.String value33566;
        java.lang.Object value33570;
        java.lang.Object value33571;
        java.lang.Object value33572;
        boolean value33592;
        int edgeValue33602;
        int edgeValue33612;
        int regionValue33623;
        int edgeValue33633;
        int regionValue33643;
        int edgeValue33653;
        boolean value33690;
        int edgeValue33700;
        int edgeValue33720;
        boolean value33786;
        int edgeValue33796;
        int edgeValue33816;
        boolean value33882;
        int edgeValue33892;
        int edgeValue33912;
        boolean value33978;
        int edgeValue33988;
        int edgeValue34008;
        boolean value34074;
        int edgeValue34084;
        int edgeValue34104;
        boolean value34170;
        int edgeValue34180;
        int edgeValue34200;
        boolean value34266;
        int edgeValue34276;
        int edgeValue34296;
        boolean value34362;
        int edgeValue34372;
        int edgeValue34392;
        boolean value34458;
        int edgeValue34468;
        int edgeValue34488;
        boolean value34554;
        int edgeValue34564;
        int edgeValue34584;
        boolean value34650;
        int edgeValue34660;
        int edgeValue34680;
        boolean value34746;
        int edgeValue34756;
        int edgeValue34776;
        boolean value34842;
        int edgeValue34852;
        int edgeValue34872;
        boolean value34938;
        int edgeValue34948;
        int edgeValue34968;
        boolean value35034;
        int edgeValue35044;
        int edgeValue35064;
        boolean value35130;
        int edgeValue35140;
        int edgeValue35160;
        boolean value35226;
        int edgeValue35236;
        int edgeValue35256;
        boolean value35322;
        int edgeValue35332;
        int edgeValue35352;
        boolean value35418;
        int edgeValue35428;
        int edgeValue35448;
        boolean value35514;
        int edgeValue35524;
        int edgeValue35544;
        boolean value35610;
        int edgeValue35620;
        int edgeValue35640;
        boolean value35706;
        int edgeValue35716;
        int edgeValue35736;
        boolean value35802;
        int edgeValue35812;
        int edgeValue35832;
        boolean value35898;
        int edgeValue35908;
        int edgeValue35928;
        boolean value35994;
        int edgeValue36004;
        int edgeValue36024;
        boolean value36090;
        int comparison36091;
        int regionValue36101;
        int edgeValue36112;
        int edgeValue36134;
        boolean value36235;
        boolean value36272;
        int edgeValue36282;
        int edgeValue36292;
        int regionValue36303;
        int edgeValue36313;
        int regionValue36323;
        int edgeValue36333;
        boolean value36370;
        int edgeValue36380;
        int edgeValue36400;
        boolean value36466;
        int comparison36467;
        int regionValue36477;
        int edgeValue36488;
        int edgeValue36510;
        boolean value36611;
        java.lang.Object value36648;
        java.lang.Object value36650;
        boolean value36651;
        int edgeValue36661;
        int edgeValue36671;
        int regionValue36681;
        int edgeValue36690;
        int regionValue36700;
        int edgeValue36710;
        boolean value36745;
        int edgeValue36754;
        int edgeValue36774;
        java.lang.Object value36839;
        java.lang.Object value36841;
        java.lang.Object value36842;
        java.lang.Object value36887;
        float value36889;
        java.lang.Object value36890;
        java.lang.Object value36892;
        java.lang.Object value36893;
        float value36894;
        float computed36895;
        double converted36897;
        int comparison36898;
        int comparison36978;
        int comparison36979;
        int regionValue36988;
        java.lang.StringBuilder initialized37129;
        java.lang.Object value37130;
        double converted37131;
        java.lang.Object value37132;
        java.lang.Object value37133;
        java.lang.Object value37134;
        byte converted37135;
        int value37137;
        java.lang.Object value37140;
        java.lang.Object value37141;
        boolean value37150;
        int edgeValue37159;
        int edgeValue37168;
        int regionValue37178;
        int edgeValue37187;
        int regionValue37196;
        int edgeValue37205;
        java.lang.Object value37238;
        java.lang.Object value37240;
        boolean value37241;
        int comparison37242;
        int regionValue37251;
        int edgeValue37261;
        int edgeValue37281;
        java.lang.Object value37372;
        java.lang.StringBuilder initialized37374;
        java.lang.Object value37375;
        java.lang.Object value37376;
        java.lang.Object value37377;
        java.lang.Object value37378;
        byte converted37379;
        int value37381;
        java.lang.Object value37384;
        java.lang.Object value37385;
        boolean value37394;
        int edgeValue37403;
        int edgeValue37412;
        int regionValue37421;
        int edgeValue37429;
        int regionValue37438;
        int edgeValue37447;
        java.lang.Object value37478;
        java.lang.Object value37480;
        boolean value37481;
        int edgeValue37489;
        int edgeValue37507;
        java.lang.Object value37565;
        java.lang.Object value37567;
        java.lang.Object value37568;
        boolean value37569;
        int comparison37570;
        int regionValue37578;
        int edgeValue37587;
        int edgeValue37607;
        boolean value37683;
        int edgeValue37691;
        int edgeValue37699;
        int regionValue37708;
        int edgeValue37716;
        int regionValue37724;
        int edgeValue37732;
        java.lang.Object value37747;
        java.lang.Object value37749;
        boolean value37750;
        int edgeValue37758;
        java.lang.Object value37773;
        java.lang.Object value37775;
        java.lang.Object value37776;
        java.lang.Object value37805;
        int value37807;
        java.lang.Object value37808;
        java.lang.Object value37810;
        java.lang.Object value37811;
        int value37812;
        int regionValue37819;
        int regionValue37820;
        byte value37875;
        int regionValue37880;
        int edgeValue37885;
        int edgeValue37899;
        int edgeValue37921;
        java.lang.Object value37934;
        java.lang.Object regionValue37936;
        long value37964;
        java.lang.Object value37966;
        boolean value37967;
        int edgeValue37972;
        java.lang.StringBuilder initialized37985;
        java.lang.Object value37986;
        java.lang.Object value37987;
        java.lang.Object value37989;
        long value37990;
        java.lang.Object value37991;
        java.lang.Object value37992;
        byte converted37993;
        int value37995;
        java.lang.Object value37998;
        java.lang.Object value37999;
        java.lang.Object value38002;
        java.lang.Object value38005;
        java.lang.Object value38006;
        region4063: {
        region4055: {
        region4053: {
        region4012: {
        region4011: {
        region3995: {
        region3993: {
        region3989: {
        region3988: {
        region3985: {
        region3983: {
        region3979: {
        region3977: {
        region3976: {
        region3959: {
        region3957: {
        region3947: {
        region3946: {
        region3934: {
        region3933: {
        region3932: {
        region3931: {
        region3929: {
        region3925: {
        region3924: {
        region3922: {
        region3921: {
        region3908: {
        region3906: {
        region3905: {
        region3903: {
        region3891: {
        region3890: {
        region3889: {
        region3888: {
        region3886: {
        region3852: {
        region3851: {
        region3849: {
        region3848: {
        region3846: {
        region3831: {
        region3830: {
        region3829: {
        region3828: {
        region3826: {
        region3788: {
        region3787: {
        region3785: {
        region3784: {
        region3782: {
        region3774: {
        region3772: {
        region3771: {
        region3748: {
        region3746: {
        region3736: {
        region3734: {
        region3733: {
        region3731: {
        region3727: {
        region3726: {
        region3725: {
        region3724: {
        region3714: {
        region3712: {
        region3709: {
        region3708: {
        region3706: {
        region3705: {
        region3703: {
        region3696: {
        region3694: {
        region3693: {
        region3691: {
        region3687: {
        region3686: {
        region3685: {
        region3684: {
        region3682: {
        region3680: {
        region3677: {
        region3676: {
        region3674: {
        region3673: {
        region3671: {
        region3664: {
        region3662: {
        region3661: {
        region3659: {
        region3655: {
        region3653: {
        region3652: {
        region3650: {
        region3646: {
        region3644: {
        region3643: {
        region3641: {
        region3637: {
        region3635: {
        region3634: {
        region3632: {
        region3628: {
        region3626: {
        region3625: {
        region3623: {
        region3619: {
        region3617: {
        region3616: {
        region3614: {
        region3610: {
        region3608: {
        region3607: {
        region3605: {
        region3601: {
        region3599: {
        region3598: {
        region3596: {
        region3592: {
        region3590: {
        region3589: {
        region3587: {
        region3583: {
        region3581: {
        region3580: {
        region3578: {
        region3574: {
        region3572: {
        region3571: {
        region3569: {
        region3565: {
        region3563: {
        region3562: {
        region3560: {
        region3556: {
        region3554: {
        region3553: {
        region3551: {
        region3547: {
        region3545: {
        region3544: {
        region3542: {
        region3538: {
        region3536: {
        region3535: {
        region3533: {
        region3529: {
        region3527: {
        region3526: {
        region3524: {
        region3520: {
        region3518: {
        region3517: {
        region3515: {
        region3511: {
        region3509: {
        region3508: {
        region3506: {
        region3502: {
        region3500: {
        region3499: {
        region3497: {
        region3493: {
        region3491: {
        region3490: {
        region3488: {
        region3484: {
        region3482: {
        region3481: {
        region3479: {
        region3475: {
        region3473: {
        region3472: {
        region3470: {
        region3466: {
        region3464: {
        region3463: {
        region3461: {
        region3457: {
        region3455: {
        region3454: {
        region3452: {
        region3448: {
        region3446: {
        region3445: {
        region3443: {
        region3439: {
        region3438: {
        region3437: {
        region3436: {
        region3435: {
        region3434: {
        region3415: {
        region3414: {
        region3413: {
        region3411: {
        region3410: {
        region3405: {
        region3388: {
        region3386: {
        region3385: {
        region3368: {
        region3365: {
        region3363: {
        region3360: {
        region3358: {
        region3357: {
        region3354: {
        region3353: {
        region3352: {
        region3349: {
        region3348: {
        region3317: {
        region3294: {
        region3292: {
        region3263: {
        region3254: {
        region3232: {
        region3230: {
        region3220: {
        region3218: {
        region3215: {
        region3214: {
        region3209: {
        region3207: {
        region3206: {
        region3180: {
        region3178: {
        region3158: {
        region3157: {
        region3152: {
        region3105: {
        region3065: {
        region3063: {
        region3062: {
        region3060: {
        region3028: {
        region3026: {
        region3025: {
        region3023: {
        region2991: {
        region2989: {
        region2988: {
        region2956: {
        region2955: {
        region2923: {
        region2921: {
        region2916: {
        region2915: {
        region2893: {
        region2891: {
        region2888: {
        region2886: {
        region2883: {
        region2882: {
        region2881: {
        region2880: {
        region2848: {
        region2847: {
        region2845: {
        region2844: {
        region2840: {
        region2839: {
        region2833: {
        region2832: {
        region2830: {
        region2829: {
        region2754: {
        region2752: {
        region2751: {
        region2741: {
        region2737: {
        region2735: {
        region2734: {
        region2732: {
        region2727: {
        region2725: {
        region2722: {
        region2721: {
        region2720: {
        region2719: {
        region2708: {
        region2707: {
        region2669: {
        region2668: {
        region2666: {
        region2665: {
        region2652: {
        region2648: {
        region2646: {
        region2645: {
        region2643: {
        region2638: {
        region2430: {
        region2391: {
        region2374: {
        region2370: {
        region2359: {
        region2357: {
        region2356: {
        region2354: {
        region2343: {
        region2342: {
        region2337: {
        region2335: {
        region2334: {
        region2327: {
        region2326: {
        region2324: {
        region2318: {
        region2301: {
        region2300: {
        region2299: {
        region2296: {
        region2294: {
        region2291: {
        region2289: {
        region2272: {
        region2268: {
        region2257: {
        region2255: {
        region2254: {
        region2252: {
        region2241: {
        region2240: {
        region2235: {
        region2233: {
        region2232: {
        region2208: {
        region2206: {
        region2205: {
        region2199: {
        region2198: {
        region2196: {
        region2195: {
        region2189: {
        region2187: {
        region2183: {
        region2164: {
        region2162: {
        region2152: {
        region2150: {
        region2147: {
        region2145: {
        region2143: {
        region2141: {
        region2138: {
        region2137: {
        region2135: {
        region2127: {
        region2125: {
        region2122: {
        region2119: {
        region2115: {
        region2113: {
        region2112: {
        region2110: {
        region2106: {
        region2105: {
        region2102: {
        region2098: {
        region2090: {
        region2088: {
        region2087: {
        region2085: {
        region2071: {
        region2069: {
        region2059: {
        region2057: {
        region2056: {
        region2048: {
        region2047: {
        region2046: {
        region2045: {
        region2043: {
        region2041: {
        region2025: {
        region2000: {
        region1999: {
        region1990: {
        region1980: {
        region1979: {
        region1978: {
        region1976: {
        region1975: {
        region1964: {
        region1963: {
        region1954: {
        region1944: {
        region1943: {
        region1942: {
        region1940: {
        region1939: {
        region1900: {
        region1899: {
        region1890: {
        region1880: {
        region1879: {
        region1878: {
        region1876: {
        region1875: {
        region1864: {
        region1863: {
        region1854: {
        region1844: {
        region1843: {
        region1842: {
        region1840: {
        region1839: {
        region1806: {
        region1803: {
        region1799: {
        region1797: {
        region1796: {
        region1794: {
        region1789: {
        region1787: {
        region1784: {
        region1782: {
        region1781: {
        region1779: {
        region1775: {
        region1773: {
        region1772: {
        region1770: {
        region1766: {
        region1764: {
        region1763: {
        region1761: {
        region1757: {
        region1756: {
        region1754: {
        region1753: {
        region1740: {
        region1736: {
        region1734: {
        region1733: {
        region1731: {
        region1718: {
        region1717: {
        region1716: {
        region1715: {
        region1706: {
        region1660: {
        region1659: {
        region1657: {
        region1656: {
        region1654: {
        region1647: {
        region1646: {
        region1645: {
        region1644: {
        region1635: {
        region1634: {
        region1623: {
        region1622: {
        region1620: {
        region1619: {
        region1617: {
        region1609: {
        region1607: {
        region1606: {
        region1595: {
        region1593: {
        region1592: {
        region1590: {
        region1585: {
        region1583: {
        region1579: {
        region1576: {
        region1575: {
        region1573: {
        region1572: {
        region1570: {
        region1565: {
        region1563: {
        region1560: {
        region1545: {
        region1543: {
        region1541: {
        region1534: {
        region1532: {
        region1522: {
        region1521: {
        region1520: {
        region1519: {
        region1518: {
        region1517: {
        region1506: {
        region1505: {
        region1503: {
        region1502: {
        region1500: {
        region1492: {
        region1490: {
        region1489: {
        region1478: {
        region1476: {
        region1475: {
        region1473: {
        region1468: {
        region1466: {
        region1462: {
        region1459: {
        region1458: {
        region1456: {
        region1455: {
        region1453: {
        region1449: {
        region1434: {
        region1432: {
        region1430: {
        region1423: {
        region1421: {
        region1411: {
        region1410: {
        region1409: {
        region1408: {
        region1405: {
        region1400: {
        region1380: {
        region1366: {
        region1364: {
        region1354: {
        region1353: {
        region1351: {
        region1350: {
        region1346: {
        region1345: {
        region1343: {
        region1324: {
        region1323: {
        region1321: {
        region1320: {
        region1300: {
        region1298: {
        region1296: {
        region1289: {
        region1287: {
        region1277: {
        region1276: {
        region1275: {
        region1274: {
        region1272: {
        region1263: {
        region1262: {
        region1260: {
        region1259: {
        region1239: {
        region1237: {
        region1235: {
        region1228: {
        region1226: {
        region1216: {
        region1215: {
        region1214: {
        region1213: {
        region1210: {
        region1205: {
        region1156: {
        region1145: {
        region1143: {
        region1133: {
        region1132: {
        region1130: {
        region1129: {
        region1125: {
        region1124: {
        region1122: {
        region1087: {
        region1086: {
        region1084: {
        region1083: {
        region1079: {
        region1078: {
        region1071: {
        region1070: {
        region1068: {
        region1067: {
        region1063: {
        region1062: {
        region1055: {
        region1054: {
        region1052: {
        region1051: {
        region1038: {
        region1036: {
        region1026: {
        region1025: {
        region1024: {
        region1023: {
        region1021: {
        region984: {
        region982: {
        region971: {
        region969: {
        region968: {
        region958: {
        region956: {
        region946: {
        region944: {
        region943: {
        region941: {
        region937: {
        region935: {
        region934: {
        region924: {
        region920: {
        region919: {
        region918: {
        region917: {
        region915: {
        region911: {
        region905: {
        region901: {
        region896: {
        region895: {
        region890: {
        region888: {
        region885: {
        region883: {
        region882: {
        region869: {
        region868: {
        region867: {
        region864: {
        region861: {
        region856: {
        region854: {
        region843: {
        region841: {
        region836: {
        region835: {
        region834: {
        region833: {
        region831: {
        region830: {
        region824: {
        region822: {
        region812: {
        region810: {
        region802: {
        region801: {
        region800: {
        region798: {
        region759: {
        region757: {
        region756: {
        region754: {
        region751: {
        region749: {
        region748: {
        region677: {
        region676: {
        region674: {
        region673: {
        region581: {
        region542: {
        region525: {
        region521: {
        region510: {
        region508: {
        region507: {
        region505: {
        region494: {
        region493: {
        region488: {
        region486: {
        region485: {
        region478: {
        region477: {
        region475: {
        region469: {
        region452: {
        region451: {
        region450: {
        region447: {
        region445: {
        region442: {
        region440: {
        region423: {
        region419: {
        region408: {
        region406: {
        region405: {
        region403: {
        region392: {
        region391: {
        region386: {
        region384: {
        region383: {
        region359: {
        region357: {
        region356: {
        region350: {
        region349: {
        region347: {
        region346: {
        region335: {
        region331: {
        region329: {
        region328: {
        region326: {
        region322: {
        region320: {
        region309: {
        region307: {
        region302: {
        region300: {
        region299: {
        region297: {
        region293: {
        region291: {
        region281: {
        region279: {
        region270: {
        region268: {
        region267: {
        region265: {
        region258: {
        region257: {
        region256: {
        region255: {
        region254: {
        region253: {
        region222: {
        region201: {
        region198: {
        region196: {
        region193: {
        region188: {
        region184: {
        region182: {
        region179: {
        region165: {
        region162: {
        region160: {
        region158: {
        region156: {
        region153: {
        region151: {
        region141: {
        region139: {
        region130: {
        region128: {
        region127: {
        region125: {
        region118: {
        region116: {
        region115: {
        computed9 = a0 ^ 125241940335081L;
        computed11 = a0 ^ 80853424585804L;
        computed13 = a0 ^ 12596371797363L;
        computed14 = computed13 >>> 8;
        computed16 = computed13 << 56;
        computed17 = computed16 >>> 56;
        converted18 = (int) (computed17);
        computed20 = a0 ^ 111389642585572L;
        computed21 = computed20 >>> 56;
        converted22 = (int) (computed21);
        computed24 = computed20 << 8;
        computed25 = computed24 >>> 32;
        converted26 = (int) (computed25);
        computed28 = computed20 << 40;
        computed29 = computed28 >>> 40;
        converted30 = (int) (computed29);
        computed32 = a0 ^ 121808917259030L;
        computed33 = computed32 >>> 32;
        converted34 = (int) (computed33);
        computed36 = computed32 << 32;
        computed37 = computed36 >>> 48;
        converted38 = (int) (computed37);
        computed40 = computed32 << 48;
        computed41 = computed40 >>> 48;
        converted42 = (int) (computed41);
        computed44 = a0 ^ 71754350854894L;
        computed46 = a0 ^ 73856618348780L;
        computed48 = a0 ^ 29520294217996L;
        computed50 = a0 ^ 81475836575443L;
        computed52 = a0 ^ 43011521880281L;
        computed54 = a0 ^ 47818546790357L;
        value56 = recovery$indy$flow$225();
        value59 = ((java.lang.Object)(((net.C_47ob) (((java.lang.Object)(a1))))));
        value60 = recovery$indy$flow$227(value59);
        value62 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_434));
        if (value56 != null) {
            regionValue84 = value62;
            break region255;
        } else {
            break region115;
        }
        }
        if (value62 == null) {
            break region253;
        } else {
            break region116;
        }
        }
        break region118;
        }
        value277 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_434));
        comparison278 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison278 < 0) {
            regionValue300 = value277;
            break region256;
        } else {
            break region125;
        }
        }
        break region127;
        }
        if (value56 != null) {
            regionValue84 = value277;
            break region255;
        } else {
            break region128;
        }
        }
        break region130;
        }
        value528 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value277))))));
        value529 = recovery$indy$flow$231(value528);
        if ((int) ((value529 ? 1 : 0)) == 0) {
            break region253;
        } else {
            break region139;
        }
        }
        break region141;
        }
        value635 = recovery$indy$flow$232();
        value637 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value635))))));
        value638 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value637)))).field_42P));
        if (value638 == null) {
            break region253;
        } else {
            break region151;
        }
        }
        break region153;
        }
        if (value56 != null) {
            break region165;
        } else {
            break region156;
        }
        }
        break region158;
        }
        value876 = recovery$indy$flow$235(value60);
        if ((int) ((value876 ? 1 : 0)) == 0) {
            break region253;
        } else {
            break region160;
        }
        }
        break region162;
        }
        break region165;
        }
        value1004 = ((java.lang.Object)(((net.C_47bo) (((java.lang.Object)(value60))))));
        value1006 = recovery$indy$flow$237(value1004);
        value1008 = recovery$indy$flow$238(this);
        computed1009 = value1008 - value1006;
        comparison1011 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison1011 < 0) {
            break region188;
        } else {
            break region179;
        }
        }
        if (value56 != null) {
            break region254;
        } else {
            break region182;
        }
        }
        break region184;
        }
        recovery$indy$flow$239(this, value1006);
        break region188;
        }
        comparison1264 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison1264 <= 0) {
            break region201;
        } else {
            break region193;
        }
        }
        comparison1357 = (java.lang.Float.isNaN(computed1009) || java.lang.Float.isNaN(0.0F) ? -1 : (computed1009 > 0.0F ? 1 : computed1009 == 0.0F ? 0 : -1));
        if (comparison1357 <= 0) {
            break region253;
        } else {
            break region196;
        }
        }
        break region198;
        }
        break region201;
        }
        converted1490 = (double) (computed1009);
        value1491 = recovery$indy$flow$240(converted1490, 2);
        converted1493 = (double) (computed1009);
        value1494 = recovery$indy$flow$241(converted1493, 3);
        comparison1496 = (java.lang.Double.isNaN(value1491) || java.lang.Double.isNaN(value1494) ? -1 : (value1491 > value1494 ? 1 : value1491 == value1494 ? 0 : -1));
        if (comparison1496 == 0) {
            break region253;
        } else {
            break region222;
        }
        }
        initialized1566 = new java.lang.StringBuilder();
        value1567 = recovery$indy$flow$244(initialized1566, "Damage: ");
        value1568 = recovery$indy$flow$245(value1567, computed1009);
        value1569 = recovery$indy$flow$246(value1568, "; R2: ");
        value1570 = recovery$indy$flow$247(value1569, value1491);
        value1571 = recovery$indy$flow$248(value1570, "; R3: ");
        value1572 = recovery$indy$flow$249(value1571, value1494);
        value1573 = recovery$indy$flow$250(value1572);
        value1576 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value1573))))));
        recovery$indy$flow$252(computed11, value1576);
        break region253;
        }
        break region254;
        }
        value1620 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43t));
        regionValue84 = value1620;
        break region255;
        }
        edgeValue1664 = regionValue84;
        regionValue300 = edgeValue1664;
        break region256;
        }
        if (value56 != null) {
            edgeValue1709 = regionValue300;
            regionValue1687 = edgeValue1709;
            break region917;
        } else {
            edgeValue1753 = regionValue300;
            regionValue1731 = edgeValue1753;
            break region257;
        }
        }
        if (regionValue1731 == null) {
            break region915;
        } else {
            break region258;
        }
        }
        value1838 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43t));
        comparison1839 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison1839 <= 0) {
            regionValue1861 = value1838;
            break region918;
        } else {
            break region265;
        }
        }
        break region267;
        }
        if (value56 != null) {
            regionValue1687 = value1838;
            break region917;
        } else {
            break region268;
        }
        }
        break region270;
        }
        value2089 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value1838))))));
        value2090 = recovery$indy$flow$256(value2089);
        if ((int) ((value2090 ? 1 : 0)) == 0) {
            break region915;
        } else {
            break region279;
        }
        }
        break region281;
        }
        value2196 = recovery$indy$flow$257();
        value2198 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2196))))));
        value2199 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2198)))).field_42P));
        if (value2199 == null) {
            break region915;
        } else {
            break region291;
        }
        }
        break region293;
        }
        value2305 = recovery$indy$flow$260(value60);
        if (value56 != null) {
            edgeValue2349 = (int) ((value2305 ? 1 : 0));
            regionValue2327 = edgeValue2349;
            break region833;
        } else {
            edgeValue2393 = (int) ((value2305 ? 1 : 0));
            break region297;
        }
        }
        break region299;
        }
        if (edgeValue2393 == 0) {
            break region831;
        } else {
            break region300;
        }
        }
        break region302;
        }
        value2564 = ((java.lang.Object)(((net.C_46s) (((java.lang.Object)(value60))))));
        value2565 = recovery$indy$flow$262(value2564);
        if (value56 != null) {
            regionValue2327 = value2565;
            break region833;
        } else {
            break region307;
        }
        }
        break region309;
        }
        value2676 = recovery$indy$flow$263();
        value2678 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2676))))));
        value2679 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value2678)))).field_42P));
        value2680 = recovery$indy$flow$266(value2679);
        if (value2565 != value2680) {
            break region831;
        } else {
            break region320;
        }
        }
        break region322;
        }
        value2786 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43i));
        if (value56 != null) {
            regionValue2808 = value2786;
            break region335;
        } else {
            break region326;
        }
        }
        break region328;
        }
        if (value2786 == null) {
            break region831;
        } else {
            break region329;
        }
        }
        break region331;
        }
        value3024 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43i));
        regionValue2808 = value3024;
        break region335;
        }
        value3047 = regionValue2808;
        value3048 = recovery$indy$flow$269(value3047);
        value3050 = 1.0F;
        value3051 = 0.0F;
        if (value56 != null) {
            edgeValue3099 = value3047;
            regionValue3073 = edgeValue3099;
            break region350;
        } else {
            edgeValue3151 = value3047;
            regionValue3125 = edgeValue3151;
            break region346;
        }
        }
        if (value3048 == null) {
            edgeValue3201 = regionValue3125;
            regionValue3177 = edgeValue3201;
            regionValue3178 = value3050;
            regionValue3179 = value3051;
            break region542;
        } else {
            edgeValue3250 = regionValue3125;
            regionValue3225 = edgeValue3250;
            break region347;
        }
        }
        edgeValue3300 = regionValue3225;
        regionValue3275 = edgeValue3300;
        break region349;
        }
        edgeValue3325 = regionValue3275;
        regionValue3073 = edgeValue3325;
        break region350;
        }
        value3330 = recovery$indy$flow$270(value3048);
        value3332 = recovery$indy$flow$271(value3330);
        if (value56 != null) {
            edgeValue3381 = regionValue3073;
            edgeValue3386 = (int) ((value3332 ? 1 : 0));
            regionValue3354 = edgeValue3381;
            regionValue3356 = value3050;
            regionValue3357 = value3051;
            regionValue3359 = edgeValue3386;
            break region450;
        } else {
            edgeValue3435 = regionValue3073;
            edgeValue3440 = (int) ((value3332 ? 1 : 0));
            regionValue3408 = edgeValue3435;
            break region356;
        }
        }
        if (edgeValue3440 == 0) {
            edgeValue3488 = regionValue3408;
            regionValue3462 = edgeValue3488;
            regionValue3464 = value3050;
            regionValue3465 = value3051;
            break region442;
        } else {
            edgeValue3539 = regionValue3408;
            regionValue3514 = edgeValue3539;
            break region357;
        }
        }
        edgeValue3589 = regionValue3514;
        regionValue3564 = edgeValue3589;
        break region359;
        }
        value3593 = ((java.lang.Object)(((net.C_45V) (((java.lang.Object)(value3330))))));
        value3595 = recovery$indy$flow$273();
        value3596 = recovery$indy$flow$274(value3595);
        value3597 = recovery$indy$flow$275(value3596, value3048);
        converted3598 = (double) (value3597);
        value3600 = recovery$indy$flow$276(value3593);
        computed3601 = value3050 + value3600;
        computed3603 = converted3598 * Double.longBitsToDouble(4608308318706860032L);
        converted3604 = (float) (computed3603);
        value3606 = recovery$indy$flow$277(value3330, value3048);
        if (value56 != null) {
            edgeValue3655 = regionValue3564;
            edgeValue3660 = (int) ((value3606 ? 1 : 0));
            regionValue3628 = edgeValue3655;
            regionValue3633 = edgeValue3660;
            break region391;
        } else {
            edgeValue3710 = regionValue3564;
            edgeValue3716 = (int) ((value3606 ? 1 : 0));
            regionValue3682 = edgeValue3710;
            break region383;
        }
        }
        if (edgeValue3716 == 0) {
            edgeValue3764 = regionValue3682;
            regionValue3738 = edgeValue3764;
            regionValue3742 = converted3604;
            break region440;
        } else {
            edgeValue3817 = regionValue3682;
            regionValue3790 = edgeValue3817;
            break region384;
        }
        }
        edgeValue3871 = regionValue3790;
        regionValue3844 = edgeValue3871;
        break region386;
        }
        comparison3877 = (java.lang.Double.isNaN(converted3598) || java.lang.Double.isNaN(0.0D) ? -1 : (converted3598 > 0.0D ? 1 : converted3598 == 0.0D ? 0 : -1));
        edgeValue3899 = regionValue3844;
        regionValue3628 = edgeValue3899;
        regionValue3633 = comparison3877;
        break region391;
        }
        if (regionValue3633 != 0) {
            edgeValue3926 = regionValue3628;
            regionValue3738 = edgeValue3926;
            regionValue3742 = converted3604;
            break region440;
        } else {
            edgeValue3978 = regionValue3628;
            regionValue3952 = edgeValue3978;
            break region392;
        }
        }
        value3983 = recovery$indy$flow$278();
        value3985 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value3983))))));
        value3986 = recovery$indy$flow$280(value3985);
        if (value56 != null) {
            edgeValue4035 = regionValue3952;
            regionValue4008 = edgeValue4035;
            regionValue4013 = value3986;
            break region419;
        } else {
            edgeValue4089 = regionValue3952;
            regionValue4062 = edgeValue4089;
            break region403;
        }
        }
        edgeValue4143 = regionValue4062;
        regionValue4116 = edgeValue4143;
        break region405;
        }
        if (value3986 == null) {
            edgeValue4170 = regionValue4116;
            regionValue3738 = edgeValue4170;
            regionValue3742 = converted3604;
            break region440;
        } else {
            edgeValue4222 = regionValue4116;
            regionValue4196 = edgeValue4222;
            break region406;
        }
        }
        edgeValue4274 = regionValue4196;
        regionValue4248 = edgeValue4274;
        break region408;
        }
        value4279 = recovery$indy$flow$281();
        value4281 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value4279))))));
        value4282 = recovery$indy$flow$283(value4281);
        edgeValue4304 = regionValue4248;
        regionValue4008 = edgeValue4304;
        regionValue4013 = value4282;
        break region419;
        }
        value4310 = ((java.lang.Object)(((net.C_47WU) (((java.lang.Object)(regionValue4013)))).field_48));
        value4311 = recovery$indy$flow$285(value4310, "gommehd.net");
        if ((int) ((value4311 ? 1 : 0)) == 0) {
            edgeValue4333 = regionValue4008;
            regionValue3738 = edgeValue4333;
            regionValue3742 = converted3604;
            break region440;
        } else {
            edgeValue4384 = regionValue4008;
            regionValue4359 = edgeValue4384;
            break region423;
        }
        }
        value4391 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value4392 = ((java.lang.Object)(((net.C_47rf) (((java.lang.Object)(value3048))))));
        value4393 = recovery$indy$flow$288(value4391, value4392, computed48);
        edgeValue4416 = regionValue4359;
        regionValue3738 = edgeValue4416;
        regionValue3742 = value4393;
        break region440;
        }
        if (value56 == null) {
            edgeValue4442 = regionValue3738;
            edgeValue4444 = regionValue3742;
            regionValue3177 = edgeValue4442;
            regionValue3178 = computed3601;
            regionValue3179 = edgeValue4444;
            break region542;
        } else {
            edgeValue4466 = regionValue3738;
            edgeValue4469 = regionValue3742;
            regionValue3462 = edgeValue4466;
            regionValue3464 = computed3601;
            regionValue3465 = edgeValue4469;
            break region442;
        }
        }
        if (value56 != null) {
            edgeValue4519 = regionValue3462;
            edgeValue4521 = regionValue3464;
            edgeValue4522 = regionValue3465;
            regionValue4492 = edgeValue4519;
            regionValue4494 = edgeValue4521;
            regionValue4495 = edgeValue4522;
            break region452;
        } else {
            edgeValue4573 = regionValue3462;
            edgeValue4575 = regionValue3464;
            edgeValue4576 = regionValue3465;
            regionValue4546 = edgeValue4573;
            regionValue4548 = edgeValue4575;
            regionValue4549 = edgeValue4576;
            break region445;
        }
        }
        edgeValue4627 = regionValue4546;
        edgeValue4629 = regionValue4548;
        edgeValue4630 = regionValue4549;
        regionValue4600 = edgeValue4627;
        regionValue4602 = edgeValue4629;
        regionValue4603 = edgeValue4630;
        break region447;
        }
        value4633 = recovery$indy$flow$289(value3330);
        edgeValue4655 = regionValue4600;
        edgeValue4657 = regionValue4602;
        edgeValue4658 = regionValue4603;
        edgeValue4660 = (int) ((value4633 ? 1 : 0));
        regionValue3354 = edgeValue4655;
        regionValue3356 = edgeValue4657;
        regionValue3357 = edgeValue4658;
        regionValue3359 = edgeValue4660;
        break region450;
        }
        if (regionValue3359 == 0) {
            edgeValue4682 = regionValue3354;
            edgeValue4683 = regionValue3356;
            edgeValue4684 = regionValue3357;
            regionValue3177 = edgeValue4682;
            regionValue3178 = edgeValue4683;
            regionValue3179 = edgeValue4684;
            break region542;
        } else {
            edgeValue4732 = regionValue3354;
            edgeValue4734 = regionValue3356;
            edgeValue4735 = regionValue3357;
            regionValue4706 = edgeValue4732;
            regionValue4708 = edgeValue4734;
            regionValue4709 = edgeValue4735;
            break region451;
        }
        }
        edgeValue4758 = regionValue4706;
        edgeValue4760 = regionValue4708;
        edgeValue4761 = regionValue4709;
        regionValue4492 = edgeValue4758;
        regionValue4494 = edgeValue4760;
        regionValue4495 = edgeValue4761;
        break region452;
        }
        value4764 = ((java.lang.Object)(((net.C_45r) (((java.lang.Object)(value3330))))));
        value4766 = recovery$indy$flow$291();
        value4767 = recovery$indy$flow$292(value4766);
        value4768 = recovery$indy$flow$293(value4767, value3048);
        converted4769 = (double) (value4768);
        value4771 = recovery$indy$flow$294(value4764);
        computed4772 = regionValue4494 + value4771;
        comparison4774 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison4774 < 0) {
            edgeValue4823 = regionValue4492;
            edgeValue4826 = regionValue4495;
            regionValue4796 = edgeValue4823;
            regionValue4799 = edgeValue4826;
            break region478;
        } else {
            edgeValue4877 = regionValue4492;
            edgeValue4880 = regionValue4495;
            regionValue4850 = edgeValue4877;
            regionValue4853 = edgeValue4880;
            break region469;
        }
        }
        computed4883 = converted4769 * Double.longBitsToDouble(4608308318706860032L);
        converted4884 = (float) (computed4883);
        if (value56 != null) {
            edgeValue4931 = regionValue4850;
            edgeValue4933 = regionValue4853;
            regionValue4906 = edgeValue4931;
            regionValue4907 = computed4772;
            regionValue4908 = edgeValue4933;
            regionValue4909 = converted4884;
            break region581;
        } else {
            edgeValue4983 = regionValue4850;
            regionValue4956 = edgeValue4983;
            break region475;
        }
        }
        edgeValue5037 = regionValue4956;
        regionValue5010 = edgeValue5037;
        break region477;
        }
        edgeValue5065 = regionValue5010;
        regionValue4796 = edgeValue5065;
        regionValue4799 = converted4884;
        break region478;
        }
        value5071 = recovery$indy$flow$295(value3330, value3048);
        comparison5072 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison5072 <= 0) {
            edgeValue5120 = regionValue4796;
            edgeValue5123 = regionValue4799;
            edgeValue5124 = (int) ((value5071 ? 1 : 0));
            regionValue5094 = edgeValue5120;
            regionValue5097 = edgeValue5123;
            regionValue5098 = edgeValue5124;
            break region493;
        } else {
            edgeValue5173 = regionValue4796;
            edgeValue5176 = regionValue4799;
            edgeValue5178 = (int) ((value5071 ? 1 : 0));
            regionValue5146 = edgeValue5173;
            regionValue5149 = edgeValue5176;
            break region485;
        }
        }
        if (edgeValue5178 == 0) {
            edgeValue5200 = regionValue5146;
            edgeValue5202 = regionValue5149;
            regionValue3177 = edgeValue5200;
            regionValue3178 = computed4772;
            regionValue3179 = edgeValue5202;
            break region542;
        } else {
            edgeValue5250 = regionValue5146;
            edgeValue5253 = regionValue5149;
            regionValue5224 = edgeValue5250;
            regionValue5227 = edgeValue5253;
            break region486;
        }
        }
        edgeValue5302 = regionValue5224;
        edgeValue5305 = regionValue5227;
        regionValue5276 = edgeValue5302;
        regionValue5279 = edgeValue5305;
        break region488;
        }
        comparison5307 = (java.lang.Double.isNaN(converted4769) || java.lang.Double.isNaN(0.0D) ? -1 : (converted4769 > 0.0D ? 1 : converted4769 == 0.0D ? 0 : -1));
        edgeValue5329 = regionValue5276;
        edgeValue5332 = regionValue5279;
        regionValue5094 = edgeValue5329;
        regionValue5097 = edgeValue5332;
        regionValue5098 = comparison5307;
        break region493;
        }
        if (regionValue5098 != 0) {
            edgeValue5355 = regionValue5094;
            edgeValue5357 = regionValue5097;
            regionValue3177 = edgeValue5355;
            regionValue3178 = computed4772;
            regionValue3179 = edgeValue5357;
            break region542;
        } else {
            edgeValue5404 = regionValue5094;
            edgeValue5407 = regionValue5097;
            regionValue5379 = edgeValue5404;
            regionValue5382 = edgeValue5407;
            break region494;
        }
        }
        value5408 = recovery$indy$flow$296();
        value5410 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5408))))));
        value5411 = recovery$indy$flow$298(value5410);
        if (value56 != null) {
            edgeValue5459 = regionValue5379;
            edgeValue5462 = regionValue5382;
            regionValue5433 = edgeValue5459;
            regionValue5436 = edgeValue5462;
            regionValue5437 = value5411;
            break region521;
        } else {
            edgeValue5511 = regionValue5379;
            edgeValue5514 = regionValue5382;
            regionValue5485 = edgeValue5511;
            regionValue5488 = edgeValue5514;
            break region505;
        }
        }
        edgeValue5563 = regionValue5485;
        edgeValue5566 = regionValue5488;
        regionValue5537 = edgeValue5563;
        regionValue5540 = edgeValue5566;
        break region507;
        }
        if (value5411 == null) {
            edgeValue5589 = regionValue5537;
            edgeValue5591 = regionValue5540;
            regionValue3177 = edgeValue5589;
            regionValue3178 = computed4772;
            regionValue3179 = edgeValue5591;
            break region542;
        } else {
            edgeValue5638 = regionValue5537;
            edgeValue5641 = regionValue5540;
            regionValue5613 = edgeValue5638;
            regionValue5616 = edgeValue5641;
            break region508;
        }
        }
        edgeValue5688 = regionValue5613;
        edgeValue5691 = regionValue5616;
        regionValue5663 = edgeValue5688;
        regionValue5666 = edgeValue5691;
        break region510;
        }
        value5692 = recovery$indy$flow$299();
        value5694 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value5692))))));
        value5695 = recovery$indy$flow$301(value5694);
        edgeValue5717 = regionValue5663;
        edgeValue5720 = regionValue5666;
        regionValue5433 = edgeValue5717;
        regionValue5436 = edgeValue5720;
        regionValue5437 = value5695;
        break region521;
        }
        value5722 = ((java.lang.Object)(((net.C_47WU) (((java.lang.Object)(regionValue5437)))).field_48));
        value5723 = recovery$indy$flow$303(value5722, "gommehd.net");
        if ((int) ((value5723 ? 1 : 0)) == 0) {
            edgeValue5745 = regionValue5433;
            edgeValue5747 = regionValue5436;
            regionValue3177 = edgeValue5745;
            regionValue3178 = computed4772;
            regionValue3179 = edgeValue5747;
            break region542;
        } else {
            edgeValue5793 = regionValue5433;
            regionValue5769 = edgeValue5793;
            break region525;
        }
        }
        value5799 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value5800 = ((java.lang.Object)(((net.C_47rf) (((java.lang.Object)(value3048))))));
        value5801 = recovery$indy$flow$306(value5799, value5800, computed48);
        edgeValue5824 = regionValue5769;
        regionValue3177 = edgeValue5824;
        regionValue3178 = computed4772;
        regionValue3179 = value5801;
        break region542;
        }
        value5827 = recovery$indy$flow$307();
        computed5828 = regionValue3178 + regionValue3179;
        converted5829 = (byte) (converted22);
        value5830 = 0;
        value5833 = 1;
        value5834 = regionValue3177;
        value5836 = (int) (converted5829);
        value5839 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value5840 = ((java.lang.Object)(((net.C_47da) (((java.lang.Object)(value5827))))));
        value5841 = ((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer) (((java.lang.Object)(value5834))))));
        value5842 = recovery$indy$flow$311(value5839, value5840, (byte) (value5836), computed5828, value5841, ((value5833 & 1) != 0), converted26, converted30, ((value5830 & 1) != 0));
        edgeValue5864 = regionValue3177;
        edgeValue5865 = regionValue3178;
        edgeValue5866 = regionValue3179;
        regionValue4906 = edgeValue5864;
        regionValue4907 = edgeValue5865;
        regionValue4908 = edgeValue5866;
        regionValue4909 = value5842;
        break region581;
        }
        value5868 = regionValue4909;
        value5869 = recovery$indy$flow$312();
        computed5870 = regionValue4907 * Float.intBitsToFloat(1069547520);
        computed5871 = computed5870 + regionValue4908;
        converted5872 = (byte) (converted22);
        value5873 = 0;
        value5876 = 1;
        value5877 = regionValue4906;
        value5879 = (int) (converted5872);
        value5882 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value5883 = ((java.lang.Object)(((net.C_47da) (((java.lang.Object)(value5869))))));
        value5884 = ((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer) (((java.lang.Object)(value5877))))));
        value5885 = recovery$indy$flow$316(value5882, value5883, (byte) (value5879), computed5871, value5884, ((value5876 & 1) != 0), converted26, converted30, ((value5873 & 1) != 0));
        value5887 = recovery$indy$flow$317();
        computed5888 = regionValue4907 * Float.intBitsToFloat(1056964608);
        converted5889 = (byte) (converted22);
        value5890 = 0;
        value5893 = 1;
        value5894 = regionValue4906;
        value5896 = (int) (converted5889);
        value5899 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value5900 = ((java.lang.Object)(((net.C_47da) (((java.lang.Object)(value5887))))));
        value5901 = ((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer) (((java.lang.Object)(value5894))))));
        value5902 = recovery$indy$flow$321(value5899, value5900, (byte) (value5896), computed5888, value5901, ((value5893 & 1) != 0), converted26, converted30, ((value5890 & 1) != 0));
        value5904 = recovery$indy$flow$322(this);
        comparison5905 = (java.lang.Double.isNaN(value5904) || java.lang.Double.isNaN(0.0D) ? -1 : (value5904 > 0.0D ? 1 : value5904 == 0.0D ? 0 : -1));
        comparison5906 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison5906 < 0) {
            regionValue5928 = comparison5905;
            break region834;
        } else {
            edgeValue5999 = value5868;
            regionValue5974 = edgeValue5999;
            break region673;
        }
        }
        if (value56 != null) {
            regionValue2327 = comparison5905;
            break region833;
        } else {
            edgeValue6070 = regionValue5974;
            regionValue6046 = edgeValue6070;
            break region674;
        }
        }
        edgeValue6118 = regionValue6046;
        regionValue6094 = edgeValue6118;
        break region676;
        }
        if (comparison5905 <= 0) {
            break region831;
        } else {
            edgeValue6186 = regionValue6094;
            regionValue6163 = edgeValue6186;
            break region677;
        }
        }
        converted6188 = (double) (value5885);
        value6189 = recovery$indy$flow$323(this);
        converted6190 = (char) (converted38);
        converted6191 = (char) (converted42);
        value6192 = Double.longBitsToDouble(4576918229175238656L);
        value6193 = (int) (converted6191);
        value6194 = (int) (converted6190);
        value6199 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value6200 = recovery$indy$flow$325(value6199, converted34, converted6188, value6189, (char) (value6194), (char) (value6193), value6192);
        value6201 = (int) ((value6200 ? 1 : 0));
        converted6202 = (double) (regionValue6163);
        value6203 = recovery$indy$flow$326(this);
        converted6204 = (char) (converted38);
        converted6205 = (char) (converted42);
        value6206 = Double.longBitsToDouble(4576918229175238656L);
        value6207 = (int) (converted6205);
        value6208 = (int) (converted6204);
        value6213 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value6214 = recovery$indy$flow$328(value6213, converted34, converted6202, value6203, (char) (value6208), (char) (value6207), value6206);
        value6215 = (int) ((value6214 ? 1 : 0));
        if (value56 != null) {
            regionValue6237 = value6201;
            break region801;
        } else {
            edgeValue6306 = regionValue6163;
            regionValue6281 = edgeValue6306;
            break region748;
        }
        }
        if (value6201 != 0) {
            break region800;
        } else {
            edgeValue6399 = regionValue6281;
            regionValue6375 = edgeValue6399;
            break region749;
        }
        }
        edgeValue6447 = regionValue6375;
        regionValue6423 = edgeValue6447;
        break region751;
        }
        if (value56 != null) {
            regionValue6237 = value6215;
            break region801;
        } else {
            edgeValue6517 = regionValue6423;
            regionValue6493 = edgeValue6517;
            break region754;
        }
        }
        edgeValue6565 = regionValue6493;
        regionValue6541 = edgeValue6565;
        break region756;
        }
        if (value6215 != 0) {
            break region800;
        } else {
            edgeValue6634 = regionValue6541;
            regionValue6611 = edgeValue6634;
            break region757;
        }
        }
        edgeValue6680 = regionValue6611;
        regionValue6657 = edgeValue6680;
        break region759;
        }
        initialized6682 = new java.lang.StringBuilder();
        value6683 = recovery$indy$flow$331(initialized6682, "Maybe no legit Damage ");
        value6684 = recovery$indy$flow$332(this);
        value6685 = recovery$indy$flow$333(value6684, computed50, 2, -4104835523710806277L, a0);
        value6686 = recovery$indy$flow$334(value6683, value6685);
        value6687 = recovery$indy$flow$335(value6686, " ");
        converted6688 = (double) (regionValue6657);
        value6689 = recovery$indy$flow$336(converted6688, computed50, 2, -4104835523710806277L, a0);
        value6690 = recovery$indy$flow$337(value6687, value6689);
        value6691 = recovery$indy$flow$338(value6690);
        value6694 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value6691))))));
        recovery$indy$flow$340(computed11, value6694);
        if (value56 == null) {
            break region831;
        } else {
            break region798;
        }
        }
        break region800;
        }
        regionValue6237 = value6201;
        break region801;
        }
        if (regionValue6237 == 0) {
            break region824;
        } else {
            break region802;
        }
        }
        comparison6888 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison6888 < 0) {
            edgeValue6936 = "Crit";
            edgeValue6937 = -4103699292008900174L;
            regionValue6911 = edgeValue6936;
            regionValue6912 = edgeValue6937;
            break region830;
        } else {
            edgeValue6986 = "Crit";
            edgeValue6987 = -4103699292008900174L;
            break region810;
        }
        }
        break region812;
        }
        value7041 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(edgeValue6986))))));
        recovery$indy$flow$342(computed11, value7041);
        if (value56 == null) {
            break region831;
        } else {
            break region822;
        }
        }
        break region824;
        }
        edgeValue7148 = "Nocrit";
        edgeValue7149 = -4103699292008900174L;
        regionValue6911 = edgeValue7148;
        regionValue6912 = edgeValue7149;
        break region830;
        }
        recovery$indy$flow$343(computed11, regionValue6911, regionValue6912, a0);
        break region831;
        }
        value7172 = recovery$indy$flow$344(value60);
        edgeValue7194 = (int) ((value7172 ? 1 : 0));
        regionValue2327 = edgeValue7194;
        break region833;
        }
        edgeValue7216 = regionValue2327;
        regionValue5928 = edgeValue7216;
        break region834;
        }
        if (value56 != null) {
            edgeValue7261 = regionValue5928;
            regionValue7239 = edgeValue7261;
            break region867;
        } else {
            edgeValue7305 = regionValue5928;
            regionValue7283 = edgeValue7305;
            break region835;
        }
        }
        if (regionValue7283 == 0) {
            break region861;
        } else {
            break region836;
        }
        }
        value7390 = ((java.lang.Object)(((net.C_46s) (((java.lang.Object)(value60))))));
        value7391 = recovery$indy$flow$346(value7390);
        if (value56 != null) {
            regionValue7239 = value7391;
            break region867;
        } else {
            break region841;
        }
        }
        break region843;
        }
        value7502 = recovery$indy$flow$347();
        value7504 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value7502))))));
        value7505 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value7504)))).field_42P));
        value7506 = recovery$indy$flow$350(value7505);
        if (value7391 != value7506) {
            break region861;
        } else {
            break region854;
        }
        }
        break region856;
        }
        recovery$indy$flow$351(this, Double.longBitsToDouble(-4616189618054758400L));
        break region861;
        }
        if (value56 != null) {
            break region869;
        } else {
            break region864;
        }
        }
        value7721 = recovery$indy$flow$352(value60);
        edgeValue7743 = (int) ((value7721 ? 1 : 0));
        regionValue7239 = edgeValue7743;
        break region867;
        }
        if (regionValue7239 == 0) {
            break region915;
        } else {
            break region868;
        }
        }
        break region869;
        }
        value7829 = ((java.lang.Object)(((net.C_47bo) (((java.lang.Object)(value60))))));
        value7831 = recovery$indy$flow$354(this);
        value7832 = recovery$indy$flow$355(value7829);
        computed7833 = value7831 - value7832;
        comparison7835 = (java.lang.Float.isNaN(computed7833) || java.lang.Float.isNaN(0.0F) ? -1 : (computed7833 > 0.0F ? 1 : computed7833 == 0.0F ? 0 : -1));
        if (value56 != null) {
            regionValue7859 = comparison7835;
            break region895;
        } else {
            break region882;
        }
        }
        if (comparison7835 <= 0) {
            break region911;
        } else {
            break region883;
        }
        }
        break region885;
        }
        if (value56 != null) {
            break region905;
        } else {
            break region888;
        }
        }
        break region890;
        }
        value8212 = recovery$indy$flow$356(this);
        comparison8213 = (java.lang.Double.isNaN(value8212) || java.lang.Double.isNaN(0.0D) ? 1 : (value8212 > 0.0D ? 1 : value8212 == 0.0D ? 0 : -1));
        regionValue7859 = comparison8213;
        break region895;
        }
        if (regionValue7859 >= 0) {
            break region901;
        } else {
            break region896;
        }
        }
        recovery$indy$flow$357(this, 0.0D);
        break region901;
        }
        value8353 = recovery$indy$flow$358();
        recovery$indy$flow$359(value8353, computed7833);
        break region905;
        }
        value8378 = recovery$indy$flow$360(this);
        converted8379 = (double) (computed7833);
        computed8380 = value8378 + converted8379;
        recovery$indy$flow$361(this, computed8380);
        break region911;
        }
        value8403 = recovery$indy$flow$362(value7829);
        recovery$indy$flow$363(this, value8403);
        break region915;
        }
        value8425 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47e));
        regionValue1687 = value8425;
        break region917;
        }
        edgeValue8469 = regionValue1687;
        regionValue1861 = edgeValue8469;
        break region918;
        }
        if (value56 != null) {
            edgeValue8514 = regionValue1861;
            regionValue8492 = edgeValue8514;
            break region924;
        } else {
            edgeValue8558 = regionValue1861;
            regionValue8536 = edgeValue8558;
            break region919;
        }
        }
        if (regionValue8536 == null) {
            break region1122;
        } else {
            break region920;
        }
        }
        value8643 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47e));
        regionValue8492 = value8643;
        break region924;
        }
        value8666 = regionValue8492;
        value8667 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value8666))))));
        value8668 = recovery$indy$flow$367(value8667);
        if (value56 != null) {
            edgeValue8712 = (int) ((value8668 ? 1 : 0));
            regionValue8690 = edgeValue8712;
            break region1124;
        } else {
            edgeValue8756 = (int) ((value8668 ? 1 : 0));
            break region934;
        }
        }
        if (edgeValue8756 == 0) {
            break region1122;
        } else {
            break region935;
        }
        }
        break region937;
        }
        value8862 = recovery$indy$flow$368(value60);
        if (value56 != null) {
            edgeValue8906 = (int) ((value8862 ? 1 : 0));
            regionValue8884 = edgeValue8906;
            break region1023;
        } else {
            edgeValue8950 = (int) ((value8862 ? 1 : 0));
            break region941;
        }
        }
        break region943;
        }
        if (edgeValue8950 == 0) {
            break region1021;
        } else {
            break region944;
        }
        }
        break region946;
        }
        value9121 = recovery$indy$flow$369();
        value9123 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9121))))));
        value9124 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9123)))).field_42P));
        if (value9124 == null) {
            break region1021;
        } else {
            break region956;
        }
        }
        break region958;
        }
        value9230 = ((java.lang.Object)(((net.C_46s) (((java.lang.Object)(value60))))));
        value9232 = recovery$indy$flow$373(value9230);
        comparison9233 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison9233 <= 0) {
            regionValue9255 = value9232;
            break region1024;
        } else {
            break region968;
        }
        }
        if (value56 != null) {
            regionValue8884 = value9232;
            break region1023;
        } else {
            break region969;
        }
        }
        break region971;
        }
        value9442 = recovery$indy$flow$374();
        value9444 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9442))))));
        value9445 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9444)))).field_42P));
        value9446 = recovery$indy$flow$377(value9445);
        if (value9232 != value9446) {
            break region1021;
        } else {
            break region982;
        }
        }
        break region984;
        }
        initialized9556 = new java.lang.StringBuilder();
        value9557 = recovery$indy$flow$380(initialized9556, "Velocity ");
        value9558 = recovery$indy$flow$381(value9230);
        value9559 = recovery$indy$flow$382(value9230);
        computed9560 = value9558 * value9559;
        value9561 = recovery$indy$flow$383(value9230);
        value9562 = recovery$indy$flow$384(value9230);
        computed9563 = value9561 * value9562;
        computed9564 = computed9560 + computed9563;
        converted9565 = (double) (computed9564);
        value9566 = recovery$indy$flow$385(converted9565);
        computed9567 = Double.longBitsToDouble(4548743710035257852L) * value9566;
        value9568 = recovery$indy$flow$386(value9557, computed9567);
        value9569 = recovery$indy$flow$387(value9568);
        value9572 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value9569))))));
        recovery$indy$flow$389(computed11, value9572);
        break region1021;
        }
        value9594 = recovery$indy$flow$390(value60);
        edgeValue9616 = (int) ((value9594 ? 1 : 0));
        regionValue8884 = edgeValue9616;
        break region1023;
        }
        edgeValue9638 = regionValue8884;
        regionValue9255 = edgeValue9638;
        break region1024;
        }
        if (value56 != null) {
            edgeValue9661 = regionValue9255;
            regionValue8690 = edgeValue9661;
            break region1124;
        } else {
            edgeValue9705 = regionValue9255;
            regionValue9683 = edgeValue9705;
            break region1025;
        }
        }
        if (regionValue9683 == 0) {
            break region1122;
        } else {
            break region1026;
        }
        }
        value9769 = recovery$indy$flow$391();
        value9771 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9769))))));
        value9772 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value9771)))).field_42P));
        if (value9772 == null) {
            break region1122;
        } else {
            break region1036;
        }
        }
        break region1038;
        }
        value9878 = ((java.lang.Object)(((net.C_42L) (((java.lang.Object)(value60))))));
        value9880 = recovery$indy$flow$395(value9878);
        value9881 = recovery$indy$flow$396(value9880);
        comparison9882 = (java.lang.Float.isNaN(value9881) || java.lang.Float.isNaN(0.0F) ? -1 : (value9881 > 0.0F ? 1 : value9881 == 0.0F ? 0 : -1));
        comparison9883 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison9883 < 0) {
            regionValue9906 = comparison9882;
            break region1063;
        } else {
            break region1051;
        }
        }
        if (value56 != null) {
            regionValue10002 = comparison9882;
            break region1062;
        } else {
            break region1052;
        }
        }
        break region1054;
        }
        if (comparison9882 > 0) {
            break region1087;
        } else {
            break region1055;
        }
        }
        value10206 = recovery$indy$flow$397(value9878);
        value10207 = recovery$indy$flow$398(value10206);
        comparison10208 = (java.lang.Float.isNaN(value10207) || java.lang.Float.isNaN(0.0F) ? -1 : (value10207 > 0.0F ? 1 : value10207 == 0.0F ? 0 : -1));
        regionValue10002 = comparison10208;
        break region1062;
        }
        edgeValue10254 = regionValue10002;
        regionValue9906 = edgeValue10254;
        break region1063;
        }
        comparison10256 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison10256 < 0) {
            edgeValue10303 = regionValue9906;
            regionValue10279 = edgeValue10303;
            break region1079;
        } else {
            edgeValue10351 = regionValue9906;
            regionValue10327 = edgeValue10351;
            break region1067;
        }
        }
        if (value56 != null) {
            edgeValue10398 = regionValue10327;
            regionValue10375 = edgeValue10398;
            break region1078;
        } else {
            edgeValue10444 = regionValue10327;
            regionValue10421 = edgeValue10444;
            break region1068;
        }
        }
        edgeValue10490 = regionValue10421;
        regionValue10467 = edgeValue10490;
        break region1070;
        }
        if (regionValue10467 > 0) {
            break region1087;
        } else {
            break region1071;
        }
        }
        value10557 = recovery$indy$flow$399(value9878);
        value10558 = recovery$indy$flow$400(value10557);
        comparison10559 = (java.lang.Float.isNaN(value10558) || java.lang.Float.isNaN(0.0F) ? -1 : (value10558 > 0.0F ? 1 : value10558 == 0.0F ? 0 : -1));
        regionValue10375 = comparison10559;
        break region1078;
        }
        edgeValue10605 = regionValue10375;
        regionValue10279 = edgeValue10605;
        break region1079;
        }
        comparison10607 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison10607 < 0) {
            edgeValue10652 = regionValue10279;
            regionValue10629 = edgeValue10652;
            break region1125;
        } else {
            edgeValue10700 = regionValue10279;
            regionValue10676 = edgeValue10700;
            break region1083;
        }
        }
        if (value56 != null) {
            edgeValue10723 = regionValue10676;
            regionValue8690 = edgeValue10723;
            break region1124;
        } else {
            edgeValue10769 = regionValue10676;
            regionValue10746 = edgeValue10769;
            break region1084;
        }
        }
        edgeValue10815 = regionValue10746;
        regionValue10792 = edgeValue10815;
        break region1086;
        }
        if (regionValue10792 <= 0) {
            break region1122;
        } else {
            break region1087;
        }
        }
        initialized10859 = new java.lang.StringBuilder();
        value10860 = recovery$indy$flow$403(initialized10859, "Velocity (S27) ");
        value10861 = recovery$indy$flow$404(value9878);
        value10862 = recovery$indy$flow$405(value9878);
        computed10863 = value10861 * value10862;
        value10864 = recovery$indy$flow$406(value9878);
        value10865 = recovery$indy$flow$407(value9878);
        computed10866 = value10864 * value10865;
        computed10867 = computed10863 + computed10866;
        converted10868 = (double) (computed10867);
        value10869 = recovery$indy$flow$408(converted10868);
        value10870 = recovery$indy$flow$409(value10860, value10869);
        value10871 = recovery$indy$flow$410(value10870);
        value10874 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value10871))))));
        recovery$indy$flow$412(computed11, value10874);
        break region1122;
        }
        value10896 = recovery$indy$flow$413(value60);
        edgeValue10918 = (int) ((value10896 ? 1 : 0));
        regionValue8690 = edgeValue10918;
        break region1124;
        }
        edgeValue10940 = regionValue8690;
        regionValue10629 = edgeValue10940;
        break region1125;
        }
        comparison10942 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison10942 < 0) {
            edgeValue10987 = regionValue10629;
            regionValue10964 = edgeValue10987;
            break region1214;
        } else {
            edgeValue11033 = regionValue10629;
            regionValue11010 = edgeValue11033;
            break region1129;
        }
        }
        if (value56 != null) {
            edgeValue11078 = regionValue11010;
            regionValue11056 = edgeValue11078;
            break region1213;
        } else {
            edgeValue11122 = regionValue11010;
            regionValue11100 = edgeValue11122;
            break region1130;
        }
        }
        edgeValue11166 = regionValue11100;
        regionValue11144 = edgeValue11166;
        break region1132;
        }
        if (regionValue11144 == 0) {
            break region1205;
        } else {
            break region1133;
        }
        }
        value11251 = recovery$indy$flow$414();
        value11253 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value11251))))));
        value11254 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value11253)))).field_44Q));
        if (value11254 == null) {
            break region1205;
        } else {
            break region1143;
        }
        }
        break region1145;
        }
        value11360 = ((java.lang.Object)(((net.C_47y_) (((java.lang.Object)(value60))))));
        value11362 = recovery$indy$flow$418(value11360);
        length11364 = java.lang.reflect.Array.getLength(value11362);
        value11366 = 0;
        regionValue11390 = value11366;
        break region1156;
        }
        loop1156: while (true) {
        region1204: {
        region1203: {
        region1202: {
        region1190: {
        region1188: {
        region1187: {
        region1185: {
        region1171: {
        region1169: {
        region1168: {
        region1159: {
        if (regionValue11390 >= length11364) {
            break region1205;
        } else {
            edgeValue11483 = regionValue11390;
            regionValue11459 = edgeValue11483;
            break region1159;
        }
        }
        arrayValue11484 = ((int[]) value11362)[regionValue11459];
        value11485 = arrayValue11484;
        comparison11486 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison11486 <= 0) {
            edgeValue11535 = regionValue11459;
            regionValue11510 = edgeValue11535;
            break region1204;
        } else {
            edgeValue11586 = regionValue11459;
            edgeValue11587 = value11485;
            regionValue11560 = edgeValue11586;
            regionValue11561 = edgeValue11587;
            break region1168;
        }
        }
        if (value56 != null) {
            edgeValue11636 = regionValue11560;
            regionValue11612 = edgeValue11636;
            break region1203;
        } else {
            edgeValue11685 = regionValue11560;
            edgeValue11686 = regionValue11561;
            regionValue11660 = edgeValue11685;
            regionValue11661 = edgeValue11686;
            break region1169;
        }
        }
        edgeValue11735 = regionValue11660;
        edgeValue11736 = regionValue11661;
        regionValue11710 = edgeValue11735;
        regionValue11711 = edgeValue11736;
        break region1171;
        }
        value11737 = recovery$indy$flow$419();
        value11738 = value11737;
        value11739 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value11738))))));
        value11740 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value11739)))).field_44Q));
        value11741 = recovery$indy$flow$422(value11740, regionValue11711);
        value11742 = recovery$indy$flow$423(value11741);
        if (value56 != null) {
            edgeValue11764 = (int) ((value11742 ? 1 : 0));
            regionValue11056 = edgeValue11764;
            break region1213;
        } else {
            edgeValue11813 = regionValue11710;
            edgeValue11814 = (int) ((value11742 ? 1 : 0));
            regionValue11788 = edgeValue11813;
            regionValue11789 = edgeValue11814;
            break region1185;
        }
        }
        edgeValue11863 = regionValue11788;
        edgeValue11864 = regionValue11789;
        regionValue11838 = edgeValue11863;
        regionValue11839 = edgeValue11864;
        break region1187;
        }
        if (regionValue11839 == 0) {
            edgeValue11912 = regionValue11838;
            regionValue11888 = edgeValue11912;
            break region1202;
        } else {
            edgeValue11960 = regionValue11838;
            regionValue11936 = edgeValue11960;
            break region1188;
        }
        }
        edgeValue12008 = regionValue11936;
        regionValue11984 = edgeValue12008;
        break region1190;
        }
        value12009 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_46));
        value12010 = value12009;
        value12011 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value12010))))));
        recovery$indy$flow$426(value12011);
        edgeValue12035 = regionValue11984;
        regionValue11888 = edgeValue12035;
        break region1202;
        }
        incremented12036 = regionValue11888 + (1);
        edgeValue12060 = incremented12036;
        regionValue11612 = edgeValue12060;
        break region1203;
        }
        edgeValue12084 = regionValue11612;
        regionValue11510 = edgeValue12084;
        break region1204;
        }
        if (value56 == null) {
            edgeValue12109 = regionValue11510;
            regionValue11390 = edgeValue12109;
            continue loop1156;
        } else {
            break region1205;
        }
        }
        }
        comparison12131 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison12131 <= 0) {
            break region3435;
        } else {
            break region1210;
        }
        }
        value12196 = recovery$indy$flow$427(value60);
        edgeValue12218 = (int) ((value12196 ? 1 : 0));
        regionValue11056 = edgeValue12218;
        break region1213;
        }
        edgeValue12240 = regionValue11056;
        regionValue10964 = edgeValue12240;
        break region1214;
        }
        if (value56 != null) {
            edgeValue12285 = regionValue10964;
            regionValue12263 = edgeValue12285;
            break region1274;
        } else {
            edgeValue12329 = regionValue10964;
            regionValue12307 = edgeValue12329;
            break region1215;
        }
        }
        if (regionValue12307 == 0) {
            break region1272;
        } else {
            break region1216;
        }
        }
        value12414 = recovery$indy$flow$428();
        value12416 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value12414))))));
        value12417 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value12416)))).field_44Q));
        if (value12417 == null) {
            break region1272;
        } else {
            break region1226;
        }
        }
        break region1228;
        }
        value12523 = ((java.lang.Object)(((net.C_48c) (((java.lang.Object)(value60))))));
        value12525 = recovery$indy$flow$432(value12523);
        if (value56 != null) {
            regionValue12263 = value12525;
            break region1274;
        } else {
            break region1235;
        }
        }
        if (value12525 != 1) {
            break region1272;
        } else {
            break region1237;
        }
        }
        break region1239;
        }
        value12703 = recovery$indy$flow$433();
        value12705 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value12703))))));
        value12706 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value12705)))).field_44Q));
        value12707 = recovery$indy$flow$436(value12523);
        value12708 = recovery$indy$flow$437(value12706, value12707);
        value12710 = recovery$indy$flow$438(value12708);
        comparison12711 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison12711 < 0) {
            edgeValue12756 = (int) ((value12710 ? 1 : 0));
            regionValue12733 = edgeValue12756;
            break region1275;
        } else {
            edgeValue12804 = (int) ((value12710 ? 1 : 0));
            break region1259;
        }
        }
        if (value56 != null) {
            regionValue12263 = edgeValue12804;
            break region1274;
        } else {
            break region1260;
        }
        }
        break region1262;
        }
        if (edgeValue12804 == 0) {
            break region1272;
        } else {
            break region1263;
        }
        }
        value12985 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(value12708))))));
        value12987 = recovery$indy$flow$440(value12985);
        computed12988 = value12987 + 1;
        recovery$indy$flow$441(value12985, computed12988);
        break region1272;
        }
        value13010 = recovery$indy$flow$442(value60);
        edgeValue13032 = (int) ((value13010 ? 1 : 0));
        regionValue12263 = edgeValue13032;
        break region1274;
        }
        edgeValue13054 = regionValue12263;
        regionValue12733 = edgeValue13054;
        break region1275;
        }
        if (value56 != null) {
            edgeValue13099 = regionValue12733;
            regionValue13077 = edgeValue13099;
            break region1345;
        } else {
            edgeValue13143 = regionValue12733;
            regionValue13121 = edgeValue13143;
            break region1276;
        }
        }
        if (regionValue13121 == 0) {
            break region1343;
        } else {
            break region1277;
        }
        }
        value13228 = recovery$indy$flow$443();
        value13230 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value13228))))));
        value13231 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value13230)))).field_44Q));
        if (value13231 == null) {
            break region1343;
        } else {
            break region1287;
        }
        }
        break region1289;
        }
        value13337 = ((java.lang.Object)(((net.C_47nD) (((java.lang.Object)(value60))))));
        value13339 = recovery$indy$flow$447(value13337);
        if (value56 != null) {
            edgeValue13361 = (int) (value13339);
            regionValue13077 = edgeValue13361;
            break region1345;
        } else {
            edgeValue13407 = (int) (value13339);
            break region1296;
        }
        }
        if (edgeValue13407 != 2) {
            break region1343;
        } else {
            break region1298;
        }
        }
        break region1300;
        }
        value13517 = recovery$indy$flow$448();
        value13519 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value13517))))));
        value13520 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value13519)))).field_44Q));
        value13521 = recovery$indy$flow$451(value13337);
        value13522 = recovery$indy$flow$452(value13520, value13521);
        value13524 = recovery$indy$flow$453(value13522);
        comparison13525 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison13525 <= 0) {
            edgeValue13570 = (int) ((value13524 ? 1 : 0));
            regionValue13547 = edgeValue13570;
            break region1346;
        } else {
            edgeValue13618 = (int) ((value13524 ? 1 : 0));
            break region1320;
        }
        }
        if (value56 != null) {
            regionValue13077 = edgeValue13618;
            break region1345;
        } else {
            break region1321;
        }
        }
        break region1323;
        }
        if (edgeValue13618 == 0) {
            break region1343;
        } else {
            break region1324;
        }
        }
        value13799 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(value13522))))));
        value13801 = recovery$indy$flow$455(value13799);
        computed13802 = value13801 + 1;
        recovery$indy$flow$456(value13799, computed13802);
        value13803 = recovery$indy$flow$457(value13799);
        computed13804 = value13803 + 1;
        recovery$indy$flow$458(value13799, computed13804);
        value13805 = recovery$indy$flow$459(value13799);
        recovery$indy$flow$460(value13799, value13805);
        break region1343;
        }
        value13827 = recovery$indy$flow$461(value60);
        edgeValue13849 = (int) ((value13827 ? 1 : 0));
        regionValue13077 = edgeValue13849;
        break region1345;
        }
        edgeValue13871 = regionValue13077;
        regionValue13547 = edgeValue13871;
        break region1346;
        }
        comparison13873 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison13873 < 0) {
            edgeValue13918 = regionValue13547;
            regionValue13895 = edgeValue13918;
            break region1409;
        } else {
            edgeValue13964 = regionValue13547;
            regionValue13941 = edgeValue13964;
            break region1350;
        }
        }
        if (value56 != null) {
            edgeValue14009 = regionValue13941;
            regionValue13987 = edgeValue14009;
            break region1408;
        } else {
            edgeValue14053 = regionValue13941;
            regionValue14031 = edgeValue14053;
            break region1351;
        }
        }
        edgeValue14097 = regionValue14031;
        regionValue14075 = edgeValue14097;
        break region1353;
        }
        if (regionValue14075 == 0) {
            break region1400;
        } else {
            break region1354;
        }
        }
        value14182 = recovery$indy$flow$462();
        value14184 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value14182))))));
        value14185 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value14184)))).field_44Q));
        if (value14185 == null) {
            break region1400;
        } else {
            break region1364;
        }
        }
        break region1366;
        }
        value14291 = recovery$indy$flow$465();
        value14292 = recovery$indy$flow$466(this);
        computed14293 = value14291 - value14292;
        value14295 = recovery$indy$flow$467();
        recovery$indy$flow$468(this, value14295);
        value14296 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43b));
        value14297 = recovery$indy$flow$470(computed14293);
        value14298 = recovery$indy$flow$471(value14296, value14297);
        break region1380;
        }
        loop1380: while (true) {
        region1399: {
        region1398: {
        region1396: {
        region1395: {
        region1385: {
        value14341 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43b));
        value14342 = recovery$indy$flow$473(value14341);
        if (value14342 <= 15) {
            break region1400;
        } else {
            break region1385;
        }
        }
        value14406 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43b));
        value14407 = recovery$indy$flow$475(value14406, 0);
        comparison14408 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison14408 < 0) {
            break region1399;
        } else {
            break region1395;
        }
        }
        if (value56 != null) {
            break region1517;
        } else {
            break region1396;
        }
        }
        break region1398;
        }
        break region1399;
        }
        if (value56 == null) {
            continue loop1380;
        } else {
            break region1400;
        }
        }
        }
        comparison14687 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison14687 < 0) {
            break region1518;
        } else {
            break region1405;
        }
        }
        value14776 = recovery$indy$flow$476(value60);
        edgeValue14798 = (int) ((value14776 ? 1 : 0));
        regionValue13987 = edgeValue14798;
        break region1408;
        }
        edgeValue14820 = regionValue13987;
        regionValue13895 = edgeValue14820;
        break region1409;
        }
        if (value56 != null) {
            edgeValue14865 = regionValue13895;
            regionValue14843 = edgeValue14865;
            break region1519;
        } else {
            edgeValue14909 = regionValue13895;
            regionValue14887 = edgeValue14909;
            break region1410;
        }
        }
        if (regionValue14887 == 0) {
            break region1517;
        } else {
            break region1411;
        }
        }
        value14973 = recovery$indy$flow$477();
        value14975 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value14973))))));
        value14976 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value14975)))).field_44Q));
        if (value14976 == null) {
            break region1517;
        } else {
            break region1421;
        }
        }
        break region1423;
        }
        value15082 = ((java.lang.Object)(((net.C_47nD) (((java.lang.Object)(value60))))));
        value15084 = recovery$indy$flow$481(value15082);
        if (value56 != null) {
            edgeValue15106 = (int) (value15084);
            regionValue14843 = edgeValue15106;
            break region1519;
        } else {
            edgeValue15152 = (int) (value15084);
            break region1430;
        }
        }
        if (edgeValue15152 != 2) {
            break region1517;
        } else {
            break region1432;
        }
        }
        break region1434;
        }
        value15262 = recovery$indy$flow$482();
        value15264 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value15262))))));
        value15265 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value15264)))).field_44Q));
        value15266 = recovery$indy$flow$485(value15082);
        value15267 = recovery$indy$flow$486(value15265, value15266);
        if (value15267 == null) {
            break region1517;
        } else {
            break region1449;
        }
        }
        value15334 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_431));
        if (value56 != null) {
            regionValue15356 = value15334;
            break region1459;
        } else {
            break region1453;
        }
        }
        break region1455;
        }
        if (value15334 == null) {
            break region1517;
        } else {
            break region1456;
        }
        }
        break region1458;
        }
        regionValue15356 = value15267;
        break region1459;
        }
        value15602 = recovery$indy$flow$488(regionValue15356);
        if (value56 != null) {
            regionValue14843 = value15602;
            break region1519;
        } else {
            break region1462;
        }
        }
        value15669 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_431));
        value15670 = recovery$indy$flow$490(value15669);
        if (value15602 != value15670) {
            break region1517;
        } else {
            break region1466;
        }
        }
        break region1468;
        }
        value15776 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_431));
        value15777 = recovery$indy$flow$492(value15776);
        if (value56 != null) {
            regionValue14843 = value15777;
            break region1519;
        } else {
            break region1473;
        }
        }
        break region1475;
        }
        if (value15777 != 0) {
            break region1517;
        } else {
            break region1476;
        }
        }
        break region1478;
        }
        value15993 = recovery$indy$flow$493();
        value15994 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_431));
        value15995 = recovery$indy$flow$495(value15994);
        computed15996 = value15993 - value15995;
        comparison15998 = (computed15996 > 400L ? 1 : computed15996 == 400L ? 0 : -1);
        if (value56 != null) {
            regionValue14843 = comparison15998;
            break region1519;
        } else {
            break region1489;
        }
        }
        if (comparison15998 >= 0) {
            break region1517;
        } else {
            break region1490;
        }
        }
        break region1492;
        }
        value16170 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43b));
        value16171 = recovery$indy$flow$497(value16170);
        comparison16172 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison16172 <= 0) {
            edgeValue16217 = (int) ((value16171 ? 1 : 0));
            regionValue16194 = edgeValue16217;
            break region1520;
        } else {
            edgeValue16263 = (int) ((value16171 ? 1 : 0));
            break region1500;
        }
        }
        break region1502;
        }
        if (value56 != null) {
            regionValue14843 = edgeValue16263;
            break region1519;
        } else {
            break region1503;
        }
        }
        break region1505;
        }
        if (edgeValue16263 != 0) {
            break region1517;
        } else {
            break region1506;
        }
        }
        value16484 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43b));
        value16486 = ((java.lang.Object)(((java.util.List) (((java.lang.Object)(value16484))))));
        value16487 = recovery$indy$flow$500(value16486);
        break region1517;
        }
        break region1518;
        }
        value16532 = recovery$indy$flow$501(value60);
        edgeValue16554 = (int) ((value16532 ? 1 : 0));
        regionValue14843 = edgeValue16554;
        break region1519;
        }
        edgeValue16576 = regionValue14843;
        regionValue16194 = edgeValue16576;
        break region1520;
        }
        if (value56 != null) {
            edgeValue16621 = regionValue16194;
            regionValue16599 = edgeValue16621;
            break region1644;
        } else {
            edgeValue16665 = regionValue16194;
            regionValue16643 = edgeValue16665;
            break region1521;
        }
        }
        if (regionValue16643 == 0) {
            break region1634;
        } else {
            break region1522;
        }
        }
        value16750 = recovery$indy$flow$502();
        value16752 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value16750))))));
        value16753 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value16752)))).field_44Q));
        if (value16753 == null) {
            break region1634;
        } else {
            break region1532;
        }
        }
        break region1534;
        }
        value16859 = ((java.lang.Object)(((net.C_48c) (((java.lang.Object)(value60))))));
        value16861 = recovery$indy$flow$506(value16859);
        if (value56 != null) {
            regionValue16599 = value16861;
            break region1644;
        } else {
            break region1541;
        }
        }
        if (value16861 != 1) {
            break region1634;
        } else {
            break region1543;
        }
        }
        break region1545;
        }
        value17039 = recovery$indy$flow$507();
        value17041 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value17039))))));
        value17042 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value17041)))).field_44Q));
        value17043 = recovery$indy$flow$510(value16859);
        value17044 = recovery$indy$flow$511(value17042, value17043);
        if (value17044 == null) {
            break region1634;
        } else {
            break region1560;
        }
        }
        if (value56 != null) {
            break region1635;
        } else {
            break region1563;
        }
        }
        break region1565;
        }
        value17247 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_431));
        comparison17248 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison17248 <= 0) {
            regionValue17270 = value17247;
            break region1576;
        } else {
            break region1570;
        }
        }
        break region1572;
        }
        if (value17247 == null) {
            break region1634;
        } else {
            break region1573;
        }
        }
        break region1575;
        }
        regionValue17270 = value17044;
        break region1576;
        }
        value17516 = recovery$indy$flow$513(regionValue17270);
        if (value56 != null) {
            regionValue16599 = value17516;
            break region1644;
        } else {
            break region1579;
        }
        }
        value17583 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_431));
        value17584 = recovery$indy$flow$515(value17583);
        if (value17516 != value17584) {
            break region1634;
        } else {
            break region1583;
        }
        }
        break region1585;
        }
        value17690 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_431));
        value17691 = recovery$indy$flow$517(value17690);
        if (value56 != null) {
            regionValue16599 = value17691;
            break region1644;
        } else {
            break region1590;
        }
        }
        break region1592;
        }
        if (value17691 != 0) {
            break region1634;
        } else {
            break region1593;
        }
        }
        break region1595;
        }
        value17907 = recovery$indy$flow$518();
        value17908 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_431));
        value17909 = recovery$indy$flow$520(value17908);
        computed17910 = value17907 - value17909;
        comparison17912 = (computed17910 > 400L ? 1 : computed17910 == 400L ? 0 : -1);
        if (value56 != null) {
            regionValue16599 = comparison17912;
            break region1644;
        } else {
            break region1606;
        }
        }
        if (comparison17912 >= 0) {
            break region1634;
        } else {
            break region1607;
        }
        }
        break region1609;
        }
        value18084 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43b));
        value18085 = recovery$indy$flow$522(value18084);
        comparison18086 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison18086 <= 0) {
            edgeValue18131 = (int) ((value18085 ? 1 : 0));
            regionValue18108 = edgeValue18131;
            break region1645;
        } else {
            edgeValue18177 = (int) ((value18085 ? 1 : 0));
            break region1617;
        }
        }
        break region1619;
        }
        if (value56 != null) {
            regionValue16599 = edgeValue18177;
            break region1644;
        } else {
            break region1620;
        }
        }
        break region1622;
        }
        if (edgeValue18177 != 0) {
            break region1634;
        } else {
            break region1623;
        }
        }
        value18398 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43b));
        value18400 = ((java.lang.Object)(((java.util.List) (((java.lang.Object)(value18398))))));
        value18401 = recovery$indy$flow$525(value18400);
        break region1634;
        }
        break region1635;
        }
        value18446 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).settingTransaction));
        value18448 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value18446))))));
        value18449 = recovery$indy$flow$528(value18448);
        edgeValue18471 = (int) ((value18449 ? 1 : 0));
        regionValue16599 = edgeValue18471;
        break region1644;
        }
        edgeValue18493 = regionValue16599;
        regionValue18108 = edgeValue18493;
        break region1645;
        }
        if (value56 != null) {
            edgeValue18536 = regionValue18108;
            regionValue18515 = edgeValue18536;
            break region1715;
        } else {
            edgeValue18580 = regionValue18108;
            regionValue18558 = edgeValue18580;
            break region1646;
        }
        }
        if (regionValue18558 == 0) {
            break region1706;
        } else {
            break region1647;
        }
        }
        value18663 = recovery$indy$flow$529(value60);
        comparison18664 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison18664 < 0) {
            edgeValue18707 = (int) ((value18663 ? 1 : 0));
            regionValue18685 = edgeValue18707;
            break region1716;
        } else {
            edgeValue18753 = (int) ((value18663 ? 1 : 0));
            break region1654;
        }
        }
        break region1656;
        }
        if (value56 != null) {
            regionValue18515 = edgeValue18753;
            break region1715;
        } else {
            break region1657;
        }
        }
        break region1659;
        }
        if (edgeValue18753 == 0) {
            break region1706;
        } else {
            break region1660;
        }
        }
        value18972 = ((java.lang.Object)(((net.C_47qi) (((java.lang.Object)(value60))))));
        value18974 = recovery$indy$flow$531(this);
        computed18975 = value18974 + 1;
        recovery$indy$flow$532(this, computed18975);
        initialized18976 = new java.lang.StringBuilder();
        value18977 = recovery$indy$flow$535(initialized18976, "Transaction debug; WindowID: ");
        value18978 = recovery$indy$flow$536(value18972);
        value18979 = recovery$indy$flow$537(value18977, value18978);
        value18980 = recovery$indy$flow$538(value18979, "; ActionNumber: ");
        value18981 = recovery$indy$flow$539(value18972);
        value18982 = recovery$indy$flow$540(value18980, (int) (value18981));
        value18983 = recovery$indy$flow$541(value18982, "; Accepted: ");
        value18984 = recovery$indy$flow$542(value18972);
        value18985 = recovery$indy$flow$543(value18983, value18984);
        value18986 = recovery$indy$flow$544(value18985, "; TransPerSec: ");
        value18987 = recovery$indy$flow$545(this);
        value18988 = recovery$indy$flow$546(value18986, value18987);
        value18989 = recovery$indy$flow$547(value18988);
        value18992 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value18989))))));
        recovery$indy$flow$549(computed11, value18992);
        break region1706;
        }
        value19013 = recovery$indy$flow$550();
        value19014 = recovery$indy$flow$551(value19013);
        value19015 = recovery$indy$flow$552(value60);
        edgeValue19036 = (int) ((value19015 ? 1 : 0));
        regionValue18515 = edgeValue19036;
        break region1715;
        }
        edgeValue19057 = regionValue18515;
        regionValue18685 = edgeValue19057;
        break region1716;
        }
        if (value56 != null) {
            edgeValue19100 = regionValue18685;
            regionValue19079 = edgeValue19100;
            break region2045;
        } else {
            edgeValue19142 = regionValue18685;
            regionValue19121 = edgeValue19142;
            break region1717;
        }
        }
        if (regionValue19121 == 0) {
            break region2043;
        } else {
            break region1718;
        }
        }
        value19223 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47R));
        recovery$indy$flow$554(value19223);
        value19224 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43h));
        recovery$indy$flow$556(value19224);
        recovery$indy$flow$557(this, 0);
        value19225 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_41));
        if (value56 != null) {
            regionValue19246 = value19225;
            break region1740;
        } else {
            break region1731;
        }
        }
        break region1733;
        }
        if (value19225 == null) {
            break region2043;
        } else {
            break region1734;
        }
        }
        break region1736;
        }
        value19452 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_41));
        regionValue19246 = value19452;
        break region1740;
        }
        value19474 = regionValue19246;
        value19475 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value19474))))));
        value19476 = recovery$indy$flow$561(value19475);
        comparison19477 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison19477 <= 0) {
            edgeValue19520 = (int) ((value19476 ? 1 : 0));
            regionValue19498 = edgeValue19520;
            break region2046;
        } else {
            edgeValue19564 = (int) ((value19476 ? 1 : 0));
            break region1753;
        }
        }
        if (value56 != null) {
            regionValue19079 = edgeValue19564;
            break region2045;
        } else {
            break region1754;
        }
        }
        break region1756;
        }
        if (edgeValue19564 == 0) {
            break region2043;
        } else {
            break region1757;
        }
        }
        value19731 = recovery$indy$flow$562(this);
        if (value56 != null) {
            regionValue19752 = value19731;
            break region1806;
        } else {
            break region1761;
        }
        }
        break region1763;
        }
        if (value19731 != 0) {
            break region1799;
        } else {
            break region1764;
        }
        }
        break region1766;
        }
        value19978 = recovery$indy$flow$563(this);
        if (value56 != null) {
            regionValue19752 = value19978;
            break region1806;
        } else {
            break region1770;
        }
        }
        break region1772;
        }
        if (value19978 != 0) {
            break region1799;
        } else {
            break region1773;
        }
        }
        break region1775;
        }
        value20184 = recovery$indy$flow$564(this);
        if (value56 != null) {
            regionValue19752 = value20184;
            break region1806;
        } else {
            break region1779;
        }
        }
        break region1781;
        }
        if (value20184 != 0) {
            break region1799;
        } else {
            break region1782;
        }
        }
        break region1784;
        }
        if (value56 != null) {
            break region2041;
        } else {
            break region1787;
        }
        }
        break region1789;
        }
        value20516 = recovery$indy$flow$565(this);
        comparison20517 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison20517 <= 0) {
            regionValue20538 = value20516;
            break region1803;
        } else {
            break region1794;
        }
        }
        break region1796;
        }
        if (value20516 == 0) {
            break region2025;
        } else {
            break region1797;
        }
        }
        break region1799;
        }
        value20744 = recovery$indy$flow$566(this);
        regionValue20538 = value20744;
        break region1803;
        }
        value20766 = recovery$indy$flow$567(this);
        computed20767 = regionValue20538 - value20766;
        regionValue19752 = computed20767;
        break region1806;
        }
        value20789 = regionValue19752;
        value20790 = recovery$indy$flow$568(this);
        value20791 = recovery$indy$flow$569(this);
        computed20792 = value20790 - value20791;
        value20794 = recovery$indy$flow$570(this);
        value20795 = recovery$indy$flow$571(this);
        computed20796 = value20794 - value20795;
        value20798 = recovery$indy$flow$572(this);
        value20799 = recovery$indy$flow$573(this);
        computed20800 = value20798 - value20799;
        initialized20802 = new java.lang.StringBuilder();
        value20803 = recovery$indy$flow$576(initialized20802, "MeHits: \u00a77");
        value20804 = recovery$indy$flow$577(this);
        value20805 = recovery$indy$flow$578(value20803, value20804);
        value20806 = recovery$indy$flow$579(value20805, "\u00a7f ");
        if (value56 != null) {
            edgeValue20854 = value20789;
            edgeValue20860 = value20789;
            regionValue20827 = edgeValue20854;
            regionValue20833 = edgeValue20860;
            break region1843;
        } else {
            edgeValue20908 = value20789;
            edgeValue20914 = value20789;
            regionValue20881 = edgeValue20908;
            regionValue20887 = edgeValue20914;
            break region1839;
        }
        }
        if (regionValue20887 == 0) {
            break region1863;
        } else {
            edgeValue21011 = regionValue20881;
            regionValue20985 = edgeValue21011;
            break region1840;
        }
        }
        edgeValue21063 = regionValue20985;
        regionValue21037 = edgeValue21063;
        break region1842;
        }
        edgeValue21089 = regionValue21037;
        edgeValue21095 = regionValue21037;
        regionValue20827 = edgeValue21089;
        regionValue20833 = edgeValue21095;
        break region1843;
        }
        if (regionValue20833 >= 0) {
            edgeValue21142 = regionValue20827;
            regionValue21116 = edgeValue21142;
            break region1854;
        } else {
            edgeValue21194 = regionValue20827;
            regionValue21168 = edgeValue21194;
            break region1844;
        }
        }
        initialized21200 = new java.lang.StringBuilder();
        value21201 = recovery$indy$flow$582(initialized21200, "\u00a7c");
        value21202 = recovery$indy$flow$583(value21201, regionValue21168);
        value21203 = recovery$indy$flow$584(value21202);
        regionValue21229 = value21203;
        break region1864;
        }
        initialized21256 = new java.lang.StringBuilder();
        value21257 = recovery$indy$flow$587(initialized21256, " \u00a7a+");
        value21258 = recovery$indy$flow$588(value21257, regionValue21116);
        value21259 = recovery$indy$flow$589(value21258);
        regionValue21229 = value21259;
        break region1864;
        }
        edgeValue21311 = "";
        regionValue21229 = edgeValue21311;
        break region1864;
        }
        value21312 = recovery$indy$flow$590(value20806, regionValue21229);
        value21313 = recovery$indy$flow$591(value21312, "\u00a7f  Crits: \u00a77");
        value21314 = recovery$indy$flow$592(this);
        value21315 = recovery$indy$flow$593(value21313, value21314);
        value21316 = recovery$indy$flow$594(value21315, " \u00a7f");
        if (value56 != null) {
            break region1879;
        } else {
            break region1875;
        }
        }
        if (computed20796 == 0) {
            break region1899;
        } else {
            break region1876;
        }
        }
        break region1878;
        }
        break region1879;
        }
        if (computed20796 >= 0) {
            break region1890;
        } else {
            break region1880;
        }
        }
        initialized21695 = new java.lang.StringBuilder();
        value21696 = recovery$indy$flow$597(initialized21695, "\u00a7c");
        value21697 = recovery$indy$flow$598(value21696, computed20796);
        value21698 = recovery$indy$flow$599(value21697);
        regionValue21723 = value21698;
        break region1900;
        }
        initialized21749 = new java.lang.StringBuilder();
        value21750 = recovery$indy$flow$602(initialized21749, " \u00a7a+");
        value21751 = recovery$indy$flow$603(value21750, computed20796);
        value21752 = recovery$indy$flow$604(value21751);
        regionValue21723 = value21752;
        break region1900;
        }
        edgeValue21802 = "";
        regionValue21723 = edgeValue21802;
        break region1900;
        }
        value21803 = recovery$indy$flow$605(value21316, regionValue21723);
        value21804 = recovery$indy$flow$606(value21803, "\u00a7f");
        value21805 = recovery$indy$flow$607(value21804);
        converted21806 = (byte) (converted18);
        value21808 = (int) (converted21806);
        value21811 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value21812 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value21805))))));
        recovery$indy$flow$610(value21811, computed14, (byte) (value21808), value21812);
        initialized21813 = new java.lang.StringBuilder();
        value21814 = recovery$indy$flow$613(initialized21813, "OpponentHits: \u00a77");
        value21815 = recovery$indy$flow$614(this);
        value21816 = recovery$indy$flow$615(value21814, value21815);
        value21817 = recovery$indy$flow$616(value21816, "\u00a7f ");
        if (value56 != null) {
            break region1943;
        } else {
            break region1939;
        }
        }
        if (computed20792 == 0) {
            break region1963;
        } else {
            break region1940;
        }
        }
        break region1942;
        }
        break region1943;
        }
        if (computed20792 >= 0) {
            break region1954;
        } else {
            break region1944;
        }
        }
        initialized22181 = new java.lang.StringBuilder();
        value22182 = recovery$indy$flow$619(initialized22181, "\u00a7c");
        value22183 = recovery$indy$flow$620(value22182, computed20792);
        value22184 = recovery$indy$flow$621(value22183);
        regionValue22208 = value22184;
        break region1964;
        }
        initialized22233 = new java.lang.StringBuilder();
        value22234 = recovery$indy$flow$624(initialized22233, " \u00a7a+");
        value22235 = recovery$indy$flow$625(value22234, computed20792);
        value22236 = recovery$indy$flow$626(value22235);
        regionValue22208 = value22236;
        break region1964;
        }
        edgeValue22284 = "";
        regionValue22208 = edgeValue22284;
        break region1964;
        }
        value22285 = recovery$indy$flow$627(value21817, regionValue22208);
        value22286 = recovery$indy$flow$628(value22285, "\u00a7f  Crits: \u00a77");
        value22287 = recovery$indy$flow$629(this);
        value22288 = recovery$indy$flow$630(value22286, value22287);
        value22289 = recovery$indy$flow$631(value22288, " \u00a7f");
        if (value56 != null) {
            break region1979;
        } else {
            break region1975;
        }
        }
        if (computed20800 == 0) {
            break region1999;
        } else {
            break region1976;
        }
        }
        break region1978;
        }
        break region1979;
        }
        if (computed20800 >= 0) {
            break region1990;
        } else {
            break region1980;
        }
        }
        initialized22638 = new java.lang.StringBuilder();
        value22639 = recovery$indy$flow$634(initialized22638, "\u00a7c");
        value22640 = recovery$indy$flow$635(value22639, computed20800);
        value22641 = recovery$indy$flow$636(value22640);
        regionValue22664 = value22641;
        break region2000;
        }
        initialized22688 = new java.lang.StringBuilder();
        value22689 = recovery$indy$flow$639(initialized22688, " \u00a7a+");
        value22690 = recovery$indy$flow$640(value22689, computed20800);
        value22691 = recovery$indy$flow$641(value22690);
        regionValue22664 = value22691;
        break region2000;
        }
        edgeValue22737 = "";
        regionValue22664 = edgeValue22737;
        break region2000;
        }
        value22738 = recovery$indy$flow$642(value22289, regionValue22664);
        value22739 = recovery$indy$flow$643(value22738, "\u00a7f");
        value22740 = recovery$indy$flow$644(value22739);
        converted22741 = (byte) (converted18);
        value22743 = (int) (converted22741);
        value22746 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value22747 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value22740))))));
        recovery$indy$flow$647(value22746, computed14, (byte) (value22743), value22747);
        break region2025;
        }
        recovery$indy$flow$648(this, 0);
        recovery$indy$flow$649(this, 0);
        recovery$indy$flow$650(this, 0);
        recovery$indy$flow$651(this, 0);
        recovery$indy$flow$652(this, 0.0F);
        break region2041;
        }
        recovery$indy$flow$653(this, 0.0F);
        break region2043;
        }
        value22809 = recovery$indy$flow$654(value60);
        edgeValue22830 = (int) ((value22809 ? 1 : 0));
        regionValue19079 = edgeValue22830;
        break region2045;
        }
        edgeValue22851 = regionValue19079;
        regionValue19498 = edgeValue22851;
        break region2046;
        }
        if (value56 != null) {
            edgeValue22894 = regionValue19498;
            regionValue22873 = edgeValue22894;
            break region2137;
        } else {
            edgeValue22936 = regionValue19498;
            regionValue22915 = edgeValue22936;
            break region2047;
        }
        }
        if (regionValue22915 == 0) {
            break region2135;
        } else {
            break region2048;
        }
        }
        value23017 = ((java.lang.Object)(((net.C_48c) (((java.lang.Object)(value60))))));
        value23019 = recovery$indy$flow$656(value23017);
        if (value56 != null) {
            edgeValue23065 = 4;
            regionValue23041 = value23019;
            regionValue23042 = edgeValue23065;
            break region2105;
        } else {
            edgeValue23111 = 4;
            break region2056;
        }
        }
        if (value23019 != edgeValue23111) {
            break region2098;
        } else {
            break region2057;
        }
        }
        break region2059;
        }
        value23238 = recovery$indy$flow$657();
        value23240 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value23238))))));
        value23241 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value23240)))).field_42P));
        if (value23241 == null) {
            break region2098;
        } else {
            break region2069;
        }
        }
        break region2071;
        }
        value23347 = recovery$indy$flow$660(value23017);
        value23348 = recovery$indy$flow$661();
        value23350 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value23348))))));
        value23351 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value23350)))).field_42P));
        value23352 = recovery$indy$flow$664(value23351);
        if (value56 != null) {
            regionValue23041 = value23347;
            regionValue23042 = value23352;
            break region2105;
        } else {
            break region2085;
        }
        }
        break region2087;
        }
        if (value23347 != value23352) {
            break region2098;
        } else {
            break region2088;
        }
        }
        break region2090;
        }
        value23573 = recovery$indy$flow$665(this);
        computed23574 = value23573 + 1;
        recovery$indy$flow$666(this, computed23574);
        break region2098;
        }
        value23596 = recovery$indy$flow$667(value23017);
        if (value56 != null) {
            regionValue22873 = value23596;
            break region2137;
        } else {
            break region2102;
        }
        }
        edgeValue23684 = 4;
        regionValue23041 = value23596;
        regionValue23042 = edgeValue23684;
        break region2105;
        }
        if (regionValue23041 != regionValue23042) {
            break region2135;
        } else {
            break region2106;
        }
        }
        value23747 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43i));
        if (value56 != null) {
            regionValue23769 = value23747;
            break region2119;
        } else {
            break region2110;
        }
        }
        break region2112;
        }
        if (value23747 == null) {
            break region2135;
        } else {
            break region2113;
        }
        }
        break region2115;
        }
        value23984 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43i));
        regionValue23769 = value23984;
        break region2119;
        }
        value24007 = recovery$indy$flow$670(regionValue23769);
        if (value56 != null) {
            regionValue22873 = value24007;
            break region2137;
        } else {
            break region2122;
        }
        }
        value24073 = recovery$indy$flow$671(value23017);
        if (value24007 != value24073) {
            break region2135;
        } else {
            break region2125;
        }
        }
        break region2127;
        }
        value24174 = recovery$indy$flow$672(this);
        computed24175 = value24174 + 1;
        recovery$indy$flow$673(this, computed24175);
        break region2135;
        }
        value24196 = recovery$indy$flow$674(value60);
        edgeValue24217 = (int) ((value24196 ? 1 : 0));
        regionValue22873 = edgeValue24217;
        break region2137;
        }
        if (regionValue22873 == 0) {
            break region3353;
        } else {
            break region2138;
        }
        }
        if (value56 != null) {
            break region3354;
        } else {
            break region2141;
        }
        }
        break region2143;
        }
        value24388 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47w));
        if (value24388 == null) {
            break region3353;
        } else {
            break region2145;
        }
        }
        break region2147;
        }
        if (value56 != null) {
            break region3354;
        } else {
            break region2150;
        }
        }
        break region2152;
        }
        value24576 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47w));
        value24578 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value24576))))));
        value24579 = recovery$indy$flow$678(value24578);
        if ((int) ((value24579 ? 1 : 0)) == 0) {
            break region3353;
        } else {
            break region2162;
        }
        }
        break region2164;
        }
        value24671 = ((java.lang.Object)(((net.C_47bo) (((java.lang.Object)(value60))))));
        value24673 = recovery$indy$flow$680(this);
        value24674 = recovery$indy$flow$681(value24671);
        converted24675 = (double) (value24674);
        computed24676 = value24673 - converted24675;
        value24678 = 1.0F;
        value24679 = 0.0F;
        value24680 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43i));
        if (value24680 == null) {
            break region3348;
        } else {
            break region2183;
        }
        }
        comparison24756 = (java.lang.Double.isNaN(computed24676) || java.lang.Double.isNaN(0.0D) ? -1 : (computed24676 > 0.0D ? 1 : computed24676 == 0.0D ? 0 : -1));
        if (comparison24756 <= 0) {
            break region3348;
        } else {
            break region2187;
        }
        }
        break region2189;
        }
        value24869 = recovery$indy$flow$683(value24680);
        if (value56 != null) {
            break region2199;
        } else {
            break region2195;
        }
        }
        if (value24869 == null) {
            regionValue25000 = value24678;
            regionValue25001 = value24679;
            break region2391;
        } else {
            break region2196;
        }
        }
        break region2198;
        }
        break region2199;
        }
        value25158 = recovery$indy$flow$684(value24869);
        value25160 = recovery$indy$flow$685(value25158);
        if (value56 != null) {
            edgeValue25216 = (int) ((value25160 ? 1 : 0));
            regionValue25183 = value24678;
            regionValue25184 = value24679;
            regionValue25188 = edgeValue25216;
            break region2299;
        } else {
            edgeValue25272 = (int) ((value25160 ? 1 : 0));
            break region2205;
        }
        }
        if (edgeValue25272 == 0) {
            regionValue25295 = value24678;
            regionValue25296 = value24679;
            break region2291;
        } else {
            break region2206;
        }
        }
        break region2208;
        }
        value25431 = ((java.lang.Object)(((net.C_45V) (((java.lang.Object)(value25158))))));
        value25433 = recovery$indy$flow$687();
        value25434 = recovery$indy$flow$688(value25433);
        value25435 = recovery$indy$flow$689(value25434, value24869);
        converted25436 = (double) (value25435);
        value25438 = recovery$indy$flow$690(value25431);
        computed25439 = value24678 + value25438;
        computed25441 = converted25436 * Double.longBitsToDouble(4608308318706860032L);
        converted25442 = (float) (computed25441);
        value25444 = recovery$indy$flow$691(value25158, value24869);
        if (value56 != null) {
            edgeValue25500 = (int) ((value25444 ? 1 : 0));
            regionValue25472 = edgeValue25500;
            break region2240;
        } else {
            edgeValue25558 = (int) ((value25444 ? 1 : 0));
            break region2232;
        }
        }
        if (edgeValue25558 == 0) {
            regionValue25585 = converted25442;
            break region2289;
        } else {
            break region2233;
        }
        }
        break region2235;
        }
        comparison25725 = (java.lang.Double.isNaN(converted25436) || java.lang.Double.isNaN(0.0D) ? -1 : (converted25436 > 0.0D ? 1 : converted25436 == 0.0D ? 0 : -1));
        regionValue25472 = comparison25725;
        break region2240;
        }
        if (regionValue25472 != 0) {
            regionValue25585 = converted25442;
            break region2289;
        } else {
            break region2241;
        }
        }
        value25835 = recovery$indy$flow$692();
        value25837 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value25835))))));
        value25838 = recovery$indy$flow$694(value25837);
        if (value56 != null) {
            regionValue25866 = value25838;
            break region2268;
        } else {
            break region2252;
        }
        }
        break region2254;
        }
        if (value25838 == null) {
            regionValue25585 = converted25442;
            break region2289;
        } else {
            break region2255;
        }
        }
        break region2257;
        }
        value26142 = recovery$indy$flow$695();
        value26144 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value26142))))));
        value26145 = recovery$indy$flow$697(value26144);
        regionValue25866 = value26145;
        break region2268;
        }
        value26174 = ((java.lang.Object)(((net.C_47WU) (((java.lang.Object)(regionValue25866)))).field_48));
        value26175 = recovery$indy$flow$699(value26174, "gommehd.net");
        if ((int) ((value26175 ? 1 : 0)) == 0) {
            regionValue25585 = converted25442;
            break region2289;
        } else {
            break region2272;
        }
        }
        value26258 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value26259 = ((java.lang.Object)(((net.C_47rf) (((java.lang.Object)(value24869))))));
        value26260 = recovery$indy$flow$702(value26258, value26259, computed48);
        regionValue25585 = value26260;
        break region2289;
        }
        if (value56 == null) {
            edgeValue26311 = regionValue25585;
            regionValue25000 = computed25439;
            regionValue25001 = edgeValue26311;
            break region2391;
        } else {
            edgeValue26336 = regionValue25585;
            regionValue25295 = computed25439;
            regionValue25296 = edgeValue26336;
            break region2291;
        }
        }
        if (value56 != null) {
            edgeValue26390 = regionValue25295;
            edgeValue26391 = regionValue25296;
            regionValue26362 = edgeValue26390;
            regionValue26363 = edgeValue26391;
            break region2301;
        } else {
            edgeValue26446 = regionValue25295;
            edgeValue26447 = regionValue25296;
            regionValue26418 = edgeValue26446;
            regionValue26419 = edgeValue26447;
            break region2294;
        }
        }
        edgeValue26502 = regionValue26418;
        edgeValue26503 = regionValue26419;
        regionValue26474 = edgeValue26502;
        regionValue26475 = edgeValue26503;
        break region2296;
        }
        value26508 = recovery$indy$flow$703(value25158);
        edgeValue26531 = regionValue26474;
        edgeValue26532 = regionValue26475;
        edgeValue26536 = (int) ((value26508 ? 1 : 0));
        regionValue25183 = edgeValue26531;
        regionValue25184 = edgeValue26532;
        regionValue25188 = edgeValue26536;
        break region2299;
        }
        if (regionValue25188 == 0) {
            edgeValue26558 = regionValue25183;
            edgeValue26559 = regionValue25184;
            regionValue25000 = edgeValue26558;
            regionValue25001 = edgeValue26559;
            break region2391;
        } else {
            edgeValue26610 = regionValue25183;
            edgeValue26611 = regionValue25184;
            regionValue26583 = edgeValue26610;
            regionValue26584 = edgeValue26611;
            break region2300;
        }
        }
        edgeValue26637 = regionValue26583;
        edgeValue26638 = regionValue26584;
        regionValue26362 = edgeValue26637;
        regionValue26363 = edgeValue26638;
        break region2301;
        }
        value26643 = ((java.lang.Object)(((net.C_45r) (((java.lang.Object)(value25158))))));
        value26645 = recovery$indy$flow$705();
        value26646 = recovery$indy$flow$706(value26645);
        value26647 = recovery$indy$flow$707(value26646, value24869);
        converted26648 = (double) (value26647);
        value26650 = recovery$indy$flow$708(value26643);
        computed26651 = regionValue26362 + value26650;
        comparison26653 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison26653 < 0) {
            edgeValue26705 = regionValue26363;
            regionValue26677 = edgeValue26705;
            break region2327;
        } else {
            edgeValue26761 = regionValue26363;
            regionValue26733 = edgeValue26761;
            break region2318;
        }
        }
        computed26766 = converted26648 * Double.longBitsToDouble(4608308318706860032L);
        converted26767 = (float) (computed26766);
        if (value56 != null) {
            edgeValue26815 = regionValue26733;
            regionValue26789 = computed26651;
            regionValue26790 = edgeValue26815;
            regionValue26792 = converted26767;
            break region2430;
        } else {
            break region2324;
        }
        }
        break region2326;
        }
        regionValue26677 = converted26767;
        break region2327;
        }
        value26959 = recovery$indy$flow$709(value25158, value24869);
        comparison26960 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison26960 <= 0) {
            edgeValue27011 = regionValue26677;
            edgeValue27014 = (int) ((value26959 ? 1 : 0));
            regionValue26984 = edgeValue27011;
            regionValue26987 = edgeValue27014;
            break region2342;
        } else {
            edgeValue27066 = regionValue26677;
            edgeValue27070 = (int) ((value26959 ? 1 : 0));
            regionValue27038 = edgeValue27066;
            break region2334;
        }
        }
        if (edgeValue27070 == 0) {
            edgeValue27093 = regionValue27038;
            regionValue25000 = computed26651;
            regionValue25001 = edgeValue27093;
            break region2391;
        } else {
            edgeValue27145 = regionValue27038;
            regionValue27118 = edgeValue27145;
            break region2335;
        }
        }
        edgeValue27199 = regionValue27118;
        regionValue27172 = edgeValue27199;
        break region2337;
        }
        comparison27203 = (java.lang.Double.isNaN(converted26648) || java.lang.Double.isNaN(0.0D) ? -1 : (converted26648 > 0.0D ? 1 : converted26648 == 0.0D ? 0 : -1));
        edgeValue27227 = regionValue27172;
        regionValue26984 = edgeValue27227;
        regionValue26987 = comparison27203;
        break region2342;
        }
        if (regionValue26987 != 0) {
            edgeValue27253 = regionValue26984;
            regionValue25000 = computed26651;
            regionValue25001 = edgeValue27253;
            break region2391;
        } else {
            edgeValue27304 = regionValue26984;
            regionValue27278 = edgeValue27304;
            break region2343;
        }
        }
        value27307 = recovery$indy$flow$710();
        value27309 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value27307))))));
        value27310 = recovery$indy$flow$712(value27309);
        if (value56 != null) {
            edgeValue27361 = regionValue27278;
            regionValue27334 = edgeValue27361;
            regionValue27337 = value27310;
            break region2370;
        } else {
            edgeValue27415 = regionValue27278;
            regionValue27388 = edgeValue27415;
            break region2354;
        }
        }
        edgeValue27469 = regionValue27388;
        regionValue27442 = edgeValue27469;
        break region2356;
        }
        if (value27310 == null) {
            edgeValue27495 = regionValue27442;
            regionValue25000 = computed26651;
            regionValue25001 = edgeValue27495;
            break region2391;
        } else {
            edgeValue27546 = regionValue27442;
            regionValue27520 = edgeValue27546;
            break region2357;
        }
        }
        edgeValue27598 = regionValue27520;
        regionValue27572 = edgeValue27598;
        break region2359;
        }
        value27601 = recovery$indy$flow$713();
        value27603 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value27601))))));
        value27604 = recovery$indy$flow$715(value27603);
        edgeValue27628 = regionValue27572;
        regionValue27334 = edgeValue27628;
        regionValue27337 = value27604;
        break region2370;
        }
        value27632 = ((java.lang.Object)(((net.C_47WU) (((java.lang.Object)(regionValue27337)))).field_48));
        value27633 = recovery$indy$flow$717(value27632, "gommehd.net");
        if ((int) ((value27633 ? 1 : 0)) == 0) {
            edgeValue27656 = regionValue27334;
            regionValue25000 = computed26651;
            regionValue25001 = edgeValue27656;
            break region2391;
        } else {
            break region2374;
        }
        }
        value27711 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value27712 = ((java.lang.Object)(((net.C_47rf) (((java.lang.Object)(value24869))))));
        value27713 = recovery$indy$flow$720(value27711, value27712, computed48);
        regionValue25000 = computed26651;
        regionValue25001 = value27713;
        break region2391;
        }
        value27739 = recovery$indy$flow$721();
        computed27740 = regionValue25000 + regionValue25001;
        converted27741 = (byte) (converted22);
        value27742 = 0;
        value27745 = 1;
        value27748 = (int) (converted27741);
        value27751 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value27752 = ((java.lang.Object)(((net.C_47da) (((java.lang.Object)(value27739))))));
        value27753 = ((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer) (((java.lang.Object)(value24680))))));
        value27754 = recovery$indy$flow$725(value27751, value27752, (byte) (value27748), computed27740, value27753, ((value27745 & 1) != 0), converted26, converted30, ((value27742 & 1) != 0));
        edgeValue27776 = regionValue25000;
        edgeValue27777 = regionValue25001;
        regionValue26789 = edgeValue27776;
        regionValue26790 = edgeValue27777;
        regionValue26792 = value27754;
        break region2430;
        }
        value27780 = regionValue26792;
        value27781 = recovery$indy$flow$726();
        computed27782 = regionValue26789 * Float.intBitsToFloat(1069547520);
        computed27783 = computed27782 + regionValue26790;
        converted27784 = (byte) (converted22);
        value27785 = 0;
        value27788 = 1;
        value27791 = (int) (converted27784);
        value27794 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value27795 = ((java.lang.Object)(((net.C_47da) (((java.lang.Object)(value27781))))));
        value27796 = ((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer) (((java.lang.Object)(value24680))))));
        value27797 = recovery$indy$flow$730(value27794, value27795, (byte) (value27791), computed27783, value27796, ((value27788 & 1) != 0), converted26, converted30, ((value27785 & 1) != 0));
        value27799 = recovery$indy$flow$731();
        computed27800 = regionValue26789 * Float.intBitsToFloat(1056964608);
        converted27801 = (byte) (converted22);
        value27802 = 0;
        value27805 = 1;
        value27808 = (int) (converted27801);
        value27811 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value27812 = ((java.lang.Object)(((net.C_47da) (((java.lang.Object)(value27799))))));
        value27813 = ((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer) (((java.lang.Object)(value24680))))));
        value27814 = recovery$indy$flow$735(value27811, value27812, (byte) (value27808), computed27800, value27813, ((value27805 & 1) != 0), converted26, converted30, ((value27802 & 1) != 0));
        value27816 = recovery$indy$flow$736();
        computed27817 = regionValue26789 + regionValue26790;
        converted27818 = (byte) (converted22);
        value27819 = 0;
        value27822 = 0;
        value27825 = (int) (converted27818);
        value27828 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value27829 = ((java.lang.Object)(((net.C_47da) (((java.lang.Object)(value27816))))));
        value27830 = ((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer) (((java.lang.Object)(value24680))))));
        value27831 = recovery$indy$flow$740(value27828, value27829, (byte) (value27825), computed27817, value27830, ((value27822 & 1) != 0), converted26, converted30, ((value27819 & 1) != 0));
        value27833 = recovery$indy$flow$741();
        computed27834 = regionValue26789 * Float.intBitsToFloat(1069547520);
        computed27835 = computed27834 + regionValue26790;
        converted27836 = (byte) (converted22);
        value27837 = 0;
        value27840 = 0;
        value27843 = (int) (converted27836);
        value27846 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value27847 = ((java.lang.Object)(((net.C_47da) (((java.lang.Object)(value27833))))));
        value27848 = ((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer) (((java.lang.Object)(value24680))))));
        value27849 = recovery$indy$flow$745(value27846, value27847, (byte) (value27843), computed27835, value27848, ((value27840 & 1) != 0), converted26, converted30, ((value27837 & 1) != 0));
        value27851 = recovery$indy$flow$746();
        computed27852 = regionValue26789 * Float.intBitsToFloat(1056964608);
        converted27853 = (byte) (converted22);
        value27854 = 0;
        value27857 = 0;
        value27860 = (int) (converted27853);
        value27863 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value27864 = ((java.lang.Object)(((net.C_47da) (((java.lang.Object)(value27851))))));
        value27865 = ((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer) (((java.lang.Object)(value24680))))));
        value27866 = recovery$indy$flow$750(value27863, value27864, (byte) (value27860), computed27852, value27865, ((value27857 & 1) != 0), converted26, converted30, ((value27854 & 1) != 0));
        if (value56 != null) {
            edgeValue27911 = value27780;
            regionValue27886 = edgeValue27911;
            break region2708;
        } else {
            edgeValue27961 = value27780;
            regionValue27936 = edgeValue27961;
            break region2638;
        }
        }
        value27968 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_479));
        comparison27969 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison27969 < 0) {
            edgeValue28013 = regionValue27936;
            regionValue27988 = edgeValue28013;
            regionValue27994 = value27968;
            break region2652;
        } else {
            edgeValue28063 = regionValue27936;
            regionValue28038 = edgeValue28063;
            break region2643;
        }
        }
        edgeValue28113 = regionValue28038;
        regionValue28088 = edgeValue28113;
        break region2645;
        }
        if (value27968 == null) {
            edgeValue28162 = regionValue28088;
            regionValue28138 = edgeValue28162;
            break region2707;
        } else {
            edgeValue28210 = regionValue28088;
            regionValue28186 = edgeValue28210;
            break region2646;
        }
        }
        edgeValue28258 = regionValue28186;
        regionValue28234 = edgeValue28258;
        break region2648;
        }
        value28264 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_479));
        edgeValue28283 = regionValue28234;
        regionValue27988 = edgeValue28283;
        regionValue27994 = value28264;
        break region2652;
        }
        value28290 = regionValue27994;
        value28291 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value28290))))));
        value28292 = recovery$indy$flow$754(value28291);
        comparison28293 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison28293 <= 0) {
            edgeValue28336 = regionValue27988;
            edgeValue28342 = (int) ((value28292 ? 1 : 0));
            regionValue28311 = edgeValue28336;
            regionValue28317 = edgeValue28342;
            break region2720;
        } else {
            edgeValue28388 = regionValue27988;
            edgeValue28394 = (int) ((value28292 ? 1 : 0));
            regionValue28362 = edgeValue28388;
            break region2665;
        }
        }
        if (value56 != null) {
            edgeValue28437 = regionValue28362;
            regionValue28413 = edgeValue28437;
            regionValue28419 = edgeValue28394;
            break region2719;
        } else {
            edgeValue28487 = regionValue28362;
            regionValue28462 = edgeValue28487;
            break region2666;
        }
        }
        edgeValue28537 = regionValue28462;
        regionValue28512 = edgeValue28537;
        break region2668;
        }
        if (edgeValue28394 == 0) {
            edgeValue28562 = regionValue28512;
            regionValue28138 = edgeValue28562;
            break region2707;
        } else {
            edgeValue28610 = regionValue28512;
            regionValue28586 = edgeValue28610;
            break region2669;
        }
        }
        initialized28616 = new java.lang.StringBuilder();
        value28617 = recovery$indy$flow$757(initialized28616, computed24676);
        value28618 = recovery$indy$flow$758(value28617, " ");
        value28619 = recovery$indy$flow$759(value28618, value27831);
        value28620 = recovery$indy$flow$760(value28619, " ");
        value28621 = recovery$indy$flow$761(value28620, value27849);
        value28622 = recovery$indy$flow$762(value28621);
        converted28623 = (byte) (converted18);
        value28625 = (int) (converted28623);
        value28628 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value28629 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value28622))))));
        recovery$indy$flow$765(value28628, computed14, (byte) (value28625), value28629);
        edgeValue28648 = regionValue28586;
        regionValue28138 = edgeValue28648;
        break region2707;
        }
        edgeValue28672 = regionValue28138;
        regionValue27886 = edgeValue28672;
        break region2708;
        }
        value28681 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value28682 = recovery$indy$flow$767(value28681, computed9);
        edgeValue28700 = regionValue27886;
        edgeValue28706 = (int) ((value28682 ? 1 : 0));
        regionValue28413 = edgeValue28700;
        regionValue28419 = edgeValue28706;
        break region2719;
        }
        edgeValue28724 = regionValue28413;
        edgeValue28730 = regionValue28419;
        regionValue28311 = edgeValue28724;
        regionValue28317 = edgeValue28730;
        break region2720;
        }
        if (value56 != null) {
            edgeValue28773 = regionValue28311;
            edgeValue28779 = regionValue28317;
            regionValue28749 = edgeValue28773;
            regionValue28755 = edgeValue28779;
            break region2955;
        } else {
            edgeValue28821 = regionValue28311;
            edgeValue28827 = regionValue28317;
            regionValue28797 = edgeValue28821;
            regionValue28803 = edgeValue28827;
            break region2721;
        }
        }
        if (regionValue28803 == 0) {
            edgeValue28868 = regionValue28797;
            regionValue28845 = edgeValue28868;
            break region2923;
        } else {
            edgeValue28914 = regionValue28797;
            regionValue28891 = edgeValue28914;
            break region2722;
        }
        }
        if (value56 != null) {
            break region3152;
        } else {
            edgeValue28997 = regionValue28891;
            regionValue28973 = edgeValue28997;
            break region2725;
        }
        }
        edgeValue29045 = regionValue28973;
        regionValue29021 = edgeValue29045;
        break region2727;
        }
        value29052 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43_));
        comparison29053 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison29053 < 0) {
            edgeValue29095 = regionValue29021;
            regionValue29071 = edgeValue29095;
            regionValue29077 = value29052;
            break region2741;
        } else {
            edgeValue29143 = regionValue29021;
            regionValue29119 = edgeValue29143;
            break region2732;
        }
        }
        edgeValue29191 = regionValue29119;
        regionValue29167 = edgeValue29191;
        break region2734;
        }
        if (value29052 == null) {
            break region3105;
        } else {
            edgeValue29278 = regionValue29167;
            regionValue29255 = edgeValue29278;
            break region2735;
        }
        }
        edgeValue29324 = regionValue29255;
        regionValue29301 = edgeValue29324;
        break region2737;
        }
        value29330 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43_));
        edgeValue29348 = regionValue29301;
        regionValue29071 = edgeValue29348;
        regionValue29077 = value29330;
        break region2741;
        }
        value29355 = regionValue29077;
        value29356 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value29355))))));
        value29357 = recovery$indy$flow$771(value29356);
        if (value56 != null) {
            edgeValue29393 = (int) ((value29357 ? 1 : 0));
            regionValue29375 = edgeValue29393;
            break region3157;
        } else {
            edgeValue29435 = regionValue29071;
            edgeValue29441 = (int) ((value29357 ? 1 : 0));
            regionValue29411 = edgeValue29435;
            break region2751;
        }
        }
        if (edgeValue29441 == 0) {
            break region3105;
        } else {
            edgeValue29502 = regionValue29411;
            regionValue29479 = edgeValue29502;
            break region2752;
        }
        }
        edgeValue29548 = regionValue29479;
        regionValue29525 = edgeValue29548;
        break region2754;
        }
        converted29554 = (float) (computed24676);
        values29555 = new float[2];
        ((float[]) values29555)[0] = value27831;
        ((float[]) values29555)[1] = value27849;
        value29560 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value29561 = recovery$indy$flow$773(values29555);
        value29562 = recovery$indy$flow$774(value29560, computed54, converted29554, value29561);
        converted29564 = (double) (value29562);
        computed29565 = value27831 - regionValue29525;
        value29566 = recovery$indy$flow$775(computed29565);
        converted29567 = (double) (value29566);
        converted29568 = (char) (converted38);
        converted29569 = (char) (converted42);
        value29571 = (int) (converted29569);
        value29572 = (int) (converted29568);
        value29577 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value29578 = recovery$indy$flow$777(value29577, converted34, computed24676, converted29564, (char) (value29572), (char) (value29571), converted29567);
        comparison29579 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison29579 <= 0) {
            edgeValue29622 = regionValue29525;
            edgeValue29628 = (int) ((value29578 ? 1 : 0));
            regionValue29597 = edgeValue29622;
            regionValue29603 = edgeValue29628;
            break region2840;
        } else {
            edgeValue29673 = regionValue29525;
            edgeValue29680 = (int) ((value29578 ? 1 : 0));
            regionValue29647 = edgeValue29673;
            break region2829;
        }
        }
        if (value56 != null) {
            edgeValue29723 = regionValue29647;
            regionValue29699 = edgeValue29723;
            regionValue29705 = edgeValue29680;
            break region2839;
        } else {
            edgeValue29772 = regionValue29647;
            regionValue29747 = edgeValue29772;
            break region2830;
        }
        }
        edgeValue29822 = regionValue29747;
        regionValue29797 = edgeValue29822;
        break region2832;
        }
        if (edgeValue29680 != 0) {
            edgeValue29870 = regionValue29797;
            regionValue29847 = edgeValue29870;
            break region2921;
        } else {
            edgeValue29917 = regionValue29797;
            regionValue29893 = edgeValue29917;
            break region2833;
        }
        }
        converted29924 = (double) (value29562);
        comparison29925 = (java.lang.Double.isNaN(computed24676) || java.lang.Double.isNaN(converted29924) ? 1 : (computed24676 > converted29924 ? 1 : computed24676 == converted29924 ? 0 : -1));
        edgeValue29943 = regionValue29893;
        regionValue29699 = edgeValue29943;
        regionValue29705 = comparison29925;
        break region2839;
        }
        edgeValue29967 = regionValue29699;
        edgeValue29973 = regionValue29705;
        regionValue29597 = edgeValue29967;
        regionValue29603 = edgeValue29973;
        break region2840;
        }
        comparison29975 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison29975 < 0) {
            edgeValue30018 = regionValue29597;
            edgeValue30024 = regionValue29603;
            regionValue29993 = edgeValue30018;
            regionValue29999 = edgeValue30024;
            break region2881;
        } else {
            edgeValue30068 = regionValue29597;
            edgeValue30074 = regionValue29603;
            regionValue30043 = edgeValue30068;
            regionValue30049 = edgeValue30074;
            break region2844;
        }
        }
        if (value56 != null) {
            edgeValue30117 = regionValue30043;
            edgeValue30123 = regionValue30049;
            regionValue30093 = edgeValue30117;
            regionValue30099 = edgeValue30123;
            break region2880;
        } else {
            edgeValue30165 = regionValue30043;
            edgeValue30171 = regionValue30049;
            regionValue30141 = edgeValue30165;
            regionValue30147 = edgeValue30171;
            break region2845;
        }
        }
        edgeValue30213 = regionValue30141;
        edgeValue30219 = regionValue30147;
        regionValue30189 = edgeValue30213;
        regionValue30195 = edgeValue30219;
        break region2847;
        }
        if (regionValue30195 >= 0) {
            edgeValue30237 = regionValue30189;
            regionValue29847 = edgeValue30237;
            break region2921;
        } else {
            edgeValue30283 = regionValue30189;
            regionValue30260 = edgeValue30283;
            break region2848;
        }
        }
        converted30289 = (double) (value27814);
        converted30290 = (char) (converted38);
        converted30291 = (char) (converted42);
        value30292 = Double.longBitsToDouble(4576918229175238656L);
        value30293 = (int) (converted30291);
        value30294 = (int) (converted30290);
        value30299 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value30300 = recovery$indy$flow$779(value30299, converted34, computed24676, converted30289, (char) (value30294), (char) (value30293), value30292);
        edgeValue30318 = regionValue30260;
        edgeValue30324 = (int) ((value30300 ? 1 : 0));
        regionValue30093 = edgeValue30318;
        regionValue30099 = edgeValue30324;
        break region2880;
        }
        edgeValue30342 = regionValue30093;
        edgeValue30348 = regionValue30099;
        regionValue29993 = edgeValue30342;
        regionValue29999 = edgeValue30348;
        break region2881;
        }
        if (value56 != null) {
            edgeValue30391 = regionValue29993;
            edgeValue30397 = regionValue29999;
            regionValue30367 = edgeValue30391;
            regionValue30373 = edgeValue30397;
            break region2891;
        } else {
            edgeValue30439 = regionValue29993;
            edgeValue30445 = regionValue29999;
            regionValue30415 = edgeValue30439;
            regionValue30421 = edgeValue30445;
            break region2882;
        }
        }
        if (regionValue30421 != 0) {
            edgeValue30463 = regionValue30415;
            regionValue29847 = edgeValue30463;
            break region2921;
        } else {
            edgeValue30509 = regionValue30415;
            regionValue30486 = edgeValue30509;
            break region2883;
        }
        }
        if (value56 != null) {
            edgeValue30556 = regionValue30486;
            regionValue30532 = edgeValue30556;
            break region2916;
        } else {
            edgeValue30604 = regionValue30486;
            regionValue30580 = edgeValue30604;
            break region2886;
        }
        }
        edgeValue30652 = regionValue30580;
        regionValue30628 = edgeValue30652;
        break region2888;
        }
        value30659 = recovery$indy$flow$780(this);
        edgeValue30677 = regionValue30628;
        regionValue30367 = edgeValue30677;
        regionValue30373 = value30659;
        break region2891;
        }
        if (regionValue30373 <= 8) {
            edgeValue30724 = regionValue30367;
            regionValue30701 = edgeValue30724;
            break region2915;
        } else {
            edgeValue30770 = regionValue30367;
            regionValue30747 = edgeValue30770;
            break region2893;
        }
        }
        converted30776 = (byte) (converted18);
        value30777 = "Your enemy makes reduced Damage (unsafe) (single)!";
        value30778 = (int) (converted30776);
        value30781 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value30782 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value30777))))));
        recovery$indy$flow$783(value30781, computed14, (byte) (value30778), value30782);
        edgeValue30800 = regionValue30747;
        regionValue30701 = edgeValue30800;
        break region2915;
        }
        edgeValue30823 = regionValue30701;
        regionValue30532 = edgeValue30823;
        break region2916;
        }
        value30830 = recovery$indy$flow$784(this);
        computed30831 = value30830 + 2;
        recovery$indy$flow$785(this, computed30831);
        edgeValue30849 = regionValue30532;
        regionValue29847 = edgeValue30849;
        break region2921;
        }
        if (value56 == null) {
            break region3105;
        } else {
            edgeValue30892 = regionValue29847;
            regionValue28845 = edgeValue30892;
            break region2923;
        }
        }
        converted30898 = (double) (regionValue28845);
        converted30899 = (char) (converted38);
        converted30900 = (char) (converted42);
        value30901 = Double.longBitsToDouble(4576918229175238656L);
        value30902 = (int) (converted30900);
        value30903 = (int) (converted30899);
        value30908 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value30909 = recovery$indy$flow$787(value30908, converted34, computed24676, converted30898, (char) (value30903), (char) (value30902), value30901);
        edgeValue30927 = regionValue28845;
        edgeValue30933 = (int) ((value30909 ? 1 : 0));
        regionValue28749 = edgeValue30927;
        regionValue28755 = edgeValue30933;
        break region2955;
        }
        if (regionValue28755 == 0) {
            edgeValue30974 = regionValue28749;
            regionValue30951 = edgeValue30974;
            break region2956;
        } else {
            edgeValue30997 = regionValue28749;
            regionValue30951 = edgeValue30997;
            break region2956;
        }
        }
        converted31003 = (double) (regionValue30951);
        converted31004 = (char) (converted38);
        converted31005 = (char) (converted42);
        value31006 = Double.longBitsToDouble(4576918229175238656L);
        value31007 = (int) (converted31005);
        value31008 = (int) (converted31004);
        value31013 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value31014 = recovery$indy$flow$789(value31013, converted34, computed24676, converted31003, (char) (value31008), (char) (value31007), value31006);
        if (value56 != null) {
            edgeValue31032 = (int) ((value31014 ? 1 : 0));
            regionValue29375 = edgeValue31032;
            break region3157;
        } else {
            edgeValue31078 = (int) ((value31014 ? 1 : 0));
            break region2988;
        }
        }
        if (edgeValue31078 != 0) {
            break region3105;
        } else {
            break region2989;
        }
        }
        break region2991;
        }
        converted31187 = (double) (value27797);
        converted31188 = (char) (converted38);
        converted31189 = (char) (converted42);
        value31190 = Double.longBitsToDouble(4576918229175238656L);
        value31191 = (int) (converted31189);
        value31192 = (int) (converted31188);
        value31197 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value31198 = recovery$indy$flow$791(value31197, converted34, computed24676, converted31187, (char) (value31192), (char) (value31191), value31190);
        if (value56 != null) {
            edgeValue31216 = (int) ((value31198 ? 1 : 0));
            regionValue29375 = edgeValue31216;
            break region3157;
        } else {
            edgeValue31262 = (int) ((value31198 ? 1 : 0));
            break region3023;
        }
        }
        break region3025;
        }
        if (edgeValue31262 != 0) {
            break region3105;
        } else {
            break region3026;
        }
        }
        break region3028;
        }
        converted31417 = (double) (value27814);
        converted31418 = (char) (converted38);
        converted31419 = (char) (converted42);
        value31420 = Double.longBitsToDouble(4576918229175238656L);
        value31421 = (int) (converted31419);
        value31422 = (int) (converted31418);
        value31427 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value31428 = recovery$indy$flow$793(value31427, converted34, computed24676, converted31417, (char) (value31422), (char) (value31421), value31420);
        if (value56 != null) {
            edgeValue31446 = (int) ((value31428 ? 1 : 0));
            regionValue29375 = edgeValue31446;
            break region3157;
        } else {
            edgeValue31490 = (int) ((value31428 ? 1 : 0));
            break region3060;
        }
        }
        break region3062;
        }
        if (edgeValue31490 != 0) {
            break region3105;
        } else {
            break region3063;
        }
        }
        break region3065;
        }
        initialized31639 = new java.lang.StringBuilder();
        value31640 = recovery$indy$flow$796(initialized31639, "Your enemy makes reduced Damage (single)! ");
        value31641 = recovery$indy$flow$797(value31640, computed24676);
        value31642 = recovery$indy$flow$798(value31641, " ");
        value31643 = recovery$indy$flow$799(value31642, value27831);
        value31644 = recovery$indy$flow$800(value31643, " ");
        value31645 = recovery$indy$flow$801(value31644, value27797);
        value31646 = recovery$indy$flow$802(value31645);
        converted31647 = (byte) (converted18);
        value31649 = (int) (converted31647);
        value31652 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value31653 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value31646))))));
        recovery$indy$flow$805(value31652, computed14, (byte) (value31649), value31653);
        break region3105;
        }
        value31674 = recovery$indy$flow$806(this);
        computed31675 = value31674 - 1;
        recovery$indy$flow$807(this, computed31675);
        value31676 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47R));
        converted31677 = (float) (computed24676);
        values31678 = new float[3];
        ((float[]) values31678)[0] = value27831;
        ((float[]) values31678)[1] = value27849;
        ((float[]) values31678)[2] = value27866;
        value31683 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value31684 = recovery$indy$flow$810(values31678);
        value31685 = recovery$indy$flow$811(value31683, computed54, converted31677, value31684);
        value31686 = recovery$indy$flow$812(value31685);
        value31687 = recovery$indy$flow$813(value31676, value31686);
        break region3152;
        }
        value31706 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43h));
        converted31707 = (float) (computed24676);
        value31708 = recovery$indy$flow$815(converted31707);
        value31709 = recovery$indy$flow$816(value31706, value31708);
        edgeValue31727 = (int) ((value31709 ? 1 : 0));
        regionValue29375 = edgeValue31727;
        break region3157;
        }
        break region3158;
        }
        loop3158: while (true) {
        region3176: {
        region3174: {
        region3168: {
        region3163: {
        value31762 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47R));
        value31763 = recovery$indy$flow$818(value31762);
        if (value31763 <= 10) {
            break region3180;
        } else {
            break region3163;
        }
        }
        comparison31832 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison31832 < 0) {
            break region3207;
        } else {
            break region3168;
        }
        }
        value31905 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47R));
        value31906 = recovery$indy$flow$820(value31905, 0);
        if (value56 != null) {
            break region3206;
        } else {
            break region3174;
        }
        }
        break region3176;
        }
        if (value56 == null) {
            continue loop3158;
        } else {
            break region3178;
        }
        }
        }
        break region3180;
        }
        loop3180: while (true) {
        region3205: {
        region3204: {
        region3202: {
        region3201: {
        region3199: {
        region3189: {
        region3188: {
        value32077 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43h));
        value32078 = recovery$indy$flow$822(value32077);
        comparison32079 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison32079 <= 0) {
            edgeValue32116 = value32078;
            edgeValue32117 = 10;
            regionValue32097 = edgeValue32116;
            regionValue32098 = edgeValue32117;
            break region3214;
        } else {
            edgeValue32154 = value32078;
            edgeValue32155 = 10;
            regionValue32135 = edgeValue32154;
            regionValue32136 = edgeValue32155;
            break region3188;
        }
        }
        if (regionValue32135 <= regionValue32136) {
            break region3206;
        } else {
            break region3189;
        }
        }
        value32207 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43h));
        value32208 = recovery$indy$flow$824(value32207, 0);
        comparison32209 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison32209 < 0) {
            break region3205;
        } else {
            break region3199;
        }
        }
        break region3201;
        }
        if (value56 != null) {
            break region3348;
        } else {
            break region3202;
        }
        }
        break region3204;
        }
        break region3205;
        }
        if (value56 == null) {
            continue loop3180;
        } else {
            break region3206;
        }
        }
        }
        break region3207;
        }
        if (value56 != null) {
            break region3349;
        } else {
            break region3209;
        }
        }
        value32530 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47R));
        value32531 = recovery$indy$flow$826(value32530);
        edgeValue32550 = 10;
        regionValue32097 = value32531;
        regionValue32098 = edgeValue32550;
        break region3214;
        }
        if (regionValue32097 < regionValue32098) {
            break region3348;
        } else {
            break region3215;
        }
        }
        if (value56 != null) {
            break region3349;
        } else {
            break region3218;
        }
        }
        break region3220;
        }
        value32682 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43_));
        value32684 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value32682))))));
        value32685 = recovery$indy$flow$829(value32684);
        if ((int) ((value32685 ? 1 : 0)) == 0) {
            break region3348;
        } else {
            break region3230;
        }
        }
        break region3232;
        }
        value32766 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47R));
        value32767 = recovery$indy$flow$831(value32766);
        value32768 = recovery$indy$flow$832();
        value32769 = recovery$indy$flow$833(value32767, value32768);
        value32770 = recovery$indy$flow$834(value32769);
        value32771 = recovery$indy$flow$835(value32770, 0.0D);
        value32773 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_43h));
        value32774 = recovery$indy$flow$837(value32773);
        value32775 = recovery$indy$flow$838();
        value32776 = recovery$indy$flow$839(value32774, value32775);
        value32777 = recovery$indy$flow$840(value32776);
        value32778 = recovery$indy$flow$841(value32777, 0.0D);
        if (value56 != null) {
            regionValue32792 = value32778;
            break region3352;
        } else {
            break region3254;
        }
        }
        value32846 = Double.longBitsToDouble(4591149604126578442L);
        comparison32849 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison32849 < 0) {
            break region3317;
        } else {
            break region3263;
        }
        }
        converted32922 = (char) (converted38);
        converted32923 = (char) (converted42);
        value32925 = (int) (converted32923);
        value32926 = (int) (converted32922);
        value32931 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value32932 = recovery$indy$flow$843(value32931, converted34, value32778, value32771, (char) (value32926), (char) (value32925), value32846);
        if ((int) ((value32932 ? 1 : 0)) != 0) {
            break region3348;
        } else {
            break region3292;
        }
        }
        break region3294;
        }
        converted33001 = (byte) (converted18);
        value33002 = "Your enemy makes reduced Damage (unsafe) (avg)!";
        value33003 = (int) (converted33001);
        value33006 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value33007 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value33002))))));
        recovery$indy$flow$846(value33006, computed14, (byte) (value33003), value33007);
        break region3317;
        }
        initialized33023 = new java.lang.StringBuilder();
        value33024 = recovery$indy$flow$849(initialized33023, computed24676);
        value33025 = recovery$indy$flow$850(value33024, " ");
        value33026 = recovery$indy$flow$851(value33025, value27831);
        value33027 = recovery$indy$flow$852(value33026);
        converted33028 = (byte) (converted18);
        value33030 = (int) (converted33028);
        value33033 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value33034 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value33027))))));
        recovery$indy$flow$855(value33033, computed14, (byte) (value33030), value33034);
        break region3348;
        }
        break region3349;
        }
        value33060 = recovery$indy$flow$856(value24671);
        converted33061 = (double) (value33060);
        regionValue32792 = converted33061;
        break region3352;
        }
        recovery$indy$flow$857(this, regionValue32792);
        break region3353;
        }
        break region3354;
        }
        value33098 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_432));
        if (value56 != null) {
            regionValue33110 = value33098;
            break region3368;
        } else {
            break region3357;
        }
        }
        if (value33098 == null) {
            break region3434;
        } else {
            break region3358;
        }
        }
        break region3360;
        }
        if (value56 != null) {
            break region3415;
        } else {
            break region3363;
        }
        }
        break region3365;
        }
        value33279 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_432));
        regionValue33110 = value33279;
        break region3368;
        }
        value33293 = regionValue33110;
        value33294 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value33293))))));
        value33295 = recovery$indy$flow$861(value33294, computed44);
        value33296 = recovery$indy$flow$862(value33295, "Incoming");
        comparison33297 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison33297 < 0) {
            edgeValue33319 = (int) ((value33296 ? 1 : 0));
            regionValue33308 = edgeValue33319;
            break region3405;
        } else {
            edgeValue33343 = (int) ((value33296 ? 1 : 0));
            break region3385;
        }
        }
        if (edgeValue33343 != 0) {
            break region3414;
        } else {
            break region3386;
        }
        }
        break region3388;
        }
        value33408 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_432));
        value33411 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(value33408))))));
        value33412 = recovery$indy$flow$865(value33411, computed44);
        value33413 = recovery$indy$flow$866(value33412, "All");
        edgeValue33424 = (int) ((value33413 ? 1 : 0));
        regionValue33308 = edgeValue33424;
        break region3405;
        }
        comparison33425 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison33425 <= 0) {
            edgeValue33446 = regionValue33308;
            regionValue33435 = edgeValue33446;
            break region3437;
        } else {
            edgeValue33470 = regionValue33308;
            regionValue33458 = edgeValue33470;
            break region3410;
        }
        }
        if (value56 != null) {
            edgeValue33491 = regionValue33458;
            regionValue33481 = edgeValue33491;
            break region3436;
        } else {
            edgeValue33513 = regionValue33458;
            regionValue33502 = edgeValue33513;
            break region3411;
        }
        }
        edgeValue33535 = regionValue33502;
        regionValue33524 = edgeValue33535;
        break region3413;
        }
        if (regionValue33524 == 0) {
            break region3434;
        } else {
            break region3414;
        }
        }
        break region3415;
        }
        value33566 = "Incoming: ";
        value33570 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value33571 = ((java.lang.Object)(((net.C_473U) (((java.lang.Object)(value60))))));
        value33572 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value33566))))));
        recovery$indy$flow$870(value33570, computed52, value33571, value33572);
        break region3434;
        }
        break region3435;
        }
        value33592 = recovery$indy$flow$871(value60);
        edgeValue33602 = (int) ((value33592 ? 1 : 0));
        regionValue33481 = edgeValue33602;
        break region3436;
        }
        edgeValue33612 = regionValue33481;
        regionValue33435 = edgeValue33612;
        break region3437;
        }
        if (value56 != null) {
            edgeValue33633 = regionValue33435;
            regionValue33623 = edgeValue33633;
            break region3684;
        } else {
            edgeValue33653 = regionValue33435;
            regionValue33643 = edgeValue33653;
            break region3438;
        }
        }
        if (regionValue33643 != 0) {
            break region3682;
        } else {
            break region3439;
        }
        }
        value33690 = recovery$indy$flow$872(value60);
        if (value56 != null) {
            edgeValue33700 = (int) ((value33690 ? 1 : 0));
            regionValue33623 = edgeValue33700;
            break region3684;
        } else {
            edgeValue33720 = (int) ((value33690 ? 1 : 0));
            break region3443;
        }
        }
        break region3445;
        }
        if (edgeValue33720 != 0) {
            break region3682;
        } else {
            break region3446;
        }
        }
        break region3448;
        }
        value33786 = recovery$indy$flow$873(value60);
        if (value56 != null) {
            edgeValue33796 = (int) ((value33786 ? 1 : 0));
            regionValue33623 = edgeValue33796;
            break region3684;
        } else {
            edgeValue33816 = (int) ((value33786 ? 1 : 0));
            break region3452;
        }
        }
        break region3454;
        }
        if (edgeValue33816 != 0) {
            break region3682;
        } else {
            break region3455;
        }
        }
        break region3457;
        }
        value33882 = recovery$indy$flow$874(value60);
        if (value56 != null) {
            edgeValue33892 = (int) ((value33882 ? 1 : 0));
            regionValue33623 = edgeValue33892;
            break region3684;
        } else {
            edgeValue33912 = (int) ((value33882 ? 1 : 0));
            break region3461;
        }
        }
        break region3463;
        }
        if (edgeValue33912 != 0) {
            break region3682;
        } else {
            break region3464;
        }
        }
        break region3466;
        }
        value33978 = recovery$indy$flow$875(value60);
        if (value56 != null) {
            edgeValue33988 = (int) ((value33978 ? 1 : 0));
            regionValue33623 = edgeValue33988;
            break region3684;
        } else {
            edgeValue34008 = (int) ((value33978 ? 1 : 0));
            break region3470;
        }
        }
        break region3472;
        }
        if (edgeValue34008 != 0) {
            break region3682;
        } else {
            break region3473;
        }
        }
        break region3475;
        }
        value34074 = recovery$indy$flow$876(value60);
        if (value56 != null) {
            edgeValue34084 = (int) ((value34074 ? 1 : 0));
            regionValue33623 = edgeValue34084;
            break region3684;
        } else {
            edgeValue34104 = (int) ((value34074 ? 1 : 0));
            break region3479;
        }
        }
        break region3481;
        }
        if (edgeValue34104 != 0) {
            break region3682;
        } else {
            break region3482;
        }
        }
        break region3484;
        }
        value34170 = recovery$indy$flow$877(value60);
        if (value56 != null) {
            edgeValue34180 = (int) ((value34170 ? 1 : 0));
            regionValue33623 = edgeValue34180;
            break region3684;
        } else {
            edgeValue34200 = (int) ((value34170 ? 1 : 0));
            break region3488;
        }
        }
        break region3490;
        }
        if (edgeValue34200 != 0) {
            break region3682;
        } else {
            break region3491;
        }
        }
        break region3493;
        }
        value34266 = recovery$indy$flow$878(value60);
        if (value56 != null) {
            edgeValue34276 = (int) ((value34266 ? 1 : 0));
            regionValue33623 = edgeValue34276;
            break region3684;
        } else {
            edgeValue34296 = (int) ((value34266 ? 1 : 0));
            break region3497;
        }
        }
        break region3499;
        }
        if (edgeValue34296 != 0) {
            break region3682;
        } else {
            break region3500;
        }
        }
        break region3502;
        }
        value34362 = recovery$indy$flow$879(value60);
        if (value56 != null) {
            edgeValue34372 = (int) ((value34362 ? 1 : 0));
            regionValue33623 = edgeValue34372;
            break region3684;
        } else {
            edgeValue34392 = (int) ((value34362 ? 1 : 0));
            break region3506;
        }
        }
        break region3508;
        }
        if (edgeValue34392 != 0) {
            break region3682;
        } else {
            break region3509;
        }
        }
        break region3511;
        }
        value34458 = recovery$indy$flow$880(value60);
        if (value56 != null) {
            edgeValue34468 = (int) ((value34458 ? 1 : 0));
            regionValue33623 = edgeValue34468;
            break region3684;
        } else {
            edgeValue34488 = (int) ((value34458 ? 1 : 0));
            break region3515;
        }
        }
        break region3517;
        }
        if (edgeValue34488 != 0) {
            break region3682;
        } else {
            break region3518;
        }
        }
        break region3520;
        }
        value34554 = recovery$indy$flow$881(value60);
        if (value56 != null) {
            edgeValue34564 = (int) ((value34554 ? 1 : 0));
            regionValue33623 = edgeValue34564;
            break region3684;
        } else {
            edgeValue34584 = (int) ((value34554 ? 1 : 0));
            break region3524;
        }
        }
        break region3526;
        }
        if (edgeValue34584 != 0) {
            break region3682;
        } else {
            break region3527;
        }
        }
        break region3529;
        }
        value34650 = recovery$indy$flow$882(value60);
        if (value56 != null) {
            edgeValue34660 = (int) ((value34650 ? 1 : 0));
            regionValue33623 = edgeValue34660;
            break region3684;
        } else {
            edgeValue34680 = (int) ((value34650 ? 1 : 0));
            break region3533;
        }
        }
        break region3535;
        }
        if (edgeValue34680 != 0) {
            break region3682;
        } else {
            break region3536;
        }
        }
        break region3538;
        }
        value34746 = recovery$indy$flow$883(value60);
        if (value56 != null) {
            edgeValue34756 = (int) ((value34746 ? 1 : 0));
            regionValue33623 = edgeValue34756;
            break region3684;
        } else {
            edgeValue34776 = (int) ((value34746 ? 1 : 0));
            break region3542;
        }
        }
        break region3544;
        }
        if (edgeValue34776 != 0) {
            break region3682;
        } else {
            break region3545;
        }
        }
        break region3547;
        }
        value34842 = recovery$indy$flow$884(value60);
        if (value56 != null) {
            edgeValue34852 = (int) ((value34842 ? 1 : 0));
            regionValue33623 = edgeValue34852;
            break region3684;
        } else {
            edgeValue34872 = (int) ((value34842 ? 1 : 0));
            break region3551;
        }
        }
        break region3553;
        }
        if (edgeValue34872 != 0) {
            break region3682;
        } else {
            break region3554;
        }
        }
        break region3556;
        }
        value34938 = recovery$indy$flow$885(value60);
        if (value56 != null) {
            edgeValue34948 = (int) ((value34938 ? 1 : 0));
            regionValue33623 = edgeValue34948;
            break region3684;
        } else {
            edgeValue34968 = (int) ((value34938 ? 1 : 0));
            break region3560;
        }
        }
        break region3562;
        }
        if (edgeValue34968 != 0) {
            break region3682;
        } else {
            break region3563;
        }
        }
        break region3565;
        }
        value35034 = recovery$indy$flow$886(value60);
        if (value56 != null) {
            edgeValue35044 = (int) ((value35034 ? 1 : 0));
            regionValue33623 = edgeValue35044;
            break region3684;
        } else {
            edgeValue35064 = (int) ((value35034 ? 1 : 0));
            break region3569;
        }
        }
        break region3571;
        }
        if (edgeValue35064 != 0) {
            break region3682;
        } else {
            break region3572;
        }
        }
        break region3574;
        }
        value35130 = recovery$indy$flow$887(value60);
        if (value56 != null) {
            edgeValue35140 = (int) ((value35130 ? 1 : 0));
            regionValue33623 = edgeValue35140;
            break region3684;
        } else {
            edgeValue35160 = (int) ((value35130 ? 1 : 0));
            break region3578;
        }
        }
        break region3580;
        }
        if (edgeValue35160 != 0) {
            break region3682;
        } else {
            break region3581;
        }
        }
        break region3583;
        }
        value35226 = recovery$indy$flow$888(value60);
        if (value56 != null) {
            edgeValue35236 = (int) ((value35226 ? 1 : 0));
            regionValue33623 = edgeValue35236;
            break region3684;
        } else {
            edgeValue35256 = (int) ((value35226 ? 1 : 0));
            break region3587;
        }
        }
        break region3589;
        }
        if (edgeValue35256 != 0) {
            break region3682;
        } else {
            break region3590;
        }
        }
        break region3592;
        }
        value35322 = recovery$indy$flow$889(value60);
        if (value56 != null) {
            edgeValue35332 = (int) ((value35322 ? 1 : 0));
            regionValue33623 = edgeValue35332;
            break region3684;
        } else {
            edgeValue35352 = (int) ((value35322 ? 1 : 0));
            break region3596;
        }
        }
        break region3598;
        }
        if (edgeValue35352 != 0) {
            break region3682;
        } else {
            break region3599;
        }
        }
        break region3601;
        }
        value35418 = recovery$indy$flow$890(value60);
        if (value56 != null) {
            edgeValue35428 = (int) ((value35418 ? 1 : 0));
            regionValue33623 = edgeValue35428;
            break region3684;
        } else {
            edgeValue35448 = (int) ((value35418 ? 1 : 0));
            break region3605;
        }
        }
        break region3607;
        }
        if (edgeValue35448 != 0) {
            break region3682;
        } else {
            break region3608;
        }
        }
        break region3610;
        }
        value35514 = recovery$indy$flow$891(value60);
        if (value56 != null) {
            edgeValue35524 = (int) ((value35514 ? 1 : 0));
            regionValue33623 = edgeValue35524;
            break region3684;
        } else {
            edgeValue35544 = (int) ((value35514 ? 1 : 0));
            break region3614;
        }
        }
        break region3616;
        }
        if (edgeValue35544 != 0) {
            break region3682;
        } else {
            break region3617;
        }
        }
        break region3619;
        }
        value35610 = recovery$indy$flow$892(value60);
        if (value56 != null) {
            edgeValue35620 = (int) ((value35610 ? 1 : 0));
            regionValue33623 = edgeValue35620;
            break region3684;
        } else {
            edgeValue35640 = (int) ((value35610 ? 1 : 0));
            break region3623;
        }
        }
        break region3625;
        }
        if (edgeValue35640 != 0) {
            break region3682;
        } else {
            break region3626;
        }
        }
        break region3628;
        }
        value35706 = recovery$indy$flow$893(value60);
        if (value56 != null) {
            edgeValue35716 = (int) ((value35706 ? 1 : 0));
            regionValue33623 = edgeValue35716;
            break region3684;
        } else {
            edgeValue35736 = (int) ((value35706 ? 1 : 0));
            break region3632;
        }
        }
        break region3634;
        }
        if (edgeValue35736 != 0) {
            break region3682;
        } else {
            break region3635;
        }
        }
        break region3637;
        }
        value35802 = recovery$indy$flow$894(value60);
        if (value56 != null) {
            edgeValue35812 = (int) ((value35802 ? 1 : 0));
            regionValue33623 = edgeValue35812;
            break region3684;
        } else {
            edgeValue35832 = (int) ((value35802 ? 1 : 0));
            break region3641;
        }
        }
        break region3643;
        }
        if (edgeValue35832 != 0) {
            break region3682;
        } else {
            break region3644;
        }
        }
        break region3646;
        }
        value35898 = recovery$indy$flow$895(value60);
        if (value56 != null) {
            edgeValue35908 = (int) ((value35898 ? 1 : 0));
            regionValue33623 = edgeValue35908;
            break region3684;
        } else {
            edgeValue35928 = (int) ((value35898 ? 1 : 0));
            break region3650;
        }
        }
        break region3652;
        }
        if (edgeValue35928 != 0) {
            break region3682;
        } else {
            break region3653;
        }
        }
        break region3655;
        }
        value35994 = recovery$indy$flow$896(value60);
        if (value56 != null) {
            edgeValue36004 = (int) ((value35994 ? 1 : 0));
            regionValue33623 = edgeValue36004;
            break region3684;
        } else {
            edgeValue36024 = (int) ((value35994 ? 1 : 0));
            break region3659;
        }
        }
        break region3661;
        }
        if (edgeValue36024 != 0) {
            break region3682;
        } else {
            break region3662;
        }
        }
        break region3664;
        }
        value36090 = recovery$indy$flow$897(value60);
        comparison36091 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison36091 < 0) {
            edgeValue36112 = (int) ((value36090 ? 1 : 0));
            regionValue36101 = edgeValue36112;
            break region3685;
        } else {
            edgeValue36134 = (int) ((value36090 ? 1 : 0));
            break region3671;
        }
        }
        break region3673;
        }
        if (value56 != null) {
            regionValue33623 = edgeValue36134;
            break region3684;
        } else {
            break region3674;
        }
        }
        break region3676;
        }
        if (edgeValue36134 != 0) {
            break region3682;
        } else {
            break region3677;
        }
        }
        value36235 = recovery$indy$flow$898(value60);
        if ((int) ((value36235 ? 1 : 0)) != 0) {
            break region3682;
        } else {
            break region3680;
        }
        }
        break region3682;
        }
        value36272 = recovery$indy$flow$899(value60);
        edgeValue36282 = (int) ((value36272 ? 1 : 0));
        regionValue33623 = edgeValue36282;
        break region3684;
        }
        edgeValue36292 = regionValue33623;
        regionValue36101 = edgeValue36292;
        break region3685;
        }
        if (value56 != null) {
            edgeValue36313 = regionValue36101;
            regionValue36303 = edgeValue36313;
            break region3724;
        } else {
            edgeValue36333 = regionValue36101;
            regionValue36323 = edgeValue36333;
            break region3686;
        }
        }
        if (regionValue36323 != 0) {
            break region3714;
        } else {
            break region3687;
        }
        }
        value36370 = recovery$indy$flow$900(value60);
        if (value56 != null) {
            edgeValue36380 = (int) ((value36370 ? 1 : 0));
            regionValue36303 = edgeValue36380;
            break region3724;
        } else {
            edgeValue36400 = (int) ((value36370 ? 1 : 0));
            break region3691;
        }
        }
        break region3693;
        }
        if (edgeValue36400 != 0) {
            break region3714;
        } else {
            break region3694;
        }
        }
        break region3696;
        }
        value36466 = recovery$indy$flow$901(value60);
        comparison36467 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison36467 < 0) {
            edgeValue36488 = (int) ((value36466 ? 1 : 0));
            regionValue36477 = edgeValue36488;
            break region3725;
        } else {
            edgeValue36510 = (int) ((value36466 ? 1 : 0));
            break region3703;
        }
        }
        break region3705;
        }
        if (value56 != null) {
            regionValue36303 = edgeValue36510;
            break region3724;
        } else {
            break region3706;
        }
        }
        break region3708;
        }
        if (edgeValue36510 != 0) {
            break region3714;
        } else {
            break region3709;
        }
        }
        value36611 = recovery$indy$flow$902(value60);
        if ((int) ((value36611 ? 1 : 0)) != 0) {
            break region3714;
        } else {
            break region3712;
        }
        }
        break region3714;
        }
        value36648 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).settingKit1V1Damage));
        value36650 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value36648))))));
        value36651 = recovery$indy$flow$905(value36650);
        edgeValue36661 = (int) ((value36651 ? 1 : 0));
        regionValue36303 = edgeValue36661;
        break region3724;
        }
        edgeValue36671 = regionValue36303;
        regionValue36477 = edgeValue36671;
        break region3725;
        }
        if (value56 != null) {
            edgeValue36690 = regionValue36477;
            regionValue36681 = edgeValue36690;
            break region3828;
        } else {
            edgeValue36710 = regionValue36477;
            regionValue36700 = edgeValue36710;
            break region3726;
        }
        }
        if (regionValue36700 == 0) {
            break region3826;
        } else {
            break region3727;
        }
        }
        value36745 = recovery$indy$flow$906(value60);
        if (value56 != null) {
            edgeValue36754 = (int) ((value36745 ? 1 : 0));
            regionValue36681 = edgeValue36754;
            break region3828;
        } else {
            edgeValue36774 = (int) ((value36745 ? 1 : 0));
            break region3731;
        }
        }
        break region3733;
        }
        if (edgeValue36774 == 0) {
            break region3826;
        } else {
            break region3734;
        }
        }
        break region3736;
        }
        value36839 = recovery$indy$flow$907();
        value36841 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value36839))))));
        value36842 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value36841)))).field_42P));
        if (value36842 == null) {
            break region3826;
        } else {
            break region3746;
        }
        }
        break region3748;
        }
        value36887 = ((java.lang.Object)(((net.C_47bo) (((java.lang.Object)(value60))))));
        value36889 = recovery$indy$flow$911(value36887);
        value36890 = recovery$indy$flow$912();
        value36892 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value36890))))));
        value36893 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value36892)))).field_42P));
        value36894 = recovery$indy$flow$915(value36893);
        computed36895 = value36889 - value36894;
        converted36897 = (double) (computed36895);
        comparison36898 = (java.lang.Double.isNaN(converted36897) || java.lang.Double.isNaN(Double.longBitsToDouble(-4610379974535450460L)) ? -1 : (converted36897 > Double.longBitsToDouble(-4610379974535450460L) ? 1 : converted36897 == Double.longBitsToDouble(-4610379974535450460L) ? 0 : -1));
        if (value56 != null) {
            regionValue36681 = comparison36898;
            break region3828;
        } else {
            break region3771;
        }
        }
        if (comparison36898 <= 0) {
            break region3826;
        } else {
            break region3772;
        }
        }
        break region3774;
        }
        comparison36978 = (java.lang.Float.isNaN(computed36895) || java.lang.Float.isNaN(0.0F) ? 1 : (computed36895 > 0.0F ? 1 : computed36895 == 0.0F ? 0 : -1));
        comparison36979 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison36979 <= 0) {
            regionValue36988 = comparison36978;
            break region3829;
        } else {
            break region3782;
        }
        }
        break region3784;
        }
        if (value56 != null) {
            regionValue36681 = comparison36978;
            break region3828;
        } else {
            break region3785;
        }
        }
        break region3787;
        }
        if (comparison36978 >= 0) {
            break region3826;
        } else {
            break region3788;
        }
        }
        initialized37129 = new java.lang.StringBuilder();
        value37130 = recovery$indy$flow$918(initialized37129, "HealthDiff: ");
        converted37131 = (double) (computed36895);
        value37132 = recovery$indy$flow$919(converted37131, computed50, 2, -4104835523710806277L, a0);
        value37133 = recovery$indy$flow$920(value37130, value37132);
        value37134 = recovery$indy$flow$921(value37133);
        converted37135 = (byte) (converted18);
        value37137 = (int) (converted37135);
        value37140 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value37141 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value37134))))));
        recovery$indy$flow$924(value37140, computed14, (byte) (value37137), value37141);
        break region3826;
        }
        value37150 = recovery$indy$flow$925(value60);
        edgeValue37159 = (int) ((value37150 ? 1 : 0));
        regionValue36681 = edgeValue37159;
        break region3828;
        }
        edgeValue37168 = regionValue36681;
        regionValue36988 = edgeValue37168;
        break region3829;
        }
        if (value56 != null) {
            edgeValue37187 = regionValue36988;
            regionValue37178 = edgeValue37187;
            break region3888;
        } else {
            edgeValue37205 = regionValue36988;
            regionValue37196 = edgeValue37205;
            break region3830;
        }
        }
        if (regionValue37196 == 0) {
            break region3886;
        } else {
            break region3831;
        }
        }
        value37238 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).settingSoundName));
        value37240 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value37238))))));
        value37241 = recovery$indy$flow$928(value37240);
        comparison37242 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison37242 <= 0) {
            edgeValue37261 = (int) ((value37241 ? 1 : 0));
            regionValue37251 = edgeValue37261;
            break region3889;
        } else {
            edgeValue37281 = (int) ((value37241 ? 1 : 0));
            break region3846;
        }
        }
        break region3848;
        }
        if (value56 != null) {
            regionValue37178 = edgeValue37281;
            break region3888;
        } else {
            break region3849;
        }
        }
        break region3851;
        }
        if (edgeValue37281 == 0) {
            break region3886;
        } else {
            break region3852;
        }
        }
        value37372 = ((java.lang.Object)(((net.C_477Q) (((java.lang.Object)(value60))))));
        initialized37374 = new java.lang.StringBuilder();
        value37375 = recovery$indy$flow$932(initialized37374, "SoundName: ");
        value37376 = recovery$indy$flow$933(value37372);
        value37377 = recovery$indy$flow$934(value37375, value37376);
        value37378 = recovery$indy$flow$935(value37377);
        converted37379 = (byte) (converted18);
        value37381 = (int) (converted37379);
        value37384 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value37385 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value37378))))));
        recovery$indy$flow$938(value37384, computed14, (byte) (value37381), value37385);
        break region3886;
        }
        value37394 = recovery$indy$flow$939(value60);
        edgeValue37403 = (int) ((value37394 ? 1 : 0));
        regionValue37178 = edgeValue37403;
        break region3888;
        }
        edgeValue37412 = regionValue37178;
        regionValue37251 = edgeValue37412;
        break region3889;
        }
        if (value56 != null) {
            edgeValue37429 = regionValue37251;
            regionValue37421 = edgeValue37429;
            break region3931;
        } else {
            edgeValue37447 = regionValue37251;
            regionValue37438 = edgeValue37447;
            break region3890;
        }
        }
        if (regionValue37438 == 0) {
            break region3929;
        } else {
            break region3891;
        }
        }
        value37478 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).settingOnlyDebugChat));
        value37480 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value37478))))));
        value37481 = recovery$indy$flow$942(value37480);
        if (value56 != null) {
            edgeValue37489 = (int) ((value37481 ? 1 : 0));
            regionValue37421 = edgeValue37489;
            break region3931;
        } else {
            edgeValue37507 = (int) ((value37481 ? 1 : 0));
            break region3903;
        }
        }
        break region3905;
        }
        if (edgeValue37507 == 0) {
            break region3929;
        } else {
            break region3906;
        }
        }
        break region3908;
        }
        value37565 = ((java.lang.Object)(((net.C_47AL) (((java.lang.Object)(value60))))));
        value37567 = recovery$indy$flow$944(value37565);
        value37568 = recovery$indy$flow$945(value37567);
        value37569 = recovery$indy$flow$946(value37568, "Augustus");
        comparison37570 = (a0 > 0L ? 1 : a0 == 0L ? 0 : -1);
        if (comparison37570 <= 0) {
            edgeValue37587 = (int) ((value37569 ? 1 : 0));
            regionValue37578 = edgeValue37587;
            break region3932;
        } else {
            edgeValue37607 = (int) ((value37569 ? 1 : 0));
            break region3921;
        }
        }
        if (value56 != null) {
            regionValue37421 = edgeValue37607;
            break region3931;
        } else {
            break region3922;
        }
        }
        break region3924;
        }
        if (edgeValue37607 != 0) {
            break region3929;
        } else {
            break region3925;
        }
        }
        recovery$indy$flow$947(a1);
        break region3929;
        }
        value37683 = recovery$indy$flow$948(value60);
        edgeValue37691 = (int) ((value37683 ? 1 : 0));
        regionValue37421 = edgeValue37691;
        break region3931;
        }
        edgeValue37699 = regionValue37421;
        regionValue37578 = edgeValue37699;
        break region3932;
        }
        if (value56 != null) {
            edgeValue37716 = regionValue37578;
            regionValue37708 = edgeValue37716;
            break region3946;
        } else {
            edgeValue37732 = regionValue37578;
            regionValue37724 = edgeValue37732;
            break region3933;
        }
        }
        if (regionValue37724 == 0) {
            break region4063;
        } else {
            break region3934;
        }
        }
        value37747 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).settingHitBug));
        value37749 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(value37747))))));
        value37750 = recovery$indy$flow$951(value37749);
        edgeValue37758 = (int) ((value37750 ? 1 : 0));
        regionValue37708 = edgeValue37758;
        break region3946;
        }
        if (regionValue37708 == 0) {
            break region4063;
        } else {
            break region3947;
        }
        }
        value37773 = recovery$indy$flow$952();
        value37775 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value37773))))));
        value37776 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value37775)))).field_42P));
        if (value37776 == null) {
            break region4063;
        } else {
            break region3957;
        }
        }
        break region3959;
        }
        value37805 = ((java.lang.Object)(((net.C_47nD) (((java.lang.Object)(value60))))));
        value37807 = recovery$indy$flow$956(value37805);
        value37808 = recovery$indy$flow$957();
        value37810 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value37808))))));
        value37811 = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(value37810)))).field_42P));
        value37812 = recovery$indy$flow$960(value37811);
        if (value56 != null) {
            regionValue37819 = value37807;
            regionValue37820 = value37812;
            break region3988;
        } else {
            break region3976;
        }
        }
        if (value37807 != value37812) {
            break region4063;
        } else {
            break region3977;
        }
        }
        break region3979;
        }
        value37875 = recovery$indy$flow$961(value37805);
        if (value56 != null) {
            edgeValue37885 = (int) (value37875);
            regionValue37880 = edgeValue37885;
            break region4011;
        } else {
            edgeValue37899 = (int) (value37875);
            break region3983;
        }
        }
        break region3985;
        }
        edgeValue37921 = 2;
        regionValue37819 = edgeValue37899;
        regionValue37820 = edgeValue37921;
        break region3988;
        }
        if (regionValue37819 != regionValue37820) {
            break region4063;
        } else {
            break region3989;
        }
        }
        value37934 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47));
        if (value56 != null) {
            regionValue37936 = value37934;
            break region4055;
        } else {
            break region3993;
        }
        }
        break region3995;
        }
        value37964 = 450L;
        value37966 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value37934))))));
        value37967 = recovery$indy$flow$964(value37966, value37964, computed46);
        edgeValue37972 = (int) ((value37967 ? 1 : 0));
        regionValue37880 = edgeValue37972;
        break region4011;
        }
        if (regionValue37880 != 0) {
            break region4053;
        } else {
            break region4012;
        }
        }
        initialized37985 = new java.lang.StringBuilder();
        value37986 = recovery$indy$flow$967(initialized37985, "Hitbug! ");
        value37987 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47));
        value37989 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value37987))))));
        value37990 = recovery$indy$flow$970(value37989);
        value37991 = recovery$indy$flow$971(value37986, value37990);
        value37992 = recovery$indy$flow$972(value37991);
        converted37993 = (byte) (converted18);
        value37995 = (int) (converted37993);
        value37998 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this))))));
        value37999 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value37992))))));
        recovery$indy$flow$975(value37998, computed14, (byte) (value37995), value37999);
        break region4053;
        }
        value38002 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).field_47));
        regionValue37936 = value38002;
        break region4055;
        }
        value38005 = regionValue37936;
        value38006 = ((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(value38005))))));
        recovery$indy$flow$978(value38006);
        break region4063;
        }
        return;
    }




































   public void method_40$e781d6169a(C_47zh var1, long var2) {
      C_473U var4 = recovery$indy$16(var1, 8497595461085465259L, var2);
   }



   public void method_44$c3e139a72f(C_407 var1, long var2) {
      augustus.recovered.modules.misc.Debug_47kF var55;
      long var10001 = var2 ^ 4337168943803L;
      int var4 = (int)((var2 ^ 4337168943803L) >>> 32);
      int var5 = (int)((var2 ^ 4337168943803L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 8161897488349L;
      long var10000 = -5856356758266617805L;
      int[] var9 = ClientSettings_47kr.method_46$d4d28024c9();
      BooleanSetting var52 = this.field_41;
      if (var9 == null) {
         if (this.field_41 == null) {
            return;
         }

         var52 = this.field_41;
      }

      var10001 = -5862490502099751248L;
      BooleanSetting var11 = var52;
      boolean var53 = var11.method_49$aae029aa0a();
      if (var9 == null) {
         if (!var53) {
            return;
         }

         var10001 = -5860126216106797044L;
         C_407 var12 = var1;
         var53 = var12.method_44$0e30dfc966().equals(recovery$indy$17(3707, 8462634153376920640L ^ var2));
      }

      if (var53) {
         EntityPlayer var10;
         label76: {
            long var10002 = -5860193665612576835L;
            long var13 = var7;
            Debug_47kF var15 = this;
            var10 = var15.method_48$17ab46b827(var13);
            var10002 = -5863346731852177433L;
            C_407 var16 = var1;
            double var60 = var16.method_47$fedcb3e4d3();
            long var10004 = -5860012062306435139L;
            Minecraft var17 = field_43;
            char var65 = (char)var5;
            char var10005 = (char)var6;
            long var10007 = -5856698437578461016L;
            double var18 = 0.01;
            char var20 = var10005;
            char var21 = var65;
            double var22 = var17.field_42P.field_48Q;
            double var24 = var60;
            int var26 = var4;
            Debug_47kF var27 = this;
            boolean var54 = var27.method_43$eb2d8299a3(var26, var24, var22, var21, var20, var18);
            int[] var58 = var9;
            if (var2 >= 0L) {
               if (var9 == null) {
                  if (!var54) {
                     break label76;
                  }

                  var10002 = -5856609959194505733L;
                  C_407 var28 = var1;
                  double var62 = var28.method_44$fedcb3e4d3();
                  var10004 = -5860012062306435139L;
                  Minecraft var29 = field_43;
                  char var67 = (char)var5;
                  var10005 = (char)var6;
                  var10007 = -5856698437578461016L;
                  double var30 = 0.01;
                  char var32 = var10005;
                  char var33 = var67;
                  double var34 = var29.field_42P.field_48j;
                  double var36 = var62;
                  int var38 = var4;
                  Debug_47kF var39 = this;
                  var54 = var39.method_43$eb2d8299a3(var38, var36, var34, var33, var32, var30);
               }

               var58 = var9;
            }

            label77: {
               if (var58 == null) {
                  if (!var54) {
                     break label76;
                  }

                  var55 = this;
                  if (var9 != null) {
                     break label77;
                  }

                  var10002 = -5859550288091092595L;
                  C_407 var40 = var1;
                  double var64 = var40.method_48$fedcb3e4d3();
                  var10004 = -5860012062306435139L;
                  Minecraft var41 = field_43;
                  char var69 = (char)var5;
                  var10005 = (char)var6;
                  var10007 = -5856698437578461016L;
                  double var42 = 0.01;
                  char var44 = var10005;
                  char var45 = var69;
                  double var46 = var41.field_42P.field_42o;
                  double var48 = var64;
                  int var50 = var4;
                  Debug_47kF var51 = this;
                  var54 = var51.method_43$eb2d8299a3(var50, var48, var46, var45, var44, var42);
               }

               if (!var54) {
                  break label76;
               }

               var55 = this;
            }

            var55.field_47s++;
            if (var9 == null) {
               return;
            }
         }

         if (var10 != null) {
            this.field_477++;
         }
      }
   }





   public static void method_44$d00df7729d(int var0) {
      field_433 = var0;
   }



   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      java.lang.StringBuilder var22;
      java.lang.StringBuilder var25;
      net.minecraft.client.gui.FontRenderer var18;
      java.lang.StringBuilder var21;
      net.minecraft.client.gui.FontRenderer var19;
      java.lang.StringBuilder var24;
      label97: {
         long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
         long var10000 = 1632645947605571617L;
         int[] var8 = ClientSettings_47kr.method_46$d4d28024c9();
         BooleanSetting var16 = this.field_41;
         if (var8 == null) {
            if (this.field_41 == null) {
               break label97;
            }

            var16 = this.field_41;
         }

         long var10001 = 1636609497352083106L;
         BooleanSetting var13 = var16;
         int var17 = (int) ((var13.method_49$aae029aa0a()) ? 1 : 0);
         if (var8 == null) {
            if (var17 == 0) {
               break label97;
            }

            var17 = this.field_477 - this.field_47s;
         }

         int var10;
         int var11;
         int var12;
         String var26;
         label84: {
            int var9 = var17;
            var10 = this.field_47s - this.field_477;
            var11 = this.field_43y - this.field_437;
            var12 = this.field_437 - this.field_43y;
            var10001 = 1636231083123501127L;
            Minecraft var14 = field_43;
            var18 = var14.field_42N;
            var21 = new StringBuilder().append("MeHits: §7").append(this.field_477).append("§f ");
            int var10002 = var9;
            if (var8 == null) {
               if (var9 == 0) {
                  var26 = "";
                  break label84;
               }

               var10002 = var9;
            }

            var26 = var10002 < 0 ? "§c" + var9 : " §a+" + var9;
         }

         label78: {
            var22 = var21.append(var26).append("§f  Crits: §7").append(this.field_43y).append(" §f");
            int var27 = var11;
            if (var8 == null) {
               if (var11 == 0) {
                  var26 = "";
                  break label78;
               }

               var27 = var11;
            }

            var26 = var27 < 0 ? "§c" + var11 : " §a+" + var11;
         }

         label72: {
            var18.method_43$7961e3f788(var22.append(var26).append("§f").toString(), 0, 100, -1);
            var10001 = 1636231083123501127L;
            Minecraft var15 = field_43;
            var19 = var15.field_42N;
            var24 = new StringBuilder().append("OpponentHits: §7").append(this.field_47s).append("§f ");
            int var29 = var10;
            if (var8 == null) {
               if (var10 == 0) {
                  var26 = "";
                  break label72;
               }

               var29 = var10;
            }

            var26 = var29 < 0 ? "§c" + var10 : " §a+" + var10;
         }

         label66: {
            var25 = var24.append(var26).append("§f  Crits: §7").append(this.field_437).append(" §f");
            int var31 = var12;
            if (var8 == null) {
               if (var12 == 0) {
                  var26 = "";
                  break label66;
               }

               var31 = var12;
            }

            var26 = var31 < 0 ? "§c" + var12 : " §a+" + var12;
         }

         var19.method_43$7961e3f788(var25.append(var26).append("§f").toString(), 0, 120, -1);
      }

      RenderUtils.method_41$da8c82d5d4();
   }





   public float method_44$5618b8530d(long var1) {
      var1 = a ^ var1;
      float var4 = 0.0F;
      int[] var10000 = recovery$indy$18(-5401960362722493567L, var1);
      int var5 = 0;
      int[] var3 = var10000;

      while (var5 < recovery$indy$19(field_43, -5395482541835131889L, var1).field_42X.field_43.length) {
         C_47rf var6 = recovery$indy$20(field_43, -5395482541835131889L, var1).field_42X.field_43[var5];
         var10000 = var3;
         if (var1 > 0L) {
            if (var3 == null) {
               label55: {
                  C_47rf var11 = var6;
                  if (var1 > 0L) {
                     if (var6 == null) {
                        break label55;
                     }

                     var11 = var6;
                  }

                  C_43r var12 = var11.method_48$dbd570a038();
                  if (var3 == null) {
                     if (!(var12 instanceof C_43S)) {
                        break label55;
                     }

                     var12 = var6.method_48$dbd570a038();
                  }

                  C_43S var7 = (C_43S)var12;
                  float var8 = var7.field_43;
                  var4 += var8;
               }

               var5++;
            }

            var10000 = var3;
         }

         if (var10000 != null) {
            break;
         }
      }

      return var4;
   }



   public void method_48$7421db9485(C_47ob var1, long var2) {
      long var4 = var2 ^ 138747316010074L;
      long var6 = var2 ^ 26853655469677L;
      int[] var8 = recovery$indy$21(4153260887571494698L, var2);
      C_473U var9 = recovery$indy$22(var1, 4160645199114434503L, var2);
      if (var8 == null) {
         label44: {
            Debug_47kF var10000 = this;
            if (var2 > 0L) {
               if (this.field_432 == null) {
                  break label44;
               }

               var10000 = this;
            }

            label38:
            if (var8 == null) {
               if (!recovery$indy$23(var10000.field_432, var4, 4160294620837133622L, var2).equals(recovery$indy$24(23408, 2457417043485062709L ^ var2))) {
                  var10000 = this;
                  if (var8 != null) {
                     break label38;
                  }

                  if (!recovery$indy$25(this.field_432, var4, 4160294620837133622L, var2).equals(recovery$indy$26(24191, 5627963550602392336L ^ var2))) {
                     break label44;
                  }
               }

               var10000 = this;
            }

            recovery$indy$28(var10000, var6, var9, recovery$indy$27(27325, 3890576963161180062L ^ var2), 4158782101723468325L, var2);
         }

         recovery$indy$29(4152501533998046546L, var2).getClass();
      }
   }



   private void method_48$d295c6f3fa(long var1, C_473U var3, String var4) {
      java.io.File var31;
      int[] var32;
      int[] var34;
      var1 = a ^ var1;
      int[] var5 = recovery$indy$30(4791060139874159860L, var1);
      int var10000 = this.field_43S.size();
      if (var5 == null) {
         if (var10000 > 0) {
            StringBuilder var6 = new StringBuilder();
            Iterator var7 = this.field_43S.iterator();

            while (true) {
               if (var7.hasNext()) {
                  String var8 = (String)var7.next();
                  if (var5 != null) {
                     break;
                  }

                  if (var8 != null) {
                     var6.append(var8);
                  }

                  if (var5 == null) {
                     continue;
                  }
               }

               this.field_43S.clear();
               if (var1 >= 0L) {
               }
               break;
            }

            try {
               label211: {
                  File var23 = new File(
                     C_47VK.field_42
                        + File.separator
                        + recovery$indy$31(18516, 7272429446439608027L ^ var1)
                        + File.separator
                        + recovery$indy$32(28808, 5538536925568116267L ^ var1)
                  );
                  boolean var30 = Files.exists(var23.getParentFile().toPath());
                  if (var5 == null) {
                     if (!var30) {
                        try {
                           Files.createDirectories(var23.getParentFile().toPath());
                        } catch (IOException var14) {
                        }
                     }

                     var31 = var23;
                     if (var5 != null) {
                        break label211;
                     }

                     var30 = var23.exists();
                  }

                  if (!var30) {
                     var23.createNewFile();
                  }

                  var31 = var23;
               }

               Files.write(var31.toPath(), var6.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            } catch (IOException var20) {
            }
         }

         var10000 = (int) ((var3 instanceof C_47vS) ? 1 : 0);
      }

      int[] var10001 = var5;
      if (var1 >= 0L) {
         if (var5 == null) {
            if (var10000 != 0) {
               return;
            }

            var10000 = (int) ((var3 instanceof C_46l) ? 1 : 0);
         }

         var10001 = var5;
      }

      if (var10001 == null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = (int) ((var3 instanceof C_46o) ? 1 : 0);
      }

      if (var10000 == 0) {
         StringBuilder var22 = new StringBuilder(" " + var3.getClass().getSimpleName() + " ");
         Field[] var24 = var3.getClass().getDeclaredFields();
         Field[] var26 = var24;
         int var9 = var26.length;
         int var10 = 0;

         label215: {
            label165: {
               while (true) {
                  if (var10 < var9) {
                     Field var11 = var26[var10];
                     var22.append(" ");
                     var22.append(var11.getName());
                     var22.append(recovery$indy$33(9026, 247682235088565636L ^ var1));
                     var11.setAccessible(true);
                     Object var12 = null;

                     label159: {
                        try {
                           var12 = var11.get(var3);
                        } catch (IllegalAccessException var19) {
                           break label159;
                        }

                        if (var5 != null) {
                           break;
                        }
                     }

                     label155: {
                        label154: {
                           if (var12 == null) {
                              var22.append(recovery$indy$34(599, 7612966310827742409L ^ var1));
                              var32 = var5;
                              if (var1 < 0L) {
                                 break label155;
                              }

                              if (var5 == null) {
                                 break label154;
                              }
                           }

                           var22.append(var12.toString());
                        }

                        var22.append(" ");
                        var10++;
                        var32 = var5;
                     }

                     if (var32 == null) {
                        continue;
                     }
                  }

                  try {
                     var24 = var3.getClass().getSuperclass().getDeclaredFields();
                     var26 = var24;
                     var10000 = var26.length;
                     if (var1 <= 0L) {
                        break label165;
                     }

                     var9 = var10000;
                     break;
                  } catch (Exception var18) {
                     break label215;
                  }
               }

               try {
                  var10000 = 0;
               } catch (Exception var17) {
                  break label215;
               }
            }

            try {
               var10 = var10000;

               while (var10 < var9) {
                  Field var28 = var26[var10];
                  var22.append(" ");
                  var22.append(var28.getName());
                  var22.append(recovery$indy$35(18402, 5154794715063488871L ^ var1));
                  var28.setAccessible(true);
                  Object var29 = null;

                  label122: {
                     try {
                        var29 = var28.get(var3);
                     } catch (IllegalAccessException var15) {
                        break label122;
                     }

                     if (var5 != null) {
                        return;
                     }
                  }

                  label132: {
                     label131: {
                        if (var29 == null) {
                           var22.append(recovery$indy$36(19615, 7891784819617045039L ^ var1));
                           var34 = var5;
                           if (var1 <= 0L) {
                              break label132;
                           }

                           if (var5 == null) {
                              break label131;
                           }
                        }

                        var22.append(var29.toString());
                     }

                     var22.append(" ");
                     var10++;
                     var34 = var5;
                  }

                  if (var34 != null) {
                     break;
                  }
               }
            } catch (Exception var16) {
               break label215;
            }

            if (var1 < 0L) {
               return;
            }
         }

         var22.append("\r");
         this.field_43S.add(var4 + new SimpleDateFormat().format(new Date()) + var22.toString());
      }
   }






   private boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      C_47rf[] var4 = recovery$indy$37(field_43, -4946621744268285366L, var1).field_42X.field_43;
      int[] var10000 = recovery$indy$38(-4950277160685439548L, var1);
      int var5 = var4.length;
      int[] var3 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         C_47rf var7 = var4[var6];
         var10000 = var3;
         if (var1 >= 0L) {
            if (var3 == null) {
               label69: {
                  C_47rf var10 = var7;
                  if (var1 >= 0L) {
                     if (var7 == null) {
                        break label69;
                     }

                     var10 = var7;
                  }

                  int var11 = (int) ((var10.method_48$dbd570a038() instanceof C_43S) ? 1 : 0);
                  int[] var10001 = var3;
                  if (var1 > 0L) {
                     if (var3 == null) {
                        if (var11 == 0) {
                           break label69;
                        }

                        var11 = C_47ru.method_47$6eb1f4c276(C_47DW.field_48h.field_48X, var7);
                     }

                     var10001 = var3;
                  }

                  if (var10001 != null) {
                     return var11 != 0;
                  }

                  if (var11 > 0) {
                     return true;
                  }
               }

               var6++;
            }

            var10000 = var3;
         }

         if (var10000 != null) {
            break;
         }
      }

      return false;
   }



   private EntityPlayer method_48$17ab46b827(long var1) {
      var1 = a ^ var1;
      double var4 = 1000000.0;
      int[] var10000 = recovery$indy$39(-7722531401654576547L, var1);
      EntityPlayer var6 = null;
      int[] var3 = var10000;
      WorldClient var12 = recovery$indy$40(field_43, -7725873389782241709L, var1);
      if (var3 == null) {
         if (var12 == null) {
            return null;
         }

         var12 = recovery$indy$41(field_43, -7725873389782241709L, var1);
      }

      Iterator var7 = var12.field_44Q.iterator();

      label65:
      while (true) {
         Entity var13;
         if (var7.hasNext()) {
            var13 = (Entity)var7.next();
         } else {
            var13 = var6;
            if (var1 >= 0L) {
               return var6;
            }
         }

         do {
            label69: {
               Entity var8 = var13;
               int var14 = (int) ((var8 instanceof EntityPlayer) ? 1 : 0);
               if (var3 == null) {
                  if (var14 == 0) {
                     break label69;
                  }

                  var14 = var8.method_49$8abf5c6871();
               }

               label56:
               if (var14 != recovery$indy$42(field_43, -7727321514036214317L, var1).method_49$8abf5c6871()) {
                  double var9 = recovery$indy$43(field_43, -7727321514036214317L, var1).method_40$ee256e8a75(var8);
                  double var16;
                  int var15 = (var16 = var9 - var4) == 0.0 ? 0 : (var16 < 0.0 ? -1 : 1);
                  if (var3 == null) {
                     if (var15 >= 0) {
                        break label56;
                     }

                     if (var3 != null) {
                        var4 = var9;
                        var6 = (EntityPlayer)var8;
                        break label56;
                     }

                     double var17;
                     var15 = (var17 = var9 - 6.0) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
                  }

                  if (var15 < 0) {
                     var4 = var9;
                     var6 = (EntityPlayer)var8;
                  }
               }
            }

            if (var3 == null) {
               continue label65;
            }

            var13 = var6;
         } while (var1 < 0L);

         return var6;
      }
   }



   public static int method_49$8abf5c6871() {
      return field_433;
   }



   public List method_49$72b04aecb2(int var1, int var2, byte var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
      long var10001 = var4 ^ 106507238498420L;
      int var6 = (int)((var4 ^ 106507238498420L) >>> 32);
      int var7 = (int)((var4 ^ 106507238498420L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      return recovery$indy$44(this, var6, (char)var7, TargetDataLine.class, (short)var8, 5102946267784801430L, var4);
   }



   protected float method_49$8e3a0c0372(C_47da var1, byte var2, float var3, EntityPlayer var4, boolean var5, int var6, int var7, boolean var8) {
      long var9;
      int var11;
      int var12;
      int var13;
      int var14;
      long var15;
      label47: {
         var9 = ((long)var2 << 56 | (long)var6 << 32 >>> 8 | (long)var7 << 40 >>> 40) ^ a;
         long var10001 = var9 ^ 105448721307518L;
         var11 = (int)((var9 ^ 105448721307518L) >>> 48);
         var12 = (int)((var9 ^ 105448721307518L) << 16 >>> 32);
         var13 = (int)(var10001 << 48 >>> 48);
         var14 = (int)((var9 ^ 107214728057366L) >>> 56);
         var15 = (var9 ^ 107214728057366L) << 8 >>> 8;
         int[] var17 = recovery$indy$45(1675340713548831177L, var9);
         byte var10000 = (byte) ((var1.method_49$aae029aa0a()) ? 1 : 0);
         if (var17 == null) {
            if (var10000 != 0) {
               break label47;
            }

            var10000 = (byte) ((recovery$indy$46(field_43, 1681818610573821511L, var9).method_43B$aae029aa0a()) ? 1 : 0);
         }

         if (var17 == null) {
            if (var10000 == 0) {
               break label47;
            }

            if (var7 <= 0) {
               return var3;
            }

            if (var17 != null) {
               return Math.max(var3, 0.0F);
            }

            float var23;
            var10000 = (byte)((var23 = var3 - 0.0F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1));
         }

         if (var10000 > 0) {
            var3 = (1.0F + var3) * 0.5F;
         }
      }

      var3 = recovery$indy$47(this, (byte)var14, var1, var3, var15, var4, 1676048418516023947L, var9);
      var3 = recovery$indy$48(this, (short)var11, var1, var3, var5, var12, var13, var8, 1682109894148521163L, var9);
      return Math.max(var3 - recovery$indy$49(field_43, 1681818610573821511L, var9).method_47$bc607678b6(), 0.0F);
   }




   private String method_49$f5c21a4be8(long var1, int var3) {
      var1 = a ^ var1;
      int[] var4 = recovery$indy$50(-3014865292019689312L, var1);
      int var10000 = var3;
      if (var4 == null) {
         if (var3 == 0) {
            return recovery$indy$51(26275, 5559985913115878523L ^ var1);
         }

         var10000 = var3;
      }

      byte var10001 = 1;
      if (var4 == null) {
         if (var10000 == 1) {
            return recovery$indy$52(7618, 7920261896495062860L ^ var1);
         }

         var10000 = var3;
         var10001 = 3;
      }

      return var10000 >= var10001 ? recovery$indy$53(23277, 2747338970162796644L ^ var1) : recovery$indy$54(739, 165429425843224694L ^ var1);
   }



   public void method_49$2de4c0eff3(long var1, byte var3, String var4) {
      long var5 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
      long var7 = (var5 ^ 105007483775788L) >>> 8;
      int var9 = (int)((var5 ^ 105007483775788L) << 56 >>> 56);
      long var10 = var5 ^ 72036248038540L;
      long var10000 = -2893721388449523362L;
      int[] var12 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -2897685074890369059L;
      BooleanSetting var13 = this.settingServersideChat;
      if (var13.method_49$aae029aa0a()) {
         var10001 = -2900200341998729520L;
         Minecraft var14 = field_43;
         EntityPlayerSP var22 = var14.field_42P;
         StringBuilder var24 = new StringBuilder();
         long var10002 = -2894528837066214618L;
         Client var25 = Client.method_44$fbc0c0be91();
         byte var10004 = (byte)var9;
         long var10005 = -2900074926445536227L;
         byte var15 = var10004;
         long var16 = var7;
         Client var18 = var25;
         var22.method_49$a7421bf54c(
            var24.append(var18.method_40$213342eea1(var16, var15)).append(recovery$indy$55(18402, 5154842640253191373L ^ var5)).append(var4).toString()
         );
         if (var12 == null) {
            return;
         }
      }

      long var26 = -2896743435600492174L;
      String var19 = var4;
      long var20 = var10;
      C_475e.method_46$d07b98bfef(var20, var19);
   }



   private float method_49$a9007f846f(C_47rf var1, long var2) {
      var2 = a ^ var2;
      int[] var4 = recovery$indy$56(7757588997448574241L, var2);
      C_47dR var5 = var1.method_41$a2e65894e1();
      if (var5 != null) {
         int var6 = 0;

         while (var6 < var5.method_46$8abf5c6871()) {
            short var7 = var5.method_42$596eaa55f9(var6).method_44$a6718a9542(recovery$indy$57(16422, 322294885286690623L ^ var2));
            short var8 = var5.method_42$596eaa55f9(var6).method_44$a6718a9542(recovery$indy$58(28883, 7195965066949922740L ^ var2));
            int[] var10000 = var4;
            if (var2 > 0L) {
               if (var4 == null) {
                  if (var2 < 0L) {
                     return var7 * 1.25F;
                  }

                  if (var7 == 62) {
                     return var8 * 1.25F;
                  }

                  var6++;
               }

               var10000 = var4;
            }

            if (var10000 != null) {
               break;
            }
         }
      }

      return 0.0F;
   }



   public static int method_45$8abf5c6871() {
      int var0 = method_49$8abf5c6871();
      return var0 == 0 ? 34 : 0;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 9995909418654L;
      long var10001 = 7727628668618074922L;
      BooleanSetting var3 = this.field_47w;
      return var3.method_49$aae029aa0a();
   }



   public Object method_47$962c0c6edd(Class var1, long var2, String var4) {
      java.lang.Object var17;
      var2 = a ^ var2;
      javax.sound.sampled.Mixer.Info[] var6 = javax.sound.sampled.AudioSystem.getMixerInfo();
      javax.sound.sampled.Mixer.Info[] var7 = var6;
      int var8 = var7.length;
      int[] var10000 = recovery$indy$59(-5343232813406717104L, var2);
      int var9 = 0;
      int[] var5 = var10000;

      while (true) {
         if (var9 < var8) {
            javax.sound.sampled.Mixer.Info var10 = var7[var9];
            javax.sound.sampled.Mixer var11 = javax.sound.sampled.AudioSystem.getMixer(var10);
            javax.sound.sampled.Line.Info var12 = new javax.sound.sampled.Line.Info(var1);
            var10000 = var5;
            if (var2 > 0L) {
               if (var5 == null) {
                  if (var11.isLineSupported(var12)) {
                     var17 = var10.getName();
                     if (var5 != null) {
                        break;
                     }

                     if (var17.equals(var4)) {
                        try {
                           var17 = var1.cast(var11.getLine(var12));
                           break;
                        } catch (Exception var14) {
                        }
                     }
                  }

                  var9++;
               }

               var10000 = var5;
            }

            if (var10000 == null) {
               continue;
            }
         }

         return null;
      }

      return var17;
   }



    public void method_47$05bd94f678(final net.C_472n c_472n, final long n) {
        final long n2 = n ^ 0x4CC2C7A52390L;
        final int[] method_46$d4d28024c9 = ClientSettings_47kr.method_46$d4d28024c9();
        client.setting.BooleanSetting booleanSetting2;
        final client.setting.BooleanSetting booleanSetting = booleanSetting2 = this.settingSneakDebug;
        if (method_46$d4d28024c9 == null) {
            int n4;
            final int n3 = n4 = (booleanSetting.method_49$aae029aa0a() ? 1 : 0);
            Debug_47kF debug_47kF = null;
            Label_0196: {
                Label_0195: {
                    if (n > 0L) {
                        if (n3 == 0) {
                            break Label_0195;
                        }
                        final boolean method_47$aae029aa0a;
                        n4 = ((method_47$aae029aa0a = c_472n.method_47$aae029aa0a()) ? 1 : 0);
                    }
                    Debug_47kF debug_47kF2 = null;
                    Label_0191: {
                        if (method_46$d4d28024c9 == null) {
                            if (n3 != 0) {
                                debug_47kF = this;
                                if (n <= 0L) {
                                    break Label_0196;
                                }
                                ++this.field_47x;
                                if (method_46$d4d28024c9 == null) {
                                    break Label_0195;
                                }
                            }
                            debug_47kF2 = this;
                            if (method_46$d4d28024c9 != null) {
                                break Label_0191;
                            }
                            n4 = this.field_47x;
                        }
                        if (n4 > 0) {
                            net.C_475e.method_46$d07b98bfef(n2, "Sneak ticks: " + this.field_47x + "; Sneak delay: " + this.field_47P);
                            this.field_47P = 0;
                        }
                        ++this.field_47P;
                        debug_47kF2 = this;
                    }
                    debug_47kF2.field_47x = 0;
                }
                debug_47kF = this;
            }
            final client.setting.BooleanSetting field_43r;
            booleanSetting2 = (field_43r = debug_47kF.field_43r);
        }
        if (method_46$d4d28024c9 == null) {
            if (booleanSetting == null) {
                return;
            }
            booleanSetting2 = this.field_43r;
        }
        if (booleanSetting2.method_49$aae029aa0a()) {
            final net.C_47Ij field_42Y = Debug_47kF.field_43.field_42Y;
            Label_0308: {
                if (method_46$d4d28024c9 == null) {
                    if (field_42Y == null) {
                        break Label_0308;
                    }
                    final net.C_47Ij field_42Y2 = Debug_47kF.field_43.field_42Y;
                }
                if (field_42Y.field_47 instanceof EntityPlayer) {
                    this.field_42 = (EntityPlayer)Debug_47kF.field_43.field_42Y.field_47;
                }
            }
            if (this.field_42 == null) {
                return;
            }
            final java.io.File file = new java.io.File(net.C_47VK.field_42 + java.io.File.separator + "debug" + java.io.File.separator + "InputLog.txt");
            final boolean exists = java.nio.file.Files.exists(file.getParentFile().toPath(), new java.nio.file.LinkOption[0]);
            Label_0450: {
                java.io.File file2 = null;
                if (method_46$d4d28024c9 == null) {
                    if (!exists) {
                        try {
                            java.nio.file.Files.createDirectories(file.getParentFile().toPath(), (java.nio.file.attribute.FileAttribute<?>[])new java.nio.file.attribute.FileAttribute[0]);
                        }
                        catch (final java.io.IOException ex) {}
                    }
                    file2 = file;
                    if (method_46$d4d28024c9 != null) {
                        break Label_0450;
                    }
                    file2.exists();
                }
                if (!exists) {
                    try {
                        file.createNewFile();
                    }
                    catch (final java.io.IOException cause) {
                        throw new RuntimeException(cause);
                    }
                }
                try {
                    java.nio.file.Files.write(file2.toPath(), ("Forward: " + c_472n.method_45$bc607678b6() + "; Strafe: " + c_472n.method_43$bc607678b6() + "; TargetHurttime: " + this.field_42.field_432 + "; TargetDistance: " + this.field_42.method_40$ee256e8a75(Debug_47kF.field_43.field_42P) + "\r").getBytes(java.nio.charset.StandardCharsets.UTF_8), java.nio.file.StandardOpenOption.APPEND);
                }
                catch (final java.io.IOException cause2) {
                    throw new RuntimeException(cause2);
                }
            }
        }
    }





    public java.util.List method_43$bb7f901338(int n, char c, Class clazz, short s) {
        int n2;
        int n3;
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<String>();
        javax.sound.sampled.Mixer.Info[] infoArray = javax.sound.sampled.AudioSystem.getMixerInfo();
        int[] nArray = Debug_47kF.recovery$indy$60(-9006291260599546486L, l);
        javax.sound.sampled.Mixer.Info[] infoArray2 = infoArray;
        int n4 = infoArray2.length;
        int n5 = 0;
        while ((n3 = n5) < (n2 = n4)) {
            int[] nArray2;
            javax.sound.sampled.Mixer.Info info = infoArray2[n5];
            javax.sound.sampled.Mixer mixer = javax.sound.sampled.AudioSystem.getMixer(info);
            javax.sound.sampled.Line.Info info2 = new javax.sound.sampled.Line.Info(clazz);
            n3 = c;
            int[] nArray3 = nArray;
            if (n3 >= 0) {
                int[] nArray4 = nArray3;
                if (nArray4 == null) {
                    char c2 = c;
                    boolean bl = mixer.isLineSupported(info2);
                    if (c2 > '\u0000') {
                        c2 = (char)(bl ? 1 : 0);
                        if (c2 != '\u0000') {
                            bl = arrayList.add(info.getName());
                        }
                    }
                    ++n5;
                }
                nArray3 = nArray;
            }
            if ((nArray2 = nArray3) == null) continue;
            break;
        }
        return arrayList;
    }



   public TargetDataLine method_43$0512246336(int var1, short var2, String var3, short var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 23098518774275L;
      return (TargetDataLine)recovery$indy$61(this, TargetDataLine.class, var7, var3, 3635931129529726222L, var5);
   }



   public float method_43$88114fb337(short var1, C_47da var2, float var3, boolean var4, int var5, int var6, boolean var7) {
      long var8 = ((long)var1 << 48 | (long)var5 << 32 >>> 16 | (long)var6 << 48 >>> 48) ^ a;
      int[] var10 = recovery$indy$62(7317607356573657860L, var8);
      int var10000 = (int) ((var2.method_43$aae029aa0a()) ? 1 : 0);
      if (var10 == null) {
         if (var10000 != 0) {
            return var3;
         }

         var10000 = (int) ((recovery$indy$63(field_43, 7321262567201748106L, var8).method_41$e45115c4cf(C_47oY.field_46C)) ? 1 : 0);
      }

      int[] var10001 = var10;
      if (var5 >= 0) {
         if (var10 == null) {
            if (var10000 != 0 && var2 != C_47da.field_49F) {
               int var11 = (recovery$indy$64(field_43, 7321262567201748106L, var8).method_43$1c5515a899(C_47oY.field_46C).method_47$8abf5c6871() + 1) * 5;
               int var12 = 25 - var11;
               float var13 = var3 * var12;
               var3 = var13 / 25.0F;
            }

            float var26;
            var10000 = (var26 = var3 - 0.0F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
         }

         var10001 = var10;
      }

      if (var10001 == null) {
         if (var10000 <= 0) {
            return 0.0F;
         }

         var10000 = 0;
      }

      int var16;
      label150: {
         label149: {
            label157: {
               var16 = var10000;
               C_47ru.field_42.field_40 = var2;
               var10000 = (int) ((var7) ? 1 : 0);
               var10001 = var10;
               if (var1 >= 0) {
                  if (var10 == null) {
                     if ((var7 ? 1 : 0) == 0) {
                        int var17 = 0;

                        while (var17 < recovery$indy$65(field_43, 7321262567201748106L, var8).field_42X.field_43.length) {
                           C_47rf var19 = recovery$indy$66(field_43, 7321262567201748106L, var8).field_42X.field_43[var17];
                           int[] var22 = var10;
                           if (var1 >= 0) {
                              if (var10 != null) {
                                 break label157;
                              }

                              var22 = var10;
                           }

                           if (var5 >= 0) {
                              if (var22 == null) {
                                 label129: {
                                    C_47rf var23 = var19;
                                    if (var5 >= 0) {
                                       if (var19 == null) {
                                          break label129;
                                       }

                                       var23 = var19;
                                    }

                                    if (var23.method_48$dbd570a038() instanceof C_43S) {
                                       float var14 = 0.0F;
                                       var10000 = C_47ru.method_47$6eb1f4c276(C_47DW.field_48h.field_48X, var19);
                                       if (var10 == null) {
                                          if (var10000 > 0) {
                                             int var15 = C_47ru.field_42
                                                .method_44$1b6465a6ed(C_47DW.field_48h, C_47ru.method_47$6eb1f4c276(C_47DW.field_48h.field_48X, var19));
                                             var14 = (var15 + 1 >> 1) + ((var15 >> 1) + 1) / (var4 ? 1.0F : 2.0F);
                                          }

                                          var10000 = (int)(var16 + var14);
                                       }

                                       var16 = var10000;
                                    }
                                 }

                                 var17++;
                              }

                              var22 = var10;
                           }

                           if (var22 != null) {
                              break;
                           }
                        }
                     }

                     if (var1 < 0) {
                        break label157;
                     }

                     var10000 = var16;
                  }

                  var10001 = var10;
               }

               if (var1 < 0) {
                  break label150;
               }

               if (var10001 != null) {
                  break label149;
               }

               if (var10000 > 20) {
                  var16 = 20;
               }
            }

            var10000 = var16;
         }

         var10001 = var10;
      }

      if (var10001 == null) {
         if (var10000 <= 0) {
            return var3;
         }

         var10000 = 25 - var16;
      }

      int var18 = var10000;
      float var20 = var3 * var18;
      return var20 / 25.0F;
   }




   private boolean method_43$eb2d8299a3(int var1, double var2, double var4, char var6, char var7, double var8) {
      long var10 = ((long)var1 << 32 | (long)var6 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
      int[] var12 = recovery$indy$67(-9101200873492689093L, var10);
      double var13;
      int var10000 = (var13 = Math.abs(var2 - var4) - var8) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
      if (var12 == null) {
         var10000 = var10000 <= 0 ? 1 : 0;
      }

      return var10000 != 0;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$68(this, 1, var5, -7103692749584906604L, var1);
      recovery$indy$69(this, 26, var5, -7103692749584906604L, var1);
      recovery$indy$70(this, 40, var5, -7103692749584906604L, var1);
      recovery$indy$71(this, 32, var5, -7103692749584906604L, var1);
      recovery$indy$72(this, 35, var5, -7103692749584906604L, var1);
      recovery$indy$73(this, 21, 2000, var3, -7105072036100656745L, var1);
      recovery$indy$74(this, 25, var5, -7103692749584906604L, var1);
      recovery$indy$75(this, 50, var5, -7103692749584906604L, var1);
   }



   private boolean method_42v$aae029aa0a() {
      long var1 = a ^ 92043806047573L;
      long var10001 = -2813245682144028447L;
      BooleanSetting var3 = this.field_47w;
      return var3.method_49$aae029aa0a();
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      net.minecraft.entity.player.EntityPlayer var52;
      augustus.recovered.modules.misc.Debug_47kF var57;
      long var13;
      int[] var16;
      short var51;
      int[] var62;
      label127: {
         label126: {
            long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
            long var10001 = var4 ^ 7438140337237L;
            int var6 = (int)((var4 ^ 7438140337237L) >>> 48);
            int var7 = (int)((var4 ^ 7438140337237L) << 16 >>> 32);
            int var8 = (int)(var10001 << 48 >>> 48);
            long var9 = var4 ^ 90571339949330L;
            long var11 = var4 ^ 117132905688077L;
            var13 = var4 ^ 97834970749362L;
            long var10000 = 2182412252185284800L;
            var16 = ClientSettings_47kr.method_46$d4d28024c9();
            long var48 = 2182700456704867000L;
            Client.method_44$fbc0c0be91().getClass();
            Debug_47kF var49 = this;
            if (var16 == null) {
               label130: {
                  BooleanSetting var50 = this.field_47X;
                  if (var2 > 0) {
                     if (this.field_47X == null) {
                        break label130;
                     }

                     var50 = this.field_47X;
                  }

                  long var58 = 2186296533522554435L;
                  BooleanSetting var24 = var50;
                  var51 = (short) ((var24.method_49$aae029aa0a()) ? 1 : 0);
                  if (var16 != null) {
                     break label126;
                  }

                  label92:
                  if ((var51) != 0) {
                     EntityPlayer var17 = null;
                     double var18 = 10000.0;
                     long var59 = 2185756478038631630L;
                     Minecraft var25 = field_43;
                     Iterator var20 = var25.field_44Q.field_44E.iterator();

                     label121: {
                        while (true) {
                           if (var20.hasNext()) {
                              EntityPlayer var21 = (EntityPlayer)var20.next();
                              var52 = var21;
                              var62 = var16;
                              if (var2 < 0 || var1 <= 0) {
                                 break label121;
                              }

                              if (var16 != null) {
                                 break;
                              }

                              long var10002 = 2188319494080941902L;
                              Minecraft var26 = field_43;
                              EntityPlayerSP var61 = var26.field_42P;
                              if (var16 == null) {
                                 if (var21 == var26.field_42P) {
                                    continue;
                                 }

                                 var52 = var21;
                                 var10002 = 2188319494080941902L;
                                 Minecraft var27 = field_43;
                                 var61 = var27.field_42P;
                              }

                              label115: {
                                 double var22 = var52.method_49$ee256e8a75(var61);
                                 double var53 = var22;
                                 if (var16 == null) {
                                    if (!(var22 < var18)) {
                                       break label115;
                                    }

                                    var17 = var21;
                                    var53 = var22;
                                 }

                                 var18 = var53;
                              }

                              if (var16 == null) {
                                 continue;
                              }
                           }

                           var52 = var17;
                           break;
                        }

                        var62 = var16;
                     }

                     if (var62 == null) {
                        if (var52 == null) {
                           break label92;
                        }

                        var52 = var17;
                     }

                     EntityPlayer var15 = var52;
                     var51 = (short)var6;
                     long var10004 = 2186155047751726023L;
                     EntityPlayer var28 = var15;
                     int var29 = var8;
                     int var30 = var7;
                     short var31 = var51;
                     var51 = (short) ((C_48p.method_43$c918038342(var31, var30, var29, var28)) ? 1 : 0);
                     var62 = var16;
                     if (var3 < 0) {
                        break label127;
                     }

                     if (var16 != null) {
                        break label126;
                     }

                     if (!(var51 != 0)) {
                        StringBuilder var55 = new StringBuilder().append(var17.method_41$0e30dfc966()).append(" ");
                        long var10003 = 2182309916709552834L;
                        long var32 = var11;
                        EntityPlayer var34 = var17;
                        String var63 = var55.append(Arrays.toString(C_48p.method_44$af229b868a(var34, var32))).toString();
                        long var65 = 2184985698625667308L;
                        String var35 = var63;
                        long var36 = var9;
                        C_475e.method_46$d07b98bfef(var36, var35);
                     }
                  }
               }

               var49 = this;
            }

            long var66 = 2185150644223401682L;
            long var38 = var13;
            long var40 = 3000L;
            C_47cu var42 = var49.field_48;
            var51 = (short) ((var42.method_42$b0e346e6e3(var40, var38)) ? 1 : 0);
         }

         var62 = var16;
      }

      label132: {
         if (var62 == null) {
            if ((var51) != 0) {
               this.field_43J = null;
            }

            var57 = this;
            if (var16 != null) {
               break label132;
            }

            long var67 = 2185150644223401682L;
            long var43 = var13;
            long var45 = 4000L;
            C_47cu var47 = this.field_43g;
            var51 = (short) ((var47.method_42$b0e346e6e3(var45, var43)) ? 1 : 0);
         }

         if (!(var51 != 0)) {
            return;
         }

         var57 = this;
      }

      var57.field_431 = null;
   }





   public void method_43y$e45a9973e5(long var1) {
      this.field_43I = null;
      this.field_431 = null;
      this.field_42 = null;
      this.field_43J = null;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_47s = 0;
      this.field_477 = 0;
      this.field_43y = 0;
      this.field_437 = 0;
      this.field_473 = 0.0F;
      this.field_47J = 0.0F;
   }



    public void method_487$da8c82d5d4() {
        long l;
        long l2;
        long l3;
        long l4;
        block16: {
            block18: {
                block17: {
                    block14: {
                        block12: {
                            block15: {
                                long l5;
                                block13: {
                                    boolean bl;
                                    block11: {
                                        long l6;
                                        long l7 = l6 = a ^ 0xFB43836E1E7L;
                                        l4 = l7 ^ 0x10B56141BF02L;
                                        l3 = l7 ^ 0x5CF3D289E4DFL;
                                        l5 = l7 ^ 0x65BA1EB60D8BL;
                                        l2 = l7 ^ 0x1A10536743A2L;
                                        l = l7 ^ 0x33691BB3753EL;
                                        int[] nArray = ClientSettings_47kr.method_46$d4d28024c9();
                                        BooleanSetting c_47TV = this.settingPlaceDebug;
                                        bl = c_47TV.method_49$aae029aa0a();
                                        if (nArray != null) break block11;
                                        if (!bl) break block12;
                                        break block13;
                                    }
                                    if (!bl) break block14;
                                    break block15;
                                }
                                ++this.field_47B;
                                long l8 = l5;
                                double d = this.field_478;
                                C_47S9 c_47S9 = this.field_43H;
                                c_47S9.method_48$e19a0205c8(d, l8);
                                this.field_478 = 0;
                                break block12;
                            }
                            this.field_43I = null;
                            this.field_43n = -1;
                            break block14;
                        }
                        BooleanSetting c_47TV = this.settingMotionDebug;
                        if (!c_47TV.method_49$aae029aa0a()) break block16;
                        break block17;
                    }
                    C_473X c_473X = this.field_43s;
                    c_473X.method_47$da8c82d5d4();
                    this.field_471 = this.field_43d;
                    this.field_43d = 0;
                    return;
                }
                Minecraft c_47nT = field_43;
                if (c_47nT.field_42P.field_48s != 0.0) break block18;
                Minecraft c_47nT2 = field_43;
                if (c_47nT2.field_42P.field_487 != 0.0) break block18;
                Minecraft c_47nT3 = field_43;
                if (c_47nT3.field_42P.field_42 != this.field_43F) break block18;
                if (this.field_43F != -0.0784000015258789) break block18;
                Minecraft c_47nT4 = field_43;
                if (c_47nT4.field_42P.field_48y % 20 != 0) break block16;
            }
            Minecraft c_47nT = field_43;
            Minecraft c_47nT5 = field_43;
            Minecraft c_47nT6 = field_43;
            String string = "motion=(x=" + c_47nT.field_42P.field_48s + ", y=" + c_47nT5.field_42P.field_42 + ", z=" + c_47nT6.field_42P.field_487 + ")";
            long l9 = l4;
            C_475e.method_46$d07b98bfef((long)l9, (String)string);
            Minecraft c_47nT7 = field_43;
            this.field_43F = c_47nT7.field_42P.field_42;
        }
        long l10 = l;
        Debug_47kF debug_47kF = this;
        this.field_43i = debug_47kF.method_48$17ab46b827(l10);
        long l11 = l2;
        long l12 = 2000L;
        C_47cu c_47cu = this.field_43A;
        if (c_47cu.method_42$b0e346e6e3(l12, l11)) {
            this.field_43I = null;
            this.field_43n = -1;
        }
        if (this.field_47u != null) {
            BooleanSetting c_47TV = this.field_47u;
            if (c_47TV.method_49$aae029aa0a()) {
                if (this.field_43I != null) {
                    ++this.field_43U;
                    if (this.field_43n >= 0) {
                        ++this.field_43n;
                    }
                    if (this.field_43I.field_432 == 9) {
                        if (this.field_44.isEmpty()) {
                            String string = "No Sprint Reset";
                            long l13 = l4;
                            C_475e.method_46$d07b98bfef((long)l13, (String)string);
                        } else {
                            String string = "MoreKBTimes: " + Arrays.toString(this.field_44.toArray()) + ";  MoreKBDurations: " + Arrays.toString(this.field_43w.toArray()) + ";  " + this.field_43U;
                            long l14 = l4;
                            C_475e.method_46$d07b98bfef((long)l14, (String)string);
                        }
                        this.field_44.clear();
                        this.field_43w.clear();
                        this.field_43U = 0;
                    }
                }
            }
        }
        C_473X c_473X = this.field_43s;
        c_473X.method_41$da8c82d5d4();
        int n = 20;
        long l15 = l3;
        C_473X c_473X2 = this.field_43s;
        if (!c_473X2.method_48$05d3808578(l15, n)) return;
        C_473X c_473X3 = this.field_43s;
        c_473X3.method_47$da8c82d5d4();
        this.field_471 = this.field_43d;
        this.field_43d = 0;
    }






    public Debug_47kF(long a0) {
        super((java.lang.String) ("Debug"),(java.lang.String) ("Fehlersuche"),(long) (((augustus.recovered.modules.misc.Debug_47kF.a ^ a0) ^ 44415868368818L)),(java.awt.Color) (java.awt.Color.BLACK),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.misc.Debug_47kF.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.misc.Debug_47kF.a ^ a0) ^ 88581543804564L);
        long constructorKey4 = ((augustus.recovered.modules.misc.Debug_47kF.a ^ a0) ^ 98139527228329L);
        long constructorKey5 = ((augustus.recovered.modules.misc.Debug_47kF.a ^ a0) ^ 127654228694062L);
        client.setting.BooleanSetting initialized6 = new client.setting.BooleanSetting(this, constructorKey4, "RangeDebug", false);
        recovery$indy$flow$1692(this, initialized6);
        client.setting.BooleanSetting initialized7 = new client.setting.BooleanSetting(this, constructorKey4, "IgnoreBackTrack", false);
        java.lang.Object initialValue8 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).settingRangeDebug));
        java.lang.Object initialValue9 = recovery$indy$flow$1696(initialValue8);
        java.lang.Object initialValue10 = recovery$indy$flow$1697(initialValue8);
        java.lang.Object initialValue11 = initialValue10;
        long initialValue12 = constructorKey3;
        client.setting.BooleanSetting initialValue13 = initialized7;
        java.lang.Object initialValue14 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue13))))));
        java.lang.Object initialValue15 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue11))))));
        java.lang.Object initialValue16 = recovery$indy$flow$1700(initialValue14, initialValue12, initialValue15);
        java.lang.Object initialValue17 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue16))))));
        recovery$indy$flow$1702(this, initialValue17);
        client.setting.NumberSetting initialized18 = new client.setting.NumberSetting(this, "MinRange", Double.longBitsToDouble(4613937818241073152L), constructorKey5, 0.0D, Double.longBitsToDouble(4618441417868443648L), 2);
        java.lang.Object initialValue19 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).settingRangeDebug));
        java.lang.Object initialValue20 = recovery$indy$flow$1706(initialValue19);
        java.lang.Object initialValue21 = recovery$indy$flow$1707(initialValue19);
        java.lang.Object initialValue22 = initialValue21;
        client.setting.NumberSetting initialValue23 = initialized18;
        java.lang.Object initialValue24 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue25 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue22))))));
        java.lang.Object initialValue26 = recovery$indy$flow$1710(initialValue24, initialValue25);
        recovery$indy$flow$1711(this, initialValue26);
        client.setting.NumberSetting initialized27 = new client.setting.NumberSetting(this, "DecimalPlaces", Double.longBitsToDouble(4616189618054758400L), constructorKey5, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue28 = ((java.lang.Object)(((augustus.recovered.modules.misc.Debug_47kF) (((java.lang.Object)(this)))).settingRangeDebug));
        java.lang.Object initialValue29 = recovery$indy$flow$1715(initialValue28);
        java.lang.Object initialValue30 = recovery$indy$flow$1716(initialValue28);
        java.lang.Object initialValue31 = initialValue30;
        client.setting.NumberSetting initialValue32 = initialized27;
        java.lang.Object initialValue33 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue32))))));
        java.lang.Object initialValue34 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue35 = recovery$indy$flow$1719(initialValue33, initialValue34);
        recovery$indy$flow$1720(this, initialValue35);
        client.setting.BooleanSetting initialized36 = new client.setting.BooleanSetting(this, constructorKey4, "TimerRangeDebug", false);
        recovery$indy$flow$1723(this, initialized36);
        client.setting.BooleanSetting initialized37 = new client.setting.BooleanSetting(this, constructorKey4, "LagRangeDebug", false);
        recovery$indy$flow$1726(this, initialized37);
        client.setting.BooleanSetting initialized38 = new client.setting.BooleanSetting(this, constructorKey4, "TimeManipulation", false);
        recovery$indy$flow$1729(this, initialized38);
        client.setting.BooleanSetting initialized39 = new client.setting.BooleanSetting(this, constructorKey4, "HitBug", false);
        recovery$indy$flow$1732(this, initialized39);
        client.setting.BooleanSetting initialized40 = new client.setting.BooleanSetting(this, constructorKey4, "ServersideChat", false);
        recovery$indy$flow$1735(this, initialized40);
        client.setting.BooleanSetting initialized41 = new client.setting.BooleanSetting(this, constructorKey4, "SoundName", false);
        recovery$indy$flow$1738(this, initialized41);
        client.setting.BooleanSetting initialized42 = new client.setting.BooleanSetting(this, constructorKey4, "Blink", false);
        recovery$indy$flow$1741(this, initialized42);
        client.setting.BooleanSetting initialized43 = new client.setting.BooleanSetting(this, constructorKey4, "Transaction", false);
        recovery$indy$flow$1744(this, initialized43);
        client.setting.BooleanSetting initialized44 = new client.setting.BooleanSetting(this, constructorKey4, "OnlyDebugChat", false);
        recovery$indy$flow$1747(this, initialized44);
        client.setting.BooleanSetting initialized45 = new client.setting.BooleanSetting(this, constructorKey4, "Kit1V1Damage", false);
        recovery$indy$flow$1750(this, initialized45);
        client.setting.BooleanSetting initialized46 = new client.setting.BooleanSetting(this, constructorKey4, "AutoClickerDebug", false);
        recovery$indy$flow$1753(this, initialized46);
        client.setting.BooleanSetting initialized47 = new client.setting.BooleanSetting(this, constructorKey4, "PlaceDebug", false);
        recovery$indy$flow$1756(this, initialized47);
        client.setting.BooleanSetting initialized48 = new client.setting.BooleanSetting(this, constructorKey4, "SneakDebug", false);
        recovery$indy$flow$1759(this, initialized48);
        client.setting.BooleanSetting initialized49 = new client.setting.BooleanSetting(this, constructorKey4, "LostHitDebug", false);
        recovery$indy$flow$1762(this, initialized49);
        client.setting.BooleanSetting initialized50 = new client.setting.BooleanSetting(this, constructorKey4, "Motion Debug", false);
        recovery$indy$flow$1765(this, initialized50);
        recovery$indy$flow$1766(this, null);
        recovery$indy$flow$1767(this, null);
        recovery$indy$flow$1768(this, null);
        recovery$indy$flow$1769(this, null);
        recovery$indy$flow$1770(this, null);
        recovery$indy$flow$1771(this, null);
        recovery$indy$flow$1772(this, null);
        recovery$indy$flow$1773(this, null);
        recovery$indy$flow$1774(this, null);
        recovery$indy$flow$1775(this, null);
        recovery$indy$flow$1776(this, null);
        recovery$indy$flow$1777(this, null);
        recovery$indy$flow$1778(this, null);
        recovery$indy$flow$1779(this, null);
        recovery$indy$flow$1780(this, null);
        recovery$indy$flow$1781(this, null);
        recovery$indy$flow$1782(this, null);
        recovery$indy$flow$1783(this, null);
        recovery$indy$flow$1784(this, null);
        recovery$indy$flow$1785(this, null);
        recovery$indy$flow$1786(this, Double.longBitsToDouble(9221120237041090560L));
        net.C_47cu initialized51 = new net.C_47cu();
        recovery$indy$flow$1789(this, initialized51);
        java.util.concurrent.CopyOnWriteArrayList initialized52 = new java.util.concurrent.CopyOnWriteArrayList();
        recovery$indy$flow$1792(this, initialized52);
        java.util.ArrayList initialized53 = new java.util.ArrayList();
        recovery$indy$flow$1795(this, initialized53);
        java.util.ArrayList initialized54 = new java.util.ArrayList();
        recovery$indy$flow$1798(this, initialized54);
        recovery$indy$flow$1799(this, 0);
        recovery$indy$flow$1800(this, 0);
        recovery$indy$flow$1801(this, 0);
        recovery$indy$flow$1802(this, 0);
        recovery$indy$flow$1803(this, 0);
        recovery$indy$flow$1804(this, 0);
        net.C_47cu initialized55 = new net.C_47cu();
        recovery$indy$flow$1807(this, initialized55);
        java.util.ArrayList initialized56 = new java.util.ArrayList();
        recovery$indy$flow$1810(this, initialized56);
        net.C_47cu initialized57 = new net.C_47cu();
        recovery$indy$flow$1813(this, initialized57);
        java.util.ArrayList initialized58 = new java.util.ArrayList();
        recovery$indy$flow$1816(this, initialized58);
        java.util.ArrayList initialized59 = new java.util.ArrayList();
        recovery$indy$flow$1819(this, initialized59);
        net.C_47cu initialized60 = new net.C_47cu();
        recovery$indy$flow$1822(this, initialized60);
        net.C_473X initialized61 = new net.C_473X();
        recovery$indy$flow$1825(this, initialized61);
        recovery$indy$flow$1826(this, 0);
        recovery$indy$flow$1827(this, 0);
        recovery$indy$flow$1828(this, null);
        net.C_47cu initialized62 = new net.C_47cu();
        recovery$indy$flow$1831(this, initialized62);
        recovery$indy$flow$1832(this, -1);
        recovery$indy$flow$1833(this, 0);
        java.util.LinkedList initialized63 = new java.util.LinkedList();
        recovery$indy$flow$1836(this, initialized63);
        java.util.LinkedList initialized64 = new java.util.LinkedList();
        recovery$indy$flow$1839(this, initialized64);
        recovery$indy$flow$1840(this, 0L);
        java.util.ArrayList initialized65 = new java.util.ArrayList();
        recovery$indy$flow$1843(this, initialized65);
        recovery$indy$flow$1844(this, null);
        net.C_47cu initialized66 = new net.C_47cu();
        recovery$indy$flow$1847(this, initialized66);
        recovery$indy$flow$1848(this, null);
        recovery$indy$flow$1849(this, 0);
        recovery$indy$flow$1850(this, 0);
        net.C_47S9 initialized67 = new net.C_47S9(20);
        recovery$indy$flow$1853(this, initialized67);
        recovery$indy$flow$1854(this, 0);
        recovery$indy$flow$1855(this, 0);
        recovery$indy$flow$1856(this, 0.0D);
        recovery$indy$flow$1857(this, 0.0F);
        recovery$indy$flow$1858(this, 0L);
        recovery$indy$flow$1859(this, 0L);
        recovery$indy$flow$1860(this, 0);
        net.C_49S initialized68 = new net.C_49S(100);
        recovery$indy$flow$1863(this, initialized68);
        net.C_49S initialized69 = new net.C_49S(100);
        recovery$indy$flow$1866(this, initialized69);
        net.C_49S initialized70 = new net.C_49S(100);
        recovery$indy$flow$1869(this, initialized70);
        net.C_47S9 initialized71 = new net.C_47S9(20);
        recovery$indy$flow$1872(this, initialized71);
        net.C_47S9 initialized72 = new net.C_47S9(20);
        recovery$indy$flow$1875(this, initialized72);
        net.C_47S9 initialized73 = new net.C_47S9(20);
        recovery$indy$flow$1878(this, initialized73);
        net.C_47S9 initialized74 = new net.C_47S9(20);
        recovery$indy$flow$1881(this, initialized74);
        net.C_47S9 initialized75 = new net.C_47S9(20);
        recovery$indy$flow$1884(this, initialized75);
        net.C_47S9 initialized76 = new net.C_47S9(20);
        recovery$indy$flow$1887(this, initialized76);
        net.C_47S9 initialized77 = new net.C_47S9(20);
        recovery$indy$flow$1890(this, initialized77);
        recovery$indy$flow$1891(this, 0);
        recovery$indy$flow$1892(this, false);
        recovery$indy$flow$1893(this, 0);
        recovery$indy$flow$1894(this, 0.0D);
        java.lang.Object initialValue78 = recovery$indy$flow$1895();
        java.lang.Object initialValue79 = recovery$indy$flow$1896(initialValue78);
    }







    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$225();

    private static native java.lang.Object recovery$indy$flow$227(java.lang.Object a0);



    private static native boolean recovery$indy$flow$231(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$232() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static boolean recovery$indy$flow$235(java.lang.Object a0) {
        return (a0 instanceof net.C_47bo);
    }

    private static native float recovery$indy$flow$237(java.lang.Object a0);
    private static float recovery$indy$flow$238(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43k;
    }
    private static void recovery$indy$flow$239(java.lang.Object a0,float a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43k = a1;
        return;
    }
    private static native double recovery$indy$flow$240(double a0,int a1);
    private static native double recovery$indy$flow$241(double a0,int a1);
    private static java.lang.Object recovery$indy$flow$244(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$245(java.lang.Object a0,float a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$246(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$247(java.lang.Object a0,double a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$248(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$249(java.lang.Object a0,double a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$250(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }

    private static native void recovery$indy$flow$252(long a0,java.lang.Object a1);



    private static native boolean recovery$indy$flow$256(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$257() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static boolean recovery$indy$flow$260(java.lang.Object a0) {
        return (a0 instanceof net.C_46s);
    }

    private static native int recovery$indy$flow$262(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$263() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static native int recovery$indy$flow$266(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$269(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$270(java.lang.Object a0);
    private static boolean recovery$indy$flow$271(java.lang.Object a0) {
        return (a0 instanceof net.C_45V);
    }

    private static java.lang.Object recovery$indy$flow$273() {
        return net.C_47DW.field_488;
    }
    private static int recovery$indy$flow$274(java.lang.Object a0) {
        return ((net.C_47DW) (a0)).field_48X;
    }
    private static native int recovery$indy$flow$275(int a0,java.lang.Object a1);
    private static native float recovery$indy$flow$276(java.lang.Object a0);
    private static native boolean recovery$indy$flow$277(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$278() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$280(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$281() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$283(java.lang.Object a0);

    private static boolean recovery$indy$flow$285(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }


    private static native float recovery$indy$flow$288(java.lang.Object a0,java.lang.Object a1,long a2);
    private static boolean recovery$indy$flow$289(java.lang.Object a0) {
        return (a0 instanceof net.C_45r);
    }

    private static java.lang.Object recovery$indy$flow$291() {
        return net.C_47DW.field_488;
    }
    private static int recovery$indy$flow$292(java.lang.Object a0) {
        return ((net.C_47DW) (a0)).field_48X;
    }
    private static native int recovery$indy$flow$293(int a0,java.lang.Object a1);
    private static native float recovery$indy$flow$294(java.lang.Object a0);
    private static native boolean recovery$indy$flow$295(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$296() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$298(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$299() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$301(java.lang.Object a0);

    private static boolean recovery$indy$flow$303(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }


    private static native float recovery$indy$flow$306(java.lang.Object a0,java.lang.Object a1,long a2);
    private static java.lang.Object recovery$indy$flow$307() {
        return net.C_47da.field_492;
    }



    private static native float recovery$indy$flow$311(java.lang.Object a0,java.lang.Object a1,byte a2,float a3,java.lang.Object a4,boolean a5,int a6,int a7,boolean a8);
    private static java.lang.Object recovery$indy$flow$312() {
        return net.C_47da.field_492;
    }



    private static native float recovery$indy$flow$316(java.lang.Object a0,java.lang.Object a1,byte a2,float a3,java.lang.Object a4,boolean a5,int a6,int a7,boolean a8);
    private static java.lang.Object recovery$indy$flow$317() {
        return net.C_47da.field_492;
    }



    private static native float recovery$indy$flow$321(java.lang.Object a0,java.lang.Object a1,byte a2,float a3,java.lang.Object a4,boolean a5,int a6,int a7,boolean a8);
    private static double recovery$indy$flow$322(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_430;
    }
    private static double recovery$indy$flow$323(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_430;
    }

    private static native boolean recovery$indy$flow$325(java.lang.Object a0,int a1,double a2,double a3,char a4,char a5,double a6);
    private static double recovery$indy$flow$326(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_430;
    }

    private static native boolean recovery$indy$flow$328(java.lang.Object a0,int a1,double a2,double a3,char a4,char a5,double a6);
    private static java.lang.Object recovery$indy$flow$331(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static double recovery$indy$flow$332(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_430;
    }
    private static native java.lang.Object recovery$indy$flow$333(double a0,long a1,int a2,long a3,long a4);
    private static java.lang.Object recovery$indy$flow$334(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$335(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$336(double a0,long a1,int a2,long a3,long a4);
    private static java.lang.Object recovery$indy$flow$337(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$338(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }

    private static native void recovery$indy$flow$340(long a0,java.lang.Object a1);

    private static native void recovery$indy$flow$342(long a0,java.lang.Object a1);
    private static native void recovery$indy$flow$343(long a0,java.lang.Object a1,long a2,long a3);
    private static boolean recovery$indy$flow$344(java.lang.Object a0) {
        return (a0 instanceof net.C_46s);
    }

    private static native int recovery$indy$flow$346(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$347() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static native int recovery$indy$flow$350(java.lang.Object a0);
    private static void recovery$indy$flow$351(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_430 = a1;
        return;
    }
    private static boolean recovery$indy$flow$352(java.lang.Object a0) {
        return (a0 instanceof net.C_47bo);
    }

    private static float recovery$indy$flow$354(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43k;
    }
    private static native float recovery$indy$flow$355(java.lang.Object a0);
    private static double recovery$indy$flow$356(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_430;
    }
    private static void recovery$indy$flow$357(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_430 = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$358() {
        return java.lang.System.out;
    }
    private static void recovery$indy$flow$359(java.lang.Object a0,float a1) {
        ((java.io.PrintStream) (a0)).println(a1);
        return;
    }
    private static double recovery$indy$flow$360(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_430;
    }
    private static void recovery$indy$flow$361(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_430 = a1;
        return;
    }
    private static native float recovery$indy$flow$362(java.lang.Object a0);
    private static void recovery$indy$flow$363(java.lang.Object a0,float a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43k = a1;
        return;
    }



    private static native boolean recovery$indy$flow$367(java.lang.Object a0);
    private static boolean recovery$indy$flow$368(java.lang.Object a0) {
        return (a0 instanceof net.C_46s);
    }
    private static java.lang.Object recovery$indy$flow$369() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }



    private static native int recovery$indy$flow$373(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$374() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static native int recovery$indy$flow$377(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$380(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native int recovery$indy$flow$381(java.lang.Object a0);
    private static native int recovery$indy$flow$382(java.lang.Object a0);
    private static native int recovery$indy$flow$383(java.lang.Object a0);
    private static native int recovery$indy$flow$384(java.lang.Object a0);
    private static double recovery$indy$flow$385(double a0) {
        return java.lang.Math.sqrt(a0);
    }
    private static java.lang.Object recovery$indy$flow$386(java.lang.Object a0,double a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$387(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }

    private static native void recovery$indy$flow$389(long a0,java.lang.Object a1);
    private static boolean recovery$indy$flow$390(java.lang.Object a0) {
        return (a0 instanceof net.C_42L);
    }
    private static java.lang.Object recovery$indy$flow$391() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }



    private static native float recovery$indy$flow$395(java.lang.Object a0);
    private static float recovery$indy$flow$396(float a0) {
        return java.lang.Math.abs(a0);
    }
    private static native float recovery$indy$flow$397(java.lang.Object a0);
    private static float recovery$indy$flow$398(float a0) {
        return java.lang.Math.abs(a0);
    }
    private static native float recovery$indy$flow$399(java.lang.Object a0);
    private static float recovery$indy$flow$400(float a0) {
        return java.lang.Math.abs(a0);
    }
    private static java.lang.Object recovery$indy$flow$403(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native float recovery$indy$flow$404(java.lang.Object a0);
    private static native float recovery$indy$flow$405(java.lang.Object a0);
    private static native float recovery$indy$flow$406(java.lang.Object a0);
    private static native float recovery$indy$flow$407(java.lang.Object a0);
    private static double recovery$indy$flow$408(double a0) {
        return java.lang.Math.sqrt(a0);
    }
    private static java.lang.Object recovery$indy$flow$409(java.lang.Object a0,double a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$410(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }

    private static native void recovery$indy$flow$412(long a0,java.lang.Object a1);
    private static boolean recovery$indy$flow$413(java.lang.Object a0) {
        return (a0 instanceof net.C_47y_);
    }
    private static java.lang.Object recovery$indy$flow$414() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$418(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$419() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static native java.lang.Object recovery$indy$flow$422(java.lang.Object a0,int a1);
    private static boolean recovery$indy$flow$423(java.lang.Object a0) {
        return (a0 instanceof net.C_47Bp);
    }


    private static native void recovery$indy$flow$426(java.lang.Object a0);
    private static boolean recovery$indy$flow$427(java.lang.Object a0) {
        return (a0 instanceof net.C_48c);
    }
    private static java.lang.Object recovery$indy$flow$428() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }



    private static native int recovery$indy$flow$432(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$433() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static native int recovery$indy$flow$436(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$437(java.lang.Object a0,int a1);
    private static boolean recovery$indy$flow$438(java.lang.Object a0) {
        return (a0 instanceof net.minecraft.entity.EntityLivingBase);
    }

    private static int recovery$indy$flow$440(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_43l;
    }
    private static void recovery$indy$flow$441(java.lang.Object a0,int a1) {
        ((net.minecraft.entity.EntityLivingBase) (a0)).field_43l = a1;
        return;
    }
    private static boolean recovery$indy$flow$442(java.lang.Object a0) {
        return (a0 instanceof net.C_47nD);
    }
    private static java.lang.Object recovery$indy$flow$443() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }



    private static native byte recovery$indy$flow$447(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$448() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static native int recovery$indy$flow$451(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$452(java.lang.Object a0,int a1);
    private static boolean recovery$indy$flow$453(java.lang.Object a0) {
        return (a0 instanceof net.minecraft.entity.EntityLivingBase);
    }

    private static int recovery$indy$flow$455(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_43w;
    }
    private static void recovery$indy$flow$456(java.lang.Object a0,int a1) {
        ((net.minecraft.entity.EntityLivingBase) (a0)).field_43w = a1;
        return;
    }
    private static int recovery$indy$flow$457(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_476;
    }
    private static void recovery$indy$flow$458(java.lang.Object a0,int a1) {
        ((net.minecraft.entity.EntityLivingBase) (a0)).field_476 = a1;
        return;
    }
    private static int recovery$indy$flow$459(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48y;
    }
    private static void recovery$indy$flow$460(java.lang.Object a0,int a1) {
        ((net.minecraft.entity.EntityLivingBase) (a0)).field_434 = a1;
        return;
    }
    private static boolean recovery$indy$flow$461(java.lang.Object a0) {
        return (a0 instanceof net.C_47qi);
    }
    private static java.lang.Object recovery$indy$flow$462() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static long recovery$indy$flow$465() {
        return java.lang.System.currentTimeMillis();
    }
    private static long recovery$indy$flow$466(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43Y;
    }
    private static long recovery$indy$flow$467() {
        return java.lang.System.currentTimeMillis();
    }
    private static void recovery$indy$flow$468(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43Y = a1;
        return;
    }

    private static java.lang.Object recovery$indy$flow$470(long a0) {
        return java.lang.Long.valueOf(a0);
    }
    private static boolean recovery$indy$flow$471(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static int recovery$indy$flow$473(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }

    private static java.lang.Object recovery$indy$flow$475(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }
    private static boolean recovery$indy$flow$476(java.lang.Object a0) {
        return (a0 instanceof net.C_47nD);
    }
    private static java.lang.Object recovery$indy$flow$477() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }



    private static native byte recovery$indy$flow$481(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$482() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static native int recovery$indy$flow$485(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$486(java.lang.Object a0,int a1);

    private static native int recovery$indy$flow$488(java.lang.Object a0);

    private static native int recovery$indy$flow$490(java.lang.Object a0);

    private static int recovery$indy$flow$492(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_432;
    }
    private static long recovery$indy$flow$493() {
        return java.lang.System.currentTimeMillis();
    }

    private static long recovery$indy$flow$495(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48i;
    }

    private static boolean recovery$indy$flow$497(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }


    private static native long recovery$indy$flow$500(java.lang.Object a0);
    private static boolean recovery$indy$flow$501(java.lang.Object a0) {
        return (a0 instanceof net.C_48c);
    }
    private static java.lang.Object recovery$indy$flow$502() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }



    private static native int recovery$indy$flow$506(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$507() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static native int recovery$indy$flow$510(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$511(java.lang.Object a0,int a1);

    private static native int recovery$indy$flow$513(java.lang.Object a0);

    private static native int recovery$indy$flow$515(java.lang.Object a0);

    private static int recovery$indy$flow$517(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_432;
    }
    private static long recovery$indy$flow$518() {
        return java.lang.System.currentTimeMillis();
    }

    private static long recovery$indy$flow$520(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48i;
    }

    private static boolean recovery$indy$flow$522(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).isEmpty();
    }


    private static native long recovery$indy$flow$525(java.lang.Object a0);


    private static native boolean recovery$indy$flow$528(java.lang.Object a0);
    private static boolean recovery$indy$flow$529(java.lang.Object a0) {
        return (a0 instanceof net.C_47qi);
    }

    private static int recovery$indy$flow$531(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43d;
    }
    private static void recovery$indy$flow$532(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43d = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$535(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native int recovery$indy$flow$536(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$537(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$538(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native short recovery$indy$flow$539(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$540(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$541(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native boolean recovery$indy$flow$542(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$543(java.lang.Object a0,boolean a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$544(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static int recovery$indy$flow$545(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_471;
    }
    private static java.lang.Object recovery$indy$flow$546(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$547(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }

    private static native void recovery$indy$flow$549(long a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$550();
    private static java.lang.Object recovery$indy$flow$551(java.lang.Object a0) {
        return a0.getClass();
    }
    private static boolean recovery$indy$flow$552(java.lang.Object a0) {
        return (a0 instanceof net.C_47FQ);
    }

    private static void recovery$indy$flow$554(java.lang.Object a0) {
        ((java.util.ArrayList) (a0)).clear();
        return;
    }

    private static void recovery$indy$flow$556(java.lang.Object a0) {
        ((java.util.ArrayList) (a0)).clear();
        return;
    }
    private static void recovery$indy$flow$557(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43Z = a1;
        return;
    }



    private static native boolean recovery$indy$flow$561(java.lang.Object a0);
    private static int recovery$indy$flow$562(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47s;
    }
    private static int recovery$indy$flow$563(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_477;
    }
    private static int recovery$indy$flow$564(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43y;
    }
    private static int recovery$indy$flow$565(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_437;
    }
    private static int recovery$indy$flow$566(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_477;
    }
    private static int recovery$indy$flow$567(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47s;
    }
    private static int recovery$indy$flow$568(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47s;
    }
    private static int recovery$indy$flow$569(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_477;
    }
    private static int recovery$indy$flow$570(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43y;
    }
    private static int recovery$indy$flow$571(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_437;
    }
    private static int recovery$indy$flow$572(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_437;
    }
    private static int recovery$indy$flow$573(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43y;
    }
    private static java.lang.Object recovery$indy$flow$576(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static int recovery$indy$flow$577(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_477;
    }
    private static java.lang.Object recovery$indy$flow$578(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$579(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$582(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$583(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$584(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$587(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$588(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$589(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$590(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$591(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static int recovery$indy$flow$592(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43y;
    }
    private static java.lang.Object recovery$indy$flow$593(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$594(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$597(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$598(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$599(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$602(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$603(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$604(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$605(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$606(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$607(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native void recovery$indy$flow$610(java.lang.Object a0,long a1,byte a2,java.lang.Object a3);
    private static java.lang.Object recovery$indy$flow$613(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static int recovery$indy$flow$614(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47s;
    }
    private static java.lang.Object recovery$indy$flow$615(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$616(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$619(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$620(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$621(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$624(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$625(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$626(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$627(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$628(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static int recovery$indy$flow$629(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_437;
    }
    private static java.lang.Object recovery$indy$flow$630(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$631(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$634(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$635(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$636(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$639(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$640(java.lang.Object a0,int a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$641(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$642(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$643(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$644(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native void recovery$indy$flow$647(java.lang.Object a0,long a1,byte a2,java.lang.Object a3);
    private static void recovery$indy$flow$648(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47s = a1;
        return;
    }
    private static void recovery$indy$flow$649(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_477 = a1;
        return;
    }
    private static void recovery$indy$flow$650(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$651(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$652(java.lang.Object a0,float a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_473 = a1;
        return;
    }
    private static void recovery$indy$flow$653(java.lang.Object a0,float a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47J = a1;
        return;
    }
    private static boolean recovery$indy$flow$654(java.lang.Object a0) {
        return (a0 instanceof net.C_48c);
    }

    private static native int recovery$indy$flow$656(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$657() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static native int recovery$indy$flow$660(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$661() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static native int recovery$indy$flow$664(java.lang.Object a0);
    private static int recovery$indy$flow$665(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_437;
    }
    private static void recovery$indy$flow$666(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_437 = a1;
        return;
    }
    private static native int recovery$indy$flow$667(java.lang.Object a0);


    private static native int recovery$indy$flow$670(java.lang.Object a0);
    private static native int recovery$indy$flow$671(java.lang.Object a0);
    private static int recovery$indy$flow$672(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43y;
    }
    private static void recovery$indy$flow$673(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43y = a1;
        return;
    }
    private static boolean recovery$indy$flow$674(java.lang.Object a0) {
        return (a0 instanceof net.C_47bo);
    }



    private static native boolean recovery$indy$flow$678(java.lang.Object a0);

    private static double recovery$indy$flow$680(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43D;
    }
    private static native float recovery$indy$flow$681(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$683(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$684(java.lang.Object a0);
    private static boolean recovery$indy$flow$685(java.lang.Object a0) {
        return (a0 instanceof net.C_45V);
    }

    private static java.lang.Object recovery$indy$flow$687() {
        return net.C_47DW.field_488;
    }
    private static int recovery$indy$flow$688(java.lang.Object a0) {
        return ((net.C_47DW) (a0)).field_48X;
    }
    private static native int recovery$indy$flow$689(int a0,java.lang.Object a1);
    private static native float recovery$indy$flow$690(java.lang.Object a0);
    private static native boolean recovery$indy$flow$691(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$692() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$694(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$695() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$697(java.lang.Object a0);

    private static boolean recovery$indy$flow$699(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }


    private static native float recovery$indy$flow$702(java.lang.Object a0,java.lang.Object a1,long a2);
    private static boolean recovery$indy$flow$703(java.lang.Object a0) {
        return (a0 instanceof net.C_45r);
    }

    private static java.lang.Object recovery$indy$flow$705() {
        return net.C_47DW.field_488;
    }
    private static int recovery$indy$flow$706(java.lang.Object a0) {
        return ((net.C_47DW) (a0)).field_48X;
    }
    private static native int recovery$indy$flow$707(int a0,java.lang.Object a1);
    private static native float recovery$indy$flow$708(java.lang.Object a0);
    private static native boolean recovery$indy$flow$709(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$710() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$712(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$713() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }

    private static native java.lang.Object recovery$indy$flow$715(java.lang.Object a0);

    private static boolean recovery$indy$flow$717(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }


    private static native float recovery$indy$flow$720(java.lang.Object a0,java.lang.Object a1,long a2);
    private static java.lang.Object recovery$indy$flow$721() {
        return net.C_47da.field_492;
    }



    private static native float recovery$indy$flow$725(java.lang.Object a0,java.lang.Object a1,byte a2,float a3,java.lang.Object a4,boolean a5,int a6,int a7,boolean a8);
    private static java.lang.Object recovery$indy$flow$726() {
        return net.C_47da.field_492;
    }



    private static native float recovery$indy$flow$730(java.lang.Object a0,java.lang.Object a1,byte a2,float a3,java.lang.Object a4,boolean a5,int a6,int a7,boolean a8);
    private static java.lang.Object recovery$indy$flow$731() {
        return net.C_47da.field_492;
    }



    private static native float recovery$indy$flow$735(java.lang.Object a0,java.lang.Object a1,byte a2,float a3,java.lang.Object a4,boolean a5,int a6,int a7,boolean a8);
    private static java.lang.Object recovery$indy$flow$736() {
        return net.C_47da.field_492;
    }



    private static native float recovery$indy$flow$740(java.lang.Object a0,java.lang.Object a1,byte a2,float a3,java.lang.Object a4,boolean a5,int a6,int a7,boolean a8);
    private static java.lang.Object recovery$indy$flow$741() {
        return net.C_47da.field_492;
    }



    private static native float recovery$indy$flow$745(java.lang.Object a0,java.lang.Object a1,byte a2,float a3,java.lang.Object a4,boolean a5,int a6,int a7,boolean a8);
    private static java.lang.Object recovery$indy$flow$746() {
        return net.C_47da.field_492;
    }



    private static native float recovery$indy$flow$750(java.lang.Object a0,java.lang.Object a1,byte a2,float a3,java.lang.Object a4,boolean a5,int a6,int a7,boolean a8);



    private static native boolean recovery$indy$flow$754(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$757(java.lang.Object a0,double a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$758(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$759(java.lang.Object a0,float a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$760(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$761(java.lang.Object a0,float a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$762(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native void recovery$indy$flow$765(java.lang.Object a0,long a1,byte a2,java.lang.Object a3);

    private static native boolean recovery$indy$flow$767(java.lang.Object a0,long a1);



    private static native boolean recovery$indy$flow$771(java.lang.Object a0);

    private static java.lang.Object recovery$indy$flow$773(java.lang.Object a0) {
        return ((float[]) (a0));
    }
    private static native float recovery$indy$flow$774(java.lang.Object a0,long a1,float a2,java.lang.Object a3);
    private static float recovery$indy$flow$775(float a0) {
        return java.lang.Math.abs(a0);
    }

    private static native boolean recovery$indy$flow$777(java.lang.Object a0,int a1,double a2,double a3,char a4,char a5,double a6);

    private static native boolean recovery$indy$flow$779(java.lang.Object a0,int a1,double a2,double a3,char a4,char a5,double a6);
    private static int recovery$indy$flow$780(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43Z;
    }


    private static native void recovery$indy$flow$783(java.lang.Object a0,long a1,byte a2,java.lang.Object a3);
    private static int recovery$indy$flow$784(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43Z;
    }
    private static void recovery$indy$flow$785(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43Z = a1;
        return;
    }

    private static native boolean recovery$indy$flow$787(java.lang.Object a0,int a1,double a2,double a3,char a4,char a5,double a6);

    private static native boolean recovery$indy$flow$789(java.lang.Object a0,int a1,double a2,double a3,char a4,char a5,double a6);

    private static native boolean recovery$indy$flow$791(java.lang.Object a0,int a1,double a2,double a3,char a4,char a5,double a6);

    private static native boolean recovery$indy$flow$793(java.lang.Object a0,int a1,double a2,double a3,char a4,char a5,double a6);
    private static java.lang.Object recovery$indy$flow$796(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$797(java.lang.Object a0,double a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$798(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$799(java.lang.Object a0,float a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$800(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$801(java.lang.Object a0,float a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$802(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native void recovery$indy$flow$805(java.lang.Object a0,long a1,byte a2,java.lang.Object a3);
    private static int recovery$indy$flow$806(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43Z;
    }
    private static void recovery$indy$flow$807(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43Z = a1;
        return;
    }


    private static java.lang.Object recovery$indy$flow$810(java.lang.Object a0) {
        return ((float[]) (a0));
    }
    private static native float recovery$indy$flow$811(java.lang.Object a0,long a1,float a2,java.lang.Object a3);
    private static java.lang.Object recovery$indy$flow$812(float a0) {
        return java.lang.Float.valueOf(a0);
    }
    private static boolean recovery$indy$flow$813(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$815(float a0) {
        return java.lang.Float.valueOf(a0);
    }
    private static boolean recovery$indy$flow$816(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static int recovery$indy$flow$818(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }

    private static java.lang.Object recovery$indy$flow$820(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }

    private static int recovery$indy$flow$822(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }

    private static java.lang.Object recovery$indy$flow$824(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).remove(a1);
    }

    private static int recovery$indy$flow$826(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }


    private static native boolean recovery$indy$flow$829(java.lang.Object a0);

    private static java.lang.Object recovery$indy$flow$831(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).stream();
    }
    private static native java.lang.Object recovery$indy$flow$832();
    private static java.lang.Object recovery$indy$flow$833(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.stream.Stream) (a0)).mapToDouble(((java.util.function.ToDoubleFunction) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$834(java.lang.Object a0) {
        return ((java.util.stream.DoubleStream) (a0)).average();
    }
    private static double recovery$indy$flow$835(java.lang.Object a0,double a1) {
        return ((java.util.OptionalDouble) (a0)).orElse(a1);
    }

    private static java.lang.Object recovery$indy$flow$837(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).stream();
    }
    private static native java.lang.Object recovery$indy$flow$838();
    private static java.lang.Object recovery$indy$flow$839(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.stream.Stream) (a0)).mapToDouble(((java.util.function.ToDoubleFunction) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$840(java.lang.Object a0) {
        return ((java.util.stream.DoubleStream) (a0)).average();
    }
    private static double recovery$indy$flow$841(java.lang.Object a0,double a1) {
        return ((java.util.OptionalDouble) (a0)).orElse(a1);
    }

    private static native boolean recovery$indy$flow$843(java.lang.Object a0,int a1,double a2,double a3,char a4,char a5,double a6);


    private static native void recovery$indy$flow$846(java.lang.Object a0,long a1,byte a2,java.lang.Object a3);
    private static java.lang.Object recovery$indy$flow$849(java.lang.Object a0,double a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$850(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$851(java.lang.Object a0,float a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$852(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native void recovery$indy$flow$855(java.lang.Object a0,long a1,byte a2,java.lang.Object a3);
    private static native float recovery$indy$flow$856(java.lang.Object a0);
    private static void recovery$indy$flow$857(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43D = a1;
        return;
    }



    private static native java.lang.Object recovery$indy$flow$861(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$862(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }


    private static native java.lang.Object recovery$indy$flow$865(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$866(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }



    private static native void recovery$indy$flow$870(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3);
    private static boolean recovery$indy$flow$871(java.lang.Object a0) {
        return (a0 instanceof net.C_47qi);
    }
    private static boolean recovery$indy$flow$872(java.lang.Object a0) {
        return (a0 instanceof net.C_4766);
    }
    private static boolean recovery$indy$flow$873(java.lang.Object a0) {
        return (a0 instanceof net.C_47AL);
    }
    private static boolean recovery$indy$flow$874(java.lang.Object a0) {
        return (a0 instanceof net.C_47Tq);
    }
    private static boolean recovery$indy$flow$875(java.lang.Object a0) {
        return (a0 instanceof net.C_47IW);
    }
    private static boolean recovery$indy$flow$876(java.lang.Object a0) {
        return (a0 instanceof net.C_47AO);
    }
    private static boolean recovery$indy$flow$877(java.lang.Object a0) {
        return (a0 instanceof net.C_47Om);
    }
    private static boolean recovery$indy$flow$878(java.lang.Object a0) {
        return (a0 instanceof net.C_47bo);
    }
    private static boolean recovery$indy$flow$879(java.lang.Object a0) {
        return (a0 instanceof net.C_44B);
    }
    private static boolean recovery$indy$flow$880(java.lang.Object a0) {
        return (a0 instanceof net.C_470I);
    }
    private static boolean recovery$indy$flow$881(java.lang.Object a0) {
        return (a0 instanceof net.C_477I);
    }
    private static boolean recovery$indy$flow$882(java.lang.Object a0) {
        return (a0 instanceof net.C_476s);
    }
    private static boolean recovery$indy$flow$883(java.lang.Object a0) {
        return (a0 instanceof net.C_48c);
    }
    private static boolean recovery$indy$flow$884(java.lang.Object a0) {
        return (a0 instanceof net.C_47Vl);
    }
    private static boolean recovery$indy$flow$885(java.lang.Object a0) {
        return (a0 instanceof net.C_475D);
    }
    private static boolean recovery$indy$flow$886(java.lang.Object a0) {
        return (a0 instanceof net.C_479X);
    }
    private static boolean recovery$indy$flow$887(java.lang.Object a0) {
        return (a0 instanceof net.C_47RC);
    }
    private static boolean recovery$indy$flow$888(java.lang.Object a0) {
        return (a0 instanceof net.C_47xZ);
    }
    private static boolean recovery$indy$flow$889(java.lang.Object a0) {
        return (a0 instanceof net.C_47FQ);
    }
    private static boolean recovery$indy$flow$890(java.lang.Object a0) {
        return (a0 instanceof net.C_471u);
    }
    private static boolean recovery$indy$flow$891(java.lang.Object a0) {
        return (a0 instanceof net.C_4742);
    }
    private static boolean recovery$indy$flow$892(java.lang.Object a0) {
        return (a0 instanceof net.C_434);
    }
    private static boolean recovery$indy$flow$893(java.lang.Object a0) {
        return (a0 instanceof net.C_47y_);
    }
    private static boolean recovery$indy$flow$894(java.lang.Object a0) {
        return (a0 instanceof net.C_47KH);
    }
    private static boolean recovery$indy$flow$895(java.lang.Object a0) {
        return (a0 instanceof net.C_47Iz);
    }
    private static boolean recovery$indy$flow$896(java.lang.Object a0) {
        return (a0 instanceof net.C_475b);
    }
    private static boolean recovery$indy$flow$897(java.lang.Object a0) {
        return (a0 instanceof net.C_47Ut);
    }
    private static boolean recovery$indy$flow$898(java.lang.Object a0) {
        return (a0 instanceof net.C_47TZ);
    }
    private static boolean recovery$indy$flow$899(java.lang.Object a0) {
        return (a0 instanceof net.C_47qi);
    }
    private static boolean recovery$indy$flow$900(java.lang.Object a0) {
        return (a0 instanceof net.C_47TZ);
    }
    private static boolean recovery$indy$flow$901(java.lang.Object a0) {
        return (a0 instanceof net.C_47AO);
    }
    private static boolean recovery$indy$flow$902(java.lang.Object a0) {
        return (a0 instanceof net.C_47bo);
    }


    private static native boolean recovery$indy$flow$905(java.lang.Object a0);
    private static boolean recovery$indy$flow$906(java.lang.Object a0) {
        return (a0 instanceof net.C_47bo);
    }
    private static java.lang.Object recovery$indy$flow$907() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }



    private static native float recovery$indy$flow$911(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$912() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static native float recovery$indy$flow$915(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$918(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$919(double a0,long a1,int a2,long a3,long a4);
    private static java.lang.Object recovery$indy$flow$920(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$921(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native void recovery$indy$flow$924(java.lang.Object a0,long a1,byte a2,java.lang.Object a3);
    private static boolean recovery$indy$flow$925(java.lang.Object a0) {
        return (a0 instanceof net.C_477Q);
    }


    private static native boolean recovery$indy$flow$928(java.lang.Object a0);

    private static java.lang.Object recovery$indy$flow$932(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$933(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$934(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$935(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native void recovery$indy$flow$938(java.lang.Object a0,long a1,byte a2,java.lang.Object a3);
    private static boolean recovery$indy$flow$939(java.lang.Object a0) {
        return (a0 instanceof net.C_47AL);
    }


    private static native boolean recovery$indy$flow$942(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$944(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$945(java.lang.Object a0);
    private static boolean recovery$indy$flow$946(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).contains(((java.lang.CharSequence) (a1)));
    }
    private static native void recovery$indy$flow$947(java.lang.Object a0);
    private static boolean recovery$indy$flow$948(java.lang.Object a0) {
        return (a0 instanceof net.C_47nD);
    }


    private static native boolean recovery$indy$flow$951(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$952() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }



    private static native int recovery$indy$flow$956(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$957() {
        return augustus.recovered.modules.misc.Debug_47kF.field_43;
    }


    private static native int recovery$indy$flow$960(java.lang.Object a0);
    private static native byte recovery$indy$flow$961(java.lang.Object a0);


    private static native boolean recovery$indy$flow$964(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$967(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }


    private static native long recovery$indy$flow$970(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$971(java.lang.Object a0,long a1) {
        return ((java.lang.StringBuilder) (a0)).append(a1);
    }
    private static java.lang.Object recovery$indy$flow$972(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native void recovery$indy$flow$975(java.lang.Object a0,long a1,byte a2,java.lang.Object a3);


    private static native void recovery$indy$flow$978(java.lang.Object a0);
    private static native void recovery$indy$flow$1692(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$1696(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1697(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1700(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1702(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$1706(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1707(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1710(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1711(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$1715(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1716(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1719(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1720(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1723(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1726(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1729(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1732(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1735(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1738(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1741(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1744(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1747(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1750(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1753(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1756(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1759(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1762(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1765(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1766(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43Q = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1767(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47y = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1768(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43p = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1769(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_434 = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1770(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47e = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1771(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43t = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1772(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47w = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1773(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43_ = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1774(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_479 = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1775(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_41 = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1776(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43r = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1777(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47Q = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1778(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_472 = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1779(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43B = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1780(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47W = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1781(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47u = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1782(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_432 = ((client.setting.ModeSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1783(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47X = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1784(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43e = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1785(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43L = ((client.setting.BooleanSetting) (a1));
        return;
    }
    private static void recovery$indy$flow$1786(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43F = a1;
        return;
    }
    private static native void recovery$indy$flow$1789(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1792(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1795(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1798(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1799(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43Z = a1;
        return;
    }
    private static void recovery$indy$flow$1800(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_477 = a1;
        return;
    }
    private static void recovery$indy$flow$1801(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$1802(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47s = a1;
        return;
    }
    private static void recovery$indy$flow$1803(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_437 = a1;
        return;
    }
    private static void recovery$indy$flow$1804(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43f = a1;
        return;
    }
    private static native void recovery$indy$flow$1807(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1810(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1813(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1816(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1819(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1822(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1825(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1826(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43d = a1;
        return;
    }
    private static void recovery$indy$flow$1827(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_471 = a1;
        return;
    }
    private static void recovery$indy$flow$1828(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43I = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static native void recovery$indy$flow$1831(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1832(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43n = a1;
        return;
    }
    private static void recovery$indy$flow$1833(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43U = a1;
        return;
    }
    private static native void recovery$indy$flow$1836(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1839(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1840(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43Y = a1;
        return;
    }
    private static native void recovery$indy$flow$1843(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1844(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_431 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static native void recovery$indy$flow$1847(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1848(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43i = ((net.minecraft.entity.player.EntityPlayer) (a1));
        return;
    }
    private static void recovery$indy$flow$1849(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47B = a1;
        return;
    }
    private static void recovery$indy$flow$1850(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_478 = a1;
        return;
    }
    private static native void recovery$indy$flow$1853(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1854(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47x = a1;
        return;
    }
    private static void recovery$indy$flow$1855(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47P = a1;
        return;
    }
    private static void recovery$indy$flow$1856(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_430 = a1;
        return;
    }
    private static void recovery$indy$flow$1857(java.lang.Object a0,float a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47U = a1;
        return;
    }
    private static void recovery$indy$flow$1858(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43M = a1;
        return;
    }
    private static void recovery$indy$flow$1859(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_45 = a1;
        return;
    }
    private static void recovery$indy$flow$1860(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_436 = a1;
        return;
    }
    private static void recovery$indy$flow$1863(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47S = ((net.C_49S) (a1));
        return;
    }
    private static void recovery$indy$flow$1866(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43V = ((net.C_49S) (a1));
        return;
    }
    private static void recovery$indy$flow$1869(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43l = ((net.C_49S) (a1));
        return;
    }
    private static native void recovery$indy$flow$1872(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1875(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1878(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1881(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1884(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1887(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1890(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1891(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_47p = a1;
        return;
    }
    private static void recovery$indy$flow$1892(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$1893(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43q = a1;
        return;
    }
    private static void recovery$indy$flow$1894(java.lang.Object a0,double a1) {
        ((augustus.recovered.modules.misc.Debug_47kF) (a0)).field_43D = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$1895();
    private static java.lang.Object recovery$indy$flow$1896(java.lang.Object a0) {
        return a0.getClass();
    }
   private static native MethodHandle recovery$constant$0();
   private static native List recovery$indy$1(Object var0, int var1, char var2, Object var3, short var4, long var5, long var7);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3, long var5, long var7);
   private static native void recovery$indy$3(Object var0, long var1, boolean var3, long var4, long var6);
   private static native float recovery$indy$4(Object var0, long var1, long var3, long var5);
   private static native Client recovery$indy$5(long var0, long var2);
   private static native String recovery$indy$6(double var0, long var2, int var4, long var5, long var7);
   private static native String recovery$indy$7(int var0, long var1);
   private static native int[] recovery$indy$8(long var0, long var2);
   private static native Object recovery$indy$9(Object var0, Object var1, long var2, Object var4, long var5, long var7);
   private static native C_473U recovery$indy$16(Object var0, long var1, long var3);
   private static native String recovery$indy$17(int var0, long var1);
   private static native int[] recovery$indy$18(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$19(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$20(Object var0, long var1, long var3);
   private static native int[] recovery$indy$21(long var0, long var2);
   private static native C_473U recovery$indy$22(Object var0, long var1, long var3);
   private static native String recovery$indy$23(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$24(int var0, long var1);
   private static native String recovery$indy$25(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$26(int var0, long var1);
   private static native String recovery$indy$27(int var0, long var1);
   private static native void recovery$indy$28(Object var0, long var1, Object var3, Object var4, long var5, long var7);
   private static native Client recovery$indy$29(long var0, long var2);
   private static native int[] recovery$indy$30(long var0, long var2);
   private static native String recovery$indy$31(int var0, long var1);
   private static native String recovery$indy$32(int var0, long var1);
   private static native String recovery$indy$33(int var0, long var1);
   private static native String recovery$indy$34(int var0, long var1);
   private static native String recovery$indy$35(int var0, long var1);
   private static native String recovery$indy$36(int var0, long var1);
   private static native EntityPlayerSP recovery$indy$37(Object var0, long var1, long var3);
   private static native int[] recovery$indy$38(long var0, long var2);
   private static native int[] recovery$indy$39(long var0, long var2);
   private static native WorldClient recovery$indy$40(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$41(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$42(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$43(Object var0, long var1, long var3);
   private static native List recovery$indy$44(Object var0, int var1, char var2, Object var3, short var4, long var5, long var7);
   private static native int[] recovery$indy$45(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$46(Object var0, long var1, long var3);
   private static native float recovery$indy$47(Object var0, byte var1, Object var2, float var3, long var4, Object var6, long var7, long var9);
   private static native float recovery$indy$48(
      Object var0, short var1, Object var2, float var3, boolean var4, int var5, int var6, boolean var7, long var8, long var10
   );
   private static native EntityPlayerSP recovery$indy$49(Object var0, long var1, long var3);
   private static native int[] recovery$indy$50(long var0, long var2);
   private static native String recovery$indy$51(int var0, long var1);
   private static native String recovery$indy$52(int var0, long var1);
   private static native String recovery$indy$53(int var0, long var1);
   private static native String recovery$indy$54(int var0, long var1);
   private static native String recovery$indy$55(int var0, long var1);
   private static native int[] recovery$indy$56(long var0, long var2);
   private static native String recovery$indy$57(int var0, long var1);
   private static native String recovery$indy$58(int var0, long var1);
   private static native int[] recovery$indy$59(long var0, long var2);
   private static native int[] recovery$indy$60(long var0, long var2);
   private static native Object recovery$indy$61(Object var0, Object var1, long var2, Object var4, long var5, long var7);
   private static native int[] recovery$indy$62(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$63(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$64(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$65(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$66(Object var0, long var1, long var3);
   private static native int[] recovery$indy$67(long var0, long var2);
   private static native void recovery$indy$68(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$69(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$70(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$71(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$72(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$73(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native void recovery$indy$74(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$75(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$79();
}
