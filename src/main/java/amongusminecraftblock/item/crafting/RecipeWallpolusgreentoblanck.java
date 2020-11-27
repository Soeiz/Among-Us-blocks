
package amongusminecraftblock.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import amongusminecraftblock.block.BlockWallpolusoutsidegreen3;
import amongusminecraftblock.block.BlockBlocpolusdehorsmilieu;

import amongusminecraftblock.ElementsAmongusminecraftblockMod;

@ElementsAmongusminecraftblockMod.ModElement.Tag
public class RecipeWallpolusgreentoblanck extends ElementsAmongusminecraftblockMod.ModElement {
	public RecipeWallpolusgreentoblanck(ElementsAmongusminecraftblockMod instance) {
		super(instance, 93);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockWallpolusoutsidegreen3.block, (int) (1)),
				new ItemStack(BlockBlocpolusdehorsmilieu.block, (int) (1)), 1F);
	}
}
