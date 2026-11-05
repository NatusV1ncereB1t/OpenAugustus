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
import net.C_45n;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47DW;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47UX;
import net.C_47Yl;
import client.module.Category;
import net.C_4f;

public class NameTags_47HR extends Module {
   public final ModeSetting settingMode;
   public final NumberSetting settingScale;
   public final NumberSetting settingHeight;
   public final BooleanSetting settingArmor;
   public final BooleanSetting settingArmorDurability;
   public final BooleanSetting settingArmorEnchantments;
   public final BooleanSetting settingPotionEffects;
   public final ModeSetting settingHealthMode;
   public final BooleanSetting settingPing;
   public final BooleanSetting settingThroughWalls;
   public final BooleanSetting settingMyself;
   public final BooleanSetting settingInvisible;
   public final BooleanSetting settingInvisibleTeam;
   public final BooleanSetting settingTransparent;
   public final BooleanSetting settingShadow;
   public final BooleanSetting settingShadowFont;
   public final NumberSetting settingMaximumRenderDistance;
   public String field_44;
   public String field_43;
   public String field_43E;
   private static final long a = C_4f.a(-8416663840023999430L, -213801751011173698L, MethodHandles.lookup().lookupClass()).a(225576057252309L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[22];
   private static final String[] f = new String[22];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(byte[] var0);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native String b(int var0, long var1);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Field a(Class var0, String var1, Class var2);

   private static native Method d(long var0, long var2);

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 98636877200534L;
      long var3 = var1 ^ 99391524946439L;
      long var10000 = 573961636847341900L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 573693007298411397L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   public float method_49$06c8a65ab6(EntityPlayer var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 76231666057620L;
      return recovery$indy$1(var4, this.settingHealthMode, var1, 8402014418843738224L, var2);
   }

   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 50507236770813L;
      long var3 = var1 ^ 50850087517548L;
      long var10000 = -532432684877468121L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -532165164505807634L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   public int method_43$a50b8e58cf(AbstractClientPlayer var1, long var2) {
      var2 = a ^ var2;
      int[] var4 = recovery$indy$2(-7200638920835315031L, var2);
      C_47Yl var5 = var1.method_47$3ebfab9d80();
      C_47Yl var10000 = var5;
      if (var4 == null) {
         if (var5 == null) {
            return -1;
         }

         var10000 = var1.method_47$3ebfab9d80();
      }

      return var10000.method_40$8abf5c6871();
   }

   private boolean method_44s$aae029aa0a() {
      long var1 = a ^ 8287591630513L;
      long var10000 = 9065817713507478379L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 9067857810644390550L;
      BooleanSetting var4 = this.settingArmor;
      boolean var6 = var4.method_44$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = 9067958430201168330L;
         BooleanSetting var5 = this.settingArmor;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   private boolean method_44x$aae029aa0a() {
      long var1 = a ^ 39922269398592L;
      long var3 = var1 ^ 43567949060305L;
      long var10000 = 6710753684543081370L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = 6710459354464444755L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   private boolean method_44j$aae029aa0a() {
      long var1 = a ^ 54426689993688L;
      long var10000 = 52203870775924226L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 53681092007604223L;
      BooleanSetting var4 = this.settingArmor;
      boolean var6 = var4.method_44$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = 53737721471384739L;
         BooleanSetting var5 = this.settingArmor;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      int[] var6 = recovery$indy$3(2731507448215040851L, var4);
      boolean var10000 = C_47DW.field_48h.method_46$0e30dfc966().isEmpty();
      if (var6 == null) {
         if (!var10000) {
            this.field_44 = C_47UX.method_44$7b622a9996(C_47DW.field_48h.method_46$0e30dfc966()).substring(0, 1).toLowerCase();
         }

         var10000 = C_47DW.field_488.method_46$0e30dfc966().isEmpty();
      }

      if (var6 == null) {
         if (!var10000) {
            this.field_43 = C_47UX.method_44$7b622a9996(C_47DW.field_488.method_46$0e30dfc966()).substring(0, 1).toLowerCase();
         }

         var10000 = C_47DW.field_46.method_46$0e30dfc966().isEmpty();
      }

      if (!var10000) {
         this.field_43E = C_47UX.method_44$7b622a9996(C_47DW.field_46.method_46$0e30dfc966()).substring(0, 1).toLowerCase();
      }
   }

   private boolean method_44K$aae029aa0a() {
      long var1 = a ^ 29925594938328L;
      long var10000 = 4663861777183708674L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = 4665378039925210275L;
      BooleanSetting var4 = this.settingShadow;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = 4665378039925210275L;
         BooleanSetting var5 = this.settingTransparent;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   private boolean method_44p$aae029aa0a() {
      long var1 = a ^ 9652594619685L;
      long var3 = var1 ^ 12196632726452L;
      long var10000 = -3583653213997164289L;
      int[] var5 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10002 = -3583321919818403274L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   public NameTags_47HR(long var1, short var3) {
      super("NameTags", "Namensschilder", (((var1 << 16 | (long)var3 << 48 >>> 48) ^ a) ^ 13887470123297L), new Color(21, 35, 81), Category.RENDER);
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 127906051584007L;
      long var8 = var4 ^ 78157614008812L;
      long var10 = var4 ^ 138014179190074L;
      long var12 = var4 ^ 88913830206141L;
      long var14 = var4 ^ 13887470123297L;
      // Super arguments moved to the required Java constructor position.
      this.settingMode = new ModeSetting(this, "Mode", var8, "Custom", new String[]{"None", "Vanilla", "Custom"});
      NumberSetting var10001 = new NumberSetting(this, "Scale", 1.2, var12, 0.0, 3.0, 2);
      C_45n var10002 = recovery$indy$4(this);
      long var10003 = 3503359158985114329L;
      C_45n var16 = var10002;
      NumberSetting var17 = var10001;
      this.settingScale = var17.method_43$9db6d416f4(var16);
      var10001 = new NumberSetting(this, "Height", 0.0, var12, -3.0, 3.0, 2);
      var10002 = recovery$indy$5(this);
      var10003 = 3503359158985114329L;
      C_45n var18 = var10002;
      NumberSetting var19 = var10001;
      this.settingHeight = var19.method_43$9db6d416f4(var18);
      BooleanSetting var39 = new BooleanSetting(this, var10, "Armor", false);
      C_45n var47 = recovery$indy$6(this);
      long var10004 = 3503741675833961353L;
      C_45n var20 = var47;
      long var21 = var6;
      BooleanSetting var23 = var39;
      this.settingArmor = (BooleanSetting)var23.method_43$780fd62a21(var21, var20);
      BooleanSetting var40 = new BooleanSetting(this, var10, "ArmorDurability", false);
      C_45n var48 = recovery$indy$7(this);
      var10004 = 3503741675833961353L;
      C_45n var24 = var48;
      long var25 = var6;
      BooleanSetting var27 = var40;
      this.settingArmorDurability = (BooleanSetting)var27.method_43$780fd62a21(var25, var24);
      BooleanSetting var41 = new BooleanSetting(this, var10, "ArmorEnchantments", false);
      C_45n var49 = recovery$indy$8(this);
      var10004 = 3503741675833961353L;
      C_45n var28 = var49;
      long var29 = var6;
      BooleanSetting var31 = var41;
      this.settingArmorEnchantments = (BooleanSetting)var31.method_43$780fd62a21(var29, var28);
      this.settingPotionEffects = new BooleanSetting(this, var10, "PotionEffects", false);
      ModeSetting var42 = new ModeSetting(this, "HealthMode", var8, "None", new String[]{"None", "Entity", "TabList"});
      var10002 = recovery$indy$9(this);
      var10003 = 3503624491038547804L;
      C_45n var32 = var10002;
      ModeSetting var33 = var42;
      this.settingHealthMode = var33.method_44$d3b0c78647(var32);
      this.settingPing = new BooleanSetting(this, var10, "Ping", false);
      this.settingThroughWalls = new BooleanSetting(this, var10, "ThroughWalls", true);
      this.settingMyself = new BooleanSetting(this, var10, "Myself", true);
      this.settingInvisible = new BooleanSetting(this, var10, "Invisible", true);
      this.settingInvisibleTeam = new BooleanSetting(this, var10, "InvisibleTeam", true);
      this.settingTransparent = new BooleanSetting(this, var10, "Transparent", false);
      this.settingShadow = new BooleanSetting(this, var10, "Shadow", true);
      BooleanSetting var43 = new BooleanSetting(this, var10, "ShadowFont", false);
      C_45n var51 = recovery$indy$10(this);
      var10004 = 3503741675833961353L;
      C_45n var34 = var51;
      long var35 = var6;
      BooleanSetting var37 = var43;
      this.settingShadowFont = (BooleanSetting)var37.method_43$780fd62a21(var35, var34);
      this.settingMaximumRenderDistance = new NumberSetting(this, "MaximumRenderDistance", 500.0, var12, 0.0, 500.0, 0);
      this.field_44 = "p";
      this.field_43 = "s";
      this.field_43E = "u";
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native float recovery$indy$1(long var0, Object var2, Object var3, long var4, long var6);

   private static native int[] recovery$indy$2(long var0, long var2);

   private static native int[] recovery$indy$3(long var0, long var2);

   private static native C_45n recovery$indy$4(NameTags_47HR var0);

   private static native C_45n recovery$indy$5(NameTags_47HR var0);

   private static native C_45n recovery$indy$6(NameTags_47HR var0);

   private static native C_45n recovery$indy$7(NameTags_47HR var0);

   private static native C_45n recovery$indy$8(NameTags_47HR var0);

   private static native C_45n recovery$indy$9(NameTags_47HR var0);

   private static native C_45n recovery$indy$10(NameTags_47HR var0);

   private static native MethodHandle recovery$constant$11();
}
