package augustus.recovered.modules.world;
import augustus.recovered.modules.combat.KillAura_47CY;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
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
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_40x;
import net.C_43r;
import net.C_45D;
import net.C_45J;
import net.C_45n;
import net.C_45r;
import net.C_473U;
import net.C_4749;
import net.C_474i;
import net.C_475c;
import net.C_475y;
import net.C_477r;
import net.C_478Q;
import net.C_478i;
import net.C_47AC;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47DW;
import net.C_47EP;
import net.C_47Ij;
import net.C_47Ol;
import net.C_47S6;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.Setting;
import client.setting.ModeSetting;
import net.C_47UH;
import net.C_47UZ;
import net.C_47Xe;
import net.C_47bg;
import net.C_47cu;
import net.C_47ge;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47i;
import net.C_47iC;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import client.ClientGlobals;
import net.C_47rf;
import net.C_47ru;
import net.C_47sc;
import net.C_47sk;
import client.module.Category;
import net.C_47tf;
import net.C_47xz;
import net.C_47zh;
import net.C_484;
import net.C_48T;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Fucker_47Ce extends net.C_47Ol implements net.C_47UH,net.C_47mz,net.C_47xz,net.C_47iC,net.C_48T {
    public final client.setting.ModeSetting settingBlock = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingAction = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingAimRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingRange = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBreakOnlyFreeBeds = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingThroughWall = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSurrounding = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingInstant = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingFriendMyBlock = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingCustomID = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingBedBlink = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingBedBlinkTime = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_49D = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_49W = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public net.C_478Q field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_484 field_42; // Runtime access flags and ConstantValue are restored from the original class.
    public net.C_47Ij field_49t; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private static long b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] g; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map h; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] l; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] m; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native void b();

    private static native java.lang.reflect.Method h(long a0,long a1);

    public void method_46$e535f8442d(net.C_47zh c_47zh, long l, short s) {
        long l2;
        block9: {
            Object object;
            block4: {
                int n;
                int n2;
                long l3;
                block8: {
                    client.setting.Setting[] c_47TiArray;
                    client.setting.Setting[] c_47TiArray2;
                    long l4;
                    block6: {
                        client.setting.Setting[] c_47TiArray3;
                        block7: {
                            block5: {
                                long l5;
                                long l6 = l5 = l << 16 | (long)s << 48 >>> 48;
                                l4 = l6 ^ 0x54FD2F2654F0L;
                                l3 = l6 ^ 0x6AF690669F7CL;
                                l2 = l6 ^ 0xC50298EADA7L;
                                client.setting.Setting[] c_47TiArray4 = c_47TiArray3 = augustus.recovered.modules.world.SmartRaytrace_47TG.method_48$19d51fe81e();
                                object = this;
                                if (c_47TiArray4 != null) {
                                    object = ((Fucker_47Ce)object).field_49W;
                                    Object object2 = object;
                                    ((net.C_47cu)object2).method_46$da8c82d5d4();
                                    boolean bl = false;
                                    long l7 = l2;
                                    net.C_47zh c_47zh2 = c_47zh;
                                    c_47zh2.method_47$b757cde368(l7, bl);
                                    return;
                                }
                                net.C_478Q c_478Q = ((Fucker_47Ce)object).field_47;
                                if (c_478Q == null) break block4;
                                net.minecraft.client.Minecraft c_47nT = field_43;
                                object = c_47nT.field_42P;
                                Object object3 = object;
                                if (object3 == null) break block4;
                                net.minecraft.client.Minecraft c_47nT2 = field_43;
                                object = c_47nT2.field_42P;
                                n2 = ((int) (((net.minecraft.client.entity.EntityPlayerSP)object).field_427 ? 1 : 0));
                                int n3 = n2;
                                if (n3 != 0) break block4;
                                object = this;
                                client.setting.BooleanSetting c_47TV = ((Fucker_47Ce)object).settingBedBlink;
                                n2 = ((int) (c_47TV.method_49$aae029aa0a() ? 1 : 0));
                                int n4 = n2;
                                if (n4 == 0) break block4;
                                net.minecraft.client.Minecraft c_47nT3 = field_43;
                                object = c_47nT3.field_42P.method_42$b2124a4855();
                                Object object4 = object;
                                if (object4 == null) break block5;
                                net.minecraft.client.Minecraft c_47nT4 = field_43;
                                net.minecraft.client.Minecraft c_47nT5 = field_43;
                                net.minecraft.client.Minecraft c_47nT6 = field_43;
                                net.minecraft.client.Minecraft c_47nT7 = field_43;
                                long l8 = l - 0L;
                                long l9 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                                c_47TiArray2 = c_47TiArray3;
                                double d = c_47nT4.field_42P.method_42$b2124a4855().method_43$3d77d36e13(new net.C_47tf(c_47nT5.field_42Y.method_49$5730377d31().method_40$8abf5c6871(), c_47nT6.field_42Y.method_49$5730377d31().method_43$8abf5c6871(), c_47nT7.field_42Y.method_49$5730377d31().method_47$8abf5c6871())) - 20.0;
                                n2 = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                                if (l9 <= 0) break block6;
                                client.setting.Setting[] c_47TiArray5 = c_47TiArray2;
                                if (c_47TiArray5 != null) break block7;
                                int n5 = n2;
                                if (n5 > 0) break block5;
                                object = this;
                                client.setting.BooleanSetting c_47TV2 = ((Fucker_47Ce)object).settingFriendMyBlock;
                                boolean bl = c_47TV2.method_49$aae029aa0a();
                                if (bl) break block4;
                            }
                            net.minecraft.client.Minecraft c_47nT = field_43;
                            object = c_47nT.field_42P.method_49$41b79b67a0(1.0f);
                            double d = ((net.C_47tf)object).method_43$3d77d36e13(new net.C_47tf((double)this.field_47.method_40$8abf5c6871() + 0.5, (double)this.field_47.method_43$8abf5c6871() + 0.5, (double)this.field_47.method_47$8abf5c6871() + 0.5)) - 4.5;
                            n2 = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                        }
                        c_47TiArray2 = c_47TiArray3;
                    }
                    if ((c_47TiArray = c_47TiArray2) != null) break block8;
                    int n6 = n2;
                    if (n6 >= 0) break block4;
                    object = this.field_49W;
                    long l10 = l4;
                    client.setting.NumberSetting c_47TS = this.settingBedBlinkTime;
                    long l11 = l3;
                    long l12 = (long)c_47TS.method_44$474dfaa627(l10);
                    Object object5 = object;
                    n2 = ((net.C_47cu)object5).method_42$b0e346e6e3(l12, l11) ? 1 : 0;
                }
                if ((n = n2) != 0) break block4;
                object = this.field_44;
                Object object6 = object;
                long l13 = 500L;
                long l14 = l3;
                boolean bl = ((net.C_47cu)object6).method_42$b0e346e6e3(l13, l14);
                if (bl) break block9;
            }
            object = this;
            object = ((Fucker_47Ce)object).field_49W;
            Object object7 = object;
            ((net.C_47cu)object7).method_46$da8c82d5d4();
            boolean bl = false;
            long l15 = l2;
            net.C_47zh c_47zh3 = c_47zh;
            c_47zh3.method_47$b757cde368(l15, bl);
            return;
        }
        boolean bl = true;
        long l16 = l2;
        net.C_47zh c_47zh4 = c_47zh;
        c_47zh4.method_47$b757cde368(l16, bl);
    }





   private C_47tf method_46$2ea417e840(long var1, C_478Q var3, C_478i var4) {
      var1 = b ^ var1;
      long var5 = var1 ^ 97247520229028L;
      int var7 = (int)((var1 ^ 2010654277523L) >>> 56);
      long var8 = (var1 ^ 2010654277523L) << 8 >>> 8;
      return recovery$indy$5(
         this,
         recovery$indy$4(
            (byte)var7,
            var8,
            var4,
            new C_47ge(
               var3.method_40$8abf5c6871() + 0.5 - recovery$indy$0(field_43, 7100221180708500914L, var1).field_48Q,
               recovery$indy$1(field_43, 7100221180708500914L, var1).field_48j + recovery$indy$2(field_43, 7100221180708500914L, var1).method_41$bc607678b6(),
               var3.method_47$8abf5c6871() + 0.5 - recovery$indy$3(field_43, 7100221180708500914L, var1).field_42o
            ),
            7099656336215382530L,
            var1
         ),
         var5,
         7106646270498454825L,
         var1
      );
   }



   private void method_46$b7981a3db1(C_47Ij var1) {
      net.minecraft.client.Minecraft var22;
      Setting[] var4;
      C_47rf var5;
      int var18;
      label79: {
         long var2 = b ^ 56199657816487L;
         long var10000 = -1690352041477721551L;
         var4 = SmartRaytrace_47TG.method_48$19d51fe81e();
         long var10001 = -1690442957753925711L;
         Minecraft var7 = field_43;
         var5 = var7.field_42P.method_41$ac4db64966();
         C_47rf var17 = var5;
         if (var4 == null) {
            if (var5 == null) {
               var18 = 0;
               break label79;
            }

            var17 = var5;
         }

         var18 = var17.field_47;
      }

      int var6;
      label73: {
         var6 = var18;
         Minecraft var19 = field_43;
         if (var4 == null) {
            long var23 = -1685463022940825208L;
            Minecraft var8 = field_43;
            long var10002 = -1690442957753925711L;
            Minecraft var9 = field_43;
            long var10003 = -1685004859235391874L;
            Minecraft var10 = field_43;
            if (!var8.field_44K.method_48$c760cd9bb7(var9.field_42P, var10.field_44Q, var5, this.field_47, var1.field_40, var1.field_45)) {
               break label73;
            }

            var19 = field_43;
         }

         long var24 = -1690442957753925711L;
         Minecraft var11 = var19;
         var11.field_42P.method_46i$da8c82d5d4();
         var24 = -1692671319835726671L;
         C_47cu var12 = this.field_49D;
         var12.method_46$da8c82d5d4();
      }

      C_47rf var20 = var5;
      if (var4 == null) {
         if (var5 == null) {
            return;
         }

         var20 = var5;
      }

      var18 = var20.field_47;
      if (var4 == null) {
         if (var20.field_47 == 0) {
            long var26 = -1690442957753925711L;
            Minecraft var13 = field_43;
            long var29 = -1690442957753925711L;
            Minecraft var14 = field_43;
            var13.field_42P.field_42X.field_46[var14.field_42P.field_42X.field_42] = null;
            if (var4 == null) {
               return;
            }
         }

         var18 = var5.field_47;
      }

      label59: {
         label58: {
            if (var4 == null) {
               if (var18 != var6) {
                  break label58;
               }

               var22 = field_43;
               if (var4 != null) {
                  break label59;
               }

               long var27 = -1685463022940825208L;
               Minecraft var15 = field_43;
               var18 = (int) ((var15.field_44K.method_40$aae029aa0a()) ? 1 : 0);
            }

            if (var18 == 0) {
               return;
            }
         }

         var22 = field_43;
      }

      long var28 = -1684496884115531446L;
      Minecraft var16 = var22;
      var16.field_44a.field_45I.method_44$da8c82d5d4();
   }




   private static double method_46$3d77d36e13(C_47tf var0) {
      long var1 = b ^ 138498127313147L;
      long var10001 = -3326442697982605587L;
      Minecraft var3 = field_43;
      return var3.field_42P.method_49$4b58f7ab41(var0.field_40, var0.field_41, var0.field_47);
   }



    private static native int e(long a0,long a1);

    private static native java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

   private static double method_42$3d77d36e13(C_47tf var0) {
      long var1 = b ^ 62393075948730L;
      long var10001 = 3861657133984572076L;
      Minecraft var3 = field_43;
      return var3.field_42P.method_49$4b58f7ab41(var0.field_40, var0.field_41, var0.field_47);
   }



    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   public void method_41$fae8de1664(net.C_475c var1) {
      long var8;
      long var13;
      long var17;
      boolean var184;
      label245: {
         long var2 = b ^ 1235058379185L;
         long var4 = var2 ^ 127170560831195L;
         long var6 = var2 ^ 97190492927997L;
         var8 = var2 ^ 44465248595198L;
         long var10001 = var2 ^ 130544852355823L;
         int var10 = (int)((var2 ^ 130544852355823L) >>> 48);
         int var11 = (int)((var2 ^ 130544852355823L) << 16 >>> 48);
         int var12 = (int)(var10001 << 32 >>> 32);
         var13 = var2 ^ 25319429027665L;
         long var15 = var2 ^ 95715531081676L;
         var17 = var2 ^ 22084335986032L;
         long var19 = var2 ^ 24719148984178L;
         var10001 = var2 ^ 84726979948789L;
         int var21 = (int)((var2 ^ 84726979948789L) >>> 48);
         int var22 = (int)((var2 ^ 84726979948789L) << 16 >>> 32);
         int var23 = (int)(var10001 << 48 >>> 48);
         long var10000 = -6873447662443660761L;
         client.setting.Setting[] var24 = SmartRaytrace_47TG.method_48$19d51fe81e();
         if (this.field_47 != null) {
            char var10002 = (char)var21;
            char var10005 = (char)var23;
            long var10006 = -6876186368827034873L;
            char var28 = var10005;
            Fucker_47Ce var29 = this;
            int var30 = var22;
            char var31 = var10002;
            net.C_47S6 var32 = client.ClientGlobals.field_46;
            boolean var192 = var32.method_49$dc3f815dad(var31, var30, var29, var28);
            if (var24 != null) {
               this.field_43a = var192;
               long var224 = -6873206797576162588L;
               long var158 = var4;
               augustus.recovered.modules.combat.KillAura_47CY var160 = client.ClientGlobals.field_48.field_48Q;
               var184 = var160.method_46$0dd78e0064(var158);
               break label245;
            }

            this.field_43a = var192;
            long var223 = -6873206797576162588L;
            long var33 = var4;
            augustus.recovered.modules.combat.KillAura_47CY var35 = client.ClientGlobals.field_48.field_48Q;
            var184 = var35.method_46$0dd78e0064(var33);
         } else {
            this.field_43a = false;
            long var225 = -6873206797576162588L;
            long var159 = var4;
            augustus.recovered.modules.combat.KillAura_47CY var161 = client.ClientGlobals.field_48.field_48Q;
            var184 = var161.method_46$0dd78e0064(var159);
            if (var24 != null) {
               break label245;
            }
         }

         if (!var184 || client.ClientGlobals.field_48.field_48Q.field_45z == null) {
            var10001 = -6876995995825052190L;
            if (!net.C_474i.method_45$0dd78e0064(var6) && this.field_47 != null) {
               long var226 = -6874836466657249551L;
               boolean var36 = true;
               net.C_475c var37 = var1;
               var37.method_40$f633c984d8(var36);
               var226 = -6879121785145634630L;
               boolean var38 = false;
               net.C_475c var39 = var1;
               var39.method_45$f633c984d8(var38);
               var226 = -6875388704327477973L;
               boolean var40 = false;
               net.C_475c var41 = var1;
               var41.method_43$f633c984d8(var40);
               char var194 = (char)var10;
               short var229 = (short)var11;
               long var10004 = -6878151400387863696L;
               int var42 = var12;
               short var43 = var229;
               char var44 = var194;
               Fucker_47Ce var45 = this;
               if (var45.method_494$5805b0149c(var44, var43, var42)) {
                  net.C_478Q var185 = this.field_47;
                  var226 = -6878438720983259057L;
                  net.C_47S6 var46 = client.ClientGlobals.field_46;
                  float var195 = var46.method_44$4f8050086d().field_44;
                  long var10003 = -6878438720983259057L;
                  net.C_47S6 var47 = client.ClientGlobals.field_46;
                  float var253 = var47.method_44$4f8050086d().field_41;
                  long var274 = -6875034024031701072L;
                  long var48 = var8;
                  client.setting.NumberSetting var50 = this.settingRange;
                  double var267 = var50.method_44$474dfaa627(var48);
                  long var272 = -6879077018172927218L;
                  double var51 = var267;
                  float var53 = var253;
                  long var54 = var13;
                  float var56 = var195;
                  net.C_478Q var57 = var185;
                  net.C_47Ij var25 = net.C_4749.method_43$79b5af3a3c(var57, var56, var54, var53, var51);
                  if (var25 == null) {
                     return;
                  }

                  this.field_49t = var25;
                  if (var25.field_49 == net.C_47Az.BLOCK) {
                     var226 = -6875246280298990704L;
                     long var58 = var17;
                     client.setting.ModeSetting var60 = this.settingAction;
                     switch (var60.method_46$5f9dc63072(var58)) {
                        case "Break":
                           var10001 = -6875153122952623883L;
                           client.setting.BooleanSetting var61 = this.settingInstant;
                           if (var61.method_49$aae029aa0a()) {
                              var10003 = -6878280533000002883L;
                              net.minecraft.client.Minecraft var62 = field_43;
                              var10004 = -6876002202904256853L;
                              net.C_484 var63 = var62.field_42Y.field_40;
                              long var64 = var15;
                              net.C_478Q var66 = this.field_47;
                              Fucker_47Ce var67 = this;
                              var67.method_49$4c04201d9a(var66, var64, var63);
                           } else {
                              var10001 = -6878621378264886882L;
                              net.minecraft.client.Minecraft var68 = field_43;
                              if (!var68.field_44K.field_42) {
                                 var226 = -6873563024739891975L;
                                 byte var69 = 1;
                                 net.C_475c var70 = var1;
                                 var70.method_44$d00df7729d(var69);
                                 Runnable var204 = (Runnable)recovery$indy$flow$219(this, var25);
                                 var226 = -6875349081268595174L;
                                 Runnable var71 = var204;
                                 net.C_475c var72 = var1;
                                 var72.method_43$f98697054d(var71);
                              }

                              Runnable var205 = (Runnable)recovery$indy$flow$223(this, var25);
                              var226 = -6876877384358921811L;
                              Runnable var73 = var205;
                              net.C_475c var74 = var1;
                              var74.method_41$f98697054d(var73);
                              this.field_42 = var25.field_40;
                           }
                           break;
                        case "Use":
                           net.C_47cu var187 = this.field_49D;
                           var10003 = -6875034024031701072L;
                           long var75 = var8;
                           client.setting.NumberSetting var77 = this.settingDelay;
                           var10001 = (long)var77.method_44$474dfaa627(var75);
                           var10003 = -6876554089829033222L;
                           long var78 = var19;
                           long var80 = var10001;
                           net.C_47cu var82 = var187;
                           if (var82.method_42$b0e346e6e3(var80, var78)) {
                              var10001 = -6878233578893414808L;
                              net.minecraft.client.Minecraft var83 = field_43;
                              if (var83.field_44Q.method_46$efbf73d2b1(this.field_47).method_48$e084f7739d().method_49$a32a680f8b() != net.C_47Xe.field_477) {
                                 var226 = -6874771771763359696L;
                                 byte var84 = 1;
                                 net.C_475c var85 = var1;
                                 var85.method_48$d00df7729d(var84);
                                 Runnable var201 = (Runnable)recovery$indy$flow$245(this, var25);
                                 var226 = -6875201715300950330L;
                                 Runnable var86 = var201;
                                 net.C_475c var87 = var1;
                                 var87.method_47$f98697054d(var86);
                              }
                           }
                           break;
                        default:
                           net.C_47cu var186 = this.field_49D;
                           var10003 = -6875034024031701072L;
                           long var88 = var8;
                           client.setting.NumberSetting var90 = this.settingDelay;
                           var10001 = (long)var90.method_44$474dfaa627(var88);
                           var10003 = -6876554089829033222L;
                           long var91 = var19;
                           long var93 = var10001;
                           net.C_47cu var95 = var186;
                           if (var95.method_42$b0e346e6e3(var93, var91)) {
                              var226 = -6873563024739891975L;
                              byte var96 = 1;
                              net.C_475c var97 = var1;
                              var97.method_44$d00df7729d(var96);
                              Runnable var197 = (Runnable)recovery$indy$flow$257(this, var25);
                              var226 = -6875349081268595174L;
                              Runnable var98 = var197;
                              net.C_475c var99 = var1;
                              var99.method_43$f98697054d(var98);
                              var10001 = -6875766940718046041L;
                              net.C_47cu var100 = this.field_49D;
                              var100.method_46$da8c82d5d4();
                           }
                     }
                  }
               } else {
                  var10001 = -6878280533000002883L;
                  net.minecraft.client.Minecraft var101 = field_43;
                  if (var101.field_42Y.field_49 == net.C_47Az.BLOCK) {
                     var10001 = -6878280533000002883L;
                     net.minecraft.client.Minecraft var102 = field_43;
                     if (!var102.field_42Y.method_49$5730377d31().equals(this.field_47)) {
                        var10001 = -6875153122952623883L;
                        client.setting.BooleanSetting var103 = this.settingInstant;
                        if (var103.method_49$aae029aa0a()) {
                           var226 = -6878280533000002883L;
                           net.minecraft.client.Minecraft var104 = field_43;
                           net.C_478Q var217 = var104.field_42Y.method_49$5730377d31();
                           long var264 = -6878280533000002883L;
                           net.minecraft.client.Minecraft var105 = field_43;
                           var10004 = -6876002202904256853L;
                           net.C_484 var106 = var105.field_42Y.field_40;
                           long var107 = var15;
                           net.C_478Q var109 = var217;
                           Fucker_47Ce var110 = this;
                           var110.method_49$4c04201d9a(var109, var107, var106);
                        } else {
                           var226 = -6875388704327477973L;
                           boolean var111 = true;
                           net.C_475c var112 = var1;
                           var112.method_43$f633c984d8(var111);
                        }

                        return;
                     }
                  }

                  var10001 = -6878280533000002883L;
                  net.minecraft.client.Minecraft var113 = field_43;
                  if (var113.field_42Y != null) {
                     var10001 = -6878280533000002883L;
                     net.minecraft.client.Minecraft var114 = field_43;
                     if (var114.field_42Y.field_49 == net.C_47Az.BLOCK) {
                        var226 = -6875246280298990704L;
                        long var115 = var17;
                        client.setting.ModeSetting var117 = this.settingAction;
                        switch (var117.method_46$5f9dc63072(var115)) {
                           case "Break":
                              var10001 = -6875153122952623883L;
                              client.setting.BooleanSetting var118 = this.settingInstant;
                              if (var118.method_49$aae029aa0a()) {
                                 var226 = -6878280533000002883L;
                                 net.minecraft.client.Minecraft var119 = field_43;
                                 net.C_478Q var215 = var119.field_42Y.method_49$5730377d31();
                                 long var263 = -6878280533000002883L;
                                 net.minecraft.client.Minecraft var120 = field_43;
                                 var10004 = -6876002202904256853L;
                                 net.C_484 var121 = var120.field_42Y.field_40;
                                 long var122 = var15;
                                 net.C_478Q var124 = var215;
                                 Fucker_47Ce var125 = this;
                                 var125.method_49$4c04201d9a(var124, var122, var121);
                              } else {
                                 var226 = -6878280533000002883L;
                                 net.minecraft.client.Minecraft var126 = field_43;
                                 this.field_42 = var126.field_42Y.field_40;
                                 var226 = -6875388704327477973L;
                                 boolean var127 = true;
                                 net.C_475c var128 = var1;
                                 var128.method_43$f633c984d8(var127);
                              }
                              break;
                           case "Use":
                              net.C_47cu var189 = this.field_49D;
                              long var261 = -6875034024031701072L;
                              long var129 = var8;
                              client.setting.NumberSetting var131 = this.settingDelay;
                              var10001 = (long)var131.method_44$474dfaa627(var129);
                              var261 = -6876554089829033222L;
                              long var132 = var19;
                              long var134 = var10001;
                              net.C_47cu var136 = var189;
                              if (var136.method_42$b0e346e6e3(var134, var132)) {
                                 var226 = -6874771771763359696L;
                                 byte var137 = 1;
                                 net.C_475c var138 = var1;
                                 var138.method_48$d00df7729d(var137);
                                 var10001 = -6875766940718046041L;
                                 net.C_47cu var139 = this.field_49D;
                                 var139.method_46$da8c82d5d4();
                              }
                              break;
                           default:
                              net.C_47cu var188 = this.field_49D;
                              long var259 = -6875034024031701072L;
                              long var140 = var8;
                              client.setting.NumberSetting var142 = this.settingDelay;
                              var10001 = (long)var142.method_44$474dfaa627(var140);
                              var259 = -6876554089829033222L;
                              long var143 = var19;
                              long var145 = var10001;
                              net.C_47cu var147 = var188;
                              if (var147.method_42$b0e346e6e3(var145, var143)) {
                                 var226 = -6873563024739891975L;
                                 byte var148 = 1;
                                 net.C_475c var149 = var1;
                                 var149.method_44$d00df7729d(var148);
                                 var10001 = -6875766940718046041L;
                                 net.C_47cu var150 = this.field_49D;
                                 var150.method_46$da8c82d5d4();
                              }
                        }
                     }
                  }
               }
            }
         }

         return;
      }

      if (!var184) {
         net.C_478Q var190 = this.field_47;
         long var247 = -6878438720983259057L;
         net.C_47S6 var162 = client.ClientGlobals.field_46;
         float var218 = var162.method_44$4f8050086d().field_44;
         long var265 = -6878438720983259057L;
         net.C_47S6 var163 = client.ClientGlobals.field_46;
         float var266 = var163.method_44$4f8050086d().field_41;
         long var275 = -6875034024031701072L;
         long var164 = var8;
         client.setting.NumberSetting var165 = this.settingRange;
         double var271 = var165.method_44$474dfaa627(var164);
         long var273 = -6879077018172927218L;
         double var166 = var271;
         float var167 = var266;
         long var168 = var13;
         float var169 = var218;
         net.C_478Q var170 = var190;
         net.C_47Ij var152 = net.C_4749.method_43$79b5af3a3c(var170, var169, var168, var167, var166);
         if (var152.field_49 == net.C_47Az.BLOCK) {
            var247 = -6875246280298990704L;
            long var171 = var17;
            client.setting.ModeSetting var172 = this.settingAction;
            String var155 = var172.method_46$5f9dc63072(var171);
            byte var157 = -1;
            if (var155.hashCode() != 0) {
               var247 = -6873563024739891975L;
               byte var173 = 1;
               net.C_475c var174 = var1;
               var174.method_44$d00df7729d(var173);
               Runnable var219 = (Runnable)recovery$indy$flow$257(this, var152);
               var247 = -6875349081268595174L;
               Runnable var175 = var219;
               net.C_475c var176 = var1;
               var176.method_43$f98697054d(var175);
               long var220 = -6875766940718046041L;
               net.C_47cu var177 = this.field_49D;
               var177.method_46$da8c82d5d4();
            }
         }

         long var221 = -6878280533000002883L;
         net.minecraft.client.Minecraft var178 = field_43;
         if (var178.field_42Y.field_49 == net.C_47Az.BLOCK) {
            var247 = -6875246280298990704L;
            long var179 = var17;
            client.setting.ModeSetting var180 = this.settingAction;
            String var153 = var180.method_46$5f9dc63072(var179);
            byte var156 = -1;
            if (var153.hashCode() != 0) {
               var247 = -6873563024739891975L;
               byte var181 = 1;
               net.C_475c var182 = var1;
               var182.method_44$d00df7729d(var181);
               long var222 = -6875766940718046041L;
               net.C_47cu var183 = this.field_49D;
               var183.method_46$da8c82d5d4();
            }
         }
      }
   }











   public C_484 method_41$89b19fafe1() {
      return this.field_42;
   }



   public void method_41$9035875d26(long var1, C_47ob var3) {
      net.C_45J var25;
      augustus.recovered.modules.world.Fucker_47Ce var27;
      long var4 = var1 ^ 117191236877101L;
      long var6 = var1 ^ 103520846566563L;
      long var10000 = -7196295233431910758L;
      Setting[] var8 = SmartRaytrace_47TG.method_48$19d51fe81e();
      long var10001 = -7193929490066862189L;
      C_47ob var12 = var3;
      C_473U var9 = var12.method_46$96fcbedb66();
      C_473U var24 = var9;
      if (var8 == null) {
         if (!(var9 instanceof C_45J)) {
            return;
         }

         var24 = var9;
      }

      C_45J var10 = (C_45J)var24;
      var25 = var10;
      label75:
      if (var8 == null) {
         if (var10.method_47$4de68953a2() != C_40x.STOP_DESTROY_BLOCK) {
            var10001 = -7190210018855670493L;
            Minecraft var13 = field_43;
            if (!var13.field_44K.method_40$aae029aa0a()) {
               return;
            }

            var25 = var10;
            if (var8 != null) {
               break label75;
            }

            if (var10.method_47$4de68953a2() != C_40x.START_DESTROY_BLOCK) {
               return;
            }
         }

         var25 = var10;
      }

      C_478Q var11;
      label64: {
         label85: {
            var11 = var25.method_40$5730377d31();
            var10001 = -7193505409376193464L;
            BooleanSetting var14 = this.settingSurrounding;
            boolean var26 = var14.method_49$aae029aa0a();
            if (var8 == null) {
               if (!var26) {
                  break label64;
               }

               var27 = this;
               if (var8 != null) {
                  break label85;
               }

               var26 = this.field_43P;
            }

            if (var26) {
               break label64;
            }

            var27 = this;
         }

         var27.field_43P = true;
      }

      if (var11 != null) {
         Fucker_47Ce var28 = this;
         if (var8 == null) {
            long var10004 = -7190546798280691955L;
            long var15 = var6;
            Fucker_47Ce var17 = this;
            int var10002 = var17.method_45$95d88932bd(var15);
            var10004 = -7196206714830185950L;
            long var18 = var4;
            int var20 = var10002;
            C_478Q var21 = var11;
            Fucker_47Ce var22 = this;
            if (!var22.method_44$47e0966ca0(var21, var20, var18)) {
               return;
            }

            var28 = this;
         }

         var10001 = -7194119708124489702L;
         C_47cu var23 = var28.field_44;
         var23.method_46$da8c82d5d4();
      }
   }




   private void method_41$b7981a3db1(C_47Ij var1) {
      boolean var13;
      label27: {
         label29: {
            long var2 = b ^ 35349621566935L;
            long var10000 = 358804717584506433L;
            Setting[] var4 = SmartRaytrace_47TG.method_48$19d51fe81e();
            Minecraft var10001 = field_43;
            if (var4 == null) {
               long var10002 = 357281887979010077L;
               Minecraft var5 = field_43;
               if (var5.field_44m != null) {
                  break label29;
               }

               var10001 = field_43;
            }

            long var14 = 357206687298562674L;
            Minecraft var6 = var10001;
            var13 = var6.field_42h;
            if (var4 != null) {
               break label27;
            }

            if (var6.field_42h) {
               var13 = true;
               break label27;
            }
         }

         var13 = false;
      }

      long var10005 = 358674082256049089L;
      Minecraft var7 = field_43;
      var10005 = 356497668777790345L;
      int var8 = var7.field_42P.field_42X.field_42;
      C_478Q var9 = this.field_47;
      C_47Ij var10 = var1;
      boolean var11 = var13;
      Minecraft var12 = field_43;
      var12.method_42$54ac5f0361(var11, var10, var9, var8);
   }



    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   private C_47tf method_40$1629cf06c8(List var1, int var2, short var3, short var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      long var7 = var5 ^ 115607039038276L;
      long var9 = var5 ^ 21784722178574L;
      long var11 = var5 ^ 43307294174592L;
      C_47tf var14 = null;
      long var10000 = 7278633769360146361L;
      Setting[] var50 = SmartRaytrace_47TG.method_48$19d51fe81e();
      double var15 = 15.0;
      Setting[] var13 = var50;
      Iterator var17 = var1.iterator();

      label55:
      while (true) {
         Object var51;
         if (var17.hasNext()) {
            var51 = var17.next();
         } else {
            var51 = var14;
            if (var3 > 0) {
               return var14;
            }
         }

         do {
            label58: {
               C_47ge var18 = (C_47ge)var51;
               double var52 = var18.field_48;
               double var10001 = var18.field_44;
               double var10003 = var18.field_42;
               long var10005 = 7283619604202646993L;
               C_47S6 var23 = ClientGlobals.field_46;
               C_477r var10004 = var23.method_44$4f8050086d();
               long var10008 = 7281311648479366272L;
               boolean var24 = false;
               float var25 = 180.0F;
               float var26 = 180.0F;
               C_477r var27 = var10004;
               double var28 = var10003;
               long var30 = var7;
               double var32 = var10001;
               double var34 = var52;
               C_477r var19 = C_47gg.method_48$63715048f6(var34, var32, var30, var28, var27, var26, var25, var24);
               long var56 = 7278406375934702137L;
               Minecraft var36 = field_43;
               long var10002 = 7283524909996495872L;
               Minecraft var37 = field_43;
               C_47Ij var20 = var36.field_42P.method_46$f1643728ee(var37.field_44K.method_44$bc607678b6(), 1.0F, var19.field_44, var19.field_41);
               C_47Ij var53 = var20;
               if (var13 == null) {
                  if (var20 == null) {
                     break label58;
                  }

                  var53 = var20;
               }

               if (var53.field_49 == C_47Az.BLOCK) {
                  C_478Q var57 = var20.method_49$5730377d31();
                  long var62 = 7283853922979272238L;
                  long var38 = var11;
                  Fucker_47Ce var40 = this;
                  int var58 = var40.method_45$95d88932bd(var38);
                  long var63 = 7278530972405981953L;
                  long var41 = var9;
                  int var43 = var58;
                  C_478Q var44 = var57;
                  Fucker_47Ce var45 = this;
                  label44:
                  if (var45.method_44$47e0966ca0(var44, var43, var41)) {
                     var10002 = 7278406375934702137L;
                     Minecraft var46 = field_43;
                     var52 = Math.pow(var18.field_48 - var46.field_42P.field_48Q, 2.0);
                     long var60 = 7278406375934702137L;
                     Minecraft var47 = field_43;
                     long var64 = 7278406375934702137L;
                     Minecraft var48 = field_43;
                     var52 += Math.pow(var18.field_44 - (var47.field_42P.field_48j + var48.field_42P.method_41$bc607678b6()), 2.0);
                     long var61 = 7278406375934702137L;
                     Minecraft var49 = field_43;
                     double var21 = Math.sqrt(var52 + Math.pow(var18.field_42 - var49.field_42P.field_42o, 2.0));
                     if (var2 > 0) {
                        if (var13 == null) {
                           if (!(var21 <= var15)) {
                              break label44;
                           }

                           var15 = var21;
                        } else {
                           var15 = var21;
                        }
                     }

                     var14 = new C_47tf(var18.field_48, var18.field_44, var18.field_42);
                  }
               }
            }

            if (var13 == null) {
               continue label55;
            }

            var51 = var14;
         } while (var3 <= 0);

         return var14;
      }
   }





   private C_47tf method_40$2ea417e840(long var1, C_478Q var3, C_478i var4) {
      var1 = b ^ var1;
      long var10001 = var1 ^ 89426808059926L;
      int var5 = (int)((var1 ^ 89426808059926L) >>> 32);
      int var6 = (int)((var1 ^ 89426808059926L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      int var8 = (int)((var1 ^ 75569819756859L) >>> 56);
      long var9 = (var1 ^ 75569819756859L) << 8 >>> 8;
      return recovery$indy$16(
         this,
         recovery$indy$15(
            (byte)var8,
            var9,
            var4,
            new C_47ge(
               var3.method_40$8abf5c6871() + 0.5 - recovery$indy$11(field_43, 3756363713842766618L, var1).field_48Q,
               recovery$indy$12(field_43, 3756363713842766618L, var1).field_48j + recovery$indy$13(field_43, 3756363713842766618L, var1).method_41$bc607678b6(),
               var3.method_47$8abf5c6871() + 0.5 - recovery$indy$14(field_43, 3756363713842766618L, var1).field_42o
            ),
            3760310786047495338L,
            var1
         ),
         var5,
         (short)var6,
         (short)var7,
         3759412740899490150L,
         var1
      );
   }



   private boolean method_494$5805b0149c(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      Setting[] var6 = recovery$indy$17(236136370885024253L, var4);
      boolean var10000 = recovery$indy$18(this.settingThroughWall, 237841590877776687L, var4);
      if (var6 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = recovery$indy$19(this.settingBreakOnlyFreeBeds, 237841590877776687L, var4);
      }

      return var6 != null ? var10000 : !var10000;
   }



   private boolean method_44$47e0966ca0(C_478Q var1, int var2, long var3) {
      var3 = b ^ var3;
      long var5 = var3 ^ 35646221989414L;
      return var1 != null
         ? recovery$indy$20(this, var1.method_40$8abf5c6871(), var5, var1.method_43$8abf5c6871(), var1.method_47$8abf5c6871(), var2, 1022428796986082270L, var3)
         : false;
   }



   private void method_44$b7981a3db1(C_47Ij var1) {
      Minecraft var9;
      label29: {
         long var2 = b ^ 138636626596086L;
         long var10000 = 8780863471703597920L;
         Setting[] var4 = SmartRaytrace_47TG.method_48$19d51fe81e();
         boolean var8 = C_47AC.field_45.olderThanOrEqualTo(ProtocolVersion.v1_8);
         if (var4 == null) {
            if (var8) {
               long var10001 = 8780640613772144352L;
               Minecraft var5 = field_43;
               var5.field_42P.method_46i$da8c82d5d4();
            }

            var9 = field_43;
            if (var4 != null) {
               break label29;
            }

            long var10 = 8776747408681584857L;
            Minecraft var6 = field_43;
            var6.field_44K.method_42$04c095064e(this.field_47, var1.field_40);
            var8 = C_47AC.field_45.newerThanOrEqualTo(ProtocolVersion.v1_9);
         }

         if (!var8) {
            return;
         }

         var9 = field_43;
      }

      long var11 = 8780640613772144352L;
      Minecraft var7 = var9;
      var7.field_42P.method_46i$da8c82d5d4();
   }



   private float method_44$50e5e95b47(C_47rf var1, char var2, int var3, int var4, C_475y var5) {
      long var6 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      long var8 = var6 ^ 67187214725536L;
      Setting[] var10 = recovery$indy$21(-494555240416402535L, var6);
      float var11 = 0.0F;
      if (!var5.equals(C_475y.method_49$c1e739f280(recovery$indy$22(this, var8, -489369581564966386L, var6)))) {
         Setting[] var10000;
         label51: {
            label50: {
               label56: {
                  C_43r var12 = var1.method_48$dbd570a038();
                  var10000 = var10;
                  if (var4 > 0) {
                     if (var10 == null) {
                        label44: {
                           boolean var16 = var12 instanceof C_45r;
                           if (var2 >= 0) {
                              if (var16) {
                                 break label44;
                              }

                              var16 = var12 instanceof C_45D;
                           }

                           if (!var16) {
                              break label56;
                           }
                        }

                        var11 += var1.method_48$dbd570a038().method_46$2a6db11640(var1, var5) + C_47ru.method_47$6eb1f4c276(C_47DW.field_48P.field_48X, var1);
                        var11 += C_47ru.method_47$6eb1f4c276(C_47DW.field_46.field_48X, var1) / 11.0F;
                        var11 += C_47ru.method_47$6eb1f4c276(C_47DW.field_48I.field_48X, var1) / 11.0F;
                        var11 += C_47ru.method_47$6eb1f4c276(C_47DW.field_488.field_48X, var1) / 33.0F;
                     }

                     var10000 = var10;
                  }

                  if (var2 < 0) {
                     break label51;
                  }

                  if (var10000 == null) {
                     break label50;
                  }
               }

               var11 = 1.0F;
            }

            var10000 = var10;
         }

         if (var10000 == null) {
            return var11;
         }
      }

      return 1.0F;
   }




   private C_478i method_48$d52c7ba2e7(long var1, C_478Q var3) {
      var1 = b ^ var1;
      C_47UZ var5 = recovery$indy$23(field_43, -5783492101469445793L, var1).method_46$efbf73d2b1(var3);
      C_475y var6 = var5.method_48$e084f7739d();
      Setting[] var10000 = recovery$indy$24(-5788277434410830576L, var1);
      C_478i var7 = new C_478i(
         var3.method_40$8abf5c6871() + var6.method_42$fedcb3e4d3(),
         var3.method_43$8abf5c6871() + var6.method_46$fedcb3e4d3(),
         var3.method_47$8abf5c6871() + var6.method_40$fedcb3e4d3(),
         var3.method_40$8abf5c6871() + var6.method_41$fedcb3e4d3(),
         var3.method_43$8abf5c6871() + var6.method_49$fedcb3e4d3(),
         var3.method_47$8abf5c6871() + var6.method_45$fedcb3e4d3()
      );
      Setting[] var4 = var10000;
      byte var17 = (byte) ((var6 instanceof C_47EP) ? 1 : 0);
      if (var4 == null) {
         if (var17 == 0) {
            return var7;
         }

         var17 = 4;
      }

      C_484[] var18 = new C_484[var17];
      var18[0] = C_484.NORTH;
      var18[1] = C_484.SOUTH;
      var18[2] = C_484.WEST;
      var18[3] = C_484.EAST;
      C_484[] var8 = var18;
      C_484[] var9 = var8;
      int var10 = var9.length;
      int var11 = 0;

      while (var11 < var10) {
         C_484 var12 = var9[var11];
         C_475y var13 = recovery$indy$25(field_43, -5783492101469445793L, var1)
            .method_46$efbf73d2b1(var3.method_45$3ae171ef0c(var12, 1))
            .method_48$e084f7739d();
         var10000 = var4;
         if (var1 >= 0L) {
            if (var4 == null) {
               if (var13 instanceof C_47EP) {
                  C_478Q var14 = var3.method_45$3ae171ef0c(var12, 1);
                  C_478i var15 = new C_478i(
                     var14.method_40$8abf5c6871() + var13.method_42$fedcb3e4d3(),
                     var14.method_43$8abf5c6871() + var13.method_46$fedcb3e4d3(),
                     var14.method_47$8abf5c6871() + var13.method_40$fedcb3e4d3(),
                     var14.method_40$8abf5c6871() + var13.method_41$fedcb3e4d3(),
                     var14.method_43$8abf5c6871() + var13.method_49$fedcb3e4d3(),
                     var14.method_47$8abf5c6871() + var13.method_45$fedcb3e4d3()
                  );
                  C_478i var20 = var7.method_44$cf3537e63f(var15);
                  if (var1 <= 0L) {
                     return var20;
                  }

                  var7 = var20;
                  if (var4 == null) {
                     break;
                  }
               }

               var11++;
            }

            var10000 = var4;
         }

         if (var10000 != null) {
            break;
         }
      }

      return var7;
   }




   private void method_49$4c04201d9a(C_478Q var1, long var2, C_484 var4) {
      var2 = b ^ var2;
      long var5 = var2 ^ 139380581188103L;
      long var7 = var2 ^ 71260709521803L;
      long var10000 = -8185910864934513442L;
      Setting[] var9 = SmartRaytrace_47TG.method_48$19d51fe81e();
      C_47cu var23 = this.field_49D;
      if (var9 == null) {
         long var10003 = -8183130340236027575L;
         long var10 = var5;
         NumberSetting var12 = this.settingDelay;
         long var10001 = (long)var12.method_44$474dfaa627(var10);
         var10003 = -8185075951258553341L;
         long var13 = var7;
         long var15 = var10001;
         C_47cu var17 = var23;
         if (!var17.method_42$b0e346e6e3(var15, var13)) {
            return;
         }

         var10001 = -8186079983965808290L;
         Minecraft var18 = field_43;
         var18.field_42P.method_46i$da8c82d5d4();
         var10001 = -8186079983965808290L;
         Minecraft var19 = field_43;
         var19.field_42P.field_49m.method_45$631790539f(new C_45J(C_40x.START_DESTROY_BLOCK, var1, var4));
         var10001 = -8186079983965808290L;
         Minecraft var20 = field_43;
         var20.field_42P.field_49m.method_45$631790539f(new C_45J(C_40x.STOP_DESTROY_BLOCK, var1, var4));
         var23 = this.field_49D;
      }

      long var27 = -8183875252619621794L;
      C_47cu var21 = var23;
      var21.method_46$da8c82d5d4();
   }



   private C_47tf method_49$c4b8f71e61(List var1, long var2) {
      var2 = b ^ var2;
      long var4 = var2 ^ 90186640082572L;
      long var6 = var2 ^ 105112956594708L;
      long var8 = var2 ^ 117831910966682L;
      C_47tf var11 = null;
      long var10000 = -8279680375944423517L;
      Setting[] var44 = SmartRaytrace_47TG.method_48$19d51fe81e();
      double var12 = 15.0;
      Setting[] var10 = var44;
      Iterator var14 = var1.iterator();

      label55:
      while (true) {
         Object var45;
         if (var14.hasNext()) {
            var45 = var14.next();
         } else {
            var45 = var11;
            if (var2 >= 0L) {
               return var11;
            }
         }

         do {
            label58: {
               C_47ge var15 = (C_47ge)var45;
               long var10005 = -8281869692709568562L;
               double var20 = var15.field_42;
               double var22 = var15.field_44;
               long var24 = var4;
               double var26 = var15.field_48;
               Fucker_47Ce var28 = this;
               C_477r var16 = var28.method_42$848a598ad7(var26, var24, var22, var20);
               long var10001 = -8279775277134489053L;
               Minecraft var29 = field_43;
               long var10002 = -8282670460540535782L;
               Minecraft var30 = field_43;
               C_47Ij var17 = var29.field_42P.method_46$f1643728ee(var30.field_44K.method_44$bc607678b6(), 1.0F, var16.field_44, var16.field_41);
               C_47Ij var46 = var17;
               if (var10 == null) {
                  if (var17 == null) {
                     break label58;
                  }

                  var46 = var17;
               }

               if (var46.field_49 == C_47Az.BLOCK) {
                  C_478Q var49 = var17.method_49$5730377d31();
                  long var10004 = -8282332175864218060L;
                  long var31 = var8;
                  Fucker_47Ce var33 = this;
                  int var50 = var33.method_45$95d88932bd(var31);
                  var10004 = -8279651231501186277L;
                  long var34 = var6;
                  int var36 = var50;
                  C_478Q var37 = var49;
                  Fucker_47Ce var38 = this;
                  label44:
                  if (var38.method_44$47e0966ca0(var37, var36, var34)) {
                     var10002 = -8279775277134489053L;
                     Minecraft var39 = field_43;
                     double var47 = Math.pow(var15.field_48 - var39.field_42P.field_48Q, 2.0);
                     long var10003 = -8279775277134489053L;
                     Minecraft var40 = field_43;
                     var10004 = -8279775277134489053L;
                     Minecraft var41 = field_43;
                     double var48 = var47 + Math.pow(var15.field_44 - (var40.field_42P.field_48j + var41.field_42P.method_41$bc607678b6()), 2.0);
                     var10003 = -8279775277134489053L;
                     Minecraft var42 = field_43;
                     double var18 = Math.sqrt(var48 + Math.pow(var15.field_42 - var42.field_42P.field_42o, 2.0));
                     if (var2 >= 0L) {
                        if (var10 == null) {
                           if (!(var18 <= var12)) {
                              break label44;
                           }

                           var12 = var18;
                        } else {
                           var12 = var18;
                        }
                     }

                     var11 = new C_47tf(var15.field_48, var15.field_44, var15.field_42);
                  }
               }
            }

            if (var10 == null) {
               continue label55;
            }

            var45 = var11;
         } while (var2 < 0L);

         return var11;
      }
   }




   private int method_49$95d88932bd(long var1) {
      augustus.recovered.modules.world.Fucker_47Ce var40;
      client.setting.Setting[] var45;
      int var3;
      int var4;
      int var5;
      Setting[] var9;
      float var10;
      int var11;
      C_47Ij var41;
      label109: {
         label108: {
            label107: {
               var1 = b ^ var1;
               long var10001 = var1 ^ 86211592993847L;
               var3 = (int)((var1 ^ 86211592993847L) >>> 48);
               var4 = (int)((var1 ^ 86211592993847L) << 16 >>> 32);
               var5 = (int)(var10001 << 48 >>> 48);
               var10001 = var1 ^ 103416494474835L;
               int var6 = (int)((var1 ^ 103416494474835L) >>> 48);
               int var7 = (int)((var1 ^ 103416494474835L) << 16 >>> 48);
               int var8 = (int)(var10001 << 32 >>> 32);
               var10 = 1.0F;
               long var10000 = 3179738634587338395L;
               Setting[] var38 = SmartRaytrace_47TG.method_48$19d51fe81e();
               var11 = -1;
               var9 = var38;
               char var48 = (char)var6;
               short var10002 = (short)var7;
               long var10004 = 3186240704697407436L;
               int var16 = var8;
               short var17 = var10002;
               char var18 = var48;
               Fucker_47Ce var19 = this;
               boolean var39 = var19.method_494$5805b0149c(var18, var17, var16);
               if (var9 == null) {
                  if (!var39) {
                     break label107;
                  }

                  var40 = this;
                  if (var9 != null) {
                     break label108;
                  }

                  var10001 = 3182536533183448137L;
                  BooleanSetting var20 = this.settingSurrounding;
                  var39 = var20.method_49$aae029aa0a();
               }

               if (var39) {
                  var40 = this;
                  break label108;
               }
            }

            long var50 = 3186113083930799617L;
            Minecraft var21 = field_43;
            var41 = var21.field_42Y;
            break label109;
         }

         var41 = var40.field_49t;
      }

      C_47Ij var12 = var41;
      var41 = var12;
      if (var9 == null) {
         if (var12 == null) {
            return var11;
         }

         var41 = var12;
      }

      if (var41.field_49 == C_47Az.BLOCK) {
         int var13 = 36;

         do {
            long var53 = 3179626689893301019L;
            Minecraft var22 = field_43;
            if (var13 >= var22.field_42P.field_429.field_46.size()) {
               break;
            }

            long var51 = 3179626689893301019L;
            Minecraft var23 = field_43;
            C_47rf var14 = var23.field_42P.field_429.method_46$4c10532da1(var13).method_48$ac4db64966();
            label85:
            if (var9 == null) {
               label114: {
                  C_47rf var43 = var14;
                  if (var1 >= 0L) {
                     if (var14 == null) {
                        break label114;
                     }

                     var43 = var14;
                  }

                  label77: {
                     boolean var44 = var43.method_48$dbd570a038() instanceof C_45r;
                     if (var9 == null) {
                        if (var44) {
                           break label77;
                        }

                        var44 = var14.method_48$dbd570a038() instanceof C_45D;
                     }

                     if (!var44) {
                        break label114;
                     }
                  }

                  var51 = 3186212850536506068L;
                  Minecraft var24 = field_43;
                  C_475y var15 = var24.field_44Q.method_46$efbf73d2b1(var12.method_49$5730377d31()).method_48$e084f7739d();
                  var45 = var9;
                  if (var1 < 0L) {
                     continue;
                  }

                  if (var9 != null) {
                     break label85;
                  }

                  char var54 = (char)var3;
                  long var10006 = 3183116129774222578L;
                  C_475y var25 = var15;
                  int var26 = var5;
                  int var27 = var4;
                  char var28 = var54;
                  C_47rf var29 = var14;
                  Fucker_47Ce var30 = this;
                  float var57;
                  int var46 = (var57 = var30.method_44$50e5e95b47(var29, var28, var27, var26, var25) - var10) == 0.0F ? 0 : (var57 < 0.0F ? -1 : 1);
                  if (var1 >= 0L) {
                     if (var46 <= 0) {
                        break label114;
                     }

                     char var55 = (char)var3;
                     var10006 = 3183116129774222578L;
                     C_475y var31 = var15;
                     int var32 = var5;
                     int var33 = var4;
                     char var34 = var55;
                     C_47rf var35 = var14;
                     Fucker_47Ce var36 = this;
                     var10 = var36.method_44$50e5e95b47(var35, var34, var33, var32, var31);
                     var46 = var13 - 36;
                  }

                  var11 = var46;
               }

               var13++;
            }

            var45 = var9;
         } while (var45 == null);
      }

      return var11;
   }





   private boolean method_49$e509c7db5f(int var1, long var2, int var4, int var5, int var6) {
      var2 = b ^ var2;
      C_475y var7 = recovery$indy$26(field_43, -3369302033500495906L, var2).method_49$0bfd666c6c(var1, var4, var5).method_48$e084f7739d();
      return var7.equals(C_475y.method_49$c1e739f280(var6));
   }



   private net.C_47tf method_45$43e13d13a9(long var1) {
        int var20;
        client.setting.Setting[] var233;
        client.setting.Setting[] var234;
        java.util.ArrayList var235;
        java.util.ArrayList var236;
        java.util.ArrayList var239;
      java.util.ArrayList var24;
      label1537: {
         label1629: {
            label1543: {
               long var3;
               long var7;
               long var9;
               client.setting.Setting[] var15;
               int var18;
               net.C_47tf var67;
               int var231;
               label1630: {
                  long var13;
                  net.C_478Q var16;
                  java.util.ArrayList var17;
                  int var19;
                  int var21;
                  int var22;
                  label1631: {
                     label1531: {
                        label1546: {
                           label1529: {
                              label1595: {
                                 var1 = b ^ var1;
                                 var3 = var1 ^ 66086703331782L;
                                 long var5 = var1 ^ 137772300385816L;
                                 var7 = var1 ^ 42983504032996L;
                                 var9 = var1 ^ 65905030567286L;
                                 long var11 = var1 ^ 16783938271992L;
                                 var13 = var1 ^ 28735259298405L;
                                 net.minecraft.client.Minecraft var30 = field_43;
                                 net.minecraft.client.Minecraft var31 = field_43;
                                 net.minecraft.client.Minecraft var32 = field_43;
                                 var16 = new net.C_478Q(var30.field_42P.field_48Q, var31.field_42P.field_48j, var32.field_42P.field_42o);
                                 client.setting.Setting[] var10000 = SmartRaytrace_47TG.method_48$19d51fe81e();
                                 var17 = new java.util.ArrayList();
                                 var15 = var10000;
                                 long var33 = var11;
                                 Fucker_47Ce var35 = this;
                                 var18 = var35.method_45$95d88932bd(var33);
                                 long var36 = var5;
                                 client.setting.NumberSetting var38 = this.settingAimRange;
                                 var19 = (int)var38.method_44$474dfaa627(var36);
                                 var20 = var16.method_40$8abf5c6871() - var19;
                                 if (var20 < var16.method_40$8abf5c6871() + var19) {
                                    var231 = var16.method_43$8abf5c6871() - var19;
                                    if (var15 != null) {
                                       if (var231 == 0) {
                                          var67 = (net.C_47tf)var17.get(0);
                                          client.setting.BooleanSetting var198 = this.settingSurrounding;
                                          return !var198.method_49$aae029aa0a() ? var67 : var67;
                                       }

                                       this.field_43P = false;
                                       return null;
                                    }

                                    label1608: {
                                       label1596: {
                                          var21 = var231;
                                          client.setting.Setting[] var238;
                                          if (var21 >= var16.method_43$8abf5c6871() + var19) {
                                             var20++;
                                             var238 = var15;
                                             if (var1 > 0L) {
                                                while (true) {
                                                   if (var238 != null || var20 >= var16.method_40$8abf5c6871() + var19) {
                                                      break label1529;
                                                   }

                                                   var21 = var16.method_43$8abf5c6871() - var19;

                                                   while (true) {
                                                      if (var21 < var16.method_43$8abf5c6871() + var19) {
                                                         var22 = var16.method_47$8abf5c6871() - var19;

                                                         while (var22 < var16.method_47$8abf5c6871() + var19) {
                                                            int var120 = var18;
                                                            int var129 = var22;
                                                            int var138 = var21;
                                                            long var147 = var13;
                                                            int var156 = var20;
                                                            Fucker_47Ce var165 = this;
                                                            label1406:
                                                            if (var165.method_49$e509c7db5f(var156, var147, var138, var129, var120)) {
                                                               net.C_47tf var93 = new net.C_47tf(var20, var21, var22);
                                                               client.setting.BooleanSetting var174 = this.settingFriendMyBlock;
                                                               if (var174.method_49$aae029aa0a()) {
                                                                  net.minecraft.client.Minecraft var183 = field_43;
                                                                  if (var183.field_42P.method_42$b2124a4855() != null) {
                                                                     net.minecraft.client.Minecraft var192 = field_43;
                                                                     if (!(var192.field_42P.method_42$b2124a4855().method_43$3d77d36e13(var93) > 30.0)) {
                                                                        break label1406;
                                                                     }

                                                                     var17.add(var93);
                                                                     if (var15 == null) {
                                                                        break label1406;
                                                                     }
                                                                  }
                                                               }

                                                               var17.add(var93);
                                                            }

                                                            var22++;
                                                            if (var15 != null) {
                                                               break;
                                                            }
                                                         }

                                                         var21++;
                                                         if (var15 == null) {
                                                            continue;
                                                         }
                                                      }

                                                      var20++;
                                                      var238 = var15;
                                                      break;
                                                   }
                                                }
                                             }
                                          } else {
                                             var22 = var16.method_47$8abf5c6871() - var19;

                                             while (var22 < var16.method_47$8abf5c6871() + var19) {
                                                int var39 = var18;
                                                int var40 = var22;
                                                int var41 = var21;
                                                long var42 = var13;
                                                int var44 = var20;
                                                Fucker_47Ce var45 = this;
                                                label1515:
                                                if (var45.method_49$e509c7db5f(var44, var42, var41, var40, var39)) {
                                                   net.C_47tf var23 = new net.C_47tf(var20, var21, var22);
                                                   client.setting.BooleanSetting var46 = this.settingFriendMyBlock;
                                                   if (var46.method_49$aae029aa0a()) {
                                                      net.minecraft.client.Minecraft var47 = field_43;
                                                      if (var47.field_42P.method_42$b2124a4855() != null) {
                                                         net.minecraft.client.Minecraft var48 = field_43;
                                                         if (var48.field_42P.method_42$b2124a4855().method_43$3d77d36e13(var23) > 30.0) {
                                                            var17.add(var23);
                                                            var233 = var15;
                                                            if (var1 < 0L) {
                                                               break label1631;
                                                            }

                                                            label1474:
                                                            while (true) {
                                                               if (var233 != null) {
                                                                  label1463:
                                                                  while (true) {
                                                                     var17.add(var23);

                                                                     while (true) {
                                                                        if (var15 != null || ++var22 >= var16.method_47$8abf5c6871() + var19) {
                                                                           break label1474;
                                                                        }

                                                                        var39 = var18;
                                                                        var40 = var22;
                                                                        var41 = var21;
                                                                        var42 = var13;
                                                                        var44 = var20;
                                                                        var45 = this;
                                                                        if (var45.method_49$e509c7db5f(var44, var42, var41, var40, var39)) {
                                                                           var23 = new net.C_47tf(var20, var21, var22);
                                                                           var46 = this.settingFriendMyBlock;
                                                                           if (!var46.method_49$aae029aa0a()) {
                                                                              break;
                                                                           }

                                                                           var47 = field_43;
                                                                           if (var47.field_42P.method_42$b2124a4855() == null) {
                                                                              break;
                                                                           }

                                                                           var48 = field_43;
                                                                           if (var48.field_42P.method_42$b2124a4855().method_43$3d77d36e13(var23) > 30.0) {
                                                                              break label1463;
                                                                           }
                                                                        }
                                                                     }
                                                                  }
                                                               } else {
                                                                  while (true) {
                                                                     if (var15 != null || ++var22 >= var16.method_47$8abf5c6871() + var19) {
                                                                        break label1474;
                                                                     }

                                                                     var39 = var18;
                                                                     var40 = var22;
                                                                     var41 = var21;
                                                                     var42 = var13;
                                                                     var44 = var20;
                                                                     var45 = this;
                                                                     if (var45.method_49$e509c7db5f(var44, var42, var41, var40, var39)) {
                                                                        var23 = new net.C_47tf(var20, var21, var22);
                                                                        var46 = this.settingFriendMyBlock;
                                                                        if (var46.method_49$aae029aa0a()) {
                                                                           var47 = field_43;
                                                                           if (var47.field_42P.method_42$b2124a4855() != null) {
                                                                              var48 = field_43;
                                                                              if (var48.field_42P.method_42$b2124a4855().method_43$3d77d36e13(var23) > 30.0) {
                                                                                 break;
                                                                              }
                                                                              continue;
                                                                           }
                                                                        }

                                                                        var17.add(var23);
                                                                     }
                                                                  }
                                                               }

                                                               var17.add(var23);
                                                               var233 = var15;
                                                            }

                                                            var21++;
                                                            var234 = var15;
                                                            if (var1 > 0L) {
                                                               break label1595;
                                                            }

                                                            while (true) {
                                                               if (var234 != null || var20 >= var16.method_40$8abf5c6871() + var19) {
                                                                  break label1546;
                                                               }

                                                               var21 = var16.method_43$8abf5c6871() - var19;
                                                               if (var21 >= var16.method_43$8abf5c6871() + var19) {
                                                                  break label1596;
                                                               }

                                                               var22 = var16.method_47$8abf5c6871() - var19;

                                                               while (var22 < var16.method_47$8abf5c6871() + var19) {
                                                                  var39 = var18;
                                                                  var40 = var22;
                                                                  var41 = var21;
                                                                  var42 = var13;
                                                                  var44 = var20;
                                                                  var45 = this;
                                                                  label1436:
                                                                  if (var45.method_49$e509c7db5f(var44, var42, var41, var40, var39)) {
                                                                     var23 = new net.C_47tf(var20, var21, var22);
                                                                     var46 = this.settingFriendMyBlock;
                                                                     if (var46.method_49$aae029aa0a()) {
                                                                        var47 = field_43;
                                                                        if (var47.field_42P.method_42$b2124a4855() != null) {
                                                                           var48 = field_43;
                                                                           if (!(var48.field_42P.method_42$b2124a4855().method_43$3d77d36e13(var23) > 30.0)) {
                                                                              break label1436;
                                                                           }

                                                                           var17.add(var23);
                                                                           if (var15 == null) {
                                                                              break label1436;
                                                                           }
                                                                        }
                                                                     }

                                                                     var17.add(var23);
                                                                  }

                                                                  var22++;
                                                                  if (var15 != null) {
                                                                     break;
                                                                  }
                                                               }

                                                               var234 = var15;
                                                            }
                                                         }
                                                         break label1515;
                                                      }
                                                   }

                                                   var17.add(var23);
                                                }

                                                var22++;
                                                if (var15 != null) {
                                                   break;
                                                }
                                             }

                                             var21++;
                                             var234 = var15;
                                             if (var1 > 0L) {
                                                break label1595;
                                             }

                                             while (true) {
                                                if (var234 != null || var20 >= var16.method_40$8abf5c6871() + var19) {
                                                   var239 = var17;
                                                   break label1608;
                                                }

                                                var21 = var16.method_43$8abf5c6871() - var19;
                                                if (var21 >= var16.method_43$8abf5c6871() + var19) {
                                                   var238 = var15;
                                                   break;
                                                }

                                                var22 = var16.method_47$8abf5c6871() - var19;

                                                while (true) {
                                                   if (var22 < var16.method_47$8abf5c6871() + var19) {
                                                      int var115 = var18;
                                                      int var124 = var22;
                                                      int var133 = var21;
                                                      long var142 = var13;
                                                      int var151 = var20;
                                                      Fucker_47Ce var160 = this;
                                                      label1499:
                                                      if (var160.method_49$e509c7db5f(var151, var142, var133, var124, var115)) {
                                                         net.C_47tf var87 = new net.C_47tf(var20, var21, var22);
                                                         client.setting.BooleanSetting var169 = this.settingFriendMyBlock;
                                                         if (var169.method_49$aae029aa0a()) {
                                                            net.minecraft.client.Minecraft var178 = field_43;
                                                            if (var178.field_42P.method_42$b2124a4855() != null) {
                                                               net.minecraft.client.Minecraft var187 = field_43;
                                                               if (var187.field_42P.method_42$b2124a4855().method_43$3d77d36e13(var87) > 30.0) {
                                                                  var17.add(var87);
                                                                  var233 = var15;
                                                                  if (var1 < 0L) {
                                                                     break label1631;
                                                                  }

                                                                  while (true) {
                                                                     if (var233 != null) {
                                                                        label1366:
                                                                        while (true) {
                                                                           var17.add(var87);

                                                                           while (true) {
                                                                              var22++;
                                                                              if (var15 != null) {
                                                                                 do {
                                                                                    if (var15 != null || var20 >= var16.method_40$8abf5c6871() + var19) {
                                                                                       break label1546;
                                                                                    }

                                                                                    var21 = var16.method_43$8abf5c6871() - var19;
                                                                                    if (var21 >= var16.method_43$8abf5c6871() + var19) {
                                                                                       break label1596;
                                                                                    }

                                                                                    var22 = var16.method_47$8abf5c6871() - var19;
                                                                                 } while (var22 >= var16.method_47$8abf5c6871() + var19);
                                                                              } else {
                                                                                 while (var22 >= var16.method_47$8abf5c6871() + var19) {
                                                                                    if (var15 != null || var20 >= var16.method_40$8abf5c6871() + var19) {
                                                                                       break label1546;
                                                                                    }

                                                                                    var21 = var16.method_43$8abf5c6871() - var19;
                                                                                    if (var21 >= var16.method_43$8abf5c6871() + var19) {
                                                                                       break label1596;
                                                                                    }

                                                                                    var22 = var16.method_47$8abf5c6871() - var19;
                                                                                 }
                                                                              }

                                                                              var115 = var18;
                                                                              var124 = var22;
                                                                              var133 = var21;
                                                                              var142 = var13;
                                                                              var151 = var20;
                                                                              var160 = this;
                                                                              if (var160.method_49$e509c7db5f(var151, var142, var133, var124, var115)) {
                                                                                 var87 = new net.C_47tf(var20, var21, var22);
                                                                                 var169 = this.settingFriendMyBlock;
                                                                                 if (!var169.method_49$aae029aa0a()) {
                                                                                    break;
                                                                                 }

                                                                                 var178 = field_43;
                                                                                 if (var178.field_42P.method_42$b2124a4855() == null) {
                                                                                    break;
                                                                                 }

                                                                                 var187 = field_43;
                                                                                 if (var187.field_42P.method_42$b2124a4855().method_43$3d77d36e13(var87) > 30.0
                                                                                    )
                                                                                  {
                                                                                    break label1366;
                                                                                 }
                                                                              }
                                                                           }
                                                                        }
                                                                     } else {
                                                                        while (true) {
                                                                           var22++;
                                                                           if (var15 != null) {
                                                                              do {
                                                                                 if (var15 != null || var20 >= var16.method_40$8abf5c6871() + var19) {
                                                                                    break label1546;
                                                                                 }

                                                                                 var21 = var16.method_43$8abf5c6871() - var19;
                                                                                 if (var21 >= var16.method_43$8abf5c6871() + var19) {
                                                                                    break label1596;
                                                                                 }

                                                                                 var22 = var16.method_47$8abf5c6871() - var19;
                                                                              } while (var22 >= var16.method_47$8abf5c6871() + var19);
                                                                           } else {
                                                                              while (var22 >= var16.method_47$8abf5c6871() + var19) {
                                                                                 if (var15 != null || var20 >= var16.method_40$8abf5c6871() + var19) {
                                                                                    break label1546;
                                                                                 }

                                                                                 var21 = var16.method_43$8abf5c6871() - var19;
                                                                                 if (var21 >= var16.method_43$8abf5c6871() + var19) {
                                                                                    break label1596;
                                                                                 }

                                                                                 var22 = var16.method_47$8abf5c6871() - var19;
                                                                              }
                                                                           }

                                                                           var115 = var18;
                                                                           var124 = var22;
                                                                           var133 = var21;
                                                                           var142 = var13;
                                                                           var151 = var20;
                                                                           var160 = this;
                                                                           if (var160.method_49$e509c7db5f(var151, var142, var133, var124, var115)) {
                                                                              var87 = new net.C_47tf(var20, var21, var22);
                                                                              var169 = this.settingFriendMyBlock;
                                                                              if (var169.method_49$aae029aa0a()) {
                                                                                 var178 = field_43;
                                                                                 if (var178.field_42P.method_42$b2124a4855() != null) {
                                                                                    var187 = field_43;
                                                                                    if (var187.field_42P.method_42$b2124a4855().method_43$3d77d36e13(var87)
                                                                                       > 30.0) {
                                                                                       break;
                                                                                    }
                                                                                    continue;
                                                                                 }
                                                                              }

                                                                              var17.add(var87);
                                                                           }
                                                                        }
                                                                     }

                                                                     var17.add(var87);
                                                                     var233 = var15;
                                                                  }
                                                               }
                                                               break label1499;
                                                            }
                                                         }

                                                         var17.add(var87);
                                                      }

                                                      var22++;
                                                      if (var15 == null) {
                                                         continue;
                                                      }
                                                   }

                                                   var234 = var15;
                                                   break;
                                                }
                                             }
                                          }

                                          if (var238 != null) {
                                             return null;
                                          }

                                          var239 = var17;
                                          break label1608;
                                       }

                                       if (var15 != null) {
                                          return null;
                                       }

                                       var235 = var17;
                                       break label1531;
                                    }

                                    if (var239.isEmpty()) {
                                       this.field_43P = false;
                                       return null;
                                    }

                                    var67 = (net.C_47tf)var17.get(0);
                                    client.setting.BooleanSetting var196 = this.settingSurrounding;
                                    var231 = ((int) (var196.method_49$aae029aa0a() ? 1 : 0));
                                 } else {
                                    if (var1 > 0L) {
                                       var17.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$764()));
                                       if (var15 != null) {
                                          return null;
                                       }

                                       if (var17.isEmpty()) {
                                          this.field_43P = false;
                                          return null;
                                       }

                                       var67 = (net.C_47tf)var17.get(0);
                                       client.setting.BooleanSetting var193 = this.settingSurrounding;
                                       var231 = ((int) (var193.method_49$aae029aa0a() ? 1 : 0));
                                       if (var15 != null) {
                                          return !(var231 != 0) ? var67 : var67;
                                       }
                                       break label1630;
                                    }

                                    if (var17.isEmpty()) {
                                       this.field_43P = false;
                                       return null;
                                    }

                                    var67 = (net.C_47tf)var17.get(0);
                                    client.setting.BooleanSetting var49 = this.settingSurrounding;
                                    var231 = ((int) (var49.method_49$aae029aa0a() ? 1 : 0));
                                    if (var15 != null) {
                                       return !(var231 != 0) ? var67 : var67;
                                    }
                                 }

                                 if (!(var231 != 0) || this.field_43P || var67 == null) {
                                    return var67;
                                 }

                                 net.C_478Q var76 = new net.C_478Q(var67.field_40, var67.field_41, var67.field_47);
                                 net.C_478Q var200 = var76;
                                 long var203 = var7;
                                 Fucker_47Ce var206 = this;
                                 net.C_478i var83 = var206.method_48$d52c7ba2e7(var203, var200);
                                 net.C_478i var209 = var83;
                                 net.C_478Q var212 = var76;
                                 long var215 = var3;
                                 Fucker_47Ce var218 = this;
                                 net.C_47tf var92 = var218.method_46$2ea417e840(var215, var212, var209);
                                 if (var92 != null) {
                                    return var67;
                                 }

                                 var24 = new java.util.ArrayList();
                                 net.C_484[] var97 = net.C_484.VALUES;
                                 int var100 = var97.length;
                                 int var103 = 0;

                                 while (true) {
                                    if (var103 >= var100) {
                                       break label1537;
                                    }

                                    net.C_484 var106 = var97[var103];
                                    if (var106 != net.C_484.DOWN) {
                                       net.C_478Q var110 = var76.method_41$0103bdcc48(var106);
                                       client.setting.Setting[] var240 = var15;
                                       if (var1 < 0L) {
                                          while (true) {
                                             if (var240 != null || var103 >= var100) {
                                                break label1629;
                                             }

                                             var106 = var97[var103];
                                             if (var106 != net.C_484.DOWN) {
                                                var76.method_41$0103bdcc48(var106);
                                                var240 = var15;
                                             } else {
                                                var103++;
                                                var240 = var15;
                                             }
                                          }
                                       }

                                       while (true) {
                                          if (var240 == null) {
                                             long var220 = var9;
                                             int var222 = var18;
                                             net.C_478Q var224 = var110;
                                             Fucker_47Ce var226 = this;
                                             if (!var226.method_44$47e0966ca0(var224, var222, var220)) {
                                                net.minecraft.client.Minecraft var228 = field_43;
                                                if (var228.field_44Q.method_46$efbf73d2b1(var110).method_48$e084f7739d().method_49$a32a680f8b()
                                                   != net.C_47Xe.field_477) {
                                                   var24.add(
                                                      new net.C_47tf(
                                                         var110.method_40$8abf5c6871() + 0.5,
                                                         var110.method_43$8abf5c6871() + 0.5,
                                                         var110.method_47$8abf5c6871() + 0.5
                                                      )
                                                   );
                                                }
                                             }

                                             do {
                                                if (var15 != null || ++var103 >= var100) {
                                                   break label1543;
                                                }

                                                var106 = var97[var103];
                                             } while (var106 == net.C_484.DOWN);
                                          } else {
                                             while (true) {
                                                if (var15 != null || var103 >= var100) {
                                                   break label1543;
                                                }

                                                var106 = var97[var103];
                                                if (var106 != net.C_484.DOWN) {
                                                   break;
                                                }

                                                var103++;
                                             }
                                          }

                                          var110 = var76.method_41$0103bdcc48(var106);
                                          var240 = var15;
                                       }
                                    }

                                    var103++;
                                    if (var15 != null) {
                                       break label1537;
                                    }
                                 }
                              }

                              label1215:
                              while (true) {
                                 if (var234 != null) {
                                    do {
                                       if (var15 != null || ++var20 >= var16.method_40$8abf5c6871() + var19) {
                                          break label1215;
                                       }

                                       var21 = var16.method_43$8abf5c6871() - var19;
                                    } while (var21 >= var16.method_43$8abf5c6871() + var19);
                                 } else {
                                    while (var21 >= var16.method_43$8abf5c6871() + var19) {
                                       if (var15 != null || ++var20 >= var16.method_40$8abf5c6871() + var19) {
                                          break label1215;
                                       }

                                       var21 = var16.method_43$8abf5c6871() - var19;
                                    }
                                 }

                                 var22 = var16.method_47$8abf5c6871() - var19;

                                 while (true) {
                                    if (var22 < var16.method_47$8abf5c6871() + var19) {
                                       int var119 = var18;
                                       int var128 = var22;
                                       int var137 = var21;
                                       long var146 = var13;
                                       int var155 = var20;
                                       Fucker_47Ce var164 = this;
                                       label1197:
                                       if (var164.method_49$e509c7db5f(var155, var146, var137, var128, var119)) {
                                          net.C_47tf var91 = new net.C_47tf(var20, var21, var22);
                                          client.setting.BooleanSetting var173 = this.settingFriendMyBlock;
                                          if (var173.method_49$aae029aa0a()) {
                                             net.minecraft.client.Minecraft var182 = field_43;
                                             if (var182.field_42P.method_42$b2124a4855() != null) {
                                                net.minecraft.client.Minecraft var191 = field_43;
                                                if (!(var191.field_42P.method_42$b2124a4855().method_43$3d77d36e13(var91) > 30.0)) {
                                                   break label1197;
                                                }

                                                var17.add(var91);
                                                if (var15 == null) {
                                                   break label1197;
                                                }
                                             }
                                          }

                                          var17.add(var91);
                                       }

                                       var22++;
                                       if (var15 == null) {
                                          continue;
                                       }
                                    }

                                    var21++;
                                    var234 = var15;
                                    break;
                                 }
                              }
                           }

                           var17.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$764()));
                           if (var15 != null) {
                              return null;
                           }

                           if (var17.isEmpty()) {
                              this.field_43P = false;
                              return null;
                           }

                           var67 = (net.C_47tf)var17.get(0);
                           client.setting.BooleanSetting var197 = this.settingSurrounding;
                           var231 = ((int) (var197.method_49$aae029aa0a() ? 1 : 0));
                           break label1630;
                        }

                        var235 = var17;
                     }

                     if (!var235.isEmpty()) {
                        var67 = (net.C_47tf)var17.get(0);
                        client.setting.BooleanSetting var194 = this.settingSurrounding;
                        if (var194.method_49$aae029aa0a() && !this.field_43P && var67 != null) {
                           net.C_478Q var74 = new net.C_478Q(var67.field_40, var67.field_41, var67.field_47);
                           net.C_478Q var50 = var74;
                           long var51 = var7;
                           Fucker_47Ce var53 = this;
                           net.C_478i var80 = var53.method_48$d52c7ba2e7(var51, var50);
                           net.C_478i var54 = var80;
                           net.C_478Q var55 = var74;
                           long var56 = var3;
                           Fucker_47Ce var58 = this;
                           net.C_47tf var88 = var58.method_46$2ea417e840(var56, var55, var54);
                           if (var88 == null) {
                              var24 = new java.util.ArrayList();
                              net.C_484[] var25 = net.C_484.VALUES;
                              int var26 = var25.length;
                              int var27 = 0;

                              while (true) {
                                 if (var27 >= var26) {
                                    break label1543;
                                 }

                                 label1144: {
                                    net.C_484 var28 = var25[var27];
                                    if (var28 != net.C_484.DOWN) {
                                       net.C_478Q var29 = var74.method_41$0103bdcc48(var28);
                                       if (var15 != null) {
                                          break label1144;
                                       }

                                       long var59 = var9;
                                       int var61 = var18;
                                       net.C_478Q var62 = var29;
                                       Fucker_47Ce var63 = this;
                                       if (!var63.method_44$47e0966ca0(var62, var61, var59)) {
                                          net.minecraft.client.Minecraft var64 = field_43;
                                          if (var64.field_44Q.method_46$efbf73d2b1(var29).method_48$e084f7739d().method_49$a32a680f8b() != net.C_47Xe.field_477) {
                                             var24.add(
                                                new net.C_47tf(
                                                   var29.method_40$8abf5c6871() + 0.5, var29.method_43$8abf5c6871() + 0.5, var29.method_47$8abf5c6871() + 0.5
                                                )
                                             );
                                          }
                                       }
                                    }

                                    var27++;
                                 }

                                 if (var15 != null) {
                                    break label1543;
                                 }
                              }
                           }
                        }

                        return var67;
                     }

                     this.field_43P = false;
                     return null;
                  }

                  while (true) {
                     label1267: {
                        label1605: {
                           if (var233 != null) {
                              while (true) {
                                 if (var15 != null || var20 >= var16.method_40$8abf5c6871() + var19) {
                                    break label1605;
                                 }

                                 var21 = var16.method_43$8abf5c6871() - var19;
                                 if (var21 >= var16.method_43$8abf5c6871() + var19) {
                                    break;
                                 }

                                 var22 = var16.method_47$8abf5c6871() - var19;
                                 if (var22 < var16.method_47$8abf5c6871() + var19) {
                                    break label1267;
                                 }
                              }
                           } else {
                              while (true) {
                                 if (var22 < var16.method_47$8abf5c6871() + var19) {
                                    break label1267;
                                 }

                                 if (var15 != null || var20 >= var16.method_40$8abf5c6871() + var19) {
                                    break label1605;
                                 }

                                 var21 = var16.method_43$8abf5c6871() - var19;
                                 if (var21 >= var16.method_43$8abf5c6871() + var19) {
                                    break;
                                 }

                                 var22 = var16.method_47$8abf5c6871() - var19;
                              }
                           }

                           if (var15 != null) {
                              return null;
                           }

                           var236 = var17;
                           break;
                        }

                        var236 = var17;
                        break;
                     }

                     int var118 = var18;
                     int var127 = var22;
                     int var136 = var21;
                     long var145 = var13;
                     int var154 = var20;
                     Fucker_47Ce var163 = this;
                     label1241:
                     if (var163.method_49$e509c7db5f(var154, var145, var136, var127, var118)) {
                        net.C_47tf var89 = new net.C_47tf(var20, var21, var22);
                        client.setting.BooleanSetting var172 = this.settingFriendMyBlock;
                        if (var172.method_49$aae029aa0a()) {
                           net.minecraft.client.Minecraft var181 = field_43;
                           if (var181.field_42P.method_42$b2124a4855() != null) {
                              net.minecraft.client.Minecraft var190 = field_43;
                              if (var190.field_42P.method_42$b2124a4855().method_43$3d77d36e13(var89) > 30.0) {
                                 var17.add(var89);
                                 var233 = var15;
                                 continue;
                              }
                              break label1241;
                           }
                        }

                        var17.add(var89);
                     }

                     var22++;
                     var233 = var15;
                  }

                  if (!var236.isEmpty()) {
                     var67 = (net.C_47tf)var17.get(0);
                     client.setting.BooleanSetting var195 = this.settingSurrounding;
                     if (var195.method_49$aae029aa0a() && !this.field_43P && var67 != null) {
                        net.C_478Q var75 = new net.C_478Q(var67.field_40, var67.field_41, var67.field_47);
                        net.C_478Q var199 = var75;
                        long var202 = var7;
                        Fucker_47Ce var205 = this;
                        net.C_478i var81 = var205.method_48$d52c7ba2e7(var202, var199);
                        net.C_478i var208 = var81;
                        net.C_478Q var211 = var75;
                        long var214 = var3;
                        Fucker_47Ce var217 = this;
                        net.C_47tf var90 = var217.method_46$2ea417e840(var214, var211, var208);
                        if (var90 == null) {
                           var24 = new java.util.ArrayList();
                           net.C_484[] var96 = net.C_484.VALUES;
                           int var99 = var96.length;
                           int var102 = 0;

                           while (true) {
                              if (var102 >= var99) {
                                 break label1629;
                              }

                              net.C_484 var105 = var96[var102];
                              client.setting.Setting[] var237;
                              if (var105 != net.C_484.DOWN) {
                                 var75.method_41$0103bdcc48(var105);
                                 var237 = var15;
                              } else {
                                 var102++;
                                 var237 = var15;
                              }

                              if (var237 != null) {
                                 break label1629;
                              }
                           }
                        }
                     }

                     return var67;
                  }

                  this.field_43P = false;
                  return null;
               }

               if ((var231 != 0) && !this.field_43P && var67 != null) {
                  net.C_478Q var78 = new net.C_478Q(var67.field_40, var67.field_41, var67.field_47);
                  net.C_478Q var201 = var78;
                  long var204 = var7;
                  Fucker_47Ce var207 = this;
                  net.C_478i var85 = var207.method_48$d52c7ba2e7(var204, var201);
                  net.C_478i var210 = var85;
                  net.C_478Q var213 = var78;
                  long var216 = var3;
                  Fucker_47Ce var219 = this;
                  net.C_47tf var94 = var219.method_46$2ea417e840(var216, var213, var210);
                  if (var94 == null) {
                     var24 = new java.util.ArrayList();
                     net.C_484[] var98 = net.C_484.VALUES;
                     int var101 = var98.length;
                     int var104 = 0;

                     while (var104 < var101) {
                        label1125: {
                           net.C_484 var109 = var98[var104];
                           if (var109 != net.C_484.DOWN) {
                              net.C_478Q var111 = var78.method_41$0103bdcc48(var109);
                              if (var15 != null) {
                                 break label1125;
                              }

                              long var221 = var9;
                              int var223 = var18;
                              net.C_478Q var225 = var111;
                              Fucker_47Ce var227 = this;
                              if (!var227.method_44$47e0966ca0(var225, var223, var221)) {
                                 net.minecraft.client.Minecraft var229 = field_43;
                                 if (var229.field_44Q.method_46$efbf73d2b1(var111).method_48$e084f7739d().method_49$a32a680f8b() != net.C_47Xe.field_477) {
                                    var24.add(
                                       new net.C_47tf(var111.method_40$8abf5c6871() + 0.5, var111.method_43$8abf5c6871() + 0.5, var111.method_47$8abf5c6871() + 0.5)
                                    );
                                 }
                              }
                           }

                           var104++;
                        }

                        if (var15 != null) {
                           break;
                        }
                     }

                     var24.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$807()));
                     if (!var24.isEmpty()) {
                        return (net.C_47tf)var24.get(0);
                     }
                  }
               }

               return var67;
            }

            var24.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$807()));
            return (net.C_47tf)(Object) (var24);
         }

         var24.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$807()));
         return (net.C_47tf)(Object) (var24);
      }

      var24.sort(java.util.Comparator.comparingDouble((java.util.function.ToDoubleFunction)recovery$indy$flow$807()));
      return (net.C_47tf)(Object) (var24);
   }







   private int method_45$95d88932bd(long var1) {
      long var3;
      Setting[] var7;
      int var19;
      Setting[] var10001;
      label74: {
         var1 = b ^ var1;
         var3 = var1 ^ 127229863292373L;
         long var5 = var1 ^ 87764244030555L;
         long var10002 = 2431218295503155899L;
         long var11 = var5;
         ModeSetting var13 = this.settingBlock;
         String var9 = var13.method_46$5f9dc63072(var11);
         long var10000 = 2429621645193313036L;
         Setting[] var18 = SmartRaytrace_47TG.method_48$19d51fe81e();
         byte var10 = -1;
         var7 = var18;
         var19 = var9.hashCode();
         label73:
         if (var7 == null) {
            label77: {
               switch (var19) {
                  case 66657:
                     var19 = (int) ((var9.equals("Bed")) ? 1 : 0);
                     if (var7 != null) {
                        break label73;
                     }

                     if (var19 == 0) {
                        break label77;
                     }

                     var19 = 0;
                     if (var1 <= 0L) {
                        break;
                     }

                     var10 = 0;
                     if (var7 == null) {
                        break label77;
                     }
                  case 2092632:
                     var19 = (int) ((var9.equals("Cake")) ? 1 : 0);
                     break;
                  default:
                     break label77;
               }

               var10001 = var7;
               if (var1 < 0L) {
                  break label74;
               }

               if (var7 != null) {
                  break label73;
               }

               if (var19 != 0) {
                  var10 = 1;
               }
            }

            var19 = var10;
         }

         var10001 = var7;
      }

      if (var10001 == null) {
         label49: {
            byte var8;
            Setting[] var20;
            switch (var19) {
               case 0:
                  var8 = 26;
                  var20 = var7;
                  if (var1 < 0L) {
                     break;
                  }

                  if (var7 == null) {
                     return var8;
                  }
               case 1:
                  var8 = 92;
                  var20 = var7;
                  break;
               default:
                  break label49;
            }

            if (var20 == null) {
               return var8;
            }
         }

         long var21 = 2431278855555331739L;
         long var14 = var3;
         NumberSetting var16 = this.settingCustomID;
         var19 = (int)var16.method_44$474dfaa627(var14);
      }

      return var19;
   }



   private void method_43$b7981a3db1(C_47Ij var1) {
      Minecraft var9;
      label29: {
         long var2 = b ^ 126161618939813L;
         long var10000 = -4140804335191581645L;
         Setting[] var4 = SmartRaytrace_47TG.method_48$19d51fe81e();
         boolean var8 = C_47AC.field_45.olderThanOrEqualTo(ProtocolVersion.v1_8);
         if (var4 == null) {
            if (var8) {
               long var10001 = -4141034889164418637L;
               Minecraft var5 = field_43;
               var5.field_42P.method_46i$da8c82d5d4();
            }

            var9 = field_43;
            if (var4 != null) {
               break label29;
            }

            long var10 = -4134786126540867702L;
            Minecraft var6 = field_43;
            var6.field_44K.method_42$04c095064e(this.field_47, var1.field_40);
            var8 = C_47AC.field_45.newerThanOrEqualTo(ProtocolVersion.v1_9);
         }

         if (!var8) {
            return;
         }

         var9 = field_43;
      }

      long var11 = -4141034889164418637L;
      Minecraft var7 = var9;
      var7.field_42P.method_46i$da8c82d5d4();
   }



   public void method_40G$e45a9973e5(long var1) {
      long var3 = var1 ^ 5058280932348L;
      long var5 = var1 ^ 52039465638618L;
      long var10001 = var1 ^ 6407505185672L;
      int var7 = (int)((var1 ^ 6407505185672L) >>> 32);
      int var8 = (int)((var1 ^ 6407505185672L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var1 ^ 103618544994478L;
      long var10000 = -3622040941820569856L;
      Setting[] var12 = SmartRaytrace_47TG.method_48$19d51fe81e();
      if (this.field_47 != null) {
         long var10002 = -3622580863587360829L;
         long var14 = var3;
         KillAura_47CY var16 = ClientGlobals.field_48.field_48Q;
         int var26 = (int) ((var16.method_46$0dd78e0064(var14)) ? 1 : 0);
         Setting[] var28 = var12;
         if (var1 >= 0L) {
            if (var12 == null) {
               if (var26 != 0 && ClientGlobals.field_48.field_48Q.field_45z != null) {
                  return;
               }

               var10001 = -3623295831387207483L;
               var26 = (int) ((C_474i.method_45$0dd78e0064(var5)) ? 1 : 0);
            }

            var28 = var12;
         }

         if (var28 == null) {
            if (var26 != 0) {
               return;
            }

            var10002 = -3625839488204347662L;
            long var17 = var10;
            Fucker_47Ce var19 = this;
            var26 = var19.method_49$95d88932bd(var17);
         }

         int var13 = var26;
         int var27 = var13;
         if (var1 > 0L) {
            if (var13 == -1) {
               return;
            }

            var27 = var7;
         }

         char var10003 = (char)var8;
         char var10004 = (char)var9;
         long var10006 = -3626192519480920729L;
         int var20 = var13;
         char var21 = var10004;
         char var22 = var10003;
         byte var23 = 0;
         Fucker_47Ce var24 = this;
         int var25 = var27;
         C_47i.method_43$95cbd1eb82(var25, var24, var23, var22, var21, var20);
      }
   }




   private static boolean method_49d$aae029aa0a() {
      return false;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 49072313886417L;
      super.method_43_$e45a9973e5(var3);
      recovery$indy$29(this, 7, var5, -7103344801939963191L, var1);
      recovery$indy$30(this, 25, var5, -7103344801939963191L, var1);
      recovery$indy$31(this, 40, var5, -7103344801939963191L, var1);
      recovery$indy$32(this, 26, var5, -7103344801939963191L, var1);
      recovery$indy$33(this, 34, var5, -7103344801939963191L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      long var3 = var1 ^ 0L;
      super.method_43y$e45a9973e5(var3);
   }



   private boolean method_49T$aae029aa0a() {
      long var1 = b ^ 137156364100354L;
      long var10000 = -8489313450656968556L;
      Setting[] var3 = SmartRaytrace_47TG.method_48$19d51fe81e();
      long var10001 = -8492116503215807930L;
      BooleanSetting var4 = this.settingBreakOnlyFreeBeds;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (var6) {
            return false;
         }

         var10001 = -8492116503215807930L;
         BooleanSetting var5 = this.settingThroughWall;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 0L;
      int var6 = (int)((var4 ^ 0L) >>> 48);
      int var7 = (int)((var4 ^ 0L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      Setting[] var9 = recovery$indy$34(2734961679326248783L, var4);
      super.method_43x$c973149af1((short)var6, var7, (char)var8);
      if (var9 == null) {
         if (recovery$indy$35(field_43, 2734942781072143055L, var4) == null) {
            return;
         }

         this.field_47 = null;
         this.field_42 = null;
         recovery$indy$36(this.field_49W, 2737146825355420111L, var4);
         this.field_43P = false;
         this.field_49t = null;
      }
   }



   public void method_487$da8c82d5d4() {
      boolean var160;
      long var1 = b ^ 14795026214241L;
      long var3 = var1 ^ 140471324494347L;
      long var5 = var1 ^ 3321819975621L;
      long var7 = var1 ^ 92427154166573L;
      long var10001 = var1 ^ 135041907830335L;
      int var9 = (int)((var1 ^ 135041907830335L) >>> 48);
      int var10 = (int)((var1 ^ 135041907830335L) << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      long var12 = var1 ^ 26933110702496L;
      long var14 = var1 ^ 108468405936960L;
      var10001 = var1 ^ 124037263739003L;
      int var16 = (int)((var1 ^ 124037263739003L) >>> 32);
      int var17 = (int)((var1 ^ 124037263739003L) << 32 >>> 48);
      int var18 = (int)(var10001 << 48 >>> 48);
      long var19 = var1 ^ 97784565096195L;
      long var21 = var1 ^ 66546489335905L;
      long var23 = var1 ^ 122292585304024L;
      long var25 = var1 ^ 31617612802547L;
      long var27 = var1 ^ 138820076733138L;
      long var29 = var1 ^ 26741507650058L;
      long var31 = var1 ^ 94650904612046L;
      int var33 = (int)((var1 ^ 111188522883414L) >>> 56);
      long var34 = (var1 ^ 111188522883414L) << 8 >>> 8;
      var10001 = var1 ^ 138410340241604L;
      int var36 = (int)((var1 ^ 138410340241604L) >>> 48);
      int var37 = (int)((var1 ^ 138410340241604L) << 16 >>> 32);
      int var38 = (int)(var10001 << 48 >>> 48);
      long var10000 = -4301896763709513993L;
      Setting[] var39 = SmartRaytrace_47TG.method_48$19d51fe81e();
      Fucker_47Ce var157 = this;
      if (var39 == null) {
         var10001 = -4303610822749148123L;
         BooleanSetting var56 = this.settingBreakOnlyFreeBeds;
         if (var56.method_49$aae029aa0a()) {
            long var10002 = -4303911457829591843L;
            boolean var57 = false;
            BooleanSetting var58 = this.settingThroughWall;
            var58.method_45$f633c984d8(var57);
         }

         var157 = this;
      }

      label144: {
         label143: {
            long var10003 = -4303686953837226176L;
            long var59 = var12;
            ModeSetting var61 = this.settingBlock;
            String var177 = var61.method_46$5f9dc63072(var59);
            var10003 = -4298145689450176012L;
            String var62 = var177;
            long var63 = var5;
            Fucker_47Ce var65 = var157;
            var65.method_47$d07b98bfef(var63, var62);
            C_47tf var40 = null;
            long var178 = -4301647110831122892L;
            long var66 = var3;
            KillAura_47CY var68 = ClientGlobals.field_48.field_48Q;
            boolean var158 = var68.method_46$0dd78e0064(var66);
            if (var39 == null) {
               if (var158 && ClientGlobals.field_48.field_48Q.field_45z != null) {
                  break label143;
               }

               var10001 = -4305426980977835726L;
               var158 = C_474i.method_45$0dd78e0064(var7);
            }

            if (!var158) {
               long var179 = -4301746740602964161L;
               long var69 = var19;
               Fucker_47Ce var71 = this;
               var40 = var71.method_45$43e13d13a9(var69);
               this.field_47 = var40 == null ? null : new C_478Q(var40);
               break label144;
            }
         }

         this.field_47 = null;
      }

      Fucker_47Ce var159 = this;
      if (var39 == null) {
         if (this.field_47 == null) {
            return;
         }

         var159 = this;
      }

      C_478i var41;
      C_477r var49;
      C_47Ij var50;
      boolean var52;
      long var186 = -4298463368318552225L;
      C_478Q var72 = this.field_47;
      long var73 = var27;
      Fucker_47Ce var75 = var159;
      var41 = var75.method_48$d52c7ba2e7(var73, var72);
      var10001 = -4301947546996567177L;
      Minecraft var76 = field_43;
      C_47tf var42 = var76.field_42P.method_49$41b79b67a0(1.0F);
      double var43 = C_47sk.method_45$4b58f7ab41(var42.field_40, var41.field_48 + 0.1, var41.field_42 - 0.1);
      double var45 = C_47sk.method_45$4b58f7ab41(var42.field_41, var41.field_46 + 0.1, var41.field_47 - 0.1);
      double var47 = C_47sk.method_45$4b58f7ab41(var42.field_47, var41.field_44 + 0.1, var41.field_40 - 0.1);
      long var10005 = -4304070859132848486L;
      double var77 = var47;
      double var79 = var45;
      long var81 = var23;
      double var83 = var43;
      Fucker_47Ce var85 = this;
      var49 = var85.method_42$848a598ad7(var83, var81, var79, var77);
      var50 = C_47sc.method_42$603b2a0d50(1.0F, var49);
      long var180 = -4297863381945201505L;
      C_47S6 var86 = ClientGlobals.field_46;
      C_477r var170 = var86.method_44$4f8050086d();
      var180 = -4304927883115150499L;
      C_477r var87 = var170;
      C_477r var88 = var49;
      C_477r var51 = var88.method_44$2b7da30a17(var87);
      var10001 = -4303610822749148123L;
      BooleanSetting var89 = this.settingBreakOnlyFreeBeds;
      var52 = var89.method_49$aae029aa0a();
      var10001 = -4303610822749148123L;
      BooleanSetting var90 = this.settingBreakOnlyFreeBeds;
      var160 = var90.method_49$aae029aa0a();
      label133:
      if (var39 == null) {
         label131:
         if (var160) {
            var10005 = -4297863381945201505L;
            C_47S6 var91 = ClientGlobals.field_46;
            C_477r var10004 = var91.method_44$4f8050086d();
            long var10008 = -4304848421763125810L;
            boolean var92 = false;
            float var93 = 180.0F;
            float var94 = 180.0F;
            C_477r var95 = var10004;
            double var96 = var47;
            long var98 = var29;
            double var100 = var45;
            double var102 = var43;
            C_477r var53 = C_47gg.method_48$63715048f6(var102, var100, var98, var96, var95, var94, var93, var92);
            C_47Ij var54 = C_47sc.method_42$603b2a0d50(1.0F, var53);
            C_47Ij var161 = var54;
            if (var39 == null) {
               if (var54 == null) {
                  break label131;
               }

               var161 = var54;
            }

            if (var161.field_49 == C_47Az.BLOCK) {
               C_478Q var173 = var54.method_49$5730377d31();
               long var192 = -4297837039443937440L;
               long var104 = var31;
               Fucker_47Ce var106 = this;
               int var182 = var106.method_45$95d88932bd(var104);
               long var193 = -4301790668490980785L;
               long var107 = var14;
               int var109 = var182;
               C_478Q var110 = var173;
               Fucker_47Ce var111 = this;
               var160 = var111.method_44$47e0966ca0(var110, var109, var107);
               if (var39 != null) {
                  break label133;
               }

               if (var160) {
                  var52 = false;
               }
            }
         }

         char var174 = (char)var9;
         short var183 = (short)var10;
         long var194 = -4297584316210610272L;
         int var112 = var11;
         short var113 = var183;
         char var114 = var174;
         Fucker_47Ce var115 = this;
         var160 = var115.method_494$5805b0149c(var114, var113, var112);
      }

      label120:
      if (var39 == null) {
         label118:
         if (!var160) {
            C_47Ij var162 = var50;
            if (var39 == null) {
               if (var50 == null) {
                  break label118;
               }

               var162 = var50;
            }

            if (var162.field_49 == C_47Az.BLOCK) {
               C_478Q var175 = var50.method_49$5730377d31();
               long var195 = -4297837039443937440L;
               long var116 = var31;
               Fucker_47Ce var118 = this;
               int var184 = var118.method_45$95d88932bd(var116);
               var195 = -4301790668490980785L;
               long var119 = var14;
               int var121 = var184;
               C_478Q var122 = var175;
               Fucker_47Ce var123 = this;
               var160 = var123.method_44$47e0966ca0(var122, var121, var119);
               if (var39 != null) {
                  break label120;
               }

               if (!var160) {
                  C_47tf var156;
                  label148: {
                     byte var163 = (byte)var33;
                     double var200 = this.field_47.method_40$8abf5c6871() + 0.5;
                     long var10007 = -4301947546996567177L;
                     Minecraft var124 = field_43;
                     double var201 = var200 - var124.field_42P.field_48Q;
                     var10007 = -4301947546996567177L;
                     Minecraft var125 = field_43;
                     long var206 = -4301947546996567177L;
                     Minecraft var126 = field_43;
                     double var10006 = var125.field_42P.field_48j + var126.field_42P.method_41$bc607678b6();
                     double var204 = this.field_47.method_47$8abf5c6871() + 0.5;
                     long var10009 = -4301947546996567177L;
                     Minecraft var127 = field_43;
                     C_47ge var187 = ((net.C_47ge) (new C_47ge(var201, var10006, var204 - var127.field_42P.field_42o)));
                     var195 = -4304756083617579833L;
                     C_47ge var128 = var187;
                     C_478i var129 = var41;
                     long var130 = var34;
                     byte var132 = var163;
                     List var155 = C_47bg.method_45$80e5636ea7(var132, var130, var129, var128);
                     var186 = -4297975742931166228L;
                     long var133 = var21;
                     List var135 = var155;
                     Fucker_47Ce var136 = this;
                     var156 = var136.method_49$c4b8f71e61(var135, var133);
                     Fucker_47Ce var164 = this;
                     if (var39 == null) {
                        var10001 = -4303610822749148123L;
                        BooleanSetting var137 = this.settingBreakOnlyFreeBeds;
                        if (!var137.method_49$aae029aa0a()) {
                           break label148;
                        }

                        var164 = this;
                     }

                     short var189 = (short)var17;
                     short var198 = (short)var18;
                     var10005 = -4305093373539141365L;
                     short var138 = var198;
                     short var139 = var189;
                     int var140 = var16;
                     List var141 = var155;
                     Fucker_47Ce var142 = var164;
                     C_47tf var55 = var142.method_40$1629cf06c8(var141, var140, var139, var138);
                     var52 = var55 == null;
                  }

                  if (var156 != null) {
                     var186 = -4305226590976974061L;
                     long var143 = var25;
                     C_47tf var145 = var156;
                     Fucker_47Ce var146 = this;
                     var49 = var146.method_42$2841a7d4cb(var145, var143);
                  }
               }
            }
         }

         var160 = var52;
      }

      if (var160) {
         this.field_47 = null;
      } else {
         char var191 = (char)var36;
         long var205 = -4304360394947782186L;
         Fucker_47Ce var147 = this;
         int var148 = var38;
         int var149 = var37;
         char var150 = var191;
         byte var151 = 3;
         C_477r var152 = var49;
         C_47S6 var153 = ClientGlobals.field_46;
         var153.method_45$c163d5afc8(var152, var151, var150, var149, var148, var147);
      }
   }









   private boolean method_49D$aae029aa0a() {
      long var1 = b ^ 62858700679438L;
      long var10000 = -9213340160400336232L;
      Setting[] var3 = SmartRaytrace_47TG.method_48$19d51fe81e();
      long var10001 = -9211632973046290358L;
      BooleanSetting var4 = this.settingBreakOnlyFreeBeds;
      boolean var5 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         var5 = !var5;
      }

      return var5;
   }



   private boolean method_49c$aae029aa0a() {
      long var1 = b ^ 85373494597464L;
      long var3 = var1 ^ 97512784837529L;
      long var10002 = 9115139777309781369L;
      long var5 = var3;
      ModeSetting var7 = this.settingAction;
      return var7.method_46$5f9dc63072(var5).equals("Break");
   }



    public Fucker_47Ce(long a0) {
        super((java.lang.String) ("Fucker"),(java.lang.String) ("Ficker"),(long) (((augustus.recovered.modules.world.Fucker_47Ce.b ^ a0) ^ 6662128718955L)),(java.awt.Color) (new java.awt.Color((int) (161),(int) (17),(int) (51))),(client.module.Category) (client.module.Category.WORLD));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.world.Fucker_47Ce.b ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.world.Fucker_47Ce.b ^ a0) ^ 22014419737817L);
        long constructorKey4 = ((augustus.recovered.modules.world.Fucker_47Ce.b ^ a0) ^ 43175959733554L);
        long constructorKey5 = ((augustus.recovered.modules.world.Fucker_47Ce.b ^ a0) ^ 32797401024996L);
        long constructorKey6 = ((augustus.recovered.modules.world.Fucker_47Ce.b ^ a0) ^ 53378091333219L);
        java.lang.Object initialValue7 = recovery$indy$flow$1028(3);
        ((java.lang.Object[]) initialValue7)[0] = "Bed";
        ((java.lang.Object[]) initialValue7)[1] = "Cake";
        ((java.lang.Object[]) initialValue7)[2] = "Custom";
        client.setting.ModeSetting initialized8 = new client.setting.ModeSetting(this, "Block", constructorKey4, "Bed", (java.lang.String[]) (initialValue7));
        recovery$indy$flow$1030(this, initialized8);
        java.lang.Object initialValue9 = recovery$indy$flow$1032(3);
        ((java.lang.Object[]) initialValue9)[0] = "Break";
        ((java.lang.Object[]) initialValue9)[1] = "Click";
        ((java.lang.Object[]) initialValue9)[2] = "Use";
        client.setting.ModeSetting initialized10 = new client.setting.ModeSetting(this, "Action", constructorKey4, "Break", (java.lang.String[]) (initialValue9));
        recovery$indy$flow$1034(this, initialized10);
        client.setting.NumberSetting initialized11 = new client.setting.NumberSetting(this, "Delay", Double.longBitsToDouble(4647503709213818880L), constructorKey6, 0.0D, Double.longBitsToDouble(4652007308841189376L), 0);
        recovery$indy$flow$1037(this, initialized11);
        client.setting.NumberSetting initialized12 = new client.setting.NumberSetting(this, "AimRange", Double.longBitsToDouble(4617878467915022336L), constructorKey6, 0.0D, Double.longBitsToDouble(4618441417868443648L), 1);
        recovery$indy$flow$1040(this, initialized12);
        client.setting.NumberSetting initialized13 = new client.setting.NumberSetting(this, "Range", Double.longBitsToDouble(4616752568008179712L), constructorKey6, 0.0D, Double.longBitsToDouble(4618441417868443648L), 1);
        recovery$indy$flow$1043(this, initialized13);
        client.setting.BooleanSetting initialized14 = new client.setting.BooleanSetting(this, constructorKey5, "Break only free beds", false);
        recovery$indy$flow$1046(this, initialized14);
        client.setting.BooleanSetting initialized15 = new client.setting.BooleanSetting(this, constructorKey5, "ThroughWall", true);
        java.lang.Object initialValue16 = recovery$indy$flow$1049(this);
        java.lang.Object initialValue17 = initialValue16;
        long initialValue18 = constructorKey3;
        client.setting.BooleanSetting initialValue19 = initialized15;
        java.lang.Object initialValue20 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue19))))));
        java.lang.Object initialValue21 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue17))))));
        java.lang.Object initialValue22 = recovery$indy$flow$1052(initialValue20, initialValue18, initialValue21);
        java.lang.Object initialValue23 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue22))))));
        recovery$indy$flow$1054(this, initialValue23);
        client.setting.BooleanSetting initialized24 = new client.setting.BooleanSetting(this, constructorKey5, "Surrounding", false);
        java.lang.Object initialValue25 = recovery$indy$flow$1057(this);
        java.lang.Object initialValue26 = initialValue25;
        long initialValue27 = constructorKey3;
        client.setting.BooleanSetting initialValue28 = initialized24;
        java.lang.Object initialValue29 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue28))))));
        java.lang.Object initialValue30 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue26))))));
        java.lang.Object initialValue31 = recovery$indy$flow$1060(initialValue29, initialValue27, initialValue30);
        java.lang.Object initialValue32 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue31))))));
        recovery$indy$flow$1062(this, initialValue32);
        client.setting.BooleanSetting initialized33 = new client.setting.BooleanSetting(this, constructorKey5, "Instant", true);
        java.lang.Object initialValue34 = recovery$indy$flow$1065(this);
        java.lang.Object initialValue35 = initialValue34;
        long initialValue36 = constructorKey3;
        client.setting.BooleanSetting initialValue37 = initialized33;
        java.lang.Object initialValue38 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue37))))));
        java.lang.Object initialValue39 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue35))))));
        java.lang.Object initialValue40 = recovery$indy$flow$1068(initialValue38, initialValue36, initialValue39);
        java.lang.Object initialValue41 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue40))))));
        recovery$indy$flow$1070(this, initialValue41);
        client.setting.BooleanSetting initialized42 = new client.setting.BooleanSetting(this, constructorKey5, "FriendMyBlock", true);
        recovery$indy$flow$1073(this, initialized42);
        client.setting.NumberSetting initialized43 = new client.setting.NumberSetting(this, "CustomID", Double.longBitsToDouble(4628011567076605952L), constructorKey6, 0.0D, Double.longBitsToDouble(4645744490609377280L), 0);
        java.lang.Object initialValue44 = recovery$indy$flow$1076();
        java.lang.Object initialValue45 = initialValue44;
        client.setting.NumberSetting initialValue46 = initialized43;
        java.lang.Object initialValue47 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue46))))));
        java.lang.Object initialValue48 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue45))))));
        java.lang.Object initialValue49 = recovery$indy$flow$1079(initialValue47, initialValue48);
        recovery$indy$flow$1080(this, initialValue49);
        client.setting.BooleanSetting initialized50 = new client.setting.BooleanSetting(this, constructorKey5, "BedBlink", false);
        recovery$indy$flow$1083(this, initialized50);
        client.setting.NumberSetting initialized51 = new client.setting.NumberSetting(this, "BedBlinkTime", Double.longBitsToDouble(4666723172467343360L), constructorKey6, 0.0D, Double.longBitsToDouble(4671226772094713856L), 0);
        java.lang.Object initialValue52 = ((java.lang.Object)(((augustus.recovered.modules.world.Fucker_47Ce) (((java.lang.Object)(this)))).settingBedBlink));
        java.lang.Object initialValue53 = recovery$indy$flow$1087(initialValue52);
        java.lang.Object initialValue54 = recovery$indy$flow$1088(initialValue52);
        java.lang.Object initialValue55 = initialValue54;
        client.setting.NumberSetting initialValue56 = initialized51;
        java.lang.Object initialValue57 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue56))))));
        java.lang.Object initialValue58 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue55))))));
        java.lang.Object initialValue59 = recovery$indy$flow$1091(initialValue57, initialValue58);
        recovery$indy$flow$1092(this, initialValue59);
        net.C_47cu initialized60 = new net.C_47cu();
        recovery$indy$flow$1095(this, initialized60);
        net.C_47cu initialized61 = new net.C_47cu();
        recovery$indy$flow$1098(this, initialized61);
        net.C_47cu initialized62 = new net.C_47cu();
        recovery$indy$flow$1101(this, initialized62);
        recovery$indy$flow$1102(this, false);
    }





    private static native java.lang.Object c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String c(byte[] a0);

    private static native java.lang.String c(int a0,long a1);

    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);
    private static native java.lang.Object recovery$indy$flow$219(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$223(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$245(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$257(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$764();
    private static native java.lang.Object recovery$indy$flow$807();
    private static native java.lang.Object recovery$indy$flow$1028(int a0);
    private static native void recovery$indy$flow$1030(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1032(int a0);
    private static native void recovery$indy$flow$1034(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1037(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1040(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1043(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1046(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1049(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1052(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1054(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1057(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1060(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1062(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1065(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1068(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1070(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1073(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1076();


    private static native java.lang.Object recovery$indy$flow$1079(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1080(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1083(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$1087(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1088(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1091(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1092(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1095(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1098(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1101(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1102(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.world.Fucker_47Ce) (a0)).field_43P = a1;
        return;
    }
   private static native EntityPlayerSP recovery$indy$0(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$1(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$2(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$3(Object var0, long var1, long var3);
   private static native List recovery$indy$4(byte var0, long var1, Object var3, Object var4, long var5, long var7);
   private static native C_47tf recovery$indy$5(Object var0, Object var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$6();
   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$14(Object var0, long var1, long var3);
   private static native List recovery$indy$15(byte var0, long var1, Object var3, Object var4, long var5, long var7);
   private static native C_47tf recovery$indy$16(Object var0, Object var1, int var2, short var3, short var4, long var5, long var7);
   private static native Setting[] recovery$indy$17(long var0, long var2);
   private static native boolean recovery$indy$18(Object var0, long var1, long var3);
   private static native boolean recovery$indy$19(Object var0, long var1, long var3);
   private static native boolean recovery$indy$20(Object var0, int var1, long var2, int var4, int var5, int var6, long var7, long var9);
   private static native Setting[] recovery$indy$21(long var0, long var2);
   private static native int recovery$indy$22(Object var0, long var1, long var3, long var5);
   private static native WorldClient recovery$indy$23(Object var0, long var1, long var3);
   private static native Setting[] recovery$indy$24(long var0, long var2);
   private static native WorldClient recovery$indy$25(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$26(Object var0, long var1, long var3);
   private static native void recovery$indy$29(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$30(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$31(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$32(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$33(Object var0, int var1, long var2, long var4, long var6);
   private static native Setting[] recovery$indy$34(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$35(Object var0, long var1, long var3);
   private static native void recovery$indy$36(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$42();
}
