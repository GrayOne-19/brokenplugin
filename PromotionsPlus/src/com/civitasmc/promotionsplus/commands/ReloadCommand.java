package com.civitasmc.promotionsplus.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.civitasmc.promotionsplus.Main;
import com.civitasmc.promotionsplus.utils.Utils;


public class ReloadCommand implements CommandExecutor {
	
	private Main plugin;
	public ReloadCommand(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("ppreload").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (!(sender instanceof Player)) {
			return true;
		}
		
		Player p = (Player) sender;
		if (p.hasPermission("promotionsplus.command.gui.open")) {
			plugin.getPluginLoader().disablePlugin(plugin);
			plugin.getPluginLoader().enablePlugin(plugin);
			
			p.sendMessage(Utils.chat("&8[&cPromotionsPlus&8] &aPlugin reloaded!"));
		}
		
		return false;
	}

}


