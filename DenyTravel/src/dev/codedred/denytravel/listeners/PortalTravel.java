package dev.codedred.denytravel.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEvent;

import dev.codedred.denytravel.enums.Travelers;
import dev.codedred.denytravel.events.EntityTravelEvent;

public class PortalTravel implements Listener {

	@EventHandler
	public void onPortalTravel(EntityPortalEvent event) {
		if (event.getEntity() instanceof Player)
			return;
		
		if (event.getEntity() instanceof Animals) {
			if (Travelers.ALL_ANIMALS.isDenied()) {
				event.setCancelled(true);
				return;
			}
		}
		else if (event.getEntity() instanceof Monster) {
			if (Travelers.ALL_MONSTERS.isDenied()) {
				event.setCancelled(true);
				return;
			}
		}
		else {
			if (Travelers.ALL_ENTITIES.isDenied()) {
				event.setCancelled(true);
				return;
			}
		}
		
		Bukkit.getPluginManager().callEvent(new EntityTravelEvent(event));
		return;
		
	}
}




















