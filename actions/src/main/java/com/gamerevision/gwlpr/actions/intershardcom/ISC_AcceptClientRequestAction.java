/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.actions.intershardcom;

import com.realityshard.shardlet.EventAggregator;
import com.realityshard.shardlet.GenericEventAction;
import com.realityshard.shardlet.Session;

/**
 * Request from the LoginShard to a MapShard to accept a session.
 *
 * @author miracle444
 */
public final class ISC_AcceptClientRequestAction extends GenericEventAction
{

    private int key1;
    private int key2;
    
    
    /**
     * Constructor.
     * 
     * @param   session     the session to be accepted by the MapShard.
     */
    public ISC_AcceptClientRequestAction(Session session, int key1, int key2)
    {
        init(session);
        this.key1 = key1;
        this.key2 = key2;
    }

        
    public int getKey1() 
    {
        return key1;
    }
    
        
    public int getKey2() 
    {
        return key2;
    }
    
    
    @Override
    public void triggerEvent(EventAggregator aggregator)
    {
        aggregator.triggerEvent(this);
    }
}