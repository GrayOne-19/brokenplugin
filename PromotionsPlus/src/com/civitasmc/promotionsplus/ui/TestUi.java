package com.civitasmc.promotionsplus.ui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.civitasmc.promotionsplus.utils.Utils;

public class TestUi {
	

	public static Inventory inv;
	public static String inventory_name;
	public static int inv_rows = 4 * 9;
	
	
	public static void initialize() {
				
		
		inventory_name = Utils.chat("&6&lPromotions Board");
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	
	public static Inventory GUI (Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);
		
		Utils.createItem(inv, "bedrock", 1, 1, "&ctest ;-;", "&aTest");
		
		toReturn.setContents(inv.getContents());
		return toReturn;
	}
	
	public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv) {
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&ctest ;-;"))) {
			p.sendMessage(Utils.chat("&8[&cPromotionsPlus&8] &aGUI plugin working!"));
		}
	}

}
