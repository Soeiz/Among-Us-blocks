
package amongusminecraftblock.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import amongusminecraftblock.ElementsAmongusminecraftblockMod;

@ElementsAmongusminecraftblockMod.ModElement.Tag
public class TabBlocksmirahq extends ElementsAmongusminecraftblockMod.ModElement {
	public TabBlocksmirahq(ElementsAmongusminecraftblockMod instance) {
		super(instance, 102);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabblocksmirahq") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.SAPLING, (int) (1), 0);
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
