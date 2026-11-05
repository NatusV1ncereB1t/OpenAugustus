package augustus.recovered.modules.movement;
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
import net.C_40X;
import net.C_41Q;
import net.C_45n;
import net.C_479E;
import net.C_479m;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47K6;
import net.C_47K7;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.minecraft.client.Minecraft;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Spider_47kl extends client.module.Module implements net.C_47xz,net.C_41Q {
    public client.setting.ModeSetting settingMode; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingModeValues = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingCustomMotion = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTickDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingMotionToJump = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCustomMotionAtJump = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingJumpMotion = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingGroundPacket = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingPositionSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTickDelayPosition = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTimer = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native void b();

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.String b(byte[] a0);

   private boolean method_49A$aae029aa0a() {
      long var1 = a ^ 68238490303844L;
      long var3 = var1 ^ 130660109998504L;
      long var10002 = -7181861980784790492L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Jump");
   }



    private static native java.lang.reflect.Method h(long a0,long a1);

    private static native int e(long a0,long a1);

    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   private boolean method_49H$aae029aa0a() {
      long var1 = a ^ 76386171964261L;
      long var3 = var1 ^ 15103876231081L;
      long var10002 = -6172854002524601819L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Motion");
   }



   public void method_44$cecb73866e(int var1, net.C_47K7 var2, long var3) {
      long var7;
      long var9;
      long var11;
      byte var13;
      Spider_47kl var82;
      label244: {
         label219: {
            long var5 = (long)var1 << 32 | var3 << 32 >>> 32;
            var7 = var5 ^ 93560678845923L;
            var9 = var5 ^ 83424379966291L;
            var11 = var5 ^ 115942598083693L;
            long var10000 = 4727923858021611735L;
            var13 = ((byte) (Fly_47kE.method_49t$aae029aa0a() ? 1 : 0));
            long var10002 = 4728711739215995756L;
            long var16 = var9;
            Spider_47kl var18 = this;
            net.C_40X var81;
            float var94;
            if (var18.method_49t$0dd78e0064(var16)) {
               long var10001 = 4728335927055717043L;
               net.minecraft.client.Minecraft var19 = field_43;
               var81 = var19.method_46$159e3d0645();
               long var10004 = 4727835523920769858L;
               long var20 = var7;
               client.setting.NumberSetting var22 = this.settingTimer;
               var94 = (float)Math.max(0.1, var22.method_44$474dfaa627(var20));
               if (var3 > 0L) {
                  var81.field_43 = var94;
                  if (var13 == 0) {
                     var82 = this;
                     break label244;
                  }

                  long var95 = 4728335927055717043L;
                  net.minecraft.client.Minecraft var23 = field_43;
                  var23.method_46$159e3d0645().field_43 = 1.0F;
                  var82 = this;
                  break label219;
               }
            } else {
               long var96 = 4728335927055717043L;
               net.minecraft.client.Minecraft var55 = field_43;
               var81 = var55.method_46$159e3d0645();
               var94 = 1.0F;
            }

            var81.field_43 = var94;
            var82 = this;
            if (var13 == 0) {
               break label244;
            }
         }

         long var117 = 4724831482355296737L;
         long var27 = var11;
         client.setting.ModeSetting var29 = var82.settingMode;
         String var14 = var29.method_46$5f9dc63072(var27);
         byte var15 = -1;
         int var84 = var14.hashCode();
         byte var97 = var13;
         if (var1 > 0) {
            if (var13 == 0) {
               switch (var84) {
                  case 0:
                     long var104 = 4728218989751383814L;
                     net.minecraft.client.Minecraft var30 = field_43;
                     net.minecraft.client.entity.EntityPlayerSP var88;
                     if (var13 == 0) {
                        if (!var30.field_42P.field_48d) {
                           return;
                        }

                        long var105 = 4728218989751383814L;
                        net.minecraft.client.Minecraft var59 = field_43;
                        var88 = var59.field_42P;
                     } else {
                        if (!var30.field_42P.field_48d) {
                           return;
                        }

                        long var106 = 4728218989751383814L;
                        net.minecraft.client.Minecraft var61 = field_43;
                        var88 = var61.field_42P;
                     }

                     var88.field_42 = 0.5;
                     long var107 = 4728218989751383814L;
                     net.minecraft.client.Minecraft var64 = field_43;
                     net.minecraft.client.entity.EntityPlayerSP var89 = var64.field_42P;
                     var117 = 4728218989751383814L;
                     net.minecraft.client.Minecraft var67 = field_43;
                     double var108 = var67.field_42P.field_48Q;
                     long var129 = 4728218989751383814L;
                     net.minecraft.client.Minecraft var70 = field_43;
                     long var140 = 4727835523920769858L;
                     long var73 = var7;
                     client.setting.NumberSetting var76 = this.settingPositionSpeed;
                     double var123 = var70.field_42P.field_48j + (float)var76.method_44$474dfaa627(var73);
                     long var135 = 4728218989751383814L;
                     net.minecraft.client.Minecraft var79 = field_43;
                     var89.method_46$a59262c0f0(var108, var123, var79.field_42P.field_42o);
                     return;
                  case 1:
                     long var102 = 4728218989751383814L;
                     net.minecraft.client.Minecraft var63 = field_43;
                     net.minecraft.client.entity.EntityPlayerSP var87 = var63.field_42P;
                     var117 = 4728218989751383814L;
                     net.minecraft.client.Minecraft var66 = field_43;
                     double var103 = var66.field_42P.field_48Q;
                     long var128 = 4728218989751383814L;
                     net.minecraft.client.Minecraft var69 = field_43;
                     long var139 = 4727835523920769858L;
                     long var72 = var7;
                     client.setting.NumberSetting var75 = this.settingPositionSpeed;
                     double var121 = var69.field_42P.field_48j + (float)var75.method_44$474dfaa627(var72);
                     long var134 = 4728218989751383814L;
                     net.minecraft.client.Minecraft var78 = field_43;
                     var87.method_46$a59262c0f0(var103, var121, var78.field_42P.field_42o);
                     return;
                  default:
                     return;
               }
            }

            var97 = var13;
         }

         net.minecraft.client.entity.EntityPlayerSP var85;
         if (var97 == 0) {
            if (var84 == 0) {
               return;
            }

            long var98 = 4728218989751383814L;
            net.minecraft.client.Minecraft var31 = field_43;
            var85 = var31.field_42P;
         } else {
            if (var84 == 0) {
               return;
            }

            long var99 = 4728218989751383814L;
            net.minecraft.client.Minecraft var32 = field_43;
            var85 = var32.field_42P;
         }

         var85.field_42 = 0.5;
         long var100 = 4728218989751383814L;
         net.minecraft.client.Minecraft var33 = field_43;
         net.minecraft.client.entity.EntityPlayerSP var86 = var33.field_42P;
         var117 = 4728218989751383814L;
         net.minecraft.client.Minecraft var47 = field_43;
         double var101 = var47.field_42P.field_48Q;
         long var10003 = 4728218989751383814L;
         net.minecraft.client.Minecraft var48 = field_43;
         long var10005 = 4727835523920769858L;
         long var49 = var7;
         client.setting.NumberSetting var51 = this.settingPositionSpeed;
         double var119 = var48.field_42P.field_48j + (float)var51.method_44$474dfaa627(var49);
         long var133 = 4728218989751383814L;
         net.minecraft.client.Minecraft var52 = field_43;
         var86.method_46$a59262c0f0(var101, var119, var52.field_42P.field_42o);
         return;
      }

      long var124 = 4728711739215995756L;
      long var24 = var9;
      Spider_47kl var26 = var82;
      if (var26.method_49t$0dd78e0064(var24)) {
         var124 = 4724831482355296737L;
         long var56 = var11;
         client.setting.ModeSetting var57 = this.settingMode;
         String var53 = var57.method_46$5f9dc63072(var56);
         byte var54 = -1;
         int var90;
         byte var109;
         switch (var53.hashCode()) {
            case 82544993:
               label185: {
                  label184:
                  if (var53.equals("Verus")) {
                     var54 = 0;
                     var90 = var13;
                     if (var1 > 0) {
                        if (var13 == 0) {
                           break label184;
                        }

                        var90 = ((int) (var53.equals("Position") ? 1 : 0));
                     }

                     var109 = var13;
                     if (var1 <= 0) {
                        break;
                     }

                     if (var13 != 0) {
                        break label185;
                     }

                     if (var90 != 0) {
                        var54 = 1;
                     }
                  }

                  var90 = var54;
               }

               var109 = var13;
               break;
            case 812449097:
               var90 = ((int) (var53.equals("Position") ? 1 : 0));
               var109 = var13;
               if (var1 > 0) {
                  if (var13 == 0) {
                     if (var90 != 0) {
                        var54 = 1;
                     }

                     var90 = var54;
                  }

                  var109 = var13;
               }
               break;
            default:
               var90 = var54;
               var109 = var13;
         }

         if (var1 > 0) {
            if (var109 == 0) {
               switch (var90) {
                  case 0:
                     long var114 = 4728218989751383814L;
                     net.minecraft.client.Minecraft var58 = field_43;
                     var90 = ((int) (var58.field_42P.field_48d ? 1 : 0));
                     break;
                  case 1:
                     long var110 = 4728218989751383814L;
                     net.minecraft.client.Minecraft var65 = field_43;
                     double var91 = var65.field_42P.field_48y;
                     long var130 = 4727835523920769858L;
                     long var34 = var7;
                     client.setting.NumberSetting var36 = this.settingTickDelayPosition;
                     if (var91 % (var36.method_44$474dfaa627(var34) + 1.0) == 0.0) {
                        long var111 = 4728218989751383814L;
                        net.minecraft.client.Minecraft var37 = field_43;
                        net.C_47K6 var92 = var37.field_42P.field_49m;
                        long var136 = 4728218989751383814L;
                        net.minecraft.client.Minecraft var38 = field_43;
                        double var131 = var38.field_42P.field_48Q;
                        long var141 = 4728218989751383814L;
                        net.minecraft.client.Minecraft var39 = field_43;
                        long var10007 = 4727835523920769858L;
                        long var40 = var7;
                        client.setting.NumberSetting var42 = this.settingPositionSpeed;
                        double var137 = var39.field_42P.field_48j + (float)var42.method_44$474dfaa627(var40);
                        long var10006 = 4728218989751383814L;
                        net.minecraft.client.Minecraft var43 = field_43;
                        var10007 = 4728218989751383814L;
                        net.minecraft.client.Minecraft var44 = field_43;
                        long var10008 = 4728218989751383814L;
                        net.minecraft.client.Minecraft var45 = field_43;
                        var92.method_45$631790539f(
                           new net.C_479m(var131, var137, var43.field_42P.field_42o, var44.field_42P.field_48h, var45.field_42P.field_48z, false)
                        );
                        long var112 = 4728218989751383814L;
                        net.minecraft.client.Minecraft var46 = field_43;
                        net.minecraft.client.entity.EntityPlayerSP var93 = var46.field_42P;
                        var124 = 4728218989751383814L;
                        net.minecraft.client.Minecraft var68 = field_43;
                        double var113 = var68.field_42P.field_48Q;
                        var130 = 4728218989751383814L;
                        net.minecraft.client.Minecraft var71 = field_43;
                        var141 = 4727835523920769858L;
                        long var74 = var7;
                        client.setting.NumberSetting var77 = this.settingPositionSpeed;
                        double var127 = var71.field_42P.field_48j + (float)var77.method_44$474dfaa627(var74);
                        var136 = 4728218989751383814L;
                        net.minecraft.client.Minecraft var80 = field_43;
                        var93.method_46$a59262c0f0(var113, var127, var80.field_42P.field_42o);
                     }

                     return;
                  default:
                     return;
               }
            }

            var109 = var13;
         }

         if (var109 == 0) {
            if (var90 == 0) {
               return;
            }

            long var115 = 4728218989751383814L;
            net.minecraft.client.Minecraft var60 = field_43;
            var90 = var60.field_42P.field_48y % 4;
         }

         if (var90 != 0) {
            long var116 = 4728218989751383814L;
            net.minecraft.client.Minecraft var62 = field_43;
            var62.field_42P.field_42 = 0.5;
         }
      }
   }






   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 9180898543576L;
      long var3 = var1 ^ 71039694037780L;
      long var10002 = -6419651616986935656L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Motion");
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 89858625939415L;
      long var3 = var1 ^ 28022395798299L;
      long var10000 = 5110043776279510945L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10002 = 5109203200396996247L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var10 = var8.method_46$5f9dc63072(var6).equals("Jump");
      if (!var5) {
         if (!var10) {
            return false;
         }

         long var10001 = 5110018697733840583L;
         BooleanSetting var9 = this.settingCustomMotionAtJump;
         var10 = var9.method_49$aae029aa0a();
      }

      return var5 ? var10 : var10;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$2(this, 40, var3, -7099003961311310361L, var1);
      recovery$indy$3(this, 18, var3, -7099003961311310361L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
        net.minecraft.client.entity.EntityPlayerSP var127;
        int var129;
        net.minecraft.client.entity.EntityPlayerSP var131;
        int var133;
        net.minecraft.client.entity.EntityPlayerSP var135;
        int var137;
        int var142;
        int var147;
        int var151;
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 72498010691029L;
      long var8 = var4 ^ 113186446332478L;
      long var10 = var4 ^ 132187523566734L;
      long var12 = var4 ^ 99593642957744L;
      long var10000 = 2180241765356971786L;
      byte var14 = ((byte) (Fly_47kE.method_49t$aae029aa0a() ? 1 : 0));
      long var10003 = 2183342938761000508L;
      long var17 = var12;
      client.setting.ModeSetting var19 = this.settingMode;
      String var10002 = var19.method_46$5f9dc63072(var17);
      var10003 = 2183219427973333851L;
      String var20 = var10002;
      long var21 = var6;
      Spider_47kl var23 = this;
      var23.method_47$d07b98bfef(var21, var20);
      if (var14 == 0) {
         long var212 = 2180570853792169137L;
         long var24 = var10;
         Spider_47kl var26 = this;
         if (var26.method_49t$0dd78e0064(var24)) {
            long var213 = 2183342938761000508L;
            long var54 = var12;
            client.setting.ModeSetting var55 = this.settingMode;
            String var52 = var55.method_46$5f9dc63072(var54);
            byte var53 = -1;
            byte var138;
            byte var180;
            switch (var52.hashCode()) {
               case -1984451626:
                  label488: {
                     label487:
                     if (var52.equals("Motion")) {
                        var53 = 0;
                        var138 = var14;
                        if (var1 > 0) {
                           if (var14 == 0) {
                              break label487;
                           }

                           var138 = ((byte) (var52.equals("Jump") ? 1 : 0));
                        }

                        var180 = var14;
                        if (var1 < 0) {
                           break;
                        }

                        if (var14 != 0) {
                           break label488;
                        }

                        if (var138 != 0) {
                           var53 = 1;
                        }
                     }

                     var138 = var53;
                  }

                  var180 = var14;
                  break;
               case 2320462:
                  var138 = ((byte) (var52.equals("Jump") ? 1 : 0));
                  var180 = var14;
                  if (var1 >= 0) {
                     if (var14 == 0) {
                        if (var138 != 0) {
                           var53 = 1;
                        }

                        var138 = var53;
                     }

                     var180 = var14;
                  }
                  break;
               default:
                  var138 = var53;
                  var180 = var14;
            }

            if (var180 == 0) {
               switch (var138) {
                  case 0:
                     long var190 = 2180641586714077403L;
                     net.minecraft.client.Minecraft var56 = field_43;
                     double var143 = var56.field_42P.field_48y;
                     var10003 = 2180189422667918495L;
                     long var31 = var8;
                     client.setting.NumberSetting var33 = this.settingTickDelay;
                     if (var143 % (var33.method_44$474dfaa627(var31) + 1.0) == 0.0) {
                        long var191 = 2180641586714077403L;
                        net.minecraft.client.Minecraft var57 = field_43;
                        var10003 = 2180189422667918495L;
                        long var60 = var8;
                        client.setting.NumberSetting var63 = this.settingCustomMotion;
                        var57.field_42P.field_42 = (float)var63.method_44$474dfaa627(var60);
                        byte var144 = var14;
                        if (var2 >= 0) {
                           if (var14 == 0) {
                              return;
                           }

                           long var192 = 2180641586714077403L;
                           net.minecraft.client.Minecraft var68 = field_43;
                           var144 = ((byte) (var68.field_42P.field_48M ? 1 : 0));
                        }

                        var180 = var14;
                        if (var2 > 0) {
                           if (var14 == 0) {
                              net.minecraft.client.entity.EntityPlayerSP var145;
                              if (var144 != 0) {
                                 long var194 = 2180641586714077403L;
                                 net.minecraft.client.Minecraft var73 = field_43;
                                 var145 = var73.field_42P;
                                 if (var3 >= 0) {
                                    var73.field_42P.method_46f$da8c82d5d4();
                                    return;
                                 }
                              } else {
                                 long var195 = 2180641586714077403L;
                                 net.minecraft.client.Minecraft var78 = field_43;
                                 var145 = var78.field_42P;
                              }

                              var10003 = 2180189422667918495L;
                              long var83 = var8;
                              client.setting.NumberSetting var88 = this.settingMotionToJump;
                              double var233;
                              var144 = (byte)((var233 = var145.field_42 - var88.method_44$474dfaa627(var83)) == 0.0 ? 0 : (var233 < 0.0 ? -1 : 1));
                           }

                           var180 = var14;
                        }

                        if (var180 == 0) {
                           if (var144 >= 0) {
                              return;
                           }

                           long var196 = 2180073200317154924L;
                           client.setting.BooleanSetting var93 = this.settingCustomMotionAtJump;
                           var144 = ((byte) (var93.method_49$aae029aa0a() ? 1 : 0));
                        }

                        label410: {
                           label409: {
                              if (var144 != 0) {
                                 long var197 = 2180641586714077403L;
                                 net.minecraft.client.Minecraft var98 = field_43;
                                 var10003 = 2180189422667918495L;
                                 long var103 = var8;
                                 client.setting.NumberSetting var108 = this.settingJumpMotion;
                                 var98.field_42P.field_42 = var108.method_44$474dfaa627(var103);
                                 var147 = var14;
                                 if (var3 < 0) {
                                    break label410;
                                 }

                                 if (var14 == 0) {
                                    break label409;
                                 }
                              }

                              long var198 = 2180641586714077403L;
                              net.minecraft.client.Minecraft var113 = field_43;
                              var113.field_42P.method_46f$da8c82d5d4();
                           }

                           long var199 = 2180073200317154924L;
                           client.setting.BooleanSetting var118 = this.settingGroundPacket;
                           var147 = ((var118.method_49$aae029aa0a()) ? 1 : 0);
                        }

                        if (var147 != 0) {
                           long var200 = 2180641586714077403L;
                           net.minecraft.client.Minecraft var123 = field_43;
                           var123.field_42P.field_49m.method_43$631790539f(new net.C_479E(true));
                        }
                     }
                     break;
                  case 1:
                     long var181 = 2180641586714077403L;
                     net.minecraft.client.Minecraft var67 = field_43;
                     byte var139 = ((byte) (var67.field_42P.field_48M ? 1 : 0));
                     var180 = var14;
                     if (var2 > 0) {
                        if (var14 == 0) {
                           net.minecraft.client.entity.EntityPlayerSP var140;
                           if (var67.field_42P.field_48M) {
                              long var183 = 2180641586714077403L;
                              net.minecraft.client.Minecraft var72 = field_43;
                              var140 = var72.field_42P;
                              if (var3 >= 0) {
                                 var72.field_42P.method_46f$da8c82d5d4();
                                 return;
                              }
                           } else {
                              long var184 = 2180641586714077403L;
                              net.minecraft.client.Minecraft var77 = field_43;
                              var140 = var77.field_42P;
                           }

                           var10003 = 2180189422667918495L;
                           long var82 = var8;
                           client.setting.NumberSetting var87 = this.settingMotionToJump;
                           double var232;
                           var139 = (byte)((var232 = var140.field_42 - var87.method_44$474dfaa627(var82)) == 0.0 ? 0 : (var232 < 0.0 ? -1 : 1));
                        }

                        var180 = var14;
                     }

                     if (var180 == 0) {
                        if (var139 >= 0) {
                           return;
                        }

                        long var185 = 2180073200317154924L;
                        client.setting.BooleanSetting var92 = this.settingCustomMotionAtJump;
                        var139 = ((byte) (var92.method_49$aae029aa0a() ? 1 : 0));
                     }

                     label419: {
                        label418: {
                           if (var139 != 0) {
                              long var186 = 2180641586714077403L;
                              net.minecraft.client.Minecraft var97 = field_43;
                              var10003 = 2180189422667918495L;
                              long var102 = var8;
                              client.setting.NumberSetting var107 = this.settingJumpMotion;
                              var97.field_42P.field_42 = var107.method_44$474dfaa627(var102);
                              var142 = var14;
                              if (var3 < 0) {
                                 break label419;
                              }

                              if (var14 == 0) {
                                 break label418;
                              }
                           }

                           long var187 = 2180641586714077403L;
                           net.minecraft.client.Minecraft var112 = field_43;
                           var112.field_42P.method_46f$da8c82d5d4();
                        }

                        long var188 = 2180073200317154924L;
                        client.setting.BooleanSetting var117 = this.settingGroundPacket;
                        var142 = ((var117.method_49$aae029aa0a()) ? 1 : 0);
                     }

                     if (var142 != 0) {
                        long var189 = 2180641586714077403L;
                        net.minecraft.client.Minecraft var122 = field_43;
                        var122.field_42P.field_49m.method_43$631790539f(new net.C_479E(true));
                     }
               }
            } else if (var138 == 0) {
               long var201 = 2180641586714077403L;
               net.minecraft.client.Minecraft var58 = field_43;
               var10003 = 2180189422667918495L;
               long var61 = var8;
               client.setting.NumberSetting var64 = this.settingCustomMotion;
               var58.field_42P.field_42 = (float)var64.method_44$474dfaa627(var61);
               byte var148 = var14;
               if (var2 >= 0) {
                  if (var14 == 0) {
                     return;
                  }

                  long var202 = 2180641586714077403L;
                  net.minecraft.client.Minecraft var69 = field_43;
                  var148 = ((byte) (var69.field_42P.field_48M ? 1 : 0));
               }

               var180 = var14;
               if (var2 > 0) {
                  if (var14 == 0) {
                     net.minecraft.client.entity.EntityPlayerSP var149;
                     if (var148 != 0) {
                        long var204 = 2180641586714077403L;
                        net.minecraft.client.Minecraft var74 = field_43;
                        var149 = var74.field_42P;
                        if (var3 >= 0) {
                           var74.field_42P.method_46f$da8c82d5d4();
                           return;
                        }
                     } else {
                        long var205 = 2180641586714077403L;
                        net.minecraft.client.Minecraft var79 = field_43;
                        var149 = var79.field_42P;
                     }

                     var10003 = 2180189422667918495L;
                     long var84 = var8;
                     client.setting.NumberSetting var89 = this.settingMotionToJump;
                     double var234;
                     var148 = (byte)((var234 = var149.field_42 - var89.method_44$474dfaa627(var84)) == 0.0 ? 0 : (var234 < 0.0 ? -1 : 1));
                  }

                  var180 = var14;
               }

               if (var180 == 0) {
                  if (var148 >= 0) {
                     return;
                  }

                  long var206 = 2180073200317154924L;
                  client.setting.BooleanSetting var94 = this.settingCustomMotionAtJump;
                  var148 = ((byte) (var94.method_49$aae029aa0a() ? 1 : 0));
               }

               label401: {
                  label400: {
                     if (var148 != 0) {
                        long var207 = 2180641586714077403L;
                        net.minecraft.client.Minecraft var99 = field_43;
                        var10003 = 2180189422667918495L;
                        long var104 = var8;
                        client.setting.NumberSetting var109 = this.settingJumpMotion;
                        var99.field_42P.field_42 = var109.method_44$474dfaa627(var104);
                        var151 = var14;
                        if (var3 < 0) {
                           break label401;
                        }

                        if (var14 == 0) {
                           break label400;
                        }
                     }

                     long var208 = 2180641586714077403L;
                     net.minecraft.client.Minecraft var114 = field_43;
                     var114.field_42P.method_46f$da8c82d5d4();
                  }

                  long var209 = 2180073200317154924L;
                  client.setting.BooleanSetting var119 = this.settingGroundPacket;
                  var151 = ((var119.method_49$aae029aa0a()) ? 1 : 0);
               }

               if (var151 != 0) {
                  long var210 = 2180641586714077403L;
                  net.minecraft.client.Minecraft var124 = field_43;
                  var124.field_42P.field_49m.method_43$631790539f(new net.C_479E(true));
               }
            }
         }
      } else {
         long var211 = 2183342938761000508L;
         long var27 = var12;
         client.setting.ModeSetting var29 = this.settingMode;
         String var15 = var29.method_46$5f9dc63072(var27);
         byte var16 = -1;
         int var125 = var15.hashCode();
         if (var14 == 0) {
            switch (var125) {
               case 0:
                  long var160 = 2180641586714077403L;
                  net.minecraft.client.Minecraft var30 = field_43;
                  var10003 = 2180189422667918495L;
                  long var35 = var8;
                  client.setting.NumberSetting var37 = this.settingCustomMotion;
                  var30.field_42P.field_42 = (float)var37.method_44$474dfaa627(var35);
                  byte var130 = var14;
                  if (var2 >= 0) {
                     if (var14 == 0) {
                        break;
                     }

                     var160 = 2180641586714077403L;
                     net.minecraft.client.Minecraft var65 = field_43;
                     var130 = ((byte) (var65.field_42P.field_48M ? 1 : 0));
                  }

                  byte var162 = var14;
                  if (var2 > 0) {
                     if (var14 == 0) {
                        label549: {
                           if (var130 != 0) {
                              var160 = 2180641586714077403L;
                              net.minecraft.client.Minecraft var70 = field_43;
                              var131 = var70.field_42P;
                              if (var3 < 0) {
                                 break label549;
                              }

                              var70.field_42P.method_46f$da8c82d5d4();
                           }

                           var160 = 2180641586714077403L;
                           net.minecraft.client.Minecraft var75 = field_43;
                           var131 = var75.field_42P;
                        }

                        var10003 = 2180189422667918495L;
                        long var80 = var8;
                        client.setting.NumberSetting var85 = this.settingMotionToJump;
                        double var236;
                        var130 = (byte)((var236 = var131.field_42 - var85.method_44$474dfaa627(var80)) == 0.0 ? 0 : (var236 < 0.0 ? -1 : 1));
                     }

                     var162 = var14;
                  }

                  if (var162 == 0) {
                     if (var130 >= 0) {
                        break;
                     }

                     var160 = 2180073200317154924L;
                     client.setting.BooleanSetting var90 = this.settingCustomMotionAtJump;
                     var130 = ((byte) (var90.method_49$aae029aa0a() ? 1 : 0));
                  }

                  label510: {
                     label509: {
                        if (var130 != 0) {
                           var160 = 2180641586714077403L;
                           net.minecraft.client.Minecraft var95 = field_43;
                           var10003 = 2180189422667918495L;
                           long var100 = var8;
                           client.setting.NumberSetting var105 = this.settingJumpMotion;
                           var95.field_42P.field_42 = var105.method_44$474dfaa627(var100);
                           var133 = var14;
                           if (var3 < 0) {
                              break label510;
                           }

                           if (var14 == 0) {
                              break label509;
                           }
                        }

                        var160 = 2180641586714077403L;
                        net.minecraft.client.Minecraft var110 = field_43;
                        var110.field_42P.method_46f$da8c82d5d4();
                     }

                     var160 = 2180073200317154924L;
                     client.setting.BooleanSetting var115 = this.settingGroundPacket;
                     var133 = ((var115.method_49$aae029aa0a()) ? 1 : 0);
                  }

                  if (var133 != 0) {
                     var160 = 2180641586714077403L;
                     net.minecraft.client.Minecraft var120 = field_43;
                     var120.field_42P.field_49m.method_43$631790539f(new net.C_479E(true));
                  }
                  break;
               case 1:
                  long var10001 = 2180641586714077403L;
                  net.minecraft.client.Minecraft var38 = field_43;
                  byte var126 = ((byte) (var38.field_42P.field_48M ? 1 : 0));
                  byte var152 = var14;
                  if (var2 > 0) {
                     if (var14 == 0) {
                        label532: {
                           if (var38.field_42P.field_48M) {
                              var10001 = 2180641586714077403L;
                              net.minecraft.client.Minecraft var39 = field_43;
                              var127 = var39.field_42P;
                              if (var3 < 0) {
                                 break label532;
                              }

                              var39.field_42P.method_46f$da8c82d5d4();
                           }

                           var10001 = 2180641586714077403L;
                           net.minecraft.client.Minecraft var40 = field_43;
                           var127 = var40.field_42P;
                        }

                        var10003 = 2180189422667918495L;
                        long var41 = var8;
                        client.setting.NumberSetting var43 = this.settingMotionToJump;
                        double var235;
                        var126 = (byte)((var235 = var127.field_42 - var43.method_44$474dfaa627(var41)) == 0.0 ? 0 : (var235 < 0.0 ? -1 : 1));
                     }

                     var152 = var14;
                  }

                  if (var152 == 0) {
                     if (var126 >= 0) {
                        return;
                     }

                     var10001 = 2180073200317154924L;
                     client.setting.BooleanSetting var44 = this.settingCustomMotionAtJump;
                     var126 = ((byte) (var44.method_49$aae029aa0a() ? 1 : 0));
                  }

                  label519: {
                     label518: {
                        if (var126 != 0) {
                           var10001 = 2180641586714077403L;
                           net.minecraft.client.Minecraft var45 = field_43;
                           var10003 = 2180189422667918495L;
                           long var46 = var8;
                           client.setting.NumberSetting var48 = this.settingJumpMotion;
                           var45.field_42P.field_42 = var48.method_44$474dfaa627(var46);
                           var129 = var14;
                           if (var3 < 0) {
                              break label519;
                           }

                           if (var14 == 0) {
                              break label518;
                           }
                        }

                        var10001 = 2180641586714077403L;
                        net.minecraft.client.Minecraft var49 = field_43;
                        var49.field_42P.method_46f$da8c82d5d4();
                     }

                     var10001 = 2180073200317154924L;
                     client.setting.BooleanSetting var50 = this.settingGroundPacket;
                     var129 = ((var50.method_49$aae029aa0a()) ? 1 : 0);
                  }

                  if (var129 != 0) {
                     var10001 = 2180641586714077403L;
                     net.minecraft.client.Minecraft var51 = field_43;
                     var51.field_42P.field_49m.method_43$631790539f(new net.C_479E(true));
                  }
            }
         } else if (var125 == 0) {
            long var170 = 2180641586714077403L;
            net.minecraft.client.Minecraft var34 = field_43;
            var10003 = 2180189422667918495L;
            long var59 = var8;
            client.setting.NumberSetting var62 = this.settingCustomMotion;
            var34.field_42P.field_42 = (float)var62.method_44$474dfaa627(var59);
            byte var134 = var14;
            if (var2 >= 0) {
               if (var14 == 0) {
                  return;
               }

               var170 = 2180641586714077403L;
               net.minecraft.client.Minecraft var66 = field_43;
               var134 = ((byte) (var66.field_42P.field_48M ? 1 : 0));
            }

            byte var172 = var14;
            if (var2 > 0) {
               if (var14 == 0) {
                  label573: {
                     if (var134 != 0) {
                        var170 = 2180641586714077403L;
                        net.minecraft.client.Minecraft var71 = field_43;
                        var135 = var71.field_42P;
                        if (var3 < 0) {
                           break label573;
                        }

                        var71.field_42P.method_46f$da8c82d5d4();
                     }

                     var170 = 2180641586714077403L;
                     net.minecraft.client.Minecraft var76 = field_43;
                     var135 = var76.field_42P;
                  }

                  var10003 = 2180189422667918495L;
                  long var81 = var8;
                  client.setting.NumberSetting var86 = this.settingMotionToJump;
                  double var237;
                  var134 = (byte)((var237 = var135.field_42 - var86.method_44$474dfaa627(var81)) == 0.0 ? 0 : (var237 < 0.0 ? -1 : 1));
               }

               var172 = var14;
            }

            if (var172 == 0) {
               if (var134 >= 0) {
                  return;
               }

               var170 = 2180073200317154924L;
               client.setting.BooleanSetting var91 = this.settingCustomMotionAtJump;
               var134 = ((byte) (var91.method_49$aae029aa0a() ? 1 : 0));
            }

            label501: {
               label500: {
                  if (var134 != 0) {
                     var170 = 2180641586714077403L;
                     net.minecraft.client.Minecraft var96 = field_43;
                     var10003 = 2180189422667918495L;
                     long var101 = var8;
                     client.setting.NumberSetting var106 = this.settingJumpMotion;
                     var96.field_42P.field_42 = var106.method_44$474dfaa627(var101);
                     var137 = var14;
                     if (var3 < 0) {
                        break label501;
                     }

                     if (var14 == 0) {
                        break label500;
                     }
                  }

                  var170 = 2180641586714077403L;
                  net.minecraft.client.Minecraft var111 = field_43;
                  var111.field_42P.method_46f$da8c82d5d4();
               }

               var170 = 2180073200317154924L;
               client.setting.BooleanSetting var116 = this.settingGroundPacket;
               var137 = ((var116.method_49$aae029aa0a()) ? 1 : 0);
            }

            if (var137 != 0) {
               var170 = 2180641586714077403L;
               net.minecraft.client.Minecraft var121 = field_43;
               var121.field_42P.field_49m.method_43$631790539f(new net.C_479E(true));
            }
         }
      }
   }






   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$4(field_43, -7738003683308779600L, var1).field_43 = 1.0F;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   private boolean method_49M$aae029aa0a() {
      long var1 = a ^ 132756149108455L;
      long var3 = var1 ^ 53292433660459L;
      long var10000 = 2295336874487883409L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10002 = 2294478705341429671L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("Verus");
      if (!var5) {
         var9 = !var9;
      }

      return var9;
   }



   private boolean method_49I$aae029aa0a() {
      long var1 = a ^ 12893669607588L;
      long var3 = var1 ^ 74215509257320L;
      long var10002 = 2996251917112426980L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Position");
   }



   private boolean method_49m$aae029aa0a() {
      long var1 = a ^ 40053162932934L;
      long var3 = var1 ^ 119469699784202L;
      long var10002 = -7208296071724436602L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Jump");
   }



   private boolean method_49K$aae029aa0a() {
      long var1 = a ^ 75137710395002L;
      long var3 = var1 ^ 13829576698550L;
      long var10002 = 8019394513300653882L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Position");
   }



   private boolean method_49i$aae029aa0a() {
      long var1 = a ^ 138844903804858L;
      long var3 = var1 ^ 59936111569782L;
      long var10002 = 7965362248390706938L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Jump");
   }



   private boolean method_49t$0dd78e0064(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$5(3743653342044228669L, var1);
      boolean var10000 = recovery$indy$6(field_43, 3743922545216275821L, var1).field_48d;
      if (var3) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$7(field_43, 3743922545216275821L, var1).method_49W$aae029aa0a();
      }

      boolean var10001 = var3;
      if (var1 > 0L) {
         if (var3) {
            if (var10000) {
               return false;
            }

            var10000 = recovery$indy$8(field_43, 3743922545216275821L, var1).method_48H$aae029aa0a();
         }

         var10001 = var3;
      }

      if (var1 >= 0L) {
         if (var10001) {
            if (var10000) {
               return false;
            }

            var10000 = recovery$indy$9(field_43, 3743922545216275821L, var1).method_48p$aae029aa0a();
         }

         var10001 = var3;
      }

      return !var10001 ? var10000 : !var10000;
   }



    public Spider_47kl(long a0,char a1) {
        super((java.lang.String) ("Spider"),(java.lang.String) ("Spinne"),(long) (((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 28958008748771L)),(java.awt.Color) (new java.awt.Color((int) (168),(int) (127),(int) (50))),(client.module.Category) (client.module.Category.MOVEMENT));
        long constructorKey1 = (((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a);
        int constructorPart2 = (int) ((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 32294224906249L) >>> 48));
        int constructorPart3 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 32294224906249L) << 16) >>> 48));
        int constructorPart4 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 32294224906249L) << 32) >>> 32));
        long constructorKey5 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 108453572830149L);
        int constructorPart6 = (int) ((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 100566489068868L) >>> 32));
        int constructorPart7 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 100566489068868L) << 32) >>> 48));
        int constructorPart8 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 100566489068868L) << 48) >>> 48));
        long constructorKey9 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 90032693828142L);
        long constructorKey10 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 32769286844274L);
        int constructorPart11 = (int) ((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 137995415467861L) >>> 32));
        int constructorPart12 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 137995415467861L) << 32) >>> 48));
        int constructorPart13 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 137995415467861L) << 48) >>> 48));
        long constructorKey14 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 77150483499391L);
        long constructorKey15 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.movement.Spider_47kl.a) ^ 101862062330441L);
        java.lang.Object initialValue16 = recovery$indy$flow$229(4);
        ((java.lang.Object[]) initialValue16)[0] = "Motion";
        ((java.lang.Object[]) initialValue16)[1] = "Jump";
        ((java.lang.Object[]) initialValue16)[2] = "Position";
        ((java.lang.Object[]) initialValue16)[3] = "Verus";
        client.setting.ModeSetting initialized17 = new client.setting.ModeSetting(this, "Mode", constructorKey9, "Jump", (java.lang.String[]) (initialValue16));
        recovery$indy$flow$231(this, initialized17);
        client.setting.SettingGroup initialized18 = new client.setting.SettingGroup(this, "ModeValues", true, constructorKey10);
        java.lang.Object initialValue19 = recovery$indy$flow$234(this);
        char converted20 = (char) (constructorPart12);
        java.lang.Object initialValue21 = initialValue19;
        int initialValue22 = constructorPart13;
        int initialValue23 = (int) (converted20);
        int initialValue24 = constructorPart11;
        client.setting.SettingGroup initialValue25 = initialized18;
        java.lang.Object initialValue26 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue27 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue21))))));
        java.lang.Object initialValue28 = recovery$indy$flow$237(initialValue26, initialValue24, (char) (initialValue23), initialValue22, initialValue27);
        recovery$indy$flow$238(this, initialValue28);
        java.lang.Object initialValue29 = ((java.lang.Object)(((augustus.recovered.modules.movement.Spider_47kl) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized30 = new client.setting.NumberSetting(this, "CustomMotion", Double.longBitsToDouble(4599075939470750515L), 0.0D, Double.longBitsToDouble(4611686018427387904L), 3, (client.setting.SettingGroup) (initialValue29), constructorKey15);
        java.lang.Object initialValue31 = recovery$indy$flow$242(this);
        java.lang.Object initialValue32 = initialValue31;
        client.setting.NumberSetting initialValue33 = initialized30;
        java.lang.Object initialValue34 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue33))))));
        java.lang.Object initialValue35 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue32))))));
        java.lang.Object initialValue36 = recovery$indy$flow$245(initialValue34, initialValue35);
        recovery$indy$flow$246(this, initialValue36);
        java.lang.Object initialValue37 = ((java.lang.Object)(((augustus.recovered.modules.movement.Spider_47kl) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized38 = new client.setting.NumberSetting(this, "TickDelay", 0.0D, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue37), constructorKey15);
        java.lang.Object initialValue39 = recovery$indy$flow$250(this);
        java.lang.Object initialValue40 = initialValue39;
        client.setting.NumberSetting initialValue41 = initialized38;
        java.lang.Object initialValue42 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue41))))));
        java.lang.Object initialValue43 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue44 = recovery$indy$flow$253(initialValue42, initialValue43);
        recovery$indy$flow$254(this, initialValue44);
        java.lang.Object initialValue45 = ((java.lang.Object)(((augustus.recovered.modules.movement.Spider_47kl) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized46 = new client.setting.NumberSetting(this, "MotionToJump", Double.longBitsToDouble(-4626998257160447590L), Double.longBitsToDouble(-4622134369562887455L), Double.longBitsToDouble(4601237667291888353L), 2, (client.setting.SettingGroup) (initialValue45), constructorKey15);
        java.lang.Object initialValue47 = recovery$indy$flow$258(this);
        java.lang.Object initialValue48 = initialValue47;
        client.setting.NumberSetting initialValue49 = initialized46;
        java.lang.Object initialValue50 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue51 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue48))))));
        java.lang.Object initialValue52 = recovery$indy$flow$261(initialValue50, initialValue51);
        recovery$indy$flow$262(this, initialValue52);
        short converted53 = (short) (constructorPart2);
        char converted54 = (char) (constructorPart3);
        java.lang.Object initialValue55 = ((java.lang.Object)(((augustus.recovered.modules.movement.Spider_47kl) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.BooleanSetting initialized56 = new client.setting.BooleanSetting(this, "CustomMotionAtJump", converted53, converted54, constructorPart4, false, (client.setting.SettingGroup) (initialValue55));
        java.lang.Object initialValue57 = recovery$indy$flow$266(this);
        java.lang.Object initialValue58 = initialValue57;
        long initialValue59 = constructorKey5;
        client.setting.BooleanSetting initialValue60 = initialized56;
        java.lang.Object initialValue61 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue62 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue58))))));
        java.lang.Object initialValue63 = recovery$indy$flow$269(initialValue61, initialValue59, initialValue62);
        java.lang.Object initialValue64 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue63))))));
        recovery$indy$flow$271(this, initialValue64);
        java.lang.Object initialValue65 = ((java.lang.Object)(((augustus.recovered.modules.movement.Spider_47kl) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized66 = new client.setting.NumberSetting(this, "JumpMotion", Double.longBitsToDouble(4601237667291888353L), 0.0D, Double.longBitsToDouble(4611686018427387904L), 3, (client.setting.SettingGroup) (initialValue65), constructorKey15);
        java.lang.Object initialValue67 = recovery$indy$flow$275(this);
        java.lang.Object initialValue68 = initialValue67;
        client.setting.NumberSetting initialValue69 = initialized66;
        java.lang.Object initialValue70 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue69))))));
        java.lang.Object initialValue71 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue68))))));
        java.lang.Object initialValue72 = recovery$indy$flow$278(initialValue70, initialValue71);
        recovery$indy$flow$279(this, initialValue72);
        short converted73 = (short) (constructorPart2);
        char converted74 = (char) (constructorPart3);
        java.lang.Object initialValue75 = ((java.lang.Object)(((augustus.recovered.modules.movement.Spider_47kl) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.BooleanSetting initialized76 = new client.setting.BooleanSetting(this, "GroundPacket", converted73, converted74, constructorPart4, false, (client.setting.SettingGroup) (initialValue75));
        java.lang.Object initialValue77 = recovery$indy$flow$283(this);
        java.lang.Object initialValue78 = initialValue77;
        long initialValue79 = constructorKey5;
        client.setting.BooleanSetting initialValue80 = initialized76;
        java.lang.Object initialValue81 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue80))))));
        java.lang.Object initialValue82 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue78))))));
        java.lang.Object initialValue83 = recovery$indy$flow$286(initialValue81, initialValue79, initialValue82);
        java.lang.Object initialValue84 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue83))))));
        recovery$indy$flow$288(this, initialValue84);
        java.lang.Object initialValue85 = ((java.lang.Object)(((augustus.recovered.modules.movement.Spider_47kl) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized86 = new client.setting.NumberSetting(this, "PositionSpeed", Double.longBitsToDouble(4600877379321698714L), Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4611686018427387904L), 3, (client.setting.SettingGroup) (initialValue85), constructorKey15);
        short converted87 = (short) (constructorPart8);
        int initialValue88 = (int) (converted87);
        int initialValue89 = constructorPart7;
        java.lang.String initialValue90 = "Speed";
        int initialValue91 = constructorPart6;
        client.setting.NumberSetting initialValue92 = initialized86;
        java.lang.Object initialValue93 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue92))))));
        java.lang.Object initialValue94 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue90))))));
        java.lang.Object initialValue95 = recovery$indy$flow$294(initialValue93, initialValue91, initialValue94, initialValue89, (short) (initialValue88));
        java.lang.Object initialValue96 = recovery$indy$flow$295(this);
        java.lang.Object initialValue97 = initialValue96;
        java.lang.Object initialValue98 = initialValue95;
        java.lang.Object initialValue99 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue98))))));
        java.lang.Object initialValue100 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue97))))));
        java.lang.Object initialValue101 = recovery$indy$flow$298(initialValue99, initialValue100);
        recovery$indy$flow$299(this, initialValue101);
        java.lang.Object initialValue102 = ((java.lang.Object)(((augustus.recovered.modules.movement.Spider_47kl) (((java.lang.Object)(this)))).settingModeValues));
        client.setting.NumberSetting initialized103 = new client.setting.NumberSetting(this, "TickDelayPosition", 0.0D, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue102), constructorKey15);
        short converted104 = (short) (constructorPart8);
        int initialValue105 = (int) (converted104);
        int initialValue106 = constructorPart7;
        java.lang.String initialValue107 = "TickDelay";
        int initialValue108 = constructorPart6;
        client.setting.NumberSetting initialValue109 = initialized103;
        java.lang.Object initialValue110 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue109))))));
        java.lang.Object initialValue111 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue107))))));
        java.lang.Object initialValue112 = recovery$indy$flow$305(initialValue110, initialValue108, initialValue111, initialValue106, (short) (initialValue105));
        java.lang.Object initialValue113 = recovery$indy$flow$306(this);
        java.lang.Object initialValue114 = initialValue113;
        java.lang.Object initialValue115 = initialValue112;
        java.lang.Object initialValue116 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue115))))));
        java.lang.Object initialValue117 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue114))))));
        java.lang.Object initialValue118 = recovery$indy$flow$309(initialValue116, initialValue117);
        recovery$indy$flow$310(this, initialValue118);
        client.setting.NumberSetting initialized119 = new client.setting.NumberSetting(this, "Timer", 1.0D, constructorKey14, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4611686018427387904L), 2);
        recovery$indy$flow$313(this, initialized119);
    }





    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);
    private static native java.lang.Object recovery$indy$flow$229(int a0);
    private static void recovery$indy$flow$231(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.Spider_47kl) (a0)).settingMode = ((client.setting.ModeSetting) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$234(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$237(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);
    private static native void recovery$indy$flow$238(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$242(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$245(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$246(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$250(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$253(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$254(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$258(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$261(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$262(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$266(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$269(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$271(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$275(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$278(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$279(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$283(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$286(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$288(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$294(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$295(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$298(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$299(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$305(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$306(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$309(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$310(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$313(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native MethodHandle recovery$constant$1();
   private static native void recovery$indy$2(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$3(Object var0, int var1, long var2, long var4, long var6);
   private static native C_40X recovery$indy$4(Object var0, long var1, long var3);
   private static native boolean recovery$indy$5(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
}
