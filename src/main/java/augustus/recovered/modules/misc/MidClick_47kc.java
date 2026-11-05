package augustus.recovered.modules.misc;
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
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_46_;
import net.C_4749;
import net.C_475c;
import net.C_477r;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47F5;
import net.C_47Ij;
import net.C_47K6;
import net.C_47MF;
import net.minecraft.entity.Entity;
import client.module.Module;
import net.C_47S6;
import net.C_47TM;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.Setting;
import net.C_47UH;
import net.C_47Yl;
import net.C_47jI;
import net.minecraft.client.Minecraft;
import client.ClientGlobals;
import client.module.Category;
import net.C_47uo;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class MidClick_47kc extends client.module.Module implements net.C_47UH,net.C_47xz {
    public java.util.HashSet field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashSet field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMidClickDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingAutoUnfriend = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingPartyFriend = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingPartyFriendGomme = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingReverse = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSimple = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TM settingFriends = null; // Runtime access flags and ConstantValue are restored from the original class.
    public boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    public boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static client.setting.Setting[] field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   public boolean method_42$8a15fc4c7b(Entity var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 96086872527230L;
      return recovery$indy$1(this, var1.method_41$0e30dfc966(), var4, -512775044890206327L, var2);
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$fae8de1664(C_475c var1) {
      long var2 = a ^ 136048305363010L;
      int var4 = (int)((var2 ^ 129616577815858L) >>> 56);
      long var5 = (var2 ^ 129616577815858L) << 8 >>> 8;
      long var7 = var2 ^ 138251560750625L;
      long var9 = var2 ^ 44465248595198L;
      long var11 = var2 ^ 117931664700820L;
      long var13 = var2 ^ 76576907025863L;
      long var10000 = -6877582317370702293L;
      int[] var15 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -6879051972723108497L;
      Minecraft var17 = field_43;
      if (var17.field_44r.field_440.method_49$8abf5c6871() > 0) {
         byte var45 = (byte)var4;
         long var10004 = -6877498566309258715L;
         C_47S6 var18 = ClientGlobals.field_46;
         C_477r var10003 = var18.method_44$4f8050086d();
         long var10006 = -6877735459996512650L;
         long var19 = var9;
         NumberSetting var21 = this.settingMidClickDistance;
         double var54 = var21.method_44$474dfaa627(var19);
         long var10007 = -6877735459996512650L;
         long var22 = var9;
         NumberSetting var24 = this.settingMidClickDistance;
         double var10005 = var24.method_44$474dfaa627(var22);
         var10007 = -6877088479284795276L;
         double var25 = 0.0;
         double var27 = var10005;
         double var29 = var54;
         C_477r var31 = var10003;
         float var32 = 1.0F;
         long var33 = var5;
         byte var35 = var45;
         C_47Ij var16 = C_4749.method_47$cc73fc11d5(var35, var33, var32, var31, var29, var27, var25);
         C_47Ij var46 = var16;
         if (var15 == null) {
            if (var16 == null) {
               return;
            }

            var46 = var16;
         }

         if (var15 == null) {
            if (var46.field_49 != C_47Az.ENTITY) {
               return;
            }

            var46 = var16;
         }

         boolean var47 = var46.field_47 instanceof EntityPlayer;
         if (var15 == null) {
            if (!var47) {
               return;
            }

            var47 = this.field_47.contains(var16.field_47.method_41$0e30dfc966());
         }

         if (var15 == null) {
            if (var47) {
               this.field_47.remove(var16.field_47.method_41$0e30dfc966());
               String var10002 = var16.field_47.method_41$0e30dfc966();
               long var52 = -6877481236059993806L;
               String var36 = var10002;
               long var37 = var7;
               MidClick_47kc var39 = this;
               var39.method_49$d07b98bfef(var37, var36);
               if (var15 == null) {
                  return;
               }
            }

            var10001 = -6879051972723108497L;
            Minecraft var40 = field_43;
            int var48 = var40.field_44r.field_44q.method_45$8abf5c6871();
            long var51 = -6878646601017157076L;
            var47 = C_47uo.method_45$800bd538b0(var48, var13);
         }

         if (var15 == null) {
            if (var47) {
               String var50 = var16.field_47.method_41$0e30dfc966();
               long var53 = -6877872796912692232L;
               long var41 = var11;
               String var43 = var50;
               MidClick_47kc var44 = this;
               var44.method_40$db82fd5e78(var43, var41);
            }

            this.field_47.add(var16.field_47.method_41$0e30dfc966());
         }
      }
   }




   public void method_40$db82fd5e78(String var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 104163403888504L;
      recovery$indy$2(this.settingFriends, var1, var4, -5919129022578623575L, var2);
   }



   public static void method_44$5994d1a418(Setting[] var0) {
      field_44 = var0;
   }



   public void method_49$d07b98bfef(long var1, String var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 82079882319915L;
      recovery$indy$3(this.settingFriends, var3, var4, -2996644901927611945L, var1);
   }



    public boolean method_45$d23276f6c4(String string, boolean bl, long l) {
        C_47F5 c_47F5;
        block5: {
            boolean bl2;
            block4: {
                long l2 = (l = a ^ l) ^ 0x21DECE080E59L;
                int[] nArray = MidClick_47kc.recovery$indy$4(4425696328689321L, l);
                bl2 = false;
                boolean bl3 = MidClick_47kc.recovery$indy$5((Object)this, l2, 3327052549210622L, l);
                if (nArray != null) return bl3;
                if (bl3) {
                    bl2 = MidClick_47kc.recovery$indy$6(this.settingReverse, 4316811557976510L, l) != this.field_47.contains(string);
                }
                if (bl) return bl2;
                if (!MidClick_47kc.recovery$indy$7((Object)ClientGlobals.field_48.field_41o, l2, 3327052549210622L, l)) return bl2;
                if (!MidClick_47kc.recovery$indy$8(ClientGlobals.field_48.field_41o.settingClientFriends, 4316811557976510L, l)) return bl2;
                c_47F5 = (C_47F5)C_47jI.field_46.get(string);
                if (!MidClick_47kc.recovery$indy$9(ClientGlobals.field_48.field_41o.settingYourFriendsOnly, 4316811557976510L, l)) break block4;
                if (c_47F5 != null) break block5;
            }
            if (c_47F5 == null) return bl2;
            return true;
        }
        String string2 = MidClick_47kc.recovery$indy$10(c_47F5, 3243995123379356L, l);
        C_47MF c_47MF = (C_47MF)MidClick_47kc.recovery$indy$11(3671032056909174L, l).get(string2);
        if (c_47MF == null) return false;
        if (MidClick_47kc.recovery$indy$12(c_47MF, 2904503091478699L, l) > 0) return true;
        return false;
    }




   public static Setting[] method_45$19d51fe81e() {
      return field_44;
   }



   public boolean method_43$228bb405f3(String var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 20370226243991L;
      return recovery$indy$13(this, var1, false, var4, 1251127217526376544L, var2);
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$14(this, 7, var3, -7100801850201107835L, var1);
      recovery$indy$15(this, 40, var3, -7100801850201107835L, var1);
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      int[] var19;
      net.C_47oP var21;
      java.lang.String var22;
      boolean var23;
      boolean var24;
      long var4;
      long var6;
      int[] var10;
      MidClick_47kc var18;
      label220: {
         var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
         var6 = var4 ^ 50699011391211L;
         long var8 = var4 ^ 85158264984179L;
         var10 = recovery$indy$16(2183583723644598507L, var4);
         boolean var10000 = this.field_43a;
         if (var10 == null) {
            if (!this.field_43a) {
               this.field_47.addAll(recovery$indy$17(this.settingFriends, var8, 2183913053463128235L, var4));
               this.field_43a = true;
            }

            var18 = this;
            if (var10 != null) {
               break label220;
            }

            var10000 = recovery$indy$18(this.settingPartyFriend, 2183483756312963068L, var4);
         }

         if (var10000) {
            C_47K6 var11 = recovery$indy$19(field_43, 2182038008201165192L, var4).field_49m;
            Iterator var12 = var11.method_43$29638970ac().iterator();

            while (true) {
               if (var12.hasNext()) {
                  C_47Yl var13 = (C_47Yl)var12.next();
                  String var14 = var13.method_43$cd99b948a0().getName();
                  var19 = var10;
                  if (var2 <= 0) {
                     break;
                  }

                  if (var10 != null) {
                     return;
                  }

                  if (!var14.equals(recovery$indy$20(field_43, 2182038008201165192L, var4).method_41$cd99b948a0().getName())) {
                     continue;
                  }

                  label191: {
                     label190: {
                        C_47Yl var20 = var13;
                        if (var10 == null) {
                           var21 = var13.method_41$8b128fd962();
                           if (var2 < 0) {
                              break label190;
                           }

                           if (var21 != null) {
                              var21 = var13.method_41$8b128fd962();
                              break label190;
                           }

                           var20 = var13;
                        }

                        var22 = C_46_.method_47$cf2a457752(var20.method_42$47a7a6d93d(), var14);
                        break label191;
                     }

                     var22 = var21.method_48$0e30dfc966();
                  }

                  label181: {
                     label214: {
                        int[] var27;
                        label179: {
                           label178: {
                              label215: {
                                 label176: {
                                    label175: {
                                       label216: {
                                          String var15 = var22;
                                          var23 = recovery$indy$21(this.settingPartyFriendGomme, 2183483756312963068L, var4);
                                          var27 = var10;
                                          if (var2 > 0) {
                                             if (var10 == null) {
                                                if (var23) {
                                                   var24 = var15.contains(recovery$indy$22(13384, 5942694142646322591L ^ var4));
                                                   if (var10 != null) {
                                                      break label178;
                                                   }

                                                   if (!var24) {
                                                      break label215;
                                                   }
                                                   break label216;
                                                }

                                                var23 = var15.contains(recovery$indy$23(9726, 5413847332744664097L ^ var4));
                                             }

                                             var27 = var10;
                                          }

                                          if (var2 <= 0) {
                                             break label176;
                                          }

                                          if (var27 != null) {
                                             break label175;
                                          }

                                          if (!var23) {
                                             var24 = var15.contains(recovery$indy$24(9688, 8192571621917889549L ^ var4));
                                             var27 = var10;
                                             if (var2 <= 0) {
                                                break label179;
                                             }

                                             if (var10 != null) {
                                                break label178;
                                             }

                                             if (!var24) {
                                                break label215;
                                             }
                                          }
                                       }

                                       var23 = this.field_49.contains(var14);
                                    }

                                    var27 = var10;
                                 }

                                 if (var27 == null) {
                                    if (var23) {
                                       break label214;
                                    }

                                    this.field_47.add(var14);
                                    this.field_49.add(var14);
                                 }

                                 var19 = var10;
                                 if (var1 <= 0) {
                                    break label181;
                                 }

                                 if (var10 == null) {
                                    break label214;
                                 }
                              }

                              var24 = this.field_49.contains(var14);
                           }

                           var27 = var10;
                        }

                        if (var27 == null && var24) {
                           this.field_49.remove(var14);
                           this.field_47.remove(var14);
                        }
                     }

                     var19 = var10;
                  }

                  if (var3 < 0) {
                     break;
                  }

                  if (var19 == null) {
                     continue;
                  }
               }

               var19 = var10;
               break;
            }

            if (var19 == null) {
               recovery$indy$25(ClientGlobals.field_48.field_41o, var6, 2183382894695877317L, var4);
               return;
            }
         }

         var18 = this;
      }

      Iterator var16 = var18.field_49.iterator();

      label123:
      while (true) {
         Object var25;
         if (var16.hasNext()) {
            var25 = var16.next();
         } else {
            var25 = this.field_49;
            if (var2 > 0) {
               this.field_49.clear();
               recovery$indy$25(ClientGlobals.field_48.field_41o, var6, 2183382894695877317L, var4);
               break;
            }
         }

         do {
            String var17 = (String)var25;
            this.field_47.remove(var17);
            int[] var26 = var10;
            if (var3 > 0) {
               if (var10 != null) {
                  return;
               }

               var26 = var10;
            }

            if (var26 == null) {
               continue label123;
            }

            var25 = this.field_49;
         } while (var2 <= 0);

         this.field_49.clear();
         recovery$indy$25(ClientGlobals.field_48.field_41o, var6, 2183382894695877317L, var4);
         break;
      }
   }





   public void method_43y$e45a9973e5(long var1) {
      this.field_49.clear();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      this.field_49.clear();
   }



    public MidClick_47kc(long a0) {
        super((java.lang.String) ("MidClick"),(java.lang.String) ("Mittelklick"),(long) (((augustus.recovered.modules.misc.MidClick_47kc.a ^ a0) ^ 105620390048833L)),(java.awt.Color) (new java.awt.Color((int) (76),(int) (78),(int) (76))),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.misc.MidClick_47kc.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.misc.MidClick_47kc.a ^ a0) ^ 27465085468007L);
        long constructorKey4 = ((augustus.recovered.modules.misc.MidClick_47kc.a ^ a0) ^ 4116521226240L);
        long constructorKey5 = ((augustus.recovered.modules.misc.MidClick_47kc.a ^ a0) ^ 18877093423194L);
        long constructorKey6 = ((augustus.recovered.modules.misc.MidClick_47kc.a ^ a0) ^ 66465041389533L);
        java.util.HashSet initialized7 = new java.util.HashSet();
        recovery$indy$flow$158(this, initialized7);
        java.util.HashSet initialized8 = new java.util.HashSet();
        recovery$indy$flow$161(this, initialized8);
        client.setting.NumberSetting initialized9 = new client.setting.NumberSetting(this, "MidClickDistance", Double.longBitsToDouble(4616752568008179712L), constructorKey6, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4621819117588971520L), 2);
        recovery$indy$flow$164(this, initialized9);
        client.setting.BooleanSetting initialized10 = new client.setting.BooleanSetting(this, constructorKey5, "AutoUnfriend", true);
        recovery$indy$flow$167(this, initialized10);
        client.setting.BooleanSetting initialized11 = new client.setting.BooleanSetting(this, constructorKey5, "PartyFriend", true);
        recovery$indy$flow$170(this, initialized11);
        client.setting.BooleanSetting initialized12 = new client.setting.BooleanSetting(this, constructorKey5, "PartyFriendGomme", true);
        java.lang.Object initialValue13 = ((java.lang.Object)(((augustus.recovered.modules.misc.MidClick_47kc) (((java.lang.Object)(this)))).settingPartyFriend));
        java.lang.Object initialValue14 = recovery$indy$flow$174(initialValue13);
        java.lang.Object initialValue15 = recovery$indy$flow$175(initialValue13);
        java.lang.Object initialValue16 = initialValue15;
        long initialValue17 = constructorKey3;
        client.setting.BooleanSetting initialValue18 = initialized12;
        java.lang.Object initialValue19 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue18))))));
        java.lang.Object initialValue20 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue16))))));
        java.lang.Object initialValue21 = recovery$indy$flow$178(initialValue19, initialValue17, initialValue20);
        java.lang.Object initialValue22 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue21))))));
        recovery$indy$flow$180(this, initialValue22);
        client.setting.BooleanSetting initialized23 = new client.setting.BooleanSetting(this, constructorKey5, "Reverse", false);
        recovery$indy$flow$183(this, initialized23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey5, "Simple", false);
        recovery$indy$flow$186(this, initialized24);
        net.C_47TM initialized25 = new net.C_47TM(constructorKey4, this, "Friends");
        recovery$indy$flow$189(this, initialized25);
        recovery$indy$flow$190(this, false);
        recovery$indy$flow$191(this, false);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static void recovery$indy$flow$158(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.MidClick_47kc) (a0)).field_47 = ((java.util.HashSet) (a1));
        return;
    }
    private static native void recovery$indy$flow$161(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$164(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$167(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$170(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$174(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$175(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$178(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$180(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$183(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$186(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$189(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$190(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.MidClick_47kc) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$191(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.MidClick_47kc) (a0)).field_43a = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(Object var0, Object var1, long var2, long var4, long var6);
   private static native void recovery$indy$2(Object var0, Object var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$3(Object var0, Object var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$4(long var0, long var2);
   private static native boolean recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$8(Object var0, long var1, long var3);
   private static native boolean recovery$indy$9(Object var0, long var1, long var3);
   private static native String recovery$indy$10(Object var0, long var1, long var3);
   private static native ConcurrentHashMap recovery$indy$11(long var0, long var2);
   private static native int recovery$indy$12(Object var0, long var1, long var3);
   private static native boolean recovery$indy$13(Object var0, Object var1, boolean var2, long var3, long var5, long var7);
   private static native void recovery$indy$14(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$15(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$16(long var0, long var2);
   private static native Set recovery$indy$17(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$18(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$19(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$20(Object var0, long var1, long var3);
   private static native boolean recovery$indy$21(Object var0, long var1, long var3);
   private static native String recovery$indy$22(int var0, long var1);
   private static native String recovery$indy$23(int var0, long var1);
   private static native String recovery$indy$24(int var0, long var1);
   private static native void recovery$indy$25(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$27();
}
