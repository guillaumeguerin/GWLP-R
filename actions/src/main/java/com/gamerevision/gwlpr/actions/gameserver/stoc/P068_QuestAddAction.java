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
 *
 * @author GWLPR Template Updater
 */
public final class P068_QuestAddAction extends GenericAction
{

    private int iD;
    private int status;
    private char[] category;
    private char[] name;
    private char[] givenBy;
    private short mapID;


    public short getHeader()
    {
        return 68;
    }


    public void setID(int newValue)
    {
        iD = newValue;
    }


    public void setStatus(int newValue)
    {
        status = newValue;
    }


    public void setCategory(char[] newValue)
    {
        category = newValue;
    }


    public void setName(char[] newValue)
    {
        name = newValue;
    }


    /**
     * The name of the NPC that gave the quest. 
     */
    public void setGivenBy(char[] newValue)
    {
        givenBy = newValue;
    }


    /**
     * The Map ID where the quest was given. 
     */
    public void setMapID(short newValue)
    {
        mapID = newValue;
    }


    private int getSize()
    {
        int size = 18;

        if (category != null)
        {
            size += 2 * category.length;
        }
        if (name != null)
        {
            size += 2 * name.length;
        }
        if (givenBy != null)
        {
            size += 2 * givenBy.length;
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

            buffer.putInt(iD);
            buffer.putInt(status);
            short prefix_category;
            if (category == null)
            {
                prefix_category = 0;
            }
            else
            {
                prefix_category = (short) category.length;
            }
            buffer.putShort(prefix_category);
            
            for (int i = 0; i < prefix_category; i++)
            {
                buffer.putChar(category[i]);
            }
            short prefix_name;
            if (name == null)
            {
                prefix_name = 0;
            }
            else
            {
                prefix_name = (short) name.length;
            }
            buffer.putShort(prefix_name);
            
            for (int i = 0; i < prefix_name; i++)
            {
                buffer.putChar(name[i]);
            }
            short prefix_givenBy;
            if (givenBy == null)
            {
                prefix_givenBy = 0;
            }
            else
            {
                prefix_givenBy = (short) givenBy.length;
            }
            buffer.putShort(prefix_givenBy);
            
            for (int i = 0; i < prefix_givenBy; i++)
            {
                buffer.putChar(givenBy[i]);
            }
            buffer.putShort(mapID);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}