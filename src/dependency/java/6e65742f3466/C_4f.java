package net;

/** Method patch source; only indexed method bodies are installed into the retained class. */
public class C_4f {
    private long d;
    private int[] b;
    private static java.lang.Object o;

    /** setter for d; original field access and evaluation order retained. */
    public void b(long value) {
        this.d = value;
    }

    /** getter for b; original field access and evaluation order retained. */
    public int[] b() {
        return this.b;
    }

    /** getter for o; original field access and evaluation order retained. */
    public static java.lang.Object g() {
        return C_4f.o;
    }

}
