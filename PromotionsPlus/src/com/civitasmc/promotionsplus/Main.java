package com.civitasmc.promotionsplus;

import org.bukkit.plugin.java.JavaPlugin;

import com.civitasmc.promotionsplus.commands.PromotionsCommand;
import com.civitasmc.promotionsplus.listeners.InventoryClickListener;
import com.civitasmc.promotionsplus.ui.TestUi;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		new PromotionsCommand(this);
		new InventoryClickListener(this);
		TestUi.initialize();
		
	}

}
