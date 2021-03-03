package dev.codedred.denytravel.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.google.common.collect.Lists;

import dev.codedred.denytravel.data.DataManager;
import dev.codedred.denytravel.enums.Travelers;

public class AdminCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		DataManager data = DataManager.getInstance();
		if (!sender.hasPermission("denytravel.admin")) {
			sender.sendMessage(format(data.getConfig().getString("messages.no-permission")));
			return true;
		}
		switch (args.length) {
		case 1:
			if (args[0].equalsIgnoreCase("reload")) {
				data.reload();
				data.registerEntities();
				sender.sendMessage(format("&3&lDenyTravel successfully reloaded and registered the config file!"));
				return true;
			}
			if (args[0].equalsIgnoreCase("list")) {
				sender.sendMessage(format("&3&lEntities Currently Denied:"));
				List<String> entities = new ArrayList<>();
				for (Travelers e : Travelers.values())
					if (e.isDenied()) entities.add(e.toString());
				sender.sendMessage(format("&7" + entities.toString()));
				return true;
			}
		case 3:
			if (args[0].equalsIgnoreCase("set")) {
				if (Travelers.isValid(args[1])) {
					if (args[2].equalsIgnoreCase("deny")) {
						Travelers.valueOf(args[1]).setPermission(true);
						data.getConfig().set("entity-travel.allow-entity." + args[1].toUpperCase(), true);
						data.save();
						sender.sendMessage(format("&c&l" + args[1].toUpperCase() + "&c portal travel is now &ldenied&c!"));
						return true;
					}
					else if(args[2].equalsIgnoreCase("allow")) {
						Travelers.valueOf(args[1]).setPermission(false);
						data.getConfig().set("entity-travel.allow-entity." + args[1].toUpperCase(), false);
						data.save();
						sender.sendMessage(format("&3&l" + args[1].toUpperCase() + "&3 portal travel is now &lallowed&3!"));
						return true;
					}
				}
				else {
					sender.sendMessage(format("&c&l" + args[1].toUpperCase() + "&c is an invalid entry!"));
					sender.sendMessage(format("&3&lTry,"));
					List<Travelers> defaultEntities = Lists.newArrayList(Travelers.values());
					sender.sendMessage(format("&7" + defaultEntities.toString()));
					return true;
				}
			}
		default:
			sender.sendMessage(format("&3&lDenyTravel Usage:"));
			sender.sendMessage(format("&3/&7denytravel list"));
			sender.sendMessage(format("&3/&7denytravel reload"));
			sender.sendMessage(format("&3/&7denytravel set &8<&7entity&8> <&7deny&8/&7allow&8>"));
		}	
		return true;
	}
	
	
	private String format(String msg) {
		return ChatColor.translateAlternateColorCodes('&', msg);
	}
	

}
