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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_455;
import net.C_473U;
import net.C_47AL;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47K6;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.RangeSetting;
import net.C_47Yl;
import net.C_47cu;
import net.C_47iC;
import net.C_47jI;
import net.C_47ob;
import client.ClientGlobals;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoReport_47CL extends client.module.Module implements net.C_47iC,net.C_47xz {
    private final client.setting.RangeSetting settingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingHideMessages = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashSet field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashSet field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_47$9035875d26(long var1, C_47ob var3) {
      String[] var4 = recovery$indy$1(2669053192837399058L, var1);
      if (recovery$indy$2(this.settingHideMessages, 2668072897289140039L, var1)) {
         C_473U var5 = recovery$indy$3(var3, 2667701912195525542L, var1);
         C_473U var10000 = var5;
         if (var4 != null) {
            if (!(var5 instanceof C_47AL)) {
               return;
            }

            var10000 = var5;
         }

         C_47AL var6 = (C_47AL)var10000;
         String var7 = var6.method_45$8b128fd962().method_48$0e30dfc966();
         if (var7.contains(recovery$indy$4(15723, 4700603898385792467L ^ var1))) {
            var3.cancel();
         }
      }
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$5(this, 40, var3, -7098990070764844406L, var1);
      recovery$indy$6(this, 26, var3, -7098990070764844406L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
        java.lang.String[] var38;
        java.lang.String[] var39;
        java.lang.String[] var45;
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 15877164398549L;
      long var8 = var4 ^ 72498010691029L;
      long var10 = var4 ^ 97834970749362L;
      long var10001 = var4 ^ 30592198597857L;
      int var12 = (int)((var4 ^ 30592198597857L) >>> 32);
      int var13 = (int)((var4 ^ 30592198597857L) << 32 >>> 48);
      int var14 = (int)(var10001 << 48 >>> 48);
      String[] var15 = (String[])recovery$indy$flow$13(2183434442446879061L, var4);
      recovery$indy$flow$20(this, var8, "" + this.field_42, 2183238346280788684L, var4);
      if (var15 != null) {
         if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$22(field_43, 2180657000504679175L, var4)).field_48y > 50) {
            java.util.Iterator var23 = ((net.C_47K6)recovery$indy$flow$25(field_43, 2183380532830390370L, var4)).method_43$29638970ac().iterator();

            boolean var35;
            while (true) {
               Object var34;
               if (var23.hasNext()) {
                  var34 = var23.next();
               } else {
                  var34 = this;
                  if (var2 >= 0) {
                     var35 = recovery$indy$flow$46(
                        this.field_40, recovery$indy$flow$45(this.settingDelay, 2180468002272838898L, var4), var10, 2183527026095121063L, var4
                     );
                     break;
                  }
               }

               net.C_47Yl var27 = (net.C_47Yl)var34;
               String var30 = var27.method_48$0e30dfc966();
               var35 = var30.equals(((net.C_455)recovery$indy$flow$33(field_43, 2180758852616466690L, var4)).method_47$0e30dfc966());
               String[] var43 = var15;
               if (var3 >= 0) {
                  if (var15 == null) {
                     break;
                  }

                  var43 = var15;
               }

               if (var2 > 0) {
                  if (var43 != null) {
                     if (var35) {
                        continue;
                     }

                     var35 = this.field_48.contains(var30);
                  }

                  var43 = var15;
               }

               if (var3 >= 0) {
                  if (var43 != null) {
                     if (var35) {
                        continue;
                     }

                     var35 = recovery$indy$flow$40(client.ClientGlobals.field_48.field_46Z, var30, var6, 2183138554911107775L, var4);
                  }

                  var43 = var15;
               }

               if (var43 != null && !var35) {
                  this.field_45.add(var30);
               }
            }

            if (var35) {
               recovery$indy$flow$48(this.settingDelay, 2180356208617315601L, var4);
               var23 = this.field_45.iterator();

               while (var23.hasNext()) {
                  String var28 = (String)var23.next();
                  var35 = var28.equals(((net.C_455)recovery$indy$flow$55(field_43, 2180758852616466690L, var4)).method_47$0e30dfc966());
                  String[] var44 = var15;
                  if (var3 >= 0) {
                     if (var15 != null) {
                        if (var35) {
                           return;
                        }

                        var35 = this.field_48.contains(var28);
                     }

                     var44 = var15;
                  }

                  if (var1 >= 0) {
                     if (var44 != null) {
                        if (var35) {
                           return;
                        }

                        var35 = recovery$indy$flow$62(client.ClientGlobals.field_48.field_46Z, var28, var6, 2183138554911107775L, var4);
                     }

                     var44 = var15;
                  }

                  if (var2 >= 0) {
                     if (var44 != null) {
                        if (var35) {
                           return;
                        }

                        var35 = recovery$indy$flow$63(var12, (short)var13, (char)var14, var28, 2183290560848433928L, var4);
                     }

                     var44 = var15;
                  }

                  label395: {
                     label394: {
                        if (var44 != null) {
                           if (var35 && !net.C_47jI.field_46.containsKey(var28)) {
                              boolean var31 = false;
                              java.util.Iterator var19 = ((net.C_47K6)recovery$indy$flow$67(field_43, 2183380532830390370L, var4)).method_43$29638970ac().iterator();

                              label389: {
                                 label552: {
                                    label553: {
                                       label386: {
                                          while (true) {
                                             label383:
                                             if (var19.hasNext()) {
                                                net.C_47Yl var20 = (net.C_47Yl)var19.next();
                                                String var21 = var20.method_48$0e30dfc966();
                                                var35 = var21.equals(var28);
                                                var45 = var15;
                                                if (var1 <= 0) {
                                                   break label386;
                                                }

                                                if (var15 == null) {
                                                   break;
                                                }

                                                label380: {
                                                   if (var35) {
                                                      var31 = true;
                                                      var38 = var15;
                                                      if (var2 <= 0) {
                                                         break label380;
                                                      }

                                                      if (var15 != null) {
                                                         break label383;
                                                      }
                                                   }

                                                   var38 = var15;
                                                }

                                                if (var38 != null) {
                                                   continue;
                                                }
                                             }

                                             if (var2 <= 0) {
                                                break label553;
                                             }

                                             var35 = var31;
                                             break;
                                          }

                                          var45 = var15;
                                       }

                                       if (var45 != null) {
                                          if (var35) {
                                             break label552;
                                          }

                                          ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$76(field_43, 2180657000504679175L, var4))
                                             .method_49$a7421bf54c(
                                                (String)recovery$indy$flow$79(6407, 7856755936586818303L ^ var4)
                                                   + var28
                                                   + (String)recovery$indy$flow$82(8670, 1315718968674572832L ^ var4)
                                             );
                                          recovery$indy$flow$87(this.field_40, 2180720882533682525L, var4);
                                          this.field_48.add(var28);
                                       }

                                       var23.remove();
                                       this.field_42++;
                                    }

                                    var39 = var15;
                                    if (var2 < 0) {
                                       break label389;
                                    }

                                    if (var15 != null) {
                                       break;
                                    }
                                 }

                                 var39 = var15;
                              }

                              if (var3 < 0) {
                                 break label395;
                              }

                              if (var39 != null) {
                                 break label394;
                              }
                           }

                           this.field_48.add(var28);
                        }

                        var23.remove();
                     }

                     var39 = var15;
                  }

                  if (var39 == null) {
                     break;
                  }
               }
            }
         }
      } else {
         Object var10000;
         label570: {
            java.util.Iterator var16 = ((net.C_47K6)recovery$indy$flow$25(field_43, 2183380532830390370L, var4)).method_43$29638970ac().iterator();
            boolean var32;
            if (var16.hasNext()) {
               var10000 = var16.next();

               while (true) {
                  net.C_47Yl var25 = (net.C_47Yl)var10000;
                  String var29 = var25.method_48$0e30dfc966();
                  var32 = var29.equals(((net.C_455)recovery$indy$flow$33(field_43, 2180758852616466690L, var4)).method_47$0e30dfc966());
                  String[] var41 = var15;
                  if (var3 >= 0) {
                     if (var15 == null) {
                        break;
                     }

                     var41 = var15;
                  }

                  label559: {
                     if (var2 > 0) {
                        if (var41 != null) {
                           if (var32) {
                              break label559;
                           }

                           var32 = this.field_48.contains(var29);
                        }

                        var41 = var15;
                     }

                     if (var3 >= 0) {
                        if (var41 != null) {
                           if (var32) {
                              break label559;
                           }

                           var32 = recovery$indy$flow$40(client.ClientGlobals.field_48.field_46Z, var29, var6, 2183138554911107775L, var4);
                        }

                        var41 = var15;
                     }

                     if (var41 != null && !var32) {
                        this.field_45.add(var29);
                     }
                  }

                  var10000 = this;
                  if (var2 >= 0) {
                     break label570;
                  }
               }
            } else {
               while (true) {
                  var10000 = this;
                  if (var2 >= 0) {
                     break label570;
                  }

                  net.C_47Yl var17 = (net.C_47Yl)(Object) (this);
                  String var18 = var17.method_48$0e30dfc966();
                  var32 = var18.equals(((net.C_455)recovery$indy$flow$33(field_43, 2180758852616466690L, var4)).method_47$0e30dfc966());
                  String[] var40 = var15;
                  if (var3 >= 0) {
                     if (var15 == null) {
                        break;
                     }

                     var40 = var15;
                  }

                  if (var2 > 0) {
                     if (var40 != null) {
                        if (var32) {
                           continue;
                        }

                        var32 = this.field_48.contains(var18);
                     }

                     var40 = var15;
                  }

                  if (var3 >= 0) {
                     if (var40 != null) {
                        if (var32) {
                           continue;
                        }

                        var32 = recovery$indy$flow$40(client.ClientGlobals.field_48.field_46Z, var18, var6, 2183138554911107775L, var4);
                     }

                     var40 = var15;
                  }

                  if (var40 != null && !var32) {
                     this.field_45.add(var18);
                  }
               }
            }

            if (!var32) {
               return;
            }

            recovery$indy$flow$48(this.settingDelay, 2180356208617315601L, var4);
            var10000 = this;
         }

         java.util.Iterator var22 = ((AutoReport_47CL)var10000).field_45.iterator();

         while (var22.hasNext()) {
            String var26 = (String)var22.next();
            boolean var33 = var26.equals(((net.C_455)recovery$indy$flow$55(field_43, 2180758852616466690L, var4)).method_47$0e30dfc966());
            String[] var42 = var15;
            if (var3 >= 0) {
               if (var15 != null) {
                  if (var33) {
                     return;
                  }

                  var33 = this.field_48.contains(var26);
               }

               var42 = var15;
            }

            if (var1 >= 0) {
               if (var42 != null) {
                  if (var33) {
                     return;
                  }

                  var33 = recovery$indy$flow$62(client.ClientGlobals.field_48.field_46Z, var26, var6, 2183138554911107775L, var4);
               }

               var42 = var15;
            }

            if (var2 >= 0) {
               if (var42 != null) {
                  if (var33) {
                     return;
                  }

                  var33 = recovery$indy$flow$63(var12, (short)var13, (char)var14, var26, 2183290560848433928L, var4);
               }

               var42 = var15;
            }

            if (var42 != null) {
               if (var33) {
                  net.C_47jI.field_46.containsKey(var26);
               } else {
                  this.field_48.add(var26);
               }
            }

            var22.remove();
            if (var15 == null) {
               break;
            }
         }
      }
   }






   public void method_43y$e45a9973e5(long var1) {
      this.field_45.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public AutoReport_47CL(long a0) {
        super((java.lang.String) ("AutoReport"),(java.lang.String) ("AutomatischeMeldung"),(long) (((augustus.recovered.modules.fun.AutoReport_47CL.a ^ a0) ^ 50123369772679L)),(java.awt.Color) (new java.awt.Color((int) (167),(int) (245),(int) (66))),(client.module.Category) (client.module.Category.FUN));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.fun.AutoReport_47CL.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.fun.AutoReport_47CL.a ^ a0) ^ 83402589719071L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.fun.AutoReport_47CL.a ^ a0) ^ 83402589719071L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.fun.AutoReport_47CL.a ^ a0) ^ 83402589719071L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.fun.AutoReport_47CL.a ^ a0) ^ 110909590708090L);
        long constructorKey7 = ((augustus.recovered.modules.fun.AutoReport_47CL.a ^ a0) ^ 101922828757660L);
        short converted8 = (short) (constructorPart4);
        short converted9 = (short) (constructorPart5);
        client.setting.RangeSetting initialized10 = new client.setting.RangeSetting(constructorPart3, this, "Delay", Double.longBitsToDouble(4667272928281231360L), Double.longBitsToDouble(4668372439909007360L), converted8, 0.0D, Double.longBitsToDouble(4669471951536783360L), 0, converted9);
        long initialValue11 = constructorKey6;
        client.setting.RangeSetting initialValue12 = initialized10;
        java.lang.Object initialValue13 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue12))))));
        java.lang.Object initialValue14 = recovery$indy$flow$101(initialValue13, initialValue11);
        recovery$indy$flow$102(this, initialValue14);
        client.setting.BooleanSetting initialized15 = new client.setting.BooleanSetting(this, constructorKey7, "HideMessages", true);
        recovery$indy$flow$105(this, initialized15);
        recovery$indy$flow$106(this, 0);
        net.C_47cu initialized16 = new net.C_47cu();
        recovery$indy$flow$109(this, initialized16);
        java.util.HashSet initialized17 = new java.util.HashSet();
        recovery$indy$flow$112(this, initialized17);
        java.util.HashSet initialized18 = new java.util.HashSet();
        recovery$indy$flow$115(this, initialized18);
    }



    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$13(long a0,long a1);
    private static native void recovery$indy$flow$20(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$22(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$25(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$33(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$40(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native int recovery$indy$flow$45(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$46(java.lang.Object a0,long a1,long a2,long a3,long a4);
    private static native double recovery$indy$flow$48(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$55(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$62(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native boolean recovery$indy$flow$63(int a0,short a1,char a2,java.lang.Object a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$67(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$76(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$79(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$82(int a0,long a1);
    private static native void recovery$indy$flow$87(java.lang.Object a0,long a1,long a2);

    private static native java.lang.Object recovery$indy$flow$101(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$102(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$105(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$106(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.fun.AutoReport_47CL) (a0)).field_42 = a1;
        return;
    }
    private static native void recovery$indy$flow$109(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$112(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$115(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native String[] recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3);
   private static native C_473U recovery$indy$3(Object var0, long var1, long var3);
   private static native String recovery$indy$4(int var0, long var1);
   private static native void recovery$indy$5(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$6(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$24();
}
