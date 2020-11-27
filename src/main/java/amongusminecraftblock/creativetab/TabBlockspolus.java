
package amongusminecraftblock.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import amongusminecraftblock.ElementsAmongusminecraftblockMod;

@ElementsAmongusminecraftblockMod.ModElement.Tag
public class TabBlockspolus extends ElementsAmongusminecraftblockMod.ModElement {
	public TabBlockspolus(ElementsAmongusminecraftblockMod instance) {
		super(instance, 77);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabblockspolus") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.CHORUS_FRUIT_POPPED, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
