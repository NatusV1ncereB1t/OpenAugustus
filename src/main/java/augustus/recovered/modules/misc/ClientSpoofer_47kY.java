package augustus.recovered.modules.misc;
import io.netty.buffer.Unpooled;
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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_427;
import net.C_45n;
import net.C_473U;
import net.C_476Q;
import net.C_476q;
import net.C_47In;
import net.C_47JQ;
import client.module.Module;
import net.C_47PU;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47iC;
import net.C_47ob;
import net.C_47oo;
import client.module.Category;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ClientSpoofer_47kY extends client.module.Module implements net.C_47iC {
    private final client.setting.ModeSetting settingClients = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingCustomString = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRandomizeClientSettings = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingRandomViewDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private void method_40$30020d90b2(C_47PU var1, String var2) {
      var1.method_48$47ef0626ef(new C_47JQ(Unpooled.buffer()).method_48$310d4227fb(var2));
   }



   private void method_44$980f5842ea(char var1, net.C_47PU var2, char var3, net.C_47ob var4, int var5) {
      long var6 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ a;
      long var8 = var6 ^ 2934699596262L;
      int[] var10 = (int[])recovery$indy$flow$6(-2587993467895747398L, var6);
      String var10000 = var2.method_41$0e30dfc966();
      if (var10 == null) {
         if (var10000.equals((String)recovery$indy$flow$8(17932, 4286096397969973372L ^ var6))) {
            String var13 = (String)recovery$indy$flow$11(this.settingClients, var8, -2586526915221655757L, var6);
            byte var14 = -1;
            switch (var13.hashCode()) {
               case -1929927239:
                  if (var13.equals((String)recovery$indy$flow$15(11913, 2922028507408926971L ^ var6))) {
                     if (var1 >= 0) {
                        var14 = 1;
                     } else if (true) {
                        if (var3 > 0) {
                           var14 = 2;
                        } else if (2 != 0) {
                           if (var3 > 0) {
                              var14 = 3;
                           } else if (3 != 0) {
                              if (var3 > 0) {
                                 var14 = 4;
                              } else if (4 != 0) {
                                 if (var1 >= 0) {
                                    var14 = 5;
                                 } else if (5 != 0) {
                                    var14 = 6;
                                 }
                              }
                           }
                        }
                     }
                  }
                  break;
               case -1758693438:
                  if (var13.equals((String)recovery$indy$flow$25(2819, 9044725084328832377L ^ var6))) {
                     var14 = 6;
                  }
                  break;
               case 73781974:
                  if (var13.equals((String)recovery$indy$flow$19(30288, 7436813802816032820L ^ var6))) {
                     if (var3 > 0) {
                        var14 = 3;
                     } else if (3 != 0) {
                        if (var3 > 0) {
                           var14 = 4;
                        } else if (4 != 0) {
                           if (var1 >= 0) {
                              var14 = 5;
                           } else if (5 != 0) {
                              var14 = 6;
                           }
                        }
                     }
                  }
                  break;
               case 1193491652:
                  if (var13.equals((String)recovery$indy$flow$17(24072, 181926475659245683L ^ var6))) {
                     if (var3 > 0) {
                        var14 = 2;
                     } else if (2 != 0) {
                        if (var3 > 0) {
                           var14 = 3;
                        } else if (3 != 0) {
                           if (var3 > 0) {
                              var14 = 4;
                           } else if (4 != 0) {
                              if (var1 >= 0) {
                                 var14 = 5;
                              } else if (5 != 0) {
                                 var14 = 6;
                              }
                           }
                        }
                     }
                  }
                  break;
               case 1318402433:
                  if (var13.equals((String)recovery$indy$flow$21(14221, 1630346286936822258L ^ var6))) {
                     if (var3 > 0) {
                        var14 = 4;
                     } else if (4 != 0) {
                        if (var1 >= 0) {
                           var14 = 5;
                        } else if (5 != 0) {
                           var14 = 6;
                        }
                     }
                  }
                  break;
               case 1602017974:
                  if (var13.equals((String)recovery$indy$flow$13(19322, 2992558019168890125L ^ var6))) {
                     if (var1 >= 0) {
                        var14 = 0;
                     } else if (false) {
                        if (var1 >= 0) {
                           var14 = 1;
                        } else if (true) {
                           if (var3 > 0) {
                              var14 = 2;
                           } else if (2 != 0) {
                              if (var3 > 0) {
                                 var14 = 3;
                              } else if (3 != 0) {
                                 if (var3 > 0) {
                                    var14 = 4;
                                 } else if (4 != 0) {
                                    if (var1 >= 0) {
                                       var14 = 5;
                                    } else if (5 != 0) {
                                       var14 = 6;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
                  break;
               case 2029746065:
                  if (var13.equals((String)recovery$indy$flow$23(23977, 8938613607458634703L ^ var6))) {
                     if (var1 >= 0) {
                        var14 = 5;
                     } else if (5 != 0) {
                        var14 = 6;
                     }
                  }
            }

            switch (var14) {
               case 0:
                  recovery$indy$flow$28(this, var2, (String)recovery$indy$flow$27(1746, 2330178438774235315L ^ var6), -2586590574357421646L, var6);
                  int[] var24 = var10;
                  if (var3 >= 0) {
                     if (var10 == null) {
                        break;
                     }

                     recovery$indy$flow$30(this, var2, (String)recovery$indy$flow$29(26806, 7885615580490223306L ^ var6), -2586590574357421646L, var6);
                     var24 = var10;
                  }

                  if (var3 >= 0) {
                     if (var24 == null) {
                        break;
                     }

                     recovery$indy$flow$32(this, var2, (String)recovery$indy$flow$31(18867, 880230973744443347L ^ var6), -2586590574357421646L, var6);
                     var24 = var10;
                  }

                  if (var3 > 0) {
                     if (var24 == null) {
                        break;
                     }

                     recovery$indy$flow$34(this, var2, (String)recovery$indy$flow$33(4875, 6923127833245857125L ^ var6), -2586590574357421646L, var6);
                     var24 = var10;
                  }

                  if (var5 >= 0) {
                     if (var24 == null) {
                        break;
                     }

                     recovery$indy$flow$36(this, var2, (String)recovery$indy$flow$35(17537, 5534627847696802531L ^ var6), -2586590574357421646L, var6);
                     var24 = var10;
                  }

                  if (var5 >= 0) {
                     if (var24 == null) {
                        break;
                     }

                     recovery$indy$flow$39(
                        this, var2, (String)recovery$indy$flow$38(this.settingCustomString, var8, -2586526915221655757L, var6), -2586590574357421646L, var6
                     );
                     var24 = var10;
                  }

                  if (var24 != null) {
                     var4.cancel();
                  }
                  break;
               case 1:
                  recovery$indy$flow$30(this, var2, (String)recovery$indy$flow$29(26806, 7885615580490223306L ^ var6), -2586590574357421646L, var6);
                  int[] var23 = var10;
                  if (var3 >= 0) {
                     if (var10 == null) {
                        break;
                     }

                     recovery$indy$flow$32(this, var2, (String)recovery$indy$flow$31(18867, 880230973744443347L ^ var6), -2586590574357421646L, var6);
                     var23 = var10;
                  }

                  if (var3 > 0) {
                     if (var23 == null) {
                        break;
                     }

                     recovery$indy$flow$34(this, var2, (String)recovery$indy$flow$33(4875, 6923127833245857125L ^ var6), -2586590574357421646L, var6);
                     var23 = var10;
                  }

                  if (var5 >= 0) {
                     if (var23 == null) {
                        break;
                     }

                     recovery$indy$flow$36(this, var2, (String)recovery$indy$flow$35(17537, 5534627847696802531L ^ var6), -2586590574357421646L, var6);
                     var23 = var10;
                  }

                  if (var5 >= 0) {
                     if (var23 == null) {
                        break;
                     }

                     recovery$indy$flow$39(
                        this, var2, (String)recovery$indy$flow$38(this.settingCustomString, var8, -2586526915221655757L, var6), -2586590574357421646L, var6
                     );
                     var23 = var10;
                  }

                  if (var23 != null) {
                     var4.cancel();
                  }
                  break;
               case 2:
                  recovery$indy$flow$32(this, var2, (String)recovery$indy$flow$31(18867, 880230973744443347L ^ var6), -2586590574357421646L, var6);
                  int[] var22 = var10;
                  if (var3 > 0) {
                     if (var10 == null) {
                        break;
                     }

                     recovery$indy$flow$34(this, var2, (String)recovery$indy$flow$33(4875, 6923127833245857125L ^ var6), -2586590574357421646L, var6);
                     var22 = var10;
                  }

                  if (var5 >= 0) {
                     if (var22 == null) {
                        break;
                     }

                     recovery$indy$flow$36(this, var2, (String)recovery$indy$flow$35(17537, 5534627847696802531L ^ var6), -2586590574357421646L, var6);
                     var22 = var10;
                  }

                  if (var5 >= 0) {
                     if (var22 == null) {
                        break;
                     }

                     recovery$indy$flow$39(
                        this, var2, (String)recovery$indy$flow$38(this.settingCustomString, var8, -2586526915221655757L, var6), -2586590574357421646L, var6
                     );
                     var22 = var10;
                  }

                  if (var22 != null) {
                     var4.cancel();
                  }
                  break;
               case 3:
                  recovery$indy$flow$34(this, var2, (String)recovery$indy$flow$33(4875, 6923127833245857125L ^ var6), -2586590574357421646L, var6);
                  int[] var21 = var10;
                  if (var5 >= 0) {
                     if (var10 == null) {
                        break;
                     }

                     recovery$indy$flow$36(this, var2, (String)recovery$indy$flow$35(17537, 5534627847696802531L ^ var6), -2586590574357421646L, var6);
                     var21 = var10;
                  }

                  if (var5 >= 0) {
                     if (var21 == null) {
                        break;
                     }

                     recovery$indy$flow$39(
                        this, var2, (String)recovery$indy$flow$38(this.settingCustomString, var8, -2586526915221655757L, var6), -2586590574357421646L, var6
                     );
                     var21 = var10;
                  }

                  if (var21 != null) {
                     var4.cancel();
                  }
                  break;
               case 4:
                  recovery$indy$flow$36(this, var2, (String)recovery$indy$flow$35(17537, 5534627847696802531L ^ var6), -2586590574357421646L, var6);
                  int[] var20 = var10;
                  if (var5 >= 0) {
                     if (var10 == null) {
                        break;
                     }

                     recovery$indy$flow$39(
                        this, var2, (String)recovery$indy$flow$38(this.settingCustomString, var8, -2586526915221655757L, var6), -2586590574357421646L, var6
                     );
                     var20 = var10;
                  }

                  if (var20 != null) {
                     var4.cancel();
                  }
                  break;
               case 5:
                  recovery$indy$flow$39(
                     this, var2, (String)recovery$indy$flow$38(this.settingCustomString, var8, -2586526915221655757L, var6), -2586590574357421646L, var6
                  );
                  if (var10 != null) {
                     var4.cancel();
                  }
                  break;
               case 6:
                  var4.cancel();
            }
         }
      } else {
         String var11 = var10000;
         byte var12 = -1;
         switch (var11.hashCode()) {
            case 0:
               recovery$indy$flow$28(this, var2, (String)recovery$indy$flow$27(1746, 2330178438774235315L ^ var6), -2586590574357421646L, var6);
               int[] var19 = var10;
               if (var3 >= 0) {
                  if (var10 == null) {
                     break;
                  }

                  recovery$indy$flow$30(this, var2, (String)recovery$indy$flow$29(26806, 7885615580490223306L ^ var6), -2586590574357421646L, var6);
                  var19 = var10;
               }

               if (var3 >= 0) {
                  if (var19 == null) {
                     break;
                  }

                  recovery$indy$flow$32(this, var2, (String)recovery$indy$flow$31(18867, 880230973744443347L ^ var6), -2586590574357421646L, var6);
                  var19 = var10;
               }

               if (var3 > 0) {
                  if (var19 == null) {
                     break;
                  }

                  recovery$indy$flow$34(this, var2, (String)recovery$indy$flow$33(4875, 6923127833245857125L ^ var6), -2586590574357421646L, var6);
                  var19 = var10;
               }

               if (var5 >= 0) {
                  if (var19 == null) {
                     break;
                  }

                  recovery$indy$flow$36(this, var2, (String)recovery$indy$flow$35(17537, 5534627847696802531L ^ var6), -2586590574357421646L, var6);
                  var19 = var10;
               }

               if (var5 >= 0) {
                  if (var19 == null) {
                     break;
                  }

                  recovery$indy$flow$39(
                     this, var2, (String)recovery$indy$flow$38(this.settingCustomString, var8, -2586526915221655757L, var6), -2586590574357421646L, var6
                  );
                  var19 = var10;
               }

               if (var19 != null) {
                  var4.cancel();
               }
               break;
            case 1:
               recovery$indy$flow$30(this, var2, (String)recovery$indy$flow$29(26806, 7885615580490223306L ^ var6), -2586590574357421646L, var6);
               int[] var18 = var10;
               if (var3 >= 0) {
                  if (var10 == null) {
                     break;
                  }

                  recovery$indy$flow$32(this, var2, (String)recovery$indy$flow$31(18867, 880230973744443347L ^ var6), -2586590574357421646L, var6);
                  var18 = var10;
               }

               if (var3 > 0) {
                  if (var18 == null) {
                     break;
                  }

                  recovery$indy$flow$34(this, var2, (String)recovery$indy$flow$33(4875, 6923127833245857125L ^ var6), -2586590574357421646L, var6);
                  var18 = var10;
               }

               if (var5 >= 0) {
                  if (var18 == null) {
                     break;
                  }

                  recovery$indy$flow$36(this, var2, (String)recovery$indy$flow$35(17537, 5534627847696802531L ^ var6), -2586590574357421646L, var6);
                  var18 = var10;
               }

               if (var5 >= 0) {
                  if (var18 == null) {
                     break;
                  }

                  recovery$indy$flow$39(
                     this, var2, (String)recovery$indy$flow$38(this.settingCustomString, var8, -2586526915221655757L, var6), -2586590574357421646L, var6
                  );
                  var18 = var10;
               }

               if (var18 != null) {
                  var4.cancel();
               }
               break;
            case 2:
               recovery$indy$flow$32(this, var2, (String)recovery$indy$flow$31(18867, 880230973744443347L ^ var6), -2586590574357421646L, var6);
               int[] var17 = var10;
               if (var3 > 0) {
                  if (var10 == null) {
                     break;
                  }

                  recovery$indy$flow$34(this, var2, (String)recovery$indy$flow$33(4875, 6923127833245857125L ^ var6), -2586590574357421646L, var6);
                  var17 = var10;
               }

               if (var5 >= 0) {
                  if (var17 == null) {
                     break;
                  }

                  recovery$indy$flow$36(this, var2, (String)recovery$indy$flow$35(17537, 5534627847696802531L ^ var6), -2586590574357421646L, var6);
                  var17 = var10;
               }

               if (var5 >= 0) {
                  if (var17 == null) {
                     break;
                  }

                  recovery$indy$flow$39(
                     this, var2, (String)recovery$indy$flow$38(this.settingCustomString, var8, -2586526915221655757L, var6), -2586590574357421646L, var6
                  );
                  var17 = var10;
               }

               if (var17 != null) {
                  var4.cancel();
               }
               break;
            case 3:
               recovery$indy$flow$34(this, var2, (String)recovery$indy$flow$33(4875, 6923127833245857125L ^ var6), -2586590574357421646L, var6);
               int[] var16 = var10;
               if (var5 >= 0) {
                  if (var10 == null) {
                     break;
                  }

                  recovery$indy$flow$36(this, var2, (String)recovery$indy$flow$35(17537, 5534627847696802531L ^ var6), -2586590574357421646L, var6);
                  var16 = var10;
               }

               if (var5 >= 0) {
                  if (var16 == null) {
                     break;
                  }

                  recovery$indy$flow$39(
                     this, var2, (String)recovery$indy$flow$38(this.settingCustomString, var8, -2586526915221655757L, var6), -2586590574357421646L, var6
                  );
                  var16 = var10;
               }

               if (var16 != null) {
                  var4.cancel();
               }
               break;
            case 4:
               recovery$indy$flow$36(this, var2, (String)recovery$indy$flow$35(17537, 5534627847696802531L ^ var6), -2586590574357421646L, var6);
               int[] var15 = var10;
               if (var5 >= 0) {
                  if (var10 == null) {
                     break;
                  }

                  recovery$indy$flow$39(
                     this, var2, (String)recovery$indy$flow$38(this.settingCustomString, var8, -2586526915221655757L, var6), -2586590574357421646L, var6
                  );
                  var15 = var10;
               }

               if (var15 != null) {
                  var4.cancel();
               }
               break;
            case 5:
               recovery$indy$flow$39(
                  this, var2, (String)recovery$indy$flow$38(this.settingCustomString, var8, -2586526915221655757L, var6), -2586590574357421646L, var6
               );
               if (var10 != null) {
                  var4.cancel();
               }
               break;
            case 6:
               var4.cancel();
         }
      }
   }





   public void method_48$7421db9485(net.C_47ob var1, long var2) {
      long var4 = var2 ^ 88178686905229L;
      long var10001 = var2 ^ 56541768253207L;
      int var6 = (int)((var2 ^ 56541768253207L) >>> 48);
      int var7 = (int)((var2 ^ 56541768253207L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      int[] var9 = (int[])recovery$indy$flow$41(4155104181126629638L, var2);
      net.C_473U var10 = (net.C_473U)recovery$indy$flow$42(var1, 4154881809361374630L, var2);
      boolean var10000 = var10 instanceof C_47PU;
      if (var9 == null) {
         int[] var40;
         if (!var10000) {
            var10000 = var10 instanceof C_476Q;
            var40 = var9;
            if (var2 > 0L) {
               if (var9 == null) {
                  if (!var10000) {
                     return;
                  }

                  var10000 = recovery$indy$flow$46(field_43, 4154061722397948342L, var2);
               }

               long var51;
               int var47 = (var51 = var2 - 0L) == 0L ? 0 : (var51 < 0L ? -1 : 1);
               if (var9 == null) {
                  if (var10000) {
                     return;
                  }

                  var10000 = var10 instanceof C_47PU;
               }

               long var52;
               var47 = (var52 = var2 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
               if (var9 == null) {
                  if (var10000) {
                     C_47PU var19 = (C_47PU)var10;
                     recovery$indy$flow$49(this, (char)var6, var19, (char)var7, var1, var8, 4154977149266918454L, var2);
                  }

                  var10000 = var10 instanceof C_476Q;
               }

               if (var9 == null) {
                  if (!var10000) {
                     return;
                  }

                  var10000 = recovery$indy$flow$52(this.settingRandomizeClientSettings, 4155592366297825217L, var2);
               }

               if (var10000) {
                  C_476Q var20 = (C_476Q)var10;
                  Object[] var26 = ((net.C_427)recovery$indy$flow$55(field_43, 4155016545323345105L, var2)).method_43$43b9f1ea53().values().toArray();
                  if (var26.length > 0) {
                     long var53;
                     int var42 = (var53 = var2 - 0L) == 0L ? 0 : (var53 < 0L ? -1 : 1);
                     if (var26[0] instanceof net.C_47In[]) {
                        net.C_47In[] var31 = (net.C_47In[])var26;
                        var20.method_45$a7421bf54c(
                           var31[recovery$indy$flow$68(
                                 net.C_476q.field_48,
                                 0,
                                 ((net.C_427)recovery$indy$flow$64(field_43, 4155016545323345105L, var2)).method_43$43b9f1ea53().values().size() - 1,
                                 var4,
                                 4154778865433639456L,
                                 var2
                              )]
                              .method_42$0e30dfc966()
                        );
                        int var36 = (int)recovery$indy$flow$72(this.settingRandomViewDistance, 4154831405086250178L, var2);
                        ((net.C_47oo)recovery$indy$flow$74(field_43, 4154130213769377292L, var2)).field_42Q = var36;
                        var20.method_47$d00df7729d(var36);
                        var20.method_44$f633c984d8(new java.util.Random().nextBoolean());
                     }
                  }
               }

               return;
            }

            if (var2 >= 0L) {
               if (var9 == null) {
                  if (var10000) {
                     return;
                  }

                  var10000 = var10 instanceof C_47PU;
               }

               long var54;
               int var46 = (var54 = var2 - 0L) == 0L ? 0 : (var54 < 0L ? -1 : 1);
               if (var9 == null) {
                  if (var10000) {
                     C_47PU var17 = (C_47PU)var10;
                     recovery$indy$flow$49(this, (char)var6, var17, (char)var7, var1, var8, 4154977149266918454L, var2);
                  }

                  var10000 = var10 instanceof C_476Q;
               }

               if (var9 == null) {
                  if (!var10000) {
                     return;
                  }

                  var10000 = recovery$indy$flow$52(this.settingRandomizeClientSettings, 4155592366297825217L, var2);
               }

               if (var10000) {
                  C_476Q var18 = (C_476Q)var10;
                  Object[] var25 = ((net.C_427)recovery$indy$flow$55(field_43, 4155016545323345105L, var2)).method_43$43b9f1ea53().values().toArray();
                  if (var25.length > 0) {
                     long var55;
                     int var41 = (var55 = var2 - 0L) == 0L ? 0 : (var55 < 0L ? -1 : 1);
                     if (var25[0] instanceof net.C_47In[]) {
                        net.C_47In[] var30 = (net.C_47In[])var25;
                        var18.method_45$a7421bf54c(
                           var30[recovery$indy$flow$68(
                                 net.C_476q.field_48,
                                 0,
                                 ((net.C_427)recovery$indy$flow$64(field_43, 4155016545323345105L, var2)).method_43$43b9f1ea53().values().size() - 1,
                                 var4,
                                 4154778865433639456L,
                                 var2
                              )]
                              .method_42$0e30dfc966()
                        );
                        int var35 = (int)recovery$indy$flow$72(this.settingRandomViewDistance, 4154831405086250178L, var2);
                        ((net.C_47oo)recovery$indy$flow$74(field_43, 4154130213769377292L, var2)).field_42Q = var35;
                        var18.method_47$d00df7729d(var35);
                        var18.method_44$f633c984d8(new java.util.Random().nextBoolean());
                     }
                  }
               }

               return;
            }
         } else {
            var10000 = recovery$indy$flow$46(field_43, 4154061722397948342L, var2);
            var40 = var9;
            if (var2 >= 0L) {
               if (var9 == null) {
                  if (var10000) {
                     return;
                  }

                  var10000 = var10 instanceof C_47PU;
               }

               long var56;
               int var50 = (var56 = var2 - 0L) == 0L ? 0 : (var56 < 0L ? -1 : 1);
               if (var9 == null) {
                  if (var10000) {
                     C_47PU var22 = (C_47PU)var10;
                     recovery$indy$flow$49(this, (char)var6, var22, (char)var7, var1, var8, 4154977149266918454L, var2);
                  }

                  var10000 = var10 instanceof C_476Q;
               }

               if (var9 == null) {
                  if (!var10000) {
                     return;
                  }

                  var10000 = recovery$indy$flow$52(this.settingRandomizeClientSettings, 4155592366297825217L, var2);
               }

               if (var10000) {
                  C_476Q var23 = (C_476Q)var10;
                  Object[] var28 = ((net.C_427)recovery$indy$flow$55(field_43, 4155016545323345105L, var2)).method_43$43b9f1ea53().values().toArray();
                  if (var28.length > 0) {
                     long var57;
                     int var44 = (var57 = var2 - 0L) == 0L ? 0 : (var57 < 0L ? -1 : 1);
                     if (var28[0] instanceof net.C_47In[]) {
                        net.C_47In[] var33 = (net.C_47In[])var28;
                        var23.method_45$a7421bf54c(
                           var33[recovery$indy$flow$68(
                                 net.C_476q.field_48,
                                 0,
                                 ((net.C_427)recovery$indy$flow$64(field_43, 4155016545323345105L, var2)).method_43$43b9f1ea53().values().size() - 1,
                                 var4,
                                 4154778865433639456L,
                                 var2
                              )]
                              .method_42$0e30dfc966()
                        );
                        int var38 = (int)recovery$indy$flow$72(this.settingRandomViewDistance, 4154831405086250178L, var2);
                        ((net.C_47oo)recovery$indy$flow$74(field_43, 4154130213769377292L, var2)).field_42Q = var38;
                        var23.method_47$d00df7729d(var38);
                        var23.method_44$f633c984d8(new java.util.Random().nextBoolean());
                     }
                  }
               }

               return;
            }
         }

         long var58;
         int var49 = (var58 = var2 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
         if (var40 == null) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$flow$52(this.settingRandomizeClientSettings, 4155592366297825217L, var2);
         }

         if (var10000) {
            C_476Q var21 = (C_476Q)var10;
            Object[] var27 = ((net.C_427)recovery$indy$flow$55(field_43, 4155016545323345105L, var2)).method_43$43b9f1ea53().values().toArray();
            if (var27.length > 0) {
               long var59;
               int var43 = (var59 = var2 - 0L) == 0L ? 0 : (var59 < 0L ? -1 : 1);
               if (var27 instanceof net.C_47In[]) {
                  net.C_47In[] var32 = (net.C_47In[])var27;
                  var21.method_45$a7421bf54c(
                     var32[recovery$indy$flow$68(
                           net.C_476q.field_48,
                           0,
                           ((net.C_427)recovery$indy$flow$64(field_43, 4155016545323345105L, var2)).method_43$43b9f1ea53().values().size() - 1,
                           var4,
                           4154778865433639456L,
                           var2
                        )]
                        .method_42$0e30dfc966()
                  );
                  int var37 = (int)recovery$indy$flow$72(this.settingRandomViewDistance, 4154831405086250178L, var2);
                  ((net.C_47oo)recovery$indy$flow$74(field_43, 4154130213769377292L, var2)).field_42Q = var37;
                  var21.method_47$d00df7729d(var37);
                  var21.method_44$f633c984d8(new java.util.Random().nextBoolean());
               }
            }
         }
      } else if (var2 >= 0L) {
         if (var9 == null) {
            if (var10000) {
               return;
            }

            var10000 = var10 instanceof C_47PU;
         }

         long var60;
         int var45 = (var60 = var2 - 0L) == 0L ? 0 : (var60 < 0L ? -1 : 1);
         if (var9 == null) {
            if (var10000) {
               C_47PU var15 = (C_47PU)var10;
               recovery$indy$flow$49(this, (char)var6, var15, (char)var7, var1, var8, 4154977149266918454L, var2);
            }

            var10000 = var10 instanceof C_476Q;
         }

         if (var9 == null) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$flow$52(this.settingRandomizeClientSettings, 4155592366297825217L, var2);
         }

         if (var10000) {
            C_476Q var16 = (C_476Q)var10;
            Object[] var24 = ((net.C_427)recovery$indy$flow$55(field_43, 4155016545323345105L, var2)).method_43$43b9f1ea53().values().toArray();
            if (var24.length != 0) {
               net.C_47In[] var29 = (net.C_47In[])var24;
               var16.method_45$a7421bf54c(
                  var29[recovery$indy$flow$68(
                        net.C_476q.field_48,
                        0,
                        ((net.C_427)recovery$indy$flow$64(field_43, 4155016545323345105L, var2)).method_43$43b9f1ea53().values().size() - 1,
                        var4,
                        4154778865433639456L,
                        var2
                     )]
                     .method_42$0e30dfc966()
               );
               int var34 = (int)recovery$indy$flow$72(this.settingRandomViewDistance, 4154831405086250178L, var2);
               ((net.C_47oo)recovery$indy$flow$74(field_43, 4154130213769377292L, var2)).field_42Q = var34;
               var16.method_47$d00df7729d(var34);
               var16.method_44$f633c984d8(new java.util.Random().nextBoolean());
            }
         }
      } else {
         long var61;
         int var10002 = (var61 = var2 - 0L) == 0L ? 0 : (var61 < 0L ? -1 : 1);
         if (var9 == null) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$flow$52(this.settingRandomizeClientSettings, 4155592366297825217L, var2);
         }

         if (var10000) {
            C_476Q var11 = (C_476Q)var10;
            Object[] var12 = ((net.C_427)recovery$indy$flow$55(field_43, 4155016545323345105L, var2)).method_43$43b9f1ea53().values().toArray();
            if (var12.length != 0) {
               net.C_47In[] var13 = (net.C_47In[])var12;
               var11.method_45$a7421bf54c(
                  var13[recovery$indy$flow$68(
                        net.C_476q.field_48,
                        0,
                        ((net.C_427)recovery$indy$flow$64(field_43, 4155016545323345105L, var2)).method_43$43b9f1ea53().values().size() - 1,
                        var4,
                        4154778865433639456L,
                        var2
                     )]
                     .method_42$0e30dfc966()
               );
               int var14 = (int)recovery$indy$flow$72(this.settingRandomViewDistance, 4154831405086250178L, var2);
               ((net.C_47oo)recovery$indy$flow$74(field_43, 4154130213769377292L, var2)).field_42Q = var14;
               var11.method_47$d00df7729d(var14);
               var11.method_44$f633c984d8(new java.util.Random().nextBoolean());
            }
         }
      }
   }




   private static boolean method_45$aae029aa0a() {
      return false;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$33(this, 26, var3, -7099025454042676825L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public ClientSpoofer_47kY(long a0) {
        super((java.lang.String) ("ClientSpoofer"),(java.lang.String) ("KundenVernebler"),(long) (((augustus.recovered.modules.misc.ClientSpoofer_47kY.a ^ a0) ^ 44308775642935L)),(java.awt.Color) (new java.awt.Color((int) (163),(int) (240),(int) (223))),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.misc.ClientSpoofer_47kY.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.misc.ClientSpoofer_47kY.a ^ a0) ^ 85764537359279L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.misc.ClientSpoofer_47kY.a ^ a0) ^ 85764537359279L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.misc.ClientSpoofer_47kY.a ^ a0) ^ 85764537359279L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.misc.ClientSpoofer_47kY.a ^ a0) ^ 109918442870778L);
        long constructorKey7 = ((augustus.recovered.modules.misc.ClientSpoofer_47kY.a ^ a0) ^ 98307295935276L);
        java.lang.Object initialValue8 = recovery$indy$flow$83(8);
        ((java.lang.Object[]) initialValue8)[0] = "Default";
        ((java.lang.Object[]) initialValue8)[1] = "LabyMod";
        ((java.lang.Object[]) initialValue8)[2] = "CheatBreaker";
        ((java.lang.Object[]) initialValue8)[3] = "PvPLounge";
        ((java.lang.Object[]) initialValue8)[4] = "Lunar";
        ((java.lang.Object[]) initialValue8)[5] = "Badlion";
        ((java.lang.Object[]) initialValue8)[6] = "Custom";
        ((java.lang.Object[]) initialValue8)[7] = "CancelPacket";
        client.setting.ModeSetting initialized9 = new client.setting.ModeSetting(this, "Clients", constructorKey6, "Default", (java.lang.String[]) (initialValue8));
        recovery$indy$flow$85(this, initialized9);
        java.lang.Object initialValue10 = recovery$indy$flow$87(0);
        client.setting.ModeSetting initialized11 = new client.setting.ModeSetting(this, "CustomString", constructorKey6, "", (java.lang.String[]) (initialValue10));
        java.lang.Object initialValue12 = recovery$indy$flow$89();
        java.lang.Object initialValue13 = initialValue12;
        client.setting.ModeSetting initialValue14 = initialized11;
        java.lang.Object initialValue15 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue14))))));
        java.lang.Object initialValue16 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue13))))));
        java.lang.Object initialValue17 = recovery$indy$flow$92(initialValue15, initialValue16);
        recovery$indy$flow$93(this, initialValue17);
        client.setting.BooleanSetting initialized18 = new client.setting.BooleanSetting(this, constructorKey7, "RandomizeClientSettings", false);
        recovery$indy$flow$96(this, initialized18);
        short converted19 = (short) (constructorPart4);
        short converted20 = (short) (constructorPart5);
        client.setting.RangeSetting initialized21 = new client.setting.RangeSetting(constructorPart3, this, "RandomViewDistance", Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4622945017495814144L), converted19, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4625196817309499392L), 0, converted20);
        recovery$indy$flow$99(this, initialized21);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$6(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$8(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$11(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$13(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$15(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$17(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$19(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$21(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$23(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$25(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$27(int a0,long a1);
    private static native void recovery$indy$flow$28(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$29(int a0,long a1);
    private static native void recovery$indy$flow$30(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$31(int a0,long a1);
    private static native void recovery$indy$flow$32(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$33(int a0,long a1);
    private static native void recovery$indy$flow$34(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$35(int a0,long a1);
    private static native void recovery$indy$flow$36(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$38(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$39(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$41(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$42(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$46(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$49(java.lang.Object a0,char a1,java.lang.Object a2,char a3,java.lang.Object a4,int a5,long a6,long a7);
    private static native boolean recovery$indy$flow$52(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$55(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$64(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$68(java.lang.Object a0,int a1,int a2,long a3,long a4,long a5);
    private static native double recovery$indy$flow$72(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$74(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$83(int a0);
    private static native void recovery$indy$flow$85(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$87(int a0);
    private static native java.lang.Object recovery$indy$flow$89();


    private static native java.lang.Object recovery$indy$flow$92(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$93(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$96(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$99(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native void recovery$indy$33(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$35();
}
