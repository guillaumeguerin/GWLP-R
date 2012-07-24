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
public final class P221_UpdateFactionAction extends GenericAction
{

    private int experience;
    private int kurzickFree;
    private int kurzickTotal;
    private int luxonFree;
    private int luxonTotal;
    private int imperialFree;
    private int imperialTotal;
    private int data1;
    private int data2;
    private int level;
    private int morale;
    private int balthFree;
    private int balthTotal;
    private int skillFree;
    private int skillTotal;


    public short getHeader()
    {
        return 221;
    }


    public void setExperience(int newValue)
    {
        experience = newValue;
    }


    public void setKurzickFree(int newValue)
    {
        kurzickFree = newValue;
    }


    public void setKurzickTotal(int newValue)
    {
        kurzickTotal = newValue;
    }


    public void setLuxonFree(int newValue)
    {
        luxonFree = newValue;
    }


    public void setLuxonTotal(int newValue)
    {
        luxonTotal = newValue;
    }


    public void setImperialFree(int newValue)
    {
        imperialFree = newValue;
    }


    public void setImperialTotal(int newValue)
    {
        imperialTotal = newValue;
    }


    public void setData1(int newValue)
    {
        data1 = newValue;
    }


    public void setData2(int newValue)
    {
        data2 = newValue;
    }


    public void setLevel(int newValue)
    {
        level = newValue;
    }


    public void setMorale(int newValue)
    {
        morale = newValue;
    }


    public void setBalthFree(int newValue)
    {
        balthFree = newValue;
    }


    public void setBalthTotal(int newValue)
    {
        balthTotal = newValue;
    }


    public void setSkillFree(int newValue)
    {
        skillFree = newValue;
    }


    public void setSkillTotal(int newValue)
    {
        skillTotal = newValue;
    }


    private int getSize()
    {
        return 62;
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

            buffer.putInt(experience);
            buffer.putInt(kurzickFree);
            buffer.putInt(kurzickTotal);
            buffer.putInt(luxonFree);
            buffer.putInt(luxonTotal);
            buffer.putInt(imperialFree);
            buffer.putInt(imperialTotal);
            buffer.putInt(data1);
            buffer.putInt(data2);
            buffer.putInt(level);
            buffer.putInt(morale);
            buffer.putInt(balthFree);
            buffer.putInt(balthTotal);
            buffer.putInt(skillFree);
            buffer.putInt(skillTotal);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}