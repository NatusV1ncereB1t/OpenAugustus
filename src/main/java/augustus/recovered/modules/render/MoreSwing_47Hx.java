package augustus.recovered.modules.render;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_475c;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Ij;
import client.module.Module;
import client.setting.BooleanSetting;
import net.C_47UH;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import client.module.Category;
import net.C_4f;

public class MoreSwing_47Hx extends Module implements C_47UH {
   private final BooleanSetting settingWhileKillAura;
   private final BooleanSetting settingWhileAutoClicker;
   private final BooleanSetting settingWhileLeftClick;
   private static final long a = C_4f.a(-5859991439077457133L, 2717896583462384622L, MethodHandles.lookup().lookupClass()).a(165796180761563L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[26];
   private static final String[] f = new String[26];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   @Override
   public void method_41$fae8de1664(C_475c var1) {
      EntityPlayerSP var17;
      label49: {
         long var2 = a ^ 101185098919830L;
         long var4 = var2 ^ 138504926585983L;
         long var10000 = -6881410413072135301L;
         int[] var6 = AntiStrike_47Qa.method_42$d4d28024c9();
         long var10002 = -6881169337178126226L;
         long var7 = var4;
         MoreSwing_47Hx var9 = this;
         boolean var16 = var9.method_48$0dd78e0064(var7);
         if (var6 == null) {
            if (!var16) {
               return;
            }

            long var10001 = -6881357175418803201L;
            Minecraft var10 = field_43;
            var17 = var10.field_42P;
            if (var6 != null) {
               break label49;
            }

            var16 = var10.field_42P.field_488;
         }

         if (var16) {
            long var18 = -6881357175418803201L;
            Minecraft var11 = field_43;
            var17 = var11.field_42P;
            if (var6 != null) {
               break label49;
            }

            var10002 = -6881357175418803201L;
            Minecraft var12 = field_43;
            if (var11.field_42P.field_43L < var12.field_42P.method_44$8abf5c6871() / 2) {
               var18 = -6881357175418803201L;
               Minecraft var13 = field_43;
               var17 = var13.field_42P;
               if (var6 != null) {
                  break label49;
               }

               if (var13.field_42P.field_43L >= 0) {
                  return;
               }
            }
         }

         long var20 = -6881357175418803201L;
         Minecraft var14 = field_43;
         var14.field_42P.field_43L = -1;
         var20 = -6881357175418803201L;
         Minecraft var15 = field_43;
         var17 = var15.field_42P;
      }

      var17.field_488 = true;
   }

   private boolean method_48$0dd78e0064(long var1) {
      net.minecraft.client.Minecraft var11;
      var1 = a ^ var1;
      long var3 = var1 ^ 91196002813366L;
      long var5 = var1 ^ 99069473774783L;
      long var7 = var1 ^ 115507573117856L;
      int[] var9 = recovery$indy$1(5471153265308180502L, var1);
      int var10000 = (int) ((recovery$indy$2(field_43, 5470873927978874175L, var1)) ? 1 : 0);
      if (var9 == null) {
         if (var10000 == 0) {
            return false;
         }

         var10000 = (int) ((recovery$indy$3(field_43, 5471208633433014418L, var1).method_43B$aae029aa0a()) ? 1 : 0);
      }

      int[] var10001 = var9;
      if (var1 > 0L) {
         if (var9 == null) {
            if (var10000 != 0) {
               return false;
            }

            var10000 = (int) ((recovery$indy$4(this.settingWhileKillAura, 5471067640855300983L, var1)) ? 1 : 0);
         }

         var10001 = var9;
      }

      label181: {
         label180:
         if (var10001 == null) {
            if (var10000 != 0) {
               var10000 = (int) ((recovery$indy$5(ClientGlobals.field_48.field_48Q, var3, 5470919173134647828L, var1)) ? 1 : 0);
               if (var9 != null) {
                  break label180;
               }

               if (var10000 != 0) {
                  var10000 = (int) ((recovery$indy$6(ClientGlobals.field_48.field_48Q.field_44I, 5471067640855300983L, var1)) ? 1 : 0);
                  var10001 = var9;
                  if (var1 < 0L) {
                     break label181;
                  }

                  if (var9 != null) {
                     break label180;
                  }

                  label174:
                  if (var10000 == 0 && ClientGlobals.field_48.field_48Q.field_45z != null) {
                     var11 = field_43;
                     label162:
                     if (var9 == null) {
                        label169:
                        if (recovery$indy$7(field_43, 5471208633433014418L, var1).method_40$ee256e8a75(ClientGlobals.field_48.field_48Q.field_45z)
                           < recovery$indy$8(ClientGlobals.field_48.field_48Q.field_45_, var5, 5471696322549559935L, var1)) {
                           var11 = field_43;
                           if (var9 != null) {
                              break label162;
                           }

                           double var15;
                           var10000 = (
                                    var15 = recovery$indy$9(field_43, 5471208633433014418L, var1).method_40$ee256e8a75(ClientGlobals.field_48.field_48Q.field_45z)
                                       - recovery$indy$10(ClientGlobals.field_48.field_48Q.field_42O, var5, 5471696322549559935L, var1)
                                 )
                                 == 0.0
                              ? 0
                              : (var15 < 0.0 ? -1 : 1);
                           if (var1 > 0L) {
                              if (var10000 >= 0) {
                                 break label169;
                              }

                              var10000 = (int) ((recovery$indy$11(ClientGlobals.field_48.field_48Q.field_49a, 5471067640855300983L, var1)) ? 1 : 0);
                           }

                           if (var9 != null) {
                              return var10000 != 0;
                           }

                           if (var10000 != 0) {
                              return true;
                           }
                        }

                        var11 = field_43;
                     }

                     C_47Ij var12 = recovery$indy$12(var11, 5471610044932370821L, var1);
                     if (var9 == null) {
                        if (var12 == null) {
                           break label174;
                        }

                        var12 = recovery$indy$13(field_43, 5471610044932370821L, var1);
                     }

                     if (var12.field_49 == C_47Az.ENTITY) {
                        return true;
                     }
                  }
               }
            }

            var10000 = (int) ((recovery$indy$14(this.settingWhileAutoClicker, 5471067640855300983L, var1)) ? 1 : 0);
         }

         var10001 = var9;
      }

      label147: {
         label146:
         if (var10001 == null) {
            if (var10000 != 0) {
               var10000 = (int) ((recovery$indy$15(ClientGlobals.field_48.field_46I, var3, 5470919173134647828L, var1)) ? 1 : 0);
               var10001 = var9;
               if (var1 < 0L) {
                  break label147;
               }

               if (var9 != null) {
                  break label146;
               }

               if (var10000 != 0) {
                  byte var17 = (byte) ((recovery$indy$16(ClientGlobals.field_48.field_46I.settingOnlyOnClick, 5471067640855300983L, var1)) ? 1 : 0);
                  if (var9 != null) {
                     return var17 != 0;
                  }

                  if (var17 == 0) {
                     return true;
                  }

                  var17 = (byte) ((recovery$indy$17(0, var7, 5471266709228473796L, var1)) ? 1 : 0);
                  if (var9 != null) {
                     return var17 != 0;
                  }

                  if (var17 != 0) {
                     return true;
                  }
               }
            }

            var10000 = (int) ((recovery$indy$18(this.settingWhileLeftClick, 5471067640855300983L, var1)) ? 1 : 0);
         }

         var10001 = var9;
      }

      if (var1 > 0L) {
         if (var10001 == null) {
            if (var10000 == 0) {
               return false;
            }

            var10000 = (int) ((recovery$indy$19(0, var7, 5471266709228473796L, var1)) ? 1 : 0);
         }

         var10001 = var9;
      }

      return (boolean)(var10001 != null ? var10000 : var10000 != 0);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      recovery$indy$20(this, 7, 1000000, var3, -7099738970924991973L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public MoreSwing_47Hx(long var1) {
      super("MoreSwing", "MehrSchwingen", ((a ^ var1) ^ 61655192035166L), new Color(50, 168, 164), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 80503599727429L;
      long var5 = var1 ^ 61655192035166L;
      // Super arguments moved to the required Java constructor position.
      this.settingWhileKillAura = new BooleanSetting(this, var3, "WhileKillAura", true);
      this.settingWhileAutoClicker = new BooleanSetting(this, var3, "WhileAutoClicker", true);
      this.settingWhileLeftClick = new BooleanSetting(this, var3, "WhileLeftClick", false);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);

   private static native boolean recovery$indy$4(Object var0, long var1, long var3);

   private static native boolean recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$6(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);

   private static native double recovery$indy$8(Object var0, long var1, long var3, long var5);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native double recovery$indy$10(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$11(Object var0, long var1, long var3);

   private static native C_47Ij recovery$indy$12(Object var0, long var1, long var3);

   private static native C_47Ij recovery$indy$13(Object var0, long var1, long var3);

   private static native boolean recovery$indy$14(Object var0, long var1, long var3);

   private static native boolean recovery$indy$15(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$16(Object var0, long var1, long var3);

   private static native boolean recovery$indy$17(int var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$18(Object var0, long var1, long var3);

   private static native boolean recovery$indy$19(int var0, long var1, long var3, long var5);

   private static native void recovery$indy$20(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native MethodHandle recovery$constant$21();
}
