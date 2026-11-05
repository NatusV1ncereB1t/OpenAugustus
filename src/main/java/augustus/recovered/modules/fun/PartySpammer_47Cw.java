package augustus.recovered.modules.fun;
import com.mojang.authlib.GameProfile;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_473U;
import net.C_47AL;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47K6;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47Yl;
import net.C_47iC;
import net.C_47ob;
import client.ClientGlobals;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class PartySpammer_47Cw extends client.module.Module implements net.C_47iC,net.C_47xz {
    private final client.setting.NumberSetting settingInviteDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingHidePartyMessage = null; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.Collection field_46; // Runtime access flags and ConstantValue are restored from the original class.
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
      String[] var4 = recovery$indy$1(2667619968252652388L, var1);
      if (recovery$indy$2(this.settingHidePartyMessage, 2668243511573880423L, var1)) {
         C_473U var5 = recovery$indy$3(var3, 2667968654449263916L, var1);
         C_473U var10000 = var5;
         if (var4 != null) {
            if (!(var5 instanceof C_47AL)) {
               return;
            }

            var10000 = var5;
         }

         label30: {
            C_47AL var6 = (C_47AL)var10000;
            boolean var7 = var6.method_45$8b128fd962().method_48$0e30dfc966().contains(recovery$indy$4(9390, 1176256957182084269L ^ var1));
            if (var4 != null) {
               if (var7) {
                  break label30;
               }

               var7 = var6.method_45$8b128fd962().method_48$0e30dfc966().contains(recovery$indy$5(6017, 2173810867685472129L ^ var1));
            }

            if (!var7) {
               return;
            }
         }

         var3.cancel();
      }
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$6(this, 26, var3, -7099824060462677653L, var1);
      recovery$indy$7(this, 40, var3, -7099824060462677653L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      java.lang.Object var16;
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 15877164398549L;
      long var8 = var4 ^ 113186446332478L;
      String[] var10 = (String[])recovery$indy$flow$17(2180364029755920419L, var4);
      int var10000 = ((net.C_47K6)recovery$indy$flow$19(field_43, 2180434948517504259L, var4)).method_43$43b9f1ea53().values().size();
      if (var10 == null) {
         if (var10000 % 1 == 0) {
            ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$74(field_43, 2180084286350773945L, var4))
               .method_49$a7421bf54c((String)recovery$indy$flow$75(1587, 6829913502080474486L ^ var4));
         }
      } else if (var10000 > 1) {
         if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$24(field_43, 2180084286350773945L, var4)).field_48y
               % (int)Math.max(1.0, recovery$indy$flow$27(this.settingInviteDelay, var8, 2179920524331688298L, var4) / 50.0 * 2.0)
            == 0) {
            if (this.field_46.isEmpty()) {
               this.field_46 = ((net.C_47K6)recovery$indy$flow$32(field_43, 2180434948517504259L, var4)).method_43$43b9f1ea53().values();
            }

            java.util.Iterator var11 = this.field_46.iterator();

            label364:
            while (true) {
               if (var11.hasNext()) {
                  var16 = var11.next();

                  while (true) {
                     net.C_47Yl var14 = (net.C_47Yl)var16;
                     if (var14 == null || var14.method_43$cd99b948a0() == null) {
                        continue label364;
                     }

                     String var15 = var14.method_43$cd99b948a0().getName();
                     if (var15 == null) {
                        continue label364;
                     }

                     var10000 = var15.length();
                     String[] var19 = var10;
                     if (var2 >= 0) {
                        if (var10 != null) {
                           if (var10000 < 3) {
                              continue label364;
                           }

                           var10000 = ((int) (var15.contains("§") ? 1 : 0));
                        }

                        var19 = var10;
                     }

                     if (var1 > 0) {
                        if (var19 != null) {
                           if (var10000 != 0) {
                              continue label364;
                           }

                           var10000 = ((int) (var15.contains("#") ? 1 : 0));
                        }

                        var19 = var10;
                     }

                     if (var2 > 0) {
                        if (var19 != null) {
                           if (var10000 != 0) {
                              continue label364;
                           }

                           var10000 = ((int) (var15.contains(" ") ? 1 : 0));
                        }

                        var19 = var10;
                     }

                     if (var2 >= 0) {
                        if (var19 != null) {
                           if (var10000 != 0) {
                              continue label364;
                           }

                           var10000 = var15.length();
                        }

                        var19 = var10;
                     }

                     if (var2 > 0) {
                        if (var19 != null) {
                           if (var10000 >= 17) {
                              continue label364;
                           }

                           var10000 = ((int) (var15.equals(((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$50(field_43, 2180084286350773945L, var4)).method_41$0e30dfc966()) ? 1 : 0));
                        }

                        var19 = var10;
                     }

                     if (var19 != null) {
                        if (var10000 != 0) {
                           break;
                        }

                        var10000 = ((int) (recovery$indy$flow$55(client.ClientGlobals.field_48.field_46Z, var15, var6, 2180178399230726033L, var4) ? 1 : 0));
                     }

                     if (var10000 != 0) {
                        break;
                     }

                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$57(field_43, 2180084286350773945L, var4))
                        .method_49$a7421bf54c((String)recovery$indy$flow$60(4809, 2395710306356955530L ^ var4) + var15);
                     var11.remove();
                     var16 = var10;
                     if (var2 <= 0) {
                        break label364;
                     }

                     if (var10 == null) {
                        break;
                     }

                     var16 = var10;
                     if (var1 >= 0) {
                        break label364;
                     }
                  }
               } else {
                  do {
                     var16 = var10;
                     if (var1 >= 0) {
                        break label364;
                     }

                     net.C_47Yl var12 = (net.C_47Yl)(Object) (var10);
                     if (var12 == null || var12.method_43$cd99b948a0() == null) {
                        continue label364;
                     }

                     String var13 = var12.method_43$cd99b948a0().getName();
                     if (var13 == null) {
                        continue label364;
                     }

                     var10000 = var13.length();
                     String[] var10001 = var10;
                     if (var2 >= 0) {
                        if (var10 != null) {
                           if (var10000 < 3) {
                              continue label364;
                           }

                           var10000 = ((int) (var13.contains("§") ? 1 : 0));
                        }

                        var10001 = var10;
                     }

                     if (var1 > 0) {
                        if (var10001 != null) {
                           if (var10000 != 0) {
                              continue label364;
                           }

                           var10000 = ((int) (var13.contains("#") ? 1 : 0));
                        }

                        var10001 = var10;
                     }

                     if (var2 > 0) {
                        if (var10001 != null) {
                           if (var10000 != 0) {
                              continue label364;
                           }

                           var10000 = ((int) (var13.contains(" ") ? 1 : 0));
                        }

                        var10001 = var10;
                     }

                     if (var2 >= 0) {
                        if (var10001 != null) {
                           if (var10000 != 0) {
                              continue label364;
                           }

                           var10000 = var13.length();
                        }

                        var10001 = var10;
                     }

                     if (var2 > 0) {
                        if (var10001 != null) {
                           if (var10000 >= 17) {
                              continue label364;
                           }

                           var10000 = ((int) (var13.equals(((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$50(field_43, 2180084286350773945L, var4)).method_41$0e30dfc966()) ? 1 : 0));
                        }

                        var10001 = var10;
                     }

                     if (var10001 != null) {
                        if (var10000 != 0) {
                           break;
                        }

                        var10000 = ((int) (recovery$indy$flow$55(client.ClientGlobals.field_48.field_46Z, var13, var6, 2180178399230726033L, var4) ? 1 : 0));
                     }

                     if (var10000 != 0) {
                        break;
                     }

                     ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$57(field_43, 2180084286350773945L, var4))
                        .method_49$a7421bf54c((String)recovery$indy$flow$60(4809, 2395710306356955530L ^ var4) + var13);
                     var11.remove();
                     var16 = var10;
                     if (var2 <= 0) {
                        break label364;
                     }
                  } while (var10 != null);
               }

               var11.remove();
            }

            if (var16 != null) {
               return;
            }
         }

         if (((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$68(field_43, 2180084286350773945L, var4)).field_48y
               % (int)Math.max(1.0, recovery$indy$flow$71(this.settingInviteDelay, var8, 2179920524331688298L, var4) / 50.0)
            == 0) {
            ((net.minecraft.client.entity.EntityPlayerSP)recovery$indy$flow$74(field_43, 2180084286350773945L, var4))
               .method_49$a7421bf54c((String)recovery$indy$flow$75(1587, 6829913502080474486L ^ var4));
         }
      }
   }





   public void method_43y$e45a9973e5(long var1) {
      this.field_46.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      if (recovery$indy$21(field_43, 2731832805903922449L, var4) != null) {
         this.field_46 = recovery$indy$22(field_43, 2732042739713285803L, var4).method_43$43b9f1ea53().values();
      }
   }



    public PartySpammer_47Cw(long a0) {
        super((java.lang.String) ("PartySpammer"),(java.lang.String) ("FeierNachrichten\u00dcbersch\u00fctter"),(long) (((augustus.recovered.modules.fun.PartySpammer_47Cw.a ^ a0) ^ 98742682164482L)),(java.awt.Color) (new java.awt.Color((int) (204),(int) (230),(int) (122))),(client.module.Category) (client.module.Category.FUN));
        long visibilityKey = ((augustus.recovered.modules.fun.PartySpammer_47Cw.a ^ a0) ^ 44989008068889L);
        long delayKey = ((augustus.recovered.modules.fun.PartySpammer_47Cw.a ^ a0) ^ 6265862651550L);
        client.setting.NumberSetting delay = new client.setting.NumberSetting(this, "InviteDelay", 1000.0D, delayKey, 0.0D, 4000.0D, 0);
        recovery$indy$flow$88(this, delay);
        client.setting.BooleanSetting hideMessage = new client.setting.BooleanSetting(this, visibilityKey, "HidePartyMessage", true);
        recovery$indy$flow$91(this, hideMessage);
        recovery$indy$flow$94(this, new java.util.LinkedList());
    }



    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$17(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$19(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$24(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$27(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$32(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$50(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$55(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$57(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$60(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$68(java.lang.Object a0,long a1,long a2);
    private static native double recovery$indy$flow$71(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$74(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$75(int a0,long a1);
    private static native void recovery$indy$flow$88(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$91(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$94(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.fun.PartySpammer_47Cw) (a0)).field_46 = ((java.util.Collection) (a1));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native String[] recovery$indy$1(long var0, long var2);
   private static native boolean recovery$indy$2(Object var0, long var1, long var3);
   private static native C_473U recovery$indy$3(Object var0, long var1, long var3);
   private static native String recovery$indy$4(int var0, long var1);
   private static native String recovery$indy$5(int var0, long var1);
   private static native void recovery$indy$6(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$7(Object var0, int var1, long var2, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$21(Object var0, long var1, long var3);
   private static native C_47K6 recovery$indy$22(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$23();
}
