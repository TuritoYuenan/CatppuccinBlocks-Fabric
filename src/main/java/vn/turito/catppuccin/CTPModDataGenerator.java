package vn.turito.catppuccin;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import vn.turito.catppuccin.block.ModBlocks;
import vn.turito.catppuccin.item.ModItems;

public class CTPModDataGenerator implements DataGeneratorEntrypoint {
	private static class ConcreteGenerator extends FabricModelProvider {
		private ConcreteGenerator(FabricDataOutput output) {
			super(output);
		}

		@Override
		public void generateBlockStateModels(BlockStateModelGenerator bSMG) {
			bSMG.registerSimpleCubeAll(ModBlocks.MCHRWT_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHFMG_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHPNK_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHMUV_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHRED_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHMRN_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHPCH_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHYLW_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHGRN_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHTEL_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHSKY_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHSPP_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHBLU_CONCRETE);
			bSMG.registerSimpleCubeAll(ModBlocks.MCHLAV_CONCRETE);
		}

		@Override
		public void generateItemModels(ItemModelGenerator iMG) {
			iMG.register(ModItems.PUCCIN_CAT, Models.GENERATED);
		}
	}

	private static class EnglishTranslator extends FabricLanguageProvider {
		protected EnglishTranslator(FabricDataOutput dataOutput) {
			super(dataOutput, "en_us");
		}

		@Override
		public void generateTranslations(TranslationBuilder tBuilder) {
			// Item group
			tBuilder.add("itemGroup.catppuccin", "Catppuccin Mod");
			// Items
			tBuilder.add(ModItems.PUCCIN_CAT, "Puccin Cat");
			// Concrete blocks
			tBuilder.add(ModBlocks.MCHRWT_CONCRETE, "Mocha Rosewater Concrete");
			tBuilder.add(ModBlocks.MCHFMG_CONCRETE, "Mocha Flamingo Concrete");
			tBuilder.add(ModBlocks.MCHPNK_CONCRETE, "Mocha Pink Concrete");
			tBuilder.add(ModBlocks.MCHMUV_CONCRETE, "Mocha Mauve Concrete");
			tBuilder.add(ModBlocks.MCHRED_CONCRETE, "Mocha Red Concrete");
			tBuilder.add(ModBlocks.MCHMRN_CONCRETE, "Mocha Maroon Concrete");
			tBuilder.add(ModBlocks.MCHPCH_CONCRETE, "Mocha Peach Concrete");
			tBuilder.add(ModBlocks.MCHYLW_CONCRETE, "Mocha Yellow Concrete");
			tBuilder.add(ModBlocks.MCHGRN_CONCRETE, "Mocha Green Concrete");
			tBuilder.add(ModBlocks.MCHTEL_CONCRETE, "Mocha Teal Concrete");
			tBuilder.add(ModBlocks.MCHSKY_CONCRETE, "Mocha Sky Concrete");
			tBuilder.add(ModBlocks.MCHSPP_CONCRETE, "Mocha Sapphire Concrete");
			tBuilder.add(ModBlocks.MCHBLU_CONCRETE, "Mocha Blue Concrete");
			tBuilder.add(ModBlocks.MCHLAV_CONCRETE, "Mocha Lavender Concrete");
		}
	}

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ConcreteGenerator::new);
		pack.addProvider(EnglishTranslator::new);
	}
}
