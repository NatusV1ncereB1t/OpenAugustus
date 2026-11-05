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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_43B;
import net.C_45n;
import net.C_473U;
import net.C_475b;
import net.C_475c;
import net.C_475e;
import net.minecraft.client.gui.ScaledResolution;
import net.C_479J;
import net.C_479m;
import net.C_47Is;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import client.module.Module;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import net.C_47UH;
import client.event.RenderListener;
import net.C_47cu;
import net.C_47iC;
import net.minecraft.client.Minecraft;
import net.C_47ob;
import net.C_47ps;
import net.C_47rf;
import client.render.RenderUtils;
import client.module.Category;
import net.C_47tf;
import net.C_47xZ;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class FlagDetector_47k2 extends client.module.Module implements net.C_47UH,net.C_47iC,client.event.RenderListener {
    private final client.setting.BooleanSetting settingTeleportFix = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFlagCounter = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingSendChatMessage = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingShowOverHotbar = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingInventoryFlags = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingTextShadow = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingXCoord = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingYCoord = null; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47tf field_40; // Runtime access flags and ConstantValue are restored from the original class.
    public final net.C_47cu field_47 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_45 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native int a(long a0,long a1);

    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$9035875d26(long var1, C_47ob var3) {
      int[] var4 = recovery$indy$1(-7187753809399690829L, var1);
      C_473U var5 = recovery$indy$2(var3, -7187841133111002139L, var1);
      boolean var10000 = var5 instanceof C_479J;
      int[] var10001 = var4;
      if (var1 >= 0L) {
         if (var4 == null) {
            if (var10000) {
               C_479J var6 = (C_479J)var5;
               this.field_40 = new C_47tf(var6.method_47$fedcb3e4d3(), var6.method_41$fedcb3e4d3(), var6.method_42$fedcb3e4d3());
            }

            var10000 = var5 instanceof C_479m;
         }

         var10001 = var4;
      }

      if (var10001 == null) {
         if (var10000) {
            C_479m var7 = (C_479m)var5;
            this.field_40 = new C_47tf(var7.method_47$fedcb3e4d3(), var7.method_41$fedcb3e4d3(), var7.method_42$fedcb3e4d3());
         }

         var10000 = var5 instanceof C_47Is;
      }

      if (var10000) {
         recovery$indy$3(this.field_45, -7188275536646429859L, var1);
      }
   }



   public void method_41$fae8de1664(C_475c var1) {
      long var2 = a ^ 5125399940087L;
      long var10000 = -6880669384759610098L;
      int[] var4 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -6881032675068023753L;
      BooleanSetting var5 = this.settingTeleportFix;
      if (var5.method_49$aae029aa0a()) {
         var10001 = -6880533315766284362L;
         Minecraft var6 = field_43;
         C_47rf var10 = var6.field_42P.method_48$ac4db64966();
         if (var4 == null) {
            if (var10 == null) {
               return;
            }

            var10001 = -6880533315766284362L;
            Minecraft var7 = field_43;
            var10 = var7.field_42P.method_48$ac4db64966();
         }

         int var11 = (int) ((var10.method_48$dbd570a038() instanceof C_43B) ? 1 : 0);
         if (var4 == null) {
            if (var11 == 0) {
               return;
            }

            var10001 = -6880460457787378047L;
            Minecraft var8 = field_43;
            var11 = var8.field_44r.field_45w.method_49$8abf5c6871();
         }

         if (var11 > 0) {
            var10001 = -6880628162020696096L;
            C_47cu var9 = this.field_47;
            var9.method_46$da8c82d5d4();
         }
      }
   }



   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      java.lang.StringBuilder var27;
      java.lang.String var34;
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 79469613767391L;
      long var10000 = 1631309737951675183L;
      int[] var10 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 1630524116001315350L;
      BooleanSetting var15 = this.settingShowOverHotbar;
      if (var15.method_49$aae029aa0a()) {
         ScaledResolution var11;
         label21: {
            var11 = new ScaledResolution(field_43);
            var27 = new StringBuilder();
            short var33 = 31888;
            if (var4 >= 0) {
               long var10002 = 3137344117142203529L ^ var6;
               var34 = "§cFlag Detected";
               if (var10 != null) {
                  break label21;
               }

               var27 = var27.append("§cFlag Detected");
               var10002 = 1630524116001315350L;
               BooleanSetting var16 = this.settingFlagCounter;
               var33 = (short) ((var16.method_49$aae029aa0a()) ? 1 : 0);
            }

            var34 = var33 != 0 ? ": §7" + this.field_42 : "";
         }

         String var12 = var27.append(var34).toString();
         int var28 = var11.method_48$8abf5c6871();
         long var37 = 1634222330862198147L;
         Minecraft var17 = field_43;
         double var29 = (var28 - var17.field_42N.field_47) / 100.0;
         long var10003 = 1630485910639190730L;
         long var18 = var8;
         NumberSetting var20 = this.settingYCoord;
         int var13 = (int)(var29 * var20.method_44$474dfaa627(var18));
         int var30 = var11.method_46$8abf5c6871();
         var37 = 1634222330862198147L;
         Minecraft var21 = field_43;
         double var31 = (var30 - var21.field_42N.method_48$2f485d5ba3(var12)) / 100.0;
         var10003 = 1630485910639190730L;
         long var22 = var8;
         NumberSetting var24 = this.settingXCoord;
         int var14 = (int)(var31 * var24.method_44$474dfaa627(var22));
         var10001 = 1634222330862198147L;
         Minecraft var25 = field_43;
         FontRenderer var32 = var25.field_42N;
         int var10004 = Color.white.getRGB();
         long var10006 = 1630524116001315350L;
         BooleanSetting var26 = this.settingTextShadow;
         var32.method_40$af637b565a(var12, var14, var13, var10004, var26.method_49$aae029aa0a());
      }

      RenderUtils.method_41$da8c82d5d4();
   }




   public void method_47$9035875d26(long var1, C_47ob var3) {
      java.lang.StringBuilder var37;
      java.lang.String var46;
      java.lang.StringBuilder var40;
      java.lang.String var53;
      long var4;
      long var6;
      int[] var8;
      int var36;
      int[] var42;
      label158: {
         var4 = var1 ^ 50498101010005L;
         var6 = var1 ^ 43193202221813L;
         long var10000 = 2667752302497951881L;
         var8 = ClientSettings_47kr.method_46$d4d28024c9();
         long var10001 = 2667712051020923615L;
         C_47ob var11 = var3;
         C_473U var9 = var11.method_46$96fcbedb66();
         var36 = (int) ((var9 instanceof C_47xZ) ? 1 : 0);
         label157:
         if (var8 == null) {
            label155:
            if (var36 != 0) {
               label153: {
                  label152: {
                     label162: {
                        C_47xZ var10 = (C_47xZ)var9;
                        double var61;
                        var36 = (
                                 var61 = this.field_40
                                       .method_43$3d77d36e13(
                                          new C_47tf(var10.method_40$fedcb3e4d3(), var10.method_48$fedcb3e4d3(), var10.method_46$fedcb3e4d3())
                                       )
                                    - 40.0
                              )
                              == 0.0
                           ? 0
                           : (var61 < 0.0 ? -1 : 1);
                        var42 = var8;
                        if (var1 > 0L) {
                           if (var8 == null) {
                              if (var36 < 0) {
                                 long var10003 = 2669359637269300322L;
                                 long var12 = var6;
                                 long var14 = 4000L;
                                 C_47cu var16 = this.field_47;
                                 var36 = (int) ((var16.method_42$b0e346e6e3(var14, var12)) ? 1 : 0);
                                 var42 = var8;
                                 if (var1 < 0L) {
                                    break label153;
                                 }

                                 if (var8 != null) {
                                    break label152;
                                 }

                                 if (var36 != 0) {
                                    break label162;
                                 }
                              }

                              long var43 = 2667987017607375280L;
                              BooleanSetting var17 = this.settingTeleportFix;
                              var36 = (int) ((var17.method_49$aae029aa0a()) ? 1 : 0);
                           }

                           var42 = var8;
                        }

                        if (var42 != null) {
                           break label157;
                        }

                        if (var36 != 0) {
                           break label155;
                        }
                     }

                     this.field_42++;
                     long var44 = 2667987017607375280L;
                     BooleanSetting var18 = this.settingSendChatMessage;
                     var36 = (int) ((var18.method_49$aae029aa0a()) ? 1 : 0);
                  }

                  var42 = var8;
               }

               if (var1 <= 0L) {
                  break label158;
               }

               if (var42 != null) {
                  break label157;
               }

               if (var36 != 0) {
                  label131: {
                     var37 = new StringBuilder();
                     short var45 = 30122;
                     if (var1 >= 0L) {
                        long var10002 = 6594134678895760915L ^ var1;
                        var46 = "§cFlag Detected";
                        if (var8 != null) {
                           break label131;
                        }

                        var37 = var37.append("§cFlag Detected");
                        var10002 = 2667987017607375280L;
                        BooleanSetting var19 = this.settingFlagCounter;
                        var45 = (short) ((var19.method_49$aae029aa0a()) ? 1 : 0);
                     }

                     var46 = var45 != 0 ? ": §7" + this.field_42 : "";
                  }

                  String var47 = var37.append(var46).toString();
                  long var56 = 2667529262017473153L;
                  String var20 = var47;
                  long var21 = var4;
                  C_475e.method_46$d07b98bfef(var21, var20);
               }
            }

            var36 = (int) ((var9 instanceof C_475b) ? 1 : 0);
         }

         var42 = var8;
      }

      if (var1 >= 0L) {
         if (var42 == null) {
            if (var36 == 0) {
               return;
            }

            long var48 = 2667987017607375280L;
            BooleanSetting var23 = this.settingInventoryFlags;
            var36 = (int) ((var23.method_49$aae029aa0a()) ? 1 : 0);
         }

         var42 = var8;
      }

      if (var42 == null) {
         if (var36 == 0) {
            return;
         }

         long var60 = 2669359637269300322L;
         long var24 = var6;
         long var26 = 150L;
         C_47cu var28 = this.field_45;
         var36 = (int) ((var28.method_42$b0e346e6e3(var26, var24)) ? 1 : 0);
      }

      if (var36 == 0) {
         long var49 = 2667630193939869255L;
         Minecraft var29 = field_43;
         GuiScreen var38 = var29.field_44m;
         if (var8 == null) {
            if (var29.field_44m == null) {
               return;
            }

            long var50 = 2667630193939869255L;
            Minecraft var30 = field_43;
            var38 = var30.field_44m;
         }

         boolean var39 = var38 instanceof C_47ps;
         if (var8 == null) {
            if (var39) {
               return;
            }

            this.field_42++;
            long var51 = 2667987017607375280L;
            BooleanSetting var31 = this.settingSendChatMessage;
            var39 = var31.method_49$aae029aa0a();
         }

         if (var39) {
            label94: {
               var40 = new StringBuilder();
               short var52 = 4198;
               if (var1 >= 0L) {
                  long var57 = 9175092174611018711L ^ var1;
                  var53 = "§cInventory flag detected";
                  if (var8 != null) {
                     break label94;
                  }

                  var40 = var40.append("§cInventory flag detected");
                  var57 = 2667987017607375280L;
                  BooleanSetting var32 = this.settingFlagCounter;
                  var52 = (short) ((var32.method_49$aae029aa0a()) ? 1 : 0);
               }

               var53 = var52 != 0 ? ": §7" + this.field_42 : "";
            }

            String var54 = var40.append(var53).toString();
            long var59 = 2667529262017473153L;
            String var33 = var54;
            long var34 = var4;
            C_475e.method_46$d07b98bfef(var34, var33);
         }
      }
   }





   public void method_43_$e45a9973e5(long var1) {
      long var3 = var1 ^ 49072313886417L;
      recovery$indy$4(this, 7, var3, -7098962457757176133L, var1);
      recovery$indy$5(this, 26, var3, -7098962457757176133L, var1);
      recovery$indy$6(this, 32, var3, -7098962457757176133L, var1);
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public FlagDetector_47k2(long a0) {
        super((java.lang.String) ("FlagDetector"),(java.lang.String) ("Flaggendetektor"),(long) (((augustus.recovered.modules.misc.FlagDetector_47k2.a ^ a0) ^ 79965696639368L)),(java.awt.Color) (new java.awt.Color((int) (232),(int) (180),(int) (135))),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.misc.FlagDetector_47k2.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.misc.FlagDetector_47k2.a ^ a0) ^ 63354883775891L);
        long constructorKey4 = ((augustus.recovered.modules.misc.FlagDetector_47k2.a ^ a0) ^ 22843958731284L);
        client.setting.BooleanSetting initialized5 = new client.setting.BooleanSetting(this, constructorKey3, "TeleportFix", true);
        recovery$indy$flow$170(this, initialized5);
        client.setting.BooleanSetting initialized6 = new client.setting.BooleanSetting(this, constructorKey3, "FlagCounter", true);
        recovery$indy$flow$173(this, initialized6);
        client.setting.BooleanSetting initialized7 = new client.setting.BooleanSetting(this, constructorKey3, "SendChatMessage", true);
        recovery$indy$flow$176(this, initialized7);
        client.setting.BooleanSetting initialized8 = new client.setting.BooleanSetting(this, constructorKey3, "ShowOverHotbar", false);
        recovery$indy$flow$179(this, initialized8);
        client.setting.BooleanSetting initialized9 = new client.setting.BooleanSetting(this, constructorKey3, "InventoryFlags", false);
        recovery$indy$flow$182(this, initialized9);
        client.setting.BooleanSetting initialized10 = new client.setting.BooleanSetting(this, constructorKey3, "TextShadow", false);
        recovery$indy$flow$185(this, initialized10);
        client.setting.NumberSetting initialized11 = new client.setting.NumberSetting(this, "X-Coord", Double.longBitsToDouble(4632233691727265792L), constructorKey4, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        java.lang.Object initialValue12 = ((java.lang.Object)(((augustus.recovered.modules.misc.FlagDetector_47k2) (((java.lang.Object)(this)))).settingShowOverHotbar));
        java.lang.Object initialValue13 = recovery$indy$flow$189(initialValue12);
        java.lang.Object initialValue14 = recovery$indy$flow$190(initialValue12);
        java.lang.Object initialValue15 = initialValue14;
        client.setting.NumberSetting initialValue16 = initialized11;
        java.lang.Object initialValue17 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue16))))));
        java.lang.Object initialValue18 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue15))))));
        java.lang.Object initialValue19 = recovery$indy$flow$193(initialValue17, initialValue18);
        recovery$indy$flow$194(this, initialValue19);
        client.setting.NumberSetting initialized20 = new client.setting.NumberSetting(this, "Y-Coord", 0.0D, constructorKey4, 0.0D, Double.longBitsToDouble(4636737291354636288L), 2);
        java.lang.Object initialValue21 = ((java.lang.Object)(((augustus.recovered.modules.misc.FlagDetector_47k2) (((java.lang.Object)(this)))).settingShowOverHotbar));
        java.lang.Object initialValue22 = recovery$indy$flow$198(initialValue21);
        java.lang.Object initialValue23 = recovery$indy$flow$199(initialValue21);
        java.lang.Object initialValue24 = initialValue23;
        client.setting.NumberSetting initialValue25 = initialized20;
        java.lang.Object initialValue26 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue27 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue28 = recovery$indy$flow$202(initialValue26, initialValue27);
        recovery$indy$flow$203(this, initialValue28);
        net.C_47tf initialized29 = new net.C_47tf(0.0D, 0.0D, 0.0D);
        recovery$indy$flow$206(this, initialized29);
        net.C_47cu initialized30 = new net.C_47cu();
        recovery$indy$flow$209(this, initialized30);
        recovery$indy$flow$210(this, 0L);
        net.C_47cu initialized31 = new net.C_47cu();
        recovery$indy$flow$213(this, initialized31);
    }




    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native void recovery$indy$flow$170(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$173(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$176(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$179(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$182(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$185(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$189(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$190(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$193(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$194(java.lang.Object a0,java.lang.Object a1);

    private static java.lang.Object recovery$indy$flow$198(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$199(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$202(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$203(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$206(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.FlagDetector_47k2) (a0)).field_40 = ((net.C_47tf) (a1));
        return;
    }
    private static native void recovery$indy$flow$209(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$210(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.misc.FlagDetector_47k2) (a0)).field_42 = a1;
        return;
    }
    private static native void recovery$indy$flow$213(java.lang.Object a0,java.lang.Object a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native C_473U recovery$indy$2(Object var0, long var1, long var3);
   private static native void recovery$indy$3(Object var0, long var1, long var3);
   private static native void recovery$indy$4(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$5(Object var0, int var1, long var2, long var4, long var6);
   private static native void recovery$indy$6(Object var0, int var1, long var2, long var4, long var6);
   private static native MethodHandle recovery$constant$9();
}
