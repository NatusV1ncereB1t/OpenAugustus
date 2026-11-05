package augustus.recovered.modules.misc;


/** Business bytecode recovered as explicit Java control-flow states; source is editable. */
public class RotationRecorder_47kw extends client.module.Module implements net.C_47xz,net.C_47UH,net.C_476x,net.C_47iC {
    private final client.setting.BooleanSetting settingCreateNewDatasetIfTargetIsNull = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingFrameRecording = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRecordPredictions = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingRecordAura = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingKillAuraTarget = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingSearchReach = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.BooleanSetting settingOnlyOnClick = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingYawFov = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.NumberSetting settingPitchFov = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final client.setting.MultiSelectSetting settingTargets = null; // Runtime access flags and ConstantValue are restored from the original class.
    private final net.C_47cu field_46 = null; // Runtime access flags and ConstantValue are restored from the original class.
    private java.io.DataOutputStream field_45G; // Runtime access flags and ConstantValue are restored from the original class.
    private int field_43y; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_47XZ field_45c; // Runtime access flags and ConstantValue are restored from the original class.
    private net.C_477r field_45l; // Runtime access flags and ConstantValue are restored from the original class.
    private java.util.HashSet field_45; // Runtime access flags and ConstantValue are restored from the original class.
    private com.google.gson.JsonArray field_47; // Runtime access flags and ConstantValue are restored from the original class.
    private com.google.gson.Gson field_455; // Runtime access flags and ConstantValue are restored from the original class.
    private boolean field_43a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String field_48; // Runtime access flags and ConstantValue are restored from the original class.
    private static long a; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] b; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] c; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.util.Map d; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.Object[] e; // Runtime access flags and ConstantValue are restored from the original class.
    private static java.lang.String[] f; // Runtime access flags and ConstantValue are restored from the original class.

    private static native java.lang.String b(byte[] a0);

    private static native java.lang.reflect.Method b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Class b(long a0,long a1);

    private static native java.lang.reflect.Field b(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);

    private static native java.lang.Object b(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.Object[] a3);

    private static native java.lang.String b(int a0,long a1);

    private void method_46$e45a9973e5(long eventKey) {
        long decodedKey = a ^ eventKey;
        long encodingKey = decodedKey ^ 105054237693555L;
        try {
            java.io.DataOutputStream stream = this.field_45G;
            byte[] json = this.field_47.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8);
            byte[] encoded = (byte[]) recovery$indy$flow$7(json, encodingKey, -7963608649995338048L, decodedKey);
            stream.write(encoded);
            this.field_45G.flush();
            this.field_47 = null;
        } catch (java.io.IOException error) {
            throw new RuntimeException(error);
        }
    }



    public static void method_46$a7421bf54c(String recordingName) {
        field_48 = recordingName;
    }



    private static native java.lang.reflect.Field a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2);

    private static native int a(long a0,long a1);

    private static native void a();

    private static native java.lang.reflect.Method a(java.lang.Class a0,java.lang.String a1,java.lang.Class a2,int a3,java.lang.Class[] a4);

    private static native java.lang.Object a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,java.lang.Object[] a4);

    private static native java.lang.invoke.MethodHandle a(java.lang.invoke.MethodHandles.Lookup a0,java.lang.invoke.MutableCallSite a1,java.lang.String a2,java.lang.invoke.MethodType a3,long a4,long a5);

    private static native java.lang.reflect.Method d(long a0,long a1);

    public void method_41$fae8de1664(net.C_475c event) {
        int[] flowGuard = ClientSettings_47kr.method_46$d4d28024c9();
        Object minecraft = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$17()))))));
        Object options = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(minecraft)))).field_44r));
        Object binding = ((java.lang.Object)(((net.C_47oo) (((java.lang.Object)(options)))).field_44l));
        boolean inputActive = recovery$indy$flow$21(binding);
        if (flowGuard == null && !inputActive) {
            minecraft = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$22()))))));
            options = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(minecraft)))).field_44r));
            binding = ((java.lang.Object)(((net.C_47oo) (((java.lang.Object)(options)))).field_44l));
            inputActive = recovery$indy$flow$26(binding) > 0;
        }
        if (inputActive) {
            recovery$indy$flow$29(((java.lang.Object)(((net.C_47cu) (((java.lang.Object)(this.field_46)))))));
        }
    }



    private net.minecraft.entity.EntityLivingBase method_41$f2b0beb8fc(long eventKey) {
        long decodedKey = a ^ eventKey;
        long timerKey = decodedKey ^ 7551056606386L;
        Object flowGuard = recovery$indy$flow$31(8308984624005358194L, decodedKey);
        boolean inputAllowed = recovery$indy$flow$33(recovery$indy$flow$32(), 8310529588377370645L, decodedKey);
        if (flowGuard != null) {
            if (inputAllowed) {
                return null;
            }
        } else {
            if (!inputAllowed) {
                return null;
            }
            boolean elapsed = recovery$indy$flow$35(this.field_46, 1000L, timerKey, 8307933189157377375L, decodedKey);
            if (elapsed && recovery$indy$flow$37(this.settingOnlyOnClick, 8308794057650627767L, decodedKey)) {
                return null;
            }
        }
        Object world = recovery$indy$flow$39(recovery$indy$flow$38(), 8310769779965945767L, decodedKey);
        java.util.List entities = (java.util.List) ((java.lang.Object)(((net.minecraft.client.multiplayer.WorldClient) (((java.lang.Object)(world)))).field_44Q));
        java.util.stream.Stream candidates = entities.stream();
        candidates = candidates.filter((java.util.function.Predicate) recovery$indy$flow$42(this));
        java.util.Comparator comparator = java.util.Comparator.comparingDouble(
            (java.util.function.ToDoubleFunction) recovery$indy$flow$44(this));
        Object[] matches = candidates.sorted(comparator).toArray();
        if (flowGuard != null) {
            return (net.minecraft.entity.EntityLivingBase) (Object) matches;
        }
        return matches.length == 0 ? null : (net.minecraft.entity.EntityLivingBase) matches[0];
    }



    private static byte[] method_40$25ffea182c(byte[] input, long eventKey) {
        long decodedKey = a ^ eventKey;
        java.util.zip.Deflater compressor = new java.util.zip.Deflater(9, true);
        Object flowGuard = recovery$indy$flow$52(-2508736456205333486L, decodedKey);
        compressor.setInput(input);
        compressor.finish();
        java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        while (!compressor.finished()) {
            int count = compressor.deflate(buffer);
            if (decodedKey >= 0L) {
                if (flowGuard != null) {
                    return output.toByteArray();
                }
                output.write(buffer, 0, count);
            }
            if (flowGuard != null) {
                break;
            }
        }
        return output.toByteArray();
    }



    private void method_48$b757cde368(long eventKey, boolean frameRecording) {
        long decodedKey = a ^ eventKey;
        long startKey = decodedKey ^ 106196616992400L;
        long predictionKey = decodedKey ^ 34582774896511L;
        long closeKey = decodedKey ^ 18256358940199L;
        long frameKey = decodedKey ^ 55834567447086L;
        long targetKey = decodedKey ^ 56059189788526L;
        Object flowGuard = recovery$indy$flow$62(-3024365292127910086L, decodedKey);
        Object target;
        if (flowGuard == null && recovery$indy$flow$64(this.settingKillAuraTarget, -3024450170615774721L, decodedKey)) {
            target = ((java.lang.Object)(((augustus.recovered.modules.combat.KillAura_47CY) (((java.lang.Object)(((java.lang.Object)(((client.module.ModuleManager) (((java.lang.Object)(recovery$indy$flow$65())))).field_48Q)))))).field_45z));
        } else {
            target = recovery$indy$flow$68(this, targetKey, -3018052906216758253L, decodedKey);
        }
        if (target == null) {
            if (flowGuard == null) {
                if (decodedKey > 0L && !recovery$indy$flow$70(this.settingCreateNewDatasetIfTargetIsNull, -3024450170615774721L, decodedKey)) {
                    return;
                }
                if (this.field_45G == null) {
                    return;
                }
            }
            recovery$indy$flow$72(this, closeKey, -3026358294541156062L, decodedKey);
            return;
        }
        if (flowGuard != null || this.field_45G == null) {
            recovery$indy$flow$74(this, startKey, -3026293754299721946L, decodedKey);
        }
        if (frameRecording) {
            if (decodedKey <= 0L) {
                recovery$indy$flow$76(this, target, frameKey, -3017705885976211185L, decodedKey);
                return;
            }
            recovery$indy$flow$75(this, target, frameKey, -3017705885976211185L, decodedKey);
            if (flowGuard == null) {
                return;
            }
        }
        recovery$indy$flow$76(this, target, predictionKey, -3017618280600488053L, decodedKey);
    }




    private boolean method_48$aae029aa0a() {
        int[] flowGuard = ClientSettings_47kr.method_46$d4d28024c9();
        boolean enabled = this.settingKillAuraTarget.method_49$aae029aa0a();
        return flowGuard != null ? enabled : !enabled;
    }



    public void method_48$c945181dab(long eventKey, net.C_47VU event) {
    }



    public static byte[] method_48$f628723d9f(long eventKey, byte[] input) {
        long decodedKey = a ^ eventKey;
        Object flowGuard = recovery$indy$flow$84(3316374740292927291L, decodedKey);
        try {
            java.util.zip.Inflater decompressor = new java.util.zip.Inflater(true);
            decompressor.setInput(input);
            java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            while (!decompressor.finished()) {
                int count = decompressor.inflate(buffer);
                if (decodedKey < 0L) {
                    return output.toByteArray();
                }
                output.write(buffer, 0, count);
                if (flowGuard != null) {
                    return output.toByteArray();
                }
            }
            if (decodedKey < 0L) {
                decompressor.inflate(buffer);
                return output.toByteArray();
            }
            decompressor.end();
            return output.toByteArray();
        } catch (java.util.zip.DataFormatException error) {
            return null;
        }
    }



    private double method_49$83ff7736af(net.minecraft.entity.Entity entity) {
        long decodedKey = a ^ 65671397837372L;
        long rotationKey = decodedKey ^ 138032359428817L;
        int[] flowGuard = ClientSettings_47kr.method_46$d4d28024c9();
        if (flowGuard == null && !recovery$indy$flow$97(entity)) {
            return Double.longBitsToDouble(4652007308841189376L);
        }
        double x = recovery$indy$flow$98(entity);
        double eyeY = recovery$indy$flow$99(entity) + (double) recovery$indy$flow$100(entity);
        double z = recovery$indy$flow$101(entity);
        Object client = ((java.lang.Object)(((client.Client) (((java.lang.Object)(recovery$indy$flow$102()))))));
        float yaw = recovery$indy$flow$105(recovery$indy$flow$104(client));
        client = ((java.lang.Object)(((client.Client) (((java.lang.Object)(recovery$indy$flow$106()))))));
        float pitch = recovery$indy$flow$109(recovery$indy$flow$108(client));
        float[] difference = (float[]) recovery$indy$flow$110(x, eyeY, rotationKey, z, yaw, pitch);
        return Math.sqrt((double) (difference[0] * difference[0] + difference[1] * difference[1]));
    }



    private void method_49$e45a9973e5(long eventKey) {
        long decodedKey = a ^ eventKey;
        long directoryKey = decodedKey ^ 126442803991207L;
        this.field_47 = new com.google.gson.JsonArray();
        this.field_43a = false;
        String directory = new StringBuilder()
            .append((String) recovery$indy$flow$120())
            .append(java.io.File.separator)
            .append((String) recovery$indy$flow$124(27426, 3900726202617140682L ^ decodedKey))
            .toString();
        recovery$indy$flow$127(directory, directoryKey, 6533351672402743365L, decodedKey);
        try {
            java.io.File file = new java.io.File(new StringBuilder()
                .append(directory)
                .append(java.io.File.separator)
                .append((String) recovery$indy$flow$134(5556, 6424962319285480267L ^ decodedKey))
                .append(System.currentTimeMillis())
                .toString());
            file.createNewFile();
            this.field_45G = new java.io.DataOutputStream(
                java.nio.file.Files.newOutputStream(file.toPath(), new java.nio.file.OpenOption[0]));
        } catch (java.io.IOException error) {
            throw new RuntimeException(error);
        }
    }



    private boolean method_49$7c2c45e4ce(net.minecraft.entity.Entity entity) {
        long decodedKey = a ^ 111144867750174L;
        long rangeKey = decodedKey ^ 76466540148546L;
        long packedRotationKey = decodedKey ^ 108756963173374L;
        short rotationKeyHigh = (short) (packedRotationKey >>> 48);
        int rotationKeyMiddle = (int) (packedRotationKey << 16 >>> 32);
        int rotationKeyLow = (int) (packedRotationKey << 48 >>> 48);
        long targetFilterKey = decodedKey ^ 139490148821029L;
        int[] flowGuard = ClientSettings_47kr.method_46$d4d28024c9();
        boolean living = entity instanceof net.minecraft.entity.EntityLivingBase;
        if (flowGuard != null || !living) {
            return living;
        }
        boolean players = recovery$indy$flow$154(((java.lang.Object)(((net.C_47nt) (((java.lang.Object)(recovery$indy$flow$152())))))));
        boolean mobs = recovery$indy$flow$157(((java.lang.Object)(((net.C_47nt) (((java.lang.Object)(recovery$indy$flow$155())))))));
        boolean animals = recovery$indy$flow$160(((java.lang.Object)(((net.C_47nt) (((java.lang.Object)(recovery$indy$flow$158())))))));
        boolean villagers = recovery$indy$flow$163(((java.lang.Object)(((net.C_47nt) (((java.lang.Object)(recovery$indy$flow$161())))))));
        boolean armorStands = recovery$indy$flow$166(((java.lang.Object)(((net.C_47nt) (((java.lang.Object)(recovery$indy$flow$164())))))));
        boolean invisible = recovery$indy$flow$169(((java.lang.Object)(((net.C_47nt) (((java.lang.Object)(recovery$indy$flow$167())))))));
        boolean dead = recovery$indy$flow$172(((java.lang.Object)(((net.C_47nt) (((java.lang.Object)(recovery$indy$flow$170())))))));
        if (!recovery$indy$flow$173(entity, players, mobs, animals, villagers, armorStands, invisible,
                true, true, targetFilterKey, true, dead, true, 4262702211803300768L, decodedKey)) {
            return false;
        }
        Object client = ((java.lang.Object)(((client.Client) (((java.lang.Object)(recovery$indy$flow$174()))))));
        float yaw = recovery$indy$flow$177(recovery$indy$flow$176(client));
        client = ((java.lang.Object)(((client.Client) (((java.lang.Object)(recovery$indy$flow$178()))))));
        float pitch = recovery$indy$flow$181(recovery$indy$flow$180(client));
        float[] difference = (float[]) recovery$indy$flow$183(entity, yaw, rotationKeyHigh, rotationKeyMiddle, pitch, rotationKeyLow);
        if (recovery$indy$flow$184(entity)) {
            return false;
        }
        Object minecraft = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(recovery$indy$flow$185()))))));
        Object player = ((java.lang.Object)(((net.minecraft.client.Minecraft) (((java.lang.Object)(minecraft)))).field_42P));
        double distance = (double) recovery$indy$flow$188(player, entity);
        return distance < this.settingSearchReach.method_44$474dfaa627(rangeKey)
            && (double) Math.abs(difference[0]) <= this.settingYawFov.method_44$474dfaa627(rangeKey)
            && (double) Math.abs(difference[1]) <= this.settingPitchFov.method_44$474dfaa627(rangeKey);
    }





    public static String method_45$0e30dfc966() {
        return field_48;
    }



    private void method_45$e45a9973e5(long eventKey) {
        long decodedKey = a ^ eventKey;
        long saveKey = decodedKey ^ 37310608595290L;
        Object flowGuard = recovery$indy$flow$202(-7924555127710006469L, decodedKey);
        if (flowGuard == null) {
            if (this.field_45G == null) {
                return;
            }
            recovery$indy$flow$204(this, saveKey, -7924391458596152311L, decodedKey);
            recovery$indy$flow$205(this, -7925865588221838437L, decodedKey);
            this.field_45G = null;
        }
        this.field_45.clear();
    }



    private void method_45$b0301f85f0(net.minecraft.entity.EntityLivingBase target, long eventKey) {
        long decodedKey = a ^ eventKey;
        long boxKey = decodedKey ^ 88876377522388L;
        com.google.gson.JsonObject sample = new com.google.gson.JsonObject();
        sample.addProperty((String) recovery$indy$flow$212(30633, 1021921320410187941L ^ decodedKey),
            Integer.valueOf(recovery$indy$flow$215(recovery$indy$flow$214(recovery$indy$flow$213(), -2646144126989283534L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$218(25732, 3329341137636826005L ^ decodedKey),
            Float.valueOf(recovery$indy$flow$221(recovery$indy$flow$220(recovery$indy$flow$219(), -2646144126989283534L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$224(17338, 8815133722434682032L ^ decodedKey),
            Float.valueOf(recovery$indy$flow$227(recovery$indy$flow$226(recovery$indy$flow$225(), -2646144126989283534L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$230(2310, 5590445186002744847L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$233(recovery$indy$flow$232(recovery$indy$flow$231(), -2646144126989283534L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$236(5758, 7626509888798091626L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$239(recovery$indy$flow$238(recovery$indy$flow$237(), -2646144126989283534L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$242(17311, 6620200471963909278L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$245(recovery$indy$flow$244(recovery$indy$flow$243(), -2646144126989283534L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$248(27502, 6029468067785937985L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$249(target)));
        sample.addProperty((String) recovery$indy$flow$252(11335, 8042733816662479727L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$253(target)));
        sample.addProperty((String) recovery$indy$flow$256(1910, 7709013822638651493L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$257(target)));
        sample.addProperty((String) recovery$indy$flow$260(29930, 4585763785616034813L ^ decodedKey),
            Boolean.valueOf(this.field_43a));
        sample.addProperty((String) recovery$indy$flow$264(6996, 2021320212327785549L ^ decodedKey),
            Float.valueOf(recovery$indy$flow$267(recovery$indy$flow$266(recovery$indy$flow$265(), -2646144126989283534L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$270(30450, 3413626811728169468L ^ decodedKey),
            Float.valueOf(recovery$indy$flow$273(recovery$indy$flow$272(recovery$indy$flow$271(), -2646144126989283534L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$276(5800, 3697980930847533475L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$279(recovery$indy$flow$278(recovery$indy$flow$277(), -2646144126989283534L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$282(10187, 4518892908929046734L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$285(recovery$indy$flow$284(recovery$indy$flow$283(), -2646144126989283534L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$288(20848, 5431065908906831474L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$291(recovery$indy$flow$290(recovery$indy$flow$289(), -2646144126989283534L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$294(24774, 19925834656653291L ^ decodedKey),
            Boolean.valueOf(recovery$indy$flow$297(recovery$indy$flow$296(recovery$indy$flow$295(), -2646144126989283534L, decodedKey))));
        sample.add((String) recovery$indy$flow$300(14773, 3331388524059641523L ^ decodedKey),
            this.field_455.toJsonTree(recovery$indy$flow$303(((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(target)))).field_47f)), boxKey, 0, -2641274565861210937L, decodedKey)));
        sample.add((String) recovery$indy$flow$306(18867, 4937951517964580526L ^ decodedKey),
            this.field_455.toJsonTree(((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(recovery$indy$flow$309(recovery$indy$flow$308(), -2646144126989283534L, decodedKey))))).field_49w))));
        sample.add((String) recovery$indy$flow$313(29208, 5338294981179084094L ^ decodedKey),
            this.field_455.toJsonTree(recovery$indy$flow$318(((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP) (((java.lang.Object)(recovery$indy$flow$316(recovery$indy$flow$315(), -2646144126989283534L, decodedKey))))).field_41)), boxKey, 0, -2641274565861210937L, decodedKey)));
        sample.add((String) recovery$indy$flow$321(15814, 3403645963991597795L ^ decodedKey),
            this.field_455.toJsonTree(recovery$indy$flow$324(((java.lang.Object)(((net.minecraft.entity.EntityLivingBase) (((java.lang.Object)(target)))).field_48B)), boxKey, 0, -2641274565861210937L, decodedKey)));
        this.field_47.add(sample);
        this.field_43a = false;
    }





    private boolean method_45$aae029aa0a() {
        int[] flowGuard = ClientSettings_47kr.method_46$d4d28024c9();
        boolean enabled = this.settingKillAuraTarget.method_49$aae029aa0a();
        return flowGuard != null ? enabled : !enabled;
    }



    private void method_47$b0301f85f0(net.minecraft.entity.EntityLivingBase target, long eventKey) {
        long decodedKey = a ^ eventKey;
        com.google.gson.JsonObject sample = new com.google.gson.JsonObject();
        sample.addProperty((String) recovery$indy$flow$338(26561, 7774308117916179856L ^ decodedKey),
            Integer.valueOf(recovery$indy$flow$341(recovery$indy$flow$340(recovery$indy$flow$339(), -7055402994059376029L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$344(6054, 6601012311441780216L ^ decodedKey),
            Float.valueOf(recovery$indy$flow$347(recovery$indy$flow$346(recovery$indy$flow$345(), -7055402994059376029L, decodedKey))));
        sample.addProperty((String) recovery$indy$flow$350(20610, 6078430040401865435L ^ decodedKey),
            Float.valueOf(recovery$indy$flow$353(recovery$indy$flow$352(recovery$indy$flow$351(), -7055402994059376029L, decodedKey))));
        Object player = recovery$indy$flow$357(recovery$indy$flow$356(), -7055402994059376029L, decodedKey);
        Object timer = recovery$indy$flow$359(recovery$indy$flow$358(), -7058943186431183057L, decodedKey);
        Object playerLook = recovery$indy$flow$361(player, recovery$indy$flow$360(timer));
        sample.addProperty((String) recovery$indy$flow$362(24542, 6920129711007098269L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$363(playerLook)));
        sample.addProperty((String) recovery$indy$flow$366(18937, 5811395473193137061L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$367(playerLook)));
        sample.addProperty((String) recovery$indy$flow$370(15882, 2315262667591713880L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$371(playerLook)));
        timer = recovery$indy$flow$375(recovery$indy$flow$374(), -7058943186431183057L, decodedKey);
        Object targetLook = recovery$indy$flow$377(target, recovery$indy$flow$376(timer));
        sample.addProperty((String) recovery$indy$flow$378(29906, 3942025721631395481L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$379(targetLook)));
        sample.addProperty((String) recovery$indy$flow$382(3454, 7207078244402214657L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$383(targetLook)));
        sample.addProperty((String) recovery$indy$flow$386(13825, 8570106185898003532L ^ decodedKey),
            Double.valueOf(recovery$indy$flow$387(targetLook)));
        this.field_47.add(sample);
    }




    public void method_47$9035875d26(long eventKey, net.C_47ob event) {
        Object flowGuard = recovery$indy$flow$392(2668471739590636597L, eventKey);
        Object packet = recovery$indy$flow$393(event, 2668551183097696080L, eventKey);
        boolean statusPacket = recovery$indy$flow$394(packet);
        if (flowGuard == null && statusPacket) {
            Object status = ((java.lang.Object)(((net.C_46s) (((java.lang.Object)(recovery$indy$flow$395(event, 2668551183097696080L, eventKey)))))));
            int packetEntityId = recovery$indy$flow$397(status);
            Object player = recovery$indy$flow$399(recovery$indy$flow$398(), 2670931407327965540L, eventKey);
            if (packetEntityId == recovery$indy$flow$400(player)) {
                this.field_43a = true;
            }
            return;
        }
        if (flowGuard == null) {
            packet = recovery$indy$flow$402(event, 2668551183097696080L, eventKey);
            if (!recovery$indy$flow$403(packet)) {
                return;
            }
        } else if (!statusPacket) {
            return;
        }
        Object rotation = ((java.lang.Object)(((net.C_42L) (((java.lang.Object)(recovery$indy$flow$404(event, 2668551183097696080L, eventKey)))))));
        float yawChange = Math.abs(recovery$indy$flow$406(rotation));
        if (!(yawChange > 0.0F)) {
            return;
        }
        if (flowGuard == null && !(Math.abs(recovery$indy$flow$408(rotation)) > 0.0F)) {
            return;
        }
        this.field_43a = true;
    }



    private void method_47$da8c82d5d4() {
        try {
            this.field_45G.close();
        } catch (java.io.IOException error) {
            throw new RuntimeException(error);
        }
    }



    private boolean method_470$aae029aa0a() {
        int[] flowGuard = ClientSettings_47kr.method_46$d4d28024c9();
        boolean enabled = this.settingKillAuraTarget.method_49$aae029aa0a();
        return flowGuard != null ? enabled : !enabled;
    }



    private boolean method_47k$aae029aa0a() {
        int[] flowGuard = ClientSettings_47kr.method_46$d4d28024c9();
        boolean enabled = this.settingKillAuraTarget.method_49$aae029aa0a();
        return flowGuard != null ? enabled : !enabled;
    }



    private boolean method_474$aae029aa0a() {
        int[] flowGuard = ClientSettings_47kr.method_46$d4d28024c9();
        boolean enabled = this.settingKillAuraTarget.method_49$aae029aa0a();
        return flowGuard != null ? enabled : !enabled;
    }



    private boolean method_47A$aae029aa0a() {
        int[] flowGuard = ClientSettings_47kr.method_46$d4d28024c9();
        boolean enabled = this.settingFrameRecording.method_49$aae029aa0a();
        return flowGuard != null ? enabled : !enabled;
    }



    private boolean method_47E$aae029aa0a() {
        int[] flowGuard = ClientSettings_47kr.method_46$d4d28024c9();
        boolean enabled = this.settingFrameRecording.method_49$aae029aa0a();
        return flowGuard != null ? enabled : !enabled;
    }



    public void method_43_$e45a9973e5(long eventKey) {
        long registrationKey = eventKey ^ 49072313886417L;
        recovery$indy$flow$441(this, 40, registrationKey, -7102904354719449833L, eventKey);
        recovery$indy$flow$442(this, 7, registrationKey, -7102904354719449833L, eventKey);
        recovery$indy$flow$443(this, 19, registrationKey, -7102904354719449833L, eventKey);
        recovery$indy$flow$444(this, 26, registrationKey, -7102904354719449833L, eventKey);
    }



    public void method_48o$537c8d9634(int keyHigh, short keyMiddle, char keyLow) {
        long eventKey = ((long) keyHigh << 32) | ((long) keyMiddle << 48 >>> 32) | ((long) keyLow << 48 >>> 48);
        long recordingKey = eventKey ^ 119677798945390L;
        Object flowGuard = recovery$indy$flow$445(2184016412096581490L, eventKey);
        if (flowGuard == null && recovery$indy$flow$447(this.settingFrameRecording, 2183852230795463095L, eventKey)) {
            return;
        }
        boolean frameRecording = recovery$indy$flow$449(this.settingFrameRecording, 2183852230795463095L, eventKey);
        recovery$indy$flow$450(this, recordingKey, frameRecording, 2186464484659165625L, eventKey);
    }



    public void method_43F$e45a9973e5(long eventKey) {
        recovery$indy$flow$451(2170012477920573017L, eventKey).getClass();
        Object client = recovery$indy$flow$453(2170012477920573017L, eventKey);
        Object recorder = recovery$indy$flow$454(client, 2170437994793820960L, eventKey);
        java.util.concurrent.CopyOnWriteArrayList listeners =
            (java.util.concurrent.CopyOnWriteArrayList) recovery$indy$flow$455(recorder, 2170093914723422338L, eventKey);
        listeners.remove(this);
        client = recovery$indy$flow$457(2170012477920573017L, eventKey);
        recorder = recovery$indy$flow$458(client, 2170437994793820960L, eventKey);
        listeners = (java.util.concurrent.CopyOnWriteArrayList) recovery$indy$flow$459(recorder, 2170153318473790636L, eventKey);
        listeners.remove(this);
    }



    public void method_43y$e45a9973e5(long eventKey) {
        long saveKey = eventKey ^ 67277095001265L;
        recovery$indy$flow$461(this, saveKey, -7739969769003940940L, eventKey);
        Object minecraft = recovery$indy$flow$462();
        Object options = recovery$indy$flow$463(minecraft, -7740513524943164099L, eventKey);
        recovery$indy$flow$465(options, this.field_43y);
    }



    public void method_49l$e45a9973e5(long eventKey) {
        long recordingKey = eventKey ^ 96010144553215L;
        Object flowGuard = recovery$indy$flow$466(1503662210392376803L, eventKey);
        if (flowGuard == null && !recovery$indy$flow$468(this.settingFrameRecording, 1504098381234701094L, eventKey)) {
            return;
        }
        boolean frameRecording = recovery$indy$flow$470(this.settingFrameRecording, 1504098381234701094L, eventKey);
        recovery$indy$flow$471(this, recordingKey, frameRecording, 1497123997507384104L, eventKey);
    }



    public void method_43x$c973149af1(short keyHigh, int keyMiddle, char keyLow) {
        long eventKey = ((long) keyHigh << 48) | ((long) keyMiddle << 32 >>> 16) | ((long) keyLow << 48 >>> 48);
        long saveKey = eventKey ^ 44423571041735L;
        recovery$indy$flow$472(this, saveKey, 2729198793805312706L, eventKey);
        Object options = recovery$indy$flow$474(recovery$indy$flow$473(), 2729813192981437515L, eventKey);
        this.field_43y = recovery$indy$flow$475(options);
        options = recovery$indy$flow$478(recovery$indy$flow$477(), 2729813192981437515L, eventKey);
        recovery$indy$flow$479(options, 60);
    }



    public RotationRecorder_47kw(long a0) {
        super((java.lang.String) ("RotationRecorder"),(java.lang.String) ("DrehungsAufzeichner"),(long) (((augustus.recovered.modules.misc.RotationRecorder_47kw.a ^ a0) ^ 135162265158808L)),(java.awt.Color) (new java.awt.Color((int) (252),(int) (186),(int) (3))),(client.module.Category) (client.module.Category.MISC));
        long constructorKey1 = a0;
        long constructorKey2 = (augustus.recovered.modules.misc.RotationRecorder_47kw.a ^ a0);
        long constructorKey3 = ((augustus.recovered.modules.misc.RotationRecorder_47kw.a ^ a0) ^ 82532956555630L);
        int constructorPart4 = (int) ((((augustus.recovered.modules.misc.RotationRecorder_47kw.a ^ a0) ^ 93628349748935L) >>> 32));
        int constructorPart5 = (int) (((((augustus.recovered.modules.misc.RotationRecorder_47kw.a ^ a0) ^ 93628349748935L) << 32) >>> 40));
        int constructorPart6 = (int) (((((augustus.recovered.modules.misc.RotationRecorder_47kw.a ^ a0) ^ 93628349748935L) << 56) >>> 56));
        long constructorKey7 = ((augustus.recovered.modules.misc.RotationRecorder_47kw.a ^ a0) ^ 2306224459198L);
        long constructorKey8 = ((augustus.recovered.modules.misc.RotationRecorder_47kw.a ^ a0) ^ 12959684991107L);
        long constructorKey9 = ((augustus.recovered.modules.misc.RotationRecorder_47kw.a ^ a0) ^ 42405725710084L);
        client.setting.BooleanSetting initialized10 = new client.setting.BooleanSetting(this, constructorKey8, "Create new dataset if target is null", true);
        recovery$indy$flow$482(this, initialized10);
        client.setting.BooleanSetting initialized11 = new client.setting.BooleanSetting(this, constructorKey8, "FrameRecording", true);
        recovery$indy$flow$485(this, initialized11);
        client.setting.BooleanSetting initialized12 = new client.setting.BooleanSetting(this, constructorKey8, "Record Predictions", false);
        java.lang.Object initialValue13 = recovery$indy$flow$488(this);
        java.lang.Object initialValue14 = initialValue13;
        long initialValue15 = constructorKey7;
        client.setting.BooleanSetting initialValue16 = initialized12;
        java.lang.Object initialValue17 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue16))))));
        java.lang.Object initialValue18 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue14))))));
        java.lang.Object initialValue19 = recovery$indy$flow$491(initialValue17, initialValue15, initialValue18);
        java.lang.Object initialValue20 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue19))))));
        recovery$indy$flow$493(this, initialValue20);
        client.setting.BooleanSetting initialized21 = new client.setting.BooleanSetting(this, constructorKey8, "Record Aura", false);
        java.lang.Object initialValue22 = recovery$indy$flow$496(this);
        java.lang.Object initialValue23 = initialValue22;
        long initialValue24 = constructorKey7;
        client.setting.BooleanSetting initialValue25 = initialized21;
        java.lang.Object initialValue26 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue25))))));
        java.lang.Object initialValue27 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue23))))));
        java.lang.Object initialValue28 = recovery$indy$flow$499(initialValue26, initialValue24, initialValue27);
        java.lang.Object initialValue29 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue28))))));
        recovery$indy$flow$501(this, initialValue29);
        client.setting.BooleanSetting initialized30 = new client.setting.BooleanSetting(this, constructorKey8, "KillAuraTarget", true);
        recovery$indy$flow$504(this, initialized30);
        client.setting.NumberSetting initialized31 = new client.setting.NumberSetting(this, "SearchReach", Double.longBitsToDouble(4619567317775286272L), constructorKey9, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble(4621819117588971520L), 1);
        java.lang.Object initialValue32 = recovery$indy$flow$507(this);
        java.lang.Object initialValue33 = initialValue32;
        client.setting.NumberSetting initialValue34 = initialized31;
        java.lang.Object initialValue35 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue34))))));
        java.lang.Object initialValue36 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue33))))));
        java.lang.Object initialValue37 = recovery$indy$flow$510(initialValue35, initialValue36);
        recovery$indy$flow$511(this, initialValue37);
        client.setting.BooleanSetting initialized38 = new client.setting.BooleanSetting(this, constructorKey8, "OnlyOnClick", true);
        java.lang.Object initialValue39 = recovery$indy$flow$514(this);
        java.lang.Object initialValue40 = initialValue39;
        long initialValue41 = constructorKey7;
        client.setting.BooleanSetting initialValue42 = initialized38;
        java.lang.Object initialValue43 = ((java.lang.Object)(((client.setting.Setting) (((java.lang.Object)(initialValue42))))));
        java.lang.Object initialValue44 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue40))))));
        java.lang.Object initialValue45 = recovery$indy$flow$517(initialValue43, initialValue41, initialValue44);
        java.lang.Object initialValue46 = ((java.lang.Object)(((client.setting.BooleanSetting) (((java.lang.Object)(initialValue45))))));
        recovery$indy$flow$519(this, initialValue46);
        client.setting.NumberSetting initialized47 = new client.setting.NumberSetting(this, "YawFov", Double.longBitsToDouble(4636033603912859648L), constructorKey9, 0.0D, Double.longBitsToDouble(4640537203540230144L), 0);
        java.lang.Object initialValue48 = recovery$indy$flow$522(this);
        java.lang.Object initialValue49 = initialValue48;
        client.setting.NumberSetting initialValue50 = initialized47;
        java.lang.Object initialValue51 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue50))))));
        java.lang.Object initialValue52 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue49))))));
        java.lang.Object initialValue53 = recovery$indy$flow$525(initialValue51, initialValue52);
        recovery$indy$flow$526(this, initialValue53);
        client.setting.NumberSetting initialized54 = new client.setting.NumberSetting(this, "PitchFov", Double.longBitsToDouble(4636033603912859648L), constructorKey9, 0.0D, Double.longBitsToDouble(4640537203540230144L), 0);
        java.lang.Object initialValue55 = recovery$indy$flow$529(this);
        java.lang.Object initialValue56 = initialValue55;
        client.setting.NumberSetting initialValue57 = initialized54;
        java.lang.Object initialValue58 = ((java.lang.Object)(((client.setting.NumberSetting) (((java.lang.Object)(initialValue57))))));
        java.lang.Object initialValue59 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue56))))));
        java.lang.Object initialValue60 = recovery$indy$flow$532(initialValue58, initialValue59);
        recovery$indy$flow$533(this, initialValue60);
        java.lang.Object initialValue61 = recovery$indy$flow$535();
        client.setting.MultiSelectSetting initialized62 = new client.setting.MultiSelectSetting(this, "Targets", constructorKey3, (net.C_47OZ[]) (initialValue61));
        java.lang.Object initialValue63 = recovery$indy$flow$537(this);
        java.lang.Object initialValue64 = initialValue63;
        client.setting.MultiSelectSetting initialValue65 = initialized62;
        java.lang.Object initialValue66 = ((java.lang.Object)(((client.setting.MultiSelectSetting) (((java.lang.Object)(initialValue65))))));
        java.lang.Object initialValue67 = ((java.lang.Object)(((net.C_45n) (((java.lang.Object)(initialValue64))))));
        java.lang.Object initialValue68 = recovery$indy$flow$540(initialValue66, initialValue67);
        recovery$indy$flow$541(this, initialValue68);
        net.C_47cu initialized69 = new net.C_47cu();
        recovery$indy$flow$544(this, initialized69);
        recovery$indy$flow$545(this, null);
        recovery$indy$flow$546(this, 0);
        byte converted70 = (byte) (constructorPart6);
        net.C_47XZ initialized71 = new net.C_47XZ(constructorPart4, constructorPart5, converted70);
        recovery$indy$flow$549(this, initialized71);
        java.util.HashSet initialized72 = new java.util.HashSet();
        recovery$indy$flow$552(this, initialized72);
        recovery$indy$flow$553(this, null);
        net.C_476W initialized73 = new net.C_476W(this);
        net.C_476W initialValue74 = initialized73;
        com.google.gson.GsonBuilder initialized75 = new com.google.gson.GsonBuilder();
        java.lang.Object initialValue76 = recovery$indy$flow$558(1);
        ((java.lang.Object[]) initialValue76)[0] = initialValue74;
        java.lang.Object initialValue77 = recovery$indy$flow$559(initialized75, initialValue76);
        java.lang.Object initialValue78 = recovery$indy$flow$560(initialValue77);
        recovery$indy$flow$561(this, initialValue78);
        return;
    }





    private static native java.lang.reflect.Field c(long a0,long a1);

    private static native java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup a0,java.lang.String a1,java.lang.invoke.MethodType a2);
    private static native java.lang.Object recovery$indy$flow$7(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$17() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }



    private static boolean recovery$indy$flow$21(java.lang.Object a0) {
        return ((net.C_47UA) (a0)).field_45;
    }
    private static java.lang.Object recovery$indy$flow$22() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }



    private static native int recovery$indy$flow$26(java.lang.Object a0);

    private static native void recovery$indy$flow$29(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$31(long a0,long a1);
    private static java.lang.Object recovery$indy$flow$32() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native boolean recovery$indy$flow$33(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$35(java.lang.Object a0,long a1,long a2,long a3,long a4);
    private static native boolean recovery$indy$flow$37(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$38() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$39(java.lang.Object a0,long a1,long a2);

    private static native java.lang.Object recovery$indy$flow$42(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$44(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$52(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$62(long a0,long a1);
    private static native boolean recovery$indy$flow$64(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$65() {
        return client.ClientGlobals.field_48;
    }


    private static native java.lang.Object recovery$indy$flow$68(java.lang.Object a0,long a1,long a2,long a3);
    private static native boolean recovery$indy$flow$70(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$72(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$74(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$75(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native void recovery$indy$flow$76(java.lang.Object a0,java.lang.Object a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$84(long a0,long a1);
    private static boolean recovery$indy$flow$97(java.lang.Object a0) {
        return (a0 instanceof net.minecraft.entity.EntityLivingBase);
    }
    private static double recovery$indy$flow$98(java.lang.Object a0) {
        return ((net.minecraft.entity.Entity) (a0)).field_48Q;
    }
    private static double recovery$indy$flow$99(java.lang.Object a0) {
        return ((net.minecraft.entity.Entity) (a0)).field_48j;
    }
    private static native float recovery$indy$flow$100(java.lang.Object a0);
    private static double recovery$indy$flow$101(java.lang.Object a0) {
        return ((net.minecraft.entity.Entity) (a0)).field_42o;
    }
    private static native java.lang.Object recovery$indy$flow$102();

    private static native java.lang.Object recovery$indy$flow$104(java.lang.Object a0);
    private static float recovery$indy$flow$105(java.lang.Object a0) {
        return ((net.C_47y6) (a0)).field_43;
    }
    private static native java.lang.Object recovery$indy$flow$106();

    private static native java.lang.Object recovery$indy$flow$108(java.lang.Object a0);
    private static float recovery$indy$flow$109(java.lang.Object a0) {
        return ((net.C_47y6) (a0)).field_48;
    }
    private static native java.lang.Object recovery$indy$flow$110(double a0,double a1,long a2,double a3,float a4,float a5);
    private static java.lang.Object recovery$indy$flow$120() {
        return net.C_47VK.field_42;
    }
    private static native java.lang.Object recovery$indy$flow$124(int a0,long a1);
    private static native void recovery$indy$flow$127(java.lang.Object a0,long a1,long a2,long a3);
    private static native java.lang.Object recovery$indy$flow$134(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$152() {
        return net.C_47nt.PLAYER;
    }

    private static native boolean recovery$indy$flow$154(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$155() {
        return net.C_47nt.MOB;
    }

    private static native boolean recovery$indy$flow$157(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$158() {
        return net.C_47nt.ANIMAL;
    }

    private static native boolean recovery$indy$flow$160(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$161() {
        return net.C_47nt.VILLAGER;
    }

    private static native boolean recovery$indy$flow$163(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$164() {
        return net.C_47nt.ARMOR_STAND;
    }

    private static native boolean recovery$indy$flow$166(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$167() {
        return net.C_47nt.INVISIBLE;
    }

    private static native boolean recovery$indy$flow$169(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$170() {
        return net.C_47nt.DEAD;
    }

    private static native boolean recovery$indy$flow$172(java.lang.Object a0);
    private static native boolean recovery$indy$flow$173(java.lang.Object a0,boolean a1,boolean a2,boolean a3,boolean a4,boolean a5,boolean a6,boolean a7,boolean a8,long a9,boolean a10,boolean a11,boolean a12,long a13,long a14);
    private static native java.lang.Object recovery$indy$flow$174();

    private static native java.lang.Object recovery$indy$flow$176(java.lang.Object a0);
    private static float recovery$indy$flow$177(java.lang.Object a0) {
        return ((net.C_47y6) (a0)).field_43;
    }
    private static native java.lang.Object recovery$indy$flow$178();

    private static native java.lang.Object recovery$indy$flow$180(java.lang.Object a0);
    private static float recovery$indy$flow$181(java.lang.Object a0) {
        return ((net.C_47y6) (a0)).field_48;
    }
    private static native java.lang.Object recovery$indy$flow$183(java.lang.Object a0,float a1,short a2,int a3,float a4,int a5);
    private static boolean recovery$indy$flow$184(java.lang.Object a0) {
        return (a0 instanceof net.minecraft.client.entity.EntityPlayerSP);
    }
    private static java.lang.Object recovery$indy$flow$185() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }


    private static native float recovery$indy$flow$188(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$202(long a0,long a1);
    private static native void recovery$indy$flow$204(java.lang.Object a0,long a1,long a2,long a3);
    private static native void recovery$indy$flow$205(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$212(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$213() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$214(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$215(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }
    private static native java.lang.Object recovery$indy$flow$218(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$219() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$220(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$221(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48h;
    }
    private static native java.lang.Object recovery$indy$flow$224(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$225() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$226(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$227(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48z;
    }
    private static native java.lang.Object recovery$indy$flow$230(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$231() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$232(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$233(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48Q;
    }
    private static native java.lang.Object recovery$indy$flow$236(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$237() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$238(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$239(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48j;
    }
    private static native java.lang.Object recovery$indy$flow$242(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$243() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$244(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$245(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42o;
    }
    private static native java.lang.Object recovery$indy$flow$248(int a0,long a1);
    private static double recovery$indy$flow$249(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48Q;
    }
    private static native java.lang.Object recovery$indy$flow$252(int a0,long a1);
    private static double recovery$indy$flow$253(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_48j;
    }
    private static native java.lang.Object recovery$indy$flow$256(int a0,long a1);
    private static double recovery$indy$flow$257(java.lang.Object a0) {
        return ((net.minecraft.entity.EntityLivingBase) (a0)).field_42o;
    }
    private static native java.lang.Object recovery$indy$flow$260(int a0,long a1);
    private static native java.lang.Object recovery$indy$flow$264(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$265() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$266(java.lang.Object a0,long a1,long a2);
    private static native float recovery$indy$flow$267(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$270(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$271() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$272(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$273(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_43i;
    }
    private static native java.lang.Object recovery$indy$flow$276(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$277() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$278(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$279(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48s;
    }
    private static native java.lang.Object recovery$indy$flow$282(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$283() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$284(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$285(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_42;
    }
    private static native java.lang.Object recovery$indy$flow$288(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$289() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$290(java.lang.Object a0,long a1,long a2);
    private static double recovery$indy$flow$291(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_487;
    }
    private static native java.lang.Object recovery$indy$flow$294(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$295() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$296(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$297(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$300(int a0,long a1);

    private static native java.lang.Object recovery$indy$flow$303(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$306(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$308() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$309(java.lang.Object a0,long a1,long a2);

    private static native java.lang.Object recovery$indy$flow$313(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$315() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$316(java.lang.Object a0,long a1,long a2);

    private static native java.lang.Object recovery$indy$flow$318(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$321(int a0,long a1);

    private static native java.lang.Object recovery$indy$flow$324(java.lang.Object a0,long a1,int a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$338(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$339() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$340(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$341(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48y;
    }
    private static native java.lang.Object recovery$indy$flow$344(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$345() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$346(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$347(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48h;
    }
    private static native java.lang.Object recovery$indy$flow$350(int a0,long a1);
    private static java.lang.Object recovery$indy$flow$351() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$352(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$353(java.lang.Object a0) {
        return ((net.minecraft.client.entity.EntityPlayerSP) (a0)).field_48z;
    }
    private static java.lang.Object recovery$indy$flow$356() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$357(java.lang.Object a0,long a1,long a2);
    private static java.lang.Object recovery$indy$flow$358() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$359(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$360(java.lang.Object a0) {
        return ((net.C_40X) (a0)).field_49;
    }
    private static native java.lang.Object recovery$indy$flow$361(java.lang.Object a0,float a1);
    private static native java.lang.Object recovery$indy$flow$362(int a0,long a1);
    private static double recovery$indy$flow$363(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static native java.lang.Object recovery$indy$flow$366(int a0,long a1);
    private static double recovery$indy$flow$367(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static native java.lang.Object recovery$indy$flow$370(int a0,long a1);
    private static double recovery$indy$flow$371(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static java.lang.Object recovery$indy$flow$374() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$375(java.lang.Object a0,long a1,long a2);
    private static float recovery$indy$flow$376(java.lang.Object a0) {
        return ((net.C_40X) (a0)).field_49;
    }
    private static native java.lang.Object recovery$indy$flow$377(java.lang.Object a0,float a1);
    private static native java.lang.Object recovery$indy$flow$378(int a0,long a1);
    private static double recovery$indy$flow$379(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_40;
    }
    private static native java.lang.Object recovery$indy$flow$382(int a0,long a1);
    private static double recovery$indy$flow$383(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_41;
    }
    private static native java.lang.Object recovery$indy$flow$386(int a0,long a1);
    private static double recovery$indy$flow$387(java.lang.Object a0) {
        return ((net.C_47tf) (a0)).field_47;
    }
    private static native java.lang.Object recovery$indy$flow$392(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$393(java.lang.Object a0,long a1,long a2);
    private static boolean recovery$indy$flow$394(java.lang.Object a0) {
        return (a0 instanceof net.C_46s);
    }
    private static native java.lang.Object recovery$indy$flow$395(java.lang.Object a0,long a1,long a2);

    private static native int recovery$indy$flow$397(java.lang.Object a0);
    private static java.lang.Object recovery$indy$flow$398() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$399(java.lang.Object a0,long a1,long a2);
    private static native int recovery$indy$flow$400(java.lang.Object a0);
    private static native java.lang.Object recovery$indy$flow$402(java.lang.Object a0,long a1,long a2);
    private static boolean recovery$indy$flow$403(java.lang.Object a0) {
        return (a0 instanceof net.C_42L);
    }
    private static native java.lang.Object recovery$indy$flow$404(java.lang.Object a0,long a1,long a2);

    private static native float recovery$indy$flow$406(java.lang.Object a0);
    private static native float recovery$indy$flow$408(java.lang.Object a0);
    private static native void recovery$indy$flow$441(java.lang.Object a0,int a1,long a2,long a3,long a4);
    private static native void recovery$indy$flow$442(java.lang.Object a0,int a1,long a2,long a3,long a4);
    private static native void recovery$indy$flow$443(java.lang.Object a0,int a1,long a2,long a3,long a4);
    private static native void recovery$indy$flow$444(java.lang.Object a0,int a1,long a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$445(long a0,long a1);
    private static native boolean recovery$indy$flow$447(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$449(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$450(java.lang.Object a0,long a1,boolean a2,long a3,long a4);
    private static native java.lang.Object recovery$indy$flow$451(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$453(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$454(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$455(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$457(long a0,long a1);
    private static native java.lang.Object recovery$indy$flow$458(java.lang.Object a0,long a1,long a2);
    private static native java.lang.Object recovery$indy$flow$459(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$461(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$462() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$463(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$465(java.lang.Object a0,int a1) {
        ((net.C_47oo) (a0)).field_42u = a1;
        return;
    }
    private static native java.lang.Object recovery$indy$flow$466(long a0,long a1);
    private static native boolean recovery$indy$flow$468(java.lang.Object a0,long a1,long a2);
    private static native boolean recovery$indy$flow$470(java.lang.Object a0,long a1,long a2);
    private static native void recovery$indy$flow$471(java.lang.Object a0,long a1,boolean a2,long a3,long a4);
    private static native void recovery$indy$flow$472(java.lang.Object a0,long a1,long a2,long a3);
    private static java.lang.Object recovery$indy$flow$473() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$474(java.lang.Object a0,long a1,long a2);
    private static int recovery$indy$flow$475(java.lang.Object a0) {
        return ((net.C_47oo) (a0)).field_42u;
    }
    private static java.lang.Object recovery$indy$flow$477() {
        return augustus.recovered.modules.misc.RotationRecorder_47kw.field_43;
    }
    private static native java.lang.Object recovery$indy$flow$478(java.lang.Object a0,long a1,long a2);
    private static void recovery$indy$flow$479(java.lang.Object a0,int a1) {
        ((net.C_47oo) (a0)).field_42u = a1;
        return;
    }
    private static native void recovery$indy$flow$482(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$485(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$488(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$491(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$493(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$496(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$499(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$501(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$504(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$507(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$510(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$511(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$514(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$517(java.lang.Object a0,long a1,java.lang.Object a2);

    private static native void recovery$indy$flow$519(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$522(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$525(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$526(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$529(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$532(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$533(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$535();
    private static native java.lang.Object recovery$indy$flow$537(java.lang.Object a0);


    private static native java.lang.Object recovery$indy$flow$540(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$541(java.lang.Object a0,java.lang.Object a1);
    private static native void recovery$indy$flow$544(java.lang.Object a0,java.lang.Object a1);
    private static void recovery$indy$flow$545(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.RotationRecorder_47kw) (a0)).field_45G = ((java.io.DataOutputStream) (a1));
        return;
    }
    private static void recovery$indy$flow$546(java.lang.Object a0,int a1) {
        ((augustus.recovered.modules.misc.RotationRecorder_47kw) (a0)).field_43y = a1;
        return;
    }
    private static void recovery$indy$flow$549(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.RotationRecorder_47kw) (a0)).field_45c = ((net.C_47XZ) (a1));
        return;
    }
    private static void recovery$indy$flow$552(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.RotationRecorder_47kw) (a0)).field_45 = ((java.util.HashSet) (a1));
        return;
    }
    private static void recovery$indy$flow$553(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.RotationRecorder_47kw) (a0)).field_47 = ((com.google.gson.JsonArray) (a1));
        return;
    }
    private static native java.lang.Object recovery$indy$flow$558(int a0);
    private static native java.lang.Object recovery$indy$flow$559(java.lang.Object a0,java.lang.Object a1);
    private static native java.lang.Object recovery$indy$flow$560(java.lang.Object a0);
    private static void recovery$indy$flow$561(java.lang.Object a0,java.lang.Object a1) {
        ((augustus.recovered.modules.misc.RotationRecorder_47kw) (a0)).field_455 = ((com.google.gson.Gson) (a1));
        return;
    }

}
