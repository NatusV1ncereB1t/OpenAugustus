package augustus.recovered.modules.misc;

import augustus.recovered.modules.render.Notifications_47HJ;
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
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_40V;
import net.C_43z;
import net.C_475e;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.C_47F9;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47jO;
import net.minecraft.client.Minecraft;
import net.C_47oO;
import net.C_47rf;
import net.C_47sv;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

public class BeverageNotify_47kV extends Module implements C_47xz, C_47oO {
   private final BooleanSetting settingDeadPlayers;
   private final NumberSetting settingNotifyDelay;
   private final HashMap field_47;
   private static final long a = C_4f.a(-1486576374111173622L, -4389262761797275109L, MethodHandles.lookup().lookupClass()).a(249036026364740L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final Object[] e = new Object[31];
   private static final String[] f = new String[31];

   private static native Field b(Class var0, String var1, Class var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Class b(long var0, long var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native void a();

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native int a(long var0, long var2);

   private static native Method d(long var0, long var2);

   private void method_41$5b9c51f5c2(EntityPlayer var1) {
      long var2 = a ^ 122741339953974L;
      long var4 = var2 ^ 83807738135012L;
      long var6 = var2 ^ 94279031536681L;
      long var8 = var2 ^ 38819597546733L;
      long var10 = var2 ^ 26254752629697L;
      long var10000 = 1134236646095785816L;
      int[] var12 = ClientSettings_47kr.method_46$d4d28024c9();
      StringBuilder var30 = new StringBuilder().append("§e").append(var1.method_41$0e30dfc966());
      String var10001 = "§r is drinking ";
      if (var12 == null) {
         var30 = var30.append("§r is drinking ");
         var10001 = var1.method_48$ac4db64966() != null ? "\"" + var1.method_48$ac4db64966().method_44$0e30dfc966() + "\"" : "";
      }

      String var13 = var30.append(var10001).append("!").toString();
      long var10002 = 1134338290406704066L;
      String var14 = var13;
      long var15 = var8;
      C_475e.method_46$d07b98bfef(var15, var14);
      var10000 = 1133828286095752358L;
      Client var32 = Client.method_44$fbc0c0be91();
      long var34 = 1134420899879939837L;
      Client var17 = var32;
      if (var12 == null) {
         var10002 = 1133883834197608369L;
         long var18 = var4;
         Notifications_47HJ var20 = var17.method_45$4a5eee04b7().field_41l;
         if (var20.method_46$0dd78e0064(var18)) {
            if (var12 != null) {
               return;
            }

            long var35 = 1134383385854812943L;
            C_47sv var21 = C_47sv.BEVERAGE_NOTIFICATION;
            if (var21.method_43$aae029aa0a()) {
               long var10004 = 1133986323813769560L;
               C_47jO var22 = C_47jO.INFO;
               String var23 = var13;
               long var24 = var6;
               String var26 = "BeverageNotify";
               C_40V.method_44$a50da88c41(var26, var24, var23, var22);
            }
         }

         HashMap var33 = this.field_47;
         var10001 = var1.method_41$0e30dfc966();
         double var38 = System.currentTimeMillis();
         long var10005 = 1134607609554411454L;
         long var27 = var10;
         NumberSetting var29 = this.settingNotifyDelay;
         var33.put(var10001, (long)(var38 + var29.method_44$474dfaa627(var27)));
      }
   }

   @Override
   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      this.field_47.clear();
   }

   private boolean method_47$731cbed369(EntityPlayer var1) {
      net.minecraft.entity.player.EntityPlayer var9;
      int[] var4;
      boolean var11;
      label102: {
         label105: {
            long var2 = a ^ 50959652467187L;
            long var10000 = 2700153998170203549L;
            var4 = ClientSettings_47kr.method_46$d4d28024c9();
            var11 = var1.field_427;
            label100:
            if (var4 == null) {
               if (var1.field_427) {
                  long var10001 = 2700979370232845222L;
                  BooleanSetting var7 = this.settingDeadPlayers;
                  var11 = var7.method_49$aae029aa0a();
                  if (var4 != null) {
                     break label100;
                  }

                  if (!var11) {
                     break label105;
                  }
               }

               var11 = var1 instanceof EntityPlayerSP;
            }

            label106: {
               if (var4 == null) {
                  if (var11) {
                     break label105;
                  }

                  var9 = var1;
                  if (var4 != null) {
                     break label106;
                  }

                  var11 = var1.method_436$aae029aa0a();
               }

               if (!var11) {
                  break label105;
               }

               var9 = var1;
            }

            C_47rf var10 = var9.method_48$ac4db64966();
            if (var4 == null) {
               if (var10 == null) {
                  break label105;
               }

               var10 = var1.method_48$ac4db64966();
            }

            var11 = var10.method_48$dbd570a038() instanceof C_43z;
            if (var4 != null) {
               break label102;
            }

            if (var11) {
               var11 = true;
               break label102;
            }
         }

         var11 = false;
      }

      boolean var5 = var11;
      var11 = var5;
      if (var4 == null) {
         label68:
         if (var5) {
            Long var6 = (Long)this.field_47.get(var1.method_41$0e30dfc966());
            Long var13 = var6;
            if (var4 == null) {
               if (var6 == null) {
                  break label68;
               }

               var13 = var6;
            }

            if (var4 == null) {
               if (var13 > System.currentTimeMillis()) {
                  return false;
               }

               this.field_47.remove(var1.method_41$0e30dfc966());
            }
         }

         var11 = var5;
      }

      return var11;
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$1(this, 40, var3, -7099048465388089330L, var1);
      recovery$indy$2(this, 17, var3, -7099048465388089330L, var1);
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      this.field_47.clear();
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   @Override
   public void method_487$da8c82d5d4() {
      long var1 = a ^ 101545725415641L;
      long var10001 = -4300369108302104884L;
      Minecraft var3 = field_43;
      var3.field_44Q.field_44E.stream().filter(recovery$indy$3(this)).forEach(recovery$indy$4(this));
   }

   public BeverageNotify_47kV(long var1) {
      super("BeverageNotify", "GetränkeWarnung", ((a ^ var1) ^ 16877333017695L), new Color(245, 200, 66), Category.MISC);
      var1 = a ^ var1;
      long var3 = var1 ^ 139075551406148L;
      long var5 = var1 ^ 91419444942787L;
      long var7 = var1 ^ 16877333017695L;
      // Super arguments moved to the required Java constructor position.
      this.settingDeadPlayers = new BooleanSetting(this, var3, "DeadPlayers", true);
      this.settingNotifyDelay = new NumberSetting(this, "NotifyDelay", 4000.0, var5, 0.0, 10000.0, 0);
      this.field_47 = new HashMap();
   }

   // Retained obfuscator initialization is restored after javac.
   static { b = null; c = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native void recovery$indy$1(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$2(Object var0, int var1, long var2, long var4, long var6);

   private static native Predicate recovery$indy$3(BeverageNotify_47kV var0);

   private static native Consumer recovery$indy$4(BeverageNotify_47kV var0);

   private static native MethodHandle recovery$constant$5();
}
