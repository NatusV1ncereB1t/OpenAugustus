package net;

import net.minecraft.util.ResourceLocation;

/** Complete sound-property implementation; legacy ABI names keep existing callers compatible. */
public abstract class C_474N implements C_47xQ {
    protected final ResourceLocation field_43; // Sound resource.
    protected float field_44 = 1.0f; // Volume.
    protected float field_47 = 1.0f; // Pitch.
    protected float field_49; // X position.
    protected float field_40; // Y position.
    protected float field_41; // Z position.
    protected boolean field_45 = false; // Repeating.
    protected int field_46 = 0; // Repeat delay.
    protected C_478V field_48 = C_478V.LINEAR; // Distance attenuation.

    /** Z position. */
    public float method_46$bc607678b6() { return this.field_41; }
    /** Pitch. */
    public float method_42$bc607678b6() { return this.field_47; }
    /** Sound resource. */
    public ResourceLocation method_41$8d5288ab3b() { return this.field_43; }
    /** Delay between repeats. */
    public int method_40$8abf5c6871() { return this.field_46; }
    /** Volume. */
    public float method_49$bc607678b6() { return this.field_44; }
    /** Y position. */
    public float method_45$bc607678b6() { return this.field_40; }
    /** Whether the sound repeats. */
    public boolean method_47$aae029aa0a() { return this.field_45; }
    /** X position. */
    public float method_47$bc607678b6() { return this.field_49; }
    /** Distance attenuation mode. */
    public C_478V method_47$9e69632005() { return this.field_48; }

    protected C_474N(ResourceLocation sound) {
        this.field_43 = sound;
    }
}
