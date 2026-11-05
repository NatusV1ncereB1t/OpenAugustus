package net;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
public class C_47qi {
 private int field_42; private short field_43; private boolean field_45;
 public void method_40$47ef0626ef(C_47JQ buffer) throws java.io.IOException {
  if (C_47AC.field_45.newerThanOrEqualTo(ProtocolVersion.v1_17)) {
   this.field_42 = buffer.readInt();
  } else {
   this.field_42 = buffer.readUnsignedByte();
   this.field_43 = buffer.readShort();
   this.field_45 = buffer.readBoolean();
  }
 }
}
