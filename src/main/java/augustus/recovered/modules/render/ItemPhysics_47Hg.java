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
import net.C_43r;
import net.C_47AG;
import net.C_47BP;
import net.C_47I5;
import client.module.Module;
import client.setting.BooleanSetting;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47j9;
import net.C_47rf;
import client.module.Category;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ItemPhysics_47Hg extends client.module.Module {
    public final client.setting.BooleanSetting settingRotate = null; // Runtime access flags and ConstantValue are restored from the original class.
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

   private int method_42$19c1b04996(C_47rf var1, long var2) {
      var2 = a ^ var2;
      int[] var4 = recovery$indy$1(-535338217390522414L, var2);
      byte var5 = 1;
      int var10000 = var1.field_47;
      byte var10001 = 48;
      if (var4 == null) {
         label77: {
            if (var1.field_47 > 48) {
               var10000 = 5;
               if (var2 < 0L) {
                  break label77;
               }

               var5 = 5;
               if (var4 == null) {
                  return var5;
               }
            }

            var10000 = var1.field_47;
         }

         var10001 = 32;
      }

      int[] var10002 = var4;
      if (var2 > 0L) {
         if (var4 == null) {
            label65: {
               if (var10000 > var10001) {
                  var10000 = 4;
                  if (var2 < 0L) {
                     break label65;
                  }

                  var5 = 4;
                  if (var4 == null) {
                     return var5;
                  }
               }

               var10000 = var1.field_47;
            }

            var10001 = 16;
         }

         var10002 = var4;
      }

      if (var10002 == null) {
         label53: {
            if (var10000 > var10001) {
               var10000 = 3;
               if (var2 < 0L) {
                  break label53;
               }

               var5 = 3;
               if (var4 == null) {
                  return var5;
               }
            }

            var10000 = var1.field_47;
         }

         if (var4 != null) {
            return var10000;
         }

         var10001 = 1;
      }

      if (var10000 > var10001) {
         var5 = 2;
      }

      return var5;
   }



    private static native java.lang.reflect.Method d(long a0,long a1);

    public int method_43$4c0d76c81f(net.C_47BP c_47BP, double d, double d2, double d3, float f, int n, int n2, net.C_47AG c_47AG, char c) {
        int n3;
        block32: {
            float f2;
            float f3;
            int n4;
            block26: {
                int[] nArray;
                int[] nArray2;
                long l;
                block29: {
                    int[] nArray3;
                    block30: {
                        block28: {
                            int n5;
                            block31: {
                                int[] nArray4;
                                int[] nArray5;
                                block23: {
                                    block24: {
                                        float f4;
                                        block17: {
                                            block27: {
                                                int n6;
                                                block21: {
                                                    int n7;
                                                    block25: {
                                                        int[] nArray6;
                                                        int[] nArray7;
                                                        block15: {
                                                            block19: {
                                                                block11: {
                                                                    block22: {
                                                                        float f5;
                                                                        float f6;
                                                                        block13: {
                                                                            block18: {
                                                                                int n8;
                                                                                block20: {
                                                                                    block14: {
                                                                                        block16: {
                                                                                            block9: {
                                                                                                block12: {
                                                                                                    block10: {
                                                                                                        block8: {
                                                                                                            l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ a;
                                                                                                            long l2 = l ^ 0x5BFA0026F63L;
                                                                                                            net.C_47rf c_47rf = c_47BP.method_48$ac4db64966();
                                                                                                            net.C_43r c_43r = c_47rf.method_48$dbd570a038();
                                                                                                            nArray3 = ItemPhysics_47Hg.recovery$indy$2(5937573630578103590L, l);
                                                                                                            net.C_43r c_43r2 = c_43r;
                                                                                                            if (c_43r2 == null) {
                                                                                                                return 0;
                                                                                                            }
                                                                                                            n6 = ((int) (c_47AG.method_49$aae029aa0a() ? 1 : 0));
                                                                                                            n3 = ItemPhysics_47Hg.recovery$indy$3((Object)this, c_47rf, l2, 5937468041734521916L, l);
                                                                                                            float f7 = 0.25f;
                                                                                                            float f8 = -0.125f;
                                                                                                            n8 = n6;
                                                                                                            if (n8 == 0) {
                                                                                                                f8 = -0.175f;
                                                                                                            }
                                                                                                            float f9 = c_47AG.method_46$34fa6624ed().method_44$6b70208521((net.C_47I5)net.C_47I5.GROUND).field_48.y;
                                                                                                            n8 = n2;
                                                                                                            f6 = (float)d2 + f8 + 0.25f * f9;
                                                                                                            f5 = (float)d;
                                                                                                            if (n8 <= 0) break block8;
                                                                                                            net.minecraft.client.renderer.GlStateManager.method_42$c151fe78a0((float)f5, (float)f6, (float)((float)d3));
                                                                                                            int[] nArray8 = nArray3;
                                                                                                            n4 = n6;
                                                                                                            if (nArray8 != null) break block9;
                                                                                                            break block10;
                                                                                                        }
                                                                                                        f3 = f5 * f6;
                                                                                                        n8 = n6;
                                                                                                        if (n8 != 0) break block11;
                                                                                                        break block12;
                                                                                                    }
                                                                                                    int n9 = n4;
                                                                                                    if (n9 != 0) break block13;
                                                                                                    break block14;
                                                                                                }
                                                                                                f3 = -0.0f * (float)(n3 - 1) * 0.5f;
                                                                                                f2 = -0.0f * (float)(n3 - 1) * 0.5f;
                                                                                                float f10 = -0.046875f * (float)(n3 - 1) * 0.5f;
                                                                                                n8 = n;
                                                                                                nArray7 = nArray3;
                                                                                                n4 = c_47BP.field_48M ? 1 : 0;
                                                                                                if (n8 <= 0) break block15;
                                                                                                break block16;
                                                                                            }
                                                                                            f6 = 57.295776f;
                                                                                            f5 = ((float)n4 + f) / 20.0f + c_47BP.field_48z;
                                                                                            f4 = f5 * f6;
                                                                                            n7 = n6;
                                                                                            if (n7 != 0) break block17;
                                                                                            break block18;
                                                                                        }
                                                                                        int[] nArray9 = nArray7;
                                                                                        if (nArray9 != null) break block19;
                                                                                        break block20;
                                                                                    }
                                                                                    net.C_47oo c_47oo = ItemPhysics_47Hg.recovery$indy$4((Object)ItemPhysics_47Hg.field_43, (long)5937689167055936706L, (long)l).field_43K;
                                                                                    if (c_47oo == null) break block21;
                                                                                    break block13;
                                                                                }
                                                                                n8 = n4;
                                                                                if (n8 == 0) break block11;
                                                                                break block22;
                                                                            }
                                                                            f4 = -0.0f * (float)(n3 - 1) * 0.5f;
                                                                            float f11 = -0.0f * (float)(n3 - 1) * 0.5f;
                                                                            float f12 = -0.046875f * (float)(n3 - 1) * 0.5f;
                                                                            n7 = n;
                                                                            nArray5 = nArray3;
                                                                            n4 = c_47BP.field_48M ? 1 : 0;
                                                                            if (n7 <= 0) break block23;
                                                                            int[] nArray10 = nArray5;
                                                                            if (nArray10 != null) break block24;
                                                                            break block25;
                                                                        }
                                                                        n4 = c_47BP.method_48$8abf5c6871();
                                                                        f6 = 57.295776f;
                                                                        f5 = ((float)n4 + f) / 20.0f + c_47BP.field_48z;
                                                                        f3 = f5 * f6;
                                                                        break block21;
                                                                    }
                                                                    net.minecraft.client.renderer.GlStateManager.method_42$f2b6a9055b((float)180.0f, (float)0.0f, (float)1.0f, (float)1.0f);
                                                                }
                                                                f3 = 10.0f;
                                                                n4 = ((int) (c_47BP.field_48M ? 1 : 0));
                                                            }
                                                            nArray7 = nArray3;
                                                        }
                                                        if ((nArray6 = nArray7) != null) return n4;
                                                        int n10 = n4;
                                                        if (n10 != 0) {
                                                            net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                                                            return n3;
                                                        }
                                                        int[] nArray11 = nArray3;
                                                        n4 = ItemPhysics_47Hg.recovery$indy$5(this.settingRotate, 5937923660832286199L, l) ? 1 : 0;
                                                        if (nArray11 != null) return n4;
                                                        break block26;
                                                    }
                                                    n7 = n4;
                                                    if (n7 == 0) break block17;
                                                    break block27;
                                                }
                                                if ((n5 = n6) != 0) break block28;
                                                f3 = -0.0f * (float)(n3 - 1) * 0.5f;
                                                f2 = -0.0f * (float)(n3 - 1) * 0.5f;
                                                float f13 = -0.046875f * (float)(n3 - 1) * 0.5f;
                                                n5 = n;
                                                nArray2 = nArray3;
                                                n4 = c_47BP.field_48M ? 1 : 0;
                                                if (n5 <= 0) break block29;
                                                int[] nArray12 = nArray2;
                                                if (nArray12 != null) break block30;
                                                break block31;
                                            }
                                            net.minecraft.client.renderer.GlStateManager.method_42$f2b6a9055b((float)180.0f, (float)0.0f, (float)1.0f, (float)1.0f);
                                        }
                                        f4 = 10.0f;
                                        n4 = c_47BP.field_48M ? 1 : 0;
                                    }
                                    nArray5 = nArray3;
                                }
                                if ((nArray4 = nArray5) != null) return n4;
                                int n11 = n4;
                                if (n11 == 0) return ItemPhysics_47Hg.recovery$indy$5(this.settingRotate, 5937923660832286199L, l) ? 1 : 0;
                                net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                                return n3;
                            }
                            n5 = n4;
                            if (n5 != 0) {
                                net.minecraft.client.renderer.GlStateManager.method_42$f2b6a9055b((float)180.0f, (float)0.0f, (float)1.0f, (float)1.0f);
                            }
                        }
                        f3 = 10.0f;
                        n4 = c_47BP.field_48M ? 1 : 0;
                    }
                    nArray2 = nArray3;
                }
                if ((nArray = nArray2) != null) return n4;
                int n12 = n4;
                if (n12 != 0) break block32;
                n4 = ItemPhysics_47Hg.recovery$indy$5(this.settingRotate, 5937923660832286199L, l) ? 1 : 0;
            }
            int n13 = n4;
            if (n13 != 0) {
                f2 = (float)c_47BP.method_48$8abf5c6871() * f3 % 360.0f;
                net.minecraft.client.renderer.GlStateManager.method_42$f2b6a9055b((float)f2, (float)1.0f, (float)0.0f, (float)1.0f);
            }
        }
        net.minecraft.client.renderer.GlStateManager.method_47$f2b6a9055b((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return n3;
    }




   public void method_43_$e45a9973e5(long var1) {
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public ItemPhysics_47Hg(long a0) {
        super((java.lang.String) ("ItemPhysics"),(java.lang.String) ("ArtikelPhysiken"),(long) (((augustus.recovered.modules.render.ItemPhysics_47Hg.a ^ a0) ^ 116699701221464L)),(java.awt.Color) (new java.awt.Color((int) (65),(int) (224),(int) (145))),(client.module.Category) (client.module.Category.RENDER));
        long settingKey = (augustus.recovered.modules.render.ItemPhysics_47Hg.a ^ a0) ^ 29720227497027L;
        client.setting.BooleanSetting setting = new client.setting.BooleanSetting(this, settingKey, "Rotate", true);
        recovery$indy$flow$33(this, setting);
    }



    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native void recovery$indy$flow$33(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native int[] recovery$indy$2(long var0, long var2);
   private static native int recovery$indy$3(Object var0, Object var1, long var2, long var4, long var6);
   private static native C_47j9 recovery$indy$4(Object var0, long var1, long var3);
   private static native boolean recovery$indy$5(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$6();
}
