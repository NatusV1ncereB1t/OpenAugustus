package net;
import cc.C_40Z;
import java.io.IOException;
import net.C_473U;
import net.C_475V;
import net.C_47JQ;
import net.C_47WQ;
import net.C_47oP;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47AL {
    net.C_47oP field_44;
    byte field_48;

    private static native cc.C_40Z a(cc.C_40Z arg0);

    public native boolean method_42$aae029aa0a();

    public void method_40$47ef0626ef(C_47JQ c_47JQ) throws IOException {
        this.field_44 = c_47JQ.method_41$8b128fd962();
        this.field_48 = c_47JQ.readByte();
    }

    public void method_44$f0d6357a98(C_47WQ c_47WQ) {
        this.method_48$3adeee8621((C_475V)c_47WQ);
    }

    public void method_48$3adeee8621(C_475V c_475V) {
        c_475V.method_40$6bddb54819(this);
    }

    public void method_49$47ef0626ef(C_47JQ c_47JQ) throws IOException {
        c_47JQ.method_48$2cb02288e4(this.field_44);
        c_47JQ.writeByte((int)this.field_48);
    }

    public void method_45$2cb02288e4(net.C_47oP value) {
        this.field_44 = value;
    }

    public net.C_47oP method_45$8b128fd962() {
        return this.field_44;
    }

    public byte method_43$7d493934e8() {
        return this.field_48;
    }

}
