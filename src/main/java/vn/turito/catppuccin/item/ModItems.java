package vn.turito.catppuccin.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import vn.turito.catppuccin.CTPMod;

public class ModItems {
	public static final Item PUCCIN_CAT = registerItem("puccin_cat", new Item(new FabricItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(CTPMod.MOD_ID, name), item);
	}

	public static void registerItems() {
		CTPMod.LOGGER.info("Registering item for " + CTPMod.MOD_ID);
	}
}
