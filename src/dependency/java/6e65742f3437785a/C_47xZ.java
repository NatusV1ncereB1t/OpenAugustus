package net;
import java.io.IOException;
import java.util.Set;
import net.C_473U;
import net.C_475V;
import net.C_47JQ;
import net.C_47Mt;
import net.C_47WQ;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47xZ {
    double field_40;
    double field_41;
    double field_49;
    float field_45;
    float field_48;
    float field_42;
    java.util.Set field_43;

    public double method_46$fedcb3e4d3() {
        return this.field_49;
    }

    public java.util.Set method_46$9aa7af2ac9() {
        return this.field_43;
    }

    public void method_42$3adeee8621(C_475V c_475V) {
        c_475V.method_40$97318188b2(this);
    }

    public float method_42$bc607678b6() {
        return this.field_42;
    }

    public float method_41$bc607678b6() {
        return this.field_48;
    }

    public void method_41$24a796ab4c(float value) {
        this.field_42 = value;
    }

    public float method_40$bc607678b6() {
        return this.field_45;
    }

    public void method_40$47ef0626ef(C_47JQ c_47JQ) throws IOException {
        this.field_40 = c_47JQ.readDouble();
        this.field_41 = c_47JQ.readDouble();
        this.field_49 = c_47JQ.readDouble();
        this.field_45 = c_47JQ.readFloat();
        this.field_48 = c_47JQ.readFloat();
        this.field_43 = C_47Mt.method_42$520e40c99b((int)c_47JQ.readUnsignedByte());
    }

    public double method_40$fedcb3e4d3() {
        return this.field_40;
    }

    public void method_44$f0d6357a98(C_47WQ c_47WQ) {
        this.method_42$3adeee8621((C_475V)c_47WQ);
    }

    public void method_44$24a796ab4c(float value) {
        this.field_48 = value;
    }

    public double method_48$fedcb3e4d3() {
        return this.field_41;
    }

    public void method_48$24a796ab4c(float value) {
        this.field_45 = value;
    }

    public void method_49$47ef0626ef(C_47JQ c_47JQ) throws IOException {
        c_47JQ.writeDouble(this.field_40);
        c_47JQ.writeDouble(this.field_41);
        c_47JQ.writeDouble(this.field_49);
        c_47JQ.writeFloat(this.field_45);
        c_47JQ.writeFloat(this.field_48);
        c_47JQ.writeByte(C_47Mt.method_48$21ccc4e14c((Set)this.field_43));
    }

    public void method_49$2c20cf5948(double value) {
        this.field_40 = value;
    }

    public void method_45$2c20cf5948(double value) {
        this.field_41 = value;
    }

    public void method_47$2c20cf5948(double value) {
        this.field_49 = value;
    }

}
