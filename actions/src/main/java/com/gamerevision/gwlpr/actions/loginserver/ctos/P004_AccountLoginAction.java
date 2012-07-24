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
 *
 * @author GWLPR Template Updater
 */
public final class P004_AccountLoginAction extends GenericEventAction
{

    private int loginCount;
    private short data1;
    private byte[] password;
    private short data3;
    private char[] email;
    private char[] data2;
    private char[] characterName;


    public short getHeader()
    {
        return 4;
    }


    public int getLoginCount()
    {
        return loginCount;
    }


    public short getData1()
    {
        return data1;
    }


    public byte[] getPassword()
    {
        return password;
    }
    
    
    public short getData3()
    {
        return data3;
    }


    public char[] getEmail()
    {
        return email;
    }


    public char[] getData2()
    {
        return data2;
    }


    public char[] getCharacterName()
    {
        return characterName;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            loginCount = buffer.getInt();
            data1 = buffer.getShort();
            password = new byte[20];
            
            for (int i = 0; i < 20; i++)
            {
                password[i] = buffer.get();
            }
            
            data3 = buffer.getShort();
            
            short prefix_email = buffer.getShort();
            email = new char[prefix_email];
            
            for (int i = 0; i < prefix_email; i++)
            {
                email[i] = buffer.getChar();
            }
            short prefix_data2 = buffer.getShort();
            data2 = new char[prefix_data2];
            
            for (int i = 0; i < prefix_data2; i++)
            {
                data2[i] = buffer.getChar();
            }
            short prefix_characterName = buffer.getShort();
            characterName = new char[prefix_characterName];
            
            for (int i = 0; i < prefix_characterName; i++)
            {
                characterName[i] = buffer.getChar();
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