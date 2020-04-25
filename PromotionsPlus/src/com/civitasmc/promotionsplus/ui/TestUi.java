package com.civitasmc.promotionsplus.ui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.civitasmc.promotionsplus.Main;
import com.civitasmc.promotionsplus.utils.Utils;

public class TestUi {
	

	public static Inventory inv;
	public static String inventory_name;
	public static int inv_rows = 4 * 9;
	private static Main plugin;
	
	
	
	public static void initialize() {
				
		
		inventory_name = Utils.chat(plugin.getConfig().getString("ui_title"));
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	
	public static Inventory GUI (Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);
		
		Utils.createItem(inv, plugin.getConfig().getString("item"), plugin.getConfig().getInt("amount"), plugin.getConfig().getInt("item_slot"), plugin.getConfig().getString("item_title"), plugin.getConfig().getString("item_lore_line_one"), plugin.getConfig().getString("item_lore_line_two"));
		
		toReturn.setContents(inv.getContents());
		return toReturn;
	}
	
	public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv) {
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&6Test Item"))) {
			p.sendMessage(Utils.chat("&8[&cPromotionsPlus&8] &aGUI plugin working!"));
		}
	}

}
