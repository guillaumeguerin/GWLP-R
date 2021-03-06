
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P428_StatusTextTimer
    extends GWMessage
{

    private int time;
    private short hasCancel;
    private String text;

    @Override
    public short getHeader() {
        return  428;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setHasCancel(short hasCancel) {
        this.hasCancel = hasCancel;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P428_StatusTextTimer[");
        sb.append("time=").append(this.time).append(",hasCancel=").append(this.hasCancel).append(",text=").append(this.text.toString()).append("]");
        return sb.toString();
    }

}
