package augustus.recovered.modules.render;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import client.Client;
import net.C_45n;
import net.C_473C;
import net.minecraft.client.entity.EntityPlayerSP;
import client.module.Module;
import client.setting.ModeSetting;
import net.C_47VK;
import net.C_47Yl;
import net.C_47eq;
import net.minecraft.util.ResourceLocation;
import client.module.Category;
import net.C_47z4;
import net.C_4f;

/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class CustomCape_47He extends client.module.Module {
    public final client.setting.ModeSetting settingType = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingLabyModCapes = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final client.setting.ModeSetting settingMojangCapes = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final java.lang.String field_44 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final java.util.HashMap field_48 = null; // Runtime access flags and ConstantValue are restored from the original class.
    public final java.util.HashMap field_49 = null; // Runtime access flags and ConstantValue are restored from the original class.
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

    private java.util.List method_42$9c3d81e880(long callerKey, String resource) {
        long key = recovery$indy$flow$7() ^ callerKey;
        long resourceKey = key ^ 62050142668613L;
        Object guard = recovery$indy$flow$8(-219934279181747226L, key);
        java.util.List lines = new java.util.ArrayList();
        try {
            Object stream = recovery$indy$flow$11(this, resourceKey, resource, -220494515273847233L, key);
            Throwable streamFailure = null;
            try {
                java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader((java.io.InputStream) stream));
                Throwable readerFailure = null;
                boolean skipReaderClose = false;
                try {
                    while (true) {
                        String line = reader.readLine();
                        if (line != null) {
                            lines.add(line);
                            if (key > 0L && guard != null) {
                                skipReaderClose = true;
                                break;
                            }
                            if (guard == null) continue;
                        }
                        if (key > 0L) break;
                        // Preserve the original non-progressing guard branch for abnormal keys.
                        if (guard != null) while (true) { }
                    }
                } catch (Throwable failure) {
                    readerFailure = failure;
                    return (java.util.List) recovery.flow.BytecodeFrame.rethrow(failure);
                } finally {
                    if (!skipReaderClose) {
                        if (readerFailure == null) {
                            reader.close();
                        } else {
                            try {
                                reader.close();
                            } catch (Throwable closeFailure) {
                                if (key <= 0L) return (java.util.List) recovery.flow.BytecodeFrame.rethrow(readerFailure);
                                readerFailure.addSuppressed(closeFailure);
                                if (guard != null) reader.close();
                            }
                        }
                    }
                }
            } catch (Throwable failure) {
                streamFailure = failure;
                return (java.util.List) recovery.flow.BytecodeFrame.rethrow(failure);
            } finally {
                if (stream != null) {
                    if (streamFailure == null) {
                        ((java.io.InputStream) stream).close();
                    } else {
                        try {
                            ((java.io.InputStream) stream).close();
                        } catch (Throwable closeFailure) {
                            if (key < 0L) return (java.util.List) recovery.flow.BytecodeFrame.rethrow(streamFailure);
                            streamFailure.addSuppressed(closeFailure);
                            if (guard != null) ((java.io.InputStream) stream).close();
                        }
                    }
                }
            }
        } catch (Exception failure) {
            recovery$indy$flow$30(failure);
        }
        return lines;
    }




    private static native java.lang.reflect.Method d(long a0,long a1);

   public void method_41$e45a9973e5(long var1) {
      boolean var31;
      boolean var33;
      var1 = a ^ var1;
      long var3 = var1 ^ 14964251528742L;
      long var5 = var1 ^ 35661173006079L;
      ArrayList var8 = new ArrayList();
      String var9 = "cape/mojang/";
      long var10000 = 5464996799246896323L;
      int[] var30 = AntiStrike_47Qa.method_42$d4d28024c9();
      List var10 = Arrays.asList(
         "Birthday.png",
         "Cobalt.png",
         "dB.png",
         "Migrator.png",
         "MillionthCustomer.png",
         "MineCon2011.png",
         "MineCon2012.png",
         "MineCon2013.png",
         "MineCon2015.png",
         "MineCon2016.png",
         "Mojang.png",
         "MojangClassic.png",
         "MojangStudios.png",
         "MojiraModerator.png",
         "Prismarine.png",
         "RealmsMapmaker.png",
         "Scrolls.png",
         "Snowman.png",
         "Spade.png",
         "Translator.png",
         "Translator(Chinese).png",
         "Translator(Japanese).png",
         "Turtle.png",
         "Valentine.png",
         "Vanilla.png"
      );
      int[] var7 = var30;
      this.field_49.clear();
      Iterator var11 = var10.iterator();

      while (true) {
         if (var11.hasNext()) {
            String var12 = (String)var11.next();
            String var13 = var12;
            String[] var14 = var13.split("\\.");
            var13 = var13.replace("." + var14[var14.length - 1], "");
            this.field_49.put(var13, new ResourceLocation("augustus", var9 + var12));
            if (var1 > 0L) {
               var31 = var8.add(var13);
               if (var7 != null) {
                  break;
               }
            }

            if (var7 == null) {
               continue;
            }
         }

         var31 = false;
         break;
      }

      boolean var25 = var31;
      String[] var26 = new String[var8.size()];
      int var28 = 0;

      while (true) {
         if (var28 < var26.length) {
            String var29 = (String)var8.get(var28);
            var26[var28] = var29;
            int[] var32 = var7;
            if (var1 >= 0L) {
               if (var7 == null) {
                  long var10002 = 5465882989783974325L;
                  long var15 = var3;
                  ModeSetting var17 = this.settingMojangCapes;
                  var33 = var17.method_46$5f9dc63072(var15).equals(var29);
                  if (var7 != null) {
                     break;
                  }

                  if (var33) {
                     var25 = true;
                  }

                  var28++;
               }

               var32 = var7;
            }

            if (var32 == null) {
               continue;
            }
         }

         if (var1 < 0L) {
            return;
         }

         var33 = var25;
         break;
      }

      if (!var33) {
         String var10001 = var26[0];
         long var34 = 5464136242069623752L;
         String var18 = var10001;
         ModeSetting var19 = this.settingMojangCapes;
         var19.method_49$a7421bf54c(var18);
      }

      long var10003 = 5464053053750639587L;
      long var20 = var5;
      String[] var22 = var26;
      ModeSetting var23 = this.settingMojangCapes;
      var23.method_42$7446cc8078(var22, var20);
   }





   public void method_40$e45a9973e5(long var1) {
        int var42;
        int var47;
      var1 = a ^ var1;
      long var3 = var1 ^ 4431649069008L;
      long var5 = var1 ^ 62471903340443L;
      long var7 = var1 ^ 23237902890818L;
      client.setting.ModeSetting var21 = this.settingLabyModCapes;
      java.util.ArrayList var10 = new java.util.ArrayList<>(java.util.Arrays.asList(var21.method_43$44c5829186()));
      java.util.ArrayList var11 = new java.util.ArrayList();
      int[] var10000 = AntiStrike_47Qa.method_42$d4d28024c9();
      java.io.File var12 = new java.io.File(this.field_44);
      int[] var9 = var10000;
      java.io.File[] var13 = var12.listFiles();
      java.io.File[] var41 = var13;
      if (var9 == null) {
         if (var13 == null) {
            return;
         }

         var41 = var13;
      }

      java.io.File[] var14 = var41;
      int var15 = var14.length;
      int var16 = 0;

      while (true) {
         if (var16 < var15) {
            label121: {
               java.io.File var17 = var14[var16];
               label120:
               if (var9 == null) {
                  var42 = ((var17.getName().contains(".png")) ? 1 : 0);
                  if (var9 != null) {
                     break;
                  }

                  label117:
                  if (var42 != 0) {
                     String var18 = var17.getName();
                     String[] var19 = var18.split("\\.");
                     String var40 = var18.replace("." + var19[var19.length - 1], "");
                     var10000 = var9;
                     if (var1 <= 0L) {
                        break label121;
                     }

                     if (var9 != null) {
                        break label120;
                     }

                     boolean var44 = var40.isEmpty();
                     if (var1 >= 0L) {
                        if (var44) {
                           break label117;
                        }

                        var44 = var10.contains(var40);
                     }

                     if (var9 == null) {
                        if (!var44) {
                           var10.add(var40);

                           try {
                              java.util.HashMap var45 = this.field_48;
                              java.awt.image.BufferedImage var22 = net.C_47z4.method_44$68eea9a2d6(javax.imageio.ImageIO.read(var17.getAbsoluteFile()));
                              long var23 = var3;
                              var45.put(var40, net.C_473C.method_47$79fea5a599(var23, var22));
                           } catch (java.io.IOException var34) {
                           }
                        }

                        var11.add(var40);
                     }
                  }

                  var16++;
               }

               var10000 = var9;
            }

            if (var10000 == null) {
               continue;
            }
         }

         ((java.util.List) (this.field_48
            .keySet()
            .stream()
            .filter((java.util.function.Predicate)recovery$indy$flow$116(var11))
            .collect(java.util.stream.Collectors.toList())))
            .forEach((java.util.function.Consumer)recovery$indy$flow$121(this, var10));
         var42 = 0;
         break;
      }

      byte var36 = ((byte) (var42));
      String[] var37 = new String[var10.size()];
      int var38 = 0;

      int[] var10001;
      label99: {
         while (true) {
            if (var38 < var37.length) {
               String var39 = (String)var10.get(var38);
               var37[var38] = var39;
               int[] var46 = var9;
               if (var1 >= 0L) {
                  if (var9 == null) {
                     long var25 = var5;
                     client.setting.ModeSetting var27 = this.settingLabyModCapes;
                     var47 = ((var27.method_46$5f9dc63072(var25).equals(var39)) ? 1 : 0);
                     var10001 = var9;
                     if (var1 <= 0L) {
                        break label99;
                     }

                     if (var9 != null) {
                        break;
                     }

                     if (var47 != 0) {
                        var36 = ((byte) (1));
                     }

                     var38++;
                  }

                  var46 = var9;
               }

               if (var46 == null) {
                  continue;
               }
            }

            if (var1 < 0L) {
               return;
            }

            var47 = var36;
            break;
         }

         var10001 = var9;
      }

      label80: {
         if (var10001 == null) {
            if (var47 != 0) {
               break label80;
            }

            var47 = var37.length;
         }

         if (var47 > 0) {
            String var28 = var37[0];
            client.setting.ModeSetting var29 = this.settingLabyModCapes;
            var29.method_49$a7421bf54c(var28);
         }
      }

      long var30 = var7;
      String[] var32 = var37;
      client.setting.ModeSetting var33 = this.settingLabyModCapes;
      var33.method_42$7446cc8078(var32, var30);
   }





   private InputStream method_48$25763e98c6(long var1, String var3) {
      var1 = a ^ var1;
      int[] var4 = recovery$indy$5(195509682890753442L, var1);
      InputStream var5 = CustomCape_47He.class.getClassLoader().getResourceAsStream(var3);
      InputStream var10000 = var5;
      if (var4 == null) {
         var10000 = var5 == null ? this.getClass().getResourceAsStream(var3) : var5;
      }

      return var10000;
   }



   private boolean method_48$aae029aa0a() {
      long var1 = a ^ 82384201082645L;
      long var3 = var1 ^ 92105259359200L;
      long var10002 = -2441819859545418637L;
      long var5 = var3;
      ModeSetting var7 = this.settingType;
      return var7.method_46$5f9dc63072(var5).equals("LabyMod");
   }



    public void method_49$e45a9973e5(long callerKey) {
        long key = recovery$indy$flow$152() ^ callerKey;
        long textureKey = key ^ 50373182628543L;
        long selectionKey = key ^ 18721341772532L;
        long choicesKey = key ^ 67026311971373L;
        java.util.ArrayList names = new java.util.ArrayList();
        recovery$indy$flow$156(((java.lang.Object)(((augustus.recovered.modules.render.CustomCape_47He) (((java.lang.Object)(this)))).field_48)));
        Object guard = recovery$indy$flow$157();
        java.io.File directory = new java.io.File((String) ((java.lang.Object)(((augustus.recovered.modules.render.CustomCape_47He) (((java.lang.Object)(this)))).field_44)));
        java.io.File[] files = (java.io.File[]) recovery$indy$flow$161(directory);
        if (guard != null || files != null) {
            for (int index = 0; index < files.length;) {
                java.io.File file = files[index];
                if (guard != null) break;
                String fileName = (String) recovery$indy$flow$162(file);
                if (!recovery$indy$flow$163(fileName, ".png")) {
                    index++;
                    continue;
                }
                String name = (String) recovery$indy$flow$164(file);
                String[] parts = (String[]) recovery$indy$flow$165(name, "\\.");
                String suffix = new StringBuilder().append(".").append(parts[parts.length - 1]).toString();
                name = (String) recovery$indy$flow$171(name, suffix, "");
                if (key < 0L) continue;
                if (!recovery$indy$flow$172(name, "")) {
                    if (key == 0L || !recovery$indy$flow$173(names, name)) {
                        recovery$indy$flow$174(names, name);
                        try {
                            Object textures = ((java.lang.Object)(((augustus.recovered.modules.render.CustomCape_47He) (((java.lang.Object)(this)))).field_48));
                            Object image = recovery$indy$flow$178(recovery$indy$flow$177(recovery$indy$flow$176(file)));
                            Object checkedImage = ((java.lang.Object)(((java.awt.image.BufferedImage) (((java.lang.Object)(image))))));
                            int texture = recovery$indy$flow$180(textureKey, checkedImage);
                            recovery$indy$flow$182(textures, name, recovery$indy$flow$181(texture));
                        } catch (Throwable failure) {
                            if (!recovery$indy$flow$151(failure)) recovery.flow.BytecodeFrame.rethrow(failure);
                        }
                    }
                }
                index++;
            }
        }
        boolean selectionFound = false;
        String[] choices = (String[]) recovery$indy$flow$184(recovery$indy$flow$183(names));
        for (int index = 0; index < choices.length;) {
            String name = (String) ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(recovery$indy$flow$185(names, index)))))));
            choices[index] = name;
            if (key <= 0L) continue;
            if (guard != null) break;
            Object setting = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(((java.lang.Object)(((augustus.recovered.modules.render.CustomCape_47He) (((java.lang.Object)(this)))).settingLabyModCapes))))))));
            if (recovery$indy$flow$190(recovery$indy$flow$189(setting, selectionKey), name)) selectionFound = true;
            index++;
        }
        if (key < 0L) return;
        if (!selectionFound) {
            Object setting = ((java.lang.Object)(((augustus.recovered.modules.render.CustomCape_47He) (((java.lang.Object)(this)))).settingLabyModCapes));
            String firstChoice = choices[0];
            recovery$indy$flow$194(((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(setting)))))), ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(firstChoice)))))));
        }
        Object setting = ((java.lang.Object)(((augustus.recovered.modules.render.CustomCape_47He) (((java.lang.Object)(this)))).settingLabyModCapes));
        recovery$indy$flow$198(((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(setting)))))), recovery$indy$flow$197(choices), choicesKey);
    }





   private boolean method_45$aae029aa0a() {
      long var1 = a ^ 63823720539377L;
      long var3 = var1 ^ 38643473225732L;
      long var10002 = 6771330436384135063L;
      long var5 = var3;
      ModeSetting var7 = this.settingType;
      return var7.method_46$5f9dc63072(var5).equals("Mojang");
   }



   private void method_43$b0935614ac(ArrayList var1, String var2) {
      this.field_48.remove(var2);
      var1.remove(var2);
   }



   private static boolean method_43$981f35894c(List var0, String var1) {
      long var2 = a ^ 23543354275453L;
      long var10000 = 1115081256110737517L;
      int[] var4 = AntiStrike_47Qa.method_42$d4d28024c9();
      boolean var5 = var0.contains(var1);
      if (var4 == null) {
         var5 = !var5;
      }

      return var5;
   }



   public void method_43_$e45a9973e5(long var1) {
   }



   public void method_43y$e45a9973e5(long var1) {
      int[] var3 = recovery$indy$6(-7737307785807735925L, var1);
      EntityPlayerSP var10000 = recovery$indy$7(field_43, -7738075271649034201L, var1);
      if (var3 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = recovery$indy$8(field_43, -7738075271649034201L, var1);
      }

      C_47Yl var4 = var10000.method_47$3ebfab9d80();
      if (var3 == null) {
         if (var4 == null) {
            return;
         }

         recovery$indy$9(field_43, -7738075271649034201L, var1).method_47$3ebfab9d80().field_47 = false;
         var4 = recovery$indy$10(field_43, -7738075271649034201L, var1).method_47$3ebfab9d80();
      }

      var4.method_41$da8c82d5d4();
   }



   public void method_43x$c973149af1(short var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 29024612273133L;
      int[] var8 = recovery$indy$11(2731884828824855293L, var4);
      EntityPlayerSP var10000 = recovery$indy$12(field_43, 2732208187365306705L, var4);
      if (var8 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = recovery$indy$13(field_43, 2732208187365306705L, var4);
      }

      C_47Yl var9 = var10000.method_47$3ebfab9d80();
      if (var8 == null) {
         if (var9 == null) {
            return;
         }

         recovery$indy$14(field_43, 2732208187365306705L, var4).method_47$3ebfab9d80().field_47 = false;
         var9 = recovery$indy$15(field_43, 2732208187365306705L, var4).method_47$3ebfab9d80();
      }

      var9.method_41$da8c82d5d4();
      recovery$indy$16(this, var6, 2732550773735823274L, var4);
   }



    public CustomCape_47He(long a0) {
        super((java.lang.String) ("CustomCape"),(java.lang.String) ("KundenspezifischeKap"),(long) (((augustus.recovered.modules.render.CustomCape_47He.a ^ a0) ^ 109659777616649L)),(java.awt.Color) (new java.awt.Color((int) (235),(int) (146),(int) (52))),(client.module.Category) (client.module.Category.RENDER));

        java.lang.Object value129;
        long constructorKey5;
        long constructorKey6;
        java.lang.Object regionValue50;
        long constructorKey2;
        java.lang.Object value351;
        java.lang.Object value348;
        java.lang.Object value345;
        java.lang.Object value344;
        java.lang.String value343;
        java.lang.Object value342;
        int value340;
        java.lang.Object value339;
        java.lang.Object value338;
        java.lang.String value337;
        java.lang.Object value336;
        int value334;
        java.lang.Object value333;
        java.lang.Object value332;
        java.lang.String value331;
        java.lang.Object value330;
        int value328;
        java.lang.Object value327;
        java.lang.Object value326;
        java.lang.String value325;
        java.lang.Object value324;
        int value322;
        java.lang.Object value321;
        java.lang.Object value320;
        java.lang.String value319;
        java.lang.Object value318;
        int value316;
        java.lang.Object value315;
        java.lang.Object value314;
        java.lang.String value313;
        java.lang.Object value312;
        int value310;
        java.lang.Object value309;
        java.lang.Object value308;
        java.lang.String value307;
        java.lang.Object value306;
        int value304;
        java.lang.Object value303;
        java.lang.Object value302;
        java.lang.String value301;
        java.lang.Object value300;
        int value298;
        java.lang.Object value297;
        java.lang.Object value296;
        java.lang.String value295;
        java.lang.Object value294;
        int value292;
        java.lang.Object value291;
        java.lang.Object value290;
        java.lang.String value289;
        java.lang.Object value288;
        int value286;
        java.lang.Object value285;
        java.lang.Object value284;
        java.lang.String value283;
        java.lang.Object value282;
        int value280;
        java.lang.Object value279;
        java.lang.Object value278;
        java.lang.String value277;
        java.lang.Object value276;
        int value274;
        java.lang.Object value273;
        java.lang.Object value272;
        java.lang.String value271;
        java.lang.Object value270;
        int value268;
        java.lang.Object value267;
        java.lang.Object value266;
        java.lang.String value265;
        java.lang.Object value264;
        int value262;
        java.lang.Object value261;
        java.lang.Object value260;
        java.lang.String value259;
        java.lang.Object value258;
        int value256;
        java.lang.Object value255;
        java.lang.Object value254;
        java.lang.String value253;
        java.lang.Object value252;
        int value250;
        java.lang.Object value249;
        java.lang.Object value248;
        java.lang.String value247;
        java.lang.Object value246;
        int value244;
        java.lang.Object value243;
        java.lang.Object value242;
        java.lang.String value241;
        java.lang.Object value240;
        int value238;
        java.lang.Object value237;
        java.lang.Object value236;
        java.lang.String value235;
        java.lang.Object value234;
        int value232;
        java.lang.Object value231;
        java.lang.Object value230;
        java.lang.String value229;
        java.lang.Object value228;
        int value226;
        java.lang.Object value225;
        java.lang.Object value224;
        java.lang.String value223;
        java.lang.Object value222;
        int value220;
        java.lang.Object value219;
        java.lang.Object value218;
        java.lang.String value217;
        java.lang.Object value216;
        int value214;
        java.lang.Object value213;
        java.lang.Object value212;
        java.lang.String value211;
        java.lang.Object value210;
        int value208;
        java.lang.Object value207;
        java.lang.Object value206;
        java.lang.String value205;
        java.lang.Object value204;
        int value202;
        java.lang.Object value201;
        java.lang.Object value200;
        java.lang.String value199;
        java.lang.Object value198;
        int value196;
        java.lang.Object value195;
        java.lang.Object value194;
        java.lang.String value193;
        java.lang.Object value192;
        int value190;
        java.lang.Object value189;
        java.lang.Object value188;
        java.lang.String value187;
        java.lang.Object value186;
        int value184;
        java.lang.Object value183;
        java.lang.Object value182;
        java.lang.String value181;
        java.lang.Object value180;
        int value178;
        java.lang.Object value177;
        java.lang.Object value176;
        java.lang.String value175;
        java.lang.Object value174;
        int value172;
        java.lang.Object value171;
        java.lang.Object value170;
        java.lang.String value169;
        java.lang.Object value168;
        int value166;
        java.lang.Object value165;
        java.lang.Object value164;
        java.lang.String value163;
        java.lang.Object value162;
        int value160;
        java.lang.Object value159;
        java.lang.Object value158;
        java.lang.String value157;
        java.lang.Object value156;
        int value154;
        java.lang.Object value153;
        java.lang.Object value152;
        java.lang.String value151;
        java.lang.Object value150;
        int value148;
        java.lang.Object value147;
        java.lang.Object value146;
        java.lang.String value145;
        java.lang.Object value144;
        int value142;
        java.lang.Object value141;
        java.lang.Object value140;
        java.lang.String value139;
        java.lang.Object value138;
        int value136;
        java.lang.Object value135;
        java.lang.Object value134;
        java.lang.String value133;
        java.lang.Object value132;
        int value130;
        int constructorPart4;
        long constructorKey8;
        long constructorKey7;
        long constructorKey3;
        constructorKey2 = (augustus.recovered.modules.render.CustomCape_47He.a ^ a0);
        constructorKey3 = (((augustus.recovered.modules.render.CustomCape_47He.a ^ a0) ^ 65415278329413L) >>> 8);
        constructorPart4 = (int) (((((augustus.recovered.modules.render.CustomCape_47He.a ^ a0) ^ 65415278329413L) << 56) >>> 56));
        constructorKey5 = ((augustus.recovered.modules.render.CustomCape_47He.a ^ a0) ^ 22735126162479L);
        constructorKey6 = ((augustus.recovered.modules.render.CustomCape_47He.a ^ a0) ^ 44015789521860L);
        constructorKey7 = ((augustus.recovered.modules.render.CustomCape_47He.a ^ a0) ^ 54071182437554L);
        constructorKey8 = ((augustus.recovered.modules.render.CustomCape_47He.a ^ a0) ^ 50266847555680L);
        region208: {
        java.lang.Object value128;
        java.lang.Object value127;
        java.lang.Object value126;
        java.lang.Object value125;
        java.lang.Object value124;
        java.lang.Object value123;
        int value120;
        java.lang.Object value118;
        java.lang.StringBuilder initialized117;
        byte converted119;

        region180: {
        int regionValue70;
        java.lang.Object regionValue69;
        java.lang.Object value115;

        region173: {
        java.lang.Object value114;
        java.lang.Object value113;
        java.lang.Object value112;

        region167: {
        region165: {
        java.lang.Object value60;
        boolean value90;
        java.lang.Object value89;
        int regionValue79;

        region162: {
        region160: {
        java.lang.Object value44;
        java.lang.Object value59;
        int comparison61;

        region152: {
        java.lang.Object value18;
        java.lang.Object value41;
        java.lang.Object value40;
        java.lang.Object value39;
        java.lang.Object value38;
        java.lang.Object value36;
        java.lang.Object value35;
        java.lang.Object value34;
        java.lang.Object value31;
        java.lang.Object value29;
        java.lang.Object value28;
        java.lang.Object value27;
        java.lang.Object value26;
        java.lang.Object value23;
        java.lang.Object value21;
        java.lang.Object value17;
        java.util.HashMap initialized43;
        java.util.HashMap initialized42;
        java.lang.StringBuilder initialized37;
        client.setting.ModeSetting initialized30;
        client.setting.ModeSetting initialized22;
        client.setting.ModeSetting initialized19;

        value17 = recovery$indy$flow$240();
        value18 = recovery$indy$flow$242(2);
        ((java.lang.Object[]) value18)[0] = "Mojang";
        ((java.lang.Object[]) value18)[1] = "LabyMod";
        initialized19 = new client.setting.ModeSetting((client.module.Module) (this), "Type", constructorKey6, "LabyMod", (java.lang.String[]) (value18));
        recovery$indy$flow$244(this, initialized19);
        value21 = recovery$indy$flow$246(0);
        initialized22 = new client.setting.ModeSetting((client.module.Module) (this), "LabyModCapes", constructorKey6, "Augustus", (java.lang.String[]) (value21));
        value23 = recovery$indy$flow$248(this);
        value26 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialized22))))));
        value27 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value23))))));
        value28 = recovery$indy$flow$251(value26, value27);
        recovery$indy$flow$252(this, value28);
        value29 = recovery$indy$flow$254(0);
        initialized30 = new client.setting.ModeSetting((client.module.Module) (this), "MojangCapes", constructorKey6, "Migrator", (java.lang.String[]) (value29));
        value31 = recovery$indy$flow$256(this);
        value34 = ((java.lang.Object)(((client.setting.ModeSetting) (((java.lang.Object)(initialized30))))));
        value35 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(value31))))));
        value36 = recovery$indy$flow$259(value34, value35);
        recovery$indy$flow$260(this, value36);
        initialized37 = new java.lang.StringBuilder();
        value38 = recovery$indy$flow$263();
        value39 = recovery$indy$flow$264(initialized37, value38);
        value40 = recovery$indy$flow$265(value39, "/customcapes");
        value41 = recovery$indy$flow$266(value40);
        recovery$indy$flow$267(this, value41);
        initialized42 = new java.util.HashMap();
        recovery$indy$flow$270(this, initialized42);
        initialized43 = new java.util.HashMap();
        recovery$indy$flow$273(this, initialized43);
        value44 = ((java.lang.Object)(((augustus.recovered.modules.render.CustomCape_47He) (((java.lang.Object)(this)))).field_44));
        if (value17 != null) {
            regionValue50 = value44;
            break region208;
        } else {
            break region152;
        }
        }
        value59 = recovery$indy$flow$275(0);
        value60 = recovery$indy$flow$276(value44, value59);
        comparison61 = (constructorKey2 > 0L ? 1 : constructorKey2 == 0L ? 0 : -1);
        if (comparison61 <= 0) {
            regionValue69 = value60;
            regionValue70 = 0;
            break region173;
        } else {
            regionValue79 = 0;
            break region160;
        }
        }
        break region162;
        }
        value89 = recovery$indy$flow$277(regionValue79);
        value90 = recovery$indy$flow$278(value60, value89);
        if ((int) ((value90 ? 1 : 0)) != 0) {
            break region180;
        } else {
            break region165;
        }
        }
        break region167;
        }
        value112 = ((java.lang.Object)(((augustus.recovered.modules.render.CustomCape_47He) (((java.lang.Object)(this)))).field_44));
        value113 = recovery$indy$flow$280(0);
        value114 = recovery$indy$flow$281(value112, value113);
        regionValue69 = value114;
        regionValue70 = 0;
        break region173;
        }
        value115 = recovery$indy$flow$282(regionValue70);
        try {
        java.lang.Object value116;

        value116 = recovery$indy$flow$283(regionValue69, value115);
        } catch (java.io.IOException directoryFailure) {
        recovery$indy$flow$284(directoryFailure);
        break region180;
        }
        break region180;
        }
        initialized117 = new java.lang.StringBuilder();
        value118 = recovery$indy$flow$287();
        converted119 = (byte) (constructorPart4);
        value120 = (int) (converted119);
        value123 = ((java.lang.Object)(((client.Client) (((java.lang.Object)(value118))))));
        value124 = recovery$indy$flow$289(value123, constructorKey3, (byte) (value120));
        value125 = recovery$indy$flow$290(value124);
        value126 = recovery$indy$flow$291(initialized117, value125);
        value127 = recovery$indy$flow$292(value126, "/customcapes");
        value128 = recovery$indy$flow$293(value127);
        regionValue50 = value128;
        break region208;
        }
        value129 = regionValue50;
        value130 = 0;
        value132 = value129;
        value133 = "assets/augustus/cape/Sky.png";
        value134 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value133))))));
        value135 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value132))))));
        recovery$indy$flow$296(value134, value135, constructorKey5, ((value130 & 1) != 0));
        value136 = 0;
        value138 = value129;
        value139 = "assets/augustus/cape/Augustus.png";
        value140 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value139))))));
        value141 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value138))))));
        recovery$indy$flow$299(value140, value141, constructorKey5, ((value136 & 1) != 0));
        value142 = 0;
        value144 = value129;
        value145 = "assets/augustus/cape/AugustusAmethyst.png";
        value146 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value145))))));
        value147 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value144))))));
        recovery$indy$flow$302(value146, value147, constructorKey5, ((value142 & 1) != 0));
        value148 = 0;
        value150 = value129;
        value151 = "assets/augustus/cape/AugustusCandy.png";
        value152 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value151))))));
        value153 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value150))))));
        recovery$indy$flow$305(value152, value153, constructorKey5, ((value148 & 1) != 0));
        value154 = 0;
        value156 = value129;
        value157 = "assets/augustus/cape/AugustusClassic.png";
        value158 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value157))))));
        value159 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value156))))));
        recovery$indy$flow$308(value158, value159, constructorKey5, ((value154 & 1) != 0));
        value160 = 0;
        value162 = value129;
        value163 = "assets/augustus/cape/AugustusMagic.png";
        value164 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value163))))));
        value165 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value162))))));
        recovery$indy$flow$311(value164, value165, constructorKey5, ((value160 & 1) != 0));
        value166 = 0;
        value168 = value129;
        value169 = "assets/augustus/cape/AugustusMagma.png";
        value170 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value169))))));
        value171 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value168))))));
        recovery$indy$flow$314(value170, value171, constructorKey5, ((value166 & 1) != 0));
        value172 = 0;
        value174 = value129;
        value175 = "assets/augustus/cape/AugustusMango.png";
        value176 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value175))))));
        value177 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value174))))));
        recovery$indy$flow$317(value176, value177, constructorKey5, ((value172 & 1) != 0));
        value178 = 0;
        value180 = value129;
        value181 = "assets/augustus/cape/AugustusRose.png";
        value182 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value181))))));
        value183 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value180))))));
        recovery$indy$flow$320(value182, value183, constructorKey5, ((value178 & 1) != 0));
        value184 = 0;
        value186 = value129;
        value187 = "assets/augustus/cape/AugustusTitanium.png";
        value188 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value187))))));
        value189 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value186))))));
        recovery$indy$flow$323(value188, value189, constructorKey5, ((value184 & 1) != 0));
        value190 = 0;
        value192 = value129;
        value193 = "assets/augustus/cape/Ejected.png";
        value194 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value193))))));
        value195 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value192))))));
        recovery$indy$flow$326(value194, value195, constructorKey5, ((value190 & 1) != 0));
        value196 = 0;
        value198 = value129;
        value199 = "assets/augustus/cape/BlurSky.png";
        value200 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value199))))));
        value201 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value198))))));
        recovery$indy$flow$329(value200, value201, constructorKey5, ((value196 & 1) != 0));
        value202 = 0;
        value204 = value129;
        value205 = "assets/augustus/cape/BlurSky2.png";
        value206 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value205))))));
        value207 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value204))))));
        recovery$indy$flow$332(value206, value207, constructorKey5, ((value202 & 1) != 0));
        value208 = 0;
        value210 = value129;
        value211 = "assets/augustus/cape/HorizonSunset by Xolitey.png";
        value212 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value211))))));
        value213 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value210))))));
        recovery$indy$flow$335(value212, value213, constructorKey5, ((value208 & 1) != 0));
        value214 = 0;
        value216 = value129;
        value217 = "assets/augustus/cape/NightCity.png";
        value218 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value217))))));
        value219 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value216))))));
        recovery$indy$flow$338(value218, value219, constructorKey5, ((value214 & 1) != 0));
        value220 = 0;
        value222 = value129;
        value223 = "assets/augustus/cape/Pepe.png";
        value224 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value223))))));
        value225 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value222))))));
        recovery$indy$flow$341(value224, value225, constructorKey5, ((value220 & 1) != 0));
        value226 = 0;
        value228 = value129;
        value229 = "assets/augustus/cape/Pineapples.png";
        value230 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value229))))));
        value231 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value228))))));
        recovery$indy$flow$344(value230, value231, constructorKey5, ((value226 & 1) != 0));
        value232 = 0;
        value234 = value129;
        value235 = "assets/augustus/cape/Rose.png";
        value236 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value235))))));
        value237 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value234))))));
        recovery$indy$flow$347(value236, value237, constructorKey5, ((value232 & 1) != 0));
        value238 = 0;
        value240 = value129;
        value241 = "assets/augustus/cape/Esound.png";
        value242 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value241))))));
        value243 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value240))))));
        recovery$indy$flow$350(value242, value243, constructorKey5, ((value238 & 1) != 0));
        value244 = 0;
        value246 = value129;
        value247 = "assets/augustus/cape/Dog.png";
        value248 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value247))))));
        value249 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value246))))));
        recovery$indy$flow$353(value248, value249, constructorKey5, ((value244 & 1) != 0));
        value250 = 0;
        value252 = value129;
        value253 = "assets/augustus/cape/AugustusLightBlue.png";
        value254 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value253))))));
        value255 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value252))))));
        recovery$indy$flow$356(value254, value255, constructorKey5, ((value250 & 1) != 0));
        value256 = 0;
        value258 = value129;
        value259 = "assets/augustus/cape/GigachadSound.png";
        value260 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value259))))));
        value261 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value258))))));
        recovery$indy$flow$359(value260, value261, constructorKey5, ((value256 & 1) != 0));
        value262 = 0;
        value264 = value129;
        value265 = "assets/augustus/cape/NoobiiHome.png";
        value266 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value265))))));
        value267 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value264))))));
        recovery$indy$flow$362(value266, value267, constructorKey5, ((value262 & 1) != 0));
        value268 = 0;
        value270 = value129;
        value271 = "assets/augustus/cape/GommeHD.png";
        value272 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value271))))));
        value273 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value270))))));
        recovery$indy$flow$365(value272, value273, constructorKey5, ((value268 & 1) != 0));
        value274 = 0;
        value276 = value129;
        value277 = "assets/augustus/cape/Seal.png";
        value278 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value277))))));
        value279 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value276))))));
        recovery$indy$flow$368(value278, value279, constructorKey5, ((value274 & 1) != 0));
        value280 = 0;
        value282 = value129;
        value283 = "assets/augustus/cape/Questionmark.png";
        value284 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value283))))));
        value285 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value282))))));
        recovery$indy$flow$371(value284, value285, constructorKey5, ((value280 & 1) != 0));
        value286 = 0;
        value288 = value129;
        value289 = "assets/augustus/cape/Creeper.png";
        value290 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value289))))));
        value291 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value288))))));
        recovery$indy$flow$374(value290, value291, constructorKey5, ((value286 & 1) != 0));
        value292 = 0;
        value294 = value129;
        value295 = "assets/augustus/cape/Karhu.png";
        value296 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value295))))));
        value297 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value294))))));
        recovery$indy$flow$377(value296, value297, constructorKey5, ((value292 & 1) != 0));
        value298 = 0;
        value300 = value129;
        value301 = "assets/augustus/cape/Moon.png";
        value302 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value301))))));
        value303 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value300))))));
        recovery$indy$flow$380(value302, value303, constructorKey5, ((value298 & 1) != 0));
        value304 = 0;
        value306 = value129;
        value307 = "assets/augustus/cape/Astolfo.png";
        value308 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value307))))));
        value309 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value306))))));
        recovery$indy$flow$383(value308, value309, constructorKey5, ((value304 & 1) != 0));
        value310 = 0;
        value312 = value129;
        value313 = "assets/augustus/cape/Astolfotrap.png";
        value314 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value313))))));
        value315 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value312))))));
        recovery$indy$flow$386(value314, value315, constructorKey5, ((value310 & 1) != 0));
        value316 = 0;
        value318 = value129;
        value319 = "assets/augustus/cape/AstolfoBeta.png";
        value320 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value319))))));
        value321 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value318))))));
        recovery$indy$flow$389(value320, value321, constructorKey5, ((value316 & 1) != 0));
        value322 = 0;
        value324 = value129;
        value325 = "assets/augustus/cape/AstolfoBeta2.png";
        value326 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value325))))));
        value327 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value324))))));
        recovery$indy$flow$392(value326, value327, constructorKey5, ((value322 & 1) != 0));
        value328 = 0;
        value330 = value129;
        value331 = "assets/augustus/cape/E.png";
        value332 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value331))))));
        value333 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value330))))));
        recovery$indy$flow$395(value332, value333, constructorKey5, ((value328 & 1) != 0));
        value334 = 0;
        value336 = value129;
        value337 = "assets/augustus/cape/Grim.png";
        value338 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value337))))));
        value339 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value336))))));
        recovery$indy$flow$398(value338, value339, constructorKey5, ((value334 & 1) != 0));
        value340 = 0;
        value342 = value129;
        value343 = "assets/augustus/cape/Otter.png";
        value344 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value343))))));
        value345 = ((java.lang.Object)(((java.lang.String) (((java.lang.Object)(value342))))));
        recovery$indy$flow$401(value344, value345, constructorKey5, ((value340 & 1) != 0));
        value348 = ((java.lang.Object)(((augustus.recovered.modules.render.CustomCape_47He) (((java.lang.Object)(this))))));
        recovery$indy$flow$403(value348, constructorKey7);
        value351 = ((java.lang.Object)(((augustus.recovered.modules.render.CustomCape_47He) (((java.lang.Object)(this))))));
        recovery$indy$flow$405(value351, constructorKey8);
        return;
    }










    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static long recovery$indy$flow$7() {
        return augustus.recovered.modules.render.CustomCape_47He.a;
    }
    private static native java.lang.Object recovery$indy$flow$8(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$11(java.lang.Object a0,long a1,java.lang.Object a2,long a3,long a4);
    private static void recovery$indy$flow$30(java.lang.Object a0) {
        ((java.lang.Exception) (a0)).printStackTrace();
        return;
    }
    private static native java.lang.Object recovery$indy$flow$116(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$121(java.lang.Object a0,java.lang.Object a1);
    private static boolean recovery$indy$flow$151(java.lang.Object a0) {
        return (a0 instanceof java.io.IOException);
    }
    private static long recovery$indy$flow$152() {
        return augustus.recovered.modules.render.CustomCape_47He.a;
    }

    private static void recovery$indy$flow$156(java.lang.Object a0) {
        ((java.util.HashMap) (a0)).clear();
        return;
    }
    private static native java.lang.Object recovery$indy$flow$157();

    private static java.lang.Object recovery$indy$flow$161(java.lang.Object a0) {
        return ((java.io.File) (a0)).listFiles();
    }
    private static java.lang.Object recovery$indy$flow$162(java.lang.Object a0) {
        return ((java.io.File) (a0)).getName();
    }
    private static boolean recovery$indy$flow$163(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).contains(((java.lang.CharSequence) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$164(java.lang.Object a0) {
        return ((java.io.File) (a0)).getName();
    }
    private static java.lang.Object recovery$indy$flow$165(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).split(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$171(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.lang.String) (a0)).replace(((java.lang.CharSequence) (a1)), ((java.lang.CharSequence) (a2)));
    }
    private static boolean recovery$indy$flow$172(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }
    private static boolean recovery$indy$flow$173(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).contains(a1);
    }
    private static boolean recovery$indy$flow$174(java.lang.Object a0,java.lang.Object a1) {
        return ((java.util.ArrayList) (a0)).add(a1);
    }

    private static java.lang.Object recovery$indy$flow$176(java.lang.Object a0) {
        return ((java.io.File) (a0)).getAbsoluteFile();
    }
    private static native java.lang.Object recovery$indy$flow$177(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$178(java.lang.Object a0);

    private static native int recovery$indy$flow$180(long a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$181(int a0) {
        return java.lang.Integer.valueOf(a0);
    }
    private static java.lang.Object recovery$indy$flow$182(java.lang.Object a0,java.lang.Object a1,java.lang.Object a2) {
        return ((java.util.HashMap) (a0)).put(a1, a2);
    }
    private static int recovery$indy$flow$183(java.lang.Object a0) {
        return ((java.util.ArrayList) (a0)).size();
    }
    private static native java.lang.Object recovery$indy$flow$184(int a0);
    private static java.lang.Object recovery$indy$flow$185(java.lang.Object a0,int a1) {
        return ((java.util.ArrayList) (a0)).get(a1);
    }



    private static native java.lang.Object recovery$indy$flow$189(java.lang.Object a0,long a1);
    private static boolean recovery$indy$flow$190(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.String) (a0)).equals(a1);
    }



    private static native void recovery$indy$flow$194(java.lang.Object a0,java.lang.Object a1);


    private static java.lang.Object recovery$indy$flow$197(java.lang.Object a0) {
        return ((java.lang.String[]) (a0));
    }
    private static native void recovery$indy$flow$198(java.lang.Object a0,java.lang.Object a1,long a2);
    private static boolean recovery$indy$flow$239(java.lang.Object a0) {
        return (a0 instanceof java.io.IOException);
    }
    private static native java.lang.Object recovery$indy$flow$240();
    private static native java.lang.Object recovery$indy$flow$242(int a0);
    private static native void recovery$indy$flow$244(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$246(int a0);
    private static native java.lang.Object recovery$indy$flow$248(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$251(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$252(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$254(int a0);
    private static native java.lang.Object recovery$indy$flow$256(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$259(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$260(java.lang.Object a0,java.lang.Object a1);
    private static java.lang.Object recovery$indy$flow$263() {
        return net.C_47VK.field_42;
    }
    private static java.lang.Object recovery$indy$flow$264(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$265(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$266(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }
    private static native void recovery$indy$flow$267(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$270(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$273(java.lang.Object a0,java.lang.Object a1);

    private static native java.lang.Object recovery$indy$flow$275(int a0);
    private static java.lang.Object recovery$indy$flow$276(java.lang.Object a0,java.lang.Object a1) {
        return java.nio.file.Paths.get(((java.lang.String) (a0)), ((java.lang.String[]) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$277(int a0);
    private static boolean recovery$indy$flow$278(java.lang.Object a0,java.lang.Object a1) {
        return java.nio.file.Files.exists(((java.nio.file.Path) (a0)), ((java.nio.file.LinkOption[]) (a1)));
    }

    private static native java.lang.Object recovery$indy$flow$280(int a0);
    private static java.lang.Object recovery$indy$flow$281(java.lang.Object a0,java.lang.Object a1) {
        return java.nio.file.Paths.get(((java.lang.String) (a0)), ((java.lang.String[]) (a1)));
    }
    private static native java.lang.Object recovery$indy$flow$282(int a0);
    private static native java.lang.Object recovery$indy$flow$283(java.lang.Object a0,java.lang.Object a1) throws java.io.IOException;
    private static void recovery$indy$flow$284(java.lang.Object a0) {
        ((java.io.IOException) (a0)).printStackTrace();
        return;
    }
    private static native java.lang.Object recovery$indy$flow$287();

    private static native java.lang.Object recovery$indy$flow$289(java.lang.Object a0,long a1,byte a2);
    private static java.lang.Object recovery$indy$flow$290(java.lang.Object a0) {
        return ((java.lang.String) (a0)).toLowerCase();
    }
    private static java.lang.Object recovery$indy$flow$291(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$292(java.lang.Object a0,java.lang.Object a1) {
        return ((java.lang.StringBuilder) (a0)).append(((java.lang.String) (a1)));
    }
    private static java.lang.Object recovery$indy$flow$293(java.lang.Object a0) {
        return ((java.lang.StringBuilder) (a0)).toString();
    }


    private static native void recovery$indy$flow$296(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$299(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$302(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$305(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$308(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$311(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$314(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$317(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$320(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$323(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$326(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$329(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$332(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$335(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$338(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$341(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$344(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$347(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$350(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$353(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$356(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$359(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$362(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$365(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$368(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$371(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$374(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$377(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$380(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$383(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$386(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$389(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$392(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$395(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$398(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);


    private static native void recovery$indy$flow$401(java.lang.Object a0,java.lang.Object a1,long a2,boolean a3);

    private static native void recovery$indy$flow$403(java.lang.Object a0,long a1);

    private static native void recovery$indy$flow$405(java.lang.Object a0,long a1);
   private static native MethodHandle recovery$constant$0();
   private static native int[] recovery$indy$5(long var0, long var2);
   private static native int[] recovery$indy$6(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$7(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$8(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$9(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$10(Object var0, long var1, long var3);
   private static native int[] recovery$indy$11(long var0, long var2);
   private static native EntityPlayerSP recovery$indy$12(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$13(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$14(Object var0, long var1, long var3);
   private static native EntityPlayerSP recovery$indy$15(Object var0, long var1, long var3);
   private static native void recovery$indy$16(Object var0, long var1, long var3, long var5);
   private static native MethodHandle recovery$constant$19();
}
