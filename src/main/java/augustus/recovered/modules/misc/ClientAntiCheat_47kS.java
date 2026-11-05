package augustus.recovered.modules.misc;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_45n;
import net.C_471j;
import net.C_472A;
import net.C_472H;
import net.C_472T;
import net.C_472_;
import net.C_472l;
import net.C_472n;
import net.C_477z;
import net.C_47Az;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47F9;
import net.C_47Ij;
import net.minecraft.entity.Entity;
import client.module.Module;
import client.setting.SettingGroup;
import client.setting.BooleanSetting;
import client.setting.Setting;
import net.C_47U0;
import net.C_47VO;
import net.C_47Vc;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.C_47f0;
import net.C_47f1;
import net.C_47f2;
import net.C_47f3;
import net.C_47f4;
import net.C_47f5;
import net.C_47f7;
import net.C_47f8;
import net.C_47f9;
import net.C_47fA;
import net.C_47fB;
import net.C_47fC;
import net.C_47fD;
import net.C_47fE;
import net.C_47fF;
import net.C_47fG;
import net.C_47fI;
import net.C_47fJ;
import net.C_47fK;
import net.C_47fL;
import net.C_47fM;
import net.C_47fN;
import net.C_47fO;
import net.C_47fQ;
import net.C_47fR;
import net.C_47fS;
import net.C_47fT;
import net.C_47fV;
import net.C_47fW;
import net.C_47fX;
import net.C_47fY;
import net.C_47fZ;
import net.C_47f_;
import net.C_47fa;
import net.C_47fb;
import net.C_47fc;
import net.C_47fe;
import net.C_47ff;
import net.C_47fg;
import net.C_47fh;
import net.C_47fi;
import net.C_47fj;
import net.C_47fk;
import net.C_47fm;
import net.C_47fn;
import net.C_47fo;
import net.C_47fp;
import net.C_47fq;
import net.C_47fr;
import net.C_47fs;
import net.C_47ft;
import net.C_47fu;
import net.C_47fv;
import net.C_47fw;
import net.C_47fx;
import net.C_47fy;
import net.C_47fz;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47hi;
import net.C_47iC;
import net.C_47oO;
import net.C_47ob;
import net.C_47si;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

public class ClientAntiCheat_47kS extends Module implements C_47oO, C_47si, C_47U0, C_47hi, C_47Vc, RenderListener, C_47iC, C_47xz {
   private final C_471j field_47;
   private final HashMap field_46;
   private final ArrayList field_43h;
   private EntityLivingBase field_48;
   private static final long a = C_4f.a(5212771900476325538L, -2662586661640648491L, MethodHandles.lookup().lookupClass()).a(149439040907450L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final Object[] f = new Object[40];
   private static final String[] g = new String[40];

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native String b(int var0, long var1);

   private static native Class b(long var0, long var2);

   private static native Field b(Class var0, String var1, Class var2);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native String b(byte[] var0);

   private static boolean method_46$f0237134e9(C_472H var0) {
      long var1 = a ^ 73448605740019L;
      long var10000 = -6829581287482176396L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      boolean var4 = var0.field_45;
      if (var3 == null) {
         if (!var0.field_45) {
            var10000 = -6829902521851695138L;
            Client.method_44$fbc0c0be91().getClass();
            if (var3 == null) {
               return false;
            }
         }

         var4 = true;
      }

      return var4;
   }

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Field a(Class var0, String var1, Class var2);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   @Override
   public void method_42$0db73fbf69(long var1, C_47VO var3) {
   }

   @Override
   public void method_42$9035875d26(long var1, C_47ob var3) {
      recovery$indy$1(1534684012807429029L, var1).getClass();
   }

   private static native Method d(long var0, long var2);

   @Override
   public void method_41$9035875d26(long var1, C_47ob var3) {
      recovery$indy$2(-7192199095617973543L, var1).getClass();
   }

   @Override
   public void method_41$426c33b229(C_477z var1, long var2) {
      long var4 = var2 ^ 136013258849921L;
      int[] var6 = recovery$indy$3(8136896895495151008L, var2);
      if (this.field_47 != null && recovery$indy$4(var1, 8134182320365494671L, var2) instanceof EntityLivingBase) {
         C_47Ij var10000 = recovery$indy$5(field_43, 8137039043509881298L, var2);
         if (var6 == null) {
            if (var10000 == null) {
               return;
            }

            var10000 = recovery$indy$6(field_43, 8137039043509881298L, var2);
         }

         if (var10000.field_49 == C_47Az.ENTITY) {
            recovery$indy$8(this.field_47, var4, recovery$indy$7(var1, 8134182320365494671L, var2).method_49$8abf5c6871(), 8136986090729058602L, var2);
            recovery$indy$11(
               this.field_47,
               recovery$indy$9(field_43, 8134290403437657290L, var2)
                  .method_49$41b79b67a0(1.0F)
                  .method_43$3d77d36e13(recovery$indy$10(field_43, 8137039043509881298L, var2).field_45),
               8137284282986027230L,
               var2
            );
         }
      }
   }

   @Override
   public void method_41$0db73fbf69(long var1, C_47VO var3) {
      recovery$indy$12(-5079660504551508120L, var1).getClass();
   }

   @Override
   public void method_40$9035875d26(long var1, C_47ob var3) {
      recovery$indy$13(-4101798459857942022L, var1).getClass();
   }

   @Override
   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      recovery$indy$14(this.field_47, 3261715318946291077L, var5);
   }

   @Override
   public void method_47$05bd94f678(C_472n var1, long var2) {
      recovery$indy$15(6399466926668502566L, var2).getClass();
   }

   @Override
   public void onRender3D(long var1, float var3) {
      recovery$indy$16(8135248499796672015L, var1).getClass();
   }

   @Override
   public void method_45p$a6cfe74df2(short var1, long var2) {
      int var13;
      long var4 = (long)var1 << 48 | var2 << 16 >>> 16;
      long var10001 = var4 ^ 13140515937297L;
      int var6 = (int)((var4 ^ 13140515937297L) >>> 48);
      int var7 = (int)((var4 ^ 13140515937297L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      int var10 = 0;
      int[] var10000 = recovery$indy$17(5869718957667761209L, var4);
      Iterator var11 = recovery$indy$18(field_43, 5869524010426345493L, var4).field_44Q.iterator();
      int[] var9 = var10000;

      while (true) {
         label54:
         if (var11.hasNext()) {
            Entity var12 = (Entity)var11.next();
            var13 = var12.method_49$8abf5c6871();
            int[] var15 = var9;
            if (var1 >= 0) {
               if (var9 != null) {
                  break;
               }

               var15 = var9;
            }

            label51: {
               label64: {
                  if (var15 == null) {
                     if (var13 != recovery$indy$19(this.field_47, 5871264818687880547L, var4)) {
                        break label64;
                     }

                     var13 = 1;
                  }

                  var10 = var13;
                  var10000 = var9;
                  if (var1 < 0) {
                     break label51;
                  }

                  if (var9 == null) {
                     break label54;
                  }
               }

               var10000 = var9;
            }

            if (var10000 == null) {
               continue;
            }
         }

         if (var2 <= 0L) {
            return;
         }

         var13 = var10;
         break;
      }

      if (var13 == 0) {
         recovery$indy$20(this.field_47, 5869590640621986226L, var4);
      }

      recovery$indy$21(this.field_47, (short)var6, (short)var7, var8, 5871181877956880999L, var4);
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$22(this, 1, var5, -7099723104166724344L, var1);
      recovery$indy$23(this, 28, 20, var3, -7098931958846374440L, var1);
      recovery$indy$24(this, 21, 20, var3, -7098931958846374440L, var1);
      recovery$indy$25(this, 43, var5, -7099723104166724344L, var1);
      recovery$indy$26(this, 32, 10, var3, -7098931958846374440L, var1);
      recovery$indy$27(this, 26, var5, -7099723104166724344L, var1);
      recovery$indy$28(this, 40, var5, -7099723104166724344L, var1);
      recovery$indy$29(this, 17, var5, -7099723104166724344L, var1);
   }

   @Override
   public void method_48o$537c8d9634(int var1, short var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      recovery$indy$30(2183515600154890404L, var4).getClass();
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
      recovery$indy$31(-7740791775362344326L, var1).getClass();
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      recovery$indy$32(2730654391424101132L, var4).getClass();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public ClientAntiCheat_47kS(long var1, int var3) {
      super("ClientAntiCheat", "KundenAntiSchummel", (((var1 << 32 | (long)var3 << 32 >>> 32) ^ a) ^ 8845958084308L), new Color(78, 60, 102), Category.MISC);
      long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 124238426914802L;
      long var8 = var4 ^ 13619563908589L;
      long var10001 = var4 ^ 116637169309726L;
      int var10 = (int)((var4 ^ 116637169309726L) >>> 32);
      int var11 = (int)((var4 ^ 116637169309726L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var4 ^ 103893657932185L;
      var10001 = var4 ^ 54100383216628L;
      int var15 = (int)((var4 ^ 54100383216628L) >>> 32);
      int var16 = (int)((var4 ^ 54100383216628L) << 32 >>> 48);
      int var17 = (int)(var10001 << 48 >>> 48);
      var10001 = var4 ^ 16504589292606L;
      int var18 = (int)((var4 ^ 16504589292606L) >>> 48);
      int var19 = (int)((var4 ^ 16504589292606L) << 16 >>> 48);
      int var20 = (int)(var10001 << 32 >>> 32);
      long var21 = var4 ^ 89895024771584L;
      long var23 = var4 ^ 108904860907001L;
      long var25 = var4 ^ 48290264383883L;
      long var27 = var4 ^ 117221993212771L;
      long var29 = var4 ^ 1314981476937L;
      long var31 = (var4 ^ 125788276926832L) >>> 16;
      int var33 = (int)((var4 ^ 125788276926832L) << 48 >>> 48);
      long var34 = var4 ^ 135192504952567L;
      long var36 = var4 ^ 48748706136065L;
      var10001 = var4 ^ 87730420886728L;
      int var38 = (int)((var4 ^ 87730420886728L) >>> 32);
      int var39 = (int)((var4 ^ 87730420886728L) << 32 >>> 48);
      int var40 = (int)(var10001 << 48 >>> 48);
      var10001 = var4 ^ 87697317298515L;
      int var41 = (int)((var4 ^ 87697317298515L) >>> 48);
      int var42 = (int)((var4 ^ 87697317298515L) << 16 >>> 48);
      int var43 = (int)(var10001 << 32 >>> 32);
      long var44 = var4 ^ 122905158198801L;
      var10001 = var4 ^ 131930073615046L;
      int var46 = (int)((var4 ^ 131930073615046L) >>> 48);
      int var47 = (int)((var4 ^ 131930073615046L) << 16 >>> 48);
      int var48 = (int)(var10001 << 32 >>> 32);
      long var49 = (var4 ^ 34512457539179L) >>> 8;
      int var51 = (int)((var4 ^ 34512457539179L) << 56 >>> 56);
      long var52 = var4 ^ 36653932788098L;
      long var54 = var4 ^ 35993281433143L;
      long var56 = var4 ^ 46610290344767L;
      long var58 = var4 ^ 17761013481412L;
      long var60 = var4 ^ 50523432475839L;
      long var62 = var4 ^ 128687654303353L;
      long var64 = var4 ^ 125308770757986L;
      var10001 = var4 ^ 139917198569401L;
      int var66 = (int)((var4 ^ 139917198569401L) >>> 48);
      int var67 = (int)((var4 ^ 139917198569401L) << 16 >>> 48);
      int var68 = (int)(var10001 << 32 >>> 32);
      long var69 = var4 ^ 27637117810554L;
      var10001 = var4 ^ 22638473069861L;
      int var71 = (int)((var4 ^ 22638473069861L) >>> 56);
      int var72 = (int)((var4 ^ 22638473069861L) << 8 >>> 32);
      int var73 = (int)(var10001 << 40 >>> 40);
      long var74 = var4 ^ 96971186553109L;
      long var76 = var4 ^ 54325421305802L;
      long var78 = var4 ^ 23704537459295L;
      long var80 = var4 ^ 96573602398922L;
      long var82 = var4 ^ 133822504227440L;
      long var84 = var4 ^ 8845958084308L;
      // Super arguments moved to the required Java constructor position.
      this.field_47 = new C_471j(var13);
      this.field_46 = new HashMap();
      this.field_43h = new ArrayList();
      this.field_48 = null;
      this.field_43h.add(new C_472T(var74, "Intave13P_19", this.field_47));
      this.field_43h.add(new C_472A("Intave13P_56", (short)var66, (char)var67, this.field_47, var68));
      this.field_43h.add(new C_47fF("Intave14P_41", this.field_47, var54));
      this.field_43h.add(new C_47ft("Intave14P_51", var44, this.field_47));
      this.field_43h.add(new C_47fv(var76, "Intave14P_71", this.field_47));
      this.field_43h.add(new C_47fj("Intave14P_81", var21, this.field_47));
      this.field_43h.add(new C_47fh("Intave14P_82", this.field_47, var60));
      this.field_43h.add(new C_47fs("Intave14P_83", var49, this.field_47, (byte)var51));
      this.field_43h.add(new C_47f2(var25, "Intave14P_84", this.field_47));
      this.field_43h.add(new C_47ff("Intave14P_85", this.field_47, var56));
      this.field_43h.add(new C_47f8("Intave14P_86", var36, this.field_47));
      this.field_43h.add(new C_47fc("Intave14P_91", this.field_47, var52));
      this.field_43h.add(new C_47fg(var31, (short)var33, "Intave14P_92", this.field_47));
      this.field_43h.add(new C_47fp("Intave14PostBlockPlaceCheck", (char)var46, this.field_47, (short)var47, var48));
      this.field_43h.add(new C_47f9("Intave14TimeBlockPlaceCheck", var27, this.field_47, true));
      this.field_43h.add(new C_47f1("Intave14InvalidBlockPlace", var80, this.field_47));
      this.field_43h.add(new C_47fL("Intave14RotationBlockCheck", var10, (short)var11, (short)var12, this.field_47));
      this.field_43h.add(new C_47fb("Intave14ACInvariant", this.field_47));
      this.field_43h.add(new C_47fe("Intave14ACRelative", this.field_47));
      this.field_43h.add(new C_47fG("Intave14ACSpike", this.field_47));
      this.field_43h.add(new C_47fD("Intave14ACVariance", this.field_47));
      this.field_43h.add(new C_472l("Intave14ACLowDeviation", this.field_47, var29));
      this.field_43h.add(new C_472_(var78, "Intave14ACDoubleClick", this.field_47));
      this.field_43h.add(new C_47fV("Intave14P_131", this.field_47, var8));
      this.field_43h.add(new C_47fi("Intave14InventoryAnalysis", this.field_47));
      this.field_43h.add(new C_47fo("Intave14InventoryWalking", this.field_47));
      this.field_43h.add(new C_47f4("Intave14InventorySlot", this.field_47));
      this.field_43h.add(new C_47fS("Intave14P_200", var64, this.field_47));
      this.field_43h.add(new C_47fr("Intave14P141_144", var82, this.field_47));
      this.field_43h.add(new C_47fY("Intave14P_231", (short)var41, (char)var42, var43, this.field_47));
      this.field_43h.add(new C_47f3(var15, "Intave14InvalidPitch", (short)var16, this.field_47, (char)var17));
      this.field_43h.add(new C_47fy(var62, "Intave14InventorySlotDupe", this.field_47));
      this.field_43h.add(new C_47fu("Intave14Timer", this.field_47));
      this.field_43h.add(new C_47fw("AutoClickerP1", this.field_47));
      this.field_43h.add(new C_47fx("AutoClickerP2", this.field_47));
      this.field_43h.add(new C_47f0("AutoClickerP3", this.field_47));
      this.field_43h.add(new C_47fK("AutoClickerP4", this.field_47));
      this.field_43h.add(new C_47fZ("AutoClickerP5", this.field_47));
      this.field_43h.add(new C_47f5("AutoClickerP6", this.field_47));
      this.field_43h.add(new C_47fE("AutoClickerP7", this.field_47));
      this.field_43h.add(new C_47fW("HurtTimeHit", this.field_47, var34));
      this.field_43h.add(new C_47fa("AimP1", this.field_47));
      long var10000 = 9180658878243246628L;
      int[] var98 = ClientSettings_47kr.method_46$d4d28024c9();
      this.field_43h.add(new C_47fB("AimP2", this.field_47));
      this.field_43h.add(new C_47fI("AimP3", this.field_47));
      this.field_43h.add(new C_47fq("AimP4", this.field_47));
      var10001 = 9180441934001205646L;
      Client.method_44$fbc0c0be91().getClass();
      this.field_43h.add(new C_47fz((byte)var71, var72, "SelectionCheck", var73, this.field_47));
      this.field_43h.add(new C_47fA("Trigger", this.field_47));
      this.field_43h.add(new C_47fT("PerfectHit1", this.field_47));
      this.field_43h.add(new C_47fQ("FirstHitCPS", this.field_47));
      this.field_43h.add(new C_47fk("FirstHit", this.field_47));
      this.field_43h.add(new C_47f7("Combined", var23, this.field_47));
      this.field_43h.add(new C_47f_("AutoClickerE", this.field_47, var69));
      this.field_43h.add(new C_47fX("EagleA", this.field_47));
      this.field_43h.add(new C_47fO("EagleB", this.field_47));
      this.field_43h.add(new C_47fC("EagleC", this.field_47));
      int[] var86 = var98;
      this.field_43h.add(new C_47fR(var38, "TrackAim", var39, (char)var40, this.field_47));
      this.field_43h.add(new C_47fJ("HitDelayFixA", this.field_47));
      this.field_43h.add(new C_47fN("HitDelayFixB", this.field_47));
      this.field_43h.add(new C_47fm("HitDelayFixC", this.field_47));
      this.field_43h.add(new C_47fM("AimDistance", this.field_47));
      this.field_43h.add(new C_47fn("NoJumpDelayA", this.field_47));
      SettingGroup var87 = new SettingGroup(this, "ChecksForMyself", var58);
      Iterator var88 = this.field_43h.iterator();

      label29:
      while (true) {
         Object var99;
         if (var88.hasNext()) {
            var99 = var88.next();
         } else {
            long var100 = 9180143021882994765L;
            var99 = Setting.method_40$44c5829186();
            if (var1 > 0L) {
               if (var99 != null) {
                  int[] var104 = new int[5];
                  var10001 = 9180358164034555425L;
                  int[] var97 = var104;
                  ClientSettings_47kr.method_49$2022b4f670(var97);
               }

               return;
            }
         }

         do {
            C_472H var89 = (C_472H)var99;
            long var10004 = 9180981455429658546L;
            C_472H var91 = var89;
            BooleanSetting var101 = new BooleanSetting(this, var91.method_44$0e30dfc966(), (short)var18, (char)var19, var20, true, var87);
            C_45n var10002 = recovery$indy$33(var89);
            long var10003 = 9180270808343530782L;
            C_45n var92 = var10002;
            long var93 = var6;
            BooleanSetting var95 = var101;
            BooleanSetting var90 = (BooleanSetting)var95.method_43$780fd62a21(var93, var92);
            this.field_46.put(var89, var90);
            if (var86 == null) {
               continue label29;
            }

            long var102 = 9180143021882994765L;
            var99 = Setting.method_40$44c5829186();
         } while (var1 <= 0L);

         if (var99 != null) {
            int[] var103 = new int[5];
            var10001 = 9180358164034555425L;
            int[] var96 = var103;
            ClientSettings_47kr.method_49$2022b4f670(var96);
         }

         return;
      }
   }

   // Retained obfuscator initialization is restored after javac.
   static { c = null; d = null; }

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native Field c(long var0, long var2);

   private static native MethodHandle recovery$constant$0();

   private static native Client recovery$indy$1(long var0, long var2);

   private static native Client recovery$indy$2(long var0, long var2);

   private static native int[] recovery$indy$3(long var0, long var2);

   private static native Entity recovery$indy$4(Object var0, long var1, long var3);

   private static native C_47Ij recovery$indy$5(Object var0, long var1, long var3);

   private static native C_47Ij recovery$indy$6(Object var0, long var1, long var3);

   private static native Entity recovery$indy$7(Object var0, long var1, long var3);

   private static native void recovery$indy$8(Object var0, long var1, int var3, long var4, long var6);

   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);

   private static native C_47Ij recovery$indy$10(Object var0, long var1, long var3);

   private static native void recovery$indy$11(Object var0, double var1, long var3, long var5);

   private static native Client recovery$indy$12(long var0, long var2);

   private static native Client recovery$indy$13(long var0, long var2);

   private static native void recovery$indy$14(Object var0, long var1, long var3);

   private static native Client recovery$indy$15(long var0, long var2);

   private static native Client recovery$indy$16(long var0, long var2);

   private static native int[] recovery$indy$17(long var0, long var2);

   private static native WorldClient recovery$indy$18(Object var0, long var1, long var3);

   private static native int recovery$indy$19(Object var0, long var1, long var3);

   private static native void recovery$indy$20(Object var0, long var1, long var3);

   private static native void recovery$indy$21(Object var0, short var1, short var2, int var3, long var4, long var6);

   private static native void recovery$indy$22(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$23(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native void recovery$indy$24(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native void recovery$indy$25(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$26(Object var0, int var1, int var2, long var3, long var5, long var7);

   private static native void recovery$indy$27(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$28(Object var0, int var1, long var2, long var4, long var6);

   private static native void recovery$indy$29(Object var0, int var1, long var2, long var4, long var6);

   private static native Client recovery$indy$30(long var0, long var2);

   private static native Client recovery$indy$31(long var0, long var2);

   private static native Client recovery$indy$32(long var0, long var2);

   private static native C_45n recovery$indy$33(C_472H var0);

   private static native MethodHandle recovery$constant$34();
}
