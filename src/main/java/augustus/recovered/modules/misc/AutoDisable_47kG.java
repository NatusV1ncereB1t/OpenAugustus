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
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_45n;
import net.C_473U;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import client.module.Module;
import net.C_47Pe;
import client.module.ModuleManager;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47cu;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.C_47oO;
import net.C_47ob;
import client.ClientGlobals;
import client.module.Category;
import net.C_47tf;
import net.C_47xZ;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoDisable_47kG extends client.module.Module implements net.C_47xz,net.C_47oO,net.C_47iC {
    private final client.setting.BooleanSetting settingDisableOnTeleport = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingMinTeleportDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingForcedisableModulesForXMs = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingRetoggleModulesAfterXMs = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashSet field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

   private int method_46$582451a3ff(long var1, Module var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 90288253755103L;
      long var6 = var1 ^ 80957386424785L;
      int[] var8 = recovery$indy$1(1955175663929639926L, var1);
      int var10000 = (int) ((recovery$indy$2(this.settingMode, var4, 1955845435246354099L, var1).equals(recovery$indy$3(9051, 436976928455917339L ^ var1))) ? 1 : 0);
      if (var8 == null) {
         if (var10000 != 0) {
            return (int)recovery$indy$4(this.settingRetoggleModulesAfterXMs, true, var6, 1956790012999949854L, var1);
         }

         var10000 = (int)recovery$indy$5((NumberSetting)((C_47Pe)this.field_47.get(var3)).field_45, true, var6, 1956790012999949854L, var1);
      }

      return var10000;
   }



    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native int a(long a0,long a1);

    private static native void a();

   private int method_42$582451a3ff(long var1, Module var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 138109764990204L;
      long var6 = var1 ^ 112290518215666L;
      int[] var8 = recovery$indy$6(-5692265800900908587L, var1);
      int var10000 = (int) ((recovery$indy$7(this.settingMode, var4, -5690403070746545008L, var1).equals(recovery$indy$8(9051, 436949985856476472L ^ var1))) ? 1 : 0);
      if (var8 == null) {
         if (var10000 != 0) {
            return (int)recovery$indy$9(this.settingForcedisableModulesForXMs, true, var6, -5691206704669821891L, var1);
         }

         var10000 = (int)recovery$indy$10((NumberSetting)((C_47Pe)this.field_47.get(var3)).field_47, true, var6, -5691206704669821891L, var1);
      }

      return var10000;
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$6923c31fac(long var1, ModuleManager var3) {
      int[] var37;
      var1 = a ^ var1;
      long var10001 = var1 ^ 130165912654714L;
      int var4 = (int)((var1 ^ 130165912654714L) >>> 48);
      int var5 = (int)((var1 ^ 130165912654714L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      var10001 = var1 ^ 53390331024868L;
      int var7 = (int)((var1 ^ 53390331024868L) >>> 48);
      int var8 = (int)((var1 ^ 53390331024868L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      var10001 = var1 ^ 53100776451639L;
      int var10 = (int)((var1 ^ 53100776451639L) >>> 32);
      int var11 = (int)((var1 ^ 53100776451639L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 24996819348518L;
      int var13 = (int)((var1 ^ 24996819348518L) >>> 32);
      int var14 = (int)((var1 ^ 24996819348518L) << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      long var16 = var1 ^ 115754002610304L;
      long var18 = var1 ^ 124523235420662L;
      var10001 = var1 ^ 101257998554794L;
      int var20 = (int)((var1 ^ 101257998554794L) >>> 32);
      int var21 = (int)((var1 ^ 101257998554794L) << 32 >>> 48);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var23 = var1 ^ 61130625714490L;
      int[] var25 = recovery$indy$11(-5178224143659540233L, var1);
      if (this.field_47.isEmpty()) {
         Category[] var26 = recovery$indy$12(-5178987079817127129L, var1);
         int var27 = var26.length;
         int var28 = 0;

         label52:
         while (true) {
            int var10000 = var28;

            label50:
            while (var10000 < var27) {
               label47: {
                  Category var29 = var26[var28];
                  if (!var29.hidden) {
                     SettingGroup var30 = new SettingGroup(this, var29.name(), var16);

                     for (Object recovered$element$6533 : recovery$indy$13(var3, var29, var20, (short)var21, var22, -5179025620562990277L, var1)) {
         Module var33 = (Module) recovered$element$6533;
                        var10000 = (int) ((var33 instanceof AutoDisable_47kG) ? 1 : 0);
                        if (var1 < 0L || var25 != null) {
                           continue label50;
                        }

                        if (var10000 == 0) {
                           BooleanSetting var34 = new BooleanSetting(this, recovery$indy$14(var33, -5177027343288918748L, var1), (short)var4, (char)var5, var6, false, var30);
                           SettingGroup var35 = recovery$indy$18(
                              new SettingGroup(
                                 var18,
                                 this,
                                 recovery$indy$15(var33, -5177027343288918748L, var1) + recovery$indy$16(23003, 6761423387957864087L ^ var1),
                                 var30
                              ),
                              var13,
                              (char)var14,
                              var15,
                              recovery$indy$17(this, var34),
                              -5177981362689351303L,
                              var1
                           );
                           this.field_47
                              .put(
                                 var33,
                                 new C_47Pe(
                                    var34,
                                    recovery$indy$22(
                                       new NumberSetting(
                                          this,
                                          recovery$indy$19(var33, (short)var7, (short)var8, var9, -5177616317963948330L, var1)
                                             + recovery$indy$20(7422, 7557162485314315194L ^ var1),
                                          0.0,
                                          0.0,
                                          5000.0,
                                          0,
                                          var35,
                                          var23
                                       ),
                                       var10,
                                       recovery$indy$21(13825, 4925303174523668811L ^ var1),
                                       var11,
                                       (short)var12,
                                       -5178806466924279639L,
                                       var1
                                    ),
                                    recovery$indy$26(
                                       new NumberSetting(
                                          this,
                                          recovery$indy$23(var33, (short)var7, (short)var8, var9, -5177616317963948330L, var1)
                                             + recovery$indy$24(32625, 4256742302279041087L ^ var1),
                                          0.0,
                                          0.0,
                                          5000.0,
                                          0,
                                          var35,
                                          var23
                                       ),
                                       var10,
                                       recovery$indy$25(5006, 77655285458037955L ^ var1),
                                       var11,
                                       (short)var12,
                                       -5178806466924279639L,
                                       var1
                                    )
                                 )
                              );
                           var37 = var25;
                           if (var1 <= 0L) {
                              break label47;
                           }

                           if (var25 != null) {
                              break;
                           }
                        }
                     }
                  }

                  var28++;
                  var37 = var25;
               }

               if (var37 != null) {
                  return;
               }
               continue label52;
            }

            return;
         }
      }
   }





   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 63248446344633L;
      long var3 = var1 ^ 115017070057870L;
      long var10002 = 6662430824647743970L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Simple");
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      long var10001 = var5 ^ 46605893340365L;
      int var7 = (int)((var5 ^ 46605893340365L) >>> 32);
      int var8 = (int)((var5 ^ 46605893340365L) << 32 >>> 56);
      int var9 = (int)(var10001 << 40 >>> 40);
      this.field_43a = recovery$indy$27(this, var7, (byte)var8, var9, 3263227500718468356L, var5);
   }



   private boolean method_45$2bbaa67475(BooleanSetting var1) {
      long var2 = a ^ 137392485262487L;
      long var4 = var2 ^ 50476551811232L;
      long var10000 = 8457005963700448649L;
      int[] var6 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 8456874727930552396L;
      BooleanSetting var7 = var1;
      boolean var11 = var7.method_49$aae029aa0a();
      if (var6 == null) {
         if (!var11) {
            return false;
         }

         long var10002 = 8456617682670186700L;
         long var8 = var4;
         ModeSetting var10 = this.settingMode;
         var11 = var10.method_46$5f9dc63072(var8).equals("Expert");
      }

      return var6 != null ? var11 : var11;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 108894845198978L;
      long var3 = var1 ^ 55075911710389L;
      long var10002 = -914530869287291175L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Simple");
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 50498101010005L;
      long var6 = var1 ^ 27775758592377L;
      long var10001 = var1 ^ 121813091386506L;
      int var8 = (int)((var1 ^ 121813091386506L) >>> 32);
      int var9 = (int)((var1 ^ 121813091386506L) << 32 >>> 56);
      int var10 = (int)(var10001 << 40 >>> 40);
      int[] var11 = recovery$indy$28(2669045594393738718L, var1);
      if (recovery$indy$29(var3, 2669145482567773477L, var1) instanceof C_47xZ) {
         if (recovery$indy$30(field_43, 2670033502627681746L, var1) != null) {
            C_47xZ var12 = (C_47xZ)recovery$indy$31(var3, 2669145482567773477L, var1);
            C_47tf var13 = new C_47tf(var12.method_40$fedcb3e4d3(), var12.method_48$fedcb3e4d3(), var12.method_46$fedcb3e4d3());
            double var16;
            int var10000 = (
                     var16 = var13.method_41$4b58f7ab41(
                           recovery$indy$32(field_43, 2670033502627681746L, var1).field_48Q,
                           recovery$indy$33(field_43, 2670033502627681746L, var1).field_48j,
                           recovery$indy$34(field_43, 2670033502627681746L, var1).field_42o
                        )
                        - recovery$indy$35(this.settingMinTeleportDistance, var6, 2668990996274384664L, var1)
                  )
                  == 0.0
               ? 0
               : (var16 < 0.0 ? -1 : 1);
            if (var11 == null) {
               if (var10000 <= 0) {
                  return;
               }

               var10000 = (int) ((this.field_43a) ? 1 : 0);
            }

            int var14 = var10000;
            this.field_43a = recovery$indy$36(this, var8, (byte)var9, var10, 2670094400794731843L, var1);
            var10000 = (int) ((this.field_43a) ? 1 : 0);
            if (var11 == null) {
               if (!this.field_43a) {
                  return;
               }

               var10000 = var14;
            }

            if (var10000 == 0) {
               recovery$indy$38(var4, recovery$indy$37(26566, 6879196844972410281L ^ var1), 2668539580574793471L, var1);
            }
         }
      }
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$39(this, 17, var3, -7102152693774147179L, var1);
      recovery$indy$40(this, 26, var3, -7102152693774147179L, var1);
      recovery$indy$41(this, 40, var3, -7102152693774147179L, var1);
   }



    private boolean method_41S$62d6e91ea5(int n, byte by, int n2) {
        int n3;
        int n4;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        block11: {
            block13: {
                int n5;
                java.util.Iterator iterator;
                block14: {
                    block12: {
                        block10: {
                            long l8 = l7 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ a;
                            l6 = l8 ^ 0x69FD4E94BE15L;
                            l5 = l8 ^ 0x1ABDC8B21BE1L;
                            l4 = l8 ^ 0x3673C7101081L;
                            l3 = l8 ^ 0x1D33E07FA386L;
                            l2 = l8 ^ 0x19F23721BAA2L;
                            l = l8 ^ 0x16C802C9A864L;
                            int[] nArray = AutoDisable_47kG.recovery$indy$42(-5745623681572837225L, l7);
                            n4 = 1;
                            int[] nArray2 = nArray;
                            n3 = ((int) (this.field_43a ? 1 : 0));
                            if (nArray2 != null) break block10;
                            int n6 = n3;
                            if (n6 != 0) break block11;
                            break block12;
                        }
                        n4 = n3;
                        iterator = AutoDisable_47kG.recovery$indy$43(client.ClientGlobals.field_48, l, -5744394273523813797L, l7).iterator();
                        n5 = ((int) (iterator.hasNext() ? 1 : 0));
                        if (n5 == 0) break block13;
                        break block14;
                    }
                    this.field_48.clear();
                    n3 = 0;
                    n4 = n3;
                    break block11;
                }
                client.module.Module c_47OQ = (client.module.Module)iterator.next();
                n5 = n2;
                if (n5 < 0) return n4 != 0;
                Object object = c_47OQ;
                net.C_47Pe c_47Pe = (net.C_47Pe)object;
                object = c_47Pe;
                client.setting.BooleanSetting c_47TV = (client.setting.BooleanSetting)object;
                object = c_47TV;
                n3 = ((int) (AutoDisable_47kG.recovery$indy$46(object, -5745755932936526510L, l7) ? 1 : 0));
                int n7 = n3;
                int n8 = AutoDisable_47kG.recovery$indy$48(this, l2, c_47OQ, -5745474979447393115L, l7);
                n3 = n7;
                n4 = n3;
                n5 = n;
                long l9 = l7;
                long l10 = -5744685245805992979L;
                boolean bl = false;
                long l11 = l3;
                object = c_47OQ;
                if (n5 > 0) {
                    AutoDisable_47kG.recovery$indy$49(object, l11, bl, l10, l9);
                    object = this;
                    l9 = l7;
                    l10 = -5746522915184161649L;
                    bl = true;
                    l11 = l5;
                }
                AutoDisable_47kG.recovery$indy$50(object, l11, bl, l10, l9);
            }
            AutoDisable_47kG.recovery$indy$51(this.field_46, -5745152266414215525L, l7);
            AutoDisable_47kG.recovery$indy$52(this.field_42, -5745152266414215525L, l7);
            return n4 != 0;
        }
        java.util.Iterator iterator = AutoDisable_47kG.recovery$indy$43(client.ClientGlobals.field_48, l, -5744394273523813797L, l7).iterator();
        while (true) {
            int n9;
            int n10;
            Object object;
            client.module.Module c_47OQ;
            block16: {
                block15: {
                    int n11;
                    if ((n11 = ((int) (iterator.hasNext() ? 1 : 0))) != 0) {
                        c_47OQ = (client.module.Module)iterator.next();
                        n11 = n2;
                        if (n11 < 0) return n4 != 0;
                        object = c_47OQ;
                        n3 = ((int) (AutoDisable_47kG.recovery$indy$44(object, l6, -5745038853272053600L, l7) ? 1 : 0));
                        n11 = n3;
                        if (n11 == 0) {
                            continue;
                        }
                    } else {
                        AutoDisable_47kG.recovery$indy$51(this.field_46, -5745152266414215525L, l7);
                        AutoDisable_47kG.recovery$indy$52(this.field_42, -5745152266414215525L, l7);
                        return n4 != 0;
                    }
                    object = this.field_47.get(c_47OQ);
                    net.C_47Pe c_47Pe = (net.C_47Pe)object;
                    object = c_47Pe;
                    Object object2 = object;
                    if (object2 == null) continue;
                    object = AutoDisable_47kG.recovery$indy$45(c_47Pe, -5746359504800621579L, l7);
                    client.setting.BooleanSetting c_47TV = (client.setting.BooleanSetting)object;
                    object = c_47TV;
                    object2 = object;
                    if (object2 == null) continue;
                    object = c_47TV;
                    n3 = ((int) (AutoDisable_47kG.recovery$indy$46(object, -5745755932936526510L, l7) ? 1 : 0));
                    n10 = n3;
                    if (n10 == 0) continue;
                    n9 = n3 = AutoDisable_47kG.recovery$indy$47(this, l4, c_47OQ, -5739256731360869736L, l7);
                    int n12 = AutoDisable_47kG.recovery$indy$48(this, l2, c_47OQ, -5745474979447393115L, l7);
                    n3 = n9;
                    n10 = n3;
                    if (n10 > 0) break block15;
                    n3 = n12;
                    n10 = n3;
                    if (n10 <= 0) break block16;
                }
                n3 = 1;
                n4 = n3;
            }
            n10 = n;
            long l12 = l7;
            long l13 = -5744685245805992979L;
            boolean bl = false;
            long l14 = l3;
            object = c_47OQ;
            if (n10 > 0) {
                AutoDisable_47kG.recovery$indy$49(object, l14, bl, l13, l12);
                object = this;
                ((AutoDisable_47kG)object).field_48.add(c_47OQ);
                n3 = n9;
                n10 = n3;
                if (n10 <= 0) continue;
                object = c_47OQ;
                l12 = l7;
                l13 = -5746522915184161649L;
                bl = true;
                l14 = l5;
            }
            AutoDisable_47kG.recovery$indy$50(object, l14, bl, l13, l12);
        }
    }




   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public void method_488$e45a9973e5(long l) {
        int n;
        Object object;
        int[] nArray;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        block21: {
            block33: {
                block31: {
                    block32: {
                        int n2;
                        block30: {
                            int[] nArray2;
                            int[] nArray3;
                            block23: {
                                block24: {
                                    long l8;
                                    long l9;
                                    int n3;
                                    block22: {
                                        block29: {
                                            int[] nArray4;
                                            client.module.Module c_47OQ;
                                            java.util.Iterator iterator;
                                            block27: {
                                                block28: {
                                                    long l10;
                                                    long l11;
                                                    boolean bl;
                                                    block25: {
                                                        block26: {
                                                            Object object2;
                                                            block20: {
                                                                long l12 = l;
                                                                l7 = l12 ^ 0x514DFE5A122CL;
                                                                l6 = l12 ^ 0x7D83F1F8194CL;
                                                                l5 = l12 ^ 0x2A6E1742AED1L;
                                                                l4 = l12 ^ 0x3E8C8B0B0272L;
                                                                l3 = l12 ^ 0x520201C9B36FL;
                                                                l2 = l12 ^ 0x47DF2C7E3E71L;
                                                                nArray = AutoDisable_47kG.recovery$indy$53(-5076055665459371686L, l);
                                                                boolean bl2 = this.field_43a;
                                                                if (!bl2) return;
                                                                object2 = nArray;
                                                                object = field_43;
                                                                if (object2 != null) break block20;
                                                                object2 = AutoDisable_47kG.recovery$indy$54(object, -5077318449441257130L, l);
                                                                if (object2 == null) return;
                                                                object = field_43;
                                                                object2 = AutoDisable_47kG.recovery$indy$55(object, -5077312740768346441L, l);
                                                                if (object2 == null) return;
                                                                n = ((int) (this.field_48.isEmpty() ? 1 : 0));
                                                                int n4 = n;
                                                                if (n4 != 0) {
                                                                    return;
                                                                }
                                                                break block21;
                                                            }
                                                            object2 = AutoDisable_47kG.recovery$indy$55(object, -5077312740768346441L, l);
                                                            if (object2 == null) return;
                                                            n2 = ((int) (this.field_48.isEmpty() ? 1 : 0));
                                                            n3 = n2;
                                                            iterator = this.field_48.iterator();
                                                            int n5 = ((int) (iterator.hasNext() ? 1 : 0));
                                                            if (n5 == 0) break block22;
                                                            c_47OQ = (client.module.Module)iterator.next();
                                                            int n6 = AutoDisable_47kG.recovery$indy$56(this, l6, c_47OQ, -5073485742209021099L, l);
                                                            int n7 = AutoDisable_47kG.recovery$indy$57(this, l3, c_47OQ, -5075922907640840856L, l);
                                                            long l13 = l - 0L;
                                                            n5 = l13 == 0L ? 0 : (l13 < 0L ? -1 : 1);
                                                            nArray3 = nArray;
                                                            n2 = n6;
                                                            if (n5 < 0) break block23;
                                                            int[] nArray5 = nArray3;
                                                            if (nArray5 != null) break block24;
                                                            int n8 = n2;
                                                            n2 = n7;
                                                            int n9 = n2;
                                                            boolean bl3 = AutoDisable_47kG.recovery$indy$58(this.field_46, n6, l2, -5076913118107451160L, l);
                                                            bl = AutoDisable_47kG.recovery$indy$59(this.field_42, n7, l2, -5076913118107451160L, l);
                                                            n2 = n8;
                                                            nArray3 = nArray;
                                                            long l14 = l - 0L;
                                                            long l15 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                                                            if (l15 < 0) break block25;
                                                            int[] nArray6 = nArray3;
                                                            if (nArray6 != null) break block26;
                                                            int n10 = n2;
                                                            if (n10 == 0) break block22;
                                                            n2 = bl3 ? 1 : 0;
                                                        }
                                                        nArray3 = nArray;
                                                    }
                                                    if ((l11 = (l10 = l - 0L) == 0L ? 0 : (l10 < 0L ? -1 : 1)) <= 0) break block27;
                                                    int[] nArray7 = nArray3;
                                                    if (nArray7 != null) break block28;
                                                    int n11 = n2;
                                                    if (n11 == 0) break block22;
                                                    n2 = bl ? 1 : 0;
                                                }
                                                nArray3 = nArray;
                                            }
                                            if ((nArray4 = nArray3) != null) break block29;
                                            int n12 = n2;
                                            if (n12 == 0) break block22;
                                            AutoDisable_47kG.recovery$indy$61(c_47OQ, true, false, l4, -5076498034602951051L, l);
                                            iterator.remove();
                                            n2 = 1;
                                        }
                                        n3 = n2;
                                    }
                                    if ((l9 = (l8 = l - 0L) == 0L ? 0 : (l8 < 0L ? -1 : 1)) <= 0) return;
                                    n2 = n3;
                                }
                                nArray3 = nArray;
                            }
                            if ((nArray2 = nArray3) != null) break block30;
                            int n13 = n2;
                            if (n13 == 0) break block31;
                            break block32;
                        }
                        int n14 = n2;
                        if (n14 == 0) return;
                        object = this;
                        break block33;
                    }
                    AutoDisable_47kG.recovery$indy$64(AutoDisable_47kG.recovery$indy$63(AutoDisable_47kG.recovery$indy$62(-5076631660189877286L, l), -5077498780176815746L, l), l5, -5075604511626554327L, l);
                }
                object = this;
            }
            ((AutoDisable_47kG)object).field_43a = false;
            return;
        }
        n = 0;
        int n15 = n;
        java.util.Iterator iterator = this.field_48.iterator();
        while (true) {
            int[] nArray8;
            long l16;
            long l17;
            long l18;
            long l19;
            boolean bl;
            boolean bl4;
            int[] nArray9;
            client.module.Module c_47OQ;
            block42: {
                block43: {
                    int n16;
                    block41: {
                        int n17;
                        int n18;
                        int n19;
                        block40: {
                            block38: {
                                block39: {
                                    int n20;
                                    int[] nArray10;
                                    block35: {
                                        block37: {
                                            block36: {
                                                int n21;
                                                block34: {
                                                    if ((n21 = ((int) (iterator.hasNext() ? 1 : 0))) == 0) break block34;
                                                    c_47OQ = (client.module.Module)iterator.next();
                                                    n19 = AutoDisable_47kG.recovery$indy$56(this, l6, c_47OQ, -5073485742209021099L, l);
                                                    n18 = AutoDisable_47kG.recovery$indy$57(this, l3, c_47OQ, -5075922907640840856L, l);
                                                    long l20 = l - 0L;
                                                    n21 = l20 == 0L ? 0 : (l20 < 0L ? -1 : 1);
                                                    nArray9 = nArray;
                                                    n = n19;
                                                    if (n21 < 0) break block35;
                                                    break block36;
                                                }
                                                long l21 = l - 0L;
                                                n21 = l21 == 0L ? 0 : (l21 < 0L ? -1 : 1);
                                                if (n21 <= 0) return;
                                                n = n15;
                                                break block37;
                                            }
                                            int[] nArray11 = nArray9;
                                            if (nArray11 != null) break block37;
                                            n17 = n;
                                            if (n17 <= 0) break block38;
                                            break block39;
                                        }
                                        nArray9 = nArray;
                                    }
                                    if ((nArray10 = nArray9) == null) {
                                        int n22 = n;
                                        if (n22 != 0) {
                                            AutoDisable_47kG.recovery$indy$64(AutoDisable_47kG.recovery$indy$63(AutoDisable_47kG.recovery$indy$62(-5076631660189877286L, l), -5077498780176815746L, l), l5, -5075604511626554327L, l);
                                        }
                                        object = this;
                                        n = ((AutoDisable_47kG)object).field_48.isEmpty() ? 1 : 0;
                                    }
                                    if ((n20 = n) == 0) return;
                                    object = this;
                                    ((AutoDisable_47kG)object).field_43a = false;
                                    return;
                                }
                                n = 1;
                                break block40;
                            }
                            n = 0;
                        }
                        int n23 = n;
                        n = n18;
                        n17 = n;
                        n = n17 > 0 ? 1 : 0;
                        n16 = n;
                        bl4 = AutoDisable_47kG.recovery$indy$58(this.field_46, n19, l2, -5076913118107451160L, l);
                        bl = AutoDisable_47kG.recovery$indy$59(this.field_42, n18, l2, -5076913118107451160L, l);
                        n = n23;
                        n17 = n;
                        if (n17 == 0) break block41;
                        long l22 = l - 0L;
                        n17 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
                        nArray9 = nArray;
                        n = bl4 ? 1 : 0;
                        if (n17 < 0) break block42;
                        int[] nArray12 = nArray9;
                        if (nArray12 != null) break block43;
                        n17 = n;
                        if (n17 != 0) {
                            AutoDisable_47kG.recovery$indy$60(c_47OQ, l7, false, -5076273477679954622L, l);
                        }
                    }
                    n = n16;
                }
                nArray9 = nArray;
            }
            if ((l19 = (l18 = l - 0L) == 0L ? 0 : (l18 < 0L ? -1 : 1)) >= 0) {
                int[] nArray13 = nArray9;
                if (nArray13 == null) {
                    int n24 = n;
                    if (n24 == 0) continue;
                    n = bl4 ? 1 : 0;
                }
                nArray9 = nArray;
            }
            if ((l17 = (l16 = l - 0L) == 0L ? 0 : (l16 < 0L ? -1 : 1)) > 0) {
                int[] nArray14 = nArray9;
                if (nArray14 == null) {
                    int n25 = n;
                    if (n25 == 0) continue;
                    n = bl ? 1 : 0;
                }
                nArray9 = nArray;
            }
            if ((nArray8 = nArray9) == null) {
                int n26 = n;
                if (n26 == 0) continue;
                AutoDisable_47kG.recovery$indy$61(c_47OQ, true, false, l4, -5076498034602951051L, l);
                iterator.remove();
                n = 1;
            }
            n15 = n;
        }
    }




    public AutoDisable_47kG(int a0,short a1,int a2) {
        super((java.lang.String) ("AutoDisable"),(java.lang.String) ("AutoAusschalten"),(long) (((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.AutoDisable_47kG.a) ^ 27451285149930L)),(java.awt.Color) (new java.awt.Color((int) (169),(int) (224),(int) (81))),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = (((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.AutoDisable_47kG.a);
        long constructorKey2 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.AutoDisable_47kG.a) ^ 91549668042791L);
        long constructorKey3 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.AutoDisable_47kG.a) ^ 116355021882609L);
        long constructorKey4 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.AutoDisable_47kG.a) ^ 75364611357558L);
        client.setting.BooleanSetting initialized5 = new client.setting.BooleanSetting(this, constructorKey3, "Disable on Teleport", false);
        recovery$indy$flow$194(this, initialized5);
        client.setting.NumberSetting initialized6 = new client.setting.NumberSetting(this, "Min teleport distance", Double.longBitsToDouble(4632233691727265792L), constructorKey4, 0.0D, Double.longBitsToDouble(4652007308841189376L), 1);
        java.lang.Object initialValue7 = ((java.lang.Object)(((augustus.recovered.modules.misc.AutoDisable_47kG) (((java.lang.Object)(this)))).settingDisableOnTeleport));
        java.lang.Object initialValue8 = recovery$indy$flow$198(initialValue7);
        java.lang.Object initialValue9 = recovery$indy$flow$199(initialValue7);
        java.lang.Object initialValue10 = initialValue9;
        client.setting.NumberSetting initialValue11 = initialized6;
        java.lang.Object initialValue12 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue11))))));
        java.lang.Object initialValue13 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue10))))));
        java.lang.Object initialValue14 = recovery$indy$flow$202(initialValue12, initialValue13);
        recovery$indy$flow$203(this, initialValue14);
        java.lang.Object initialValue15 = recovery$indy$flow$205(2);
        ((java.lang.Object[]) initialValue15)[0] = "Simple";
        ((java.lang.Object[]) initialValue15)[1] = "Expert";
        client.setting.ModeSetting initialized16 = new client.setting.ModeSetting(this, "Mode", constructorKey2, "Simple", (java.lang.String[]) (initialValue15));
        recovery$indy$flow$207(this, initialized16);
        client.setting.NumberSetting initialized17 = new client.setting.NumberSetting(this, "Forcedisable modules for x ms", 0.0D, constructorKey4, 0.0D, Double.longBitsToDouble(4662219572839972864L), 0);
        java.lang.Object initialValue18 = recovery$indy$flow$210(this);
        java.lang.Object initialValue19 = initialValue18;
        client.setting.NumberSetting initialValue20 = initialized17;
        java.lang.Object initialValue21 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue20))))));
        java.lang.Object initialValue22 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue23 = recovery$indy$flow$213(initialValue21, initialValue22);
        recovery$indy$flow$214(this, initialValue23);
        client.setting.NumberSetting initialized24 = new client.setting.NumberSetting(this, "Retoggle modules after x ms", 0.0D, constructorKey4, 0.0D, Double.longBitsToDouble(4662219572839972864L), 0);
        java.lang.Object initialValue25 = recovery$indy$flow$217(this);
        java.lang.Object initialValue26 = initialValue25;
        client.setting.NumberSetting initialValue27 = initialized24;
        java.lang.Object initialValue28 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue27))))));
        java.lang.Object initialValue29 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue30 = recovery$indy$flow$220(initialValue28, initialValue29);
        recovery$indy$flow$221(this, initialValue30);
        java.util.HashMap initialized31 = new java.util.HashMap();
        recovery$indy$flow$224(this, initialized31);
        recovery$indy$flow$225(this, false);
        net.C_47cu initialized32 = new net.C_47cu();
        recovery$indy$flow$228(this, initialized32);
        net.C_47cu initialized33 = new net.C_47cu();
        recovery$indy$flow$231(this, initialized33);
        java.util.HashSet initialized34 = new java.util.HashSet();
        recovery$indy$flow$234(this, initialized34);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native void recovery$indy$flow$194(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$198(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$199(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$202(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$203(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$205(int a0);
    private static native void recovery$indy$flow$207(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$210(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$213(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$214(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$217(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$220(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$221(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$224(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$225(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.AutoDisable_47kG) (a0)).field_43a = a1;
        return;
    }
    private static native void recovery$indy$flow$228(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$231(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$234(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native String recovery$indy$2(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$3(int var0, long var1);
   private static native double recovery$indy$4(Object var0, boolean var1, long var2, long var4, long var6);
   private static native double recovery$indy$5(Object var0, boolean var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$6(long var0, long var2);
   private static native String recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$8(int var0, long var1);
   private static native double recovery$indy$9(Object var0, boolean var1, long var2, long var4, long var6);
   private static native double recovery$indy$10(Object var0, boolean var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$11(long var0, long var2);
   private static native Category[] recovery$indy$12(long var0, long var2);
   private static native List recovery$indy$13(Object var0, Object var1, int var2, short var3, int var4, long var5, long var7);
   private static native String recovery$indy$14(Object var0, long var1, long var3);
   private static native String recovery$indy$15(Object var0, long var1, long var3);
   private static native String recovery$indy$16(int var0, long var1);
   private static native C_45n recovery$indy$17(AutoDisable_47kG var0, BooleanSetting var1);
   private static native SettingGroup recovery$indy$18(Object var0, int var1, char var2, int var3, Object var4, long var5, long var7);
   private static native String recovery$indy$19(Object var0, short var1, short var2, int var3, long var4, long var6);
   private static native String recovery$indy$20(int var0, long var1);
   private static native String recovery$indy$21(int var0, long var1);
   private static native NumberSetting recovery$indy$22(Object var0, int var1, Object var2, int var3, short var4, long var5, long var7);
   private static native String recovery$indy$23(Object var0, short var1, short var2, int var3, long var4, long var6);
   private static native String recovery$indy$24(int var0, long var1);
   private static native String recovery$indy$25(int var0, long var1);
   private static native NumberSetting recovery$indy$26(Object var0, int var1, Object var2, int var3, short var4, long var5, long var7);
   private static native boolean recovery$indy$27(Object var0, int var1, byte var2, int var3, long var4, long var6);
   private static native int[] recovery$indy$28(long var0, long var2);
   private static native C_473U recovery$indy$29(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$30(Object var0, long var1, long var3);
   private static native C_473U recovery$indy$31(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$33(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$34(Object var0, long var1, long var3);
   private static native double recovery$indy$35(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$36(Object var0, int var1, byte var2, int var3, long var4, long var6);
   private static native String recovery$indy$37(int var0, long var1);
   private static native void recovery$indy$38(long var0, Object var2, long var3, long var5);
   private static native void recovery$indy$39(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$40(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$41(Object var0, int var1, long var2, long var4, long var6);
   private static native int[] recovery$indy$42(long var0, long var2);
   private static native CopyOnWriteArrayList recovery$indy$43(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$44(Object var0, long var1, long var3, long var5);
   private static native Object recovery$indy$45(Object var0, long var1, long var3);
   private static native boolean recovery$indy$46(Object var0, long var1, long var3);
   private static native int recovery$indy$47(Object var0, long var1, Object var3, long var4, long var6);
   private static native int recovery$indy$48(Object var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$49(Object var0, long var1, boolean var3, long var4, long var6);
   private static native void recovery$indy$50(Object var0, long var1, boolean var3, long var4, long var6);
   private static native void recovery$indy$51(Object var0, long var1, long var3);
   private static native void recovery$indy$52(Object var0, long var1, long var3);
   private static native int[] recovery$indy$53(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$54(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$55(Object var0, long var1, long var3);
   private static native int recovery$indy$56(Object var0, long var1, Object var3, long var4, long var6);
   private static native int recovery$indy$57(Object var0, long var1, Object var3, long var4, long var6);
   private static native boolean recovery$indy$58(Object var0, long var1, long var3, long var5, long var7);
   private static native boolean recovery$indy$59(Object var0, long var1, long var3, long var5, long var7);
   private static native void recovery$indy$60(Object var0, long var1, boolean var3, long var4, long var6);
   private static native void recovery$indy$61(Object var0, boolean var1, boolean var2, long var3, long var5, long var7);
   private static native Client recovery$indy$62(long var0, long var2);
   private static native ModuleManager recovery$indy$63(Object var0, long var1, long var3);
   private static native void recovery$indy$64(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$68();
}
