package augustus.recovered.modules.player;
import java.awt.Color;
import java.io.IOException;
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
import client.Client;
import net.C_4713;
import net.C_475e;
import net.C_476q;
import net.minecraft.client.gui.GuiScreen;
import net.C_47MO;
import client.module.Module;
import client.module.ModuleManager;
import client.setting.NumberSetting;
import net.C_47TU;
import client.setting.BooleanSetting;
import net.C_47cu;
import net.C_47jt;
import net.minecraft.client.Minecraft;
import net.C_47pL;
import client.ClientGlobals;
import net.C_47rf;
import net.C_47sT;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ReverseAutoArmor_47QP extends client.module.Module implements net.C_47xz {
    private final client.setting.NumberSetting settingStartDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47TU settingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingDrop = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBot = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$1(this, 40, var3, -7098863826743925615L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var6;
      long var12;
      long var14;
      label34: {
         long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
         var6 = var4 ^ 44258007896257L;
         long var8 = var4 ^ 106952191323059L;
         long var10 = var4 ^ 15611559894714L;
         var12 = var4 ^ 13136143433030L;
         var14 = var4 ^ 110162248843858L;
         long var10000 = 2730949625062487428L;
         boolean var16 = AirStuck_47Q4.method_419$aae029aa0a();
         Minecraft var40 = field_43;
         if (!var16) {
            long var10001 = 2730504136091540739L;
            Minecraft var17 = field_43;
            if (var17.field_42P == null) {
               break label34;
            }

            var40 = field_43;
         }

         long var47 = 2730327910359851332L;
         Minecraft var18 = var40;
         label29:
         if (var18.field_44Q != null) {
            var10000 = 2730701669628972748L;
            Client var42 = Client.method_44$fbc0c0be91();
            var47 = 2732545201696379627L;
            Client var19 = var42;
            ModuleManager var43 = var19.method_45$4a5eee04b7();
            if (!var16) {
               if (var43 == null) {
                  break label29;
               }

               var10000 = 2730701669628972748L;
               Client var45 = Client.method_44$fbc0c0be91();
               var47 = 2732545201696379627L;
               Client var20 = var45;
               var43 = var20.method_45$4a5eee04b7();
            }

            long var10002 = 2730917589582461717L;
            long var21 = var8;
            InvManager_47QL var23 = var43.field_44f;
            if (var23.method_46$0dd78e0064(var21)) {
               String var50 = recovery$indy$2(31817, 8455947979814189460L ^ var4);
               var10002 = 2730600134593585862L;
               String var24 = var50;
               long var25 = var10;
               C_475e.method_46$d07b98bfef(var25, var24);
            }
         }
      }

      C_47MO var51 = C_476q.field_48;
      long var10004 = 2732226214140996949L;
      long var27 = var12;
      C_47TU var29 = this.settingDelay;
      double var10003 = var29.method_41$474dfaa627(var27);
      long var10006 = 2730547615586710880L;
      long var30 = var6;
      C_47TU var32 = this.settingDelay;
      double var53 = var32.method_43$474dfaa627(var30);
      long var10005 = 2730795830460828208L;
      double var33 = var53;
      double var35 = var10003;
      long var37 = var14;
      C_47MO var39 = var51;
      this.field_47 = var39.method_41$07400418b0(var37, var35, var33);
   }




   public void method_487$da8c82d5d4() {
        int var81;
      boolean var17;
      int var18;
      net.C_47rf var83;
      label203: {
         label199: {
            label204: {
               long var1 = a ^ 10205501970515L;
               long var3 = var1 ^ 60228979405177L;
               long var5 = var1 ^ 140471324494347L;
               long var7 = var1 ^ 23595595291902L;
               long var9 = var1 ^ 39702344730670L;
               long var11 = var1 ^ 44132535081594L;
               long var13 = var1 ^ 134924746040298L;
               long var15 = var1 ^ 28657421075362L;
               long var10000 = -4296666532977054161L;
               var17 = AirStuck_47Q4.method_45$aae029aa0a();
               long var10001 = -4300042412297064248L;
               net.minecraft.client.Minecraft var24 = field_43;
               var81 = ((var24.field_44m instanceof C_47pL) ? 1 : 0);
               label197:
               if (var17) {
                  if (var81 != 0) {
                     long var10002 = -4296938086340273491L;
                     long var25 = var5;
                     InvManager_47QL var27 = client.ClientGlobals.field_48.field_44f;
                     var81 = ((var27.method_46$0dd78e0064(var25)) ? 1 : 0);
                     if (!var17) {
                        break label197;
                     }

                     if (var81 == 0) {
                        net.C_47cu var82 = this.field_48;
                        long var10003 = -4300248322370975629L;
                        long var28 = var9;
                        client.setting.NumberSetting var30 = this.settingStartDelay;
                        double var89 = var30.method_44$474dfaa627(var28);
                        var10003 = -4300426455694715967L;
                        long var31 = var11;
                        double var33 = var89;
                        net.C_47cu var35 = var82;
                        var81 = ((var35.method_43$2ac7ee8710(var33, var31)) ? 1 : 0);
                        if (!var17) {
                           break label199;
                        }

                        if (var81 == 0) {
                           break label204;
                        }

                        var18 = 1;
                        int var19 = 5;

                        while (var19 < 9) {
                           var10001 = -4297369126650610501L;
                           net.minecraft.client.Minecraft var36 = field_43;
                           net.C_47rf var20 = ((net.C_47sT)var36.field_42P.field_429.field_46.get(var19)).method_48$ac4db64966();
                           if (var17) {
                              var83 = var20;
                              if (!var17) {
                                 break label203;
                              }

                              if (var20 != null) {
                                 var18 = 0;
                                 if (var17) {
                                    var10003 = -4296818789005391087L;
                                    long var37 = var15;
                                    long var39 = this.field_47;
                                    net.C_47cu var41 = this.field_46;
                                    if (var41.method_42$b0e346e6e3(var39, var37)) {
                                       net.C_47MO var91 = net.C_476q.field_48;
                                       long var10004 = -4300146254742516499L;
                                       long var42 = var7;
                                       net.C_47TU var44 = this.settingDelay;
                                       double var113 = var44.method_41$474dfaa627(var42);
                                       long var10006 = -4297344365423029032L;
                                       long var45 = var3;
                                       net.C_47TU var47 = this.settingDelay;
                                       double var114 = var47.method_43$474dfaa627(var45);
                                       long var10005 = -4297099449357390968L;
                                       double var48 = var114;
                                       double var50 = var113;
                                       long var52 = var13;
                                       net.C_47MO var54 = var91;
                                       this.field_47 = var54.method_41$07400418b0(var52, var50, var48);
                                       var10001 = -4300350779461884469L;
                                       client.setting.BooleanSetting var55 = this.settingDrop;
                                       boolean var84 = var55.method_49$aae029aa0a();
                                       ReverseAutoArmor_47QP var85;
                                       if (var17) {
                                          if (var84) {
                                             var10001 = -4296760148933329250L;
                                             net.minecraft.client.Minecraft var56 = field_43;
                                             var10002 = -4297369126650610501L;
                                             net.minecraft.client.Minecraft var57 = field_43;
                                             var10006 = -4297369126650610501L;
                                             net.minecraft.client.Minecraft var58 = field_43;
                                             var56.field_44K.method_42$f0ddb617a2(var57.field_42P.field_429.field_43, var19, 1, 4, var58.field_42P);
                                             var85 = this;
                                             if (var17) {
                                                if (this.field_47 != 0L) {
                                                   return;
                                                }

                                                var85 = this;
                                             }
                                          } else {
                                             var10001 = -4300042412297064248L;
                                             net.minecraft.client.Minecraft var59 = field_43;
                                             C_47pL var21 = (C_47pL)var59.field_44m;
                                             net.C_47sT var22 = var21.field_46M.method_46$4c10532da1(var19);

                                             try {
                                                var21.field_42 = true;
                                                var21.method_47$23922dd444(var22.field_40 + 2 + var21.field_46c, var22.field_46 + 2 + var21.field_433, 0);
                                             } catch (java.io.IOException var76) {
                                                throw new RuntimeException(var76);
                                             }

                                             var85 = this;
                                             if (var17) {
                                                if (this.field_47 != 0L) {
                                                   return;
                                                }

                                                var85 = this;
                                             }
                                          }
                                       } else {
                                          if (var84) {
                                             return;
                                          }

                                          var85 = this;
                                       }

                                       var10001 = -4297465963762178654L;
                                       net.C_47cu var60 = var85.field_46;
                                       var60.method_46$da8c82d5d4();
                                       var19++;
                                    } else {
                                       var19++;
                                    }
                                 }
                              } else {
                                 var19++;
                              }
                           }

                           if (!var17) {
                              break;
                           }
                        }

                        label183: {
                           var10001 = -4300350779461884469L;
                           client.setting.BooleanSetting var61 = this.settingBot;
                           int var87 = ((int) (var61.method_49$aae029aa0a() ? 1 : 0));
                           if (var17) {
                              if (var87 == 0) {
                                 break label183;
                              }

                              var87 = var18;
                           }

                           if (var17) {
                              if (var87 != 0) {
                                 if (var17) {
                                    if (this.field_43a) {
                                       var10002 = -4299933287142230839L;
                                       Object var62 = null;
                                       net.minecraft.client.Minecraft var63 = field_43;
                                       var63.method_43$7480b345ab((net.minecraft.client.gui.GuiScreen)var62);
                                       this.field_43a = false;
                                    }
                                 } else {
                                    this.field_43a = false;
                                 }
                              }
                           } else if (var87 != 0) {
                              var10002 = -4299933287142230839L;
                              Object var78 = null;
                              net.minecraft.client.Minecraft var79 = field_43;
                              var79.method_43$7480b345ab((net.minecraft.client.gui.GuiScreen)var78);
                              this.field_43a = false;
                           }
                        }

                        if (var17) {
                           break label204;
                        }
                     }
                  }

                  var10001 = -4297465963762178654L;
                  net.C_47cu var64 = this.field_48;
                  var64.method_46$da8c82d5d4();
                  var10001 = -4300042412297064248L;
                  net.minecraft.client.Minecraft var65 = field_43;
                  var81 = ((var65.field_44m instanceof C_47pL) ? 1 : 0);
               }

               if (!var17) {
                  break label199;
               }

               if (var81 != 0) {
                  var81 = ((this.field_43a) ? 1 : 0);
                  if (!var17) {
                     break label199;
                  }

                  if (this.field_43a) {
                     long var109 = -4299933287142230839L;
                     Object var66 = null;
                     net.minecraft.client.Minecraft var67 = field_43;
                     var67.method_43$7480b345ab((net.minecraft.client.gui.GuiScreen)var66);
                     this.field_43a = false;
                  }
               }
            }

            long var99 = -4300350779461884469L;
            client.setting.BooleanSetting var68 = this.settingBot;
            var81 = ((var68.method_49$aae029aa0a()) ? 1 : 0);
         }

         if (var17) {
            if (var81 == 0) {
               return;
            }

            long var100 = -4297369126650610501L;
            net.minecraft.client.Minecraft var69 = field_43;
            var81 = var69.field_42P.field_48y;
         }

         if (var17) {
            if (var81 != 10) {
               return;
            }

            long var101 = -4299996699197883229L;
            net.minecraft.client.Minecraft var70 = field_43;
            var81 = ((var70.method_44$aae029aa0a()) ? 1 : 0);
         }

         if (var17) {
            if (var81 == 0) {
               return;
            }

            var81 = 5;
         }

         var18 = var81;
         if (var18 >= 9) {
            return;
         }

         long var102 = -4297369126650610501L;
         net.minecraft.client.Minecraft var71 = field_43;
         var83 = ((net.C_47sT)var71.field_42P.field_429.field_46.get(var18)).method_48$ac4db64966();
      }

      while (true) {
         net.C_47rf var77 = var83;
         if (var17) {
            if (var77 != null) {
               long var103 = -4297055000021985521L;
               net.minecraft.client.Minecraft var72 = field_43;
               var72.method_40$f8db5d9e73().method_45$631790539f(new net.C_47jt(net.C_4713.OPEN_INVENTORY_ACHIEVEMENT));
               net.minecraft.client.Minecraft var88 = field_43;
               long var115 = -4297369126650610501L;
               net.minecraft.client.Minecraft var73 = field_43;
               C_47pL var104 = new C_47pL(var73.field_42P);
               long var110 = -4299933287142230839L;
               C_47pL var74 = var104;
               net.minecraft.client.Minecraft var75 = var88;
               var75.method_43$7480b345ab(var74);
               this.field_43a = true;
               if (var17) {
                  break;
               }
            }

            var18++;
         }

         if (!var17 || var18 >= 9) {
            break;
         }

         long var105 = -4297369126650610501L;
         net.minecraft.client.Minecraft var80 = field_43;
         var83 = ((net.C_47sT)var80.field_42P.field_429.field_46.get(var18)).method_48$ac4db64966();
      }
   }







    public ReverseAutoArmor_47QP(long a0) {
        super((java.lang.String) ("ReverseAutoArmor"),(java.lang.String) ("R\u00fcstungAusziehen"),(long) (((augustus.recovered.modules.player.ReverseAutoArmor_47QP.a ^ a0) ^ 10857377542518L)),(java.awt.Color) (new java.awt.Color((int) (252),(int) (186),(int) (3))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = ((augustus.recovered.modules.player.ReverseAutoArmor_47QP.a ^ a0) ^ 138066116738040L);
        long constructorKey2 = ((augustus.recovered.modules.player.ReverseAutoArmor_47QP.a ^ a0) ^ 133021269716333L);
        long constructorKey3 = ((augustus.recovered.modules.player.ReverseAutoArmor_47QP.a ^ a0) ^ 94160159462122L);
        client.setting.NumberSetting initialized4 = new client.setting.NumberSetting(this, "StartDelay", Double.longBitsToDouble(4641240890982006784L), constructorKey3, 0.0D, Double.longBitsToDouble(4645744490609377280L), 0);
        recovery$indy$flow$162(this, initialized4);
        net.C_47TU initialized5 = new net.C_47TU(constructorKey1, this, "Delay", Double.longBitsToDouble(4634626229029306368L), Double.longBitsToDouble(4638144666238189568L), 0.0D, Double.longBitsToDouble(4645744490609377280L), 0);
        recovery$indy$flow$165(this, initialized5);
        client.setting.BooleanSetting initialized6 = new client.setting.BooleanSetting(this, constructorKey2, "Drop", false);
        recovery$indy$flow$168(this, initialized6);
        client.setting.BooleanSetting initialized7 = new client.setting.BooleanSetting(this, constructorKey2, "Bot", false);
        recovery$indy$flow$171(this, initialized7);
        net.C_47cu initialized8 = new net.C_47cu();
        recovery$indy$flow$174(this, initialized8);
        net.C_47cu initialized9 = new net.C_47cu();
        recovery$indy$flow$177(this, initialized9);
        recovery$indy$flow$178(this, false);
    }



    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native void recovery$indy$flow$162(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$165(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$168(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$171(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$174(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$177(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$178(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.player.ReverseAutoArmor_47QP) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native void recovery$indy$1(Object var0, int var1, long var2, long var4, long var6);
   private static native String recovery$indy$2(int var0, long var1);
   private static native MethodHandle recovery$constant$3();
}
