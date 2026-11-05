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
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.MultiSelectSetting;
import client.setting.BooleanSetting;
import client.setting.ColorSetting;
import net.C_47j3;
import client.module.Category;
import net.C_4f;
import org.lwjgl.opengl.GL11;

public class Chams_47QO extends Module {
   private final MultiSelectSetting settingEntities;
   public final BooleanSetting settingColoredEntityChams;
   public final BooleanSetting settingOnlyThroughWallsEntities;
   public final BooleanSetting settingRenderTextureEntity;
   public final ColorSetting settingColorEntity;
   public final BooleanSetting settingChests;
   public final BooleanSetting settingColoredChestChams;
   public final BooleanSetting settingOnlyThroughWalls;
   public final BooleanSetting settingRenderTexture;
   public final ColorSetting settingColorChest;
   public final ColorSetting settingColorEnderChest;
   private static boolean field_43;
   private static final long a = C_4f.a(7158493273699065031L, -1896019443835602582L, MethodHandles.lookup().lookupClass()).a(111399911607489L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[26];
   private static final String[] f = new String[26];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native String b(byte[] var0);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native void a();

   private static native int a(long var0, long var2);

   private static native Method d(long var0, long var2);

   public void method_40$e9a28cd67d(long var1, Entity var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 118663824006864L;
      int[] var6 = recovery$indy$1(4542891752616641549L, var1);
      char var10000 = ((char) (recovery$indy$2(this.settingColoredEntityChams, 4542939555258393748L, var1) ? 1 : 0));
      if (var6 == null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = ((char) (recovery$indy$3(this, var3, var4, 4542186228964482857L, var1) ? 1 : 0));
      }

      if (var6 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = '耷';
      }

      GL11.glEnable(var10000);
      GL11.glPolygonOffset(1.0F, -1100000.0F);
   }

   public static void method_48$f633c984d8(boolean var0) {
      field_43 = var0;
   }

   public void method_48$e45a9973e5(long var1) {
      var1 = a ^ var1;
      int[] var3 = recovery$indy$4(6782950182881535271L, var1);
      char var10000 = ((char) (recovery$indy$5(this.settingColoredEntityChams, 6782902412432115134L, var1) ? 1 : 0));
      if (var3 == null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = ((char) (GL11.glIsEnabled(32823) ? 1 : 0));
      }

      if (var3 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = '耷';
      }

      GL11.glDisable(var10000);
      GL11.glPolygonOffset(1.0F, 1100000.0F);
   }

   public static boolean method_48$aae029aa0a() {
      return field_43;
   }

   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 140510546385099L;
      long var10001 = -8487630579419852374L;
      BooleanSetting var3 = this.settingColoredEntityChams;
      return var3.method_49$aae029aa0a();
   }

   public boolean method_47$8a15fc4c7b(Entity var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 139735358519623L;
      int var4 = (int)((var2 ^ 139735358519623L) >>> 48);
      int var5 = (int)((var2 ^ 139735358519623L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      int[] var7 = recovery$indy$6(3684450115619342375L, var2);
      boolean var10000 = var1 instanceof EntityPlayerSP;
      if (var7 == null) {
         if (var10000) {
            return false;
         }

         var10000 = recovery$indy$13(
            var1,
            recovery$indy$7(C_47j3.PLAYERS, 3684219352480817405L, var2),
            recovery$indy$8(C_47j3.MOBS, 3684219352480817405L, var2),
            (short)var4,
            recovery$indy$9(C_47j3.ANIMALS, 3684219352480817405L, var2),
            recovery$indy$10(C_47j3.VILLAGER, 3684219352480817405L, var2),
            recovery$indy$11(C_47j3.ARMOR_STANDS, 3684219352480817405L, var2),
            recovery$indy$12(C_47j3.INVISIBLE, 3684219352480817405L, var2),
            false,
            false,
            var5,
            true,
            (char)var6,
            3683956929237484014L,
            var2
         );
      }

      return var7 != null ? var10000 : var10000;
   }

   public static boolean method_47V$aae029aa0a() {
      boolean var0 = method_48$aae029aa0a();
      return !var0;
   }

   private boolean method_47w$aae029aa0a() {
      long var1 = a ^ 49542461399918L;
      long var10000 = -1040077804736050538L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -1040205565010316346L;
      BooleanSetting var4 = this.settingColoredChestChams;
      boolean var6 = var4.method_44$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -1040135589576594929L;
         BooleanSetting var5 = this.settingColoredChestChams;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   private boolean method_47i$aae029aa0a() {
      long var1 = a ^ 72272316663930L;
      long var10000 = -2700882094772215422L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -2701000646600959790L;
      BooleanSetting var4 = this.settingColoredChestChams;
      boolean var6 = var4.method_44$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -2700789213634723557L;
         BooleanSetting var5 = this.settingColoredChestChams;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   private boolean method_47_$aae029aa0a() {
      long var1 = a ^ 124022178610954L;
      long var10000 = -5911894267755309326L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -5912048390503747678L;
      BooleanSetting var4 = this.settingColoredChestChams;
      boolean var7 = var4.method_44$aae029aa0a();
      if (var3 == null) {
         if (!var7) {
            return false;
         }

         var10001 = -5911836587762780565L;
         BooleanSetting var5 = this.settingColoredChestChams;
         var7 = var5.method_49$aae029aa0a();
      }

      if (var3 == null) {
         if (!var7) {
            return false;
         }

         var10001 = -5911836587762780565L;
         BooleanSetting var6 = this.settingOnlyThroughWalls;
         var7 = var6.method_49$aae029aa0a();
      }

      return var3 != null ? var7 : !var7;
   }

   private boolean method_47G$aae029aa0a() {
      long var1 = a ^ 102253956249749L;
      long var10000 = -1554982878090260115L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -1555145414707910595L;
      BooleanSetting var4 = this.settingColoredChestChams;
      boolean var6 = var4.method_44$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -1554934008680893964L;
         BooleanSetting var5 = this.settingColoredChestChams;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   private boolean method_47x$aae029aa0a() {
      long var1 = a ^ 137208142594034L;
      long var10000 = -5977200870683978230L;
      int[] var3 = AntiStrike_47Qa.method_42$d4d28024c9();
      long var10001 = -5977151966382197101L;
      BooleanSetting var4 = this.settingColoredEntityChams;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = -5977151966382197101L;
         BooleanSetting var5 = this.settingOnlyThroughWallsEntities;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : !var6;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public Chams_47QO(long var1) {
      super("Chams", "Röntgenblick", ((a ^ var1) ^ 82668899115133L), new Color(91, 152, 222), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 135042414030219L;
      long var5 = var1 ^ 57014703122779L;
      long var7 = var1 ^ 63820428704870L;
      long var9 = var1 ^ 104020055014467L;
      long var11 = var1 ^ 82668899115133L;
      // Super arguments moved to the required Java constructor position.
      long var10005 = -6214650027040877561L;
      this.settingEntities = new MultiSelectSetting(this, "Entities", var3, C_47j3.values());
      this.settingColoredEntityChams = new BooleanSetting(this, var7, "ColoredEntityChams", true);
      BooleanSetting var10001 = new BooleanSetting(this, var7, "OnlyThroughWallsEntities", false);
      BooleanSetting var10002 = this.settingColoredEntityChams;
      this.settingColoredEntityChams.getClass();
      C_45n var10003 = recovery$indy$14(var10002);
      long var10004 = -6214333302967500283L;
      C_45n var13 = var10003;
      long var14 = var5;
      BooleanSetting var16 = var10001;
      this.settingOnlyThroughWallsEntities = (BooleanSetting)var16.method_43$780fd62a21(var14, var13);
      var10001 = new BooleanSetting(this, var7, "RenderTextureEntity", false);
      var10003 = recovery$indy$15(this);
      var10004 = -6214333302967500283L;
      C_45n var17 = var10003;
      long var18 = var5;
      BooleanSetting var20 = var10001;
      this.settingRenderTextureEntity = (BooleanSetting)var20.method_43$780fd62a21(var18, var17);
      ColorSetting var47 = new ColorSetting(var9, this, "ColorEntity", new Color(0, 233, 255, 100));
      var10003 = recovery$indy$16(this);
      var10004 = -6214333302967500283L;
      C_45n var21 = var10003;
      long var22 = var5;
      ColorSetting var24 = var47;
      this.settingColorEntity = (ColorSetting)var24.method_43$780fd62a21(var22, var21);
      this.settingChests = new BooleanSetting(this, var7, "Chests", false);
      var10001 = new BooleanSetting(this, var7, "ColoredChestChams", true);
      var10002 = this.settingChests;
      this.settingChests.getClass();
      var10003 = recovery$indy$17(var10002);
      var10004 = -6214333302967500283L;
      C_45n var25 = var10003;
      long var26 = var5;
      BooleanSetting var28 = var10001;
      this.settingColoredChestChams = (BooleanSetting)var28.method_43$780fd62a21(var26, var25);
      var10001 = new BooleanSetting(this, var7, "OnlyThroughWalls", false);
      var10003 = recovery$indy$18(this);
      var10004 = -6214333302967500283L;
      C_45n var29 = var10003;
      long var30 = var5;
      BooleanSetting var32 = var10001;
      this.settingOnlyThroughWalls = (BooleanSetting)var32.method_43$780fd62a21(var30, var29);
      var10001 = new BooleanSetting(this, var7, "RenderTexture", false);
      var10003 = recovery$indy$19(this);
      var10004 = -6214333302967500283L;
      C_45n var33 = var10003;
      long var34 = var5;
      BooleanSetting var36 = var10001;
      this.settingRenderTexture = (BooleanSetting)var36.method_43$780fd62a21(var34, var33);
      ColorSetting var51 = new ColorSetting(var9, this, "ColorChest", new Color(0, 233, 255, 100));
      var10003 = recovery$indy$20(this);
      var10004 = -6214333302967500283L;
      C_45n var37 = var10003;
      long var38 = var5;
      ColorSetting var40 = var51;
      this.settingColorChest = (ColorSetting)var40.method_43$780fd62a21(var38, var37);
      ColorSetting var52 = new ColorSetting(var9, this, "ColorEnderChest", new Color(0, 233, 255, 100));
      var10003 = recovery$indy$21(this);
      var10004 = -6214333302967500283L;
      C_45n var41 = var10003;
      long var42 = var5;
      ColorSetting var44 = var52;
      this.settingColorEnderChest = (ColorSetting)var44.method_43$780fd62a21(var42, var41);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(Object var0, Object var1, long var2, long var4, long var6);

   private static native int[] recovery$indy$4(long var0, long var2);

   private static native boolean recovery$indy$5(Object var0, long var1, long var3);

   private static native int[] recovery$indy$6(long var0, long var2);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3);

   private static native boolean recovery$indy$8(Object var0, long var1, long var3);

   private static native boolean recovery$indy$9(Object var0, long var1, long var3);

   private static native boolean recovery$indy$10(Object var0, long var1, long var3);

   private static native boolean recovery$indy$11(Object var0, long var1, long var3);

   private static native boolean recovery$indy$12(Object var0, long var1, long var3);

   private static native boolean recovery$indy$13(
      Object var0,
      boolean var1,
      boolean var2,
      short var3,
      boolean var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      int var10,
      boolean var11,
      char var12,
      long var13,
      long var15
   );

   private static native C_45n recovery$indy$14(BooleanSetting var0);

   private static native C_45n recovery$indy$15(Chams_47QO var0);

   private static native C_45n recovery$indy$16(Chams_47QO var0);

   private static native C_45n recovery$indy$17(BooleanSetting var0);

   private static native C_45n recovery$indy$18(Chams_47QO var0);

   private static native C_45n recovery$indy$19(Chams_47QO var0);

   private static native C_45n recovery$indy$20(Chams_47QO var0);

   private static native C_45n recovery$indy$21(Chams_47QO var0);

   private static native MethodHandle recovery$constant$22();
}
