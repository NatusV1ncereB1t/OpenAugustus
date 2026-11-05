package recovery.flow;

import java.lang.reflect.Array;
import java.lang.reflect.Modifier;

/** Explicit operand/local state used by source-recovered irreducible Java methods. */
public final class BytecodeFrame {
    public final Object[] locals;
    public final Object[] stack;
    public final byte[] widths;
    public int sp, pc;
    public Object result;
    public boolean done, monitorExit;

    public BytecodeFrame(int localsCount, int stackSlots) {
        locals = new Object[Math.max(localsCount, 1)];
        stack = new Object[Math.max(stackSlots + 8, 16)];
        widths = new byte[stack.length];
    }
    public void push(Object value) { stack[sp]=value; widths[sp++]=1; }
    public void wide(Object value) { stack[sp]=value; widths[sp++]=2; }
    public Object pop() { Object value=stack[--sp]; stack[sp]=null; return value; }
    public Object peek() { return stack[sp-1]; }
    public int pi() { return i(pop()); }
    public long pj() { return j(pop()); }
    public float pf() { return f(pop()); }
    public double pd() { return d(pop()); }
    public static int i(Object value) {
        if(value instanceof Character)return ((Character)value).charValue();
        if(value instanceof Boolean)return ((Boolean)value).booleanValue()?1:0;
        return ((Number)value).intValue();
    }
    public static long j(Object value) { return ((Number)value).longValue(); }
    public static float f(Object value) { return ((Number)value).floatValue(); }
    public static double d(Object value) { return ((Number)value).doubleValue(); }
    public static boolean z(Object value) { return (i(value)&1)!=0; }
    public void clear() { while(sp>0)pop(); }
    public void discardTwoSlots() { int width=widths[sp-1];pop();if(width==1)pop(); }
    private void sized(Object value,int width){if(width==2)wide(value);else push(value);}
    public void duplicate(int opcode) {
        int w1=widths[sp-1];Object v1=pop();
        if(opcode==89){push(v1);push(v1);return;}
        if(opcode==92&&w1==2){wide(v1);wide(v1);return;}
        int w2=widths[sp-1];Object v2;
        v2=pop();
        if(opcode==95){push(v1);push(v2);return;}
        if(opcode==90){push(v1);push(v2);push(v1);return;}
        if(opcode==91){
            if(w2==2){push(v1);wide(v2);push(v1);}else{Object v3=pop();push(v1);push(v3);push(v2);push(v1);}return;
        }
        if(opcode==92){push(v2);push(v1);push(v2);push(v1);return;}
        if(opcode==93){
            if(w1==2){wide(v1);push(v2);wide(v1);}else{Object v3=pop();push(v2);push(v1);push(v3);push(v2);push(v1);}return;
        }
        if(opcode==94){
            if(w1==2){
                if(w2==2){wide(v1);wide(v2);wide(v1);}else{Object v3=pop();wide(v1);push(v3);push(v2);wide(v1);}
            }else{
                int w3=widths[sp-1];Object v3=pop();
                if(w3==2){push(v2);push(v1);wide(v3);push(v2);push(v1);}else{Object v4=pop();push(v2);push(v1);push(v4);push(v3);push(v2);push(v1);}
            }return;
        }
        throw new AssertionError("Unsupported stack duplication opcode "+opcode);
    }
    public void replacePending(Object marker,Object initialized) {
        if(!(marker instanceof Pending))throw new VerifyError("Constructor receiver is already initialized");
        for(int n=0;n<sp;n++)if(stack[n]==marker)stack[n]=initialized;
        for(int n=0;n<locals.length;n++)if(locals[n]==marker)locals[n]=initialized;
    }
    private static final class Pending {
        final Class<?> type;
        Pending(Class<?> value){type=value;}
    }
    /** NEW initializes its class before evaluating constructor arguments. */
    public static Object pending(Class<?> type) {
        if(type.isInterface()||Modifier.isAbstract(type.getModifiers()))throw new InstantiationError(type.getName());
        try{Class.forName(type.getName(),true,type.getClassLoader());}
        catch(ClassNotFoundException impossible){return rethrow(impossible);}
        return new Pending(type);
    }
    public static int compare(double left,double right,boolean nanGreater) {
        if(Double.isNaN(left)||Double.isNaN(right))return nanGreater?1:-1;
        return left>right?1:left==right?0:-1;
    }
    public static Object primitiveArray(int kind,int length) {
        switch(kind){
            case 4:return new boolean[length];case 5:return new char[length];
            case 6:return new float[length];case 7:return new double[length];
            case 8:return new byte[length];case 9:return new short[length];
            case 10:return new int[length];case 11:return new long[length];
            default:throw new VerifyError("Unknown primitive array type "+kind);
        }
    }
    public static Object arrayLoad(Object array,int index,int opcode) {
        switch(opcode){
            case 46:return ((int[])array)[index];case 47:return ((long[])array)[index];
            case 48:return ((float[])array)[index];case 49:return ((double[])array)[index];
            case 50:return ((Object[])array)[index];
            case 51:return array instanceof boolean[]?(((boolean[])array)[index]?1:0):(int)((byte[])array)[index];
            case 52:return (int)((char[])array)[index];case 53:return (int)((short[])array)[index];
            default:throw new VerifyError("Unknown array load opcode "+opcode);
        }
    }
    public static void arrayStore(Object array,int index,Object value,int opcode) {
        switch(opcode){
            case 79:((int[])array)[index]=i(value);return;case 80:((long[])array)[index]=j(value);return;
            case 81:((float[])array)[index]=f(value);return;case 82:((double[])array)[index]=d(value);return;
            case 83:((Object[])array)[index]=value;return;
            case 84:if(array instanceof boolean[])((boolean[])array)[index]=z(value);else ((byte[])array)[index]=(byte)i(value);return;
            case 85:((char[])array)[index]=(char)i(value);return;case 86:((short[])array)[index]=(short)i(value);return;
            default:throw new VerifyError("Unknown array store opcode "+opcode);
        }
    }
    public static int arrayLength(Object value){return Array.getLength(value);}
    /** Preserve an original final field's flags while restoring its constructor assignment. */
    public static void initializeFinal(Object receiver,Class<?> owner,String name,Object value) {
        try {
            java.lang.reflect.Field field=owner.getDeclaredField(name);field.setAccessible(true);
            Class<?> type=field.getType();
            if(type==boolean.class)value=z(value);
            else if(type==byte.class)value=(byte)i(value);
            else if(type==short.class)value=(short)i(value);
            else if(type==char.class)value=(char)i(value);
            field.set(receiver,value);
        }catch(ReflectiveOperationException failure){BytecodeFrame.<RuntimeException>unchecked(failure);}
    }
    @SuppressWarnings("unchecked")
    private static <E extends Throwable> void unchecked(Throwable error)throws E{throw (E)error;}
    public static <T> T rethrow(Throwable error){BytecodeFrame.<RuntimeException>unchecked(error);return null;}
}
