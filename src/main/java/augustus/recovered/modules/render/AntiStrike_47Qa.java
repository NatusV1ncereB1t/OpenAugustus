package augustus.recovered.modules.render;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_473U;
import net.C_4742;
import net.C_47AL;
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.setting.BooleanSetting;
import net.C_47Ut;
import net.C_47WT;
import net.C_47iC;
import net.C_47ob;
import client.module.Category;
import net.C_4f;

public class AntiStrike_47Qa extends Module implements C_47iC {
   public final MultiSelectSetting settingComponentsToHide;
   public final BooleanSetting settingReplaceServerName;
   public final BooleanSetting settingRemoveColorCodes;
   private String field_43Y;
   private String field_43;
   private String field_43E;
   private String field_40;
   private static int[] field_44;
   private static final long a = C_4f.a(-2030729205399189208L, 7704900903679348106L, MethodHandles.lookup().lookupClass()).a(237790356315309L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[30];
   private static final String[] f = new String[30];

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Field b(Class var0, String var1, Class var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Class b(long var0, long var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   public static void method_46$2022b4f670(int[] var0) {
      field_44 = var0;
   }

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native int a(long var0, long var2);

   private static native void a();

   public static int[] method_42$d4d28024c9() {
      return field_44;
   }

   public void method_42$d07b98bfef(long var1, String var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 138551920272331L;
      long var6 = var1 ^ 50184775540179L;
      int[] var8 = recovery$indy$1(5405409635369499004L, var1);
      String var10000 = var3;
      if (var8 == null) {
         if (var3 == null) {
            return;
         }

         var10000 = var3;
      }

      String[] var9 = var10000.split(" ");
      String[] var12 = var9;
      if (var8 == null) {
         if (var9.length > 1) {
            var3 = var9[0];
         }

         var3 = recovery$indy$2(var3, '§', var4, 5405332374307196696L, var1);
         var12 = var3.split(recovery$indy$3(7652, 3529310223422921910L ^ var1));
      }

      label44: {
         label43: {
            String[] var10 = var12;
            int[] var13 = var8;
            if (var1 >= 0L) {
               if (var8 == null) {
                  if (var10.length <= 1) {
                     break label43;
                  }

                  this.field_40 = recovery$indy$4(var10, var6, 5404458529462616656L, var1);
               }

               var13 = var8;
            }

            if (var13 == null) {
               break label44;
            }
         }

         this.field_40 = "";
      }

      this.field_43 = var3;
   }

   private static native Method d(long var0, long var2);

   public void method_40$db82fd5e78(String var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 57087726491328L;
      long var6 = var2 ^ 105881310931160L;
      int[] var8 = recovery$indy$5(9081669746272308343L, var2);
      String var10000 = var1;
      if (var8 == null) {
         if (var1 == null) {
            return;
         }

         var10000 = var1;
      }

      String[] var9 = var10000.split(" ");
      String[] var12 = var9;
      if (var8 == null) {
         if (var9.length > 1) {
            var1 = var9[0];
         }

         var1 = recovery$indy$6(var1, '§', var4, 9081742635108596243L, var2);
         var12 = var1.split(recovery$indy$7(15053, 7630889371690471058L ^ var2));
      }

      label44: {
         label43: {
            String[] var10 = var12;
            int[] var13 = var8;
            if (var2 >= 0L) {
               if (var8 == null) {
                  if (var10.length <= 1) {
                     break label43;
                  }

                  this.field_43E = recovery$indy$8(var10, var6, 9082409762387539803L, var2);
               }

               var13 = var8;
            }

            if (var13 == null) {
               break label44;
            }
         }

         this.field_43E = "";
      }

      this.field_43Y = var1;
   }

   public String method_44$0e30dfc966() {
      return this.field_43;
   }

   public boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 109847399594078L;
      int[] var5 = recovery$indy$9(8504475508003964026L, var1);
      boolean var10000 = recovery$indy$10(C_47WT.BOOKS, 8504104761849299252L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$11(this, var3, 8504937862255334071L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public boolean method_45$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 23676584451667L;
      int[] var5 = recovery$indy$12(-3456370855485201801L, var1);
      boolean var10000 = recovery$indy$13(C_47WT.ITEM_NAMES, -3455930546958783183L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$14(this, var3, -3455688613916609350L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public String method_45$0e30dfc966() {
      return this.field_43E;
   }

   @Override
   public void method_47$9035875d26(long var1, C_47ob var3) {
      long var4;
      int[] var6;
      C_473U var7;
      byte var10000;
      int[] var10001;
      label78: {
         var4 = var1 ^ 94443764432237L;
         var6 = recovery$indy$15(2668336699718129528L, var1);
         var7 = recovery$indy$16(var3, 2667594002913510121L, var1);
         var10000 = (byte) ((var7 instanceof C_47Ut) ? 1 : 0);
         label77:
         if (var6 == null) {
            if (var10000 != 0) {
               var10000 = (byte) ((recovery$indy$17(C_47WT.TITLE, 2667968556850483766L, var1)) ? 1 : 0);
               var10001 = var6;
               if (var1 < 0L) {
                  break label78;
               }

               if (var6 != null) {
                  break label77;
               }

               if (var10000 != 0) {
                  var3.cancel();
               }
            }

            var10000 = (byte) ((var7 instanceof C_47AL) ? 1 : 0);
         }

         var10001 = var6;
      }

      label67: {
         label66:
         if (var10001 == null) {
            if (var10000 != 0) {
               var10000 = (byte) ((recovery$indy$18(this, var4, 2667277536160873144L, var1)) ? 1 : 0);
               if (var6 != null) {
                  break label66;
               }

               if (var10000 != 0) {
                  C_47AL var8 = (C_47AL)var7;
                  var3.cancel();
                  var10000 = var8.method_43$7d493934e8();
                  var10001 = var6;
                  if (var1 < 0L) {
                     break label67;
                  }

                  if (var6 != null) {
                     break label66;
                  }

                  if (var10000 == 2) {
                     var3.cancel();
                  }
               }
            }

            var10000 = (byte) ((var7 instanceof C_4742) ? 1 : 0);
         }

         var10001 = var6;
      }

      if (var10001 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = (byte) ((recovery$indy$19(C_47WT.SIGNS, 2667968556850483766L, var1)) ? 1 : 0);
      }

      if (var10000 != 0) {
         var3.cancel();
      }
   }

   public String method_43$0e30dfc966() {
      return this.field_40;
   }

   public boolean method_42t$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 63314989042961L;
      int[] var5 = recovery$indy$20(4848878267605922101L, var1);
      boolean var10000 = recovery$indy$21(C_47WT.TAB_LIST, 4848192513016610419L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$22(this, var3, 4848337886571587576L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public String method_48p$0e30dfc966() {
      return this.field_43Y;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$23(this, 26, var3, -7099828469353106705L, var1);
   }

   public boolean method_42Q$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 130901738337119L;
      int[] var5 = recovery$indy$24(4396889276444331899L, var1);
      boolean var10000 = recovery$indy$25(C_47WT.MAPS, 4397117232083765813L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$26(this, var3, 4397359344469514678L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public boolean method_42B$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 71005514487083L;
      int[] var5 = recovery$indy$27(-2634372574366488305L, var1);
      boolean var10000 = recovery$indy$28(C_47WT.NAME_TAGS, -2633967624160434615L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$29(this, var3, -2633839838461984830L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public boolean method_42_$ac14885e8f(short var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 42706129007165L;
      int[] var8 = recovery$indy$30(4352362193460350489L, var4);
      boolean var10000 = recovery$indy$31(C_47WT.SCOREBOARD, 4351640685440942431L, var4);
      if (var8 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$32(this, var6, 4351848177106852052L, var4);
      }

      return var8 != null ? var10000 : var10000;
   }

   public boolean method_423$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 22877785395491L;
      int[] var5 = recovery$indy$33(-6955668599106638585L, var1);
      boolean var10000 = recovery$indy$34(C_47WT.CHEST_NAMES, -6955298282448705463L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$35(this, var3, -6954986340362404918L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public boolean method_42C$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 47211612424444L;
      int[] var5 = recovery$indy$36(5091247351869093080L, var1);
      boolean var10000 = recovery$indy$37(C_47WT.TOOL_TIPS, 5090525543042726814L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$38(this, var3, 5090706930031649301L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   public boolean method_42g$0dd78e0064(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 76901529899281L;
      int[] var5 = recovery$indy$39(6866530915220335925L, var1);
      boolean var10000 = recovery$indy$40(C_47WT.CHAT, 6865809117330612851L, var1);
      if (var5 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$41(this, var3, 6865946515162790904L, var1);
      }

      return var5 != null ? var10000 : var10000;
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 15611559894714L;
      recovery$indy$43(var6, recovery$indy$42(20094, 7198841557860786624L ^ var4), 2731978043187994976L, var4);
   }

   public AntiStrike_47Qa(long var1) {
      super("AntiStrike", "GegenStrike", ((a ^ var1) ^ 19480401952152L), new Color(82, 119, 222), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 35504266653806L;
      long var5 = var1 ^ 106185044189571L;
      long var7 = var1 ^ 19480401952152L;
      // Super arguments moved to the required Java constructor position.
      long var10005 = 3757981812057906153L;
      this.settingComponentsToHide = new MultiSelectSetting(this, "Components to hide", var3, C_47WT.values());
      this.settingReplaceServerName = new BooleanSetting(this, var5, "Replace server name", true);
      this.settingRemoveColorCodes = new BooleanSetting(this, var5, "Remove color codes", false);
      this.field_43Y = "";
      this.field_43 = "";
      this.field_43E = "";
      this.field_40 = "";
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native String recovery$indy$2(Object var0, char var1, long var2, long var4, long var6);

   private static native String recovery$indy$3(int var0, long var1);

   private static native String recovery$indy$4(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$5(long var0, long var2);

   private static native String recovery$indy$6(Object var0, char var1, long var2, long var4, long var6);

   private static native String recovery$indy$7(int var0, long var1);

   private static native String recovery$indy$8(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$9(long var0, long var2);

   private static native boolean recovery$indy$10(Object var0, long var1, long var3);

   private static native boolean recovery$indy$11(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$12(long var0, long var2);

   private static native boolean recovery$indy$13(Object var0, long var1, long var3);

   private static native boolean recovery$indy$14(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$15(long var0, long var2);

   private static native C_473U recovery$indy$16(Object var0, long var1, long var3);

   private static native boolean recovery$indy$17(Object var0, long var1, long var3);

   private static native boolean recovery$indy$18(Object var0, long var1, long var3, long var5);

   private static native boolean recovery$indy$19(Object var0, long var1, long var3);

   private static native int[] recovery$indy$20(long var0, long var2);

   private static native boolean recovery$indy$21(Object var0, long var1, long var3);

   private static native boolean recovery$indy$22(Object var0, long var1, long var3, long var5);

   private static native void recovery$indy$23(Object var0, int var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$24(long var0, long var2);

   private static native boolean recovery$indy$25(Object var0, long var1, long var3);

   private static native boolean recovery$indy$26(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$27(long var0, long var2);

   private static native boolean recovery$indy$28(Object var0, long var1, long var3);

   private static native boolean recovery$indy$29(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$30(long var0, long var2);

   private static native boolean recovery$indy$31(Object var0, long var1, long var3);

   private static native boolean recovery$indy$32(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$33(long var0, long var2);

   private static native boolean recovery$indy$34(Object var0, long var1, long var3);

   private static native boolean recovery$indy$35(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$36(long var0, long var2);

   private static native boolean recovery$indy$37(Object var0, long var1, long var3);

   private static native boolean recovery$indy$38(Object var0, long var1, long var3, long var5);

   private static native int[] recovery$indy$39(long var0, long var2);

   private static native boolean recovery$indy$40(Object var0, long var1, long var3);

   private static native boolean recovery$indy$41(Object var0, long var1, long var3, long var5);

   private static native String recovery$indy$42(int var0, long var1);

   private static native void recovery$indy$43(long var0, Object var2, long var3, long var5);

   private static native MethodHandle recovery$constant$44();
}
