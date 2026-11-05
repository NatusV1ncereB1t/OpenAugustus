package augustus.recovered.modules.render;
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
import net.C_425;
import net.C_42a;
import net.C_45n;
import net.C_473P;
import net.C_477z;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.minecraft.entity.EntityLivingBase;
import net.C_47bs;
import net.C_47cu;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47oO;
import net.C_47si;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class KillEffects_47H9 extends client.module.Module implements net.C_47oO,net.C_47si,net.C_47xz {
    private final client.setting.ModeSetting settingExecutionMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFlash = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingDragonDeathSound = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFireSound = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_40; // Runtime access flags and ConstantValue are restored from the original class.
    private net.minecraft.entity.EntityLivingBase field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.Map field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

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

   public void method_41$426c33b229(C_477z var1, long var2) {
      if (recovery$indy$1(var1, 8134123710549924709L, var2) instanceof EntityLivingBase) {
         this.field_40 = (EntityLivingBase)recovery$indy$2(var1, 8134123710549924709L, var2);
         recovery$indy$3(this.field_46, 8134150696546500637L, var2);
      }
   }



   private String method_44$e168718026(long var1, String var3) {
      var1 = a ^ var1;
      var3 = var3.replace("_", " ");
      StringBuilder var5 = new StringBuilder();
      int[] var10000 = recovery$indy$4(-4385120440144253072L, var1);
      char[] var6 = var3.toCharArray();
      int var7 = 0;
      int[] var4 = var10000;

      while (var7 < var6.length) {
         label54: {
            label53: {
               char var8;
               label62: {
                  var8 = var6[var7];
                  var10000 = var4;
                  if (var1 >= 0L) {
                     if (var4 == null) {
                        label47: {
                           int var12 = var7;
                           if (var1 >= 0L) {
                              if (var7 == 0) {
                                 break label47;
                              }

                              var12 = var6[var7 - 1];
                           }

                           if (var12 != 32) {
                              break label62;
                           }
                        }

                        var5.append(var8);
                     }

                     var10000 = var4;
                  }

                  if (var1 < 0L) {
                     break label54;
                  }

                  if (var10000 == null) {
                     break label53;
                  }
               }

               var5.append(String.valueOf(var8).toLowerCase());
            }

            var7++;
            var10000 = var4;
         }

         if (var10000 != null) {
            break;
         }
      }

      return var5.toString();
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_45 = null;
      this.field_40 = null;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$5(this, 1, var3, -7099240981381992139L, var1);
      recovery$indy$6(this, 40, var3, -7099240981381992139L, var1);
      recovery$indy$7(this, 17, var3, -7099240981381992139L, var1);
   }



    public void method_48o$537c8d9634(int upperKey, short middleKey, char lowerKey) {
        long key = ((long) upperKey << 32) | (((long) middleKey << 48) >>> 32) | (((long) lowerKey << 48) >>> 48);
        long particleKey = key ^ 113186446332478L;
        long timerKey = key ^ 97834970749362L;
        long modeKey = key ^ 99593642957744L;
        Object guard = recovery$indy$flow$24(2180458769900532246L, key);
        float health = recovery$indy$flow$27(recovery$indy$flow$26(recovery$indy$flow$25(), 2183369223914349436L, key));
        Object target;
        if (guard == null) {
            if (health <= 0.0F) recovery$indy$flow$28(this, null);
            if (recovery$indy$flow$30(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_46)), 2000L, timerKey, 2183673105037399911L, key)) return;
            if (((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40)) == null) return;
            target = ((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40));
        } else {
            if (health != 0.0F) return;
            target = ((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40));
        }
        if (target == ((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_45))) return;
        Object world = recovery$indy$flow$35(recovery$indy$flow$34(), 2180793843678838983L, key);
        boolean present = recovery$indy$flow$38(((java.lang.Object)(((net.minecraft.client.multiplayer.WorldClient) (((java.lang.Object)(world)))).field_44Q)), ((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40)));
        boolean lightning = false;
        if (guard == null) {
            boolean immediate = false;
            if (upperKey > 0 && !present) {
                Object mode = recovery$indy$flow$40(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).settingExecutionMode)), modeKey, 2183568706235891040L, key);
                immediate = recovery$indy$flow$42(mode, recovery$indy$flow$41(9510, 1713616959547827703L ^ key));
            }
            boolean effectMode = immediate;
            if (!immediate) {
                boolean alive = upperKey > 0 ? recovery$indy$flow$44(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))) : present;
                if (alive) return;
                Object mode = recovery$indy$flow$46(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).settingExecutionMode)), modeKey, 2183568706235891040L, key);
                effectMode = recovery$indy$flow$48(mode, recovery$indy$flow$47(29615, 3182370876016014200L ^ key));
                if (middleKey >= 0 && !effectMode) return;
            }
            lightning = immediate || middleKey >= 0 ? recovery$indy$flow$50(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).settingFlash)), 2180323690329752542L, key) : effectMode;
        }
        if (lightning) {
            net.C_47BL bolt = new net.C_47BL((net.minecraft.world.World) recovery$indy$flow$53(recovery$indy$flow$52(), 2180793843678838983L, key), recovery$indy$flow$55(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))), recovery$indy$flow$57(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))), recovery$indy$flow$59(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))));
            recovery$indy$flow$63(recovery$indy$flow$62(recovery$indy$flow$61(), 2180793843678838983L, key), bolt);
            Object sounds = recovery$indy$flow$65(recovery$indy$flow$64(), 2183262818965607712L, key);
            net.C_4747 thunder = new net.C_4747(new net.minecraft.util.ResourceLocation((String) recovery$indy$flow$68(114, 5234823281294753960L ^ key)), 10000.0F, 0.8F + recovery$indy$flow$72(new java.util.Random()) * 0.2F, (float) recovery$indy$flow$74(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))), (float) recovery$indy$flow$76(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))), (float) recovery$indy$flow$78(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))));
            recovery$indy$flow$80(sounds, thunder);
            Object nextSounds = recovery$indy$flow$82(recovery$indy$flow$81(), 2183262818965607712L, key);
            net.C_4747 impact = new net.C_4747(new net.minecraft.util.ResourceLocation((String) recovery$indy$flow$85(31967, 8962654475780766735L ^ key)), 10000.0F, 0.5F + recovery$indy$flow$89(new java.util.Random()) * 0.2F, (float) recovery$indy$flow$91(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))), (float) recovery$indy$flow$93(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))), (float) recovery$indy$flow$95(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))));
            recovery$indy$flow$97(nextSounds, impact);
        }
        boolean extraSound;
        if (guard == null) {
            if (recovery$indy$flow$99(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).settingDragonDeathSound)), 2180323690329752542L, key)) {
                Object effectWorld = recovery$indy$flow$101(recovery$indy$flow$100(), 2180793843678838983L, key);
                net.C_478Q position = new net.C_478Q(recovery$indy$flow$104(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))), recovery$indy$flow$106(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))), recovery$indy$flow$108(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))));
                recovery$indy$flow$110(effectWorld, 1018, position, 0);
            }
            extraSound = recovery$indy$flow$112(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).settingFireSound)), 2180323690329752542L, key);
        } else {
            extraSound = present;
        }
        if (extraSound) {
            Object sounds = recovery$indy$flow$114(recovery$indy$flow$113(), 2183262818965607712L, key);
            net.C_4747 sound = new net.C_4747(new net.minecraft.util.ResourceLocation((String) recovery$indy$flow$117(16733, 3702603707896889742L ^ key)), 10000.0F, 0.5F + recovery$indy$flow$121(new java.util.Random()) * 0.2F, (float) recovery$indy$flow$123(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))), (float) recovery$indy$flow$125(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))), (float) recovery$indy$flow$127(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40))));
            recovery$indy$flow$129(sounds, sound);
        }
        Object iterator = recovery$indy$flow$132(recovery$indy$flow$131(((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_49))));
        while (recovery$indy$flow$133(iterator)) {
            Object entry = ((java.lang.Object)(((java.util.Map.Entry) (((java.lang.Object)(recovery$indy$flow$134(iterator)))))));
            if (middleKey <= 0 || (guard != null && upperKey >= 0)) {
                recovery$indy$flow$154(this, null);
                return;
            }
            Object setting = guard;
            if (upperKey >= 0) setting = recovery$indy$flow$138(((java.lang.Object)(((net.C_42a) (((java.lang.Object)(recovery$indy$flow$136(entry))))))), 2180612061319394789L, key);
            boolean enabled = recovery$indy$flow$140(((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(setting)))))), 2180323690329752542L, key);
            if (guard == null && !enabled) continue;
            try {
                int particle = guard == null ? 0 : enabled ? 1 : 0;
                while (true) {
                    Object countSetting = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(recovery$indy$flow$143(((java.lang.Object)(((net.C_42a) (((java.lang.Object)(recovery$indy$flow$141(entry))))))), 2183442860445318500L, key)))))));
                    if (!((double) particle < recovery$indy$flow$145(countSetting, particleKey, 2180522767317708243L, key))) break;
                    Object particles = recovery$indy$flow$147(recovery$indy$flow$146(), 2180810392854880795L, key);
                    Object effectTarget = ((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40));
                    Object kind = ((java.lang.Object)(((net.C_473P) (((java.lang.Object)(recovery$indy$flow$149(entry)))))));
                    recovery$indy$flow$151(particles, effectTarget, kind);
                    particle++;
                    if (upperKey <= 0 || guard != null) break;
                }
            } catch (Throwable failure) {
                if (!recovery$indy$flow$23(failure)) recovery.flow.BytecodeFrame.rethrow(failure);
            }
            if (guard != null) break;
        }
        recovery$indy$flow$153(this, ((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(this)))).field_40)));
        recovery$indy$flow$154(this, null);
    }






   public void method_43y$e45a9973e5(long var1) {
      this.field_40 = null;
      this.field_45 = null;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public KillEffects_47H9(long a0) {
        super((java.lang.String) ("KillEffects"),(java.lang.String) ("T\u00f6tungsEffekte"),(long) (((augustus.recovered.modules.render.KillEffects_47H9.a ^ a0) ^ 19161824653161L)),(java.awt.Color) (new java.awt.Color((int) (168),(int) (255),(int) (176))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.KillEffects_47H9.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.KillEffects_47H9.a ^ a0) ^ 99889743175588L);
        long constructorKey4 = ((augustus.recovered.modules.render.KillEffects_47H9.a ^ a0) ^ 112422659064415L);
        long constructorKey5 = ((augustus.recovered.modules.render.KillEffects_47H9.a ^ a0) ^ 105870782804850L);
        long constructorKey6 = ((augustus.recovered.modules.render.KillEffects_47H9.a ^ a0) ^ 84738718731509L);
        java.lang.Object initialValue7 = recovery$indy$flow$158(2);
        ((java.lang.Object[]) initialValue7)[0] = "RemovedEntity";
        ((java.lang.Object[]) initialValue7)[1] = "ZeroHealth";
        client.setting.ModeSetting initialized8 = new client.setting.ModeSetting(this, "ExecutionMode", constructorKey3, "RemovedEntity", (java.lang.String[]) (initialValue7));
        recovery$indy$flow$160(this, initialized8);
        client.setting.BooleanSetting initialized9 = new client.setting.BooleanSetting(this, constructorKey5, "Flash", true);
        recovery$indy$flow$163(this, initialized9);
        client.setting.BooleanSetting initialized10 = new client.setting.BooleanSetting(this, constructorKey5, "Dragon Death Sound", true);
        recovery$indy$flow$166(this, initialized10);
        java.lang.Object initialValue11 = recovery$indy$flow$167();
        client.setting.BooleanSetting initialized12 = new client.setting.BooleanSetting(this, constructorKey5, "Fire Sound", true);
        recovery$indy$flow$170(this, initialized12);
        recovery$indy$flow$171(this, null);
        recovery$indy$flow$172(this, null);
        net.C_47cu initialized13 = new net.C_47cu();
        recovery$indy$flow$175(this, initialized13);
        java.util.HashMap initialized14 = new java.util.HashMap();
        recovery$indy$flow$178(this, initialized14);
        java.lang.Object initialValue15 = recovery$indy$flow$179();
        java.lang.Object initialValue16 = initialValue15;
        java.lang.Object initialValue17 = initialValue11;
        int length18 = java.lang.reflect.Array.getLength(initialValue16);
        int initialValue19 = length18;
        int initialValue20 = 0;
        KillEffects_47H9 loopLocal21 = this;
        long loopLocal22 = constructorKey2;
        long loopLocal23 = constructorKey4;
        long loopLocal24 = constructorKey5;
        long loopLocal25 = constructorKey6;
        java.lang.Object loopLocal26 = initialValue16;
        java.lang.Object loopLocal27 = initialValue17;
        int loopLocal28 = initialValue19;
        int loopLocal29 = initialValue20;
        loop30: while (true) {
            if (loopLocal29 >= loopLocal28) {
                break loop30;
            } else {
                java.lang.Object arrayValue31 = ((java.lang.Object[]) loopLocal26)[loopLocal29];
                java.lang.Object initialValue32 = arrayValue31;
                java.lang.StringBuilder initialized33 = new java.lang.StringBuilder();
                java.lang.Object initialValue34 = recovery$indy$flow$183(initialized33, "Use ");
                java.lang.Object initialValue35 = recovery$indy$flow$184(initialValue32);
                java.lang.Object initialValue36 = initialValue35;
                long initialValue37 = loopLocal23;
                KillEffects_47H9 initialValue38 = loopLocal21;
                java.lang.Object initialValue39 = ((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(initialValue38))))));
                java.lang.Object initialValue40 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue36))))));
                java.lang.Object initialValue41 = recovery$indy$flow$187(initialValue39, initialValue37, initialValue40);
                java.lang.Object initialValue42 = recovery$indy$flow$188(initialValue34, initialValue41);
                java.lang.Object initialValue43 = recovery$indy$flow$189(initialValue42);
                client.setting.BooleanSetting initialized44 = new client.setting.BooleanSetting((client.module.Module) (loopLocal21), loopLocal24, (java.lang.String) (initialValue43), false);
                client.setting.BooleanSetting initialValue45 = initialized44;
                java.lang.StringBuilder initialized46 = new java.lang.StringBuilder();
                java.lang.Object initialValue47 = recovery$indy$flow$194(initialValue32);
                java.lang.Object initialValue48 = initialValue47;
                long initialValue49 = loopLocal23;
                KillEffects_47H9 initialValue50 = loopLocal21;
                java.lang.Object initialValue51 = ((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(initialValue50))))));
                java.lang.Object initialValue52 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue48))))));
                java.lang.Object initialValue53 = recovery$indy$flow$197(initialValue51, initialValue49, initialValue52);
                java.lang.Object initialValue54 = recovery$indy$flow$198(initialized46, initialValue53);
                java.lang.Object initialValue55 = recovery$indy$flow$199(initialValue54, " Count ");
                java.lang.Object initialValue56 = recovery$indy$flow$200(initialValue55);
                client.setting.NumberSetting initialized57 = new client.setting.NumberSetting((client.module.Module) (loopLocal21), (java.lang.String) (initialValue56), 1.0D, loopLocal25, 1.0D, Double.longBitsToDouble(4626322717216342016L), 0);
                java.lang.Object initialValue58 = recovery$indy$flow$202(initialValue45);
                java.lang.Object initialValue59 = recovery$indy$flow$203(initialValue45);
                java.lang.Object initialValue60 = initialValue59;
                client.setting.NumberSetting initialValue61 = initialized57;
                java.lang.Object initialValue62 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue61))))));
                java.lang.Object initialValue63 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue60))))));
                java.lang.Object initialValue64 = recovery$indy$flow$206(initialValue62, initialValue63);
                java.lang.Object initialValue65 = initialValue64;
                java.lang.Object initialValue66 = ((java.lang.Object)(((augustus.recovered.modules.render.KillEffects_47H9) (((java.lang.Object)(loopLocal21)))).field_49));
                net.C_42a initialized67 = new net.C_42a(initialValue45, initialValue65);
                java.lang.Object initialValue68 = recovery$indy$flow$210(initialValue66, initialValue32, initialized67);
                int incremented69 = loopLocal29 + (1);
                if (loopLocal27 == null) {
                    KillEffects_47H9 loopNext70 = loopLocal21;
                    long loopNext71 = loopLocal22;
                    long loopNext72 = loopLocal23;
                    long loopNext73 = loopLocal24;
                    long loopNext74 = loopLocal25;
                    java.lang.Object loopNext75 = loopLocal26;
                    java.lang.Object loopNext76 = loopLocal27;
                    int loopNext77 = loopLocal28;
                    int loopNext78 = incremented69;
                    loopLocal21 = loopNext70;
                    loopLocal22 = loopNext71;
                    loopLocal23 = loopNext72;
                    loopLocal24 = loopNext73;
                    loopLocal25 = loopNext74;
                    loopLocal26 = loopNext75;
                    loopLocal27 = loopNext76;
                    loopLocal28 = loopNext77;
                    loopLocal29 = loopNext78;
                    continue loop30;
                } else {
                    break loop30;
                }
            }
        }
        return;
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static boolean recovery$indy$flow$23(java.lang.Object a0) {
        return (a0 instanceof java.lang.Exception);
    }
    private static native java.lang.Object recovery$indy$flow$24(long a0,long a1);
    private static java.lang.Object recovery$indy$flow$25() {
        return augustus.recovered.modules.render.KillEffects_47H9.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$26(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$27(java.lang.Object a0);
    private static void recovery$indy$flow$28(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.KillEffects_47H9) (a0)).field_40 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }

    private static native boolean recovery$indy$flow$30(java.lang.Object a0,long a1,long a2,long a3,long a4);



    private static java.lang.Object recovery$indy$flow$34() {
        return augustus.recovered.modules.render.KillEffects_47H9.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$35(java.lang.Object a0,long a1,long a2);


    private static boolean recovery$indy$flow$38(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.List) (a0)).contains(a1);
    }

    private static native java.lang.Object recovery$indy$flow$40(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$41(int a0,long a1);
    private static boolean recovery$indy$flow$42(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }

    private static native boolean recovery$indy$flow$44(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$46(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$47(int a0,long a1);
    private static boolean recovery$indy$flow$48(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }

    private static native boolean recovery$indy$flow$50(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$52() {
        return augustus.recovered.modules.render.KillEffects_47H9.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$53(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$55(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48Q;
    }

    private static double recovery$indy$flow$57(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48j;
    }

    private static double recovery$indy$flow$59(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_42o;
    }
    private static java.lang.Object recovery$indy$flow$61() {
        return augustus.recovered.modules.render.KillEffects_47H9.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$62(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$63(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$64() {
        return augustus.recovered.modules.render.KillEffects_47H9.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$65(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$68(int a0,long a1);
    private static float recovery$indy$flow$72(java.lang.Object a0) {
        return ((java.util.Random) (a0)).nextFloat();
    }

    private static double recovery$indy$flow$74(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48Q;
    }

    private static double recovery$indy$flow$76(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48j;
    }

    private static double recovery$indy$flow$78(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_42o;
    }
    private static native void recovery$indy$flow$80(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$81() {
        return augustus.recovered.modules.render.KillEffects_47H9.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$82(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$85(int a0,long a1);
    private static float recovery$indy$flow$89(java.lang.Object a0) {
        return ((java.util.Random) (a0)).nextFloat();
    }

    private static double recovery$indy$flow$91(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48Q;
    }

    private static double recovery$indy$flow$93(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48j;
    }

    private static double recovery$indy$flow$95(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_42o;
    }
    private static native void recovery$indy$flow$97(java.lang.Object a0,java.lang.Object a1);

    private static native boolean recovery$indy$flow$99(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$100() {
        return augustus.recovered.modules.render.KillEffects_47H9.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$101(java.lang.Object a0,long a1,long a2);

    private static double recovery$indy$flow$104(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48Q;
    }

    private static double recovery$indy$flow$106(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48j;
    }

    private static double recovery$indy$flow$108(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_42o;
    }
    private static native void recovery$indy$flow$110(java.lang.Object a0,int a1,java.lang.Object a2,int a3);

    private static native boolean recovery$indy$flow$112(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$113() {
        return augustus.recovered.modules.render.KillEffects_47H9.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$114(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$117(int a0,long a1);
    private static float recovery$indy$flow$121(java.lang.Object a0) {
        return ((java.util.Random) (a0)).nextFloat();
    }

    private static double recovery$indy$flow$123(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48Q;
    }

    private static double recovery$indy$flow$125(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48j;
    }

    private static double recovery$indy$flow$127(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_42o;
    }
    private static native void recovery$indy$flow$129(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$131(java.lang.Object a0) {
        return ((java.util.Map) (a0)).entrySet();
    }
    private static java.lang.Object recovery$indy$flow$132(java.lang.Object a0) {
        return ((java.util.Set) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$133(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$134(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static java.lang.Object recovery$indy$flow$136(java.lang.Object a0) {
        return ((java.util.Map.Entry) (a0)).getValue();
    }

    private static native java.lang.Object recovery$indy$flow$138(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$140(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$141(java.lang.Object a0) {
        return ((java.util.Map.Entry) (a0)).getValue();
    }

    private static native java.lang.Object recovery$indy$flow$143(java.lang.Object a0,long a1,long a2);

    private static native double recovery$indy$flow$145(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$146() {
        return augustus.recovered.modules.render.KillEffects_47H9.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$147(java.lang.Object a0,long a1,long a2);

    private static java.lang.Object recovery$indy$flow$149(java.lang.Object a0) {
        return ((java.util.Map.Entry) (a0)).getKey();
    }

    private static native void recovery$indy$flow$151(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2);

    private static void recovery$indy$flow$153(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.KillEffects_47H9) (a0)).field_45 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static void recovery$indy$flow$154(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.KillEffects_47H9) (a0)).field_40 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$158(int a0);
    private static native void recovery$indy$flow$160(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$163(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$166(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$167();
    private static native void recovery$indy$flow$170(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$171(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.KillEffects_47H9) (a0)).field_40 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static void recovery$indy$flow$172(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.render.KillEffects_47H9) (a0)).field_45 = ((net.minecraft.entity.EntityLivingBase) (a1));
        return;
    }
    private static native void recovery$indy$flow$175(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$178(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$179();
    private static java.lang.Object recovery$indy$flow$183(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$184(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$187(java.lang.Object a0,long a1,java.lang.Object a2);
    private static java.lang.Object recovery$indy$flow$188(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$189(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native java.lang.Object recovery$indy$flow$194(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$197(java.lang.Object a0,long a1,java.lang.Object a2);
    private static java.lang.Object recovery$indy$flow$198(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$199(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$200(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$202(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$203(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$206(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$210(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.Map) (a0)).put(a1, a2);
    }
   private static native MethodHandle recovery$constant$0();
   private static native Entity recovery$indy$1(Object var0, long var1, long var3);
   private static native Entity recovery$indy$2(Object var0, long var1, long var3);
   private static native void recovery$indy$3(Object var0, long var1, long var3);
   private static native int[] recovery$indy$4(long var0, long var2);
   private static native void recovery$indy$5(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$6(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$7(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$34();
}
