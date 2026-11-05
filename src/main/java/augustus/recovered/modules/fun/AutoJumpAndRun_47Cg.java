package augustus.recovered.modules.fun;
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
import net.C_45z;
import net.C_472n;
import net.C_474i;
import net.C_475y;
import net.C_477r;
import net.C_478Q;
import client.module.Module;
import net.C_47S6;
import client.setting.ModeSetting;
import net.C_47cu;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoJumpAndRun_47Cg extends client.module.Module implements net.C_47xz,net.C_47hi {
    public final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_478Q field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_478Q field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private C_478Q method_40$0b0306d3ca(long var1, C_478Q var3) {
      java.lang.String[] var14;
      java.lang.String[] var16;
      var1 = a ^ var1;
      long var4 = var1 ^ 54416535495345L;
      String[] var6 = recovery$indy$1(-6159232440601538917L, var1);
      int var7 = -6;

      label92:
      while (true) {
         int var10000 = var7;

         label90:
         while (var10000 <= 6) {
            int var8 = 0;

            label87:
            while (true) {
               var10000 = var8;

               label84:
               while (var10000 <= 1) {
                  var10000 = -6;
                  if (var6 == null) {
                     continue label90;
                  }

                  int var9 = -6;

                  while (var9 <= 6) {
                     var10000 = (int) ((recovery$indy$2(var7, var8, var4, var9, -6158942970770295028L, var1)) ? 1 : 0);
                     if (var6 == null) {
                        continue label84;
                     }

                     label78: {
                        label77: {
                           label76:
                           if (var10000 != 0) {
                              C_475y var10 = recovery$indy$3(field_43, -6158569844198031151L, var1)
                                 .method_49$0bfd666c6c(var7, var8, var9)
                                 .method_48$e084f7739d();
                              C_475y var11 = recovery$indy$4(field_43, -6158569844198031151L, var1)
                                 .method_49$0bfd666c6c(var7, var8 + 1, var9)
                                 .method_48$e084f7739d();
                              var14 = var6;
                              if (var1 < 0L) {
                                 break label78;
                              }

                              if (var6 == null) {
                                 break label77;
                              }

                              boolean var15 = var10.equals(C_45z.field_41T);
                              if (var1 > 0L) {
                                 if (!var15) {
                                    break label76;
                                 }

                                 var15 = var11.method_43$aae029aa0a();
                              }

                              if (!var15) {
                                 return var3.method_46$46079ffcd3(var7, var8, var9);
                              }
                           }

                           var9++;
                        }

                        var14 = var6;
                     }

                     if (var14 == null) {
                        break;
                     }
                  }

                  var8++;
                  var16 = var6;
                  if (var1 <= 0L) {
                     break label87;
                  }

                  if (var6 != null) {
                     continue label87;
                  }
                  break;
               }

               var7++;
               if (var1 <= 0L) {
                  return null;
               }

               var16 = var6;
               break;
            }

            if (var16 == null) {
               return null;
            }
            continue label92;
         }

         return null;
      }
   }




   public void method_47$05bd94f678(net.C_472n var1, long var2) {
        java.lang.String[] var140;
        java.lang.String[] var150;
      long var4 = var2 ^ 41445319727108L;
      long var6 = var2 ^ 77412314636080L;
      long var10000 = 6399450125223918802L;
      String[] var8 = MLG_47CP.method_46$44c5829186();
      if (var8 == null) {
         long var176 = 6395539862250872332L;
         net.minecraft.client.Minecraft var81 = field_43;
         if (var81.field_42P != null && this.field_46 != null) {
            long var224 = 6399226429698163167L;
            long var82 = var6;
            long var83 = 2000L;
            net.C_47cu var84 = this.field_49;
            if (!var84.method_42$b0e346e6e3(var83, var82)) {
               long var205 = 6395319582777120544L;
               float var134 = 1.0F;
               net.C_472n var135 = var1;
               var135.method_45$24a796ab4c(var134);
               var205 = 6395373259969279777L;
               boolean var136 = true;
               net.C_472n var137 = var1;
               var137.method_43$f633c984d8(var136);
            }
         }
      } else {
         long var10001 = 6395532021018639760L;
         net.minecraft.client.Minecraft var28 = field_43;
         if (var28.method_44$aae029aa0a()) {
            var10001 = 6395539862250872332L;
            net.minecraft.client.Minecraft var29 = field_43;
            if (var29.field_42P != null && this.field_46 != null && this.field_48 != null) {
               long var10003 = 6399226429698163167L;
               long var30 = var6;
               long var32 = 2000L;
               net.C_47cu var34 = this.field_49;
               if (var34.method_42$b0e346e6e3(var32, var30)) {
                  var10001 = 6395452435150287512L;
                  net.minecraft.client.Minecraft var35 = field_43;
                  long var10004 = 6395539862250872332L;
                  net.minecraft.client.Minecraft var36 = field_43;
                  long var10005 = 6395539862250872332L;
                  net.minecraft.client.Minecraft var37 = field_43;
                  double var225 = var37.field_42P.field_48j - 1.0;
                  long var10006 = 6395539862250872332L;
                  net.minecraft.client.Minecraft var38 = field_43;
                  net.C_475y var9 = var35.field_44Q
                     .method_46$efbf73d2b1(new net.C_478Q(var36.field_42P.field_48Q, var225, var38.field_42P.field_42o))
                     .method_48$e084f7739d();
                  double var10 = 1.29;
                  double var12 = 0.29;
                  var10001 = 6395539862250872332L;
                  net.minecraft.client.Minecraft var39 = field_43;
                  double var14 = var39.field_42P.field_48Q;
                  var10001 = 6395539862250872332L;
                  net.minecraft.client.Minecraft var40 = field_43;
                  double var16 = var40.field_42P.field_42o;
                  long var178 = 6395539862250872332L;
                  net.minecraft.client.Minecraft var41 = field_43;
                  var10003 = 6395539862250872332L;
                  net.minecraft.client.Minecraft var42 = field_43;
                  var14 += (var41.field_42P.field_48Q - var42.field_42P.field_48a) * 0.0;
                  var178 = 6395539862250872332L;
                  net.minecraft.client.Minecraft var43 = field_43;
                  var10003 = 6395539862250872332L;
                  net.minecraft.client.Minecraft var44 = field_43;
                  var16 += (var43.field_42P.field_42o - var44.field_42P.field_48q) * 0.0;
                  double var18 = this.field_48.method_40$8abf5c6871() + var10;
                  double var20 = this.field_48.method_40$8abf5c6871() - var12;
                  double var22 = this.field_48.method_47$8abf5c6871() + var10;
                  double var24 = this.field_48.method_47$8abf5c6871() - var12;
                  var10001 = 6395539862250872332L;
                  net.minecraft.client.Minecraft var45 = field_43;
                  double var240;
                  int var138 = (
                           var240 = var45.field_42P
                                 .method_49$4b58f7ab41(
                                    this.field_46.method_40$8abf5c6871(), this.field_46.method_43$8abf5c6871(), this.field_46.method_47$8abf5c6871()
                                 )
                              - 2.6
                        )
                        == 0.0
                     ? 0
                     : (var240 < 0.0 ? -1 : 1);
                  if (var2 >= 0L) {
                     label630: {
                        label631: {
                           if (var8 != null) {
                              if (var138 > 0) {
                                 double var241;
                                 int var144 = (var241 = var14 - var18) == 0.0 ? 0 : (var241 < 0.0 ? -1 : 1);
                                 if (var2 <= 0L) {
                                    label466: {
                                       label465: {
                                          label601: {
                                             long var242;
                                             int var199 = (var242 = var2 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
                                             long var243;
                                             int var200 = (var243 = var2 - 0L) == 0L ? 0 : (var243 < 0L ? -1 : 1);
                                             if (var8 != null) {
                                                if (var144 > 0) {
                                                   break label601;
                                                }

                                                double var244;
                                                var144 = (var244 = var16 - var24) == 0.0 ? 0 : (var244 < 0.0 ? -1 : 1);
                                             }

                                             if (var8 == null) {
                                                break label466;
                                             }

                                             if (var144 >= 0) {
                                                var178 = 6395319582777120544L;
                                                float var91 = 1.0F;
                                                net.C_472n var94 = var1;
                                                var94.method_45$24a796ab4c(var91);
                                                break label465;
                                             }
                                          }

                                          var178 = 6395247988967785597L;
                                          boolean var85 = true;
                                          net.C_472n var86 = var1;
                                          var86.method_47$f633c984d8(var85);
                                          long var245;
                                          int var148 = (var245 = var2 - 0L) == 0L ? 0 : (var245 < 0L ? -1 : 1);
                                       }

                                       var144 = 1;
                                    }

                                    int var76 = var144;

                                    while (true) {
                                       if (var76 >= 4) {
                                          break label630;
                                       }

                                       var10003 = 6395539862250872332L;
                                       net.minecraft.client.Minecraft var100 = field_43;
                                       var10004 = 6395539862250872332L;
                                       net.minecraft.client.Minecraft var106 = field_43;
                                       double var223 = var106.field_42P.field_48j - var76;
                                       var10005 = 6395539862250872332L;
                                       net.minecraft.client.Minecraft var112 = field_43;
                                       net.C_478Q var80 = new net.C_478Q(var100.field_42P.field_48Q, var223, var112.field_42P.field_42o);
                                       long var246;
                                       int var173 = (var246 = var2 - 0L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
                                       if (var8 == null) {
                                          return;
                                       }

                                       label450: {
                                          if (var8 != null) {
                                             var178 = 6396220524684194637L;
                                             net.C_478Q var117 = var80;
                                             long var122 = var4;
                                             boolean var149 = net.C_474i.method_42$133d77006a(var122, var117);
                                             long var247;
                                             int var174 = (var247 = var2 - 0L) == 0L ? 0 : (var247 < 0L ? -1 : 1);
                                             if (var149) {
                                                var178 = 6395319582777120544L;
                                                float var126 = -1.0F;
                                                net.C_472n var130 = var1;
                                                var130.method_45$24a796ab4c(var126);
                                                var150 = var8;
                                                long var248;
                                                int var175 = (var248 = var2 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                                                break label450;
                                             }

                                             var76++;
                                          }

                                          var150 = var8;
                                       }

                                       if (var150 == null) {
                                          break label630;
                                       }
                                    }
                                 }

                                 label531: {
                                    label530: {
                                       label603: {
                                          if (var8 != null) {
                                             if (var144 > 0) {
                                                break label603;
                                             }

                                             double var249;
                                             var144 = (var249 = var14 - var20) == 0.0 ? 0 : (var249 < 0.0 ? -1 : 1);
                                          }

                                          long var250;
                                          int var192 = (var250 = var2 - 0L) == 0L ? 0 : (var250 < 0L ? -1 : 1);
                                          if (var8 != null) {
                                             if (var144 < 0) {
                                                break label603;
                                             }

                                             double var251;
                                             var144 = (var251 = var16 - var22) == 0.0 ? 0 : (var251 < 0.0 ? -1 : 1);
                                          }

                                          long var252;
                                          int var193 = (var252 = var2 - 0L) == 0L ? 0 : (var252 < 0L ? -1 : 1);
                                          if (var8 != null) {
                                             if (var144 > 0) {
                                                break label603;
                                             }

                                             double var253;
                                             var144 = (var253 = var16 - var24) == 0.0 ? 0 : (var253 < 0.0 ? -1 : 1);
                                          }

                                          if (var8 == null) {
                                             break label531;
                                          }

                                          if (var144 >= 0) {
                                             break label530;
                                          }
                                       }

                                       var178 = 6395247988967785597L;
                                       boolean var46 = true;
                                       net.C_472n var47 = var1;
                                       var47.method_47$f633c984d8(var46);
                                       long var254;
                                       int var145 = (var254 = var2 - 0L) == 0L ? 0 : (var254 < 0L ? -1 : 1);
                                    }

                                    var178 = 6395319582777120544L;
                                    float var90 = 1.0F;
                                    net.C_472n var93 = var1;
                                    var93.method_45$24a796ab4c(var90);
                                    var144 = 1;
                                 }

                                 int var75 = var144;

                                 while (true) {
                                    if (var75 >= 4) {
                                       break label631;
                                    }

                                    var10003 = 6395539862250872332L;
                                    net.minecraft.client.Minecraft var99 = field_43;
                                    var10004 = 6395539862250872332L;
                                    net.minecraft.client.Minecraft var105 = field_43;
                                    double var221 = var105.field_42P.field_48j - var75;
                                    var10005 = 6395539862250872332L;
                                    net.minecraft.client.Minecraft var111 = field_43;
                                    net.C_478Q var79 = new net.C_478Q(var99.field_42P.field_48Q, var221, var111.field_42P.field_42o);
                                    long var255;
                                    int var169 = (var255 = var2 - 0L) == 0L ? 0 : (var255 < 0L ? -1 : 1);
                                    if (var8 == null) {
                                       return;
                                    }

                                    label505:
                                    if (var8 != null) {
                                       var178 = 6396220524684194637L;
                                       net.C_478Q var116 = var79;
                                       long var121 = var4;
                                       boolean var146 = net.C_474i.method_42$133d77006a(var121, var116);
                                       long var256;
                                       int var170 = (var256 = var2 - 0L) == 0L ? 0 : (var256 < 0L ? -1 : 1);
                                       if (var146 && var79.method_40$91754b766b(this.field_46)) {
                                          var178 = 6395319582777120544L;
                                          float var125 = -1.0F;
                                          net.C_472n var129 = var1;
                                          var129.method_45$24a796ab4c(var125);
                                          long var257;
                                          int var171 = (var257 = var2 - 0L) == 0L ? 0 : (var257 < 0L ? -1 : 1);
                                          if (var8 == null) {
                                             break label505;
                                          }

                                          var10001 = 6395539862250872332L;
                                          net.minecraft.client.Minecraft var131 = field_43;
                                          if (var131.field_42P.field_48M) {
                                             var178 = 6395373259969279777L;
                                             boolean var132 = true;
                                             net.C_472n var133 = var1;
                                             var133.method_43$f633c984d8(var132);
                                          }
                                       }

                                       var75++;
                                    }

                                    if (var8 == null) {
                                       break label631;
                                    }
                                 }
                              }

                              var138 = ((int) (var9.method_43$aae029aa0a() ? 1 : 0));
                           }

                           if (var8 != null) {
                              if (var138 == 0) {
                                 var178 = 6395247988967785597L;
                                 boolean var87 = true;
                                 net.C_472n var88 = var1;
                                 var88.method_47$f633c984d8(var87);
                              }

                              var178 = 6395319582777120544L;
                              float var89 = 1.0F;
                              net.C_472n var92 = var1;
                              var92.method_45$24a796ab4c(var89);
                              var138 = 1;
                           }

                           int var74 = var138;

                           while (var74 < 4) {
                              var10003 = 6395539862250872332L;
                              net.minecraft.client.Minecraft var95 = field_43;
                              var10004 = 6395539862250872332L;
                              net.minecraft.client.Minecraft var101 = field_43;
                              double var213 = var101.field_42P.field_48j - var74;
                              var10005 = 6395539862250872332L;
                              net.minecraft.client.Minecraft var107 = field_43;
                              net.C_478Q var77 = new net.C_478Q(var95.field_42P.field_48Q, var213, var107.field_42P.field_42o);
                              long var258;
                              int var160 = (var258 = var2 - 0L) == 0L ? 0 : (var258 < 0L ? -1 : 1);
                              if (var8 == null) {
                                 return;
                              }

                              if (var8 != null) {
                                 var178 = 6396220524684194637L;
                                 net.C_478Q var113 = var77;
                                 long var118 = var4;
                                 boolean var142 = net.C_474i.method_42$133d77006a(var118, var113);
                                 if (var2 <= 0L) {
                                    while (true) {
                                       if (var142) {
                                          var178 = 6395319582777120544L;
                                          float var124 = -1.0F;
                                          net.C_472n var128 = var1;
                                          var128.method_45$24a796ab4c(var124);
                                          String[] var143 = var8;
                                          long var259;
                                          int var166 = (var259 = var2 - 0L) == 0L ? 0 : (var259 < 0L ? -1 : 1);

                                          while (true) {
                                             if (var143 == null || var74 >= 4) {
                                                break label630;
                                             }

                                             var10003 = 6395539862250872332L;
                                             var95 = field_43;
                                             var10004 = 6395539862250872332L;
                                             var101 = field_43;
                                             double var219 = var101.field_42P.field_48j - var74;
                                             var10005 = 6395539862250872332L;
                                             var107 = field_43;
                                             var77 = new net.C_478Q(var95.field_42P.field_48Q, var219, var107.field_42P.field_42o);
                                             long var260;
                                             int var167 = (var260 = var2 - 0L) == 0L ? 0 : (var260 < 0L ? -1 : 1);
                                             if (var8 == null) {
                                                return;
                                             }

                                             if (var8 != null) {
                                                break;
                                             }

                                             var143 = var8;
                                          }
                                       } else {
                                          var74++;

                                          do {
                                             if (var8 == null || var74 >= 4) {
                                                break label630;
                                             }

                                             var10003 = 6395539862250872332L;
                                             var95 = field_43;
                                             var10004 = 6395539862250872332L;
                                             var101 = field_43;
                                             double var217 = var101.field_42P.field_48j - var74;
                                             var10005 = 6395539862250872332L;
                                             var107 = field_43;
                                             var77 = new net.C_478Q(var95.field_42P.field_48Q, var217, var107.field_42P.field_42o);
                                             long var261;
                                             int var165 = (var261 = var2 - 0L) == 0L ? 0 : (var261 < 0L ? -1 : 1);
                                             if (var8 == null) {
                                                return;
                                             }
                                          } while (var8 == null);
                                       }

                                       var178 = 6396220524684194637L;
                                       var113 = var77;
                                       var118 = var4;
                                       var142 = net.C_474i.method_42$133d77006a(var118, var113);
                                       long var262;
                                       int var168 = (var262 = var2 - 0L) == 0L ? 0 : (var262 < 0L ? -1 : 1);
                                    }
                                 }

                                 while (true) {
                                    label544: {
                                       if (var142 && var77.method_40$91754b766b(this.field_46)) {
                                          var178 = 6395319582777120544L;
                                          float var123 = -1.0F;
                                          net.C_472n var127 = var1;
                                          var127.method_45$24a796ab4c(var123);
                                          long var263;
                                          int var161 = (var263 = var2 - 0L) == 0L ? 0 : (var263 < 0L ? -1 : 1);
                                          if (var8 == null) {
                                             break label544;
                                          }

                                          var10001 = 6395539862250872332L;
                                          net.minecraft.client.Minecraft var60 = field_43;
                                          if (var60.field_42P.field_48M) {
                                             var178 = 6395373259969279777L;
                                             boolean var61 = true;
                                             net.C_472n var62 = var1;
                                             var62.method_43$f633c984d8(var61);
                                          }
                                       }

                                       var74++;
                                    }

                                    do {
                                       if (var8 == null || var74 >= 4) {
                                          break label631;
                                       }

                                       var10003 = 6395539862250872332L;
                                       var95 = field_43;
                                       var10004 = 6395539862250872332L;
                                       var101 = field_43;
                                       double var215 = var101.field_42P.field_48j - var74;
                                       var10005 = 6395539862250872332L;
                                       var107 = field_43;
                                       var77 = new net.C_478Q(var95.field_42P.field_48Q, var215, var107.field_42P.field_42o);
                                       long var264;
                                       int var163 = (var264 = var2 - 0L) == 0L ? 0 : (var264 < 0L ? -1 : 1);
                                       if (var8 == null) {
                                          return;
                                       }
                                    } while (var8 == null);

                                    var178 = 6396220524684194637L;
                                    var113 = var77;
                                    var118 = var4;
                                    var142 = net.C_474i.method_42$133d77006a(var118, var113);
                                    long var265;
                                    int var164 = (var265 = var2 - 0L) == 0L ? 0 : (var265 < 0L ? -1 : 1);
                                 }
                              }

                              if (var8 == null) {
                                 break;
                              }
                           }

                           if (var2 <= 0L) {
                              return;
                           }

                           return;
                        }

                        long var266;
                        int var147 = (var266 = var2 - 0L) == 0L ? 0 : (var266 < 0L ? -1 : 1);
                        return;
                     }

                     long var267;
                     int var151 = (var267 = var2 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                     return;
                  }

                  if (var8 != null) {
                     if (var138 == 0) {
                        var178 = 6395247988967785597L;
                        boolean var48 = true;
                        net.C_472n var49 = var1;
                        var49.method_47$f633c984d8(var48);
                     }

                     var178 = 6395319582777120544L;
                     float var50 = 1.0F;
                     net.C_472n var51 = var1;
                     var51.method_45$24a796ab4c(var50);
                     var138 = 1;
                  }

                  int var26 = var138;

                  while (var26 < 4) {
                     label582: {
                        var10003 = 6395539862250872332L;
                        net.minecraft.client.Minecraft var52 = field_43;
                        var10004 = 6395539862250872332L;
                        net.minecraft.client.Minecraft var53 = field_43;
                        double var211 = var53.field_42P.field_48j - var26;
                        var10005 = 6395539862250872332L;
                        net.minecraft.client.Minecraft var54 = field_43;
                        net.C_478Q var27 = new net.C_478Q(var52.field_42P.field_48Q, var211, var54.field_42P.field_42o);
                        long var268;
                        int var157 = (var268 = var2 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                        if (var8 != null) {
                           var178 = 6396220524684194637L;
                           net.C_478Q var55 = var27;
                           long var56 = var4;
                           boolean var139 = net.C_474i.method_42$133d77006a(var56, var55);
                           long var269;
                           int var158 = (var269 = var2 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                           if (var139) {
                              var178 = 6395319582777120544L;
                              float var58 = -1.0F;
                              net.C_472n var59 = var1;
                              var59.method_45$24a796ab4c(var58);
                              var140 = var8;
                              long var270;
                              int var159 = (var270 = var2 - 0L) == 0L ? 0 : (var270 < 0L ? -1 : 1);
                              break label582;
                           }

                           var26++;
                        }

                        var140 = var8;
                     }

                     if (var140 == null) {
                        break;
                     }
                  }

                  long var271;
                  int var141 = (var271 = var2 - 0L) == 0L ? 0 : (var271 < 0L ? -1 : 1);
                  return;
               }

               var10003 = 6399226429698163167L;
               long var63 = var6;
               long var65 = 1000L;
               net.C_47cu var67 = this.field_49;
               if (!var67.method_42$b0e346e6e3(var65, var63)) {
                  long var10002 = 6395319582777120544L;
                  float var68 = 1.0F;
                  net.C_472n var69 = var1;
                  var69.method_45$24a796ab4c(var68);
                  var10002 = 6395373259969279777L;
                  boolean var70 = true;
                  net.C_472n var71 = var1;
                  var71.method_43$f633c984d8(var70);
               }
            }
         }
      }
   }







   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$5(this, 40, var3, -7099718057933546827L, var1);
      recovery$indy$6(this, 21, var3, -7099718057933546827L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      recovery$indy$7(this.field_49, 2732484791204254516L, var4);
   }



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 30086166872092L;
      long var3 = var1 ^ 81635458793337L;
      long var5 = var1 ^ 35903538834067L;
      long var7 = var1 ^ 28657421075362L;
      long var9 = var1 ^ 26741507650058L;
      long var10000 = -4297219593876250560L;
      String[] var11 = MLG_47CP.method_46$44c5829186();
      long var10001 = -4299853624412683618L;
      Minecraft var15 = field_43;
      if (var15.field_42P.field_48M) {
         long var10003 = -4299853624412683618L;
         Minecraft var16 = field_43;
         long var10004 = -4299853624412683618L;
         Minecraft var17 = field_43;
         double var91 = var17.field_42P.field_48j - 0.5;
         long var10005 = -4299853624412683618L;
         Minecraft var18 = field_43;
         C_478Q var12 = new C_478Q(var16.field_42P.field_48Q, var91, var18.field_42P.field_42o);
         var10001 = -4299976201584333302L;
         Minecraft var19 = field_43;
         C_475y var13 = var19.field_44Q.method_46$efbf73d2b1(var12).method_48$e084f7739d();
         this.field_48 = var13.method_43$aae029aa0a() ? var12 : this.field_48;
         AutoJumpAndRun_47Cg var79 = this;
         if (var11 != null) {
            if (this.field_48 == null) {
               return;
            }

            var79 = this;
         }

         if (var11 != null) {
            if (var79.field_43a) {
               var10001 = -4299914037235682676L;
               C_47cu var20 = this.field_49;
               var20.method_46$da8c82d5d4();
            }

            var10005 = -4299853624412683618L;
            Minecraft var21 = field_43;
            long var10006 = -4299853624412683618L;
            Minecraft var22 = field_43;
            double var100 = var22.field_42P.field_48j - 0.5;
            long var10007 = -4299853624412683618L;
            Minecraft var23 = field_43;
            C_478Q var92 = new C_478Q(var21.field_42P.field_48Q, var100, var23.field_42P.field_42o);
            var10004 = -4297356710742361858L;
            C_478Q var24 = var92;
            long var25 = var5;
            AutoJumpAndRun_47Cg var27 = this;
            this.field_46 = var27.method_40$0b0306d3ca(var25, var24);
            var79 = this;
         }

         label66: {
            label76: {
               if (var11 != null) {
                  if (var79.field_46 == null) {
                     break label76;
                  }

                  var79 = this;
               }

               float var14;
               label59: {
                  var10003 = -4297345543315137203L;
                  long var28 = var7;
                  long var30 = 1000L;
                  C_47cu var32 = var79.field_49;
                  int var81 = (int) ((var32.method_42$b0e346e6e3(var30, var28)) ? 1 : 0);
                  if (var11 != null) {
                     if (var81 != 0) {
                        double var82 = this.field_46.method_40$8abf5c6871() + 0.5;
                        double var88 = this.field_46.method_43$8abf5c6871() + 0.5;
                        double var94 = this.field_46.method_47$8abf5c6871() + 0.5;
                        var10005 = -4300267324613503846L;
                        C_47S6 var33 = ClientGlobals.field_46;
                        C_477r var97 = var33.method_44$4f8050086d();
                        long var10008 = -4300555496562893365L;
                        boolean var34 = false;
                        float var35 = 180.0F;
                        float var36 = 180.0F;
                        C_477r var37 = var97;
                        double var38 = var94;
                        long var40 = var9;
                        double var42 = var88;
                        double var44 = var82;
                        var14 = C_47gg.method_48$63715048f6(var44, var42, var40, var38, var37, var36, var35, var34).field_44;
                        if (var11 != null) {
                           break label59;
                        }
                     }

                     var81 = this.field_48.method_40$8abf5c6871();
                  }

                  double var83 = var81 + 0.5;
                  double var89 = this.field_48.method_43$8abf5c6871() + 0.5;
                  double var95 = this.field_48.method_47$8abf5c6871() + 0.5;
                  var10005 = -4300267324613503846L;
                  C_47S6 var46 = ClientGlobals.field_46;
                  C_477r var98 = var46.method_44$4f8050086d();
                  long var106 = -4300555496562893365L;
                  boolean var47 = false;
                  float var48 = 180.0F;
                  float var49 = 180.0F;
                  C_477r var50 = var98;
                  double var51 = var95;
                  long var53 = var9;
                  double var55 = var89;
                  double var57 = var83;
                  var14 = C_47gg.method_48$63715048f6(var57, var55, var53, var51, var50, var49, var48, var47).field_44;
               }

               var10005 = -4297468705213950632L;
               long var59 = var3;
               AutoJumpAndRun_47Cg var61 = this;
               byte var62 = 10;
               float var63 = var14;
               C_47S6 var64 = ClientGlobals.field_46;
               var64.method_47$508900092b(var63, var62, var61, var59);
               if (var11 != null) {
                  break label66;
               }
            }

            C_47S6 var84 = ClientGlobals.field_46;
            long var10002 = -4300267324613503846L;
            C_47S6 var65 = ClientGlobals.field_46;
            var10005 = -4297468705213950632L;
            long var66 = var3;
            AutoJumpAndRun_47Cg var68 = this;
            byte var69 = 10;
            float var70 = var65.method_44$4f8050086d().field_44;
            C_47S6 var71 = var84;
            var71.method_47$508900092b(var70, var69, var68, var66);
         }

         this.field_43a = false;
         if (var11 != null) {
            return;
         }
      }

      this.field_43a = true;
      C_47S6 var85 = ClientGlobals.field_46;
      long var90 = -4300267324613503846L;
      C_47S6 var72 = ClientGlobals.field_46;
      long var105 = -4297468705213950632L;
      long var73 = var3;
      AutoJumpAndRun_47Cg var75 = this;
      byte var76 = 10;
      float var77 = var72.method_44$4f8050086d().field_44;
      C_47S6 var78 = var85;
      var78.method_47$508900092b(var77, var76, var75, var73);
   }






    public AutoJumpAndRun_47Cg(long a0,int a1) {
        super((java.lang.String) ("AutoJumpAndRun"),(java.lang.String) ("AutoSpringenUndLaufen"),(long) (((((a0 << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.fun.AutoJumpAndRun_47Cg.a) ^ 45869789778937L)),(java.awt.Color) (new java.awt.Color((int) (119),(int) (148),(int) (61))),(client.module.Category) (client.module.Category.FUN));
        long constructorKey1 = ((((a0 << 32) | (((long) (a1) << 32) >>> 32)) ^ augustus.recovered.modules.fun.AutoJumpAndRun_47Cg.a) ^ 107769150464820L);
        java.lang.Object initialValue2 = recovery$indy$flow$234(1);
        ((java.lang.Object[]) initialValue2)[0] = "Gomme";
        client.setting.ModeSetting initialized3 = new client.setting.ModeSetting(this, "Mode", constructorKey1, "Gomme", (java.lang.String[]) (initialValue2));
        recovery$indy$flow$236(this, initialized3);
        net.C_47cu initialized4 = new net.C_47cu();
        recovery$indy$flow$239(this, initialized4);
        recovery$indy$flow$240(this, null);
        recovery$indy$flow$241(this, null);
    }



    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$234(int a0);
    private static native void recovery$indy$flow$236(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$239(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$240(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.fun.AutoJumpAndRun_47Cg) (a0)).field_46 = ((net.C_478Q) (a1));
        return;
    }
    private static void recovery$indy$flow$241(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.fun.AutoJumpAndRun_47Cg) (a0)).field_48 = ((net.C_478Q) (a1));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native String[] recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(double var0, double var2, long var4, double var6, long var8, long var10);
   private static native WorldClient recovery$indy$3(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$4(Object var0, long var1, long var3);
   private static native void recovery$indy$5(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$6(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$7(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$8();
}
