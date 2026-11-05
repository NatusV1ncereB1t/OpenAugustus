package augustus.recovered.modules.legit;
import com.google.common.collect.Lists;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_43r;
import net.C_475P;
import net.C_476B;
import net.minecraft.client.gui.ScaledResolution;
import net.C_478Q;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47Ij;
import net.minecraft.client.gui.FontRenderer;
import client.module.Module;
import client.setting.NumberSetting;
import net.C_47TU;
import client.setting.ColorSetting;
import net.C_47UZ;
import client.event.RenderListener;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.Minecraft;
import net.C_47rf;
import client.render.RenderUtils;
import client.module.Category;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class MLGHelper_47CC extends client.module.Module implements client.event.RenderListener {
    private final net.C_47TU settingMinDistance = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.ColorSetting settingColor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingPosX = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingPosY = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingScale = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43W = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.util.ArrayList field_43h = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method d(long a0,long a1);

   private C_476B method_40$eeeb00d7c1(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 108101526393594L;
      boolean var6 = recovery$indy$1(744845509763000652L, var1);
      double var8;
      int var10000 = (var8 = var3 - recovery$indy$2(this.settingMinDistance, var4, 745035021107563799L, var1)) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
      if (!var6) {
         if (var10000 <= 0) {
            return C_476B.NOTHING;
         }

         var10000 = (int) ((this.field_43W.contains(var3)) ? 1 : 0);
      }

      boolean var10001 = var6;
      if (var1 > 0L) {
         if (!var6) {
            if (var10000 != 0) {
               return C_476B.WALK;
            }

            var10000 = (int) ((this.field_42.contains(var3)) ? 1 : 0);
         }

         var10001 = var6;
      }

      if (!var10001) {
         if (var10000 != 0) {
            return C_476B.JUMP;
         }

         var10000 = (int) ((this.field_43h.contains(var3)) ? 1 : 0);
      }

      return var10000 != 0 ? C_476B.BOTH : C_476B.IMPOSSIBLE;
   }



   private boolean method_40$4c81539fc5(C_47Ij var1, long var2) {
      var2 = a ^ var2;
      C_478Q var4 = var1.method_49$5730377d31().method_40$5730377d31();
      C_47UZ var5 = recovery$indy$3(field_43, 5517251599775331731L, var2).method_46$efbf73d2b1(var4);
      return var5.method_48$e084f7739d() instanceof C_475P;
   }



   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 79469613767391L;
      long var10 = var6 ^ 92672965256425L;
      long var10001 = var6 ^ 48982798476343L;
      int var12 = (int)((var6 ^ 48982798476343L) >>> 32);
      int var13 = (int)((var6 ^ 48982798476343L) << 32 >>> 48);
      int var14 = (int)(var10001 << 48 >>> 48);
      boolean var15 = recovery$indy$4(1631185367116740025L, var6);
      C_476B var16 = recovery$indy$5(this, var10, 1631117298324754684L, var6);
      if (!var15) {
         if (var16 != C_476B.NOTHING) {
            GL11.glPushMatrix();
            GL11.glScaled(
               recovery$indy$6(this.settingScale, var8, 1630562507424162273L, var6), recovery$indy$7(this.settingScale, var8, 1630562507424162273L, var6), 1.0
            );
            recovery$indy$8(field_43, 1634614479654334191L, var6)
               .method_43$7961e3f788(
                  recovery$indy$9(var16, 1630890697912265341L, var6),
                  (int)(
                     var5.method_44$fedcb3e4d3()
                           / recovery$indy$10(this.settingScale, var8, 1630562507424162273L, var6)
                           * recovery$indy$11(this.settingPosX, var8, 1630562507424162273L, var6)
                           / 100.0
                        - recovery$indy$12(field_43, 1634614479654334191L, var6).method_48$2f485d5ba3(recovery$indy$13(var16, 1630890697912265341L, var6))
                           / 2.0F
                  ),
                  (int)(
                     var5.method_40$fedcb3e4d3()
                        / recovery$indy$14(this.settingScale, var8, 1630562507424162273L, var6)
                        * recovery$indy$15(this.settingPosY, var8, 1630562507424162273L, var6)
                        / 100.0
                  ),
                  recovery$indy$16(this.settingColor, var12, (short)var13, (char)var14, 0, 1630953367463469710L, var6)
               );
            GL11.glPopMatrix();
         }

         RenderUtils.method_41$da8c82d5d4();
      }
   }




   private boolean method_48$0dd78e0064(long var1) {
      var1 = a ^ var1;
      boolean var3 = recovery$indy$17(6899063188262665380L, var1);
      C_47rf var4 = recovery$indy$18(field_43, 6895225429421079929L, var1).method_48$ac4db64966();
      C_47rf var10000 = var4;
      if (!var3) {
         if (var4 == null) {
            return false;
         }

         var10000 = var4;
      }

      boolean var6 = var10000.method_48$dbd570a038().equals(C_43r.method_46$4158f44b4a(30));
      if (var3) {
         return var6;
      }

      if (var6) {
         return true;
      }

      boolean var7 = var4.method_48$dbd570a038().equals(C_43r.method_46$4158f44b4a(65));
      return var3 ? var7 : var7;
   }



   private int method_48$707658e71d(C_47Ij var1, long var2) {
      var2 = a ^ var2;
      int var4 = var1.method_49$5730377d31().method_43$8abf5c6871();
      int var5 = recovery$indy$19(field_43, -1464920049122047646L, var2).method_47$5730377d31().method_43$8abf5c6871();
      return var5 - var4;
   }



   private C_476B method_49$d7f747f7ab(int var1, int var2, byte var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
      long var6 = var4 ^ 100163151800309L;
      long var8 = var4 ^ 43283229675850L;
      long var10 = var4 ^ 101556113978992L;
      long var12 = var4 ^ 35018604424175L;
      long var14 = var4 ^ 83805547911043L;
      boolean var16 = recovery$indy$20(-575213430158976226L, var4);
      C_47Ij var17 = recovery$indy$21(this, var6, -574783070704126472L, var4);
      if (var17 != null) {
         int var10000 = (int) ((recovery$indy$22(this, var17, var12, -574265321481997904L, var4)) ? 1 : 0);
         boolean var10001 = var16;
         if (var1 >= 0) {
            if (!var16) {
               if (var10000 == 0) {
                  return C_476B.NOTHING;
               }

               var10000 = (int) ((recovery$indy$23(this, var17, var8, -573447070311549784L, var4)) ? 1 : 0);
            }

            var10001 = var16;
         }

         if (!var10001) {
            if (var10000 == 0) {
               return C_476B.NOTHING;
            }

            var10000 = recovery$indy$24(this, var17, var10, -573564345140645605L, var4) - 1;
         }

         int var18 = var10000;
         return recovery$indy$25(this, var14, var18, -574105261971831488L, var4);
      } else {
         return C_476B.NOTHING;
      }
   }



   private boolean method_45$cb01855ed2(int var1, char var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      boolean var6 = recovery$indy$26(8435531311829141218L, var4);
      double var7;
      int var10000 = (
               var7 = recovery$indy$27(field_43, 8435416329142081497L, var4).field_48G - recovery$indy$28(field_43, 8435416329142081497L, var4).field_48j
            )
            == 0.0
         ? 0
         : (var7 < 0.0 ? -1 : 1);
      if (var6) {
         ;
      }

      return var10000 != 0;
   }



   private C_47Ij method_45$992a97c4ca(long var1) {
      var1 = a ^ var1;
      return recovery$indy$29(field_43, -419246264505886489L, var1).method_46$067a0f49bf(256.0, 1.0F);
   }



   private boolean method_45$4c81539fc5(net.C_47Ij var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 19802491454225L;
      net.C_478Q var7 = recovery$indy$30(field_43, -705713300392340227L, var2).method_47$5730377d31();
      int var10000 = ((int) (recovery$indy$31(-704132836639894240L, var2) ? 1 : 0));
      net.C_478Q var8 = var1.method_49$5730377d31();
      int var9 = Math.abs(var8.method_40$8abf5c6871() - var7.method_40$8abf5c6871());
      boolean var6 = (var10000 != 0);
      int var10 = Math.abs(var8.method_47$8abf5c6871() - var7.method_47$8abf5c6871());
      double var84;
      var10000 = (var84 = var9 - recovery$indy$32(this.settingMinDistance, var4, -705612549592981464L, var2)) == 0.0 ? 0 : (var84 < 0.0 ? -1 : 1);
      int var74 = ((int) (var6 ? 1 : 0));
      int var11 = var10000;
      if ((var74) != 0) {
         return (var11 != 0);
      }

      var11 = var11;
      var74 = var11;
      if (var74 <= 0) {
         double var85;
         var11 = (var85 = var10 - recovery$indy$33(this.settingMinDistance, var4, -705612549592981464L, var2)) == 0.0 ? 0 : (var85 < 0.0 ? -1 : 1);
         var11 = var11;
         var74 = var11;
         if (var74 <= 0) {
            return true;
         }
      }

      return false;
   }



   public C_476B method_43$74a9cd5312(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 21239984614900L;
      long var10001 = var1 ^ 87801619400532L;
      int var5 = (int)((var1 ^ 87801619400532L) >>> 32);
      int var6 = (int)((var1 ^ 87801619400532L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 26754353023566L;
      int var8 = (int)((var1 ^ 26754353023566L) >>> 32);
      int var9 = (int)((var1 ^ 26754353023566L) << 32 >>> 40);
      int var10 = (int)(var10001 << 56 >>> 56);
      byte var11 = (byte) ((recovery$indy$34(-7522298466904869759L, var1)) ? 1 : 0);
      Minecraft var10000 = field_43;
      if (var11 == 0) {
         if (recovery$indy$35(field_43, -7523884460310792868L, var1) == null) {
            return C_476B.NOTHING;
         }

         var10000 = field_43;
      }

      if (recovery$indy$36(var10000, -7524098730138358121L, var1) != null) {
         boolean var13 = recovery$indy$37(this, var5, (char)var6, (char)var7, -7524135020534680106L, var1);
         if (var11 == 0) {
            if (var13) {
               return C_476B.NOTHING;
            }

            if (var1 < 0L) {
               return recovery$indy$39(this, var11, var9, (byte)var10, -7524234437017863688L, var1);
            }

            if (var11 != 0) {
               return recovery$indy$39(this, var8, var9, (byte)var10, -7524234437017863688L, var1);
            }

            var13 = recovery$indy$38(this, var3, -7522141182169173374L, var1);
         }

         return !var13 ? C_476B.NOTHING : recovery$indy$39(this, var8, var9, (byte)var10, -7524234437017863688L, var1);
      } else {
         return C_476B.NOTHING;
      }
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$40(this, 32, var3, -7098999436352167830L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public MLGHelper_47CC(int a0,short a1,int a2) {
        super((java.lang.String) ("MLGHelper"),(java.lang.String) ("MLGHelfer"),(long) (((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.MLGHelper_47CC.a) ^ 125302165847844L)),(java.awt.Color) (new java.awt.Color((int) (50),(int) (168),(int) (141))),(client.module.Category) (client.module.Category.LEGIT));
        long constructorKey1 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.MLGHelper_47CC.a) ^ 6304020297130L);
        long constructorKey2 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.MLGHelper_47CC.a) ^ 110238844166938L);
        long constructorKey3 = ((((((long) (a0) << 32) | (((long) (a1) << 48) >>> 32)) | (((long) (a2) << 48) >>> 48)) ^ augustus.recovered.modules.legit.MLGHelper_47CC.a) ^ 50073412000952L);
        net.C_47TU initialized4 = new net.C_47TU(constructorKey1, this, "MinDistance", Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4636737291354636288L), 0);
        recovery$indy$flow$124(this, initialized4);
        java.awt.Color initialized5 = new java.awt.Color(255, 255, 255, 255);
        client.setting.ColorSetting initialized6 = new client.setting.ColorSetting(constructorKey2, this, "Color", initialized5);
        recovery$indy$flow$129(this, initialized6);
        client.setting.NumberSetting initialized7 = new client.setting.NumberSetting(this, "PosX", Double.longBitsToDouble(4632233691727265792L), constructorKey3, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        recovery$indy$flow$132(this, initialized7);
        client.setting.NumberSetting initialized8 = new client.setting.NumberSetting(this, "PosY", 0.0D, constructorKey3, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        recovery$indy$flow$135(this, initialized8);
        client.setting.NumberSetting initialized9 = new client.setting.NumberSetting(this, "Scale", 1.0D, constructorKey3, Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4616189618054758400L), 1);
        recovery$indy$flow$138(this, initialized9);
        java.lang.Object initialValue10 = recovery$indy$flow$139(46);
        java.lang.Object initialValue11 = recovery$indy$flow$140(16);
        ((java.lang.Object[]) initialValue10)[0] = initialValue11;
        java.lang.Object initialValue12 = recovery$indy$flow$141(19);
        ((java.lang.Object[]) initialValue10)[1] = initialValue12;
        java.lang.Object initialValue13 = recovery$indy$flow$142(22);
        ((java.lang.Object[]) initialValue10)[2] = initialValue13;
        java.lang.Object initialValue14 = recovery$indy$flow$143(24);
        ((java.lang.Object[]) initialValue10)[3] = initialValue14;
        java.lang.Object initialValue15 = recovery$indy$flow$144(27);
        ((java.lang.Object[]) initialValue10)[4] = initialValue15;
        java.lang.Object initialValue16 = recovery$indy$flow$145(29);
        ((java.lang.Object[]) initialValue10)[5] = initialValue16;
        java.lang.Object initialValue17 = recovery$indy$flow$146(34);
        ((java.lang.Object[]) initialValue10)[6] = initialValue17;
        java.lang.Object initialValue18 = recovery$indy$flow$147(36);
        ((java.lang.Object[]) initialValue10)[7] = initialValue18;
        java.lang.Object initialValue19 = recovery$indy$flow$148(38);
        ((java.lang.Object[]) initialValue10)[8] = initialValue19;
        java.lang.Object initialValue20 = recovery$indy$flow$149(40);
        ((java.lang.Object[]) initialValue10)[9] = initialValue20;
        java.lang.Object initialValue21 = recovery$indy$flow$150(42);
        ((java.lang.Object[]) initialValue10)[10] = initialValue21;
        java.lang.Object initialValue22 = recovery$indy$flow$151(49);
        ((java.lang.Object[]) initialValue10)[11] = initialValue22;
        java.lang.Object initialValue23 = recovery$indy$flow$152(51);
        ((java.lang.Object[]) initialValue10)[12] = initialValue23;
        java.lang.Object initialValue24 = recovery$indy$flow$153(53);
        ((java.lang.Object[]) initialValue10)[13] = initialValue24;
        java.lang.Object initialValue25 = recovery$indy$flow$154(55);
        ((java.lang.Object[]) initialValue10)[14] = initialValue25;
        java.lang.Object initialValue26 = recovery$indy$flow$155(58);
        ((java.lang.Object[]) initialValue10)[15] = initialValue26;
        java.lang.Object initialValue27 = recovery$indy$flow$156(60);
        ((java.lang.Object[]) initialValue10)[16] = initialValue27;
        java.lang.Object initialValue28 = recovery$indy$flow$157(62);
        ((java.lang.Object[]) initialValue10)[17] = initialValue28;
        java.lang.Object initialValue29 = recovery$indy$flow$158(65);
        ((java.lang.Object[]) initialValue10)[18] = initialValue29;
        java.lang.Object initialValue30 = recovery$indy$flow$159(67);
        ((java.lang.Object[]) initialValue10)[19] = initialValue30;
        java.lang.Object initialValue31 = recovery$indy$flow$160(69);
        ((java.lang.Object[]) initialValue10)[20] = initialValue31;
        java.lang.Object initialValue32 = recovery$indy$flow$161(72);
        ((java.lang.Object[]) initialValue10)[21] = initialValue32;
        java.lang.Object initialValue33 = recovery$indy$flow$162(74);
        ((java.lang.Object[]) initialValue10)[22] = initialValue33;
        java.lang.Object initialValue34 = recovery$indy$flow$163(77);
        ((java.lang.Object[]) initialValue10)[23] = initialValue34;
        java.lang.Object initialValue35 = recovery$indy$flow$164(79);
        ((java.lang.Object[]) initialValue10)[24] = initialValue35;
        java.lang.Object initialValue36 = recovery$indy$flow$165(82);
        ((java.lang.Object[]) initialValue10)[25] = initialValue36;
        java.lang.Object initialValue37 = recovery$indy$flow$166(85);
        ((java.lang.Object[]) initialValue10)[26] = initialValue37;
        java.lang.Object initialValue38 = recovery$indy$flow$167(87);
        ((java.lang.Object[]) initialValue10)[27] = initialValue38;
        java.lang.Object initialValue39 = recovery$indy$flow$168(90);
        ((java.lang.Object[]) initialValue10)[28] = initialValue39;
        java.lang.Object initialValue40 = recovery$indy$flow$169(93);
        ((java.lang.Object[]) initialValue10)[29] = initialValue40;
        java.lang.Object initialValue41 = recovery$indy$flow$170(95);
        ((java.lang.Object[]) initialValue10)[30] = initialValue41;
        java.lang.Object initialValue42 = recovery$indy$flow$171(98);
        ((java.lang.Object[]) initialValue10)[31] = initialValue42;
        java.lang.Object initialValue43 = recovery$indy$flow$172(101);
        ((java.lang.Object[]) initialValue10)[32] = initialValue43;
        java.lang.Object initialValue44 = recovery$indy$flow$173(104);
        ((java.lang.Object[]) initialValue10)[33] = initialValue44;
        java.lang.Object initialValue45 = recovery$indy$flow$174(106);
        ((java.lang.Object[]) initialValue10)[34] = initialValue45;
        java.lang.Object initialValue46 = recovery$indy$flow$175(109);
        ((java.lang.Object[]) initialValue10)[35] = initialValue46;
        java.lang.Object initialValue47 = recovery$indy$flow$176(112);
        ((java.lang.Object[]) initialValue10)[36] = initialValue47;
        java.lang.Object initialValue48 = recovery$indy$flow$177(115);
        ((java.lang.Object[]) initialValue10)[37] = initialValue48;
        java.lang.Object initialValue49 = recovery$indy$flow$178(118);
        ((java.lang.Object[]) initialValue10)[38] = initialValue49;
        java.lang.Object initialValue50 = recovery$indy$flow$179(119);
        ((java.lang.Object[]) initialValue10)[39] = initialValue50;
        java.lang.Object initialValue51 = recovery$indy$flow$180(121);
        ((java.lang.Object[]) initialValue10)[40] = initialValue51;
        java.lang.Object initialValue52 = recovery$indy$flow$181(127);
        ((java.lang.Object[]) initialValue10)[41] = initialValue52;
        java.lang.Object initialValue53 = recovery$indy$flow$182(130);
        ((java.lang.Object[]) initialValue10)[42] = initialValue53;
        java.lang.Object initialValue54 = recovery$indy$flow$183(133);
        ((java.lang.Object[]) initialValue10)[43] = initialValue54;
        java.lang.Object initialValue55 = recovery$indy$flow$184(135);
        ((java.lang.Object[]) initialValue10)[44] = initialValue55;
        java.lang.Object initialValue56 = recovery$indy$flow$185(136);
        ((java.lang.Object[]) initialValue10)[45] = initialValue56;
        java.lang.Object initialValue57 = recovery$indy$flow$186(initialValue10);
        recovery$indy$flow$187(this, initialValue57);
        java.lang.Object initialValue58 = recovery$indy$flow$188(44);
        java.lang.Object initialValue59 = recovery$indy$flow$189(17);
        ((java.lang.Object[]) initialValue58)[0] = initialValue59;
        java.lang.Object initialValue60 = recovery$indy$flow$190(18);
        ((java.lang.Object[]) initialValue58)[1] = initialValue60;
        java.lang.Object initialValue61 = recovery$indy$flow$191(20);
        ((java.lang.Object[]) initialValue58)[2] = initialValue61;
        java.lang.Object initialValue62 = recovery$indy$flow$192(23);
        ((java.lang.Object[]) initialValue58)[3] = initialValue62;
        java.lang.Object initialValue63 = recovery$indy$flow$193(28);
        ((java.lang.Object[]) initialValue58)[4] = initialValue63;
        java.lang.Object initialValue64 = recovery$indy$flow$194(30);
        ((java.lang.Object[]) initialValue58)[5] = initialValue64;
        java.lang.Object initialValue65 = recovery$indy$flow$195(31);
        ((java.lang.Object[]) initialValue58)[6] = initialValue65;
        java.lang.Object initialValue66 = recovery$indy$flow$196(35);
        ((java.lang.Object[]) initialValue58)[7] = initialValue66;
        java.lang.Object initialValue67 = recovery$indy$flow$197(37);
        ((java.lang.Object[]) initialValue58)[8] = initialValue67;
        java.lang.Object initialValue68 = recovery$indy$flow$198(39);
        ((java.lang.Object[]) initialValue58)[9] = initialValue68;
        java.lang.Object initialValue69 = recovery$indy$flow$199(41);
        ((java.lang.Object[]) initialValue58)[10] = initialValue69;
        java.lang.Object initialValue70 = recovery$indy$flow$200(43);
        ((java.lang.Object[]) initialValue58)[11] = initialValue70;
        java.lang.Object initialValue71 = recovery$indy$flow$201(45);
        ((java.lang.Object[]) initialValue58)[12] = initialValue71;
        java.lang.Object initialValue72 = recovery$indy$flow$202(50);
        ((java.lang.Object[]) initialValue58)[13] = initialValue72;
        java.lang.Object initialValue73 = recovery$indy$flow$203(52);
        ((java.lang.Object[]) initialValue58)[14] = initialValue73;
        java.lang.Object initialValue74 = recovery$indy$flow$204(54);
        ((java.lang.Object[]) initialValue58)[15] = initialValue74;
        java.lang.Object initialValue75 = recovery$indy$flow$205(56);
        ((java.lang.Object[]) initialValue58)[16] = initialValue75;
        java.lang.Object initialValue76 = recovery$indy$flow$206(59);
        ((java.lang.Object[]) initialValue58)[17] = initialValue76;
        java.lang.Object initialValue77 = recovery$indy$flow$207(61);
        ((java.lang.Object[]) initialValue58)[18] = initialValue77;
        java.lang.Object initialValue78 = recovery$indy$flow$208(63);
        ((java.lang.Object[]) initialValue58)[19] = initialValue78;
        java.lang.Object initialValue79 = recovery$indy$flow$209(66);
        ((java.lang.Object[]) initialValue58)[20] = initialValue79;
        java.lang.Object initialValue80 = recovery$indy$flow$210(68);
        ((java.lang.Object[]) initialValue58)[21] = initialValue80;
        java.lang.Object initialValue81 = recovery$indy$flow$211(71);
        ((java.lang.Object[]) initialValue58)[22] = initialValue81;
        java.lang.Object initialValue82 = recovery$indy$flow$212(73);
        ((java.lang.Object[]) initialValue58)[23] = initialValue82;
        java.lang.Object initialValue83 = recovery$indy$flow$213(76);
        ((java.lang.Object[]) initialValue58)[24] = initialValue83;
        java.lang.Object initialValue84 = recovery$indy$flow$214(78);
        ((java.lang.Object[]) initialValue58)[25] = initialValue84;
        java.lang.Object initialValue85 = recovery$indy$flow$215(81);
        ((java.lang.Object[]) initialValue58)[26] = initialValue85;
        java.lang.Object initialValue86 = recovery$indy$flow$216(83);
        ((java.lang.Object[]) initialValue58)[27] = initialValue86;
        java.lang.Object initialValue87 = recovery$indy$flow$217(86);
        ((java.lang.Object[]) initialValue58)[28] = initialValue87;
        java.lang.Object initialValue88 = recovery$indy$flow$218(89);
        ((java.lang.Object[]) initialValue58)[29] = initialValue88;
        java.lang.Object initialValue89 = recovery$indy$flow$219(91);
        ((java.lang.Object[]) initialValue58)[30] = initialValue89;
        java.lang.Object initialValue90 = recovery$indy$flow$220(94);
        ((java.lang.Object[]) initialValue58)[31] = initialValue90;
        java.lang.Object initialValue91 = recovery$indy$flow$221(97);
        ((java.lang.Object[]) initialValue58)[32] = initialValue91;
        java.lang.Object initialValue92 = recovery$indy$flow$222(100);
        ((java.lang.Object[]) initialValue58)[33] = initialValue92;
        java.lang.Object initialValue93 = recovery$indy$flow$223(103);
        ((java.lang.Object[]) initialValue58)[34] = initialValue93;
        java.lang.Object initialValue94 = recovery$indy$flow$224(105);
        ((java.lang.Object[]) initialValue58)[35] = initialValue94;
        java.lang.Object initialValue95 = recovery$indy$flow$225(107);
        ((java.lang.Object[]) initialValue58)[36] = initialValue95;
        java.lang.Object initialValue96 = recovery$indy$flow$226(108);
        ((java.lang.Object[]) initialValue58)[37] = initialValue96;
        java.lang.Object initialValue97 = recovery$indy$flow$227(111);
        ((java.lang.Object[]) initialValue58)[38] = initialValue97;
        java.lang.Object initialValue98 = recovery$indy$flow$228(114);
        ((java.lang.Object[]) initialValue58)[39] = initialValue98;
        java.lang.Object initialValue99 = recovery$indy$flow$229(117);
        ((java.lang.Object[]) initialValue58)[40] = initialValue99;
        java.lang.Object initialValue100 = recovery$indy$flow$230(122);
        ((java.lang.Object[]) initialValue58)[41] = initialValue100;
        java.lang.Object initialValue101 = recovery$indy$flow$231(125);
        ((java.lang.Object[]) initialValue58)[42] = initialValue101;
        java.lang.Object initialValue102 = recovery$indy$flow$232(128);
        ((java.lang.Object[]) initialValue58)[43] = initialValue102;
        java.lang.Object initialValue103 = recovery$indy$flow$233(initialValue58);
        recovery$indy$flow$234(this, initialValue103);
        java.lang.Object initialValue104 = recovery$indy$flow$235(9);
        java.lang.Object initialValue105 = recovery$indy$flow$236(10);
        ((java.lang.Object[]) initialValue104)[0] = initialValue105;
        java.lang.Object initialValue106 = recovery$indy$flow$237(11);
        ((java.lang.Object[]) initialValue104)[1] = initialValue106;
        java.lang.Object initialValue107 = recovery$indy$flow$238(13);
        ((java.lang.Object[]) initialValue104)[2] = initialValue107;
        java.lang.Object initialValue108 = recovery$indy$flow$239(14);
        ((java.lang.Object[]) initialValue104)[3] = initialValue108;
        java.lang.Object initialValue109 = recovery$indy$flow$240(15);
        ((java.lang.Object[]) initialValue104)[4] = initialValue109;
        java.lang.Object initialValue110 = recovery$indy$flow$241(22);
        ((java.lang.Object[]) initialValue104)[5] = initialValue110;
        java.lang.Object initialValue111 = recovery$indy$flow$242(26);
        ((java.lang.Object[]) initialValue104)[6] = initialValue111;
        java.lang.Object initialValue112 = recovery$indy$flow$243(33);
        ((java.lang.Object[]) initialValue104)[7] = initialValue112;
        java.lang.Object initialValue113 = recovery$indy$flow$244(47);
        ((java.lang.Object[]) initialValue104)[8] = initialValue113;
        java.lang.Object initialValue114 = recovery$indy$flow$245(initialValue104);
        recovery$indy$flow$246(this, initialValue114);
    }








    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native void recovery$indy$flow$124(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$129(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$132(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$135(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$138(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$139(int a0);
    private static java.lang.Object recovery$indy$flow$140(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$141(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$142(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$143(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$144(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$145(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$146(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$147(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$148(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$149(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$150(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$151(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$152(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$153(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$154(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$155(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$156(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$157(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$158(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$159(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$160(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$161(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$162(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$163(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$164(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$165(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$166(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$167(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$168(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$169(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$170(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$171(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$172(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$173(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$174(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$175(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$176(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$177(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$178(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$179(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$180(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$181(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$182(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$183(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$184(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$185(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static native java.lang.Object recovery$indy$flow$186(java.lang.Object a0);
    private static native void recovery$indy$flow$187(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$188(int a0);
    private static java.lang.Object recovery$indy$flow$189(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$190(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$191(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$192(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$193(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$194(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$195(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$196(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$197(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$198(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$199(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$200(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$201(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$202(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$203(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$204(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$205(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$206(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$207(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$208(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$209(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$210(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$211(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$212(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$213(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$214(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$215(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$216(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$217(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$218(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$219(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$220(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$221(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$222(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$223(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$224(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$225(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$226(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$227(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$228(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$229(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$230(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$231(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$232(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static native java.lang.Object recovery$indy$flow$233(java.lang.Object a0);
    private static native void recovery$indy$flow$234(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$235(int a0);
    private static java.lang.Object recovery$indy$flow$236(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$237(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$238(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$239(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$240(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$241(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$242(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$243(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$244(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static native java.lang.Object recovery$indy$flow$245(java.lang.Object a0);
    private static native void recovery$indy$flow$246(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native double recovery$indy$2(Object var0, long var1, long var3, long var5);
   private static native WorldClient recovery$indy$3(Object var0, long var1, long var3);
   private static native boolean recovery$indy$4(long var0, long var2);
   private static native C_476B recovery$indy$5(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$6(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$7(Object var0, long var1, long var3, long var5);
   private static native FontRenderer recovery$indy$8(Object var0, long var1, long var3);
   private static native String recovery$indy$9(Object var0, long var1, long var3);
   private static native double recovery$indy$10(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$11(Object var0, long var1, long var3, long var5);
   private static native FontRenderer recovery$indy$12(Object var0, long var1, long var3);
   private static native String recovery$indy$13(Object var0, long var1, long var3);
   private static native double recovery$indy$14(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$15(Object var0, long var1, long var3, long var5);
   private static native int recovery$indy$16(Object var0, int var1, short var2, char var3, int var4, long var5, long var7);
   private static native boolean recovery$indy$17(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$19(Object var0, long var1, long var3);
   private static native boolean recovery$indy$20(long var0, long var2);
   private static native C_47Ij recovery$indy$21(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$22(Object var0, Object var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$23(Object var0, Object var1, long var2, long var4, long var6);
   private static native int recovery$indy$24(Object var0, Object var1, long var2, long var4, long var6);
   private static native C_476B recovery$indy$25(Object var0, long var1, int var3, long var4, long var6);
   private static native boolean recovery$indy$26(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$27(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$29(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$30(Object var0, long var1, long var3);
   private static native boolean recovery$indy$31(long var0, long var2);
   private static native double recovery$indy$32(Object var0, long var1, long var3, long var5);
   private static native double recovery$indy$33(Object var0, long var1, long var3, long var5);
   private static native boolean recovery$indy$34(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$35(Object var0, long var1, long var3);
   private static native WorldClient recovery$indy$36(Object var0, long var1, long var3);
   private static native boolean recovery$indy$37(Object var0, int var1, char var2, char var3, long var4, long var6);
   private static native boolean recovery$indy$38(Object var0, long var1, long var3, long var5);
   private static native C_476B recovery$indy$39(Object var0, int var1, int var2, byte var3, long var4, long var6);
   private static native void recovery$indy$40(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$41();
}
