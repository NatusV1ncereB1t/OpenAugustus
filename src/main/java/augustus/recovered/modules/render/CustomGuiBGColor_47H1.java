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
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.render.RenderPass;
import net.C_47Fw;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.BooleanSetting;
import client.setting.ColorSetting;
import net.minecraft.client.renderer.GlStateManager;
import net.C_47g5;
import net.C_47jh;
import net.C_47qe;
import client.module.Category;
import net.C_47ve;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class CustomGuiBGColor_47H1 extends client.module.Module implements net.C_47jh {
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

    public void method_44$4593d7e143(long l, C_47qe c_47qe) {
        long l2 = l;
        long l3 = l2 ^ 0x4F5C1A9DEEFDL;
        long l4 = l2 ^ 0x2B029BAE98BBL;
        long l5 = l2 ^ 0x67314229BF5AL;
        GuiScreen c_47Lv = CustomGuiBGColor_47H1.recovery$indy$1(c_47qe, 696861250847328348L, l);
        C_47ve[] c_47veArray = CustomGuiBGColor_47H1.recovery$indy$3(694976518909162292L, l);
        int n = c_47veArray.length;
        int n2 = 0;
        int[] nArray = CustomGuiBGColor_47H1.recovery$indy$2(695688858231475786L, l);
        while (n2 < n) {
            int[] nArray2;
            block5: {
                block6: {
                    block8: {
                        block11: {
                            int n3;
                            block10: {
                                boolean bl;
                                C_47ve c_47ve;
                                block9: {
                                    block7: {
                                        c_47ve = c_47veArray[n2];
                                        nArray2 = nArray;
                                        if (l <= 0L) break block5;
                                        if (nArray2 != null) break block6;
                                        bl = CustomGuiBGColor_47H1.recovery$indy$4(c_47ve, 695116338181023350L, l);
                                        if (l < 0L) break block7;
                                        if (!bl) break block8;
                                        bl = (Boolean)CustomGuiBGColor_47H1.recovery$indy$5(c_47ve, 696722444007126050L, l).apply(c_47Lv);
                                    }
                                    if (nArray != null) break block9;
                                    if (!bl) break block8;
                                    bl = CustomGuiBGColor_47H1.recovery$indy$6(l3, 694911165360467346L, l);
                                }
                                boolean bl2 = bl;
                                CustomGuiBGColor_47H1.recovery$indy$7(695173301402732072L, l);
                                int n4 = GlStateManager.method_40H$8abf5c6871();
                                float f = GlStateManager.method_42$bc607678b6();
                                GlStateManager.method_46$3ebc9ac54d((int)n4, (float)0.0f);
                                CustomGuiBGColor_47H1.recovery$indy$10(CustomGuiBGColor_47H1.recovery$indy$9(CustomGuiBGColor_47H1.recovery$indy$8(c_47ve, 696480346182602779L, l), 695596270025632732L, l), false, l4, 695772041555404811L, l);
                                CustomGuiBGColor_47H1.recovery$indy$12(false, l5, CustomGuiBGColor_47H1.recovery$indy$11(c_47Lv, c_47ve), 696615823782499471L, l);
                                n3 = n4;
                                if (l < 0L) break block10;
                                GlStateManager.method_46$3ebc9ac54d((int)n3, (float)f);
                                if (nArray != null) break block11;
                                n3 = bl2 ? 1 : 0;
                            }
                            if (n3 != 0) {
                                CustomGuiBGColor_47H1.recovery$indy$13(696702434719906246L, l);
                            }
                            c_47qe.cancel();
                        }
                        return;
                    }
                    ++n2;
                }
                nArray2 = nArray;
            }
            if (nArray2 == null) continue;
        }
    }




   private static void method_47$7a9d9ffd1d(GuiScreen var0, C_47ve var1, RenderPass var2) {
      long var3 = a ^ 62831730392338L;
      long var10001 = var3 ^ 96195834070823L;
      int var5 = (int)((var3 ^ 96195834070823L) >>> 32);
      int var6 = (int)((var3 ^ 96195834070823L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var10000 = 8480486265859142237L;
      int[] var8 = AntiStrike_47Qa.method_42$d4d28024c9();
      if (var2 == RenderPass.BLUR) {
         C_47g5.method_48$0f4d4a7a6c(0, 0, var0.field_43t, var0.field_49, -1);
         if (var8 == null) {
            return;
         }
      }

      int var10002 = var0.field_43t;
      int var10003 = var0.field_49;
      long var10005 = 8481291819494524819L;
      C_47ve var9 = var1;
      ColorSetting var10004 = C_47ve.method_46$b2ead251fa(var9);
      short var10006 = (short)var6;
      char var10007 = (char)var7;
      long var10009 = 8480918310972588386L;
      byte var10 = 0;
      char var11 = var10007;
      short var12 = var10006;
      int var13 = var5;
      ColorSetting var14 = var10004;
      C_47g5.method_48$0f4d4a7a6c(0, 0, var10002, var10003, var14.method_47$24af287d8f(var13, var12, var11, var10));
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$14(this, 54, var3, -7098964438286743354L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public CustomGuiBGColor_47H1(long a0,short a1) {
        super((java.lang.String) ("CustomGuiBGColor"),(java.lang.String) ("EinstellbareFenserHintergrundfarbe"),(long) (((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.render.CustomGuiBGColor_47H1.a) ^ 55204169607968L)),(java.awt.Color) (new java.awt.Color((int) (235),(int) (190),(int) (127))),(client.module.Category) (client.module.Category.RENDER));
        long constructorKey1 = (((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.render.CustomGuiBGColor_47H1.a);
        long constructorKey2 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.render.CustomGuiBGColor_47H1.a) ^ 4161314285270L);
        int constructorPart3 = (int) ((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.render.CustomGuiBGColor_47H1.a) ^ 58533474568650L) >>> 48));
        int constructorPart4 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.render.CustomGuiBGColor_47H1.a) ^ 58533474568650L) << 16) >>> 48));
        int constructorPart5 = (int) (((((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.render.CustomGuiBGColor_47H1.a) ^ 58533474568650L) << 32) >>> 32));
        long constructorKey6 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.render.CustomGuiBGColor_47H1.a) ^ 59024771641009L);
        long constructorKey7 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.render.CustomGuiBGColor_47H1.a) ^ 25088439969461L);
        long constructorKey8 = ((((a0 << 16) | (((long) (a1) << 48) >>> 48)) ^ augustus.recovered.modules.render.CustomGuiBGColor_47H1.a) ^ 79961374774606L);
        java.lang.Object initialValue9 = recovery$indy$flow$36();
        client.setting.MultiSelectSetting initialized10 = new client.setting.MultiSelectSetting(this, "Guis", constructorKey2, (net.C_47OZ[]) (initialValue9));
        java.lang.Object initialValue11 = recovery$indy$flow$38();
        java.lang.Object initialValue12 = recovery$indy$flow$39();
        java.lang.Object initialValue13 = initialValue12;
        java.lang.Object initialValue14 = initialValue11;
        int length15 = java.lang.reflect.Array.getLength(initialValue13);
        int initialValue16 = length15;
        int initialValue17 = 0;
        CustomGuiBGColor_47H1 loopLocal18 = this;
        long loopLocal19 = constructorKey1;
        int loopLocal20 = constructorPart3;
        int loopLocal21 = constructorPart4;
        int loopLocal22 = constructorPart5;
        long loopLocal23 = constructorKey6;
        long loopLocal24 = constructorKey7;
        long loopLocal25 = constructorKey8;
        java.lang.Object loopLocal26 = initialValue13;
        java.lang.Object loopLocal27 = initialValue14;
        int loopLocal28 = initialValue16;
        int loopLocal29 = initialValue17;
        loop30: while (true) {
            if (loopLocal29 >= loopLocal28) {
                break loop30;
            } else {
                java.lang.Object arrayValue31 = ((java.lang.Object[]) loopLocal26)[loopLocal29];
                java.lang.Object initialValue32 = arrayValue31;
                java.lang.Object initialValue33 = initialValue32;
                java.lang.Object initialValue34 = ((java.lang.Object)(((net.C_47ve) (((java.lang.Object)(initialValue33))))));
                java.lang.Object initialValue35 = recovery$indy$flow$42(initialValue34);
                client.setting.SettingGroup initialized36 = new client.setting.SettingGroup((client.module.Module) (loopLocal18), (java.lang.String) (initialValue35), true, loopLocal23);
                client.setting.SettingGroup initialValue37 = initialized36;
                java.lang.StringBuilder initialized38 = new java.lang.StringBuilder();
                java.lang.Object initialValue39 = initialValue32;
                java.lang.Object initialValue40 = ((java.lang.Object)(((net.C_47ve) (((java.lang.Object)(initialValue39))))));
                java.lang.Object initialValue41 = recovery$indy$flow$48(initialValue40);
                java.lang.Object initialValue42 = recovery$indy$flow$49(initialized38, initialValue41);
                java.lang.Object initialValue43 = recovery$indy$flow$50(initialValue42, "Color");
                java.lang.Object initialValue44 = recovery$indy$flow$51(initialValue43);
                java.awt.Color initialized45 = new java.awt.Color(0, 0, 0, 50);
                client.setting.ColorSetting initialized46 = new client.setting.ColorSetting((client.module.Module) (loopLocal18), (java.lang.String) (initialValue44), loopLocal24, initialized45, initialValue37);
                long initialValue47 = loopLocal25;
                java.lang.String initialValue48 = "Color";
                client.setting.ColorSetting initialValue49 = initialized46;
                java.lang.Object initialValue50 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue49))))));
                java.lang.Object initialValue51 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue48))))));
                java.lang.Object initialValue52 = recovery$indy$flow$57(initialValue50, initialValue51, initialValue47);
                java.lang.Object initialValue53 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue52))))));
                java.lang.Object initialValue54 = initialValue53;
                java.lang.Object initialValue55 = initialValue32;
                java.lang.Object initialValue56 = ((java.lang.Object)(((net.C_47ve) (((java.lang.Object)(initialValue55))))));
                java.lang.Object initialValue57 = ((java.lang.Object)(((client.setting.ColorSetting) (((java.lang.Object)(initialValue54))))));
                java.lang.Object initialValue58 = recovery$indy$flow$61(initialValue56, initialValue57);
                java.lang.StringBuilder initialized59 = new java.lang.StringBuilder();
                java.lang.Object initialValue60 = initialValue32;
                java.lang.Object initialValue61 = ((java.lang.Object)(((net.C_47ve) (((java.lang.Object)(initialValue60))))));
                java.lang.Object initialValue62 = recovery$indy$flow$66(initialValue61);
                java.lang.Object initialValue63 = recovery$indy$flow$67(initialized59, initialValue62);
                java.lang.Object initialValue64 = recovery$indy$flow$68(initialValue63, "Blur");
                java.lang.Object initialValue65 = recovery$indy$flow$69(initialValue64);
                short converted66 = (short) (loopLocal20);
                char converted67 = (char) (loopLocal21);
                client.setting.BooleanSetting initialized68 = new client.setting.BooleanSetting((client.module.Module) (loopLocal18), (java.lang.String) (initialValue65), converted66, converted67, loopLocal22, false, initialValue37);
                long initialValue69 = loopLocal25;
                java.lang.String initialValue70 = "Blur";
                client.setting.BooleanSetting initialValue71 = initialized68;
                java.lang.Object initialValue72 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue71))))));
                java.lang.Object initialValue73 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue70))))));
                java.lang.Object initialValue74 = recovery$indy$flow$73(initialValue72, initialValue73, initialValue69);
                java.lang.Object initialValue75 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue74))))));
                java.lang.Object initialValue76 = initialValue75;
                java.lang.Object initialValue77 = initialValue32;
                java.lang.Object initialValue78 = ((java.lang.Object)(((net.C_47ve) (((java.lang.Object)(initialValue77))))));
                java.lang.Object initialValue79 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue76))))));
                java.lang.Object initialValue80 = recovery$indy$flow$77(initialValue78, initialValue79);
                int incremented81 = loopLocal29 + (1);
                if (loopLocal27 == null) {
                    CustomGuiBGColor_47H1 loopNext82 = loopLocal18;
                    long loopNext83 = loopLocal19;
                    int loopNext84 = loopLocal20;
                    int loopNext85 = loopLocal21;
                    int loopNext86 = loopLocal22;
                    long loopNext87 = loopLocal23;
                    long loopNext88 = loopLocal24;
                    long loopNext89 = loopLocal25;
                    java.lang.Object loopNext90 = loopLocal26;
                    java.lang.Object loopNext91 = loopLocal27;
                    int loopNext92 = loopLocal28;
                    int loopNext93 = incremented81;
                    loopLocal18 = loopNext82;
                    loopLocal19 = loopNext83;
                    loopLocal20 = loopNext84;
                    loopLocal21 = loopNext85;
                    loopLocal22 = loopNext86;
                    loopLocal23 = loopNext87;
                    loopLocal24 = loopNext88;
                    loopLocal25 = loopNext89;
                    loopLocal26 = loopNext90;
                    loopLocal27 = loopNext91;
                    loopLocal28 = loopNext92;
                    loopLocal29 = loopNext93;
                    continue loop30;
                } else {
                    break loop30;
                }
            }
        }
        return;
    }





    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$36();
    private static native java.lang.Object recovery$indy$flow$38();
    private static native java.lang.Object recovery$indy$flow$39();

    private static native java.lang.Object recovery$indy$flow$42(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$48(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$49(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$50(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$51(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$57(java.lang.Object a0,java.lang.Object a1,long a2);



    private static native java.lang.Object recovery$indy$flow$61(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$66(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$67(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$68(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$69(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$73(java.lang.Object a0,java.lang.Object a1,long a2);



    private static native java.lang.Object recovery$indy$flow$77(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native GuiScreen recovery$indy$1(Object var0, long var1, long var3);
   private static native int[] recovery$indy$2(long var0, long var2);
   private static native C_47ve[] recovery$indy$3(long var0, long var2);
   private static native boolean recovery$indy$4(Object var0, long var1, long var3);
   private static native Function recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$6(long var0, long var2, long var4);
   private static native void recovery$indy$7(long var0, long var2);
   private static native BooleanSetting recovery$indy$8(Object var0, long var1, long var3);
   private static native boolean recovery$indy$9(Object var0, long var1, long var3);
   private static native void recovery$indy$10(boolean var0, boolean var1, long var2, long var4, long var6);
   private static native C_47Fw recovery$indy$11(GuiScreen var0, C_47ve var1);
   private static native void recovery$indy$12(boolean var0, long var1, Object var3, long var4, long var6);
   private static native void recovery$indy$13(long var0, long var2);
   private static native void recovery$indy$14(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$15();
}
