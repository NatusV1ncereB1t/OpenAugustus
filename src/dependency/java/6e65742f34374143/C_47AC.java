package net;
import client.setting.Setting;
import com.viaversion.viabackwards.protocol.v1_17to1_16_4.Protocol1_17To1_16_4;
import com.viaversion.vialoader.ViaLoader;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.exception.InformativeException;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import io.netty.util.AttributeKey;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.C_4713;
import net.C_47IO;
import net.C_47K6;
import net.C_47jt;
import net.C_47qq;
import net.C_4f;
import net.minecraft.client.Minecraft;
public class C_47AC {
    static com.viaversion.viaversion.api.protocol.version.ProtocolVersion field_45;
    static io.netty.util.AttributeKey field_40;
    static client.setting.Setting[] field_49;
    static long a;
    static java.lang.Object[] b;
    static java.lang.String[] c;

    private static native java.lang.Class b(long arg0,long arg1);
    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);
    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);
    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);
    private static native java.lang.Exception a(java.lang.Exception arg0);
    private static native int a(long arg0,long arg1);
    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);
    private static native java.lang.String a(byte[] arg0);
    private static native void a();
    private static native java.lang.reflect.Method d(long arg0,long arg1);
    public static native client.setting.Setting[] method_40$19d51fe81e();
    private static native void method_45$3b8c2201c7(com.viaversion.viaversion.api.protocol.packet.PacketWrapper arg0) throws com.viaversion.viaversion.exception.InformativeException;
    public static native void method_45$5994d1a418(client.setting.Setting[] arg0);
    private static native void method_47$3b8c2201c7(com.viaversion.viaversion.api.protocol.packet.PacketWrapper arg0) throws com.viaversion.viaversion.exception.InformativeException;
    private static native java.lang.reflect.Field c(long arg0,long arg1);
    private static native MethodHandle recovery$constant$0();
    private static native Supplier recovery$indy$1();
    private static native Supplier recovery$indy$2();
    private static native Supplier recovery$indy$3();
    private static native Supplier recovery$indy$4();
    private static native Setting[] recovery$indy$5(long var0, long var2);
    private static native PacketHandler recovery$indy$6();
    private static native PacketHandler recovery$indy$7();
    private static native void recovery$indy$8(Object var0, long var1, long var3);
    private static native C_47K6 recovery$indy$9(Object var0, long var1, long var3);
    private static native Setting[] recovery$indy$10(long var0, long var2);
    private static native void recovery$indy$11(Object var0, long var1, long var3);
    public static void method_42$e45a9973e5(long l) {
        l = a ^ l;
        ViaLoader.init(null, (ViaPlatformLoader)new C_47qq(), (ViaInjector)new C_47IO(), null, (Supplier[])new Supplier[]{C_47AC.recovery$indy$1(), C_47AC.recovery$indy$2(), C_47AC.recovery$indy$3(), C_47AC.recovery$indy$4()});
        Protocol1_17To1_16_4 protocol1_17To1_16_4 = (Protocol1_17To1_16_4)Via.getManager().getProtocolManager().getProtocol(Protocol1_17To1_16_4.class);
        Setting[] settingArray = C_47AC.recovery$indy$5(9048939421738180439L, l);
        protocol1_17To1_16_4.registerClientbound(ClientboundPackets1_17.PING, ClientboundPackets1_16_2.CONTAINER_ACK, C_47AC.recovery$indy$6(), true);
        Setting[] settingArray2 = settingArray;
        
            protocol1_17To1_16_4.registerServerbound(ServerboundPackets1_16_2.CONTAINER_ACK, ServerboundPackets1_17.PONG, C_47AC.recovery$indy$7(), true);
            if (settingArray2 != null) {
                C_47AC.recovery$indy$8(new String[3], 9049409861400828063L, l);
            }
        
    }

    public static double method_41$474dfaa627(long l) {
        l = a ^ l;
        
            if (field_45.newerThan(ProtocolVersion.v1_9)) {
                return 0.003;
            }
        
        return 0.005;
    }

    public static void method_43$f84fd1f462(int n, int n2, char c) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ a;
        if (field_45.olderThanOrEqualTo(ProtocolVersion.v1_11_1)) {
            Minecraft minecraft = Minecraft.method_46$28f1e2a3f8();
            C_47AC.recovery$indy$9(minecraft, 3298025558061127723L, l).method_45$631790539f(new C_47jt(C_4713.OPEN_INVENTORY_ACHIEVEMENT));
        }
    }
}
