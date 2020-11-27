
package amongusminecraftblock.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import amongusminecraftblock.block.BlockWallpolusblue2;
import amongusminecraftblock.block.BlockBlocpolusdehorsmilieu;

import amongusminecraftblock.ElementsAmongusminecraftblockMod;

@ElementsAmongusminecraftblockMod.ModElement.Tag
public class RecipeWallpolusbluetoblank1 extends ElementsAmongusminecraftblockMod.ModElement {
	public RecipeWallpolusbluetoblank1(ElementsAmongusminecraftblockMod instance) {
		super(instance, 97);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockWallpolusblue2.block, (int) (1)), new ItemStack(BlockBlocpolusdehorsmilieu.block, (int) (1)), 1F);
	}
}
