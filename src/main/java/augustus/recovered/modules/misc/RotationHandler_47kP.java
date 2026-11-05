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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_45n;
import net.C_472n;
import net.C_476q;
import net.C_477z;
import net.C_47F9;
import net.C_47MO;
import client.module.Module;
import net.C_47S6;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47U0;
import net.C_47VO;
import net.C_47Vc;
import net.C_47hi;
import net.C_47iC;
import net.C_47oO;
import net.C_47ob;
import client.ClientGlobals;
import net.C_47si;
import client.module.Category;
import net.C_47tU;
import net.C_47yA;
import net.C_4f;

public class RotationHandler_47kP extends Module implements C_47oO, C_47U0, C_47hi, C_47iC, C_47Vc, C_47si {
   public final ModeSetting settingRotationMode;
   public final ModeSetting settingMouseSensMode;
   public final ModeSetting settingSmoothBackRotate;
   public final RangeSetting settingYawSpeed;
   public final RangeSetting settingPitchSpeed;
   public final NumberSetting settingRotationSpeed;
   public final RangeSetting settingSmoothBackRotateTickDelayAfterClosingInventory;
   public final SettingGroup settingMovement;
   public final BooleanSetting settingMoveFix;
   public final ModeSetting settingSilentMoveFix;
   public final BooleanSetting settingSilentMoveFixIntave;
   public final BooleanSetting settingRandomizeDirections;
   public int field_43y;
   public int field_438;
   private static final long a = C_4f.a(6573355038249192634L, 2109024829004474413L, MethodHandles.lookup().lookupClass()).a(265475139924179L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final Object[] f = new Object[54];
   private static final String[] g = new String[54];

   private static native Field b(Class var0, String var1, Class var2);

   private static native Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3);

   private static native Class b(long var0, long var2);

   private static native CallSite b(Lookup var0, String var1, MethodType var2);

   private static native String b(byte[] var0);

   private static native String b(int var0, long var1);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private boolean method_498$aae029aa0a() {
      long var1 = a ^ 117450784707147L;
      long var3 = var1 ^ 56320868016130L;
      long var10002 = 2736706253311822965L;
      long var5 = var3;
      ModeSetting var7 = this.settingSmoothBackRotate;
      return var7.method_46$5f9dc63072(var5).equals("Default");
   }

   private boolean method_49v$aae029aa0a() {
      long var1 = a ^ 78684780029801L;
      long var3 = var1 ^ 33514288649504L;
      long var10000 = -3396590421422146450L;
      int[] var5 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = -3396071909708860927L;
      ModeSetting var6 = this.settingSilentMoveFix;
      boolean var10 = var6.method_44$aae029aa0a();
      if (var5 == null) {
         if (!var10) {
            return false;
         }

         long var10002 = -3397800354620098217L;
         long var7 = var3;
         ModeSetting var9 = this.settingSilentMoveFix;
         var10 = var9.method_46$5f9dc63072(var7).equals("None");
      }

      return var5 != null ? var10 : !var10;
   }

   private static native MethodHandle a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Field a(Class var0, String var1, Class var2);

   private static native void a();

   private static native int a(long var0, long var2);

   private static native Object a(Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   @Override
   public void method_42$0db73fbf69(long var1, C_47VO var3) {
      int var4 = (int)((var1 ^ 57422647975142L) >>> 48);
      long var5 = (var1 ^ 57422647975142L) << 16 >>> 16;
      long var7 = var1 ^ 54058444301125L;
      int[] var9 = recovery$indy$1(-6219886331524020964L, var1);
      boolean var10000 = recovery$indy$2(this.settingMoveFix, -6223534768338168319L, var1);
      if (var9 == null) {
         if (var10000) {
            return;
         }

         var10000 = recovery$indy$3(ClientGlobals.field_46, (short)var4, var5, -6219676889065449383L, var1);
      }

      if (var10000) {
         recovery$indy$5(var3, recovery$indy$4(var7, -6221050960211914941L, var1), -6219748572726143078L, var1);
      }
   }

   private static native Method d(long var0, long var2);

   @Override
   public void method_41$0db73fbf69(long var1, C_47VO var3) {
      int var4 = (int)((var1 ^ 28532265635016L) >>> 48);
      long var5 = (var1 ^ 28532265635016L) << 16 >>> 16;
      long var7 = var1 ^ 31750970979179L;
      int[] var9 = recovery$indy$6(-5079871679930165966L, var1);
      boolean var10000 = recovery$indy$7(this.settingMoveFix, -5075629549762443729L, var1);
      if (var9 == null) {
         if (var10000) {
            return;
         }

         var10000 = recovery$indy$8(ClientGlobals.field_46, (short)var4, var5, -5079663350908319625L, var1);
      }

      if (var10000) {
         recovery$indy$10(var3, recovery$indy$9(var7, -5078847797295227027L, var1), -5079727869254678604L, var1);
      }
   }

   @Override
   public void method_41$9035875d26(long var1, C_47ob var3) {
      long var4 = (var1 ^ 82959478094882L) >>> 32;
      int var6 = (int)((var1 ^ 82959478094882L) << 32 >>> 32);
      long var7 = var1 ^ 75725768340771L;
      recovery$indy$11(ClientGlobals.field_48.field_48Q.field_49A, var3, var7, -7191625480964680310L, var1);
      recovery$indy$12(ClientGlobals.field_48.field_46I.field_48z, var3, var7, -7191625480964680310L, var1);
      recovery$indy$13(ClientGlobals.field_48.field_48Q, var4, var3, var6, -7191383732591012017L, var1);
   }

   @Override
   public void method_41$426c33b229(C_477z var1, long var2) {
   }

   public static void method_40$da8c82d5d4() {
   }

   private boolean method_49g$aae029aa0a() {
      long var1 = a ^ 82906195310435L;
      long var3 = var1 ^ 20392627127594L;
      long var10000 = 60499488408448100L;
      int[] var5 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 59873220610761227L;
      ModeSetting var6 = this.settingSilentMoveFix;
      boolean var10 = var6.method_44$aae029aa0a();
      if (var5 == null) {
         if (!var10) {
            return false;
         }

         long var10002 = 59279496395811165L;
         long var7 = var3;
         ModeSetting var9 = this.settingSilentMoveFix;
         var10 = var9.method_46$5f9dc63072(var7).equals("None");
      }

      return var5 != null ? var10 : !var10;
   }

   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 135757220914850L;
      long var3 = var1 ^ 38016600265963L;
      long var10000 = -7991672818820301403L;
      int[] var5 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10002 = -7992857463435200356L;
      long var6 = var3;
      ModeSetting var8 = this.settingSmoothBackRotate;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   @Override
   public void method_49$c052a55882(int var1, byte var2, int var3, C_47F9 var4) {
   }

   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 14684860407844L;
      long var3 = var1 ^ 93115041616493L;
      long var10002 = 6311192754526600730L;
      long var5 = var3;
      ModeSetting var7 = this.settingSmoothBackRotate;
      return var7.method_46$5f9dc63072(var5).equals("Default");
   }

   @Override
   public void method_47$9035875d26(long var1, C_47ob var3) {
      long var4 = var1 ^ 114684767151495L;
      recovery$indy$14(ClientGlobals.field_48.field_48Q.field_49A, var4, var3, 2668877072127908264L, var1);
      recovery$indy$15(ClientGlobals.field_48.field_46I.field_48z, var4, var3, 2668877072127908264L, var1);
   }

   @Override
   public void method_47$05bd94f678(C_472n var1, long var2) {
      net.C_47tU var48;
      boolean var45;
      long var4 = var2 ^ 79168745555140L;
      int var6 = (int)((var2 ^ 12230234025350L) >>> 48);
      long var7 = (var2 ^ 12230234025350L) << 16 >>> 16;
      long var9 = var2 ^ 74807535967538L;
      long var10000 = 6399256026939257980L;
      int[] var11 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 6395585619277440865L;
      BooleanSetting var12 = this.settingMoveFix;
      var45 = var12.method_49$aae029aa0a();
      label76:
      if (var11 == null) {
         if (var45) {
            short var46 = (short)var6;
            long var10003 = 6399469886837745977L;
            long var13 = var7;
            short var15 = var46;
            C_47S6 var16 = ClientGlobals.field_46;
            var45 = var16.method_40$f19a3ced8f(var15, var13);
            if (var11 != null) {
               break label76;
            }

            if (var45) {
               label70: {
                  var10003 = 6398151509769630021L;
                  long var17 = var9;
                  ModeSetting var19 = this.settingSilentMoveFix;
                  boolean var47 = var19.method_46$5f9dc63072(var17).equals("None");
                  if (var11 == null) {
                     if (var47) {
                        var48 = C_47tU.NONE;
                        break label70;
                     }

                     var10003 = 6398151509769630021L;
                     long var20 = var9;
                     ModeSetting var22 = this.settingSilentMoveFix;
                     var47 = var22.method_46$5f9dc63072(var20).equals("Default");
                  }

                  var48 = var47 ? C_47tU.DEFAULT : C_47tU.ADVANCED;
               }

               long var10002 = 6399057317986590588L;
               C_47tU var23 = var48;
               C_472n var24 = var1;
               var24.method_41$1aa94c3a4e(var23);
               var10002 = 6398151509769630021L;
               long var25 = var9;
               ModeSetting var27 = this.settingSilentMoveFix;
               var45 = var27.method_46$5f9dc63072(var25).equals("None");
               if (var11 != null) {
                  break label76;
               }

               if (!var45) {
                  var10002 = 6395585619277440865L;
                  BooleanSetting var28 = this.settingSilentMoveFixIntave;
                  boolean var49 = var28.method_49$aae029aa0a();
                  var10002 = 6398210875475471346L;
                  boolean var29 = var49;
                  C_472n var30 = var1;
                  var30.method_42$f633c984d8(var29);
                  var10001 = 6395585619277440865L;
                  BooleanSetting var31 = this.settingRandomizeDirections;
                  var45 = var31.method_49$aae029aa0a();
                  if (var11 != null) {
                     break label76;
                  }

                  if (var45) {
                     var10001 = 6398953420596854661L;
                     Client var52 = Client.method_44$fbc0c0be91();
                     var10002 = 6399492275743260152L;
                     Client var32 = var52;
                     float var53 = var32.method_45$03ec613b6f().field_43;
                     long var10006 = 6399272938101373902L;
                     float var33 = 30.0F;
                     long var34 = var4;
                     float var36 = 20.0F;
                     C_47MO var37 = C_476q.field_48;
                     float var60 = var37.method_48$4ed2fe9101(var36, var34, var33);
                     byte var66 = (byte) ((ThreadLocalRandom.current().nextBoolean()) ? 1 : 0);
                     if (var11 == null) {
                        var66 = (byte)(var66 != 0 ? 1 : -1);
                     }

                     float var54 = var53 + var60 * var66;
                     var10002 = 6398343738002946595L;
                     float var38 = var54;
                     C_472n var39 = var1;
                     var39.method_49$24a796ab4c(var38);
                  }
               }
            }
         }

         var10001 = 6399566865793342566L;
         C_47S6 var40 = ClientGlobals.field_46;
         var45 = var40.method_46$aae029aa0a();
      }

      if (var45) {
         long var62 = 6399057317986590588L;
         C_47tU var41 = C_47tU.DEFAULT;
         C_472n var42 = var1;
         var42.method_41$1aa94c3a4e(var41);
         var62 = 6398210875475471346L;
         boolean var43 = true;
         C_472n var44 = var1;
         var44.method_42$f633c984d8(var43);
      }
   }

   @Override
   public void method_45p$a6cfe74df2(short var1, long var2) {
   }

   @Override
   public void method_43_$e45a9973e5(long var1) {
   }

   private boolean method_49E$aae029aa0a() {
      long var1 = a ^ 14669941321285L;
      long var3 = var1 ^ 93168607288332L;
      long var10000 = 1869180514659448130L;
      int[] var5 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10002 = 1870361997725724795L;
      long var6 = var3;
      ModeSetting var8 = this.settingSmoothBackRotate;
      boolean var9 = var8.method_46$5f9dc63072(var6).equals("None");
      if (var5 == null) {
         var9 = !var9;
      }

      return var9;
   }

   @Override
   public void method_43y$e45a9973e5(long var1) {
   }

   @Override
   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }

   private boolean method_49s$aae029aa0a() {
      long var1 = a ^ 50190451504062L;
      long var3 = var1 ^ 127882602054135L;
      long var10002 = 4904416290727832960L;
      long var5 = var3;
      ModeSetting var7 = this.settingSmoothBackRotate;
      return var7.method_46$5f9dc63072(var5).equals("New");
   }

   private boolean method_49Q$aae029aa0a() {
      long var1 = a ^ 36050083976928L;
      long var10000 = 2401971491266399719L;
      int[] var3 = ClientSettings_47kr.method_46$d4d28024c9();
      long var10001 = 2403393981696286458L;
      BooleanSetting var4 = this.settingMoveFix;
      boolean var6 = var4.method_49$aae029aa0a();
      if (var3 == null) {
         if (!var6) {
            return false;
         }

         var10001 = 2402632807155303304L;
         BooleanSetting var5 = this.settingMoveFix;
         var6 = var5.method_44$aae029aa0a();
      }

      return var3 != null ? var6 : var6;
   }

   public RotationHandler_47kP(long var1) {
      super(((a ^ var1) ^ 126445802138168L), "RotationHandler", "DrehungsVerwalter", true, new Color(168, 145, 50), Category.MISC);
      var1 = a ^ var1;
      long var10001 = var1 ^ 70000981227884L;
      int var3 = (int)((var1 ^ 70000981227884L) >>> 32);
      int var4 = (int)((var1 ^ 70000981227884L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 104384509634334L;
      int var6 = (int)((var1 ^ 104384509634334L) >>> 48);
      int var7 = (int)((var1 ^ 104384509634334L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      long var9 = var1 ^ 36368390474962L;
      long var11 = var1 ^ 20146129990969L;
      long var13 = var1 ^ 5056083206018L;
      long var15 = var1 ^ 103892270678117L;
      long var17 = var1 ^ 18347377093641L;
      long var19 = var1 ^ 126445802138168L;
      int var21 = (int)((var1 ^ 62360262598473L) >>> 32);
      long var22 = (var1 ^ 62360262598473L) << 32 >>> 32;
      long var24 = var1 ^ 6159041422952L;
      long var26 = var1 ^ 85944627584848L;
      // Super arguments moved to the required Java constructor position.
      this.settingRotationMode = new ModeSetting(this, "RotationMode", var11, "Vanilla", new String[]{"Vanilla", "Tick"});
      this.settingMouseSensMode = new ModeSetting(this, "MouseSensMode", var11, "Advanced", new String[]{"Default", "Advanced"});
      this.settingSmoothBackRotate = new ModeSetting(this, "SmoothBackRotate", var11, "None", new String[]{"None", "Default", "New"});
      RangeSetting var79 = new RangeSetting(var3, this, "YawSpeed", 18.0, 24.0, (short)var4, 0.0, 180.0, 0, (short)var5);
      C_45n var10003 = recovery$indy$16(this);
      long var10005 = 883904592607324742L;
      long var28 = var22;
      C_45n var30 = var10003;
      int var31 = var21;
      RangeSetting var32 = var79;
      RangeSetting var80 = var32.method_48$65461658fd(var31, var30, var28);
      long var91 = 884308354275747636L;
      long var33 = var17;
      RangeSetting var35 = var80;
      this.settingYawSpeed = var35.method_41$1efb8cc0e2(var33);
      RangeSetting var81 = new RangeSetting(var3, this, "PitchSpeed", 18.0, 24.0, (short)var4, 0.0, 180.0, 0, (short)var5);
      var10003 = recovery$indy$17(this);
      var10005 = 883904592607324742L;
      long var36 = var22;
      C_45n var38 = var10003;
      int var39 = var21;
      RangeSetting var40 = var81;
      RangeSetting var82 = var40.method_48$65461658fd(var39, var38, var36);
      long var93 = 884308354275747636L;
      long var41 = var17;
      RangeSetting var43 = var82;
      this.settingPitchSpeed = var43.method_41$1efb8cc0e2(var41);
      NumberSetting var83 = new NumberSetting(this, "RotationSpeed", 75.0, var24, 0.0, 100.0, 0);
      C_45n var10002 = recovery$indy$18(this);
      long var94 = 883386950427860234L;
      C_45n var44 = var10002;
      NumberSetting var45 = var83;
      this.settingRotationSpeed = var45.method_43$9db6d416f4(var44);
      RangeSetting var84 = new RangeSetting(var3, this, "SmoothBackRotateTickDelayAfterClosingInventory", 2.0, 4.0, (short)var4, 0.0, 10.0, 0, (short)var5);
      long var95 = 884308354275747636L;
      long var46 = var17;
      RangeSetting var48 = var84;
      RangeSetting var85 = var48.method_41$1efb8cc0e2(var46);
      var10003 = recovery$indy$19(this);
      var10005 = 883904592607324742L;
      long var49 = var22;
      C_45n var51 = var10003;
      int var52 = var21;
      RangeSetting var53 = var85;
      this.settingSmoothBackRotateTickDelayAfterClosingInventory = var53.method_48$65461658fd(var52, var51, var49);
      this.settingMovement = new SettingGroup(this, "Movement", true, var15);
      BooleanSetting var86 = new BooleanSetting(this, "MoveFix", (short)var6, (char)var7, var8, true, this.settingMovement);
      var10003 = recovery$indy$20(this);
      long var10004 = 884204025741416473L;
      C_45n var54 = var10003;
      long var55 = var9;
      BooleanSetting var57 = var86;
      this.settingMoveFix = (BooleanSetting)var57.method_43$780fd62a21(var55, var54);
      ModeSetting var87 = new ModeSetting(this, "SilentMoveFix", "Default", new String[]{"None", "Default", "Advanced"}, this.settingMovement, var26);
      var10002 = recovery$indy$21(this);
      long var98 = 885398958874333174L;
      C_45n var58 = var10002;
      ModeSetting var59 = var87;
      this.settingSilentMoveFix = var59.method_44$d3b0c78647(var58);
      BooleanSetting var88 = new BooleanSetting(this, "SilentMoveFixIntave", (short)var6, (char)var7, var8, true, this.settingMovement);
      var10003 = recovery$indy$22(this);
      var10004 = 884204025741416473L;
      C_45n var60 = var10003;
      long var61 = var9;
      BooleanSetting var63 = var88;
      this.settingSilentMoveFixIntave = (BooleanSetting)var63.method_43$780fd62a21(var61, var60);
      BooleanSetting var89 = new BooleanSetting(this, "RandomizeDirections", (short)var6, (char)var7, var8, false, this.settingMovement);
      var10003 = recovery$indy$23(this);
      var10004 = 884204025741416473L;
      C_45n var64 = var10003;
      long var65 = var9;
      BooleanSetting var67 = var89;
      this.settingRandomizeDirections = (BooleanSetting)var67.method_43$780fd62a21(var65, var64);
      this.field_43y = 0;
      this.field_438 = 0;
      long var101 = 883523533554059274L;
      boolean var68 = true;
      long var69 = var13;
      RotationHandler_47kP var71 = this;
      var71.method_46$b757cde368(var69, var68);
      long var10000 = 884453077524895621L;
      C_47yA.method_49$14263c8b30().subscribe(28, this, -2);
      var10000 = 884453077524895621L;
      C_47yA.method_49$14263c8b30().subscribe(21, this, 20);
      var10000 = 884453077524895621L;
      C_47yA.method_49$14263c8b30().subscribe(26, this, 20);
      var10000 = 884453077524895621L;
      C_47yA.method_49$14263c8b30().subscribe(43, this, 20);
      var10000 = 884453077524895621L;
      C_47yA.method_49$14263c8b30().subscribe(1, this, 20);
      var10000 = 884453077524895621L;
      C_47yA.method_49$14263c8b30().subscribe(17, this, 20);
   }

   // Retained obfuscator initialization is restored after javac.
   static { c = null; d = null; }

   private static native Field c(long var0, long var2);

   private static native CallSite c(Lookup var0, String var1, MethodType var2);

   private static native MethodHandle recovery$constant$0();

   private static native int[] recovery$indy$1(long var0, long var2);

   private static native boolean recovery$indy$2(Object var0, long var1, long var3);

   private static native boolean recovery$indy$3(Object var0, short var1, long var2, long var4, long var6);

   private static native float recovery$indy$4(long var0, long var2, long var4);

   private static native void recovery$indy$5(Object var0, float var1, long var2, long var4);

   private static native int[] recovery$indy$6(long var0, long var2);

   private static native boolean recovery$indy$7(Object var0, long var1, long var3);

   private static native boolean recovery$indy$8(Object var0, short var1, long var2, long var4, long var6);

   private static native float recovery$indy$9(long var0, long var2, long var4);

   private static native void recovery$indy$10(Object var0, float var1, long var2, long var4);

   private static native void recovery$indy$11(Object var0, Object var1, long var2, long var4, long var6);

   private static native void recovery$indy$12(Object var0, Object var1, long var2, long var4, long var6);

   private static native void recovery$indy$13(Object var0, long var1, Object var3, int var4, long var5, long var7);

   private static native void recovery$indy$14(Object var0, long var1, Object var3, long var4, long var6);

   private static native void recovery$indy$15(Object var0, long var1, Object var3, long var4, long var6);

   private static native C_45n recovery$indy$16(RotationHandler_47kP var0);

   private static native C_45n recovery$indy$17(RotationHandler_47kP var0);

   private static native C_45n recovery$indy$18(RotationHandler_47kP var0);

   private static native C_45n recovery$indy$19(RotationHandler_47kP var0);

   private static native C_45n recovery$indy$20(RotationHandler_47kP var0);

   private static native C_45n recovery$indy$21(RotationHandler_47kP var0);

   private static native C_45n recovery$indy$22(RotationHandler_47kP var0);

   private static native C_45n recovery$indy$23(RotationHandler_47kP var0);

   private static native MethodHandle recovery$constant$24();
}
