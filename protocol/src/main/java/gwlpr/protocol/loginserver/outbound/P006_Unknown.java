
package gwlpr.protocol.loginserver.outbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P006_Unknown
    extends GWMessage
{

    private long unknown1;
    @IsArray(constant = true, size = 8, prefixLength = -1)
    private byte[] unknown2;
    @IsArray(constant = true, size = 8, prefixLength = -1)
    private byte[] unknown3;
    @IsArray(constant = true, size = 8, prefixLength = -1)
    private byte[] unknown4;
    @IsArray(constant = true, size = 8, prefixLength = -1)
    private byte[] unknown5;
    private long unknown6;

    @Override
    public short getHeader() {
        return  6;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(byte[] unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(byte[] unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(byte[] unknown4) {
        this.unknown4 = unknown4;
    }

    public void setUnknown5(byte[] unknown5) {
        this.unknown5 = unknown5;
    }

    public void setUnknown6(long unknown6) {
        this.unknown6 = unknown6;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P006_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(Arrays.toString(this.unknown2)).append(",unknown3=").append(Arrays.toString(this.unknown3)).append(",unknown4=").append(Arrays.toString(this.unknown4)).append(",unknown5=").append(Arrays.toString(this.unknown5)).append(",unknown6=").append(this.unknown6).append("]");
        return sb.toString();
    }

}
