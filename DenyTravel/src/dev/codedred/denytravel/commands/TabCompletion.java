package dev.codedred.denytravel.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import com.google.common.collect.Lists;

import dev.codedred.denytravel.enums.Travelers;

public class TabCompletion implements TabCompleter {

	public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
		List<String> defaultArgs = Arrays.asList("list", "set", "reload");
		List<String> result = new ArrayList<>();
		switch (args.length) {
		case 1:
			for (String arg : defaultArgs) {
				if (arg.startsWith(args[0].toLowerCase()))
					result.add(arg);
			}
			return result;
		case 2:
			if (args[0].equalsIgnoreCase("set")) {
				List<Travelers> defaultEntities = Lists.newArrayList(Travelers.values());
				for (Travelers e : defaultEntities)
					if (e.toString().startsWith(args[1].toUpperCase()))
						result.add(e.toString());
				return result;
			}
		case 3:
			if (args[0].equalsIgnoreCase("set")) {
				List<String> thirdArgs = Arrays.asList("deny", "allow");
				for (String arg : thirdArgs) {
					if (arg.startsWith(args[2].toLowerCase()))
						result.add(arg);
				}
				return result;	
			}
		default: return null;
		}
	}

}
