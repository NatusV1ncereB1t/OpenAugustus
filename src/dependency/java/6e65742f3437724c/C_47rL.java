package net;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

/** Shared player used by module toggle, notification, and client sound events. */
public class C_47rL {
    // Compilation declarations. Runtime fields and resource registration stay on the retained class.
    private static long a;
    private static boolean field_43;

    public static boolean method_40$aae029aa0a() {
        return field_43;
    }

    public static void method_45$f633c984d8(boolean enabled) {
        field_43 = enabled;
    }

    public static boolean method_43$aae029aa0a() {
        return !method_40$aae029aa0a();
    }

    /** Play a registered sound; preserve the original guard, null checks, and lookup order. */
    public static void method_43$c325091c28(long callerKey, ResourceLocation sound) {
        long key = a ^ callerKey;
        String[] guard = recovery$indy$1(-8341067145965446287L, key);
        Minecraft client = Minecraft.method_46$28f1e2a3f8();
        if (guard == null) {
            if (client == null) return;
            client = Minecraft.method_46$28f1e2a3f8();
        }

        C_425 handler = recovery$indy$2(client, -8340939900225887714L, key);
        if (guard == null) {
            if (handler == null) return;
            handler = recovery$indy$3(Minecraft.method_46$28f1e2a3f8(), -8340939900225887714L, key);
        }
        handler.method_48$38ea80174b(C_4747.method_44$3a843465a4(sound));
    }

    // These three Java call sites are restored from the original class, not loaded as JNI.
    private static native String[] recovery$indy$1(long selector, long key);
    private static native C_425 recovery$indy$2(Object client, long selector, long key);
    private static native C_425 recovery$indy$3(Object client, long selector, long key);
}
