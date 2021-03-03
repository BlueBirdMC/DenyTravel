package dev.codedred.denytravel.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityPortalEvent;

public class EntityTravelEvent extends Event implements Cancellable {
	
    private boolean isCancelled;
    private final EntityPortalEvent portalEvent;
	
	public EntityTravelEvent(EntityPortalEvent portalEvent) {
		this.portalEvent = portalEvent;
	}

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
        portalEvent.setCancelled(true);
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
    
    public Entity getEntity() {
    	return portalEvent.getEntity();
    }
    
    public EntityType getEntityType() {
    	return portalEvent.getEntityType();
    }

    

}