package net.minecraft.entity;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import net.C_47AC;
import net.C_47sk;
import net.C_47tf;
import net.minecraft.client.entity.EntityPlayerSP;


/** Method patch source; only indexed method bodies are installed into the retained class. */
public abstract class Entity {
    private java.util.UUID field_42z;
    private net.C_484 field_48K;
    private net.C_478i field_482;
    private net.C_474g field_48L;
    private net.C_47iJ field_48c;
    private boolean field_480;
    private net.C_47tf field_48Z;
    private boolean field_420;
    private net.minecraft.world.World field_47;
    private int field_48E;
    private boolean field_485;
    private boolean field_48t;
    private boolean field_48m;

    /** getter for field_42z; original field access and evaluation order retained. */
    public java.util.UUID method_46$48a3a9a042() {
        return this.field_42z;
    }

    /** getter for field_48K; original field access and evaluation order retained. */
    public net.C_484 method_46$89b19fafe1() {
        return this.field_48K;
    }

    /** setter for field_482; original field access and evaluation order retained. */
    public void method_46$6059593eaa(net.C_478i value) {
        this.field_482 = value;
    }

    /** getter for field_48L; original field access and evaluation order retained. */
    public net.C_474g method_42$10de210216() {
        return this.field_48L;
    }

    /** getter for field_48c; original field access and evaluation order retained. */
    public net.C_47iJ method_41$ffa334b794() {
        return this.field_48c;
    }

    /** setter for field_480; original field access and evaluation order retained. */
    public void method_41$f633c984d8(boolean value) {
        this.field_480 = value;
    }

    /** getter for field_48Z; original field access and evaluation order retained. */
    public net.C_47tf method_40$b2124a4855() {
        return this.field_48Z;
    }

    /** setter for field_420; original field access and evaluation order retained. */
    public void method_44$f633c984d8(boolean value) {
        this.field_420 = value;
    }

    /** getter for field_47; original field access and evaluation order retained. */
    public net.minecraft.world.World method_48$445f072697() {
        return this.field_47;
    }

    /** setter for field_47; original field access and evaluation order retained. */
    public void method_48$9eb75cbbdb(net.minecraft.world.World value) {
        this.field_47 = value;
    }

    /** getter for field_48E; original field access and evaluation order retained. */
    public int method_49$8abf5c6871() {
        return this.field_48E;
    }

    /** setter for field_48E; original field access and evaluation order retained. */
    public void method_49$d00df7729d(int value) {
        this.field_48E = value;
    }

    /** setter for field_485; original field access and evaluation order retained. */
    public void method_45$f633c984d8(boolean value) {
        this.field_485 = value;
    }

    /** getter for field_482; original field access and evaluation order retained. */
    public net.C_478i method_45$6684d3c618() {
        return this.field_482;
    }

    /** getter for field_485; original field access and evaluation order retained. */
    public boolean method_48E$aae029aa0a() {
        return this.field_485;
    }

    /** getter for field_48t; original field access and evaluation order retained. */
    public boolean method_48s$aae029aa0a() {
        return this.field_48t;
    }

    /** getter for field_48m; original field access and evaluation order retained. */
    public boolean method_48H$aae029aa0a() {
        return this.field_48m;
    }

    /** getter for field_480; original field access and evaluation order retained. */
    public boolean method_48c$aae029aa0a() {
        return this.field_480;
    }

    /** getter for field_420; original field access and evaluation order retained. */
    public boolean method_48a$aae029aa0a() {
        return this.field_420;
    }

    /** getter for field_48E; original field access and evaluation order retained. */
    public int hashCode() {
        return this.field_48E;
    }

    private static long c;
    public net.C_47rE field_48B;
    public double field_48a;
    public double field_48G;
    public double field_48q;
    public double field_48Q;
    public double field_48j;
    public double field_42o;
    public float field_48h;
    public float field_48z;
    public float field_48p;
    public float field_44;
    public native void method_46$a59262c0f0(double x,double y,double z);
    public native void method_45$dd322a622a(float yaw,float pitch);
    private static native void recovery$indy$69(Object state,long key,Object position,long callSite,long ownerKey);

    public void method_48$bd229ade05(double x, double y, double z, float yaw, float pitch) {
        long ownerKey = c ^ 0x594F427199E8L;
        long historyKey = ownerKey ^ 0xEFB05611E5L;
        if (this instanceof EntityPlayerSP && C_47AC.field_45.newerThanOrEqualTo(ProtocolVersion.v1_17)) {
            double clampedX = C_47sk.method_45$4b58f7ab41(x, -3.0E7, 3.0E7);
            double clampedZ = C_47sk.method_45$4b58f7ab41(z, -3.0E7, 3.0E7);
            this.field_48a = clampedX;
            this.field_48G = y;
            this.field_48q = clampedZ;
            this.method_46$a59262c0f0(x, y, z);
            this.field_48h = yaw % 360.0f;
            this.field_48z = C_47sk.method_46$ef9a6720f7(pitch, -90.0f, 90.0f) % 360.0f;
            this.field_48p = yaw;
            this.field_44 = pitch;
            return;
        }
        Entity.recovery$indy$69(this.field_48B, historyKey, new C_47tf(x, y, z), 1042760148957728290L, ownerKey);
        this.field_48a = this.field_48Q = x;
        this.field_48G = this.field_48j = y;
        this.field_48q = this.field_42o = z;
        this.field_48p = this.field_48h = yaw;
        this.field_44 = this.field_48z = pitch;
        double yawDelta = this.field_48p - yaw;
        if (yawDelta < -180.0) {
            this.field_48p += 360.0f;
        }
        if (yawDelta >= 180.0) {
            this.field_48p -= 360.0f;
        }
        this.method_46$a59262c0f0(this.field_48Q, this.field_48j, this.field_42o);
        this.method_45$dd322a622a(yaw, pitch);
    }
}
