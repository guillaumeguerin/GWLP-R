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
public final class P342_UnknownAction extends GenericAction
{

    public final class NestedUnknown5
    {
    
        private int unknown6;


        public void setUnknown6(int newValue)
        {
            unknown6 = newValue;
        }


        private int getSize()
        {
            return 4;
        }


        public boolean serialize(ByteBuffer buffer)
        {
            try
            {
                buffer.putInt(unknown6);
            }
            catch (BufferOverflowException e)
            {
                return false;
            }

            return true;
        }
    }


    private int unknown1;
    private int unknown2;
    private int unknown3;
    private char[] unknown4;
    private NestedUnknown5[] unknown5;


    public short getHeader()
    {
        return 342;
    }


    public void setUnknown1(int newValue)
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


    public void setUnknown5(NestedUnknown5[] newValue)
    {
        unknown5 = newValue;
    }


    private int getSize()
    {
        int size = 17;

        if (unknown4 != null)
        {
            size += 2 * unknown4.length;
        }
        if (unknown5 != null)
        {
            for (NestedUnknown5 entry : unknown5)
            {
                int nextSize = entry.getSize();
        
                if (nextSize == 0)
                {
                    return 0;
                }
        
                size += entry.getSize();
            }
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

            buffer.putInt(unknown1);
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
            byte prefix_unknown5;
            if (unknown5 == null)
            {
                prefix_unknown5 = 0;
            }
            else
            {
                prefix_unknown5 = (byte) unknown5.length;
            }
            buffer.put(prefix_unknown5);
            
            for (int i = 0; i < prefix_unknown5; i++)
            {
                if (!unknown5[i].serialize(buffer))
                {
                    return false;
                }
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