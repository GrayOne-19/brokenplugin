package com.civitasmc.promotionsplus;

import org.bukkit.plugin.java.JavaPlugin;

import com.civitasmc.promotionsplus.commands.HelpCommand;
import com.civitasmc.promotionsplus.commands.PromoteCommand;
import com.civitasmc.promotionsplus.commands.PromotionsCommand;
import com.civitasmc.promotionsplus.commands.ReloadCommand;
import com.civitasmc.promotionsplus.listeners.InventoryClickListener;
import com.civitasmc.promotionsplus.listeners.InventoryClickListener2;
import com.civitasmc.promotionsplus.ui.PromoteSettingsUi;
import com.civitasmc.promotionsplus.ui.TestUi;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		new HelpCommand(this);
		new ReloadCommand(this);
		new PromoteCommand(this);
		new PromotionsCommand(this);
		new InventoryClickListener(this);
		new InventoryClickListener2(this);
		TestUi.initialize();
		PromoteSettingsUi.initialize();
		
	}
	

}
