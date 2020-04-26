package com.civitasmc.promotionsplus.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.civitasmc.promotionsplus.Main;
import com.civitasmc.promotionsplus.utils.Utils;
public class HelpCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public HelpCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("pphelp").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command!");
			return true;
		}
		Player p = (Player) sender;
		
		if (p.hasPermission("hello.use")) {
			p.sendMessage(Utils.chat("&8[&cPromotionsPlus&8] &aList of all commands\n&7&m------------------------&r\n&f - &c/promote &ePromote a deal to the whole server.\n \n &f- &c/promotionsboard (/pb) &eOpen the promotions board.\n&7&m------------------------"));
			return true;
		} else {
			p.sendMessage("You have no permission to execute this command!");
		}
		
		
		return false;
	}

}
