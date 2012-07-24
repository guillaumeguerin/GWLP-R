/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-07-19
 */

package com.gamerevision.gwlpr.actions.loginserver.ctos;

import com.realityshard.shardlet.EventAggregator;
import com.realityshard.shardlet.GenericEventAction;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P026_UnknownAction extends GenericEventAction
{

    private int unknown1;
    private int unknown2;
    private char[] unknown3;
    private char[] unknown4;


    public short getHeader()
    {
        return 26;
    }


    public int getUnknown1()
    {
        return unknown1;
    }


    public int getUnknown2()
    {
        return unknown2;
    }


    public char[] getUnknown3()
    {
        return unknown3;
    }


    public char[] getUnknown4()
    {
        return unknown4;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            unknown1 = buffer.getInt();
            unknown2 = buffer.getInt();
            short prefix_unknown3 = buffer.getShort();
            unknown3 = new char[prefix_unknown3];
            
            for (int i = 0; i < prefix_unknown3; i++)
            {
                unknown3[i] = buffer.getChar();
            }
            short prefix_unknown4 = buffer.getShort();
            unknown4 = new char[prefix_unknown4];
            
            for (int i = 0; i < prefix_unknown4; i++)
            {
                unknown4[i] = buffer.getChar();
            }
        }
        catch (BufferUnderflowException e)
        {
            buffer.position(bufferPosition);
            return false;
        }

        return true;
    }


    @Override
    public void triggerEvent(EventAggregator aggregator)
    {
        aggregator.triggerEvent(this);
    }
}