
package amongusminecraftblock.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import amongusminecraftblock.block.BlockWallpolusbleu3;
import amongusminecraftblock.block.BlockBlocpolusdehorsmilieu;

import amongusminecraftblock.ElementsAmongusminecraftblockMod;

@ElementsAmongusminecraftblockMod.ModElement.Tag
public class RecipeWallpolusbluetoblank2 extends ElementsAmongusminecraftblockMod.ModElement {
	public RecipeWallpolusbluetoblank2(ElementsAmongusminecraftblockMod instance) {
		super(instance, 98);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockWallpolusbleu3.block, (int) (1)), new ItemStack(BlockBlocpolusdehorsmilieu.block, (int) (1)), 1F);
	}
}
