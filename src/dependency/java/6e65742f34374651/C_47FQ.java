package net;
import java.io.IOException;
import net.C_473U;
import net.C_475V;
import net.C_47IT;
import net.C_47JQ;
import net.C_47SG;
import net.C_47WQ;
import net.C_47qE;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47FQ {
    int field_41;
    net.C_47qE field_45;
    net.C_47IT field_48;
    net.C_47SG field_42;

    private static native java.io.IOException a(java.io.IOException arg0);

    public net.C_47IT method_42$73d174f422() {
        return this.field_48;
    }

    public net.C_47SG method_41$fca6ffde2b() {
        return this.field_42;
    }

    public native void method_40$47ef0626ef(net.C_47JQ arg0) throws java.io.IOException;

    public void method_44$f0d6357a98(C_47WQ c_47WQ) {
        this.method_44$3adeee8621((C_475V)c_47WQ);
    }

    public void method_44$3adeee8621(C_475V c_475V) {
        c_475V.method_48$fca56cc6da(this);
    }

    public int method_48$8abf5c6871() {
        return this.field_41;
    }

    public void method_49$47ef0626ef(C_47JQ c_47JQ) throws IOException {
        c_47JQ.writeInt(this.field_41);
        c_47JQ.writeByte(this.field_45.method_40$8abf5c6871());
        c_47JQ.writeByte(this.field_48.method_48$8abf5c6871());
        c_47JQ.method_48$310d4227fb(this.field_42.method_40$0e30dfc966());
    }

    public net.C_47qE method_43$b38af1ac9d() {
        return this.field_45;
    }

}
