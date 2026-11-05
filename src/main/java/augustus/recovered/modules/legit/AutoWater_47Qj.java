package augustus.recovered.modules.legit;
import augustus.recovered.modules.player.AirStuck_47Q4;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_43r;
import net.C_475c;
import net.C_475y;
import net.C_478Q;
import net.C_478i;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47ET;
import net.C_47Ij;
import client.module.Module;
import client.setting.BooleanSetting;
import net.C_47UH;
import net.C_47UZ;
import net.minecraft.client.multiplayer.WorldClient;
import client.ClientGlobals;
import net.C_47rf;
import client.module.Category;
import net.C_484;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoWater_47Qj extends client.module.Module implements net.C_47UH,net.C_48T {
    public final client.setting.BooleanSetting settingAutoSlot = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_478Q field_45; // Runtime access flags and ConstantValue are restored from the original class.
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

   public void method_41$fae8de1664(C_475c var1) {
      AutoWater_47Qj var8;
      label30: {
         long var2 = a ^ 13228797141863L;
         long var10000 = -6880707853504985042L;
         boolean var4 = AirStuck_47Q4.method_45$aae029aa0a();
         int var7 = this.field_43y;
         byte var10001 = -1;
         if (var4) {
            if (this.field_43y == -1) {
               return;
            }

            var8 = this;
            if (!var4) {
               break label30;
            }

            var7 = this.field_42;
            var10001 = 2;
         }

         if (var7 <= var10001) {
            return;
         }

         long var10002 = -6881298587188347970L;
         byte var5 = 1;
         C_475c var6 = var1;
         var6.method_48$d00df7729d(var5);
         var8 = this;
      }

      var8.field_42 = 0;
   }



   private int method_49$1978aaf78d(long var1, int var3) {
      var1 = a ^ var1;
      boolean var4 = recovery$indy$1(1165648180708662225L, var1);
      C_47rf var5 = recovery$indy$2(field_43, 1166019984636599380L, var1).field_429.method_46$4c10532da1(var3).method_48$ac4db64966();
      C_47rf var10000 = var5;
      if (!var4) {
         if (var5 == null) {
            return -1;
         }

         var10000 = var5;
      }

      C_43r var7 = var10000.method_48$dbd570a038();
      C_43r var10001 = C_43r.method_46$4158f44b4a(326);
      if (!var4) {
         if (var7 == var10001) {
            byte var8 = (byte) ((recovery$indy$3(field_43, 1166019984636599380L, var1).method_48H$aae029aa0a()) ? 1 : 0);
            if (var4) {
               return var8;
            }

            if (var8 == 0) {
               return var3 - 36;
            }
         }

         var7 = var5.method_48$dbd570a038();
         var10001 = C_43r.method_46$4158f44b4a(325);
      }

      if (var7 == var10001) {
         float var10;
         int var9 = (var10 = recovery$indy$4(field_43, 1166019984636599380L, var1).field_48R - 1.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
         if (var4) {
            return var9;
         }

         if (var9 < 0) {
            byte var11 = (byte) ((recovery$indy$5(field_43, 1166019984636599380L, var1).method_48H$aae029aa0a()) ? 1 : 0);
            if (var4) {
               return var11;
            }

            if (var11 != 0) {
               return var3 - 36;
            }
         }
      }

      return -1;
   }



   private int method_49$95d88932bd(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$6(5031501023780343343L, var1);
      int var4 = 36;

      while (var4 < recovery$indy$7(field_43, 5030738084691184042L, var1).field_429.field_46.size()) {
         C_47rf var5 = recovery$indy$8(field_43, 5030738084691184042L, var1).field_429.method_46$4c10532da1(var4).method_48$ac4db64966();
         int var10000 = (int) ((var3) ? 1 : 0);
         if (var1 > 0L) {
            if (!var3) {
               label96: {
                  C_47rf var7 = var5;
                  if (var1 >= 0L) {
                     if (var5 == null) {
                        break label96;
                     }

                     var7 = var5;
                  }

                  C_43r var8 = var7.method_48$dbd570a038();
                  C_43r var10001 = C_43r.method_46$4158f44b4a(326);
                  if (!var3) {
                     if (var8 == var10001) {
                        var10000 = (int) ((recovery$indy$9(field_43, 5030738084691184042L, var1).method_48H$aae029aa0a()) ? 1 : 0);
                        if (var3) {
                           return var10000;
                        }

                        if (var10000 == 0) {
                           return var4 - 36;
                        }
                     }

                     var8 = var5.method_48$dbd570a038();
                     var10001 = C_43r.method_46$4158f44b4a(325);
                  }

                  label72:
                  if (var8 == var10001) {
                     float var11;
                     var10000 = (var11 = recovery$indy$10(field_43, 5030738084691184042L, var1).field_48R - 1.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
                     boolean var10 = var3;
                     if (var1 > 0L) {
                        if (!var3) {
                           if (var10000 >= 0) {
                              break label72;
                           }

                           var10000 = (int) ((recovery$indy$11(field_43, 5030738084691184042L, var1).method_48H$aae029aa0a()) ? 1 : 0);
                        }

                        var10 = var3;
                     }

                     if (var10) {
                        return var10000;
                     }

                     if (var10000 != 0) {
                        return var4 - 36;
                     }
                  }
               }

               var4++;
            }

            var10000 = (int) ((var3) ? 1 : 0);
         }

         if ((var10000) != 0) {
            break;
         }
      }

      return -1;
   }



    public void method_40G$e45a9973e5(long key) {
        long selectKey = key ^ 7033377480299L;
        long searchKey = key ^ 82705177774997L;
        long actionKey = key ^ 6407505185672L;
        int actionUpper = (int) (actionKey >>> 32);
        char actionMiddle = (char) ((actionKey << 32) >>> 48);
        char actionLower = (char) ((actionKey << 48) >>> 48);
        long enabledKey = key ^ 41560100428584L;
        boolean guard = recovery$indy$flow$52(-3628309648642464503L, key);
        recovery$indy$flow$53(this, -1);
        if (guard) {
            recovery$indy$flow$55(this, recovery$indy$flow$54(this) + 1);
            waterInteraction: {
                if (recovery$indy$flow$57(recovery$indy$flow$56(), -3628069286508920356L, key) == null) break waterInteraction;
                if (!recovery$indy$flow$59(recovery$indy$flow$58(), enabledKey, -3627936386514818247L, key)) break waterInteraction;
                if (recovery$indy$flow$61(recovery$indy$flow$60(), -3628254857257886461L, key) == null) break waterInteraction;
                if (((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(recovery$indy$flow$63(recovery$indy$flow$62(), -3628254857257886461L, key))))).field_49)) != recovery$indy$flow$65()) break waterInteraction;
                if (((java.lang.Object)(((augustus.recovered.modules.legit.AutoWater_47Qj) (((java.lang.Object)(this)))).field_45)) == null) break waterInteraction;
                Object previousPosition = ((java.lang.Object)(((augustus.recovered.modules.legit.AutoWater_47Qj) (((java.lang.Object)(this)))).field_45));
                Object hit = recovery$indy$flow$69(recovery$indy$flow$68(), -3628254857257886461L, key);
                if (key >= 0L) {
                    if (!recovery$indy$flow$71(previousPosition, recovery$indy$flow$70(hit))) break waterInteraction;
                    previousPosition = recovery$indy$flow$74(recovery$indy$flow$73(recovery$indy$flow$72(), -3628254857257886461L, key));
                    hit = recovery$indy$flow$76(recovery$indy$flow$75(), -3628254857257886461L, key);
                }
                Object waterPosition = recovery$indy$flow$78(previousPosition, ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(hit)))).field_40)));
                net.C_478i surfaceBox = new net.C_478i((double) recovery$indy$flow$80(waterPosition), (double) recovery$indy$flow$81(waterPosition), (double) recovery$indy$flow$82(waterPosition), (double) (recovery$indy$flow$83(waterPosition) + 1), (double) recovery$indy$flow$84(waterPosition) + 0.9D, (double) (recovery$indy$flow$85(waterPosition) + 1));
                Object playerBox = recovery$indy$flow$89(recovery$indy$flow$88(recovery$indy$flow$87(), -3628069286508920356L, key));
                Object insetBox = recovery$indy$flow$90(playerBox, -0.1D, 0.0D, -0.1D);
                if (recovery$indy$flow$91(surfaceBox, insetBox) && recovery$indy$flow$94(recovery$indy$flow$93(recovery$indy$flow$92(), -3628069286508920356L, key))) {
                    int slot = 1;
                    boolean selectInventorySlot = true;
                    if (key > 0L) {
                        if (recovery$indy$flow$96(((java.lang.Object)(((augustus.recovered.modules.legit.AutoWater_47Qj) (((java.lang.Object)(this)))).settingAutoSlot)), -3627764111850183641L, key)) {
                            slot = recovery$indy$flow$97(this, searchKey, -3627894775879469253L, key);
                            selectInventorySlot = false;
                        } else {
                            slot = recovery$indy$flow$101(((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(recovery$indy$flow$99(recovery$indy$flow$98(), -3628069286508920356L, key))))).field_42X))) + 36;
                        }
                    }
                    int selected = selectInventorySlot ? recovery$indy$flow$102(this, selectKey, slot, -3628353983111667425L, key) : slot;
                    recovery$indy$flow$103(this, selected);
                }
                Object world = recovery$indy$flow$105(recovery$indy$flow$104(), -3628130181505957817L, key);
                Object blockState = recovery$indy$flow$106(world, waterPosition);
                Object block = recovery$indy$flow$107(blockState);
                boolean sourceWater = false;
                if (recovery$indy$flow$108(block)) sourceWater = recovery$indy$flow$112(((java.lang.Object)(((java.lang.Integer) (((java.lang.Object)(recovery$indy$flow$110(blockState, recovery$indy$flow$109())))))))) == 0;
                net.C_478i fallingBox = new net.C_478i((double) recovery$indy$flow$114(waterPosition), (double) recovery$indy$flow$115(waterPosition), (double) recovery$indy$flow$116(waterPosition), (double) (recovery$indy$flow$117(waterPosition) + 1), (double) recovery$indy$flow$118(waterPosition) + 4.5D, (double) (recovery$indy$flow$119(waterPosition) + 1));
                boolean intersects = recovery$indy$flow$124(fallingBox, recovery$indy$flow$123(recovery$indy$flow$122(recovery$indy$flow$121(), -3628069286508920356L, key)));
                boolean fallingOnTop;
                if (key >= 0L) {
                    float fallDistance = recovery$indy$flow$127(recovery$indy$flow$126(recovery$indy$flow$125(), -3628069286508920356L, key));
                    fallingOnTop = fallDistance > 3.0F;
                } else {
                    fallingOnTop = intersects;
                }
                if (fallingOnTop) {
                    Object side = ((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(recovery$indy$flow$129(recovery$indy$flow$128(), -3628254857257886461L, key))))).field_40));
                    if (side == recovery$indy$flow$131()) {
                        if (key < 0L) break waterInteraction;
                        fallingOnTop = intersects;
                    } else {
                        fallingOnTop = false;
                    }
                }
                if (!fallingOnTop) {
                    float fallDistance = recovery$indy$flow$134(recovery$indy$flow$133(recovery$indy$flow$132(), -3628069286508920356L, key));
                    if (key >= 0L) {
                        if (fallDistance != 0.0F) break waterInteraction;
                        if (!recovery$indy$flow$137(recovery$indy$flow$136(recovery$indy$flow$135(), -3628069286508920356L, key))) break waterInteraction;
                    } else {
                        if (fallDistance == 0.0F) break waterInteraction;
                    }
                    if (!sourceWater) break waterInteraction;
                }
                if (((java.lang.Object)(((net.C_47Ij) (((java.lang.Object)(recovery$indy$flow$139(recovery$indy$flow$138(), -3628254857257886461L, key))))).field_49)) != recovery$indy$flow$141()) break waterInteraction;
                int slot = 1;
                boolean selectInventorySlot = true;
                if (key > 0L) {
                    if (recovery$indy$flow$143(((java.lang.Object)(((augustus.recovered.modules.legit.AutoWater_47Qj) (((java.lang.Object)(this)))).settingAutoSlot)), -3627764111850183641L, key)) {
                        slot = recovery$indy$flow$144(this, searchKey, -3627894775879469253L, key);
                        selectInventorySlot = false;
                    } else {
                        slot = recovery$indy$flow$148(((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(recovery$indy$flow$146(recovery$indy$flow$145(), -3628069286508920356L, key))))).field_42X))) + 36;
                    }
                }
                int selected = selectInventorySlot ? recovery$indy$flow$149(this, selectKey, slot, -3628353983111667425L, key) : slot;
                recovery$indy$flow$150(this, selected);
            }
        }
        Object hit = recovery$indy$flow$152(recovery$indy$flow$151(), -3628254857257886461L, key);
        Object currentPosition;
        if (guard) {
            currentPosition = hit == null ? null : recovery$indy$flow$155(recovery$indy$flow$154(recovery$indy$flow$153(), -3628254857257886461L, key));
        } else {
            currentPosition = recovery$indy$flow$155(hit);
        }
        recovery$indy$flow$156(this, currentPosition);
        boolean autoSelect = recovery$indy$flow$158(((java.lang.Object)(((augustus.recovered.modules.legit.AutoWater_47Qj) (((java.lang.Object)(this)))).settingAutoSlot)), -3627764111850183641L, key);
        int actionDelay = 5;
        if (key < 0L) {
            if (autoSelect == guard) return;
        } else if (guard) {
            if (!autoSelect) return;
            if (key == 0L) actionDelay = 1;
            else if (recovery$indy$flow$159(this) == -1) return;
        }
        int selectedSlot = recovery$indy$flow$160(this);
        recovery$indy$flow$161(actionUpper, this, actionDelay, actionMiddle, actionLower, selectedSlot, -3628697189480811934L, key);
    }







   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$41(this, 7, var3, -7099900558515562915L, var1);
      recovery$indy$42(this, 34, var3, -7099900558515562915L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public AutoWater_47Qj(long a0) {
        super((java.lang.String) ("AutoWater"),(java.lang.String) ("AutomatischesWasser"),(long) (((augustus.recovered.modules.legit.AutoWater_47Qj.a ^ a0) ^ 24033916657727L)),(java.awt.Color) (new java.awt.Color((int) (66),(int) (135),(int) (245))),(client.module.Category) (client.module.Category.LEGIT));
        long settingKey = (augustus.recovered.modules.legit.AutoWater_47Qj.a ^ a0) ^ 111047834237988L;
        client.setting.BooleanSetting setting = new client.setting.BooleanSetting(this, settingKey, "AutoSlot", true);
        recovery$indy$flow$166(this, setting);
        recovery$indy$flow$167(this, -1);
        recovery$indy$flow$168(this, null);
    }



    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native boolean recovery$indy$flow$52(long a0,long a1);
    private static void recovery$indy$flow$53(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoWater_47Qj) (a0)).field_43y = a1;
        return;
    }
    private static int recovery$indy$flow$54(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoWater_47Qj) (a0)).field_42;
    }
    private static void recovery$indy$flow$55(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoWater_47Qj) (a0)).field_42 = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$56() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$57(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$58() {
        return client.ClientGlobals.field_46;
    }
    private static native boolean recovery$indy$flow$59(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$60() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$61(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$62() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$63(java.lang.Object a0,long a1,long a2);

    private static java.lang.Object recovery$indy$flow$65() {
        return net.C_47Az.BLOCK;
    }


    private static java.lang.Object recovery$indy$flow$68() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$69(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$70(java.lang.Object a0);
    private static native boolean recovery$indy$flow$71(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$72() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$73(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$74(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$75() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$76(java.lang.Object a0,long a1,long a2);

    private static native java.lang.Object recovery$indy$flow$78(java.lang.Object a0,java.lang.Object a1);
    private static native int recovery$indy$flow$80(java.lang.Object a0);
    private static native int recovery$indy$flow$81(java.lang.Object a0);
    private static native int recovery$indy$flow$82(java.lang.Object a0);
    private static native int recovery$indy$flow$83(java.lang.Object a0);
    private static native int recovery$indy$flow$84(java.lang.Object a0);
    private static native int recovery$indy$flow$85(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$87() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$88(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$89(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$90(java.lang.Object a0,double a1,double a2,double a3);
    private static native boolean recovery$indy$flow$91(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$92() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$93(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$94(java.lang.Object a0);

    private static native boolean recovery$indy$flow$96(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$97(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$98() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$99(java.lang.Object a0,long a1,long a2);

    private static int recovery$indy$flow$101(java.lang.Object a0) {
        return ((net.C_47WY) (a0)).field_42;
    }
    private static native int recovery$indy$flow$102(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static void recovery$indy$flow$103(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoWater_47Qj) (a0)).field_43y = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$104() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$105(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$106(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$107(java.lang.Object a0);
    private static boolean recovery$indy$flow$108(java.lang.Object a0) {
        return (a0 instanceof net.C_47ET);
    }
    private static java.lang.Object recovery$indy$flow$109() {
        return net.C_47ET.field_44;
    }
    private static native java.lang.Object recovery$indy$flow$110(java.lang.Object a0,java.lang.Object a1);

    private static int recovery$indy$flow$112(java.lang.Object a0) {
        return ((java.lang.Integer) (a0)).intValue();
    }
    private static native int recovery$indy$flow$114(java.lang.Object a0);
    private static native int recovery$indy$flow$115(java.lang.Object a0);
    private static native int recovery$indy$flow$116(java.lang.Object a0);
    private static native int recovery$indy$flow$117(java.lang.Object a0);
    private static native int recovery$indy$flow$118(java.lang.Object a0);
    private static native int recovery$indy$flow$119(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$121() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$122(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$123(java.lang.Object a0);
    private static native boolean recovery$indy$flow$124(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$125() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$126(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$127(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48R;
    }
    private static java.lang.Object recovery$indy$flow$128() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$129(java.lang.Object a0,long a1,long a2);

    private static java.lang.Object recovery$indy$flow$131() {
        return net.C_484.UP;
    }
    private static java.lang.Object recovery$indy$flow$132() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$133(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$134(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48R;
    }
    private static java.lang.Object recovery$indy$flow$135() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$136(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$137(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$138() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$139(java.lang.Object a0,long a1,long a2);

    private static java.lang.Object recovery$indy$flow$141() {
        return net.C_47Az.BLOCK;
    }

    private static native boolean recovery$indy$flow$143(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$144(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$145() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$146(java.lang.Object a0,long a1,long a2);

    private static int recovery$indy$flow$148(java.lang.Object a0) {
        return ((net.C_47WY) (a0)).field_42;
    }
    private static native int recovery$indy$flow$149(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static void recovery$indy$flow$150(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoWater_47Qj) (a0)).field_43y = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$151() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$152(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$153() {
        return augustus.recovered.modules.legit.AutoWater_47Qj.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$154(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$155(java.lang.Object a0);
    private static void recovery$indy$flow$156(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoWater_47Qj) (a0)).field_45 = ((net.C_478Q) (a1));
        return;
    }

    private static native boolean recovery$indy$flow$158(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$159(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoWater_47Qj) (a0)).field_43y;
    }
    private static int recovery$indy$flow$160(java.lang.Object a0) {
        return ((augustus.recovered.modules.legit.AutoWater_47Qj) (a0)).field_43y;
    }
    private static native void recovery$indy$flow$161(int a0,java.lang.Object a1,int a2,char a3,char a4,int a5,long a6,long a7);
    private static native void recovery$indy$flow$166(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$167(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.legit.AutoWater_47Qj) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$168(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.legit.AutoWater_47Qj) (a0)).field_45 = ((net.C_478Q) (a1));
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$6(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);
   private static native void recovery$indy$41(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$42(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$43();
}
