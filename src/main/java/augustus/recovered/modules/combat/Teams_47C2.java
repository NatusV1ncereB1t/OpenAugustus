package augustus.recovered.modules.combat;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_46_;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47oP;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

public class Teams_47C2 extends Module implements C_47xz {
   private final ModeSetting settingModes;
   private final BooleanSetting settingAutoTeams;
   private final ArrayList field_43h;
   private boolean field_43a;
   private String field_44;
   private static String field_41;
   private static final long a = C_4f.a(677547636977215839L, -7243767902630118055L, MethodHandles.lookup().lookupClass()).a(152017754714997L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[27];
   private static final String[] f = new String[27];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   private static native Method d(long var0, long var2);

   private boolean method_41$8a15fc4c7b(Entity var1, long var2) {
      augustus.recovered.modules.combat.Teams_47C2 var17;
      label199: {
         var2 = a ^ var2;
         long var4 = var2 ^ 12651174809354L;
         int[] var6 = recovery$indy$1(790440920030261093L, var2);
         int var10000 = (int) ((var1 instanceof EntityLivingBase) ? 1 : 0);
         if (var6 == null) {
            if ((var10000) != 0) {
               var10000 = (int) ((var1 instanceof EntityPlayer) ? 1 : 0);
               if (var6 != null) {
                  return (var10000 != 0);
               }

               if ((var10000) != 0) {
                  label202: {
                     C_46_ var7 = recovery$indy$2(field_43, 791041584730585518L, var2).method_49$d774fd0a7c().method_49$7fb0be9c6d(var1.method_41$0e30dfc966());
                     C_46_ var8 = recovery$indy$3(field_43, 791041584730585518L, var2)
                        .method_49$d774fd0a7c()
                        .method_49$7fb0be9c6d(recovery$indy$4(field_43, 791363146798553108L, var2).method_41$0e30dfc966());
                     C_46_ var15 = var7;
                     int[] var10001 = var6;
                     if (var2 >= 0L) {
                        if (var6 == null) {
                           if (var7 == null) {
                              break label202;
                           }

                           var15 = var8;
                        }

                        var10001 = var6;
                     }

                     if (var10001 == null) {
                        if (var15 == null) {
                           break label202;
                        }

                        var15 = var7;
                     }

                     label188: {
                        var10000 = (int) ((var15.method_40$0e30dfc966().equals(var8.method_40$0e30dfc966())) ? 1 : 0);
                        label187:
                        if (var6 == null) {
                           if ((var10000) != 0) {
                              var10000 = ((int) (recovery$indy$5(this.settingModes, var4, 790558880744385240L, var2)
                                 .equals(recovery$indy$6(29780, 943228871120546717L ^ var2)) ? 1 : 0));
                              var10001 = var6;
                              if (var2 < 0L) {
                                 break label188;
                              }

                              if (var6 != null) {
                                 break label187;
                              }

                              if ((var10000) != 0) {
                                 return true;
                              }
                           }

                           var10000 = (int) ((var7.method_47$0e30dfc966().equals(var8.method_47$0e30dfc966())) ? 1 : 0);
                        }

                        var10001 = var6;
                     }

                     label177: {
                        label176: {
                           if (var10001 == null) {
                              if (!(var10000 != 0)) {
                                 break label176;
                              }

                              var17 = this;
                              if (var6 != null) {
                                 break label177;
                              }

                              var10000 = ((int) (recovery$indy$7(this.settingModes, var4, 790558880744385240L, var2)
                                 .equals(recovery$indy$8(13231, 1260458469164199019L ^ var2)) ? 1 : 0));
                           }

                           if ((var10000) != 0) {
                              return true;
                           }
                        }

                        var17 = this;
                     }

                     var17.field_43a = true;
                  }

                  var10000 = (int) ((recovery$indy$9(this.settingModes, var4, 790558880744385240L, var2).equals(recovery$indy$10(21838, 7805449865673984648L ^ var2))) ? 1 : 0);
                  if (var6 != null) {
                     return (var10000 != 0);
                  }

                  label159:
                  if ((var10000) != 0) {
                     C_47oP var18 = var1.method_40$8b128fd962();
                     if (var6 == null) {
                        if (var18 == null) {
                           break label159;
                        }

                        var18 = var1.method_40$8b128fd962();
                     }

                     String var9 = var18.method_49$0e30dfc966();
                     String var19 = var9;
                     if (var6 == null) {
                        if (var9 == null) {
                           break label159;
                        }

                        var19 = var9;
                     }

                     String[] var10 = var19.split(recovery$indy$11(11748, 2961246819544576558L ^ var2));
                     var10000 = var10.length;
                     if (var6 != null) {
                        return var10000 != 0;
                     }

                     if (var10000 > 1) {
                        String var11 = var10[1];
                        boolean var28 = this.field_44.equals("");
                        int[] var24 = var6;
                        if (var2 >= 0L) {
                           if (var6 == null) {
                              label135:
                              if (var28) {
                                 C_47oP var20 = recovery$indy$12(field_43, 791363146798553108L, var2).method_40$8b128fd962();
                                 if (var6 == null) {
                                    if (var20 == null) {
                                       break label199;
                                    }

                                    var20 = recovery$indy$13(field_43, 791363146798553108L, var2).method_40$8b128fd962();
                                 }

                                 String var21 = var20.method_49$0e30dfc966();
                                 if (var6 == null) {
                                    if (var21 == null) {
                                       break label199;
                                    }

                                    var21 = recovery$indy$15(field_43, 791363146798553108L, var2).method_40$8b128fd962().method_49$0e30dfc966();
                                 }

                                 label130: {
                                    String var12 = var21;
                                    String[] var13 = var12.split(recovery$indy$16(5023, 2131832118329740380L ^ var2));
                                    int[] var22 = var6;
                                    if (var2 > 0L) {
                                       if (var6 == null) {
                                          if (var13.length <= 1) {
                                             break label130;
                                          }

                                          this.field_44 = var13[1];
                                       }

                                       var22 = var6;
                                    }

                                    if (var22 == null) {
                                       break label135;
                                    }
                                 }

                                 this.field_44 = recovery$indy$17(18623, 8645059601614198640L ^ var2);
                              }

                              var28 = var11.equals(this.field_44);
                           }

                           var24 = var6;
                        }

                        if (var24 != null) {
                           return var28;
                        }

                        if (var28) {
                           return true;
                        }
                     }
                  }
               }
            }

            var10000 = 0;
         }

         return var10000 != 0;
      }

      this.field_44 = recovery$indy$14(3301, 1969395193414259501L ^ var2);
      return false;
   }

   public static void method_40$a7421bf54c(String var0) {
      field_41 = var0;
   }

   public boolean method_48$9e4267e589(short var1, int var2, Entity var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 77044263880021L;
      int[] var9 = recovery$indy$18(796046397646319249L, var5);
      boolean var10000 = this.field_43a;
      if (var9 == null) {
         if (!this.field_43a) {
            var10000 = recovery$indy$19(this.settingAutoTeams, 796753350725552161L, var5);
            if (var9 != null) {
               return var10000;
            }

            if (var10000) {
               return false;
            }
         }

         var10000 = recovery$indy$20(this, var7, 796121416768968639L, var5);
      }

      if (var9 != null) {
         return var10000;
      }

      if (var10000) {
         var10000 = var3 instanceof EntityPlayer;
         if (var9 != null) {
            return var10000;
         }

         if (var10000) {
            var10000 = recovery$indy$21(this, 797081699017772956L, var5).isEmpty();
            if (var9 != null) {
               return var10000;
            }

            if (!var10000) {
               return recovery$indy$22(this, 797081699017772956L, var5).contains(var3);
            }
         }
      }

      return false;
   }

   public boolean method_47$e055d62ea7(long var1, String var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 6260712470291L;
      int[] var6 = recovery$indy$23(-483472473606464297L, var1);
      boolean var10000 = this.field_43a;
      if (var6 == null) {
         if (!this.field_43a) {
            var10000 = recovery$indy$24(this.settingAutoTeams, -483889223680083353L, var1);
            if (var6 != null) {
               return var10000;
            }

            if (var10000) {
               return false;
            }
         }

         var10000 = recovery$indy$25(this, var4, -483530484640799239L, var1);
      }

      if (var6 != null) {
         return var10000;
      }

      if (var10000) {
         var10000 = recovery$indy$26(this, -483699118450229798L, var1).isEmpty();
         if (var6 != null) {
            return var10000;
         }

         if (!var10000) {
            for (Object recovered$element$13348 : recovery$indy$27(this, -483699118450229798L, var1)) {
         EntityPlayer var8 = (EntityPlayer) recovered$element$13348;
               var10000 = var8.method_41$0e30dfc966().equals(var3);
               int[] var10001 = var6;
               if (var1 >= 0L) {
                  if (var6 != null) {
                     return var10000;
                  }

                  var10001 = var6;
               }

               if (var10001 != null) {
                  return var10000;
               }

               if (var10000) {
                  return true;
               }

               if (var6 != null) {
                  break;
               }
            }
         }
      }

      return false;
   }

   public ArrayList method_47$98e00cf5f9() {
      return this.field_43h;
   }

   public static String method_43$0e30dfc966() {
      return field_41;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$28(this, 40, var3, -7099804476034535554L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 38584814656968L;
      this.field_43h.clear();
      int[] var10000 = recovery$indy$29(2180415953066802143L, var4);
      this.field_43a = false;
      Iterator var9 = recovery$indy$30(field_43, 2179752341595467028L, var4).field_44Q.iterator();
      int[] var8 = var10000;

      while (var9.hasNext()) {
         Entity var10 = (Entity)var9.next();
         if (var8 == null && recovery$indy$31(this, var10, var6, 2179935429244737759L, var4)) {
            this.field_43h.add((EntityPlayer)var10);
         }

         if (var8 != null) {
            break;
         }
      }
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      this.field_43h.clear();
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_43a = false;
      this.field_44 = "";
   }

   public Teams_47C2(long var1) {
      super("Teams", "Verbündete", ((a ^ var1) ^ 30652039092017L), Color.red, Category.COMBAT);
      var1 = a ^ var1;
      long var3 = var1 ^ 88324568918012L;
      long var5 = var1 ^ 117390989855530L;
      long var7 = var1 ^ 30652039092017L;
      // Super arguments moved to the required Java constructor position.
      this.settingModes = new ModeSetting(this, "Modes", var3, "Color", new String[]{"Name", "Color", "Clan"});
      this.settingAutoTeams = new BooleanSetting(this, var5, "AutoTeams", false);
      this.field_43h = new ArrayList();
      this.field_43a = false;
      this.field_44 = "";
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native WorldClient recovery$indy$2(Object var0, long var1, long var3);

   private static native WorldClient recovery$indy$3(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);

   private static native String recovery$indy$5(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$6(int var0, long var1);

   private static native String recovery$indy$7(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$8(int var0, long var1);

   private static native String recovery$indy$9(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$10(int var0, long var1);

   private static native String recovery$indy$11(int var0, long var1);

   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);

   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);

   private static native String recovery$indy$14(int var0, long var1);

   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);

   private static native String recovery$indy$16(int var0, long var1);

   private static native String recovery$indy$17(int var0, long var1);

   private static native int[] recovery$indy$18(long var0, long var2);

   private static native boolean recovery$indy$19(Object var0, long var1, long var3);

   private static native boolean recovery$indy$20(Object var0, long var1, long var3, long var5);

   private static native ArrayList recovery$indy$21(Object var0, long var1, long var3);

   private static native ArrayList recovery$indy$22(Object var0, long var1, long var3);

   private static native int[] recovery$indy$23(long var0, long var2);

   private static native boolean recovery$indy$24(Object var0, long var1, long var3);

   private static native boolean recovery$indy$25(Object var0, long var1, long var3, long var5);

   private static native ArrayList recovery$indy$26(Object var0, long var1, long var3);

   private static native ArrayList recovery$indy$27(Object var0, long var1, long var3);

   private static native void recovery$indy$28(Object var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$29(long var0, long var2);

   private static native WorldClient recovery$indy$30(Object var0, long var1, long var3);

   private static native boolean recovery$indy$31(Object var0, Object var1, long var2, long var4, long var6);

   private static native MethodHandle recovery$constant$32();
}
