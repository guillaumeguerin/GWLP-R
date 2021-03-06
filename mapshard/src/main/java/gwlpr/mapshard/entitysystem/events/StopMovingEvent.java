/**
 * For copyright information see the LICENSE document.
 */

package gwlpr.mapshard.entitysystem.events;

import gwlpr.mapshard.entitysystem.Entity;
import realityshard.container.events.Event;


/**
 * Triggered when an entity stops moving
 *
 * @author _rusty
 */
public class StopMovingEvent implements Event
{

    private final Entity thisEntity;


    /**
     * Constructor.
     *
     * @param thisEntity
     */
    public StopMovingEvent(Entity thisEntity)
    {
        this.thisEntity = thisEntity;
    }


    /**
     * Getter.
     * 
     * @return
     */
    public Entity getThisEntity()
    {
        return thisEntity;
    }
}
