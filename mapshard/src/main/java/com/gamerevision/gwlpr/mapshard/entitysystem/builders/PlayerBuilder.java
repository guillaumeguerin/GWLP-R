/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.mapshard.entitysystem.builders;

import com.gamerevision.gwlpr.mapshard.entitysystem.Entity;
import com.gamerevision.gwlpr.mapshard.entitysystem.EntityManager;
import com.gamerevision.gwlpr.mapshard.entitysystem.components.Components.*;
import com.gamerevision.gwlpr.mapshard.models.GWVector;


/**
 * Use this class to create a new player entity.
 *
 * @author _rusty
 */
public final class PlayerBuilder
{

    private final Entity entity;


    /**
     * Constructor.
     */
    private PlayerBuilder(Entity entity)
    {
        this.entity = entity;
    }


    /**
     * Start building process.
     */
    public static PlayerBuilder createFor(EntityManager manager)
    {
        // create the entity, and add some default components
        return new PlayerBuilder(
                new Entity(
                    manager,
                    new Movement()));
    }


    /**
     * Step 1.
     */
    public PlayerBuilder withAgentData(String playerName, int playerAgentID, int playerLocalID)
    {
        Name name = new Name(); name.name = playerName;
        AgentID agentID = new AgentID(); agentID.agentID = playerAgentID;
        LocalID localID = new LocalID(); localID.localID = playerLocalID;

        entity.addAll(name, agentID, localID);
        return this;
    }


    /**
     * Step 2.
     */
    public PlayerBuilder withPhysics(
            GWVector playerPosition,
            GWVector playerDirection,
            float boundsRectWidth,
            float boundsRectHeight,
            float boundsPlayerHeight)
    {
        Position position = new Position(); position.position = playerPosition;
        Direction direction = new Direction(); direction.direction = playerDirection;

        BoundingBox bBox = new BoundingBox();
        bBox.width = boundsRectWidth;
        bBox.depth = boundsRectHeight;
        bBox.height = boundsPlayerHeight;

        entity.addAll(position, direction, bBox);
        return this;
    }


    /**
     * Step 3.
     */
    public PlayerBuilder withVisuals(byte[] playerAppearance, float playerViewDistance, boolean isVisible)
    {
        Appearance appearance = new Appearance(); appearance.appearanceDump = playerAppearance;
        View view = new View(); view.viewDistance = playerViewDistance;
        Visibility visibility = new Visibility(); visibility.visible = isVisible;

        entity.addAll(appearance, view, visibility);
        return this;
    }


    /**
     * Step 4.
     *
     * TODO: change this method once this is supported by database features.
     */
    public PlayerBuilder withChatOptions()
    {
        ChatOptions chatOpts = new ChatOptions();

        entity.addAll(chatOpts);
        return this;
    }


    /**
     * Last Step.
     */
    public Entity build()
    {
        // nothing else to do here (currently)
        return entity;
    }
}
