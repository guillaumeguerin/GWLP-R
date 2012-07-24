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
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P450_UnknownAction extends GenericAction
{

    private short unknown1;
    private short unknown2;
    private byte unknown3;


    public short getHeader()
    {
        return 450;
    }


    public void setUnknown1(short newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(short newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(byte newValue)
    {
        unknown3 = newValue;
    }


    private int getSize()
    {
        return 7;
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

            buffer.putShort(unknown1);
            buffer.putShort(unknown2);
            buffer.put(unknown3);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}