package augustus.recovered.modules.fun;
import de.florianmichael.dietrichevents2.DietrichEvents2;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_42C;
import client.module.Module;
import net.C_47TB;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47nb;
import client.ClientGlobals;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ShuffleMode_47CK extends client.module.Module implements net.C_47xz {
    private final net.C_47TB field_41 = null; // Runtime access flags and ConstantValue are restored from the original class.
    boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.reflect.Method d(long a0,long a1);

    public void method_47$b757cde368(long l, boolean bl) {
        String string;
        long l2;
        long l3;
        int n;
        int n2;
        int n3;
        block15: {
            long l4;
            block16: {
                String[] stringArray;
                long l5;
                block17: {
                    String string2;
                    block13: {
                        long l6;
                        block11: {
                            block14: {
                                long l7;
                                block12: {
                                    ShuffleMode_47CK shuffleMode_47CK;
                                    block10: {
                                        long l8 = l;
                                        long l9 = l8 ^ 0x25416C777076L;
                                        n3 = (int)(l9 >>> 48);
                                        n2 = (int)(l9 << 16 >>> 32);
                                        n = (int)(l9 << 48 >>> 48);
                                        l7 = l8 ^ 0L;
                                        l4 = l8 ^ 0x72B90522EE3AL;
                                        l3 = l8 ^ 0x240AB5E12D74L;
                                        l2 = l8 ^ 0x1FDD386A19E0L;
                                        l6 = l8 ^ 0x23B80E32906EL;
                                        l5 = l8 ^ 0x30166C05C100L;
                                        stringArray = ShuffleMode_47CK.recovery$indy$1(6165582548738369455L, l);
                                        shuffleMode_47CK = this;
                                        if (stringArray == null) break block10;
                                        if (shuffleMode_47CK.field_43a) break block11;
                                        break block12;
                                    }
                                    super.method_47$b757cde368(l7, bl);
                                    string2 = ShuffleMode_47CK.recovery$indy$2(ClientGlobals.field_48.field_46E.settingToggleAnimation, l6, 6165481682533163198L, l);
                                    if (l < 0L) break block13;
                                    break block14;
                                }
                                super.method_47$b757cde368(l7, bl);
                                return;
                            }
                            ShuffleMode_47CK.recovery$indy$12(this.field_48, true, l4, 6166024637588383059L, l);
                            break block13;
                        }
                        string = ShuffleMode_47CK.recovery$indy$2(ClientGlobals.field_48.field_46E.settingToggleAnimation, l6, 6165481682533163198L, l);
                        if (l < 0L) break block15;
                        if (!((Boolean)ShuffleMode_47CK.recovery$indy$3(this.field_48, 6166104715255550029L, l)).booleanValue()) break block16;
                        break block17;
                    }
                    if (string2.equals(ShuffleMode_47CK.recovery$indy$18(10361, 0x6240A789893DCAA4L ^ l))) return;
                    this.field_431.method_44$7c39c8007b((int)ShuffleMode_47CK.recovery$indy$19(ClientGlobals.field_48.field_46E.settingAnimationTime, l2, 6169011231044934552L, l), C_47nb.method_41$7498260812((String)string2), 1, false);
                    return;
                }
                ShuffleMode_47CK.recovery$indy$4(this.field_48, false, l4, 6166024637588383059L, l);
                String[] stringArray2 = stringArray;
                if (l >= 0L) {
                    if (stringArray2 != null) {
                        if (ShuffleMode_47CK.recovery$indy$5(field_43, 6166286612558520727L, l) != null) {
                            if (ShuffleMode_47CK.recovery$indy$6(ClientGlobals.field_48.field_46d.settingModuleToggleSound, 6168944069336071814L, l)) {
                                if (ShuffleMode_47CK.recovery$indy$7((Object)this, l3, 6166133401545646806L, l)) {
                                    C_42C.method_46$f98697054d((Runnable)ShuffleMode_47CK.recovery$indy$8());
                                }
                            }
                        }
                        ShuffleMode_47CK.recovery$indy$9((Object)this, l5, 6166484746990322552L, l);
                    }
                    stringArray2 = stringArray;
                }
                if (l > 0L) {
                    if (stringArray2 != null) {
                        if (string.equals(ShuffleMode_47CK.recovery$indy$10(5554, 0x3C3097FA1E39F768L ^ l))) return;
                        this.field_431.method_44$7c39c8007b((int)ShuffleMode_47CK.recovery$indy$11(ClientGlobals.field_48.field_46E.settingAnimationTime, l2, 6169011231044934552L, l), C_47nb.method_41$7498260812((String)string), 0, false);
                    }
                    stringArray2 = stringArray;
                }
                if (stringArray2 != null) return;
            }
            ShuffleMode_47CK.recovery$indy$12(this.field_48, true, l4, 6166024637588383059L, l);
        }
        if (ShuffleMode_47CK.recovery$indy$13(field_43, 6166286612558520727L, l) != null) {
            if (ShuffleMode_47CK.recovery$indy$14(ClientGlobals.field_48.field_46d.settingModuleToggleSound, 6168944069336071814L, l)) {
                if (ShuffleMode_47CK.recovery$indy$15((Object)this, l3, 6166133401545646806L, l)) {
                    C_42C.method_46$f98697054d((Runnable)ShuffleMode_47CK.recovery$indy$16());
                }
            }
        }
        ShuffleMode_47CK.recovery$indy$17((Object)this, (short)n3, n2, (char)n, 6169115958393815896L, l);
        if (string.equals(ShuffleMode_47CK.recovery$indy$18(10361, 0x6240A789893DCAA4L ^ l))) return;
        this.field_431.method_44$7c39c8007b((int)ShuffleMode_47CK.recovery$indy$19(ClientGlobals.field_48.field_46E.settingAnimationTime, l2, 6169011231044934552L, l), C_47nb.method_41$7498260812((String)string), 1, false);
    }





   public void method_43_$e45a9973e5(long var1) {
   }



   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4;
      long var6;
      long var8;
      long var18;
      String[] var20;
      label86: {
         var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
         var6 = var4 ^ 108095537184954L;
         var8 = var4 ^ 58599486327058L;
         long var10001 = var4 ^ 124833219981816L;
         int var10 = (int)((var4 ^ 124833219981816L) >>> 32);
         int var11 = (int)((var4 ^ 124833219981816L) << 32 >>> 48);
         int var12 = (int)(var10001 << 48 >>> 48);
         var10001 = var4 ^ 129292680664087L;
         int var13 = (int)((var4 ^ 129292680664087L) >>> 48);
         int var14 = (int)((var4 ^ 129292680664087L) << 16 >>> 32);
         int var15 = (int)(var10001 << 48 >>> 48);
         long var16 = var4 ^ 427439344459L;
         var18 = var4 ^ 72696128996970L;
         var20 = recovery$indy$20(2183952821695720561L, var4);
         C_47TB var10000 = this.field_41;
         if (var20 != null) {
            int var35 = var10;
            int var10002 = (char)var11;
            char var10003 = (char)var12;
            if (var3 >= 0) {
               if (recovery$indy$21(this.field_41, var10, (char)var10002, var10003, 2183276621556147652L, var4)) {
                  break label86;
               }

               try {
                  var10000 = this.field_41;
                  var35 = (short)var13;
                  var10002 = var14;
                  var10003 = (char)var15;
               } catch (Exception var27) {
                  break label86;
               }
            }

            try {
               recovery$indy$23(
                  var10000, (short)var35, var10002, var10003, recovery$indy$22(15884, 2026195423535994633L ^ var4), true, 2183685182593394480L, var4
               );
               var10000 = this.field_41;
            } catch (Exception var26) {
               break label86;
            }
         }

         try {
            recovery$indy$24(var10000, var16, 10000, 2183411588308194355L, var4);
         } catch (Exception var25) {
         }
      }

      ArrayList var21 = new ArrayList();
      Iterator var22 = recovery$indy$25(ClientGlobals.field_48, var18, 2180734024596732506L, var4).iterator();

      byte var31;
      label75: {
         label74:
         while (true) {
            Object var30;
            if (var22.hasNext()) {
               var30 = var22.next();
            } else {
               var30 = var21;
               if (var3 > 0) {
                  Collections.shuffle(var21);
                  break;
               }
            }

            do {
               Module var23 = (Module)var30;
               var31 = (byte) ((var21.add(recovery$indy$26(var23, 2180600436453710514L, var4))) ? 1 : 0);
               if (var2 <= 0) {
                  break label75;
               }

               if (var20 == null) {
                  break label74;
               }

               if (var20 != null) {
                  continue label74;
               }

               var30 = var21;
            } while (var3 <= 0);

            Collections.shuffle(var21);
            break;
         }

         var31 = 0;
      }

      int var28 = var31;
      Iterator var29 = recovery$indy$27(ClientGlobals.field_48, var18, 2180734024596732506L, var4).iterator();

      label56:
      while (true) {
         Object var32;
         if (var29.hasNext()) {
            var32 = var29.next();
         } else {
            var32 = ClientGlobals.field_48;
            if (var2 > 0) {
               recovery$indy$29(ClientGlobals.field_48, var8, 2180416199095499558L, var4);
               break;
            }
         }

         do {
            Module var24 = (Module)var32;
            recovery$indy$28(var24, (String)var21.get(var28), var6, 2180809748886238716L, var4);
            var28++;
            String[] var33 = var20;
            if (var2 >= 0) {
               if (var20 == null) {
                  return;
               }

               var33 = var20;
            }

            if (var33 != null) {
               continue label56;
            }

            var32 = ClientGlobals.field_48;
         } while (var2 <= 0);

         recovery$indy$29(ClientGlobals.field_48, var8, 2180416199095499558L, var4);
         break;
      }
   }




   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      recovery$indy$30(2732247503686133864L, var4).subscribe(40, this);
      this.field_43a = true;
   }



    public ShuffleMode_47CK(int a0,int a1,byte a2) {
        super((java.lang.String) ("ShuffleMode"),(java.lang.String) ("MischMode"),(long) (((((((long) (a0) << 32) | (((long) (a1) << 40) >>> 32)) | (((long) (a2) << 56) >>> 56)) ^ augustus.recovered.modules.fun.ShuffleMode_47CK.a) ^ 105390887260376L)),(java.awt.Color) (new java.awt.Color((int) (102),(int) (242),(int) (207))),(client.module.Category) (client.module.Category.FUN));
        long constructorKey1 = (((((long) (a0) << 32) | (((long) (a1) << 40) >>> 32)) | (((long) (a2) << 56) >>> 56)) ^ augustus.recovered.modules.fun.ShuffleMode_47CK.a);
        net.C_47TB initialized2 = new net.C_47TB();
        recovery$indy$flow$93(this, initialized2);
        recovery$indy$flow$94(this, false);
        int initialValue3 = 0;
        ShuffleMode_47CK initialValue4 = this;
        java.lang.Object initialValue5 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(initialValue4))))));
        recovery$indy$flow$96(initialValue5, (initialValue3 != 0));
    }



    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native void recovery$indy$flow$93(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$94(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.fun.ShuffleMode_47CK) (a0)).field_43a = a1;
        return;
    }

    private static native void recovery$indy$flow$96(java.lang.Object a0,boolean a1);
   private static native MethodHandle recovery$constant$0();
   private static native String[] recovery$indy$1(long var0, long var2);
   private static native String recovery$indy$2(Object var0, long var1, long var3, long var5);
   private static native Object recovery$indy$3(Object var0, long var1, long var3);
   private static native void recovery$indy$4(Object var0, Object var1, long var2, long var4, long var6);
   private static native WorldClient recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native Runnable recovery$indy$8();
   private static native void recovery$indy$9(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$10(int var0, long var1);
   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$12(Object var0, Object var1, long var2, long var4, long var6);
   private static native WorldClient recovery$indy$13(Object var0, long var1, long var3);
   private static native boolean recovery$indy$14(Object var0, long var1, long var3);
   private static native boolean recovery$indy$15(Object var0, long var1, long var3, long var5);
   private static native Runnable recovery$indy$16();
   private static native void recovery$indy$17(Object var0, short var1, int var2, char var3, long var4, long var6);
   private static native String recovery$indy$18(int var0, long var1);
   private static native double recovery$indy$19(Object var0, long var1, long var3, long var5);
   private static native String[] recovery$indy$20(long var0, long var2);
   private static native boolean recovery$indy$21(Object var0, int var1, char var2, char var3, long var4, long var6);
   private static native String recovery$indy$22(int var0, long var1);
   private static native void recovery$indy$23(Object var0, short var1, int var2, char var3, Object var4, boolean var5, long var6, long var8);
   private static native void recovery$indy$24(Object var0, long var1, int var3, long var4, long var6);
   private static native CopyOnWriteArrayList recovery$indy$25(Object var0, long var1, long var3, long var5);
   private static native String recovery$indy$26(Object var0, long var1, long var3);
   private static native CopyOnWriteArrayList recovery$indy$27(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$28(Object var0, Object var1, long var2, long var4, long var6);
   private static native void recovery$indy$29(Object var0, long var1, long var3, long var5);
   private static native DietrichEvents2 recovery$indy$30(long var0, long var2);
   private static native MethodHandle recovery$constant$31();
}
