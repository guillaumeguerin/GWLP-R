
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.Vector2;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P156_Unknown
    extends GWMessage
{

    private Vector2 unknown1;
    private int unknown2;
    private long unknown3;

    @Override
    public short getHeader() {
        return  156;
    }

    public void setUnknown1(Vector2 unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(int unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(long unknown3) {
        this.unknown3 = unknown3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P156_Unknown[");
        sb.append("unknown1=").append(this.unknown1 .toString()).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append("]");
        return sb.toString();
    }

}