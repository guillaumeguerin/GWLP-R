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
public final class P003_UnknownAction extends GenericEventAction
{

    private int unknown1;
    private char[] unknown2;
    private byte[] unknown3;
    private char[] unknown4;


    public short getHeader()
    {
        return 3;
    }


    public int getUnknown1()
    {
        return unknown1;
    }


    public char[] getUnknown2()
    {
        return unknown2;
    }


    public byte[] getUnknown3()
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
            short prefix_unknown2 = buffer.getShort();
            unknown2 = new char[prefix_unknown2];
            
            for (int i = 0; i < prefix_unknown2; i++)
            {
                unknown2[i] = buffer.getChar();
            }
            unknown3 = new byte[20];
            
            for (int i = 0; i < 20; i++)
            {
                unknown3[i] = buffer.get();
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