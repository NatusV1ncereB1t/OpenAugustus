package augustus.recovered.modules.player;
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
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_4713;
import net.C_471y;
import net.C_472n;
import net.C_473U;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47FN;
import net.C_47JT;
import client.gui.ClickGuiScreen;
import net.C_47Lm;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import net.C_47Rw;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47UA;
import net.C_47Vc;
import net.C_47cu;
import net.C_47hi;
import net.C_47iC;
import net.C_47jt;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import net.C_47od;
import net.C_47oo;
import net.C_47pL;
import net.C_47pS;
import client.module.Category;
import net.C_47tj;
import net.C_47tz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class GuiMove_47Qc extends client.module.Module implements net.C_47JT,net.C_47hi,net.C_47Vc,net.C_47iC,net.C_47od,net.C_47FN {
    private final client.setting.MultiSelectSetting settingGuis = null; // Runtime access flags and ConstantValue are restored from the original class.
    public client.setting.BooleanSetting settingNoInvPacket; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_471y field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Class b(long a0,long a1);

   private double method_46$474dfaa627(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 86379576182507L;
      boolean var5 = recovery$indy$1(759493168867558236L, var1);
      C_471y var10000 = this.field_48;
      if (!var5) {
         if (this.field_48 == null) {
            return 1.0;
         }

         var10000 = this.field_48;
      }

      return recovery$indy$3(recovery$indy$2(var10000, 758013219693159766L, var1), var3, 757259924884644558L, var1);
   }



   public void method_46$908df054f5(long var1, C_47tz var3) {
      long var4 = (var1 ^ 38105643925747L) >>> 8;
      int var6 = (int)((var1 ^ 38105643925747L) << 56 >>> 56);
      long var7 = var1 ^ 2022096815418L;
      long var9 = var1 ^ 51845225735838L;
      boolean var11 = recovery$indy$4(5475804818356548084L, var1);
      if (recovery$indy$5(this, var4, (byte)var6, 5472234362785526998L, var1)) {
         boolean var10001;
         label33: {
            label37: {
               var10001 = recovery$indy$6(this, var7, 5470859948479265520L, var1);
               boolean var10002 = var11;
               if (var1 >= 0L) {
                  if (var11) {
                     if (!var10001) {
                        break label37;
                     }

                     var10001 = recovery$indy$7(var9, 5472132284822105899L, var1);
                  }

                  var10002 = var11;
               }

               if (!var10002) {
                  break label33;
               }

               if (var10001) {
                  var10001 = true;
                  break label33;
               }
            }

            var10001 = false;
         }

         recovery$indy$8(var3, var10001, 5475634092358927610L, var1);
      }
   }



   public void method_46$486e3ab5ea(C_47tj var1, long var2) {
      long var4 = (var2 ^ 17940491817266L) >>> 8;
      int var6 = (int)((var2 ^ 17940491817266L) << 56 >>> 56);
      long var7 = var2 ^ 136604123933729L;
      boolean var9 = recovery$indy$9(-2721082915647053771L, var2);
      boolean var10000 = recovery$indy$10(this, var4, (byte)var6, -2724542732860201705L, var2);
      if (var9) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$11(this, var7, -2720439577619568590L, var2).equals(recovery$indy$12(29440, 9045625062494960040L ^ var2));
      }

      if (var10000) {
         recovery$indy$13(var1, true, -2722953938560178936L, var2);
      }
   }



    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$9035875d26(long var1, C_47ob var3) {
      boolean var4 = recovery$indy$14(-7195943357914782165L, var1);
      C_473U var5 = recovery$indy$15(var3, -7193756315835108844L, var1);
      boolean var10000 = var5 instanceof C_47jt;
      if (var4) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$16(this.settingNoInvPacket, -7193382153554979152L, var1);
      }

      if (var10000) {
         C_47jt var6 = (C_47jt)var5;
         if (var6.method_41$755b7fcdef() == C_4713.OPEN_INVENTORY_ACHIEVEMENT) {
            var3.cancel();
         }
      }
   }



   private boolean method_40$9b7b229cf8(int var1, long var2, int var4) {
      long var5 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 63806622606630L;

      try {
         return recovery$indy$17(var4, var7, -2846603339635492722L, var5);
      } catch (Exception var10) {
         return false;
      }
   }



   private boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$18(5973338128950929644L, var1);
      C_471y var10000 = this.field_48;
      if (var3) {
         if (this.field_48 == null) {
            return false;
         }

         var10000 = this.field_48;
      }

      boolean var5 = recovery$indy$20(recovery$indy$19(var10000, 5976432844447681023L, var1), 5975337508772927607L, var1);
      return !var3 ? var5 : var5;
   }



   private boolean method_48$05d3808578(long var1, int var3) {
      var1 = a ^ var1;
      byte var4 = (byte) ((recovery$indy$21(-1675224488277237482L, var1)) ? 1 : 0);
      int var10000 = var3;
      if (var4 == 0) {
         if (var3 <= 0) {
            return false;
         }

         var10000 = var3;
      }

      short var10001 = var4;
      if (var1 > 0L) {
         if (var4 != 0) {
            return var10000 != 0;
         }

         var10001 = 256;
      }

      return var10000 < var10001;
   }



   private double method_49$474dfaa627(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 65043697208755L;
      boolean var5 = recovery$indy$22(-4480458598087129084L, var1);
      C_471y var10000 = this.field_48;
      if (!var5) {
         if (this.field_48 == null) {
            return 1.0;
         }

         var10000 = this.field_48;
      }

      return recovery$indy$24(recovery$indy$23(var10000, -4484092742494632935L, var1), var3, -4478224804408677994L, var1);
   }



   public void method_45$ca1f9e88a9(C_47tz var1, long var2) {
      long var4 = (var2 ^ 135772794229614L) >>> 8;
      int var6 = (int)((var2 ^ 135772794229614L) << 56 >>> 56);
      long var7 = var2 ^ 25360335367805L;
      long var9 = var2 ^ 96481623795179L;
      boolean var11 = recovery$indy$25(1756492554689827254L, var2);
      if (recovery$indy$26(this, var4, (byte)var6, 1759801331946694475L, var2)) {
         boolean var10001;
         label40: {
            label45: {
               var10001 = recovery$indy$27(this, var9, 1762545677547407961L, var2).equals(recovery$indy$28(19501, 7271050271872746710L ^ var2));
               boolean var10002 = var11;
               if (var2 > 0L) {
                  if (!var11) {
                     if (!var10001) {
                        break label45;
                     }

                     var10001 = recovery$indy$29(this, var7, 1757360099457608302L, var2).equals(recovery$indy$30(8741, 4001085609974131416L ^ var2));
                  }

                  var10002 = var11;
               }

               if (var10002) {
                  break label40;
               }

               if (!var10001 || recovery$indy$31(field_43, 1761452297880289199L, var2) != null) {
                  var10001 = true;
                  break label40;
               }
            }

            var10001 = false;
         }

         recovery$indy$32(var1, var10001, 1760623599238804298L, var2);
      }
   }



   private String method_45$5f9dc63072(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 133999484323204L;
      boolean var5 = recovery$indy$33(30197221650254269L, var1);
      C_471y var10000 = this.field_48;
      if (!var5) {
         if (this.field_48 == null) {
            return "";
         }

         var10000 = this.field_48;
      }

      return recovery$indy$35(recovery$indy$34(var10000, 34989822005858619L, var1), var3, 27536264530385158L, var1);
   }



   private C_471y method_45$3ea53d1dff(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$36(-8891633796636836205L, var1);
      GuiScreen var10000 = recovery$indy$37(field_43, -8892809965192555151L, var1);
      if (var3) {
         if (var10000 == null) {
            return null;
         }

         var10000 = recovery$indy$38(field_43, -8892809965192555151L, var1);
      }

      boolean var5 = var10000 instanceof C_47pL;
      boolean var10001 = var3;
      if (var1 > 0L) {
         if (var3) {
            if (var5) {
               return C_471y.INVENTORY;
            }

            var5 = recovery$indy$39(field_43, -8892809965192555151L, var1) instanceof C_47pS;
         }

         var10001 = var3;
      }

      if (var10001) {
         if (var5) {
            return C_471y.CONTAINER;
         }

         var5 = recovery$indy$40(field_43, -8892809965192555151L, var1) instanceof C_47Lm;
      }

      return var5 ? C_471y.DEATH_SCREEN : C_471y.OTHER_SCREENS;
   }



   private boolean method_45$64bf811c69(long var1, byte var3) {
      boolean var11;
      boolean var14;
      long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
      long var10001 = var4 ^ 122879126143661L;
      int var6 = (int)((var4 ^ 122879126143661L) >>> 48);
      int var7 = (int)((var4 ^ 122879126143661L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      boolean var9 = recovery$indy$41(8569898146449637176L, var4);
      Minecraft var10000 = field_43;
      if (!var9) {
         if (recovery$indy$42(field_43, 8566528932139443973L, var4) == null) {
            return false;
         }

         var10000 = field_43;
      }

      label87: {
         label86: {
            label97: {
               label98: {
                  EntityPlayerSP var10 = recovery$indy$43(var10000, 8569494480689814951L, var4);
                  if (!var9) {
                     if (var10 == null) {
                        break label98;
                     }

                     var10 = recovery$indy$44(field_43, 8569494480689814951L, var4);
                  }

                  var11 = var10.field_48M;
                  if (var9) {
                     break label86;
                  }

                  if (var10.field_48M) {
                     break label97;
                  }
               }

               var11 = recovery$indy$45(this, (char)var6, var7, (short)var8, 8573380872122568301L, var4);
               var14 = var9;
               if (var3 <= 0) {
                  break label87;
               }

               if (var9) {
                  break label86;
               }

               if (var11) {
                  return false;
               }
            }

            var11 = GuiScreen.field_43w.contains(recovery$indy$46(field_43, 8566528932139443973L, var4));
         }

         var14 = var9;
      }

      label66: {
         if (!var14) {
            if (!var11) {
               break label66;
            }

            var11 = recovery$indy$47(field_43, 8566528932139443973L, var4) instanceof ClickGuiScreen;
         }

         if (!var11) {
            return false;
         }
      }

      C_471y var12 = this.field_48;
      if (!var9) {
         if (this.field_48 == null) {
            return false;
         }

         var12 = this.field_48;
      }

      boolean var13 = recovery$indy$48(var12, 8570077656915028412L, var4);
      return var9 ? var13 : var13;
   }




   public void method_47$05bd94f678(C_472n var1, long var2) {
      boolean var23;
      long var4 = var2 ^ 100213140004028L;
      long var6 = (var2 ^ 103563931210707L) >>> 8;
      int var8 = (int)((var2 ^ 103563931210707L) << 56 >>> 56);
      int var9 = (int)((var2 ^ 106191933635907L) >>> 32);
      long var10 = (var2 ^ 106191933635907L) << 32 >>> 32;
      long var12 = var2 ^ 91197289745917L;
      long var14 = var2 ^ 83170855221208L;
      int var16 = (int)((var2 ^ 4910600371078L) >>> 32);
      long var17 = (var2 ^ 4910600371078L) << 32 >>> 32;
      long var19 = var2 ^ 55372391427776L;
      boolean var21 = recovery$indy$49(6403403853858377995L, var2);
      GuiMove_47Qc var10000 = this;
      if (!var21) {
         label209: {
            C_471y var22 = this.field_48;
            if (var2 > 0L) {
               if (this.field_48 != C_471y.OTHER_SCREENS) {
                  break label209;
               }

               var22 = this.field_48;
            }

            recovery$indy$51(recovery$indy$50(var22, 6403255900908081271L, var2), true, 6401653775045523886L, var2);
         }

         var10000 = this;
      }

      boolean var25;
      label203: {
         var23 = recovery$indy$52(var10000, var19, 6403627187834120915L, var2).equals(recovery$indy$53(8741, 4001047381638392421L ^ var2));
         label202:
         if (!var21) {
            if (var23) {
               var23 = recovery$indy$54(this, var6, (byte)var8, 6399954476451391478L, var2);
               if (var21) {
                  break label202;
               }

               label198:
               if (var23) {
                  var23 = recovery$indy$56(
                     this, var12, recovery$indy$55(field_43, 6398811639728983251L, var2).field_45H.method_45$8abf5c6871(), 6400347473090513159L, var2
                  );
                  var25 = var21;
                  if (var2 >= 0L) {
                     if (!var21) {
                        if (var23) {
                           C_47UA.method_41$f0a4aeb8bd(
                              recovery$indy$57(field_43, 6398811639728983251L, var2).field_45H.method_45$8abf5c6871(),
                              recovery$indy$59(
                                 this,
                                 var9,
                                 var10,
                                 recovery$indy$58(field_43, 6398811639728983251L, var2).field_45H.method_45$8abf5c6871(),
                                 6399333844050248970L,
                                 var2
                              )
                           );
                        }

                        var23 = recovery$indy$61(
                           this, var12, recovery$indy$60(field_43, 6398811639728983251L, var2).field_42R.method_45$8abf5c6871(), 6400347473090513159L, var2
                        );
                     }

                     var25 = var21;
                  }

                  if (var2 > 0L) {
                     if (!var25) {
                        if (var23) {
                           C_47UA.method_41$f0a4aeb8bd(
                              recovery$indy$62(field_43, 6398811639728983251L, var2).field_42R.method_45$8abf5c6871(),
                              recovery$indy$64(
                                 this,
                                 var9,
                                 var10,
                                 recovery$indy$63(field_43, 6398811639728983251L, var2).field_42R.method_45$8abf5c6871(),
                                 6399333844050248970L,
                                 var2
                              )
                           );
                        }

                        var23 = recovery$indy$66(
                           this, var12, recovery$indy$65(field_43, 6398811639728983251L, var2).field_42b.method_45$8abf5c6871(), 6400347473090513159L, var2
                        );
                     }

                     var25 = var21;
                  }

                  if (var2 > 0L) {
                     if (!var25) {
                        if (var23) {
                           C_47UA.method_41$f0a4aeb8bd(
                              recovery$indy$67(field_43, 6398811639728983251L, var2).field_42b.method_45$8abf5c6871(),
                              recovery$indy$69(
                                 this,
                                 var9,
                                 var10,
                                 recovery$indy$68(field_43, 6398811639728983251L, var2).field_42b.method_45$8abf5c6871(),
                                 6399333844050248970L,
                                 var2
                              )
                           );
                        }

                        var23 = recovery$indy$71(
                           this, var12, recovery$indy$70(field_43, 6398811639728983251L, var2).field_42P.method_45$8abf5c6871(), 6400347473090513159L, var2
                        );
                     }

                     var25 = var21;
                  }

                  if (var2 >= 0L) {
                     if (!var25) {
                        if (var23) {
                           C_47UA.method_41$f0a4aeb8bd(
                              recovery$indy$72(field_43, 6398811639728983251L, var2).field_42P.method_45$8abf5c6871(),
                              recovery$indy$74(
                                 this,
                                 var9,
                                 var10,
                                 recovery$indy$73(field_43, 6398811639728983251L, var2).field_42P.method_45$8abf5c6871(),
                                 6399333844050248970L,
                                 var2
                              )
                           );
                        }

                        var23 = recovery$indy$75(this, var4, 6400565945678277375L, var2);
                     }

                     var25 = var21;
                  }

                  label190: {
                     label189:
                     if (!var25) {
                        if (var23) {
                           var23 = recovery$indy$77(
                              this, var12, recovery$indy$76(field_43, 6398811639728983251L, var2).field_44q.method_45$8abf5c6871(), 6400347473090513159L, var2
                           );
                           var25 = var21;
                           if (var2 <= 0L) {
                              break label190;
                           }

                           if (var21) {
                              break label189;
                           }

                           if (var23) {
                              C_47UA.method_41$f0a4aeb8bd(
                                 recovery$indy$78(field_43, 6398811639728983251L, var2).field_44q.method_45$8abf5c6871(),
                                 recovery$indy$80(
                                    this,
                                    var9,
                                    var10,
                                    recovery$indy$79(field_43, 6398811639728983251L, var2).field_44q.method_45$8abf5c6871(),
                                    6399333844050248970L,
                                    var2
                                 )
                              );
                           }
                        }

                        var23 = recovery$indy$81(this, var14, 6399743320380351297L, var2);
                     }

                     var25 = var21;
                  }

                  label179: {
                     label178:
                     if (!var25) {
                        if (var23) {
                           var23 = recovery$indy$83(
                              this, var12, recovery$indy$82(field_43, 6398811639728983251L, var2).field_44W.method_45$8abf5c6871(), 6400347473090513159L, var2
                           );
                           var25 = var21;
                           if (var2 <= 0L) {
                              break label179;
                           }

                           if (var21) {
                              break label178;
                           }

                           if (var23) {
                              C_47UA.method_41$f0a4aeb8bd(
                                 recovery$indy$84(field_43, 6398811639728983251L, var2).field_44W.method_45$8abf5c6871(),
                                 recovery$indy$86(
                                    this,
                                    var9,
                                    var10,
                                    recovery$indy$85(field_43, 6398811639728983251L, var2).field_44W.method_45$8abf5c6871(),
                                    6399333844050248970L,
                                    var2
                                 )
                              );
                              if (!var21) {
                                 break label198;
                              }
                           }
                        }

                        var23 = recovery$indy$88(
                           this, var12, recovery$indy$87(field_43, 6398811639728983251L, var2).field_44W.method_45$8abf5c6871(), 6400347473090513159L, var2
                        );
                     }

                     var25 = var21;
                  }

                  if (var2 <= 0L) {
                     break label203;
                  }

                  if (var25) {
                     break label202;
                  }

                  if (var23) {
                     C_47UA.method_41$f0a4aeb8bd(recovery$indy$89(field_43, 6398811639728983251L, var2).field_44W.method_45$8abf5c6871(), false);
                  }
               }
            }

            var23 = recovery$indy$90(this, var6, (byte)var8, 6399954476451391478L, var2);
         }

         var25 = var21;
      }

      label158: {
         label157:
         if (!var25) {
            if (var23) {
               var23 = recovery$indy$91(this, var16, var17, 6397812420465906035L, var2);
               var25 = var21;
               if (var2 < 0L) {
                  break label158;
               }

               if (var21) {
                  break label157;
               }

               if (var23) {
                  recovery$indy$93(var1, (float)(recovery$indy$92(var1, 6403734111019669457L, var2) * 0.3), 6400276607639202008L, var2);
                  recovery$indy$95(var1, (float)(recovery$indy$94(var1, 6398941914689368190L, var2) * 0.3), 6400069062944718798L, var2);
               }
            }

            var23 = recovery$indy$96(this, var6, (byte)var8, 6399954476451391478L, var2);
         }

         var25 = var21;
      }

      if (!var25) {
         if (!var23) {
            return;
         }

         var23 = recovery$indy$97(this, var19, 6403627187834120915L, var2).equals(recovery$indy$98(29440, 9045702435276946249L ^ var2));
      }

      if (var23) {
         recovery$indy$99(var1, true, 6401196101516615201L, var2);
      }
   }







   public void method_47$2fe7f6c171(C_47Rw var1, long var2) {
      double var25;
      long var4 = (var2 ^ 73373858832586L) >>> 8;
      int var6 = (int)((var2 ^ 73373858832586L) << 56 >>> 56);
      long var7 = var2 ^ 111383686274222L;
      long var9 = var2 ^ 18599029643254L;
      long var11 = var2 ^ 114336921277776L;
      long var13 = var2 ^ 99971808209961L;
      long var10001 = var2 ^ 86675841129236L;
      int var15 = (int)((var2 ^ 86675841129236L) >>> 32);
      int var16 = (int)((var2 ^ 86675841129236L) << 32 >>> 48);
      int var17 = (int)(var10001 << 48 >>> 48);
      long var18 = var2 ^ 51501324492249L;
      boolean var20 = recovery$indy$100(3153812128743805389L, var2);
      if (recovery$indy$101(this, var4, (byte)var6, 3154815774687761647L, var2)) {
         Minecraft var10000 = field_43;
         if (var20) {
            if (recovery$indy$102(field_43, 3154878414690286127L, var2) == null) {
               return;
            }

            var10000 = field_43;
         }

         double var21;
         label97: {
            var21 = recovery$indy$104(recovery$indy$103(var10000, 3154481600448790669L, var2).field_48h, var11, 3158010553770819457L, var2)
               ? recovery$indy$105(this, var7, 3155929197200235689L, var2)
               : recovery$indy$106(this, var9, 3154038351235921307L, var2);
            boolean var23 = var20;
            if (var2 >= 0L) {
               if (!var20) {
                  break label97;
               }

               var23 = recovery$indy$107(this, var18, 3154591720125798858L, var2).equals(recovery$indy$108(29440, 9045716226089617488L ^ var2));
            }

            label98: {
               if (var2 > 0L) {
                  if (!var23) {
                     break label98;
                  }

                  var23 = recovery$indy$109(this.field_49, 300L, var13, 3155486880716020549L, var2);
               }

               boolean var26 = var20;
               if (var2 >= 0L) {
                  if (var20) {
                     if (!var23) {
                        break label98;
                     }

                     var23 = recovery$indy$110(field_43, 3154481600448790669L, var2).field_48M;
                  }

                  var26 = var20;
               }

               label71: {
                  if (var26) {
                     if (!var23) {
                        break label98;
                     }

                     float var24 = recovery$indy$111(field_43, 3154481600448790669L, var2).field_48h;
                     if (var2 >= 0L) {
                        var25 = Math.toDegrees(recovery$indy$112(var15, var16, var24, var17, 3158842019239356918L, var2));
                        if (!var20) {
                           break label71;
                        }

                        var24 = (float)var25;
                     }

                     var23 = recovery$indy$113(var24, var11, 3158010553770819457L, var2);
                  }

                  var25 = var23 ? 2.72 : 1.0;
               }

               var21 = var25;
            }

            recovery$indy$115(var1, recovery$indy$114(var1, 3157095833864253027L, var2) * var21, 3154712616946439513L, var2);
         }

         recovery$indy$117(var1, recovery$indy$116(var1, 3154249887392658746L, var2) * var21, 3157355527404595515L, var2);
      }
   }




   private String method_43$5f9dc63072(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 63154919296530L;
      boolean var5 = recovery$indy$118(863856160045056555L, var1);
      C_471y var10000 = this.field_48;
      if (!var5) {
         if (this.field_48 == null) {
            return "";
         }

         var10000 = this.field_48;
      }

      return recovery$indy$120(recovery$indy$119(var10000, 861424781351300688L, var1), var3, 862321377983091344L, var1);
   }



   public void method_43$ca1f9e88a9(C_47tz var1, long var2) {
      long var4 = (var2 ^ 88888080428934L) >>> 8;
      int var6 = (int)((var2 ^ 88888080428934L) << 56 >>> 56);
      long var7 = var2 ^ 9985179174339L;
      long var9 = var2 ^ 66775577858709L;
      long var11 = var2 ^ 136426141718787L;
      boolean var13 = recovery$indy$121(-1979196762547999394L, var2);
      if (recovery$indy$122(this, var4, (byte)var6, -1980393790284768349L, var2)) {
         boolean var10001 = recovery$indy$123(this, var11, -1973145774216448335L, var2).equals(recovery$indy$124(22709, 8018376441878441144L ^ var2));
         if (!var13) {
            var10001 = !var10001;
         }

         label49: {
            label56: {
               recovery$indy$125(var1, var10001, -1980189042909735071L, var2);
               var10001 = recovery$indy$126(this, var11, -1973145774216448335L, var2).equals(recovery$indy$127(9908, 4918702957794235054L ^ var2));
               boolean var10002 = var13;
               if (var2 > 0L) {
                  if (!var13) {
                     if (!var10001) {
                        break label56;
                     }

                     var10001 = recovery$indy$128(this, var9, -1978401742659561850L, var2).equals(recovery$indy$129(8741, 4001058501394798128L ^ var2));
                  }

                  var10002 = var13;
               }

               if (var10002) {
                  break label49;
               }

               if (!var10001 || recovery$indy$130(field_43, -1974331304729263289L, var2) != null) {
                  var10001 = true;
                  break label49;
               }
            }

            var10001 = false;
         }

         recovery$indy$131(var1, var7, var10001, -1980606975166181133L, var2);
      }
   }




   private boolean method_41u$0dd78e0064(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$132(4143768922395624328L, var1);
      C_471y var10000 = this.field_48;
      if (var3) {
         if (this.field_48 == null) {
            return false;
         }

         var10000 = this.field_48;
      }

      boolean var5 = recovery$indy$134(recovery$indy$133(var10000, 4144328999805085062L, var1), 4145767202703880979L, var1);
      return !var3 ? var5 : var5;
   }



   private boolean method_41a$b4bb6d006d(char var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      boolean var6 = recovery$indy$135(-8528898425152454539L, var4);
      C_471y var10000 = this.field_48;
      if (!var6) {
         if (this.field_48 == null) {
            return false;
         }

         var10000 = this.field_48;
      }

      boolean var7 = recovery$indy$137(recovery$indy$136(var10000, -8524388909343860125L, var4), -8526830608198433999L, var4);
      return var6 ? var7 : var7;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$138(this, 36, var3, -7103311576644058475L, var1);
      recovery$indy$139(this, 21, var3, -7103311576644058475L, var1);
      recovery$indy$140(this, 43, var3, -7103311576644058475L, var1);
      recovery$indy$141(this, 26, var3, -7103311576644058475L, var1);
      recovery$indy$142(this, 20, var3, -7103311576644058475L, var1);
      recovery$indy$143(this, 33, var3, -7103311576644058475L, var1);
   }



   public boolean method_41f$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = (var1 ^ 3742677465085L) >>> 8;
      int var5 = (int)((var1 ^ 3742677465085L) << 56 >>> 56);
      long var6 = var1 ^ 105685861041075L;
      boolean var8 = recovery$indy$144(9003776162050639610L, var1);
      boolean var10000 = recovery$indy$145(this, var6, 9003001224645673713L, var1);
      if (var8) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$146(this, var3, (byte)var5, 9007034223444313048L, var1);
      }

      return !var8 ? var10000 : var10000;
   }



   private boolean method_41v$0dd78e0064(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$147(189159486465362806L, var1);
      C_471y var10000 = this.field_48;
      if (!var3) {
         if (this.field_48 == null) {
            return false;
         }

         var10000 = this.field_48;
      }

      boolean var5 = recovery$indy$149(recovery$indy$148(var10000, 192887363495520703L, var1), 191929804141365298L, var1);
      return var3 ? var5 : var5;
   }



   private boolean method_41R$800bd538b0(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;
      boolean var6 = recovery$indy$150(-7008939456792406163L, var4);
      C_471y var10000 = this.field_48;
      if (!var6) {
         if (this.field_48 == null) {
            return false;
         }

         var10000 = this.field_48;
      }

      boolean var7 = recovery$indy$152(recovery$indy$151(var10000, -7013570106363278053L, var4), -7011288653998943191L, var4);
      return var6 ? var7 : var7;
   }



   private boolean method_419$0dd78e0064(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$153(8297679503386917617L, var1);
      C_471y var10000 = this.field_48;
      if (!var3) {
         if (this.field_48 == null) {
            return false;
         }

         var10000 = this.field_48;
      }

      boolean var5 = recovery$indy$155(recovery$indy$154(var10000, 8301898153466092979L, var1), 8299746143251429813L, var1);
      return var3 ? var5 : var5;
   }



   public boolean method_41L$0dd78e0064(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$156(-3331068451372061748L, var1);
      C_471y var10000 = this.field_48;
      if (var3) {
         if (this.field_48 == null) {
            return false;
         }

         var10000 = this.field_48;
      }

      boolean var5 = recovery$indy$158(recovery$indy$157(var10000, -3331310963747956369L, var1), -3329131770558424233L, var1);
      return !var3 ? var5 : var5;
   }



   public void method_45q$e45a9973e5(long var1) {
      long var3 = var1 ^ 51659978439481L;
      long var5 = (var1 ^ 48277267526742L) >>> 8;
      int var7 = (int)((var1 ^ 48277267526742L) << 56 >>> 56);
      int var8 = (int)((var1 ^ 23416334588614L) >>> 32);
      long var9 = (var1 ^ 23416334588614L) << 32 >>> 32;
      long var11 = var1 ^ 38717561652770L;
      long var13 = var1 ^ 43057856260728L;
      long var15 = var1 ^ 68702556033117L;
      long var17 = var1 ^ 56896567818421L;
      long var19 = var1 ^ 78635844094277L;
      byte var21 = ((byte) (recovery$indy$flow$315(4564677739444749649L, var1) ? 1 : 0));
      this.field_48 = (net.C_471y)recovery$indy$flow$316(this, var11, 4562035255468881679L, var1);
      if (var21 != 0) {
         if (!recovery$indy$flow$318(this, var5, (byte)var7, 4563344240280273011L, var1)) {
            recovery$indy$flow$320(this.field_49, 4563071340085144523L, var1);
         } else {
            String var24 = (String)recovery$indy$flow$321(this, var19, 4565301090682637654L, var1);
            byte var23 = -1;
            switch (var24.hashCode()) {
               case -2099899231:
                  byte var34;
                  byte var10001;
                  label2699: {
                     label2700: {
                        if (var24.equals((String)recovery$indy$flow$323(29440, 9045690584020557004L ^ var1))) {
                           var23 = 0;
                           var34 = var21;
                           if (var1 >= 0L) {
                              if (var21 == 0) {
                                 var34 = ((byte) (var24.equals((String)recovery$indy$flow$325(17989, 5638405699775965588L ^ var1)) ? 1 : 0));
                                 var10001 = var21;
                                 if (var1 > 0L) {
                                    if (var21 != 0) {
                                       if (var34 != 0) {
                                          var23 = 1;
                                       }

                                       var34 = var23;
                                    }

                                    var10001 = var21;
                                    break label2699;
                                 }
                              } else {
                                 var34 = var23;
                                 var10001 = var21;
                                 if (var1 > 0L) {
                                    break label2699;
                                 }
                              }
                              break label2700;
                           }

                           var10001 = var21;
                        } else {
                           var34 = var23;
                           var10001 = var21;
                           if (var1 > 0L) {
                              break label2699;
                           }

                           if (var1 >= 0L) {
                              break label2700;
                           }
                        }

                        if (var10001 != 0) {
                           if (var34 == 0) {
                              return;
                           }

                           var34 = ((byte) (recovery$indy$flow$423(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var34 != 0) {
                           ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        return;
                     }

                     if (var10001 != 0) {
                        if (var34 == 0) {
                           return;
                        }

                        var34 = ((byte) (recovery$indy$flow$333(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var34 != 0) {
                           ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var34 = ((byte) (recovery$indy$flow$347(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var34 != 0) {
                           ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var34 = ((byte) (recovery$indy$flow$361(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var34 == 0) {
                           return;
                        }

                        var34 = ((byte) (recovery$indy$flow$423(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var34 != 0) {
                        ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                           this,
                           var8,
                           var9,
                           ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4560587183705383567L,
                           var1
                        );
                     }

                     return;
                  }

                  if (var10001 != 0) {
                     switch (var34) {
                        case 0:
                           boolean var36 = recovery$indy$flow$328(this.field_49, 300L, var17, 4564085732226944985L, var1);
                           if (var21 != 0) {
                              if (!var36) {
                                 break;
                              }

                              var36 = recovery$indy$flow$333(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var21 != 0) {
                              if (var36) {
                                 ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }

                              var36 = recovery$indy$flow$347(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var21 != 0) {
                              if (var36) {
                                 ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }

                              var36 = recovery$indy$flow$361(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var21 != 0) {
                              if (var36) {
                                 ((net.C_47oo)recovery$indy$flow$363(field_43, 4559983202195417942L, var1)).field_42b.field_45 = recovery$indy$flow$369(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$366(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }

                              var36 = recovery$indy$flow$375(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$372(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var21 != 0) {
                              if (var36) {
                                 ((net.C_47oo)recovery$indy$flow$377(field_43, 4559983202195417942L, var1)).field_42P.field_45 = recovery$indy$flow$383(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$380(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }

                              var36 = recovery$indy$flow$389(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$386(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var21 != 0) {
                              if (var36) {
                                 ((net.C_47oo)recovery$indy$flow$391(field_43, 4559983202195417942L, var1)).field_40.field_45 = recovery$indy$flow$397(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$394(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }

                              var36 = recovery$indy$flow$403(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$400(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var21 != 0) {
                              label2310:
                              if (var36) {
                                 if (recovery$indy$flow$404(this, var15, 4563555430416401604L, var1)) {
                                    ((net.C_47oo)recovery$indy$flow$406(field_43, 4559983202195417942L, var1)).field_44W.field_45 = recovery$indy$flow$412(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$409(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                    if (var21 != 0) {
                                       break label2310;
                                    }
                                 }

                                 ((net.C_47oo)recovery$indy$flow$415(field_43, 4559983202195417942L, var1)).field_44W.field_45 = false;
                              }

                              var36 = recovery$indy$flow$418(this, var3, 4563858397961178490L, var1);
                           }

                           if (var21 != 0) {
                              if (!var36) {
                                 break;
                              }

                              var36 = recovery$indy$flow$423(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var36) {
                              ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                           }
                           break;
                        case 1:
                           boolean var35 = recovery$indy$flow$333(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           );
                           if (var21 != 0) {
                              if (var35) {
                                 ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }

                              var35 = recovery$indy$flow$347(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var21 != 0) {
                              if (var35) {
                                 ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }

                              var35 = recovery$indy$flow$361(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var21 != 0) {
                              if (var35) {
                                 ((net.C_47oo)recovery$indy$flow$363(field_43, 4559983202195417942L, var1)).field_42b.field_45 = recovery$indy$flow$369(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$366(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }

                              var35 = recovery$indy$flow$375(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$372(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var21 != 0) {
                              if (var35) {
                                 ((net.C_47oo)recovery$indy$flow$377(field_43, 4559983202195417942L, var1)).field_42P.field_45 = recovery$indy$flow$383(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$380(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }

                              var35 = recovery$indy$flow$389(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$386(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var21 != 0) {
                              if (var35) {
                                 ((net.C_47oo)recovery$indy$flow$391(field_43, 4559983202195417942L, var1)).field_40.field_45 = recovery$indy$flow$397(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$394(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }

                              var35 = recovery$indy$flow$403(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$400(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var21 != 0) {
                              label2288:
                              if (var35) {
                                 if (recovery$indy$flow$404(this, var15, 4563555430416401604L, var1)) {
                                    ((net.C_47oo)recovery$indy$flow$406(field_43, 4559983202195417942L, var1)).field_44W.field_45 = recovery$indy$flow$412(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$409(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                    if (var21 != 0) {
                                       break label2288;
                                    }
                                 }

                                 ((net.C_47oo)recovery$indy$flow$415(field_43, 4559983202195417942L, var1)).field_44W.field_45 = false;
                              }

                              var35 = recovery$indy$flow$418(this, var3, 4563858397961178490L, var1);
                           }

                           if (var21 != 0) {
                              if (!var35) {
                                 return;
                              }

                              var35 = recovery$indy$flow$423(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                           }

                           if (var35) {
                              ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                           }
                     }
                  } else {
                     if (var21 != 0) {
                        if (var34 == 0) {
                           return;
                        }

                        var34 = ((byte) (recovery$indy$flow$333(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var34 != 0) {
                           ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var34 = ((byte) (recovery$indy$flow$347(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var34 != 0) {
                           ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var34 = ((byte) (recovery$indy$flow$361(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var34 != 0) {
                           ((net.C_47oo)recovery$indy$flow$363(field_43, 4559983202195417942L, var1)).field_42b.field_45 = recovery$indy$flow$369(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$366(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var34 = ((byte) (recovery$indy$flow$375(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$372(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var34 != 0) {
                           ((net.C_47oo)recovery$indy$flow$377(field_43, 4559983202195417942L, var1)).field_42P.field_45 = recovery$indy$flow$383(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$380(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var34 = ((byte) (recovery$indy$flow$389(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$386(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var34 != 0) {
                           ((net.C_47oo)recovery$indy$flow$391(field_43, 4559983202195417942L, var1)).field_40.field_45 = recovery$indy$flow$397(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$394(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var34 = ((byte) (recovery$indy$flow$403(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$400(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        label2339:
                        if (var34 != 0) {
                           if (recovery$indy$flow$404(this, var15, 4563555430416401604L, var1)) {
                              ((net.C_47oo)recovery$indy$flow$406(field_43, 4559983202195417942L, var1)).field_44W.field_45 = recovery$indy$flow$412(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$409(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                              if (var21 != 0) {
                                 break label2339;
                              }
                           }

                           ((net.C_47oo)recovery$indy$flow$415(field_43, 4559983202195417942L, var1)).field_44W.field_45 = false;
                        }

                        var34 = ((byte) (recovery$indy$flow$418(this, var3, 4563858397961178490L, var1) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var34 == 0) {
                           return;
                        }

                        var34 = ((byte) (recovery$indy$flow$423(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var34 != 0) {
                        ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                           this,
                           var8,
                           var9,
                           ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4560587183705383567L,
                           var1
                        );
                     }
                  }

                  return;
               case 63955982:
                  byte var31 = ((byte) (var24.equals((String)recovery$indy$flow$325(17989, 5638405699775965588L ^ var1)) ? 1 : 0));
                  if (var1 > 0L) {
                     if (var21 != 0) {
                        if (var31 != 0) {
                           var23 = 1;
                        }

                        var31 = var23;
                     }

                     if (var21 != 0) {
                        switch (var31) {
                           case 0:
                              boolean var33 = recovery$indy$flow$328(this.field_49, 300L, var17, 4564085732226944985L, var1);
                              if (var21 != 0) {
                                 if (!var33) {
                                    break;
                                 }

                                 var33 = recovery$indy$flow$333(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var33) {
                                    ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var33 = recovery$indy$flow$347(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var33) {
                                    ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var33 = recovery$indy$flow$361(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var33) {
                                    ((net.C_47oo)recovery$indy$flow$363(field_43, 4559983202195417942L, var1)).field_42b.field_45 = recovery$indy$flow$369(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$366(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var33 = recovery$indy$flow$375(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$372(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var33) {
                                    ((net.C_47oo)recovery$indy$flow$377(field_43, 4559983202195417942L, var1)).field_42P.field_45 = recovery$indy$flow$383(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$380(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var33 = recovery$indy$flow$389(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$386(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var33) {
                                    ((net.C_47oo)recovery$indy$flow$391(field_43, 4559983202195417942L, var1)).field_40.field_45 = recovery$indy$flow$397(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$394(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var33 = recovery$indy$flow$403(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$400(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 label2205:
                                 if (var33) {
                                    if (recovery$indy$flow$404(this, var15, 4563555430416401604L, var1)) {
                                       ((net.C_47oo)recovery$indy$flow$406(field_43, 4559983202195417942L, var1)).field_44W.field_45 = recovery$indy$flow$412(
                                          this,
                                          var8,
                                          var9,
                                          ((net.C_47oo)recovery$indy$flow$409(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                          4560587183705383567L,
                                          var1
                                       );
                                       if (var21 != 0) {
                                          break label2205;
                                       }
                                    }

                                    ((net.C_47oo)recovery$indy$flow$415(field_43, 4559983202195417942L, var1)).field_44W.field_45 = false;
                                 }

                                 var33 = recovery$indy$flow$418(this, var3, 4563858397961178490L, var1);
                              }

                              if (var21 != 0) {
                                 if (!var33) {
                                    break;
                                 }

                                 var33 = recovery$indy$flow$423(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var33) {
                                 ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }
                              break;
                           case 1:
                              boolean var32 = recovery$indy$flow$333(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                              if (var21 != 0) {
                                 if (var32) {
                                    ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var32 = recovery$indy$flow$347(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var32) {
                                    ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var32 = recovery$indy$flow$361(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var32) {
                                    ((net.C_47oo)recovery$indy$flow$363(field_43, 4559983202195417942L, var1)).field_42b.field_45 = recovery$indy$flow$369(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$366(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var32 = recovery$indy$flow$375(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$372(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var32) {
                                    ((net.C_47oo)recovery$indy$flow$377(field_43, 4559983202195417942L, var1)).field_42P.field_45 = recovery$indy$flow$383(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$380(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var32 = recovery$indy$flow$389(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$386(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var32) {
                                    ((net.C_47oo)recovery$indy$flow$391(field_43, 4559983202195417942L, var1)).field_40.field_45 = recovery$indy$flow$397(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$394(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var32 = recovery$indy$flow$403(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$400(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 label2183:
                                 if (var32) {
                                    if (recovery$indy$flow$404(this, var15, 4563555430416401604L, var1)) {
                                       ((net.C_47oo)recovery$indy$flow$406(field_43, 4559983202195417942L, var1)).field_44W.field_45 = recovery$indy$flow$412(
                                          this,
                                          var8,
                                          var9,
                                          ((net.C_47oo)recovery$indy$flow$409(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                          4560587183705383567L,
                                          var1
                                       );
                                       if (var21 != 0) {
                                          break label2183;
                                       }
                                    }

                                    ((net.C_47oo)recovery$indy$flow$415(field_43, 4559983202195417942L, var1)).field_44W.field_45 = false;
                                 }

                                 var32 = recovery$indy$flow$418(this, var3, 4563858397961178490L, var1);
                              }

                              if (var21 != 0) {
                                 if (!var32) {
                                    return;
                                 }

                                 var32 = recovery$indy$flow$423(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var32) {
                                 ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }
                        }
                     } else {
                        if (var21 != 0) {
                           if (var31 == 0) {
                              return;
                           }

                           var31 = ((byte) (recovery$indy$flow$333(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           if (var31 != 0) {
                              ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                           }

                           var31 = ((byte) (recovery$indy$flow$347(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           if (var31 != 0) {
                              ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                           }

                           var31 = ((byte) (recovery$indy$flow$361(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           if (var31 != 0) {
                              ((net.C_47oo)recovery$indy$flow$363(field_43, 4559983202195417942L, var1)).field_42b.field_45 = recovery$indy$flow$369(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$366(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                           }

                           var31 = ((byte) (recovery$indy$flow$375(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$372(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           if (var31 != 0) {
                              ((net.C_47oo)recovery$indy$flow$377(field_43, 4559983202195417942L, var1)).field_42P.field_45 = recovery$indy$flow$383(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$380(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                           }

                           var31 = ((byte) (recovery$indy$flow$389(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$386(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           if (var31 != 0) {
                              ((net.C_47oo)recovery$indy$flow$391(field_43, 4559983202195417942L, var1)).field_40.field_45 = recovery$indy$flow$397(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$394(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                           }

                           var31 = ((byte) (recovery$indy$flow$403(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$400(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           label2234:
                           if (var31 != 0) {
                              if (recovery$indy$flow$404(this, var15, 4563555430416401604L, var1)) {
                                 ((net.C_47oo)recovery$indy$flow$406(field_43, 4559983202195417942L, var1)).field_44W.field_45 = recovery$indy$flow$412(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$409(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                                 if (var21 != 0) {
                                    break label2234;
                                 }
                              }

                              ((net.C_47oo)recovery$indy$flow$415(field_43, 4559983202195417942L, var1)).field_44W.field_45 = false;
                           }

                           var31 = ((byte) (recovery$indy$flow$418(this, var3, 4563858397961178490L, var1) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           if (var31 == 0) {
                              return;
                           }

                           var31 = ((byte) (recovery$indy$flow$423(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var31 != 0) {
                           ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }
                     }

                     return;
                  } else if (var1 >= 0L) {
                     if (var21 != 0) {
                        if (var31 == 0) {
                           return;
                        }

                        var31 = ((byte) (recovery$indy$flow$333(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var31 != 0) {
                           ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var31 = ((byte) (recovery$indy$flow$347(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var31 != 0) {
                           ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var31 = ((byte) (recovery$indy$flow$361(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var31 == 0) {
                           return;
                        }

                        var31 = ((byte) (recovery$indy$flow$423(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var31 != 0) {
                        ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                           this,
                           var8,
                           var9,
                           ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4560587183705383567L,
                           var1
                        );
                     }

                     return;
                  } else {
                     if (var21 != 0) {
                        if (var31 == 0) {
                           return;
                        }

                        var31 = ((byte) (recovery$indy$flow$423(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var31 != 0) {
                        ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                           this,
                           var8,
                           var9,
                           ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4560587183705383567L,
                           var1
                        );
                     }

                     return;
                  }
               default:
                  byte var28 = var23;
                  if (var1 > 0L) {
                     if (var21 != 0) {
                        switch (var23) {
                           case 0:
                              boolean var30 = recovery$indy$flow$328(this.field_49, 300L, var17, 4564085732226944985L, var1);
                              if (var21 != 0) {
                                 if (!var30) {
                                    break;
                                 }

                                 var30 = recovery$indy$flow$333(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var30) {
                                    ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var30 = recovery$indy$flow$347(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var30) {
                                    ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var30 = recovery$indy$flow$361(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var30) {
                                    ((net.C_47oo)recovery$indy$flow$363(field_43, 4559983202195417942L, var1)).field_42b.field_45 = recovery$indy$flow$369(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$366(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var30 = recovery$indy$flow$375(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$372(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var30) {
                                    ((net.C_47oo)recovery$indy$flow$377(field_43, 4559983202195417942L, var1)).field_42P.field_45 = recovery$indy$flow$383(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$380(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var30 = recovery$indy$flow$389(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$386(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var30) {
                                    ((net.C_47oo)recovery$indy$flow$391(field_43, 4559983202195417942L, var1)).field_40.field_45 = recovery$indy$flow$397(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$394(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var30 = recovery$indy$flow$403(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$400(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 label2428:
                                 if (var30) {
                                    if (recovery$indy$flow$404(this, var15, 4563555430416401604L, var1)) {
                                       ((net.C_47oo)recovery$indy$flow$406(field_43, 4559983202195417942L, var1)).field_44W.field_45 = recovery$indy$flow$412(
                                          this,
                                          var8,
                                          var9,
                                          ((net.C_47oo)recovery$indy$flow$409(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                          4560587183705383567L,
                                          var1
                                       );
                                       if (var21 != 0) {
                                          break label2428;
                                       }
                                    }

                                    ((net.C_47oo)recovery$indy$flow$415(field_43, 4559983202195417942L, var1)).field_44W.field_45 = false;
                                 }

                                 var30 = recovery$indy$flow$418(this, var3, 4563858397961178490L, var1);
                              }

                              if (var21 != 0) {
                                 if (!var30) {
                                    break;
                                 }

                                 var30 = recovery$indy$flow$423(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var30) {
                                 ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }
                              break;
                           case 1:
                              boolean var29 = recovery$indy$flow$333(
                                 this,
                                 var13,
                                 ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                 4564380378673213058L,
                                 var1
                              );
                              if (var21 != 0) {
                                 if (var29) {
                                    ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var29 = recovery$indy$flow$347(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var29) {
                                    ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var29 = recovery$indy$flow$361(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var29) {
                                    ((net.C_47oo)recovery$indy$flow$363(field_43, 4559983202195417942L, var1)).field_42b.field_45 = recovery$indy$flow$369(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$366(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var29 = recovery$indy$flow$375(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$372(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var29) {
                                    ((net.C_47oo)recovery$indy$flow$377(field_43, 4559983202195417942L, var1)).field_42P.field_45 = recovery$indy$flow$383(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$380(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var29 = recovery$indy$flow$389(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$386(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 if (var29) {
                                    ((net.C_47oo)recovery$indy$flow$391(field_43, 4559983202195417942L, var1)).field_40.field_45 = recovery$indy$flow$397(
                                       this,
                                       var8,
                                       var9,
                                       ((net.C_47oo)recovery$indy$flow$394(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                       4560587183705383567L,
                                       var1
                                    );
                                 }

                                 var29 = recovery$indy$flow$403(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$400(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var21 != 0) {
                                 label2406:
                                 if (var29) {
                                    if (recovery$indy$flow$404(this, var15, 4563555430416401604L, var1)) {
                                       ((net.C_47oo)recovery$indy$flow$406(field_43, 4559983202195417942L, var1)).field_44W.field_45 = recovery$indy$flow$412(
                                          this,
                                          var8,
                                          var9,
                                          ((net.C_47oo)recovery$indy$flow$409(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                          4560587183705383567L,
                                          var1
                                       );
                                       if (var21 != 0) {
                                          break label2406;
                                       }
                                    }

                                    ((net.C_47oo)recovery$indy$flow$415(field_43, 4559983202195417942L, var1)).field_44W.field_45 = false;
                                 }

                                 var29 = recovery$indy$flow$418(this, var3, 4563858397961178490L, var1);
                              }

                              if (var21 != 0) {
                                 if (!var29) {
                                    return;
                                 }

                                 var29 = recovery$indy$flow$423(
                                    this,
                                    var13,
                                    ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                                    4564380378673213058L,
                                    var1
                                 );
                              }

                              if (var29) {
                                 ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                              }
                        }
                     } else {
                        if (var21 != 0) {
                           if (var23 == 0) {
                              return;
                           }

                           var28 = ((byte) (recovery$indy$flow$333(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           if (var28 != 0) {
                              ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                           }

                           var28 = ((byte) (recovery$indy$flow$347(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           if (var28 != 0) {
                              ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                           }

                           var28 = ((byte) (recovery$indy$flow$361(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           if (var28 != 0) {
                              ((net.C_47oo)recovery$indy$flow$363(field_43, 4559983202195417942L, var1)).field_42b.field_45 = recovery$indy$flow$369(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$366(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                           }

                           var28 = ((byte) (recovery$indy$flow$375(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$372(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           if (var28 != 0) {
                              ((net.C_47oo)recovery$indy$flow$377(field_43, 4559983202195417942L, var1)).field_42P.field_45 = recovery$indy$flow$383(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$380(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                           }

                           var28 = ((byte) (recovery$indy$flow$389(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$386(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           if (var28 != 0) {
                              ((net.C_47oo)recovery$indy$flow$391(field_43, 4559983202195417942L, var1)).field_40.field_45 = recovery$indy$flow$397(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$394(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                           }

                           var28 = ((byte) (recovery$indy$flow$403(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$400(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           label2457:
                           if (var28 != 0) {
                              if (recovery$indy$flow$404(this, var15, 4563555430416401604L, var1)) {
                                 ((net.C_47oo)recovery$indy$flow$406(field_43, 4559983202195417942L, var1)).field_44W.field_45 = recovery$indy$flow$412(
                                    this,
                                    var8,
                                    var9,
                                    ((net.C_47oo)recovery$indy$flow$409(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                    4560587183705383567L,
                                    var1
                                 );
                                 if (var21 != 0) {
                                    break label2457;
                                 }
                              }

                              ((net.C_47oo)recovery$indy$flow$415(field_43, 4559983202195417942L, var1)).field_44W.field_45 = false;
                           }

                           var28 = ((byte) (recovery$indy$flow$418(this, var3, 4563858397961178490L, var1) ? 1 : 0));
                        }

                        if (var21 != 0) {
                           if (var28 == 0) {
                              return;
                           }

                           var28 = ((byte) (recovery$indy$flow$423(
                              this,
                              var13,
                              ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                              4564380378673213058L,
                              var1
                           ) ? 1 : 0));
                        }

                        if (var28 != 0) {
                           ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }
                     }
                  } else if (var1 >= 0L) {
                     if (var21 != 0) {
                        if (var23 == 0) {
                           return;
                        }

                        var28 = ((byte) (recovery$indy$flow$333(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var28 != 0) {
                           ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var28 = ((byte) (recovery$indy$flow$347(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var28 != 0) {
                           ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var28 = ((byte) (recovery$indy$flow$361(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var21 != 0) {
                        if (var28 == 0) {
                           return;
                        }

                        var28 = ((byte) (recovery$indy$flow$423(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var28 != 0) {
                        ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                           this,
                           var8,
                           var9,
                           ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4560587183705383567L,
                           var1
                        );
                     }
                  } else {
                     if (var21 != 0) {
                        if (var23 == 0) {
                           return;
                        }

                        var28 = ((byte) (recovery$indy$flow$423(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        ) ? 1 : 0));
                     }

                     if (var28 != 0) {
                        ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                           this,
                           var8,
                           var9,
                           ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4560587183705383567L,
                           var1
                        );
                     }
                  }
            }
         }
      } else {
         String var22 = (String)recovery$indy$flow$321(this, var19, 4565301090682637654L, var1);
         int var10000 = var22.hashCode();
         if (var1 > 0L) {
            if (var21 != 0) {
               switch (var10000) {
                  case 0:
                     boolean var27 = recovery$indy$flow$328(this.field_49, 300L, var17, 4564085732226944985L, var1);
                     if (var21 != 0) {
                        if (!var27) {
                           break;
                        }

                        var27 = recovery$indy$flow$333(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var21 != 0) {
                        if (var27) {
                           ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var27 = recovery$indy$flow$347(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var21 != 0) {
                        if (var27) {
                           ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var27 = recovery$indy$flow$361(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var21 != 0) {
                        if (var27) {
                           ((net.C_47oo)recovery$indy$flow$363(field_43, 4559983202195417942L, var1)).field_42b.field_45 = recovery$indy$flow$369(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$366(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var27 = recovery$indy$flow$375(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$372(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var21 != 0) {
                        if (var27) {
                           ((net.C_47oo)recovery$indy$flow$377(field_43, 4559983202195417942L, var1)).field_42P.field_45 = recovery$indy$flow$383(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$380(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var27 = recovery$indy$flow$389(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$386(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var21 != 0) {
                        if (var27) {
                           ((net.C_47oo)recovery$indy$flow$391(field_43, 4559983202195417942L, var1)).field_40.field_45 = recovery$indy$flow$397(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$394(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var27 = recovery$indy$flow$403(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$400(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var21 != 0) {
                        label2534:
                        if (var27) {
                           if (recovery$indy$flow$404(this, var15, 4563555430416401604L, var1)) {
                              ((net.C_47oo)recovery$indy$flow$406(field_43, 4559983202195417942L, var1)).field_44W.field_45 = recovery$indy$flow$412(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$409(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                              if (var21 != 0) {
                                 break label2534;
                              }
                           }

                           ((net.C_47oo)recovery$indy$flow$415(field_43, 4559983202195417942L, var1)).field_44W.field_45 = false;
                        }

                        var27 = recovery$indy$flow$418(this, var3, 4563858397961178490L, var1);
                     }

                     if (var21 != 0) {
                        if (!var27) {
                           break;
                        }

                        var27 = recovery$indy$flow$423(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var27) {
                        ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                           this,
                           var8,
                           var9,
                           ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4560587183705383567L,
                           var1
                        );
                     }
                     break;
                  case 1:
                     boolean var26 = recovery$indy$flow$333(
                        this,
                        var13,
                        ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                        4564380378673213058L,
                        var1
                     );
                     if (var21 != 0) {
                        if (var26) {
                           ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var26 = recovery$indy$flow$347(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var21 != 0) {
                        if (var26) {
                           ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var26 = recovery$indy$flow$361(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var21 != 0) {
                        if (var26) {
                           ((net.C_47oo)recovery$indy$flow$363(field_43, 4559983202195417942L, var1)).field_42b.field_45 = recovery$indy$flow$369(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$366(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var26 = recovery$indy$flow$375(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$372(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var21 != 0) {
                        if (var26) {
                           ((net.C_47oo)recovery$indy$flow$377(field_43, 4559983202195417942L, var1)).field_42P.field_45 = recovery$indy$flow$383(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$380(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var26 = recovery$indy$flow$389(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$386(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var21 != 0) {
                        if (var26) {
                           ((net.C_47oo)recovery$indy$flow$391(field_43, 4559983202195417942L, var1)).field_40.field_45 = recovery$indy$flow$397(
                              this,
                              var8,
                              var9,
                              ((net.C_47oo)recovery$indy$flow$394(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                              4560587183705383567L,
                              var1
                           );
                        }

                        var26 = recovery$indy$flow$403(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$400(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var21 != 0) {
                        label2512:
                        if (var26) {
                           if (recovery$indy$flow$404(this, var15, 4563555430416401604L, var1)) {
                              ((net.C_47oo)recovery$indy$flow$406(field_43, 4559983202195417942L, var1)).field_44W.field_45 = recovery$indy$flow$412(
                                 this,
                                 var8,
                                 var9,
                                 ((net.C_47oo)recovery$indy$flow$409(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                                 4560587183705383567L,
                                 var1
                              );
                              if (var21 != 0) {
                                 break label2512;
                              }
                           }

                           ((net.C_47oo)recovery$indy$flow$415(field_43, 4559983202195417942L, var1)).field_44W.field_45 = false;
                        }

                        var26 = recovery$indy$flow$418(this, var3, 4563858397961178490L, var1);
                     }

                     if (var21 != 0) {
                        if (!var26) {
                           return;
                        }

                        var26 = recovery$indy$flow$423(
                           this,
                           var13,
                           ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4564380378673213058L,
                           var1
                        );
                     }

                     if (var26) {
                        ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                           this,
                           var8,
                           var9,
                           ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                           4560587183705383567L,
                           var1
                        );
                     }
               }
            } else {
               if (var21 != 0) {
                  if (var10000 == 0) {
                     return;
                  }

                  var10000 = ((int) (recovery$indy$flow$333(
                     this,
                     var13,
                     ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                     4564380378673213058L,
                     var1
                  ) ? 1 : 0));
               }

               if (var21 != 0) {
                  if (var10000 != 0) {
                     ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                        this,
                        var8,
                        var9,
                        ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                        4560587183705383567L,
                        var1
                     );
                  }

                  var10000 = ((int) (recovery$indy$flow$347(
                     this,
                     var13,
                     ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                     4564380378673213058L,
                     var1
                  ) ? 1 : 0));
               }

               if (var21 != 0) {
                  if (var10000 != 0) {
                     ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                        this,
                        var8,
                        var9,
                        ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                        4560587183705383567L,
                        var1
                     );
                  }

                  var10000 = ((int) (recovery$indy$flow$361(
                     this,
                     var13,
                     ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                     4564380378673213058L,
                     var1
                  ) ? 1 : 0));
               }

               if (var21 != 0) {
                  if (var10000 != 0) {
                     ((net.C_47oo)recovery$indy$flow$363(field_43, 4559983202195417942L, var1)).field_42b.field_45 = recovery$indy$flow$369(
                        this,
                        var8,
                        var9,
                        ((net.C_47oo)recovery$indy$flow$366(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                        4560587183705383567L,
                        var1
                     );
                  }

                  var10000 = ((int) (recovery$indy$flow$375(
                     this,
                     var13,
                     ((net.C_47oo)recovery$indy$flow$372(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                     4564380378673213058L,
                     var1
                  ) ? 1 : 0));
               }

               if (var21 != 0) {
                  if (var10000 != 0) {
                     ((net.C_47oo)recovery$indy$flow$377(field_43, 4559983202195417942L, var1)).field_42P.field_45 = recovery$indy$flow$383(
                        this,
                        var8,
                        var9,
                        ((net.C_47oo)recovery$indy$flow$380(field_43, 4559983202195417942L, var1)).field_42P.method_45$8abf5c6871(),
                        4560587183705383567L,
                        var1
                     );
                  }

                  var10000 = ((int) (recovery$indy$flow$389(
                     this,
                     var13,
                     ((net.C_47oo)recovery$indy$flow$386(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                     4564380378673213058L,
                     var1
                  ) ? 1 : 0));
               }

               if (var21 != 0) {
                  if (var10000 != 0) {
                     ((net.C_47oo)recovery$indy$flow$391(field_43, 4559983202195417942L, var1)).field_40.field_45 = recovery$indy$flow$397(
                        this,
                        var8,
                        var9,
                        ((net.C_47oo)recovery$indy$flow$394(field_43, 4559983202195417942L, var1)).field_40.method_45$8abf5c6871(),
                        4560587183705383567L,
                        var1
                     );
                  }

                  var10000 = ((int) (recovery$indy$flow$403(
                     this,
                     var13,
                     ((net.C_47oo)recovery$indy$flow$400(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                     4564380378673213058L,
                     var1
                  ) ? 1 : 0));
               }

               if (var21 != 0) {
                  label2563:
                  if (var10000 != 0) {
                     if (recovery$indy$flow$404(this, var15, 4563555430416401604L, var1)) {
                        ((net.C_47oo)recovery$indy$flow$406(field_43, 4559983202195417942L, var1)).field_44W.field_45 = recovery$indy$flow$412(
                           this,
                           var8,
                           var9,
                           ((net.C_47oo)recovery$indy$flow$409(field_43, 4559983202195417942L, var1)).field_44W.method_45$8abf5c6871(),
                           4560587183705383567L,
                           var1
                        );
                        if (var21 != 0) {
                           break label2563;
                        }
                     }

                     ((net.C_47oo)recovery$indy$flow$415(field_43, 4559983202195417942L, var1)).field_44W.field_45 = false;
                  }

                  var10000 = ((int) (recovery$indy$flow$418(this, var3, 4563858397961178490L, var1) ? 1 : 0));
               }

               if (var21 != 0) {
                  if (var10000 == 0) {
                     return;
                  }

                  var10000 = ((int) (recovery$indy$flow$423(
                     this,
                     var13,
                     ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                     4564380378673213058L,
                     var1
                  ) ? 1 : 0));
               }

               if (var10000 != 0) {
                  ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                     this,
                     var8,
                     var9,
                     ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                     4560587183705383567L,
                     var1
                  );
               }
            }
         } else if (var1 >= 0L) {
            if (var21 != 0) {
               if (var10000 == 0) {
                  return;
               }

               var10000 = ((int) (recovery$indy$flow$333(
                  this,
                  var13,
                  ((net.C_47oo)recovery$indy$flow$330(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                  4564380378673213058L,
                  var1
               ) ? 1 : 0));
            }

            if (var21 != 0) {
               if (var10000 != 0) {
                  ((net.C_47oo)recovery$indy$flow$335(field_43, 4559983202195417942L, var1)).field_45H.field_45 = recovery$indy$flow$341(
                     this,
                     var8,
                     var9,
                     ((net.C_47oo)recovery$indy$flow$338(field_43, 4559983202195417942L, var1)).field_45H.method_45$8abf5c6871(),
                     4560587183705383567L,
                     var1
                  );
               }

               var10000 = ((int) (recovery$indy$flow$347(
                  this,
                  var13,
                  ((net.C_47oo)recovery$indy$flow$344(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                  4564380378673213058L,
                  var1
               ) ? 1 : 0));
            }

            if (var21 != 0) {
               if (var10000 != 0) {
                  ((net.C_47oo)recovery$indy$flow$349(field_43, 4559983202195417942L, var1)).field_42R.field_45 = recovery$indy$flow$355(
                     this,
                     var8,
                     var9,
                     ((net.C_47oo)recovery$indy$flow$352(field_43, 4559983202195417942L, var1)).field_42R.method_45$8abf5c6871(),
                     4560587183705383567L,
                     var1
                  );
               }

               var10000 = ((int) (recovery$indy$flow$361(
                  this,
                  var13,
                  ((net.C_47oo)recovery$indy$flow$358(field_43, 4559983202195417942L, var1)).field_42b.method_45$8abf5c6871(),
                  4564380378673213058L,
                  var1
               ) ? 1 : 0));
            }

            if (var21 != 0) {
               if (var10000 == 0) {
                  return;
               }

               var10000 = ((int) (recovery$indy$flow$423(
                  this,
                  var13,
                  ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                  4564380378673213058L,
                  var1
               ) ? 1 : 0));
            }

            if (var10000 != 0) {
               ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                  this,
                  var8,
                  var9,
                  ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                  4560587183705383567L,
                  var1
               );
            }
         } else {
            if (var21 != 0) {
               if (var10000 == 0) {
                  return;
               }

               var10000 = ((int) (recovery$indy$flow$423(
                  this,
                  var13,
                  ((net.C_47oo)recovery$indy$flow$420(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                  4564380378673213058L,
                  var1
               ) ? 1 : 0));
            }

            if (var10000 != 0) {
               ((net.C_47oo)recovery$indy$flow$425(field_43, 4559983202195417942L, var1)).field_44q.field_45 = recovery$indy$flow$431(
                  this,
                  var8,
                  var9,
                  ((net.C_47oo)recovery$indy$flow$428(field_43, 4559983202195417942L, var1)).field_44q.method_45$8abf5c6871(),
                  4560587183705383567L,
                  var1
               );
            }
         }
      }
   }







   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public GuiMove_47Qc(long a0) {
        super((java.lang.String) ("GuiMove"),(java.lang.String) ("Benutzeroberfl\u00e4chenBewegung"),(long) (((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 107212799878268L)),(java.awt.Color) (new java.awt.Color((int) (11),(int) (143),(int) (125))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 88509437815178L);
        long constructorKey4 = ((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 41093261682885L);
        int constructorPart5 = (int) ((((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 112748105352854L) >>> 48));
        int constructorPart6 = (int) (((((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 112748105352854L) << 16) >>> 48));
        int constructorPart7 = (int) (((((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 112748105352854L) << 32) >>> 32));
        long constructorKey8 = ((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 28000832187738L);
        int constructorPart9 = (int) ((((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 35883760909275L) >>> 32));
        int constructorPart10 = (int) (((((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 35883760909275L) << 32) >>> 48));
        int constructorPart11 = (int) (((((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 35883760909275L) << 48) >>> 48));
        int constructorPart12 = (int) ((((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 6965039282634L) >>> 32));
        int constructorPart13 = (int) (((((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 6965039282634L) << 32) >>> 48));
        int constructorPart14 = (int) (((((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 6965039282634L) << 48) >>> 48));
        long constructorKey15 = ((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 133791419755884L);
        long constructorKey16 = ((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 29747503929874L);
        long constructorKey17 = ((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 43365194505430L);
        long constructorKey18 = ((augustus.recovered.modules.player.GuiMove_47Qc.a ^ a0) ^ 130078816501464L);
        java.lang.Object initialValue19 = recovery$indy$flow$434();
        client.setting.MultiSelectSetting initialized20 = new client.setting.MultiSelectSetting(this, "Guis", constructorKey3, (net.C_47OZ[]) (initialValue19));
        recovery$indy$flow$436(this, initialized20);
        boolean initialValue21 = recovery$indy$flow$437();
        net.C_47cu initialized22 = new net.C_47cu();
        recovery$indy$flow$440(this, initialized22);
        int initialValue23 = (int) ((initialValue21 ? 1 : 0));
        recovery$indy$flow$441(this, null);
        java.lang.Object initialValue24 = recovery$indy$flow$442();
        java.lang.Object initialValue25 = initialValue24;
        int length26 = java.lang.reflect.Array.getLength(initialValue25);
        int initialValue27 = length26;
        int initialValue28 = 0;
        GuiMove_47Qc loopLocal29 = this;
        long loopLocal30 = constructorKey2;
        long loopLocal31 = constructorKey4;
        int loopLocal32 = constructorPart5;
        int loopLocal33 = constructorPart6;
        int loopLocal34 = constructorPart7;
        long loopLocal35 = constructorKey8;
        int loopLocal36 = constructorPart9;
        int loopLocal37 = constructorPart10;
        int loopLocal38 = constructorPart11;
        int loopLocal39 = constructorPart12;
        int loopLocal40 = constructorPart13;
        int loopLocal41 = constructorPart14;
        long loopLocal42 = constructorKey15;
        long loopLocal43 = constructorKey16;
        long loopLocal44 = constructorKey17;
        long loopLocal45 = constructorKey18;
        int loopLocal46 = initialValue23;
        java.lang.Object loopLocal47 = initialValue25;
        int loopLocal48 = initialValue27;
        int loopLocal49 = initialValue28;
        loop50: while (true) {
            if (loopLocal49 >= loopLocal48) {
                break loop50;
            } else {
                java.lang.Object arrayValue51 = ((java.lang.Object[]) loopLocal47)[loopLocal49];
                java.lang.Object initialValue52 = arrayValue51;
                java.lang.Object initialValue53 = initialValue52;
                java.lang.Object initialValue54 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue53))))));
                java.lang.Object initialValue55 = recovery$indy$flow$444(initialValue54);
                java.lang.Object initialValue56 = recovery$indy$flow$445();
                java.lang.Object initialValue57 = recovery$indy$flow$446(initialValue55, initialValue56);
                java.lang.Object initialValue58 = initialValue57;
                java.lang.Object initialValue59 = initialValue52;
                java.lang.Object initialValue60 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue59))))));
                java.lang.Object initialValue61 = recovery$indy$flow$449(initialValue60);
                client.setting.SettingGroup initialized62 = new client.setting.SettingGroup((client.module.Module) (loopLocal29), (java.lang.String) (initialValue61), loopLocal42);
                java.lang.Object initialValue63 = recovery$indy$flow$451(initialValue52);
                java.lang.Object initialValue64 = recovery$indy$flow$452(initialValue52);
                char converted65 = (char) (loopLocal40);
                java.lang.Object initialValue66 = initialValue64;
                int initialValue67 = loopLocal41;
                int initialValue68 = (int) (converted65);
                int initialValue69 = loopLocal39;
                client.setting.SettingGroup initialValue70 = initialized62;
                java.lang.Object initialValue71 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue70))))));
                java.lang.Object initialValue72 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue66))))));
                java.lang.Object initialValue73 = recovery$indy$flow$455(initialValue71, initialValue69, (char) (initialValue68), initialValue67, initialValue72);
                java.lang.Object initialValue74 = initialValue73;
                java.lang.StringBuilder initialized75 = new java.lang.StringBuilder();
                java.lang.Object initialValue76 = initialValue52;
                java.lang.Object initialValue77 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue76))))));
                java.lang.Object initialValue78 = recovery$indy$flow$460(initialValue77);
                java.lang.Object initialValue79 = recovery$indy$flow$461(initialized75, initialValue78);
                java.lang.Object initialValue80 = recovery$indy$flow$462(initialValue79, "Mode");
                java.lang.Object initialValue81 = recovery$indy$flow$463(initialValue80);
                java.lang.Object initialValue82 = recovery$indy$flow$464(3);
                ((java.lang.Object[]) initialValue82)[0] = "Basic";
                ((java.lang.Object[]) initialValue82)[1] = "Resprint";
                ((java.lang.Object[]) initialValue82)[2] = "Intave";
                client.setting.ModeSetting initialized83 = new client.setting.ModeSetting((client.module.Module) (loopLocal29), (java.lang.String) (initialValue81), "Basic", (java.lang.String[]) (initialValue82), (client.setting.SettingGroup) (initialValue74), loopLocal45);
                java.lang.String initialValue84 = "Mode";
                long initialValue85 = loopLocal31;
                client.setting.ModeSetting initialValue86 = initialized83;
                java.lang.Object initialValue87 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue86))))));
                java.lang.Object initialValue88 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue84))))));
                java.lang.Object initialValue89 = recovery$indy$flow$468(initialValue87, initialValue85, initialValue88);
                java.lang.Object initialValue90 = initialValue89;
                java.lang.Object initialValue91 = initialValue52;
                java.lang.Object initialValue92 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue91))))));
                java.lang.Object initialValue93 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue90))))));
                java.lang.Object initialValue94 = recovery$indy$flow$471(initialValue92, initialValue93);
                java.lang.StringBuilder initialized95 = new java.lang.StringBuilder();
                java.lang.Object initialValue96 = initialValue52;
                java.lang.Object initialValue97 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue96))))));
                java.lang.Object initialValue98 = recovery$indy$flow$476(initialValue97);
                java.lang.Object initialValue99 = recovery$indy$flow$477(initialized95, initialValue98);
                java.lang.Object initialValue100 = recovery$indy$flow$478(initialValue99, "Sneak");
                java.lang.Object initialValue101 = recovery$indy$flow$479(initialValue100);
                short converted102 = (short) (loopLocal32);
                char converted103 = (char) (loopLocal33);
                client.setting.BooleanSetting initialized104 = new client.setting.BooleanSetting((client.module.Module) (loopLocal29), (java.lang.String) (initialValue101), converted102, converted103, loopLocal34, false, (client.setting.SettingGroup) (initialValue74));
                java.lang.StringBuilder initialized105 = new java.lang.StringBuilder();
                java.lang.Object initialValue106 = recovery$indy$flow$483(initialized105, "Sneak in ");
                java.lang.Object initialValue107 = recovery$indy$flow$484(initialValue106, initialValue58);
                java.lang.Object initialValue108 = recovery$indy$flow$485(initialValue107);
                long initialValue109 = loopLocal43;
                java.lang.Object initialValue110 = initialValue108;
                client.setting.BooleanSetting initialValue111 = initialized104;
                java.lang.Object initialValue112 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue111))))));
                java.lang.Object initialValue113 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue110))))));
                java.lang.Object initialValue114 = recovery$indy$flow$488(initialValue112, initialValue113, initialValue109);
                java.lang.Object initialValue115 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue114))))));
                java.lang.Object initialValue116 = initialValue115;
                java.lang.Object initialValue117 = initialValue52;
                java.lang.Object initialValue118 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue117))))));
                java.lang.Object initialValue119 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue116))))));
                java.lang.Object initialValue120 = recovery$indy$flow$492(initialValue118, initialValue119);
                java.lang.StringBuilder initialized121 = new java.lang.StringBuilder();
                java.lang.Object initialValue122 = initialValue52;
                java.lang.Object initialValue123 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue122))))));
                java.lang.Object initialValue124 = recovery$indy$flow$497(initialValue123);
                java.lang.Object initialValue125 = recovery$indy$flow$498(initialized121, initialValue124);
                java.lang.Object initialValue126 = recovery$indy$flow$499(initialValue125, "Jump");
                java.lang.Object initialValue127 = recovery$indy$flow$500(initialValue126);
                short converted128 = (short) (loopLocal32);
                char converted129 = (char) (loopLocal33);
                client.setting.BooleanSetting initialized130 = new client.setting.BooleanSetting((client.module.Module) (loopLocal29), (java.lang.String) (initialValue127), converted128, converted129, loopLocal34, false, (client.setting.SettingGroup) (initialValue74));
                java.lang.StringBuilder initialized131 = new java.lang.StringBuilder();
                java.lang.Object initialValue132 = recovery$indy$flow$504(initialized131, "Jump in ");
                java.lang.Object initialValue133 = recovery$indy$flow$505(initialValue132, initialValue58);
                java.lang.Object initialValue134 = recovery$indy$flow$506(initialValue133);
                long initialValue135 = loopLocal43;
                java.lang.Object initialValue136 = initialValue134;
                client.setting.BooleanSetting initialValue137 = initialized130;
                java.lang.Object initialValue138 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue137))))));
                java.lang.Object initialValue139 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue136))))));
                java.lang.Object initialValue140 = recovery$indy$flow$509(initialValue138, initialValue139, initialValue135);
                java.lang.Object initialValue141 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue140))))));
                java.lang.Object initialValue142 = initialValue141;
                java.lang.Object initialValue143 = initialValue52;
                java.lang.Object initialValue144 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue143))))));
                java.lang.Object initialValue145 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue142))))));
                java.lang.Object initialValue146 = recovery$indy$flow$513(initialValue144, initialValue145);
                int comparison147 = (loopLocal30 > 0L ? 1 : loopLocal30 == 0L ? 0 : -1);
                int merged370;
                if (comparison147 < 0) {
                    merged370 = loopLocal49;
                } else {
                    if (loopLocal46 != 0) {
                    } else {
                        java.lang.Object initialValue148 = recovery$indy$flow$514();
                        if (((java.lang.Object) initialValue52) != ((java.lang.Object) initialValue148)) {
                        } else {
                            short converted149 = (short) (loopLocal32);
                            char converted150 = (char) (loopLocal33);
                            client.setting.BooleanSetting initialized151 = new client.setting.BooleanSetting((client.module.Module) (loopLocal29), "NoInvPacket", converted149, converted150, loopLocal34, false, (client.setting.SettingGroup) (initialValue74));
                            long initialValue152 = loopLocal43;
                            java.lang.String initialValue153 = "No inventory open packet";
                            client.setting.BooleanSetting initialValue154 = initialized151;
                            java.lang.Object initialValue155 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue154))))));
                            java.lang.Object initialValue156 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue153))))));
                            java.lang.Object initialValue157 = recovery$indy$flow$519(initialValue155, initialValue156, initialValue152);
                            java.lang.Object initialValue158 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue157))))));
                            recovery$indy$flow$521(loopLocal29, initialValue158);
                        }
                        java.lang.StringBuilder initialized159 = new java.lang.StringBuilder();
                        java.lang.Object initialValue160 = initialValue52;
                        java.lang.Object initialValue161 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue160))))));
                        java.lang.Object initialValue162 = recovery$indy$flow$526(initialValue161);
                        java.lang.Object initialValue163 = recovery$indy$flow$527(initialized159, initialValue162);
                        java.lang.Object initialValue164 = recovery$indy$flow$528(initialValue163, "Rotate");
                        java.lang.Object initialValue165 = recovery$indy$flow$529(initialValue164);
                        short converted166 = (short) (loopLocal32);
                        char converted167 = (char) (loopLocal33);
                        client.setting.BooleanSetting initialized168 = new client.setting.BooleanSetting((client.module.Module) (loopLocal29), (java.lang.String) (initialValue165), converted166, converted167, loopLocal34, false, (client.setting.SettingGroup) (initialValue74));
                        java.lang.StringBuilder initialized169 = new java.lang.StringBuilder();
                        java.lang.Object initialValue170 = recovery$indy$flow$533(initialized169, "Rotate in ");
                        java.lang.Object initialValue171 = recovery$indy$flow$534(initialValue170, initialValue58);
                        java.lang.Object initialValue172 = recovery$indy$flow$535(initialValue171);
                        long initialValue173 = loopLocal43;
                        java.lang.Object initialValue174 = initialValue172;
                        client.setting.BooleanSetting initialValue175 = initialized168;
                        java.lang.Object initialValue176 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue175))))));
                        java.lang.Object initialValue177 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue174))))));
                        java.lang.Object initialValue178 = recovery$indy$flow$538(initialValue176, initialValue177, initialValue173);
                        java.lang.Object initialValue179 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue178))))));
                        java.lang.Object initialValue180 = initialValue179;
                        java.lang.Object initialValue181 = initialValue52;
                        java.lang.Object initialValue182 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue181))))));
                        java.lang.Object initialValue183 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue180))))));
                        java.lang.Object initialValue184 = recovery$indy$flow$542(initialValue182, initialValue183);
                        java.lang.StringBuilder initialized185 = new java.lang.StringBuilder();
                        java.lang.Object initialValue186 = initialValue52;
                        java.lang.Object initialValue187 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue186))))));
                        java.lang.Object initialValue188 = recovery$indy$flow$547(initialValue187);
                        java.lang.Object initialValue189 = recovery$indy$flow$548(initialized185, initialValue188);
                        java.lang.Object initialValue190 = recovery$indy$flow$549(initialValue189, "RotateOnlyAtClick");
                        java.lang.Object initialValue191 = recovery$indy$flow$550(initialValue190);
                        short converted192 = (short) (loopLocal32);
                        char converted193 = (char) (loopLocal33);
                        client.setting.BooleanSetting initialized194 = new client.setting.BooleanSetting((client.module.Module) (loopLocal29), (java.lang.String) (initialValue191), converted192, converted193, loopLocal34, false, (client.setting.SettingGroup) (initialValue74));
                        java.lang.StringBuilder initialized195 = new java.lang.StringBuilder();
                        java.lang.Object initialValue196 = recovery$indy$flow$554(initialized195, "Rotate only while click in ");
                        java.lang.Object initialValue197 = recovery$indy$flow$555(initialValue196, initialValue58);
                        java.lang.Object initialValue198 = recovery$indy$flow$556(initialValue197);
                        long initialValue199 = loopLocal43;
                        java.lang.Object initialValue200 = initialValue198;
                        client.setting.BooleanSetting initialValue201 = initialized194;
                        java.lang.Object initialValue202 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue201))))));
                        java.lang.Object initialValue203 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue200))))));
                        java.lang.Object initialValue204 = recovery$indy$flow$559(initialValue202, initialValue203, initialValue199);
                        java.lang.Object initialValue205 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue204))))));
                        java.lang.Object initialValue206 = initialValue52;
                        java.lang.Object initialValue207 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue206))))));
                        java.lang.Object initialValue208 = recovery$indy$flow$562(initialValue207);
                        java.lang.Object initialValue209 = recovery$indy$flow$563(initialValue208);
                        java.lang.Object initialValue210 = recovery$indy$flow$564(initialValue208);
                        java.lang.Object initialValue211 = initialValue210;
                        long initialValue212 = loopLocal35;
                        java.lang.Object initialValue213 = initialValue205;
                        java.lang.Object initialValue214 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue213))))));
                        java.lang.Object initialValue215 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue211))))));
                        java.lang.Object initialValue216 = recovery$indy$flow$567(initialValue214, initialValue212, initialValue215);
                        java.lang.Object initialValue217 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue216))))));
                        java.lang.Object initialValue218 = initialValue217;
                        java.lang.Object initialValue219 = initialValue52;
                        java.lang.Object initialValue220 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue219))))));
                        java.lang.Object initialValue221 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue218))))));
                        java.lang.Object initialValue222 = recovery$indy$flow$571(initialValue220, initialValue221);
                        java.lang.StringBuilder initialized223 = new java.lang.StringBuilder();
                        java.lang.Object initialValue224 = initialValue52;
                        java.lang.Object initialValue225 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue224))))));
                        java.lang.Object initialValue226 = recovery$indy$flow$576(initialValue225);
                        java.lang.Object initialValue227 = recovery$indy$flow$577(initialized223, initialValue226);
                        java.lang.Object initialValue228 = recovery$indy$flow$578(initialValue227, "MoveOnlyOnGround");
                        java.lang.Object initialValue229 = recovery$indy$flow$579(initialValue228);
                        short converted230 = (short) (loopLocal32);
                        char converted231 = (char) (loopLocal33);
                        client.setting.BooleanSetting initialized232 = new client.setting.BooleanSetting((client.module.Module) (loopLocal29), (java.lang.String) (initialValue229), converted230, converted231, loopLocal34, false, (client.setting.SettingGroup) (initialValue74));
                        java.lang.StringBuilder initialized233 = new java.lang.StringBuilder();
                        java.lang.Object initialValue234 = recovery$indy$flow$583(initialized233, "Move only on ground in ");
                        java.lang.Object initialValue235 = recovery$indy$flow$584(initialValue234, initialValue58);
                        java.lang.Object initialValue236 = recovery$indy$flow$585(initialValue235);
                        long initialValue237 = loopLocal43;
                        java.lang.Object initialValue238 = initialValue236;
                        client.setting.BooleanSetting initialValue239 = initialized232;
                        java.lang.Object initialValue240 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue239))))));
                        java.lang.Object initialValue241 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue238))))));
                        java.lang.Object initialValue242 = recovery$indy$flow$588(initialValue240, initialValue241, initialValue237);
                        java.lang.Object initialValue243 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue242))))));
                        java.lang.Object initialValue244 = initialValue243;
                        java.lang.Object initialValue245 = initialValue52;
                        java.lang.Object initialValue246 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue245))))));
                        java.lang.Object initialValue247 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue244))))));
                        java.lang.Object initialValue248 = recovery$indy$flow$592(initialValue246, initialValue247);
                        java.lang.StringBuilder initialized249 = new java.lang.StringBuilder();
                        java.lang.Object initialValue250 = initialValue52;
                        java.lang.Object initialValue251 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue250))))));
                        java.lang.Object initialValue252 = recovery$indy$flow$597(initialValue251);
                        java.lang.Object initialValue253 = recovery$indy$flow$598(initialized249, initialValue252);
                        java.lang.Object initialValue254 = recovery$indy$flow$599(initialValue253, "SneakMotionWhileMovement");
                        java.lang.Object initialValue255 = recovery$indy$flow$600(initialValue254);
                        short converted256 = (short) (loopLocal32);
                        char converted257 = (char) (loopLocal33);
                        client.setting.BooleanSetting initialized258 = new client.setting.BooleanSetting((client.module.Module) (loopLocal29), (java.lang.String) (initialValue255), converted256, converted257, loopLocal34, false, (client.setting.SettingGroup) (initialValue74));
                        java.lang.StringBuilder initialized259 = new java.lang.StringBuilder();
                        java.lang.Object initialValue260 = recovery$indy$flow$604(initialized259, "Sneak motion while moving in ");
                        java.lang.Object initialValue261 = recovery$indy$flow$605(initialValue260, initialValue58);
                        java.lang.Object initialValue262 = recovery$indy$flow$606(initialValue261);
                        long initialValue263 = loopLocal43;
                        java.lang.Object initialValue264 = initialValue262;
                        client.setting.BooleanSetting initialValue265 = initialized258;
                        java.lang.Object initialValue266 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue265))))));
                        java.lang.Object initialValue267 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue264))))));
                        java.lang.Object initialValue268 = recovery$indy$flow$609(initialValue266, initialValue267, initialValue263);
                        java.lang.Object initialValue269 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue268))))));
                        java.lang.Object initialValue270 = initialValue269;
                        java.lang.Object initialValue271 = initialValue52;
                        java.lang.Object initialValue272 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue271))))));
                        java.lang.Object initialValue273 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue270))))));
                        java.lang.Object initialValue274 = recovery$indy$flow$613(initialValue272, initialValue273);
                        java.lang.StringBuilder initialized275 = new java.lang.StringBuilder();
                        java.lang.Object initialValue276 = initialValue52;
                        java.lang.Object initialValue277 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue276))))));
                        java.lang.Object initialValue278 = recovery$indy$flow$618(initialValue277);
                        java.lang.Object initialValue279 = recovery$indy$flow$619(initialized275, initialValue278);
                        java.lang.Object initialValue280 = recovery$indy$flow$620(initialValue279, "Sprint mode");
                        java.lang.Object initialValue281 = recovery$indy$flow$621(initialValue280);
                        java.lang.Object initialValue282 = recovery$indy$flow$622(4);
                        ((java.lang.Object[]) initialValue282)[0] = "None";
                        ((java.lang.Object[]) initialValue282)[1] = "Legit";
                        ((java.lang.Object[]) initialValue282)[2] = "AllDirection";
                        ((java.lang.Object[]) initialValue282)[3] = "AllDirectionMotion";
                        client.setting.ModeSetting initialized283 = new client.setting.ModeSetting((client.module.Module) (loopLocal29), (java.lang.String) (initialValue281), "None", (java.lang.String[]) (initialValue282), (client.setting.SettingGroup) (initialValue74), loopLocal45);
                        java.lang.String initialValue284 = "Sprint mode";
                        long initialValue285 = loopLocal31;
                        client.setting.ModeSetting initialValue286 = initialized283;
                        java.lang.Object initialValue287 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue286))))));
                        java.lang.Object initialValue288 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue284))))));
                        java.lang.Object initialValue289 = recovery$indy$flow$626(initialValue287, initialValue285, initialValue288);
                        java.lang.Object initialValue290 = initialValue289;
                        java.lang.Object initialValue291 = initialValue52;
                        java.lang.Object initialValue292 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue291))))));
                        java.lang.Object initialValue293 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue290))))));
                        java.lang.Object initialValue294 = recovery$indy$flow$629(initialValue292, initialValue293);
                        java.lang.StringBuilder initialized295 = new java.lang.StringBuilder();
                        java.lang.Object initialValue296 = initialValue52;
                        java.lang.Object initialValue297 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue296))))));
                        java.lang.Object initialValue298 = recovery$indy$flow$634(initialValue297);
                        java.lang.Object initialValue299 = recovery$indy$flow$635(initialized295, initialValue298);
                        java.lang.Object initialValue300 = recovery$indy$flow$636(initialValue299, "Jump sprint");
                        java.lang.Object initialValue301 = recovery$indy$flow$637(initialValue300);
                        short converted302 = (short) (loopLocal32);
                        char converted303 = (char) (loopLocal33);
                        client.setting.BooleanSetting initialized304 = new client.setting.BooleanSetting((client.module.Module) (loopLocal29), (java.lang.String) (initialValue301), converted302, converted303, loopLocal34, false, (client.setting.SettingGroup) (initialValue74));
                        long initialValue305 = loopLocal43;
                        java.lang.String initialValue306 = "Sprint jump boost motion";
                        client.setting.BooleanSetting initialValue307 = initialized304;
                        java.lang.Object initialValue308 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue307))))));
                        java.lang.Object initialValue309 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue306))))));
                        java.lang.Object initialValue310 = recovery$indy$flow$641(initialValue308, initialValue309, initialValue305);
                        java.lang.Object initialValue311 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue310))))));
                        java.lang.Object initialValue312 = initialValue311;
                        java.lang.Object initialValue313 = initialValue52;
                        java.lang.Object initialValue314 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue313))))));
                        java.lang.Object initialValue315 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue312))))));
                        java.lang.Object initialValue316 = recovery$indy$flow$645(initialValue314, initialValue315);
                        java.lang.StringBuilder initialized317 = new java.lang.StringBuilder();
                        java.lang.Object initialValue318 = initialValue52;
                        java.lang.Object initialValue319 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue318))))));
                        java.lang.Object initialValue320 = recovery$indy$flow$650(initialValue319);
                        java.lang.Object initialValue321 = recovery$indy$flow$651(initialized317, initialValue320);
                        java.lang.Object initialValue322 = recovery$indy$flow$652(initialValue321, "MotionMultiplierForward");
                        java.lang.Object initialValue323 = recovery$indy$flow$653(initialValue322);
                        client.setting.NumberSetting initialized324 = new client.setting.NumberSetting((client.module.Module) (loopLocal29), (java.lang.String) (initialValue323), 1.0D, 0.0D, Double.longBitsToDouble(4611686018427387904L), 2, (client.setting.SettingGroup) (initialValue74), loopLocal44);
                        java.lang.StringBuilder initialized325 = new java.lang.StringBuilder();
                        java.lang.Object initialValue326 = recovery$indy$flow$657(initialized325, "Motion multiplier forward in ");
                        java.lang.Object initialValue327 = recovery$indy$flow$658(initialValue326, initialValue58);
                        java.lang.Object initialValue328 = recovery$indy$flow$659(initialValue327);
                        short converted329 = (short) (loopLocal38);
                        int initialValue330 = (int) (converted329);
                        int initialValue331 = loopLocal37;
                        java.lang.Object initialValue332 = initialValue328;
                        int initialValue333 = loopLocal36;
                        client.setting.NumberSetting initialValue334 = initialized324;
                        java.lang.Object initialValue335 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue334))))));
                        java.lang.Object initialValue336 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue332))))));
                        java.lang.Object initialValue337 = recovery$indy$flow$662(initialValue335, initialValue333, initialValue336, initialValue331, (short) (initialValue330));
                        java.lang.Object initialValue338 = initialValue337;
                        java.lang.Object initialValue339 = initialValue52;
                        java.lang.Object initialValue340 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue339))))));
                        java.lang.Object initialValue341 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue338))))));
                        java.lang.Object initialValue342 = recovery$indy$flow$665(initialValue340, initialValue341);
                    }
                    java.lang.StringBuilder initialized343 = new java.lang.StringBuilder();
                    java.lang.Object initialValue344 = initialValue52;
                    java.lang.Object initialValue345 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue344))))));
                    java.lang.Object initialValue346 = recovery$indy$flow$670(initialValue345);
                    java.lang.Object initialValue347 = recovery$indy$flow$671(initialized343, initialValue346);
                    java.lang.Object initialValue348 = recovery$indy$flow$672(initialValue347, "MotionMultiplierDiagonal");
                    java.lang.Object initialValue349 = recovery$indy$flow$673(initialValue348);
                    client.setting.NumberSetting initialized350 = new client.setting.NumberSetting((client.module.Module) (loopLocal29), (java.lang.String) (initialValue349), 1.0D, 0.0D, Double.longBitsToDouble(4611686018427387904L), 2, (client.setting.SettingGroup) (initialValue74), loopLocal44);
                    java.lang.StringBuilder initialized351 = new java.lang.StringBuilder();
                    java.lang.Object initialValue352 = recovery$indy$flow$677(initialized351, "Motion multiplier diagonal in ");
                    java.lang.Object initialValue353 = recovery$indy$flow$678(initialValue352, initialValue58);
                    java.lang.Object initialValue354 = recovery$indy$flow$679(initialValue353);
                    short converted355 = (short) (loopLocal38);
                    int initialValue356 = (int) (converted355);
                    int initialValue357 = loopLocal37;
                    java.lang.Object initialValue358 = initialValue354;
                    int initialValue359 = loopLocal36;
                    client.setting.NumberSetting initialValue360 = initialized350;
                    java.lang.Object initialValue361 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue360))))));
                    java.lang.Object initialValue362 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue358))))));
                    java.lang.Object initialValue363 = recovery$indy$flow$682(initialValue361, initialValue359, initialValue362, initialValue357, (short) (initialValue356));
                    java.lang.Object initialValue364 = initialValue363;
                    java.lang.Object initialValue365 = initialValue52;
                    java.lang.Object initialValue366 = ((java.lang.Object)(((net.C_471y) (((java.lang.Object)(initialValue365))))));
                    java.lang.Object initialValue367 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue364))))));
                    java.lang.Object initialValue368 = recovery$indy$flow$685(initialValue366, initialValue367);
                    int incremented369 = loopLocal49 + (1);
                    merged370 = incremented369;
                }
                if (loopLocal46 == 0) {
                    GuiMove_47Qc loopNext371 = loopLocal29;
                    long loopNext372 = loopLocal30;
                    long loopNext373 = loopLocal31;
                    int loopNext374 = loopLocal32;
                    int loopNext375 = loopLocal33;
                    int loopNext376 = loopLocal34;
                    long loopNext377 = loopLocal35;
                    int loopNext378 = loopLocal36;
                    int loopNext379 = loopLocal37;
                    int loopNext380 = loopLocal38;
                    int loopNext381 = loopLocal39;
                    int loopNext382 = loopLocal40;
                    int loopNext383 = loopLocal41;
                    long loopNext384 = loopLocal42;
                    long loopNext385 = loopLocal43;
                    long loopNext386 = loopLocal44;
                    long loopNext387 = loopLocal45;
                    int loopNext388 = loopLocal46;
                    java.lang.Object loopNext389 = loopLocal47;
                    int loopNext390 = loopLocal48;
                    int loopNext391 = merged370;
                    loopLocal29 = loopNext371;
                    loopLocal30 = loopNext372;
                    loopLocal31 = loopNext373;
                    loopLocal32 = loopNext374;
                    loopLocal33 = loopNext375;
                    loopLocal34 = loopNext376;
                    loopLocal35 = loopNext377;
                    loopLocal36 = loopNext378;
                    loopLocal37 = loopNext379;
                    loopLocal38 = loopNext380;
                    loopLocal39 = loopNext381;
                    loopLocal40 = loopNext382;
                    loopLocal41 = loopNext383;
                    loopLocal42 = loopNext384;
                    loopLocal43 = loopNext385;
                    loopLocal44 = loopNext386;
                    loopLocal45 = loopNext387;
                    loopLocal46 = loopNext388;
                    loopLocal47 = loopNext389;
                    loopLocal48 = loopNext390;
                    loopLocal49 = loopNext391;
                    continue loop50;
                } else {
                    break loop50;
                }
            }
        }
        return;
    }










    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native boolean recovery$indy$flow$315(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$316(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$318(java.lang.Object a0,long a1,byte a2,long a3,long a4);
    private static native void recovery$indy$flow$320(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$321(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$323(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$325(int a0,long a1);
    private static native boolean recovery$indy$flow$328(java.lang.Object a0,long a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$330(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$333(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$335(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$338(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$341(java.lang.Object a0,int a1,long a2,int a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$344(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$347(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$349(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$352(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$355(java.lang.Object a0,int a1,long a2,int a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$358(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$361(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$363(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$366(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$369(java.lang.Object a0,int a1,long a2,int a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$372(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$375(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$377(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$380(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$383(java.lang.Object a0,int a1,long a2,int a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$386(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$389(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$391(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$394(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$397(java.lang.Object a0,int a1,long a2,int a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$400(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$403(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native boolean recovery$indy$flow$404(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$406(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$409(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$412(java.lang.Object a0,int a1,long a2,int a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$415(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$418(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$420(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$423(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$425(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$428(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$431(java.lang.Object a0,int a1,long a2,int a3,long a4,long a5);
    private static native java.lang.Object recovery$indy$flow$434();
    private static native void recovery$indy$flow$436(java.lang.Object a0,java.lang.Object a1);
    private static native boolean recovery$indy$flow$437();
    private static native void recovery$indy$flow$440(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$441(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.GuiMove_47Qc) (a0)).field_48 = ((net.C_471y) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$442();

    private static native java.lang.Object recovery$indy$flow$444(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$445() {
        return java.util.Locale.ROOT;
    }
    private static java.lang.Object recovery$indy$flow$446(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).toLowerCase(((java.util.Locale) (a1)));
    }

    private static native java.lang.Object recovery$indy$flow$449(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$451(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$452(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$455(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);

    private static native java.lang.Object recovery$indy$flow$460(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$461(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$462(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$463(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native java.lang.Object recovery$indy$flow$464(int a0);


    private static native java.lang.Object recovery$indy$flow$468(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$471(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$476(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$477(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$478(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$479(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$483(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$484(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$485(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$488(java.lang.Object a0,java.lang.Object a1,long a2);



    private static native java.lang.Object recovery$indy$flow$492(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$497(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$498(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$499(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$500(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$504(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$505(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$506(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$509(java.lang.Object a0,java.lang.Object a1,long a2);



    private static native java.lang.Object recovery$indy$flow$513(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$514() {
        return net.C_471y.INVENTORY;
    }


    private static native java.lang.Object recovery$indy$flow$519(java.lang.Object a0,java.lang.Object a1,long a2);

    private static void recovery$indy$flow$521(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.player.GuiMove_47Qc) (a0)).settingNoInvPacket = ((client.setting.BooleanSetting) (a1));
        return;
    }

    private static native java.lang.Object recovery$indy$flow$526(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$527(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$528(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$529(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$533(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$534(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$535(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$538(java.lang.Object a0,java.lang.Object a1,long a2);



    private static native java.lang.Object recovery$indy$flow$542(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$547(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$548(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$549(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$550(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$554(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$555(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$556(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$559(java.lang.Object a0,java.lang.Object a1,long a2);


    private static native java.lang.Object recovery$indy$flow$562(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$563(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$564(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$567(java.lang.Object a0,long a1,java.lang.Object a2);



    private static native java.lang.Object recovery$indy$flow$571(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$576(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$577(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$578(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$579(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$583(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$584(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$585(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$588(java.lang.Object a0,java.lang.Object a1,long a2);



    private static native java.lang.Object recovery$indy$flow$592(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$597(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$598(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$599(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$600(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$604(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$605(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$606(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$609(java.lang.Object a0,java.lang.Object a1,long a2);



    private static native java.lang.Object recovery$indy$flow$613(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$618(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$619(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$620(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$621(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native java.lang.Object recovery$indy$flow$622(int a0);


    private static native java.lang.Object recovery$indy$flow$626(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$629(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$634(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$635(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$636(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$637(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$641(java.lang.Object a0,java.lang.Object a1,long a2);



    private static native java.lang.Object recovery$indy$flow$645(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$650(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$651(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$652(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$653(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$657(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$658(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$659(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$662(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);


    private static native java.lang.Object recovery$indy$flow$665(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$670(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$671(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$672(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$673(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$677(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$678(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$679(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$682(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);


    private static native java.lang.Object recovery$indy$flow$685(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native NumberSetting recovery$indy$2(Object var0, long var1, long var3);
   private static native double recovery$indy$3(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$4(long var0, long var2);
   private static native boolean recovery$indy$5(Object var0, long var1, byte var3, long var4, long var6);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$7(long var0, long var2, long var4);
   private static native void recovery$indy$8(Object var0, boolean var1, long var2, long var4);
   private static native boolean recovery$indy$9(long var0, long var2);
   private static native boolean recovery$indy$10(Object var0, long var1, byte var3, long var4, long var6);
   private static native String recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$12(int var0, long var1);
   private static native void recovery$indy$13(Object var0, boolean var1, long var2, long var4);
   private static native boolean recovery$indy$14(long var0, long var2);
   private static native C_473U recovery$indy$15(Object var0, long var1, long var3);
   private static native boolean recovery$indy$16(Object var0, long var1, long var3);
   private static native boolean recovery$indy$17(int var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$18(long var0, long var2);
   private static native BooleanSetting recovery$indy$19(Object var0, long var1, long var3);
   private static native boolean recovery$indy$20(Object var0, long var1, long var3);
   private static native boolean recovery$indy$21(long var0, long var2);
   private static native boolean recovery$indy$22(long var0, long var2);
   private static native NumberSetting recovery$indy$23(Object var0, long var1, long var3);
   private static native double recovery$indy$24(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$25(long var0, long var2);
   private static native boolean recovery$indy$26(Object var0, long var1, byte var3, long var4, long var6);
   private static native String recovery$indy$27(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$28(int var0, long var1);
   private static native String recovery$indy$29(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$30(int var0, long var1);
   private static native GuiScreen recovery$indy$31(Object var0, long var1, long var3);
   private static native void recovery$indy$32(Object var0, boolean var1, long var2, long var4);
   private static native boolean recovery$indy$33(long var0, long var2);
   private static native ModeSetting recovery$indy$34(Object var0, long var1, long var3);
   private static native String recovery$indy$35(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$36(long var0, long var2);
   private static native GuiScreen recovery$indy$37(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$38(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$39(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$40(Object var0, long var1, long var3);
   private static native boolean recovery$indy$41(long var0, long var2);
   private static native GuiScreen recovery$indy$42(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$43(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$44(Object var0, long var1, long var3);
   private static native boolean recovery$indy$45(Object var0, char var1, int var2, short var3, long var4, long var6);
   private static native GuiScreen recovery$indy$46(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$47(Object var0, long var1, long var3);
   private static native boolean recovery$indy$48(Object var0, long var1, long var3);
   private static native boolean recovery$indy$49(long var0, long var2);
   private static native BooleanSetting recovery$indy$50(Object var0, long var1, long var3);
   private static native void recovery$indy$51(Object var0, boolean var1, long var2, long var4);
   private static native String recovery$indy$52(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$53(int var0, long var1);
   private static native boolean recovery$indy$54(Object var0, long var1, byte var3, long var4, long var6);
   private static native C_47oo recovery$indy$55(Object var0, long var1, long var3);
   private static native boolean recovery$indy$56(Object var0, long var1, int var3, long var4, long var6);
   private static native C_47oo recovery$indy$57(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$58(Object var0, long var1, long var3);
   private static native boolean recovery$indy$59(Object var0, int var1, long var2, int var4, long var5, long var7);
   private static native C_47oo recovery$indy$60(Object var0, long var1, long var3);
   private static native boolean recovery$indy$61(Object var0, long var1, int var3, long var4, long var6);
   private static native C_47oo recovery$indy$62(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$63(Object var0, long var1, long var3);
   private static native boolean recovery$indy$64(Object var0, int var1, long var2, int var4, long var5, long var7);
   private static native C_47oo recovery$indy$65(Object var0, long var1, long var3);
   private static native boolean recovery$indy$66(Object var0, long var1, int var3, long var4, long var6);
   private static native C_47oo recovery$indy$67(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$68(Object var0, long var1, long var3);
   private static native boolean recovery$indy$69(Object var0, int var1, long var2, int var4, long var5, long var7);
   private static native C_47oo recovery$indy$70(Object var0, long var1, long var3);
   private static native boolean recovery$indy$71(Object var0, long var1, int var3, long var4, long var6);
   private static native C_47oo recovery$indy$72(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$73(Object var0, long var1, long var3);
   private static native boolean recovery$indy$74(Object var0, int var1, long var2, int var4, long var5, long var7);
   private static native boolean recovery$indy$75(Object var0, long var1, long var3, long var5);
   private static native C_47oo recovery$indy$76(Object var0, long var1, long var3);
   private static native boolean recovery$indy$77(Object var0, long var1, int var3, long var4, long var6);
   private static native C_47oo recovery$indy$78(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$79(Object var0, long var1, long var3);
   private static native boolean recovery$indy$80(Object var0, int var1, long var2, int var4, long var5, long var7);
   private static native boolean recovery$indy$81(Object var0, long var1, long var3, long var5);
   private static native C_47oo recovery$indy$82(Object var0, long var1, long var3);
   private static native boolean recovery$indy$83(Object var0, long var1, int var3, long var4, long var6);
   private static native C_47oo recovery$indy$84(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$85(Object var0, long var1, long var3);
   private static native boolean recovery$indy$86(Object var0, int var1, long var2, int var4, long var5, long var7);
   private static native C_47oo recovery$indy$87(Object var0, long var1, long var3);
   private static native boolean recovery$indy$88(Object var0, long var1, int var3, long var4, long var6);
   private static native C_47oo recovery$indy$89(Object var0, long var1, long var3);
   private static native boolean recovery$indy$90(Object var0, long var1, byte var3, long var4, long var6);
   private static native boolean recovery$indy$91(Object var0, int var1, long var2, long var4, long var6);
   private static native float recovery$indy$92(Object var0, long var1, long var3);
   private static native void recovery$indy$93(Object var0, float var1, long var2, long var4);
   private static native float recovery$indy$94(Object var0, long var1, long var3);
   private static native void recovery$indy$95(Object var0, float var1, long var2, long var4);
   private static native boolean recovery$indy$96(Object var0, long var1, byte var3, long var4, long var6);
   private static native String recovery$indy$97(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$98(int var0, long var1);
   private static native void recovery$indy$99(Object var0, boolean var1, long var2, long var4);
   private static native boolean recovery$indy$100(long var0, long var2);
   private static native boolean recovery$indy$101(Object var0, long var1, byte var3, long var4, long var6);
   private static native GuiScreen recovery$indy$102(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$103(Object var0, long var1, long var3);
   private static native boolean recovery$indy$104(float var0, long var1, long var3, long var5);
   private static native double recovery$indy$105(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$106(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$107(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$108(int var0, long var1);
   private static native boolean recovery$indy$109(Object var0, long var1, long var3, long var5, long var7);
   private static native EntityPlayerSP recovery$indy$110(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$111(Object var0, long var1, long var3);
   private static native double recovery$indy$112(int var0, int var1, float var2, int var3, long var4, long var6);
   private static native boolean recovery$indy$113(float var0, long var1, long var3, long var5);
   private static native double recovery$indy$114(Object var0, long var1, long var3);
   private static native void recovery$indy$115(Object var0, double var1, long var3, long var5);
   private static native double recovery$indy$116(Object var0, long var1, long var3);
   private static native void recovery$indy$117(Object var0, double var1, long var3, long var5);
   private static native boolean recovery$indy$118(long var0, long var2);
   private static native ModeSetting recovery$indy$119(Object var0, long var1, long var3);
   private static native String recovery$indy$120(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$121(long var0, long var2);
   private static native boolean recovery$indy$122(Object var0, long var1, byte var3, long var4, long var6);
   private static native String recovery$indy$123(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$124(int var0, long var1);
   private static native void recovery$indy$125(Object var0, boolean var1, long var2, long var4);
   private static native String recovery$indy$126(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$127(int var0, long var1);
   private static native String recovery$indy$128(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$129(int var0, long var1);
   private static native GuiScreen recovery$indy$130(Object var0, long var1, long var3);
   private static native void recovery$indy$131(Object var0, long var1, boolean var3, long var4, long var6);
   private static native boolean recovery$indy$132(long var0, long var2);
   private static native BooleanSetting recovery$indy$133(Object var0, long var1, long var3);
   private static native boolean recovery$indy$134(Object var0, long var1, long var3);
   private static native boolean recovery$indy$135(long var0, long var2);
   private static native BooleanSetting recovery$indy$136(Object var0, long var1, long var3);
   private static native boolean recovery$indy$137(Object var0, long var1, long var3);
   private static native void recovery$indy$138(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$139(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$140(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$141(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$142(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$143(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$144(long var0, long var2);
   private static native boolean recovery$indy$145(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$146(Object var0, long var1, byte var3, long var4, long var6);
   private static native boolean recovery$indy$147(long var0, long var2);
   private static native BooleanSetting recovery$indy$148(Object var0, long var1, long var3);
   private static native boolean recovery$indy$149(Object var0, long var1, long var3);
   private static native boolean recovery$indy$150(long var0, long var2);
   private static native BooleanSetting recovery$indy$151(Object var0, long var1, long var3);
   private static native boolean recovery$indy$152(Object var0, long var1, long var3);
   private static native boolean recovery$indy$153(long var0, long var2);
   private static native BooleanSetting recovery$indy$154(Object var0, long var1, long var3);
   private static native boolean recovery$indy$155(Object var0, long var1, long var3);
   private static native boolean recovery$indy$156(long var0, long var2);
   private static native BooleanSetting recovery$indy$157(Object var0, long var1, long var3);
   private static native boolean recovery$indy$158(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$207();
}
