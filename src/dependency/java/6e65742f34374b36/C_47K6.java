package net;
import com.mojang.authlib.GameProfile;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import java.util.Random;
import net.C_42C;
import net.C_473U;
import net.C_479m;
import net.C_47AC;
import net.C_47Mt;
import net.C_47WQ;
import net.C_47ri;
import net.C_47tf;
import net.C_47xZ;
import net.C_47yI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.WorldClient;
import org.apache.logging.log4j.Logger;
import client.Client;
import client.module.ModuleManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.C_477r;
import net.C_47Al;
import net.C_47S6;
import net.C_47gG;
import net.C_47qi;
import net.C_47y6;
import net.minecraft.entity.player.EntityPlayer;
public abstract class C_47K6 implements C_47Ou, C_475V {
    static org.apache.logging.log4j.Logger field_49E;
    net.C_47ri field_40;
    com.mojang.authlib.GameProfile field_49M;
    net.minecraft.client.gui.GuiScreen field_49g;
    net.minecraft.client.Minecraft field_41;
    net.minecraft.client.multiplayer.WorldClient field_42;
    boolean field_46;
    java.util.Map field_47;
    java.util.Map field_44;
    int field_45;
    boolean field_48;
    java.util.Random field_49;
    static long a;
    static java.lang.String[] b;
    static java.lang.String[] c;
    static java.util.Map d;
    static java.lang.Object[] e;
    static java.lang.String[] f;

    private static native java.lang.reflect.Method b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);
    private static native java.lang.Class b(long arg0,long arg1);
    private static native java.lang.reflect.Field b(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);
    private static native java.lang.String a(int arg0,long arg1);
    private static native java.lang.Exception a(java.lang.Exception arg0);
    private static native java.lang.String a(byte[] arg0);
    private static native java.lang.reflect.Method a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2,int arg3,java.lang.Class[] arg4);
    private static native void a();
    private static native java.lang.reflect.Field a(java.lang.Class arg0,java.lang.String arg1,java.lang.Class arg2);
    private static native int a(long arg0,long arg1);
    private static native java.lang.reflect.Method d(long arg0,long arg1);
    public native void method_45$631790539f(net.C_473U arg0);
    private static native java.lang.reflect.Field c(long arg0,long arg1);
    private static native ModuleManager recovery$indy$2(Object var0, long var1, long var3);
    private static native WorldClient recovery$indy$6(Object var0, long var1, long var3);
    private static native WorldClient recovery$indy$7(Object var0, long var1, long var3);
    private static native String recovery$indy$8(int var0, long var1);
    private static native String recovery$indy$20(int var0, long var1);
    private static native EntityPlayerSP recovery$indy$54(Object var0, long var1, long var3);
    private static native EntityPlayerSP recovery$indy$55(Object var0, long var1, long var3);
    private static native EntityPlayerSP recovery$indy$56(Object var0, long var1, long var3);
    private static native EntityPlayerSP recovery$indy$57(Object var0, long var1, long var3);
    private static native Client recovery$indy$58(long var0, long var2);
    private static native C_47S6 recovery$indy$59(Object var0, long var1, long var3);
    private static native boolean recovery$indy$60(Object var0, long var1, long var3, long var5);
    private static native Client recovery$indy$61(long var0, long var2);
    private static native C_47S6 recovery$indy$62(Object var0, long var1, long var3);
    private static native C_477r recovery$indy$63(Object var0, long var1, long var3);
    private static native Client recovery$indy$64(long var0, long var2);
    private static native C_47S6 recovery$indy$65(Object var0, long var1, long var3);
    private static native boolean recovery$indy$66(Object var0, long var1, long var3, long var5);
    private static native Client recovery$indy$67(long var0, long var2);
    private static native C_47S6 recovery$indy$68(Object var0, long var1, long var3);
    private static native C_477r recovery$indy$69(Object var0, long var1, long var3);
    private static native Client recovery$indy$70(long var0, long var2);
    private static native ModuleManager recovery$indy$71(Object var0, long var1, long var3);
    private static native boolean recovery$indy$72(Object var0, long var1, long var3, long var5);
    private static native Client recovery$indy$73(long var0, long var2);
    private static native ModuleManager recovery$indy$74(Object var0, long var1, long var3);
    private static native String recovery$indy$75(Object var0, long var1, long var3, long var5);
    private static native String recovery$indy$76(int var0, long var1);
    private static native Client recovery$indy$77(long var0, long var2);
    private static native C_47y6 recovery$indy$78(Object var0, long var1, long var3);
    private static native boolean recovery$indy$79(Object var0, long var1, long var3, long var5);
    private static native void recovery$indy$80(Object var0, long var1, Object var3, boolean var4, long var5, long var7);
    private static native EntityPlayerSP recovery$indy$81(Object var0, long var1, long var3);
    private static native EntityPlayerSP recovery$indy$82(Object var0, long var1, long var3);
    private static native EntityPlayerSP recovery$indy$83(Object var0, long var1, long var3);
    private static native EntityPlayerSP recovery$indy$84(Object var0, long var1, long var3);
    private static native EntityPlayerSP recovery$indy$85(Object var0, long var1, long var3);
    private static native EntityPlayerSP recovery$indy$86(Object var0, long var1, long var3);
    private static native void recovery$indy$87(Object var0, Object var1, long var2, long var4);
    private static native EntityPlayerSP recovery$indy$207(Object var0, long var1, long var3);
    public java.util.Map method_48$43b9f1ea53() {
        return this.field_44;
    }

    public net.C_47ri method_49$431840b606() {
        return this.field_40;
    }

    public com.mojang.authlib.GameProfile method_47$cd99b948a0() {
        return this.field_49M;
    }

    public void method_47$b322b6566e(C_47qi packet) {
        long key = a ^ 81385916878878L;
        C_42C.method_41$21377cdc94(packet, this, field_41);
        if (C_47AC.field_45.newerThanOrEqualTo(ProtocolVersion.v1_17)) {
            method_45$631790539f(new C_47Al(packet.method_49$8abf5c6871()));
            return;
        }
        C_47gG container = null;
        EntityPlayerSP player = recovery$indy$207(field_41, -8480483827718326532L, key);
        if (packet.method_49$8abf5c6871() == 0) {
            container = ((EntityPlayer)player).field_429;
        } else if (packet.method_49$8abf5c6871() == ((EntityPlayer)player).field_42e.field_43) {
            container = ((EntityPlayer)player).field_42e;
        }
        if (container != null && !packet.method_48$aae029aa0a()) {
            method_45$631790539f(new C_47Al(packet.method_49$8abf5c6871(), packet.method_42$4e726cd320(), true));
        }
    }
    public void method_40$97318188b2(C_47xZ packet) {
        block30: {
            long ownerKey;
            long keyBase = ownerKey = a ^ 0x77D6BE37B01L;
            long noRotateKey = keyBase ^ 0x772E1350AF1DL;
            long eventKey = keyBase ^ 0xE6E3580F12FL;
            long packetKey = keyBase ^ 0x56776D13253FL;
            long modeKey = keyBase ^ 0x1092CE4A64B6L;
            long rotationKey = keyBase ^ 0x567BDD5CB7C9L;
            C_42C.method_41$21377cdc94((C_473U)packet, (C_47WQ)this, (C_47yI)this.field_41);
            EntityPlayerSP player = C_47K6.recovery$indy$54((Object)this.field_41, (long)-6822942871253000733L, (long)ownerKey);
            double d = packet.method_40$fedcb3e4d3();
            double d2 = packet.method_48$fedcb3e4d3();
            double d3 = packet.method_46$fedcb3e4d3();
            float f = packet.method_40$bc607678b6();
            float f2 = packet.method_41$bc607678b6();
            C_47tf previousVelocity = new C_47tf(C_47K6.recovery$indy$55((Object)C_47K6.field_43, (long)-6822942871253000733L, (long)ownerKey).field_48s, C_47K6.recovery$indy$56((Object)C_47K6.field_43, (long)-6822942871253000733L, (long)ownerKey).field_42, C_47K6.recovery$indy$57((Object)C_47K6.field_43, (long)-6822942871253000733L, (long)ownerKey).field_487);
            double d4 = 0.0;
            double d5 = 0.0;
            double d6 = 0.0;
            double d7 = 0.0;
            double d8 = 0.0;
            double d9 = 0.0;
            boolean modernProtocol = C_47AC.field_45.newerThanOrEqualTo(ProtocolVersion.v1_17);
            if (packet.method_46$9aa7af2ac9().contains(C_47Mt.X)) {
                if (modernProtocol) {
                    d4 = previousVelocity.field_40;
                    d7 = player.field_48Q + d3;
                    player.field_48u += d3;
                    player.field_48a += d3;
                } else {
                    d += player.field_48Q;
                }
            } else if (modernProtocol) {
                d4 = 0.0;
                player.field_48u = d7 = d3;
                player.field_48a = d7;
            } else {
                player.field_48s = 0.0;
            }
            if (packet.method_46$9aa7af2ac9().contains(C_47Mt.Y)) {
                if (modernProtocol) {
                    d5 = previousVelocity.field_41;
                    d8 = player.field_48j + d2;
                    player.field_48O += d2;
                    player.field_48G += d2;
                } else {
                    d2 += player.field_48j;
                }
            } else if (modernProtocol) {
                d5 = 0.0;
                player.field_48O = d8 = d2;
                player.field_48G = d8;
            } else {
                player.field_42 = 0.0;
            }
            if (packet.method_46$9aa7af2ac9().contains(C_47Mt.Z)) {
                if (modernProtocol) {
                    d6 = previousVelocity.field_47;
                    d9 = player.field_42o + d;
                    player.field_48l += d;
                    player.field_48q += d;
                } else {
                    d3 += player.field_42o;
                }
            } else if (modernProtocol) {
                d6 = 0.0;
                player.field_48l = d9 = d;
                player.field_48q = d9;
            } else {
                player.field_487 = 0.0;
            }
            if (modernProtocol) {
                player.method_46$a59262c0f0(d7, d8, d9);
                player.field_48s = d4;
                player.field_42 = d5;
                player.field_487 = d6;
            }
            if (packet.method_46$9aa7af2ac9().contains(C_47Mt.X_ROT)) {
                if (modernProtocol) {
                    player.field_48z += f2;
                    player.field_44 = player.field_48z;
                } else {
                    f2 += C_47K6.recovery$indy$60((Object)C_47K6.recovery$indy$59((Object)C_47K6.recovery$indy$58((long)-6824069578730599089L, (long)ownerKey), (long)-6824867972095952116L, (long)ownerKey), (long)rotationKey, (long)-6821838610382169388L, (long)ownerKey) ? player.field_48z : C_47K6.recovery$indy$63((Object)C_47K6.recovery$indy$62((Object)C_47K6.recovery$indy$61((long)-6824069578730599089L, (long)ownerKey), (long)-6824867972095952116L, (long)ownerKey), (long)-6822299353480195529L, (long)ownerKey).field_41;
                }
            } else if (modernProtocol) {
                player.field_48z = f2;
                player.field_44 = player.field_48z;
            }
            if (packet.method_46$9aa7af2ac9().contains(C_47Mt.Y_ROT)) {
                if (modernProtocol) {
                    player.field_48h += f;
                    player.field_48p = player.field_48h;
                } else {
                    f += C_47K6.recovery$indy$66((Object)C_47K6.recovery$indy$65((Object)C_47K6.recovery$indy$64((long)-6824069578730599089L, (long)ownerKey), (long)-6824867972095952116L, (long)ownerKey), (long)rotationKey, (long)-6821838610382169388L, (long)ownerKey) ? player.field_48h : C_47K6.recovery$indy$69((Object)C_47K6.recovery$indy$68((Object)C_47K6.recovery$indy$67((long)-6824069578730599089L, (long)ownerKey), (long)-6824867972095952116L, (long)ownerKey), (long)-6822299353480195529L, (long)ownerKey).field_44;
                }
            } else if (modernProtocol) {
                player.field_48h = f;
                player.field_48p = player.field_48h;
            }
            player.method_48$bd229ade05(d, d2, d3, f, f2);
            if (!C_47K6.recovery$indy$72((Object)C_47K6.recovery$indy$71((Object)C_47K6.recovery$indy$70((long)-6824069578730599089L, (long)ownerKey), (long)-6822234290538154890L, (long)ownerKey).field_46s, (long)noRotateKey, (long)-6822614638543057008L, (long)ownerKey) || !C_47K6.recovery$indy$75((Object)C_47K6.recovery$indy$74((Object)C_47K6.recovery$indy$73((long)-6824069578730599089L, (long)ownerKey), (long)-6822234290538154890L, (long)ownerKey).field_46s.settingMode, (long)modeKey, (long)-6822459236478898861L, (long)ownerKey).equalsIgnoreCase(C_47K6.recovery$indy$76((int)10300, (long)(0x260CA184042F08B6L ^ ownerKey)))) {
                C_47K6.recovery$indy$80((Object)C_47K6.recovery$indy$78((Object)C_47K6.recovery$indy$77((long)-6824069578730599089L, (long)ownerKey), (long)-6823539102603953752L, (long)ownerKey), (long)eventKey, (Object)player, (boolean)C_47K6.recovery$indy$79((Object)packet, (long)packetKey, (long)-6822544450461725127L, (long)ownerKey), (long)-6822042619272538310L, (long)ownerKey);
            }
            this.field_40.method_45$631790539f((C_473U)new C_479m(player.field_48Q, player.method_45$6684d3c618().field_46 + (double)packet.method_42$bc607678b6(), player.field_42o, player.field_48h, player.field_48z, false));
            if (this.field_46) break block30;
            C_47K6.recovery$indy$81((Object)this.field_41, (long)-6822942871253000733L, (long)ownerKey).field_48a = C_47K6.recovery$indy$82((Object)this.field_41, (long)-6822942871253000733L, (long)ownerKey).field_48Q;
            C_47K6.recovery$indy$83((Object)this.field_41, (long)-6822942871253000733L, (long)ownerKey).field_48G = C_47K6.recovery$indy$84((Object)this.field_41, (long)-6822942871253000733L, (long)ownerKey).field_48j;
            C_47K6.recovery$indy$85((Object)this.field_41, (long)-6822942871253000733L, (long)ownerKey).field_48q = C_47K6.recovery$indy$86((Object)this.field_41, (long)-6822942871253000733L, (long)ownerKey).field_42o;
            this.field_46 = true;
            C_47K6.recovery$indy$87((Object)this.field_41, (Object)null, (long)-6823361573124833992L, (long)ownerKey);
        }
    }
}
