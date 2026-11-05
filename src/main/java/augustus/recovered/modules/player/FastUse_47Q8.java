package augustus.recovered.modules.player;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_43J;
import net.C_43u;
import net.C_43y;
import net.C_43z;
import net.C_45n;
import net.C_471S;
import net.C_473U;
import net.C_476v;
import net.C_477r;
import net.C_479E;
import net.C_479m;
import net.minecraft.client.entity.EntityPlayerSP;
import net.C_47G9;
import client.module.Module;
import net.C_47S6;
import client.setting.MultiSelectSetting;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import net.C_47Vc;
import net.C_47gg;
import net.minecraft.client.multiplayer.WorldClient;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import client.ClientGlobals;
import net.C_47rf;
import net.C_47sk;
import client.module.Category;
import net.C_47xz;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class FastUse_47Q8 extends client.module.Module implements net.C_47Vc,net.C_471S,net.C_47iC,net.C_47xz {
    public final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingPacketMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyWhileMoving = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingPacketLoops = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingPackets = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingGrimPackets = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingNewPackets = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingTimePackets = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingOnlyAtFullLife = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyOnGround = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingItems = null; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

    private static native int a(long a0,long a1);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$9035875d26(long var1, C_47ob var3) {
      int var30;
      long var4 = var1 ^ 130789222062035L;
      long var6 = var1 ^ 48552975978563L;
      long var8 = var1 ^ 17925729311181L;
      long var10000 = -7190946799256469660L;
      byte var10 = (byte) ((AirStuck_47Q4.method_45$aae029aa0a()) ? 1 : 0);
      long var10001 = -7191855242880302637L;
      C_47ob var14 = var3;
      C_473U var11 = var14.method_46$96fcbedb66();
      long var10002 = -7191009971202144087L;
      long var15 = var8;
      ModeSetting var17 = this.settingMode;
      int var29 = (int) ((var17.method_46$5f9dc63072(var15).equals(recovery$indy$1(7299, 7055562520899191957L ^ var1))) ? 1 : 0);
      if (var10 != 0) {
         if (var29 == 0) {
            return;
         }

         var10002 = -7191693157212237055L;
         long var18 = var4;
         FastUse_47Q8 var20 = this;
         var29 = (int) ((var20.method_45$0dd78e0064(var18)) ? 1 : 0);
      }

      byte var31 = var10;
      if (var1 > 0L) {
         if (var10 != 0) {
            if (var29 == 0) {
               return;
            }

            var29 = (int) ((var11 instanceof C_479m) ? 1 : 0);
         }

         var31 = var10;
      }

      if (var31 != 0) {
         if (var29 == 0) {
            return;
         }

         var10002 = -7188089466376526429L;
         long var21 = var6;
         NumberSetting var23 = this.settingGrimPackets;
         var29 = (int)var23.method_44$474dfaa627(var21);
      }

      int var12;
      label68: {
         var12 = var29;
         var10001 = -7190599828608709175L;
         Minecraft var24 = field_43;
         var30 = var24.field_42P.method_415$8abf5c6871();
         int var33 = var10;
         if (var1 >= 0L) {
            if (var10 == 0) {
               break label68;
            }

            var33 = var12;
         }

         if (var30 < var33) {
            var10001 = -7190599828608709175L;
            Minecraft var25 = field_43;
            var12 = var25.field_42P.method_415$8abf5c6871();
         }

         var10001 = -7190599828608709175L;
         Minecraft var26 = field_43;
         var10002 = -7190599828608709175L;
         Minecraft var27 = field_43;
         var26.field_42P.method_471$d00df7729d(var27.field_42P.method_415$8abf5c6871() - var12);
         var30 = 0;
      }

      int var13 = var30;

      while (var13 < var12) {
         var10001 = -7190599828608709175L;
         Minecraft var28 = field_43;
         var28.field_42P.field_49m.method_43$631790539f(var11);
         var13++;
         if (var10 == 0) {
            break;
         }
      }
   }




   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 92207907692022L;
      long var3 = var1 ^ 59189719237614L;
      long var10002 = 5050579309232558730L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Grim-1.17");
   }



   private int method_45$95d88932bd(long var1) {
      byte var5;
      int var15;
      byte var10001;
      label72: {
         var1 = a ^ var1;
         long var3 = var1 ^ 101506951983675L;
         long var10002 = 8629506684011586399L;
         long var8 = var3;
         ModeSetting var10 = this.settingPacketMode;
         String var6 = var10.method_46$5f9dc63072(var8);
         long var10000 = 8629533361484470844L;
         byte var14 = (byte) ((AirStuck_47Q4.method_419$aae029aa0a()) ? 1 : 0);
         byte var7 = -1;
         var5 = var14;
         var15 = var6.hashCode();
         label71:
         if (var5 == 0) {
            label75: {
               switch (var15) {
                  case -1085510111:
                     var15 = (int) ((var6.equals("Default")) ? 1 : 0);
                     if (var5 != 0) {
                        break label71;
                     }

                     if (var15 == 0) {
                        break label75;
                     }

                     var7 = 0;
                     var15 = var5;
                     if (var1 <= 0L) {
                        break;
                     }

                     if (var5 == 0) {
                        break label75;
                     }
                  case 73298841:
                     var15 = (int) ((var6.equals("Legit")) ? 1 : 0);
                     break;
                  default:
                     break label75;
               }

               var10001 = var5;
               if (var1 <= 0L) {
                  break label72;
               }

               if (var5 != 0) {
                  break label71;
               }

               if (var15 != 0) {
                  var7 = 1;
               }
            }

            var15 = var7;
         }

         var10001 = var5;
      }

      if (var10001 == 0) {
         label48: {
            EntityPlayerSP var16;
            switch (var15) {
               case 0:
                  long var17 = 8629907963766761023L;
                  Minecraft var11 = field_43;
                  var16 = var11.field_42P;
                  if (var1 <= 0L) {
                     break;
                  }

                  var11.field_42P.field_49m.method_43$631790539f(new C_479E(true));
                  if (var5 == 0) {
                     break label48;
                  }
               case 1:
                  long var18 = 8629907963766761023L;
                  Minecraft var12 = field_43;
                  var16 = var12.field_42P;
                  break;
               default:
                  break label48;
            }

            var16.method_434$f633c984d8(false);
         }

         var15 = 0;
      }

      return var15;
   }



    private boolean method_45$0dd78e0064(long l) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        block31: {
            block29: {
                block30: {
                    boolean bl4;
                    block28: {
                        block20: {
                            long l2;
                            block21: {
                                block25: {
                                    block26: {
                                        block27: {
                                            boolean bl5;
                                            block22: {
                                                block23: {
                                                    block24: {
                                                        block17: {
                                                            block18: {
                                                                block19: {
                                                                    EntityPlayerSP c_47B2;
                                                                    block16: {
                                                                        boolean bl6;
                                                                        block14: {
                                                                            block15: {
                                                                                l2 = (l = a ^ l) ^ 0x3B26780BD7EL;
                                                                                bl3 = FastUse_47Q8.recovery$indy$2(-8067342711895032331L, l);
                                                                                Minecraft c_47nT = field_43;
                                                                                if (!bl3) {
                                                                                    if (FastUse_47Q8.recovery$indy$3(c_47nT, -8067434953261891154L, l) == null) return false;
                                                                                    c_47nT = field_43;
                                                                                }
                                                                                EntityPlayerSP c_47B22 = FastUse_47Q8.recovery$indy$4(c_47nT, -8067389746149391882L, l);
                                                                                if (!bl3) {
                                                                                    if (c_47B22 == null) return false;
                                                                                    c_47B22 = FastUse_47Q8.recovery$indy$5(field_43, -8067389746149391882L, l);
                                                                                }
                                                                                bl6 = c_47B22.field_48M;
                                                                                if (bl3) break block14;
                                                                                if (bl6) break block15;
                                                                                bl6 = FastUse_47Q8.recovery$indy$6(this.settingOnlyOnGround, -8070006522093919575L, l);
                                                                                if (bl3) break block14;
                                                                                if (bl6) return false;
                                                                            }
                                                                            c_47B2 = FastUse_47Q8.recovery$indy$7(field_43, -8067389746149391882L, l);
                                                                            if (bl3) break block16;
                                                                            bl6 = c_47B2.method_436$aae029aa0a();
                                                                        }
                                                                        if (!bl6) return false;
                                                                        c_47B2 = FastUse_47Q8.recovery$indy$8(field_43, -8067389746149391882L, l);
                                                                    }
                                                                    C_47rf c_47rf = c_47B2.method_48$ac4db64966();
                                                                    if (!bl3) {
                                                                        if (c_47rf == null) return false;
                                                                        c_47rf = FastUse_47Q8.recovery$indy$9(field_43, -8067389746149391882L, l).method_48$ac4db64966();
                                                                    }
                                                                    bl2 = c_47rf.method_48$dbd570a038() instanceof C_43J;
                                                                    bl5 = bl3;
                                                                    if (l < 0L) break block17;
                                                                    if (bl5) break block18;
                                                                    if (!bl2) break block19;
                                                                    bl2 = FastUse_47Q8.recovery$indy$10(C_47G9.FOOD, -8066310146687744347L, l);
                                                                    if (bl3) break block20;
                                                                    if (bl2) break block21;
                                                                }
                                                                bl2 = FastUse_47Q8.recovery$indy$11(field_43, -8067389746149391882L, l).method_48$ac4db64966().method_48$dbd570a038() instanceof C_43z;
                                                            }
                                                            bl5 = bl3;
                                                        }
                                                        if (l < 0L) break block22;
                                                        if (bl5) break block23;
                                                        if (bl2) break block24;
                                                        bl2 = FastUse_47Q8.recovery$indy$12(field_43, -8067389746149391882L, l).method_48$ac4db64966().method_48$dbd570a038() instanceof C_43y;
                                                        bl4 = bl3;
                                                        if (l < 0L) break block25;
                                                        if (bl4) break block26;
                                                        if (!bl2) break block27;
                                                    }
                                                    bl2 = FastUse_47Q8.recovery$indy$13(C_47G9.OTHER, -8066310146687744347L, l);
                                                }
                                                bl5 = bl3;
                                            }
                                            if (bl5) break block20;
                                            if (bl2) break block21;
                                        }
                                        bl2 = FastUse_47Q8.recovery$indy$14(field_43, -8067389746149391882L, l).method_48$ac4db64966().method_48$dbd570a038() instanceof C_43u;
                                    }
                                    bl4 = bl3;
                                }
                                if (l > 0L) {
                                    if (!bl4) {
                                        if (!bl2) return false;
                                        bl2 = FastUse_47Q8.recovery$indy$15(C_47G9.BOW, -8066310146687744347L, l);
                                    }
                                    bl4 = bl3;
                                }
                                if (l <= 0L) break block28;
                                if (bl4) break block20;
                                if (!bl2) return false;
                            }
                            bl2 = FastUse_47Q8.recovery$indy$16(l2, -8066623067996033500L, l);
                        }
                        bl4 = bl3;
                    }
                    if (bl4) break block29;
                    if (bl2) break block30;
                    bl2 = FastUse_47Q8.recovery$indy$17(this.settingOnlyWhileMoving, -8070006522093919575L, l);
                    bl = bl3;
                    if (l <= 0L) break block31;
                    if (bl) break block29;
                    if (bl2) return false;
                }
                bl2 = FastUse_47Q8.recovery$indy$18(field_43, -8067389746149391882L, l).method_43K$aae029aa0a();
            }
            bl = bl3;
        }
        if (bl) return bl2;
        if (!bl2) return true;
        bl2 = FastUse_47Q8.recovery$indy$19(this.settingOnlyAtFullLife, -8070006522093919575L, l);
        if (bl3) return bl2;
        if (bl2) return false;
        return true;
    }




   public void method_45$6c53b83f97(C_476v var1, long var2) {
   }



   public void method_47$4ff7ee0874(char var1, C_476v var2, int var3, short var4) {
      long var5 = (long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 29146574528749L;
      long var9 = var5 ^ 70751344748413L;
      long var11 = var5 ^ 136597720657651L;
      long var10000 = 3101399815207470836L;
      boolean var13 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10002 = 3101303346822381463L;
      long var15 = var11;
      ModeSetting var17 = this.settingMode;
      int var27 = (int) ((var17.method_46$5f9dc63072(var15).equalsIgnoreCase(recovery$indy$20(12458, 2334205339256430491L ^ var5))) ? 1 : 0);
      if (!var13) {
         if (var27 == 0) {
            return;
         }

         var10002 = 3102862893686088767L;
         long var18 = var7;
         FastUse_47Q8 var20 = this;
         var27 = (int) ((var20.method_45$0dd78e0064(var18)) ? 1 : 0);
      }

      if (!var13) {
         if (var27 == 0) {
            return;
         }

         var10002 = 3098664317130756765L;
         long var21 = var9;
         NumberSetting var23 = this.settingTimePackets;
         var27 = C_47sk.method_49$cabccf1c64((int)var23.method_44$474dfaa627(var21), 2, 31);
      }

      int var14 = var27;
      long var10001 = 3101775062138403575L;
      Minecraft var24 = field_43;
      if (var24.field_42P.method_41T$8abf5c6871() == 32 - var14) {
         var10002 = 3102637114638948170L;
         int var25 = var14;
         C_476v var26 = var2;
         var26.method_49$d00df7729d(var25);
      }
   }




   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 47076289715869L;
      long var5 = var1 ^ 49072313886417L;
      recovery$indy$21(this, 43, var5, -7100406159024876918L, var1);
      recovery$indy$22(this, 41, var5, -7100406159024876918L, var1);
      recovery$indy$23(this, 26, var5, -7100406159024876918L, var1);
      recovery$indy$24(this, 40, 10001, var3, -7100305345737019621L, var1);
   }



   private boolean method_48R$aae029aa0a() {
      long var1 = a ^ 49910375128012L;
      long var3 = var1 ^ 82932992296404L;
      long var10002 = 12734161907733680L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("TimeManipulation");
   }



   private boolean method_48N$aae029aa0a() {
      long var1 = a ^ 120254727647486L;
      long var3 = var1 ^ 12468323036902L;
      long var10002 = -1504345635988881534L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Packet");
   }



   private boolean method_481$aae029aa0a() {
      long var1 = a ^ 21673731399466L;
      long var3 = var1 ^ 129466196705586L;
      long var10002 = -8877998435221614506L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("NewPacket");
   }



   public void method_45q$e45a9973e5(long var1) {
        int var558;
        int var563;
        int var566;
        int var567;
        int var571;
        int var572;
        int var578;
        int var583;
        int var586;
        int var600;
        int var605;
      long var3 = var1 ^ 96137995072681L;
      long var5 = var1 ^ 15070989284153L;
      long var7 = var1 ^ 54777118390967L;
      long var9 = var1 ^ 34338054427488L;
      byte var11 = ((byte) (AirStuck_47Q4.method_419$aae029aa0a() ? 1 : 0));
      if (var11 == 0) {
         long var17 = var3;
         FastUse_47Q8 var19 = this;
         if (!var19.method_45$0dd78e0064(var17)) {
            this.field_42 = 0;
         } else {
            net.minecraft.client.Minecraft var20 = field_43;
            System.out.println(var20.field_42P.method_415$8abf5c6871());
            long var142 = var7;
            client.setting.ModeSetting var143 = this.settingMode;
            String var47 = var143.method_46$5f9dc63072(var142);
            byte var13 = ((byte) (-1));
            switch (var47.hashCode()) {
               case -1911998296:
                  int var69;
                  int var102;
                  int var138;
                  int var588;
                  byte var616;
                  label3931: {
                     label3953: {
                        label3720: {
                           label3721: {
                              label3353: {
                                 if (var47.equals("Packet")) {
                                    var13 = ((byte) (0));
                                    var588 = var11;
                                    if (var1 <= 0L) {
                                       if (var1 < 0L) {
                                          if (var11 == 0) {
                                             switch (var11) {
                                                case 0:
                                                   long var149 = var5;
                                                   client.setting.NumberSetting var156 = this.settingPackets;
                                                   var588 = net.C_47sk.method_49$cabccf1c64((int)var156.method_44$474dfaa627(var149), 2, 31);
                                                   break;
                                                case 1:
                                                   long var380 = var5;
                                                   client.setting.NumberSetting var396 = this.settingNewPackets;
                                                   var69 = (int)var396.method_44$474dfaa627(var380);
                                                   net.minecraft.client.Minecraft var412 = field_43;
                                                   if (var412.field_42P.method_415$8abf5c6871() < var11) {
                                                      net.minecraft.client.Minecraft var437 = field_43;
                                                      var69 = var437.field_42P.method_415$8abf5c6871();
                                                   }

                                                   net.minecraft.client.Minecraft var465 = field_43;
                                                   net.minecraft.client.Minecraft var493 = field_43;
                                                   var465.field_42P.method_471$d00df7729d(var493.field_42P.method_415$8abf5c6871() - var69);
                                                   var102 = 0;

                                                   while (true) {
                                                      while (var102 >= var69) {
                                                         while (var11 != 0) {
                                                         }
                                                      }

                                                      long var521 = var9;
                                                      FastUse_47Q8 var549 = this;
                                                      var549.method_45$95d88932bd(var521);
                                                      var102++;

                                                      while (var11 != 0) {
                                                      }
                                                   }
                                                default:
                                                   return;
                                             }
                                          }

                                          var69 = var588;
                                          boolean var111 = false;
                                          net.minecraft.client.Minecraft var168 = field_43;
                                          double var598 = var168.field_42P.method_41T$8abf5c6871();
                                          double var630 = var69;
                                          long var181 = var5;
                                          client.setting.NumberSetting var194 = this.settingPacketLoops;
                                          if (var598 > 32.0 - var630 * var194.method_44$474dfaa627(var181)) {
                                             var138 = 0;

                                             while (true) {
                                                if (var138 < var69) {
                                                   long var221 = var9;
                                                   FastUse_47Q8 var256 = this;
                                                   var138 += var256.method_45$95d88932bd(var221);
                                                   this.field_42++;

                                                   do {
                                                      net.minecraft.client.Minecraft var305 = field_43;
                                                      if (var305.field_42P.method_41T$8abf5c6871() + this.field_42 >= var11) {
                                                         var111 = true;
                                                      }
                                                   } while (var111);
                                                } else {
                                                   do {
                                                      net.minecraft.client.Minecraft var304 = field_43;
                                                      if (var304.field_42P.method_41T$8abf5c6871() + this.field_42 >= var11) {
                                                         var111 = true;
                                                      }
                                                   } while (var111);
                                                }

                                                var138++;
                                             }
                                          }

                                          return;
                                       }

                                       if (var11 == 0) {
                                          if (var11 != 0) {
                                             var13 = ((byte) (1));
                                          }

                                          var588 = var13;
                                       }

                                       if (var11 == 0) {
                                          switch (var588) {
                                             case 0:
                                                long var148 = var5;
                                                client.setting.NumberSetting var155 = this.settingPackets;
                                                var69 = net.C_47sk.method_49$cabccf1c64((int)var155.method_44$474dfaa627(var148), 2, 31);
                                                int var108 = 0;
                                                net.minecraft.client.Minecraft var167 = field_43;
                                                double var595 = var167.field_42P.method_41T$8abf5c6871();
                                                double var629 = var69;
                                                long var180 = var5;
                                                client.setting.NumberSetting var193 = this.settingPacketLoops;
                                                if (var595 > 32.0 - var629 * var193.method_44$474dfaa627(var180)) {
                                                   var138 = 0;

                                                   label3242:
                                                   while (true) {
                                                      if (var138 < var69) {
                                                         long var220 = var9;
                                                         FastUse_47Q8 var255 = this;
                                                         var138 += var255.method_45$95d88932bd(var220);
                                                         this.field_42++;

                                                         do {
                                                            net.minecraft.client.Minecraft var303 = field_43;
                                                            var588 = var303.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                            if (var11 != 0) {
                                                               break label3242;
                                                            }

                                                            if (var588 >= var11) {
                                                               var108 = 1;
                                                            }
                                                         } while ((var108) != 0);
                                                      } else {
                                                         do {
                                                            net.minecraft.client.Minecraft var302 = field_43;
                                                            var588 = var302.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                            if (var11 != 0) {
                                                               break label3242;
                                                            }

                                                            if (var588 >= var11) {
                                                               var108 = 1;
                                                            }
                                                         } while ((var108) != 0);
                                                      }

                                                      var138++;
                                                   }

                                                   if (var588 != 0) {
                                                      net.minecraft.client.Minecraft var336 = field_43;
                                                      net.minecraft.client.Minecraft var361 = field_43;
                                                      var336.field_44K.method_47$5b9c51f5c2(var361.field_42P);
                                                      this.field_42 = 0;
                                                      byte var597 = var11;
                                                      if (var11 == 0) {
                                                         if (var11 < var69) {
                                                            net.minecraft.client.Minecraft var436 = field_43;
                                                            var69 = var436.field_42P.method_415$8abf5c6871();
                                                         }

                                                         net.minecraft.client.Minecraft var464 = field_43;
                                                         net.minecraft.client.Minecraft var492 = field_43;
                                                         var464.field_42P.method_471$d00df7729d(var492.field_42P.method_415$8abf5c6871() - var69);
                                                         var597 = ((byte) (0));
                                                      }

                                                      var108 = var597;

                                                      while (var108 < var69) {
                                                         long var520 = var9;
                                                         FastUse_47Q8 var548 = this;
                                                         var548.method_45$95d88932bd(var520);
                                                         var108++;
                                                         if (var11 != 0 || var11 != 0) {
                                                            return;
                                                         }
                                                      }
                                                   }
                                                }

                                                return;
                                             case 1:
                                                long var379 = var5;
                                                client.setting.NumberSetting var395 = this.settingNewPackets;
                                                var69 = (int)var395.method_44$474dfaa627(var379);
                                                net.minecraft.client.Minecraft var411 = field_43;
                                                var588 = var411.field_42P.method_415$8abf5c6871();
                                                if (var11 == 0) {
                                                   if (var588 < var69) {
                                                      net.minecraft.client.Minecraft var435 = field_43;
                                                      var69 = var435.field_42P.method_415$8abf5c6871();
                                                   }

                                                   net.minecraft.client.Minecraft var463 = field_43;
                                                   net.minecraft.client.Minecraft var491 = field_43;
                                                   var463.field_42P.method_471$d00df7729d(var491.field_42P.method_415$8abf5c6871() - var69);
                                                   var588 = 0;
                                                }

                                                var102 = var588;

                                                while (var102 < var69) {
                                                   long var519 = var9;
                                                   FastUse_47Q8 var547 = this;
                                                   var547.method_45$95d88932bd(var519);
                                                   var102++;
                                                   if (var11 != 0 || var11 != 0) {
                                                      return;
                                                   }
                                                }

                                                return;
                                             default:
                                                return;
                                          }
                                       }

                                       var69 = var588;
                                       boolean var106 = false;
                                       net.minecraft.client.Minecraft var166 = field_43;
                                       double var593 = var166.field_42P.method_41T$8abf5c6871();
                                       double var628 = var69;
                                       long var179 = var5;
                                       client.setting.NumberSetting var192 = this.settingPacketLoops;
                                       if (!(var593 > 32.0 - var628 * var192.method_44$474dfaa627(var179))) {
                                          return;
                                       }

                                       var138 = 0;

                                       while (true) {
                                          if (var138 < var69) {
                                             long var219 = var9;
                                             FastUse_47Q8 var254 = this;
                                             var138 += var254.method_45$95d88932bd(var219);
                                             this.field_42++;

                                             do {
                                                net.minecraft.client.Minecraft var301 = field_43;
                                                var588 = var301.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                if (var11 != 0) {
                                                   break label3721;
                                                }

                                                if (var588 >= var11) {
                                                   var106 = true;
                                                }
                                             } while (var106);
                                          } else {
                                             do {
                                                net.minecraft.client.Minecraft var300 = field_43;
                                                var588 = var300.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                if (var11 != 0) {
                                                   break label3721;
                                                }

                                                if (var588 >= var11) {
                                                   var106 = true;
                                                }
                                             } while (var106);
                                          }

                                          var138++;
                                       }
                                    }

                                    label3349: {
                                       if (var11 != 0) {
                                          var586 = ((var47.equals("NewPacket")) ? 1 : 0);
                                          if (var11 != 0) {
                                             break label3349;
                                          }

                                          if (var586 != 0) {
                                             var13 = ((byte) (1));
                                          }
                                       }

                                       var586 = var13;
                                    }

                                    if (var11 == 0) {
                                       switch (var586) {
                                          case 0:
                                             long var147 = var5;
                                             client.setting.NumberSetting var154 = this.settingPackets;
                                             var69 = net.C_47sk.method_49$cabccf1c64((int)var154.method_44$474dfaa627(var147), 2, 31);
                                             int var104 = 0;
                                             net.minecraft.client.Minecraft var165 = field_43;
                                             double var590 = var165.field_42P.method_41T$8abf5c6871();
                                             double var627 = var69;
                                             long var178 = var5;
                                             client.setting.NumberSetting var191 = this.settingPacketLoops;
                                             if (var590 > 32.0 - var627 * var191.method_44$474dfaa627(var178)) {
                                                label3194: {
                                                   for (int var134 = 0; var134 < var69; var134++) {
                                                      long var218 = var9;
                                                      FastUse_47Q8 var253 = this;
                                                      var134 += var253.method_45$95d88932bd(var218);
                                                      this.field_42++;
                                                      net.minecraft.client.Minecraft var299 = field_43;
                                                      var588 = var299.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                      if (var11 != 0) {
                                                         break label3194;
                                                      }

                                                      if (var11 == 0) {
                                                         if (var588 >= 32) {
                                                            var104 = 1;
                                                         }

                                                         var588 = var104;
                                                      }

                                                      if (var588 != 0) {
                                                         break;
                                                      }
                                                   }

                                                   var588 = var104;
                                                }

                                                if (var588 != 0) {
                                                   net.minecraft.client.Minecraft var335 = field_43;
                                                   net.minecraft.client.Minecraft var360 = field_43;
                                                   var335.field_44K.method_47$5b9c51f5c2(var360.field_42P);
                                                   this.field_42 = 0;
                                                   if (var11 != 0) {
                                                      long var378 = var5;
                                                      client.setting.NumberSetting var394 = this.settingNewPackets;
                                                      var69 = (int)var394.method_44$474dfaa627(var378);
                                                      net.minecraft.client.Minecraft var410 = field_43;
                                                      var588 = var410.field_42P.method_415$8abf5c6871();
                                                      if (var11 == 0) {
                                                         if (var588 < var69) {
                                                            net.minecraft.client.Minecraft var434 = field_43;
                                                            var69 = var434.field_42P.method_415$8abf5c6871();
                                                         }

                                                         net.minecraft.client.Minecraft var462 = field_43;
                                                         net.minecraft.client.Minecraft var490 = field_43;
                                                         var462.field_42P.method_471$d00df7729d(var490.field_42P.method_415$8abf5c6871() - var69);
                                                         var588 = 0;
                                                      }

                                                      var104 = var588;

                                                      while (var104 < var69) {
                                                         long var518 = var9;
                                                         FastUse_47Q8 var546 = this;
                                                         var546.method_45$95d88932bd(var518);
                                                         var104++;
                                                         if (var11 != 0 || var11 != 0) {
                                                            return;
                                                         }
                                                      }
                                                   }

                                                   return;
                                                }
                                             }

                                             return;
                                          case 1:
                                             long var377 = var5;
                                             client.setting.NumberSetting var393 = this.settingNewPackets;
                                             var69 = (int)var393.method_44$474dfaa627(var377);
                                             net.minecraft.client.Minecraft var409 = field_43;
                                             var588 = var409.field_42P.method_415$8abf5c6871();
                                             if (var11 == 0) {
                                                if (var588 < var69) {
                                                   net.minecraft.client.Minecraft var433 = field_43;
                                                   var69 = var433.field_42P.method_415$8abf5c6871();
                                                }

                                                net.minecraft.client.Minecraft var461 = field_43;
                                                net.minecraft.client.Minecraft var489 = field_43;
                                                var461.field_42P.method_471$d00df7729d(var489.field_42P.method_415$8abf5c6871() - var69);
                                                var588 = 0;
                                             }

                                             var102 = var588;

                                             while (var102 < var69) {
                                                long var517 = var9;
                                                FastUse_47Q8 var545 = this;
                                                var545.method_45$95d88932bd(var517);
                                                var102++;
                                                if (var11 != 0 || var11 != 0) {
                                                   return;
                                                }
                                             }

                                             return;
                                          default:
                                             return;
                                       }
                                    }

                                    byte var65 = ((byte) (var586));
                                    var102 = 0;
                                    net.minecraft.client.Minecraft var164 = field_43;
                                    double var587 = var164.field_42P.method_41T$8abf5c6871();
                                    double var626 = var65;
                                    long var177 = var5;
                                    client.setting.NumberSetting var190 = this.settingPacketLoops;
                                    if (!(var587 > 32.0 - var626 * var190.method_44$474dfaa627(var177))) {
                                       return;
                                    }

                                    for (int var132 = 0; var132 < var65; var132++) {
                                       long var217 = var9;
                                       FastUse_47Q8 var252 = this;
                                       var132 += var252.method_45$95d88932bd(var217);
                                       this.field_42++;
                                       net.minecraft.client.Minecraft var298 = field_43;
                                       var588 = var298.field_42P.method_41T$8abf5c6871() + this.field_42;
                                       if (var11 != 0) {
                                          break label3353;
                                       }

                                       if (var11 == 0) {
                                          if (var588 >= 32) {
                                             var102 = 1;
                                          }

                                          var588 = var102;
                                       }

                                       if (var588 != 0) {
                                          break;
                                       }
                                    }
                                 } else {
                                    if (var11 == 0) {
                                       switch (var13) {
                                          case 0:
                                             long var150 = var5;
                                             client.setting.NumberSetting var157 = this.settingPackets;
                                             var69 = net.C_47sk.method_49$cabccf1c64((int)var157.method_44$474dfaa627(var150), 2, 31);
                                             int var116 = 0;
                                             net.minecraft.client.Minecraft var170 = field_43;
                                             double var603 = var170.field_42P.method_41T$8abf5c6871();
                                             double var632 = var69;
                                             long var183 = var5;
                                             client.setting.NumberSetting var196 = this.settingPacketLoops;
                                             if (!(var603 > 32.0 - var632 * var196.method_44$474dfaa627(var183))) {
                                                return;
                                             }

                                             label3934: {
                                                label3954: {
                                                   label3756: {
                                                      label3757: {
                                                         label3156: {
                                                            var138 = 0;
                                                            if (var138 < var69) {
                                                               long var227 = var9;
                                                               FastUse_47Q8 var262 = this;
                                                               var138 += var262.method_45$95d88932bd(var227);
                                                               this.field_42++;
                                                               net.minecraft.client.Minecraft var312 = field_43;
                                                               var588 = var312.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                               var616 = var11;
                                                               if (var1 < 0L) {
                                                                  break label3934;
                                                               }

                                                               if (var11 != 0) {
                                                                  if (var588 == 0) {
                                                                     return;
                                                                  }

                                                                  net.minecraft.client.Minecraft var340 = field_43;
                                                                  net.minecraft.client.Minecraft var365 = field_43;
                                                                  var340.field_44K.method_47$5b9c51f5c2(var365.field_42P);
                                                                  this.field_42 = 0;
                                                                  var605 = var11;
                                                                  if (var1 > 0L) {
                                                                     break label3954;
                                                                  }
                                                                  break label3756;
                                                               }

                                                               var616 = var11;
                                                               if (var1 <= 0L) {
                                                                  while (true) {
                                                                     if (var588 >= var616) {
                                                                        var116 = 1;
                                                                     }

                                                                     if (var116 == 0) {
                                                                        if (++var138 < var69) {
                                                                           var227 = var9;
                                                                           var262 = this;
                                                                           var138 += var262.method_45$95d88932bd(var227);
                                                                           this.field_42++;
                                                                        }
                                                                     }

                                                                     var312 = field_43;
                                                                     var588 = var312.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                                     if (var11 != 0) {
                                                                        break label3156;
                                                                     }

                                                                     var616 = var11;
                                                                  }
                                                               }

                                                               while (true) {
                                                                  if (var616 == 0) {
                                                                     if (var588 >= 32) {
                                                                        var116 = 1;
                                                                     }

                                                                     var588 = var116;
                                                                  }

                                                                  if (var588 != 0 || ++var138 >= var69) {
                                                                     break;
                                                                  }

                                                                  var227 = var9;
                                                                  var262 = this;
                                                                  var138 += var262.method_45$95d88932bd(var227);
                                                                  this.field_42++;
                                                                  var312 = field_43;
                                                                  var588 = var312.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                                  if (var11 != 0) {
                                                                     break label3757;
                                                                  }

                                                                  var616 = var11;
                                                               }
                                                            } else if (var1 <= 0L) {
                                                               net.minecraft.client.Minecraft var315 = field_43;
                                                               var588 = var315.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                               var616 = var11;
                                                               if (var1 < 0L) {
                                                                  break label3934;
                                                               }

                                                               while (true) {
                                                                  if (var616 != 0) {
                                                                     break label3156;
                                                                  }

                                                                  if (var588 >= var11) {
                                                                     var116 = 1;
                                                                  }

                                                                  if (var116 == 0) {
                                                                     if (++var138 < var69) {
                                                                        long var230 = var9;
                                                                        FastUse_47Q8 var265 = this;
                                                                        var138 += var265.method_45$95d88932bd(var230);
                                                                        this.field_42++;
                                                                     }
                                                                  }

                                                                  var315 = field_43;
                                                                  var588 = var315.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                                  var616 = var11;
                                                               }
                                                            }

                                                            var588 = var116;
                                                            break label3757;
                                                         }

                                                         if (var588 == 0) {
                                                            return;
                                                         }

                                                         net.minecraft.client.Minecraft var342 = field_43;
                                                         net.minecraft.client.Minecraft var367 = field_43;
                                                         var342.field_44K.method_47$5b9c51f5c2(var367.field_42P);
                                                         this.field_42 = 0;
                                                         var605 = var11;
                                                         break label3756;
                                                      }

                                                      if (var588 == 0) {
                                                         return;
                                                      }

                                                      net.minecraft.client.Minecraft var341 = field_43;
                                                      net.minecraft.client.Minecraft var366 = field_43;
                                                      var341.field_44K.method_47$5b9c51f5c2(var366.field_42P);
                                                      this.field_42 = 0;
                                                      var605 = var11;
                                                      break label3954;
                                                   }

                                                   if (var11 == 0) {
                                                      if (var605 < var69) {
                                                         net.minecraft.client.Minecraft var443 = field_43;
                                                         var69 = var443.field_42P.method_415$8abf5c6871();
                                                      }

                                                      net.minecraft.client.Minecraft var471 = field_43;
                                                      net.minecraft.client.Minecraft var499 = field_43;
                                                      var471.field_42P.method_471$d00df7729d(var499.field_42P.method_415$8abf5c6871() - var69);
                                                      var605 = 0;
                                                   }

                                                   var116 = var605;

                                                   while (var116 < var69) {
                                                      long var527 = var9;
                                                      FastUse_47Q8 var555 = this;
                                                      var555.method_45$95d88932bd(var527);
                                                      var116++;
                                                      if (var11 != 0 || var11 != 0) {
                                                         return;
                                                      }
                                                   }

                                                   return;
                                                }

                                                if (var605 != 0) {
                                                   long var383 = var5;
                                                   client.setting.NumberSetting var399 = this.settingNewPackets;
                                                   var69 = (int)var399.method_44$474dfaa627(var383);
                                                   net.minecraft.client.Minecraft var415 = field_43;
                                                   var588 = var415.field_42P.method_415$8abf5c6871();
                                                   if (var11 == 0) {
                                                      if (var588 < var69) {
                                                         net.minecraft.client.Minecraft var442 = field_43;
                                                         var69 = var442.field_42P.method_415$8abf5c6871();
                                                      }

                                                      net.minecraft.client.Minecraft var470 = field_43;
                                                      net.minecraft.client.Minecraft var498 = field_43;
                                                      var470.field_42P.method_471$d00df7729d(var498.field_42P.method_415$8abf5c6871() - var69);
                                                      var588 = 0;
                                                   }

                                                   var116 = var588;

                                                   while (var116 < var69) {
                                                      long var526 = var9;
                                                      FastUse_47Q8 var554 = this;
                                                      var554.method_45$95d88932bd(var526);
                                                      var116++;
                                                      if (var11 != 0 || var11 != 0) {
                                                         return;
                                                      }
                                                   }
                                                }

                                                return;
                                             }

                                             while (true) {
                                                if (var588 >= var616) {
                                                   var116 = 1;
                                                }

                                                if (var116 == 0) {
                                                   if (++var138 < var69) {
                                                      long var231 = var9;
                                                      FastUse_47Q8 var266 = this;
                                                      var138 += var266.method_45$95d88932bd(var231);
                                                      this.field_42++;
                                                   }
                                                }

                                                net.minecraft.client.Minecraft var317 = field_43;
                                                var588 = var317.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                var616 = var11;
                                             }
                                          case 1:
                                             long var382 = var5;
                                             client.setting.NumberSetting var398 = this.settingNewPackets;
                                             var69 = (int)var398.method_44$474dfaa627(var382);
                                             net.minecraft.client.Minecraft var414 = field_43;
                                             var588 = var414.field_42P.method_415$8abf5c6871();
                                             if (var1 >= 0L) {
                                                if (var11 == 0) {
                                                   if (var588 < var69) {
                                                      net.minecraft.client.Minecraft var441 = field_43;
                                                      var69 = var441.field_42P.method_415$8abf5c6871();
                                                   }

                                                   net.minecraft.client.Minecraft var469 = field_43;
                                                   net.minecraft.client.Minecraft var497 = field_43;
                                                   var469.field_42P.method_471$d00df7729d(var497.field_42P.method_415$8abf5c6871() - var69);
                                                   var588 = 0;
                                                }

                                                var102 = var588;

                                                while (var102 < var69) {
                                                   long var525 = var9;
                                                   FastUse_47Q8 var553 = this;
                                                   var553.method_45$95d88932bd(var525);
                                                   var102++;
                                                   if (var11 != 0 || var11 != 0) {
                                                      break;
                                                   }
                                                }

                                                return;
                                             }

                                             if (var588 < var11) {
                                                net.minecraft.client.Minecraft var440 = field_43;
                                                var69 = var440.field_42P.method_415$8abf5c6871();
                                             }

                                             net.minecraft.client.Minecraft var468 = field_43;
                                             net.minecraft.client.Minecraft var496 = field_43;
                                             var468.field_42P.method_471$d00df7729d(var496.field_42P.method_415$8abf5c6871() - var69);
                                             var102 = 0;

                                             while (true) {
                                                while (var102 >= var69) {
                                                   while (var11 != 0) {
                                                   }
                                                }

                                                long var524 = var9;
                                                FastUse_47Q8 var552 = this;
                                                var552.method_45$95d88932bd(var524);
                                                var102++;

                                                while (var11 != 0) {
                                                }
                                             }
                                          default:
                                             return;
                                       }
                                    }

                                    var69 = var13;
                                    var102 = 0;
                                    net.minecraft.client.Minecraft var169 = field_43;
                                    double var599 = var169.field_42P.method_41T$8abf5c6871();
                                    double var631 = var69;
                                    long var182 = var5;
                                    client.setting.NumberSetting var195 = this.settingPacketLoops;
                                    if (!(var599 > 32.0 - var631 * var195.method_44$474dfaa627(var182))) {
                                       return;
                                    }

                                    var138 = 0;
                                    if (var138 < var69) {
                                       long var222 = var9;
                                       FastUse_47Q8 var257 = this;
                                       var138 += var257.method_45$95d88932bd(var222);
                                       this.field_42++;
                                       net.minecraft.client.Minecraft var306 = field_43;
                                       var588 = var306.field_42P.method_41T$8abf5c6871() + this.field_42;
                                       var616 = var11;
                                       if (var1 < 0L) {
                                          break label3931;
                                       }

                                       if (var11 != 0) {
                                          if (var588 == 0) {
                                             return;
                                          }

                                          net.minecraft.client.Minecraft var337 = field_43;
                                          net.minecraft.client.Minecraft var362 = field_43;
                                          var337.field_44K.method_47$5b9c51f5c2(var362.field_42P);
                                          this.field_42 = 0;
                                          var600 = var11;
                                          if (var1 > 0L) {
                                             break label3953;
                                          }
                                          break label3720;
                                       }

                                       var616 = var11;
                                       if (var1 <= 0L) {
                                          while (true) {
                                             if (var588 >= var616) {
                                                var102 = 1;
                                             }

                                             if (var102 == 0) {
                                                if (++var138 < var69) {
                                                   var222 = var9;
                                                   var257 = this;
                                                   var138 += var257.method_45$95d88932bd(var222);
                                                   this.field_42++;
                                                }
                                             }

                                             var306 = field_43;
                                             var588 = var306.field_42P.method_41T$8abf5c6871() + this.field_42;
                                             if (var11 != 0) {
                                                break label3721;
                                             }

                                             var616 = var11;
                                          }
                                       }

                                       while (true) {
                                          if (var616 == 0) {
                                             if (var588 >= 32) {
                                                var102 = 1;
                                             }

                                             var588 = var102;
                                          }

                                          if (var588 != 0 || ++var138 >= var69) {
                                             break;
                                          }

                                          var222 = var9;
                                          var257 = this;
                                          var138 += var257.method_45$95d88932bd(var222);
                                          this.field_42++;
                                          var306 = field_43;
                                          var588 = var306.field_42P.method_41T$8abf5c6871() + this.field_42;
                                          if (var11 != 0) {
                                             break label3353;
                                          }

                                          var616 = var11;
                                       }
                                    } else if (var1 <= 0L) {
                                       net.minecraft.client.Minecraft var309 = field_43;
                                       var588 = var309.field_42P.method_41T$8abf5c6871() + this.field_42;
                                       var616 = var11;
                                       if (var1 < 0L) {
                                          break label3931;
                                       }

                                       while (true) {
                                          if (var616 != 0) {
                                             break label3721;
                                          }

                                          if (var588 >= var11) {
                                             var102 = 1;
                                          }

                                          if (var102 == 0) {
                                             if (++var138 < var69) {
                                                long var225 = var9;
                                                FastUse_47Q8 var260 = this;
                                                var138 += var260.method_45$95d88932bd(var225);
                                                this.field_42++;
                                             }
                                          }

                                          var309 = field_43;
                                          var588 = var309.field_42P.method_41T$8abf5c6871() + this.field_42;
                                          var616 = var11;
                                       }
                                    }
                                 }

                                 var588 = var102;
                              }

                              if (var588 == 0) {
                                 return;
                              }

                              net.minecraft.client.Minecraft var338 = field_43;
                              net.minecraft.client.Minecraft var363 = field_43;
                              var338.field_44K.method_47$5b9c51f5c2(var363.field_42P);
                              this.field_42 = 0;
                              var600 = var11;
                              break label3953;
                           }

                           if (var588 == 0) {
                              return;
                           }

                           net.minecraft.client.Minecraft var339 = field_43;
                           net.minecraft.client.Minecraft var364 = field_43;
                           var339.field_44K.method_47$5b9c51f5c2(var364.field_42P);
                           this.field_42 = 0;
                           var600 = var11;
                        }

                        if (var11 == 0) {
                           if (var600 < var69) {
                              net.minecraft.client.Minecraft var439 = field_43;
                              var69 = var439.field_42P.method_415$8abf5c6871();
                           }

                           net.minecraft.client.Minecraft var467 = field_43;
                           net.minecraft.client.Minecraft var495 = field_43;
                           var467.field_42P.method_471$d00df7729d(var495.field_42P.method_415$8abf5c6871() - var69);
                           var600 = 0;
                        }

                        var102 = var600;

                        while (var102 < var69) {
                           long var523 = var9;
                           FastUse_47Q8 var551 = this;
                           var551.method_45$95d88932bd(var523);
                           var102++;
                           if (var11 != 0 || var11 != 0) {
                              return;
                           }
                        }

                        return;
                     }

                     if (var600 != 0) {
                        long var381 = var5;
                        client.setting.NumberSetting var397 = this.settingNewPackets;
                        var69 = (int)var397.method_44$474dfaa627(var381);
                        net.minecraft.client.Minecraft var413 = field_43;
                        var588 = var413.field_42P.method_415$8abf5c6871();
                        if (var11 == 0) {
                           if (var588 < var69) {
                              net.minecraft.client.Minecraft var438 = field_43;
                              var69 = var438.field_42P.method_415$8abf5c6871();
                           }

                           net.minecraft.client.Minecraft var466 = field_43;
                           net.minecraft.client.Minecraft var494 = field_43;
                           var466.field_42P.method_471$d00df7729d(var494.field_42P.method_415$8abf5c6871() - var69);
                           var588 = 0;
                        }

                        var102 = var588;

                        while (var102 < var69) {
                           long var522 = var9;
                           FastUse_47Q8 var550 = this;
                           var550.method_45$95d88932bd(var522);
                           var102++;
                           if (var11 != 0 || var11 != 0) {
                              return;
                           }
                        }
                     }

                     return;
                  }

                  while (true) {
                     if (var588 >= var616) {
                        var102 = 1;
                     }

                     if (var102 == 0) {
                        if (++var138 < var69) {
                           long var226 = var9;
                           FastUse_47Q8 var261 = this;
                           var138 += var261.method_45$95d88932bd(var226);
                           this.field_42++;
                        }
                     }

                     net.minecraft.client.Minecraft var311 = field_43;
                     var588 = var311.field_42P.method_41T$8abf5c6871() + this.field_42;
                     var616 = var11;
                  }
               case 1304381992:
                  int var574 = ((int) (var47.equals("NewPacket") ? 1 : 0));
                  if (var1 >= 0L) {
                     if (var11 == 0) {
                        if (var574 != 0) {
                           var13 = ((byte) (1));
                        }

                        var574 = var13;
                     }

                     if (var11 == 0) {
                        switch (var574) {
                           case 0:
                              long var146 = var5;
                              client.setting.NumberSetting var153 = this.settingPackets;
                              int var63 = net.C_47sk.method_49$cabccf1c64((int)var153.method_44$474dfaa627(var146), 2, 31);
                              int var99 = 0;
                              net.minecraft.client.Minecraft var163 = field_43;
                              double var581 = var163.field_42P.method_41T$8abf5c6871();
                              double var625 = var63;
                              long var176 = var5;
                              client.setting.NumberSetting var189 = this.settingPacketLoops;
                              if (var581 > 32.0 - var625 * var189.method_44$474dfaa627(var176)) {
                                 label3951: {
                                    label3697: {
                                       label3698: {
                                          label2918: {
                                             int var128 = 0;
                                             if (var128 < var63) {
                                                long var213 = var9;
                                                FastUse_47Q8 var248 = this;
                                                var128 += var248.method_45$95d88932bd(var213);
                                                this.field_42++;
                                                net.minecraft.client.Minecraft var294 = field_43;
                                                var574 = var294.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                if (var11 != 0) {
                                                   if (var574 == 0) {
                                                      return;
                                                   }

                                                   net.minecraft.client.Minecraft var332 = field_43;
                                                   net.minecraft.client.Minecraft var357 = field_43;
                                                   var332.field_44K.method_47$5b9c51f5c2(var357.field_42P);
                                                   this.field_42 = 0;
                                                   var583 = var11;
                                                   if (var1 > 0L) {
                                                      break label3951;
                                                   }
                                                   break label3697;
                                                }

                                                byte var615 = var11;
                                                if (var1 <= 0L) {
                                                   while (true) {
                                                      if (var574 >= var615) {
                                                         var99 = 1;
                                                      }

                                                      if (var99 == 0) {
                                                         if (++var128 < var63) {
                                                            var213 = var9;
                                                            var248 = this;
                                                            var128 += var248.method_45$95d88932bd(var213);
                                                            this.field_42++;
                                                         }
                                                      }

                                                      var294 = field_43;
                                                      var574 = var294.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                      if (var11 != 0) {
                                                         break label3698;
                                                      }

                                                      var615 = var11;
                                                   }
                                                }

                                                while (true) {
                                                   if (var615 == 0) {
                                                      if (var574 >= 32) {
                                                         var99 = 1;
                                                      }

                                                      var574 = var99;
                                                   }

                                                   if (var574 != 0 || ++var128 >= var63) {
                                                      break;
                                                   }

                                                   var213 = var9;
                                                   var248 = this;
                                                   var128 += var248.method_45$95d88932bd(var213);
                                                   this.field_42++;
                                                   var294 = field_43;
                                                   var574 = var294.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                   if (var11 != 0) {
                                                      break label2918;
                                                   }

                                                   var615 = var11;
                                                }
                                             } else if (var1 <= 0L) {
                                                while (true) {
                                                   net.minecraft.client.Minecraft var297 = field_43;
                                                   var574 = var297.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                   if (var11 != 0) {
                                                      break label3698;
                                                   }

                                                   if (var574 >= var11) {
                                                      var99 = 1;
                                                   }

                                                   if (var99 == 0) {
                                                      if (++var128 < var63) {
                                                         long var216 = var9;
                                                         FastUse_47Q8 var251 = this;
                                                         var128 += var251.method_45$95d88932bd(var216);
                                                         this.field_42++;
                                                      }
                                                   }
                                                }
                                             }

                                             var574 = var99;
                                          }

                                          if (var574 == 0) {
                                             return;
                                          }

                                          net.minecraft.client.Minecraft var333 = field_43;
                                          net.minecraft.client.Minecraft var358 = field_43;
                                          var333.field_44K.method_47$5b9c51f5c2(var358.field_42P);
                                          this.field_42 = 0;
                                          var583 = var11;
                                          break label3951;
                                       }

                                       if (var574 == 0) {
                                          return;
                                       }

                                       net.minecraft.client.Minecraft var334 = field_43;
                                       net.minecraft.client.Minecraft var359 = field_43;
                                       var334.field_44K.method_47$5b9c51f5c2(var359.field_42P);
                                       this.field_42 = 0;
                                       var583 = var11;
                                    }

                                    if (var11 == 0) {
                                       if (var583 < var63) {
                                          net.minecraft.client.Minecraft var432 = field_43;
                                          var63 = var432.field_42P.method_415$8abf5c6871();
                                       }

                                       net.minecraft.client.Minecraft var460 = field_43;
                                       net.minecraft.client.Minecraft var488 = field_43;
                                       var460.field_42P.method_471$d00df7729d(var488.field_42P.method_415$8abf5c6871() - var63);
                                       var583 = 0;
                                    }

                                    var99 = var583;

                                    while (var99 < var63) {
                                       long var516 = var9;
                                       FastUse_47Q8 var544 = this;
                                       var544.method_45$95d88932bd(var516);
                                       var99++;
                                       if (var11 != 0 || var11 != 0) {
                                          return;
                                       }
                                    }

                                    return;
                                 }

                                 if (var583 != 0) {
                                    long var376 = var5;
                                    client.setting.NumberSetting var392 = this.settingNewPackets;
                                    var63 = (int)var392.method_44$474dfaa627(var376);
                                    net.minecraft.client.Minecraft var408 = field_43;
                                    var574 = var408.field_42P.method_415$8abf5c6871();
                                    if (var11 == 0) {
                                       if (var574 < var63) {
                                          net.minecraft.client.Minecraft var431 = field_43;
                                          var63 = var431.field_42P.method_415$8abf5c6871();
                                       }

                                       net.minecraft.client.Minecraft var459 = field_43;
                                       net.minecraft.client.Minecraft var487 = field_43;
                                       var459.field_42P.method_471$d00df7729d(var487.field_42P.method_415$8abf5c6871() - var63);
                                       var574 = 0;
                                    }

                                    var99 = var574;

                                    while (var99 < var63) {
                                       long var515 = var9;
                                       FastUse_47Q8 var543 = this;
                                       var543.method_45$95d88932bd(var515);
                                       var99++;
                                       if (var11 != 0 || var11 != 0) {
                                          break;
                                       }
                                    }
                                 }

                                 return;
                              }

                              return;
                           case 1:
                              long var375 = var5;
                              client.setting.NumberSetting var391 = this.settingNewPackets;
                              int var62 = (int)var391.method_44$474dfaa627(var375);
                              net.minecraft.client.Minecraft var407 = field_43;
                              var574 = var407.field_42P.method_415$8abf5c6871();
                              if (var11 == 0) {
                                 if (var574 < var62) {
                                    net.minecraft.client.Minecraft var430 = field_43;
                                    var62 = var430.field_42P.method_415$8abf5c6871();
                                 }

                                 net.minecraft.client.Minecraft var458 = field_43;
                                 net.minecraft.client.Minecraft var486 = field_43;
                                 var458.field_42P.method_471$d00df7729d(var486.field_42P.method_415$8abf5c6871() - var62);
                                 var574 = 0;
                              }

                              int var98 = var574;

                              while (var98 < var62) {
                                 long var514 = var9;
                                 FastUse_47Q8 var542 = this;
                                 var542.method_45$95d88932bd(var514);
                                 var98++;
                                 if (var11 != 0 || var11 != 0) {
                                    break;
                                 }
                              }

                              return;
                           default:
                              return;
                        }
                     } else {
                        int var60 = var574;
                        int var95 = 0;
                        net.minecraft.client.Minecraft var162 = field_43;
                        double var576 = var162.field_42P.method_41T$8abf5c6871();
                        double var624 = var60;
                        long var175 = var5;
                        client.setting.NumberSetting var188 = this.settingPacketLoops;
                        if (var576 > 32.0 - var624 * var188.method_44$474dfaa627(var175)) {
                           label3952: {
                              label3708: {
                                 label3709: {
                                    label2990: {
                                       int var125 = 0;
                                       if (var125 < var60) {
                                          long var209 = var9;
                                          FastUse_47Q8 var244 = this;
                                          var125 += var244.method_45$95d88932bd(var209);
                                          this.field_42++;
                                          net.minecraft.client.Minecraft var290 = field_43;
                                          var574 = var290.field_42P.method_41T$8abf5c6871() + this.field_42;
                                          if (var11 != 0) {
                                             if (var574 == 0) {
                                                return;
                                             }

                                             net.minecraft.client.Minecraft var329 = field_43;
                                             net.minecraft.client.Minecraft var354 = field_43;
                                             var329.field_44K.method_47$5b9c51f5c2(var354.field_42P);
                                             this.field_42 = 0;
                                             var578 = var11;
                                             if (var1 > 0L) {
                                                break label3952;
                                             }
                                             break label3708;
                                          }

                                          byte var614 = var11;
                                          if (var1 <= 0L) {
                                             while (true) {
                                                if (var574 >= var614) {
                                                   var95 = 1;
                                                }

                                                if (var95 == 0) {
                                                   if (++var125 < var60) {
                                                      var209 = var9;
                                                      var244 = this;
                                                      var125 += var244.method_45$95d88932bd(var209);
                                                      this.field_42++;
                                                   }
                                                }

                                                var290 = field_43;
                                                var574 = var290.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                if (var11 != 0) {
                                                   break label3709;
                                                }

                                                var614 = var11;
                                             }
                                          }

                                          while (true) {
                                             if (var614 == 0) {
                                                if (var574 >= 32) {
                                                   var95 = 1;
                                                }

                                                var574 = var95;
                                             }

                                             if (var574 != 0 || ++var125 >= var60) {
                                                break;
                                             }

                                             var209 = var9;
                                             var244 = this;
                                             var125 += var244.method_45$95d88932bd(var209);
                                             this.field_42++;
                                             var290 = field_43;
                                             var574 = var290.field_42P.method_41T$8abf5c6871() + this.field_42;
                                             if (var11 != 0) {
                                                break label2990;
                                             }

                                             var614 = var11;
                                          }
                                       } else if (var1 <= 0L) {
                                          while (true) {
                                             net.minecraft.client.Minecraft var293 = field_43;
                                             var574 = var293.field_42P.method_41T$8abf5c6871() + this.field_42;
                                             if (var11 != 0) {
                                                break label3709;
                                             }

                                             if (var574 >= var11) {
                                                var95 = 1;
                                             }

                                             if (var95 == 0) {
                                                if (++var125 < var60) {
                                                   long var212 = var9;
                                                   FastUse_47Q8 var247 = this;
                                                   var125 += var247.method_45$95d88932bd(var212);
                                                   this.field_42++;
                                                }
                                             }
                                          }
                                       }

                                       var574 = var95;
                                    }

                                    if (var574 == 0) {
                                       return;
                                    }

                                    net.minecraft.client.Minecraft var330 = field_43;
                                    net.minecraft.client.Minecraft var355 = field_43;
                                    var330.field_44K.method_47$5b9c51f5c2(var355.field_42P);
                                    this.field_42 = 0;
                                    var578 = var11;
                                    break label3952;
                                 }

                                 if (var574 == 0) {
                                    return;
                                 }

                                 net.minecraft.client.Minecraft var331 = field_43;
                                 net.minecraft.client.Minecraft var356 = field_43;
                                 var331.field_44K.method_47$5b9c51f5c2(var356.field_42P);
                                 this.field_42 = 0;
                                 var578 = var11;
                              }

                              if (var11 == 0) {
                                 if (var578 < var60) {
                                    net.minecraft.client.Minecraft var429 = field_43;
                                    var60 = var429.field_42P.method_415$8abf5c6871();
                                 }

                                 net.minecraft.client.Minecraft var457 = field_43;
                                 net.minecraft.client.Minecraft var485 = field_43;
                                 var457.field_42P.method_471$d00df7729d(var485.field_42P.method_415$8abf5c6871() - var60);
                                 var578 = 0;
                              }

                              var95 = var578;

                              while (var95 < var60) {
                                 long var513 = var9;
                                 FastUse_47Q8 var541 = this;
                                 var541.method_45$95d88932bd(var513);
                                 var95++;
                                 if (var11 != 0 || var11 != 0) {
                                    return;
                                 }
                              }

                              return;
                           }

                           if (var578 != 0) {
                              long var374 = var5;
                              client.setting.NumberSetting var390 = this.settingNewPackets;
                              var60 = (int)var390.method_44$474dfaa627(var374);
                              net.minecraft.client.Minecraft var406 = field_43;
                              var574 = var406.field_42P.method_415$8abf5c6871();
                              if (var11 == 0) {
                                 if (var574 < var60) {
                                    net.minecraft.client.Minecraft var428 = field_43;
                                    var60 = var428.field_42P.method_415$8abf5c6871();
                                 }

                                 net.minecraft.client.Minecraft var456 = field_43;
                                 net.minecraft.client.Minecraft var484 = field_43;
                                 var456.field_42P.method_471$d00df7729d(var484.field_42P.method_415$8abf5c6871() - var60);
                                 var574 = 0;
                              }

                              var95 = var574;

                              while (var95 < var60) {
                                 long var512 = var9;
                                 FastUse_47Q8 var540 = this;
                                 var540.method_45$95d88932bd(var512);
                                 var95++;
                                 if (var11 != 0 || var11 != 0) {
                                    break;
                                 }
                              }
                           }

                           return;
                        }

                        return;
                     }
                  } else {
                     if (var11 == 0) {
                        switch (var574) {
                           case 0:
                              long var145 = var5;
                              client.setting.NumberSetting var152 = this.settingPackets;
                              var574 = net.C_47sk.method_49$cabccf1c64((int)var152.method_44$474dfaa627(var145), 2, 31);
                              break;
                           case 1:
                              long var373 = var5;
                              client.setting.NumberSetting var389 = this.settingNewPackets;
                              int var58 = (int)var389.method_44$474dfaa627(var373);
                              net.minecraft.client.Minecraft var405 = field_43;
                              if (var405.field_42P.method_415$8abf5c6871() < var11) {
                                 net.minecraft.client.Minecraft var427 = field_43;
                                 var58 = var427.field_42P.method_415$8abf5c6871();
                              }

                              net.minecraft.client.Minecraft var455 = field_43;
                              net.minecraft.client.Minecraft var483 = field_43;
                              var455.field_42P.method_471$d00df7729d(var483.field_42P.method_415$8abf5c6871() - var58);
                              int var93 = 0;

                              while (true) {
                                 while (var93 >= var58) {
                                    while (var11 != 0) {
                                    }
                                 }

                                 long var511 = var9;
                                 FastUse_47Q8 var539 = this;
                                 var539.method_45$95d88932bd(var511);
                                 var93++;

                                 while (var11 != 0) {
                                 }
                              }
                           default:
                              return;
                        }
                     }

                     int var59 = var574;
                     boolean var94 = false;
                     net.minecraft.client.Minecraft var161 = field_43;
                     double var575 = var161.field_42P.method_41T$8abf5c6871();
                     double var623 = var59;
                     long var174 = var5;
                     client.setting.NumberSetting var187 = this.settingPacketLoops;
                     if (var575 > 32.0 - var623 * var187.method_44$474dfaa627(var174)) {
                        int var124 = 0;

                        while (true) {
                           if (var124 < var59) {
                              long var208 = var9;
                              FastUse_47Q8 var243 = this;
                              var124 += var243.method_45$95d88932bd(var208);
                              this.field_42++;

                              do {
                                 net.minecraft.client.Minecraft var289 = field_43;
                                 if (var289.field_42P.method_41T$8abf5c6871() + this.field_42 >= var11) {
                                    var94 = true;
                                 }
                              } while (var94);
                           } else {
                              do {
                                 net.minecraft.client.Minecraft var288 = field_43;
                                 if (var288.field_42P.method_41T$8abf5c6871() + this.field_42 >= var11) {
                                    var94 = true;
                                 }
                              } while (var94);
                           }

                           var124++;
                        }
                     }

                     return;
                  }
               default:
                  if (var11 == 0) {
                     switch (var13) {
                        case 0:
                           long var144 = var5;
                           client.setting.NumberSetting var151 = this.settingPackets;
                           int var56 = net.C_47sk.method_49$cabccf1c64((int)var151.method_44$474dfaa627(var144), 2, 31);
                           int var90 = 0;
                           net.minecraft.client.Minecraft var160 = field_43;
                           double var570 = var160.field_42P.method_41T$8abf5c6871();
                           double var622 = var56;
                           long var173 = var5;
                           client.setting.NumberSetting var186 = this.settingPacketLoops;
                           if (!(var570 > 32.0 - var622 * var186.method_44$474dfaa627(var173))) {
                              return;
                           } else {
                              int var122;
                              byte var612;
                              label3936: {
                                 label3955: {
                                    label3773: {
                                       label3774: {
                                          label3451: {
                                             var122 = 0;
                                             if (var122 < var56) {
                                                long var203 = var9;
                                                FastUse_47Q8 var238 = this;
                                                var122 += var238.method_45$95d88932bd(var203);
                                                this.field_42++;
                                                net.minecraft.client.Minecraft var282 = field_43;
                                                var571 = var282.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                var612 = var11;
                                                if (var1 < 0L) {
                                                   break label3936;
                                                }

                                                if (var11 != 0) {
                                                   if (var571 == 0) {
                                                      return;
                                                   }

                                                   net.minecraft.client.Minecraft var326 = field_43;
                                                   net.minecraft.client.Minecraft var351 = field_43;
                                                   var326.field_44K.method_47$5b9c51f5c2(var351.field_42P);
                                                   this.field_42 = 0;
                                                   var572 = var11;
                                                   if (var1 > 0L) {
                                                      break label3955;
                                                   }
                                                   break label3773;
                                                }

                                                var612 = var11;
                                                if (var1 <= 0L) {
                                                   while (true) {
                                                      if (var571 >= var612) {
                                                         var90 = 1;
                                                      }

                                                      if (var90 == 0) {
                                                         if (++var122 < var56) {
                                                            var203 = var9;
                                                            var238 = this;
                                                            var122 += var238.method_45$95d88932bd(var203);
                                                            this.field_42++;
                                                         }
                                                      }

                                                      var282 = field_43;
                                                      var571 = var282.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                      if (var11 != 0) {
                                                         break label3451;
                                                      }

                                                      var612 = var11;
                                                   }
                                                }

                                                while (true) {
                                                   if (var612 == 0) {
                                                      if (var571 >= 32) {
                                                         var90 = 1;
                                                      }

                                                      var571 = var90;
                                                   }

                                                   if (var571 != 0 || ++var122 >= var56) {
                                                      break;
                                                   }

                                                   var203 = var9;
                                                   var238 = this;
                                                   var122 += var238.method_45$95d88932bd(var203);
                                                   this.field_42++;
                                                   var282 = field_43;
                                                   var571 = var282.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                   if (var11 != 0) {
                                                      break label3774;
                                                   }

                                                   var612 = var11;
                                                }
                                             } else if (var1 <= 0L) {
                                                net.minecraft.client.Minecraft var285 = field_43;
                                                var571 = var285.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                var612 = var11;
                                                if (var1 < 0L) {
                                                   break label3936;
                                                }

                                                while (true) {
                                                   if (var612 != 0) {
                                                      break label3451;
                                                   }

                                                   if (var571 >= var11) {
                                                      var90 = 1;
                                                   }

                                                   if (var90 == 0) {
                                                      if (++var122 < var56) {
                                                         long var206 = var9;
                                                         FastUse_47Q8 var241 = this;
                                                         var122 += var241.method_45$95d88932bd(var206);
                                                         this.field_42++;
                                                      }
                                                   }

                                                   var285 = field_43;
                                                   var571 = var285.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                   var612 = var11;
                                                }
                                             }

                                             var571 = var90;
                                             break label3774;
                                          }

                                          if (var571 == 0) {
                                             return;
                                          }

                                          net.minecraft.client.Minecraft var328 = field_43;
                                          net.minecraft.client.Minecraft var353 = field_43;
                                          var328.field_44K.method_47$5b9c51f5c2(var353.field_42P);
                                          this.field_42 = 0;
                                          var572 = var11;
                                          break label3773;
                                       }

                                       if (var571 == 0) {
                                          return;
                                       }

                                       net.minecraft.client.Minecraft var327 = field_43;
                                       net.minecraft.client.Minecraft var352 = field_43;
                                       var327.field_44K.method_47$5b9c51f5c2(var352.field_42P);
                                       this.field_42 = 0;
                                       var572 = var11;
                                       break label3955;
                                    }

                                    if (var11 == 0) {
                                       if (var572 < var56) {
                                          net.minecraft.client.Minecraft var426 = field_43;
                                          var56 = var426.field_42P.method_415$8abf5c6871();
                                       }

                                       net.minecraft.client.Minecraft var454 = field_43;
                                       net.minecraft.client.Minecraft var482 = field_43;
                                       var454.field_42P.method_471$d00df7729d(var482.field_42P.method_415$8abf5c6871() - var56);
                                       var572 = 0;
                                    }

                                    var90 = var572;

                                    while (var90 < var56) {
                                       long var510 = var9;
                                       FastUse_47Q8 var538 = this;
                                       var538.method_45$95d88932bd(var510);
                                       var90++;
                                       if (var11 != 0 || var11 != 0) {
                                          return;
                                       }
                                    }

                                    return;
                                 }

                                 if (var572 != 0) {
                                    long var372 = var5;
                                    client.setting.NumberSetting var388 = this.settingNewPackets;
                                    var56 = (int)var388.method_44$474dfaa627(var372);
                                    net.minecraft.client.Minecraft var404 = field_43;
                                    int var573 = var404.field_42P.method_415$8abf5c6871();
                                    if (var11 == 0) {
                                       if (var573 < var56) {
                                          net.minecraft.client.Minecraft var425 = field_43;
                                          var56 = var425.field_42P.method_415$8abf5c6871();
                                       }

                                       net.minecraft.client.Minecraft var453 = field_43;
                                       net.minecraft.client.Minecraft var481 = field_43;
                                       var453.field_42P.method_471$d00df7729d(var481.field_42P.method_415$8abf5c6871() - var56);
                                       var573 = 0;
                                    }

                                    var90 = var573;

                                    while (var90 < var56) {
                                       long var509 = var9;
                                       FastUse_47Q8 var537 = this;
                                       var537.method_45$95d88932bd(var509);
                                       var90++;
                                       if (var11 != 0 || var11 != 0) {
                                          return;
                                       }
                                    }
                                 }

                                 return;
                              }

                              while (true) {
                                 if (var571 >= var612) {
                                    var90 = 1;
                                 }

                                 if (var90 == 0) {
                                    if (++var122 < var56) {
                                       long var207 = var9;
                                       FastUse_47Q8 var242 = this;
                                       var122 += var242.method_45$95d88932bd(var207);
                                       this.field_42++;
                                    }
                                 }

                                 net.minecraft.client.Minecraft var287 = field_43;
                                 var571 = var287.field_42P.method_41T$8abf5c6871() + this.field_42;
                                 var612 = var11;
                              }
                           }
                        case 1:
                           long var371 = var5;
                           client.setting.NumberSetting var387 = this.settingNewPackets;
                           int var55 = (int)var387.method_44$474dfaa627(var371);
                           net.minecraft.client.Minecraft var403 = field_43;
                           int var569 = var403.field_42P.method_415$8abf5c6871();
                           if (var1 >= 0L) {
                              if (var11 == 0) {
                                 if (var569 < var55) {
                                    net.minecraft.client.Minecraft var424 = field_43;
                                    var55 = var424.field_42P.method_415$8abf5c6871();
                                 }

                                 net.minecraft.client.Minecraft var452 = field_43;
                                 net.minecraft.client.Minecraft var480 = field_43;
                                 var452.field_42P.method_471$d00df7729d(var480.field_42P.method_415$8abf5c6871() - var55);
                                 var569 = 0;
                              }

                              int var89 = var569;

                              while (var89 < var55) {
                                 long var508 = var9;
                                 FastUse_47Q8 var536 = this;
                                 var536.method_45$95d88932bd(var508);
                                 var89++;
                                 if (var11 != 0 || var11 != 0) {
                                    break;
                                 }
                              }

                              return;
                           }

                           if (var569 < var11) {
                              net.minecraft.client.Minecraft var423 = field_43;
                              var55 = var423.field_42P.method_415$8abf5c6871();
                           }

                           net.minecraft.client.Minecraft var451 = field_43;
                           net.minecraft.client.Minecraft var479 = field_43;
                           var451.field_42P.method_471$d00df7729d(var479.field_42P.method_415$8abf5c6871() - var55);
                           int var88 = 0;

                           while (true) {
                              while (var88 >= var55) {
                                 while (var11 != 0) {
                                 }
                              }

                              long var507 = var9;
                              FastUse_47Q8 var535 = this;
                              var535.method_45$95d88932bd(var507);
                              var88++;

                              while (var11 != 0) {
                              }
                           }
                     }
                  } else {
                     int var53 = var13;
                     int var85 = 0;
                     net.minecraft.client.Minecraft var159 = field_43;
                     double var565 = var159.field_42P.method_41T$8abf5c6871();
                     double var621 = var53;
                     long var172 = var5;
                     client.setting.NumberSetting var185 = this.settingPacketLoops;
                     if (var565 > 32.0 - var621 * var185.method_44$474dfaa627(var172)) {
                        int var120;
                        byte var610;
                        label3938: {
                           label3956: {
                              label3784: {
                                 label3785: {
                                    label3523: {
                                       var120 = 0;
                                       if (var120 < var53) {
                                          long var198 = var9;
                                          FastUse_47Q8 var233 = this;
                                          var120 += var233.method_45$95d88932bd(var198);
                                          this.field_42++;
                                          net.minecraft.client.Minecraft var276 = field_43;
                                          var566 = var276.field_42P.method_41T$8abf5c6871() + this.field_42;
                                          var610 = var11;
                                          if (var1 < 0L) {
                                             break label3938;
                                          }

                                          if (var11 != 0) {
                                             if (var566 == 0) {
                                                return;
                                             }

                                             net.minecraft.client.Minecraft var323 = field_43;
                                             net.minecraft.client.Minecraft var348 = field_43;
                                             var323.field_44K.method_47$5b9c51f5c2(var348.field_42P);
                                             this.field_42 = 0;
                                             var567 = var11;
                                             if (var1 > 0L) {
                                                break label3956;
                                             }
                                             break label3784;
                                          }

                                          var610 = var11;
                                          if (var1 <= 0L) {
                                             while (true) {
                                                if (var566 >= var610) {
                                                   var85 = 1;
                                                }

                                                if (var85 == 0) {
                                                   if (++var120 < var53) {
                                                      var198 = var9;
                                                      var233 = this;
                                                      var120 += var233.method_45$95d88932bd(var198);
                                                      this.field_42++;
                                                   }
                                                }

                                                var276 = field_43;
                                                var566 = var276.field_42P.method_41T$8abf5c6871() + this.field_42;
                                                if (var11 != 0) {
                                                   break label3523;
                                                }

                                                var610 = var11;
                                             }
                                          }

                                          while (true) {
                                             if (var610 == 0) {
                                                if (var566 >= 32) {
                                                   var85 = 1;
                                                }

                                                var566 = var85;
                                             }

                                             if (var566 != 0 || ++var120 >= var53) {
                                                break;
                                             }

                                             var198 = var9;
                                             var233 = this;
                                             var120 += var233.method_45$95d88932bd(var198);
                                             this.field_42++;
                                             var276 = field_43;
                                             var566 = var276.field_42P.method_41T$8abf5c6871() + this.field_42;
                                             if (var11 != 0) {
                                                break label3785;
                                             }

                                             var610 = var11;
                                          }
                                       } else if (var1 <= 0L) {
                                          net.minecraft.client.Minecraft var279 = field_43;
                                          var566 = var279.field_42P.method_41T$8abf5c6871() + this.field_42;
                                          var610 = var11;
                                          if (var1 < 0L) {
                                             break label3938;
                                          }

                                          while (true) {
                                             if (var610 != 0) {
                                                break label3523;
                                             }

                                             if (var566 >= var11) {
                                                var85 = 1;
                                             }

                                             if (var85 == 0) {
                                                if (++var120 < var53) {
                                                   long var201 = var9;
                                                   FastUse_47Q8 var236 = this;
                                                   var120 += var236.method_45$95d88932bd(var201);
                                                   this.field_42++;
                                                }
                                             }

                                             var279 = field_43;
                                             var566 = var279.field_42P.method_41T$8abf5c6871() + this.field_42;
                                             var610 = var11;
                                          }
                                       }

                                       var566 = var85;
                                       break label3785;
                                    }

                                    if (var566 == 0) {
                                       return;
                                    }

                                    net.minecraft.client.Minecraft var325 = field_43;
                                    net.minecraft.client.Minecraft var350 = field_43;
                                    var325.field_44K.method_47$5b9c51f5c2(var350.field_42P);
                                    this.field_42 = 0;
                                    var567 = var11;
                                    break label3784;
                                 }

                                 if (var566 == 0) {
                                    return;
                                 }

                                 net.minecraft.client.Minecraft var324 = field_43;
                                 net.minecraft.client.Minecraft var349 = field_43;
                                 var324.field_44K.method_47$5b9c51f5c2(var349.field_42P);
                                 this.field_42 = 0;
                                 var567 = var11;
                                 break label3956;
                              }

                              if (var11 == 0) {
                                 if (var567 < var53) {
                                    net.minecraft.client.Minecraft var422 = field_43;
                                    var53 = var422.field_42P.method_415$8abf5c6871();
                                 }

                                 net.minecraft.client.Minecraft var450 = field_43;
                                 net.minecraft.client.Minecraft var478 = field_43;
                                 var450.field_42P.method_471$d00df7729d(var478.field_42P.method_415$8abf5c6871() - var53);
                                 var567 = 0;
                              }

                              var85 = var567;

                              while (var85 < var53) {
                                 long var506 = var9;
                                 FastUse_47Q8 var534 = this;
                                 var534.method_45$95d88932bd(var506);
                                 var85++;
                                 if (var11 != 0 || var11 != 0) {
                                    return;
                                 }
                              }

                              return;
                           }

                           if (var567 != 0) {
                              long var370 = var5;
                              client.setting.NumberSetting var386 = this.settingNewPackets;
                              var53 = (int)var386.method_44$474dfaa627(var370);
                              net.minecraft.client.Minecraft var402 = field_43;
                              int var568 = var402.field_42P.method_415$8abf5c6871();
                              if (var11 == 0) {
                                 if (var568 < var53) {
                                    net.minecraft.client.Minecraft var421 = field_43;
                                    var53 = var421.field_42P.method_415$8abf5c6871();
                                 }

                                 net.minecraft.client.Minecraft var449 = field_43;
                                 net.minecraft.client.Minecraft var477 = field_43;
                                 var449.field_42P.method_471$d00df7729d(var477.field_42P.method_415$8abf5c6871() - var53);
                                 var568 = 0;
                              }

                              var85 = var568;

                              while (var85 < var53) {
                                 long var505 = var9;
                                 FastUse_47Q8 var533 = this;
                                 var533.method_45$95d88932bd(var505);
                                 var85++;
                                 if (var11 != 0 || var11 != 0) {
                                    return;
                                 }
                              }
                           }

                           return;
                        }

                        while (true) {
                           if (var566 >= var610) {
                              var85 = 1;
                           }

                           if (var85 == 0) {
                              if (++var120 < var53) {
                                 long var202 = var9;
                                 FastUse_47Q8 var237 = this;
                                 var120 += var237.method_45$95d88932bd(var202);
                                 this.field_42++;
                              }
                           }

                           net.minecraft.client.Minecraft var281 = field_43;
                           var566 = var281.field_42P.method_41T$8abf5c6871() + this.field_42;
                           var610 = var11;
                        }
                     }
                  }
            }
         }
      } else {
         long var21 = var7;
         client.setting.ModeSetting var23 = this.settingMode;
         String var12 = var23.method_46$5f9dc63072(var21);
         int var10000 = var12.hashCode();
         if (var11 == 0) {
            switch (var10000) {
               case 0:
                  int var82;
                  int var119;
                  byte var608;
                  label3940: {
                     label3957: {
                        int var51;
                        label3800: {
                           label3801: {
                              long var24 = var5;
                              client.setting.NumberSetting var26 = this.settingPackets;
                              var51 = net.C_47sk.method_49$cabccf1c64((int)var26.method_44$474dfaa627(var24), 2, 31);
                              var82 = 0;
                              net.minecraft.client.Minecraft var158 = field_43;
                              double var561 = var158.field_42P.method_41T$8abf5c6871();
                              double var620 = var51;
                              long var171 = var5;
                              client.setting.NumberSetting var184 = this.settingPacketLoops;
                              double var633;
                              var119 = (var633 = var561 - (32.0 - var620 * var184.method_44$474dfaa627(var171))) == 0.0 ? 0 : (var633 < 0.0 ? -1 : 1);
                              if (var119 < var51) {
                                 long var197 = var9;
                                 FastUse_47Q8 var232 = this;
                                 var119 += var232.method_45$95d88932bd(var197);
                                 this.field_42++;
                                 net.minecraft.client.Minecraft var271 = field_43;
                                 var10000 = var271.field_42P.method_41T$8abf5c6871() + this.field_42;
                                 var608 = var11;
                                 if (var1 < 0L) {
                                    break label3940;
                                 }

                                 if (var11 != 0) {
                                    if (var10000 == 0) {
                                       return;
                                    }

                                    net.minecraft.client.Minecraft var320 = field_43;
                                    net.minecraft.client.Minecraft var345 = field_43;
                                    var320.field_44K.method_47$5b9c51f5c2(var345.field_42P);
                                    this.field_42 = 0;
                                    var563 = var11;
                                    if (var1 > 0L) {
                                       break label3957;
                                    }
                                    break label3800;
                                 }

                                 var608 = var11;
                                 if (var1 > 0L) {
                                    if (var11 == 0) {
                                       if (var10000 >= 32) {
                                          var82 = 1;
                                       }

                                       var10000 = var82;
                                    }

                                    if (var10000 != 0) {
                                    }
                                    break label3801;
                                 }

                                 while (true) {
                                    if (var10000 >= var608) {
                                       var82 = 1;
                                    }

                                    if (var82 == 0) {
                                       var119++;
                                    }

                                    var271 = field_43;
                                    var10000 = var271.field_42P.method_41T$8abf5c6871() + this.field_42;
                                    if (var11 != 0) {
                                       break;
                                    }

                                    var608 = var11;
                                 }
                              } else {
                                 if (var1 > 0L) {
                                    break label3801;
                                 }

                                 net.minecraft.client.Minecraft var273 = field_43;
                                 var10000 = var273.field_42P.method_41T$8abf5c6871() + this.field_42;
                                 var608 = var11;
                                 if (var1 < 0L) {
                                    break label3940;
                                 }

                                 while (var608 == 0) {
                                    if (var10000 >= var11) {
                                       var82 = 1;
                                    }

                                    if (var82 == 0) {
                                       var119++;
                                    }

                                    var273 = field_43;
                                    var10000 = var273.field_42P.method_41T$8abf5c6871() + this.field_42;
                                    var608 = var11;
                                 }
                              }

                              if (var10000 == 0) {
                                 return;
                              }

                              net.minecraft.client.Minecraft var321 = field_43;
                              net.minecraft.client.Minecraft var346 = field_43;
                              var321.field_44K.method_47$5b9c51f5c2(var346.field_42P);
                              this.field_42 = 0;
                              var563 = var11;
                              break label3800;
                           }

                           if (var82 == 0) {
                              return;
                           }

                           net.minecraft.client.Minecraft var322 = field_43;
                           net.minecraft.client.Minecraft var347 = field_43;
                           var322.field_44K.method_47$5b9c51f5c2(var347.field_42P);
                           this.field_42 = 0;
                           var563 = var11;
                           break label3957;
                        }

                        if (var11 == 0) {
                           if (var563 < var51) {
                              net.minecraft.client.Minecraft var419 = field_43;
                              var51 = var419.field_42P.method_415$8abf5c6871();
                           }

                           net.minecraft.client.Minecraft var447 = field_43;
                           net.minecraft.client.Minecraft var475 = field_43;
                           var447.field_42P.method_471$d00df7729d(var475.field_42P.method_415$8abf5c6871() - var51);
                           var563 = 0;
                        }

                        var82 = var563;

                        while (var82 < var51) {
                           long var503 = var9;
                           FastUse_47Q8 var531 = this;
                           var531.method_45$95d88932bd(var503);
                           var82++;
                           if (var11 != 0 || var11 != 0) {
                              return;
                           }
                        }

                        return;
                     }

                     if (var563 != 0) {
                        long var369 = var5;
                        client.setting.NumberSetting var385 = this.settingNewPackets;
                        int var52 = (int)var385.method_44$474dfaa627(var369);
                        net.minecraft.client.Minecraft var401 = field_43;
                        var10000 = var401.field_42P.method_415$8abf5c6871();
                        if (var11 == 0) {
                           if (var10000 < var52) {
                              net.minecraft.client.Minecraft var420 = field_43;
                              var52 = var420.field_42P.method_415$8abf5c6871();
                           }

                           net.minecraft.client.Minecraft var448 = field_43;
                           net.minecraft.client.Minecraft var476 = field_43;
                           var448.field_42P.method_471$d00df7729d(var476.field_42P.method_415$8abf5c6871() - var52);
                           var10000 = 0;
                        }

                        var82 = var10000;

                        while (var82 < var52) {
                           long var504 = var9;
                           FastUse_47Q8 var532 = this;
                           var532.method_45$95d88932bd(var504);
                           var82++;
                           if (var11 != 0 || var11 != 0) {
                              return;
                           }
                        }
                     }

                     return;
                  }

                  while (true) {
                     if (var10000 >= var608) {
                        var82 = 1;
                     }

                     if (var82 == 0) {
                        var119++;
                     }

                     net.minecraft.client.Minecraft var275 = field_43;
                     var10000 = var275.field_42P.method_41T$8abf5c6871() + this.field_42;
                     var608 = var11;
                  }
               case 1:
                  long var368 = var5;
                  client.setting.NumberSetting var384 = this.settingNewPackets;
                  int var50 = (int)var384.method_44$474dfaa627(var368);
                  net.minecraft.client.Minecraft var400 = field_43;
                  var10000 = var400.field_42P.method_415$8abf5c6871();
                  if (var1 >= 0L) {
                     if (var11 == 0) {
                        if (var10000 < var50) {
                           net.minecraft.client.Minecraft var418 = field_43;
                           var50 = var418.field_42P.method_415$8abf5c6871();
                        }

                        net.minecraft.client.Minecraft var446 = field_43;
                        net.minecraft.client.Minecraft var474 = field_43;
                        var446.field_42P.method_471$d00df7729d(var474.field_42P.method_415$8abf5c6871() - var50);
                        var10000 = 0;
                     }

                     int var81 = var10000;

                     while (var81 < var50) {
                        long var502 = var9;
                        FastUse_47Q8 var530 = this;
                        var530.method_45$95d88932bd(var502);
                        var81++;
                        if (var11 != 0 || var11 != 0) {
                           break;
                        }
                     }

                     return;
                  }

                  if (var10000 < var11) {
                     net.minecraft.client.Minecraft var417 = field_43;
                     var50 = var417.field_42P.method_415$8abf5c6871();
                  }

                  net.minecraft.client.Minecraft var445 = field_43;
                  net.minecraft.client.Minecraft var473 = field_43;
                  var445.field_42P.method_471$d00df7729d(var473.field_42P.method_415$8abf5c6871() - var50);
                  int var80 = 0;

                  while (true) {
                     while (var80 >= var50) {
                        while (var11 != 0) {
                        }
                     }

                     long var501 = var9;
                     FastUse_47Q8 var529 = this;
                     var529.method_45$95d88932bd(var501);
                     var80++;

                     while (var11 != 0) {
                     }
                  }
            }
         } else {
            int var15;
            int var16;
            byte var10001;
            label3942: {
               label3958: {
                  int var14;
                  label3811: {
                     label3812: {
                        var14 = var10000;
                        var15 = 0;
                        net.minecraft.client.Minecraft var27 = field_43;
                        double var556 = var27.field_42P.method_41T$8abf5c6871();
                        double var10002 = var14;
                        long var28 = var5;
                        client.setting.NumberSetting var30 = this.settingPacketLoops;
                        double var634;
                        var16 = (var634 = var556 - (32.0 - var10002 * var30.method_44$474dfaa627(var28))) == 0.0 ? 0 : (var634 < 0.0 ? -1 : 1);
                        if (var16 < var14) {
                           long var31 = var9;
                           FastUse_47Q8 var33 = this;
                           var16 += var33.method_45$95d88932bd(var31);
                           this.field_42++;
                           net.minecraft.client.Minecraft var34 = field_43;
                           var10000 = var34.field_42P.method_41T$8abf5c6871() + this.field_42;
                           var10001 = var11;
                           if (var1 < 0L) {
                              break label3942;
                           }

                           if (var11 != 0) {
                              if (var10000 == 0) {
                                 return;
                              }

                              net.minecraft.client.Minecraft var35 = field_43;
                              net.minecraft.client.Minecraft var36 = field_43;
                              var35.field_44K.method_47$5b9c51f5c2(var36.field_42P);
                              this.field_42 = 0;
                              var558 = var11;
                              if (var1 > 0L) {
                                 break label3958;
                              }
                              break label3811;
                           }

                           var10001 = var11;
                           if (var1 > 0L) {
                              if (var11 == 0) {
                                 if (var10000 >= 32) {
                                    var15 = 1;
                                 }

                                 var10000 = var15;
                              }

                              if (var10000 != 0) {
                              }
                              break label3812;
                           }

                           while (true) {
                              if (var10000 >= var10001) {
                                 var15 = 1;
                              }

                              if (var15 == 0) {
                                 var16++;
                              }

                              var34 = field_43;
                              var10000 = var34.field_42P.method_41T$8abf5c6871() + this.field_42;
                              if (var11 != 0) {
                                 break;
                              }

                              var10001 = var11;
                           }
                        } else {
                           if (var1 > 0L) {
                              break label3812;
                           }

                           net.minecraft.client.Minecraft var268 = field_43;
                           var10000 = var268.field_42P.method_41T$8abf5c6871() + this.field_42;
                           var10001 = var11;
                           if (var1 < 0L) {
                              break label3942;
                           }

                           while (var10001 == 0) {
                              if (var10000 >= var11) {
                                 var15 = 1;
                              }

                              if (var15 == 0) {
                                 var16++;
                              }

                              var268 = field_43;
                              var10000 = var268.field_42P.method_41T$8abf5c6871() + this.field_42;
                              var10001 = var11;
                           }
                        }

                        if (var10000 == 0) {
                           return;
                        }

                        net.minecraft.client.Minecraft var318 = field_43;
                        net.minecraft.client.Minecraft var343 = field_43;
                        var318.field_44K.method_47$5b9c51f5c2(var343.field_42P);
                        this.field_42 = 0;
                        var558 = var11;
                        break label3811;
                     }

                     if (var15 == 0) {
                        return;
                     }

                     net.minecraft.client.Minecraft var319 = field_43;
                     net.minecraft.client.Minecraft var344 = field_43;
                     var319.field_44K.method_47$5b9c51f5c2(var344.field_42P);
                     this.field_42 = 0;
                     var558 = var11;
                     break label3958;
                  }

                  if (var11 == 0) {
                     if (var558 < var14) {
                        net.minecraft.client.Minecraft var41 = field_43;
                        var14 = var41.field_42P.method_415$8abf5c6871();
                     }

                     net.minecraft.client.Minecraft var42 = field_43;
                     net.minecraft.client.Minecraft var43 = field_43;
                     var42.field_42P.method_471$d00df7729d(var43.field_42P.method_415$8abf5c6871() - var14);
                     var558 = 0;
                  }

                  var15 = var558;

                  while (var15 < var14) {
                     long var44 = var9;
                     FastUse_47Q8 var46 = this;
                     var46.method_45$95d88932bd(var44);
                     var15++;
                     if (var11 != 0 || var11 != 0) {
                        return;
                     }
                  }

                  return;
               }

               if (var558 != 0) {
                  long var37 = var5;
                  client.setting.NumberSetting var39 = this.settingNewPackets;
                  int var49 = (int)var39.method_44$474dfaa627(var37);
                  net.minecraft.client.Minecraft var40 = field_43;
                  var10000 = var40.field_42P.method_415$8abf5c6871();
                  if (var11 == 0) {
                     if (var10000 < var49) {
                        net.minecraft.client.Minecraft var416 = field_43;
                        var49 = var416.field_42P.method_415$8abf5c6871();
                     }

                     net.minecraft.client.Minecraft var444 = field_43;
                     net.minecraft.client.Minecraft var472 = field_43;
                     var444.field_42P.method_471$d00df7729d(var472.field_42P.method_415$8abf5c6871() - var49);
                     var10000 = 0;
                  }

                  var15 = var10000;

                  while (var15 < var49) {
                     long var500 = var9;
                     FastUse_47Q8 var528 = this;
                     var528.method_45$95d88932bd(var500);
                     var15++;
                     if (var11 != 0 || var11 != 0) {
                        return;
                     }
                  }
               }

               return;
            }

            while (true) {
               if (var10000 >= var10001) {
                  var15 = 1;
               }

               if (var15 == 0) {
                  var16++;
               }

               net.minecraft.client.Minecraft var270 = field_43;
               var10000 = var270.field_42P.method_41T$8abf5c6871() + this.field_42;
               var10001 = var11;
            }
         }
      }
   }






   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



   public void method_487$da8c82d5d4() {
      net.C_47S6 var41;
      float var44;
      float var51;
      long var1 = a ^ 139050234863544L;
      long var3 = var1 ^ 139366586011582L;
      long var5 = var1 ^ 35475769234067L;
      long var7 = var1 ^ 37789586739297L;
      long var9 = var1 ^ 26933110702496L;
      long var10001 = var1 ^ 138410340241604L;
      int var11 = (int)((var1 ^ 138410340241604L) >>> 48);
      int var12 = (int)((var1 ^ 138410340241604L) << 16 >>> 32);
      int var13 = (int)(var10001 << 48 >>> 48);
      long var10000 = -4298396733785396825L;
      boolean var14 = AirStuck_47Q4.method_419$aae029aa0a();
      long var10002 = -4298282647543541564L;
      long var15 = var9;
      ModeSetting var17 = this.settingMode;
      boolean var40 = var17.method_46$5f9dc63072(var15).equals("Grim-1.17");
      if (!var14) {
         if (!var40) {
            return;
         }

         var10002 = -4297294831991616660L;
         long var18 = var3;
         FastUse_47Q8 var20 = this;
         var40 = var20.method_45$0dd78e0064(var18);
      }

      label56: {
         if (!var14) {
            if (!var40) {
               return;
            }

            var41 = ClientGlobals.field_46;
            if (var14) {
               break label56;
            }

            var10001 = -4296595756797250378L;
            C_47S6 var21 = ClientGlobals.field_46;
            C_477r var42 = var21.method_44$4f8050086d();
            var10002 = -4298670820977002133L;
            C_47S6 var22 = ClientGlobals.field_46;
            C_477r var48 = var22.method_47$4f8050086d();
            long var10003 = -4296869201667976285L;
            C_477r var23 = var48;
            long var24 = var7;
            C_477r var26 = var42;
            var40 = var26.method_49$49ecd853ff(var24, var23);
         }

         if (!var40) {
            return;
         }

         var41 = ClientGlobals.field_46;
      }

      label34: {
         var10002 = -4296595756797250378L;
         C_47S6 var27 = ClientGlobals.field_46;
         var44 = var27.method_44$4f8050086d().field_44;
         long var52 = -4296595756797250378L;
         C_47S6 var28 = ClientGlobals.field_46;
         float var50 = var28.method_44$4f8050086d().field_41;
         float var53 = 0.0F;
         if (!var14) {
            if (var50 > 0.0F) {
               var52 = -4296595756797250378L;
               C_47S6 var29 = ClientGlobals.field_46;
               var51 = var29.method_44$4f8050086d().field_41 + 0.2F;
               break label34;
            }

            var52 = -4296595756797250378L;
            C_47S6 var30 = ClientGlobals.field_46;
            var50 = var30.method_44$4f8050086d().field_41;
            var53 = 0.2F;
         }

         var51 = var50 - var53;
      }

      long var10004 = -4296595756797250378L;
      C_47S6 var31 = ClientGlobals.field_46;
      long var10006 = -4296595756797250378L;
      C_47S6 var32 = ClientGlobals.field_46;
      var10006 = -4297009974479751060L;
      C_477r var45 = C_47gg.method_45$5c9cee6350(var44, var51, var5, var31.method_44$4f8050086d().field_41, var32.method_44$4f8050086d().field_41);
      char var56 = (char)var11;
      long var10007 = -4298549839200540075L;
      FastUse_47Q8 var33 = this;
      int var34 = var13;
      int var35 = var12;
      char var36 = var56;
      byte var37 = 1;
      C_477r var38 = var45;
      C_47S6 var39 = var41;
      var39.method_45$c163d5afc8(var38, var37, var36, var35, var34, var33);
   }





   private boolean method_485$aae029aa0a() {
      long var1 = a ^ 119590059421586L;
      long var3 = var1 ^ 11878917435786L;
      long var10000 = -5443860755570436317L;
      boolean var5 = AirStuck_47Q4.method_45$aae029aa0a();
      long var10002 = -5443871152702660370L;
      long var6 = var3;
      ModeSetting var8 = this.settingMode;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Packet");
      if (var5) {
         if (!var12) {
            var10002 = -5443871152702660370L;
            long var9 = var3;
            ModeSetting var11 = this.settingMode;
            boolean var14 = var11.method_46$5f9dc63072(var9).equals("NewPacket");
            if (!var5) {
               return var14;
            }

            if (!var14) {
               return false;
            }
         }

         var12 = true;
      }

      return var12;
   }



   private boolean method_480$aae029aa0a() {
      long var1 = a ^ 70464728964567L;
      long var3 = var1 ^ 41917346104271L;
      long var10002 = -8775737944133053781L;
      long var5 = var3;
      ModeSetting var7 = this.settingMode;
      return var7.method_46$5f9dc63072(var5).equals("Packet");
   }



    public FastUse_47Q8(long a0) {
        super((java.lang.String) ("FastUse"),(java.lang.String) ("SchnellBenutzen"),(long) (((augustus.recovered.modules.player.FastUse_47Q8.a ^ a0) ^ 27021908084910L)),(java.awt.Color) (new java.awt.Color((int) (173),(int) (121),(int) (81))),(client.module.Category) (client.module.Category.PLAYER));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.player.FastUse_47Q8.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.player.FastUse_47Q8.a ^ a0) ^ 45554008065368L);
        int constructorPart4 = (int) ((((augustus.recovered.modules.player.FastUse_47Q8.a ^ a0) ^ 98626360825609L) >>> 32));
        int constructorPart5 = (int) (((((augustus.recovered.modules.player.FastUse_47Q8.a ^ a0) ^ 98626360825609L) << 32) >>> 48));
        int constructorPart6 = (int) (((((augustus.recovered.modules.player.FastUse_47Q8.a ^ a0) ^ 98626360825609L) << 48) >>> 48));
        long constructorKey7 = ((augustus.recovered.modules.player.FastUse_47Q8.a ^ a0) ^ 91429490882659L);
        long constructorKey8 = ((augustus.recovered.modules.player.FastUse_47Q8.a ^ a0) ^ 116234777351349L);
        long constructorKey9 = ((augustus.recovered.modules.player.FastUse_47Q8.a ^ a0) ^ 75794223295282L);
        java.lang.Object initialValue10 = recovery$indy$flow$275(4);
        ((java.lang.Object[]) initialValue10)[0] = "Packet";
        ((java.lang.Object[]) initialValue10)[1] = "TimeManipulation";
        ((java.lang.Object[]) initialValue10)[2] = "NewPacket";
        ((java.lang.Object[]) initialValue10)[3] = "Grim-1.17";
        client.setting.ModeSetting initialized11 = new client.setting.ModeSetting(this, "Mode", constructorKey7, "Packet", (java.lang.String[]) (initialValue10));
        recovery$indy$flow$277(this, initialized11);
        java.lang.Object initialValue12 = recovery$indy$flow$279(2);
        ((java.lang.Object[]) initialValue12)[0] = "Default";
        ((java.lang.Object[]) initialValue12)[1] = "Legit";
        client.setting.ModeSetting initialized13 = new client.setting.ModeSetting(this, "PacketMode", constructorKey7, "Default", (java.lang.String[]) (initialValue12));
        java.lang.Object initialValue14 = recovery$indy$flow$281(this);
        java.lang.Object initialValue15 = initialValue14;
        client.setting.ModeSetting initialValue16 = initialized13;
        java.lang.Object initialValue17 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue16))))));
        java.lang.Object initialValue18 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue15))))));
        java.lang.Object initialValue19 = recovery$indy$flow$284(initialValue17, initialValue18);
        recovery$indy$flow$285(this, initialValue19);
        client.setting.BooleanSetting initialized20 = new client.setting.BooleanSetting(this, constructorKey8, "OnlyWhileMoving", false);
        recovery$indy$flow$288(this, initialized20);
        client.setting.NumberSetting initialized21 = new client.setting.NumberSetting(this, "PacketLoops", 1.0D, constructorKey9, 1.0D, Double.longBitsToDouble(4621819117588971520L), 0);
        java.lang.Object initialValue22 = recovery$indy$flow$291(this);
        java.lang.Object initialValue23 = initialValue22;
        client.setting.NumberSetting initialValue24 = initialized21;
        java.lang.Object initialValue25 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue26 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue27 = recovery$indy$flow$294(initialValue25, initialValue26);
        recovery$indy$flow$295(this, initialValue27);
        client.setting.NumberSetting initialized28 = new client.setting.NumberSetting(this, "Packets", Double.longBitsToDouble(4626322717216342016L), constructorKey9, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4629418941960159232L), 0);
        java.lang.Object initialValue29 = recovery$indy$flow$298(this);
        java.lang.Object initialValue30 = initialValue29;
        client.setting.NumberSetting initialValue31 = initialized28;
        java.lang.Object initialValue32 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue33 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue30))))));
        java.lang.Object initialValue34 = recovery$indy$flow$301(initialValue32, initialValue33);
        recovery$indy$flow$302(this, initialValue34);
        client.setting.NumberSetting initialized35 = new client.setting.NumberSetting(this, "GrimPackets", Double.longBitsToDouble(4626322717216342016L), constructorKey9, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4629418941960159232L), 0);
        short converted36 = (short) (constructorPart6);
        int initialValue37 = (int) (converted36);
        int initialValue38 = constructorPart5;
        java.lang.String initialValue39 = "Packets";
        int initialValue40 = constructorPart4;
        client.setting.NumberSetting initialValue41 = initialized35;
        java.lang.Object initialValue42 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue41))))));
        java.lang.Object initialValue43 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue39))))));
        java.lang.Object initialValue44 = recovery$indy$flow$307(initialValue42, initialValue40, initialValue43, initialValue38, (short) (initialValue37));
        java.lang.Object initialValue45 = recovery$indy$flow$308(this);
        java.lang.Object initialValue46 = initialValue45;
        java.lang.Object initialValue47 = initialValue44;
        java.lang.Object initialValue48 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue47))))));
        java.lang.Object initialValue49 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue46))))));
        java.lang.Object initialValue50 = recovery$indy$flow$311(initialValue48, initialValue49);
        recovery$indy$flow$312(this, initialValue50);
        client.setting.NumberSetting initialized51 = new client.setting.NumberSetting(this, "NewPackets", Double.longBitsToDouble(4626322717216342016L), constructorKey9, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4629418941960159232L), 0);
        short converted52 = (short) (constructorPart6);
        int initialValue53 = (int) (converted52);
        int initialValue54 = constructorPart5;
        java.lang.String initialValue55 = "Packets";
        int initialValue56 = constructorPart4;
        client.setting.NumberSetting initialValue57 = initialized51;
        java.lang.Object initialValue58 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue59 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue55))))));
        java.lang.Object initialValue60 = recovery$indy$flow$317(initialValue58, initialValue56, initialValue59, initialValue54, (short) (initialValue53));
        java.lang.Object initialValue61 = recovery$indy$flow$318(this);
        java.lang.Object initialValue62 = initialValue61;
        java.lang.Object initialValue63 = initialValue60;
        java.lang.Object initialValue64 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue63))))));
        java.lang.Object initialValue65 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue62))))));
        java.lang.Object initialValue66 = recovery$indy$flow$321(initialValue64, initialValue65);
        recovery$indy$flow$322(this, initialValue66);
        client.setting.NumberSetting initialized67 = new client.setting.NumberSetting(this, "TimePackets", Double.longBitsToDouble(4626322717216342016L), constructorKey9, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4629418941960159232L), 0);
        short converted68 = (short) (constructorPart6);
        int initialValue69 = (int) (converted68);
        int initialValue70 = constructorPart5;
        java.lang.String initialValue71 = "Packets";
        int initialValue72 = constructorPart4;
        client.setting.NumberSetting initialValue73 = initialized67;
        java.lang.Object initialValue74 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue73))))));
        java.lang.Object initialValue75 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(initialValue71))))));
        java.lang.Object initialValue76 = recovery$indy$flow$327(initialValue74, initialValue72, initialValue75, initialValue70, (short) (initialValue69));
        java.lang.Object initialValue77 = recovery$indy$flow$328(this);
        java.lang.Object initialValue78 = initialValue77;
        java.lang.Object initialValue79 = initialValue76;
        java.lang.Object initialValue80 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue79))))));
        java.lang.Object initialValue81 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue78))))));
        java.lang.Object initialValue82 = recovery$indy$flow$331(initialValue80, initialValue81);
        recovery$indy$flow$332(this, initialValue82);
        client.setting.BooleanSetting initialized83 = new client.setting.BooleanSetting(this, constructorKey8, "OnlyAtFullLife", false);
        recovery$indy$flow$335(this, initialized83);
        client.setting.BooleanSetting initialized84 = new client.setting.BooleanSetting(this, constructorKey8, "OnlyOnGround", false);
        recovery$indy$flow$338(this, initialized84);
        java.lang.Object initialValue85 = recovery$indy$flow$340();
        client.setting.MultiSelectSetting initialized86 = new client.setting.MultiSelectSetting(this, "Items", constructorKey3, (net.C_47OZ[]) (initialValue85));
        recovery$indy$flow$342(this, initialized86);
        recovery$indy$flow$343(this, 0);
    }





    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$275(int a0);
    private static native void recovery$indy$flow$277(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$279(int a0);
    private static native java.lang.Object recovery$indy$flow$281(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$284(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$285(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$288(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$291(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$294(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$295(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$298(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$301(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$302(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$307(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$308(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$311(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$312(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$317(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$318(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$321(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$322(java.lang.Object a0,java.lang.Object a1);


    private static native java.lang.Object recovery$indy$flow$327(java.lang.Object a0,int a1,java.lang.Object a2,int a3,short a4);
    private static native java.lang.Object recovery$indy$flow$328(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$331(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$332(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$335(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$338(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$340();
    private static native void recovery$indy$flow$342(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$343(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.player.FastUse_47Q8) (a0)).field_42 = a1;
        return;
    }
   private static native MethodHandle recovery$constant$0();
   private static native String recovery$indy$1(int var0, long var1);
   private static native boolean recovery$indy$2(long var0, long var2);
   private static native WorldClient recovery$indy$3(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$4(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native boolean recovery$indy$10(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$11(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);
   private static native boolean recovery$indy$13(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$14(Object var0, long var1, long var3);
   private static native boolean recovery$indy$15(Object var0, long var1, long var3);
   private static native boolean recovery$indy$16(long var0, long var2, long var4);
   private static native boolean recovery$indy$17(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);
   private static native boolean recovery$indy$19(Object var0, long var1, long var3);
   private static native String recovery$indy$20(int var0, long var1);
   private static native void recovery$indy$21(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$22(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$23(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$24(Object var0, int var1, int var2, long var3, long var5, long var7);
   private static native MethodHandle recovery$constant$31();
}
