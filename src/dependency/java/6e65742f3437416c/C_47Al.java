package net;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
public class C_47Al {
 private int field_49; private short field_41; private boolean field_48;
 public void method_49$47ef0626ef(C_47JQ buffer) throws java.io.IOException {
  if (C_47AC.field_45.newerThanOrEqualTo(ProtocolVersion.v1_17)) {
   buffer.writeInt(this.field_49);
  } else {
   buffer.writeByte(this.field_49);
   buffer.writeShort(this.field_41);
   buffer.writeByte(this.field_48 ? 1 : 0);
  }
 }
}
