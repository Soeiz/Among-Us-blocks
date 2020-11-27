
package amongusminecraftblock.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import amongusminecraftblock.block.BlockWallpolusoutsidegreen2;
import amongusminecraftblock.block.BlockBlocpolusdehorsmilieu;

import amongusminecraftblock.ElementsAmongusminecraftblockMod;

@ElementsAmongusminecraftblockMod.ModElement.Tag
public class RecipeWallpolusgreentoblanck1 extends ElementsAmongusminecraftblockMod.ModElement {
	public RecipeWallpolusgreentoblanck1(ElementsAmongusminecraftblockMod instance) {
		super(instance, 94);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockWallpolusoutsidegreen2.block, (int) (1)),
				new ItemStack(BlockBlocpolusdehorsmilieu.block, (int) (1)), 1F);
	}
}
