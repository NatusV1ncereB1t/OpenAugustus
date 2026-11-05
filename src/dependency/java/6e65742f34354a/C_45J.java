package net;
import java.io.IOException;
import net.C_40x;
import net.C_473U;
import net.C_476n;
import net.C_478Q;
import net.C_47JQ;
import net.C_47WQ;
import net.C_484;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_45J {
    net.C_478Q field_40;
    net.C_484 field_48;
    net.C_40x field_49;

    public net.C_484 method_41$89b19fafe1() {
        return this.field_48;
    }

    public void method_40$47ef0626ef(C_47JQ c_47JQ) throws IOException {
        this.field_49 = (C_40x)c_47JQ.method_43$7716900172(C_40x.class);
        this.field_40 = c_47JQ.method_45$5730377d31();
        this.field_48 = C_484.method_44$8b3518eb20(c_47JQ.readUnsignedByte());
    }

    public net.C_478Q method_40$5730377d31() {
        return this.field_40;
    }

    public void method_44$f0d6357a98(C_47WQ c_47WQ) {
        this.method_47$3da8c07a0f((C_476n)c_47WQ);
    }

    public void method_49$47ef0626ef(C_47JQ c_47JQ) throws IOException {
        c_47JQ.method_40$d3839fc2aa((Enum)this.field_49);
        c_47JQ.method_49$c96058c204(this.field_40);
        c_47JQ.writeByte(this.field_48.method_43$8abf5c6871());
    }

    public void method_47$3da8c07a0f(C_476n c_476n) {
        c_476n.method_41$df09a0341d(this);
    }

    public net.C_40x method_47$4de68953a2() {
        return this.field_49;
    }

}
