package net;
import java.io.IOException;
import net.C_473U;
import net.C_475V;
import net.C_47JQ;
import net.C_47WQ;
import net.minecraft.entity.Entity;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_46s {
    int field_42;
    int field_47;
    int field_45;
    int field_49;
    boolean field_41;
    boolean field_40;

    public void method_42$d00df7729d(int value) {
        this.field_49 = value;
    }

    public int method_41$8abf5c6871() {
        return this.field_45;
    }

    public boolean method_40$aae029aa0a() {
        return this.field_40;
    }

    public void method_40$3adeee8621(C_475V c_475V) {
        c_475V.method_40$85268d3710(this);
    }

    public void method_40$47ef0626ef(C_47JQ c_47JQ) throws IOException {
        this.field_42 = c_47JQ.method_48$8abf5c6871();
        this.field_47 = c_47JQ.readShort();
        this.field_45 = c_47JQ.readShort();
        this.field_49 = c_47JQ.readShort();
    }

    public void method_44$f0d6357a98(C_47WQ c_47WQ) {
        this.method_40$3adeee8621((C_475V)c_47WQ);
    }

    public boolean method_44$aae029aa0a() {
        return this.field_41;
    }

    public void method_48$d00df7729d(int value) {
        this.field_45 = value;
    }

    public void method_49$47ef0626ef(C_47JQ c_47JQ) throws IOException {
        c_47JQ.method_49$d00df7729d(this.field_42);
        c_47JQ.writeShort(this.field_47);
        c_47JQ.writeShort(this.field_45);
        c_47JQ.writeShort(this.field_49);
    }

    public int method_49$8abf5c6871() {
        return this.field_47;
    }

    public void method_49$f633c984d8(boolean value) {
        this.field_41 = value;
    }

    public int method_45$8abf5c6871() {
        return this.field_42;
    }

    public void method_47$d00df7729d(int value) {
        this.field_47 = value;
    }

    public void method_47$f633c984d8(boolean value) {
        this.field_40 = value;
    }

    public int method_47$8abf5c6871() {
        return this.field_49;
    }

}
