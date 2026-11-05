package augustus.recovered.modules.misc;
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
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_40Y;
import net.C_40x;
import net.C_40y;
import net.C_41Q;
import net.C_41Z;
import net.C_42R;
import net.C_42V;
import net.C_457;
import net.C_45J;
import net.C_45W;
import net.C_45n;
import net.C_45z;
import net.C_460;
import net.C_46k;
import net.C_473U;
import net.C_475c;
import net.C_476h;
import net.C_476q;
import net.C_478Q;
import net.C_478j;
import net.C_479E;
import net.C_47Al;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47BH;
import net.C_47Bp;
import net.C_47Bw;
import net.C_47Ij;
import net.C_47K6;
import net.C_47K7;
import net.C_47KK;
import net.C_47MN;
import net.C_47MO;
import net.minecraft.entity.Entity;
import net.C_47Md;
import client.module.Module;
import client.module.ModuleManager;
import client.setting.SettingGroup;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import net.C_47TU;
import client.setting.BooleanSetting;
import client.setting.Setting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47Tt;
import net.C_47Tv;
import net.C_47UH;
import net.C_47Ur;
import net.C_47Vc;
import net.C_47WF;
import net.C_47Wi;
import client.event.RenderListener;
import net.C_47bi;
import net.C_47cu;
import net.C_47dU;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.C_47mz;
import net.minecraft.client.Minecraft;
import net.C_47oY;
import net.C_47ob;
import net.C_47qi;
import net.C_47rf;
import net.C_47ri;
import net.C_47ru;
import client.module.Category;
import net.C_47w7;
import net.C_47xZ;
import net.C_47xz;
import net.C_47y;
import net.C_47zh;
import net.C_484;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class Disabler_47kt extends client.module.Module implements net.C_47Vc,client.event.RenderListener,net.C_47iC,net.C_47xz,net.C_41Q,net.C_47UH,net.C_460,net.C_47mz {
    private final client.setting.SettingGroup settingCustomPacketCanceling = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingIncomingPackets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingIncomingPacketsToCancel = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingOutgoingPackets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingOutGoingPacketsToCancel = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingDetailedPackets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingEntityActionsToCancel = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingDiggingPacket = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingPingSpoof = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingPingSpoofPackets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47TU settingDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingPlace = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingPlace1 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileAttack1 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileScaffold1 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyWhileMove1 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingPlace2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileAttack2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileScaffold2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyWhileMove2 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingPlace3 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileAttack3 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNotWhileScaffold3 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyWhileMove3 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRoyalPixels = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSpectate = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRide = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingKarhuClicking = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingMMCReachSemi = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnGroundTrue = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingTp = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingTPDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingTPY = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.RangeSetting settingTPXZ = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingTest = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingResourcePack = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingHover = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingGrimSpec = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingGrimSpecAlways = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSneak = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ModeSetting settingSneakType = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingSneakDelay = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.CopyOnWriteArrayList field_49A = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.HashMap field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_438; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43v; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.CopyOnWriteArrayList field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43P; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43u; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_49w = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_49l = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.concurrent.CopyOnWriteArrayList field_496 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native void b();

    private static native java.lang.reflect.Method h(long a0,long a1);

   private static boolean method_46$4c47aa9ecc(C_47KK var0) {
      long var1 = a ^ 136591359059451L;
      long var10001 = -1673922524282919008L;
      C_47KK var3 = var0;
      return C_47KK.method_40$4c47aa9ecc(var3);
   }



   public void method_46$e237a75d1b(long var1, net.C_47Wi var3) {
      long var10000 = 632166730315511184L;
      int[] var4 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 642606403135258832L;
      client.setting.BooleanSetting var9 = this.settingTest;
      int var102 = ((int) (var9.method_49$aae029aa0a() ? 1 : 0));
      if ((var102) != 0) {
         var10001 = 636177916830904106L;
         net.minecraft.client.Minecraft var10 = field_43;
         long var218;
         var102 = (var218 = var1 - 0L) == 0L ? 0 : (var218 < 0L ? -1 : 1);
         int[] var38 = var4;
         net.C_47Ij var31 = var10.field_42Y;
         if (var102 > 0) {
            var38 = var38;
            var31 = var31;
            var38 = var38;
            var31 = var31;
            int[] var170 = var38;
            var31 = var31;
            if (var170 == null) {
               var31 = var31;
               var31 = var31;
               net.C_47Ij var171 = var31;
               if (var171 == null) {
                  return;
               }

               var10001 = 636177916830904106L;
               net.minecraft.client.Minecraft var11 = field_43;
               var31 = var11.field_42Y;
            }

            var38 = var4;
            var31 = var31;
         }

         int[] var172 = var38;
         var31 = var31;
         if (var172 == null) {
            var31 = var31;
            net.C_47Az var104 = net.C_47Az.ENTITY;
            net.C_47Az var173 = var31.field_49;
            if (var173 != var104) {
               return;
            }

            var10001 = 636177916830904106L;
            net.minecraft.client.Minecraft var12 = field_43;
            var31 = var12.field_42Y;
         }

         net.minecraft.entity.Entity var5 = var31.field_47;
         boolean var198 = var5 instanceof C_47Bp;
         int[] var174 = var4;
         int var25 = ((int) (var198 ? 1 : 0));
         if (var174 == null) {
            label187: {
               label186: {
                  int var124 = var25;
                  int var181 = var124;
                  if (!(var181 != 0)) {
                     byte var199 = (byte) ((var5 instanceof C_47Bw) ? 1 : 0);
                     long var219;
                     var181 = (var219 = var1 - 0L) == 0L ? 0 : (var219 < 0L ? -1 : 1);
                     var38 = var4;
                     var25 = var199;
                     if (var181 < 0) {
                        break label187;
                     }

                     var38 = var38;
                     var124 = var25;
                     var38 = var38;
                     var124 = var124;
                     int[] var183 = var38;
                     var25 = var124;
                     if (var183 != null) {
                        break label186;
                     }

                     var124 = var25;
                     var124 = var124;
                     var181 = var124;
                     if (var181 == 0) {
                        return;
                     }
                  }

                  var10001 = 635765906070127704L;
                  net.minecraft.client.Minecraft var13 = field_43;
                  var25 = var13.field_42P.field_48y % 6;
               }

               var38 = var4;
               var25 = var25;
            }

            int[] var185 = var38;
            var25 = var25;
            if (var185 == null) {
               var25 = var25;
               var102 = var25;
               if (var102 == 0) {
                  long var216 = 631721766285848218L;
                  boolean var110 = true;
                  net.C_47Wi var111 = var3;
                  var111.method_46$f633c984d8(var110);
               }

               net.minecraft.entity.Entity var157 = var5;
               var25 = (int) ((var157 instanceof C_47Bp) ? 1 : 0);
            }

            var102 = var25;
            float var148;
            if (var102 != 0) {
               var148 = ((C_47Bp)var5).method_47$bc607678b6();
            } else {
               net.minecraft.entity.Entity var158 = var5;
               var148 = ((C_47Bw)var158).method_40$bc607678b6();
            }

            float var105;
            float var107;
            float var109;
            label173: {
               label172: {
                  var105 = var148;
                  var10001 = 635765906070127704L;
                  net.minecraft.client.Minecraft var112 = field_43;
                  var107 = (float)var112.field_42P.method_45$7383c71522(net.C_476h.field_49).method_42$fedcb3e4d3();
                  var10001 = 635765906070127704L;
                  net.minecraft.client.Minecraft var113 = field_43;
                  var109 = net.C_47ru.method_45$acfdb4811a(var113.field_42P.method_41$ac4db64966(), net.C_47Ur.UNDEFINED);
                  float var220;
                  var25 = (var220 = var107 - 0.0F) == 0.0F ? 0 : (var220 < 0.0F ? -1 : 1);
                  var102 = var25;
                  if (var102 <= 0) {
                     float var221;
                     int var200 = (var221 = var109 - 0.0F) == 0.0F ? 0 : (var221 < 0.0F ? -1 : 1);
                     long var222;
                     var102 = (var222 = var1 - 0L) == 0L ? 0 : (var222 < 0L ? -1 : 1);
                     var38 = var4;
                     var25 = var200;
                     if (var102 < 0) {
                        break label173;
                     }

                     var38 = var38;
                     var25 = var25;
                     var38 = var38;
                     var25 = var25;
                     int[] var190 = var38;
                     var25 = var25;
                     if (var190 != null) {
                        break label172;
                     }

                     var25 = var25;
                     var25 = var25;
                     var102 = var25;
                     if (var102 <= 0) {
                        return;
                     }
                  }

                  var10001 = 635765906070127704L;
                  net.minecraft.client.Minecraft var18 = field_43;
                  float var223;
                  var25 = (var223 = var18.field_42P.field_48R - 0.0F) == 0.0F ? 0 : (var223 < 0.0F ? -1 : 1);
               }

               var38 = var4;
               var25 = var25;
            }

            int[] var192 = var38;
            var25 = var25;
            if (var192 == null) {
               var25 = var25;
               var102 = var25;
               if (var102 > 0) {
                  var10001 = 635765906070127704L;
                  net.minecraft.client.Minecraft var114 = field_43;
                  boolean var142 = var114.field_42P.field_48M;
                  var142 = var142;
                  boolean var194 = var142;
                  if (!var194) {
                     var10001 = 635765906070127704L;
                     net.minecraft.client.Minecraft var20 = field_43;
                     var142 = var20.field_42P.method_49W$aae029aa0a();
                     var142 = var142;
                     var194 = var142;
                     if (!var194) {
                        var10001 = 635765906070127704L;
                        net.minecraft.client.Minecraft var21 = field_43;
                        var142 = var21.field_42P.method_48H$aae029aa0a();
                        var142 = var142;
                        var194 = var142;
                        if (!var194) {
                           var10001 = 635765906070127704L;
                           net.minecraft.client.Minecraft var22 = field_43;
                           var22.field_42P.method_41$e45115c4cf(net.C_47oY.field_463);
                        }
                     }
                  }
               }

               var107 += var109;
               float var224;
               var25 = (var224 = var105 - (40.0F - var107 * 10.0F)) == 0.0F ? 0 : (var224 < 0.0F ? -1 : 1);
            }

            var102 = var25;
            if (var102 > 0) {
               long var217 = 631721766285848218L;
               boolean var115 = true;
               net.C_47Wi var116 = var3;
               var116.method_46$f633c984d8(var115);
            }
         } else {
            float var26;
            label194: {
               var38 = var4;
               boolean var117 = (var25 != 0);
               int[] var175 = var38;
               var117 = var117;
               net.minecraft.entity.Entity var156;
               if (var175 == null) {
                  var117 = var117;
                  boolean var176 = var117;
                  if (!var176) {
                     long var10002 = 631721766285848218L;
                     boolean var14 = true;
                     net.C_47Wi var15 = var3;
                     var15.method_46$f633c984d8(var14);
                  }

                  var156 = var5;
               } else {
                  boolean var177 = var117;
                  if (var177) {
                     var26 = ((C_47Bp)var5).method_47$bc607678b6();
                     break label194;
                  }

                  var156 = var5;
               }

               var26 = ((C_47Bw)var156).method_40$bc607678b6();
            }

            float var6 = var26;
            var10001 = 635765906070127704L;
            net.minecraft.client.Minecraft var16 = field_43;
            float var7 = (float)var16.field_42P.method_45$7383c71522(net.C_476h.field_49).method_42$fedcb3e4d3();
            var10001 = 635765906070127704L;
            net.minecraft.client.Minecraft var17 = field_43;
            float var8 = net.C_47ru.method_45$acfdb4811a(var17.field_42P.method_41$ac4db64966(), net.C_47Ur.UNDEFINED);
            float var225;
            var25 = (var225 = var7 - 0.0F) == 0.0F ? 0 : (var225 < 0.0F ? -1 : 1);
            var38 = var4;
            var25 = var25;
            int[] var178 = var38;
            var25 = var25;
            if (var178 == null) {
               var25 = var25;
               var102 = var25;
               if (var102 > 0) {
                  var10001 = 635765906070127704L;
                  net.minecraft.client.Minecraft var19 = field_43;
                  var25 = ((int) (var19.field_42P.field_48M ? 1 : 0));
               } else {
                  var7 += var8;
                  float var226;
                  var25 = (var226 = var6 - (40.0F - var7 * 10.0F)) == 0.0F ? 0 : (var226 < 0.0F ? -1 : 1);
               }
            }

            var102 = var25;
            if (var102 > 0) {
               long var215 = 631721766285848218L;
               boolean var23 = true;
               net.C_47Wi var24 = var3;
               var24.method_46$f633c984d8(var23);
            }
         }
      }
   }





   private static boolean method_46$dfdcb3fbc5(C_47w7 var0) {
      long var1 = a ^ 17357120759069L;
      long var10001 = 2886576453566499949L;
      C_47w7 var3 = var0;
      return C_47w7.method_41$dfdcb3fbc5(var3);
   }



    private static native int e(long a0,long a1);

   public boolean method_42$659a89db6c(long var1, C_473U var3) {
      boolean var60;
      int[] var75;
      int[] var82;
      var1 = a ^ var1;
      long var4 = var1 ^ 39690331796703L;
      long var6 = var1 ^ 8434273474904L;
      long var8 = var1 ^ 60223677730184L;
      long var10 = var1 ^ 11686013797382L;
      long var10000 = 4754885447512751273L;
      int[] var12 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 4750144135802916193L;
      Minecraft var18 = field_43;
      if (var18.field_42P == null) {
         return false;
      }

      Class var13 = var3.getClass();
      var10000 = 4749555922394634234L;
      C_47BH[] var14 = C_47BH.values();
      int var15 = var14.length;
      int var16 = 0;

      while (true) {
         if (var16 < var15) {
            C_47BH var17 = var14[var16];
            int[] var59 = var12;
            if (var1 >= 0L) {
               if (var12 == null) {
                  long var10002 = 4748068915896433124L;
                  C_47BH var19 = var17;
                  var60 = var13.equals(C_47BH.method_46$1c4ade2dec(var19));
                  if (var12 != null) {
                     break;
                  }

                  if (var60) {
                     var10001 = 4742388751073768032L;
                     C_47BH var20 = var17;
                     C_47BH.method_42$350f7428da(var20);
                     var10001 = 4750616586804136691L;
                     C_47BH var21 = var17;
                     byte var61 = (byte) ((C_47BH.method_44$c6d513bd96(var21)) ? 1 : 0);
                     int[] var72 = var12;
                     if (var1 >= 0L) {
                        if (var12 == null) {
                           if (var61 == 0) {
                              return false;
                           }

                           var10001 = 4747263255827772374L;
                           C_47BH var22 = var17;
                           ModeSetting var62 = C_47BH.method_48$a737dc3f40(var22);
                           var10002 = 4743118207477401781L;
                           long var23 = var10;
                           ModeSetting var25 = var62;
                           var61 = (byte) ((var25.method_46$5f9dc63072(var23).equals("Always")) ? 1 : 0);
                        }

                        var72 = var12;
                     }

                     label160: {
                        label159:
                        if (var72 == null) {
                           label157:
                           if (var61 == 0) {
                              var10001 = 4747263255827772374L;
                              C_47BH var26 = var17;
                              ModeSetting var63 = C_47BH.method_48$a737dc3f40(var26);
                              var10002 = 4743118207477401781L;
                              long var27 = var10;
                              ModeSetting var29 = var63;
                              var61 = (byte) ((var29.method_46$5f9dc63072(var27).equals("OnlyOnGround")) ? 1 : 0);
                              var75 = var12;
                              if (var1 >= 0L) {
                                 if (var12 == null) {
                                    if (var61 != 0) {
                                       var10001 = 4750144135802916193L;
                                       Minecraft var30 = field_43;
                                       var61 = (byte) ((var30.field_42P.field_48M) ? 1 : 0);
                                       if (var12 != null) {
                                          break label159;
                                       }

                                       if (var30.field_42P.field_48M) {
                                          break label157;
                                       }
                                    }

                                    var10001 = 4747263255827772374L;
                                    C_47BH var31 = var17;
                                    ModeSetting var64 = C_47BH.method_48$a737dc3f40(var31);
                                    var10002 = 4743118207477401781L;
                                    long var32 = var10;
                                    ModeSetting var34 = var64;
                                    var61 = (byte) ((var34.method_46$5f9dc63072(var32).equals("OnlyInAir")) ? 1 : 0);
                                 }

                                 var75 = var12;
                              }

                              if (var1 >= 0L) {
                                 if (var75 == null) {
                                    if (var61 == 0) {
                                       return false;
                                    }

                                    var10001 = 4750144135802916193L;
                                    Minecraft var35 = field_43;
                                    var61 = (byte) ((var35.field_42P.field_48M) ? 1 : 0);
                                 }

                                 var75 = var12;
                              }

                              if (var1 < 0L) {
                                 break label160;
                              }

                              if (var75 != null) {
                                 break label159;
                              }

                              if (var61 != 0) {
                                 return false;
                              }
                           }

                           var10001 = 4750928508873587270L;
                           C_47BH var36 = var17;
                           NumberSetting var65 = C_47BH.method_44$5d9a51be61(var36);
                           var10002 = 4748902035136296847L;
                           long var37 = var8;
                           NumberSetting var39 = var65;
                           double var99;
                           var61 = (byte)((var99 = var39.method_44$474dfaa627(var37) - 0.0) == 0.0 ? 0 : (var99 < 0.0 ? -1 : 1));
                        }

                        var75 = var12;
                     }

                     label138: {
                        label137:
                        if (var75 == null) {
                           if (var61 > 0) {
                              var10001 = 4747793250545063125L;
                              C_47BH var40 = var17;
                              double var66 = C_47BH.method_45$350f7428da(var40);
                              var10002 = 4750928508873587270L;
                              C_47BH var41 = var17;
                              NumberSetting var81 = C_47BH.method_44$5d9a51be61(var41);
                              long var10003 = 4748902035136296847L;
                              long var42 = var8;
                              NumberSetting var44 = var81;
                              double var100;
                              var61 = (byte)((var100 = var66 % var44.method_44$474dfaa627(var42) - 0.0) == 0.0 ? 0 : (var100 < 0.0 ? -1 : 1));
                              var82 = var12;
                              if (var1 < 0L) {
                                 break label138;
                              }

                              if (var12 != null) {
                                 break label137;
                              }

                              if (var61 != 0) {
                                 return false;
                              }
                           }

                           var10001 = 4748659150726510598L;
                           C_47BH var45 = var17;
                           BooleanSetting var67 = C_47BH.method_46$39494fae91(var45);
                           var10001 = 4743319876866247145L;
                           BooleanSetting var46 = var67;
                           var61 = (byte) ((var46.method_49$aae029aa0a()) ? 1 : 0);
                        }

                        var82 = var12;
                     }

                     if (var82 != null) {
                        return var61 != 0;
                     }

                     if (var61 != 0) {
                        return true;
                     }

                     var10001 = 4750144135802916193L;
                     Minecraft var47 = field_43;
                     double var68 = var47.field_42P.field_48y;
                     var10002 = 4747087268391189419L;
                     C_47BH var48 = var17;
                     C_47TU var86 = C_47BH.method_43$0a0d88c901(var48);
                     long var97 = 4743462307039025628L;
                     long var49 = var6;
                     C_47TU var51 = var86;
                     double var101;
                     int var103 = (var101 = var68 - var51.method_41$474dfaa627(var49)) == 0.0 ? 0 : (var101 < 0.0 ? -1 : 1);
                     int[] var87 = var12;
                     if (var1 >= 0L) {
                        if (var12 == null) {
                           if (var103 <= 0) {
                              return false;
                           }

                           var10001 = 4750144135802916193L;
                           Minecraft var52 = field_43;
                           double var69 = var52.field_42P.field_48y;
                           var10002 = 4747087268391189419L;
                           C_47BH var53 = var17;
                           C_47TU var89 = C_47BH.method_43$0a0d88c901(var53);
                           var97 = 4748241297255729942L;
                           long var54 = var4;
                           C_47TU var56 = var89;
                           double var102;
                           var103 = (var102 = var69 - var56.method_43$474dfaa627(var54)) == 0.0 ? 0 : (var102 < 0.0 ? -1 : 1);
                        }

                        var87 = var12;
                     }

                     if (var87 != null) {
                        return var103 != 0;
                     }

                     if (var103 < 0) {
                        return true;
                     }

                     return false;
                  }

                  var16++;
               }

               var59 = var12;
            }

            if (var59 == null) {
               continue;
            }
         }

         var60 = false;
         break;
      }

      return var60;
   }






   private static boolean method_42$c6d513bd96(C_47BH var0) {
      long var1 = a ^ 90229923409034L;
      long var10001 = 2424837053771705016L;
      C_47BH var3 = var0;
      return C_47BH.method_44$c6d513bd96(var3);
   }



    private static native java.lang.reflect.Method d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field d(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

   public void method_41$9035875d26(long var1, C_47ob var3) {
      net.C_473U var43;
      int[] var50;
      int[] var53;
      int[] var62;
      long var4 = var1 ^ 51934739656647L;
      long var10000 = -7190095820020899486L;
      int[] var6 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -7198147960291524328L;
      C_47ob var13 = var3;
      C_473U var7 = var13.method_46$96fcbedb66();
      boolean var39 = var7 instanceof C_47WF;
      if (var6 == null) {
         if (var39 && ((C_47WF)var7).method_45$75ce8b0544() == C_41Z.ATTACK) {
            this.field_43P = true;
         }

         var10001 = -7198807576025213918L;
         BooleanSetting var14 = this.settingPingSpoof;
         var39 = var14.method_49$aae029aa0a();
      }

      label246: {
         int[] var47 = var6;
         if (var1 > 0L) {
            label211:
            if (var6 == null) {
               if (var39) {
                  Class var8 = var7.getClass();
                  var10000 = -7190889079965480646L;
                  C_457[] var9 = C_457.values();
                  int var10 = var9.length;
                  int var11 = 0;

                  while (var11 < var10) {
                     C_457 var12 = var9[var11];
                     int[] var41 = var6;
                     if (var1 > 0L) {
                        if (var6 == null) {
                           long var10002 = -7192477900100627567L;
                           C_457 var15 = var12;
                           var39 = var8.equals(C_457.method_43$8a06207574(var15));
                           if (var6 != null) {
                              break label211;
                           }

                           label227:
                           if (var39) {
                              if (var1 >= 0L) {
                                 var10001 = -7197536269840950657L;
                                 C_457 var16 = var12;
                                 boolean var42 = C_457.method_41$81823a6e6b(var16);
                                 if (var6 == null) {
                                    if (!var42) {
                                       break label227;
                                    }

                                    this.field_49A.add(var7);
                                 }

                                 this.field_49.put(var7, System.currentTimeMillis());
                              }

                              var3.cancel();
                              if (var6 == null) {
                                 break;
                              }
                           }

                           var11++;
                        }

                        var41 = var6;
                     }

                     if (var41 != null) {
                        break;
                     }
                  }
               }

               var43 = var7;
               if (var1 <= 0L) {
                  break label246;
               }

               var39 = var7 instanceof C_479E;
            }

            var47 = var6;
         }

         label204: {
            label203:
            if (var47 == null) {
               if (var39) {
                  var10001 = -7198807576025213918L;
                  BooleanSetting var17 = this.settingSpectate;
                  var39 = var17.method_49$aae029aa0a();
                  var50 = var6;
                  if (var1 <= 0L) {
                     break label204;
                  }

                  if (var6 != null) {
                     break label203;
                  }

                  if (var39) {
                     var10001 = -7196475119513251670L;
                     Minecraft var18 = field_43;
                     long var10004 = -7196475119513251670L;
                     Minecraft var19 = field_43;
                     var18.field_42P.field_49m.method_45$631790539f(new C_47dU(var19.field_42P.method_46$48a3a9a042()));
                  }
               }

               var39 = var7 instanceof C_479E;
            }

            var50 = var6;
         }

         label193: {
            label192:
            if (var50 == null) {
               if (var39) {
                  var10001 = -7198807576025213918L;
                  BooleanSetting var20 = this.settingRide;
                  var39 = var20.method_49$aae029aa0a();
                  var53 = var6;
                  if (var1 < 0L) {
                     break label193;
                  }

                  if (var6 != null) {
                     break label192;
                  }

                  if (var39) {
                     var10001 = -7196475119513251670L;
                     Minecraft var21 = field_43;
                     var21.field_42P.field_49m.method_43$631790539f(var7);
                     var10001 = -7196475119513251670L;
                     Minecraft var22 = field_43;
                     long var66 = -7196475119513251670L;
                     Minecraft var23 = field_43;
                     long var10005 = -7196475119513251670L;
                     Minecraft var24 = field_43;
                     long var10006 = -7196475119513251670L;
                     Minecraft var25 = field_43;
                     long var10007 = -7196475119513251670L;
                     Minecraft var26 = field_43;
                     var22.field_42P
                        .field_49m
                        .method_43$631790539f(
                           new C_47MN(
                              var23.field_42P.field_47z, var24.field_42P.field_43I, var25.field_42P.field_49w.field_42, var26.field_42P.field_49w.field_49
                           )
                        );
                     var3.cancel();
                  }
               }

               var10001 = -7198807576025213918L;
               BooleanSetting var27 = this.settingKarhuClicking;
               var39 = var27.method_49$aae029aa0a();
            }

            var53 = var6;
         }

         label182: {
            label181:
            if (var53 == null) {
               if (var39) {
                  var39 = var7 instanceof C_47bi;
                  int[] var57 = var6;
                  if (var1 > 0L) {
                     if (var6 == null) {
                        label172:
                        if (var39) {
                           var10001 = -7194951440056189992L;
                           Minecraft var28 = field_43;
                           C_47Ij var44 = var28.field_42Y;
                           if (var6 == null) {
                              if (var28.field_42Y == null) {
                                 break label172;
                              }

                              var10001 = -7194951440056189992L;
                              Minecraft var29 = field_43;
                              var44 = var29.field_42Y;
                           }

                           C_47Az var45 = var44.field_49;
                           C_47Az var60 = C_47Az.MISS;
                           if (var6 == null) {
                              if (var44.field_49 == C_47Az.MISS) {
                                 long var64 = -7193212011349757672L;
                                 long var30 = var4;
                                 Disabler_47kt var32 = this;
                                 var32.method_40$e45a9973e5(var30);
                                 if (var6 == null) {
                                    break label172;
                                 }
                              }

                              var10001 = -7194951440056189992L;
                              Minecraft var33 = field_43;
                              var45 = var33.field_42Y.field_49;
                              var60 = C_47Az.ENTITY;
                           }

                           if (var45 == var60) {
                              this.field_43u = true;
                           }
                        }

                        var39 = var7 instanceof C_479E;
                     }

                     var57 = var6;
                  }

                  if (var57 != null) {
                     break label181;
                  }

                  if (var39) {
                     var39 = this.field_43u;
                     var62 = var6;
                     if (var1 < 0L) {
                        break label182;
                     }

                     if (var6 != null) {
                        break label181;
                     }

                     if (this.field_43u) {
                        long var65 = -7193212011349757672L;
                        long var34 = var4;
                        Disabler_47kt var36 = this;
                        var36.method_40$e45a9973e5(var34);
                        this.field_43u = false;
                     }
                  }
               }

               var10001 = -7198807576025213918L;
               BooleanSetting var37 = this.settingOnGroundTrue;
               var39 = var37.method_49$aae029aa0a();
            }

            var62 = var6;
         }

         if (var62 == null) {
            if (!var39) {
               return;
            }

            var43 = var7;
            if (var6 != null) {
               break label246;
            }

            var39 = var7 instanceof C_479E;
         }

         if (!var39) {
            return;
         }

         var43 = var7;
      }

      C_479E var38 = (C_479E)var43;
      var38.method_49$f633c984d8(true);
   }






   public boolean method_41$659a89db6c(long var1, C_473U var3) {
      boolean var59;
      int[] var74;
      int[] var81;
      var1 = a ^ var1;
      long var4 = var1 ^ 41811803782953L;
      long var6 = var1 ^ 6278978556590L;
      long var8 = var1 ^ 58118884918910L;
      long var10 = var1 ^ 9616115437552L;
      Class var13 = var3.getClass();
      long var10000 = -3888087516032698529L;
      int[] var57 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -3880824106041887655L;
      C_47KK[] var14 = C_47KK.values();
      int var15 = var14.length;
      int var16 = 0;
      int[] var12 = var57;

      while (true) {
         if (var16 < var15) {
            C_47KK var17 = var14[var16];
            int[] var58 = var12;
            if (var1 >= 0L) {
               if (var12 == null) {
                  long var10002 = -3882460522888822182L;
                  C_47KK var18 = var17;
                  var59 = var13.equals(C_47KK.method_46$c8c228bb11(var18));
                  if (var12 != null) {
                     break;
                  }

                  if (var59) {
                     var10001 = -3881047395620521226L;
                     C_47KK var19 = var17;
                     C_47KK.method_40$4bc07904d6(var19);
                     var10001 = -3888453040718985876L;
                     C_47KK var20 = var17;
                     byte var60 = (byte) ((C_47KK.method_40$4c47aa9ecc(var20)) ? 1 : 0);
                     int[] var71 = var12;
                     if (var1 > 0L) {
                        if (var12 == null) {
                           if (var60 == 0) {
                              return false;
                           }

                           var10001 = -3888389863865423873L;
                           C_47KK var21 = var17;
                           ModeSetting var61 = C_47KK.method_43$24c489fbe5(var21);
                           var10002 = -3880709801353264317L;
                           long var22 = var10;
                           ModeSetting var24 = var61;
                           var60 = (byte) ((var24.method_46$5f9dc63072(var22).equals("Always")) ? 1 : 0);
                        }

                        var71 = var12;
                     }

                     label155: {
                        label154:
                        if (var71 == null) {
                           label152:
                           if (var60 == 0) {
                              var10001 = -3888389863865423873L;
                              C_47KK var25 = var17;
                              ModeSetting var62 = C_47KK.method_43$24c489fbe5(var25);
                              var10002 = -3880709801353264317L;
                              long var26 = var10;
                              ModeSetting var28 = var62;
                              var60 = (byte) ((var28.method_46$5f9dc63072(var26).equals("OnlyOnGround")) ? 1 : 0);
                              var74 = var12;
                              if (var1 >= 0L) {
                                 if (var12 == null) {
                                    if (var60 != 0) {
                                       var10001 = -3882695572873378153L;
                                       Minecraft var29 = field_43;
                                       var60 = (byte) ((var29.field_42P.field_48M) ? 1 : 0);
                                       if (var12 != null) {
                                          break label154;
                                       }

                                       if (var29.field_42P.field_48M) {
                                          break label152;
                                       }
                                    }

                                    var10001 = -3888389863865423873L;
                                    C_47KK var30 = var17;
                                    ModeSetting var63 = C_47KK.method_43$24c489fbe5(var30);
                                    var10002 = -3880709801353264317L;
                                    long var31 = var10;
                                    ModeSetting var33 = var63;
                                    var60 = (byte) ((var33.method_46$5f9dc63072(var31).equals("OnlyInAir")) ? 1 : 0);
                                 }

                                 var74 = var12;
                              }

                              if (var1 >= 0L) {
                                 if (var74 == null) {
                                    if (var60 == 0) {
                                       return false;
                                    }

                                    var10001 = -3882695572873378153L;
                                    Minecraft var34 = field_43;
                                    var60 = (byte) ((var34.field_42P.field_48M) ? 1 : 0);
                                 }

                                 var74 = var12;
                              }

                              if (var1 <= 0L) {
                                 break label155;
                              }

                              if (var74 != null) {
                                 break label154;
                              }

                              if (var60 != 0) {
                                 return false;
                              }
                           }

                           var10001 = -3885326628119552133L;
                           C_47KK var35 = var17;
                           NumberSetting var64 = C_47KK.method_49$406d8e2c44(var35);
                           var10002 = -3886185213851911047L;
                           long var36 = var8;
                           NumberSetting var38 = var64;
                           double var98;
                           var60 = (byte)((var98 = var38.method_44$474dfaa627(var36) - 0.0) == 0.0 ? 0 : (var98 < 0.0 ? -1 : 1));
                        }

                        var74 = var12;
                     }

                     label133: {
                        label132:
                        if (var74 == null) {
                           if (var60 > 0) {
                              var10001 = -3882028749387820089L;
                              C_47KK var39 = var17;
                              double var65 = C_47KK.method_45$4bc07904d6(var39);
                              var10002 = -3885326628119552133L;
                              C_47KK var40 = var17;
                              NumberSetting var80 = C_47KK.method_49$406d8e2c44(var40);
                              long var10003 = -3886185213851911047L;
                              long var41 = var8;
                              NumberSetting var43 = var80;
                              double var99;
                              var60 = (byte)((var99 = var65 % var43.method_44$474dfaa627(var41) - 0.0) == 0.0 ? 0 : (var99 < 0.0 ? -1 : 1));
                              var81 = var12;
                              if (var1 <= 0L) {
                                 break label133;
                              }

                              if (var12 != null) {
                                 break label132;
                              }

                              if (var60 != 0) {
                                 return false;
                              }
                           }

                           var10001 = -3880195204767139063L;
                           C_47KK var44 = var17;
                           BooleanSetting var66 = C_47KK.method_41$58e27ac44d(var44);
                           var10001 = -3880508218417413601L;
                           BooleanSetting var45 = var66;
                           var60 = (byte) ((var45.method_49$aae029aa0a()) ? 1 : 0);
                        }

                        var81 = var12;
                     }

                     if (var81 != null) {
                        return var60 != 0;
                     }

                     if (var60 != 0) {
                        return true;
                     }

                     var10001 = -3882695572873378153L;
                     Minecraft var46 = field_43;
                     double var67 = var46.field_42P.field_48y;
                     var10002 = -3881304745646500539L;
                     C_47KK var47 = var17;
                     C_47TU var85 = C_47KK.method_44$2475287555(var47);
                     long var96 = -3881491790157409750L;
                     long var48 = var6;
                     C_47TU var50 = var85;
                     double var100;
                     int var102 = (var100 = var67 - var50.method_41$474dfaa627(var48)) == 0.0 ? 0 : (var100 < 0.0 ? -1 : 1);
                     int[] var86 = var12;
                     if (var1 >= 0L) {
                        if (var12 == null) {
                           if (var102 <= 0) {
                              return false;
                           }

                           var10001 = -3882695572873378153L;
                           Minecraft var51 = field_43;
                           double var68 = var51.field_42P.field_48y;
                           var10002 = -3881304745646500539L;
                           C_47KK var52 = var17;
                           C_47TU var88 = C_47KK.method_44$2475287555(var52);
                           var96 = -3885719914369908512L;
                           long var53 = var4;
                           C_47TU var55 = var88;
                           double var101;
                           var102 = (var101 = var68 - var55.method_43$474dfaa627(var53)) == 0.0 ? 0 : (var101 < 0.0 ? -1 : 1);
                        }

                        var86 = var12;
                     }

                     if (var86 != null) {
                        return var102 != 0;
                     }

                     if (var102 < 0) {
                        return true;
                     }

                     return false;
                  }

                  var16++;
               }

               var58 = var12;
            }

            if (var58 == null) {
               continue;
            }
         }

         var59 = false;
         break;
      }

      return var59;
   }






    public void method_41$fae8de1664(C_475c c_475c) {
        long l = a ^ 0x184B2BF5EDB7L;
        int[] nArray = ClientSettings_47kr.method_46$d4d28024c9();
        BooleanSetting c_47TV = this.settingTest;
        if (!c_47TV.method_49$aae029aa0a()) return;
        Minecraft c_47nT = field_43;
        C_47Ij c_47Ij = c_47nT.field_42Y;
        if (nArray == null) {
            if (c_47Ij == null) return;
            Minecraft c_47nT2 = field_43;
            if (c_47nT2.field_42Y.field_49 != C_47Az.ENTITY) {
                return;
            }
        } else {
            Entity c_47MQ = c_47Ij.field_47;
            float f = c_47MQ instanceof C_47Bp ? ((C_47Bp)c_47MQ).method_47$bc607678b6() : ((C_47Bw)c_47MQ).method_40$bc607678b6();
            Minecraft c_47nT3 = field_43;
            float f2 = (float)c_47nT3.field_42P.method_45$7383c71522(C_476h.field_49).method_42$fedcb3e4d3();
            Minecraft c_47nT4 = field_43;
            float f3 = C_47ru.method_45$acfdb4811a((C_47rf)c_47nT4.field_42P.method_41$ac4db64966(), (C_47Ur)C_47Ur.UNDEFINED);
            if (!(f2 > 0.0f)) return;
            int n = 1;
            C_475c c_475c2 = c_475c;
            c_475c2.method_44$d00df7729d(n);
            int n2 = 1;
            C_475c c_475c3 = c_475c;
            c_475c3.method_48$d00df7729d(n2);
            return;
        }
        Minecraft c_47nT5 = field_43;
        Entity c_47MQ = c_47nT5.field_42Y.field_47;
        if (!(c_47MQ instanceof C_47Bp)) {
            if (!(c_47MQ instanceof C_47Bw)) return;
        }
        Minecraft c_47nT6 = field_43;
        if (c_47nT6.field_42P.field_48y % 6 == 0) {
            int n = 1;
            C_475c c_475c4 = c_475c;
            c_475c4.method_44$d00df7729d(n);
        }
        float f = c_47MQ instanceof C_47Bp ? ((C_47Bp)c_47MQ).method_47$bc607678b6() : ((C_47Bw)c_47MQ).method_40$bc607678b6();
        Minecraft c_47nT7 = field_43;
        float f4 = (float)c_47nT7.field_42P.method_45$7383c71522(C_476h.field_49).method_42$fedcb3e4d3();
        Minecraft c_47nT8 = field_43;
        float f5 = C_47ru.method_45$acfdb4811a((C_47rf)c_47nT8.field_42P.method_41$ac4db64966(), (C_47Ur)C_47Ur.UNDEFINED);
        if (!(f4 > 0.0f)) {
            if (!(f5 > 0.0f)) return;
        }
        Minecraft c_47nT9 = field_43;
        if (c_47nT9.field_42P.field_48R > 0.0f) {
            Minecraft c_47nT10 = field_43;
            if (!c_47nT10.field_42P.field_48M) {
                Minecraft c_47nT11 = field_43;
                if (!c_47nT11.field_42P.method_49W$aae029aa0a()) {
                    Minecraft c_47nT12 = field_43;
                    if (!c_47nT12.field_42P.method_48H$aae029aa0a()) {
                        Minecraft c_47nT13 = field_43;
                        c_47nT13.field_42P.method_41$e45115c4cf(C_47oY.field_463);
                    }
                }
            }
        }
        f4 += f5;
        if (!(f > 40.0f - f4 * 10.0f)) return;
        int n = 1;
        C_475c c_475c5 = c_475c;
        c_475c5.method_44$d00df7729d(n);
        int n3 = 1;
        C_475c c_475c6 = c_475c;
        c_475c6.method_48$d00df7729d(n3);
    }





    private static native java.lang.Class f(long a0,long a1);

    private static native java.lang.reflect.Field g(long a0,long a1);

   public void method_40$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 91326767746011L;
      C_473U var6 = recovery$indy$2(var3, -4091419525185185221L, var1);
      if (recovery$indy$3(this, var4, var6, -4106016557404885109L, var1)) {
         var3.cancel();
      }
   }



   private static boolean method_40$dfdcb3fbc5(C_47w7 var0) {
      long var1 = a ^ 43556820814701L;
      long var10000 = 5066723838289050373L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 5065957671846059738L;
      C_47w7 var4 = var0;
      BooleanSetting var6 = C_47w7.method_40$5e58535af9(var4);
      var10001 = 5079929712780414533L;
      BooleanSetting var5 = var6;
      boolean var7 = var5.method_49$aae029aa0a();
      if (var3 == null) {
         var7 = !var7;
      }

      return var7;
   }



   private void method_40$e45a9973e5(long var1) {
      var1 = a ^ var1;
      recovery$indy$4(field_43, -4695904383027908002L, var1).field_49m.method_45$631790539f(new C_45J(C_40x.START_DESTROY_BLOCK, C_478Q.field_44, C_484.UP));
      recovery$indy$5(field_43, -4695904383027908002L, var1).field_49m.method_45$631790539f(new C_45J(C_40x.START_DESTROY_BLOCK, C_478Q.field_44, C_484.UP));
   }



   public void method_40$e781d6169a(C_47zh var1, long var2) {
      if (recovery$indy$6(this.settingMMCReachSemi, 8485308472770084347L, var2)) {
         recovery$indy$7(var1, 500, 8498747576410618066L, var2);
      }
   }



   private static void method_40$631790539f(C_473U var0) {
      long var1 = a ^ 28199197040886L;

      try {
         long var10002 = 3301423701283267894L;
         Minecraft var4 = field_43;
         var0.method_44$f0d6357a98(var4.method_40$f8db5d9e73().method_49$431840b606().method_45$43d93f0756());
      } catch (Throwable var5) {
      }
   }



   private static boolean method_44$4c47aa9ecc(C_47KK var0) {
      long var1 = a ^ 28006656182789L;
      long var10000 = 5132028358374652525L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 5121959040208188987L;
      C_47KK var4 = var0;
      BooleanSetting var6 = C_47KK.method_41$58e27ac44d(var4);
      var10001 = 5122765192994000685L;
      BooleanSetting var5 = var6;
      boolean var7 = var5.method_49$aae029aa0a();
      if (var3 == null) {
         var7 = !var7;
      }

      return var7;
   }



   public void method_44$cecb73866e(int var1, C_47K7 var2, long var3) {
      net.C_47cu var83;
      double var96;
      double var97;
      double var98;
      long var9;
      long var13;
      int[] var15;
      int var82;
      int[] var84;
      label173: {
         long var5 = (long)var1 << 32 | var3 << 32 >>> 32;
         long var7 = var5 ^ 93560678845923L;
         var9 = var5 ^ 78550361912250L;
         long var11 = var5 ^ 115942598083693L;
         var13 = var5 ^ 117769954117231L;
         long var10000 = 4726489107499842754L;
         var15 = ClientSettings_47kr.method_46$d4d28024c9();
         long var10001 = 4735758869882833282L;
         BooleanSetting var18 = this.settingSneak;
         var82 = (int) ((var18.method_49$aae029aa0a()) ? 1 : 0);
         label172:
         if (var15 == null) {
            if (var82 != 0) {
               this.field_438++;
               long var10003 = 4723184122602829796L;
               long var19 = var7;
               NumberSetting var21 = this.settingSneakDelay;
               var82 = this.field_438 % (int)Math.max(var21.method_44$474dfaa627(var19), 1.0);
               if (var15 != null) {
                  break label172;
               }

               if (var82 == 0) {
                  long var10002 = 4735978330636732638L;
                  long var22 = var11;
                  ModeSetting var24 = this.settingSneakType;
                  var82 = (int) ((var24.method_46$5f9dc63072(var22).contains("Start")) ? 1 : 0);
                  var84 = var15;
                  if (var3 > 0L) {
                     if (var15 == null) {
                        if (var82 != 0) {
                           long var85 = 4719918913899203850L;
                           Minecraft var25 = field_43;
                           long var10004 = 4719918913899203850L;
                           Minecraft var26 = field_43;
                           var25.field_42P.field_49m.method_43$631790539f(new C_45W(var26.field_42P, C_40y.START_SNEAKING));
                        }

                        var10002 = 4735978330636732638L;
                        long var27 = var11;
                        ModeSetting var29 = this.settingSneakType;
                        var82 = (int) ((var29.method_46$5f9dc63072(var27).contains("Stop")) ? 1 : 0);
                     }

                     var84 = var15;
                  }

                  if (var1 <= 0) {
                     break label173;
                  }

                  if (var84 != null) {
                     break label172;
                  }

                  if (var82 != 0) {
                     long var86 = 4719918913899203850L;
                     Minecraft var30 = field_43;
                     long var122 = 4719918913899203850L;
                     Minecraft var31 = field_43;
                     var30.field_42P.field_49m.method_43$631790539f(new C_45W(var31.field_42P, C_40y.STOP_SNEAKING));
                  }
               }
            }

            long var87 = 4735758869882833282L;
            BooleanSetting var32 = this.settingHover;
            var82 = (int) ((var32.method_49$aae029aa0a()) ? 1 : 0);
         }

         var84 = var15;
      }

      label158: {
         label157:
         if (var84 == null) {
            if (var82 != 0) {
               long var88 = 4719918913899203850L;
               Minecraft var33 = field_43;
               var82 = var33.field_42P.field_48y % 2;
               if (var15 != null) {
                  break label157;
               }

               if (var82 == 0) {
                  long var89 = 4719918913899203850L;
                  Minecraft var34 = field_43;
                  var82 = (int) ((var34.field_42P.field_48M) ? 1 : 0);
                  if (var15 != null) {
                     break label157;
                  }

                  if (var34.field_42P.field_48M) {
                     long var90 = 4736111236679728767L;
                     C_47K7 var35 = var2;
                     double var125;
                     var82 = (var125 = var35.method_44$fedcb3e4d3() % 1.0 - 0.0) == 0.0 ? 0 : (var125 < 0.0 ? -1 : 1);
                     var84 = var15;
                     if (var1 <= 0) {
                        break label158;
                     }

                     if (var15 != null) {
                        break label157;
                     }

                     if (var82 == 0) {
                        double var16 = Math.random() * 1.0E-4;
                        long var102 = 4736111236679728767L;
                        C_47K7 var36 = var2;
                        double var92 = var36.method_44$fedcb3e4d3() + var16;
                        var102 = 4733662997714747164L;
                        double var37 = var92;
                        C_47K7 var39 = var2;
                        var39.method_48$2c20cf5948(var37);
                        var102 = 4723017545884224744L;
                        boolean var40 = false;
                        C_47K7 var41 = var2;
                        var41.method_49$f633c984d8(var40);
                     }
                  }
               }
            }

            long var93 = 4735758869882833282L;
            BooleanSetting var42 = this.settingTp;
            var82 = (int) ((var42.method_49$aae029aa0a()) ? 1 : 0);
         }

         var84 = var15;
      }

      label179: {
         if (var84 == null) {
            if (var82 == 0) {
               return;
            }

            var83 = this.field_49w;
            if (var15 != null) {
               break label179;
            }

            long var105 = 4736619700422184949L;
            RangeSetting var43 = this.settingTPDelay;
            long var94 = var43.method_44$8abf5c6871();
            long var118 = 4737144103143181179L;
            long var44 = var13;
            long var46 = var94;
            C_47cu var48 = var83;
            var82 = (int) ((var48.method_42$b0e346e6e3(var46, var44)) ? 1 : 0);
         }

         if (var82 == 0) {
            return;
         }

         var83 = this.field_49w;
      }

      label128: {
         long var95 = 4735955024975675867L;
         C_47cu var49 = var83;
         var49.method_46$da8c82d5d4();
         long var106 = 4736111236679728767L;
         C_47K7 var50 = var2;
         var96 = var50.method_44$fedcb3e4d3();
         long var119 = 4736619700422184949L;
         RangeSetting var51 = this.settingTPY;
         int var107 = var51.method_44$8abf5c6871();
         long var10007 = 4736709855420191075L;
         long var52 = var9;
         byte var54 = 100;
         byte var55 = 0;
         C_47MO var56 = C_476q.field_48;
         double var108 = var107 * var56.method_44$75dd719903(var55, var54, var52) % 2;
         if (var3 > 0L) {
            var96 += var108;
            if (var15 != null) {
               break label128;
            }

            var108 = 0.0;
         }

         var96 = var96 == var108 ? -1.0 : 1.0;
      }

      label122: {
         long var109 = 4733662997714747164L;
         double var57 = var96;
         C_47K7 var59 = var2;
         var59.method_48$2c20cf5948(var57);
         var109 = 4723754947514369127L;
         C_47K7 var60 = var2;
         var97 = var60.method_48$fedcb3e4d3();
         long var120 = 4720096432829573776L;
         RangeSetting var61 = this.settingTPXZ;
         double var111 = var61.method_43$fedcb3e4d3();
         long var123 = 4736709855420191075L;
         long var62 = var9;
         byte var64 = 100;
         byte var65 = 0;
         C_47MO var66 = C_476q.field_48;
         double var112 = var111 * var66.method_44$75dd719903(var65, var64, var62) % 2.0;
         if (var1 >= 0) {
            var97 += var112;
            if (var15 != null) {
               break label122;
            }

            var112 = 0.0;
         }

         var97 = var97 == var112 ? -1.0 : 1.0;
      }

      label116: {
         long var113 = 4735702496283504918L;
         double var67 = var97;
         C_47K7 var69 = var2;
         var69.method_43$2c20cf5948(var67);
         var113 = 4726412869686075126L;
         C_47K7 var70 = var2;
         var98 = var70.method_40$fedcb3e4d3();
         long var121 = 4720096432829573776L;
         RangeSetting var71 = this.settingTPXZ;
         double var115 = var71.method_43$fedcb3e4d3();
         long var124 = 4736709855420191075L;
         long var72 = var9;
         byte var74 = 100;
         byte var75 = 0;
         C_47MO var76 = C_476q.field_48;
         double var116 = var115 * var76.method_44$75dd719903(var75, var74, var72) % 2.0;
         if (var3 > 0L) {
            var98 += var116;
            if (var15 != null) {
               break label116;
            }

            var116 = 0.0;
         }

         var98 = var98 == var116 ? -1.0 : 1.0;
      }

      long var117 = 4736198719337290145L;
      double var77 = var98;
      C_47K7 var79 = var2;
      var79.method_42$2c20cf5948(var77);
      long var99 = 4720096432829573776L;
      RangeSetting var80 = this.settingTPDelay;
      var80.method_43$fedcb3e4d3();
      long var100 = 4720096432829573776L;
      RangeSetting var81 = this.settingTPY;
      var81.method_43$fedcb3e4d3();
   }







   public void method_48$7421db9485(C_47ob var1, long var2) {
      net.C_473U var111;
      int[] var141;
      int[] var153;
      net.C_473U var123;
      int[] var161;
      int[] var173;
      augustus.recovered.modules.misc.Disabler_47kt var133;
      long var4 = var2 ^ 88550899502211L;
      long var6 = var2 ^ 121374282202777L;
      long var8 = var2 ^ 126700412707076L;
      long var10 = var2 ^ 72935358559700L;
      long var12 = var2 ^ 138747316010074L;
      long var10000 = 4152542672590177525L;
      int[] var14 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 4146800322798331023L;
      C_47ob var21 = var1;
      C_473U var15 = var21.method_46$96fcbedb66();
      long var10003 = 4145035902233622243L;
      C_473U var22 = var15;
      long var23 = var6;
      Disabler_47kt var25 = this;
      int var108 = (int) ((var25.method_41$659a89db6c(var23, var22)) ? 1 : 0);
      if (var14 == null) {
         if (var108 != 0) {
            var1.cancel();
         }

         var108 = (int) ((var15 instanceof C_45W) ? 1 : 0);
      }

      label421: {
         label420:
         if (var14 == null) {
            label427: {
               if (var108 != 0) {
                  C_45W var16 = (C_45W)var15;
                  var10000 = 4156967267522620513L;
                  C_47w7[] var17 = C_47w7.values();
                  int var18 = var17.length;
                  int var19 = 0;

                  while (var19 < var18) {
                     C_47w7 var20 = var17[var19];
                     int[] var110 = var14;
                     if (var2 > 0L) {
                        if (var14 == null) {
                           var111 = var16;
                           if (var14 != null) {
                              break label427;
                           }

                           C_40y var112 = var16.method_42$c4164528f2();
                           long var10002 = 4158613777397008964L;
                           C_47w7 var26 = var20;
                           label408:
                           if (var112 == C_47w7.method_44$a57c1dc00a(var26)) {
                              var10001 = 4147622131529457133L;
                              C_47w7 var27 = var20;
                              var108 = (int) ((C_47w7.method_41$dfdcb3fbc5(var27)) ? 1 : 0);
                              int[] var135 = var14;
                              if (var2 > 0L) {
                                 if (var14 == null) {
                                    if (var108 == 0) {
                                       break label408;
                                    }

                                    var10001 = 4146610777656211548L;
                                    C_47w7 var28 = var20;
                                    C_47w7.method_43$1bfd61204c(var28);
                                    var10001 = 4158897066694904875L;
                                    C_47w7 var29 = var20;
                                    ModeSetting var113 = C_47w7.method_42$161c423210(var29);
                                    var10002 = 4147397929074209001L;
                                    long var30 = var12;
                                    ModeSetting var32 = var113;
                                    var108 = (int) ((var32.method_46$5f9dc63072(var30).equals("Always")) ? 1 : 0);
                                 }

                                 var135 = var14;
                              }

                              label399: {
                                 label398:
                                 if (var135 == null) {
                                    label396:
                                    if (var108 == 0) {
                                       var10001 = 4158897066694904875L;
                                       C_47w7 var33 = var20;
                                       ModeSetting var114 = C_47w7.method_42$161c423210(var33);
                                       var10002 = 4147397929074209001L;
                                       long var34 = var12;
                                       ModeSetting var36 = var114;
                                       var108 = (int) ((var36.method_46$5f9dc63072(var34).equals("OnlyOnGround")) ? 1 : 0);
                                       int[] var139 = var14;
                                       if (var2 >= 0L) {
                                          if (var14 == null) {
                                             if (var108 != 0) {
                                                var10001 = 4158953846111499581L;
                                                Minecraft var37 = field_43;
                                                var108 = (int) ((var37.field_42P.field_48M) ? 1 : 0);
                                                var141 = var14;
                                                if (var2 < 0L) {
                                                   break label399;
                                                }

                                                if (var14 != null) {
                                                   break label398;
                                                }

                                                if (var37.field_42P.field_48M) {
                                                   break label396;
                                                }
                                             }

                                             var10001 = 4158897066694904875L;
                                             C_47w7 var38 = var20;
                                             ModeSetting var115 = C_47w7.method_42$161c423210(var38);
                                             var10002 = 4147397929074209001L;
                                             long var39 = var12;
                                             ModeSetting var41 = var115;
                                             var108 = (int) ((var41.method_46$5f9dc63072(var39).equals("OnlyInAir")) ? 1 : 0);
                                          }

                                          var139 = var14;
                                       }

                                       if (var139 != null) {
                                          break label420;
                                       }

                                       if (var108 == 0) {
                                          break;
                                       }

                                       var10001 = 4158953846111499581L;
                                       Minecraft var42 = field_43;
                                       var108 = (int) ((var42.field_42P.field_48M) ? 1 : 0);
                                       if (var14 != null) {
                                          break label420;
                                       }

                                       if (var42.field_42P.field_48M) {
                                          break;
                                       }
                                    }

                                    var10001 = 4160941920351759631L;
                                    C_47w7 var43 = var20;
                                    NumberSetting var116 = C_47w7.method_47$cff4bbfb81(var43);
                                    var10002 = 4159929319468421075L;
                                    long var44 = var10;
                                    NumberSetting var46 = var116;
                                    double var196;
                                    var108 = (var196 = var46.method_44$474dfaa627(var44) - 0.0) == 0.0 ? 0 : (var196 < 0.0 ? -1 : 1);
                                 }

                                 var141 = var14;
                              }

                              if (var2 > 0L) {
                                 if (var141 == null) {
                                    if (var108 > 0) {
                                       var10001 = 4159077717796446033L;
                                       C_47w7 var47 = var20;
                                       double var117 = C_47w7.method_49$1bfd61204c(var47);
                                       var10002 = 4160941920351759631L;
                                       C_47w7 var48 = var20;
                                       NumberSetting var146 = C_47w7.method_47$cff4bbfb81(var48);
                                       var10003 = 4159929319468421075L;
                                       long var49 = var10;
                                       NumberSetting var51 = var146;
                                       double var197;
                                       var108 = (var197 = var117 % var51.method_44$474dfaa627(var49) - 0.0) == 0.0 ? 0 : (var197 < 0.0 ? -1 : 1);
                                       if (var14 != null) {
                                          break label420;
                                       }

                                       if (var108 != 0) {
                                          break;
                                       }
                                    }

                                    var10001 = 4160675532626190634L;
                                    C_47w7 var52 = var20;
                                    BooleanSetting var118 = C_47w7.method_40$5e58535af9(var52);
                                    var10001 = 4147776617141367221L;
                                    BooleanSetting var53 = var118;
                                    var108 = (int) ((var53.method_49$aae029aa0a()) ? 1 : 0);
                                 }

                                 var141 = var14;
                              }

                              label433: {
                                 if (var2 >= 0L) {
                                    if (var141 == null) {
                                       if (var108 != 0) {
                                          break label433;
                                       }

                                       var10001 = 4158953846111499581L;
                                       Minecraft var54 = field_43;
                                       double var119 = var54.field_42P.field_48y;
                                       var10002 = 4152627767897234080L;
                                       C_47w7 var55 = var20;
                                       C_47TU var150 = C_47w7.method_41$baf765c7d0(var55);
                                       var10003 = 4145666013906362752L;
                                       long var56 = var8;
                                       C_47TU var58 = var150;
                                       double var198;
                                       var108 = (var198 = var119 - var58.method_41$474dfaa627(var56)) == 0.0 ? 0 : (var198 < 0.0 ? -1 : 1);
                                    }

                                    var141 = var14;
                                 }

                                 if (var141 != null) {
                                    break label420;
                                 }

                                 if (var108 <= 0) {
                                    break;
                                 }

                                 var10001 = 4158953846111499581L;
                                 Minecraft var59 = field_43;
                                 double var120 = var59.field_42P.field_48y;
                                 var10002 = 4152627767897234080L;
                                 C_47w7 var60 = var20;
                                 C_47TU var152 = C_47w7.method_41$baf765c7d0(var60);
                                 var10003 = 4159444641139979082L;
                                 long var61 = var4;
                                 C_47TU var63 = var152;
                                 double var199;
                                 var108 = (var199 = var120 - var63.method_43$474dfaa627(var61)) == 0.0 ? 0 : (var199 < 0.0 ? -1 : 1);
                                 var153 = var14;
                                 if (var2 <= 0L) {
                                    break label421;
                                 }

                                 if (var14 != null) {
                                    break label420;
                                 }

                                 if (var108 >= 0) {
                                    break;
                                 }
                              }

                              var1.cancel();
                              if (var14 == null) {
                                 break;
                              }
                           }

                           var19++;
                        }

                        var110 = var14;
                     }

                     if (var110 != null) {
                        break;
                     }
                  }
               }

               if (var2 < 0L) {
                  return;
               }

               var111 = var15;
            }

            var108 = (int) ((var111 instanceof C_45J) ? 1 : 0);
         }

         var153 = var14;
      }

      label332: {
         label434: {
            label330: {
               label329: {
                  label435: {
                     label327: {
                        label326:
                        if (var153 == null) {
                           if (var108 != 0) {
                              C_45J var103 = (C_45J)var15;
                              var10000 = 4145960655305459926L;
                              C_46k[] var104 = C_46k.values();
                              int var105 = var104.length;
                              int var106 = 0;

                              while (var106 < var105) {
                                 C_46k var107 = var104[var106];
                                 int[] var122 = var14;
                                 if (var2 > 0L) {
                                    if (var14 == null) {
                                       var123 = var103;
                                       if (var14 != null) {
                                          break label435;
                                       }

                                       C_40x var124 = var103.method_47$4de68953a2();
                                       long var182 = 4157806619474092392L;
                                       C_46k var64 = var107;
                                       label315:
                                       if (var124 == C_46k.method_43$be21597eaa(var64)) {
                                          var10001 = 4160821711901639917L;
                                          C_46k var65 = var107;
                                          var108 = (int) ((C_46k.method_45$94cafea692(var65)) ? 1 : 0);
                                          int[] var155 = var14;
                                          if (var2 >= 0L) {
                                             if (var14 == null) {
                                                if (var108 == 0) {
                                                   break label315;
                                                }

                                                var10001 = 4145262656144007307L;
                                                C_46k var66 = var107;
                                                C_46k.method_47$b83e49db07(var66);
                                                var10001 = 4146035046289108903L;
                                                C_46k var67 = var107;
                                                ModeSetting var125 = C_46k.method_43$e97b48599e(var67);
                                                var182 = 4147397929074209001L;
                                                long var68 = var12;
                                                ModeSetting var70 = var125;
                                                var108 = (int) ((var70.method_46$5f9dc63072(var68).equals("Always")) ? 1 : 0);
                                             }

                                             var155 = var14;
                                          }

                                          label306: {
                                             label305:
                                             if (var155 == null) {
                                                label303:
                                                if (var108 == 0) {
                                                   var10001 = 4146035046289108903L;
                                                   C_46k var71 = var107;
                                                   ModeSetting var126 = C_46k.method_43$e97b48599e(var71);
                                                   var182 = 4147397929074209001L;
                                                   long var72 = var12;
                                                   ModeSetting var74 = var126;
                                                   var108 = (int) ((var74.method_46$5f9dc63072(var72).equals("OnlyOnGround")) ? 1 : 0);
                                                   int[] var159 = var14;
                                                   if (var2 > 0L) {
                                                      if (var14 == null) {
                                                         if (var108 != 0) {
                                                            var10001 = 4158953846111499581L;
                                                            Minecraft var75 = field_43;
                                                            var108 = (int) ((var75.field_42P.field_48M) ? 1 : 0);
                                                            var161 = var14;
                                                            if (var2 < 0L) {
                                                               break label306;
                                                            }

                                                            if (var14 != null) {
                                                               break label305;
                                                            }

                                                            if (var75.field_42P.field_48M) {
                                                               break label303;
                                                            }
                                                         }

                                                         var10001 = 4146035046289108903L;
                                                         C_46k var76 = var107;
                                                         ModeSetting var127 = C_46k.method_43$e97b48599e(var76);
                                                         var182 = 4147397929074209001L;
                                                         long var77 = var12;
                                                         ModeSetting var79 = var127;
                                                         var108 = (int) ((var79.method_46$5f9dc63072(var77).equals("OnlyInAir")) ? 1 : 0);
                                                      }

                                                      var159 = var14;
                                                   }

                                                   if (var159 != null) {
                                                      break label326;
                                                   }

                                                   if (var108 == 0) {
                                                      break;
                                                   }

                                                   var10001 = 4158953846111499581L;
                                                   Minecraft var80 = field_43;
                                                   var108 = (int) ((var80.field_42P.field_48M) ? 1 : 0);
                                                   if (var14 != null) {
                                                      break label326;
                                                   }

                                                   if (var80.field_42P.field_48M) {
                                                      break;
                                                   }
                                                }

                                                var10001 = 4157063644514487073L;
                                                C_46k var81 = var107;
                                                NumberSetting var128 = C_46k.method_43$8154fdae0f(var81);
                                                var182 = 4159929319468421075L;
                                                long var82 = var10;
                                                NumberSetting var84 = var128;
                                                double var200;
                                                var108 = (var200 = var84.method_44$474dfaa627(var82) - 0.0) == 0.0 ? 0 : (var200 < 0.0 ? -1 : 1);
                                             }

                                             var161 = var14;
                                          }

                                          if (var2 >= 0L) {
                                             if (var161 == null) {
                                                if (var108 > 0) {
                                                   var10001 = 4158444244461259820L;
                                                   C_46k var85 = var107;
                                                   double var129 = C_46k.method_43$b83e49db07(var85);
                                                   var182 = 4157063644514487073L;
                                                   C_46k var86 = var107;
                                                   NumberSetting var166 = C_46k.method_43$8154fdae0f(var86);
                                                   var10003 = 4159929319468421075L;
                                                   long var87 = var10;
                                                   NumberSetting var89 = var166;
                                                   double var201;
                                                   var108 = (var201 = var129 % var89.method_44$474dfaa627(var87) - 0.0) == 0.0 ? 0 : (var201 < 0.0 ? -1 : 1);
                                                   if (var14 != null) {
                                                      break label326;
                                                   }

                                                   if (var108 != 0) {
                                                      break;
                                                   }
                                                }

                                                var10001 = 4145574285895488923L;
                                                C_46k var90 = var107;
                                                BooleanSetting var130 = C_46k.method_40$36b2ae01f2(var90);
                                                var10001 = 4147776617141367221L;
                                                BooleanSetting var91 = var130;
                                                var108 = (int) ((var91.method_49$aae029aa0a()) ? 1 : 0);
                                             }

                                             var161 = var14;
                                          }

                                          label442: {
                                             if (var2 >= 0L) {
                                                if (var161 == null) {
                                                   if (var108 != 0) {
                                                      break label442;
                                                   }

                                                   var10001 = 4158953846111499581L;
                                                   Minecraft var92 = field_43;
                                                   double var131 = var92.field_42P.field_48y;
                                                   var182 = 4145807187327125234L;
                                                   C_46k var93 = var107;
                                                   C_47TU var170 = C_46k.method_41$db2326e84f(var93);
                                                   var10003 = 4145666013906362752L;
                                                   long var94 = var8;
                                                   C_47TU var96 = var170;
                                                   double var202;
                                                   var108 = (var202 = var131 - var96.method_41$474dfaa627(var94)) == 0.0 ? 0 : (var202 < 0.0 ? -1 : 1);
                                                }

                                                var161 = var14;
                                             }

                                             if (var161 != null) {
                                                break label326;
                                             }

                                             if (var108 <= 0) {
                                                break;
                                             }

                                             var10001 = 4158953846111499581L;
                                             Minecraft var97 = field_43;
                                             double var132 = var97.field_42P.field_48y;
                                             var182 = 4145807187327125234L;
                                             C_46k var98 = var107;
                                             C_47TU var172 = C_46k.method_41$db2326e84f(var98);
                                             var10003 = 4159444641139979082L;
                                             long var99 = var4;
                                             C_47TU var101 = var172;
                                             double var203;
                                             var108 = (var203 = var132 - var101.method_43$474dfaa627(var99)) == 0.0 ? 0 : (var203 < 0.0 ? -1 : 1);
                                             var173 = var14;
                                             if (var2 <= 0L) {
                                                break label327;
                                             }

                                             if (var14 != null) {
                                                break label326;
                                             }

                                             if (var108 >= 0) {
                                                break;
                                             }
                                          }

                                          var1.cancel();
                                          if (var14 == null) {
                                             break;
                                          }
                                       }

                                       var106++;
                                    }

                                    var122 = var14;
                                 }

                                 if (var122 != null) {
                                    break;
                                 }
                              }
                           }

                           var133 = this;
                           if (var2 < 0L) {
                              break label434;
                           }

                           var10001 = 4147776617141367221L;
                           BooleanSetting var102 = this.settingMMCReachSemi;
                           var108 = (int) ((var102.method_49$aae029aa0a()) ? 1 : 0);
                        }

                        var173 = var14;
                     }

                     if (var2 <= 0L) {
                        break label330;
                     }

                     if (var173 != null) {
                        break label329;
                     }

                     if (var108 == 0) {
                        return;
                     }

                     var123 = var15;
                  }

                  var108 = (int) ((var123 instanceof C_47Al) ? 1 : 0);
               }

               var173 = var14;
            }

            if (var173 != null) {
               break label332;
            }

            if (var108 == 0) {
               return;
            }

            this.field_43y++;
            var133 = this;
         }

         var108 = var133.field_43y % 2;
      }

      if (var108 == 0) {
         var1.cancel();
      }
   }










   public boolean method_48$a5f00a2068(BooleanSetting var1, BooleanSetting var2, BooleanSetting var3, long var4, BooleanSetting var6) {
      boolean var13;
      var4 = a ^ var4;
      long var7 = var4 ^ 79569691318197L;
      long var9 = var4 ^ 61934383117458L;
      int[] var11 = recovery$indy$8(-7357586164910578511L, var4);
      if (recovery$indy$9(var1, -7364637692649319951L, var4)) {
         Minecraft var10000 = field_43;
         if (var11 == null) {
            if (recovery$indy$10(field_43, -7353318610901215879L, var4) == null) {
               return false;
            }

            var10000 = field_43;
         }

         if (recovery$indy$11(var10000, -7351973123240905669L, var4) != null) {
            int[] var10001;
            label91: {
               var13 = recovery$indy$12(var2, -7364637692649319951L, var4);
               label90:
               if (var11 == null) {
                  if (var13) {
                     var13 = this.field_43P;
                     var10001 = var11;
                     if (var4 < 0L) {
                        break label91;
                     }

                     if (var11 != null) {
                        break label90;
                     }

                     if (this.field_43P) {
                        return false;
                     }
                  }

                  var13 = recovery$indy$15(
                     recovery$indy$14(recovery$indy$13(-7352272421877819267L, var4), -7364135111144173970L, var4).field_46q, var7, -7354161071112406630L, var4
                  );
               }

               var10001 = var11;
            }

            label80: {
               label79:
               if (var10001 == null) {
                  if (var13) {
                     var13 = recovery$indy$16(var3, -7364637692649319951L, var4);
                     var10001 = var11;
                     if (var4 < 0L) {
                        break label80;
                     }

                     if (var11 != null) {
                        break label79;
                     }

                     if (var13) {
                        return false;
                     }
                  }

                  var13 = recovery$indy$17(var9, -7353606072508731297L, var4);
               }

               var10001 = var11;
            }

            if (var10001 != null) {
               return var13;
            }

            if (var13) {
               return true;
            }

            boolean var15 = recovery$indy$18(var6, -7364637692649319951L, var4);
            if (var11 != null) {
               return var15;
            }

            if (!var15) {
               return true;
            }
         }
      }

      return false;
   }



   private static void method_48$631790539f(C_473U var0) {
      long var1 = a ^ 108254587379970L;
      long var10001 = -6041435523572047710L;
      Minecraft var3 = field_43;
      var3.field_42P.field_49m.method_43$631790539f(var0);
   }



   private static boolean method_49$c6d513bd96(C_47BH var0) {
      long var1 = a ^ 96026262546020L;
      long var10000 = -1487895740785535476L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -1494084581161921885L;
      C_47BH var4 = var0;
      BooleanSetting var6 = C_47BH.method_46$39494fae91(var4);
      var10001 = -1479720686109121716L;
      BooleanSetting var5 = var6;
      boolean var7 = var5.method_49$aae029aa0a();
      if (var3 == null) {
         var7 = !var7;
      }

      return var7;
   }



   private static boolean method_49$94cafea692(C_46k var0) {
      long var1 = a ^ 135121239916102L;
      long var10000 = -901912872011149778L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -913384841489899712L;
      C_46k var4 = var0;
      BooleanSetting var6 = C_46k.method_40$36b2ae01f2(var4);
      var10001 = -912871376880256146L;
      BooleanSetting var5 = var6;
      boolean var7 = var5.method_49$aae029aa0a();
      if (var3 == null) {
         var7 = !var7;
      }

      return var7;
   }



   public void method_47$9035875d26(long var1, C_47ob var3) {
      int[] var4;
      C_473U var5;
      boolean var10000;
      int[] var10001;
      label115: {
         var4 = recovery$indy$19(2669949144536815704L, var1);
         var5 = recovery$indy$20(var3, 2675490000245930018L, var1);
         var10000 = recovery$indy$21(this.settingGrimSpec, 2675850443593870616L, var1);
         label114:
         if (var4 == null) {
            label112:
            if (var10000 && recovery$indy$22(field_43, 2673670787791219088L, var1) != null) {
               label118: {
                  label108: {
                     var10000 = var5 instanceof C_47xZ;
                     label107:
                     if (var4 == null) {
                        label105:
                        if (var10000) {
                           C_40Y var6 = recovery$indy$23(field_43, 2673670787791219088L, var1).field_45;
                           if (var4 == null) {
                              if (var6 == null) {
                                 break label105;
                              }

                              var6 = recovery$indy$24(field_43, 2673670787791219088L, var1).field_45;
                           }

                           var10000 = var6.field_40;
                           var10001 = var4;
                           if (var1 <= 0L) {
                              break label108;
                           }

                           if (var4 != null) {
                              break label107;
                           }

                           if (var6.field_40) {
                              break label118;
                           }
                        }

                        var10000 = recovery$indy$25(this.settingGrimSpecAlways, 2675850443593870616L, var1);
                     }

                     var10001 = var4;
                  }

                  if (var1 < 0L) {
                     break label115;
                  }

                  if (var10001 != null) {
                     break label114;
                  }

                  if (!var10000) {
                     break label112;
                  }
               }

               this.field_43v = true;
            }

            var10000 = var5 instanceof C_47qi;
         }

         var10001 = var4;
      }

      if (var1 > 0L) {
         if (var10001 == null) {
            if (!var10000) {
               return;
            }

            var10000 = this.field_43v;
         }

         var10001 = var4;
      }

      if (var1 >= 0L) {
         if (var10001 == null) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$26(this.settingGrimSpec, 2675850443593870616L, var1);
         }

         var10001 = var4;
      }

      if (var10001 == null && var10000) {
         var3.cancel();
         this.field_42.add(var5);
      }
   }




   public void onRender3D(long var1, float var3) {
      java.lang.Object var38;
      long var4 = var1 ^ 42449008297410L;
      long var6 = var1 ^ 124673033136291L;
      long var8 = var1 ^ 5676066728005L;
      long var10000 = 8133990885903093172L;
      int[] var10 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 8128622160710646004L;
      BooleanSetting var19 = this.settingPingSpoof;
      boolean var35 = var19.method_49$aae029aa0a();
      CopyOnWriteArrayList var40;
      if (var10 != null) {
         if (var35) {
            return;
         }

         this.field_49A.forEach(recovery$indy$27());
         var40 = this.field_49A;
      } else {
         if (var35) {
            CopyOnWriteArrayList var36 = this.field_49A;
            if (var10 == null) {
               if (this.field_49A.isEmpty()) {
                  return;
               }

               var36 = this.field_49A;
            }

            Iterator var11 = var36.iterator();
            C_47MO var37 = C_476q.field_48;
            long var10003 = 8127074643798075585L;
            long var20 = var8;
            C_47TU var22 = this.settingDelay;
            double var10002 = var22.method_41$474dfaa627(var20);
            long var10005 = 8140298997927229963L;
            long var23 = var4;
            C_47TU var25 = this.settingDelay;
            double var42 = var25.method_43$474dfaa627(var23);
            long var10004 = 8141741660732782135L;
            double var26 = var42;
            double var28 = var10002;
            long var30 = var6;
            C_47MO var32 = var37;
            long var12 = var32.method_42$ed6856da15(var30, var28, var26);
            long var14 = System.currentTimeMillis();

            label86:
            while (true) {
               if (var11.hasNext()) {
                  var38 = var11.next();
               } else {
                  var38 = var10;
                  if (var1 >= 0L) {
                     break;
                  }
               }

               while (true) {
                  C_473U var16 = (C_473U)var38;

                  try {
                     label97: {
                        long var17 = (Long)this.field_49.get(var16);
                        int[] var39 = var10;
                        if (var1 > 0L) {
                           if (var10 != null) {
                              return;
                           }

                           var39 = var10;
                        }

                        if (var39 == null) {
                           if (var17 + var12 >= var14) {
                              break label97;
                           }

                           var10001 = 8139944541246405756L;
                           Minecraft var33 = field_43;
                           var33.field_42P.field_49m.method_43$631790539f(var16);
                           this.field_49.remove(var16);
                        }

                        var11.remove();
                     }
                  } catch (Exception var34) {
                  }

                  if (var10 == null) {
                     break;
                  }

                  var38 = var10;
                  if (var1 >= 0L) {
                     break label86;
                  }
               }
            }

            if (var38 == null) {
               return;
            }
         }

         var40 = this.field_49A;
         if (var10 == null) {
            if (this.field_49A.isEmpty()) {
               return;
            }

            this.field_49A.forEach(recovery$indy$27());
            var40 = this.field_49A;
         }
      }

      var40.clear();
   }




   private static boolean method_43$94cafea692(C_46k var0) {
      long var1 = a ^ 75946415385808L;
      long var10001 = 2446301434387586208L;
      C_46k var3 = var0;
      return C_46k.method_45$94cafea692(var3);
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$28(this, 43, var3, -7108834916360480566L, var1);
      recovery$indy$29(this, 32, var3, -7108834916360480566L, var1);
      recovery$indy$30(this, 26, var3, -7108834916360480566L, var1);
      recovery$indy$31(this, 40, var3, -7108834916360480566L, var1);
      recovery$indy$32(this, 18, var3, -7108834916360480566L, var1);
      recovery$indy$33(this, 7, var3, -7108834916360480566L, var1);
      recovery$indy$34(this, 39, var3, -7108834916360480566L, var1);
      recovery$indy$35(this, 25, var3, -7108834916360480566L, var1);
   }



   public void method_45q$e45a9973e5(long var1) {
      augustus.recovered.modules.misc.Disabler_47kt var43;
      long var3 = var1 ^ 7553760947098L;
      long var10000 = 4561447606260498968L;
      int[] var5 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 4567374853362218840L;
      BooleanSetting var7 = this.settingRoyalPixels;
      boolean var41 = var7.method_49$aae029aa0a();
      if (var5 == null) {
         if (var41) {
            C_47y var6 = new C_47y();
            var6.method_42$f633c984d8(true);
            var6.method_41$f633c984d8(true);
            var10001 = 4565204840827679696L;
            Minecraft var8 = field_43;
            var8.field_42P.field_49m.method_45$631790539f(var6);
         }

         long var10006 = 4563802086459632967L;
         BooleanSetting var9 = this.settingOnlyWhileMove1;
         long var10 = var3;
         BooleanSetting var12 = this.settingNotWhileScaffold1;
         BooleanSetting var13 = this.settingNotWhileAttack1;
         BooleanSetting var14 = this.settingPlace1;
         Disabler_47kt var15 = this;
         var41 = var15.method_48$a5f00a2068(var14, var13, var12, var10, var9);
      }

      int[] var45 = var5;
      if (var1 >= 0L) {
         if (var5 == null) {
            if (var41) {
               var10001 = 4565204840827679696L;
               Minecraft var16 = field_43;
               var16.field_42P.field_49m.method_43$631790539f(new C_42V(new C_478Q(-1, -1, -1), 255, new C_47rf(C_42R.field_457), 0.0F, 0.5F, 0.0F));
               var10001 = 4565204840827679696L;
               Minecraft var17 = field_43;
               C_47K6 var42 = var17.field_42P.field_49m;
               long var52 = 4565204840827679696L;
               Minecraft var18 = field_43;
               long var10007 = 4565204840827679696L;
               Minecraft var19 = field_43;
               double var53 = var19.field_42P.field_48j - 1.5;
               long var10008 = 4565204840827679696L;
               Minecraft var20 = field_43;
               C_478Q var10003 = new C_478Q(var18.field_42P.field_48Q, var53, var20.field_42P.field_42o);
               long var10009 = 4562592097384403602L;
               Minecraft var21 = field_43;
               var42.method_43$631790539f(
                  new C_42V(var10003, 1, new C_47rf(C_45z.field_41A.method_41$46086bc101(var21.field_44Q, new C_478Q(-1, -1, -1))), 0.0F, 0.94F, 0.0F)
               );
            }

            long var54 = 4563802086459632967L;
            BooleanSetting var22 = this.settingOnlyWhileMove2;
            long var23 = var3;
            BooleanSetting var25 = this.settingNotWhileScaffold2;
            BooleanSetting var26 = this.settingNotWhileAttack2;
            BooleanSetting var27 = this.settingPlace2;
            Disabler_47kt var28 = this;
            var41 = var28.method_48$a5f00a2068(var27, var26, var25, var23, var22);
         }

         var45 = var5;
      }

      if (var1 >= 0L) {
         if (var45 == null) {
            if (var41) {
               var10001 = 4565204840827679696L;
               Minecraft var29 = field_43;
               long var10004 = 4565204840827679696L;
               Minecraft var30 = field_43;
               var29.field_42P.field_49m.method_43$631790539f(new C_42V(var30.field_42P.method_41$ac4db64966()));
            }

            long var55 = 4563802086459632967L;
            BooleanSetting var31 = this.settingOnlyWhileMove3;
            long var32 = var3;
            BooleanSetting var34 = this.settingNotWhileScaffold3;
            BooleanSetting var35 = this.settingNotWhileAttack3;
            BooleanSetting var36 = this.settingPlace3;
            Disabler_47kt var37 = this;
            var41 = var37.method_48$a5f00a2068(var36, var35, var34, var32, var31);
         }

         var45 = var5;
      }

      label67: {
         if (var45 == null) {
            if (var41) {
               var10001 = 4565204840827679696L;
               Minecraft var38 = field_43;
               var38.field_42P.field_49m.method_43$631790539f(new C_42V(new C_478Q(-1, -1, -1), 255, new C_47rf(C_42R.field_457), 0.0F, 0.5F, 0.0F));
            }

            var43 = this;
            if (var5 != null) {
               break label67;
            }

            var10001 = 4567374853362218840L;
            BooleanSetting var39 = this.settingResourcePack;
            var41 = var39.method_49$aae029aa0a();
         }

         if (var41) {
            var10001 = 4565204840827679696L;
            Minecraft var40 = field_43;
            var40.field_42P.field_49m.method_43$631790539f(new C_47Md("", C_478j.ACCEPTED));
         }

         var43 = this;
      }

      var43.field_43P = false;
   }






   public void method_43y$e45a9973e5(long var1) {
      augustus.recovered.modules.misc.Disabler_47kt var20;
      java.util.concurrent.CopyOnWriteArrayList var21;
      int[] var3;
      boolean var18;
      long var10000 = -7740379265447810623L;
      var3 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -7729389424430195583L;
      BooleanSetting var7 = this.settingPingSpoof;
      var18 = var7.method_49$aae029aa0a();
      label148:
      if (var3 == null) {
         label146: {
            label145: {
               label151: {
                  label143:
                  if (var18) {
                     Minecraft var19 = field_43;
                     if (var3 == null) {
                        var10001 = -7745065587332294647L;
                        Minecraft var8 = field_43;
                        if (var8.field_42P == null) {
                           break label143;
                        }

                        var19 = field_43;
                     }

                     var10001 = -7743738170746619573L;
                     Minecraft var9 = var19;
                     if (var9.field_44Q != null) {
                        var18 = this.field_49A.isEmpty();
                        if (var3 != null) {
                           break label148;
                        }

                        if (!var18) {
                           Iterator var4 = this.field_49A.iterator();

                           while (var4.hasNext()) {
                              C_473U var5 = (C_473U)var4.next();

                              label130: {
                                 try {
                                    var10001 = -7745065587332294647L;
                                    Minecraft var10 = field_43;
                                    var10.field_42P.field_49m.method_43$631790539f(var5);
                                    var4.remove();
                                    var20 = this;
                                    if (var1 < 0L) {
                                       break label145;
                                    }

                                    this.field_49.remove(var5);
                                 } catch (Exception var17) {
                                    break label130;
                                 }

                                 if (var3 != null) {
                                    break label151;
                                 }
                              }

                              if (var3 != null) {
                                 break;
                              }
                           }
                        }
                     }
                  }

                  var21 = this.field_49A;
                  if (var1 <= 0L) {
                     break label146;
                  }

                  this.field_49A.clear();
               }

               var20 = this;
            }

            var21 = var20.field_42;
         }

         var18 = var21.isEmpty();
      }

      if (!var18) {
         Minecraft var22 = field_43;
         int[] var28 = var3;
         if (var1 > 0L) {
            if (var3 == null) {
               var10001 = -7745065587332294647L;
               Minecraft var11 = field_43;
               if (var11.field_42P == null) {
                  return;
               }

               var22 = field_43;
            }

            var28 = var3;
         }

         if (var28 == null) {
            var10001 = -7743738170746619573L;
            Minecraft var12 = var22;
            if (var12.field_44Q == null) {
               return;
            }

            var22 = field_43;
         }

         var10001 = -7745065587332294647L;
         Minecraft var13 = var22;
         C_47K6 var23 = var13.field_42P.field_49m;
         int[] var32 = var3;
         if (var1 > 0L) {
            if (var3 == null) {
               if (var13.field_42P.field_49m == null) {
                  return;
               }

               var10001 = -7742245175944618903L;
               Minecraft var14 = field_43;
               var23 = var14.method_40$f8db5d9e73();
            }

            var32 = var3;
         }

         if (var32 == null) {
            if (var23 == null) {
               return;
            }

            var10001 = -7742245175944618903L;
            Minecraft var15 = field_43;
            var23 = var15.method_40$f8db5d9e73();
         }

         C_47ri var24 = var23.method_49$431840b606();
         if (var3 == null) {
            if (var24 == null) {
               return;
            }

            var10001 = -7742245175944618903L;
            Minecraft var16 = field_43;
            var24 = var16.method_40$f8db5d9e73().method_49$431840b606();
         }

         if (var24.method_45$43d93f0756() != null) {
            this.field_42.forEach(recovery$indy$36());
            this.field_42.clear();
         }
      }
   }




   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      this.field_49A.clear();
      this.field_49.clear();
      recovery$indy$37(this.settingTPDelay, 2734891383142698725L, var4);
      recovery$indy$38(this.settingTPY, 2734891383142698725L, var4);
      recovery$indy$39(this.settingTPXZ, 2734891383142698725L, var4);
      recovery$indy$40(this.field_49w, 2723571164843386286L, var4);
      this.field_43v = false;
   }



    public Disabler_47kt(char a0,int a1,char a2) {
        super((java.lang.String) ("Disabler"),(java.lang.String) ("Deaktivierer"),(long) (((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 57017608499994L)),(java.awt.Color) (new java.awt.Color((int) (73),(int) (127),(int) (163))),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = (((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a);
        long constructorKey2 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 82662772521532L);
        long constructorKey3 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 105031571649097L);
        long constructorKey4 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 131319514553339L);
        long constructorKey5 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 78712149817748L);
        long constructorKey6 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 134767838960359L);
        long constructorKey7 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 80639083761012L);
        long constructorKey8 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 73667042750209L);
        long constructorKey9 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 57107623242620L);
        long constructorKey10 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 39682464328126L);
        long constructorKey11 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 2365101932268L);
        int constructorPart12 = (int) ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 94109684551554L) >>> 32));
        int constructorPart13 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 94109684551554L) << 32) >>> 48));
        int constructorPart14 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 94109684551554L) << 48) >>> 48));
        int constructorPart15 = (int) ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 58077224243696L) >>> 48));
        int constructorPart16 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 58077224243696L) << 16) >>> 48));
        int constructorPart17 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 58077224243696L) << 32) >>> 32));
        long constructorKey18 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 111983493550235L);
        int constructorPart19 = (int) ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 76686607554849L) >>> 32));
        int constructorPart20 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 76686607554849L) << 32) >>> 48));
        int constructorPart21 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 76686607554849L) << 48) >>> 48));
        long constructorKey22 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 128821665024944L);
        long constructorKey23 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 130871341694883L);
        int constructorPart24 = (int) ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 126425722301629L) >>> 32));
        int constructorPart25 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 126425722301629L) << 32) >>> 48));
        int constructorPart26 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 126425722301629L) << 48) >>> 48));
        long constructorKey27 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 54903539561045L);
        long constructorKey28 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 48342551411210L);
        int constructorPart29 = (int) ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 90755351914919L) >>> 32));
        long constructorKey30 = ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 90755351914919L) << 32) >>> 32);
        long constructorKey31 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 126552956985727L);
        long constructorKey32 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 132419800007639L);
        int constructorPart33 = (int) ((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 92413505302188L) >>> 32));
        int constructorPart34 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 92413505302188L) << 32) >>> 48));
        int constructorPart35 = (int) (((((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 92413505302188L) << 48) >>> 48));
        long constructorKey36 = ((((((long) (a0) << 48) | (((long) (a1) << 32) >>> 16)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.misc.Disabler_47kt.a) ^ 122766316933254L);
        client.setting.SettingGroup initialized37 = new client.setting.SettingGroup(this, "CustomPacketCanceling", constructorKey28);
        recovery$indy$flow$976(this, initialized37);
        java.lang.Object initialValue38 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingCustomPacketCanceling));
        client.setting.SettingGroup initialized39 = new client.setting.SettingGroup(constructorKey9, this, "IncomingPackets", (client.setting.SettingGroup) (initialValue38));
        recovery$indy$flow$980(this, initialized39);
        java.lang.Object initialValue40 = recovery$indy$flow$982();
        java.lang.Object initialValue41 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingIncomingPackets));
        net.C_47Tt initialized42 = new net.C_47Tt(this, this, constructorKey31, "IncomingPacketsToCancel", (net.C_47OZ[]) (initialValue40), (client.setting.SettingGroup) (initialValue41));
        recovery$indy$flow$985(this, initialized42);
        java.lang.Object initialValue43 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingCustomPacketCanceling));
        client.setting.SettingGroup initialized44 = new client.setting.SettingGroup(constructorKey9, this, "OutgoingPackets", (client.setting.SettingGroup) (initialValue43));
        recovery$indy$flow$989(this, initialized44);
        java.lang.Object initialValue45 = recovery$indy$flow$991();
        java.lang.Object initialValue46 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingOutgoingPackets));
        net.C_47Tv initialized47 = new net.C_47Tv(constructorPart19, this, this, "OutGoingPacketsToCancel", constructorPart20, constructorPart21, (net.C_47OZ[]) (initialValue45), (client.setting.SettingGroup) (initialValue46));
        recovery$indy$flow$994(this, initialized47);
        java.lang.Object initialValue48 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingCustomPacketCanceling));
        client.setting.SettingGroup initialized49 = new client.setting.SettingGroup(constructorKey9, this, "DetailedPackets", (client.setting.SettingGroup) (initialValue48));
        recovery$indy$flow$998(this, initialized49);
        java.lang.Object initialValue50 = recovery$indy$flow$1000();
        java.lang.Object initialValue51 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingDetailedPackets));
        client.setting.MultiSelectSetting initialized52 = new client.setting.MultiSelectSetting(this, "EntityActionsToCancel", constructorKey18, (net.C_47OZ[]) (initialValue50), (client.setting.SettingGroup) (initialValue51));
        recovery$indy$flow$1003(this, initialized52);
        java.lang.Object initialValue53 = recovery$indy$flow$1005();
        java.lang.Object initialValue54 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingDetailedPackets));
        client.setting.MultiSelectSetting initialized55 = new client.setting.MultiSelectSetting(this, "DiggingPacket", constructorKey18, (net.C_47OZ[]) (initialValue53), (client.setting.SettingGroup) (initialValue54));
        recovery$indy$flow$1008(this, initialized55);
        client.setting.BooleanSetting initialized56 = new client.setting.BooleanSetting(this, constructorKey8, "PingSpoof", false);
        recovery$indy$flow$1011(this, initialized56);
        java.lang.Object initialValue57 = recovery$indy$flow$1013();
        client.setting.MultiSelectSetting initialized58 = new client.setting.MultiSelectSetting(this, "PingSpoofPackets", constructorKey11, (net.C_47OZ[]) (initialValue57));
        java.lang.Object initialValue59 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPingSpoof));
        java.lang.Object initialValue60 = recovery$indy$flow$1016(initialValue59);
        java.lang.Object initialValue61 = recovery$indy$flow$1017(initialValue59);
        java.lang.Object initialValue62 = initialValue61;
        client.setting.MultiSelectSetting initialValue63 = initialized58;
        java.lang.Object initialValue64 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue63))))));
        java.lang.Object initialValue65 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue62))))));
        java.lang.Object initialValue66 = recovery$indy$flow$1020(initialValue64, initialValue65);
        recovery$indy$flow$1021(this, initialValue66);
        java.lang.Object initialValue67 = recovery$indy$flow$1022();
        net.C_47TU initialized68 = new net.C_47TU(constructorKey5, this, "Delay", Double.longBitsToDouble(4652007308841189376L), Double.longBitsToDouble(4654311885213007872L), 1.0D, Double.longBitsToDouble(4666723172467343360L), 0);
        java.lang.Object initialValue69 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPingSpoof));
        java.lang.Object initialValue70 = recovery$indy$flow$1026(initialValue69);
        java.lang.Object initialValue71 = recovery$indy$flow$1027(initialValue69);
        long initialValue72 = constructorKey3;
        java.lang.Object initialValue73 = initialValue71;
        net.C_47TU initialValue74 = initialized68;
        java.lang.Object initialValue75 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue76 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue73))))));
        java.lang.Object initialValue77 = recovery$indy$flow$1030(initialValue75, initialValue76, initialValue72);
        recovery$indy$flow$1031(this, initialValue77);
        client.setting.SettingGroup initialized78 = new client.setting.SettingGroup(this, "Place", constructorKey28);
        recovery$indy$flow$1034(this, initialized78);
        short converted79 = (short) (constructorPart15);
        char converted80 = (char) (constructorPart16);
        java.lang.Object initialValue81 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace));
        client.setting.BooleanSetting initialized82 = new client.setting.BooleanSetting(this, "Place1", converted79, converted80, constructorPart17, false, (client.setting.SettingGroup) (initialValue81));
        recovery$indy$flow$1038(this, initialized82);
        short converted83 = (short) (constructorPart15);
        char converted84 = (char) (constructorPart16);
        java.lang.Object initialValue85 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace));
        client.setting.BooleanSetting initialized86 = new client.setting.BooleanSetting(this, "NotWhileAttack1", converted83, converted84, constructorPart17, true, (client.setting.SettingGroup) (initialValue85));
        long initialValue87 = constructorKey7;
        java.lang.String initialValue88 = "NotWhileAttack";
        client.setting.BooleanSetting initialValue89 = initialized86;
        java.lang.Object initialValue90 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue89))))));
        java.lang.Object initialValue91 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue88))))));
        java.lang.Object initialValue92 = recovery$indy$flow$1044(initialValue90, initialValue91, initialValue87);
        java.lang.Object initialValue93 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue92))))));
        java.lang.Object initialValue94 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace1));
        java.lang.Object initialValue95 = recovery$indy$flow$1047(initialValue94);
        java.lang.Object initialValue96 = recovery$indy$flow$1048(initialValue94);
        java.lang.Object initialValue97 = initialValue96;
        long initialValue98 = constructorKey2;
        java.lang.Object initialValue99 = initialValue93;
        java.lang.Object initialValue100 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue99))))));
        java.lang.Object initialValue101 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue97))))));
        java.lang.Object initialValue102 = recovery$indy$flow$1051(initialValue100, initialValue98, initialValue101);
        java.lang.Object initialValue103 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue102))))));
        recovery$indy$flow$1053(this, initialValue103);
        short converted104 = (short) (constructorPart15);
        char converted105 = (char) (constructorPart16);
        java.lang.Object initialValue106 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace));
        client.setting.BooleanSetting initialized107 = new client.setting.BooleanSetting(this, "NotWhileScaffold1", converted104, converted105, constructorPart17, true, (client.setting.SettingGroup) (initialValue106));
        long initialValue108 = constructorKey7;
        java.lang.String initialValue109 = "NotWhileScaffold";
        client.setting.BooleanSetting initialValue110 = initialized107;
        java.lang.Object initialValue111 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue110))))));
        java.lang.Object initialValue112 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue109))))));
        java.lang.Object initialValue113 = recovery$indy$flow$1059(initialValue111, initialValue112, initialValue108);
        java.lang.Object initialValue114 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue113))))));
        java.lang.Object initialValue115 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace1));
        java.lang.Object initialValue116 = recovery$indy$flow$1062(initialValue115);
        java.lang.Object initialValue117 = recovery$indy$flow$1063(initialValue115);
        java.lang.Object initialValue118 = initialValue117;
        long initialValue119 = constructorKey2;
        java.lang.Object initialValue120 = initialValue114;
        java.lang.Object initialValue121 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue120))))));
        java.lang.Object initialValue122 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue118))))));
        java.lang.Object initialValue123 = recovery$indy$flow$1066(initialValue121, initialValue119, initialValue122);
        java.lang.Object initialValue124 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue123))))));
        recovery$indy$flow$1068(this, initialValue124);
        short converted125 = (short) (constructorPart15);
        char converted126 = (char) (constructorPart16);
        java.lang.Object initialValue127 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace));
        client.setting.BooleanSetting initialized128 = new client.setting.BooleanSetting(this, "OnlyWhileMove1", converted125, converted126, constructorPart17, true, (client.setting.SettingGroup) (initialValue127));
        long initialValue129 = constructorKey7;
        java.lang.String initialValue130 = "OnlyWhileMove";
        client.setting.BooleanSetting initialValue131 = initialized128;
        java.lang.Object initialValue132 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue131))))));
        java.lang.Object initialValue133 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue130))))));
        java.lang.Object initialValue134 = recovery$indy$flow$1074(initialValue132, initialValue133, initialValue129);
        java.lang.Object initialValue135 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue134))))));
        java.lang.Object initialValue136 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace1));
        java.lang.Object initialValue137 = recovery$indy$flow$1077(initialValue136);
        java.lang.Object initialValue138 = recovery$indy$flow$1078(initialValue136);
        java.lang.Object initialValue139 = initialValue138;
        long initialValue140 = constructorKey2;
        java.lang.Object initialValue141 = initialValue135;
        java.lang.Object initialValue142 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue141))))));
        java.lang.Object initialValue143 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue139))))));
        java.lang.Object initialValue144 = recovery$indy$flow$1081(initialValue142, initialValue140, initialValue143);
        java.lang.Object initialValue145 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue144))))));
        recovery$indy$flow$1083(this, initialValue145);
        java.lang.Object initialValue146 = initialValue67;
        short converted147 = (short) (constructorPart15);
        char converted148 = (char) (constructorPart16);
        java.lang.Object initialValue149 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace));
        client.setting.BooleanSetting initialized150 = new client.setting.BooleanSetting(this, "Place2", converted147, converted148, constructorPart17, false, (client.setting.SettingGroup) (initialValue149));
        recovery$indy$flow$1087(this, initialized150);
        short converted151 = (short) (constructorPart15);
        char converted152 = (char) (constructorPart16);
        java.lang.Object initialValue153 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace));
        client.setting.BooleanSetting initialized154 = new client.setting.BooleanSetting(this, "NotWhileAttack2", converted151, converted152, constructorPart17, true, (client.setting.SettingGroup) (initialValue153));
        long initialValue155 = constructorKey7;
        java.lang.String initialValue156 = "NotWhileAttack";
        client.setting.BooleanSetting initialValue157 = initialized154;
        java.lang.Object initialValue158 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue157))))));
        java.lang.Object initialValue159 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue156))))));
        java.lang.Object initialValue160 = recovery$indy$flow$1093(initialValue158, initialValue159, initialValue155);
        java.lang.Object initialValue161 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue160))))));
        java.lang.Object initialValue162 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace2));
        java.lang.Object initialValue163 = recovery$indy$flow$1096(initialValue162);
        java.lang.Object initialValue164 = recovery$indy$flow$1097(initialValue162);
        java.lang.Object initialValue165 = initialValue164;
        long initialValue166 = constructorKey2;
        java.lang.Object initialValue167 = initialValue161;
        java.lang.Object initialValue168 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue167))))));
        java.lang.Object initialValue169 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue165))))));
        java.lang.Object initialValue170 = recovery$indy$flow$1100(initialValue168, initialValue166, initialValue169);
        java.lang.Object initialValue171 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue170))))));
        recovery$indy$flow$1102(this, initialValue171);
        short converted172 = (short) (constructorPart15);
        char converted173 = (char) (constructorPart16);
        java.lang.Object initialValue174 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace));
        client.setting.BooleanSetting initialized175 = new client.setting.BooleanSetting(this, "NotWhileScaffold2", converted172, converted173, constructorPart17, true, (client.setting.SettingGroup) (initialValue174));
        long initialValue176 = constructorKey7;
        java.lang.String initialValue177 = "NotWhileScaffold";
        client.setting.BooleanSetting initialValue178 = initialized175;
        java.lang.Object initialValue179 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue178))))));
        java.lang.Object initialValue180 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue177))))));
        java.lang.Object initialValue181 = recovery$indy$flow$1108(initialValue179, initialValue180, initialValue176);
        java.lang.Object initialValue182 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue181))))));
        java.lang.Object initialValue183 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace2));
        java.lang.Object initialValue184 = recovery$indy$flow$1111(initialValue183);
        java.lang.Object initialValue185 = recovery$indy$flow$1112(initialValue183);
        java.lang.Object initialValue186 = initialValue185;
        long initialValue187 = constructorKey2;
        java.lang.Object initialValue188 = initialValue182;
        java.lang.Object initialValue189 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue188))))));
        java.lang.Object initialValue190 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue186))))));
        java.lang.Object initialValue191 = recovery$indy$flow$1115(initialValue189, initialValue187, initialValue190);
        java.lang.Object initialValue192 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue191))))));
        recovery$indy$flow$1117(this, initialValue192);
        short converted193 = (short) (constructorPart15);
        char converted194 = (char) (constructorPart16);
        java.lang.Object initialValue195 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace));
        client.setting.BooleanSetting initialized196 = new client.setting.BooleanSetting(this, "OnlyWhileMove2", converted193, converted194, constructorPart17, true, (client.setting.SettingGroup) (initialValue195));
        long initialValue197 = constructorKey7;
        java.lang.String initialValue198 = "OnlyWhileMove";
        client.setting.BooleanSetting initialValue199 = initialized196;
        java.lang.Object initialValue200 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue199))))));
        java.lang.Object initialValue201 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue198))))));
        java.lang.Object initialValue202 = recovery$indy$flow$1123(initialValue200, initialValue201, initialValue197);
        java.lang.Object initialValue203 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue202))))));
        java.lang.Object initialValue204 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace2));
        java.lang.Object initialValue205 = recovery$indy$flow$1126(initialValue204);
        java.lang.Object initialValue206 = recovery$indy$flow$1127(initialValue204);
        java.lang.Object initialValue207 = initialValue206;
        long initialValue208 = constructorKey2;
        java.lang.Object initialValue209 = initialValue203;
        java.lang.Object initialValue210 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue209))))));
        java.lang.Object initialValue211 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue207))))));
        java.lang.Object initialValue212 = recovery$indy$flow$1130(initialValue210, initialValue208, initialValue211);
        java.lang.Object initialValue213 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue212))))));
        recovery$indy$flow$1132(this, initialValue213);
        short converted214 = (short) (constructorPart15);
        char converted215 = (char) (constructorPart16);
        java.lang.Object initialValue216 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace));
        client.setting.BooleanSetting initialized217 = new client.setting.BooleanSetting(this, "Place3", converted214, converted215, constructorPart17, false, (client.setting.SettingGroup) (initialValue216));
        recovery$indy$flow$1136(this, initialized217);
        short converted218 = (short) (constructorPart15);
        char converted219 = (char) (constructorPart16);
        java.lang.Object initialValue220 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace));
        client.setting.BooleanSetting initialized221 = new client.setting.BooleanSetting(this, "NotWhileAttack3", converted218, converted219, constructorPart17, true, (client.setting.SettingGroup) (initialValue220));
        long initialValue222 = constructorKey7;
        java.lang.String initialValue223 = "NotWhileAttack";
        client.setting.BooleanSetting initialValue224 = initialized221;
        java.lang.Object initialValue225 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue224))))));
        java.lang.Object initialValue226 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue223))))));
        java.lang.Object initialValue227 = recovery$indy$flow$1142(initialValue225, initialValue226, initialValue222);
        java.lang.Object initialValue228 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue227))))));
        java.lang.Object initialValue229 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace3));
        java.lang.Object initialValue230 = recovery$indy$flow$1145(initialValue229);
        java.lang.Object initialValue231 = recovery$indy$flow$1146(initialValue229);
        java.lang.Object initialValue232 = initialValue231;
        long initialValue233 = constructorKey2;
        java.lang.Object initialValue234 = initialValue228;
        java.lang.Object initialValue235 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue234))))));
        java.lang.Object initialValue236 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue232))))));
        java.lang.Object initialValue237 = recovery$indy$flow$1149(initialValue235, initialValue233, initialValue236);
        java.lang.Object initialValue238 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue237))))));
        recovery$indy$flow$1151(this, initialValue238);
        short converted239 = (short) (constructorPart15);
        char converted240 = (char) (constructorPart16);
        java.lang.Object initialValue241 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace));
        client.setting.BooleanSetting initialized242 = new client.setting.BooleanSetting(this, "NotWhileScaffold3", converted239, converted240, constructorPart17, true, (client.setting.SettingGroup) (initialValue241));
        long initialValue243 = constructorKey7;
        java.lang.String initialValue244 = "NotWhileScaffold";
        client.setting.BooleanSetting initialValue245 = initialized242;
        java.lang.Object initialValue246 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue245))))));
        java.lang.Object initialValue247 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue244))))));
        java.lang.Object initialValue248 = recovery$indy$flow$1157(initialValue246, initialValue247, initialValue243);
        java.lang.Object initialValue249 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue248))))));
        java.lang.Object initialValue250 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace3));
        java.lang.Object initialValue251 = recovery$indy$flow$1160(initialValue250);
        java.lang.Object initialValue252 = recovery$indy$flow$1161(initialValue250);
        java.lang.Object initialValue253 = initialValue252;
        long initialValue254 = constructorKey2;
        java.lang.Object initialValue255 = initialValue249;
        java.lang.Object initialValue256 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue255))))));
        java.lang.Object initialValue257 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue253))))));
        java.lang.Object initialValue258 = recovery$indy$flow$1164(initialValue256, initialValue254, initialValue257);
        java.lang.Object initialValue259 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue258))))));
        recovery$indy$flow$1166(this, initialValue259);
        short converted260 = (short) (constructorPart15);
        char converted261 = (char) (constructorPart16);
        java.lang.Object initialValue262 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace));
        client.setting.BooleanSetting initialized263 = new client.setting.BooleanSetting(this, "OnlyWhileMove3", converted260, converted261, constructorPart17, true, (client.setting.SettingGroup) (initialValue262));
        long initialValue264 = constructorKey7;
        java.lang.String initialValue265 = "OnlyWhileMove";
        client.setting.BooleanSetting initialValue266 = initialized263;
        java.lang.Object initialValue267 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue266))))));
        java.lang.Object initialValue268 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue265))))));
        java.lang.Object initialValue269 = recovery$indy$flow$1172(initialValue267, initialValue268, initialValue264);
        java.lang.Object initialValue270 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue269))))));
        java.lang.Object initialValue271 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingPlace3));
        java.lang.Object initialValue272 = recovery$indy$flow$1175(initialValue271);
        java.lang.Object initialValue273 = recovery$indy$flow$1176(initialValue271);
        java.lang.Object initialValue274 = initialValue273;
        long initialValue275 = constructorKey2;
        java.lang.Object initialValue276 = initialValue270;
        java.lang.Object initialValue277 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue276))))));
        java.lang.Object initialValue278 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue274))))));
        java.lang.Object initialValue279 = recovery$indy$flow$1179(initialValue277, initialValue275, initialValue278);
        java.lang.Object initialValue280 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue279))))));
        recovery$indy$flow$1181(this, initialValue280);
        client.setting.BooleanSetting initialized281 = new client.setting.BooleanSetting(this, constructorKey8, "RoyalPixels", false);
        recovery$indy$flow$1184(this, initialized281);
        client.setting.BooleanSetting initialized282 = new client.setting.BooleanSetting(this, constructorKey8, "Spectate", false);
        recovery$indy$flow$1187(this, initialized282);
        client.setting.BooleanSetting initialized283 = new client.setting.BooleanSetting(this, constructorKey8, "Ride", false);
        recovery$indy$flow$1190(this, initialized283);
        client.setting.BooleanSetting initialized284 = new client.setting.BooleanSetting(this, constructorKey8, "KarhuClicking", false);
        recovery$indy$flow$1193(this, initialized284);
        client.setting.BooleanSetting initialized285 = new client.setting.BooleanSetting(this, constructorKey8, "MMCReachSemi", false);
        recovery$indy$flow$1196(this, initialized285);
        client.setting.BooleanSetting initialized286 = new client.setting.BooleanSetting(this, constructorKey8, "OnGroundTrue", false);
        recovery$indy$flow$1199(this, initialized286);
        client.setting.BooleanSetting initialized287 = new client.setting.BooleanSetting(this, constructorKey8, "Tp", false);
        recovery$indy$flow$1202(this, initialized287);
        short converted288 = (short) (constructorPart13);
        short converted289 = (short) (constructorPart14);
        client.setting.RangeSetting initialized290 = new client.setting.RangeSetting(constructorPart12, this, "TPDelay", Double.longBitsToDouble(4652007308841189376L), Double.longBitsToDouble(4654311885213007872L), converted288, 1.0D, Double.longBitsToDouble(4666723172467343360L), 0, converted289);
        long initialValue291 = constructorKey6;
        client.setting.RangeSetting initialValue292 = initialized290;
        java.lang.Object initialValue293 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue292))))));
        java.lang.Object initialValue294 = recovery$indy$flow$1206(initialValue293, initialValue291);
        java.lang.Object initialValue295 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingTp));
        java.lang.Object initialValue296 = recovery$indy$flow$1208(initialValue295);
        java.lang.Object initialValue297 = recovery$indy$flow$1209(initialValue295);
        long initialValue298 = constructorKey30;
        java.lang.Object initialValue299 = initialValue297;
        int initialValue300 = constructorPart29;
        java.lang.Object initialValue301 = initialValue294;
        java.lang.Object initialValue302 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue301))))));
        java.lang.Object initialValue303 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue299))))));
        java.lang.Object initialValue304 = recovery$indy$flow$1212(initialValue302, initialValue300, initialValue303, initialValue298);
        recovery$indy$flow$1213(this, initialValue304);
        short converted305 = (short) (constructorPart13);
        short converted306 = (short) (constructorPart14);
        client.setting.RangeSetting initialized307 = new client.setting.RangeSetting(constructorPart12, this, "TPY", Double.longBitsToDouble(4652218415073722368L), Double.longBitsToDouble(4656722014701092864L), converted305, Double.longBitsToDouble(4652218415073722368L), Double.longBitsToDouble(4656722014701092864L), 0, converted306);
        long initialValue308 = constructorKey6;
        client.setting.RangeSetting initialValue309 = initialized307;
        java.lang.Object initialValue310 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue309))))));
        java.lang.Object initialValue311 = recovery$indy$flow$1217(initialValue310, initialValue308);
        java.lang.Object initialValue312 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingTp));
        java.lang.Object initialValue313 = recovery$indy$flow$1219(initialValue312);
        java.lang.Object initialValue314 = recovery$indy$flow$1220(initialValue312);
        long initialValue315 = constructorKey30;
        java.lang.Object initialValue316 = initialValue314;
        int initialValue317 = constructorPart29;
        java.lang.Object initialValue318 = initialValue311;
        java.lang.Object initialValue319 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue318))))));
        java.lang.Object initialValue320 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue316))))));
        java.lang.Object initialValue321 = recovery$indy$flow$1223(initialValue319, initialValue317, initialValue320, initialValue315);
        recovery$indy$flow$1224(this, initialValue321);
        short converted322 = (short) (constructorPart13);
        short converted323 = (short) (constructorPart14);
        client.setting.RangeSetting initialized324 = new client.setting.RangeSetting(constructorPart12, this, "TPXZ", Double.longBitsToDouble(4652218415073722368L), Double.longBitsToDouble(4656722014701092864L), converted322, Double.longBitsToDouble(4652218415073722368L), Double.longBitsToDouble(4656722014701092864L), 0, converted323);
        long initialValue325 = constructorKey6;
        client.setting.RangeSetting initialValue326 = initialized324;
        java.lang.Object initialValue327 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue326))))));
        java.lang.Object initialValue328 = recovery$indy$flow$1228(initialValue327, initialValue325);
        java.lang.Object initialValue329 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingTp));
        java.lang.Object initialValue330 = recovery$indy$flow$1230(initialValue329);
        java.lang.Object initialValue331 = recovery$indy$flow$1231(initialValue329);
        long initialValue332 = constructorKey30;
        java.lang.Object initialValue333 = initialValue331;
        int initialValue334 = constructorPart29;
        java.lang.Object initialValue335 = initialValue328;
        java.lang.Object initialValue336 = ((java.lang.Object)(((client.setting.RangeSetting) (((java.lang.Object)(initialValue335))))));
        java.lang.Object initialValue337 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue333))))));
        java.lang.Object initialValue338 = recovery$indy$flow$1234(initialValue336, initialValue334, initialValue337, initialValue332);
        recovery$indy$flow$1235(this, initialValue338);
        client.setting.BooleanSetting initialized339 = new client.setting.BooleanSetting(this, constructorKey8, "Test", false);
        recovery$indy$flow$1238(this, initialized339);
        client.setting.BooleanSetting initialized340 = new client.setting.BooleanSetting(this, constructorKey8, "ResourcePack", false);
        recovery$indy$flow$1241(this, initialized340);
        client.setting.BooleanSetting initialized341 = new client.setting.BooleanSetting(this, constructorKey8, "Hover", false);
        recovery$indy$flow$1244(this, initialized341);
        client.setting.BooleanSetting initialized342 = new client.setting.BooleanSetting(this, constructorKey8, "GrimSpec", false);
        recovery$indy$flow$1247(this, initialized342);
        client.setting.BooleanSetting initialized343 = new client.setting.BooleanSetting(this, constructorKey8, "grimSpecAlways", false);
        java.lang.Object initialValue344 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingGrimSpec));
        java.lang.Object initialValue345 = recovery$indy$flow$1251(initialValue344);
        java.lang.Object initialValue346 = recovery$indy$flow$1252(initialValue344);
        java.lang.Object initialValue347 = initialValue346;
        long initialValue348 = constructorKey2;
        client.setting.BooleanSetting initialValue349 = initialized343;
        java.lang.Object initialValue350 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue349))))));
        java.lang.Object initialValue351 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue347))))));
        java.lang.Object initialValue352 = recovery$indy$flow$1255(initialValue350, initialValue348, initialValue351);
        java.lang.Object initialValue353 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue352))))));
        recovery$indy$flow$1257(this, initialValue353);
        client.setting.BooleanSetting initialized354 = new client.setting.BooleanSetting(this, constructorKey8, "Sneak", false);
        recovery$indy$flow$1260(this, initialized354);
        java.lang.Object initialValue355 = recovery$indy$flow$1262(3);
        ((java.lang.Object[]) initialValue355)[0] = "StartStop";
        ((java.lang.Object[]) initialValue355)[1] = "Start";
        ((java.lang.Object[]) initialValue355)[2] = "Stop";
        client.setting.ModeSetting initialized356 = new client.setting.ModeSetting(this, "SneakType", constructorKey32, "StartStop", (java.lang.String[]) (initialValue355));
        java.lang.Object initialValue357 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingSneak));
        java.lang.Object initialValue358 = recovery$indy$flow$1265(initialValue357);
        java.lang.Object initialValue359 = recovery$indy$flow$1266(initialValue357);
        java.lang.Object initialValue360 = initialValue359;
        client.setting.ModeSetting initialValue361 = initialized356;
        java.lang.Object initialValue362 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue361))))));
        java.lang.Object initialValue363 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue360))))));
        java.lang.Object initialValue364 = recovery$indy$flow$1269(initialValue362, initialValue363);
        recovery$indy$flow$1270(this, initialValue364);
        client.setting.NumberSetting initialized365 = new client.setting.NumberSetting(this, "SneakDelay", Double.longBitsToDouble(4621819117588971520L), constructorKey36, 1.0D, Double.longBitsToDouble(4630826316843712512L), 0);
        java.lang.Object initialValue366 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(this)))).settingSneak));
        java.lang.Object initialValue367 = recovery$indy$flow$1274(initialValue366);
        java.lang.Object initialValue368 = recovery$indy$flow$1275(initialValue366);
        java.lang.Object initialValue369 = initialValue368;
        client.setting.NumberSetting initialValue370 = initialized365;
        java.lang.Object initialValue371 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue370))))));
        java.lang.Object initialValue372 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue369))))));
        java.lang.Object initialValue373 = recovery$indy$flow$1278(initialValue371, initialValue372);
        recovery$indy$flow$1279(this, initialValue373);
        java.util.concurrent.CopyOnWriteArrayList initialized374 = new java.util.concurrent.CopyOnWriteArrayList();
        recovery$indy$flow$1282(this, initialized374);
        java.util.HashMap initialized375 = new java.util.HashMap();
        recovery$indy$flow$1285(this, initialized375);
        recovery$indy$flow$1286(this, 0);
        recovery$indy$flow$1287(this, 0);
        recovery$indy$flow$1288(this, false);
        java.util.concurrent.CopyOnWriteArrayList initialized376 = new java.util.concurrent.CopyOnWriteArrayList();
        recovery$indy$flow$1291(this, initialized376);
        recovery$indy$flow$1292(this, false);
        recovery$indy$flow$1293(this, false);
        net.C_47cu initialized377 = new net.C_47cu();
        recovery$indy$flow$1296(this, initialized377);
        net.C_47cu initialized378 = new net.C_47cu();
        recovery$indy$flow$1299(this, initialized378);
        java.util.concurrent.CopyOnWriteArrayList initialized379 = new java.util.concurrent.CopyOnWriteArrayList();
        recovery$indy$flow$1302(this, initialized379);
        recovery$indy$flow$1303(this, false);
        java.lang.Object initialValue380 = recovery$indy$flow$1304();
        java.lang.Object initialValue381 = initialValue380;
        int length382 = java.lang.reflect.Array.getLength(initialValue381);
        int initialValue383 = length382;
        int initialValue384 = 0;
        Disabler_47kt loopLocal385 = this;
        long loopLocal386 = constructorKey1;
        long loopLocal387 = constructorKey3;
        long loopLocal388 = constructorKey4;
        long loopLocal389 = constructorKey7;
        long loopLocal390 = constructorKey9;
        long loopLocal391 = constructorKey10;
        int loopLocal392 = constructorPart15;
        int loopLocal393 = constructorPart16;
        int loopLocal394 = constructorPart17;
        long loopLocal395 = constructorKey22;
        long loopLocal396 = constructorKey23;
        int loopLocal397 = constructorPart24;
        int loopLocal398 = constructorPart25;
        int loopLocal399 = constructorPart26;
        long loopLocal400 = constructorKey27;
        int loopLocal401 = constructorPart33;
        int loopLocal402 = constructorPart34;
        int loopLocal403 = constructorPart35;
        java.lang.Object loopLocal404 = initialValue146;
        java.lang.Object loopLocal405 = initialValue381;
        int loopLocal406 = initialValue383;
        int loopLocal407 = initialValue384;
        Disabler_47kt loopExit409;
        long loopExit410;
        long loopExit411;
        long loopExit412;
        long loopExit413;
        long loopExit414;
        long loopExit415;
        int loopExit416;
        int loopExit417;
        int loopExit418;
        long loopExit419;
        long loopExit420;
        int loopExit421;
        int loopExit422;
        int loopExit423;
        long loopExit424;
        int loopExit425;
        int loopExit426;
        int loopExit427;
        java.lang.Object loopExit428;
        loop408: while (true) {
            if (loopLocal407 >= loopLocal406) {
                Disabler_47kt loopNext429 = loopLocal385;
                long loopNext430 = loopLocal386;
                long loopNext431 = loopLocal387;
                long loopNext432 = loopLocal388;
                long loopNext433 = loopLocal389;
                long loopNext434 = loopLocal390;
                long loopNext435 = loopLocal391;
                int loopNext436 = loopLocal392;
                int loopNext437 = loopLocal393;
                int loopNext438 = loopLocal394;
                long loopNext439 = loopLocal395;
                long loopNext440 = loopLocal396;
                int loopNext441 = loopLocal397;
                int loopNext442 = loopLocal398;
                int loopNext443 = loopLocal399;
                long loopNext444 = loopLocal400;
                int loopNext445 = loopLocal401;
                int loopNext446 = loopLocal402;
                int loopNext447 = loopLocal403;
                java.lang.Object loopNext448 = loopLocal404;
                loopExit409 = loopNext429;
                loopExit410 = loopNext430;
                loopExit411 = loopNext431;
                loopExit412 = loopNext432;
                loopExit413 = loopNext433;
                loopExit414 = loopNext434;
                loopExit415 = loopNext435;
                loopExit416 = loopNext436;
                loopExit417 = loopNext437;
                loopExit418 = loopNext438;
                loopExit419 = loopNext439;
                loopExit420 = loopNext440;
                loopExit421 = loopNext441;
                loopExit422 = loopNext442;
                loopExit423 = loopNext443;
                loopExit424 = loopNext444;
                loopExit425 = loopNext445;
                loopExit426 = loopNext446;
                loopExit427 = loopNext447;
                loopExit428 = loopNext448;
                break loop408;
            } else {
                java.lang.Object arrayValue449 = ((java.lang.Object[]) loopLocal405)[loopLocal407];
                java.lang.Object initialValue450 = arrayValue449;
                java.lang.Object initialValue451 = initialValue450;
                java.lang.Object initialValue452 = ((java.lang.Object)(((net.C_47BH) (((java.lang.Object)(initialValue451))))));
                java.lang.Object initialValue453 = recovery$indy$flow$1307(initialValue452);
                java.lang.Object initialValue454 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(loopLocal385)))).settingIncomingPackets));
                client.setting.SettingGroup initialized455 = new client.setting.SettingGroup(loopLocal390, (client.module.Module) (loopLocal385), (java.lang.String) (initialValue453), (client.setting.SettingGroup) (initialValue454));
                java.lang.Object initialValue456 = recovery$indy$flow$1310(initialValue450);
                char converted457 = (char) (loopLocal402);
                java.lang.Object initialValue458 = initialValue456;
                int initialValue459 = loopLocal403;
                int initialValue460 = (int) (converted457);
                int initialValue461 = loopLocal401;
                client.setting.SettingGroup initialValue462 = initialized455;
                java.lang.Object initialValue463 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue462))))));
                java.lang.Object initialValue464 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue458))))));
                java.lang.Object initialValue465 = recovery$indy$flow$1313(initialValue463, initialValue461, (char) (initialValue460), initialValue459, initialValue464);
                java.lang.Object initialValue466 = initialValue465;
                java.lang.StringBuilder initialized467 = new java.lang.StringBuilder();
                java.lang.Object initialValue468 = initialValue450;
                java.lang.Object initialValue469 = ((java.lang.Object)(((net.C_47BH) (((java.lang.Object)(initialValue468))))));
                java.lang.Object initialValue470 = recovery$indy$flow$1318(initialValue469);
                java.lang.Object initialValue471 = recovery$indy$flow$1319(initialized467, initialValue470);
                java.lang.Object initialValue472 = recovery$indy$flow$1320(initialValue471, "Interval");
                java.lang.Object initialValue473 = recovery$indy$flow$1321(initialValue472);
                client.setting.NumberSetting initialized474 = new client.setting.NumberSetting((client.module.Module) (loopLocal385), (java.lang.String) (initialValue473), 0.0D, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue466), loopLocal395);
                short converted475 = (short) (loopLocal399);
                int initialValue476 = (int) (converted475);
                int initialValue477 = loopLocal398;
                java.lang.String initialValue478 = "Interval";
                int initialValue479 = loopLocal397;
                client.setting.NumberSetting initialValue480 = initialized474;
                java.lang.Object initialValue481 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue480))))));
                java.lang.Object initialValue482 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue478))))));
                java.lang.Object initialValue483 = recovery$indy$flow$1325(initialValue481, initialValue479, initialValue482, initialValue477, (short) (initialValue476));
                java.lang.Object initialValue484 = initialValue483;
                java.lang.Object initialValue485 = initialValue450;
                java.lang.Object initialValue486 = ((java.lang.Object)(((net.C_47BH) (((java.lang.Object)(initialValue485))))));
                java.lang.Object initialValue487 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue484))))));
                java.lang.Object initialValue488 = recovery$indy$flow$1328(initialValue486, initialValue487);
                java.lang.StringBuilder initialized489 = new java.lang.StringBuilder();
                java.lang.Object initialValue490 = initialValue450;
                java.lang.Object initialValue491 = ((java.lang.Object)(((net.C_47BH) (((java.lang.Object)(initialValue490))))));
                java.lang.Object initialValue492 = recovery$indy$flow$1333(initialValue491);
                java.lang.Object initialValue493 = recovery$indy$flow$1334(initialized489, initialValue492);
                java.lang.Object initialValue494 = recovery$indy$flow$1335(initialValue493, "Always");
                java.lang.Object initialValue495 = recovery$indy$flow$1336(initialValue494);
                short converted496 = (short) (loopLocal392);
                char converted497 = (char) (loopLocal393);
                client.setting.BooleanSetting initialized498 = new client.setting.BooleanSetting((client.module.Module) (loopLocal385), (java.lang.String) (initialValue495), converted496, converted497, loopLocal394, true, (client.setting.SettingGroup) (initialValue466));
                long initialValue499 = loopLocal389;
                java.lang.String initialValue500 = "Always";
                client.setting.BooleanSetting initialValue501 = initialized498;
                java.lang.Object initialValue502 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue501))))));
                java.lang.Object initialValue503 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue500))))));
                java.lang.Object initialValue504 = recovery$indy$flow$1340(initialValue502, initialValue503, initialValue499);
                java.lang.Object initialValue505 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue504))))));
                java.lang.Object initialValue506 = initialValue505;
                java.lang.Object initialValue507 = initialValue450;
                java.lang.Object initialValue508 = ((java.lang.Object)(((net.C_47BH) (((java.lang.Object)(initialValue507))))));
                java.lang.Object initialValue509 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue506))))));
                java.lang.Object initialValue510 = recovery$indy$flow$1344(initialValue508, initialValue509);
                java.lang.StringBuilder initialized511 = new java.lang.StringBuilder();
                java.lang.Object initialValue512 = initialValue450;
                java.lang.Object initialValue513 = ((java.lang.Object)(((net.C_47BH) (((java.lang.Object)(initialValue512))))));
                java.lang.Object initialValue514 = recovery$indy$flow$1349(initialValue513);
                java.lang.Object initialValue515 = recovery$indy$flow$1350(initialized511, initialValue514);
                java.lang.Object initialValue516 = recovery$indy$flow$1351(initialValue515, "StartTick");
                java.lang.Object initialValue517 = recovery$indy$flow$1352(initialValue516);
                java.lang.StringBuilder initialized518 = new java.lang.StringBuilder();
                java.lang.Object initialValue519 = initialValue450;
                java.lang.Object initialValue520 = ((java.lang.Object)(((net.C_47BH) (((java.lang.Object)(initialValue519))))));
                java.lang.Object initialValue521 = recovery$indy$flow$1356(initialValue520);
                java.lang.Object initialValue522 = recovery$indy$flow$1357(initialized518, initialValue521);
                java.lang.Object initialValue523 = recovery$indy$flow$1358(initialValue522, "EndTick");
                java.lang.Object initialValue524 = recovery$indy$flow$1359(initialValue523);
                net.C_47TU initialized525 = new net.C_47TU((client.module.Module) (loopLocal385), (java.lang.String) (initialValue517), (java.lang.String) (initialValue524), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue466), loopLocal400);
                java.lang.String initialValue526 = "EndTick";
                java.lang.String initialValue527 = "StartTick";
                long initialValue528 = loopLocal388;
                net.C_47TU initialValue529 = initialized525;
                java.lang.Object initialValue530 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue529))))));
                java.lang.Object initialValue531 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue527))))));
                java.lang.Object initialValue532 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue526))))));
                java.lang.Object initialValue533 = recovery$indy$flow$1364(initialValue530, initialValue528, initialValue531, initialValue532);
                java.lang.Object initialValue534 = recovery$indy$flow$1365(initialValue450);
                long initialValue535 = loopLocal387;
                java.lang.Object initialValue536 = initialValue534;
                java.lang.Object initialValue537 = initialValue533;
                java.lang.Object initialValue538 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue537))))));
                java.lang.Object initialValue539 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue536))))));
                java.lang.Object initialValue540 = recovery$indy$flow$1368(initialValue538, initialValue539, initialValue535);
                java.lang.Object initialValue541 = initialValue540;
                java.lang.Object initialValue542 = initialValue450;
                java.lang.Object initialValue543 = ((java.lang.Object)(((net.C_47BH) (((java.lang.Object)(initialValue542))))));
                java.lang.Object initialValue544 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue541))))));
                java.lang.Object initialValue545 = recovery$indy$flow$1371(initialValue543, initialValue544);
                java.lang.StringBuilder initialized546 = new java.lang.StringBuilder();
                java.lang.Object initialValue547 = initialValue450;
                java.lang.Object initialValue548 = ((java.lang.Object)(((net.C_47BH) (((java.lang.Object)(initialValue547))))));
                java.lang.Object initialValue549 = recovery$indy$flow$1376(initialValue548);
                java.lang.Object initialValue550 = recovery$indy$flow$1377(initialized546, initialValue549);
                java.lang.Object initialValue551 = recovery$indy$flow$1378(initialValue550, "CancelCondition");
                java.lang.Object initialValue552 = recovery$indy$flow$1379(initialValue551);
                java.lang.Object initialValue553 = recovery$indy$flow$1380(3);
                ((java.lang.Object[]) initialValue553)[0] = "Always";
                ((java.lang.Object[]) initialValue553)[1] = "OnlyOnGround";
                ((java.lang.Object[]) initialValue553)[2] = "OnlyInAir";
                client.setting.ModeSetting initialized554 = new client.setting.ModeSetting((client.module.Module) (loopLocal385), (java.lang.String) (initialValue552), "Always", (java.lang.String[]) (initialValue553), (client.setting.SettingGroup) (initialValue466), loopLocal391);
                java.lang.String initialValue555 = "CancelCondition";
                long initialValue556 = loopLocal396;
                client.setting.ModeSetting initialValue557 = initialized554;
                java.lang.Object initialValue558 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue557))))));
                java.lang.Object initialValue559 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue555))))));
                java.lang.Object initialValue560 = recovery$indy$flow$1384(initialValue558, initialValue556, initialValue559);
                java.lang.Object initialValue561 = initialValue560;
                java.lang.Object initialValue562 = initialValue450;
                java.lang.Object initialValue563 = ((java.lang.Object)(((net.C_47BH) (((java.lang.Object)(initialValue562))))));
                java.lang.Object initialValue564 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue561))))));
                java.lang.Object initialValue565 = recovery$indy$flow$1387(initialValue563, initialValue564);
                int incremented566 = loopLocal407 + (1);
                if (loopLocal404 == null) {
                    Disabler_47kt loopNext567 = loopLocal385;
                    long loopNext568 = loopLocal386;
                    long loopNext569 = loopLocal387;
                    long loopNext570 = loopLocal388;
                    long loopNext571 = loopLocal389;
                    long loopNext572 = loopLocal390;
                    long loopNext573 = loopLocal391;
                    int loopNext574 = loopLocal392;
                    int loopNext575 = loopLocal393;
                    int loopNext576 = loopLocal394;
                    long loopNext577 = loopLocal395;
                    long loopNext578 = loopLocal396;
                    int loopNext579 = loopLocal397;
                    int loopNext580 = loopLocal398;
                    int loopNext581 = loopLocal399;
                    long loopNext582 = loopLocal400;
                    int loopNext583 = loopLocal401;
                    int loopNext584 = loopLocal402;
                    int loopNext585 = loopLocal403;
                    java.lang.Object loopNext586 = loopLocal404;
                    java.lang.Object loopNext587 = loopLocal405;
                    int loopNext588 = loopLocal406;
                    int loopNext589 = incremented566;
                    loopLocal385 = loopNext567;
                    loopLocal386 = loopNext568;
                    loopLocal387 = loopNext569;
                    loopLocal388 = loopNext570;
                    loopLocal389 = loopNext571;
                    loopLocal390 = loopNext572;
                    loopLocal391 = loopNext573;
                    loopLocal392 = loopNext574;
                    loopLocal393 = loopNext575;
                    loopLocal394 = loopNext576;
                    loopLocal395 = loopNext577;
                    loopLocal396 = loopNext578;
                    loopLocal397 = loopNext579;
                    loopLocal398 = loopNext580;
                    loopLocal399 = loopNext581;
                    loopLocal400 = loopNext582;
                    loopLocal401 = loopNext583;
                    loopLocal402 = loopNext584;
                    loopLocal403 = loopNext585;
                    loopLocal404 = loopNext586;
                    loopLocal405 = loopNext587;
                    loopLocal406 = loopNext588;
                    loopLocal407 = loopNext589;
                    continue loop408;
                } else {
                    java.lang.Object initialValue590 = recovery$indy$flow$1388(4);
                    java.lang.Object initialValue591 = initialValue590;
                    java.lang.Object initialValue592 = recovery$indy$flow$1389(initialValue591);
                    recovery$indy$flow$1390(initialValue592);
                    Disabler_47kt loopNext593 = loopLocal385;
                    long loopNext594 = loopLocal386;
                    long loopNext595 = loopLocal387;
                    long loopNext596 = loopLocal388;
                    long loopNext597 = loopLocal389;
                    long loopNext598 = loopLocal390;
                    long loopNext599 = loopLocal391;
                    int loopNext600 = loopLocal392;
                    int loopNext601 = loopLocal393;
                    int loopNext602 = loopLocal394;
                    long loopNext603 = loopLocal395;
                    long loopNext604 = loopLocal396;
                    int loopNext605 = loopLocal397;
                    int loopNext606 = loopLocal398;
                    int loopNext607 = loopLocal399;
                    long loopNext608 = loopLocal400;
                    int loopNext609 = loopLocal401;
                    int loopNext610 = loopLocal402;
                    int loopNext611 = loopLocal403;
                    java.lang.Object loopNext612 = loopLocal404;
                    loopExit409 = loopNext593;
                    loopExit410 = loopNext594;
                    loopExit411 = loopNext595;
                    loopExit412 = loopNext596;
                    loopExit413 = loopNext597;
                    loopExit414 = loopNext598;
                    loopExit415 = loopNext599;
                    loopExit416 = loopNext600;
                    loopExit417 = loopNext601;
                    loopExit418 = loopNext602;
                    loopExit419 = loopNext603;
                    loopExit420 = loopNext604;
                    loopExit421 = loopNext605;
                    loopExit422 = loopNext606;
                    loopExit423 = loopNext607;
                    loopExit424 = loopNext608;
                    loopExit425 = loopNext609;
                    loopExit426 = loopNext610;
                    loopExit427 = loopNext611;
                    loopExit428 = loopNext612;
                    break loop408;
                }
            }
        }
        java.lang.Object initialValue613 = recovery$indy$flow$1391();
        java.lang.Object initialValue614 = initialValue613;
        int length615 = java.lang.reflect.Array.getLength(initialValue614);
        int initialValue616 = length615;
        int initialValue617 = 0;
        Disabler_47kt loopLocal618 = loopExit409;
        long loopLocal619 = loopExit410;
        long loopLocal620 = loopExit411;
        long loopLocal621 = loopExit412;
        long loopLocal622 = loopExit413;
        long loopLocal623 = loopExit414;
        long loopLocal624 = loopExit415;
        int loopLocal625 = loopExit416;
        int loopLocal626 = loopExit417;
        int loopLocal627 = loopExit418;
        long loopLocal628 = loopExit419;
        long loopLocal629 = loopExit420;
        int loopLocal630 = loopExit421;
        int loopLocal631 = loopExit422;
        int loopLocal632 = loopExit423;
        long loopLocal633 = loopExit424;
        int loopLocal634 = loopExit425;
        int loopLocal635 = loopExit426;
        int loopLocal636 = loopExit427;
        java.lang.Object loopLocal637 = loopExit428;
        java.lang.Object loopLocal638 = initialValue614;
        int loopLocal639 = initialValue616;
        int loopLocal640 = initialValue617;
        Disabler_47kt loopExit642;
        long loopExit643;
        long loopExit644;
        long loopExit645;
        long loopExit646;
        long loopExit647;
        long loopExit648;
        int loopExit649;
        int loopExit650;
        int loopExit651;
        long loopExit652;
        long loopExit653;
        int loopExit654;
        int loopExit655;
        int loopExit656;
        long loopExit657;
        int loopExit658;
        int loopExit659;
        int loopExit660;
        java.lang.Object loopExit661;
        loop641: while (true) {
            if (loopLocal640 >= loopLocal639) {
                Disabler_47kt loopNext662 = loopLocal618;
                long loopNext663 = loopLocal619;
                long loopNext664 = loopLocal620;
                long loopNext665 = loopLocal621;
                long loopNext666 = loopLocal622;
                long loopNext667 = loopLocal623;
                long loopNext668 = loopLocal624;
                int loopNext669 = loopLocal625;
                int loopNext670 = loopLocal626;
                int loopNext671 = loopLocal627;
                long loopNext672 = loopLocal628;
                long loopNext673 = loopLocal629;
                int loopNext674 = loopLocal630;
                int loopNext675 = loopLocal631;
                int loopNext676 = loopLocal632;
                long loopNext677 = loopLocal633;
                int loopNext678 = loopLocal634;
                int loopNext679 = loopLocal635;
                int loopNext680 = loopLocal636;
                java.lang.Object loopNext681 = loopLocal637;
                loopExit642 = loopNext662;
                loopExit643 = loopNext663;
                loopExit644 = loopNext664;
                loopExit645 = loopNext665;
                loopExit646 = loopNext666;
                loopExit647 = loopNext667;
                loopExit648 = loopNext668;
                loopExit649 = loopNext669;
                loopExit650 = loopNext670;
                loopExit651 = loopNext671;
                loopExit652 = loopNext672;
                loopExit653 = loopNext673;
                loopExit654 = loopNext674;
                loopExit655 = loopNext675;
                loopExit656 = loopNext676;
                loopExit657 = loopNext677;
                loopExit658 = loopNext678;
                loopExit659 = loopNext679;
                loopExit660 = loopNext680;
                loopExit661 = loopNext681;
                break loop641;
            } else {
                java.lang.Object arrayValue682 = ((java.lang.Object[]) loopLocal638)[loopLocal640];
                java.lang.Object initialValue683 = arrayValue682;
                java.lang.Object initialValue684 = initialValue683;
                java.lang.Object initialValue685 = ((java.lang.Object)(((net.C_47KK) (((java.lang.Object)(initialValue684))))));
                java.lang.Object initialValue686 = recovery$indy$flow$1394(initialValue685);
                java.lang.Object initialValue687 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(loopLocal618)))).settingOutgoingPackets));
                client.setting.SettingGroup initialized688 = new client.setting.SettingGroup(loopLocal623, (client.module.Module) (loopLocal618), (java.lang.String) (initialValue686), (client.setting.SettingGroup) (initialValue687));
                java.lang.Object initialValue689 = recovery$indy$flow$1397(initialValue683);
                char converted690 = (char) (loopLocal635);
                java.lang.Object initialValue691 = initialValue689;
                int initialValue692 = loopLocal636;
                int initialValue693 = (int) (converted690);
                int initialValue694 = loopLocal634;
                client.setting.SettingGroup initialValue695 = initialized688;
                java.lang.Object initialValue696 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue695))))));
                java.lang.Object initialValue697 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue691))))));
                java.lang.Object initialValue698 = recovery$indy$flow$1400(initialValue696, initialValue694, (char) (initialValue693), initialValue692, initialValue697);
                java.lang.Object initialValue699 = initialValue698;
                java.lang.StringBuilder initialized700 = new java.lang.StringBuilder();
                java.lang.Object initialValue701 = initialValue683;
                java.lang.Object initialValue702 = ((java.lang.Object)(((net.C_47KK) (((java.lang.Object)(initialValue701))))));
                java.lang.Object initialValue703 = recovery$indy$flow$1405(initialValue702);
                java.lang.Object initialValue704 = recovery$indy$flow$1406(initialized700, initialValue703);
                java.lang.Object initialValue705 = recovery$indy$flow$1407(initialValue704, "Interval");
                java.lang.Object initialValue706 = recovery$indy$flow$1408(initialValue705);
                client.setting.NumberSetting initialized707 = new client.setting.NumberSetting((client.module.Module) (loopLocal618), (java.lang.String) (initialValue706), 0.0D, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue699), loopLocal628);
                short converted708 = (short) (loopLocal632);
                int initialValue709 = (int) (converted708);
                int initialValue710 = loopLocal631;
                java.lang.String initialValue711 = "Interval";
                int initialValue712 = loopLocal630;
                client.setting.NumberSetting initialValue713 = initialized707;
                java.lang.Object initialValue714 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue713))))));
                java.lang.Object initialValue715 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue711))))));
                java.lang.Object initialValue716 = recovery$indy$flow$1412(initialValue714, initialValue712, initialValue715, initialValue710, (short) (initialValue709));
                java.lang.Object initialValue717 = initialValue716;
                java.lang.Object initialValue718 = initialValue683;
                java.lang.Object initialValue719 = ((java.lang.Object)(((net.C_47KK) (((java.lang.Object)(initialValue718))))));
                java.lang.Object initialValue720 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue717))))));
                java.lang.Object initialValue721 = recovery$indy$flow$1415(initialValue719, initialValue720);
                java.lang.StringBuilder initialized722 = new java.lang.StringBuilder();
                java.lang.Object initialValue723 = initialValue683;
                java.lang.Object initialValue724 = ((java.lang.Object)(((net.C_47KK) (((java.lang.Object)(initialValue723))))));
                java.lang.Object initialValue725 = recovery$indy$flow$1420(initialValue724);
                java.lang.Object initialValue726 = recovery$indy$flow$1421(initialized722, initialValue725);
                java.lang.Object initialValue727 = recovery$indy$flow$1422(initialValue726, "Always");
                java.lang.Object initialValue728 = recovery$indy$flow$1423(initialValue727);
                short converted729 = (short) (loopLocal625);
                char converted730 = (char) (loopLocal626);
                client.setting.BooleanSetting initialized731 = new client.setting.BooleanSetting((client.module.Module) (loopLocal618), (java.lang.String) (initialValue728), converted729, converted730, loopLocal627, true, (client.setting.SettingGroup) (initialValue699));
                long initialValue732 = loopLocal622;
                java.lang.String initialValue733 = "Always";
                client.setting.BooleanSetting initialValue734 = initialized731;
                java.lang.Object initialValue735 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue734))))));
                java.lang.Object initialValue736 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue733))))));
                java.lang.Object initialValue737 = recovery$indy$flow$1427(initialValue735, initialValue736, initialValue732);
                java.lang.Object initialValue738 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue737))))));
                java.lang.Object initialValue739 = initialValue738;
                java.lang.Object initialValue740 = initialValue683;
                java.lang.Object initialValue741 = ((java.lang.Object)(((net.C_47KK) (((java.lang.Object)(initialValue740))))));
                java.lang.Object initialValue742 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue739))))));
                java.lang.Object initialValue743 = recovery$indy$flow$1431(initialValue741, initialValue742);
                java.lang.StringBuilder initialized744 = new java.lang.StringBuilder();
                java.lang.Object initialValue745 = initialValue683;
                java.lang.Object initialValue746 = ((java.lang.Object)(((net.C_47KK) (((java.lang.Object)(initialValue745))))));
                java.lang.Object initialValue747 = recovery$indy$flow$1436(initialValue746);
                java.lang.Object initialValue748 = recovery$indy$flow$1437(initialized744, initialValue747);
                java.lang.Object initialValue749 = recovery$indy$flow$1438(initialValue748, "StartTick");
                java.lang.Object initialValue750 = recovery$indy$flow$1439(initialValue749);
                java.lang.StringBuilder initialized751 = new java.lang.StringBuilder();
                java.lang.Object initialValue752 = initialValue683;
                java.lang.Object initialValue753 = ((java.lang.Object)(((net.C_47KK) (((java.lang.Object)(initialValue752))))));
                java.lang.Object initialValue754 = recovery$indy$flow$1443(initialValue753);
                java.lang.Object initialValue755 = recovery$indy$flow$1444(initialized751, initialValue754);
                java.lang.Object initialValue756 = recovery$indy$flow$1445(initialValue755, "EndTick");
                java.lang.Object initialValue757 = recovery$indy$flow$1446(initialValue756);
                net.C_47TU initialized758 = new net.C_47TU((client.module.Module) (loopLocal618), (java.lang.String) (initialValue750), (java.lang.String) (initialValue757), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue699), loopLocal633);
                java.lang.String initialValue759 = "EndTick";
                java.lang.String initialValue760 = "StartTick";
                long initialValue761 = loopLocal621;
                net.C_47TU initialValue762 = initialized758;
                java.lang.Object initialValue763 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue762))))));
                java.lang.Object initialValue764 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue760))))));
                java.lang.Object initialValue765 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue759))))));
                java.lang.Object initialValue766 = recovery$indy$flow$1451(initialValue763, initialValue761, initialValue764, initialValue765);
                java.lang.Object initialValue767 = recovery$indy$flow$1452(initialValue683);
                long initialValue768 = loopLocal620;
                java.lang.Object initialValue769 = initialValue767;
                java.lang.Object initialValue770 = initialValue766;
                java.lang.Object initialValue771 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue770))))));
                java.lang.Object initialValue772 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue769))))));
                java.lang.Object initialValue773 = recovery$indy$flow$1455(initialValue771, initialValue772, initialValue768);
                java.lang.Object initialValue774 = initialValue773;
                java.lang.Object initialValue775 = initialValue683;
                java.lang.Object initialValue776 = ((java.lang.Object)(((net.C_47KK) (((java.lang.Object)(initialValue775))))));
                java.lang.Object initialValue777 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue774))))));
                java.lang.Object initialValue778 = recovery$indy$flow$1458(initialValue776, initialValue777);
                java.lang.StringBuilder initialized779 = new java.lang.StringBuilder();
                java.lang.Object initialValue780 = initialValue683;
                java.lang.Object initialValue781 = ((java.lang.Object)(((net.C_47KK) (((java.lang.Object)(initialValue780))))));
                java.lang.Object initialValue782 = recovery$indy$flow$1463(initialValue781);
                java.lang.Object initialValue783 = recovery$indy$flow$1464(initialized779, initialValue782);
                java.lang.Object initialValue784 = recovery$indy$flow$1465(initialValue783, "CancelCondition");
                java.lang.Object initialValue785 = recovery$indy$flow$1466(initialValue784);
                java.lang.Object initialValue786 = recovery$indy$flow$1467(3);
                ((java.lang.Object[]) initialValue786)[0] = "Always";
                ((java.lang.Object[]) initialValue786)[1] = "OnlyOnGround";
                ((java.lang.Object[]) initialValue786)[2] = "OnlyInAir";
                client.setting.ModeSetting initialized787 = new client.setting.ModeSetting((client.module.Module) (loopLocal618), (java.lang.String) (initialValue785), "Always", (java.lang.String[]) (initialValue786), (client.setting.SettingGroup) (initialValue699), loopLocal624);
                java.lang.String initialValue788 = "CancelCondition";
                long initialValue789 = loopLocal629;
                client.setting.ModeSetting initialValue790 = initialized787;
                java.lang.Object initialValue791 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue790))))));
                java.lang.Object initialValue792 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue788))))));
                java.lang.Object initialValue793 = recovery$indy$flow$1471(initialValue791, initialValue789, initialValue792);
                java.lang.Object initialValue794 = initialValue793;
                java.lang.Object initialValue795 = initialValue683;
                java.lang.Object initialValue796 = ((java.lang.Object)(((net.C_47KK) (((java.lang.Object)(initialValue795))))));
                java.lang.Object initialValue797 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue794))))));
                java.lang.Object initialValue798 = recovery$indy$flow$1474(initialValue796, initialValue797);
                int incremented799 = loopLocal640 + (1);
                if (loopLocal637 == null) {
                    Disabler_47kt loopNext800 = loopLocal618;
                    long loopNext801 = loopLocal619;
                    long loopNext802 = loopLocal620;
                    long loopNext803 = loopLocal621;
                    long loopNext804 = loopLocal622;
                    long loopNext805 = loopLocal623;
                    long loopNext806 = loopLocal624;
                    int loopNext807 = loopLocal625;
                    int loopNext808 = loopLocal626;
                    int loopNext809 = loopLocal627;
                    long loopNext810 = loopLocal628;
                    long loopNext811 = loopLocal629;
                    int loopNext812 = loopLocal630;
                    int loopNext813 = loopLocal631;
                    int loopNext814 = loopLocal632;
                    long loopNext815 = loopLocal633;
                    int loopNext816 = loopLocal634;
                    int loopNext817 = loopLocal635;
                    int loopNext818 = loopLocal636;
                    java.lang.Object loopNext819 = loopLocal637;
                    java.lang.Object loopNext820 = loopLocal638;
                    int loopNext821 = loopLocal639;
                    int loopNext822 = incremented799;
                    loopLocal618 = loopNext800;
                    loopLocal619 = loopNext801;
                    loopLocal620 = loopNext802;
                    loopLocal621 = loopNext803;
                    loopLocal622 = loopNext804;
                    loopLocal623 = loopNext805;
                    loopLocal624 = loopNext806;
                    loopLocal625 = loopNext807;
                    loopLocal626 = loopNext808;
                    loopLocal627 = loopNext809;
                    loopLocal628 = loopNext810;
                    loopLocal629 = loopNext811;
                    loopLocal630 = loopNext812;
                    loopLocal631 = loopNext813;
                    loopLocal632 = loopNext814;
                    loopLocal633 = loopNext815;
                    loopLocal634 = loopNext816;
                    loopLocal635 = loopNext817;
                    loopLocal636 = loopNext818;
                    loopLocal637 = loopNext819;
                    loopLocal638 = loopNext820;
                    loopLocal639 = loopNext821;
                    loopLocal640 = loopNext822;
                    continue loop641;
                } else {
                    Disabler_47kt loopNext823 = loopLocal618;
                    long loopNext824 = loopLocal619;
                    long loopNext825 = loopLocal620;
                    long loopNext826 = loopLocal621;
                    long loopNext827 = loopLocal622;
                    long loopNext828 = loopLocal623;
                    long loopNext829 = loopLocal624;
                    int loopNext830 = loopLocal625;
                    int loopNext831 = loopLocal626;
                    int loopNext832 = loopLocal627;
                    long loopNext833 = loopLocal628;
                    long loopNext834 = loopLocal629;
                    int loopNext835 = loopLocal630;
                    int loopNext836 = loopLocal631;
                    int loopNext837 = loopLocal632;
                    long loopNext838 = loopLocal633;
                    int loopNext839 = loopLocal634;
                    int loopNext840 = loopLocal635;
                    int loopNext841 = loopLocal636;
                    java.lang.Object loopNext842 = loopLocal637;
                    loopExit642 = loopNext823;
                    loopExit643 = loopNext824;
                    loopExit644 = loopNext825;
                    loopExit645 = loopNext826;
                    loopExit646 = loopNext827;
                    loopExit647 = loopNext828;
                    loopExit648 = loopNext829;
                    loopExit649 = loopNext830;
                    loopExit650 = loopNext831;
                    loopExit651 = loopNext832;
                    loopExit652 = loopNext833;
                    loopExit653 = loopNext834;
                    loopExit654 = loopNext835;
                    loopExit655 = loopNext836;
                    loopExit656 = loopNext837;
                    loopExit657 = loopNext838;
                    loopExit658 = loopNext839;
                    loopExit659 = loopNext840;
                    loopExit660 = loopNext841;
                    loopExit661 = loopNext842;
                    break loop641;
                }
            }
        }
        java.lang.Object initialValue843 = recovery$indy$flow$1475();
        java.lang.Object initialValue844 = initialValue843;
        int length845 = java.lang.reflect.Array.getLength(initialValue844);
        int initialValue846 = length845;
        int initialValue847 = 0;
        Disabler_47kt loopLocal848 = loopExit642;
        long loopLocal849 = loopExit643;
        long loopLocal850 = loopExit644;
        long loopLocal851 = loopExit645;
        long loopLocal852 = loopExit646;
        long loopLocal853 = loopExit647;
        long loopLocal854 = loopExit648;
        int loopLocal855 = loopExit649;
        int loopLocal856 = loopExit650;
        int loopLocal857 = loopExit651;
        long loopLocal858 = loopExit652;
        long loopLocal859 = loopExit653;
        int loopLocal860 = loopExit654;
        int loopLocal861 = loopExit655;
        int loopLocal862 = loopExit656;
        long loopLocal863 = loopExit657;
        int loopLocal864 = loopExit658;
        int loopLocal865 = loopExit659;
        int loopLocal866 = loopExit660;
        java.lang.Object loopLocal867 = loopExit661;
        java.lang.Object loopLocal868 = initialValue844;
        int loopLocal869 = initialValue846;
        int loopLocal870 = initialValue847;
        Disabler_47kt loopExit872;
        long loopExit873;
        long loopExit874;
        long loopExit875;
        long loopExit876;
        long loopExit877;
        long loopExit878;
        int loopExit879;
        int loopExit880;
        int loopExit881;
        long loopExit882;
        long loopExit883;
        int loopExit884;
        int loopExit885;
        int loopExit886;
        long loopExit887;
        int loopExit888;
        int loopExit889;
        int loopExit890;
        java.lang.Object loopExit891;
        loop871: while (true) {
            if (loopLocal870 >= loopLocal869) {
                Disabler_47kt loopNext892 = loopLocal848;
                long loopNext893 = loopLocal849;
                long loopNext894 = loopLocal850;
                long loopNext895 = loopLocal851;
                long loopNext896 = loopLocal852;
                long loopNext897 = loopLocal853;
                long loopNext898 = loopLocal854;
                int loopNext899 = loopLocal855;
                int loopNext900 = loopLocal856;
                int loopNext901 = loopLocal857;
                long loopNext902 = loopLocal858;
                long loopNext903 = loopLocal859;
                int loopNext904 = loopLocal860;
                int loopNext905 = loopLocal861;
                int loopNext906 = loopLocal862;
                long loopNext907 = loopLocal863;
                int loopNext908 = loopLocal864;
                int loopNext909 = loopLocal865;
                int loopNext910 = loopLocal866;
                java.lang.Object loopNext911 = loopLocal867;
                loopExit872 = loopNext892;
                loopExit873 = loopNext893;
                loopExit874 = loopNext894;
                loopExit875 = loopNext895;
                loopExit876 = loopNext896;
                loopExit877 = loopNext897;
                loopExit878 = loopNext898;
                loopExit879 = loopNext899;
                loopExit880 = loopNext900;
                loopExit881 = loopNext901;
                loopExit882 = loopNext902;
                loopExit883 = loopNext903;
                loopExit884 = loopNext904;
                loopExit885 = loopNext905;
                loopExit886 = loopNext906;
                loopExit887 = loopNext907;
                loopExit888 = loopNext908;
                loopExit889 = loopNext909;
                loopExit890 = loopNext910;
                loopExit891 = loopNext911;
                break loop871;
            } else {
                java.lang.Object arrayValue912 = ((java.lang.Object[]) loopLocal868)[loopLocal870];
                java.lang.Object initialValue913 = arrayValue912;
                java.lang.Object initialValue914 = initialValue913;
                java.lang.Object initialValue915 = ((java.lang.Object)(((net.C_47w7) (((java.lang.Object)(initialValue914))))));
                java.lang.Object initialValue916 = recovery$indy$flow$1478(initialValue915);
                java.lang.Object initialValue917 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(loopLocal848)))).settingDetailedPackets));
                client.setting.SettingGroup initialized918 = new client.setting.SettingGroup(loopLocal853, (client.module.Module) (loopLocal848), (java.lang.String) (initialValue916), (client.setting.SettingGroup) (initialValue917));
                java.lang.Object initialValue919 = recovery$indy$flow$1481(initialValue913);
                char converted920 = (char) (loopLocal865);
                java.lang.Object initialValue921 = initialValue919;
                int initialValue922 = loopLocal866;
                int initialValue923 = (int) (converted920);
                int initialValue924 = loopLocal864;
                client.setting.SettingGroup initialValue925 = initialized918;
                java.lang.Object initialValue926 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue925))))));
                java.lang.Object initialValue927 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue921))))));
                java.lang.Object initialValue928 = recovery$indy$flow$1484(initialValue926, initialValue924, (char) (initialValue923), initialValue922, initialValue927);
                java.lang.Object initialValue929 = initialValue928;
                java.lang.StringBuilder initialized930 = new java.lang.StringBuilder();
                java.lang.Object initialValue931 = initialValue913;
                java.lang.Object initialValue932 = ((java.lang.Object)(((net.C_47w7) (((java.lang.Object)(initialValue931))))));
                java.lang.Object initialValue933 = recovery$indy$flow$1489(initialValue932);
                java.lang.Object initialValue934 = recovery$indy$flow$1490(initialized930, initialValue933);
                java.lang.Object initialValue935 = recovery$indy$flow$1491(initialValue934, "Interval");
                java.lang.Object initialValue936 = recovery$indy$flow$1492(initialValue935);
                client.setting.NumberSetting initialized937 = new client.setting.NumberSetting((client.module.Module) (loopLocal848), (java.lang.String) (initialValue936), 0.0D, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue929), loopLocal858);
                short converted938 = (short) (loopLocal862);
                int initialValue939 = (int) (converted938);
                int initialValue940 = loopLocal861;
                java.lang.String initialValue941 = "Interval";
                int initialValue942 = loopLocal860;
                client.setting.NumberSetting initialValue943 = initialized937;
                java.lang.Object initialValue944 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue943))))));
                java.lang.Object initialValue945 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue941))))));
                java.lang.Object initialValue946 = recovery$indy$flow$1496(initialValue944, initialValue942, initialValue945, initialValue940, (short) (initialValue939));
                java.lang.Object initialValue947 = initialValue946;
                java.lang.Object initialValue948 = initialValue913;
                java.lang.Object initialValue949 = ((java.lang.Object)(((net.C_47w7) (((java.lang.Object)(initialValue948))))));
                java.lang.Object initialValue950 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue947))))));
                java.lang.Object initialValue951 = recovery$indy$flow$1499(initialValue949, initialValue950);
                java.lang.StringBuilder initialized952 = new java.lang.StringBuilder();
                java.lang.Object initialValue953 = initialValue913;
                java.lang.Object initialValue954 = ((java.lang.Object)(((net.C_47w7) (((java.lang.Object)(initialValue953))))));
                java.lang.Object initialValue955 = recovery$indy$flow$1504(initialValue954);
                java.lang.Object initialValue956 = recovery$indy$flow$1505(initialized952, initialValue955);
                java.lang.Object initialValue957 = recovery$indy$flow$1506(initialValue956, "Always");
                java.lang.Object initialValue958 = recovery$indy$flow$1507(initialValue957);
                short converted959 = (short) (loopLocal855);
                char converted960 = (char) (loopLocal856);
                client.setting.BooleanSetting initialized961 = new client.setting.BooleanSetting((client.module.Module) (loopLocal848), (java.lang.String) (initialValue958), converted959, converted960, loopLocal857, true, (client.setting.SettingGroup) (initialValue929));
                long initialValue962 = loopLocal852;
                java.lang.String initialValue963 = "Always";
                client.setting.BooleanSetting initialValue964 = initialized961;
                java.lang.Object initialValue965 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue964))))));
                java.lang.Object initialValue966 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue963))))));
                java.lang.Object initialValue967 = recovery$indy$flow$1511(initialValue965, initialValue966, initialValue962);
                java.lang.Object initialValue968 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue967))))));
                java.lang.Object initialValue969 = initialValue968;
                java.lang.Object initialValue970 = initialValue913;
                java.lang.Object initialValue971 = ((java.lang.Object)(((net.C_47w7) (((java.lang.Object)(initialValue970))))));
                java.lang.Object initialValue972 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue969))))));
                java.lang.Object initialValue973 = recovery$indy$flow$1515(initialValue971, initialValue972);
                java.lang.StringBuilder initialized974 = new java.lang.StringBuilder();
                java.lang.Object initialValue975 = initialValue913;
                java.lang.Object initialValue976 = ((java.lang.Object)(((net.C_47w7) (((java.lang.Object)(initialValue975))))));
                java.lang.Object initialValue977 = recovery$indy$flow$1520(initialValue976);
                java.lang.Object initialValue978 = recovery$indy$flow$1521(initialized974, initialValue977);
                java.lang.Object initialValue979 = recovery$indy$flow$1522(initialValue978, "StartTick");
                java.lang.Object initialValue980 = recovery$indy$flow$1523(initialValue979);
                java.lang.StringBuilder initialized981 = new java.lang.StringBuilder();
                java.lang.Object initialValue982 = initialValue913;
                java.lang.Object initialValue983 = ((java.lang.Object)(((net.C_47w7) (((java.lang.Object)(initialValue982))))));
                java.lang.Object initialValue984 = recovery$indy$flow$1527(initialValue983);
                java.lang.Object initialValue985 = recovery$indy$flow$1528(initialized981, initialValue984);
                java.lang.Object initialValue986 = recovery$indy$flow$1529(initialValue985, "EndTick");
                java.lang.Object initialValue987 = recovery$indy$flow$1530(initialValue986);
                net.C_47TU initialized988 = new net.C_47TU((client.module.Module) (loopLocal848), (java.lang.String) (initialValue980), (java.lang.String) (initialValue987), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue929), loopLocal863);
                java.lang.String initialValue989 = "EndTick";
                java.lang.String initialValue990 = "StartTick";
                long initialValue991 = loopLocal851;
                net.C_47TU initialValue992 = initialized988;
                java.lang.Object initialValue993 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue992))))));
                java.lang.Object initialValue994 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue990))))));
                java.lang.Object initialValue995 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue989))))));
                java.lang.Object initialValue996 = recovery$indy$flow$1535(initialValue993, initialValue991, initialValue994, initialValue995);
                java.lang.Object initialValue997 = recovery$indy$flow$1536(initialValue913);
                long initialValue998 = loopLocal850;
                java.lang.Object initialValue999 = initialValue997;
                java.lang.Object initialValue1000 = initialValue996;
                java.lang.Object initialValue1001 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue1000))))));
                java.lang.Object initialValue1002 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue999))))));
                java.lang.Object initialValue1003 = recovery$indy$flow$1539(initialValue1001, initialValue1002, initialValue998);
                java.lang.Object initialValue1004 = initialValue1003;
                java.lang.Object initialValue1005 = initialValue913;
                java.lang.Object initialValue1006 = ((java.lang.Object)(((net.C_47w7) (((java.lang.Object)(initialValue1005))))));
                java.lang.Object initialValue1007 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue1004))))));
                java.lang.Object initialValue1008 = recovery$indy$flow$1542(initialValue1006, initialValue1007);
                java.lang.StringBuilder initialized1009 = new java.lang.StringBuilder();
                java.lang.Object initialValue1010 = initialValue913;
                java.lang.Object initialValue1011 = ((java.lang.Object)(((net.C_47w7) (((java.lang.Object)(initialValue1010))))));
                java.lang.Object initialValue1012 = recovery$indy$flow$1547(initialValue1011);
                java.lang.Object initialValue1013 = recovery$indy$flow$1548(initialized1009, initialValue1012);
                java.lang.Object initialValue1014 = recovery$indy$flow$1549(initialValue1013, "CancelCondition");
                java.lang.Object initialValue1015 = recovery$indy$flow$1550(initialValue1014);
                java.lang.Object initialValue1016 = recovery$indy$flow$1551(3);
                ((java.lang.Object[]) initialValue1016)[0] = "Always";
                ((java.lang.Object[]) initialValue1016)[1] = "OnlyOnGround";
                ((java.lang.Object[]) initialValue1016)[2] = "OnlyInAir";
                client.setting.ModeSetting initialized1017 = new client.setting.ModeSetting((client.module.Module) (loopLocal848), (java.lang.String) (initialValue1015), "Always", (java.lang.String[]) (initialValue1016), (client.setting.SettingGroup) (initialValue929), loopLocal854);
                java.lang.String initialValue1018 = "CancelCondition";
                long initialValue1019 = loopLocal859;
                client.setting.ModeSetting initialValue1020 = initialized1017;
                java.lang.Object initialValue1021 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue1020))))));
                java.lang.Object initialValue1022 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue1018))))));
                java.lang.Object initialValue1023 = recovery$indy$flow$1555(initialValue1021, initialValue1019, initialValue1022);
                java.lang.Object initialValue1024 = initialValue1023;
                java.lang.Object initialValue1025 = initialValue913;
                java.lang.Object initialValue1026 = ((java.lang.Object)(((net.C_47w7) (((java.lang.Object)(initialValue1025))))));
                java.lang.Object initialValue1027 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue1024))))));
                java.lang.Object initialValue1028 = recovery$indy$flow$1558(initialValue1026, initialValue1027);
                int incremented1029 = loopLocal870 + (1);
                if (loopLocal867 == null) {
                    Disabler_47kt loopNext1030 = loopLocal848;
                    long loopNext1031 = loopLocal849;
                    long loopNext1032 = loopLocal850;
                    long loopNext1033 = loopLocal851;
                    long loopNext1034 = loopLocal852;
                    long loopNext1035 = loopLocal853;
                    long loopNext1036 = loopLocal854;
                    int loopNext1037 = loopLocal855;
                    int loopNext1038 = loopLocal856;
                    int loopNext1039 = loopLocal857;
                    long loopNext1040 = loopLocal858;
                    long loopNext1041 = loopLocal859;
                    int loopNext1042 = loopLocal860;
                    int loopNext1043 = loopLocal861;
                    int loopNext1044 = loopLocal862;
                    long loopNext1045 = loopLocal863;
                    int loopNext1046 = loopLocal864;
                    int loopNext1047 = loopLocal865;
                    int loopNext1048 = loopLocal866;
                    java.lang.Object loopNext1049 = loopLocal867;
                    java.lang.Object loopNext1050 = loopLocal868;
                    int loopNext1051 = loopLocal869;
                    int loopNext1052 = incremented1029;
                    loopLocal848 = loopNext1030;
                    loopLocal849 = loopNext1031;
                    loopLocal850 = loopNext1032;
                    loopLocal851 = loopNext1033;
                    loopLocal852 = loopNext1034;
                    loopLocal853 = loopNext1035;
                    loopLocal854 = loopNext1036;
                    loopLocal855 = loopNext1037;
                    loopLocal856 = loopNext1038;
                    loopLocal857 = loopNext1039;
                    loopLocal858 = loopNext1040;
                    loopLocal859 = loopNext1041;
                    loopLocal860 = loopNext1042;
                    loopLocal861 = loopNext1043;
                    loopLocal862 = loopNext1044;
                    loopLocal863 = loopNext1045;
                    loopLocal864 = loopNext1046;
                    loopLocal865 = loopNext1047;
                    loopLocal866 = loopNext1048;
                    loopLocal867 = loopNext1049;
                    loopLocal868 = loopNext1050;
                    loopLocal869 = loopNext1051;
                    loopLocal870 = loopNext1052;
                    continue loop871;
                } else {
                    Disabler_47kt loopNext1053 = loopLocal848;
                    long loopNext1054 = loopLocal849;
                    long loopNext1055 = loopLocal850;
                    long loopNext1056 = loopLocal851;
                    long loopNext1057 = loopLocal852;
                    long loopNext1058 = loopLocal853;
                    long loopNext1059 = loopLocal854;
                    int loopNext1060 = loopLocal855;
                    int loopNext1061 = loopLocal856;
                    int loopNext1062 = loopLocal857;
                    long loopNext1063 = loopLocal858;
                    long loopNext1064 = loopLocal859;
                    int loopNext1065 = loopLocal860;
                    int loopNext1066 = loopLocal861;
                    int loopNext1067 = loopLocal862;
                    long loopNext1068 = loopLocal863;
                    int loopNext1069 = loopLocal864;
                    int loopNext1070 = loopLocal865;
                    int loopNext1071 = loopLocal866;
                    java.lang.Object loopNext1072 = loopLocal867;
                    loopExit872 = loopNext1053;
                    loopExit873 = loopNext1054;
                    loopExit874 = loopNext1055;
                    loopExit875 = loopNext1056;
                    loopExit876 = loopNext1057;
                    loopExit877 = loopNext1058;
                    loopExit878 = loopNext1059;
                    loopExit879 = loopNext1060;
                    loopExit880 = loopNext1061;
                    loopExit881 = loopNext1062;
                    loopExit882 = loopNext1063;
                    loopExit883 = loopNext1064;
                    loopExit884 = loopNext1065;
                    loopExit885 = loopNext1066;
                    loopExit886 = loopNext1067;
                    loopExit887 = loopNext1068;
                    loopExit888 = loopNext1069;
                    loopExit889 = loopNext1070;
                    loopExit890 = loopNext1071;
                    loopExit891 = loopNext1072;
                    break loop871;
                }
            }
        }
        java.lang.Object initialValue1073 = recovery$indy$flow$1559();
        java.lang.Object initialValue1074 = initialValue1073;
        int length1075 = java.lang.reflect.Array.getLength(initialValue1074);
        int initialValue1076 = length1075;
        int initialValue1077 = 0;
        Disabler_47kt loopLocal1078 = loopExit872;
        long loopLocal1079 = loopExit873;
        long loopLocal1080 = loopExit874;
        long loopLocal1081 = loopExit875;
        long loopLocal1082 = loopExit876;
        long loopLocal1083 = loopExit877;
        long loopLocal1084 = loopExit878;
        int loopLocal1085 = loopExit879;
        int loopLocal1086 = loopExit880;
        int loopLocal1087 = loopExit881;
        long loopLocal1088 = loopExit882;
        long loopLocal1089 = loopExit883;
        int loopLocal1090 = loopExit884;
        int loopLocal1091 = loopExit885;
        int loopLocal1092 = loopExit886;
        long loopLocal1093 = loopExit887;
        int loopLocal1094 = loopExit888;
        int loopLocal1095 = loopExit889;
        int loopLocal1096 = loopExit890;
        java.lang.Object loopLocal1097 = loopExit891;
        java.lang.Object loopLocal1098 = initialValue1074;
        int loopLocal1099 = initialValue1076;
        int loopLocal1100 = initialValue1077;
        loop1101: while (true) {
            if (loopLocal1100 >= loopLocal1099) {
                break loop1101;
            } else {
                java.lang.Object arrayValue1102 = ((java.lang.Object[]) loopLocal1098)[loopLocal1100];
                java.lang.Object initialValue1103 = arrayValue1102;
                java.lang.Object initialValue1104 = initialValue1103;
                java.lang.Object initialValue1105 = ((java.lang.Object)(((net.C_46k) (((java.lang.Object)(initialValue1104))))));
                java.lang.Object initialValue1106 = recovery$indy$flow$1562(initialValue1105);
                java.lang.Object initialValue1107 = ((java.lang.Object)(((augustus.recovered.modules.misc.Disabler_47kt) (((java.lang.Object)(loopLocal1078)))).settingDetailedPackets));
                client.setting.SettingGroup initialized1108 = new client.setting.SettingGroup(loopLocal1083, (client.module.Module) (loopLocal1078), (java.lang.String) (initialValue1106), (client.setting.SettingGroup) (initialValue1107));
                java.lang.Object initialValue1109 = recovery$indy$flow$1565(initialValue1103);
                char converted1110 = (char) (loopLocal1095);
                java.lang.Object initialValue1111 = initialValue1109;
                int initialValue1112 = loopLocal1096;
                int initialValue1113 = (int) (converted1110);
                int initialValue1114 = loopLocal1094;
                client.setting.SettingGroup initialValue1115 = initialized1108;
                java.lang.Object initialValue1116 = ((java.lang.Object)(((client.setting.SettingGroup) (((java.lang.Object)(initialValue1115))))));
                java.lang.Object initialValue1117 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue1111))))));
                java.lang.Object initialValue1118 = recovery$indy$flow$1568(initialValue1116, initialValue1114, (char) (initialValue1113), initialValue1112, initialValue1117);
                java.lang.Object initialValue1119 = initialValue1118;
                java.lang.StringBuilder initialized1120 = new java.lang.StringBuilder();
                java.lang.Object initialValue1121 = initialValue1103;
                java.lang.Object initialValue1122 = ((java.lang.Object)(((net.C_46k) (((java.lang.Object)(initialValue1121))))));
                java.lang.Object initialValue1123 = recovery$indy$flow$1573(initialValue1122);
                java.lang.Object initialValue1124 = recovery$indy$flow$1574(initialized1120, initialValue1123);
                java.lang.Object initialValue1125 = recovery$indy$flow$1575(initialValue1124, "Interval");
                java.lang.Object initialValue1126 = recovery$indy$flow$1576(initialValue1125);
                client.setting.NumberSetting initialized1127 = new client.setting.NumberSetting((client.module.Module) (loopLocal1078), (java.lang.String) (initialValue1126), 0.0D, 0.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue1119), loopLocal1088);
                short converted1128 = (short) (loopLocal1092);
                int initialValue1129 = (int) (converted1128);
                int initialValue1130 = loopLocal1091;
                java.lang.String initialValue1131 = "Interval";
                int initialValue1132 = loopLocal1090;
                client.setting.NumberSetting initialValue1133 = initialized1127;
                java.lang.Object initialValue1134 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue1133))))));
                java.lang.Object initialValue1135 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue1131))))));
                java.lang.Object initialValue1136 = recovery$indy$flow$1580(initialValue1134, initialValue1132, initialValue1135, initialValue1130, (short) (initialValue1129));
                java.lang.Object initialValue1137 = initialValue1136;
                java.lang.Object initialValue1138 = initialValue1103;
                java.lang.Object initialValue1139 = ((java.lang.Object)(((net.C_46k) (((java.lang.Object)(initialValue1138))))));
                java.lang.Object initialValue1140 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue1137))))));
                java.lang.Object initialValue1141 = recovery$indy$flow$1583(initialValue1139, initialValue1140);
                java.lang.StringBuilder initialized1142 = new java.lang.StringBuilder();
                java.lang.Object initialValue1143 = initialValue1103;
                java.lang.Object initialValue1144 = ((java.lang.Object)(((net.C_46k) (((java.lang.Object)(initialValue1143))))));
                java.lang.Object initialValue1145 = recovery$indy$flow$1588(initialValue1144);
                java.lang.Object initialValue1146 = recovery$indy$flow$1589(initialized1142, initialValue1145);
                java.lang.Object initialValue1147 = recovery$indy$flow$1590(initialValue1146, "Always");
                java.lang.Object initialValue1148 = recovery$indy$flow$1591(initialValue1147);
                short converted1149 = (short) (loopLocal1085);
                char converted1150 = (char) (loopLocal1086);
                client.setting.BooleanSetting initialized1151 = new client.setting.BooleanSetting((client.module.Module) (loopLocal1078), (java.lang.String) (initialValue1148), converted1149, converted1150, loopLocal1087, true, (client.setting.SettingGroup) (initialValue1119));
                long initialValue1152 = loopLocal1082;
                java.lang.String initialValue1153 = "Always";
                client.setting.BooleanSetting initialValue1154 = initialized1151;
                java.lang.Object initialValue1155 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue1154))))));
                java.lang.Object initialValue1156 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue1153))))));
                java.lang.Object initialValue1157 = recovery$indy$flow$1595(initialValue1155, initialValue1156, initialValue1152);
                java.lang.Object initialValue1158 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue1157))))));
                java.lang.Object initialValue1159 = initialValue1158;
                java.lang.Object initialValue1160 = initialValue1103;
                java.lang.Object initialValue1161 = ((java.lang.Object)(((net.C_46k) (((java.lang.Object)(initialValue1160))))));
                java.lang.Object initialValue1162 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue1159))))));
                java.lang.Object initialValue1163 = recovery$indy$flow$1599(initialValue1161, initialValue1162);
                java.lang.StringBuilder initialized1164 = new java.lang.StringBuilder();
                java.lang.Object initialValue1165 = initialValue1103;
                java.lang.Object initialValue1166 = ((java.lang.Object)(((net.C_46k) (((java.lang.Object)(initialValue1165))))));
                java.lang.Object initialValue1167 = recovery$indy$flow$1604(initialValue1166);
                java.lang.Object initialValue1168 = recovery$indy$flow$1605(initialized1164, initialValue1167);
                java.lang.Object initialValue1169 = recovery$indy$flow$1606(initialValue1168, "StartTick");
                java.lang.Object initialValue1170 = recovery$indy$flow$1607(initialValue1169);
                java.lang.StringBuilder initialized1171 = new java.lang.StringBuilder();
                java.lang.Object initialValue1172 = initialValue1103;
                java.lang.Object initialValue1173 = ((java.lang.Object)(((net.C_46k) (((java.lang.Object)(initialValue1172))))));
                java.lang.Object initialValue1174 = recovery$indy$flow$1611(initialValue1173);
                java.lang.Object initialValue1175 = recovery$indy$flow$1612(initialized1171, initialValue1174);
                java.lang.Object initialValue1176 = recovery$indy$flow$1613(initialValue1175, "EndTick");
                java.lang.Object initialValue1177 = recovery$indy$flow$1614(initialValue1176);
                net.C_47TU initialized1178 = new net.C_47TU((client.module.Module) (loopLocal1078), (java.lang.String) (initialValue1170), (java.lang.String) (initialValue1177), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0.0D, Double.longBitsToDouble(4636737291354636288L), 0, (client.setting.SettingGroup) (initialValue1119), loopLocal1093);
                java.lang.String initialValue1179 = "EndTick";
                java.lang.String initialValue1180 = "StartTick";
                long initialValue1181 = loopLocal1081;
                net.C_47TU initialValue1182 = initialized1178;
                java.lang.Object initialValue1183 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue1182))))));
                java.lang.Object initialValue1184 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue1180))))));
                java.lang.Object initialValue1185 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue1179))))));
                java.lang.Object initialValue1186 = recovery$indy$flow$1619(initialValue1183, initialValue1181, initialValue1184, initialValue1185);
                java.lang.Object initialValue1187 = recovery$indy$flow$1620(initialValue1103);
                long initialValue1188 = loopLocal1080;
                java.lang.Object initialValue1189 = initialValue1187;
                java.lang.Object initialValue1190 = initialValue1186;
                java.lang.Object initialValue1191 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue1190))))));
                java.lang.Object initialValue1192 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue1189))))));
                java.lang.Object initialValue1193 = recovery$indy$flow$1623(initialValue1191, initialValue1192, initialValue1188);
                java.lang.Object initialValue1194 = initialValue1193;
                java.lang.Object initialValue1195 = initialValue1103;
                java.lang.Object initialValue1196 = ((java.lang.Object)(((net.C_46k) (((java.lang.Object)(initialValue1195))))));
                java.lang.Object initialValue1197 = ((java.lang.Object)(((net.C_47TU) (((java.lang.Object)(initialValue1194))))));
                java.lang.Object initialValue1198 = recovery$indy$flow$1626(initialValue1196, initialValue1197);
                java.lang.StringBuilder initialized1199 = new java.lang.StringBuilder();
                java.lang.Object initialValue1200 = initialValue1103;
                java.lang.Object initialValue1201 = ((java.lang.Object)(((net.C_46k) (((java.lang.Object)(initialValue1200))))));
                java.lang.Object initialValue1202 = recovery$indy$flow$1631(initialValue1201);
                java.lang.Object initialValue1203 = recovery$indy$flow$1632(initialized1199, initialValue1202);
                java.lang.Object initialValue1204 = recovery$indy$flow$1633(initialValue1203, "CancelCondition");
                java.lang.Object initialValue1205 = recovery$indy$flow$1634(initialValue1204);
                java.lang.Object initialValue1206 = recovery$indy$flow$1635(3);
                ((java.lang.Object[]) initialValue1206)[0] = "Always";
                ((java.lang.Object[]) initialValue1206)[1] = "OnlyOnGround";
                ((java.lang.Object[]) initialValue1206)[2] = "OnlyInAir";
                client.setting.ModeSetting initialized1207 = new client.setting.ModeSetting((client.module.Module) (loopLocal1078), (java.lang.String) (initialValue1205), "Always", (java.lang.String[]) (initialValue1206), (client.setting.SettingGroup) (initialValue1119), loopLocal1084);
                java.lang.String initialValue1208 = "CancelCondition";
                long initialValue1209 = loopLocal1089;
                client.setting.ModeSetting initialValue1210 = initialized1207;
                java.lang.Object initialValue1211 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue1210))))));
                java.lang.Object initialValue1212 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue1208))))));
                java.lang.Object initialValue1213 = recovery$indy$flow$1639(initialValue1211, initialValue1209, initialValue1212);
                java.lang.Object initialValue1214 = initialValue1213;
                java.lang.Object initialValue1215 = initialValue1103;
                java.lang.Object initialValue1216 = ((java.lang.Object)(((net.C_46k) (((java.lang.Object)(initialValue1215))))));
                java.lang.Object initialValue1217 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue1214))))));
                java.lang.Object initialValue1218 = recovery$indy$flow$1642(initialValue1216, initialValue1217);
                int incremented1219 = loopLocal1100 + (1);
                if (loopLocal1097 == null) {
                    Disabler_47kt loopNext1220 = loopLocal1078;
                    long loopNext1221 = loopLocal1079;
                    long loopNext1222 = loopLocal1080;
                    long loopNext1223 = loopLocal1081;
                    long loopNext1224 = loopLocal1082;
                    long loopNext1225 = loopLocal1083;
                    long loopNext1226 = loopLocal1084;
                    int loopNext1227 = loopLocal1085;
                    int loopNext1228 = loopLocal1086;
                    int loopNext1229 = loopLocal1087;
                    long loopNext1230 = loopLocal1088;
                    long loopNext1231 = loopLocal1089;
                    int loopNext1232 = loopLocal1090;
                    int loopNext1233 = loopLocal1091;
                    int loopNext1234 = loopLocal1092;
                    long loopNext1235 = loopLocal1093;
                    int loopNext1236 = loopLocal1094;
                    int loopNext1237 = loopLocal1095;
                    int loopNext1238 = loopLocal1096;
                    java.lang.Object loopNext1239 = loopLocal1097;
                    java.lang.Object loopNext1240 = loopLocal1098;
                    int loopNext1241 = loopLocal1099;
                    int loopNext1242 = incremented1219;
                    loopLocal1078 = loopNext1220;
                    loopLocal1079 = loopNext1221;
                    loopLocal1080 = loopNext1222;
                    loopLocal1081 = loopNext1223;
                    loopLocal1082 = loopNext1224;
                    loopLocal1083 = loopNext1225;
                    loopLocal1084 = loopNext1226;
                    loopLocal1085 = loopNext1227;
                    loopLocal1086 = loopNext1228;
                    loopLocal1087 = loopNext1229;
                    loopLocal1088 = loopNext1230;
                    loopLocal1089 = loopNext1231;
                    loopLocal1090 = loopNext1232;
                    loopLocal1091 = loopNext1233;
                    loopLocal1092 = loopNext1234;
                    loopLocal1093 = loopNext1235;
                    loopLocal1094 = loopNext1236;
                    loopLocal1095 = loopNext1237;
                    loopLocal1096 = loopNext1238;
                    loopLocal1097 = loopNext1239;
                    loopLocal1098 = loopNext1240;
                    loopLocal1099 = loopNext1241;
                    loopLocal1100 = loopNext1242;
                    continue loop1101;
                } else {
                    break loop1101;
                }
            }
        }
        return;
    }























    private static native java.lang.reflect.Method c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field c(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);
    private static native void recovery$indy$flow$976(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$980(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$982();

    private static native void recovery$indy$flow$985(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$989(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$991();

    private static native void recovery$indy$flow$994(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$998(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1000();

    private static native void recovery$indy$flow$1003(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1005();

    private static native void recovery$indy$flow$1008(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1011(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1013();

    private static java.lang.Object recovery$indy$flow$1016(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1017(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1020(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1021(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1022();

    private static java.lang.Object recovery$indy$flow$1026(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1027(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1030(java.lang.Object a0,java.lang.Object a1,long a2);
    private static native void recovery$indy$flow$1031(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1034(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$1038(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1044(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1047(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1048(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1051(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1053(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1059(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1062(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1063(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1066(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1068(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1074(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1077(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1078(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1081(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1083(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$1087(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1093(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1096(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1097(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1100(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1102(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1108(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1111(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1112(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1115(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1117(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1123(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1126(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1127(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1130(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1132(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$1136(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1142(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1145(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1146(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1149(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1151(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1157(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1160(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1161(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1164(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1166(java.lang.Object a0,java.lang.Object a1);



    private static native java.lang.Object recovery$indy$flow$1172(java.lang.Object a0,java.lang.Object a1,long a2);


    private static java.lang.Object recovery$indy$flow$1175(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1176(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1179(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1181(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1184(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1187(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1190(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1193(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1196(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1199(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1202(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1206(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$1208(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1209(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1212(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1213(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1217(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$1219(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1220(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1223(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1224(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1228(java.lang.Object a0,long a1);

    private static java.lang.Object recovery$indy$flow$1230(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1231(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1234(java.lang.Object a0,int a1,java.lang.Object a2,long a3);
    private static native void recovery$indy$flow$1235(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1238(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1241(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1244(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1247(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$1251(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1252(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1255(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$1257(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1260(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1262(int a0);

    private static java.lang.Object recovery$indy$flow$1265(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1266(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1269(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1270(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$1274(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$1275(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1278(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1279(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1282(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1285(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1286(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Disabler_47kt) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$1287(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.Disabler_47kt) (a0)).field_438 = a1;
        return;
    }
    private static void recovery$indy$flow$1288(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.Disabler_47kt) (a0)).field_43v = a1;
        return;
    }
    private static native void recovery$indy$flow$1291(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1292(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.Disabler_47kt) (a0)).field_43P = a1;
        return;
    }
    private static void recovery$indy$flow$1293(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.Disabler_47kt) (a0)).field_43u = a1;
        return;
    }
    private static native void recovery$indy$flow$1296(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1299(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$1302(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$1303(java.lang.Object a0,boolean a1) {
        ((augustus.recovered.modules.misc.Disabler_47kt) (a0)).field_43a = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$1304();

    private static native java.lang.Object recovery$indy$flow$1307(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$1310(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1313(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);

    private static native java.lang.Object recovery$indy$flow$1318(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1319(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1320(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1321(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$1325(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);


    private static native java.lang.Object recovery$indy$flow$1328(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1333(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1334(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1335(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1336(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$1340(java.lang.Object a0,java.lang.Object a1,long a2);



    private static native java.lang.Object recovery$indy$flow$1344(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1349(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1350(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1351(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1352(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }

    private static native java.lang.Object recovery$indy$flow$1356(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1357(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1358(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1359(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }



    private static native java.lang.Object recovery$indy$flow$1364(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$1365(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1368(java.lang.Object a0,java.lang.Object a1,long a2);


    private static native java.lang.Object recovery$indy$flow$1371(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1376(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1377(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1378(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1379(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native java.lang.Object recovery$indy$flow$1380(int a0);


    private static native java.lang.Object recovery$indy$flow$1384(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$1387(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1388(int a0);
    private static java.lang.Object recovery$indy$flow$1389(java.lang.Object a0) {
        return ((java.lang.String[]) (a0));
    }
    private static native void recovery$indy$flow$1390(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$1391();

    private static native java.lang.Object recovery$indy$flow$1394(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$1397(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1400(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);

    private static native java.lang.Object recovery$indy$flow$1405(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1406(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1407(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1408(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$1412(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);


    private static native java.lang.Object recovery$indy$flow$1415(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1420(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1421(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1422(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1423(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$1427(java.lang.Object a0,java.lang.Object a1,long a2);



    private static native java.lang.Object recovery$indy$flow$1431(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1436(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1437(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1438(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1439(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }

    private static native java.lang.Object recovery$indy$flow$1443(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1444(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1445(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1446(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }



    private static native java.lang.Object recovery$indy$flow$1451(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$1452(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1455(java.lang.Object a0,java.lang.Object a1,long a2);


    private static native java.lang.Object recovery$indy$flow$1458(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1463(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1464(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1465(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1466(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native java.lang.Object recovery$indy$flow$1467(int a0);


    private static native java.lang.Object recovery$indy$flow$1471(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$1474(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1475();

    private static native java.lang.Object recovery$indy$flow$1478(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$1481(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1484(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);

    private static native java.lang.Object recovery$indy$flow$1489(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1490(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1491(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1492(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$1496(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);


    private static native java.lang.Object recovery$indy$flow$1499(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1504(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1505(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1506(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1507(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$1511(java.lang.Object a0,java.lang.Object a1,long a2);



    private static native java.lang.Object recovery$indy$flow$1515(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1520(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1521(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1522(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1523(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }

    private static native java.lang.Object recovery$indy$flow$1527(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1528(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1529(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1530(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }



    private static native java.lang.Object recovery$indy$flow$1535(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$1536(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1539(java.lang.Object a0,java.lang.Object a1,long a2);


    private static native java.lang.Object recovery$indy$flow$1542(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1547(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1548(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1549(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1550(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native java.lang.Object recovery$indy$flow$1551(int a0);


    private static native java.lang.Object recovery$indy$flow$1555(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$1558(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$1559();

    private static native java.lang.Object recovery$indy$flow$1562(java.lang.Object a0);

    private static native java.lang.Object recovery$indy$flow$1565(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1568(java.lang.Object a0,int a1,char a2,int a3,java.lang.Object a4);

    private static native java.lang.Object recovery$indy$flow$1573(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1574(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1575(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1576(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$1580(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);


    private static native java.lang.Object recovery$indy$flow$1583(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1588(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1589(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1590(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1591(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native java.lang.Object recovery$indy$flow$1595(java.lang.Object a0,java.lang.Object a1,long a2);



    private static native java.lang.Object recovery$indy$flow$1599(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1604(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1605(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1606(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1607(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }

    private static native java.lang.Object recovery$indy$flow$1611(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1612(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1613(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1614(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }



    private static native java.lang.Object recovery$indy$flow$1619(java.lang.Object a0,long a1,java.lang.Object a2,java.lang.Object a3);
    private static native java.lang.Object recovery$indy$flow$1620(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$1623(java.lang.Object a0,java.lang.Object a1,long a2);


    private static native java.lang.Object recovery$indy$flow$1626(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$1631(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$1632(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1633(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$1634(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native java.lang.Object recovery$indy$flow$1635(int a0);


    private static native java.lang.Object recovery$indy$flow$1639(java.lang.Object a0,long a1,java.lang.Object a2);


    private static native java.lang.Object recovery$indy$flow$1642(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native MethodHandle recovery$constant$1();
   private static native C_473U recovery$indy$2(Object var0, long var1, long var3);
   private static native boolean recovery$indy$3(Object var0, long var1, Object var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native void recovery$indy$7(Object var0, int var1, long var2, long var4);
   private static native int[] recovery$indy$8(long var0, long var2);
   private static native boolean recovery$indy$9(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$11(Object var0, long var1, long var3);
   private static native boolean recovery$indy$12(Object var0, long var1, long var3);
   private static native Client recovery$indy$13(long var0, long var2);
   private static native ModuleManager recovery$indy$14(Object var0, long var1, long var3);
   private static native boolean recovery$indy$15(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$16(Object var0, long var1, long var3);
   private static native boolean recovery$indy$17(long var0, long var2, long var4);
   private static native boolean recovery$indy$18(Object var0, long var1, long var3);
   private static native int[] recovery$indy$19(long var0, long var2);
   private static native C_473U recovery$indy$20(Object var0, long var1, long var3);
   private static native boolean recovery$indy$21(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$22(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$23(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$24(Object var0, long var1, long var3);
   private static native boolean recovery$indy$25(Object var0, long var1, long var3);
   private static native boolean recovery$indy$26(Object var0, long var1, long var3);
   private static native Consumer recovery$indy$27();
   private static native void recovery$indy$28(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$29(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$30(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$31(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$32(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$33(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$34(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$35(Object var0, int var1, long var2, long var4, long var6);
   private static native Consumer recovery$indy$36();
   private static native double recovery$indy$37(Object var0, long var1, long var3);
   private static native double recovery$indy$38(Object var0, long var1, long var3);
   private static native double recovery$indy$39(Object var0, long var1, long var3);
   private static native void recovery$indy$40(Object var0, long var1, long var3);
}
