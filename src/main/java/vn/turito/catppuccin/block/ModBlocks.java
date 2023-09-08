package vn.turito.catppuccin.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import vn.turito.catppuccin.CTPMod;

public class ModBlocks {
	public static final Block MCHRWT_CONCRETE = MochaConcreteBlock("rosewater");
	public static final Block MCHFMG_CONCRETE = MochaConcreteBlock("flamingo");
	public static final Block MCHPNK_CONCRETE = MochaConcreteBlock("pink");
	public static final Block MCHMUV_CONCRETE = MochaConcreteBlock("mauve");
	public static final Block MCHRED_CONCRETE = MochaConcreteBlock("red");
	public static final Block MCHMRN_CONCRETE = MochaConcreteBlock("maroon");
	public static final Block MCHPCH_CONCRETE = MochaConcreteBlock("peach");
	public static final Block MCHYLW_CONCRETE = MochaConcreteBlock("yellow");
	public static final Block MCHGRN_CONCRETE = MochaConcreteBlock("green");
	public static final Block MCHTEL_CONCRETE = MochaConcreteBlock("teal");
	public static final Block MCHSKY_CONCRETE = MochaConcreteBlock("sky");
	public static final Block MCHSPP_CONCRETE = MochaConcreteBlock("sapphire");
	public static final Block MCHBLU_CONCRETE = MochaConcreteBlock("blue");
	public static final Block MCHLAV_CONCRETE = MochaConcreteBlock("lavender");

	private static Block MochaConcreteBlock(String color) {
		return registerBlock("mocha_"+color+"_concrete",
				new Block(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));
	}

	private static Block registerBlock(String name, Block block) {
		registerBlockItems(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(CTPMod.MOD_ID, name), block);
	}

	private static Item registerBlockItems(String name, Block block) {
		return Registry.register(Registries.ITEM, new Identifier(CTPMod.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings()));
	}

	public static void registerModBlocks() {
		CTPMod.LOGGER.info("Registering blocks for " + CTPMod.MOD_ID);
	}
}
