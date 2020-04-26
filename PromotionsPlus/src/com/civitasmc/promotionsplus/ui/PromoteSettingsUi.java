package com.civitasmc.promotionsplus.ui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.civitasmc.promotionsplus.utils.Utils;

public class PromoteSettingsUi {
	
	
	public static Inventory inv;
	public static String inventory_name;
	public static int inv_rows = 1 * 9;
	

	
	public static void initialize() {
		
		
		inventory_name = Utils.chat("&a&lPromotion settings");
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	

	
	public static Inventory GUI (Player p) {
			
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);
		
		Utils.createItem(inv, "beacon", 1, 1, "&e&lInfo", "&aThis GUI is used for choosing for how long your promotion will last.");
		Utils.createItemByte(inv, "stained_glass_pane", 15, 1, 2, " ", "");
		Utils.createItemByte(inv, "stained_glass_pane", 15, 1, 3, " ", "");
		Utils.createItemByte(inv, "stained_glass_pane", 15, 1, 7, " ", "");
		Utils.createItemByte(inv, "stained_glass_pane", 15, 1, 8, " ", "");
		Utils.createItemByte(inv, "stained_glass_pane", 15, 1, 9, " ", "");
		Utils.createItem(inv, "coal_block", 1, 4, "&7Tier 1 Promotion", "&ePromotion will last for &c1 Day&e.", "&fPrice: &c5k");
		Utils.createItem(inv, "iron_block", 3, 5, "&eTier 2 Promotion", "&ePromotion will last for &c3 Days&e.", "&fPrice: &c12k");
		Utils.createItem(inv, "diamond_block", 5, 6, "&cTier 3 Promotion", "&ePromotion will last for &c5 Days&e.", "&fPrice: &c17k");
		
		
		toReturn.setContents(inv.getContents());
		return toReturn;
	}
	
	public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv) {
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&e&lInfo"))) {
			p.sendMessage(Utils.chat("&8[&cPromotionsPlus&8] &aThis GUI is used for choosing for how long your promotion will last."));
		}
		
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Tier 1 Promotion"))) {
			p.sendMessage(Utils.chat("&8[&cPromotionsPlus&8] &fPromotion &acreated&f! &fIt will last for &c1 day&f!"));
		}
		
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&eTier 2 Promotion"))) {
			p.sendMessage(Utils.chat("&8[&cPromotionsPlus&8] &fPromotion &acreated&f! &fIt will last for &c3 day&f!"));
		}
		
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&cTier 3 Promotion"))) {
			p.sendMessage(Utils.chat("&8[&cPromotionsPlus&8] &fPromotion &acreated&f! &fIt will last for &c5 day&f!"));
		}
	}

}



