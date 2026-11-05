package net;
import java.io.IOException;
import net.C_473U;
import net.C_476n;
import net.C_478Q;
import net.C_47JQ;
import net.C_47WQ;
import net.C_47rf;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_42V {
    static net.C_478Q field_41;
    net.C_478Q field_48;
    int field_40;
    net.C_47rf field_42;
    float field_47;
    float field_43;
    float field_45;

    public void method_46$9bd5253e1e(net.C_47rf value) {
        this.field_42 = value;
    }

    public void method_46$d00df7729d(int value) {
        this.field_40 = value;
    }

    public net.C_47rf method_46$ac4db64966() {
        return this.field_42;
    }

    public float method_42$bc607678b6() {
        return this.field_47;
    }

    public void method_42$24a796ab4c(float value) {
        this.field_43 = value;
    }

    public float method_40$bc607678b6() {
        return this.field_45;
    }

    public void method_40$47ef0626ef(C_47JQ c_47JQ) throws IOException {
        this.field_48 = c_47JQ.method_45$5730377d31();
        this.field_40 = c_47JQ.readUnsignedByte();
        this.field_42 = c_47JQ.method_48$ac4db64966();
        this.field_47 = (float)c_47JQ.readUnsignedByte() / 16.0f;
        this.field_43 = (float)c_47JQ.readUnsignedByte() / 16.0f;
        this.field_45 = (float)c_47JQ.readUnsignedByte() / 16.0f;
    }

    public void method_44$24a796ab4c(float value) {
        this.field_45 = value;
    }

    public void method_44$f0d6357a98(C_47WQ c_47WQ) {
        this.method_47$3da8c07a0f((C_476n)c_47WQ);
    }

    public int method_44$8abf5c6871() {
        return this.field_40;
    }

    public float method_48$bc607678b6() {
        return this.field_43;
    }

    public void method_49$47ef0626ef(C_47JQ c_47JQ) throws IOException {
        c_47JQ.method_49$c96058c204(this.field_48);
        c_47JQ.writeByte(this.field_40);
        c_47JQ.method_45$9bd5253e1e(this.field_42);
        c_47JQ.writeByte((int)(this.field_47 * 16.0f));
        c_47JQ.writeByte((int)(this.field_43 * 16.0f));
        c_47JQ.writeByte((int)(this.field_45 * 16.0f));
    }

    public void method_47$c96058c204(net.C_478Q value) {
        this.field_48 = value;
    }

    public void method_47$3da8c07a0f(C_476n c_476n) {
        c_476n.method_46$b28b0a5967(this);
    }

    public net.C_478Q method_47$5730377d31() {
        return this.field_48;
    }

    public void method_47$24a796ab4c(float value) {
        this.field_47 = value;
    }

}
