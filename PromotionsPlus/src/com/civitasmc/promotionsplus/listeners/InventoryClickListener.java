package com.civitasmc.promotionsplus.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.civitasmc.promotionsplus.Main;
import com.civitasmc.promotionsplus.ui.PromoteSettingsUi;


public class InventoryClickListener implements Listener {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public InventoryClickListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		String title = e.getView().getTitle();
		
		if (title.equals(PromoteSettingsUi.inventory_name)) {
			e.setCancelled(true);
			if (e.getCurrentItem() == null) {
				return;
			}
			
			if (title.equals(PromoteSettingsUi.inventory_name)) {
				PromoteSettingsUi.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
			}
		
		
	}

	}
}

