package net;

import net.minecraft.util.ResourceLocation;

/** Complete positioned sound record, including factories and constructors. */
public class C_4747 extends C_474N {
    /** Non-positional sound with configurable volume and normal pitch. */
    public static C_4747 method_42$1e753247d3(ResourceLocation sound, float volume) {
        return new C_4747(sound, volume, 1.0f, false, 0, C_478V.NONE, 0.0f, 0.0f, 0.0f);
    }

    /** Quiet interface click with configurable pitch. */
    public static C_4747 method_41$1e753247d3(ResourceLocation sound, float pitch) {
        return new C_4747(sound, 0.25f, pitch, false, 0, C_478V.NONE, 0.0f, 0.0f, 0.0f);
    }

    /** Positional sound with volume 4 and linear distance attenuation. */
    public static C_4747 method_40$a81b465098(ResourceLocation sound, float x, float y, float z) {
        return new C_4747(sound, 4.0f, 1.0f, false, 0, C_478V.LINEAR, x, y, z);
    }

    /** Full-volume non-positional sound used by custom toggle samples. */
    public static C_4747 method_44$3a843465a4(ResourceLocation sound) {
        return new C_4747(sound, 1.0f, 1.0f, false, 0, C_478V.NONE, 0.0f, 0.0f, 0.0f);
    }

    private C_4747(ResourceLocation sound, float volume, float pitch, boolean repeating,
                   int repeatDelay, C_478V attenuation, float x, float y, float z) {
        super(sound);
        this.field_44 = volume;
        this.field_47 = pitch;
        this.field_49 = x;
        this.field_40 = y;
        this.field_41 = z;
        this.field_45 = repeating;
        this.field_46 = repeatDelay;
        this.field_48 = attenuation;
    }

    public C_4747(ResourceLocation sound, float volume, float pitch, float x, float y, float z) {
        this(sound, volume, pitch, false, 0, C_478V.LINEAR, x, y, z);
    }
}
