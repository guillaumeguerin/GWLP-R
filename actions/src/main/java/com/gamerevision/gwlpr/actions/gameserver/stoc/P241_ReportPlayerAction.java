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
public final class P241_ReportPlayerAction extends GenericAction
{

    private char[] characterName;
    private byte isPvP;


    public short getHeader()
    {
        return 241;
    }


    public void setCharacterName(char[] newValue)
    {
        characterName = newValue;
    }


    /**
     * Determines whether the leeching option will be enabled 
     */
    public void setisPvP(byte newValue)
    {
        isPvP = newValue;
    }


    private int getSize()
    {
        int size = 5;

        if (characterName != null)
        {
            size += 2 * characterName.length;
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

            short prefix_characterName;
            if (characterName == null)
            {
                prefix_characterName = 0;
            }
            else
            {
                prefix_characterName = (short) characterName.length;
            }
            buffer.putShort(prefix_characterName);
            
            for (int i = 0; i < prefix_characterName; i++)
            {
                buffer.putChar(characterName[i]);
            }
            buffer.put(isPvP);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}