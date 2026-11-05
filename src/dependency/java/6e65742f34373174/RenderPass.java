package client.render;

/** Method patch source; only indexed method bodies are installed into the retained class. */
public class RenderPass {
    private static int field_42;

    /** setter for field_42; original field access and evaluation order retained. */
    public static void method_45$d00df7729d(int value) {
        RenderPass.field_42 = value;
    }

    /** getter for field_42; original field access and evaluation order retained. */
    public static int method_45$8abf5c6871() {
        return RenderPass.field_42;
    }

}
