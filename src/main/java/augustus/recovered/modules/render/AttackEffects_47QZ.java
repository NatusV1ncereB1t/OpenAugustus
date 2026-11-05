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
import net.C_42a;
import net.C_45n;
import net.C_473P;
import net.C_477z;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47bs;
import net.C_47si;
import client.module.Category;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AttackEffects_47QZ extends client.module.Module implements net.C_47si {
    private final java.util.Map field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.

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

    public void method_41$426c33b229(net.C_477z event, long eventKey) {
        long particleCountKey = eventKey ^ 46613554740368L;
        Object flowGuard = recovery$indy$flow$1(8137889803384065761L, eventKey);
        if (recovery$indy$flow$2(event, 8136908238013456666L, eventKey) == null) {
            return;
        }
        Object entries = recovery$indy$flow$5(recovery$indy$flow$4(((java.lang.Object)(((augustus.recovered.modules.render.AttackEffects_47QZ) (((java.lang.Object)(this)))).field_45))));
        while (recovery$indy$flow$6(entries)) {
            Object entry = ((java.lang.Object)(((java.util.Map.Entry) (((java.lang.Object)(recovery$indy$flow$7(entries)))))));
            Object effectSettings = ((java.lang.Object)(((net.C_42a) (((java.lang.Object)(recovery$indy$flow$9(entry)))))));
            Object enabledSetting = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(recovery$indy$flow$11(effectSettings, 8137011209970112681L, eventKey)))))));
            boolean enabled = recovery$indy$flow$13(enabledSetting, 8137790612210156542L, eventKey);
            if (flowGuard == null && !enabled) {
                continue;
            }
            int particleIndex = flowGuard != null && enabled ? 1 : 0;
            try {
                while (true) {
                    Object currentSettings = ((java.lang.Object)(((net.C_42a) (((java.lang.Object)(recovery$indy$flow$14(entry)))))));
                    Object countSetting = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(recovery$indy$flow$16(currentSettings, 8137106077325771033L, eventKey)))))));
                    double particleCount = recovery$indy$flow$18(countSetting, particleCountKey, 8137800390063857643L, eventKey);
                    if ((double) particleIndex < particleCount) {
                        Object renderer = recovery$indy$flow$20(recovery$indy$flow$19(), 8137228358202374652L, eventKey);
                        Object target = recovery$indy$flow$21(event, 8136908238013456666L, eventKey);
                        Object particle = ((java.lang.Object)(((net.C_473P) (((java.lang.Object)(recovery$indy$flow$22(entry)))))));
                        recovery$indy$flow$24(renderer, target, particle);
                        particleIndex++;
                        if (eventKey < 0L) {
                            break;
                        }
                        if (flowGuard != null) {
                            return;
                        }
                    } else {
                        if (eventKey != 0L) {
                            break;
                        }
                        if (flowGuard != null) {
                            return;
                        }
                    }
                }
            } catch (Throwable error) {
                if (!recovery$indy$flow$0(error)) {
                    recovery.flow.BytecodeFrame.rethrow(error);
                }
            }
            if (flowGuard != null) {
                return;
            }
        }
    }



   private String method_48$e168718026(long var1, String var3) {
      var1 = a ^ var1;
      var3 = var3.replace("_", " ");
      int[] var10000 = recovery$indy$9(6907586267286938066L, var1);
      StringBuilder var5 = new StringBuilder();
      int[] var4 = var10000;
      char[] var6 = var3.toCharArray();
      int var7 = 0;

      while (var7 < var6.length) {
         label54: {
            label53: {
               char var8;
               label62: {
                  var8 = var6[var7];
                  var10000 = var4;
                  if (var1 > 0L) {
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

                  if (var1 <= 0L) {
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



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$10(this, 1, var3, -7099724328209984327L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public AttackEffects_47QZ(long a0) {
        super((java.lang.String) ("AttackEffects"),(java.lang.String) ("AngriffEffekte"),(long) (((augustus.recovered.modules.render.AttackEffects_47QZ.a ^ a0) ^ 139758531870206L)),(java.awt.Color) (new java.awt.Color((int) (36),(int) (169),(int) (176))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.render.AttackEffects_47QZ.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.render.AttackEffects_47QZ.a ^ a0) ^ 15636130669029L);
        long constructorKey4 = ((augustus.recovered.modules.render.AttackEffects_47QZ.a ^ a0) ^ 28847581824705L);
        long constructorKey5 = ((augustus.recovered.modules.render.AttackEffects_47QZ.a ^ a0) ^ 38897931230818L);
        java.util.HashMap initialized6 = new java.util.HashMap();
        recovery$indy$flow$39(this, initialized6);
        java.lang.Object initialValue7 = recovery$indy$flow$40();
        java.lang.Object initialValue8 = recovery$indy$flow$41();
        java.lang.Object initialValue9 = initialValue8;
        int length10 = java.lang.reflect.Array.getLength(initialValue9);
        int initialValue11 = length10;
        java.lang.Object initialValue12 = initialValue7;
        int initialValue13 = 0;
        AttackEffects_47QZ loopLocal14 = this;
        long loopLocal15 = constructorKey2;
        long loopLocal16 = constructorKey3;
        long loopLocal17 = constructorKey4;
        long loopLocal18 = constructorKey5;
        java.lang.Object loopLocal19 = initialValue9;
        int loopLocal20 = initialValue11;
        java.lang.Object loopLocal21 = initialValue12;
        int loopLocal22 = initialValue13;
        loop23: while (true) {
            if (loopLocal22 >= loopLocal20) {
                return;
            } else {
                java.lang.Object arrayValue24 = ((java.lang.Object[]) loopLocal19)[loopLocal22];
                java.lang.Object initialValue25 = arrayValue24;
                int initialValue26 = recovery$indy$flow$42(initialValue25);
                if (loopLocal21 != null) {
                    if (initialValue26 > 36) {
                        java.lang.StringBuilder initialized27 = new java.lang.StringBuilder();
                        java.lang.Object initialValue28 = recovery$indy$flow$47(initialized27, "Use ");
                        java.lang.Object initialValue29 = recovery$indy$flow$48(initialValue25);
                        java.lang.Object initialValue30 = initialValue29;
                        long initialValue31 = loopLocal17;
                        AttackEffects_47QZ initialValue32 = loopLocal14;
                        java.lang.Object initialValue33 = ((java.lang.Object)(((augustus.recovered.modules.render.AttackEffects_47QZ) (((java.lang.Object)(initialValue32))))));
                        java.lang.Object initialValue34 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue30))))));
                        java.lang.Object initialValue35 = recovery$indy$flow$51(initialValue33, initialValue31, initialValue34);
                        java.lang.Object initialValue36 = recovery$indy$flow$52(initialValue28, initialValue35);
                        java.lang.Object initialValue37 = recovery$indy$flow$53(initialValue36);
                        client.setting.BooleanSetting initialized38 = new client.setting.BooleanSetting((client.module.Module) (loopLocal14), loopLocal16, (java.lang.String) (initialValue37), false);
                        client.setting.BooleanSetting initialValue39 = initialized38;
                        java.lang.StringBuilder initialized40 = new java.lang.StringBuilder();
                        java.lang.Object initialValue41 = recovery$indy$flow$58(initialValue25);
                        java.lang.Object initialValue42 = initialValue41;
                        long initialValue43 = loopLocal17;
                        AttackEffects_47QZ initialValue44 = loopLocal14;
                        java.lang.Object initialValue45 = ((java.lang.Object)(((augustus.recovered.modules.render.AttackEffects_47QZ) (((java.lang.Object)(initialValue44))))));
                        java.lang.Object initialValue46 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue42))))));
                        java.lang.Object initialValue47 = recovery$indy$flow$61(initialValue45, initialValue43, initialValue46);
                        java.lang.Object initialValue48 = recovery$indy$flow$62(initialized40, initialValue47);
                        java.lang.Object initialValue49 = recovery$indy$flow$63(initialValue48, " Count ");
                        java.lang.Object initialValue50 = recovery$indy$flow$64(initialValue49);
                        client.setting.NumberSetting initialized51 = new client.setting.NumberSetting((client.module.Module) (loopLocal14), (java.lang.String) (initialValue50), 1.0D, loopLocal18, 1.0D, Double.longBitsToDouble(4626322717216342016L), 0);
                        java.lang.Object initialValue52 = recovery$indy$flow$66(initialValue39);
                        java.lang.Object initialValue53 = recovery$indy$flow$67(initialValue39);
                        java.lang.Object initialValue54 = initialValue53;
                        client.setting.NumberSetting initialValue55 = initialized51;
                        java.lang.Object initialValue56 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue55))))));
                        java.lang.Object initialValue57 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue54))))));
                        java.lang.Object initialValue58 = recovery$indy$flow$70(initialValue56, initialValue57);
                        java.lang.Object initialValue59 = initialValue58;
                        java.lang.Object initialValue60 = ((java.lang.Object)(((augustus.recovered.modules.render.AttackEffects_47QZ) (((java.lang.Object)(loopLocal14)))).field_45));
                        net.C_42a initialized61 = new net.C_42a(initialValue39, initialValue59);
                        java.lang.Object initialValue62 = recovery$indy$flow$74(initialValue60, initialValue25, initialized61);
                        int incremented63 = loopLocal22 + (1);
                        if (loopLocal21 == null) {
                            AttackEffects_47QZ loopNext64 = loopLocal14;
                            long loopNext65 = loopLocal15;
                            long loopNext66 = loopLocal16;
                            long loopNext67 = loopLocal17;
                            long loopNext68 = loopLocal18;
                            java.lang.Object loopNext69 = loopLocal19;
                            int loopNext70 = loopLocal20;
                            java.lang.Object loopNext71 = loopLocal21;
                            int loopNext72 = incremented63;
                            loopLocal14 = loopNext64;
                            loopLocal15 = loopNext65;
                            loopLocal16 = loopNext66;
                            loopLocal17 = loopNext67;
                            loopLocal18 = loopNext68;
                            loopLocal19 = loopNext69;
                            loopLocal20 = loopNext70;
                            loopLocal21 = loopNext71;
                            loopLocal22 = loopNext72;
                            continue loop23;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    if (initialValue26 < 36) {
                        java.lang.StringBuilder initialized73 = new java.lang.StringBuilder();
                        java.lang.Object initialValue74 = recovery$indy$flow$47(initialized73, "Use ");
                        java.lang.Object initialValue75 = recovery$indy$flow$48(initialValue25);
                        java.lang.Object initialValue76 = initialValue75;
                        long initialValue77 = loopLocal17;
                        AttackEffects_47QZ initialValue78 = loopLocal14;
                        java.lang.Object initialValue79 = ((java.lang.Object)(((augustus.recovered.modules.render.AttackEffects_47QZ) (((java.lang.Object)(initialValue78))))));
                        java.lang.Object initialValue80 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue76))))));
                        java.lang.Object initialValue81 = recovery$indy$flow$51(initialValue79, initialValue77, initialValue80);
                        java.lang.Object initialValue82 = recovery$indy$flow$52(initialValue74, initialValue81);
                        java.lang.Object initialValue83 = recovery$indy$flow$53(initialValue82);
                        client.setting.BooleanSetting initialized84 = new client.setting.BooleanSetting((client.module.Module) (loopLocal14), loopLocal16, (java.lang.String) (initialValue83), false);
                        client.setting.BooleanSetting initialValue85 = initialized84;
                        java.lang.StringBuilder initialized86 = new java.lang.StringBuilder();
                        java.lang.Object initialValue87 = recovery$indy$flow$58(initialValue25);
                        java.lang.Object initialValue88 = initialValue87;
                        long initialValue89 = loopLocal17;
                        AttackEffects_47QZ initialValue90 = loopLocal14;
                        java.lang.Object initialValue91 = ((java.lang.Object)(((augustus.recovered.modules.render.AttackEffects_47QZ) (((java.lang.Object)(initialValue90))))));
                        java.lang.Object initialValue92 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue88))))));
                        java.lang.Object initialValue93 = recovery$indy$flow$61(initialValue91, initialValue89, initialValue92);
                        java.lang.Object initialValue94 = recovery$indy$flow$62(initialized86, initialValue93);
                        java.lang.Object initialValue95 = recovery$indy$flow$63(initialValue94, " Count ");
                        java.lang.Object initialValue96 = recovery$indy$flow$64(initialValue95);
                        client.setting.NumberSetting initialized97 = new client.setting.NumberSetting((client.module.Module) (loopLocal14), (java.lang.String) (initialValue96), 1.0D, loopLocal18, 1.0D, Double.longBitsToDouble(4626322717216342016L), 0);
                        java.lang.Object initialValue98 = recovery$indy$flow$66(initialValue85);
                        java.lang.Object initialValue99 = recovery$indy$flow$67(initialValue85);
                        java.lang.Object initialValue100 = initialValue99;
                        client.setting.NumberSetting initialValue101 = initialized97;
                        java.lang.Object initialValue102 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue101))))));
                        java.lang.Object initialValue103 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue100))))));
                        java.lang.Object initialValue104 = recovery$indy$flow$70(initialValue102, initialValue103);
                        java.lang.Object initialValue105 = initialValue104;
                        java.lang.Object initialValue106 = ((java.lang.Object)(((augustus.recovered.modules.render.AttackEffects_47QZ) (((java.lang.Object)(loopLocal14)))).field_45));
                        net.C_42a initialized107 = new net.C_42a(initialValue85, initialValue105);
                        java.lang.Object initialValue108 = recovery$indy$flow$74(initialValue106, initialValue25, initialized107);
                        int incremented109 = loopLocal22 + (1);
                        if (loopLocal21 == null) {
                            AttackEffects_47QZ loopNext110 = loopLocal14;
                            long loopNext111 = loopLocal15;
                            long loopNext112 = loopLocal16;
                            long loopNext113 = loopLocal17;
                            long loopNext114 = loopLocal18;
                            java.lang.Object loopNext115 = loopLocal19;
                            int loopNext116 = loopLocal20;
                            java.lang.Object loopNext117 = loopLocal21;
                            int loopNext118 = incremented109;
                            loopLocal14 = loopNext110;
                            loopLocal15 = loopNext111;
                            loopLocal16 = loopNext112;
                            loopLocal17 = loopNext113;
                            loopLocal18 = loopNext114;
                            loopLocal19 = loopNext115;
                            loopLocal20 = loopNext116;
                            loopLocal21 = loopNext117;
                            loopLocal22 = loopNext118;
                            continue loop23;
                        } else {
                            return;
                        }
                    } else {
                        int initialValue119 = recovery$indy$flow$43(initialValue25);
                        if (initialValue119 > 38) {
                            java.lang.StringBuilder initialized120 = new java.lang.StringBuilder();
                            java.lang.Object initialValue121 = recovery$indy$flow$47(initialized120, "Use ");
                            java.lang.Object initialValue122 = recovery$indy$flow$48(initialValue25);
                            java.lang.Object initialValue123 = initialValue122;
                            long initialValue124 = loopLocal17;
                            AttackEffects_47QZ initialValue125 = loopLocal14;
                            java.lang.Object initialValue126 = ((java.lang.Object)(((augustus.recovered.modules.render.AttackEffects_47QZ) (((java.lang.Object)(initialValue125))))));
                            java.lang.Object initialValue127 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue123))))));
                            java.lang.Object initialValue128 = recovery$indy$flow$51(initialValue126, initialValue124, initialValue127);
                            java.lang.Object initialValue129 = recovery$indy$flow$52(initialValue121, initialValue128);
                            java.lang.Object initialValue130 = recovery$indy$flow$53(initialValue129);
                            client.setting.BooleanSetting initialized131 = new client.setting.BooleanSetting((client.module.Module) (loopLocal14), loopLocal16, (java.lang.String) (initialValue130), false);
                            client.setting.BooleanSetting initialValue132 = initialized131;
                            java.lang.StringBuilder initialized133 = new java.lang.StringBuilder();
                            java.lang.Object initialValue134 = recovery$indy$flow$58(initialValue25);
                            java.lang.Object initialValue135 = initialValue134;
                            long initialValue136 = loopLocal17;
                            AttackEffects_47QZ initialValue137 = loopLocal14;
                            java.lang.Object initialValue138 = ((java.lang.Object)(((augustus.recovered.modules.render.AttackEffects_47QZ) (((java.lang.Object)(initialValue137))))));
                            java.lang.Object initialValue139 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue135))))));
                            java.lang.Object initialValue140 = recovery$indy$flow$61(initialValue138, initialValue136, initialValue139);
                            java.lang.Object initialValue141 = recovery$indy$flow$62(initialized133, initialValue140);
                            java.lang.Object initialValue142 = recovery$indy$flow$63(initialValue141, " Count ");
                            java.lang.Object initialValue143 = recovery$indy$flow$64(initialValue142);
                            client.setting.NumberSetting initialized144 = new client.setting.NumberSetting((client.module.Module) (loopLocal14), (java.lang.String) (initialValue143), 1.0D, loopLocal18, 1.0D, Double.longBitsToDouble(4626322717216342016L), 0);
                            java.lang.Object initialValue145 = recovery$indy$flow$66(initialValue132);
                            java.lang.Object initialValue146 = recovery$indy$flow$67(initialValue132);
                            java.lang.Object initialValue147 = initialValue146;
                            client.setting.NumberSetting initialValue148 = initialized144;
                            java.lang.Object initialValue149 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue148))))));
                            java.lang.Object initialValue150 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue147))))));
                            java.lang.Object initialValue151 = recovery$indy$flow$70(initialValue149, initialValue150);
                            java.lang.Object initialValue152 = initialValue151;
                            java.lang.Object initialValue153 = ((java.lang.Object)(((augustus.recovered.modules.render.AttackEffects_47QZ) (((java.lang.Object)(loopLocal14)))).field_45));
                            net.C_42a initialized154 = new net.C_42a(initialValue132, initialValue152);
                            java.lang.Object initialValue155 = recovery$indy$flow$74(initialValue153, initialValue25, initialized154);
                            int incremented156 = loopLocal22 + (1);
                            if (loopLocal21 == null) {
                                AttackEffects_47QZ loopNext157 = loopLocal14;
                                long loopNext158 = loopLocal15;
                                long loopNext159 = loopLocal16;
                                long loopNext160 = loopLocal17;
                                long loopNext161 = loopLocal18;
                                java.lang.Object loopNext162 = loopLocal19;
                                int loopNext163 = loopLocal20;
                                java.lang.Object loopNext164 = loopLocal21;
                                int loopNext165 = incremented156;
                                loopLocal14 = loopNext157;
                                loopLocal15 = loopNext158;
                                loopLocal16 = loopNext159;
                                loopLocal17 = loopNext160;
                                loopLocal18 = loopNext161;
                                loopLocal19 = loopNext162;
                                loopLocal20 = loopNext163;
                                loopLocal21 = loopNext164;
                                loopLocal22 = loopNext165;
                                continue loop23;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }




    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static boolean recovery$indy$flow$0(java.lang.Object a0) {
        return (a0 instanceof java.lang.Exception);
    }
    private static native java.lang.Object recovery$indy$flow$1(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$2(java.lang.Object a0,long a1,long a2);

    private static java.lang.Object recovery$indy$flow$4(java.lang.Object a0) {
        return ((java.util.Map) (a0)).entrySet();
    }
    private static java.lang.Object recovery$indy$flow$5(java.lang.Object a0) {
        return ((java.util.Set) (a0)).iterator();
    }
    private static boolean recovery$indy$flow$6(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).hasNext();
    }
    private static java.lang.Object recovery$indy$flow$7(java.lang.Object a0) {
        return ((java.util.Iterator) (a0)).next();
    }

    private static java.lang.Object recovery$indy$flow$9(java.lang.Object a0) {
        return ((java.util.Map.Entry) (a0)).getValue();
    }

    private static native java.lang.Object recovery$indy$flow$11(java.lang.Object a0,long a1,long a2);

    private static native boolean recovery$indy$flow$13(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$14(java.lang.Object a0) {
        return ((java.util.Map.Entry) (a0)).getValue();
    }

    private static native java.lang.Object recovery$indy$flow$16(java.lang.Object a0,long a1,long a2);

    private static native double recovery$indy$flow$18(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$19() {
        return augustus.recovered.modules.render.AttackEffects_47QZ.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$20(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$21(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$22(java.lang.Object a0) {
        return ((java.util.Map.Entry) (a0)).getKey();
    }

    private static native void recovery$indy$flow$24(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2);
    private static native void recovery$indy$flow$39(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$40();
    private static native java.lang.Object recovery$indy$flow$41();
    private static native int recovery$indy$flow$42(java.lang.Object a0);
    private static native int recovery$indy$flow$43(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$47(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$48(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$51(java.lang.Object a0,long a1,java.lang.Object a2);
    private static java.lang.Object recovery$indy$flow$52(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$53(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native java.lang.Object recovery$indy$flow$58(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$61(java.lang.Object a0,long a1,java.lang.Object a2);
    private static java.lang.Object recovery$indy$flow$62(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$63(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$64(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static java.lang.Object recovery$indy$flow$66(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$67(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$70(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$74(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.Map) (a0)).put(a1, a2);
    }
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$9(long var0, long var2);
   private static native void recovery$indy$10(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$12();
}
