package augustus.recovered.modules.combat;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_46_;
import net.C_473U;
import net.C_477Q;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47FQ;
import net.C_47K6;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47Yl;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import net.C_47rf;
import client.module.Category;
import net.C_47xz;
import net.C_488;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AntiBot_47CG extends client.module.Module implements net.C_47iC,net.C_47xz {
    private final java.util.HashSet field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashSet field_438 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.List field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.List field_40 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.List field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.List field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.List field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingTicksExisted = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDistanceCheck = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingCheckDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingBlockHits = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDebug = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static int[] field_43F; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private boolean method_41$7177253c32(char var1, EntityPlayer var2, char var3, int var4) {
      int[] var28;
      int[] var29;
      int[] var30;
      int[] var31;
      int[] var32;
      int[] var33;
      int[] var34;
      int[] var35;
      int[] var36;
      int[] var37;
      int[] var38;
      int[] var39;
      int[] var40;
      int[] var41;
      int[] var42;
      int[] var43;
      long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 12571359558301L;
      long var9 = var5 ^ 49750115116987L;
      long var11 = var5 ^ 85748937995328L;
      long var13 = var5 ^ 107393993489951L;
      long var10001 = var5 ^ 88084699703652L;
      int var15 = (int)((var5 ^ 88084699703652L) >>> 32);
      int var16 = (int)((var5 ^ 88084699703652L) << 32 >>> 48);
      int var17 = (int)(var10001 << 48 >>> 48);
      int[] var18 = recovery$indy$1(3155201511035016795L, var5);
      C_47Yl var19 = recovery$indy$2(field_43, 3156262641777066930L, var5).method_46$f2f51c3dae(var2.method_46$48a3a9a042());
      int var10000 = (int) ((recovery$indy$3(C_488.ADVANCED, 3154995252048380798L, var5)) ? 1 : 0);
      if (var18 == null) {
         label611:
         if (var10000 != 0) {
            EntityPlayer var21 = recovery$indy$4(field_43, 3155893643151702543L, var5);
            if (var18 == null) {
               if (var21.field_48y <= 110) {
                  recovery$indy$5(this, var2, 3154921185620895184L, var5);
                  break label611;
               }

               var21 = var2;
            }

            if (var21.method_44$0e30dfc966() == "") {
               return true;
            }
         }

         var10000 = (int) ((recovery$indy$6(C_488.ILLEGAL_PITCH, 3154995252048380798L, var5)) ? 1 : 0);
      }

      label604: {
         label603:
         if (var18 == null) {
            if (var10000 != 0) {
               float var44;
               var10000 = (var44 = Math.abs(var2.field_48z) - 90.0F) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
               var28 = var18;
               if (var3 < 0) {
                  break label604;
               }

               if (var18 != null) {
                  break label603;
               }

               if (var10000 > 0) {
                  return true;
               }
            }

            var10000 = (int) ((recovery$indy$7(C_488.NULL_TEAM, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var28 = var18;
      }

      if (var1 >= 0) {
         if (var28 == null) {
            if (var10000 != 0 && var2.method_46$0204dff076() == null) {
               return true;
            }

            var10000 = (int) ((recovery$indy$8(C_488.NEGATIVE_HEALTH, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var28 = var18;
      }

      label592: {
         label591:
         if (var28 == null) {
            if (var10000 != 0) {
               float var45;
               var10000 = (var45 = var2.method_43$bc607678b6() - 0.0F) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
               var29 = var18;
               if (var3 <= 0) {
                  break label592;
               }

               if (var18 != null) {
                  break label591;
               }

               if (var10000 < 0) {
                  return true;
               }
            }

            var10000 = (int) ((recovery$indy$9(C_488.INVALID_ENTITY_ID, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var29 = var18;
      }

      label644: {
         label577:
         if (var29 == null) {
            if (var10000 != 0) {
               var10000 = var2.method_49$8abf5c6871();
               if (var18 != null) {
                  return var10000 != 0;
               }

               if (var10000 < 0) {
                  return true;
               }

               var10000 = var2.method_49$8abf5c6871();
               var30 = var18;
               if (var3 < 0) {
                  break label644;
               }

               if (var18 != null) {
                  break label577;
               }

               if (var10000 > 999999999) {
                  return true;
               }
            }

            var10000 = (int) ((recovery$indy$10(C_488.INTAVE, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var30 = var18;
      }

      label559: {
         label558:
         if (var30 == null) {
            label556:
            if (var10000 != 0) {
               C_47Yl var23 = var19;
               if (var18 == null) {
                  if (var19 == null) {
                     break label556;
                  }

                  var23 = var19;
               }

               C_46_ var20 = var23.method_42$47a7a6d93d();
               C_46_ var24 = var20;
               if (var18 == null) {
                  if (var20 == null) {
                     break label556;
                  }

                  var24 = var20;
               }

               var10000 = (int) ((var24.method_47$0e30dfc966().equals("")) ? 1 : 0);
               var31 = var18;
               if (var4 < 0) {
                  break label559;
               }

               if (var18 != null) {
                  break label558;
               }

               if (var10000 != 0) {
                  return true;
               }
            }

            var10000 = (int) ((recovery$indy$11(C_488.HYPIXEL, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var31 = var18;
      }

      label538: {
         label537:
         if (var31 == null) {
            label535:
            if (var10000 != 0) {
               C_47Yl var25 = var19;
               if (var18 == null) {
                  if (var19 == null) {
                     break label535;
                  }

                  var25 = var19;
               }

               var10000 = var25.method_40$8abf5c6871();
               var32 = var18;
               if (var1 < 0) {
                  break label538;
               }

               if (var18 != null) {
                  break label537;
               }

               if (var10000 != 1) {
                  return true;
               }
            }

            var10000 = (int) ((recovery$indy$12(C_488.ZERO_PING, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var32 = var18;
      }

      label522: {
         label521:
         if (var32 == null) {
            if (var10000 != 0) {
               var10000 = var2.field_48y;
               if (var18 != null) {
                  break label521;
               }

               label517:
               if (var2.field_48y > 5) {
                  C_47Yl var26 = var19;
                  if (var18 == null) {
                     if (var19 == null) {
                        break label517;
                     }

                     var26 = var19;
                  }

                  var10000 = var26.method_40$8abf5c6871();
                  var33 = var18;
                  if (var1 < 0) {
                     break label522;
                  }

                  if (var18 != null) {
                     break label521;
                  }

                  if (var10000 == 0) {
                     return true;
                  }
               }
            }

            var10000 = (int) ((recovery$indy$13(C_488.TAB_LIST, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var33 = var18;
      }

      label503: {
         label502:
         if (var33 == null) {
            if (var10000 != 0 && var19 == null) {
               var10000 = var2.field_48y;
               var34 = var18;
               if (var1 < 0) {
                  break label503;
               }

               if (var18 != null) {
                  break label502;
               }

               if (var2.field_48y > 20) {
                  recovery$indy$14(this, var2, 3154921185620895184L, var5);
                  return true;
               }
            }

            var10000 = (int) ((recovery$indy$15(C_488.INVALID_NAME, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var34 = var18;
      }

      if (var1 >= 0) {
         if (var34 == null) {
            if (var10000 != 0) {
               boolean var27 = recovery$indy$16(var15, (short)var16, (char)var17, var2.method_41$0e30dfc966(), 3156418452784249966L, var5);
               if (var18 == null) {
                  var27 = !var27;
               }

               return var27;
            }

            var10000 = (int) ((recovery$indy$17(C_488.SWING, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var34 = var18;
      }

      label490: {
         label489:
         if (var34 == null) {
            if (var10000 != 0) {
               label485: {
                  var10000 = (int) ((var2.field_488) ? 1 : 0);
                  label484:
                  if (var18 == null) {
                     if (var2.field_488) {
                        var10000 = (int) ((this.field_40.contains(var2)) ? 1 : 0);
                        var35 = var18;
                        if (var1 < 0) {
                           break label485;
                        }

                        if (var18 != null) {
                           break label484;
                        }

                        if (var10000 == 0) {
                           this.field_40.add(var2);
                        }
                     }

                     var10000 = (int) ((this.field_40.contains(var2)) ? 1 : 0);
                  }

                  var35 = var18;
               }

               if (var35 != null) {
                  break label489;
               }

               if (var10000 == 0) {
                  var10000 = (int) ((recovery$indy$18(this, var7, var2, 3154438402749176968L, var5)) ? 1 : 0);
                  var36 = var18;
                  if (var3 < 0) {
                     break label490;
                  }

                  if (var18 != null) {
                     break label489;
                  }

                  if (var10000 != 0) {
                     recovery$indy$19(this, var2, 3154921185620895184L, var5);
                     return true;
                  }
               }
            }

            var10000 = (int) ((recovery$indy$20(C_488.NEVER_ON_GROUND, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var36 = var18;
      }

      label465: {
         label464:
         if (var36 == null) {
            if (var10000 != 0) {
               label460: {
                  var10000 = (int) ((recovery$indy$21(this, var11, var2, 3155498879337249004L, var5)) ? 1 : 0);
                  label459:
                  if (var18 == null) {
                     if (var10000 != 0) {
                        var10000 = (int) ((this.field_44.contains(var2)) ? 1 : 0);
                        var37 = var18;
                        if (var4 < 0) {
                           break label460;
                        }

                        if (var18 != null) {
                           break label459;
                        }

                        if (var10000 == 0) {
                           this.field_44.add(var2);
                        }
                     }

                     var10000 = (int) ((this.field_44.contains(var2)) ? 1 : 0);
                  }

                  var37 = var18;
               }

               if (var37 != null) {
                  break label464;
               }

               if (var10000 == 0) {
                  var10000 = (int) ((recovery$indy$22(this, var7, var2, 3154438402749176968L, var5)) ? 1 : 0);
                  var38 = var18;
                  if (var1 < 0) {
                     break label465;
                  }

                  if (var18 != null) {
                     break label464;
                  }

                  if (var10000 != 0) {
                     recovery$indy$23(this, var2, 3154921185620895184L, var5);
                     return true;
                  }
               }
            }

            var10000 = (int) ((recovery$indy$24(C_488.ITEM, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var38 = var18;
      }

      label440: {
         label439:
         if (var38 == null) {
            if (var10000 != 0) {
               label435: {
                  label434: {
                     if (var2.method_41$ac4db64966() != null) {
                        var10000 = (int) ((this.field_45.contains(var2)) ? 1 : 0);
                        var39 = var18;
                        if (var1 < 0) {
                           break label435;
                        }

                        if (var18 != null) {
                           break label434;
                        }

                        if (var10000 == 0) {
                           this.field_45.add(var2);
                        }
                     }

                     var10000 = (int) ((this.field_45.contains(var2)) ? 1 : 0);
                  }

                  var39 = var18;
               }

               if (var39 != null) {
                  break label439;
               }

               if (var10000 == 0) {
                  var10000 = (int) ((recovery$indy$25(this, var7, var2, 3154438402749176968L, var5)) ? 1 : 0);
                  var40 = var18;
                  if (var4 <= 0) {
                     break label440;
                  }

                  if (var18 != null) {
                     break label439;
                  }

                  if (var10000 != 0) {
                     recovery$indy$26(this, var2, 3154921185620895184L, var5);
                     return true;
                  }
               }
            }

            var10000 = (int) ((recovery$indy$27(C_488.ARMOR, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var40 = var18;
      }

      label416: {
         label415:
         if (var40 == null) {
            if (var10000 != 0) {
               label411: {
                  var10000 = (int) ((recovery$indy$28(this, var13, var2, 3156360709644506080L, var5)) ? 1 : 0);
                  label410:
                  if (var18 == null) {
                     if (var10000 != 0) {
                        var10000 = (int) ((this.field_47.contains(var2)) ? 1 : 0);
                        var41 = var18;
                        if (var3 <= 0) {
                           break label411;
                        }

                        if (var18 != null) {
                           break label410;
                        }

                        if (var10000 == 0) {
                           this.field_47.add(var2);
                        }
                     }

                     var10000 = (int) ((this.field_47.contains(var2)) ? 1 : 0);
                  }

                  var41 = var18;
               }

               if (var41 != null) {
                  break label415;
               }

               if (var10000 == 0) {
                  var10000 = (int) ((recovery$indy$29(this, var7, var2, 3154438402749176968L, var5)) ? 1 : 0);
                  var42 = var18;
                  if (var3 <= 0) {
                     break label416;
                  }

                  if (var18 != null) {
                     break label415;
                  }

                  if (var10000 != 0) {
                     recovery$indy$30(this, var2, 3154921185620895184L, var5);
                     return true;
                  }
               }
            }

            var10000 = (int) ((recovery$indy$31(C_488.SOUND, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var42 = var18;
      }

      label391: {
         label390:
         if (var42 == null) {
            if (var10000 != 0) {
               var10000 = (int) ((this.field_46.contains(var2)) ? 1 : 0);
               if (var18 != null) {
                  break label390;
               }

               if (var10000 == 0) {
                  var10000 = (int) ((recovery$indy$32(this, var7, var2, 3154438402749176968L, var5)) ? 1 : 0);
                  var43 = var18;
                  if (var4 < 0) {
                     break label391;
                  }

                  if (var18 != null) {
                     break label390;
                  }

                  if (var10000 != 0) {
                     recovery$indy$33(this, var2, 3154921185620895184L, var5);
                     return true;
                  }
               }
            }

            var10000 = (int) ((recovery$indy$34(C_488.TICKS_EXISTED, 3154995252048380798L, var5)) ? 1 : 0);
         }

         var43 = var18;
      }

      if (var43 == null) {
         if (var10000 != 0) {
            double var46;
            var10000 = (var46 = var2.field_48y - recovery$indy$35(this.settingTicksExisted, var9, 3154340877878538603L, var5)) == 0.0 ? 0 : (var46 < 0.0 ? -1 : 1);
            if (var18 != null) {
               return var10000 != 0;
            }

            if (var10000 < 0) {
               recovery$indy$36(this, var2, 3154921185620895184L, var5);
               return true;
            }
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }









   public static int[] method_40$d4d28024c9() {
      return field_43F;
   }



   private static boolean method_40$7c2c45e4ce(Entity var0) {
      long var1 = a ^ 69588296741156L;
      long var10000 = -3951108495106214728L;
      int[] var3 = method_40$d4d28024c9();
      long var10001 = -3951634200670312488L;
      Minecraft var4 = field_43;
      boolean var5 = var4.field_44Q.field_44Q.contains(var0);
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private void method_40$da8c82d5d4() {
      this.field_42.clear();
      this.field_438.clear();
      this.field_44.clear();
      this.field_45.clear();
      this.field_47.clear();
      this.field_46.clear();
      this.field_40.clear();
   }



   public boolean method_44$5909fdf9ee(long var1, Entity var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 80350385097951L;
      int[] var6 = recovery$indy$37(4794285196186746650L, var1);
      boolean var10000 = recovery$indy$38(this, var4, 4795230523297362904L, var1);
      if (var6 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.field_42.contains(var3);
      }

      return var6 != null ? var10000 : var10000;
   }



   private void method_48$5b9c51f5c2(EntityPlayer var1) {
      this.field_438.add(var1);
   }



   private boolean method_48$5161acda81(long var1, EntityPlayer var3) {
      var1 = a ^ var1;
      int[] var4 = recovery$indy$39(-1761012328719427043L, var1);
      boolean var10000 = var3.field_47.method_40$d4a3a06218(var3, var3.method_45$6684d3c618().method_47$800791f322(0.0, -0.01, 0.0)).isEmpty();
      if (var4 == null) {
         var10000 = !var10000;
      }

      return var10000;
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 109608443794412L;
      long var10000 = -6061129060589496720L;
      int[] var3 = method_40$d4d28024c9();
      long var10001 = -6058127031073180191L;
      BooleanSetting var4 = this.settingDistanceCheck;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -6061780636337835616L;
         BooleanSetting var5 = this.settingDistanceCheck;
         var6 = var5.method_44$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }



   private boolean method_49$5161acda81(long var1, EntityPlayer var3) {
      var1 = a ^ var1;
      int[] var4 = recovery$indy$40(-1310392673501163454L, var1);
      C_47rf var10000 = var3.field_42X.field_43[3];
      if (var4 == null) {
         if (var10000 != null) {
            return true;
         }

         var10000 = var3.field_42X.field_43[2];
      }

      int[] var10001 = var4;
      if (var1 >= 0L) {
         if (var4 == null) {
            if (var10000 != null) {
               return true;
            }

            var10000 = var3.field_42X.field_43[1];
         }

         var10001 = var4;
      }

      if (var10001 == null) {
         if (var10000 != null) {
            return true;
         }

         var10000 = var3.field_42X.field_43[0];
      }

      return var10000 != null;
   }



   private boolean method_45$5161acda81(long var1, EntityPlayer var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 83829003527456L;
      int[] var6 = recovery$indy$41(7589381261287675072L, var1);
      int var10000 = (int) ((recovery$indy$42(this.settingDistanceCheck, 7592322023405795153L, var1)) ? 1 : 0);
      if (var6 == null) {
         if ((var10000) != 0) {
            double var8;
            var10000 = (
                     var8 = recovery$indy$43(field_43, 7588738607761995924L, var1).method_44$ee256e8a75(var3)
                        - recovery$indy$44(this.settingCheckDistance, var4, 7592252388044174320L, var1)
                  )
                  == 0.0
               ? 0
               : (var8 < 0.0 ? -1 : 1);
            if (var6 != null) {
               return var10000 != 0;
            }

            if (var10000 >= 0) {
               return false;
            }
         }

         var10000 = 1;
      }

      return var10000 != 0;
   }



   private static boolean method_45$aae029aa0a() {
      long var0 = a ^ 120755434105535L;
      long var10000 = -3264681641169227997L;
      int[] var2 = method_40$d4d28024c9();
      long var10001 = -3264711709621689982L;
      C_488 var3 = C_488.NEVER_ON_GROUND;
      boolean var8 = C_488.method_40$f919437944(var3);
      if (var2 == null) {
         if (!var8) {
            var10001 = -3264888582930056698L;
            C_488 var4 = C_488.SWING;
            boolean var13 = var4.method_43$aae029aa0a();
            if (var2 != null) {
               return var13;
            }

            if (!var13) {
               var10001 = -3264888582930056698L;
               C_488 var5 = C_488.ITEM;
               boolean var14 = var5.method_43$aae029aa0a();
               if (var2 != null) {
                  return var14;
               }

               if (!var14) {
                  var10001 = -3264888582930056698L;
                  C_488 var6 = C_488.ARMOR;
                  boolean var15 = var6.method_43$aae029aa0a();
                  if (var2 != null) {
                     return var15;
                  }

                  if (!var15) {
                     var10001 = -3264888582930056698L;
                     C_488 var7 = C_488.SOUND;
                     boolean var16 = var7.method_43$aae029aa0a();
                     if (var2 != null) {
                        return var16;
                     }

                     if (!var16) {
                        return false;
                     }
                  }
               }
            }
         }

         var8 = true;
      }

      return var8;
   }



   private static boolean method_45$7c2c45e4ce(Entity var0) {
      long var1 = a ^ 86577207545097L;
      long var10000 = 8432891579914307733L;
      int[] var3 = method_40$d4d28024c9();
      long var10001 = 8432295780416773109L;
      Minecraft var4 = field_43;
      boolean var5 = var4.field_44Q.field_44Q.contains(var0);
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      int[] var4 = recovery$indy$45(2669424510545795225L, var1);
      C_473U var5 = recovery$indy$46(var3, 2669275434332009454L, var1);
      boolean var10000 = var5 instanceof C_47FQ;
      if (var4 == null) {
         if (var10000) {
            recovery$indy$47(this, 2669041294348494911L, var1);
         }

         var10000 = var5 instanceof C_477Q;
      }

      if (var10000 && recovery$indy$48(field_43, 2668836957431598073L, var1) != null) {
         C_477Q var6 = (C_477Q)var5;
         if (!var6.method_42$0e30dfc966().contains(recovery$indy$49(31020, 4311511195215196319L ^ var1))) {
            return;
         }

         EntityPlayer var7 = recovery$indy$50(field_43, 2668836957431598073L, var1)
            .method_40$7587c7133b(var6.method_42$fedcb3e4d3(), var6.method_48$fedcb3e4d3(), var6.method_49$fedcb3e4d3(), 1.0);
         if (var7 != null && var4 == null && !this.field_46.contains(var7)) {
            this.field_46.add(var7);
         }
      }
   }



   public static void method_43$2022b4f670(int[] var0) {
      field_43F = var0;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$51(this, 26, var3, -7099106308443538003L, var1);
      recovery$indy$52(this, 40, var3, -7099106308443538003L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
        int var38;
        int[] var40;
        int[] var44;
        int[] var48;
      label237: {
         long var4;
         long var6;
         boolean var42;
         label242: {
            var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
            var6 = var4 ^ 90571339949330L;
            long var10001 = var4 ^ 36981001997699L;
            int var8 = (int)((var4 ^ 36981001997699L) >>> 48);
            int var9 = (int)((var4 ^ 36981001997699L) << 16 >>> 48);
            int var10 = (int)(var10001 << 32 >>> 32);
            int var12 = this.field_42.size();
            int[] var10000 = method_40$d4d28024c9();
            net.minecraft.client.Minecraft var15 = field_43;
            java.util.Iterator var13 = var15.field_44Q.field_44Q.iterator();
            int[] var11 = var10000;
            Object var36;
            if (var13.hasNext()) {
               var36 = (net.minecraft.entity.Entity)var13.next();
            } else {
               var36 = this.field_42;
               if (var2 > 0) {
                  int var47 = this.field_42.size();
                  if (var11 != null) {
                     return;
                  }

                  if (var47 <= var12) {
                     this.field_42.removeIf((java.util.function.Predicate)recovery$indy$flow$254());
                     this.field_438.removeIf((java.util.function.Predicate)recovery$indy$flow$257());
                     return;
                  }

                  client.setting.BooleanSetting var35 = this.settingDebug;
                  var42 = var35.method_49$aae029aa0a();
                  if (var11 != null) {
                     return;
                  }
                  break label242;
               }
            }

            Object var14 = var36;
            var36 = var14;
            if (var11 != null) {
               while (true) {
                  label181: {
                     net.minecraft.client.Minecraft var27 = field_43;
                     label180:
                     if (var36 != var27.field_42P) {
                        net.minecraft.client.Minecraft var28 = field_43;
                        int var43 = var28.field_42P.field_48y;
                        int[] var51 = var11;
                        if (var3 > 0) {
                           if (var11 == null) {
                              if (var28.field_42P.field_48y <= 5) {
                                 break label180;
                              }

                              char var52 = (char)var8;
                              EntityPlayer var53 = (EntityPlayer)var14;
                              char var54 = (char)var9;
                              int var29 = var10;
                              char var30 = var54;
                              EntityPlayer var31 = var53;
                              char var32 = var52;
                              AntiBot_47CG var33 = this;
                              var43 = ((int) (var33.method_41$7177253c32(var32, var31, var30, var29) ? 1 : 0));
                           }

                           var51 = var11;
                        }

                        if (var3 >= 0) {
                           if (var51 == null) {
                              if (var43 != 0) {
                                 this.field_42.add(var14);
                                 var44 = var11;
                                 if (var2 < 0) {
                                    break label181;
                                 }

                                 if (var11 == null) {
                                    break label180;
                                 }
                              }

                              var43 = ((int) (this.field_438.contains(var14) ? 1 : 0));
                           }

                           var51 = var11;
                        }

                        if (var51 == null && var43 != 0) {
                           this.field_42.remove(var14);
                           this.field_438.remove(var14);
                        }
                     }

                     var44 = var11;
                  }

                  if (var44 == null && var13.hasNext()) {
                     var36 = (net.minecraft.entity.Entity)var13.next();
                  } else {
                     var36 = this.field_42;
                     if (var2 > 0) {
                        int var46 = this.field_42.size();
                        if (var11 == null) {
                           if (var46 > var12) {
                              client.setting.BooleanSetting var34 = this.settingDebug;
                              var34.method_49$aae029aa0a();
                           } else {
                              this.field_42.removeIf((java.util.function.Predicate)recovery$indy$flow$254());
                              this.field_438.removeIf((java.util.function.Predicate)recovery$indy$flow$257());
                           }

                           return;
                        }

                        return;
                     }
                  }

                  var14 = var36;
                  var36 = var14;
               }
            }

            label230: {
               while (true) {
                  var38 = ((var36 instanceof EntityPlayer) ? 1 : 0);
                  var48 = var11;
                  if (var2 <= 0) {
                     break label230;
                  }

                  if (var11 != null) {
                     break;
                  }

                  label226: {
                     if (var38 != 0) {
                        net.minecraft.client.Minecraft var16 = field_43;
                        label224:
                        if (var14 != var16.field_42P) {
                           net.minecraft.client.Minecraft var17 = field_43;
                           int var39 = var17.field_42P.field_48y;
                           int[] var49 = var11;
                           if (var3 > 0) {
                              if (var11 == null) {
                                 if (var17.field_42P.field_48y <= 5) {
                                    break label224;
                                 }

                                 char var50 = (char)var8;
                                 EntityPlayer var10002 = (EntityPlayer)var14;
                                 char var10003 = (char)var9;
                                 int var18 = var10;
                                 char var19 = var10003;
                                 EntityPlayer var20 = var10002;
                                 char var21 = var50;
                                 AntiBot_47CG var22 = this;
                                 var39 = ((int) (var22.method_41$7177253c32(var21, var20, var19, var18) ? 1 : 0));
                              }

                              var49 = var11;
                           }

                           if (var3 >= 0) {
                              if (var49 == null) {
                                 if (var39 != 0) {
                                    this.field_42.add(var14);
                                    var40 = var11;
                                    if (var2 < 0) {
                                       break label226;
                                    }

                                    if (var11 == null) {
                                       break label224;
                                    }
                                 }

                                 var39 = ((int) (this.field_438.contains(var14) ? 1 : 0));
                              }

                              var49 = var11;
                           }

                           if (var49 == null && var39 != 0) {
                              this.field_42.remove(var14);
                              this.field_438.remove(var14);
                           }
                        }
                     }

                     var40 = var11;
                  }

                  if (var40 == null && var13.hasNext()) {
                     var36 = (net.minecraft.entity.Entity)var13.next();
                  } else {
                     var36 = this.field_42;
                     if (var2 > 0) {
                        var38 = this.field_42.size();
                        break;
                     }
                  }

                  var14 = var36;
                  var36 = var14;
               }

               var48 = var11;
            }

            if (var48 != null) {
               return;
            }

            if (var38 <= var12) {
               break label237;
            }

            client.setting.BooleanSetting var23 = this.settingDebug;
            var42 = var23.method_49$aae029aa0a();
         }

         if (var42) {
            String var24 = (String)recovery$indy$flow$250(9925, 5606713186115163189L ^ var4);
            long var25 = var6;
            net.C_475e.method_46$d07b98bfef(var25, var24);
         }
      }

      this.field_42.removeIf((java.util.function.Predicate)recovery$indy$flow$254());
      this.field_438.removeIf((java.util.function.Predicate)recovery$indy$flow$257());
   }





   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$56(this, -7740737356869985882L, var1);
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      recovery$indy$57(this, 2730717623193544912L, var4);
   }



    public AntiBot_47CG(long a0) {
        super((java.lang.String) ("AntiBot"),(java.lang.String) ("GegenFakespieler"),(long) (((augustus.recovered.modules.combat.AntiBot_47CG.a ^ a0) ^ 30595264006064L)),(java.awt.Color) (java.awt.Color.BLUE),(client.module.Category) (client.module.Category.COMBAT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.combat.AntiBot_47CG.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.combat.AntiBot_47CG.a ^ a0) ^ 46378576529990L);
        long constructorKey4 = ((augustus.recovered.modules.combat.AntiBot_47CG.a ^ a0) ^ 109017488297622L);
        long constructorKey5 = ((augustus.recovered.modules.combat.AntiBot_47CG.a ^ a0) ^ 117609096879019L);
        long constructorKey6 = ((augustus.recovered.modules.combat.AntiBot_47CG.a ^ a0) ^ 78817803445292L);
        java.util.HashSet initialized7 = new java.util.HashSet();
        recovery$indy$flow$263(this, initialized7);
        java.util.HashSet initialized8 = new java.util.HashSet();
        recovery$indy$flow$266(this, initialized8);
        java.util.ArrayList initialized9 = new java.util.ArrayList();
        recovery$indy$flow$269(this, initialized9);
        java.util.ArrayList initialized10 = new java.util.ArrayList();
        recovery$indy$flow$272(this, initialized10);
        java.util.concurrent.CopyOnWriteArrayList initialized11 = new java.util.concurrent.CopyOnWriteArrayList();
        recovery$indy$flow$275(this, initialized11);
        java.util.ArrayList initialized12 = new java.util.ArrayList();
        recovery$indy$flow$278(this, initialized12);
        java.util.ArrayList initialized13 = new java.util.ArrayList();
        recovery$indy$flow$281(this, initialized13);
        java.lang.Object initialValue14 = recovery$indy$flow$283();
        client.setting.MultiSelectSetting initialized15 = new client.setting.MultiSelectSetting(this, "Mode", constructorKey3, (net.C_47OZ[]) (initialValue14));
        recovery$indy$flow$285(this, initialized15);
        client.setting.NumberSetting initialized16 = new client.setting.NumberSetting(this, "TicksExisted", Double.longBitsToDouble(4626322717216342016L), constructorKey6, 1.0D, Double.longBitsToDouble(4636737291354636288L), 0);
        java.lang.Object initialValue17 = recovery$indy$flow$288();
        java.lang.Object initialValue18 = recovery$indy$flow$289(initialValue17);
        java.lang.Object initialValue19 = recovery$indy$flow$290(initialValue17);
        java.lang.Object initialValue20 = initialValue19;
        client.setting.NumberSetting initialValue21 = initialized16;
        java.lang.Object initialValue22 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue21))))));
        java.lang.Object initialValue23 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue20))))));
        java.lang.Object initialValue24 = recovery$indy$flow$293(initialValue22, initialValue23);
        recovery$indy$flow$294(this, initialValue24);
        client.setting.BooleanSetting initialized25 = new client.setting.BooleanSetting(this, constructorKey5, "DistanceCheck", true);
        java.lang.Object initialValue26 = recovery$indy$flow$297();
        java.lang.Object initialValue27 = initialValue26;
        long initialValue28 = constructorKey4;
        client.setting.BooleanSetting initialValue29 = initialized25;
        java.lang.Object initialValue30 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue29))))));
        java.lang.Object initialValue31 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue27))))));
        java.lang.Object initialValue32 = recovery$indy$flow$300(initialValue30, initialValue28, initialValue31);
        java.lang.Object initialValue33 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue32))))));
        recovery$indy$flow$302(this, initialValue33);
        client.setting.NumberSetting initialized34 = new client.setting.NumberSetting(this, "CheckDistance", Double.longBitsToDouble(4621819117588971520L), constructorKey6, Double.longBitsToDouble(4618441417868443648L), Double.longBitsToDouble(4630826316843712512L), 0);
        java.lang.Object initialValue35 = recovery$indy$flow$305(this);
        java.lang.Object initialValue36 = initialValue35;
        client.setting.NumberSetting initialValue37 = initialized34;
        java.lang.Object initialValue38 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue37))))));
        java.lang.Object initialValue39 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue36))))));
        java.lang.Object initialValue40 = recovery$indy$flow$308(initialValue38, initialValue39);
        recovery$indy$flow$309(this, initialValue40);
        client.setting.BooleanSetting initialized41 = new client.setting.BooleanSetting(this, constructorKey5, "BlockHits", true);
        recovery$indy$flow$312(this, initialized41);
        client.setting.BooleanSetting initialized42 = new client.setting.BooleanSetting(this, constructorKey5, "Debug", false);
        recovery$indy$flow$315(this, initialized42);
    }




    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$250(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$254();
    private static native java.lang.Object recovery$indy$flow$257();
    private static native void recovery$indy$flow$263(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$266(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$269(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$272(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$275(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$278(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$281(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$283();
    private static native void recovery$indy$flow$285(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$288() {
        return net.C_488.TICKS_EXISTED;
    }
    private static java.lang.Object recovery$indy$flow$289(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$290(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$293(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$294(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$297();


    private static native java.lang.Object recovery$indy$flow$300(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$302(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$305(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$308(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$309(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$312(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$315(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native C_47K6 recovery$indy$2(Object var0, long var1, long var3);
   private static native boolean recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native void recovery$indy$5(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3);
   private static native boolean recovery$indy$8(Object var0, long var1, long var3);
   private static native boolean recovery$indy$9(Object var0, long var1, long var3);
   private static native boolean recovery$indy$10(Object var0, long var1, long var3);
   private static native boolean recovery$indy$11(Object var0, long var1, long var3);
   private static native boolean recovery$indy$12(Object var0, long var1, long var3);
   private static native boolean recovery$indy$13(Object var0, long var1, long var3);
   private static native void recovery$indy$14(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$15(Object var0, long var1, long var3);
   private static native boolean recovery$indy$16(int var0, short var1, char var2, Object var3, long var4, long var6);
   private static native boolean recovery$indy$17(Object var0, long var1, long var3);
   private static native boolean recovery$indy$18(Object var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$19(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$20(Object var0, long var1, long var3);
   private static native boolean recovery$indy$21(Object var0, long var1, Object var3, long var4, long var6);
   private static native boolean recovery$indy$22(Object var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$23(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$24(Object var0, long var1, long var3);
   private static native boolean recovery$indy$25(Object var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$26(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$27(Object var0, long var1, long var3);
   private static native boolean recovery$indy$28(Object var0, long var1, Object var3, long var4, long var6);
   private static native boolean recovery$indy$29(Object var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$30(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$31(Object var0, long var1, long var3);
   private static native boolean recovery$indy$32(Object var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$33(Object var0, Object var1, long var2, long var4);
   private static native boolean recovery$indy$34(Object var0, long var1, long var3);
   private static native double recovery$indy$35(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$36(Object var0, Object var1, long var2, long var4);
   private static native int[] recovery$indy$37(long var0, long var2);
   private static native boolean recovery$indy$38(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$39(long var0, long var2);
   private static native int[] recovery$indy$40(long var0, long var2);
   private static native int[] recovery$indy$41(long var0, long var2);
   private static native boolean recovery$indy$42(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$43(Object var0, long var1, long var3);
   private static native double recovery$indy$44(Object var0, long var1, long var3, long var5);
   private static native int[] recovery$indy$45(long var0, long var2);
   private static native C_473U recovery$indy$46(Object var0, long var1, long var3);
   private static native void recovery$indy$47(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$48(Object var0, long var1, long var3);
   private static native String recovery$indy$49(int var0, long var1);
   private static native WorldClient recovery$indy$50(Object var0, long var1, long var3);
   private static native void recovery$indy$51(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$52(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$56(Object var0, long var1, long var3);
   private static native void recovery$indy$57(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$61();
}
