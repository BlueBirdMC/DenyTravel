package dev.codedred.denytravel.data;

import org.bukkit.configuration.file.FileConfiguration;

import dev.codedred.denytravel.DenyTravel;
import dev.codedred.denytravel.enums.Travelers;

public class DataManager {

	private static DataManager instance = null;
	
	public static DataManager getInstance() {
		if (instance == null)
			instance = new DataManager();
		return instance;
	}
	
	private CustomFile config = new CustomFile(DenyTravel.getPlugin(DenyTravel.class), "config.yml");
	
	public FileConfiguration getConfig() {
		return config.getConfig();
	}
	
	public void reload() {
		config.reloadConfig();
	}
	
	public void save() {
		config.saveConfig();
	}
	
	public void registerEntities() {
		config.getConfig().getConfigurationSection("entity-travel.allow-entity").getKeys(false).forEach(livingEntity -> {
			if (Travelers.isValid(livingEntity))
				Travelers.valueOf(livingEntity).setPermission(config.getConfig().getBoolean("entity-travel.allow-entity." + livingEntity));
		});
	}

}



















