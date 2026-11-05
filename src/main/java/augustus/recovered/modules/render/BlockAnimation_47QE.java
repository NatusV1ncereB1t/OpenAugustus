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
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.module.Category;
import net.C_4f;

public class BlockAnimation_47QE extends Module {
   public final ModeSetting settingBlockAnimations;
   public final NumberSetting settingHeight;
   public final BooleanSetting settingFakeBlock;
   public final BooleanSetting settingOnlyWhileKillAura;
   public final NumberSetting settingSpeed;
   private static final long a = C_4f.a(74244202798270534L, -7482382200334948771L, MethodHandles.lookup().lookupClass()).a(82477717126165L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[5];
   private static final String[] f = new String[5];

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Field b(Class var0, String var1, Class var2);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native void a();

   private static native int a(long var0, long var2);

   private static native Method d(long var0, long var2);

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   public BlockAnimation_47QE(long var1) {
      super("BlockAnimation", "BlockAnimation", ((a ^ var1) ^ 110071197323153L), new Color(136, 29, 163), Category.RENDER);
      var1 = a ^ var1;
      long var3 = var1 ^ 31812518676151L;
      long var5 = var1 ^ 52432490282844L;
      long var7 = var1 ^ 23362226819978L;
      long var9 = var1 ^ 62016146844685L;
      long var11 = var1 ^ 110071197323153L;
      // Super arguments moved to the required Java constructor position.
      this.settingBlockAnimations = new ModeSetting(
         this,
         "BlockAnimations",
         var5,
         "Minimalistic",
         new String[]{"None", "1.7", "Wiggle", "Minimalistic", "Swong", "Jello", "Exhibition", "Exhibition2", "Forward", "Jigsaw", "Violence", "Sigma", "Spin"}
      );
      this.settingHeight = new NumberSetting(this, "Height", 0.1, var9, -0.5, 1.5, 3);
      this.settingFakeBlock = new BooleanSetting(this, var7, "FakeBlock", false);
      BooleanSetting var10001 = new BooleanSetting(this, var7, "OnlyWhileKillAura", false);
      BooleanSetting var10002 = this.settingFakeBlock;
      this.settingFakeBlock.getClass();
      C_45n var10003 = recovery$indy$1(var10002);
      long var10004 = -4167504738851555162L;
      C_45n var13 = var10003;
      long var14 = var3;
      BooleanSetting var16 = var10001;
      this.settingOnlyWhileKillAura = (BooleanSetting)var16.method_43$780fd62a21(var14, var13);
      this.settingSpeed = new NumberSetting(this, "Speed", 1.0, var9, 0.1, 3.0, 3);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native C_45n recovery$indy$1(BooleanSetting var0);

   private static native MethodHandle recovery$constant$2();
}
