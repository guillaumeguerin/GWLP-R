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
public final class P413_UnknownAction extends GenericAction
{

    private short unknown1;
    private int unknown2;
    private int unknown3;
    private char[] unknown4;


    public short getHeader()
    {
        return 413;
    }


    public void setUnknown1(short newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(int newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(int newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(char[] newValue)
    {
        unknown4 = newValue;
    }


    private int getSize()
    {
        int size = 14;

        if (unknown4 != null)
        {
            size += 2 * unknown4.length;
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

            buffer.putShort(unknown1);
            buffer.putInt(unknown2);
            buffer.putInt(unknown3);
            short prefix_unknown4;
            if (unknown4 == null)
            {
                prefix_unknown4 = 0;
            }
            else
            {
                prefix_unknown4 = (short) unknown4.length;
            }
            buffer.putShort(prefix_unknown4);
            
            for (int i = 0; i < prefix_unknown4; i++)
            {
                buffer.putChar(unknown4[i]);
            }
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}