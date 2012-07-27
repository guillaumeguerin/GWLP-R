/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-07-19
 */

package com.gamerevision.gwlpr.actions.gameserver.stoc;

import com.realityshard.shardlet.GenericAction;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 * This is used to add guilds to the alliance tab of the 
 * guild window. The guild must first be created with 
 * P278 (or P279 for the player's guild). 
 *
 * @author GWLPR Template Updater
 */
public final class P268_GuildAllyAddAction extends GenericAction
{

    private short localID;
    private byte[] guildHallData;
    private byte type;
    private int joinDate;


    public short getHeader()
    {
        return 268;
    }


    public void setLocalID(short newValue)
    {
        localID = newValue;
    }


    public void setGuildHallData(byte[] newValue)
    {
        guildHallData = newValue;
    }


    public void setType(byte newValue)
    {
        type = newValue;
    }


    public void setJoinDate(int newValue)
    {
        joinDate = newValue;
    }


    private int getSize()
    {
        int size = 25;

        if (guildHallData == null)
        {
            return 0;
        }
        
        if (guildHallData.length != 16)
        {
            return 0;
        }

        return size;
    }


    @Override
    public boolean serialize()
    {
        int size = getSize();

        if (size == 0)
        {
            return false;
        }

        ByteBuffer buffer = ByteBuffer.allocate(size).order(ByteOrder.LITTLE_ENDIAN);

        try
        {
            buffer.putShort(getHeader());

            buffer.putShort(localID);
            for (int i = 0; i < 16; i++)
            {
                buffer.put(guildHallData[i]);
            }
            buffer.put(type);
            buffer.putInt(joinDate);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}