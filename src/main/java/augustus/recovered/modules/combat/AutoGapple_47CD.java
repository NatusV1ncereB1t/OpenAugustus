package augustus.recovered.modules.combat;
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
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_43r;
import net.C_472n;
import net.C_473U;
import net.C_475c;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47FQ;
import client.module.Module;
import client.setting.BooleanSetting;
import client.setting.RangeSetting;
import net.C_47UH;
import net.minecraft.entity.EntityLivingBase;
import net.C_47cu;
import net.C_47hg;
import net.C_47hi;
import net.C_47i;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47oY;
import net.C_47ob;
import client.ClientGlobals;
import net.C_47rf;
import client.module.Category;
import net.C_47xZ;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class AutoGapple_47CD extends client.module.Module implements net.C_47UH,net.C_47iC,net.C_48T,net.C_47hi {
    public final client.setting.RangeSetting settingHealth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingConsiderTargetHealth = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingNotWhileKillAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingWhileRegeneration = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingJumpAndPressS = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$fae8de1664(C_475c var1) {
      int[] var4;
      int var9;
      long var2 = a ^ 114830596175655L;
      long var10000 = -6877859535589397397L;
      var4 = AntiBot_47CG.method_40$d4d28024c9();
      long var10001 = -6877699304007339225L;
      Minecraft var5 = field_43;
      var9 = var5.field_42P.field_42X.field_42;
      label40:
      if (var4 == null) {
         if (var5.field_42P.field_42X.field_42 != this.field_42) {
            var9 = this.field_42;
            if (var4 != null) {
               break label40;
            }

            if (this.field_42 > -1) {
               return;
            }
         }

         var9 = this.field_42;
      }

      if (var4 == null) {
         if (var9 < 0) {
            return;
         }

         var10001 = -6877813388345200557L;
         Minecraft var6 = field_43;
         var9 = (int) ((var6.method_44$aae029aa0a()) ? 1 : 0);
      }

      if (var9 != 0) {
         long var10002 = -6880492824706237744L;
         boolean var7 = true;
         C_475c var8 = var1;
         var8.method_45$f633c984d8(var7);
      }
   }



    private boolean method_48$0dd78e0064(long l) {
        int[] nArray;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        int[] nArray2;
        int n;
        int[] nArray3;
        int n2;
        int n3;
        block61: {
            block59: {
                long l10;
                block60: {
                    int[] nArray4;
                    long l11;
                    long l12;
                    long l13;
                    long l14;
                    long l15;
                    block57: {
                        block58: {
                            int n4;
                            block56: {
                                int n5;
                                Object object;
                                Object object2;
                                long l16;
                                block49: {
                                    java.util.Iterator iterator;
                                    block47: {
                                        int[] nArray5;
                                        long l17;
                                        long l18;
                                        long l19;
                                        long l20;
                                        long l21;
                                        long l22;
                                        long l23;
                                        long l24;
                                        int[] nArray6;
                                        block52: {
                                            block50: {
                                                block51: {
                                                    int[] nArray7;
                                                    long l25;
                                                    long l26;
                                                    block48: {
                                                        block46: {
                                                            int[] nArray8;
                                                            block45: {
                                                                long l27 = l = a ^ l;
                                                                l16 = l27 ^ 0xFF021BA60CCL;
                                                                l15 = l27 ^ 0x3F2CA6F98EABL;
                                                                l10 = l27 ^ 0x14E17E2D578DL;
                                                                n3 = 0;
                                                                n2 = 0;
                                                                iterator = AutoGapple_47CD.recovery$indy$2(field_43, -9151934113679944873L, l).method_46$29638970ac().iterator();
                                                                nArray3 = AutoGapple_47CD.recovery$indy$1(-9152260345798456293L, l);
                                                                boolean bl = iterator.hasNext();
                                                                if (!bl) break block45;
                                                                object2 = (net.C_47hg)iterator.next();
                                                                nArray8 = nArray3;
                                                                n = ((net.C_47hg)object2).method_49$8abf5c6871();
                                                                if (nArray8 != null) break block46;
                                                                break block47;
                                                            }
                                                            n = 1;
                                                            n4 = n;
                                                            nArray8 = nArray3;
                                                            n = AutoGapple_47CD.recovery$indy$3(this.settingConsiderTargetHealth, -9155254349911691035L, l) ? 1 : 0;
                                                            if (nArray8 != null) break block48;
                                                            break block49;
                                                        }
                                                        int n6 = n;
                                                        n = AutoGapple_47CD.recovery$indy$3(this.settingConsiderTargetHealth, -9155254349911691035L, l) ? 1 : 0;
                                                    }
                                                    nArray6 = nArray3;
                                                    long l28 = l - 0L;
                                                    long l29 = l28 == 0L ? 0 : (l28 < 0L ? -1 : 1);
                                                    if (l29 >= 0) {
                                                        int[] nArray9 = nArray6;
                                                        if (nArray9 == null) {
                                                            int n7 = n;
                                                            if (n7 == 0) return 0 != 0;
                                                            float f = AutoGapple_47CD.recovery$indy$6(field_43, -9151934113679944873L, l).method_43$bc607678b6() - (float)AutoGapple_47CD.recovery$indy$7(this.settingHealth, -9154818257722383582L, l);
                                                            n = f == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                                                        }
                                                        nArray6 = nArray3;
                                                    }
                                                    if ((l26 = (l25 = l - 0L) == 0L ? 0 : (l25 < 0L ? -1 : 1)) >= 0) {
                                                        int[] nArray10 = nArray6;
                                                        if (nArray10 == null) {
                                                            int n8 = n;
                                                            if (n8 >= 0) return 0 != 0;
                                                            n = AutoGapple_47CD.recovery$indy$8(this.settingNotWhileKillAura, -9155254349911691035L, l) ? 1 : 0;
                                                        }
                                                        nArray6 = nArray3;
                                                    }
                                                    if ((nArray7 = nArray6) != null) break block50;
                                                    int n9 = n;
                                                    if (n9 == 0) break block51;
                                                    long l30 = l - 0L;
                                                    n9 = l30 == 0L ? 0 : (l30 < 0L ? -1 : 1);
                                                    nArray6 = nArray3;
                                                    n = ((int) (AutoGapple_47CD.recovery$indy$9(client.ClientGlobals.field_48.field_48Q, l15, -9151600179239374475L, l) ? 1 : 0));
                                                    if (n9 < 0) break block52;
                                                    int[] nArray11 = nArray6;
                                                    if (nArray11 != null) break block50;
                                                    int n10 = n;
                                                    if (n10 != 0) {
                                                        net.minecraft.entity.EntityLivingBase c_47aK = client.ClientGlobals.field_48.field_48Q.field_45z;
                                                        if (c_47aK != null) return 0 != 0;
                                                    }
                                                }
                                                n = AutoGapple_47CD.recovery$indy$10(l10, -9152010749975329738L, l) ? 1 : 0;
                                            }
                                            nArray6 = nArray3;
                                        }
                                        if ((l24 = (l23 = l - 0L) == 0L ? 0 : (l23 < 0L ? -1 : 1)) >= 0) {
                                            int[] nArray12 = nArray6;
                                            if (nArray12 == null) {
                                                int n11 = n;
                                                if (n11 != 0) return 0 != 0;
                                                n = n3;
                                            }
                                            nArray6 = nArray3;
                                        }
                                        if ((l22 = (l21 = l - 0L) == 0L ? 0 : (l21 < 0L ? -1 : 1)) >= 0) {
                                            int[] nArray13 = nArray6;
                                            if (nArray13 == null) {
                                                int n12 = n;
                                                if (n12 == 0) {
                                                    return n2 != 0;
                                                }
                                                n = n2;
                                            }
                                            nArray6 = nArray3;
                                        }
                                        if ((l20 = (l19 = l - 0L) == 0L ? 0 : (l19 < 0L ? -1 : 1)) >= 0) {
                                            int[] nArray14 = nArray6;
                                            if (nArray14 == null) {
                                                int n13 = n;
                                                if (n13 != 0) {
                                                    return n3 != 0;
                                                }
                                                float f = AutoGapple_47CD.recovery$indy$11(field_43, -9151934113679944873L, l).method_47$bc607678b6() - 0.0f;
                                                n = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                                            }
                                            nArray6 = nArray3;
                                        }
                                        if ((l18 = (l17 = l - 0L) == 0L ? 0 : (l17 < 0L ? -1 : 1)) > 0) {
                                            int[] nArray15 = nArray6;
                                            if (nArray15 == null) {
                                                int n14 = n;
                                                if (n14 != 0) return 0 != 0;
                                                n = AutoGapple_47CD.recovery$indy$12(this.settingWhileRegeneration, -9155254349911691035L, l) ? 1 : 0;
                                            }
                                            nArray6 = nArray3;
                                        }
                                        if ((nArray5 = nArray6) != null) return n != 0;
                                        int n15 = n;
                                        if (n15 != 0) return 1 != 0;
                                        return 0 != 0;
                                    }
                                    while (true) {
                                        boolean bl;
                                        Object object3;
                                        block54: {
                                            block55: {
                                                int n16;
                                                int n17;
                                                block53: {
                                                    n17 = net.C_47oY.field_46T.field_46q;
                                                    int n18 = n;
                                                    n16 = n17;
                                                    if (n18 != n16) break block53;
                                                    n3 = 1;
                                                    long l31 = l - 0L;
                                                    n18 = l31 == 0L ? 0 : (l31 < 0L ? -1 : 1);
                                                    object = nArray3;
                                                    if (n18 < 0) break block54;
                                                    Object object4 = object;
                                                    if (object4 == null) break block55;
                                                }
                                                n = ((net.C_47hg)object2).method_49$8abf5c6871();
                                                int n19 = n;
                                                n17 = net.C_47oY.field_46w.field_46q;
                                                n16 = n17;
                                                if (n19 == n16) {
                                                    n = 1;
                                                    n2 = n;
                                                }
                                            }
                                            object = nArray3;
                                        }
                                        if ((object3 = object) != null || !(bl = iterator.hasNext())) break;
                                        object2 = (net.C_47hg)iterator.next();
                                        n = ((net.C_47hg)object2).method_49$8abf5c6871();
                                    }
                                    n = 1;
                                    n4 = n;
                                    n = AutoGapple_47CD.recovery$indy$3(this.settingConsiderTargetHealth, -9155254349911691035L, l) ? 1 : 0;
                                }
                                if ((n5 = n) == 0) break block56;
                                object2 = AutoGapple_47CD.recovery$indy$4(l16, -9152167927957855563L, l);
                                object = object2;
                                Object object5 = object;
                                if (object5 == null) break block56;
                                object = object2;
                                long l32 = l - 0L;
                                long l33 = l32 == 0L ? 0 : (l32 < 0L ? -1 : 1);
                                nArray2 = nArray3;
                                float f = ((net.minecraft.entity.EntityLivingBase)object).method_43$bc607678b6() - AutoGapple_47CD.recovery$indy$5(field_43, -9151934113679944873L, l).method_43$bc607678b6();
                                n = f == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                                if (l33 < 0) break block57;
                                int[] nArray16 = nArray2;
                                if (nArray16 != null) break block58;
                                int n20 = n;
                                if (n20 < 0) {
                                    n4 = 0;
                                }
                            }
                            n = n4;
                        }
                        nArray2 = nArray3;
                    }
                    if ((l14 = (l13 = l - 0L) == 0L ? 0 : (l13 < 0L ? -1 : 1)) >= 0) {
                        int[] nArray17 = nArray2;
                        if (nArray17 == null) {
                            int n21 = n;
                            if (n21 == 0) return 0 != 0;
                            float f = AutoGapple_47CD.recovery$indy$6(field_43, -9151934113679944873L, l).method_43$bc607678b6() - (float)AutoGapple_47CD.recovery$indy$7(this.settingHealth, -9154818257722383582L, l);
                            n = f == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                        }
                        nArray2 = nArray3;
                    }
                    if ((l12 = (l11 = l - 0L) == 0L ? 0 : (l11 < 0L ? -1 : 1)) >= 0) {
                        int[] nArray18 = nArray2;
                        if (nArray18 == null) {
                            int n22 = n;
                            if (n22 >= 0) return 0 != 0;
                            n = AutoGapple_47CD.recovery$indy$8(this.settingNotWhileKillAura, -9155254349911691035L, l) ? 1 : 0;
                        }
                        nArray2 = nArray3;
                    }
                    if ((nArray4 = nArray2) != null) break block59;
                    int n23 = n;
                    if (n23 == 0) break block60;
                    long l34 = l - 0L;
                    n23 = l34 == 0L ? 0 : (l34 < 0L ? -1 : 1);
                    nArray2 = nArray3;
                    n = AutoGapple_47CD.recovery$indy$9(client.ClientGlobals.field_48.field_48Q, l15, -9151600179239374475L, l) ? 1 : 0;
                    if (n23 < 0) break block61;
                    int[] nArray19 = nArray2;
                    if (nArray19 != null) break block59;
                    int n24 = n;
                    if (n24 != 0) {
                        net.minecraft.entity.EntityLivingBase c_47aK = client.ClientGlobals.field_48.field_48Q.field_45z;
                        if (c_47aK != null) return 0 != 0;
                    }
                }
                n = AutoGapple_47CD.recovery$indy$10(l10, -9152010749975329738L, l) ? 1 : 0;
            }
            nArray2 = nArray3;
        }
        if ((l9 = (l8 = l - 0L) == 0L ? 0 : (l8 < 0L ? -1 : 1)) >= 0) {
            int[] nArray20 = nArray2;
            if (nArray20 == null) {
                int n25 = n;
                if (n25 != 0) return 0 != 0;
                n = n3;
            }
            nArray2 = nArray3;
        }
        if ((l7 = (l6 = l - 0L) == 0L ? 0 : (l6 < 0L ? -1 : 1)) >= 0) {
            int[] nArray21 = nArray2;
            if (nArray21 == null) {
                int n26 = n;
                if (n26 == 0) {
                    n = n2;
                    n26 = n;
                    if (n26 == 0) return 1 != 0;
                }
                n = n2;
            }
            nArray2 = nArray3;
        }
        if ((l5 = (l4 = l - 0L) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0) {
            int[] nArray22 = nArray2;
            if (nArray22 == null) {
                float f;
                int n27 = n;
                if (n27 != 0) {
                    n = n3;
                    n27 = n;
                    if (n27 == 0) return 1 != 0;
                }
                n = (f = AutoGapple_47CD.recovery$indy$11(field_43, -9151934113679944873L, l).method_47$bc607678b6() - 0.0f) == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
            }
            nArray2 = nArray3;
        }
        if ((l3 = (l2 = l - 0L) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
            int[] nArray23 = nArray2;
            if (nArray23 == null) {
                int n28 = n;
                if (n28 != 0) return 0 != 0;
                n = AutoGapple_47CD.recovery$indy$12(this.settingWhileRegeneration, -9155254349911691035L, l) ? 1 : 0;
            }
            nArray2 = nArray3;
        }
        if ((nArray = nArray2) != null) return n != 0;
        int n29 = n;
        if (n29 != 0) return 1 != 0;
        return 0 != 0;
    }





   public int method_49$8abf5c6871() {
      return this.field_42;
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      int[] var4;
      int var12;
      int[] var13;
      label61: {
         long var10000 = 6399262323951981609L;
         var4 = AntiBot_47CG.method_40$d4d28024c9();
         long var10001 = 6399563327498554213L;
         Minecraft var5 = field_43;
         var12 = var5.field_42P.field_42X.field_42;
         label60:
         if (var4 == null) {
            if (var5.field_42P.field_42X.field_42 != this.field_42) {
               var12 = this.field_42;
               var13 = var4;
               if (var2 <= 0L) {
                  break label61;
               }

               if (var4 != null) {
                  break label60;
               }

               if (this.field_42 > -1) {
                  return;
               }
            }

            var12 = this.field_42;
         }

         var13 = var4;
      }

      if (var2 >= 0L) {
         if (var13 == null) {
            if (var12 < 0) {
               return;
            }

            long var14 = 6399414088737867793L;
            Minecraft var6 = field_43;
            var12 = (int) ((var6.method_44$aae029aa0a()) ? 1 : 0);
         }

         var13 = var4;
      }

      if (var13 == null) {
         if (var12 == 0) {
            return;
         }

         long var15 = 6395142488621918423L;
         BooleanSetting var7 = this.settingJumpAndPressS;
         var12 = (int) ((var7.method_49$aae029aa0a()) ? 1 : 0);
      }

      if (var12 != 0) {
         long var10002 = 6399102102258652013L;
         float var8 = -1.0F;
         C_472n var9 = var1;
         var9.method_45$24a796ab4c(var8);
         var10002 = 6395493240827077052L;
         boolean var10 = true;
         C_472n var11 = var1;
         var11.method_47$f633c984d8(var10);
      }
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      label20: {
         int[] var4 = recovery$indy$13(2669471306688801260L, var1);
         C_473U var5 = recovery$indy$14(var3, 2667347831572503368L, var1);
         boolean var10000 = var5 instanceof C_47FQ;
         if (var4 == null) {
            if (var10000) {
               break label20;
            }

            var10000 = var5 instanceof C_47xZ;
         }

         if (!var10000) {
            return;
         }
      }

      recovery$indy$15(this.field_45, 2668696451413106158L, var1);
   }



   public void method_40G$e45a9973e5(long var1) {
      int[] var39;
      int var3;
      int var4;
      int var5;
      long var8;
      int[] var13;
      label126: {
         long var10001 = var1 ^ 6407505185672L;
         var3 = (int)((var1 ^ 6407505185672L) >>> 32);
         var4 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
         var5 = (int)(var10001 << 48 >>> 48);
         long var6 = var1 ^ 91688077236980L;
         var8 = var1 ^ 106978727381589L;
         long var10000 = -3626637941310602932L;
         var13 = AntiBot_47CG.method_40$d4d28024c9();
         this.field_42 = -1;
         AutoGapple_47CD var36 = this;
         if (var13 == null) {
            label129: {
               long var10002 = -3626694186722310354L;
               long var17 = var6;
               AutoGapple_47CD var19 = this;
               int var37 = (int) ((var19.method_48$0dd78e0064(var17)) ? 1 : 0);
               if (var1 > 0L) {
                  if (var37 == 0) {
                     break label129;
                  }

                  var10001 = -3626814022447030784L;
                  Minecraft var20 = field_43;
                  var37 = var20.field_42P.field_48y;
               }

               int[] var44 = var13;
               if (var1 >= 0L) {
                  if (var13 == null) {
                     if (var37 <= 10) {
                        break label129;
                     }

                     var10001 = -3626965494875988620L;
                     Minecraft var21 = field_43;
                     var37 = (int) ((var21.method_44$aae029aa0a()) ? 1 : 0);
                  }

                  var44 = var13;
               }

               if (var44 == null) {
                  if (var37 == 0) {
                     break label129;
                  }

                  var37 = 36;
               }

               int var14 = var37;

               do {
                  var10002 = -3626814022447030784L;
                  Minecraft var22 = field_43;
                  if (var14 >= var22.field_42P.field_429.field_46.size()) {
                     break;
                  }

                  var10001 = -3626814022447030784L;
                  Minecraft var23 = field_43;
                  C_47rf var15 = var23.field_42P.field_429.method_46$4c10532da1(var14).method_48$ac4db64966();
                  if (var13 != null) {
                     break label126;
                  }

                  label117: {
                     label131: {
                        C_47rf var38 = var15;
                        if (var13 == null) {
                           if (var15 == null) {
                              break label131;
                           }

                           var38 = var15;
                        }

                        C_43r var16 = var38.method_48$dbd570a038();
                        var39 = var13;
                        if (var1 <= 0L) {
                           continue;
                        }

                        if (var13 != null) {
                           break label117;
                        }

                        if (var16 == C_43r.method_49$c041c61fce(recovery$indy$16(23066, 5676718328575207936L ^ var1))) {
                           this.field_42 = var14 - 36;
                        }
                     }

                     var14++;
                  }

                  var39 = var13;
               } while (var39 == null);

               if (var1 <= 0L || var13 == null) {
                  break label126;
               }
            }

            var36 = this;
         }

         var10001 = -3628338360925431689L;
         RangeSetting var24 = var36.settingHealth;
         var24.method_43$fedcb3e4d3();
      }

      AutoGapple_47CD var42;
      label132: {
         long var10003 = -3627222742631680058L;
         long var25 = var8;
         long var27 = 250L;
         C_47cu var29 = this.field_45;
         int var41 = (int) ((var29.method_42$b0e346e6e3(var27, var25)) ? 1 : 0);
         if (var13 == null) {
            if (var41 == 0) {
               this.field_42 = -1;
            }

            var42 = this;
            if (var13 != null) {
               break label132;
            }

            var41 = this.field_42;
         }

         if (var41 < 0) {
            return;
         }

         var42 = this;
      }

      int var10 = this.field_42;
      byte var11 = 3;
      AutoGapple_47CD var12 = var42;
      char var49 = (char)var4;
      char var10004 = (char)var5;
      long var10006 = -3627526349995753641L;
      int var30 = var10;
      char var31 = var10004;
      char var32 = var49;
      byte var33 = var11;
      AutoGapple_47CD var34 = var12;
      int var35 = var3;
      C_47i.method_43$95cbd1eb82(var35, var34, var33, var32, var31, var30);
   }





   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$17(this, 7, var5, -7098813343973991973L, var1);
      recovery$indy$18(this, 26, var5, -7098813343973991973L, var1);
      recovery$indy$19(this, 34, var5, -7098813343973991973L, var1);
      recovery$indy$20(this, 21, 100, var3, -7101034066338278137L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public AutoGapple_47CD(long a0) {
        super((java.lang.String) ("AutoGapple"),(java.lang.String) ("AutoApfel"),(long) (((augustus.recovered.modules.combat.AutoGapple_47CD.a ^ a0) ^ 58366683214551L)),(java.awt.Color) (new java.awt.Color((int) (100),(int) (217),(int) (203))),(client.module.Category) (client.module.Category.COMBAT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.combat.AutoGapple_47CD.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.combat.AutoGapple_47CD.a ^ a0) ^ 91643352370767L) >>> 32));
        int constructorPart4 = (int) (((((augustus.recovered.modules.combat.AutoGapple_47CD.a ^ a0) ^ 91643352370767L) << 32) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.combat.AutoGapple_47CD.a ^ a0) ^ 91643352370767L) << 48) >>> 48));
        long constructorKey6 = ((augustus.recovered.modules.combat.AutoGapple_47CD.a ^ a0) ^ 136738505530154L);
        long constructorKey7 = ((augustus.recovered.modules.combat.AutoGapple_47CD.a ^ a0) ^ 74977492446924L);
        short converted8 = (short) (constructorPart4);
        short converted9 = (short) (constructorPart5);
        client.setting.RangeSetting initialized10 = new client.setting.RangeSetting(constructorPart3, this, "Health", Double.longBitsToDouble(4623507967449235456L), Double.longBitsToDouble(4624633867356078080L), converted8, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, converted9);
        long initialValue11 = constructorKey6;
        client.setting.RangeSetting initialValue12 = initialized10;
        java.lang.Object initialValue13 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue12))))));
        java.lang.Object initialValue14 = recovery$indy$flow$127(initialValue13, initialValue11);
        recovery$indy$flow$128(this, initialValue14);
        client.setting.BooleanSetting initialized15 = new client.setting.BooleanSetting(this, constructorKey7, "ConsiderTargetHealth", false);
        recovery$indy$flow$131(this, initialized15);
        client.setting.BooleanSetting initialized16 = new client.setting.BooleanSetting(this, constructorKey7, "NotWhileKillAura", false);
        recovery$indy$flow$134(this, initialized16);
        client.setting.BooleanSetting initialized17 = new client.setting.BooleanSetting(this, constructorKey7, "WhileRegeneration", false);
        recovery$indy$flow$137(this, initialized17);
        client.setting.BooleanSetting initialized18 = new client.setting.BooleanSetting(this, constructorKey7, "JumpAndPressS", false);
        recovery$indy$flow$140(this, initialized18);
        net.C_47cu initialized19 = new net.C_47cu();
        recovery$indy$flow$143(this, initialized19);
        recovery$indy$flow$144(this, -1);
        java.lang.Object initialValue20 = ((java.lang.Object)(((augustus.recovered.modules.combat.AutoGapple_47CD) (((java.lang.Object)(this)))).settingHealth));
        java.lang.Object initialValue21 = initialValue20;
        java.lang.Object initialValue22 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue21))))));
        double initialValue23 = recovery$indy$flow$147(initialValue22);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object recovery$indy$flow$127(java.lang.Object a0,long a1);
    private static native void recovery$indy$flow$128(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$131(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$134(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$137(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$140(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$143(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$144(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.combat.AutoGapple_47CD) (a0)).field_42 = a1;
        return;
    }


    private static native double recovery$indy$flow$147(java.lang.Object a0);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);
   private static native boolean recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityLivingBase recovery$indy$4(long var0, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$6(Object var0, long var1, long var3);
   private static native int recovery$indy$7(Object var0, long var1, long var3);
   private static native boolean recovery$indy$8(Object var0, long var1, long var3);
   private static native boolean recovery$indy$9(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$10(long var0, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);
   private static native boolean recovery$indy$12(Object var0, long var1, long var3);
   private static native int[] recovery$indy$13(long var0, long var2);
   private static native C_473U recovery$indy$14(Object var0, long var1, long var3);
   private static native void recovery$indy$15(Object var0, long var1, long var3);
   private static native String recovery$indy$16(int var0, long var1);
   private static native void recovery$indy$17(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$18(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$19(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$20(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native MethodHandle recovery$constant$21();
}
