package vn.turito.catppuccin;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.turito.catppuccin.block.ModBlocks;
import vn.turito.catppuccin.item.ModItemGroups;
import vn.turito.catppuccin.item.ModItems;

public class CTPMod implements ModInitializer {
	public static final String MOD_ID = "catppuccin";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Items
		ModItemGroups.registerItemGroups();
		ModItems.registerItems();
		// Blocks
		ModBlocks.registerModBlocks();
	}
}