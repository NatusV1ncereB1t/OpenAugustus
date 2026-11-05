package augustus.recovered.modules.misc;

import com.viaversion.vialoader.util.ProtocolVersionList;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
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
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_45n;
import net.C_477A;
import net.C_47AC;
import client.module.Module;
import client.setting.NumberSetting;
import client.module.Category;
import net.C_4f;

public class ProtocolVersion_47ku extends Module {
   public final NumberSetting settingProtocolVersionVal;
   private static final long a = C_4f.a(-737169704572913293L, -3188049991346191764L, MethodHandles.lookup().lookupClass()).a(140163981204841L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[19];
   private static final String[] f = new String[19];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native String b(byte[] var0);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Method d(long var0, long var2);

   private static boolean method_45$aae029aa0a() {
      return false;
   }

   private void method_43$da8c82d5d4() {
      com.viaversion.viaversion.api.protocol.version.ProtocolVersion var11;
      long var1 = a ^ 74693709074353L;
      long var3 = var1 ^ 85199533009523L;
      long var10000 = 2741213635610944273L;
      int[] var5 = ClientSettings_47kr.method_46$d4d28024c9();
      Iterator var6 = ProtocolVersionList.getProtocolsNewToOld().iterator();

      while (true) {
         if (var6.hasNext()) {
            ProtocolVersion var7 = (ProtocolVersion)var6.next();
            var11 = var7;
            if (var5 != null) {
               break;
            }

            double var12 = var7.getVersion();
            long var10003 = 2741241815829352634L;
            long var8 = var3;
            NumberSetting var10 = this.settingProtocolVersionVal;
            if (var12 == var10.method_44$474dfaa627(var8)) {
               var11 = var7;
               break;
            }

            if (var5 == null) {
               continue;
            }
         }

         return;
      }

      C_47AC.field_45 = var11;
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

   public ProtocolVersion_47ku(long var1) {
      super(((a ^ var1) ^ 58763563453435L), "ProtocolVersion", "ProtokollVersion", true, Color.RED, Category.MISC);
      var1 = a ^ var1;
      long var10001 = var1 ^ 7508139722038L;
      int var3 = (int)((var1 ^ 7508139722038L) >>> 32);
      int var4 = (int)((var1 ^ 7508139722038L) << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      long var6 = var1 ^ 73567257951809L;
      long var8 = var1 ^ 58763563453435L;
      long var10 = var1 ^ 74678797600683L;
      // Super arguments moved to the required Java constructor position.
      NumberSetting var24 = new NumberSetting(this, "ProtocolVersionVal", 47.0, var10, 0.0, 0.0, 0);
      C_45n var10002 = recovery$indy$1();
      long var10003 = -1330481616577701109L;
      C_45n var12 = var10002;
      NumberSetting var13 = var24;
      NumberSetting var25 = var13.method_43$9db6d416f4(var12);
      C_477A var10004 = recovery$indy$2(this);
      byte var10005 = (byte)var5;
      long var10006 = -1330423054783619891L;
      byte var14 = var10005;
      C_477A var15 = var10004;
      int var16 = var4;
      int var17 = var3;
      NumberSetting var18 = var25;
      this.settingProtocolVersionVal = (NumberSetting)var18.method_45$bd7ddd925e(var17, var16, var15, var14);
      var10003 = -1330317648466855905L;
      boolean var19 = true;
      long var20 = var6;
      ProtocolVersion_47ku var22 = this;
      var22.method_46$b757cde368(var20, var19);
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native C_45n recovery$indy$1();

   private static native C_477A recovery$indy$2(ProtocolVersion_47ku var0);

   private static native MethodHandle recovery$constant$3();
}
