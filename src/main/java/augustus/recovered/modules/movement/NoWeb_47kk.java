package augustus.recovered.modules.movement;
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
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_42V;
import net.C_43F;
import net.C_45n;
import net.C_472n;
import net.C_473U;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import net.C_47Rw;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47Th;
import net.C_47Vc;
import net.C_47cu;
import net.C_47hi;
import net.C_47iC;
import net.C_47ob;
import net.C_47od;
import net.C_47oo;
import net.C_47rf;
import client.module.Category;
import net.C_47tu;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class NoWeb_47kk extends client.module.Module implements net.C_47od,net.C_47hi,net.C_47Vc,net.C_47iC {
    public final net.C_47Th settingModes = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingNoDown = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNoNoDownWhileVelocity = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingUpDown = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingNoHorizontalMoveWhileUpAndDown = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingUpSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingDownSpeed = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47cu field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_42 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String field_49; // Runtime access flags and ConstantValue are restored from the original class.
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

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native void a();

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

    public void method_41$9035875d26(long l, C_47ob c_47ob) {
        block2: {
            C_47rf c_47rf;
            block4: {
                C_42V c_42V;
                C_42V c_42V2;
                boolean bl;
                block3: {
                    C_473U c_473U;
                    block1: {
                        C_473U c_473U2;
                        bl = NoWeb_47kk.recovery$indy$1(-7188296236104267192L, l);
                        c_473U = c_473U2 = NoWeb_47kk.recovery$indy$2(c_47ob, -7188058592905465471L, l);
                        if (!bl) break block1;
                        if (!(c_473U instanceof C_42V)) break block2;
                        c_473U = c_473U2;
                    }
                    c_42V = c_42V2 = (C_42V)c_473U;
                    if (!bl) break block3;
                    if (c_42V.method_44$8abf5c6871() >= 5) break block2;
                    c_42V = c_42V2;
                }
                c_47rf = c_42V.method_46$ac4db64966();
                if (!bl) break block4;
                if (c_47rf == null) break block2;
                c_47rf = c_42V2.method_46$ac4db64966();
            }
            if (c_47rf.method_48$dbd570a038() instanceof C_43F) {
                NoWeb_47kk.recovery$indy$3(this.field_46, -7192012131317468606L, l);
            }
        }
    }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 138508327410234L;
      long var3 = var1 ^ 19367487729330L;
      long var10000 = 3116785028789042487L;
      boolean var5 = Fly_47kE.method_48$aae029aa0a();
      long var10002 = 3120349418270534119L;
      long var6 = var3;
      C_47Th var8 = this.settingModes;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Ignore");
      if (var5) {
         if (var12) {
            return false;
         }

         var10002 = 3120349418270534119L;
         long var9 = var3;
         C_47Th var11 = this.settingModes;
         var12 = var11.method_46$5f9dc63072(var9).equals("Solid");
      }

      return !var5 ? var12 : !var12;
   }



   public static void method_49$a7421bf54c(String var0) {
      field_49 = var0;
   }



   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 100127422129150L;
      long var10000 = -3277223286488940692L;
      boolean var3 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = -3275578233401138955L;
      BooleanSetting var4 = this.settingNoDown;
      boolean var6 = var4.method_44$aae029aa0a();
      if (!var3) {
         if (!var6) {
            return false;
         }

         var10001 = -3277315858096308644L;
         BooleanSetting var5 = this.settingNoDown;
         var6 = var5.method_49$aae029aa0a();
      }

      return var3 ? var6 : var6;
   }



   public void method_47$05bd94f678(C_472n var1, long var2) {
      net.C_472n var7;
      long var4 = var2 ^ 77412314636080L;
      boolean var6 = recovery$indy$4(6395258481881429288L, var2);
      boolean var10000 = recovery$indy$5(this.settingNoHorizontalMoveWhileUpAndDown, 6395342278801667096L, var2);
      if (!var6) {
         if (!var10000) {
            return;
         }

         var10000 = recovery$indy$6(this.settingUpDown, 6395342278801667096L, var2);
      }

      boolean var10001 = var6;
      if (var2 >= 0L) {
         if (!var6) {
            if (!var10000) {
               return;
            }

            var10000 = recovery$indy$7(this.field_42, 200L, var4, 6398772865367732426L, var2);
         }

         var10001 = var6;
      }

      label65: {
         if (!var10001) {
            if (!var10000) {
               return;
            }

            var7 = var1;
            if (var6) {
               break label65;
            }

            var10000 = recovery$indy$8(var1, 6399186241123106081L, var2);
         }

         if (!var10000) {
            var7 = var1;
            if (var6) {
               break label65;
            }

            if (!recovery$indy$9(var1, 6399451974013807805L, var2)) {
               return;
            }
         }

         recovery$indy$10(var1, 0.0F, 6399119016467680115L, var2);
         var7 = var1;
      }

      recovery$indy$11(var7, 0.0F, 6399322451106453037L, var2);
   }



   public void method_47$2fe7f6c171(C_47Rw var1, long var2) {
      boolean var4 = recovery$indy$12(3159348149605498286L, var2);
      int var10000 = (int) ((recovery$indy$13(field_43, 3158731866895762063L, var2).method_48c$aae029aa0a()) ? 1 : 0);
      boolean var10001 = var4;
      if (var2 >= 0L) {
         if (var4) {
            if (var10000 == 0) {
               return;
            }

            var10000 = (int) ((recovery$indy$14(this.settingNoDown, 3159782427331446529L, var2)) ? 1 : 0);
         }

         var10001 = var4;
      }

      if (var2 > 0L) {
         if (var10001) {
            if (var10000 == 0) {
               return;
            }

            double var6;
            var10000 = (var6 = recovery$indy$15(field_43, 3158731866895762063L, var2).field_42 - 0.0) == 0.0 ? 0 : (var6 < 0.0 ? -1 : 1);
         }

         var10001 = var4;
      }

      if (var2 > 0L) {
         if (var10001) {
            if (var10000 >= 0) {
               return;
            }

            var10000 = (int) ((recovery$indy$16(this.settingUpDown, 3159782427331446529L, var2)) ? 1 : 0);
         }

         var10001 = var4;
      }

      label67: {
         label66:
         if (var10001) {
            if (var10000 != 0) {
               var10000 = (int) ((recovery$indy$17(field_43, 3158518539647107354L, var2).field_44q.field_45) ? 1 : 0);
               var10001 = var4;
               if (var2 <= 0L) {
                  break label67;
               }

               if (!var4) {
                  break label66;
               }

               if (var10000 != 0) {
                  return;
               }
            }

            var10000 = recovery$indy$18(field_43, 3158731866895762063L, var2).field_432;
         }

         var10001 = var4;
      }

      label54: {
         if (var10001) {
            if (var10000 <= 0) {
               break label54;
            }

            var10000 = (int) ((recovery$indy$19(this.settingNoNoDownWhileVelocity, 3159782427331446529L, var2)) ? 1 : 0);
         }

         if (var10000 != 0) {
            return;
         }
      }

      recovery$indy$20(var1, 0.0, 3158274164028518907L, var2);
   }



   public static String method_43$0e30dfc966() {
      return field_49;
   }



   private boolean method_42Z$aae029aa0a() {
      long var1 = a ^ 104938437389592L;
      long var3 = var1 ^ 56166391880080L;
      long var10000 = -2566222031761362550L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10001 = -2566305257519894342L;
      BooleanSetting var6 = this.settingUpDown;
      boolean var13 = var6.method_49$aae029aa0a();
      if (!var5) {
         if (!var13) {
            return false;
         }

         long var10002 = -2562662763156250939L;
         long var7 = var3;
         C_47Th var9 = this.settingModes;
         var13 = var9.method_46$5f9dc63072(var7).equals("Ignore");
      }

      if (!var5) {
         if (var13) {
            return false;
         }

         long var14 = -2562662763156250939L;
         long var10 = var3;
         C_47Th var12 = this.settingModes;
         var13 = var12.method_46$5f9dc63072(var10).equals("Solid");
      }

      return var5 ? var13 : !var13;
   }



   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$21(this, 20, var3, -7099316182635892959L, var1);
      recovery$indy$22(this, 21, var3, -7099316182635892959L, var1);
      recovery$indy$23(this, 43, var3, -7099316182635892959L, var1);
      recovery$indy$24(this, 26, var3, -7099316182635892959L, var1);
   }



   private boolean method_42x$aae029aa0a() {
      long var1 = a ^ 30975824752555L;
      long var3 = var1 ^ 123461999090467L;
      long var10000 = -7002620282253184199L;
      boolean var5 = Fly_47kE.method_49t$aae029aa0a();
      long var10002 = -6999485973155537802L;
      long var6 = var3;
      C_47Th var8 = this.settingModes;
      boolean var12 = var8.method_46$5f9dc63072(var6).equals("Ignore");
      if (!var5) {
         if (var12) {
            return false;
         }

         var10002 = -6999485973155537802L;
         long var9 = var3;
         C_47Th var11 = this.settingModes;
         var12 = var11.method_46$5f9dc63072(var9).equals("Solid");
      }

      return var5 ? var12 : !var12;
   }



   private boolean method_42q$aae029aa0a() {
      long var1 = a ^ 40391745851860L;
      long var10000 = -6868180484934371623L;
      boolean var3 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = -6868309133642281866L;
      BooleanSetting var4 = this.settingUpDown;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3) {
         if (!var6) {
            return false;
         }

         var10001 = -6872298008699219233L;
         BooleanSetting var5 = this.settingUpDown;
         var6 = var5.method_44$aae029aa0a();
      }

      return !var3 ? var6 : var6;
   }



   private boolean method_42f$aae029aa0a() {
      long var1 = a ^ 36304052395335L;
      long var3 = var1 ^ 85079304645071L;
      long var10000 = -1424167156974929334L;
      boolean var5 = Fly_47kE.method_48$aae029aa0a();
      long var10001 = -1423743848883814171L;
      BooleanSetting var6 = this.settingUpDown;
      boolean var13 = var6.method_49$aae029aa0a();
      if (var5) {
         if (!var13) {
            return false;
         }

         long var10002 = -1427384074479178086L;
         long var7 = var3;
         C_47Th var9 = this.settingModes;
         var13 = var9.method_46$5f9dc63072(var7).equals("Ignore");
      }

      if (var5) {
         if (var13) {
            return false;
         }

         long var14 = -1427384074479178086L;
         long var10 = var3;
         C_47Th var12 = this.settingModes;
         var13 = var12.method_46$5f9dc63072(var10).equals("Solid");
      }

      return !var5 ? var13 : !var13;
   }



   public void method_45q$e45a9973e5(long var1) {
      long var3 = var1 ^ 46911700055250L;
      long var5 = var1 ^ 54777118390967L;
      boolean var7 = recovery$indy$25(4559314544923366061L, var1);
      NoWeb_47kk var10000 = this;
      if (!var7) {
         recovery$indy$27(this, var3, recovery$indy$26(this.settingModes, var5, 4560058518287924706L, var1), 4560381149368397572L, var1);
         if (recovery$indy$28(field_43, 4560590297635771923L, var1).method_48c$aae029aa0a()) {
            return;
         }

         var10000 = this;
      }

      recovery$indy$29(var10000.field_42, 4560728663193096504L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
      boolean var3 = recovery$indy$30(-7738079077630445196L, var1);
      EntityPlayerSP var10000 = recovery$indy$31(field_43, -7740743511557407286L, var1);
      if (!var3) {
         if (var10000 == null) {
            return;
         }

         recovery$indy$32(field_43, -7740743511557407286L, var1).method_49$24a796ab4c(0.02F);
         var10000 = recovery$indy$33(field_43, -7740743511557407286L, var1);
      }

      var10000.method_45$24a796ab4c(0.1F);
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      boolean var6 = recovery$indy$34(2732215221870839810L, var4);
      EntityPlayerSP var10000 = recovery$indy$35(field_43, 2730676292722052284L, var4);
      if (!var6) {
         if (var10000 == null) {
            return;
         }

         recovery$indy$36(field_43, 2730676292722052284L, var4).method_49$24a796ab4c(0.02F);
         var10000 = recovery$indy$37(field_43, 2730676292722052284L, var4);
      }

      var10000.method_45$24a796ab4c(0.1F);
   }



    public NoWeb_47kk(long a0) {
        super((java.lang.String) ("NoWeb"),(java.lang.String) ("KeineSpinnenweben"),(long) (((augustus.recovered.modules.movement.NoWeb_47kk.a ^ a0) ^ 126487830165190L)),(java.awt.Color) (new java.awt.Color((int) (179),(int) (252),(int) (255))),(client.module.Category) (client.module.Category.MOVEMENT));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.movement.NoWeb_47kk.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.movement.NoWeb_47kk.a ^ a0) ^ 13190403637216L);
        long constructorKey4 = ((augustus.recovered.modules.movement.NoWeb_47kk.a ^ a0) ^ 2399771667165L);
        long constructorKey5 = ((augustus.recovered.modules.movement.NoWeb_47kk.a ^ a0) ^ 117877514430813L);
        long constructorKey6 = ((augustus.recovered.modules.movement.NoWeb_47kk.a ^ a0) ^ 52186249008474L);
        int constructorPart7 = (int) ((((augustus.recovered.modules.movement.NoWeb_47kk.a ^ a0) ^ 84997105005147L) >>> 32));
        int constructorPart8 = (int) (((((augustus.recovered.modules.movement.NoWeb_47kk.a ^ a0) ^ 84997105005147L) << 32) >>> 48));
        int constructorPart9 = (int) (((((augustus.recovered.modules.movement.NoWeb_47kk.a ^ a0) ^ 84997105005147L) << 48) >>> 48));
        short converted10 = (short) (constructorPart8);
        short converted11 = (short) (constructorPart9);
        java.lang.Object initialValue12 = recovery$indy$flow$139(8);
        java.lang.Object initialValue13 = recovery$indy$flow$140();
        ((java.lang.Object[]) initialValue12)[0] = initialValue13;
        java.lang.Object initialValue14 = recovery$indy$flow$141();
        ((java.lang.Object[]) initialValue12)[1] = initialValue14;
        java.lang.Object initialValue15 = recovery$indy$flow$142();
        ((java.lang.Object[]) initialValue12)[2] = initialValue15;
        java.lang.Object initialValue16 = recovery$indy$flow$143();
        ((java.lang.Object[]) initialValue12)[3] = initialValue16;
        java.lang.Object initialValue17 = recovery$indy$flow$144();
        ((java.lang.Object[]) initialValue12)[4] = initialValue17;
        java.lang.Object initialValue18 = recovery$indy$flow$145();
        ((java.lang.Object[]) initialValue12)[5] = initialValue18;
        java.lang.Object initialValue19 = recovery$indy$flow$146();
        ((java.lang.Object[]) initialValue12)[6] = initialValue19;
        java.lang.Object initialValue20 = recovery$indy$flow$147();
        ((java.lang.Object[]) initialValue12)[7] = initialValue20;
        net.C_47Th initialized21 = new net.C_47Th(constructorPart7, converted10, converted11, this, "Modes", "Intave", (java.util.function.BiFunction[]) (initialValue12));
        java.lang.Object initialValue22 = recovery$indy$flow$149();
        java.lang.Object initialValue23 = initialValue22;
        long initialValue24 = constructorKey5;
        net.C_47Th initialValue25 = initialized21;
        java.lang.Object initialValue26 = ((java.lang.Object)(((net.C_47Th) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue27 = ((java.lang.Object)(((net.C_47tu) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue28 = recovery$indy$flow$152(initialValue26, initialValue24, initialValue27);
        recovery$indy$flow$153(this, initialValue28);
        client.setting.BooleanSetting initialized29 = new client.setting.BooleanSetting(this, constructorKey4, "NoDown", false);
        java.lang.Object initialValue30 = recovery$indy$flow$156(this);
        java.lang.Object initialValue31 = initialValue30;
        long initialValue32 = constructorKey3;
        client.setting.BooleanSetting initialValue33 = initialized29;
        java.lang.Object initialValue34 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue33))))));
        java.lang.Object initialValue35 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue31))))));
        java.lang.Object initialValue36 = recovery$indy$flow$159(initialValue34, initialValue32, initialValue35);
        java.lang.Object initialValue37 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue36))))));
        recovery$indy$flow$161(this, initialValue37);
        client.setting.BooleanSetting initialized38 = new client.setting.BooleanSetting(this, constructorKey4, "NoNoDownWhileVelocity", false);
        java.lang.Object initialValue39 = recovery$indy$flow$164(this);
        java.lang.Object initialValue40 = initialValue39;
        long initialValue41 = constructorKey3;
        client.setting.BooleanSetting initialValue42 = initialized38;
        java.lang.Object initialValue43 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue42))))));
        java.lang.Object initialValue44 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue45 = recovery$indy$flow$167(initialValue43, initialValue41, initialValue44);
        java.lang.Object initialValue46 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue45))))));
        recovery$indy$flow$169(this, initialValue46);
        client.setting.BooleanSetting initialized47 = new client.setting.BooleanSetting(this, constructorKey4, "UpDown", false);
        java.lang.Object initialValue48 = recovery$indy$flow$172(this);
        java.lang.Object initialValue49 = initialValue48;
        long initialValue50 = constructorKey3;
        client.setting.BooleanSetting initialValue51 = initialized47;
        java.lang.Object initialValue52 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue51))))));
        java.lang.Object initialValue53 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue54 = recovery$indy$flow$175(initialValue52, initialValue50, initialValue53);
        java.lang.Object initialValue55 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue54))))));
        recovery$indy$flow$177(this, initialValue55);
        client.setting.BooleanSetting initialized56 = new client.setting.BooleanSetting(this, constructorKey4, "NoHorizontalMoveWhileUpAndDown", false);
        java.lang.Object initialValue57 = recovery$indy$flow$180(this);
        java.lang.Object initialValue58 = initialValue57;
        long initialValue59 = constructorKey3;
        client.setting.BooleanSetting initialValue60 = initialized56;
        java.lang.Object initialValue61 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue60))))));
        java.lang.Object initialValue62 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue58))))));
        java.lang.Object initialValue63 = recovery$indy$flow$183(initialValue61, initialValue59, initialValue62);
        java.lang.Object initialValue64 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue63))))));
        recovery$indy$flow$185(this, initialValue64);
        client.setting.NumberSetting initialized65 = new client.setting.NumberSetting(this, "UpSpeed", Double.longBitsToDouble(4612586738352862003L), constructorKey6, Double.longBitsToDouble(4576918229304087675L), Double.longBitsToDouble(4616189618054758400L), 2);
        java.lang.Object initialValue66 = recovery$indy$flow$188(this);
        java.lang.Object initialValue67 = initialValue66;
        client.setting.NumberSetting initialValue68 = initialized65;
        java.lang.Object initialValue69 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue68))))));
        java.lang.Object initialValue70 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue67))))));
        java.lang.Object initialValue71 = recovery$indy$flow$191(initialValue69, initialValue70);
        recovery$indy$flow$192(this, initialValue71);
        client.setting.NumberSetting initialized72 = new client.setting.NumberSetting(this, "DownSpeed", Double.longBitsToDouble(4612586738352862003L), constructorKey6, Double.longBitsToDouble(4576918229304087675L), Double.longBitsToDouble(4616189618054758400L), 2);
        java.lang.Object initialValue73 = recovery$indy$flow$195(this);
        java.lang.Object initialValue74 = initialValue73;
        client.setting.NumberSetting initialValue75 = initialized72;
        java.lang.Object initialValue76 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue75))))));
        java.lang.Object initialValue77 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue74))))));
        java.lang.Object initialValue78 = recovery$indy$flow$198(initialValue76, initialValue77);
        recovery$indy$flow$199(this, initialValue78);
        net.C_47cu initialized79 = new net.C_47cu();
        recovery$indy$flow$202(this, initialized79);
        net.C_47cu initialized80 = new net.C_47cu();
        recovery$indy$flow$205(this, initialized80);
    }





    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Field c(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$139(int a0);
    private static native java.lang.Object recovery$indy$flow$140();
    private static native java.lang.Object recovery$indy$flow$141();
    private static native java.lang.Object recovery$indy$flow$142();
    private static native java.lang.Object recovery$indy$flow$143();
    private static native java.lang.Object recovery$indy$flow$144();
    private static native java.lang.Object recovery$indy$flow$145();
    private static native java.lang.Object recovery$indy$flow$146();
    private static native java.lang.Object recovery$indy$flow$147();
    private static native java.lang.Object recovery$indy$flow$149();


    private static native java.lang.Object recovery$indy$flow$152(java.lang.Object a0,long a1,java.lang.Object a2);
    private static native void recovery$indy$flow$153(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$156(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$159(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$161(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$164(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$167(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$169(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$172(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$175(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$177(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$180(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$183(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$185(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$188(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$191(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$192(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$195(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$198(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$199(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$202(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$205(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native boolean recovery$indy$1(long var0, long var2);
   private static native C_473U recovery$indy$2(Object var0, long var1, long var3);
   private static native void recovery$indy$3(Object var0, long var1, long var3);
   private static native boolean recovery$indy$4(long var0, long var2);
   private static native boolean recovery$indy$5(Object var0, long var1, long var3);
   private static native boolean recovery$indy$6(Object var0, long var1, long var3);
   private static native boolean recovery$indy$7(Object var0, long var1, long var3, long var5, long var7);
   private static native boolean recovery$indy$8(Object var0, long var1, long var3);
   private static native boolean recovery$indy$9(Object var0, long var1, long var3);
   private static native void recovery$indy$10(Object var0, float var1, long var2, long var4);
   private static native void recovery$indy$11(Object var0, float var1, long var2, long var4);
   private static native boolean recovery$indy$12(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);
   private static native boolean recovery$indy$14(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);
   private static native boolean recovery$indy$16(Object var0, long var1, long var3);
   private static native C_47oo recovery$indy$17(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$18(Object var0, long var1, long var3);
   private static native boolean recovery$indy$19(Object var0, long var1, long var3);
   private static native void recovery$indy$20(Object var0, double var1, long var3, long var5);
   private static native void recovery$indy$21(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$22(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$23(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$24(Object var0, int var1, long var2, long var4, long var6);
   private static native boolean recovery$indy$25(long var0, long var2);
   private static native String recovery$indy$26(Object var0, long var1, long var3, long var5);
   private static native void recovery$indy$27(Object var0, long var1, Object var3, long var4, long var6);
   private static native EntityPlayerSP recovery$indy$28(Object var0, long var1, long var3);
   private static native void recovery$indy$29(Object var0, long var1, long var3);
   private static native boolean recovery$indy$30(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$31(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$32(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$33(Object var0, long var1, long var3);
   private static native boolean recovery$indy$34(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$35(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$36(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$37(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$53();
}
