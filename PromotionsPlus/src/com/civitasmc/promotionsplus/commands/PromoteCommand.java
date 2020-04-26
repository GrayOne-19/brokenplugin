package com.civitasmc.promotionsplus.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.civitasmc.promotionsplus.Main;
import com.civitasmc.promotionsplus.ui.PromoteSettingsUi;

public class PromoteCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	public PromoteCommand(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("promote").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (!(sender instanceof Player)) {
			return true;
		}
		
		Player p = (Player) sender;
		if (p.hasPermission("promotionsplus.command.gui.open")) {
			p.openInventory(PromoteSettingsUi.GUI(p));
		}
		
		return false;
	}

}
