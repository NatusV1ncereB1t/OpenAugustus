package net;
import java.io.IOException;
import net.C_41Z;
import net.C_473U;
import net.C_476n;
import net.C_47JQ;
import net.C_47WQ;
import net.C_47tf;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

/** Editable dependency method bodies; retained class metadata supplies the runtime contract. */
public class C_47WF {
    int field_44;
    net.C_41Z field_47;
    net.C_47tf field_49;

    private static native java.io.IOException a(java.io.IOException arg0);

    public int method_42$8abf5c6871() {
        return this.field_44;
    }

    public native void method_40$47ef0626ef(net.C_47JQ arg0) throws java.io.IOException;

    public void method_44$f0d6357a98(C_47WQ c_47WQ) {
        this.method_43$3da8c07a0f((C_476n)c_47WQ);
    }

    public net.C_47tf method_44$b2124a4855() {
        return this.field_49;
    }

    public Entity method_48$33959771da(World world) {
        return world.method_45$cf8871fa3f(this.field_44);
    }

    public native void method_49$47ef0626ef(net.C_47JQ arg0) throws java.io.IOException;

    public net.C_41Z method_45$75ce8b0544() {
        return this.field_47;
    }

    public void method_43$3da8c07a0f(C_476n c_476n) {
        c_476n.method_44$f21b2cedb9(this);
    }

}
