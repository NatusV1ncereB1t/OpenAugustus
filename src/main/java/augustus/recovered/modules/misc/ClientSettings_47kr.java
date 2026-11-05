package augustus.recovered.modules.misc;
import augustus.recovered.modules.combat.KillAura_47CY;
import augustus.recovered.modules.combat.MoreKB_47CU;
import augustus.recovered.modules.world.Scaffold_47Te;
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
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import client.Client;
import net.C_43D;
import net.C_45n;
import net.C_46I;
import net.C_470K;
import net.C_471V;
import net.C_473U;
import net.C_4747;
import net.C_476q;
import net.minecraft.client.gui.ScaledResolution;
import net.C_47AL;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.C_47MO;
import client.module.Module;
import net.C_47Pf;
import client.module.ModuleManager;
import net.C_47R9;
import net.C_47T1;
import client.setting.SettingGroup;
import client.setting.NumberSetting;
import net.C_47TU;
import client.setting.BooleanSetting;
import client.setting.ModeSetting;
import client.setting.RangeSetting;
import net.C_47UU;
import net.C_47V7;
import net.C_47VA;
import net.C_47Wt;
import client.event.RenderListener;
import net.minecraft.entity.EntityLivingBase;
import net.C_47bj;
import net.C_47cu;
import net.C_47gK;
import net.C_47iC;
import net.C_47jH;
import net.C_47jI;
import net.minecraft.client.Minecraft;
import net.C_47oP;
import net.C_47ob;
import net.minecraft.util.ResourceLocation;
import net.C_47qt;
import client.ClientGlobals;
import net.C_47rL;
import client.render.RenderUtils;
import net.C_47t7;
import client.module.Category;
import net.C_47xz;
import net.C_47yA;
import net.C_4f;
import org.lwjgl.opengl.GL11;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class ClientSettings_47kr extends client.module.Module implements net.C_47xz,client.event.RenderListener,net.C_47iC,net.C_47Wt {
    private final client.setting.SettingGroup settingGuiButtons = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingRoundedButtons = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.NumberSetting settingRoundFactor = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingSounds = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingMode = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingModuleToggleSound = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingHideMainMenuAccountInfos = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingConnectionInfo = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingScale = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingCommandStuff = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingCommandPrefixes = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingConfigSettings = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingLoadKeysFromConfigs = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingChatSettings = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingChatCopySymbol = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingFastServerPining1 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingBanStatistics = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingRemoveFramerateLimitInScreens = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.SettingGroup settingBackgroundSettings = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingCustomBackground = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingMouseInputsOnBackgrounds = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingTryFixingRendermodulesWithOptifineShaders = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingTryFixingNametagsWithOptifineShaders = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.BooleanSetting settingSideMainMenu = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_45S = null; // Runtime access flags and ConstantValue are restored from the original class.
    private static net.C_47cu field_45M; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_45p; // Runtime access flags and ConstantValue are restored from the original class.
    private long field_46; // Runtime access flags and ConstantValue are restored from the original class.
    private static volatile int field_45n; // Runtime access flags and ConstantValue are restored from the original class.
    private static int field_42; // Runtime access flags and ConstantValue are restored from the original class.
    private static int[] field_49; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.String b(int a0,long a1);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.String b(byte[] a0);

   public static int[] method_46$d4d28024c9() {
      return field_49;
   }



   private static void method_46$a7421bf54c(String var0) {
      long var1 = a ^ 107838969910782L;
      long var3 = var1 ^ 105687619619696L;
      C_47bj var10000 = new C_47bj();
      long var10003 = 2408358813949338407L;
      String var5 = var0;
      long var6 = var3;
      C_47bj var8 = var10000;
      var8.method_48$d07b98bfef(var6, var5);
   }



    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

   public static void method_42$da8c82d5d4() {
      long var2;
      int[] var6;
      int var23;
      long var0 = a ^ 131324212453638L;
      var2 = var0 ^ 90899584210550L;
      long var4 = var0 ^ 91224357261421L;
      long var10000 = 1555318984936053266L;
      Client var20 = Client.method_44$fbc0c0be91();
      long var10001 = 1552010550857888383L;
      Client var9 = var20;
      long var10002 = 1552247690925801584L;
      long var10 = var4;
      ModeSetting var12 = var9.method_45$4a5eee04b7().field_46d.settingMode;
      String var7 = var12.method_46$5f9dc63072(var10);
      long var21 = 1554434396520386485L;
      int[] var22 = method_46$d4d28024c9();
      byte var8 = -1;
      var6 = var22;
      var23 = var7.hashCode();
      label63:
      if (var6 == null) {
         switch (var23) {
            case 1897755483:
               var23 = (int) ((var7.equals("Vanilla")) ? 1 : 0);
               if (var6 != null) {
                  break label63;
               }

               if (var23 == 0) {
                  break;
               }

               var8 = 0;
               if (var6 == null) {
                  break;
               }
            case 77106473:
               var23 = (int) ((var7.equals("Piano")) ? 1 : 0);
               if (var6 != null) {
                  break label63;
               }

               if (var23 == 0) {
                  break;
               }

               var8 = 1;
               if (var6 == null) {
                  break;
               }
            case 79882757:
               var23 = (int) ((var7.equals("Sigma")) ? 1 : 0);
               if (var6 != null) {
                  break label63;
               }

               if (var23 != 0) {
                  var8 = 2;
               }
         }

         var23 = var8;
      }

      switch (var23) {
         case 0:
            var10001 = 1551609715462129201L;
            Minecraft var13 = field_43;
            var13.method_47$52ebbd81b9().method_48$38ea80174b(C_4747.method_41$1e753247d3(C_47rL.field_42, 1.0F));
            if (var6 == null) {
               break;
            }
         case 1:
            var10002 = 1554628996944228420L;
            ResourceLocation var14 = C_47rL.field_48;
            long var15 = var2;
            C_47rL.method_43$c325091c28(var15, var14);
            if (var6 == null) {
               break;
            }
         case 2:
            var10002 = 1554628996944228420L;
            ResourceLocation var17 = C_47rL.field_48a;
            long var18 = var2;
            C_47rL.method_43$c325091c28(var18, var17);
      }
   }




    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$474fbeba6c(C_43D var1, long var2) {
      long var4 = var2 ^ 65769238561263L;
      int[] var6 = recovery$indy$1(1308312793098487823L, var2);
      String var7 = recovery$indy$2(var1, 1311044358626164205L, var2);
      String var10000 = var7.toLowerCase(Locale.ROOT);
      String var10001 = recovery$indy$3(30059, 4156811967773813971L ^ var2);
      if (var6 == null) {
         if (!var10000.startsWith(var10001)) {
            return;
         }

         recovery$indy$4(1310512534306676136L, var2).getClass();
         var10000 = var7;
         var10001 = " ";
      }

      String[] var8 = var10000.split(var10001);
      int var9 = var8.length;
      if (var6 == null) {
         if (var9 <= 1) {
            return;
         }

         var9 = (int) ((C_47jI.field_46.containsKey(var8[1])) ? 1 : 0);
      }

      if (var9 != 0) {
         recovery$indy$5(ClientGlobals.field_48.field_46_, var4, true, 1309892930162642807L, var2);
         var1.cancel();
      }
   }



   public void method_41$9035875d26(long var1, C_47ob var3) {
      boolean var41;
      int[] var48;
      java.lang.StringBuilder var43;
      int var52;
      long var4 = (var1 ^ 16234504543455L) >>> 16;
      int var6 = (int)((var1 ^ 16234504543455L) << 48 >>> 48);
      long var7 = var1 ^ 131878944281190L;
      long var9 = var1 ^ 17925729311181L;
      long var11 = var1 ^ 122329951570597L;
      long var10000 = -7191624754654247403L;
      int[] var14 = method_46$d4d28024c9();
      long var10001 = -7191582725909101499L;
      C_47ob var20 = var3;
      C_473U var15 = var20.method_46$96fcbedb66();
      C_473U var38 = var15;
      if (var14 == null) {
         if (!(var15 instanceof C_471V)) {
            return;
         }

         var10000 = -7190602798636313678L;
         Client.method_44$fbc0c0be91().getClass();
         var38 = var15;
      }

      String var17;
      String var18;
      label120: {
         label119: {
            label118: {
               C_471V var16 = (C_471V)var38;
               var17 = var16.method_44$0e30dfc966();
               var18 = var17.toLowerCase();
               byte var40 = (byte) ((var18.contains("/intave record")) ? 1 : 0);
               if (var14 == null) {
                  if (var40 == 0) {
                     var41 = var18.contains("/sampler start");
                     var48 = var14;
                     if (var1 <= 0L) {
                        break label120;
                     }

                     if (var14 != null) {
                        break label119;
                     }

                     if (!var41) {
                        break label118;
                     }
                  }

                  var40 = 1;
               }

               byte var13 = var40;
               short var49 = (short)var6;
               long var10003 = -7191508117482255816L;
               C_47UU.method_42$bd38c73ed7(var4, var49, var13);
            }

            var41 = var18.contains("/intave");
         }

         var48 = var14;
      }

      label130: {
         if (var1 >= 0L) {
            if (var48 == null) {
               if (var41) {
                  break label130;
               }

               var41 = var18.contains("/sampler");
            }

            var48 = var14;
         }

         if (var1 >= 0L) {
            if (var48 == null) {
               if (var41) {
                  break label130;
               }

               var41 = var18.contains("/polar");
            }

            var48 = var14;
         }

         if (var1 > 0L) {
            if (var48 == null) {
               if (var41) {
                  break label130;
               }

               var41 = var18.contains("/verbose");
            }

            var48 = var14;
         }

         if (var48 == null) {
            if (var41) {
               break label130;
            }

            var41 = var18.contains("/alerts");
         }

         if (!var41) {
            return;
         }
      }

      StringBuilder var42 = new StringBuilder();
      var10001 = -7190602798636313678L;
      Client var51 = Client.method_44$fbc0c0be91();
      long var56 = -7193514662567329886L;
      long var21 = var11;
      Client var23 = var51;
      var43 = var42.append(var23.method_43$5f9dc63072(var21));
      var52 = 16112;
      label75:
      if (var1 >= 0L) {
         long var10002 = 76461199195040022L ^ var1;
         var43 = var43.append(" tE=");
         var10002 = -7194344206714300910L;
         Minecraft var24 = field_43;
         EntityPlayerSP var53 = var24.field_42P;
         if (var14 == null) {
            if (var24.field_42P == null) {
               var52 = -1;
               break label75;
            }

            var10002 = -7194344206714300910L;
            Minecraft var25 = field_43;
            var53 = var25.field_42P;
         }

         var52 = var53.field_48y;
      }

      StringBuilder var44 = var43.append(var52).append(" aura=");
      var56 = -7193748231555277651L;
      long var26 = var7;
      KillAura_47CY var28 = ClientGlobals.field_48.field_48Q;
      StringBuilder var45 = var44.append(var28.method_46$0dd78e0064(var26)).append(" scaffold=");
      var56 = -7193748231555277651L;
      long var29 = var7;
      Scaffold_47Te var31 = ClientGlobals.field_48.field_46q;
      StringBuilder var46 = var45.append(var31.method_46$0dd78e0064(var29)).append(" auramode=");
      var56 = -7193669489498584624L;
      long var32 = var9;
      ModeSetting var34 = ClientGlobals.field_48.field_48Q.field_47x;
      StringBuilder var47 = var46.append(var34.method_46$5f9dc63072(var32)).append(" morekb=");
      var56 = -7193748231555277651L;
      long var35 = var7;
      MoreKB_47CU var37 = ClientGlobals.field_48.field_413;
      String var19 = var47.append(var37.method_46$0dd78e0064(var35)).append(" Message=").append(var17).toString();
      CompletableFuture.runAsync(recovery$indy$6(var19));
   }





   private static void method_40$a7421bf54c(String var0) {
      long var1 = a ^ 78679956824427L;
      long var3 = var1 ^ 76435328368613L;
      C_47bj var10000 = new C_47bj();
      long var10003 = 1583314404378646450L;
      String var5 = var0;
      long var6 = var3;
      C_47bj var8 = var10000;
      var8.method_48$d07b98bfef(var6, var5);
   }



   public static void method_44$d00df7729d(int var0) {
      field_45n = var0;
   }



   public void onRender2D(int var1, float var2, char var3, int var4, ScaledResolution var5) {
      long var6 = (long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var8 = var6 ^ 21305694875939L;
      recovery$indy$7(var8, false, 1632870037131641551L, var6);
   }



   private static boolean method_48$aae029aa0a() {
      return false;
   }



    public static void method_48$b757cde368(long n, final boolean b) {
        final long n2;
        n = (n2 = (ClientSettings_47kr.a ^ n));
        final long n3 = n2 ^ 0x6A12DF741F63L;
        final long n4 = n2 ^ 0x54196034D4EFL;
        org.lwjgl.opengl.GL11.glPushMatrix();
        final int[] method_46$d4d28024c9 = method_46$d4d28024c9();
        final net.minecraft.client.gui.ScaledResolution scaledResolution = new net.minecraft.client.gui.ScaledResolution(ClientSettings_47kr.field_43);
        final int[] array = method_46$d4d28024c9;
        if (array == null) {
            if (!b) {
                org.lwjgl.opengl.GL11.glScaled(1.0f / scaledResolution.method_40$8abf5c6871(), 1.0f / scaledResolution.method_40$8abf5c6871(), 1.0);
            }
            final String s = (ClientSettings_47kr.field_45n == 0) ? ("Lost connection to Augustus server (client closes in " + Math.max(0, 100 - ClientSettings_47kr.field_42 / 20) + " seconds)") : ((ClientSettings_47kr.field_45n == 1) ? ("Reconnecting to Augustus server (client closes in " + Math.max(0, 100 - ClientSettings_47kr.field_42 / 20) + " seconds)") : "Connected successfully to Augustus server");
            int field_45n;
            int n7;
            int n6;
            final int n5 = n6 = (n7 = (field_45n = ClientSettings_47kr.field_45n));
            final int[] array2 = array;
            if (n > 0L) {
                Label_1053: {
                    if (array2 == null) {
                        if (n5 == 0) {
                            n7 = java.awt.Color.red.getRGB();
                            break Label_1053;
                        }
                        field_45n = (n7 = ClientSettings_47kr.field_45n);
                    }
                    if (array == null) {
                        if (field_45n == 1) {
                            n7 = java.awt.Color.orange.getRGB();
                        }
                        else {
                            n7 = java.awt.Color.green.getRGB();
                        }
                    }
                }
                final int n8 = n7;
                final net.minecraft.client.gui.ScaledResolution scaledResolution2 = b ? new net.minecraft.client.gui.ScaledResolution(ClientSettings_47kr.field_43) : new net.minecraft.client.gui.ScaledResolution(ClientSettings_47kr.field_43.field_44f / client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3), ClientSettings_47kr.field_43.field_44g / client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3), (int)client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3));
                int n9 = b ? 1 : 0;
                int field_45n2 = b ? 1 : 0;
                if (array == null) {
                    if (!b) {
                        org.lwjgl.opengl.GL11.glScaled(client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3), client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3), 1.0);
                    }
                    n9 = (field_45n2 = ClientSettings_47kr.field_45n);
                }
                Label_1696: {
                    if (array == null) {
                        if (n9 != 2) {
                            ClientSettings_47kr.field_45M.method_46$da8c82d5d4();
                            break Label_1696;
                        }
                        field_45n2 = 0;
                    }
                    ClientSettings_47kr.field_42 = field_45n2;
                }
                if (ClientSettings_47kr.field_45n != 2 || ClientSettings_47kr.field_45M.method_42$b0e346e6e3(10000L, n4)) {
                    client.Client.method_44$fbc0c0be91().getClass();
                    ClientSettings_47kr.field_43.field_42N.method_43$7961e3f788(s, scaledResolution2.method_46$8abf5c6871() / 2 - ClientSettings_47kr.field_43.field_42N.method_48$2f485d5ba3(s) / 2 + (((b ? 1 : 0) != 0) ? 51 : 0), 1, n8);
                }
                org.lwjgl.opengl.GL11.glPopMatrix();
                client.render.RenderUtils.method_41$da8c82d5d4();
                return;
            }
            if (array2 == null) {
                if (n5 == 1) {
                    n6 = java.awt.Color.orange.getRGB();
                }
                else {
                    n6 = java.awt.Color.green.getRGB();
                }
            }
            final int n10 = n6;
            final net.minecraft.client.gui.ScaledResolution scaledResolution3 = b ? new net.minecraft.client.gui.ScaledResolution(ClientSettings_47kr.field_43) : new net.minecraft.client.gui.ScaledResolution(ClientSettings_47kr.field_43.field_44f / client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3), ClientSettings_47kr.field_43.field_44g / client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3), (int)client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3));
            int field_42 = b ? 1 : 0;
            Label_1165: {
                if (array == null) {
                    if ((b ? 1 : 0) != 2) {
                        ClientSettings_47kr.field_45M.method_46$da8c82d5d4();
                        break Label_1165;
                    }
                    field_42 = 0;
                }
                ClientSettings_47kr.field_42 = field_42;
            }
            if (ClientSettings_47kr.field_45n != 2 || ClientSettings_47kr.field_45M.method_42$b0e346e6e3(10000L, n4)) {
                client.Client.method_44$fbc0c0be91().getClass();
                ClientSettings_47kr.field_43.field_42N.method_43$7961e3f788(s, scaledResolution3.method_46$8abf5c6871() / 2 - ClientSettings_47kr.field_43.field_42N.method_48$2f485d5ba3(s) / 2 + (((b ? 1 : 0) != 0) ? 51 : 0), 1, n10);
            }
            org.lwjgl.opengl.GL11.glPopMatrix();
            client.render.RenderUtils.method_41$da8c82d5d4();
        }
        else {
            final String s2 = ((b ? 1 : 0) == 1) ? ("Reconnecting to Augustus server (client closes in " + Math.max(0, 100 - ClientSettings_47kr.field_42 / 20) + " seconds)") : "Connected successfully to Augustus server";
            int field_45n3;
            int n13;
            int n12;
            final int n11 = n12 = (n13 = (field_45n3 = ClientSettings_47kr.field_45n));
            final int[] array3 = array;
            if (n > 0L) {
                Label_0518: {
                    if (array3 == null) {
                        if (n11 == 0) {
                            n13 = java.awt.Color.red.getRGB();
                            break Label_0518;
                        }
                        field_45n3 = (n13 = ClientSettings_47kr.field_45n);
                    }
                    if (array == null) {
                        if (field_45n3 == 1) {
                            n13 = java.awt.Color.orange.getRGB();
                        }
                        else {
                            n13 = java.awt.Color.green.getRGB();
                        }
                    }
                }
                final int n14 = n13;
                final net.minecraft.client.gui.ScaledResolution scaledResolution4 = b ? new net.minecraft.client.gui.ScaledResolution(ClientSettings_47kr.field_43) : new net.minecraft.client.gui.ScaledResolution(ClientSettings_47kr.field_43.field_44f / client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3), ClientSettings_47kr.field_43.field_44g / client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3), (int)client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3));
                int n15 = b ? 1 : 0;
                int field_45n4 = b ? 1 : 0;
                if (array == null) {
                    if (!b) {
                        org.lwjgl.opengl.GL11.glScaled(client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3), client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3), 1.0);
                    }
                    n15 = (field_45n4 = ClientSettings_47kr.field_45n);
                }
                if (array == null) {
                    if (n15 != 2) {
                        ClientSettings_47kr.field_45M.method_46$da8c82d5d4();
                    }
                    field_45n4 = 0;
                }
                ClientSettings_47kr.field_42 = field_45n4;
                if (ClientSettings_47kr.field_45n == 0) {
                    client.Client.method_44$fbc0c0be91().getClass();
                    ClientSettings_47kr.field_43.field_42N.method_43$7961e3f788(s2, scaledResolution4.method_46$8abf5c6871() / 2 - ClientSettings_47kr.field_43.field_42N.method_48$2f485d5ba3(s2) / 2 + (b ? 1 : 0), 1, n14);
                }
                org.lwjgl.opengl.GL11.glPopMatrix();
                client.render.RenderUtils.method_41$da8c82d5d4();
                return;
            }
            if (array3 == null) {
                if (n11 == 1) {
                    n12 = java.awt.Color.orange.getRGB();
                }
                else {
                    n12 = java.awt.Color.green.getRGB();
                }
            }
            final int n16 = n12;
            final net.minecraft.client.gui.ScaledResolution scaledResolution5 = b ? new net.minecraft.client.gui.ScaledResolution(ClientSettings_47kr.field_43) : new net.minecraft.client.gui.ScaledResolution(ClientSettings_47kr.field_43.field_44f / client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3), ClientSettings_47kr.field_43.field_44g / client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3), (int)client.ClientGlobals.field_48.field_46d.settingScale.method_44$474dfaa627(n3));
            int field_43 = b ? 1 : 0;
            if (array == null) {
                if ((b ? 1 : 0) != 2) {
                    ClientSettings_47kr.field_45M.method_46$da8c82d5d4();
                }
                field_43 = 0;
            }
            ClientSettings_47kr.field_42 = field_43;
            if (ClientSettings_47kr.field_45n == 0) {
                client.Client.method_44$fbc0c0be91().getClass();
                ClientSettings_47kr.field_43.field_42N.method_43$7961e3f788(s2, scaledResolution5.method_46$8abf5c6871() / 2 - ClientSettings_47kr.field_43.field_42N.method_48$2f485d5ba3(s2) / 2 + (b ? 1 : 0), 1, n16);
            }
            org.lwjgl.opengl.GL11.glPopMatrix();
            client.render.RenderUtils.method_41$da8c82d5d4();
        }
    }





   public static void method_48$c1c423c01c(int var0, char var1, char var2) {
      net.minecraft.client.gui.FontRenderer var49;
      java.lang.StringBuilder var59;
      net.minecraft.client.gui.FontRenderer var50;
      java.lang.StringBuilder var62;
      long var3 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48) ^ a;
      long var5 = var3 ^ 14330434621480L;
      long var7 = var3 ^ 46916326711045L;
      long var10001 = var3 ^ 39825241144153L;
      int var9 = (int)((var3 ^ 39825241144153L) >>> 48);
      int var10 = (int)((var3 ^ 39825241144153L) << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      long var12 = var3 ^ 75097956413139L;
      long var14 = var3 ^ 106106646214709L;
      long var16 = var3 ^ 74652554399742L;
      long var10000 = 3360310539289244805L;
      int[] var18 = method_46$d4d28024c9();
      var10001 = 3360711507001654919L;
      BooleanSetting var20 = ClientGlobals.field_48.field_46d.settingHideMainMenuAccountInfos;
      if (!var20.method_49$aae029aa0a()) {
         C_47T1 var19;
         String var71;
         label55: {
            var10000 = 3361329198938579234L;
            Client var47 = Client.method_44$fbc0c0be91();
            var10001 = 3361654340194155640L;
            Client var21 = var47;
            var19 = var21.method_45$662ccc89bb();
            var10001 = 3361867614944960515L;
            Minecraft var22 = field_43;
            FontRenderer var48 = var22.field_42N;
            StringBuilder var54 = new StringBuilder().append("Username: §e");
            long var10002 = 3361329198938579234L;
            Client var63 = Client.method_44$fbc0c0be91();
            long var10004 = 3367442669459967282L;
            long var23 = var14;
            Client var25 = var63;
            StringBuilder var55 = var54.append(var25.method_43$5f9dc63072(var23)).append("§7 [§e");
            long var64 = 3361329198938579234L;
            Client var65 = Client.method_44$fbc0c0be91();
            char var10003 = (char)var9;
            char var78 = (char)var10;
            long var10006 = 3361778699873900345L;
            int var26 = var11;
            char var27 = var78;
            char var28 = var10003;
            Client var29 = var65;
            StringBuilder var56 = var55.append(var29.method_43$056bba07dc(var28, var27, var26)).append("§7]§r [");
            long var66 = 3361329198938579234L;
            Client var67 = Client.method_44$fbc0c0be91();
            var10004 = 3366810474219098518L;
            long var30 = var7;
            Client var32 = var67;
            StringBuilder var57 = var56.append(var32.method_41$5f9dc63072(var30));
            long var68 = 3361329198938579234L;
            Client var69 = Client.method_44$fbc0c0be91();
            var10004 = 3360476718460271806L;
            long var33 = var12;
            Client var35 = var69;
            var48.method_40$b593f01403(var57.append(var35.method_48$5f9dc63072(var33)).append("§r]").toString(), 2.0F, 2.0F, -1);
            var10001 = 3361867614944960515L;
            Minecraft var36 = field_43;
            var49 = var36.field_42N;
            var59 = new StringBuilder();
            int var70 = 6817;
            if (var2 > 0) {
               long var75 = 7919098803344277379L ^ var3;
               var59 = var59.append("Account: ");
               long var76 = 3367046520859258814L;
               Minecraft var37 = field_43;
               var71 = var37.field_44h.method_40$0e30dfc966();
               if (var18 != null) {
                  break label55;
               }

               var70 = var71.length();
            }

            if (var2 > 0) {
               if (var70 < 5) {
                  var71 = "§c";
                  break label55;
               }

               var70 = 6358;
            }

            var71 = recovery$indy$8(var70, 4721996500669038015L ^ var3);
         }

         label40: {
            StringBuilder var60 = var59.append(var71);
            long var77 = 3367106678397325772L;
            Minecraft var38 = field_43;
            var49.method_40$b593f01403(var60.append(var38.method_41$557fdc188b().method_47$0e30dfc966()).toString(), 2.0F, 12.0F, -1);
            var10001 = 3361867614944960515L;
            Minecraft var39 = field_43;
            var50 = var39.field_42N;
            var62 = new StringBuilder();
            if (var0 > 0) {
               var71 = "Proxy: ";
               if (var18 != null) {
                  break label40;
               }

               var62 = var62.append("Proxy: ");
            }

            if (var19 == null) {
               var71 = "§cNot connected!";
            } else {
               StringBuilder var73 = new StringBuilder().append("§7");
               long var10005 = 3360955944488348515L;
               long var40 = var16;
               C_47T1 var42 = var19;
               StringBuilder var74 = var73.append(var42.method_41$5f9dc63072(var40)).append(":");
               var10005 = 3361120287891431657L;
               long var43 = var5;
               C_47T1 var45 = var19;
               var71 = var74.append(var45.method_40$95d88932bd(var43)).toString();
            }
         }

         var50.method_40$b593f01403(var62.append(var71).toString(), 2.0F, 22.0F, -1);
      }
   }





   public static void method_49$2022b4f670(int[] var0) {
      field_49 = var0;
   }



   public static void method_49$3345a93977(short var0, int var1, short var2) {
      long var5;
      int[] var9;
      int var23;
      long var3 = ((long)var0 << 48 | (long)var1 << 32 >>> 16 | (long)var2 << 48 >>> 48) ^ a;
      var5 = var3 ^ 82795730906275L;
      long var7 = var3 ^ 82560078359224L;
      long var10000 = 8016551927041269959L;
      Client var20 = Client.method_44$fbc0c0be91();
      long var10001 = 8024500561913481386L;
      Client var12 = var20;
      long var10002 = 8025318799714679461L;
      long var13 = var7;
      ModeSetting var15 = var12.method_45$4a5eee04b7().field_46d.settingMode;
      String var10 = var15.method_46$5f9dc63072(var13);
      long var21 = 8018496650814387552L;
      int[] var22 = method_46$d4d28024c9();
      byte var11 = -1;
      var9 = var22;
      var23 = var10.hashCode();
      label76:
      if (var9 == null) {
         label79: {
            label73: {
               label80: {
                  switch (var23) {
                     case 79882757:
                        break label80;
                     case 1897755483:
                        var23 = (int) ((var10.equals("Vanilla")) ? 1 : 0);
                        if (var9 != null) {
                           break label76;
                        }

                        if (var23 == 0) {
                           break label79;
                        }

                        var23 = 0;
                        if (var0 < 0) {
                           break;
                        }

                        var11 = 0;
                        if (var9 == null) {
                           break label79;
                        }
                     case 77106473:
                        var23 = (int) ((var10.equals("Piano")) ? 1 : 0);
                        break;
                     default:
                        break label79;
                  }

                  if (var9 != null) {
                     break label76;
                  }

                  if (var23 == 0) {
                     break label79;
                  }

                  var23 = 1;
                  if (var0 < 0) {
                     break label73;
                  }

                  var11 = 1;
                  if (var9 == null) {
                     break label79;
                  }
               }

               var23 = (int) ((var10.equals("Sigma")) ? 1 : 0);
            }

            if (var9 != null) {
               break label76;
            }

            if (var23 != 0) {
               var11 = 2;
            }
         }

         var23 = var11;
      }

      switch (var23) {
         case 0:
            var10001 = 8024698966897999076L;
            Minecraft var16 = field_43;
            var16.method_47$52ebbd81b9().method_48$38ea80174b(C_4747.method_41$1e753247d3(new ResourceLocation("gui.button.press"), 1.0F));
            if (var9 == null) {
               break;
            }
         case 1:
         case 2:
            var10002 = 8018165693498100369L;
            ResourceLocation var17 = C_47rL.field_48F;
            long var18 = var5;
            C_47rL.method_43$c325091c28(var18, var17);
      }
   }




   private static boolean method_45$aae029aa0a() {
      return false;
   }



   public static void method_45$da8c82d5d4() {
      long var2;
      int[] var6;
      int var23;
      long var0 = a ^ 111356708394524L;
      var2 = var0 ^ 71035427348844L;
      long var4 = var0 ^ 71197126322039L;
      long var10000 = -6733013009216803576L;
      Client var20 = Client.method_44$fbc0c0be91();
      long var10001 = -6731813368043256475L;
      Client var9 = var20;
      long var10002 = -6732701965076580502L;
      long var10 = var4;
      ModeSetting var12 = var9.method_45$4a5eee04b7().field_46d.settingMode;
      String var7 = var12.method_46$5f9dc63072(var10);
      long var21 = -6735018970778453841L;
      int[] var22 = method_46$d4d28024c9();
      byte var8 = -1;
      var6 = var22;
      var23 = var7.hashCode();
      label63:
      if (var6 == null) {
         switch (var23) {
            case 1897755483:
               var23 = (int) ((var7.equals("Vanilla")) ? 1 : 0);
               if (var6 != null) {
                  break label63;
               }

               if (var23 == 0) {
                  break;
               }

               var8 = 0;
               if (var6 == null) {
                  break;
               }
            case 77106473:
               var23 = (int) ((var7.equals("Piano")) ? 1 : 0);
               if (var6 != null) {
                  break label63;
               }

               if (var23 == 0) {
                  break;
               }

               var8 = 1;
               if (var6 == null) {
                  break;
               }
            case 79882757:
               var23 = (int) ((var7.equals("Sigma")) ? 1 : 0);
               if (var6 != null) {
                  break label63;
               }

               if (var23 != 0) {
                  var8 = 2;
               }
         }

         var23 = var8;
      }

      switch (var23) {
         case 0:
            var10001 = -6732178958937296597L;
            Minecraft var13 = field_43;
            var13.method_47$52ebbd81b9().method_48$38ea80174b(C_4747.method_41$1e753247d3(C_47rL.field_42, 1.0F));
            if (var6 == null) {
               break;
            }
         case 1:
            var10002 = -6734793626575616162L;
            ResourceLocation var14 = C_47rL.field_48c;
            long var15 = var2;
            C_47rL.method_43$c325091c28(var15, var14);
            if (var6 == null) {
               break;
            }
         case 2:
            var10002 = -6734793626575616162L;
            ResourceLocation var17 = C_47rL.field_48i;
            long var18 = var2;
            C_47rL.method_43$c325091c28(var18, var17);
      }
   }




   public void method_47$9035875d26(long var1, C_47ob var3) {
      java.lang.StringBuilder var117;
      int var133;
      java.lang.StringBuilder var122;
      java.lang.String var136;
      java.lang.StringBuilder var149;
      int[] var21;
      C_473U var22;
      boolean var105;
      int[] var129;
      label704: {
         long var4 = var1 ^ 12780865507374L;
         long var6 = var1 ^ 73233076005724L;
         long var8 = var1 ^ 44174393851305L;
         long var10 = var1 ^ 27775758592377L;
         long var10001 = var1 ^ 15773427384240L;
         int var12 = (int)((var1 ^ 15773427384240L) >>> 48);
         int var13 = (int)((var1 ^ 15773427384240L) << 16 >>> 32);
         int var14 = (int)(var10001 << 48 >>> 48);
         long var15 = var1 ^ 40846118478071L;
         long var17 = var1 ^ 99135287243679L;
         long var19 = var1 ^ 51768357993499L;
         long var10000 = 2668385016462327599L;
         var21 = method_46$d4d28024c9();
         long var125 = 2668498187597249919L;
         C_47ob var31 = var3;
         var22 = var31.method_46$96fcbedb66();
         var105 = var22 instanceof C_47AL;
         label703:
         if (var21 == null) {
            label701:
            if (var105) {
               long var106 = 2670614451480291976L;
               Client.method_44$fbc0c0be91().getClass();
               C_47AL var23 = (C_47AL)var22;
               C_47oP var24 = var23.method_45$8b128fd962();
               C_47oP var107 = var24;
               if (var21 == null) {
                  if (var24 == null) {
                     return;
                  }

                  var107 = var24;
               }

               String var25;
               String var26;
               String var27;
               label698: {
                  var25 = var107.method_48$0e30dfc966();
                  var26 = var25.toLowerCase();
                  long var108 = 2670614451480291976L;
                  Client var109 = Client.method_44$fbc0c0be91();
                  long var10002 = 2671116085293975192L;
                  long var32 = var17;
                  Client var34 = var109;
                  var27 = var34.method_43$5f9dc63072(var32);
                  String var110 = var27;
                  if (var21 == null) {
                     if (var27 != null) {
                        break label698;
                     }

                     var110 = "";
                  }

                  var27 = var110;
               }

               label692: {
                  label691: {
                     boolean var28;
                     label690: {
                        var28 = false;
                        var105 = var26.contains("sampling request sent");
                        label689:
                        if (var21 == null) {
                           if (!var105) {
                              var105 = var26.contains("started recording for type: ");
                              if (var21 != null) {
                                 break label689;
                              }

                              if (!var105) {
                                 var105 = var26.contains("recording enabled for");
                                 var129 = var21;
                                 if (var1 <= 0L) {
                                    break label692;
                                 }

                                 if (var21 != null) {
                                    break label691;
                                 }

                                 if (!var105) {
                                    break label690;
                                 }
                              }
                           }

                           var105 = true;
                        }

                        var28 = var105;
                     }

                     var105 = var28;
                  }

                  var129 = var21;
               }

               label709: {
                  if (var1 > 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("polar");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("sampler");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("intave");
                     }

                     var129 = var21;
                  }

                  label651: {
                     label650:
                     if (var129 == null) {
                        if (var105) {
                           var105 = var26.contains("intave12");
                           var129 = var21;
                           if (var1 < 0L) {
                              break label651;
                           }

                           if (var21 != null) {
                              break label650;
                           }

                           if (!var105) {
                              break label709;
                           }
                        }

                        var105 = var26.contains("given resistance (id 11)");
                     }

                     var129 = var21;
                  }

                  if (var1 > 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("mitigated");
                     }

                     var129 = var21;
                  }

                  if (var1 > 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("clickpatterns");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("javadouble");
                     }

                     var129 = var21;
                  }

                  if (var1 > 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("receiving fine violation");
                     }

                     var129 = var21;
                  }

                  if (var1 > 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("combat modifier debug");
                     }

                     var129 = var21;
                  }

                  if (var1 > 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("transmitting and recording");
                     }

                     var129 = var21;
                  }

                  if (var1 > 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("remote status (sent from cloud)");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains(" version: c-");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains(" detection: ");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains(" shard master is connected");
                     }

                     var129 = var21;
                  }

                  if (var1 > 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("recording disabled for");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("micro-lagging");
                     }

                     var129 = var21;
                  }

                  if (var1 > 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("component: ");
                     }

                     var129 = var21;
                  }

                  if (var1 > 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("heuristic");
                     }

                     var129 = var21;
                  }

                  label540: {
                     label539:
                     if (var129 == null) {
                        if (var105) {
                           var105 = var26.contains("check");
                           var129 = var21;
                           if (var1 >= 0L) {
                              if (var21 == null) {
                                 if (var105) {
                                    break label709;
                                 }

                                 var105 = var26.contains("vl");
                              }

                              var129 = var21;
                           }

                           if (var1 >= 0L) {
                              if (var129 == null) {
                                 if (var105) {
                                    break label709;
                                 }

                                 var105 = var26.contains("type");
                              }

                              var129 = var21;
                           }

                           if (var1 < 0L) {
                              break label540;
                           }

                           if (var129 != null) {
                              break label539;
                           }

                           if (var105) {
                              break label709;
                           }
                        }

                        var105 = var26.contains("likelihood");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("correlation");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("issued");
                     }

                     var129 = var21;
                  }

                  label501: {
                     label500:
                     if (var129 == null) {
                        if (var105) {
                           var105 = var26.contains("on");
                           var129 = var21;
                           if (var1 < 0L) {
                              break label501;
                           }

                           if (var21 != null) {
                              break label500;
                           }

                           if (var105) {
                              break label709;
                           }
                        }

                        var105 = var26.contains("exhibits");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("output of killaura");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("output of scaffold");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("history-based cloud detection");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("[ac]");
                     }

                     var129 = var21;
                  }

                  if (var1 > 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("/§agreen§7");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("/§6orange§7");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var26.contains("suspicious");
                     }

                     var129 = var21;
                  }

                  if (var1 >= 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        var105 = var27.equals("Tom");
                     }

                     var129 = var21;
                  }

                  if (var1 > 0L) {
                     if (var129 == null) {
                        if (var105) {
                           break label709;
                        }

                        long var112 = 2670614451480291976L;
                        Client var113 = Client.method_44$fbc0c0be91();
                        long var152 = 2671116085293975192L;
                        long var35 = var17;
                        Client var37 = var113;
                        var105 = var37.method_43$5f9dc63072(var35).equals("karuz");
                     }

                     var129 = var21;
                  }

                  if (var1 <= 0L) {
                     break label704;
                  }

                  if (var129 != null) {
                     break label703;
                  }

                  if (!var105) {
                     break label701;
                  }
               }

               ModuleManager var29;
               long var114 = 2670614451480291976L;
               Client var115 = Client.method_44$fbc0c0be91();
               long var130 = 2671670930656445157L;
               Client var38 = var115;
               var29 = var38.method_45$4a5eee04b7();
               StringBuilder var116 = new StringBuilder();
               long var131 = 2670614451480291976L;
               Client var132 = Client.method_44$fbc0c0be91();
               long var10003 = 2671116085293975192L;
               long var39 = var17;
               Client var41 = var132;
               var117 = var116.append(var41.method_43$5f9dc63072(var39));
               var133 = 16328;
               label421:
               if (var1 > 0L) {
                  long var153 = 2507872568982622552L ^ var1;
                  var117 = var117.append(" tE=");
                  var153 = 2671403568165826344L;
                  Minecraft var42 = field_43;
                  EntityPlayerSP var134 = var42.field_42P;
                  if (var21 == null) {
                     if (var42.field_42P == null) {
                        var133 = -1;
                        break label421;
                     }

                     var153 = 2671403568165826344L;
                     Minecraft var43 = field_43;
                     var134 = var43.field_42P;
                  }

                  var133 = var134.field_48y;
               }

               label414: {
                  label413: {
                     StringBuilder var118 = var117.append(var133).append(" aura=");
                     var10003 = 2670803299914360215L;
                     long var44 = var6;
                     KillAura_47CY var46 = var29.field_48Q;
                     StringBuilder var119 = var118.append(var46.method_46$0dd78e0064(var44)).append(" scaffold=");
                     var10003 = 2670803299914360215L;
                     long var47 = var6;
                     Scaffold_47Te var49 = var29.field_46q;
                     StringBuilder var120 = var119.append(var49.method_46$0dd78e0064(var47)).append(" auramode=");
                     var10003 = 2670853231856627946L;
                     long var50 = var15;
                     ModeSetting var52 = var29.field_48Q.field_47x;
                     StringBuilder var121 = var120.append(var52.method_46$5f9dc63072(var50)).append(" morekb=");
                     var10003 = 2670803299914360215L;
                     long var53 = var6;
                     MoreKB_47CU var55 = var29.field_413;
                     var122 = var121.append(var55.method_46$0dd78e0064(var53));
                     var10003 = 2670803299914360215L;
                     long var56 = var6;
                     KillAura_47CY var58 = var29.field_48Q;
                     boolean var135 = var58.method_46$0dd78e0064(var56);
                     if (var21 == null) {
                        if (!var135) {
                           break label413;
                        }

                        var10003 = 2670853231856627946L;
                        long var59 = var15;
                        ModeSetting var61 = var29.field_48Q.field_47x;
                        var136 = var61.method_46$5f9dc63072(var59);
                        if (var21 != null) {
                           break label414;
                        }

                        var135 = var136.equals("Noise2");
                     }

                     if (var135) {
                        StringBuilder var137 = new StringBuilder().append(" speed=");
                        long var10004 = 2668891301109740807L;
                        long var62 = var10;
                        NumberSetting var64 = var29.field_48Q.field_45A;
                        StringBuilder var138 = var137.append(var64.method_44$474dfaa627(var62)).append(" mindelay=");
                        var10004 = 2671531280458378088L;
                        long var65 = var8;
                        C_47TU var67 = var29.field_48Q.field_49Q;
                        StringBuilder var139 = var138.append(var67.method_41$474dfaa627(var65)).append(" maxdelay=");
                        var10004 = 2670512682037747389L;
                        long var68 = var4;
                        C_47TU var70 = var29.field_48Q.field_49Q;
                        StringBuilder var140 = var139.append(var70.method_43$474dfaa627(var68)).append(" attention=");
                        var10004 = 2668891301109740807L;
                        long var71 = var10;
                        NumberSetting var73 = var29.field_48Q.field_44o;
                        StringBuilder var141 = var140.append(var73.method_44$474dfaa627(var71)).append(" supercorrectionprob=");
                        var10004 = 2668891301109740807L;
                        long var74 = var10;
                        NumberSetting var76 = var29.field_48Q.field_45o;
                        StringBuilder var142 = var141.append(var76.method_44$474dfaa627(var74)).append(" supercorrectiondelaymin=");
                        char var164 = (char)var12;
                        long var10006 = 2670945852115262603L;
                        int var77 = var14;
                        int var78 = var13;
                        char var79 = var164;
                        RangeSetting var80 = var29.field_48Q.field_42F;
                        StringBuilder var143 = var142.append(var80.method_47$3192260b25(var79, var78, var77)).append(" supercorrectiondelaymax=");
                        var10004 = 2671739519847075077L;
                        long var81 = var19;
                        RangeSetting var83 = var29.field_48Q.field_42F;
                        StringBuilder var144 = var143.append(var83.method_42$474dfaa627(var81)).append(" additionalAccuracy=");
                        var10003 = 2668840064721007917L;
                        BooleanSetting var84 = var29.field_48Q.field_47m;
                        StringBuilder var145 = var144.append(var84.method_49$aae029aa0a()).append(" additionalInaccuracy=");
                        var10004 = 2668891301109740807L;
                        long var85 = var10;
                        NumberSetting var87 = var29.field_48Q.field_42C;
                        StringBuilder var146 = var145.append(var87.method_44$474dfaa627(var85)).append(" decelerationFactorPre=");
                        var10004 = 2668891301109740807L;
                        long var88 = var10;
                        NumberSetting var90 = var29.field_48Q.field_47Z;
                        StringBuilder var147 = var146.append(var90.method_44$474dfaa627(var88)).append(" decelerationFactorPost=");
                        var10004 = 2668891301109740807L;
                        long var91 = var10;
                        NumberSetting var93 = var29.field_48Q.field_45N;
                        var136 = var147.append(var93.method_44$474dfaa627(var91)).toString();
                        break label414;
                     }
                  }

                  var136 = "";
               }

               StringBuilder var123 = var122.append(var136);
               var10003 = 2670803299914360215L;
               long var94 = var6;
               KillAura_47CY var96 = var29.field_48Q;
               String var150;
               if (!var96.method_46$0dd78e0064(var94)) {
                  var150 = "";
               } else {
                  String var157;
                  label401: {
                     StringBuilder var148 = new StringBuilder().append(" fixmode=");
                     long var175 = 2670853231856627946L;
                     long var97 = var15;
                     ModeSetting var99 = var29.field_48Q.field_49X;
                     var149 = var148.append(var99.method_46$5f9dc63072(var97)).append(" target=");
                     EntityLivingBase var156 = var29.field_48Q.field_45z;
                     if (var21 == null) {
                        if (var29.field_48Q.field_45z == null) {
                           var157 = "null";
                           break label401;
                        }

                        var156 = var29.field_48Q.field_45z;
                     }

                     var157 = var156.method_41$0e30dfc966();
                  }

                  var150 = var149.append(var157).toString();
               }

               String var30 = var123.append(var150).append(" ").append(var25).toString();
               CompletableFuture.runAsync(recovery$indy$9(var30));
            }

            var105 = var22 instanceof C_47AL;
         }

         var129 = var21;
      }

      if (var129 == null) {
         if (!var105) {
            return;
         }

         long var151 = 2668840064721007917L;
         BooleanSetting var100 = this.settingChatCopySymbol;
         var105 = var100.method_49$aae029aa0a();
      }

      if (var105) {
         C_47AL var101 = (C_47AL)var22;
         C_47AL var124 = var101;
         if (var21 == null) {
            if (var101.method_43$7d493934e8() == 2) {
               return;
            }

            var124 = var101;
         }

         String var102 = C_47VA.method_44$7b622a9996(var124.method_45$8b128fd962().method_48$0e30dfc966());
         if (!var102.replace(" ", "").isEmpty()) {
            C_470K var103 = new C_470K(C_47Pf.DARK_GRAY + Character.toString((char)Integer.parseInt("270D", 16)));
            C_47qt var104 = new C_47qt()
               .method_43$d9c716ffb6(new C_47gK(C_47V7.SHOW_TEXT, new C_470K(C_47Pf.GRAY + "Copy message")))
               .method_44$9faa0b5073(new C_47jH(C_47R9.SUGGEST_COMMAND, var102));
            var103.method_41$b1cfdf8c76(var104);
            var101.method_45$8b128fd962().method_48$b844fe6f67(new C_470K(C_47Pf.RESET + " "));
            var101.method_45$8b128fd962().method_48$b844fe6f67(var103);
         }
      }
   }













   public void method_43_$e45a9973e5(long var1) {
   }



   public void method_482$4a66cb4514(char var1, int var2, char var3) {
      field_42++;
   }



   public void method_43y$e45a9973e5(long var1) {
   }



   public void method_489$e45a9973e5(long var1) {
      long var3 = var1 ^ 125492626815498L;
      long var5 = var1 ^ 137790388333951L;
      long var7 = var1 ^ 104906941096696L;
      long var9 = var1 ^ 123247985999379L;
      C_46I.field_450 = recovery$indy$10(this.settingTryFixingRendermodulesWithOptifineShaders, 4174776077816932811L, var1);
      int[] var10000 = recovery$indy$11(4174367739942740937L, var1);
      C_46I.field_49 = recovery$indy$12(this.settingTryFixingNametagsWithOptifineShaders, 4174776077816932811L, var1);
      int[] var11 = var10000;
      C_47t7 var12 = recovery$indy$13(var7, 4172756384990479316L, var1);
      C_47t7 var10001 = C_47t7.HALLOWEEN;
      if (var11 == null) {
         label50:
         if (var12 == C_47t7.HALLOWEEN && recovery$indy$14(field_43, 4176222494357271502L, var1) != null) {
            C_47cu var13 = this.field_45S;
            if (var11 == null) {
               if (!recovery$indy$15(this.field_45S, this.field_45p, var9, 4173542412874155514L, var1)) {
                  break label50;
               }

               recovery$indy$16(var3, C_47rL.field_41, 4174562357617220664L, var1);
               this.field_45p = recovery$indy$17(C_476q.field_48, 220000L, 500000L, var5, 4173425568468172895L, var1);
               var13 = this.field_45S;
            }

            recovery$indy$18(var13, 4176126361944170811L, var1);
         }

         var12 = recovery$indy$19(var7, 4172756384990479316L, var1);
         var10001 = C_47t7.FIRST_APRIL;
      }

      if (var12 == var10001 && recovery$indy$20(field_43, 4176222494357271502L, var1) != null) {
         C_47cu var14 = this.field_45S;
         if (var11 == null) {
            if (!recovery$indy$21(this.field_45S, this.field_46, var9, 4173542412874155514L, var1)) {
               return;
            }

            recovery$indy$22(var3, C_47rL.field_49, 4174562357617220664L, var1);
            this.field_46 = recovery$indy$23(C_476q.field_48, 800000L, 1000000L, var5, 4173425568468172895L, var1);
            var14 = this.field_45S;
         }

         recovery$indy$24(var14, 4176126361944170811L, var1);
      }
   }




   public void method_43x$c973149af1(short var1, int var2, char var3) {
   }



    public ClientSettings_47kr(long a0) {
        super((long) (((augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0) ^ 124317412446158L)),(java.lang.String) ("ClientSettings"),(java.lang.String) ("KundenEinstellungen"),((1) != 0),(java.awt.Color) (new java.awt.Color((int) (158),(int) (168),(int) (50))),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0);
        int constructorPart3 = (int) ((((augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0) ^ 102252361941736L) >>> 48));
        int constructorPart4 = (int) (((((augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0) ^ 102252361941736L) << 16) >>> 48));
        int constructorPart5 = (int) (((((augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0) ^ 102252361941736L) << 32) >>> 32));
        long constructorKey6 = ((augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0) ^ 38496846031140L);
        long constructorKey7 = ((augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0) ^ 17876471779535L);
        long constructorKey8 = ((augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0) ^ 7188233910900L);
        long constructorKey9 = ((augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0) ^ 101626975643027L);
        long constructorKey10 = ((augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0) ^ 29495243554082L);
        long constructorKey11 = ((augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0) ^ 47084150340633L);
        long constructorKey12 = ((augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0) ^ 31907084589224L);
        long constructorKey13 = ((augustus.recovered.modules.misc.ClientSettings_47kr.a ^ a0) ^ 83812408408742L);
        client.setting.SettingGroup initialized14 = new client.setting.SettingGroup(this, "GuiButtons", true, constructorKey9);
        recovery$indy$flow$623(this, initialized14);
        short converted15 = (short) (constructorPart3);
        char converted16 = (char) (constructorPart4);
        java.lang.Object initialValue17 = ((java.lang.Object)(((augustus.recovered.modules.misc.ClientSettings_47kr) (((java.lang.Object)(this)))).settingGuiButtons));
        client.setting.BooleanSetting initialized18 = new client.setting.BooleanSetting(this, "RoundedButtons", converted15, converted16, constructorPart5, true, (client.setting.SettingGroup) (initialValue17));
        recovery$indy$flow$627(this, initialized18);
        java.lang.Object initialValue19 = ((java.lang.Object)(((augustus.recovered.modules.misc.ClientSettings_47kr) (((java.lang.Object)(this)))).settingGuiButtons));
        client.setting.NumberSetting initialized20 = new client.setting.NumberSetting(this, "RoundFactor", Double.longBitsToDouble(4611686018427387904L), 1.0D, Double.longBitsToDouble(4626322717216342016L), 0, (client.setting.SettingGroup) (initialValue19), constructorKey12);
        java.lang.Object initialValue21 = ((java.lang.Object)(((augustus.recovered.modules.misc.ClientSettings_47kr) (((java.lang.Object)(this)))).settingRoundedButtons));
        java.lang.Object initialValue22 = recovery$indy$flow$632(initialValue21);
        java.lang.Object initialValue23 = recovery$indy$flow$633(initialValue21);
        java.lang.Object initialValue24 = initialValue23;
        client.setting.NumberSetting initialValue25 = initialized20;
        java.lang.Object initialValue26 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue27 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue24))))));
        java.lang.Object initialValue28 = recovery$indy$flow$636(initialValue26, initialValue27);
        recovery$indy$flow$637(this, initialValue28);
        client.setting.SettingGroup initialized29 = new client.setting.SettingGroup(this, "Sounds", true, constructorKey9);
        recovery$indy$flow$640(this, initialized29);
        java.lang.Object initialValue30 = recovery$indy$flow$642(3);
        ((java.lang.Object[]) initialValue30)[0] = "Vanilla";
        ((java.lang.Object[]) initialValue30)[1] = "Sigma";
        ((java.lang.Object[]) initialValue30)[2] = "Piano";
        java.lang.Object initialValue31 = ((java.lang.Object)(((augustus.recovered.modules.misc.ClientSettings_47kr) (((java.lang.Object)(this)))).settingSounds));
        client.setting.ModeSetting initialized32 = new client.setting.ModeSetting(this, "Mode", "Sigma", (java.lang.String[]) (initialValue30), (client.setting.SettingGroup) (initialValue31), constructorKey13);
        recovery$indy$flow$645(this, initialized32);
        short converted33 = (short) (constructorPart3);
        char converted34 = (char) (constructorPart4);
        java.lang.Object initialValue35 = ((java.lang.Object)(((augustus.recovered.modules.misc.ClientSettings_47kr) (((java.lang.Object)(this)))).settingSounds));
        client.setting.BooleanSetting initialized36 = new client.setting.BooleanSetting(this, "ModuleToggleSound", converted33, converted34, constructorPart5, true, (client.setting.SettingGroup) (initialValue35));
        recovery$indy$flow$649(this, initialized36);
        client.setting.BooleanSetting initialized37 = new client.setting.BooleanSetting(this, constructorKey11, "HideMainMenuAccountInfos", false);
        recovery$indy$flow$652(this, initialized37);
        client.setting.SettingGroup initialized38 = new client.setting.SettingGroup(this, "ConnectionInfo", true, constructorKey9);
        recovery$indy$flow$655(this, initialized38);
        java.lang.Object initialValue39 = ((java.lang.Object)(((augustus.recovered.modules.misc.ClientSettings_47kr) (((java.lang.Object)(this)))).settingConnectionInfo));
        client.setting.NumberSetting initialized40 = new client.setting.NumberSetting(this, "Scale", Double.longBitsToDouble(4611686018427387904L), 1.0D, Double.longBitsToDouble(4616189618054758400L), 2, (client.setting.SettingGroup) (initialValue39), constructorKey12);
        recovery$indy$flow$659(this, initialized40);
        client.setting.SettingGroup initialized41 = new client.setting.SettingGroup(this, "CommandStuff", true, constructorKey9);
        recovery$indy$flow$662(this, initialized41);
        java.lang.Object initialValue42 = recovery$indy$flow$664(12);
        ((java.lang.Object[]) initialValue42)[0] = ".";
        ((java.lang.Object[]) initialValue42)[1] = "-";
        ((java.lang.Object[]) initialValue42)[2] = "_";
        ((java.lang.Object[]) initialValue42)[3] = ":";
        ((java.lang.Object[]) initialValue42)[4] = ",";
        ((java.lang.Object[]) initialValue42)[5] = "+";
        ((java.lang.Object[]) initialValue42)[6] = "!";
        ((java.lang.Object[]) initialValue42)[7] = "#";
        ((java.lang.Object[]) initialValue42)[8] = "?";
        ((java.lang.Object[]) initialValue42)[9] = "\\";
        ((java.lang.Object[]) initialValue42)[10] = ">";
        ((java.lang.Object[]) initialValue42)[11] = "<";
        java.lang.Object initialValue43 = ((java.lang.Object)(((augustus.recovered.modules.misc.ClientSettings_47kr) (((java.lang.Object)(this)))).settingCommandStuff));
        client.setting.ModeSetting initialized44 = new client.setting.ModeSetting(this, "CommandPrefixes", ".", (java.lang.String[]) (initialValue42), (client.setting.SettingGroup) (initialValue43), constructorKey13);
        recovery$indy$flow$667(this, initialized44);
        client.setting.SettingGroup initialized45 = new client.setting.SettingGroup(this, "ConfigSettings", true, constructorKey9);
        recovery$indy$flow$670(this, initialized45);
        short converted46 = (short) (constructorPart3);
        char converted47 = (char) (constructorPart4);
        java.lang.Object initialValue48 = ((java.lang.Object)(((augustus.recovered.modules.misc.ClientSettings_47kr) (((java.lang.Object)(this)))).settingConfigSettings));
        client.setting.BooleanSetting initialized49 = new client.setting.BooleanSetting(this, "LoadKeysFromConfigs", converted46, converted47, constructorPart5, false, (client.setting.SettingGroup) (initialValue48));
        recovery$indy$flow$674(this, initialized49);
        client.setting.SettingGroup initialized50 = new client.setting.SettingGroup(this, "ChatSettings", true, constructorKey9);
        recovery$indy$flow$677(this, initialized50);
        short converted51 = (short) (constructorPart3);
        char converted52 = (char) (constructorPart4);
        java.lang.Object initialValue53 = ((java.lang.Object)(((augustus.recovered.modules.misc.ClientSettings_47kr) (((java.lang.Object)(this)))).settingChatSettings));
        client.setting.BooleanSetting initialized54 = new client.setting.BooleanSetting(this, "ChatCopySymbol", converted51, converted52, constructorPart5, false, (client.setting.SettingGroup) (initialValue53));
        recovery$indy$flow$681(this, initialized54);
        client.setting.BooleanSetting initialized55 = new client.setting.BooleanSetting(this, constructorKey11, "FastServerPining1", false);
        java.lang.Object initialValue56 = recovery$indy$flow$684();
        java.lang.Object initialValue57 = initialValue56;
        long initialValue58 = constructorKey6;
        client.setting.BooleanSetting initialValue59 = initialized55;
        java.lang.Object initialValue60 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue59))))));
        java.lang.Object initialValue61 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue62 = recovery$indy$flow$687(initialValue60, initialValue58, initialValue61);
        java.lang.Object initialValue63 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue62))))));
        recovery$indy$flow$689(this, initialValue63);
        java.lang.Object initialValue64 = recovery$indy$flow$691(0);
        client.setting.ModeSetting initialized65 = new client.setting.ModeSetting(this, "BanStatistics", constructorKey7, "Icon", (java.lang.String[]) (initialValue64));
        java.lang.Object initialValue66 = recovery$indy$flow$693();
        java.lang.Object initialValue67 = initialValue66;
        client.setting.ModeSetting initialValue68 = initialized65;
        java.lang.Object initialValue69 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialValue68))))));
        java.lang.Object initialValue70 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue67))))));
        java.lang.Object initialValue71 = recovery$indy$flow$696(initialValue69, initialValue70);
        recovery$indy$flow$697(this, initialValue71);
        client.setting.BooleanSetting initialized72 = new client.setting.BooleanSetting(this, constructorKey11, "RemoveFramerateLimitInScreens", true);
        recovery$indy$flow$700(this, initialized72);
        client.setting.SettingGroup initialized73 = new client.setting.SettingGroup(this, "BackgroundSettings", true, constructorKey9);
        recovery$indy$flow$703(this, initialized73);
        short converted74 = (short) (constructorPart3);
        char converted75 = (char) (constructorPart4);
        java.lang.Object initialValue76 = ((java.lang.Object)(((augustus.recovered.modules.misc.ClientSettings_47kr) (((java.lang.Object)(this)))).settingBackgroundSettings));
        client.setting.BooleanSetting initialized77 = new client.setting.BooleanSetting(this, "CustomBackground", converted74, converted75, constructorPart5, true, (client.setting.SettingGroup) (initialValue76));
        recovery$indy$flow$707(this, initialized77);
        short converted78 = (short) (constructorPart3);
        char converted79 = (char) (constructorPart4);
        java.lang.Object initialValue80 = ((java.lang.Object)(((augustus.recovered.modules.misc.ClientSettings_47kr) (((java.lang.Object)(this)))).settingBackgroundSettings));
        client.setting.BooleanSetting initialized81 = new client.setting.BooleanSetting(this, "MouseInputsOnBackgrounds", converted78, converted79, constructorPart5, false, (client.setting.SettingGroup) (initialValue80));
        recovery$indy$flow$711(this, initialized81);
        client.setting.BooleanSetting initialized82 = new client.setting.BooleanSetting(this, constructorKey11, "Try fixing rendermodules with optifine shaders", true);
        recovery$indy$flow$714(this, initialized82);
        client.setting.BooleanSetting initialized83 = new client.setting.BooleanSetting(this, constructorKey11, "Try fixing nametags with optifine shaders", true);
        recovery$indy$flow$717(this, initialized83);
        client.setting.BooleanSetting initialized84 = new client.setting.BooleanSetting(this, constructorKey11, "SideMainMenu", true);
        recovery$indy$flow$720(this, initialized84);
        net.C_47cu initialized85 = new net.C_47cu();
        recovery$indy$flow$723(this, initialized85);
        java.lang.Object initialValue86 = recovery$indy$flow$724();
        long initialValue87 = constructorKey10;
        long initialValue88 = 400000L;
        long initialValue89 = 220000L;
        java.lang.Object initialValue90 = initialValue86;
        java.lang.Object initialValue91 = ((java.lang.Object)(((net.C_47MO) (((java.lang.Object)(initialValue90))))));
        long initialValue92 = recovery$indy$flow$726(initialValue91, initialValue89, initialValue88, initialValue87);
        recovery$indy$flow$727(this, initialValue92);
        java.lang.Object initialValue93 = recovery$indy$flow$728();
        long initialValue94 = constructorKey10;
        long initialValue95 = 1000000L;
        long initialValue96 = 800000L;
        java.lang.Object initialValue97 = initialValue93;
        java.lang.Object initialValue98 = ((java.lang.Object)(((net.C_47MO) (((java.lang.Object)(initialValue97))))));
        long initialValue99 = recovery$indy$flow$730(initialValue98, initialValue96, initialValue95, initialValue94);
        recovery$indy$flow$731(this, initialValue99);
        int initialValue100 = 1;
        long initialValue101 = constructorKey8;
        ClientSettings_47kr initialValue102 = this;
        java.lang.Object initialValue103 = ((java.lang.Object)(((client.module.Module) (((java.lang.Object)(initialValue102))))));
        recovery$indy$flow$733(initialValue103, initialValue101, (initialValue100 != 0));
        java.lang.Object initialValue104 = recovery$indy$flow$734();
        recovery$indy$flow$735(initialValue104, 40, this);
        java.lang.Object initialValue105 = recovery$indy$flow$736();
        recovery$indy$flow$737(initialValue105, 32, this);
        java.lang.Object initialValue106 = recovery$indy$flow$738();
        recovery$indy$flow$739(initialValue106, 26, this);
        java.lang.Object initialValue107 = recovery$indy$flow$740();
        recovery$indy$flow$741(initialValue107, 5, this);
    }







    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native void recovery$indy$flow$623(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$627(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$632(java.lang.Object a0) {
        return a0.getClass();
    }
    private static native java.lang.Object recovery$indy$flow$633(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$636(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$637(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$640(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$642(int a0);

    private static native void recovery$indy$flow$645(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$649(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$652(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$655(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$659(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$662(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$664(int a0);

    private static native void recovery$indy$flow$667(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$670(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$674(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$677(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$681(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$684();


    private static native java.lang.Object recovery$indy$flow$687(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$689(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$691(int a0);
    private static native java.lang.Object recovery$indy$flow$693();


    private static native java.lang.Object recovery$indy$flow$696(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$697(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$700(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$703(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$707(java.lang.Object a0,java.lang.Object a1);

    private static native void recovery$indy$flow$711(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$714(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$717(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$720(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$723(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$724() {
        return net.C_476q.field_48;
    }

    private static native long recovery$indy$flow$726(java.lang.Object a0,long a1,long a2,long a3);
    private static void recovery$indy$flow$727(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.misc.ClientSettings_47kr) (a0)).field_45p = a1;
        return;
    }
    private static java.lang.Object recovery$indy$flow$728() {
        return net.C_476q.field_48;
    }

    private static native long recovery$indy$flow$730(java.lang.Object a0,long a1,long a2,long a3);
    private static void recovery$indy$flow$731(java.lang.Object a0,long a1) {
        ((augustus.recovered.modules.misc.ClientSettings_47kr) (a0)).field_46 = a1;
        return;
    }

    private static native void recovery$indy$flow$733(java.lang.Object a0,long a1,boolean a2);
    private static native java.lang.Object recovery$indy$flow$734();
    private static native void recovery$indy$flow$735(java.lang.Object a0,int a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$736();
    private static native void recovery$indy$flow$737(java.lang.Object a0,int a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$738();
    private static native void recovery$indy$flow$739(java.lang.Object a0,int a1,java.lang.Object a2);
    private static native java.lang.Object recovery$indy$flow$740();
    private static native void recovery$indy$flow$741(java.lang.Object a0,int a1,java.lang.Object a2);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$1(long var0, long var2);
   private static native String recovery$indy$2(Object var0, long var1, long var3);
   private static native String recovery$indy$3(int var0, long var1);
   private static native Client recovery$indy$4(long var0, long var2);
   private static native void recovery$indy$5(Object var0, long var1, boolean var3, long var4, long var6);
   private static native Runnable recovery$indy$6(String var0);
   private static native void recovery$indy$7(long var0, boolean var2, long var3, long var5);
   private static native String recovery$indy$8(int var0, long var1);
   private static native Runnable recovery$indy$9(String var0);
   private static native boolean recovery$indy$10(Object var0, long var1, long var3);
   private static native int[] recovery$indy$11(long var0, long var2);
   private static native boolean recovery$indy$12(Object var0, long var1, long var3);
   private static native C_47t7 recovery$indy$13(long var0, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$14(Object var0, long var1, long var3);
   private static native boolean recovery$indy$15(Object var0, long var1, long var3, long var5, long var7);
   private static native void recovery$indy$16(long var0, Object var2, long var3, long var5);
   private static native long recovery$indy$17(Object var0, long var1, long var3, long var5, long var7, long var9);
   private static native void recovery$indy$18(Object var0, long var1, long var3);
   private static native C_47t7 recovery$indy$19(long var0, long var2, long var4);
   private static native EntityPlayerSP recovery$indy$20(Object var0, long var1, long var3);
   private static native boolean recovery$indy$21(Object var0, long var1, long var3, long var5, long var7);
   private static native void recovery$indy$22(long var0, Object var2, long var3, long var5);
   private static native long recovery$indy$23(Object var0, long var1, long var3, long var5, long var7, long var9);
   private static native void recovery$indy$24(Object var0, long var1, long var3);
   private static native MethodHandle recovery$constant$28();
}
