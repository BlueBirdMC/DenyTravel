package dev.codedred.denytravel;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import dev.codedred.denytravel.commands.AdminCommand;
import dev.codedred.denytravel.commands.TabCompletion;
import dev.codedred.denytravel.data.DataManager;
import dev.codedred.denytravel.data.Debugger;
import dev.codedred.denytravel.listeners.EntityTravel;
import dev.codedred.denytravel.listeners.PortalTravel;

public class DenyTravel extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Debugger debug = new Debugger();
		debug.execute();
		
		DataManager data = DataManager.getInstance();
		data.registerEntities();
		
		registerCommands();
		registerListeners();
		registerMetrics();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	private void registerCommands() {
		getCommand("denytravel").setExecutor(new AdminCommand());
		getCommand("denytravel").setTabCompleter(new TabCompletion());
	}
	
	private void registerListeners() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new EntityTravel(), this);
		pm.registerEvents(new PortalTravel(), this);
	}
	
	@SuppressWarnings("unused")
	private void registerMetrics() {
		Metrics metrics = new Metrics(this, 10542);
	}

}
