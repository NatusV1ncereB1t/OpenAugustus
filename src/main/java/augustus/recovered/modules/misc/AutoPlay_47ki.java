package augustus.recovered.modules.misc;
import java.awt.Color;
import java.io.IOException;
import java.io.PrintStream;
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
import net.C_42R;
import net.C_43r;
import net.C_45n;
import net.C_473U;
import net.C_475c;
import net.C_475e;
import net.C_476q;
import net.C_47AL;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import net.C_47LW;
import client.gui.ClickGuiScreen;
import net.minecraft.client.gui.GuiScreen;
import net.C_47MM;
import net.C_47MO;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import client.event.RenderListener;
import net.C_47cu;
import net.C_47i;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import net.C_47ob;
import net.C_47oo;
import net.C_47ph;
import net.C_47q3;
import net.C_47rf;
import net.C_47sT;
import client.module.Category;
import net.C_47xz;
import net.C_48T;
import net.C_4f;
import org.lwjgl.input.Mouse;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoPlay_47ki extends client.module.Module implements net.C_47oO,net.C_47UH,net.C_47xz,client.event.RenderListener,net.C_47iC,net.C_48T {
    private final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingGamemodeMMC = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingGamemodeKit1v1 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingGamemodeGamster = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingRemoveEscape = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCancelSound = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingHotbarItemID = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingChestslot = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSetSlotAfterRespawn = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingDelayToSetSlowAfterRespawn = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingSlotToSetAfterRespawn = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_48z = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_48E = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private float field_48H; // Runtime access flags and ConstantValue are restored from the original class.
    public float[] field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native java.lang.reflect.Method d(long a0,long a1);

    public void method_41$fae8de1664(C_475c c_475c) {
        block59: {
            int n;
            block62: {
                C_47rf c_47rf;
                int[] nArray;
                block61: {
                    long l;
                    long l2;
                    block60: {
                        long l3;
                        block58: {
                            block56: {
                                long l4;
                                block57: {
                                    long l5;
                                    block52: {
                                        block53: {
                                            block54: {
                                                block55: {
                                                    long l6;
                                                    block48: {
                                                        block49: {
                                                            block50: {
                                                                block51: {
                                                                    block46: {
                                                                        block47: {
                                                                            block44: {
                                                                                block45: {
                                                                                    block42: {
                                                                                        block43: {
                                                                                            block40: {
                                                                                                block41: {
                                                                                                    long l7;
                                                                                                    long l8 = l7 = a ^ 0x7546327BC005L;
                                                                                                    l2 = l8 ^ 0x3A17FA34D2A7L;
                                                                                                    l5 = l8 ^ 0x2870DF58ECFEL;
                                                                                                    l3 = l8 ^ 0x4754E262FC26L;
                                                                                                    l4 = l8 ^ 0x1415E9006570L;
                                                                                                    l = l8 ^ 0x167B60182772L;
                                                                                                    l6 = l8 ^ 0x1EECAFDD29FL;
                                                                                                    nArray = ClientSettings_47kr.method_46$d4d28024c9();
                                                                                                    Minecraft c_47nT = field_43;
                                                                                                    if (nArray == null) {
                                                                                                        Minecraft c_47nT2 = c_47nT;
                                                                                                        if (!c_47nT2.method_44$aae029aa0a()) {
                                                                                                            return;
                                                                                                        }
                                                                                                        c_47nT = field_43;
                                                                                                    }
                                                                                                    Minecraft c_47nT3 = c_47nT;
                                                                                                    Minecraft c_47nT4 = field_43;
                                                                                                    C_47rf c_47rf2 = c_47rf = c_47nT3.field_42P.field_429.method_46$4c10532da1(c_47nT4.field_42P.field_42X.field_42 + 36).method_48$ac4db64966();
                                                                                                    if (nArray == null) {
                                                                                                        if (c_47rf2 == null) {
                                                                                                            return;
                                                                                                        }
                                                                                                        c_47rf2 = c_47rf;
                                                                                                    }
                                                                                                    n = ((int) (c_47rf2.method_44$0e30dfc966().contains("Unranked") ? 1 : 0));
                                                                                                    if (nArray != null) break block40;
                                                                                                    if (n == 0) break block41;
                                                                                                    long l9 = l4;
                                                                                                    ModeSetting c_47Tj = this.settingMode;
                                                                                                    n = ((int) (c_47Tj.method_46$5f9dc63072(l9).equals("MinemenUnranked") ? 1 : 0));
                                                                                                    if (nArray != null) break block40;
                                                                                                    if (n != 0) {
                                                                                                        int n2 = 1;
                                                                                                        C_475c c_475c2 = c_475c;
                                                                                                        c_475c2.method_48$d00df7729d(n2);
                                                                                                    }
                                                                                                }
                                                                                                n = ((int) (c_47rf.method_44$0e30dfc966().contains("Unranked") ? 1 : 0));
                                                                                            }
                                                                                            if (nArray != null) break block42;
                                                                                            if (n != 0) break block43;
                                                                                            n = ((int) (c_47rf.method_44$0e30dfc966().contains("Ranked") ? 1 : 0));
                                                                                            if (nArray != null) break block42;
                                                                                            if (n == 0) break block43;
                                                                                            long l10 = l4;
                                                                                            ModeSetting c_47Tj = this.settingMode;
                                                                                            n = ((int) (c_47Tj.method_46$5f9dc63072(l10).equals("MinemenRanked") ? 1 : 0));
                                                                                            if (nArray != null) break block42;
                                                                                            if (n != 0) {
                                                                                                int n3 = 1;
                                                                                                C_475c c_475c3 = c_475c;
                                                                                                c_475c3.method_48$d00df7729d(n3);
                                                                                            }
                                                                                        }
                                                                                        n = ((int) (c_47rf.method_44$0e30dfc966().contains("Play Again") ? 1 : 0));
                                                                                    }
                                                                                    if (nArray != null) break block44;
                                                                                    if (n == 0) break block45;
                                                                                    long l11 = l4;
                                                                                    ModeSetting c_47Tj = this.settingMode;
                                                                                    n = ((int) (c_47Tj.method_46$5f9dc63072(l11).equals("MinemenUnranked") ? 1 : 0));
                                                                                    if (nArray != null) break block44;
                                                                                    if (n != 0) {
                                                                                        int n4 = 1;
                                                                                        C_475c c_475c4 = c_475c;
                                                                                        c_475c4.method_48$d00df7729d(n4);
                                                                                    }
                                                                                }
                                                                                n = ((int) (c_47rf.method_44$0e30dfc966().contains("Play Again") ? 1 : 0));
                                                                            }
                                                                            if (nArray != null) break block46;
                                                                            if (n == 0) break block47;
                                                                            long l12 = l;
                                                                            long l13 = 6000L;
                                                                            C_47cu c_47cu = this.field_48E;
                                                                            n = ((int) (c_47cu.method_42$b0e346e6e3(l13, l12) ? 1 : 0));
                                                                            if (nArray != null) break block46;
                                                                            if (n == 0) break block47;
                                                                            long l14 = l4;
                                                                            ModeSetting c_47Tj = this.settingMode;
                                                                            n = ((int) (c_47Tj.method_46$5f9dc63072(l14).equals("PikaSkywars") ? 1 : 0));
                                                                            if (nArray != null) break block46;
                                                                            if (n != 0) {
                                                                                int n5 = 1;
                                                                                C_475c c_475c5 = c_475c;
                                                                                c_475c5.method_48$d00df7729d(n5);
                                                                                C_47cu c_47cu2 = this.field_48E;
                                                                                c_47cu2.method_46$da8c82d5d4();
                                                                            }
                                                                        }
                                                                        long l15 = l4;
                                                                        ModeSetting c_47Tj = this.settingMode;
                                                                        n = ((int) (c_47Tj.method_46$5f9dc63072(l15).equals("GommeKit1v1Ranked") ? 1 : 0));
                                                                    }
                                                                    if (nArray != null) break block48;
                                                                    if (n == 0) break block49;
                                                                    String string = c_47rf.method_44$0e30dfc966();
                                                                    long l16 = l6;
                                                                    AutoPlay_47ki autoPlay_47ki = this;
                                                                    n = ((int) (autoPlay_47ki.method_45$e055d62ea7(l16, string) ? 1 : 0));
                                                                    if (nArray != null) break block50;
                                                                    if (n != 0) break block51;
                                                                    n = ((int) (c_47rf.method_48$dbd570a038().equals(C_42R.field_41O) ? 1 : 0));
                                                                    if (nArray != null) break block48;
                                                                    if (n == 0) break block49;
                                                                }
                                                                long l17 = l2;
                                                                int n6 = 250;
                                                                int n7 = 150;
                                                                C_47MO c_47MO = C_476q.field_48;
                                                                long l18 = l;
                                                                long l19 = c_47MO.method_44$75dd719903(n7, n6, l17);
                                                                C_47cu c_47cu = this.field_48;
                                                                n = ((int) (c_47cu.method_42$b0e346e6e3(l19, l18) ? 1 : 0));
                                                            }
                                                            if (nArray != null) break block48;
                                                            if (n != 0) {
                                                                int n8 = 1;
                                                                C_475c c_475c6 = c_475c;
                                                                c_475c6.method_48$d00df7729d(n8);
                                                                C_47cu c_47cu = this.field_48;
                                                                c_47cu.method_46$da8c82d5d4();
                                                            }
                                                        }
                                                        long l20 = l4;
                                                        ModeSetting c_47Tj = this.settingMode;
                                                        n = ((int) (c_47Tj.method_46$5f9dc63072(l20).equals("GommeKit1v1Unranked") ? 1 : 0));
                                                    }
                                                    if (nArray != null) break block52;
                                                    if (n == 0) break block53;
                                                    String string = c_47rf.method_44$0e30dfc966();
                                                    long l21 = l6;
                                                    AutoPlay_47ki autoPlay_47ki = this;
                                                    n = ((int) (autoPlay_47ki.method_45$e055d62ea7(l21, string) ? 1 : 0));
                                                    if (nArray != null) break block54;
                                                    if (n != 0) break block55;
                                                    n = ((int) (c_47rf.method_48$dbd570a038().equals(C_42R.field_41O) ? 1 : 0));
                                                    if (nArray != null) break block52;
                                                    if (n == 0) break block53;
                                                }
                                                long l22 = l2;
                                                int n9 = 250;
                                                int n10 = 150;
                                                C_47MO c_47MO = C_476q.field_48;
                                                long l23 = l;
                                                long l24 = c_47MO.method_44$75dd719903(n10, n9, l22);
                                                C_47cu c_47cu = this.field_48;
                                                n = c_47cu.method_42$b0e346e6e3(l24, l23) ? 1 : 0;
                                            }
                                            if (nArray != null) break block52;
                                            if (n != 0) {
                                                int n11 = 1;
                                                C_475c c_475c7 = c_475c;
                                                c_475c7.method_44$d00df7729d(n11);
                                                C_47cu c_47cu = this.field_48;
                                                c_47cu.method_46$da8c82d5d4();
                                            }
                                        }
                                        long l25 = l4;
                                        ModeSetting c_47Tj = this.settingMode;
                                        n = ((int) (c_47Tj.method_46$5f9dc63072(l25).equalsIgnoreCase("kitpvp") ? 1 : 0));
                                    }
                                    if (nArray != null) break block56;
                                    if (n == 0) break block57;
                                    long l26 = l2;
                                    int n12 = 2000;
                                    int n13 = 1000;
                                    C_47MO c_47MO = C_476q.field_48;
                                    long l27 = l;
                                    long l28 = c_47MO.method_44$75dd719903(n13, n12, l26);
                                    C_47cu c_47cu = this.field_48;
                                    n = ((int) (c_47cu.method_42$b0e346e6e3(l28, l27) ? 1 : 0));
                                    if (nArray != null) break block56;
                                    if (n == 0) break block57;
                                    long l29 = l5;
                                    NumberSetting c_47TS = this.settingHotbarItemID;
                                    n = (int)c_47TS.method_44$474dfaa627(l29);
                                    if (nArray != null) break block56;
                                    if (C_43r.method_46$4158f44b4a((int)n) == c_47rf.method_48$dbd570a038()) {
                                        int n14 = 1;
                                        C_475c c_475c8 = c_475c;
                                        c_475c8.method_48$d00df7729d(n14);
                                        C_47cu c_47cu3 = this.field_48;
                                        c_47cu3.method_46$da8c82d5d4();
                                    }
                                }
                                long l30 = l4;
                                ModeSetting c_47Tj = this.settingMode;
                                n = ((int) (c_47Tj.method_46$5f9dc63072(l30).equals("AutoGamblePVPDojo") ? 1 : 0));
                            }
                            if (nArray != null) break block58;
                            if (n == 0) break block59;
                            n = ((int) (this.field_43a ? 1 : 0));
                        }
                        if (nArray != null) break block60;
                        if (n != 0) break block59;
                        long l31 = l3;
                        AutoPlay_47ki autoPlay_47ki = this;
                        n = ((int) (C_47i.method_49$e40da76921((Module)autoPlay_47ki, (long)l31) ? 1 : 0));
                    }
                    if (nArray != null) break block61;
                    if (n == 0) break block59;
                    long l32 = l2;
                    int n15 = 2000;
                    int n16 = 1000;
                    C_47MO c_47MO = C_476q.field_48;
                    long l33 = l;
                    long l34 = c_47MO.method_44$75dd719903(n16, n15, l32);
                    C_47cu c_47cu = this.field_48;
                    n = ((int) (c_47cu.method_42$b0e346e6e3(l34, l33) ? 1 : 0));
                }
                if (nArray != null) break block62;
                if (n == 0) break block59;
                n = ((int) (c_47rf.method_44$0e30dfc966().contains("Collection") ? 1 : 0));
            }
            if (n != 0) {
                int n17 = 1;
                C_475c c_475c9 = c_475c;
                c_475c9.method_48$d00df7729d(n17);
                C_47cu c_47cu = this.field_48;
                c_47cu.method_46$da8c82d5d4();
            }
        }
    }









   public void method_40$9035875d26(long var1, C_47ob var3) {
      boolean var28;
      long var4;
      int[] var6;
      C_473U var27;
      label124: {
         var4 = var1 ^ 71754350854894L;
         long var10000 = -4101951117529411859L;
         var6 = ClientSettings_47kr.method_46$d4d28024c9();
         long var10001 = -4102032457620779947L;
         C_47ob var10 = var3;
         C_473U var7 = var10.method_46$96fcbedb66();
         boolean var26 = var7 instanceof C_47MM;
         if (var6 == null) {
            if (var26) {
               var10001 = -4102170539769309101L;
               Minecraft var11 = field_43;
               var11.field_44Y.method_42$da8c82d5d4();
            }

            var27 = var7;
            if (var6 != null) {
               break label124;
            }

            var26 = var7 instanceof C_47AL;
         }

         if (!var26) {
            return;
         }

         var27 = var7;
      }

      String var9;
      int[] var30;
      label110: {
         C_47AL var8 = (C_47AL)var27;
         var9 = var8.method_45$8b128fd962().method_48$0e30dfc966();
         long var10002 = -4101236106096270774L;
         long var12 = var4;
         ModeSetting var14 = this.settingMode;
         var28 = var14.method_46$5f9dc63072(var12).equals("HypixelNormal");
         label109:
         if (var6 == null) {
            if (var28) {
               var28 = var9.contains("You won! Want to play again? Click here!");
               var30 = var6;
               if (var1 >= 0L) {
                  if (var6 == null) {
                     if (var28) {
                        long var31 = -4101579103964233045L;
                        Minecraft var15 = field_43;
                        var15.field_42P.method_49$a7421bf54c("/play solo_normal");
                     }

                     var28 = var9.contains("You died!");
                  }

                  var30 = var6;
               }

               if (var1 < 0L) {
                  break label110;
               }

               if (var30 != null) {
                  break label109;
               }

               if (var28) {
                  long var32 = -4101579103964233045L;
                  Minecraft var16 = field_43;
                  var16.field_42P.method_49$a7421bf54c("/play solo_normal");
               }
            }

            var10002 = -4101236106096270774L;
            long var17 = var4;
            ModeSetting var19 = this.settingMode;
            var28 = var19.method_46$5f9dc63072(var17).equals("HypixelInsane");
         }

         var30 = var6;
      }

      label98: {
         label97:
         if (var30 == null) {
            if (var28) {
               var28 = var9.contains("You won! Want to play again? Click here!");
               var30 = var6;
               if (var1 > 0L) {
                  if (var6 == null) {
                     if (var28) {
                        long var34 = -4101579103964233045L;
                        Minecraft var20 = field_43;
                        var20.field_42P.method_49$a7421bf54c("/play solo_insane");
                     }

                     var28 = var9.contains("You died!");
                  }

                  var30 = var6;
               }

               if (var1 <= 0L) {
                  break label98;
               }

               if (var30 != null) {
                  break label97;
               }

               if (var28) {
                  long var35 = -4101579103964233045L;
                  Minecraft var21 = field_43;
                  var21.field_42P.method_49$a7421bf54c("/play solo_insane");
               }
            }

            long var38 = -4101236106096270774L;
            long var22 = var4;
            ModeSetting var24 = this.settingMode;
            var28 = var24.method_46$5f9dc63072(var22).equals("UniversocraftSkywars");
         }

         var30 = var6;
      }

      if (var30 == null) {
         if (!var28) {
            return;
         }

         var28 = var9.contains("Jugar de nuevo - Salir");
      }

      if (var28) {
         long var36 = -4101579103964233045L;
         Minecraft var25 = field_43;
         var25.field_42P.method_49$a7421bf54c("/skywars random");
      }
   }




   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 75525185537131L;
      long var3 = var1 ^ 41658106290462L;
      long var10002 = 7270252205093454266L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Gamster");
   }



   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      this.field_43a = false;
      recovery$indy$1(this.settingDelayToSetSlowAfterRespawn, 3263253860827590040L, var5);
      this.field_43y = 0;
   }



   private boolean method_45$e055d62ea7(long var1, String var3) {
      int var14;
      int[] var10001;
      label150: {
         int[] var6;
         var1 = a ^ var1;
         long var4 = var1 ^ 105672600770414L;
         long var10002 = 1339075578794145738L;
         long var9 = var4;
         ModeSetting var11 = this.settingGamemodeKit1v1;
         String var7 = var11.method_46$5f9dc63072(var9);
         long var10000 = 1338361185936366445L;
         int[] var13 = ClientSettings_47kr.method_46$d4d28024c9();
         byte var8 = -1;
         var6 = var13;
         var14 = var7.hashCode();
         label149:
         if (var6 == null) {
            label153: {
               label146: {
                  label154: {
                     label144: {
                        label155: {
                           label142: {
                              label156: {
                                 label140: {
                                    label157: {
                                       switch (var14) {
                                          case 2644:
                                             break label156;
                                          case 2660:
                                             break label155;
                                          case 80485:
                                             break label154;
                                          case 83984:
                                             var14 = (int) ((var7.equals("UHC")) ? 1 : 0);
                                             if (var6 != null) {
                                                break label149;
                                             }

                                             if (var14 == 0) {
                                                break label153;
                                             }

                                             var14 = 0;
                                             if (var1 < 0L) {
                                                break;
                                             }

                                             var8 = 0;
                                             if (var6 == null) {
                                                break label153;
                                             }
                                          case -2008788591:
                                             var14 = (int) ((var7.equals("OnlySword")) ? 1 : 0);
                                             break;
                                          case 2583063:
                                             break label157;
                                          default:
                                             break label153;
                                       }

                                       if (var6 != null) {
                                          break label149;
                                       }

                                       if (var14 == 0) {
                                          break label153;
                                       }

                                       var14 = 1;
                                       if (var1 <= 0L) {
                                          break label140;
                                       }

                                       var8 = 1;
                                       if (var6 == null) {
                                          break label153;
                                       }
                                    }

                                    var14 = (int) ((var7.equals("Soup")) ? 1 : 0);
                                 }

                                 if (var6 != null) {
                                    break label149;
                                 }

                                 if (var14 == 0) {
                                    break label153;
                                 }

                                 var14 = 2;
                                 if (var1 <= 0L) {
                                    break label142;
                                 }

                                 var8 = 2;
                                 if (var6 == null) {
                                    break label153;
                                 }
                              }

                              var14 = (int) ((var7.equals("SG")) ? 1 : 0);
                           }

                           if (var6 != null) {
                              break label149;
                           }

                           if (var14 == 0) {
                              break label153;
                           }

                           var14 = 3;
                           if (var1 < 0L) {
                              break label144;
                           }

                           var8 = 3;
                           if (var6 == null) {
                              break label153;
                           }
                        }

                        var14 = (int) ((var7.equals("SW")) ? 1 : 0);
                     }

                     if (var6 != null) {
                        break label149;
                     }

                     if (var14 == 0) {
                        break label153;
                     }

                     var14 = 4;
                     if (var1 <= 0L) {
                        break label146;
                     }

                     var8 = 4;
                     if (var6 == null) {
                        break label153;
                     }
                  }

                  var14 = (int) ((var7.equals("QSG")) ? 1 : 0);
               }

               var10001 = var6;
               if (var1 <= 0L) {
                  break label150;
               }

               if (var6 != null) {
                  break label149;
               }

               if (var14 != 0) {
                  var8 = 5;
               }
            }

            var14 = var8;
         }

         var10001 = var6;
      }

      if (var10001 == null) {
         switch (var14) {
            case 0:
               return var3.equals("§7Kit: §f§eUHC");
            case 1:
               return var3.equals("§7Kit: §f§bOnly Sword");
            case 2:
               return var3.equals("§7Kit: §f§cSOUP");
            case 3:
               return var3.equals("§7Kit: §f§aSG");
            case 4:
               return var3.equals("§7Kit: §f§4SW");
            case 5:
               return var3.equals("§6Season-Kit: §f§5QSG");
            default:
               var14 = 0;
         }
      }

      return var14 != 0;
   }




   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 65704586536991L;
      long var3 = var1 ^ 99582339042666L;
      long var10000 = 618940256750485865L;
      int[] var5 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10002 = 617380928280980942L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("MinemenUnranked");
      if (var5 == null) {
         if (!var12) {
            var10002 = 617380928280980942L;
            long var9 = var3;
            ModeSetting var11 = this.settingMode;
            boolean var14 = var11.method_46$5f9dc63072(var9).equals("MinemenRanked");
            if (var5 != null) {
               return var14;
            }

            if (!var14) {
               return false;
            }
         }

         var12 = true;
      }

      return var12;
   }



   private void method_43$51c0e5ba96(int var1, long var2) {
      var2 = a ^ var2;
      C_47ph var4 = (C_47ph)recovery$indy$2(field_43, -5626369486962798336L, var2);
      C_47sT var5 = var4.field_46M.method_46$4c10532da1(var1);
      System.out.println(var5.method_48$ac4db64966());

      try {
         var4.method_47$23922dd444(var5.field_40 + 2 + var4.field_46c, var5.field_46 + 2 + var4.field_433, 0);
      } catch (IOException var7) {
         var7.printStackTrace();
      }

      recovery$indy$3(this.field_48z, -5627230530751035267L, var2);
   }



   public void onRender3D(long var1, float var3) {
      boolean var10000;
      int[] var10001;
      label44: {
         int[] var4;
         var4 = recovery$indy$4(8135673910430546200L, var1);
         var10000 = recovery$indy$5(field_43, 8134166832932556809L, var1) instanceof ClickGuiScreen;
         label43:
         if (var4 == null) {
            if (var10000) {
               var10000 = Mouse.isGrabbed();
               var10001 = var4;
               if (var1 < 0L) {
                  break label44;
               }

               if (var4 != null) {
                  break label43;
               }

               if (var10000) {
                  Mouse.setGrabbed(false);
               }
            }

            var10000 = recovery$indy$6(field_43, 8134166832932556809L, var1) instanceof C_47LW;
         }

         var10001 = var4;
      }

      if (var10001 == null) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$7(this.settingRemoveEscape, 8135967844087369633L, var1);
      }

      if (var10000) {
         recovery$indy$8(field_43, null, 8134166832932556809L, var1);
         recovery$indy$9(field_43, 8133794398724470110L, var1).method_40$7480b345ab(null);
      }
   }



   private void method_43$eae6e5e781(C_47rf var1, long var2, C_43r var4) {
      java.lang.String var19;
      var2 = a ^ var2;
      long var5 = var2 ^ 72226250189128L;
      long var7 = var2 ^ 80795863799786L;
      long var10000 = 1303502956233907177L;
      int[] var9 = ClientSettings_47kr.method_46$d4d28024c9();
      boolean var18 = C_42R.field_414.equals(var4);
      if (var9 == null) {
         if (!var18) {
            return;
         }

         var18 = var1.method_44$0e30dfc966().contains("Play");
      }

      label52: {
         if (var9 == null) {
            if (!var18) {
               return;
            }

            var19 = var1.method_44$0e30dfc966();
            if (var9 != null) {
               break label52;
            }

            var18 = var19.contains("Again");
         }

         if (!var18) {
            return;
         }

         long var10003 = 1301948507350562638L;
         long var11 = var7;
         ModeSetting var13 = this.settingGamemodeGamster;
         var19 = (String)this.field_46.get(var13.method_46$5f9dc63072(var11));
      }

      String var10 = var19;
      String var20 = var10;
      if (var9 == null) {
         if (var10 == null) {
            return;
         }

         var20 = var10;
      }

      long var10002 = 1302696887553373051L;
      String var14 = var20;
      long var15 = var5;
      C_475e.method_46$d07b98bfef(var15, var14);
   }



   public void method_40Q$e45a9973e5(long var1) {
      augustus.recovered.modules.misc.AutoPlay_47ki var15;
      long var3 = var1 ^ 137222570048497L;
      long var10000 = 6990667452627429628L;
      int[] var5 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 6991515593637993457L;
      Minecraft var6 = field_43;
      int var14 = (int) ((var6.method_44$aae029aa0a()) ? 1 : 0);
      if (var5 == null) {
         if (var14 == 0) {
            return;
         }

         var10001 = 6993154495803432517L;
         BooleanSetting var7 = this.settingSetSlotAfterRespawn;
         var14 = (int) ((var7.method_49$aae029aa0a()) ? 1 : 0);
      }

      label40: {
         if (var5 == null) {
            if (var14 == 0) {
               return;
            }

            var15 = this;
            if (var5 != null) {
               break label40;
            }

            var14 = this.field_43y;
         }

         long var10003 = 6990241438228188636L;
         RangeSetting var8 = this.settingDelayToSetSlowAfterRespawn;
         if (var14 == Math.max(0, var8.method_44$8abf5c6871())) {
            var10001 = 6991105849239708858L;
            Minecraft var9 = field_43;
            long var10004 = 6989860827064697064L;
            long var10 = var3;
            boolean var12 = true;
            NumberSetting var13 = this.settingSlotToSetAfterRespawn;
            C_47i.field_40 = var9.field_42P.field_42X.field_42 = (int)var13.method_43$a8c520d5d1(var12, var10);
         }

         var15 = this;
      }

      var15.field_43y++;
   }



    public void method_40G$e45a9973e5(long key) {
        long actionKey = key ^ 6407505185672L;
        int actionUpper = (int) (actionKey >>> 32);
        char actionMiddle = (char) ((actionKey << 32) >>> 48);
        char actionLower = (char) ((actionKey << 48) >>> 48);
        long modeKey = key ^ 109012243908695L;
        long gamsterKey = key ^ 105271107567420L;
        long itemNameKey = key ^ 130697061646264L;
        Object guard = recovery$indy$flow$299();
        boolean ready = recovery$indy$flow$302(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$300())))))));
        if (guard == null && !ready) return;
        int slot = guard == null ? 36 : ready ? 1 : 0;
        while (slot < recovery$indy$flow$308(((java.lang.Object)(((net.C_47gG) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$303())))))))))).field_42P)))))).field_429)))))).field_46)))) {
            Object stack = recovery$indy$flow$314(recovery$indy$flow$313(((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$309())))))))))).field_42P)))))).field_429)), slot));
            if (guard == null && stack == null) { slot++; continue; }
            Object item = recovery$indy$flow$315(stack);
            String displayName = (String) recovery$indy$flow$316(stack);
            String mode = (String) recovery$indy$flow$319(((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))).settingMode)))))))), modeKey);
            int hash = mode.hashCode();
            if (guard != null) {
                if (hash != 0) {
                    recovery$indy$flow$333(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                    if (key > 0L && displayName.contains("Unranked")) {
                        recovery$indy$flow$338(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                        if (displayName.contains("Play Again")) {
                            recovery$indy$flow$341(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                            if (recovery$indy$flow$344(((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))))), itemNameKey, ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(displayName)))))))) {
                                recovery$indy$flow$350(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                                if (!displayName.contains("Collection")) {
                                    recovery$indy$flow$354(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                                    recovery$indy$flow$358(((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))))), ((java.lang.Object)(((net.C_47rf) (((java.lang.Object)(stack)))))), gamsterKey, ((java.lang.Object)(((net.C_43r) (((java.lang.Object)(item)))))));
                                }
                            }
                        }
                    }
                }
                return;
            }
            if (key <= 0L) {
                if (key == 0L && mode.equals("MinemenUnranked")) {
                    if (!displayName.contains("Play Again")) { slot++; continue; }
                    recovery$indy$flow$333(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                } else {
                    recovery$indy$flow$330(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                }
                continue;
            }
            switch (mode) {
                case "MinemenUnranked":
                    if (displayName.contains("Unranked")) {
                        recovery$indy$flow$330(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                    } else if (displayName.contains("Play Again")) {
                        recovery$indy$flow$333(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                    }
                    break;
                case "MinemenRanked":
                    if (!displayName.contains("Unranked") && ((String) recovery$indy$flow$335(stack)).contains("Ranked")) {
                        recovery$indy$flow$338(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                    }
                    break;
                case "PikaSkywars":
                    if (displayName.contains("Play Again")) {
                        recovery$indy$flow$341(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                    }
                    break;
                case "GommeKit1v1Ranked":
                case "GommeKit1v1Unranked":
                    if (recovery$indy$flow$344(((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))))), itemNameKey, ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(displayName)))))))) {
                        recovery$indy$flow$346(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                    }
                    if (recovery$indy$flow$348(item, recovery$indy$flow$347())) {
                        recovery$indy$flow$350(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                    }
                    break;
                case "AutoGamblePVPDojo":
                    if (displayName.contains("Collection") && !recovery$indy$flow$352(this)) {
                        recovery$indy$flow$354(actionUpper, ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(this)))))), 20, actionMiddle, actionLower, slot - 36);
                    }
                    break;
                case "Gamster":
                    recovery$indy$flow$358(((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))))), ((java.lang.Object)(((net.C_47rf) (((java.lang.Object)(stack)))))), gamsterKey, ((java.lang.Object)(((net.C_43r) (((java.lang.Object)(item)))))));
                    break;
                default:
                    break;
            }
            slot++;
        }
    }








   private boolean method_41b$aae029aa0a() {
      long var1 = a ^ 17739807079050L;
      long var3 = var1 ^ 124732386942975L;
      long var10000 = 6486240102822515708L;
      int[] var5 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10002 = 6486392164873256795L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("GommeKit1v1Ranked");
      if (var5 == null) {
         if (!var12) {
            var10002 = 6486392164873256795L;
            long var9 = var3;
            ModeSetting var11 = this.settingMode;
            boolean var14 = var11.method_46$5f9dc63072(var9).equals("GommeKit1v1Unranked");
            if (var5 != null) {
               return var14;
            }

            if (!var14) {
               return false;
            }
         }

         var12 = true;
      }

      return var12;
   }



   private boolean method_418$aae029aa0a() {
      long var1 = a ^ 138744043027915L;
      long var3 = var1 ^ 34617539008702L;
      long var10002 = 6720818989664417818L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equalsIgnoreCase("Kitpvp");
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$10(this, 7, var3, -7101630078040716540L, var1);
      recovery$indy$11(this, 40, var3, -7101630078040716540L, var1);
      recovery$indy$12(this, 32, var3, -7101630078040716540L, var1);
      recovery$indy$13(this, 26, var3, -7101630078040716540L, var1);
      recovery$indy$14(this, 34, var3, -7101630078040716540L, var1);
      recovery$indy$15(this, 17, var3, -7101630078040716540L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$16(field_43, -7741640454321019397L, var1).method_44$811225824d(C_47q3.MASTER, this.field_48H);
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      int[] var6 = recovery$indy$17(2730507981932817435L, var4);
      this.field_48H = recovery$indy$18(field_43, 2730938742013711501L, var4).method_41$c76f4422b2(C_47q3.MASTER);
      AutoPlay_47ki var10000 = this;
      if (var6 == null) {
         if (recovery$indy$19(this.settingCancelSound, 2732503540282776226L, var4)) {
            recovery$indy$20(field_43, 2730938742013711501L, var4).method_44$811225824d(C_47q3.MASTER, 0.0F);
         }

         var10000 = this;
      }

      var10000.field_43a = false;
   }



   public void method_487$da8c82d5d4() {
      long var1 = a ^ 133234197570773L;
      long var3 = var1 ^ 59909581026935L;
      long var5 = var1 ^ 39702344730670L;
      long var7 = var1 ^ 42731099591987L;
      long var9 = var1 ^ 28657421075362L;
      long var11 = var1 ^ 26933110702496L;
      long var10000 = -4297375169166209629L;
      int[] var13 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -4298222485811741010L;
      net.minecraft.client.Minecraft var22 = field_43;
      boolean var91 = var22.method_44$aae029aa0a();
      if (var13 != null) {
         if (var91) {
            var10001 = -4298318611663674190L;
            net.minecraft.client.Minecraft var86 = field_43;
            C_47ph var81 = (C_47ph)var86.field_44m;
            net.C_47rf var82 = var81.field_46M.method_46$4c10532da1(8).method_48$ac4db64966();
            boolean var83 = false;
            byte var84 = 0;
            int var97;
            if (var84 < var81.field_46M.field_46.size()) {
               net.C_47rf var85 = var81.field_46M.method_46$4c10532da1(var84).method_48$ac4db64966();
               double var96 = var84;
               long var116 = -4297513185572882499L;
               long var87 = var5;
               client.setting.NumberSetting var88 = this.settingChestslot;
               double var117;
               var97 = (var117 = var96 - var88.method_44$474dfaa627(var87)) == 0.0 ? 0 : (var117 < 0.0 ? -1 : 1);
            } else {
               long var106 = -4297803753022086908L;
               long var89 = var11;
               client.setting.ModeSetting var90 = this.settingMode;
               var97 = ((int) (var90.method_46$5f9dc63072(var89).equals("AutoGamblePVPDojo") ? 1 : 0));
            }

            if (!(var97 != 0) && var82.method_48$dbd570a038().equals(net.C_42R.field_41F)) {
               this.field_43a = true;
            }
         }
      } else {
         if (var91) {
            var10001 = -4298021084731507249L;
            net.C_47cu var23 = this.field_48z;
            var23.method_46$da8c82d5d4();
            long var10005 = -4298410615430097994L;
            long var24 = var3;
            short var26 = 150;
            byte var27 = 0;
            net.C_47MO var28 = net.C_476q.field_48;
            this.field_42 = var28.method_44$75dd719903(var27, var26, var24);
         } else {
            var10001 = -4298318611663674190L;
            net.minecraft.client.Minecraft var29 = field_43;
            if (var29.field_44m instanceof C_47ph) {
               var10001 = 350 + this.field_42;
               long var10003 = -4296605228364839165L;
               long var30 = var9;
               long var32 = var10001;
               net.C_47cu var34 = this.field_48z;
               if (var34.method_42$b0e346e6e3(var32, var30)) {
                  var10001 = -4298318611663674190L;
                  net.minecraft.client.Minecraft var35 = field_43;
                  C_47ph var14 = (C_47ph)var35.field_44m;
                  net.C_47rf var15 = var14.field_46M.method_46$4c10532da1(8).method_48$ac4db64966();
                  boolean var16 = false;

                  for (int var17 = 0; var17 < var14.field_46M.field_46.size(); var17++) {
                     net.C_47rf var18 = var14.field_46M.method_46$4c10532da1(var17).method_48$ac4db64966();
                     double var92 = var17;
                     var10003 = -4297513185572882499L;
                     long var36 = var5;
                     client.setting.NumberSetting var38 = this.settingChestslot;
                     if (var92 == var38.method_44$474dfaa627(var36) && var18 != null) {
                        long var10002 = -4297803753022086908L;
                        long var39 = var11;
                        client.setting.ModeSetting var41 = this.settingMode;
                        if (var41.method_46$5f9dc63072(var39).equals("Kitpvp")) {
                           var10003 = -4296721104720681811L;
                           long var42 = var7;
                           int var44 = var17;
                           AutoPlay_47ki var45 = this;
                           var45.method_43$51c0e5ba96(var44, var42);
                           break;
                        }
                     }

                     if (var18 != null) {
                        boolean var19 = false;
                        long var104 = -4297803753022086908L;
                        long var46 = var11;
                        client.setting.ModeSetting var48 = this.settingMode;
                        switch (var48.method_46$5f9dc63072(var46)) {
                           case "MinemenUnranked":
                              String var94 = var18.method_44$0e30dfc966();
                              var10003 = -4297803753022086908L;
                              long var49 = var11;
                              client.setting.ModeSetting var51 = this.settingGamemodeMMC;
                              if (var94.contains(var51.method_46$5f9dc63072(var49))) {
                                 java.io.PrintStream var95 = System.out;
                                 StringBuilder var102 = new StringBuilder().append(var18).append(" ");
                                 long var10004 = -4297803753022086908L;
                                 long var52 = var11;
                                 client.setting.ModeSetting var54 = this.settingGamemodeMMC;
                                 var95.println(var102.append(var54.method_46$5f9dc63072(var52)).toString());
                                 var10003 = -4296721104720681811L;
                                 long var55 = var7;
                                 int var57 = var17;
                                 AutoPlay_47ki var58 = this;
                                 var58.method_43$51c0e5ba96(var57, var55);
                                 var19 = true;
                              }
                              break;
                           case "MinemenRanked":
                              String var93 = var18.method_44$0e30dfc966();
                              var10003 = -4297803753022086908L;
                              long var59 = var11;
                              client.setting.ModeSetting var61 = this.settingGamemodeMMC;
                              if (var93.contains(var61.method_46$5f9dc63072(var59))) {
                                 var10003 = -4296721104720681811L;
                                 long var62 = var7;
                                 int var64 = var17;
                                 AutoPlay_47ki var65 = this;
                                 var65.method_43$51c0e5ba96(var64, var62);
                                 var19 = true;
                              }
                              break;
                           case "GamsterKitpvp":
                              if (var18.method_48$dbd570a038() == net.C_42R.field_474) {
                                 var10003 = -4296721104720681811L;
                                 long var66 = var7;
                                 int var68 = var17;
                                 AutoPlay_47ki var69 = this;
                                 var69.method_43$51c0e5ba96(var68, var66);
                                 var19 = true;
                              }
                              break;
                           case "PvpDojo":
                              if (var18.method_48$dbd570a038() == net.C_42R.field_41Q || var18.method_48$dbd570a038() == net.C_42R.field_47D) {
                                 var10003 = -4296721104720681811L;
                                 long var70 = var7;
                                 int var72 = var17;
                                 AutoPlay_47ki var73 = this;
                                 var73.method_43$51c0e5ba96(var72, var70);
                                 var19 = true;
                              }
                              break;
                           case "AutoGamblePVPDojo":
                              if (var18.method_44$0e30dfc966().contains("Collection") && var17 < 36) {
                                 var16 = true;
                                 var10003 = -4296721104720681811L;
                                 long var74 = var7;
                                 int var76 = var17;
                                 AutoPlay_47ki var77 = this;
                                 var77.method_43$51c0e5ba96(var76, var74);
                              }
                        }

                        if (var19) {
                           break;
                        }
                     }
                  }

                  long var105 = -4297803753022086908L;
                  long var78 = var11;
                  client.setting.ModeSetting var80 = this.settingMode;
                  if (var80.method_46$5f9dc63072(var78).equals("AutoGamblePVPDojo")
                     && !var16
                     && var15 != null
                     && var15.method_48$dbd570a038().equals(net.C_42R.field_41F)) {
                     this.field_43a = true;
                  }
               }
            }
         }
      }
   }







    public AutoPlay_47ki(long a0) {
        super((java.lang.String) ("AutoPlay"),(java.lang.String) ("AutoSpielen"),(long) (((augustus.recovered.modules.misc.AutoPlay_47ki.a ^ a0) ^ 1186055736932L)),(java.awt.Color) (java.awt.Color.green),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.misc.AutoPlay_47ki.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.misc.AutoPlay_47ki.a ^ a0) ^ 76732006105821L);
        int constructorPart4 = (int) ((((augustus.recovered.modules.misc.AutoPlay_47ki.a ^ a0) ^ 113631051379452L) >>> 32));
        int constructorPart5 = (int) (((((augustus.recovered.modules.misc.AutoPlay_47ki.a ^ a0) ^ 113631051379452L) << 32) >>> 48));
        int constructorPart6 = (int) (((((augustus.recovered.modules.misc.AutoPlay_47ki.a ^ a0) ^ 113631051379452L) << 48) >>> 48));
        long constructorKey7 = ((augustus.recovered.modules.misc.AutoPlay_47ki.a ^ a0) ^ 82051978411689L);
        long constructorKey8 = ((augustus.recovered.modules.misc.AutoPlay_47ki.a ^ a0) ^ 79565360310169L);
        long constructorKey9 = ((augustus.recovered.modules.misc.AutoPlay_47ki.a ^ a0) ^ 123354242126463L);
        long constructorKey10 = ((augustus.recovered.modules.misc.AutoPlay_47ki.a ^ a0) ^ 102703784308216L);
        int constructorPart11 = (int) ((((augustus.recovered.modules.misc.AutoPlay_47ki.a ^ a0) ^ 105853573240025L) >>> 32));
        long constructorKey12 = ((((augustus.recovered.modules.misc.AutoPlay_47ki.a ^ a0) ^ 105853573240025L) << 32) >>> 32);
        java.lang.Object initialValue13 = recovery$indy$flow$497(12);
        ((java.lang.Object[]) initialValue13)[0] = "MinemenUnranked";
        ((java.lang.Object[]) initialValue13)[1] = "MinemenRanked";
        ((java.lang.Object[]) initialValue13)[2] = "PikaSkywars";
        ((java.lang.Object[]) initialValue13)[3] = "HypixelNormal";
        ((java.lang.Object[]) initialValue13)[4] = "HypixelInsane";
        ((java.lang.Object[]) initialValue13)[5] = "GommeKit1v1Ranked";
        ((java.lang.Object[]) initialValue13)[6] = "GommeKit1v1Unranked";
        ((java.lang.Object[]) initialValue13)[7] = "Kitpvp";
        ((java.lang.Object[]) initialValue13)[8] = "PvpDojo";
        ((java.lang.Object[]) initialValue13)[9] = "UniversocraftSkywars";
        ((java.lang.Object[]) initialValue13)[10] = "AutoGamblePVPDojo";
        ((java.lang.Object[]) initialValue13)[11] = "Gamster";
        client.setting.ModeSetting initialized14 = new client.setting.ModeSetting(this, "Mode", constructorKey7, "MinemenRanked", (java.lang.String[]) (initialValue13));
        recovery$indy$flow$499(this, initialized14);
        java.lang.Object initialValue15 = recovery$indy$flow$501(3);
        ((java.lang.Object[]) initialValue15)[0] = "Sumo";
        ((java.lang.Object[]) initialValue15)[1] = "Boxing";
        ((java.lang.Object[]) initialValue15)[2] = "Parkour";
        client.setting.ModeSetting initialized16 = new client.setting.ModeSetting(this, "GamemodeMMC", constructorKey7, "Sumo", (java.lang.String[]) (initialValue15));
        java.lang.String initialValue17 = "Gamemode";
        long initialValue18 = constructorKey3;
        client.setting.ModeSetting initialValue19 = initialized16;
        java.lang.Object initialValue20 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue21 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue22 = recovery$indy$flow$505(initialValue20, initialValue18, initialValue21);
        java.lang.Object initialValue23 = recovery$indy$flow$506(this);
        java.lang.Object initialValue24 = initialValue23;
        java.lang.Object initialValue25 = initialValue22;
        java.lang.Object initialValue26 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue27 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue28 = recovery$indy$flow$509(initialValue26, initialValue27);
        recovery$indy$flow$510(this, initialValue28);
        java.lang.Object initialValue29 = recovery$indy$flow$512(6);
        ((java.lang.Object[]) initialValue29)[0] = "UHC";
        ((java.lang.Object[]) initialValue29)[1] = "OnlySword";
        ((java.lang.Object[]) initialValue29)[2] = "Soup";
        ((java.lang.Object[]) initialValue29)[3] = "SG";
        ((java.lang.Object[]) initialValue29)[4] = "SW";
        ((java.lang.Object[]) initialValue29)[5] = "QSG";
        client.setting.ModeSetting initialized30 = new client.setting.ModeSetting(this, "GamemodeKit1v1", constructorKey7, "OnlySword", (java.lang.String[]) (initialValue29));
        java.lang.String initialValue31 = "Gamemode";
        long initialValue32 = constructorKey3;
        client.setting.ModeSetting initialValue33 = initialized30;
        java.lang.Object initialValue34 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue33))))));
        java.lang.Object initialValue35 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue36 = recovery$indy$flow$516(initialValue34, initialValue32, initialValue35);
        java.lang.Object initialValue37 = recovery$indy$flow$517(this);
        java.lang.Object initialValue38 = initialValue37;
        java.lang.Object initialValue39 = initialValue36;
        java.lang.Object initialValue40 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue39))))));
        java.lang.Object initialValue41 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue38))))));
        java.lang.Object initialValue42 = recovery$indy$flow$520(initialValue40, initialValue41);
        recovery$indy$flow$521(this, initialValue42);
        java.lang.Object initialValue43 = recovery$indy$flow$523(7);
        ((java.lang.Object[]) initialValue43)[0] = "SkyWarsSolo";
        ((java.lang.Object[]) initialValue43)[1] = "SkyWarsTeams";
        ((java.lang.Object[]) initialValue43)[2] = "SkyWarsLucky";
        ((java.lang.Object[]) initialValue43)[3] = "BedWarsSolo";
        ((java.lang.Object[]) initialValue43)[4] = "BedWarsDuos";
        ((java.lang.Object[]) initialValue43)[5] = "BedWarsTrios";
        ((java.lang.Object[]) initialValue43)[6] = "BedWarsTeams";
        client.setting.ModeSetting initialized44 = new client.setting.ModeSetting(this, "GamemodeGamster", constructorKey7, "SkyWarsSolo", (java.lang.String[]) (initialValue43));
        java.lang.Object initialValue45 = recovery$indy$flow$525(this);
        java.lang.Object initialValue46 = initialValue45;
        client.setting.ModeSetting initialValue47 = initialized44;
        java.lang.Object initialValue48 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue47))))));
        java.lang.Object initialValue49 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue46))))));
        java.lang.Object initialValue50 = recovery$indy$flow$528(initialValue48, initialValue49);
        recovery$indy$flow$529(this, initialValue50);
        client.setting.BooleanSetting initialized51 = new client.setting.BooleanSetting(this, constructorKey9, "RemoveEscape", true);
        recovery$indy$flow$532(this, initialized51);
        client.setting.BooleanSetting initialized52 = new client.setting.BooleanSetting(this, constructorKey9, "CancelSound", true);
        recovery$indy$flow$535(this, initialized52);
        client.setting.NumberSetting initialized53 = new client.setting.NumberSetting(this, "HotbarItemID", Double.longBitsToDouble(4632796641680687104L), constructorKey10, 0.0D, Double.longBitsToDouble(4657203600794058752L), 0);
        recovery$indy$flow$538(this, initialized53);
        client.setting.NumberSetting initialized54 = new client.setting.NumberSetting(this, "Chestslot", 0.0D, constructorKey10, 0.0D, Double.longBitsToDouble(4632796641680687104L), 0);
        java.lang.Object initialValue55 = recovery$indy$flow$541(this);
        java.lang.Object initialValue56 = initialValue55;
        client.setting.NumberSetting initialValue57 = initialized54;
        java.lang.Object initialValue58 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue59 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue56))))));
        java.lang.Object initialValue60 = recovery$indy$flow$544(initialValue58, initialValue59);
        recovery$indy$flow$545(this, initialValue60);
        client.setting.BooleanSetting initialized61 = new client.setting.BooleanSetting(this, constructorKey9, "SetSlotAfterRespawn", false);
        recovery$indy$flow$548(this, initialized61);
        short converted62 = (short) (constructorPart5);
        short converted63 = (short) (constructorPart6);
        client.setting.RangeSetting initialized64 = new client.setting.RangeSetting(constructorPart4, this, "DelayToSetSlowAfterRespawn", Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4621819117588971520L), converted62, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, converted63);
        long initialValue65 = constructorKey8;
        client.setting.RangeSetting initialValue66 = initialized64;
        java.lang.Object initialValue67 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue66))))));
        java.lang.Object initialValue68 = recovery$indy$flow$552(initialValue67, initialValue65);
        java.lang.Object initialValue69 = ((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))).settingSetSlotAfterRespawn));
        java.lang.Object initialValue70 = recovery$indy$flow$554(initialValue69);
        java.lang.Object initialValue71 = recovery$indy$flow$555(initialValue69);
        long initialValue72 = constructorKey12;
        java.lang.Object initialValue73 = initialValue71;
        int initialValue74 = constructorPart11;
        java.lang.Object initialValue75 = initialValue68;
        java.lang.Object initialValue76 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue75))))));
        java.lang.Object initialValue77 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue73))))));
        java.lang.Object initialValue78 = recovery$indy$flow$558(initialValue76, initialValue74, initialValue77, initialValue72);
        recovery$indy$flow$559(this, initialValue78);
        client.setting.NumberSetting initialized79 = new client.setting.NumberSetting(this, "SlotToSetAfterRespawn", 0.0D, constructorKey10, 0.0D, Double.longBitsToDouble(4620693217682128896L), 0);
        java.lang.Object initialValue80 = ((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))).settingSetSlotAfterRespawn));
        java.lang.Object initialValue81 = recovery$indy$flow$563(initialValue80);
        java.lang.Object initialValue82 = recovery$indy$flow$564(initialValue80);
        java.lang.Object initialValue83 = initialValue82;
        client.setting.NumberSetting initialValue84 = initialized79;
        java.lang.Object initialValue85 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue84))))));
        java.lang.Object initialValue86 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue83))))));
        java.lang.Object initialValue87 = recovery$indy$flow$567(initialValue85, initialValue86);
        recovery$indy$flow$568(this, initialValue87);
        net.C_47cu initialized88 = new net.C_47cu();
        recovery$indy$flow$571(this, initialized88);
        net.C_47cu initialized89 = new net.C_47cu();
        recovery$indy$flow$574(this, initialized89);
        net.C_47cu initialized90 = new net.C_47cu();
        recovery$indy$flow$577(this, initialized90);
        recovery$indy$flow$578(this, 0);
        float[] values91 = new float[2];
        recovery$indy$flow$579(this, values91);
        recovery$indy$flow$580(this, 0);
        recovery$indy$flow$581(this, false);
        java.util.HashMap initialized92 = new java.util.HashMap();
        recovery$indy$flow$584(this, initialized92);
        java.lang.Object initialValue93 = ((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))).field_46));
        java.lang.Object initialValue94 = recovery$indy$flow$586(initialValue93, "SkyWarsSolo", "/play sw-solo");
        java.lang.Object initialValue95 = ((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))).field_46));
        java.lang.Object initialValue96 = recovery$indy$flow$588(initialValue95, "SkyWarsTeams", "/play sw-teams");
        java.lang.Object initialValue97 = ((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))).field_46));
        java.lang.Object initialValue98 = recovery$indy$flow$590(initialValue97, "SkyWarsLucky", "/play sw-lucky");
        java.lang.Object initialValue99 = ((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))).field_46));
        java.lang.Object initialValue100 = recovery$indy$flow$592(initialValue99, "BedWarsSolo", "/play bw-solo");
        java.lang.Object initialValue101 = ((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))).field_46));
        java.lang.Object initialValue102 = recovery$indy$flow$594(initialValue101, "BedWarsDuos", "/play bw-duo");
        java.lang.Object initialValue103 = ((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))).field_46));
        java.lang.Object initialValue104 = recovery$indy$flow$596(initialValue103, "BedWarsTrios", "/play bw-trio");
        java.lang.Object initialValue105 = ((java.lang.Object)(((augustus.recovered.modules.misc.AutoPlay_47ki) (((java.lang.Object)(this)))).field_46));
        java.lang.Object initialValue106 = recovery$indy$flow$598(initialValue105, "BedWarsTeams", "/play bw-teams");
    }







    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$299();
    private static java.lang.Object recovery$indy$flow$300() {
        return augustus.recovered.modules.misc.AutoPlay_47ki.field_43;
    }

    private static native boolean recovery$indy$flow$302(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$303() {
        return augustus.recovered.modules.misc.AutoPlay_47ki.field_43;
    }




    private static int recovery$indy$flow$308(java.lang.Object a0) {
        return ((java.util.List) (a0)).size();
    }
    private static java.lang.Object recovery$indy$flow$309() {
        return augustus.recovered.modules.misc.AutoPlay_47ki.field_43;
    }



    private static native java.lang.Object recovery$indy$flow$313(java.lang.Object a0,int a1);
    private static native java.lang.Object recovery$indy$flow$314(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$315(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$316(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$319(java.lang.Object a0,long a1);

    private static native void recovery$indy$flow$330(int a0,java.lang.Object a1,int a2,char a3,char a4,int a5);

    private static native void recovery$indy$flow$333(int a0,java.lang.Object a1,int a2,char a3,char a4,int a5);
    private static native java.lang.Object recovery$indy$flow$335(java.lang.Object a0);

    private static native void recovery$indy$flow$338(int a0,java.lang.Object a1,int a2,char a3,char a4,int a5);

    private static native void recovery$indy$flow$341(int a0,java.lang.Object a1,int a2,char a3,char a4,int a5);


    private static native boolean recovery$indy$flow$344(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$346(int a0,java.lang.Object a1,int a2,char a3,char a4,int a5);
    private static java.lang.Object recovery$indy$flow$347() {
        return net.C_42R.field_41O;
    }
    private static boolean recovery$indy$flow$348(java.lang.Object a0,java.lang.Object a1) {
        return a0.equals(a1);
    }

    private static native void recovery$indy$flow$350(int a0,java.lang.Object a1,int a2,char a3,char a4,int a5);
    private static boolean recovery$indy$flow$352(java.lang.Object a0) {
        return ((augustus.recovered.modules.misc.AutoPlay_47ki) (a0)).field_43a;
    }

    private static native void recovery$indy$flow$354(int a0,java.lang.Object a1,int a2,char a3,char a4,int a5);



    private static native void recovery$indy$flow$358(java.lang.Object a0,java.lang.Object a1,long a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$497(int a0);
    private static native void recovery$indy$flow$499(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$501(int a0);


    private static native java.lang.Object recovery$indy$flow$505(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$506(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$509(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$510(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$512(int a0);


    private static native java.lang.Object recovery$indy$flow$516(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$517(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$520(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$521(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$523(int a0);
    private static native java.lang.Object recovery$indy$flow$525(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$528(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$529(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$532(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$535(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$538(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$541(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$544(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$545(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$548(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$552(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$554(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$555(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$558(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$559(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$563(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$564(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$567(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$568(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$571(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$574(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$577(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$578(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.AutoPlay_47ki) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$579(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.AutoPlay_47ki) (a0)).field_45 = ((float[]) (a1));
        return;
    }
    private static void recovery$indy$flow$580(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.AutoPlay_47ki) (a0)).field_42 = a1;
        return;
    }
    private static void recovery$indy$flow$581(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.AutoPlay_47ki) (a0)).field_43a = a1;
        return;
    }
    private static native void recovery$indy$flow$584(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$586(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }

    private static java.lang.Object recovery$indy$flow$588(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }

    private static java.lang.Object recovery$indy$flow$590(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }

    private static java.lang.Object recovery$indy$flow$592(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }

    private static java.lang.Object recovery$indy$flow$594(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }

    private static java.lang.Object recovery$indy$flow$596(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }

    private static java.lang.Object recovery$indy$flow$598(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }
   private static native MethodHandle recovery$constant$0();
   private static native double recovery$indy$1(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$2(Object var0, long var1, long var3);
   private static native void recovery$indy$3(Object var0, long var1, long var3);
   private static native int[] recovery$indy$4(long var0, long var2);
   private static native GuiScreen recovery$indy$5(Object var0, long var1, long var3);
   private static native GuiScreen recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3);
   private static native void recovery$indy$8(Object var0, GuiScreen var1, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native void recovery$indy$10(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$11(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$12(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$13(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$14(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$15(Object var0, int var1, long var2, long var4, long var6);
   private static native C_47oo recovery$indy$16(Object var0, long var1, long var3);
   private static native int[] recovery$indy$17(long var0, long var2);
   private static native C_47oo recovery$indy$18(Object var0, long var1, long var3);
   private static native boolean recovery$indy$19(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$20(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$27();
}
