
package amongusminecraftblock.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import amongusminecraftblock.block.BlockWallpolusoutside3;
import amongusminecraftblock.block.BlockBlocpolusdehorsmilieu;

import amongusminecraftblock.ElementsAmongusminecraftblockMod;

@ElementsAmongusminecraftblockMod.ModElement.Tag
public class RecipeWallpolusredtoblank2 extends ElementsAmongusminecraftblockMod.ModElement {
	public RecipeWallpolusredtoblank2(ElementsAmongusminecraftblockMod instance) {
		super(instance, 101);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockWallpolusoutside3.block, (int) (1)), new ItemStack(BlockBlocpolusdehorsmilieu.block, (int) (1)),
				1F);
	}
}
