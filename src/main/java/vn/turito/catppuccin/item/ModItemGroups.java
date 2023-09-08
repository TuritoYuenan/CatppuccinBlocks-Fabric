package vn.turito.catppuccin.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import vn.turito.catppuccin.CTPMod;
import vn.turito.catppuccin.block.ModBlocks;

public class ModItemGroups {
	public static final ItemGroup CATPPUCCIN_GROUP = FabricItemGroup.builder()
			.displayName(Text.translatable("itemgroup.catppuccin"))
			.icon(() -> new ItemStack(ModItems.PUCCIN_CAT))
			.entries((displayContext, entries) -> {
				entries.add(ModItems.PUCCIN_CAT);
				entries.add(ModBlocks.MCHRWT_CONCRETE);
				entries.add(ModBlocks.MCHFMG_CONCRETE);
				entries.add(ModBlocks.MCHPNK_CONCRETE);
				entries.add(ModBlocks.MCHMUV_CONCRETE);
				entries.add(ModBlocks.MCHRED_CONCRETE);
				entries.add(ModBlocks.MCHMRN_CONCRETE);
				entries.add(ModBlocks.MCHPCH_CONCRETE);
				entries.add(ModBlocks.MCHYLW_CONCRETE);
				entries.add(ModBlocks.MCHGRN_CONCRETE);
				entries.add(ModBlocks.MCHTEL_CONCRETE);
				entries.add(ModBlocks.MCHSKY_CONCRETE);
				entries.add(ModBlocks.MCHSPP_CONCRETE);
				entries.add(ModBlocks.MCHBLU_CONCRETE);
				entries.add(ModBlocks.MCHLAV_CONCRETE);
			}).build();

	public static void registerItemGroups() {
		Registry.register(Registries.ITEM_GROUP, new Identifier(CTPMod.MOD_ID, "catppuccin"), CATPPUCCIN_GROUP);
		CTPMod.LOGGER.info("Registering item groups for " + CTPMod.MOD_ID);
	}
}
