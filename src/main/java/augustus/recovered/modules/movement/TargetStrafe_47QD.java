package augustus.recovered.modules.movement;
import augustus.recovered.modules.combat.AntiBot_47CG;
import augustus.recovered.modules.combat.Teams_47C2;
import augustus.recovered.modules.misc.MidClick_47kc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_472n;
import net.C_475P;
import net.C_475y;
import net.C_477r;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47U0;
import net.C_47VO;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cu;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.minecraft.client.Minecraft;
import net.C_47oo;
import client.ClientGlobals;
import client.module.Category;
import net.C_47y6;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class TargetStrafe_47QD extends client.module.Module implements net.C_47U0,net.C_47hi {
    private final client.setting.ModeSetting settingConditionsToTargetStrafe = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRadius = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingKillAuraTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingAutoStrafe = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyWhileSpace = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingThirdPersonMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public float field_49; // Runtime access flags and ConstantValue are restored from the original class.
    public net.minecraft.entity.EntityLivingBase field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private java.lang.Object[] field_44; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

   private static double method_42$83ff7736af(Entity var0) {
      long var1 = a ^ 84463119400381L;
      long var10001 = 8630924070131403L;
      Minecraft var3 = field_43;
      return var3.field_42P.method_44$ee256e8a75(var0);
   }



   public void method_42$0db73fbf69(long var1, C_47VO var3) {
      long var4 = var1 ^ 60877589741279L;
      if (this.field_48 != null && !recovery$indy$1(var4, -6221071409151090894L, var1)) {
         recovery$indy$2(var3, this.field_49, -6220460441458722058L, var1);
      }
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$0db73fbf69(long var1, C_47VO var3) {
      long var4 = var1 ^ 29226247548657L;
      if (this.field_48 != null && !recovery$indy$3(var4, -5078796725264330980L, var1)) {
         recovery$indy$4(var3, this.field_49, -5079407383709635880L, var1);
      }
   }



   private boolean method_40$7c2c45e4ce(net.minecraft.entity.Entity var1) {
      long var2 = a ^ 6155693976414L;
      long var4 = var2 ^ 29889424927856L;
      long var6 = var2 ^ 43389513570015L;
      long var10001 = var2 ^ 13500850394254L;
      int var8 = (int)((var2 ^ 13500850394254L) >>> 48);
      int var9 = (int)((var2 ^ 13500850394254L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var10000 = -7566050213837378797L;
      boolean var11 = Fly_47kE.method_48$aae029aa0a();
      boolean var30 = var1 instanceof EntityLivingBase;
      if (var11) {
         if (var30) {
            var10001 = -7566644893146087384L;
            net.minecraft.client.Minecraft var12 = field_43;
            if (!var12.field_42P.method_48$7c2c45e4ce(var1)) {
               return false;
            }

            if (var1.method_48y$aae029aa0a() || ((EntityLivingBase)var1).field_48P > 1) {
               return false;
            }

            if (var1.field_48y < 1) {
               return false;
            }

            if (var1 instanceof EntityPlayer) {
               short var35 = (short)var8;
               long var10005 = -7567359992170335340L;
               int var13 = var10;
               net.minecraft.entity.Entity var14 = var1;
               int var15 = var9;
               short var16 = var35;
               augustus.recovered.modules.combat.Teams_47C2 var17 = client.ClientGlobals.field_48.field_44Q;
               if (var17.method_48$9e4267e589(var16, var15, var14, var13)) {
                  return false;
               }
            }

            if (var1 instanceof EntityPlayer
               && (var1.method_41$0e30dfc966().equals("§aShop") || var1.method_41$0e30dfc966().equals("SHOP") || var1.method_41$0e30dfc966().equals("UPGRADES"))
               )
             {
               return false;
            }

            if (var1.field_427) {
               return false;
            }

            if (var1 instanceof EntityPlayer) {
               long var10003 = -7566261128767392218L;
               net.minecraft.entity.Entity var18 = var1;
               long var19 = var4;
               augustus.recovered.modules.combat.AntiBot_47CG var21 = client.ClientGlobals.field_48.field_480;
               if (var21.method_44$5909fdf9ee(var19, var18)) {
                  return false;
               }
            }

            if (var1 instanceof EntityPlayer && !client.ClientGlobals.field_48.field_46Z.field_43P) {
               long var38 = -7567105248398800784L;
               long var22 = var6;
               net.minecraft.entity.Entity var24 = var1;
               augustus.recovered.modules.misc.MidClick_47kc var25 = client.ClientGlobals.field_48.field_46Z;
               if (var25.method_42$8a15fc4c7b(var24, var22)) {
                  return false;
               }
            }
         }

         if (var1 instanceof EntityLivingBase) {
            long var37 = -7566644893146087384L;
            net.minecraft.client.Minecraft var28 = field_43;
            if (var1 != var28.field_42P) {
               var10001 = -7566644893146087384L;
               net.minecraft.client.Minecraft var29 = field_43;
               if (var29.field_42P.method_44$ee256e8a75(var1) < 7.0F) {
                  return true;
               }
            }
         }

         return false;
      } else {
         if (var30) {
            long var10002 = -7566644893146087384L;
            net.minecraft.client.Minecraft var26 = field_43;
            if (var1 != var26.field_42P) {
               var10001 = -7566644893146087384L;
               net.minecraft.client.Minecraft var27 = field_43;
               float var39;
               return (var39 = var27.field_42P.method_44$ee256e8a75(var1) - 7.0F) == 0.0F ? false : (var39 < 0.0F ? true : true);
            }
         }

         return false;
      }
   }





   private void method_44$e45a9973e5(long var1) {
      TargetStrafe_47QD var5;
      boolean var10001;
      label36: {
         label39: {
            var1 = a ^ var1;
            boolean var3 = recovery$indy$5(-8695626831591685483L, var1);
            boolean var10000 = this.field_43a;
            if (!var3) {
               if (!this.field_43a) {
                  return;
               }

               var5 = this;
               var10001 = var3;
               if (var1 <= 0L) {
                  break label36;
               }

               if (var3) {
                  break label39;
               }

               var10000 = recovery$indy$6(this.settingThirdPersonMode, -8695885175276524874L, var1);
            }

            if (var10000) {
               recovery$indy$7(field_43, -8695992474796334280L, var1).field_44S = this.field_43y;
            }

            var5 = this;
         }

         var10001 = false;
      }

      var5.field_43a = var10001;
   }



    public void method_47$05bd94f678(net.C_472n a0,long a1) {
        long constructorKey1 = a1;
        long computed2 = constructorKey1 ^ 39263005660825L;
        long initialValue3 = computed2;
        long computed4 = constructorKey1 ^ 21342342789374L;
        long initialValue5 = computed4;
        long computed6 = constructorKey1 ^ 130445999692284L;
        long initialValue7 = computed6;
        long computed8 = constructorKey1 ^ 16992402805804L;
        long initialValue9 = computed8;
        long computed10 = constructorKey1 ^ 25057838812498L;
        long initialValue11 = computed10;
        long computed12 = constructorKey1 ^ 132406506099900L;
        long initialValue13 = computed12;
        long computed14 = constructorKey1 ^ 74807535967538L;
        long initialValue15 = computed14;
        long computed16 = constructorKey1 ^ 77412314636080L;
        long initialValue17 = computed16;
        long computed18 = constructorKey1 ^ 92924361613876L;
        long initialValue19 = computed18;
        long computed20 = constructorKey1 ^ 108678615677533L;
        long initialValue21 = computed20;
        recovery$indy$flow$71(this, null);
        boolean initialValue22 = recovery$indy$flow$72(6399323930908335369L, constructorKey1);
        java.lang.Object initialValue23 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingConditionsToTargetStrafe));
        java.lang.Object initialValue24 = recovery$indy$flow$74(initialValue23, initialValue15, 6397443585952552505L, constructorKey1);
        long computed25 = 7233919151576536860L ^ constructorKey1;
        java.lang.Object initialValue26 = recovery$indy$flow$75(2407, computed25);
        boolean initialValue27 = recovery$indy$flow$76(initialValue24, initialValue26);
        int initialValue28 = (int) ((initialValue27 ? 1 : 0));
        int initialValue29 = (int) ((initialValue22 ? 1 : 0));
        java.lang.Object initialValue30 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingConditionsToTargetStrafe));
        java.lang.Object initialValue31 = recovery$indy$flow$78(initialValue30, initialValue15, 6397443585952552505L, constructorKey1);
        long computed32 = 8774162417105444232L ^ constructorKey1;
        java.lang.Object initialValue33 = recovery$indy$flow$79(17406, computed32);
        boolean initialValue34 = recovery$indy$flow$80(initialValue31, initialValue33);
        int merged43;
        if (initialValue29 != 0) {
            int merged36;
            if (initialValue29 != 0) {
                merged36 = (int) ((initialValue34 ? 1 : 0));
            } else {
                int merged35;
                if ((int) ((initialValue34 ? 1 : 0)) == 0) {
                    merged35 = 0;
                } else {
                    merged35 = 1;
                }
                merged36 = merged35;
            }
            merged43 = merged36;
        } else {
            int merged42;
            if ((int) ((initialValue34 ? 1 : 0)) == 0) {
                merged42 = 0;
            } else {
                java.lang.Object initialValue37 = recovery$indy$flow$81();
                java.lang.Object initialValue38 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue37)))).field_41P));
                boolean initialValue39 = recovery$indy$flow$83(initialValue38, initialValue3, 6398463450917392830L, constructorKey1);
                int merged41;
                if (initialValue29 != 0) {
                    merged41 = (int) ((initialValue39 ? 1 : 0));
                } else {
                    int merged40;
                    if ((int) ((initialValue39 ? 1 : 0)) == 0) {
                        merged40 = 0;
                    } else {
                        merged40 = 1;
                    }
                    merged41 = merged40;
                }
                merged42 = merged41;
            }
            merged43 = merged42;
        }
        int initialValue44 = merged43;
        java.lang.Object initialValue45 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingConditionsToTargetStrafe));
        java.lang.Object initialValue46 = recovery$indy$flow$85(initialValue45, initialValue15, 6397443585952552505L, constructorKey1);
        long computed47 = 7970368092418986371L ^ constructorKey1;
        java.lang.Object initialValue48 = recovery$indy$flow$86(4082, computed47);
        boolean initialValue49 = recovery$indy$flow$87(initialValue46, initialValue48);
        int comparison50 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
        int merged62;
        if (comparison50 < 0) {
            int merged52;
            if (initialValue29 != 0) {
                merged52 = (int) ((initialValue49 ? 1 : 0));
            } else {
                int merged51;
                if ((int) ((initialValue49 ? 1 : 0)) == 0) {
                    merged51 = 0;
                } else {
                    merged51 = 1;
                }
                merged52 = merged51;
            }
            merged62 = merged52;
        } else {
            int merged61;
            if (initialValue29 != 0) {
                int merged54;
                if (initialValue29 != 0) {
                    merged54 = (int) ((initialValue49 ? 1 : 0));
                } else {
                    int merged53;
                    if ((int) ((initialValue49 ? 1 : 0)) == 0) {
                        merged53 = 0;
                    } else {
                        merged53 = 1;
                    }
                    merged54 = merged53;
                }
                merged61 = merged54;
            } else {
                int merged60;
                if ((int) ((initialValue49 ? 1 : 0)) == 0) {
                    merged60 = 0;
                } else {
                    java.lang.Object initialValue55 = recovery$indy$flow$88();
                    java.lang.Object initialValue56 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue55)))).field_47));
                    boolean initialValue57 = recovery$indy$flow$90(initialValue56, initialValue3, 6398463450917392830L, constructorKey1);
                    int merged59;
                    if (initialValue29 != 0) {
                        merged59 = (int) ((initialValue57 ? 1 : 0));
                    } else {
                        int merged58;
                        if ((int) ((initialValue57 ? 1 : 0)) == 0) {
                            merged58 = 0;
                        } else {
                            merged58 = 1;
                        }
                        merged59 = merged58;
                    }
                    merged60 = merged59;
                }
                merged61 = merged60;
            }
            merged62 = merged61;
        }
        int initialValue63 = merged62;
        java.lang.Object initialValue64 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingConditionsToTargetStrafe));
        java.lang.Object initialValue65 = recovery$indy$flow$92(initialValue64, initialValue15, 6397443585952552505L, constructorKey1);
        long computed66 = 4164169277325177791L ^ constructorKey1;
        java.lang.Object initialValue67 = recovery$indy$flow$93(11715, computed66);
        boolean initialValue68 = recovery$indy$flow$94(initialValue65, initialValue67);
        int comparison69 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
        int merged96;
        if (comparison69 < 0) {
            int merged76;
            if (initialValue29 != 0) {
                merged76 = (int) ((initialValue68 ? 1 : 0));
            } else {
                int merged75;
                if ((int) ((initialValue68 ? 1 : 0)) != 0) {
                    merged75 = 1;
                } else {
                    java.lang.Object initialValue70 = recovery$indy$flow$98();
                    java.lang.Object initialValue71 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue70)))).field_41P));
                    boolean initialValue72 = recovery$indy$flow$100(initialValue71, initialValue3, 6398463450917392830L, constructorKey1);
                    int merged74;
                    if (initialValue29 != 0) {
                        merged74 = (int) ((initialValue72 ? 1 : 0));
                    } else {
                        int merged73;
                        if ((int) ((initialValue72 ? 1 : 0)) == 0) {
                            merged73 = 0;
                        } else {
                            merged73 = 1;
                        }
                        merged74 = merged73;
                    }
                    merged75 = merged74;
                }
                merged76 = merged75;
            }
            merged96 = merged76;
        } else {
            int merged95;
            if (initialValue29 != 0) {
                int merged83;
                if (initialValue29 != 0) {
                    merged83 = (int) ((initialValue68 ? 1 : 0));
                } else {
                    int merged82;
                    if ((int) ((initialValue68 ? 1 : 0)) != 0) {
                        merged82 = 1;
                    } else {
                        java.lang.Object initialValue77 = recovery$indy$flow$98();
                        java.lang.Object initialValue78 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue77)))).field_41P));
                        boolean initialValue79 = recovery$indy$flow$100(initialValue78, initialValue3, 6398463450917392830L, constructorKey1);
                        int merged81;
                        if (initialValue29 != 0) {
                            merged81 = (int) ((initialValue79 ? 1 : 0));
                        } else {
                            int merged80;
                            if ((int) ((initialValue79 ? 1 : 0)) == 0) {
                                merged80 = 0;
                            } else {
                                merged80 = 1;
                            }
                            merged81 = merged80;
                        }
                        merged82 = merged81;
                    }
                    merged83 = merged82;
                }
                merged95 = merged83;
            } else {
                int merged94;
                if ((int) ((initialValue68 ? 1 : 0)) == 0) {
                    merged94 = 0;
                } else {
                    java.lang.Object initialValue84 = recovery$indy$flow$95();
                    java.lang.Object initialValue85 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue84)))).field_47));
                    boolean initialValue86 = recovery$indy$flow$97(initialValue85, initialValue3, 6398463450917392830L, constructorKey1);
                    int merged93;
                    if (initialValue29 != 0) {
                        merged93 = (int) ((initialValue86 ? 1 : 0));
                    } else {
                        int merged92;
                        if ((int) ((initialValue86 ? 1 : 0)) != 0) {
                            merged92 = 1;
                        } else {
                            java.lang.Object initialValue87 = recovery$indy$flow$98();
                            java.lang.Object initialValue88 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue87)))).field_41P));
                            boolean initialValue89 = recovery$indy$flow$100(initialValue88, initialValue3, 6398463450917392830L, constructorKey1);
                            int merged91;
                            if (initialValue29 != 0) {
                                merged91 = (int) ((initialValue89 ? 1 : 0));
                            } else {
                                int merged90;
                                if ((int) ((initialValue89 ? 1 : 0)) == 0) {
                                    merged90 = 0;
                                } else {
                                    merged90 = 1;
                                }
                                merged91 = merged90;
                            }
                            merged92 = merged91;
                        }
                        merged93 = merged92;
                    }
                    merged94 = merged93;
                }
                merged95 = merged94;
            }
            merged96 = merged95;
        }
        int initialValue97 = merged96;
        java.lang.Object initialValue98 = recovery$indy$flow$101();
        java.lang.Object initialValue99 = recovery$indy$flow$102(initialValue98, 6398975880469068964L, constructorKey1);
        java.lang.Object initialValue100 = ((java.lang.Object)(((net.C_47oo) (((java.lang.Object)(initialValue99)))).field_44W));
        boolean initialValue101 = recovery$indy$flow$104(initialValue100);
        int comparison102 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
        boolean merged115;
        if (comparison102 < 0) {
            merged115 = initialValue101;
        } else {
            boolean merged114;
            if (initialValue29 != 0) {
                merged114 = initialValue101;
            } else {
                boolean merged113;
                if ((int) ((initialValue101 ? 1 : 0)) != 0) {
                    java.lang.Object initialValue103 = recovery$indy$flow$107();
                    java.lang.Object initialValue104 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue103)))).field_46q));
                    boolean initialValue105 = recovery$indy$flow$109(initialValue104, initialValue3, 6398463450917392830L, constructorKey1);
                    merged113 = initialValue105;
                } else {
                    boolean merged112;
                    if (initialValue29 != 0) {
                        recovery$indy$flow$110(this, initialValue19, 6397976781560315515L, constructorKey1);
                        return;
                    } else {
                        java.lang.Object initialValue106 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingOnlyWhileSpace));
                        boolean initialValue107 = recovery$indy$flow$106(initialValue106, 6399079348953117994L, constructorKey1);
                        boolean merged111;
                        if ((int) ((initialValue107 ? 1 : 0)) != 0) {
                            recovery$indy$flow$110(this, initialValue19, 6397976781560315515L, constructorKey1);
                            return;
                        } else {
                            java.lang.Object initialValue108 = recovery$indy$flow$107();
                            java.lang.Object initialValue109 = ((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(initialValue108)))).field_46q));
                            boolean initialValue110 = recovery$indy$flow$109(initialValue109, initialValue3, 6398463450917392830L, constructorKey1);
                            merged111 = initialValue110;
                        }
                        merged112 = merged111;
                    }
                    merged113 = merged112;
                }
                merged114 = merged113;
            }
            merged115 = merged114;
        }
        int comparison116 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
        int merged118;
        if (comparison116 < 0) {
            merged118 = (int) ((merged115 ? 1 : 0));
        } else {
            int merged117;
            if (initialValue29 != 0) {
                merged117 = (int) ((merged115 ? 1 : 0));
            } else {
                if ((int) ((merged115 ? 1 : 0)) != 0) {
                    recovery$indy$flow$110(this, initialValue19, 6397976781560315515L, constructorKey1);
                    return;
                } else {
                }
                merged117 = initialValue28;
            }
            merged118 = merged117;
        }
        int merged626;
        if (initialValue29 != 0) {
            merged626 = merged118;
        } else {
            int merged625;
            if (merged118 != 0) {
                java.lang.Object initialValue119 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingKillAuraTarget));
                boolean initialValue120 = recovery$indy$flow$112(initialValue119, 6399079348953117994L, constructorKey1);
                merged625 = (int) ((initialValue120 ? 1 : 0));
            } else {
                int merged624;
                if (initialValue29 != 0) {
                    merged624 = initialValue97;
                } else {
                    int merged623;
                    if (initialValue97 != 0) {
                        java.lang.Object initialValue121 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingKillAuraTarget));
                        boolean initialValue122 = recovery$indy$flow$112(initialValue121, 6399079348953117994L, constructorKey1);
                        merged623 = (int) ((initialValue122 ? 1 : 0));
                    } else {
                        int merged622;
                        if (initialValue29 != 0) {
                            merged622 = initialValue63;
                        } else {
                            int merged621;
                            if (initialValue63 != 0) {
                                java.lang.Object initialValue123 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingKillAuraTarget));
                                boolean initialValue124 = recovery$indy$flow$112(initialValue123, 6399079348953117994L, constructorKey1);
                                merged621 = (int) ((initialValue124 ? 1 : 0));
                            } else {
                                int comparison125 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                int merged620;
                                if (comparison125 <= 0) {
                                    if (initialValue29 != 0) {
                                        if (initialValue44 <= 0) {
                                        } else {
                                            java.lang.Object initialValue126 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                                            java.lang.Object arrayValue127 = ((java.lang.Object[]) initialValue126)[0];
                                            java.lang.Object initialValue128 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(arrayValue127))))));
                                            recovery$indy$flow$129(this, initialValue128);
                                        }
                                    } else {
                                        if (initialValue44 == 0) {
                                            java.lang.Object initialValue129 = recovery$indy$flow$115();
                                            java.lang.Object initialValue130 = recovery$indy$flow$116(initialValue129, 6398778770469551566L, constructorKey1);
                                            java.lang.Object initialValue131 = ((java.lang.Object)(((net.minecraft.client.multiplayer.WorldClient) (((java.lang.Object)(initialValue130)))).field_44Q));
                                            java.lang.Object initialValue132 = recovery$indy$flow$118(initialValue131);
                                            java.lang.Object initialValue133 = recovery$indy$flow$119(this);
                                            java.lang.Object initialValue134 = recovery$indy$flow$120(initialValue132, initialValue133);
                                            java.lang.Object initialValue135 = recovery$indy$flow$121();
                                            java.lang.Object initialValue136 = recovery$indy$flow$122(initialValue135);
                                            java.lang.Object initialValue137 = recovery$indy$flow$123(initialValue134, initialValue136);
                                            java.lang.Object initialValue138 = recovery$indy$flow$124(initialValue137);
                                            recovery$indy$flow$125(this, initialValue138);
                                            int comparison139 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                            if (comparison139 < 0) {
                                            } else {
                                                if (initialValue29 != 0) {
                                                } else {
                                                    java.lang.Object initialValue140 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                                                    int length141 = java.lang.reflect.Array.getLength(initialValue140);
                                                    if (length141 <= 0) {
                                                    } else {
                                                        java.lang.Object initialValue142 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                                                        java.lang.Object arrayValue143 = ((java.lang.Object[]) initialValue142)[0];
                                                        java.lang.Object initialValue144 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(arrayValue143))))));
                                                        recovery$indy$flow$129(this, initialValue144);
                                                    }
                                                }
                                            }
                                        } else {
                                            java.lang.Object initialValue145 = recovery$indy$flow$113(initialValue5, 6398878962261872654L, constructorKey1);
                                            recovery$indy$flow$114(this, initialValue145);
                                            int comparison146 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                            if (comparison146 < 0) {
                                                int comparison147 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                if (comparison147 < 0) {
                                                } else {
                                                    if (initialValue29 != 0) {
                                                    } else {
                                                        java.lang.Object initialValue148 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                                                        int length149 = java.lang.reflect.Array.getLength(initialValue148);
                                                        if (length149 <= 0) {
                                                        } else {
                                                            java.lang.Object initialValue150 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                                                            java.lang.Object arrayValue151 = ((java.lang.Object[]) initialValue150)[0];
                                                            java.lang.Object initialValue152 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(arrayValue151))))));
                                                            recovery$indy$flow$129(this, initialValue152);
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (initialValue29 == 0) {
                                                } else {
                                                    java.lang.Object initialValue153 = recovery$indy$flow$115();
                                                    java.lang.Object initialValue154 = recovery$indy$flow$116(initialValue153, 6398778770469551566L, constructorKey1);
                                                    java.lang.Object initialValue155 = ((java.lang.Object)(((net.minecraft.client.multiplayer.WorldClient) (((java.lang.Object)(initialValue154)))).field_44Q));
                                                    java.lang.Object initialValue156 = recovery$indy$flow$118(initialValue155);
                                                    java.lang.Object initialValue157 = recovery$indy$flow$119(this);
                                                    java.lang.Object initialValue158 = recovery$indy$flow$120(initialValue156, initialValue157);
                                                    java.lang.Object initialValue159 = recovery$indy$flow$121();
                                                    java.lang.Object initialValue160 = recovery$indy$flow$122(initialValue159);
                                                    java.lang.Object initialValue161 = recovery$indy$flow$123(initialValue158, initialValue160);
                                                    java.lang.Object initialValue162 = recovery$indy$flow$124(initialValue161);
                                                    recovery$indy$flow$125(this, initialValue162);
                                                    int comparison163 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                    if (comparison163 < 0) {
                                                    } else {
                                                        if (initialValue29 != 0) {
                                                        } else {
                                                            java.lang.Object initialValue164 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                                                            int length165 = java.lang.reflect.Array.getLength(initialValue164);
                                                            if (length165 <= 0) {
                                                            } else {
                                                                java.lang.Object initialValue166 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                                                                java.lang.Object arrayValue167 = ((java.lang.Object[]) initialValue166)[0];
                                                                java.lang.Object initialValue168 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(arrayValue167))))));
                                                                recovery$indy$flow$129(this, initialValue168);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (initialValue29 != 0) {
                                        java.lang.Object initialValue169 = recovery$indy$flow$219(6398068766391291539L, constructorKey1);
                                        java.lang.Object initialValue170 = recovery$indy$flow$220(initialValue169, 6398731111113049788L, constructorKey1);
                                        float initialValue171 = recovery$indy$flow$221(initialValue170);
                                        recovery$indy$flow$222(this, initialValue171);
                                        return;
                                    } else {
                                        java.lang.Object initialValue172 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                        if (initialValue172 == null) {
                                            recovery$indy$flow$218(this, initialValue19, 6397976781560315515L, constructorKey1);
                                            java.lang.Object initialValue173 = recovery$indy$flow$219(6398068766391291539L, constructorKey1);
                                            java.lang.Object initialValue174 = recovery$indy$flow$220(initialValue173, 6398731111113049788L, constructorKey1);
                                            float initialValue175 = recovery$indy$flow$221(initialValue174);
                                            recovery$indy$flow$222(this, initialValue175);
                                            return;
                                        } else {
                                            java.lang.Object initialValue176 = recovery$indy$flow$131();
                                            java.lang.Object initialValue177 = recovery$indy$flow$132(initialValue176, 6399047095105801752L, constructorKey1);
                                            boolean initialValue178 = recovery$indy$flow$133(initialValue177);
                                            int comparison179 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                            if (comparison179 <= 0) {
                                                int comparison180 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                boolean merged187;
                                                if (comparison180 <= 0) {
                                                    merged187 = initialValue178;
                                                } else {
                                                    boolean merged186;
                                                    if (initialValue29 != 0) {
                                                        merged186 = initialValue178;
                                                    } else {
                                                        if ((int) ((initialValue178 ? 1 : 0)) != 0) {
                                                        } else {
                                                            java.lang.Object initialValue181 = recovery$indy$flow$135();
                                                            java.lang.Object initialValue182 = recovery$indy$flow$136(initialValue181, 6398975880469068964L, constructorKey1);
                                                            int initialValue183 = recovery$indy$flow$137(initialValue182);
                                                            recovery$indy$flow$138(this, initialValue183);
                                                        }
                                                        recovery$indy$flow$139(this, true);
                                                        java.lang.Object initialValue184 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingThirdPersonMode));
                                                        boolean initialValue185 = recovery$indy$flow$141(initialValue184, 6399079348953117994L, constructorKey1);
                                                        merged186 = initialValue185;
                                                    }
                                                    merged187 = merged186;
                                                }
                                                int comparison188 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                int merged197;
                                                if (comparison188 < 0) {
                                                    merged197 = (int) ((merged187 ? 1 : 0));
                                                } else {
                                                    int merged196;
                                                    if (initialValue29 != 0) {
                                                        merged196 = (int) ((merged187 ? 1 : 0));
                                                    } else {
                                                        if ((int) ((merged187 ? 1 : 0)) == 0) {
                                                        } else {
                                                            java.lang.Object initialValue189 = recovery$indy$flow$142();
                                                            java.lang.Object initialValue190 = recovery$indy$flow$143(initialValue189, 6398975880469068964L, constructorKey1);
                                                            recovery$indy$flow$144(initialValue190, 1);
                                                        }
                                                        java.lang.Object initialValue191 = recovery$indy$flow$145();
                                                        java.lang.Object initialValue192 = recovery$indy$flow$146(initialValue191, 6399047095105801752L, constructorKey1);
                                                        java.lang.Object initialValue193 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue192)))).field_49w));
                                                        float initialValue194 = recovery$indy$flow$148(initialValue193);
                                                        int comparison195 = (java.lang.Float.isNaN(initialValue194) || java.lang.Float.isNaN(0.0F) ? -1 : (initialValue194 > 0.0F ? 1 : initialValue194 == 0.0F ? 0 : -1));
                                                        merged196 = comparison195;
                                                    }
                                                    merged197 = merged196;
                                                }
                                                java.lang.Object merged216;
                                                if (initialValue29 != 0) {
                                                    if (merged197 >= 0) {
                                                    } else {
                                                        recovery$indy$flow$154(this, true);
                                                    }
                                                    java.lang.Object initialValue198 = recovery$indy$flow$155();
                                                    merged216 = initialValue198;
                                                } else {
                                                    java.lang.Object merged215;
                                                    if (merged197 <= 0) {
                                                        java.lang.Object initialValue199 = recovery$indy$flow$150();
                                                        java.lang.Object merged205;
                                                        if (initialValue29 != 0) {
                                                            merged205 = initialValue199;
                                                        } else {
                                                            java.lang.Object initialValue200 = recovery$indy$flow$151(initialValue199, 6399047095105801752L, constructorKey1);
                                                            java.lang.Object initialValue201 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue200)))).field_49w));
                                                            float initialValue202 = recovery$indy$flow$153(initialValue201);
                                                            int comparison203 = (java.lang.Float.isNaN(initialValue202) || java.lang.Float.isNaN(0.0F) ? 1 : (initialValue202 > 0.0F ? 1 : initialValue202 == 0.0F ? 0 : -1));
                                                            if (comparison203 >= 0) {
                                                            } else {
                                                                recovery$indy$flow$154(this, true);
                                                            }
                                                            java.lang.Object initialValue204 = recovery$indy$flow$155();
                                                            merged205 = initialValue204;
                                                        }
                                                        merged215 = merged205;
                                                    } else {
                                                        recovery$indy$flow$149(this, false);
                                                        java.lang.Object merged214;
                                                        if (initialValue29 == 0) {
                                                            java.lang.Object initialValue206 = recovery$indy$flow$155();
                                                            merged214 = initialValue206;
                                                        } else {
                                                            java.lang.Object initialValue207 = recovery$indy$flow$150();
                                                            java.lang.Object merged213;
                                                            if (initialValue29 != 0) {
                                                                merged213 = initialValue207;
                                                            } else {
                                                                java.lang.Object initialValue208 = recovery$indy$flow$151(initialValue207, 6399047095105801752L, constructorKey1);
                                                                java.lang.Object initialValue209 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue208)))).field_49w));
                                                                float initialValue210 = recovery$indy$flow$153(initialValue209);
                                                                int comparison211 = (java.lang.Float.isNaN(initialValue210) || java.lang.Float.isNaN(0.0F) ? 1 : (initialValue210 > 0.0F ? 1 : initialValue210 == 0.0F ? 0 : -1));
                                                                if (comparison211 >= 0) {
                                                                } else {
                                                                    recovery$indy$flow$154(this, true);
                                                                }
                                                                java.lang.Object initialValue212 = recovery$indy$flow$155();
                                                                merged213 = initialValue212;
                                                            }
                                                            merged214 = merged213;
                                                        }
                                                        merged215 = merged214;
                                                    }
                                                    merged216 = merged215;
                                                }
                                                java.lang.Object initialValue217 = recovery$indy$flow$156(merged216, 6398778770469551566L, constructorKey1);
                                                java.lang.Object initialValue218 = recovery$indy$flow$157();
                                                java.lang.Object initialValue219 = recovery$indy$flow$158(initialValue218, 6399047095105801752L, constructorKey1);
                                                double initialValue220 = recovery$indy$flow$159(initialValue219);
                                                java.lang.Object initialValue221 = recovery$indy$flow$160();
                                                java.lang.Object initialValue222 = recovery$indy$flow$161(initialValue221, 6399047095105801752L, constructorKey1);
                                                double initialValue223 = recovery$indy$flow$162(initialValue222);
                                                double computed224 = initialValue223 - Double.longBitsToDouble(4611686018427387904L);
                                                java.lang.Object initialValue225 = recovery$indy$flow$163();
                                                java.lang.Object initialValue226 = recovery$indy$flow$164(initialValue225, 6399047095105801752L, constructorKey1);
                                                double initialValue227 = recovery$indy$flow$165(initialValue226);
                                                java.lang.Object initialValue228 = recovery$indy$flow$166(initialValue217, initialValue220, computed224, initialValue227);
                                                java.lang.Object initialValue229 = recovery$indy$flow$167(initialValue228);
                                                java.lang.Object initialValue230 = initialValue229;
                                                java.lang.Object initialValue231 = recovery$indy$flow$168();
                                                java.lang.Object initialValue232 = recovery$indy$flow$169(initialValue231, 6399047095105801752L, constructorKey1);
                                                boolean initialValue233 = recovery$indy$flow$170(initialValue232);
                                                int comparison234 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                boolean merged240;
                                                if (comparison234 <= 0) {
                                                    merged240 = initialValue233;
                                                } else {
                                                    boolean merged239;
                                                    if (initialValue29 != 0) {
                                                        merged239 = initialValue233;
                                                    } else {
                                                        if ((int) ((initialValue233 ? 1 : 0)) == 0) {
                                                        } else {
                                                            boolean initialValue235 = recovery$indy$flow$171(this);
                                                            int merged237;
                                                            if (initialValue29 != 0) {
                                                                merged237 = (int) ((initialValue235 ? 1 : 0));
                                                            } else {
                                                                int merged236;
                                                                if ((int) ((initialValue235 ? 1 : 0)) != 0) {
                                                                    merged236 = 0;
                                                                } else {
                                                                    merged236 = 1;
                                                                }
                                                                merged237 = merged236;
                                                            }
                                                            recovery$indy$flow$172(this, (merged237 != 0));
                                                        }
                                                        boolean initialValue238 = recovery$indy$flow$173(initialValue230);
                                                        merged239 = initialValue238;
                                                    }
                                                    merged240 = merged239;
                                                }
                                                int comparison241 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                if (comparison241 <= 0) {
                                                    if (initialValue29 != 0) {
                                                        if ((int) ((merged240 ? 1 : 0)) == 0) {
                                                        } else {
                                                            boolean initialValue242 = recovery$indy$flow$179(this);
                                                            int merged244;
                                                            if (initialValue29 != 0) {
                                                                merged244 = (int) ((initialValue242 ? 1 : 0));
                                                            } else {
                                                                int merged243;
                                                                if ((int) ((initialValue242 ? 1 : 0)) != 0) {
                                                                    merged243 = 0;
                                                                } else {
                                                                    merged243 = 1;
                                                                }
                                                                merged244 = merged243;
                                                            }
                                                            recovery$indy$flow$180(this, (merged244 != 0));
                                                            java.lang.Object initialValue245 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                            recovery$indy$flow$182(initialValue245, 6398202751750232087L, constructorKey1);
                                                        }
                                                    } else {
                                                        if ((int) ((merged240 ? 1 : 0)) != 0) {
                                                        } else {
                                                            if (initialValue29 != 0) {
                                                            } else {
                                                                java.lang.Object initialValue246 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                boolean initialValue247 = recovery$indy$flow$178(initialValue246, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                                                if ((int) ((initialValue247 ? 1 : 0)) == 0) {
                                                                } else {
                                                                    boolean initialValue248 = recovery$indy$flow$179(this);
                                                                    int merged250;
                                                                    if (initialValue29 != 0) {
                                                                        merged250 = (int) ((initialValue248 ? 1 : 0));
                                                                    } else {
                                                                        int merged249;
                                                                        if ((int) ((initialValue248 ? 1 : 0)) != 0) {
                                                                            merged249 = 0;
                                                                        } else {
                                                                            merged249 = 1;
                                                                        }
                                                                        merged250 = merged249;
                                                                    }
                                                                    recovery$indy$flow$180(this, (merged250 != 0));
                                                                    java.lang.Object initialValue251 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                    recovery$indy$flow$182(initialValue251, 6398202751750232087L, constructorKey1);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (initialValue29 != 0) {
                                                        if (initialValue29 != 0) {
                                                            if ((int) ((merged240 ? 1 : 0)) == 0) {
                                                            } else {
                                                                boolean initialValue252 = recovery$indy$flow$179(this);
                                                                int merged254;
                                                                if (initialValue29 != 0) {
                                                                    merged254 = (int) ((initialValue252 ? 1 : 0));
                                                                } else {
                                                                    int merged253;
                                                                    if ((int) ((initialValue252 ? 1 : 0)) != 0) {
                                                                        merged253 = 0;
                                                                    } else {
                                                                        merged253 = 1;
                                                                    }
                                                                    merged254 = merged253;
                                                                }
                                                                recovery$indy$flow$180(this, (merged254 != 0));
                                                                java.lang.Object initialValue255 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                recovery$indy$flow$182(initialValue255, 6398202751750232087L, constructorKey1);
                                                            }
                                                        } else {
                                                            if ((int) ((merged240 ? 1 : 0)) != 0) {
                                                            } else {
                                                                if (initialValue29 != 0) {
                                                                } else {
                                                                    java.lang.Object initialValue256 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                    boolean initialValue257 = recovery$indy$flow$178(initialValue256, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                                                    if ((int) ((initialValue257 ? 1 : 0)) == 0) {
                                                                    } else {
                                                                        boolean initialValue258 = recovery$indy$flow$179(this);
                                                                        int merged260;
                                                                        if (initialValue29 != 0) {
                                                                            merged260 = (int) ((initialValue258 ? 1 : 0));
                                                                        } else {
                                                                            int merged259;
                                                                            if ((int) ((initialValue258 ? 1 : 0)) != 0) {
                                                                                merged259 = 0;
                                                                            } else {
                                                                                merged259 = 1;
                                                                            }
                                                                            merged260 = merged259;
                                                                        }
                                                                        recovery$indy$flow$180(this, (merged260 != 0));
                                                                        java.lang.Object initialValue261 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                        recovery$indy$flow$182(initialValue261, 6398202751750232087L, constructorKey1);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if ((int) ((merged240 ? 1 : 0)) == 0) {
                                                        } else {
                                                            java.lang.Object initialValue262 = recovery$indy$flow$174();
                                                            java.lang.Object initialValue263 = recovery$indy$flow$175(initialValue262, 6399047095105801752L, constructorKey1);
                                                            boolean initialValue264 = recovery$indy$flow$176(initialValue263);
                                                            if (initialValue29 != 0) {
                                                                if ((int) ((initialValue264 ? 1 : 0)) == 0) {
                                                                } else {
                                                                    boolean initialValue265 = recovery$indy$flow$179(this);
                                                                    int merged267;
                                                                    if (initialValue29 != 0) {
                                                                        merged267 = (int) ((initialValue265 ? 1 : 0));
                                                                    } else {
                                                                        int merged266;
                                                                        if ((int) ((initialValue265 ? 1 : 0)) != 0) {
                                                                            merged266 = 0;
                                                                        } else {
                                                                            merged266 = 1;
                                                                        }
                                                                        merged267 = merged266;
                                                                    }
                                                                    recovery$indy$flow$180(this, (merged267 != 0));
                                                                    java.lang.Object initialValue268 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                    recovery$indy$flow$182(initialValue268, 6398202751750232087L, constructorKey1);
                                                                }
                                                            } else {
                                                                if ((int) ((initialValue264 ? 1 : 0)) != 0) {
                                                                } else {
                                                                    if (initialValue29 != 0) {
                                                                    } else {
                                                                        java.lang.Object initialValue269 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                        boolean initialValue270 = recovery$indy$flow$178(initialValue269, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                                                        if ((int) ((initialValue270 ? 1 : 0)) == 0) {
                                                                        } else {
                                                                            boolean initialValue271 = recovery$indy$flow$179(this);
                                                                            int merged273;
                                                                            if (initialValue29 != 0) {
                                                                                merged273 = (int) ((initialValue271 ? 1 : 0));
                                                                            } else {
                                                                                int merged272;
                                                                                if ((int) ((initialValue271 ? 1 : 0)) != 0) {
                                                                                    merged272 = 0;
                                                                                } else {
                                                                                    merged272 = 1;
                                                                                }
                                                                                merged273 = merged272;
                                                                            }
                                                                            recovery$indy$flow$180(this, (merged273 != 0));
                                                                            java.lang.Object initialValue274 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                            recovery$indy$flow$182(initialValue274, 6398202751750232087L, constructorKey1);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                java.lang.Object initialValue275 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingRadius));
                                                double initialValue276 = recovery$indy$flow$184(initialValue275, initialValue13, 6399216400434126234L, constructorKey1);
                                                double initialValue277 = initialValue276;
                                                net.C_47gg initialized278 = new net.C_47gg(initialValue11);
                                                net.C_47gg initialValue279 = initialized278;
                                                java.lang.Object initialValue280 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                                java.lang.Object initialValue281 = recovery$indy$flow$188();
                                                java.lang.Object initialValue282 = recovery$indy$flow$189(initialValue281, 6399047095105801752L, constructorKey1);
                                                float initialValue283 = recovery$indy$flow$190(initialValue282);
                                                java.lang.Object initialValue284 = recovery$indy$flow$191();
                                                java.lang.Object initialValue285 = recovery$indy$flow$192(initialValue284, 6399047095105801752L, constructorKey1);
                                                float initialValue286 = recovery$indy$flow$193(initialValue285);
                                                java.lang.Object initialValue287 = recovery$indy$flow$194(initialValue279, initialValue21, initialValue280, initialValue283, initialValue286, false, 6399485110129484411L, constructorKey1);
                                                float initialValue288 = recovery$indy$flow$195(initialValue287);
                                                double converted289 = (double) (initialValue288);
                                                double initialValue290 = converted289;
                                                boolean initialValue291 = recovery$indy$flow$196(this);
                                                int merged293;
                                                if (initialValue29 != 0) {
                                                    merged293 = (int) ((initialValue291 ? 1 : 0));
                                                } else {
                                                    int merged292;
                                                    if ((int) ((initialValue291 ? 1 : 0)) == 0) {
                                                        merged292 = 1;
                                                    } else {
                                                        merged292 = -1;
                                                    }
                                                    merged293 = merged292;
                                                }
                                                int computed294 = merged293 * 45;
                                                double converted295 = (double) (computed294);
                                                double computed296 = initialValue290 + converted295;
                                                double initialValue297 = computed296;
                                                double initialValue298 = recovery$indy$flow$197(initialValue297);
                                                double initialValue299 = initialValue298;
                                                java.lang.Object initialValue300 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                                double initialValue301 = recovery$indy$flow$199(initialValue300);
                                                double initialValue302 = recovery$indy$flow$200(initialValue299);
                                                double computed303 = initialValue302 * initialValue277;
                                                double computed304 = initialValue301 + computed303;
                                                double initialValue305 = computed304;
                                                java.lang.Object initialValue306 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                                double initialValue307 = recovery$indy$flow$202(initialValue306);
                                                double initialValue308 = recovery$indy$flow$203(initialValue299);
                                                double computed309 = initialValue308 * initialValue277;
                                                double computed310 = initialValue307 - computed309;
                                                double initialValue311 = computed310;
                                                java.lang.Object initialValue312 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                                double initialValue313 = recovery$indy$flow$205(initialValue312);
                                                java.lang.Object initialValue314 = recovery$indy$flow$206();
                                                java.lang.Object initialValue315 = recovery$indy$flow$207(initialValue314, 6399047095105801752L, constructorKey1);
                                                float initialValue316 = recovery$indy$flow$208(initialValue315);
                                                java.lang.Object initialValue317 = recovery$indy$flow$209();
                                                java.lang.Object initialValue318 = recovery$indy$flow$210(initialValue317, 6399047095105801752L, constructorKey1);
                                                float initialValue319 = recovery$indy$flow$211(initialValue318);
                                                java.lang.Object initialValue320 = recovery$indy$flow$212(initialValue279, initialValue305, initialValue313, initialValue311, initialValue7, initialValue316, initialValue319, false, 6398680970342987849L, constructorKey1);
                                                float initialValue321 = recovery$indy$flow$213(initialValue320);
                                                recovery$indy$flow$214(this, initialValue321);
                                                java.lang.Object initialValue322 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingAutoStrafe));
                                                boolean initialValue323 = recovery$indy$flow$216(initialValue322, 6399079348953117994L, constructorKey1);
                                                if ((int) ((initialValue323 ? 1 : 0)) == 0) {
                                                } else {
                                                    recovery$indy$flow$217(initialValue9, 6398249691592924705L, constructorKey1);
                                                }
                                                return;
                                            } else {
                                                if (initialValue29 != 0) {
                                                    int comparison324 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                    boolean merged331;
                                                    if (comparison324 <= 0) {
                                                        merged331 = initialValue178;
                                                    } else {
                                                        boolean merged330;
                                                        if (initialValue29 != 0) {
                                                            merged330 = initialValue178;
                                                        } else {
                                                            if ((int) ((initialValue178 ? 1 : 0)) != 0) {
                                                            } else {
                                                                java.lang.Object initialValue325 = recovery$indy$flow$135();
                                                                java.lang.Object initialValue326 = recovery$indy$flow$136(initialValue325, 6398975880469068964L, constructorKey1);
                                                                int initialValue327 = recovery$indy$flow$137(initialValue326);
                                                                recovery$indy$flow$138(this, initialValue327);
                                                            }
                                                            recovery$indy$flow$139(this, true);
                                                            java.lang.Object initialValue328 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingThirdPersonMode));
                                                            boolean initialValue329 = recovery$indy$flow$141(initialValue328, 6399079348953117994L, constructorKey1);
                                                            merged330 = initialValue329;
                                                        }
                                                        merged331 = merged330;
                                                    }
                                                    int comparison332 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                    int merged341;
                                                    if (comparison332 < 0) {
                                                        merged341 = (int) ((merged331 ? 1 : 0));
                                                    } else {
                                                        int merged340;
                                                        if (initialValue29 != 0) {
                                                            merged340 = (int) ((merged331 ? 1 : 0));
                                                        } else {
                                                            if ((int) ((merged331 ? 1 : 0)) == 0) {
                                                            } else {
                                                                java.lang.Object initialValue333 = recovery$indy$flow$142();
                                                                java.lang.Object initialValue334 = recovery$indy$flow$143(initialValue333, 6398975880469068964L, constructorKey1);
                                                                recovery$indy$flow$144(initialValue334, 1);
                                                            }
                                                            java.lang.Object initialValue335 = recovery$indy$flow$145();
                                                            java.lang.Object initialValue336 = recovery$indy$flow$146(initialValue335, 6399047095105801752L, constructorKey1);
                                                            java.lang.Object initialValue337 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue336)))).field_49w));
                                                            float initialValue338 = recovery$indy$flow$148(initialValue337);
                                                            int comparison339 = (java.lang.Float.isNaN(initialValue338) || java.lang.Float.isNaN(0.0F) ? -1 : (initialValue338 > 0.0F ? 1 : initialValue338 == 0.0F ? 0 : -1));
                                                            merged340 = comparison339;
                                                        }
                                                        merged341 = merged340;
                                                    }
                                                    java.lang.Object merged360;
                                                    if (initialValue29 != 0) {
                                                        if (merged341 >= 0) {
                                                        } else {
                                                            recovery$indy$flow$154(this, true);
                                                        }
                                                        java.lang.Object initialValue342 = recovery$indy$flow$155();
                                                        merged360 = initialValue342;
                                                    } else {
                                                        java.lang.Object merged359;
                                                        if (merged341 <= 0) {
                                                            java.lang.Object initialValue343 = recovery$indy$flow$150();
                                                            java.lang.Object merged349;
                                                            if (initialValue29 != 0) {
                                                                merged349 = initialValue343;
                                                            } else {
                                                                java.lang.Object initialValue344 = recovery$indy$flow$151(initialValue343, 6399047095105801752L, constructorKey1);
                                                                java.lang.Object initialValue345 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue344)))).field_49w));
                                                                float initialValue346 = recovery$indy$flow$153(initialValue345);
                                                                int comparison347 = (java.lang.Float.isNaN(initialValue346) || java.lang.Float.isNaN(0.0F) ? 1 : (initialValue346 > 0.0F ? 1 : initialValue346 == 0.0F ? 0 : -1));
                                                                if (comparison347 >= 0) {
                                                                } else {
                                                                    recovery$indy$flow$154(this, true);
                                                                }
                                                                java.lang.Object initialValue348 = recovery$indy$flow$155();
                                                                merged349 = initialValue348;
                                                            }
                                                            merged359 = merged349;
                                                        } else {
                                                            recovery$indy$flow$149(this, false);
                                                            java.lang.Object merged358;
                                                            if (initialValue29 == 0) {
                                                                java.lang.Object initialValue350 = recovery$indy$flow$155();
                                                                merged358 = initialValue350;
                                                            } else {
                                                                java.lang.Object initialValue351 = recovery$indy$flow$150();
                                                                java.lang.Object merged357;
                                                                if (initialValue29 != 0) {
                                                                    merged357 = initialValue351;
                                                                } else {
                                                                    java.lang.Object initialValue352 = recovery$indy$flow$151(initialValue351, 6399047095105801752L, constructorKey1);
                                                                    java.lang.Object initialValue353 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue352)))).field_49w));
                                                                    float initialValue354 = recovery$indy$flow$153(initialValue353);
                                                                    int comparison355 = (java.lang.Float.isNaN(initialValue354) || java.lang.Float.isNaN(0.0F) ? 1 : (initialValue354 > 0.0F ? 1 : initialValue354 == 0.0F ? 0 : -1));
                                                                    if (comparison355 >= 0) {
                                                                    } else {
                                                                        recovery$indy$flow$154(this, true);
                                                                    }
                                                                    java.lang.Object initialValue356 = recovery$indy$flow$155();
                                                                    merged357 = initialValue356;
                                                                }
                                                                merged358 = merged357;
                                                            }
                                                            merged359 = merged358;
                                                        }
                                                        merged360 = merged359;
                                                    }
                                                    java.lang.Object initialValue361 = recovery$indy$flow$156(merged360, 6398778770469551566L, constructorKey1);
                                                    java.lang.Object initialValue362 = recovery$indy$flow$157();
                                                    java.lang.Object initialValue363 = recovery$indy$flow$158(initialValue362, 6399047095105801752L, constructorKey1);
                                                    double initialValue364 = recovery$indy$flow$159(initialValue363);
                                                    java.lang.Object initialValue365 = recovery$indy$flow$160();
                                                    java.lang.Object initialValue366 = recovery$indy$flow$161(initialValue365, 6399047095105801752L, constructorKey1);
                                                    double initialValue367 = recovery$indy$flow$162(initialValue366);
                                                    double computed368 = initialValue367 - Double.longBitsToDouble(4611686018427387904L);
                                                    java.lang.Object initialValue369 = recovery$indy$flow$163();
                                                    java.lang.Object initialValue370 = recovery$indy$flow$164(initialValue369, 6399047095105801752L, constructorKey1);
                                                    double initialValue371 = recovery$indy$flow$165(initialValue370);
                                                    java.lang.Object initialValue372 = recovery$indy$flow$166(initialValue361, initialValue364, computed368, initialValue371);
                                                    java.lang.Object initialValue373 = recovery$indy$flow$167(initialValue372);
                                                    java.lang.Object initialValue374 = initialValue373;
                                                    java.lang.Object initialValue375 = recovery$indy$flow$168();
                                                    java.lang.Object initialValue376 = recovery$indy$flow$169(initialValue375, 6399047095105801752L, constructorKey1);
                                                    boolean initialValue377 = recovery$indy$flow$170(initialValue376);
                                                    int comparison378 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                    boolean merged384;
                                                    if (comparison378 <= 0) {
                                                        merged384 = initialValue377;
                                                    } else {
                                                        boolean merged383;
                                                        if (initialValue29 != 0) {
                                                            merged383 = initialValue377;
                                                        } else {
                                                            if ((int) ((initialValue377 ? 1 : 0)) == 0) {
                                                            } else {
                                                                boolean initialValue379 = recovery$indy$flow$171(this);
                                                                int merged381;
                                                                if (initialValue29 != 0) {
                                                                    merged381 = (int) ((initialValue379 ? 1 : 0));
                                                                } else {
                                                                    int merged380;
                                                                    if ((int) ((initialValue379 ? 1 : 0)) != 0) {
                                                                        merged380 = 0;
                                                                    } else {
                                                                        merged380 = 1;
                                                                    }
                                                                    merged381 = merged380;
                                                                }
                                                                recovery$indy$flow$172(this, (merged381 != 0));
                                                            }
                                                            boolean initialValue382 = recovery$indy$flow$173(initialValue374);
                                                            merged383 = initialValue382;
                                                        }
                                                        merged384 = merged383;
                                                    }
                                                    int comparison385 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                    if (comparison385 <= 0) {
                                                        if (initialValue29 != 0) {
                                                            if ((int) ((merged384 ? 1 : 0)) == 0) {
                                                            } else {
                                                                boolean initialValue386 = recovery$indy$flow$179(this);
                                                                int merged388;
                                                                if (initialValue29 != 0) {
                                                                    merged388 = (int) ((initialValue386 ? 1 : 0));
                                                                } else {
                                                                    int merged387;
                                                                    if ((int) ((initialValue386 ? 1 : 0)) != 0) {
                                                                        merged387 = 0;
                                                                    } else {
                                                                        merged387 = 1;
                                                                    }
                                                                    merged388 = merged387;
                                                                }
                                                                recovery$indy$flow$180(this, (merged388 != 0));
                                                                java.lang.Object initialValue389 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                recovery$indy$flow$182(initialValue389, 6398202751750232087L, constructorKey1);
                                                            }
                                                        } else {
                                                            if ((int) ((merged384 ? 1 : 0)) != 0) {
                                                            } else {
                                                                if (initialValue29 != 0) {
                                                                } else {
                                                                    java.lang.Object initialValue390 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                    boolean initialValue391 = recovery$indy$flow$178(initialValue390, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                                                    if ((int) ((initialValue391 ? 1 : 0)) == 0) {
                                                                    } else {
                                                                        boolean initialValue392 = recovery$indy$flow$179(this);
                                                                        int merged394;
                                                                        if (initialValue29 != 0) {
                                                                            merged394 = (int) ((initialValue392 ? 1 : 0));
                                                                        } else {
                                                                            int merged393;
                                                                            if ((int) ((initialValue392 ? 1 : 0)) != 0) {
                                                                                merged393 = 0;
                                                                            } else {
                                                                                merged393 = 1;
                                                                            }
                                                                            merged394 = merged393;
                                                                        }
                                                                        recovery$indy$flow$180(this, (merged394 != 0));
                                                                        java.lang.Object initialValue395 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                        recovery$indy$flow$182(initialValue395, 6398202751750232087L, constructorKey1);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (initialValue29 != 0) {
                                                            if (initialValue29 != 0) {
                                                                if ((int) ((merged384 ? 1 : 0)) == 0) {
                                                                } else {
                                                                    boolean initialValue396 = recovery$indy$flow$179(this);
                                                                    int merged398;
                                                                    if (initialValue29 != 0) {
                                                                        merged398 = (int) ((initialValue396 ? 1 : 0));
                                                                    } else {
                                                                        int merged397;
                                                                        if ((int) ((initialValue396 ? 1 : 0)) != 0) {
                                                                            merged397 = 0;
                                                                        } else {
                                                                            merged397 = 1;
                                                                        }
                                                                        merged398 = merged397;
                                                                    }
                                                                    recovery$indy$flow$180(this, (merged398 != 0));
                                                                    java.lang.Object initialValue399 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                    recovery$indy$flow$182(initialValue399, 6398202751750232087L, constructorKey1);
                                                                }
                                                            } else {
                                                                if ((int) ((merged384 ? 1 : 0)) != 0) {
                                                                } else {
                                                                    if (initialValue29 != 0) {
                                                                    } else {
                                                                        java.lang.Object initialValue400 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                        boolean initialValue401 = recovery$indy$flow$178(initialValue400, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                                                        if ((int) ((initialValue401 ? 1 : 0)) == 0) {
                                                                        } else {
                                                                            boolean initialValue402 = recovery$indy$flow$179(this);
                                                                            int merged404;
                                                                            if (initialValue29 != 0) {
                                                                                merged404 = (int) ((initialValue402 ? 1 : 0));
                                                                            } else {
                                                                                int merged403;
                                                                                if ((int) ((initialValue402 ? 1 : 0)) != 0) {
                                                                                    merged403 = 0;
                                                                                } else {
                                                                                    merged403 = 1;
                                                                                }
                                                                                merged404 = merged403;
                                                                            }
                                                                            recovery$indy$flow$180(this, (merged404 != 0));
                                                                            java.lang.Object initialValue405 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                            recovery$indy$flow$182(initialValue405, 6398202751750232087L, constructorKey1);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if ((int) ((merged384 ? 1 : 0)) == 0) {
                                                            } else {
                                                                java.lang.Object initialValue406 = recovery$indy$flow$174();
                                                                java.lang.Object initialValue407 = recovery$indy$flow$175(initialValue406, 6399047095105801752L, constructorKey1);
                                                                boolean initialValue408 = recovery$indy$flow$176(initialValue407);
                                                                if (initialValue29 != 0) {
                                                                    if ((int) ((initialValue408 ? 1 : 0)) == 0) {
                                                                    } else {
                                                                        boolean initialValue409 = recovery$indy$flow$179(this);
                                                                        int merged411;
                                                                        if (initialValue29 != 0) {
                                                                            merged411 = (int) ((initialValue409 ? 1 : 0));
                                                                        } else {
                                                                            int merged410;
                                                                            if ((int) ((initialValue409 ? 1 : 0)) != 0) {
                                                                                merged410 = 0;
                                                                            } else {
                                                                                merged410 = 1;
                                                                            }
                                                                            merged411 = merged410;
                                                                        }
                                                                        recovery$indy$flow$180(this, (merged411 != 0));
                                                                        java.lang.Object initialValue412 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                        recovery$indy$flow$182(initialValue412, 6398202751750232087L, constructorKey1);
                                                                    }
                                                                } else {
                                                                    if ((int) ((initialValue408 ? 1 : 0)) != 0) {
                                                                    } else {
                                                                        if (initialValue29 != 0) {
                                                                        } else {
                                                                            java.lang.Object initialValue413 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                            boolean initialValue414 = recovery$indy$flow$178(initialValue413, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                                                            if ((int) ((initialValue414 ? 1 : 0)) == 0) {
                                                                            } else {
                                                                                boolean initialValue415 = recovery$indy$flow$179(this);
                                                                                int merged417;
                                                                                if (initialValue29 != 0) {
                                                                                    merged417 = (int) ((initialValue415 ? 1 : 0));
                                                                                } else {
                                                                                    int merged416;
                                                                                    if ((int) ((initialValue415 ? 1 : 0)) != 0) {
                                                                                        merged416 = 0;
                                                                                    } else {
                                                                                        merged416 = 1;
                                                                                    }
                                                                                    merged417 = merged416;
                                                                                }
                                                                                recovery$indy$flow$180(this, (merged417 != 0));
                                                                                java.lang.Object initialValue418 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                                recovery$indy$flow$182(initialValue418, 6398202751750232087L, constructorKey1);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    java.lang.Object initialValue419 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingRadius));
                                                    double initialValue420 = recovery$indy$flow$184(initialValue419, initialValue13, 6399216400434126234L, constructorKey1);
                                                    double initialValue421 = initialValue420;
                                                    net.C_47gg initialized422 = new net.C_47gg(initialValue11);
                                                    net.C_47gg initialValue423 = initialized422;
                                                    java.lang.Object initialValue424 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                                    java.lang.Object initialValue425 = recovery$indy$flow$188();
                                                    java.lang.Object initialValue426 = recovery$indy$flow$189(initialValue425, 6399047095105801752L, constructorKey1);
                                                    float initialValue427 = recovery$indy$flow$190(initialValue426);
                                                    java.lang.Object initialValue428 = recovery$indy$flow$191();
                                                    java.lang.Object initialValue429 = recovery$indy$flow$192(initialValue428, 6399047095105801752L, constructorKey1);
                                                    float initialValue430 = recovery$indy$flow$193(initialValue429);
                                                    java.lang.Object initialValue431 = recovery$indy$flow$194(initialValue423, initialValue21, initialValue424, initialValue427, initialValue430, false, 6399485110129484411L, constructorKey1);
                                                    float initialValue432 = recovery$indy$flow$195(initialValue431);
                                                    double converted433 = (double) (initialValue432);
                                                    double initialValue434 = converted433;
                                                    boolean initialValue435 = recovery$indy$flow$196(this);
                                                    int merged437;
                                                    if (initialValue29 != 0) {
                                                        merged437 = (int) ((initialValue435 ? 1 : 0));
                                                    } else {
                                                        int merged436;
                                                        if ((int) ((initialValue435 ? 1 : 0)) == 0) {
                                                            merged436 = 1;
                                                        } else {
                                                            merged436 = -1;
                                                        }
                                                        merged437 = merged436;
                                                    }
                                                    int computed438 = merged437 * 45;
                                                    double converted439 = (double) (computed438);
                                                    double computed440 = initialValue434 + converted439;
                                                    double initialValue441 = computed440;
                                                    double initialValue442 = recovery$indy$flow$197(initialValue441);
                                                    double initialValue443 = initialValue442;
                                                    java.lang.Object initialValue444 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                                    double initialValue445 = recovery$indy$flow$199(initialValue444);
                                                    double initialValue446 = recovery$indy$flow$200(initialValue443);
                                                    double computed447 = initialValue446 * initialValue421;
                                                    double computed448 = initialValue445 + computed447;
                                                    double initialValue449 = computed448;
                                                    java.lang.Object initialValue450 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                                    double initialValue451 = recovery$indy$flow$202(initialValue450);
                                                    double initialValue452 = recovery$indy$flow$203(initialValue443);
                                                    double computed453 = initialValue452 * initialValue421;
                                                    double computed454 = initialValue451 - computed453;
                                                    double initialValue455 = computed454;
                                                    java.lang.Object initialValue456 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                                    double initialValue457 = recovery$indy$flow$205(initialValue456);
                                                    java.lang.Object initialValue458 = recovery$indy$flow$206();
                                                    java.lang.Object initialValue459 = recovery$indy$flow$207(initialValue458, 6399047095105801752L, constructorKey1);
                                                    float initialValue460 = recovery$indy$flow$208(initialValue459);
                                                    java.lang.Object initialValue461 = recovery$indy$flow$209();
                                                    java.lang.Object initialValue462 = recovery$indy$flow$210(initialValue461, 6399047095105801752L, constructorKey1);
                                                    float initialValue463 = recovery$indy$flow$211(initialValue462);
                                                    java.lang.Object initialValue464 = recovery$indy$flow$212(initialValue423, initialValue449, initialValue457, initialValue455, initialValue7, initialValue460, initialValue463, false, 6398680970342987849L, constructorKey1);
                                                    float initialValue465 = recovery$indy$flow$213(initialValue464);
                                                    recovery$indy$flow$214(this, initialValue465);
                                                    java.lang.Object initialValue466 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingAutoStrafe));
                                                    boolean initialValue467 = recovery$indy$flow$216(initialValue466, 6399079348953117994L, constructorKey1);
                                                    if ((int) ((initialValue467 ? 1 : 0)) == 0) {
                                                    } else {
                                                        recovery$indy$flow$217(initialValue9, 6398249691592924705L, constructorKey1);
                                                    }
                                                    return;
                                                } else {
                                                    if ((int) ((initialValue178 ? 1 : 0)) != 0) {
                                                        recovery$indy$flow$218(this, initialValue19, 6397976781560315515L, constructorKey1);
                                                        java.lang.Object initialValue468 = recovery$indy$flow$219(6398068766391291539L, constructorKey1);
                                                        java.lang.Object initialValue469 = recovery$indy$flow$220(initialValue468, 6398731111113049788L, constructorKey1);
                                                        float initialValue470 = recovery$indy$flow$221(initialValue469);
                                                        recovery$indy$flow$222(this, initialValue470);
                                                        return;
                                                    } else {
                                                        boolean initialValue471 = recovery$indy$flow$134(this);
                                                        int comparison472 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                        boolean merged479;
                                                        if (comparison472 <= 0) {
                                                            merged479 = initialValue471;
                                                        } else {
                                                            boolean merged478;
                                                            if (initialValue29 != 0) {
                                                                merged478 = initialValue471;
                                                            } else {
                                                                if ((int) ((initialValue471 ? 1 : 0)) != 0) {
                                                                } else {
                                                                    java.lang.Object initialValue473 = recovery$indy$flow$135();
                                                                    java.lang.Object initialValue474 = recovery$indy$flow$136(initialValue473, 6398975880469068964L, constructorKey1);
                                                                    int initialValue475 = recovery$indy$flow$137(initialValue474);
                                                                    recovery$indy$flow$138(this, initialValue475);
                                                                }
                                                                recovery$indy$flow$139(this, true);
                                                                java.lang.Object initialValue476 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingThirdPersonMode));
                                                                boolean initialValue477 = recovery$indy$flow$141(initialValue476, 6399079348953117994L, constructorKey1);
                                                                merged478 = initialValue477;
                                                            }
                                                            merged479 = merged478;
                                                        }
                                                        int comparison480 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                        int merged489;
                                                        if (comparison480 < 0) {
                                                            merged489 = (int) ((merged479 ? 1 : 0));
                                                        } else {
                                                            int merged488;
                                                            if (initialValue29 != 0) {
                                                                merged488 = (int) ((merged479 ? 1 : 0));
                                                            } else {
                                                                if ((int) ((merged479 ? 1 : 0)) == 0) {
                                                                } else {
                                                                    java.lang.Object initialValue481 = recovery$indy$flow$142();
                                                                    java.lang.Object initialValue482 = recovery$indy$flow$143(initialValue481, 6398975880469068964L, constructorKey1);
                                                                    recovery$indy$flow$144(initialValue482, 1);
                                                                }
                                                                java.lang.Object initialValue483 = recovery$indy$flow$145();
                                                                java.lang.Object initialValue484 = recovery$indy$flow$146(initialValue483, 6399047095105801752L, constructorKey1);
                                                                java.lang.Object initialValue485 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue484)))).field_49w));
                                                                float initialValue486 = recovery$indy$flow$148(initialValue485);
                                                                int comparison487 = (java.lang.Float.isNaN(initialValue486) || java.lang.Float.isNaN(0.0F) ? -1 : (initialValue486 > 0.0F ? 1 : initialValue486 == 0.0F ? 0 : -1));
                                                                merged488 = comparison487;
                                                            }
                                                            merged489 = merged488;
                                                        }
                                                        java.lang.Object merged508;
                                                        if (initialValue29 != 0) {
                                                            if (merged489 >= 0) {
                                                            } else {
                                                                recovery$indy$flow$154(this, true);
                                                            }
                                                            java.lang.Object initialValue490 = recovery$indy$flow$155();
                                                            merged508 = initialValue490;
                                                        } else {
                                                            java.lang.Object merged507;
                                                            if (merged489 <= 0) {
                                                                java.lang.Object initialValue491 = recovery$indy$flow$150();
                                                                java.lang.Object merged497;
                                                                if (initialValue29 != 0) {
                                                                    merged497 = initialValue491;
                                                                } else {
                                                                    java.lang.Object initialValue492 = recovery$indy$flow$151(initialValue491, 6399047095105801752L, constructorKey1);
                                                                    java.lang.Object initialValue493 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue492)))).field_49w));
                                                                    float initialValue494 = recovery$indy$flow$153(initialValue493);
                                                                    int comparison495 = (java.lang.Float.isNaN(initialValue494) || java.lang.Float.isNaN(0.0F) ? 1 : (initialValue494 > 0.0F ? 1 : initialValue494 == 0.0F ? 0 : -1));
                                                                    if (comparison495 >= 0) {
                                                                    } else {
                                                                        recovery$indy$flow$154(this, true);
                                                                    }
                                                                    java.lang.Object initialValue496 = recovery$indy$flow$155();
                                                                    merged497 = initialValue496;
                                                                }
                                                                merged507 = merged497;
                                                            } else {
                                                                recovery$indy$flow$149(this, false);
                                                                java.lang.Object merged506;
                                                                if (initialValue29 == 0) {
                                                                    java.lang.Object initialValue498 = recovery$indy$flow$155();
                                                                    merged506 = initialValue498;
                                                                } else {
                                                                    java.lang.Object initialValue499 = recovery$indy$flow$150();
                                                                    java.lang.Object merged505;
                                                                    if (initialValue29 != 0) {
                                                                        merged505 = initialValue499;
                                                                    } else {
                                                                        java.lang.Object initialValue500 = recovery$indy$flow$151(initialValue499, 6399047095105801752L, constructorKey1);
                                                                        java.lang.Object initialValue501 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue500)))).field_49w));
                                                                        float initialValue502 = recovery$indy$flow$153(initialValue501);
                                                                        int comparison503 = (java.lang.Float.isNaN(initialValue502) || java.lang.Float.isNaN(0.0F) ? 1 : (initialValue502 > 0.0F ? 1 : initialValue502 == 0.0F ? 0 : -1));
                                                                        if (comparison503 >= 0) {
                                                                        } else {
                                                                            recovery$indy$flow$154(this, true);
                                                                        }
                                                                        java.lang.Object initialValue504 = recovery$indy$flow$155();
                                                                        merged505 = initialValue504;
                                                                    }
                                                                    merged506 = merged505;
                                                                }
                                                                merged507 = merged506;
                                                            }
                                                            merged508 = merged507;
                                                        }
                                                        java.lang.Object initialValue509 = recovery$indy$flow$156(merged508, 6398778770469551566L, constructorKey1);
                                                        java.lang.Object initialValue510 = recovery$indy$flow$157();
                                                        java.lang.Object initialValue511 = recovery$indy$flow$158(initialValue510, 6399047095105801752L, constructorKey1);
                                                        double initialValue512 = recovery$indy$flow$159(initialValue511);
                                                        java.lang.Object initialValue513 = recovery$indy$flow$160();
                                                        java.lang.Object initialValue514 = recovery$indy$flow$161(initialValue513, 6399047095105801752L, constructorKey1);
                                                        double initialValue515 = recovery$indy$flow$162(initialValue514);
                                                        double computed516 = initialValue515 - Double.longBitsToDouble(4611686018427387904L);
                                                        java.lang.Object initialValue517 = recovery$indy$flow$163();
                                                        java.lang.Object initialValue518 = recovery$indy$flow$164(initialValue517, 6399047095105801752L, constructorKey1);
                                                        double initialValue519 = recovery$indy$flow$165(initialValue518);
                                                        java.lang.Object initialValue520 = recovery$indy$flow$166(initialValue509, initialValue512, computed516, initialValue519);
                                                        java.lang.Object initialValue521 = recovery$indy$flow$167(initialValue520);
                                                        java.lang.Object initialValue522 = initialValue521;
                                                        java.lang.Object initialValue523 = recovery$indy$flow$168();
                                                        java.lang.Object initialValue524 = recovery$indy$flow$169(initialValue523, 6399047095105801752L, constructorKey1);
                                                        boolean initialValue525 = recovery$indy$flow$170(initialValue524);
                                                        int comparison526 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                        boolean merged532;
                                                        if (comparison526 <= 0) {
                                                            merged532 = initialValue525;
                                                        } else {
                                                            boolean merged531;
                                                            if (initialValue29 != 0) {
                                                                merged531 = initialValue525;
                                                            } else {
                                                                if ((int) ((initialValue525 ? 1 : 0)) == 0) {
                                                                } else {
                                                                    boolean initialValue527 = recovery$indy$flow$171(this);
                                                                    int merged529;
                                                                    if (initialValue29 != 0) {
                                                                        merged529 = (int) ((initialValue527 ? 1 : 0));
                                                                    } else {
                                                                        int merged528;
                                                                        if ((int) ((initialValue527 ? 1 : 0)) != 0) {
                                                                            merged528 = 0;
                                                                        } else {
                                                                            merged528 = 1;
                                                                        }
                                                                        merged529 = merged528;
                                                                    }
                                                                    recovery$indy$flow$172(this, (merged529 != 0));
                                                                }
                                                                boolean initialValue530 = recovery$indy$flow$173(initialValue522);
                                                                merged531 = initialValue530;
                                                            }
                                                            merged532 = merged531;
                                                        }
                                                        int comparison533 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                                                        if (comparison533 <= 0) {
                                                            if (initialValue29 != 0) {
                                                                if ((int) ((merged532 ? 1 : 0)) == 0) {
                                                                } else {
                                                                    boolean initialValue534 = recovery$indy$flow$179(this);
                                                                    int merged536;
                                                                    if (initialValue29 != 0) {
                                                                        merged536 = (int) ((initialValue534 ? 1 : 0));
                                                                    } else {
                                                                        int merged535;
                                                                        if ((int) ((initialValue534 ? 1 : 0)) != 0) {
                                                                            merged535 = 0;
                                                                        } else {
                                                                            merged535 = 1;
                                                                        }
                                                                        merged536 = merged535;
                                                                    }
                                                                    recovery$indy$flow$180(this, (merged536 != 0));
                                                                    java.lang.Object initialValue537 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                    recovery$indy$flow$182(initialValue537, 6398202751750232087L, constructorKey1);
                                                                }
                                                            } else {
                                                                if ((int) ((merged532 ? 1 : 0)) != 0) {
                                                                } else {
                                                                    if (initialValue29 != 0) {
                                                                    } else {
                                                                        java.lang.Object initialValue538 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                        boolean initialValue539 = recovery$indy$flow$178(initialValue538, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                                                        if ((int) ((initialValue539 ? 1 : 0)) == 0) {
                                                                        } else {
                                                                            boolean initialValue540 = recovery$indy$flow$179(this);
                                                                            int merged542;
                                                                            if (initialValue29 != 0) {
                                                                                merged542 = (int) ((initialValue540 ? 1 : 0));
                                                                            } else {
                                                                                int merged541;
                                                                                if ((int) ((initialValue540 ? 1 : 0)) != 0) {
                                                                                    merged541 = 0;
                                                                                } else {
                                                                                    merged541 = 1;
                                                                                }
                                                                                merged542 = merged541;
                                                                            }
                                                                            recovery$indy$flow$180(this, (merged542 != 0));
                                                                            java.lang.Object initialValue543 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                            recovery$indy$flow$182(initialValue543, 6398202751750232087L, constructorKey1);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (initialValue29 != 0) {
                                                                if (initialValue29 != 0) {
                                                                    if ((int) ((merged532 ? 1 : 0)) == 0) {
                                                                    } else {
                                                                        boolean initialValue544 = recovery$indy$flow$179(this);
                                                                        int merged546;
                                                                        if (initialValue29 != 0) {
                                                                            merged546 = (int) ((initialValue544 ? 1 : 0));
                                                                        } else {
                                                                            int merged545;
                                                                            if ((int) ((initialValue544 ? 1 : 0)) != 0) {
                                                                                merged545 = 0;
                                                                            } else {
                                                                                merged545 = 1;
                                                                            }
                                                                            merged546 = merged545;
                                                                        }
                                                                        recovery$indy$flow$180(this, (merged546 != 0));
                                                                        java.lang.Object initialValue547 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                        recovery$indy$flow$182(initialValue547, 6398202751750232087L, constructorKey1);
                                                                    }
                                                                } else {
                                                                    if ((int) ((merged532 ? 1 : 0)) != 0) {
                                                                    } else {
                                                                        if (initialValue29 != 0) {
                                                                        } else {
                                                                            java.lang.Object initialValue548 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                            boolean initialValue549 = recovery$indy$flow$178(initialValue548, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                                                            if ((int) ((initialValue549 ? 1 : 0)) == 0) {
                                                                            } else {
                                                                                boolean initialValue550 = recovery$indy$flow$179(this);
                                                                                int merged552;
                                                                                if (initialValue29 != 0) {
                                                                                    merged552 = (int) ((initialValue550 ? 1 : 0));
                                                                                } else {
                                                                                    int merged551;
                                                                                    if ((int) ((initialValue550 ? 1 : 0)) != 0) {
                                                                                        merged551 = 0;
                                                                                    } else {
                                                                                        merged551 = 1;
                                                                                    }
                                                                                    merged552 = merged551;
                                                                                }
                                                                                recovery$indy$flow$180(this, (merged552 != 0));
                                                                                java.lang.Object initialValue553 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                                recovery$indy$flow$182(initialValue553, 6398202751750232087L, constructorKey1);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if ((int) ((merged532 ? 1 : 0)) == 0) {
                                                                } else {
                                                                    java.lang.Object initialValue554 = recovery$indy$flow$174();
                                                                    java.lang.Object initialValue555 = recovery$indy$flow$175(initialValue554, 6399047095105801752L, constructorKey1);
                                                                    boolean initialValue556 = recovery$indy$flow$176(initialValue555);
                                                                    if (initialValue29 != 0) {
                                                                        if ((int) ((initialValue556 ? 1 : 0)) == 0) {
                                                                        } else {
                                                                            boolean initialValue557 = recovery$indy$flow$179(this);
                                                                            int merged559;
                                                                            if (initialValue29 != 0) {
                                                                                merged559 = (int) ((initialValue557 ? 1 : 0));
                                                                            } else {
                                                                                int merged558;
                                                                                if ((int) ((initialValue557 ? 1 : 0)) != 0) {
                                                                                    merged558 = 0;
                                                                                } else {
                                                                                    merged558 = 1;
                                                                                }
                                                                                merged559 = merged558;
                                                                            }
                                                                            recovery$indy$flow$180(this, (merged559 != 0));
                                                                            java.lang.Object initialValue560 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                            recovery$indy$flow$182(initialValue560, 6398202751750232087L, constructorKey1);
                                                                        }
                                                                    } else {
                                                                        if ((int) ((initialValue556 ? 1 : 0)) != 0) {
                                                                        } else {
                                                                            if (initialValue29 != 0) {
                                                                            } else {
                                                                                java.lang.Object initialValue561 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                                boolean initialValue562 = recovery$indy$flow$178(initialValue561, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                                                                if ((int) ((initialValue562 ? 1 : 0)) == 0) {
                                                                                } else {
                                                                                    boolean initialValue563 = recovery$indy$flow$179(this);
                                                                                    int merged565;
                                                                                    if (initialValue29 != 0) {
                                                                                        merged565 = (int) ((initialValue563 ? 1 : 0));
                                                                                    } else {
                                                                                        int merged564;
                                                                                        if ((int) ((initialValue563 ? 1 : 0)) != 0) {
                                                                                            merged564 = 0;
                                                                                        } else {
                                                                                            merged564 = 1;
                                                                                        }
                                                                                        merged565 = merged564;
                                                                                    }
                                                                                    recovery$indy$flow$180(this, (merged565 != 0));
                                                                                    java.lang.Object initialValue566 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                                                    recovery$indy$flow$182(initialValue566, 6398202751750232087L, constructorKey1);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        java.lang.Object initialValue567 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingRadius));
                                                        double initialValue568 = recovery$indy$flow$184(initialValue567, initialValue13, 6399216400434126234L, constructorKey1);
                                                        double initialValue569 = initialValue568;
                                                        net.C_47gg initialized570 = new net.C_47gg(initialValue11);
                                                        net.C_47gg initialValue571 = initialized570;
                                                        java.lang.Object initialValue572 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                                        java.lang.Object initialValue573 = recovery$indy$flow$188();
                                                        java.lang.Object initialValue574 = recovery$indy$flow$189(initialValue573, 6399047095105801752L, constructorKey1);
                                                        float initialValue575 = recovery$indy$flow$190(initialValue574);
                                                        java.lang.Object initialValue576 = recovery$indy$flow$191();
                                                        java.lang.Object initialValue577 = recovery$indy$flow$192(initialValue576, 6399047095105801752L, constructorKey1);
                                                        float initialValue578 = recovery$indy$flow$193(initialValue577);
                                                        java.lang.Object initialValue579 = recovery$indy$flow$194(initialValue571, initialValue21, initialValue572, initialValue575, initialValue578, false, 6399485110129484411L, constructorKey1);
                                                        float initialValue580 = recovery$indy$flow$195(initialValue579);
                                                        double converted581 = (double) (initialValue580);
                                                        double initialValue582 = converted581;
                                                        boolean initialValue583 = recovery$indy$flow$196(this);
                                                        int merged585;
                                                        if (initialValue29 != 0) {
                                                            merged585 = (int) ((initialValue583 ? 1 : 0));
                                                        } else {
                                                            int merged584;
                                                            if ((int) ((initialValue583 ? 1 : 0)) == 0) {
                                                                merged584 = 1;
                                                            } else {
                                                                merged584 = -1;
                                                            }
                                                            merged585 = merged584;
                                                        }
                                                        int computed586 = merged585 * 45;
                                                        double converted587 = (double) (computed586);
                                                        double computed588 = initialValue582 + converted587;
                                                        double initialValue589 = computed588;
                                                        double initialValue590 = recovery$indy$flow$197(initialValue589);
                                                        double initialValue591 = initialValue590;
                                                        java.lang.Object initialValue592 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                                        double initialValue593 = recovery$indy$flow$199(initialValue592);
                                                        double initialValue594 = recovery$indy$flow$200(initialValue591);
                                                        double computed595 = initialValue594 * initialValue569;
                                                        double computed596 = initialValue593 + computed595;
                                                        double initialValue597 = computed596;
                                                        java.lang.Object initialValue598 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                                        double initialValue599 = recovery$indy$flow$202(initialValue598);
                                                        double initialValue600 = recovery$indy$flow$203(initialValue591);
                                                        double computed601 = initialValue600 * initialValue569;
                                                        double computed602 = initialValue599 - computed601;
                                                        double initialValue603 = computed602;
                                                        java.lang.Object initialValue604 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                                                        double initialValue605 = recovery$indy$flow$205(initialValue604);
                                                        java.lang.Object initialValue606 = recovery$indy$flow$206();
                                                        java.lang.Object initialValue607 = recovery$indy$flow$207(initialValue606, 6399047095105801752L, constructorKey1);
                                                        float initialValue608 = recovery$indy$flow$208(initialValue607);
                                                        java.lang.Object initialValue609 = recovery$indy$flow$209();
                                                        java.lang.Object initialValue610 = recovery$indy$flow$210(initialValue609, 6399047095105801752L, constructorKey1);
                                                        float initialValue611 = recovery$indy$flow$211(initialValue610);
                                                        java.lang.Object initialValue612 = recovery$indy$flow$212(initialValue571, initialValue597, initialValue605, initialValue603, initialValue7, initialValue608, initialValue611, false, 6398680970342987849L, constructorKey1);
                                                        float initialValue613 = recovery$indy$flow$213(initialValue612);
                                                        recovery$indy$flow$214(this, initialValue613);
                                                        java.lang.Object initialValue614 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingAutoStrafe));
                                                        boolean initialValue615 = recovery$indy$flow$216(initialValue614, 6399079348953117994L, constructorKey1);
                                                        if ((int) ((initialValue615 ? 1 : 0)) == 0) {
                                                        } else {
                                                            recovery$indy$flow$217(initialValue9, 6398249691592924705L, constructorKey1);
                                                        }
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    int merged619;
                                    if (initialValue29 != 0) {
                                        merged619 = initialValue44;
                                    } else {
                                        boolean merged618;
                                        if (initialValue44 != 0) {
                                            java.lang.Object initialValue616 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingKillAuraTarget));
                                            boolean initialValue617 = recovery$indy$flow$112(initialValue616, 6399079348953117994L, constructorKey1);
                                            merged618 = initialValue617;
                                        } else {
                                            recovery$indy$flow$110(this, initialValue19, 6397976781560315515L, constructorKey1);
                                            return;
                                        }
                                        merged619 = (int) ((merged618 ? 1 : 0));
                                    }
                                    merged620 = merged619;
                                }
                                merged621 = merged620;
                            }
                            merged622 = merged621;
                        }
                        merged623 = merged622;
                    }
                    merged624 = merged623;
                }
                merged625 = merged624;
            }
            merged626 = merged625;
        }
        if (initialValue29 != 0) {
            if (merged626 <= 0) {
            } else {
                java.lang.Object initialValue627 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                java.lang.Object arrayValue628 = ((java.lang.Object[]) initialValue627)[0];
                java.lang.Object initialValue629 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(arrayValue628))))));
                recovery$indy$flow$129(this, initialValue629);
            }
        } else {
            if (merged626 == 0) {
                java.lang.Object initialValue630 = recovery$indy$flow$115();
                java.lang.Object initialValue631 = recovery$indy$flow$116(initialValue630, 6398778770469551566L, constructorKey1);
                java.lang.Object initialValue632 = ((java.lang.Object)(((net.minecraft.client.multiplayer.WorldClient) (((java.lang.Object)(initialValue631)))).field_44Q));
                java.lang.Object initialValue633 = recovery$indy$flow$118(initialValue632);
                java.lang.Object initialValue634 = recovery$indy$flow$119(this);
                java.lang.Object initialValue635 = recovery$indy$flow$120(initialValue633, initialValue634);
                java.lang.Object initialValue636 = recovery$indy$flow$121();
                java.lang.Object initialValue637 = recovery$indy$flow$122(initialValue636);
                java.lang.Object initialValue638 = recovery$indy$flow$123(initialValue635, initialValue637);
                java.lang.Object initialValue639 = recovery$indy$flow$124(initialValue638);
                recovery$indy$flow$125(this, initialValue639);
                int comparison640 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                if (comparison640 < 0) {
                } else {
                    if (initialValue29 != 0) {
                    } else {
                        java.lang.Object initialValue641 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                        int length642 = java.lang.reflect.Array.getLength(initialValue641);
                        if (length642 <= 0) {
                        } else {
                            java.lang.Object initialValue643 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                            java.lang.Object arrayValue644 = ((java.lang.Object[]) initialValue643)[0];
                            java.lang.Object initialValue645 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(arrayValue644))))));
                            recovery$indy$flow$129(this, initialValue645);
                        }
                    }
                }
            } else {
                java.lang.Object initialValue646 = recovery$indy$flow$113(initialValue5, 6398878962261872654L, constructorKey1);
                recovery$indy$flow$114(this, initialValue646);
                int comparison647 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                if (comparison647 < 0) {
                    int comparison648 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                    if (comparison648 < 0) {
                    } else {
                        if (initialValue29 != 0) {
                        } else {
                            java.lang.Object initialValue649 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                            int length650 = java.lang.reflect.Array.getLength(initialValue649);
                            if (length650 <= 0) {
                            } else {
                                java.lang.Object initialValue651 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                                java.lang.Object arrayValue652 = ((java.lang.Object[]) initialValue651)[0];
                                java.lang.Object initialValue653 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(arrayValue652))))));
                                recovery$indy$flow$129(this, initialValue653);
                            }
                        }
                    }
                } else {
                    if (initialValue29 == 0) {
                    } else {
                        java.lang.Object initialValue654 = recovery$indy$flow$115();
                        java.lang.Object initialValue655 = recovery$indy$flow$116(initialValue654, 6398778770469551566L, constructorKey1);
                        java.lang.Object initialValue656 = ((java.lang.Object)(((net.minecraft.client.multiplayer.WorldClient) (((java.lang.Object)(initialValue655)))).field_44Q));
                        java.lang.Object initialValue657 = recovery$indy$flow$118(initialValue656);
                        java.lang.Object initialValue658 = recovery$indy$flow$119(this);
                        java.lang.Object initialValue659 = recovery$indy$flow$120(initialValue657, initialValue658);
                        java.lang.Object initialValue660 = recovery$indy$flow$121();
                        java.lang.Object initialValue661 = recovery$indy$flow$122(initialValue660);
                        java.lang.Object initialValue662 = recovery$indy$flow$123(initialValue659, initialValue661);
                        java.lang.Object initialValue663 = recovery$indy$flow$124(initialValue662);
                        recovery$indy$flow$125(this, initialValue663);
                        int comparison664 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                        if (comparison664 < 0) {
                        } else {
                            if (initialValue29 != 0) {
                            } else {
                                java.lang.Object initialValue665 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                                int length666 = java.lang.reflect.Array.getLength(initialValue665);
                                if (length666 <= 0) {
                                } else {
                                    java.lang.Object initialValue667 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_44));
                                    java.lang.Object arrayValue668 = ((java.lang.Object[]) initialValue667)[0];
                                    java.lang.Object initialValue669 = ((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(arrayValue668))))));
                                    recovery$indy$flow$129(this, initialValue669);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (initialValue29 != 0) {
        } else {
            java.lang.Object initialValue670 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
            if (initialValue670 == null) {
                recovery$indy$flow$218(this, initialValue19, 6397976781560315515L, constructorKey1);
            } else {
                java.lang.Object initialValue671 = recovery$indy$flow$131();
                java.lang.Object initialValue672 = recovery$indy$flow$132(initialValue671, 6399047095105801752L, constructorKey1);
                boolean initialValue673 = recovery$indy$flow$133(initialValue672);
                int comparison674 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                if (comparison674 <= 0) {
                    int comparison675 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                    boolean merged682;
                    if (comparison675 <= 0) {
                        merged682 = initialValue673;
                    } else {
                        boolean merged681;
                        if (initialValue29 != 0) {
                            merged681 = initialValue673;
                        } else {
                            if ((int) ((initialValue673 ? 1 : 0)) != 0) {
                            } else {
                                java.lang.Object initialValue676 = recovery$indy$flow$135();
                                java.lang.Object initialValue677 = recovery$indy$flow$136(initialValue676, 6398975880469068964L, constructorKey1);
                                int initialValue678 = recovery$indy$flow$137(initialValue677);
                                recovery$indy$flow$138(this, initialValue678);
                            }
                            recovery$indy$flow$139(this, true);
                            java.lang.Object initialValue679 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingThirdPersonMode));
                            boolean initialValue680 = recovery$indy$flow$141(initialValue679, 6399079348953117994L, constructorKey1);
                            merged681 = initialValue680;
                        }
                        merged682 = merged681;
                    }
                    int comparison683 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                    int merged692;
                    if (comparison683 < 0) {
                        merged692 = (int) ((merged682 ? 1 : 0));
                    } else {
                        int merged691;
                        if (initialValue29 != 0) {
                            merged691 = (int) ((merged682 ? 1 : 0));
                        } else {
                            if ((int) ((merged682 ? 1 : 0)) == 0) {
                            } else {
                                java.lang.Object initialValue684 = recovery$indy$flow$142();
                                java.lang.Object initialValue685 = recovery$indy$flow$143(initialValue684, 6398975880469068964L, constructorKey1);
                                recovery$indy$flow$144(initialValue685, 1);
                            }
                            java.lang.Object initialValue686 = recovery$indy$flow$145();
                            java.lang.Object initialValue687 = recovery$indy$flow$146(initialValue686, 6399047095105801752L, constructorKey1);
                            java.lang.Object initialValue688 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue687)))).field_49w));
                            float initialValue689 = recovery$indy$flow$148(initialValue688);
                            int comparison690 = (java.lang.Float.isNaN(initialValue689) || java.lang.Float.isNaN(0.0F) ? -1 : (initialValue689 > 0.0F ? 1 : initialValue689 == 0.0F ? 0 : -1));
                            merged691 = comparison690;
                        }
                        merged692 = merged691;
                    }
                    java.lang.Object merged711;
                    if (initialValue29 != 0) {
                        if (merged692 >= 0) {
                        } else {
                            recovery$indy$flow$154(this, true);
                        }
                        java.lang.Object initialValue693 = recovery$indy$flow$155();
                        merged711 = initialValue693;
                    } else {
                        java.lang.Object merged710;
                        if (merged692 <= 0) {
                            java.lang.Object initialValue694 = recovery$indy$flow$150();
                            java.lang.Object merged700;
                            if (initialValue29 != 0) {
                                merged700 = initialValue694;
                            } else {
                                java.lang.Object initialValue695 = recovery$indy$flow$151(initialValue694, 6399047095105801752L, constructorKey1);
                                java.lang.Object initialValue696 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue695)))).field_49w));
                                float initialValue697 = recovery$indy$flow$153(initialValue696);
                                int comparison698 = (java.lang.Float.isNaN(initialValue697) || java.lang.Float.isNaN(0.0F) ? 1 : (initialValue697 > 0.0F ? 1 : initialValue697 == 0.0F ? 0 : -1));
                                if (comparison698 >= 0) {
                                } else {
                                    recovery$indy$flow$154(this, true);
                                }
                                java.lang.Object initialValue699 = recovery$indy$flow$155();
                                merged700 = initialValue699;
                            }
                            merged710 = merged700;
                        } else {
                            recovery$indy$flow$149(this, false);
                            java.lang.Object merged709;
                            if (initialValue29 == 0) {
                                java.lang.Object initialValue701 = recovery$indy$flow$155();
                                merged709 = initialValue701;
                            } else {
                                java.lang.Object initialValue702 = recovery$indy$flow$150();
                                java.lang.Object merged708;
                                if (initialValue29 != 0) {
                                    merged708 = initialValue702;
                                } else {
                                    java.lang.Object initialValue703 = recovery$indy$flow$151(initialValue702, 6399047095105801752L, constructorKey1);
                                    java.lang.Object initialValue704 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue703)))).field_49w));
                                    float initialValue705 = recovery$indy$flow$153(initialValue704);
                                    int comparison706 = (java.lang.Float.isNaN(initialValue705) || java.lang.Float.isNaN(0.0F) ? 1 : (initialValue705 > 0.0F ? 1 : initialValue705 == 0.0F ? 0 : -1));
                                    if (comparison706 >= 0) {
                                    } else {
                                        recovery$indy$flow$154(this, true);
                                    }
                                    java.lang.Object initialValue707 = recovery$indy$flow$155();
                                    merged708 = initialValue707;
                                }
                                merged709 = merged708;
                            }
                            merged710 = merged709;
                        }
                        merged711 = merged710;
                    }
                    java.lang.Object initialValue712 = recovery$indy$flow$156(merged711, 6398778770469551566L, constructorKey1);
                    java.lang.Object initialValue713 = recovery$indy$flow$157();
                    java.lang.Object initialValue714 = recovery$indy$flow$158(initialValue713, 6399047095105801752L, constructorKey1);
                    double initialValue715 = recovery$indy$flow$159(initialValue714);
                    java.lang.Object initialValue716 = recovery$indy$flow$160();
                    java.lang.Object initialValue717 = recovery$indy$flow$161(initialValue716, 6399047095105801752L, constructorKey1);
                    double initialValue718 = recovery$indy$flow$162(initialValue717);
                    double computed719 = initialValue718 - Double.longBitsToDouble(4611686018427387904L);
                    java.lang.Object initialValue720 = recovery$indy$flow$163();
                    java.lang.Object initialValue721 = recovery$indy$flow$164(initialValue720, 6399047095105801752L, constructorKey1);
                    double initialValue722 = recovery$indy$flow$165(initialValue721);
                    java.lang.Object initialValue723 = recovery$indy$flow$166(initialValue712, initialValue715, computed719, initialValue722);
                    java.lang.Object initialValue724 = recovery$indy$flow$167(initialValue723);
                    java.lang.Object initialValue725 = initialValue724;
                    java.lang.Object initialValue726 = recovery$indy$flow$168();
                    java.lang.Object initialValue727 = recovery$indy$flow$169(initialValue726, 6399047095105801752L, constructorKey1);
                    boolean initialValue728 = recovery$indy$flow$170(initialValue727);
                    int comparison729 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                    boolean merged735;
                    if (comparison729 <= 0) {
                        merged735 = initialValue728;
                    } else {
                        boolean merged734;
                        if (initialValue29 != 0) {
                            merged734 = initialValue728;
                        } else {
                            if ((int) ((initialValue728 ? 1 : 0)) == 0) {
                            } else {
                                boolean initialValue730 = recovery$indy$flow$171(this);
                                int merged732;
                                if (initialValue29 != 0) {
                                    merged732 = (int) ((initialValue730 ? 1 : 0));
                                } else {
                                    int merged731;
                                    if ((int) ((initialValue730 ? 1 : 0)) != 0) {
                                        merged731 = 0;
                                    } else {
                                        merged731 = 1;
                                    }
                                    merged732 = merged731;
                                }
                                recovery$indy$flow$172(this, (merged732 != 0));
                            }
                            boolean initialValue733 = recovery$indy$flow$173(initialValue725);
                            merged734 = initialValue733;
                        }
                        merged735 = merged734;
                    }
                    int comparison736 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                    if (comparison736 <= 0) {
                        if (initialValue29 != 0) {
                            if ((int) ((merged735 ? 1 : 0)) == 0) {
                            } else {
                                boolean initialValue737 = recovery$indy$flow$179(this);
                                int merged739;
                                if (initialValue29 != 0) {
                                    merged739 = (int) ((initialValue737 ? 1 : 0));
                                } else {
                                    int merged738;
                                    if ((int) ((initialValue737 ? 1 : 0)) != 0) {
                                        merged738 = 0;
                                    } else {
                                        merged738 = 1;
                                    }
                                    merged739 = merged738;
                                }
                                recovery$indy$flow$180(this, (merged739 != 0));
                                java.lang.Object initialValue740 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                recovery$indy$flow$182(initialValue740, 6398202751750232087L, constructorKey1);
                            }
                        } else {
                            if ((int) ((merged735 ? 1 : 0)) != 0) {
                            } else {
                                if (initialValue29 != 0) {
                                } else {
                                    java.lang.Object initialValue741 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                    boolean initialValue742 = recovery$indy$flow$178(initialValue741, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                    if ((int) ((initialValue742 ? 1 : 0)) == 0) {
                                    } else {
                                        boolean initialValue743 = recovery$indy$flow$179(this);
                                        int merged745;
                                        if (initialValue29 != 0) {
                                            merged745 = (int) ((initialValue743 ? 1 : 0));
                                        } else {
                                            int merged744;
                                            if ((int) ((initialValue743 ? 1 : 0)) != 0) {
                                                merged744 = 0;
                                            } else {
                                                merged744 = 1;
                                            }
                                            merged745 = merged744;
                                        }
                                        recovery$indy$flow$180(this, (merged745 != 0));
                                        java.lang.Object initialValue746 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                        recovery$indy$flow$182(initialValue746, 6398202751750232087L, constructorKey1);
                                    }
                                }
                            }
                        }
                    } else {
                        if (initialValue29 != 0) {
                            if (initialValue29 != 0) {
                                if ((int) ((merged735 ? 1 : 0)) == 0) {
                                } else {
                                    boolean initialValue747 = recovery$indy$flow$179(this);
                                    int merged749;
                                    if (initialValue29 != 0) {
                                        merged749 = (int) ((initialValue747 ? 1 : 0));
                                    } else {
                                        int merged748;
                                        if ((int) ((initialValue747 ? 1 : 0)) != 0) {
                                            merged748 = 0;
                                        } else {
                                            merged748 = 1;
                                        }
                                        merged749 = merged748;
                                    }
                                    recovery$indy$flow$180(this, (merged749 != 0));
                                    java.lang.Object initialValue750 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                    recovery$indy$flow$182(initialValue750, 6398202751750232087L, constructorKey1);
                                }
                            } else {
                                if ((int) ((merged735 ? 1 : 0)) != 0) {
                                } else {
                                    if (initialValue29 != 0) {
                                    } else {
                                        java.lang.Object initialValue751 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                        boolean initialValue752 = recovery$indy$flow$178(initialValue751, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                        if ((int) ((initialValue752 ? 1 : 0)) == 0) {
                                        } else {
                                            boolean initialValue753 = recovery$indy$flow$179(this);
                                            int merged755;
                                            if (initialValue29 != 0) {
                                                merged755 = (int) ((initialValue753 ? 1 : 0));
                                            } else {
                                                int merged754;
                                                if ((int) ((initialValue753 ? 1 : 0)) != 0) {
                                                    merged754 = 0;
                                                } else {
                                                    merged754 = 1;
                                                }
                                                merged755 = merged754;
                                            }
                                            recovery$indy$flow$180(this, (merged755 != 0));
                                            java.lang.Object initialValue756 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                            recovery$indy$flow$182(initialValue756, 6398202751750232087L, constructorKey1);
                                        }
                                    }
                                }
                            }
                        } else {
                            if ((int) ((merged735 ? 1 : 0)) == 0) {
                            } else {
                                java.lang.Object initialValue757 = recovery$indy$flow$174();
                                java.lang.Object initialValue758 = recovery$indy$flow$175(initialValue757, 6399047095105801752L, constructorKey1);
                                boolean initialValue759 = recovery$indy$flow$176(initialValue758);
                                if (initialValue29 != 0) {
                                    if ((int) ((initialValue759 ? 1 : 0)) == 0) {
                                    } else {
                                        boolean initialValue760 = recovery$indy$flow$179(this);
                                        int merged762;
                                        if (initialValue29 != 0) {
                                            merged762 = (int) ((initialValue760 ? 1 : 0));
                                        } else {
                                            int merged761;
                                            if ((int) ((initialValue760 ? 1 : 0)) != 0) {
                                                merged761 = 0;
                                            } else {
                                                merged761 = 1;
                                            }
                                            merged762 = merged761;
                                        }
                                        recovery$indy$flow$180(this, (merged762 != 0));
                                        java.lang.Object initialValue763 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                        recovery$indy$flow$182(initialValue763, 6398202751750232087L, constructorKey1);
                                    }
                                } else {
                                    if ((int) ((initialValue759 ? 1 : 0)) != 0) {
                                    } else {
                                        if (initialValue29 != 0) {
                                        } else {
                                            java.lang.Object initialValue764 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                            boolean initialValue765 = recovery$indy$flow$178(initialValue764, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                            if ((int) ((initialValue765 ? 1 : 0)) == 0) {
                                            } else {
                                                boolean initialValue766 = recovery$indy$flow$179(this);
                                                int merged768;
                                                if (initialValue29 != 0) {
                                                    merged768 = (int) ((initialValue766 ? 1 : 0));
                                                } else {
                                                    int merged767;
                                                    if ((int) ((initialValue766 ? 1 : 0)) != 0) {
                                                        merged767 = 0;
                                                    } else {
                                                        merged767 = 1;
                                                    }
                                                    merged768 = merged767;
                                                }
                                                recovery$indy$flow$180(this, (merged768 != 0));
                                                java.lang.Object initialValue769 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                recovery$indy$flow$182(initialValue769, 6398202751750232087L, constructorKey1);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    java.lang.Object initialValue770 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingRadius));
                    double initialValue771 = recovery$indy$flow$184(initialValue770, initialValue13, 6399216400434126234L, constructorKey1);
                    double initialValue772 = initialValue771;
                    net.C_47gg initialized773 = new net.C_47gg(initialValue11);
                    net.C_47gg initialValue774 = initialized773;
                    java.lang.Object initialValue775 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                    java.lang.Object initialValue776 = recovery$indy$flow$188();
                    java.lang.Object initialValue777 = recovery$indy$flow$189(initialValue776, 6399047095105801752L, constructorKey1);
                    float initialValue778 = recovery$indy$flow$190(initialValue777);
                    java.lang.Object initialValue779 = recovery$indy$flow$191();
                    java.lang.Object initialValue780 = recovery$indy$flow$192(initialValue779, 6399047095105801752L, constructorKey1);
                    float initialValue781 = recovery$indy$flow$193(initialValue780);
                    java.lang.Object initialValue782 = recovery$indy$flow$194(initialValue774, initialValue21, initialValue775, initialValue778, initialValue781, false, 6399485110129484411L, constructorKey1);
                    float initialValue783 = recovery$indy$flow$195(initialValue782);
                    double converted784 = (double) (initialValue783);
                    double initialValue785 = converted784;
                    boolean initialValue786 = recovery$indy$flow$196(this);
                    int merged788;
                    if (initialValue29 != 0) {
                        merged788 = (int) ((initialValue786 ? 1 : 0));
                    } else {
                        int merged787;
                        if ((int) ((initialValue786 ? 1 : 0)) == 0) {
                            merged787 = 1;
                        } else {
                            merged787 = -1;
                        }
                        merged788 = merged787;
                    }
                    int computed789 = merged788 * 45;
                    double converted790 = (double) (computed789);
                    double computed791 = initialValue785 + converted790;
                    double initialValue792 = computed791;
                    double initialValue793 = recovery$indy$flow$197(initialValue792);
                    double initialValue794 = initialValue793;
                    java.lang.Object initialValue795 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                    double initialValue796 = recovery$indy$flow$199(initialValue795);
                    double initialValue797 = recovery$indy$flow$200(initialValue794);
                    double computed798 = initialValue797 * initialValue772;
                    double computed799 = initialValue796 + computed798;
                    double initialValue800 = computed799;
                    java.lang.Object initialValue801 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                    double initialValue802 = recovery$indy$flow$202(initialValue801);
                    double initialValue803 = recovery$indy$flow$203(initialValue794);
                    double computed804 = initialValue803 * initialValue772;
                    double computed805 = initialValue802 - computed804;
                    double initialValue806 = computed805;
                    java.lang.Object initialValue807 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                    double initialValue808 = recovery$indy$flow$205(initialValue807);
                    java.lang.Object initialValue809 = recovery$indy$flow$206();
                    java.lang.Object initialValue810 = recovery$indy$flow$207(initialValue809, 6399047095105801752L, constructorKey1);
                    float initialValue811 = recovery$indy$flow$208(initialValue810);
                    java.lang.Object initialValue812 = recovery$indy$flow$209();
                    java.lang.Object initialValue813 = recovery$indy$flow$210(initialValue812, 6399047095105801752L, constructorKey1);
                    float initialValue814 = recovery$indy$flow$211(initialValue813);
                    java.lang.Object initialValue815 = recovery$indy$flow$212(initialValue774, initialValue800, initialValue808, initialValue806, initialValue7, initialValue811, initialValue814, false, 6398680970342987849L, constructorKey1);
                    float initialValue816 = recovery$indy$flow$213(initialValue815);
                    recovery$indy$flow$214(this, initialValue816);
                    java.lang.Object initialValue817 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingAutoStrafe));
                    boolean initialValue818 = recovery$indy$flow$216(initialValue817, 6399079348953117994L, constructorKey1);
                    if ((int) ((initialValue818 ? 1 : 0)) == 0) {
                    } else {
                        recovery$indy$flow$217(initialValue9, 6398249691592924705L, constructorKey1);
                    }
                    return;
                } else {
                    if (initialValue29 != 0) {
                        int comparison819 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                        boolean merged826;
                        if (comparison819 <= 0) {
                            merged826 = initialValue673;
                        } else {
                            boolean merged825;
                            if (initialValue29 != 0) {
                                merged825 = initialValue673;
                            } else {
                                if ((int) ((initialValue673 ? 1 : 0)) != 0) {
                                } else {
                                    java.lang.Object initialValue820 = recovery$indy$flow$135();
                                    java.lang.Object initialValue821 = recovery$indy$flow$136(initialValue820, 6398975880469068964L, constructorKey1);
                                    int initialValue822 = recovery$indy$flow$137(initialValue821);
                                    recovery$indy$flow$138(this, initialValue822);
                                }
                                recovery$indy$flow$139(this, true);
                                java.lang.Object initialValue823 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingThirdPersonMode));
                                boolean initialValue824 = recovery$indy$flow$141(initialValue823, 6399079348953117994L, constructorKey1);
                                merged825 = initialValue824;
                            }
                            merged826 = merged825;
                        }
                        int comparison827 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                        int merged836;
                        if (comparison827 < 0) {
                            merged836 = (int) ((merged826 ? 1 : 0));
                        } else {
                            int merged835;
                            if (initialValue29 != 0) {
                                merged835 = (int) ((merged826 ? 1 : 0));
                            } else {
                                if ((int) ((merged826 ? 1 : 0)) == 0) {
                                } else {
                                    java.lang.Object initialValue828 = recovery$indy$flow$142();
                                    java.lang.Object initialValue829 = recovery$indy$flow$143(initialValue828, 6398975880469068964L, constructorKey1);
                                    recovery$indy$flow$144(initialValue829, 1);
                                }
                                java.lang.Object initialValue830 = recovery$indy$flow$145();
                                java.lang.Object initialValue831 = recovery$indy$flow$146(initialValue830, 6399047095105801752L, constructorKey1);
                                java.lang.Object initialValue832 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue831)))).field_49w));
                                float initialValue833 = recovery$indy$flow$148(initialValue832);
                                int comparison834 = (java.lang.Float.isNaN(initialValue833) || java.lang.Float.isNaN(0.0F) ? -1 : (initialValue833 > 0.0F ? 1 : initialValue833 == 0.0F ? 0 : -1));
                                merged835 = comparison834;
                            }
                            merged836 = merged835;
                        }
                        java.lang.Object merged855;
                        if (initialValue29 != 0) {
                            if (merged836 >= 0) {
                            } else {
                                recovery$indy$flow$154(this, true);
                            }
                            java.lang.Object initialValue837 = recovery$indy$flow$155();
                            merged855 = initialValue837;
                        } else {
                            java.lang.Object merged854;
                            if (merged836 <= 0) {
                                java.lang.Object initialValue838 = recovery$indy$flow$150();
                                java.lang.Object merged844;
                                if (initialValue29 != 0) {
                                    merged844 = initialValue838;
                                } else {
                                    java.lang.Object initialValue839 = recovery$indy$flow$151(initialValue838, 6399047095105801752L, constructorKey1);
                                    java.lang.Object initialValue840 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue839)))).field_49w));
                                    float initialValue841 = recovery$indy$flow$153(initialValue840);
                                    int comparison842 = (java.lang.Float.isNaN(initialValue841) || java.lang.Float.isNaN(0.0F) ? 1 : (initialValue841 > 0.0F ? 1 : initialValue841 == 0.0F ? 0 : -1));
                                    if (comparison842 >= 0) {
                                    } else {
                                        recovery$indy$flow$154(this, true);
                                    }
                                    java.lang.Object initialValue843 = recovery$indy$flow$155();
                                    merged844 = initialValue843;
                                }
                                merged854 = merged844;
                            } else {
                                recovery$indy$flow$149(this, false);
                                java.lang.Object merged853;
                                if (initialValue29 == 0) {
                                    java.lang.Object initialValue845 = recovery$indy$flow$155();
                                    merged853 = initialValue845;
                                } else {
                                    java.lang.Object initialValue846 = recovery$indy$flow$150();
                                    java.lang.Object merged852;
                                    if (initialValue29 != 0) {
                                        merged852 = initialValue846;
                                    } else {
                                        java.lang.Object initialValue847 = recovery$indy$flow$151(initialValue846, 6399047095105801752L, constructorKey1);
                                        java.lang.Object initialValue848 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue847)))).field_49w));
                                        float initialValue849 = recovery$indy$flow$153(initialValue848);
                                        int comparison850 = (java.lang.Float.isNaN(initialValue849) || java.lang.Float.isNaN(0.0F) ? 1 : (initialValue849 > 0.0F ? 1 : initialValue849 == 0.0F ? 0 : -1));
                                        if (comparison850 >= 0) {
                                        } else {
                                            recovery$indy$flow$154(this, true);
                                        }
                                        java.lang.Object initialValue851 = recovery$indy$flow$155();
                                        merged852 = initialValue851;
                                    }
                                    merged853 = merged852;
                                }
                                merged854 = merged853;
                            }
                            merged855 = merged854;
                        }
                        java.lang.Object initialValue856 = recovery$indy$flow$156(merged855, 6398778770469551566L, constructorKey1);
                        java.lang.Object initialValue857 = recovery$indy$flow$157();
                        java.lang.Object initialValue858 = recovery$indy$flow$158(initialValue857, 6399047095105801752L, constructorKey1);
                        double initialValue859 = recovery$indy$flow$159(initialValue858);
                        java.lang.Object initialValue860 = recovery$indy$flow$160();
                        java.lang.Object initialValue861 = recovery$indy$flow$161(initialValue860, 6399047095105801752L, constructorKey1);
                        double initialValue862 = recovery$indy$flow$162(initialValue861);
                        double computed863 = initialValue862 - Double.longBitsToDouble(4611686018427387904L);
                        java.lang.Object initialValue864 = recovery$indy$flow$163();
                        java.lang.Object initialValue865 = recovery$indy$flow$164(initialValue864, 6399047095105801752L, constructorKey1);
                        double initialValue866 = recovery$indy$flow$165(initialValue865);
                        java.lang.Object initialValue867 = recovery$indy$flow$166(initialValue856, initialValue859, computed863, initialValue866);
                        java.lang.Object initialValue868 = recovery$indy$flow$167(initialValue867);
                        java.lang.Object initialValue869 = initialValue868;
                        java.lang.Object initialValue870 = recovery$indy$flow$168();
                        java.lang.Object initialValue871 = recovery$indy$flow$169(initialValue870, 6399047095105801752L, constructorKey1);
                        boolean initialValue872 = recovery$indy$flow$170(initialValue871);
                        int comparison873 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                        boolean merged879;
                        if (comparison873 <= 0) {
                            merged879 = initialValue872;
                        } else {
                            boolean merged878;
                            if (initialValue29 != 0) {
                                merged878 = initialValue872;
                            } else {
                                if ((int) ((initialValue872 ? 1 : 0)) == 0) {
                                } else {
                                    boolean initialValue874 = recovery$indy$flow$171(this);
                                    int merged876;
                                    if (initialValue29 != 0) {
                                        merged876 = (int) ((initialValue874 ? 1 : 0));
                                    } else {
                                        int merged875;
                                        if ((int) ((initialValue874 ? 1 : 0)) != 0) {
                                            merged875 = 0;
                                        } else {
                                            merged875 = 1;
                                        }
                                        merged876 = merged875;
                                    }
                                    recovery$indy$flow$172(this, (merged876 != 0));
                                }
                                boolean initialValue877 = recovery$indy$flow$173(initialValue869);
                                merged878 = initialValue877;
                            }
                            merged879 = merged878;
                        }
                        int comparison880 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                        if (comparison880 <= 0) {
                            if (initialValue29 != 0) {
                                if ((int) ((merged879 ? 1 : 0)) == 0) {
                                } else {
                                    boolean initialValue881 = recovery$indy$flow$179(this);
                                    int merged883;
                                    if (initialValue29 != 0) {
                                        merged883 = (int) ((initialValue881 ? 1 : 0));
                                    } else {
                                        int merged882;
                                        if ((int) ((initialValue881 ? 1 : 0)) != 0) {
                                            merged882 = 0;
                                        } else {
                                            merged882 = 1;
                                        }
                                        merged883 = merged882;
                                    }
                                    recovery$indy$flow$180(this, (merged883 != 0));
                                    java.lang.Object initialValue884 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                    recovery$indy$flow$182(initialValue884, 6398202751750232087L, constructorKey1);
                                }
                            } else {
                                if ((int) ((merged879 ? 1 : 0)) != 0) {
                                } else {
                                    if (initialValue29 != 0) {
                                    } else {
                                        java.lang.Object initialValue885 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                        boolean initialValue886 = recovery$indy$flow$178(initialValue885, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                        if ((int) ((initialValue886 ? 1 : 0)) == 0) {
                                        } else {
                                            boolean initialValue887 = recovery$indy$flow$179(this);
                                            int merged889;
                                            if (initialValue29 != 0) {
                                                merged889 = (int) ((initialValue887 ? 1 : 0));
                                            } else {
                                                int merged888;
                                                if ((int) ((initialValue887 ? 1 : 0)) != 0) {
                                                    merged888 = 0;
                                                } else {
                                                    merged888 = 1;
                                                }
                                                merged889 = merged888;
                                            }
                                            recovery$indy$flow$180(this, (merged889 != 0));
                                            java.lang.Object initialValue890 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                            recovery$indy$flow$182(initialValue890, 6398202751750232087L, constructorKey1);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (initialValue29 != 0) {
                                if (initialValue29 != 0) {
                                    if ((int) ((merged879 ? 1 : 0)) == 0) {
                                    } else {
                                        boolean initialValue891 = recovery$indy$flow$179(this);
                                        int merged893;
                                        if (initialValue29 != 0) {
                                            merged893 = (int) ((initialValue891 ? 1 : 0));
                                        } else {
                                            int merged892;
                                            if ((int) ((initialValue891 ? 1 : 0)) != 0) {
                                                merged892 = 0;
                                            } else {
                                                merged892 = 1;
                                            }
                                            merged893 = merged892;
                                        }
                                        recovery$indy$flow$180(this, (merged893 != 0));
                                        java.lang.Object initialValue894 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                        recovery$indy$flow$182(initialValue894, 6398202751750232087L, constructorKey1);
                                    }
                                } else {
                                    if ((int) ((merged879 ? 1 : 0)) != 0) {
                                    } else {
                                        if (initialValue29 != 0) {
                                        } else {
                                            java.lang.Object initialValue895 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                            boolean initialValue896 = recovery$indy$flow$178(initialValue895, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                            if ((int) ((initialValue896 ? 1 : 0)) == 0) {
                                            } else {
                                                boolean initialValue897 = recovery$indy$flow$179(this);
                                                int merged899;
                                                if (initialValue29 != 0) {
                                                    merged899 = (int) ((initialValue897 ? 1 : 0));
                                                } else {
                                                    int merged898;
                                                    if ((int) ((initialValue897 ? 1 : 0)) != 0) {
                                                        merged898 = 0;
                                                    } else {
                                                        merged898 = 1;
                                                    }
                                                    merged899 = merged898;
                                                }
                                                recovery$indy$flow$180(this, (merged899 != 0));
                                                java.lang.Object initialValue900 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                recovery$indy$flow$182(initialValue900, 6398202751750232087L, constructorKey1);
                                            }
                                        }
                                    }
                                }
                            } else {
                                if ((int) ((merged879 ? 1 : 0)) == 0) {
                                } else {
                                    java.lang.Object initialValue901 = recovery$indy$flow$174();
                                    java.lang.Object initialValue902 = recovery$indy$flow$175(initialValue901, 6399047095105801752L, constructorKey1);
                                    boolean initialValue903 = recovery$indy$flow$176(initialValue902);
                                    if (initialValue29 != 0) {
                                        if ((int) ((initialValue903 ? 1 : 0)) == 0) {
                                        } else {
                                            boolean initialValue904 = recovery$indy$flow$179(this);
                                            int merged906;
                                            if (initialValue29 != 0) {
                                                merged906 = (int) ((initialValue904 ? 1 : 0));
                                            } else {
                                                int merged905;
                                                if ((int) ((initialValue904 ? 1 : 0)) != 0) {
                                                    merged905 = 0;
                                                } else {
                                                    merged905 = 1;
                                                }
                                                merged906 = merged905;
                                            }
                                            recovery$indy$flow$180(this, (merged906 != 0));
                                            java.lang.Object initialValue907 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                            recovery$indy$flow$182(initialValue907, 6398202751750232087L, constructorKey1);
                                        }
                                    } else {
                                        if ((int) ((initialValue903 ? 1 : 0)) != 0) {
                                        } else {
                                            if (initialValue29 != 0) {
                                            } else {
                                                java.lang.Object initialValue908 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                boolean initialValue909 = recovery$indy$flow$178(initialValue908, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                                if ((int) ((initialValue909 ? 1 : 0)) == 0) {
                                                } else {
                                                    boolean initialValue910 = recovery$indy$flow$179(this);
                                                    int merged912;
                                                    if (initialValue29 != 0) {
                                                        merged912 = (int) ((initialValue910 ? 1 : 0));
                                                    } else {
                                                        int merged911;
                                                        if ((int) ((initialValue910 ? 1 : 0)) != 0) {
                                                            merged911 = 0;
                                                        } else {
                                                            merged911 = 1;
                                                        }
                                                        merged912 = merged911;
                                                    }
                                                    recovery$indy$flow$180(this, (merged912 != 0));
                                                    java.lang.Object initialValue913 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                    recovery$indy$flow$182(initialValue913, 6398202751750232087L, constructorKey1);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        java.lang.Object initialValue914 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingRadius));
                        double initialValue915 = recovery$indy$flow$184(initialValue914, initialValue13, 6399216400434126234L, constructorKey1);
                        double initialValue916 = initialValue915;
                        net.C_47gg initialized917 = new net.C_47gg(initialValue11);
                        net.C_47gg initialValue918 = initialized917;
                        java.lang.Object initialValue919 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                        java.lang.Object initialValue920 = recovery$indy$flow$188();
                        java.lang.Object initialValue921 = recovery$indy$flow$189(initialValue920, 6399047095105801752L, constructorKey1);
                        float initialValue922 = recovery$indy$flow$190(initialValue921);
                        java.lang.Object initialValue923 = recovery$indy$flow$191();
                        java.lang.Object initialValue924 = recovery$indy$flow$192(initialValue923, 6399047095105801752L, constructorKey1);
                        float initialValue925 = recovery$indy$flow$193(initialValue924);
                        java.lang.Object initialValue926 = recovery$indy$flow$194(initialValue918, initialValue21, initialValue919, initialValue922, initialValue925, false, 6399485110129484411L, constructorKey1);
                        float initialValue927 = recovery$indy$flow$195(initialValue926);
                        double converted928 = (double) (initialValue927);
                        double initialValue929 = converted928;
                        boolean initialValue930 = recovery$indy$flow$196(this);
                        int merged932;
                        if (initialValue29 != 0) {
                            merged932 = (int) ((initialValue930 ? 1 : 0));
                        } else {
                            int merged931;
                            if ((int) ((initialValue930 ? 1 : 0)) == 0) {
                                merged931 = 1;
                            } else {
                                merged931 = -1;
                            }
                            merged932 = merged931;
                        }
                        int computed933 = merged932 * 45;
                        double converted934 = (double) (computed933);
                        double computed935 = initialValue929 + converted934;
                        double initialValue936 = computed935;
                        double initialValue937 = recovery$indy$flow$197(initialValue936);
                        double initialValue938 = initialValue937;
                        java.lang.Object initialValue939 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                        double initialValue940 = recovery$indy$flow$199(initialValue939);
                        double initialValue941 = recovery$indy$flow$200(initialValue938);
                        double computed942 = initialValue941 * initialValue916;
                        double computed943 = initialValue940 + computed942;
                        double initialValue944 = computed943;
                        java.lang.Object initialValue945 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                        double initialValue946 = recovery$indy$flow$202(initialValue945);
                        double initialValue947 = recovery$indy$flow$203(initialValue938);
                        double computed948 = initialValue947 * initialValue916;
                        double computed949 = initialValue946 - computed948;
                        double initialValue950 = computed949;
                        java.lang.Object initialValue951 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                        double initialValue952 = recovery$indy$flow$205(initialValue951);
                        java.lang.Object initialValue953 = recovery$indy$flow$206();
                        java.lang.Object initialValue954 = recovery$indy$flow$207(initialValue953, 6399047095105801752L, constructorKey1);
                        float initialValue955 = recovery$indy$flow$208(initialValue954);
                        java.lang.Object initialValue956 = recovery$indy$flow$209();
                        java.lang.Object initialValue957 = recovery$indy$flow$210(initialValue956, 6399047095105801752L, constructorKey1);
                        float initialValue958 = recovery$indy$flow$211(initialValue957);
                        java.lang.Object initialValue959 = recovery$indy$flow$212(initialValue918, initialValue944, initialValue952, initialValue950, initialValue7, initialValue955, initialValue958, false, 6398680970342987849L, constructorKey1);
                        float initialValue960 = recovery$indy$flow$213(initialValue959);
                        recovery$indy$flow$214(this, initialValue960);
                        java.lang.Object initialValue961 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingAutoStrafe));
                        boolean initialValue962 = recovery$indy$flow$216(initialValue961, 6399079348953117994L, constructorKey1);
                        if ((int) ((initialValue962 ? 1 : 0)) == 0) {
                        } else {
                            recovery$indy$flow$217(initialValue9, 6398249691592924705L, constructorKey1);
                        }
                        return;
                    } else {
                        if ((int) ((initialValue673 ? 1 : 0)) != 0) {
                            recovery$indy$flow$218(this, initialValue19, 6397976781560315515L, constructorKey1);
                        } else {
                            boolean initialValue963 = recovery$indy$flow$134(this);
                            int comparison964 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                            boolean merged971;
                            if (comparison964 <= 0) {
                                merged971 = initialValue963;
                            } else {
                                boolean merged970;
                                if (initialValue29 != 0) {
                                    merged970 = initialValue963;
                                } else {
                                    if ((int) ((initialValue963 ? 1 : 0)) != 0) {
                                    } else {
                                        java.lang.Object initialValue965 = recovery$indy$flow$135();
                                        java.lang.Object initialValue966 = recovery$indy$flow$136(initialValue965, 6398975880469068964L, constructorKey1);
                                        int initialValue967 = recovery$indy$flow$137(initialValue966);
                                        recovery$indy$flow$138(this, initialValue967);
                                    }
                                    recovery$indy$flow$139(this, true);
                                    java.lang.Object initialValue968 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingThirdPersonMode));
                                    boolean initialValue969 = recovery$indy$flow$141(initialValue968, 6399079348953117994L, constructorKey1);
                                    merged970 = initialValue969;
                                }
                                merged971 = merged970;
                            }
                            int comparison972 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                            int merged981;
                            if (comparison972 < 0) {
                                merged981 = (int) ((merged971 ? 1 : 0));
                            } else {
                                int merged980;
                                if (initialValue29 != 0) {
                                    merged980 = (int) ((merged971 ? 1 : 0));
                                } else {
                                    if ((int) ((merged971 ? 1 : 0)) == 0) {
                                    } else {
                                        java.lang.Object initialValue973 = recovery$indy$flow$142();
                                        java.lang.Object initialValue974 = recovery$indy$flow$143(initialValue973, 6398975880469068964L, constructorKey1);
                                        recovery$indy$flow$144(initialValue974, 1);
                                    }
                                    java.lang.Object initialValue975 = recovery$indy$flow$145();
                                    java.lang.Object initialValue976 = recovery$indy$flow$146(initialValue975, 6399047095105801752L, constructorKey1);
                                    java.lang.Object initialValue977 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue976)))).field_49w));
                                    float initialValue978 = recovery$indy$flow$148(initialValue977);
                                    int comparison979 = (java.lang.Float.isNaN(initialValue978) || java.lang.Float.isNaN(0.0F) ? -1 : (initialValue978 > 0.0F ? 1 : initialValue978 == 0.0F ? 0 : -1));
                                    merged980 = comparison979;
                                }
                                merged981 = merged980;
                            }
                            java.lang.Object merged1000;
                            if (initialValue29 != 0) {
                                if (merged981 >= 0) {
                                } else {
                                    recovery$indy$flow$154(this, true);
                                }
                                java.lang.Object initialValue982 = recovery$indy$flow$155();
                                merged1000 = initialValue982;
                            } else {
                                java.lang.Object merged999;
                                if (merged981 <= 0) {
                                    java.lang.Object initialValue983 = recovery$indy$flow$150();
                                    java.lang.Object merged989;
                                    if (initialValue29 != 0) {
                                        merged989 = initialValue983;
                                    } else {
                                        java.lang.Object initialValue984 = recovery$indy$flow$151(initialValue983, 6399047095105801752L, constructorKey1);
                                        java.lang.Object initialValue985 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue984)))).field_49w));
                                        float initialValue986 = recovery$indy$flow$153(initialValue985);
                                        int comparison987 = (java.lang.Float.isNaN(initialValue986) || java.lang.Float.isNaN(0.0F) ? 1 : (initialValue986 > 0.0F ? 1 : initialValue986 == 0.0F ? 0 : -1));
                                        if (comparison987 >= 0) {
                                        } else {
                                            recovery$indy$flow$154(this, true);
                                        }
                                        java.lang.Object initialValue988 = recovery$indy$flow$155();
                                        merged989 = initialValue988;
                                    }
                                    merged999 = merged989;
                                } else {
                                    recovery$indy$flow$149(this, false);
                                    java.lang.Object merged998;
                                    if (initialValue29 == 0) {
                                        java.lang.Object initialValue990 = recovery$indy$flow$155();
                                        merged998 = initialValue990;
                                    } else {
                                        java.lang.Object initialValue991 = recovery$indy$flow$150();
                                        java.lang.Object merged997;
                                        if (initialValue29 != 0) {
                                            merged997 = initialValue991;
                                        } else {
                                            java.lang.Object initialValue992 = recovery$indy$flow$151(initialValue991, 6399047095105801752L, constructorKey1);
                                            java.lang.Object initialValue993 = ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(initialValue992)))).field_49w));
                                            float initialValue994 = recovery$indy$flow$153(initialValue993);
                                            int comparison995 = (java.lang.Float.isNaN(initialValue994) || java.lang.Float.isNaN(0.0F) ? 1 : (initialValue994 > 0.0F ? 1 : initialValue994 == 0.0F ? 0 : -1));
                                            if (comparison995 >= 0) {
                                            } else {
                                                recovery$indy$flow$154(this, true);
                                            }
                                            java.lang.Object initialValue996 = recovery$indy$flow$155();
                                            merged997 = initialValue996;
                                        }
                                        merged998 = merged997;
                                    }
                                    merged999 = merged998;
                                }
                                merged1000 = merged999;
                            }
                            java.lang.Object initialValue1001 = recovery$indy$flow$156(merged1000, 6398778770469551566L, constructorKey1);
                            java.lang.Object initialValue1002 = recovery$indy$flow$157();
                            java.lang.Object initialValue1003 = recovery$indy$flow$158(initialValue1002, 6399047095105801752L, constructorKey1);
                            double initialValue1004 = recovery$indy$flow$159(initialValue1003);
                            java.lang.Object initialValue1005 = recovery$indy$flow$160();
                            java.lang.Object initialValue1006 = recovery$indy$flow$161(initialValue1005, 6399047095105801752L, constructorKey1);
                            double initialValue1007 = recovery$indy$flow$162(initialValue1006);
                            double computed1008 = initialValue1007 - Double.longBitsToDouble(4611686018427387904L);
                            java.lang.Object initialValue1009 = recovery$indy$flow$163();
                            java.lang.Object initialValue1010 = recovery$indy$flow$164(initialValue1009, 6399047095105801752L, constructorKey1);
                            double initialValue1011 = recovery$indy$flow$165(initialValue1010);
                            java.lang.Object initialValue1012 = recovery$indy$flow$166(initialValue1001, initialValue1004, computed1008, initialValue1011);
                            java.lang.Object initialValue1013 = recovery$indy$flow$167(initialValue1012);
                            java.lang.Object initialValue1014 = initialValue1013;
                            java.lang.Object initialValue1015 = recovery$indy$flow$168();
                            java.lang.Object initialValue1016 = recovery$indy$flow$169(initialValue1015, 6399047095105801752L, constructorKey1);
                            boolean initialValue1017 = recovery$indy$flow$170(initialValue1016);
                            int comparison1018 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                            boolean merged1024;
                            if (comparison1018 <= 0) {
                                merged1024 = initialValue1017;
                            } else {
                                boolean merged1023;
                                if (initialValue29 != 0) {
                                    merged1023 = initialValue1017;
                                } else {
                                    if ((int) ((initialValue1017 ? 1 : 0)) == 0) {
                                    } else {
                                        boolean initialValue1019 = recovery$indy$flow$171(this);
                                        int merged1021;
                                        if (initialValue29 != 0) {
                                            merged1021 = (int) ((initialValue1019 ? 1 : 0));
                                        } else {
                                            int merged1020;
                                            if ((int) ((initialValue1019 ? 1 : 0)) != 0) {
                                                merged1020 = 0;
                                            } else {
                                                merged1020 = 1;
                                            }
                                            merged1021 = merged1020;
                                        }
                                        recovery$indy$flow$172(this, (merged1021 != 0));
                                    }
                                    boolean initialValue1022 = recovery$indy$flow$173(initialValue1014);
                                    merged1023 = initialValue1022;
                                }
                                merged1024 = merged1023;
                            }
                            int comparison1025 = (constructorKey1 > 0L ? 1 : constructorKey1 == 0L ? 0 : -1);
                            if (comparison1025 <= 0) {
                                if (initialValue29 != 0) {
                                    if ((int) ((merged1024 ? 1 : 0)) == 0) {
                                    } else {
                                        boolean initialValue1026 = recovery$indy$flow$179(this);
                                        int merged1028;
                                        if (initialValue29 != 0) {
                                            merged1028 = (int) ((initialValue1026 ? 1 : 0));
                                        } else {
                                            int merged1027;
                                            if ((int) ((initialValue1026 ? 1 : 0)) != 0) {
                                                merged1027 = 0;
                                            } else {
                                                merged1027 = 1;
                                            }
                                            merged1028 = merged1027;
                                        }
                                        recovery$indy$flow$180(this, (merged1028 != 0));
                                        java.lang.Object initialValue1029 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                        recovery$indy$flow$182(initialValue1029, 6398202751750232087L, constructorKey1);
                                    }
                                } else {
                                    if ((int) ((merged1024 ? 1 : 0)) != 0) {
                                    } else {
                                        if (initialValue29 != 0) {
                                        } else {
                                            java.lang.Object initialValue1030 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                            boolean initialValue1031 = recovery$indy$flow$178(initialValue1030, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                            if ((int) ((initialValue1031 ? 1 : 0)) == 0) {
                                            } else {
                                                boolean initialValue1032 = recovery$indy$flow$179(this);
                                                int merged1034;
                                                if (initialValue29 != 0) {
                                                    merged1034 = (int) ((initialValue1032 ? 1 : 0));
                                                } else {
                                                    int merged1033;
                                                    if ((int) ((initialValue1032 ? 1 : 0)) != 0) {
                                                        merged1033 = 0;
                                                    } else {
                                                        merged1033 = 1;
                                                    }
                                                    merged1034 = merged1033;
                                                }
                                                recovery$indy$flow$180(this, (merged1034 != 0));
                                                java.lang.Object initialValue1035 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                recovery$indy$flow$182(initialValue1035, 6398202751750232087L, constructorKey1);
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (initialValue29 != 0) {
                                    if (initialValue29 != 0) {
                                        if ((int) ((merged1024 ? 1 : 0)) == 0) {
                                        } else {
                                            boolean initialValue1036 = recovery$indy$flow$179(this);
                                            int merged1038;
                                            if (initialValue29 != 0) {
                                                merged1038 = (int) ((initialValue1036 ? 1 : 0));
                                            } else {
                                                int merged1037;
                                                if ((int) ((initialValue1036 ? 1 : 0)) != 0) {
                                                    merged1037 = 0;
                                                } else {
                                                    merged1037 = 1;
                                                }
                                                merged1038 = merged1037;
                                            }
                                            recovery$indy$flow$180(this, (merged1038 != 0));
                                            java.lang.Object initialValue1039 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                            recovery$indy$flow$182(initialValue1039, 6398202751750232087L, constructorKey1);
                                        }
                                    } else {
                                        if ((int) ((merged1024 ? 1 : 0)) != 0) {
                                        } else {
                                            if (initialValue29 != 0) {
                                            } else {
                                                java.lang.Object initialValue1040 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                boolean initialValue1041 = recovery$indy$flow$178(initialValue1040, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                                if ((int) ((initialValue1041 ? 1 : 0)) == 0) {
                                                } else {
                                                    boolean initialValue1042 = recovery$indy$flow$179(this);
                                                    int merged1044;
                                                    if (initialValue29 != 0) {
                                                        merged1044 = (int) ((initialValue1042 ? 1 : 0));
                                                    } else {
                                                        int merged1043;
                                                        if ((int) ((initialValue1042 ? 1 : 0)) != 0) {
                                                            merged1043 = 0;
                                                        } else {
                                                            merged1043 = 1;
                                                        }
                                                        merged1044 = merged1043;
                                                    }
                                                    recovery$indy$flow$180(this, (merged1044 != 0));
                                                    java.lang.Object initialValue1045 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                    recovery$indy$flow$182(initialValue1045, 6398202751750232087L, constructorKey1);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if ((int) ((merged1024 ? 1 : 0)) == 0) {
                                    } else {
                                        java.lang.Object initialValue1046 = recovery$indy$flow$174();
                                        java.lang.Object initialValue1047 = recovery$indy$flow$175(initialValue1046, 6399047095105801752L, constructorKey1);
                                        boolean initialValue1048 = recovery$indy$flow$176(initialValue1047);
                                        if (initialValue29 != 0) {
                                            if ((int) ((initialValue1048 ? 1 : 0)) == 0) {
                                            } else {
                                                boolean initialValue1049 = recovery$indy$flow$179(this);
                                                int merged1051;
                                                if (initialValue29 != 0) {
                                                    merged1051 = (int) ((initialValue1049 ? 1 : 0));
                                                } else {
                                                    int merged1050;
                                                    if ((int) ((initialValue1049 ? 1 : 0)) != 0) {
                                                        merged1050 = 0;
                                                    } else {
                                                        merged1050 = 1;
                                                    }
                                                    merged1051 = merged1050;
                                                }
                                                recovery$indy$flow$180(this, (merged1051 != 0));
                                                java.lang.Object initialValue1052 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                recovery$indy$flow$182(initialValue1052, 6398202751750232087L, constructorKey1);
                                            }
                                        } else {
                                            if ((int) ((initialValue1048 ? 1 : 0)) != 0) {
                                            } else {
                                                if (initialValue29 != 0) {
                                                } else {
                                                    java.lang.Object initialValue1053 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                    boolean initialValue1054 = recovery$indy$flow$178(initialValue1053, 300L, initialValue17, 6398410351422518722L, constructorKey1);
                                                    if ((int) ((initialValue1054 ? 1 : 0)) == 0) {
                                                    } else {
                                                        boolean initialValue1055 = recovery$indy$flow$179(this);
                                                        int merged1057;
                                                        if (initialValue29 != 0) {
                                                            merged1057 = (int) ((initialValue1055 ? 1 : 0));
                                                        } else {
                                                            int merged1056;
                                                            if ((int) ((initialValue1055 ? 1 : 0)) != 0) {
                                                                merged1056 = 0;
                                                            } else {
                                                                merged1056 = 1;
                                                            }
                                                            merged1057 = merged1056;
                                                        }
                                                        recovery$indy$flow$180(this, (merged1057 != 0));
                                                        java.lang.Object initialValue1058 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_42));
                                                        recovery$indy$flow$182(initialValue1058, 6398202751750232087L, constructorKey1);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            java.lang.Object initialValue1059 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingRadius));
                            double initialValue1060 = recovery$indy$flow$184(initialValue1059, initialValue13, 6399216400434126234L, constructorKey1);
                            double initialValue1061 = initialValue1060;
                            net.C_47gg initialized1062 = new net.C_47gg(initialValue11);
                            net.C_47gg initialValue1063 = initialized1062;
                            java.lang.Object initialValue1064 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                            java.lang.Object initialValue1065 = recovery$indy$flow$188();
                            java.lang.Object initialValue1066 = recovery$indy$flow$189(initialValue1065, 6399047095105801752L, constructorKey1);
                            float initialValue1067 = recovery$indy$flow$190(initialValue1066);
                            java.lang.Object initialValue1068 = recovery$indy$flow$191();
                            java.lang.Object initialValue1069 = recovery$indy$flow$192(initialValue1068, 6399047095105801752L, constructorKey1);
                            float initialValue1070 = recovery$indy$flow$193(initialValue1069);
                            java.lang.Object initialValue1071 = recovery$indy$flow$194(initialValue1063, initialValue21, initialValue1064, initialValue1067, initialValue1070, false, 6399485110129484411L, constructorKey1);
                            float initialValue1072 = recovery$indy$flow$195(initialValue1071);
                            double converted1073 = (double) (initialValue1072);
                            double initialValue1074 = converted1073;
                            boolean initialValue1075 = recovery$indy$flow$196(this);
                            int merged1077;
                            if (initialValue29 != 0) {
                                merged1077 = (int) ((initialValue1075 ? 1 : 0));
                            } else {
                                int merged1076;
                                if ((int) ((initialValue1075 ? 1 : 0)) == 0) {
                                    merged1076 = 1;
                                } else {
                                    merged1076 = -1;
                                }
                                merged1077 = merged1076;
                            }
                            int computed1078 = merged1077 * 45;
                            double converted1079 = (double) (computed1078);
                            double computed1080 = initialValue1074 + converted1079;
                            double initialValue1081 = computed1080;
                            double initialValue1082 = recovery$indy$flow$197(initialValue1081);
                            double initialValue1083 = initialValue1082;
                            java.lang.Object initialValue1084 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                            double initialValue1085 = recovery$indy$flow$199(initialValue1084);
                            double initialValue1086 = recovery$indy$flow$200(initialValue1083);
                            double computed1087 = initialValue1086 * initialValue1061;
                            double computed1088 = initialValue1085 + computed1087;
                            double initialValue1089 = computed1088;
                            java.lang.Object initialValue1090 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                            double initialValue1091 = recovery$indy$flow$202(initialValue1090);
                            double initialValue1092 = recovery$indy$flow$203(initialValue1083);
                            double computed1093 = initialValue1092 * initialValue1061;
                            double computed1094 = initialValue1091 - computed1093;
                            double initialValue1095 = computed1094;
                            java.lang.Object initialValue1096 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).field_48));
                            double initialValue1097 = recovery$indy$flow$205(initialValue1096);
                            java.lang.Object initialValue1098 = recovery$indy$flow$206();
                            java.lang.Object initialValue1099 = recovery$indy$flow$207(initialValue1098, 6399047095105801752L, constructorKey1);
                            float initialValue1100 = recovery$indy$flow$208(initialValue1099);
                            java.lang.Object initialValue1101 = recovery$indy$flow$209();
                            java.lang.Object initialValue1102 = recovery$indy$flow$210(initialValue1101, 6399047095105801752L, constructorKey1);
                            float initialValue1103 = recovery$indy$flow$211(initialValue1102);
                            java.lang.Object initialValue1104 = recovery$indy$flow$212(initialValue1063, initialValue1089, initialValue1097, initialValue1095, initialValue7, initialValue1100, initialValue1103, false, 6398680970342987849L, constructorKey1);
                            float initialValue1105 = recovery$indy$flow$213(initialValue1104);
                            recovery$indy$flow$214(this, initialValue1105);
                            java.lang.Object initialValue1106 = ((java.lang.Object)(((augustus.recovered.modules.movement.TargetStrafe_47QD) (((java.lang.Object)(this)))).settingAutoStrafe));
                            boolean initialValue1107 = recovery$indy$flow$216(initialValue1106, 6399079348953117994L, constructorKey1);
                            if ((int) ((initialValue1107 ? 1 : 0)) == 0) {
                            } else {
                                recovery$indy$flow$217(initialValue9, 6398249691592924705L, constructorKey1);
                            }
                            return;
                        }
                    }
                }
            }
        }
        java.lang.Object initialValue1108 = recovery$indy$flow$219(6398068766391291539L, constructorKey1);
        java.lang.Object initialValue1109 = recovery$indy$flow$220(initialValue1108, 6398731111113049788L, constructorKey1);
        float initialValue1110 = recovery$indy$flow$221(initialValue1109);
        recovery$indy$flow$222(this, initialValue1110);
        return;
    }








   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$56(this, 28, var3, -7100960259347778981L, var1);
      recovery$indy$57(this, 21, var3, -7100960259347778981L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      this.field_44 = null;
      this.field_48 = null;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public TargetStrafe_47QD(long a0) {
        super((java.lang.String) ("TargetStrafe"),(java.lang.String) ("Zielbeschuss"),(long) (((augustus.recovered.modules.movement.TargetStrafe_47QD.a ^ a0) ^ 112086911597519L)),(java.awt.Color) (new java.awt.Color((int) (52),(int) (0),(int) (194))),(client.module.Category) (client.module.Category.MOVEMENT));
        long constructorKey1 = ((augustus.recovered.modules.movement.TargetStrafe_47QD.a ^ a0) ^ 50875328645890L);
        long constructorKey2 = ((augustus.recovered.modules.movement.TargetStrafe_47QD.a ^ a0) ^ 22908402034644L);
        long constructorKey3 = ((augustus.recovered.modules.movement.TargetStrafe_47QD.a ^ a0) ^ 63281854568531L);
        java.lang.Object initialValue4 = recovery$indy$flow$228(4);
        ((java.lang.Object[]) initialValue4)[0] = "Everytime";
        ((java.lang.Object[]) initialValue4)[1] = "OnlyWhileFlyEnabled";
        ((java.lang.Object[]) initialValue4)[2] = "OnlyWhileSpeedEnabled";
        ((java.lang.Object[]) initialValue4)[3] = "OnlyWhileSpeedOrFlyEnabled";
        client.setting.ModeSetting initialized5 = new client.setting.ModeSetting(this, "ConditionsToTargetStrafe", constructorKey1, "Everytime", (java.lang.String[]) (initialValue4));
        recovery$indy$flow$230(this, initialized5);
        client.setting.NumberSetting initialized6 = new client.setting.NumberSetting(this, "Radius", Double.longBitsToDouble(4612811918334230528L), constructorKey3, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4618441417868443648L), 1);
        recovery$indy$flow$233(this, initialized6);
        client.setting.BooleanSetting initialized7 = new client.setting.BooleanSetting(this, constructorKey2, "KillAuraTarget", true);
        recovery$indy$flow$236(this, initialized7);
        client.setting.BooleanSetting initialized8 = new client.setting.BooleanSetting(this, constructorKey2, "AutoStrafe", true);
        recovery$indy$flow$239(this, initialized8);
        client.setting.BooleanSetting initialized9 = new client.setting.BooleanSetting(this, constructorKey2, "OnlyWhileSpace", true);
        recovery$indy$flow$242(this, initialized9);
        client.setting.BooleanSetting initialized10 = new client.setting.BooleanSetting(this, constructorKey2, "ThirdPersonMode", false);
        recovery$indy$flow$245(this, initialized10);
        net.C_47cu initialized11 = new net.C_47cu();
        recovery$indy$flow$248(this, initialized11);
        recovery$indy$flow$249(this, null);
        recovery$indy$flow$250(this, false);
        recovery$indy$flow$251(this, 0);
    }




    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static void recovery$indy$flow$71(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_48 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static native boolean recovery$indy$flow$72(long a0,long a1);

    private static native java.lang.Object recovery$indy$flow$74(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$75(int a0,long a1);
    private static boolean recovery$indy$flow$76(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }

    private static native java.lang.Object recovery$indy$flow$78(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$79(int a0,long a1);
    private static boolean recovery$indy$flow$80(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static java.lang.Object recovery$indy$flow$81() {
        return client.ClientGlobals.field_48;
    }

    private static native boolean recovery$indy$flow$83(java.lang.Object a0,long a1,long a2,long a3);

    private static native java.lang.Object recovery$indy$flow$85(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$86(int a0,long a1);
    private static boolean recovery$indy$flow$87(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static java.lang.Object recovery$indy$flow$88() {
        return client.ClientGlobals.field_48;
    }

    private static native boolean recovery$indy$flow$90(java.lang.Object a0,long a1,long a2,long a3);

    private static native java.lang.Object recovery$indy$flow$92(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$93(int a0,long a1);
    private static boolean recovery$indy$flow$94(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static java.lang.Object recovery$indy$flow$95() {
        return client.ClientGlobals.field_48;
    }

    private static native boolean recovery$indy$flow$97(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$98() {
        return client.ClientGlobals.field_48;
    }

    private static native boolean recovery$indy$flow$100(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$101() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$102(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$104(java.lang.Object a0);

    private static native boolean recovery$indy$flow$106(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$107() {
        return client.ClientGlobals.field_48;
    }

    private static native boolean recovery$indy$flow$109(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$110(java.lang.Object a0,long a1,long a2,long a3);

    private static native boolean recovery$indy$flow$112(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$113(long a0,long a1,long a2);
    private static void recovery$indy$flow$114(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_48 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static java.lang.Object recovery$indy$flow$115() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$116(java.lang.Object a0,long a1,long a2);

    private static java.lang.Object recovery$indy$flow$118(java.lang.Object a0) {
        return ((java.util.List) (a0)).stream();
    }
    private static native java.lang.Object recovery$indy$flow$119(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$120(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.stream.Stream) (a0)).filter(((java.util.function.Predicate) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$121();
    private static java.lang.Object recovery$indy$flow$122(java.lang.Object a0) {
        return java.util.Comparator.comparingDouble(((java.util.function.ToDoubleFunction) (a0)));
    }
    private static java.lang.Object recovery$indy$flow$123(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.stream.Stream) (a0)).sorted(((java.util.Comparator) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$124(java.lang.Object a0) {
        return ((java.util.stream.Stream) (a0)).toArray();
    }
    private static void recovery$indy$flow$125(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_44 = ((java.lang.Object[]) (a1));
        return;
    }



    private static void recovery$indy$flow$129(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_48 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }

    private static java.lang.Object recovery$indy$flow$131() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$132(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$133(java.lang.Object a0);
    private static boolean recovery$indy$flow$134(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_43a;
    }
    private static java.lang.Object recovery$indy$flow$135() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$136(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$137(java.lang.Object a0) {
        return ((net.C_47oo) (a0)).field_44S;
    }
    private static void recovery$indy$flow$138(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$139(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_43a = a1;
        return;
    }

    private static native boolean recovery$indy$flow$141(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$142() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$143(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$144(java.lang.Object a0,int a1) {
        ((net.C_47oo) (a0)).field_44S = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$145() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$146(java.lang.Object a0,long a1,long a2);

    private static float recovery$indy$flow$148(java.lang.Object a0) {
        return ((net.C_479H) (a0)).field_45;
    }
    private static void recovery$indy$flow$149(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_43P = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$150() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$151(java.lang.Object a0,long a1,long a2);

    private static float recovery$indy$flow$153(java.lang.Object a0) {
        return ((net.C_479H) (a0)).field_45;
    }
    private static void recovery$indy$flow$154(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_43P = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$155() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$156(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$157() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$158(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$159(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static java.lang.Object recovery$indy$flow$160() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$161(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$162(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }
    private static java.lang.Object recovery$indy$flow$163() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$164(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$165(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static native java.lang.Object recovery$indy$flow$166(java.lang.Object a0,double a1,double a2,double a3);
    private static native java.lang.Object recovery$indy$flow$167(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$168() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$169(java.lang.Object a0,long a1,long a2);
    private static boolean recovery$indy$flow$170(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48d;
    }
    private static boolean recovery$indy$flow$171(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_43P;
    }
    private static void recovery$indy$flow$172(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_43P = a1;
        return;
    }
    private static boolean recovery$indy$flow$173(java.lang.Object a0) {
        return (a0 instanceof net.C_475P);
    }
    private static java.lang.Object recovery$indy$flow$174() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$175(java.lang.Object a0,long a1,long a2);
    private static boolean recovery$indy$flow$176(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48M;
    }

    private static native boolean recovery$indy$flow$178(java.lang.Object a0,long a1,long a2,long a3,long a4);
    private static boolean recovery$indy$flow$179(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_43P;
    }
    private static void recovery$indy$flow$180(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_43P = a1;
        return;
    }

    private static native void recovery$indy$flow$182(java.lang.Object a0,long a1,long a2);

    private static native double recovery$indy$flow$184(java.lang.Object a0,long a1,long a2,long a3);

    private static java.lang.Object recovery$indy$flow$188() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$189(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$190(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48h;
    }
    private static java.lang.Object recovery$indy$flow$191() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$192(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$193(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48z;
    }
    private static native java.lang.Object recovery$indy$flow$194(java.lang.Object a0,long a1,java.lang.Object a2,float a3,float a4,boolean a5,long a6,long a7);
    private static float recovery$indy$flow$195(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_44;
    }
    private static boolean recovery$indy$flow$196(java.lang.Object a0) {
        return ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_43P;
    }
    private static double recovery$indy$flow$197(double a0) {
        return java.lang.Math.toRadians(a0);
    }

    private static double recovery$indy$flow$199(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48Q;
    }
    private static double recovery$indy$flow$200(double a0) {
        return java.lang.Math.sin(a0);
    }

    private static double recovery$indy$flow$202(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_42o;
    }
    private static double recovery$indy$flow$203(double a0) {
        return java.lang.Math.cos(a0);
    }

    private static double recovery$indy$flow$205(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48j;
    }
    private static java.lang.Object recovery$indy$flow$206() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$207(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$208(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48h;
    }
    private static java.lang.Object recovery$indy$flow$209() {
        return augustus.recovered.modules.movement.TargetStrafe_47QD.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$210(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$211(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48z;
    }
    private static native java.lang.Object recovery$indy$flow$212(java.lang.Object a0,double a1,double a2,double a3,long a4,float a5,float a6,boolean a7,long a8,long a9);
    private static float recovery$indy$flow$213(java.lang.Object a0) {
        return ((net.C_477r) (a0)).field_44;
    }
    private static void recovery$indy$flow$214(java.lang.Object a0,float a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_49 = a1;
        return;
    }

    private static native boolean recovery$indy$flow$216(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$217(long a0,long a1,long a2);
    private static native void recovery$indy$flow$218(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$219(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$220(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$221(java.lang.Object a0) {
        return ((net.C_47y6) (a0)).field_43;
    }
    private static void recovery$indy$flow$222(java.lang.Object a0,float a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_49 = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$228(int a0);
    private static native void recovery$indy$flow$230(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$233(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$236(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$239(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$242(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$245(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$248(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$249(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_48 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static void recovery$indy$flow$250(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_43a = a1;
        return;
    }
    private static void recovery$indy$flow$251(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.movement.TargetStrafe_47QD) (a0)).field_43y = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2, long var4);
   private static native void recovery$indy$2(Object var0, float var1, long var2, long var4);
   private static native boolean recovery$indy$3(long var0, long var2, long var4);
   private static native void recovery$indy$4(Object var0, float var1, long var2, long var4);
   private static native boolean recovery$indy$5(long var0, long var2);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$7(Object var0, long var1, long var3);
   private static native void recovery$indy$56(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$57(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$58();
}
