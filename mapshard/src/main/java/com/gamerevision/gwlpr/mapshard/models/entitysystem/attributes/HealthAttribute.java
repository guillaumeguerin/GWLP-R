/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.mapshard.models.entitysystem.attributes;

import com.realityshard.entitysystem.AttributeComponent;
import com.realityshard.entitysystem.Entity;
//import com.realityshard.entitysystem.EntityEventAggregator;
import com.gamerevision.gwlpr.mapshard.models.entitysystem.events.OnDeath;
import com.realityshard.entitysystem.ComponentManager;
import com.realityshard.shardlet.EventAggregator;
import com.realityshard.shardlet.EventHandler;


/**
 * This class resembles a health attribute
 * 
 * TODO: make sure this attribute is threadsafe!
 * 
 * @author _rusty
 */

// TODO: i had to comment out most parts to make it runnable again ~miracle444

public final class HealthAttribute implements AttributeComponent
{
     
    private int max;
    private int current;
    private Entity entity;
    //private EntityEventAggregator aggregator;
    
    
    @Override
    public void init(ComponentManager compman, EventAggregator aggregator) {
        
    }
    
    /**
     * Constructor.
     * 
     * @param maxHealth 
     */
    public HealthAttribute(int maxHealth)
    {
        this.max = maxHealth;
        this.current = maxHealth;
    }
    
    
    /**
     * Constructor.
     * 
     * @param       entity                  The enetity that this attribute concerns
     * @param       aggregator              The aggregator where we can trigger and handle events           
     */
    //public HealthAttribute(Entity entity, EntityEventAggregator aggregator) 
    //{
    //  this.entity = entity;
    //  this.aggregator = aggregator;
    //}
    
    
    /**
     * Eventhandler.
     * 
     * Usually, this event is only triggered by this component itself.
     * But if we didnt trigger the OnDie event, we need to make sure that
     * the entity really has 0 health points ;D
     * 
     * @param die 
     */
    @EventHandler
    public void handleDieEvent(OnDeath die)
    {
        current = 0;
    }

    
    /**
     * Getter.
     * 
     * @return       The current health of an entity.
     */
    public int getValue() 
    {
        return current;
    }

    
    /**
     * Setter.
     * 
     * @param       current                 Set the new health of an entity 
     */
    public void setValue(int current) 
    {
        // make sure that the value is not lower than 0
        if (current <= 0) 
        { 
            this.current = 0;
            // as the entity reached 0 health points,
            // we may want to let other know that it died :D
            //aggregator.triggerEntityEvent(entity, new OnDeath());
            return;
        }
        // and doesnt exceed the maximum
        else if (current > max)
        {
            this.current = max;
            return;
        }
        
        this.current = current;
    }
    
    
    /**
     * Getter.
     * 
     * @return      The maximum health of an entity.
     */
    public int getMax() 
    {
        return max;
    }

    
    /**
     * Setter.
     * 
     * @param       max                     Set the new maximum health of an entity
     */
    public void setMax(int max) 
    {
        this.max = max;
    }
}