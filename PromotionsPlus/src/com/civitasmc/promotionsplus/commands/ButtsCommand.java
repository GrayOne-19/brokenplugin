package com.civitasmc.promotionsplus.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;



import com.civitasmc.promotionsplus.Main;
import com.civitasmc.promotionsplus.utils.Utils;

public class ButtsCommand implements CommandExecutor {
	
	private Main plugin;
	
	public ButtsCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("buttscmd").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command!");
			return true;
		}
		Player p = (Player) sender;
		
		if (args.length != 0) {
			if (args[0].equalsIgnoreCase("int")) {
				if (args[1] != null) {
					int temp = Integer.parseInt(args[1]);
					plugin.getConfig().set("int", temp);
					plugin.saveConfig();
				}
			}
			
			if (args[0].equalsIgnoreCase("itemstack")) {
				if (args[1] != null) {
					String temp = args[1];
					plugin.getConfig().set("itemstack", temp);
					plugin.saveConfig();
				}
			}
		
			if (args[0].equalsIgnoreCase("boolean")) {
				if (args[1] != null) {
					boolean temp = Boolean.valueOf(args[1]);
					plugin.getConfig().set("boolean", temp);
					plugin.saveConfig();
				}
			}
		
			if (args[0].equalsIgnoreCase("string")) {
				if (args[1] != null) {
					String temp = args[1];
					plugin.getConfig().set("string", temp);
					plugin.saveConfig();
				}
			}

			if (args[0].equalsIgnoreCase("title1")) {
				if (args[1] != null) {
					String temp = args[1];
					plugin.getConfig().set("promote_ui_title", temp);
					plugin.saveConfig();
				}
			}
			
			if (args[0].equalsIgnoreCase("title2")) {
				if (args[1] != null) {
					String temp = args[1];
					plugin.getConfig().set("promotions_board_title", temp);
					plugin.saveConfig();
				}
			}
			
		}

		if (p.hasPermission("hello.use")) {
			p.sendMessage(Utils.chat("&fThe &cint &fis: &e" + plugin.getConfig().getInt("int") + "&f, the &3string &fis: &e" + plugin.getConfig().getString("string") + ",&f and the &4boolean &fis: &e" + plugin.getConfig().getBoolean("boolean") + "&f!"));
			p.getInventory().addItem(new ItemStack(Material.matchMaterial(plugin.getConfig().getString("itemstack"))));
			p.sendMessage(Utils.chat("&fYou have been given: &c" + plugin.getConfig().getString("itemstack") + "&f!"));
			p.sendMessage(Utils.chat("&a&lPromotion UI Settings:\n&ePromotion Settings Title: " + plugin.getConfig().getString("promote_ui_title") + "\n&ePromotions Board Title: " + plugin.getConfig().getString("promotions_board_title")));
			
			return true;
		} else {
			p.sendMessage("You have no permission to execute this command!");
		}
		
		
		return false;


	}
}


