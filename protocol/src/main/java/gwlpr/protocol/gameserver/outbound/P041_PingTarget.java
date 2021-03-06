
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P041_PingTarget
    extends GWMessage
{

    private int partyMember;
    private long targetAgent;

    @Override
    public short getHeader() {
        return  41;
    }

    public void setPartyMember(int partyMember) {
        this.partyMember = partyMember;
    }

    public void setTargetAgent(long targetAgent) {
        this.targetAgent = targetAgent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P041_PingTarget[");
        sb.append("partyMember=").append(this.partyMember).append(",targetAgent=").append(this.targetAgent).append("]");
        return sb.toString();
    }

}
