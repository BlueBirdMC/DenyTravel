package dev.codedred.denytravel.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import dev.codedred.denytravel.enums.Travelers;
import dev.codedred.denytravel.events.EntityTravelEvent;

public class EntityTravel implements Listener {
	
	@EventHandler
	public void onTravel(EntityTravelEvent event) {
		if (Travelers.isValid(event.getEntityType().toString())) {
			if (Travelers.valueOf(event.getEntityType().toString()).isDenied()) {
				event.setCancelled(true);
			}
		}
	}

}
