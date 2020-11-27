
package amongusminecraftblock.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import amongusminecraftblock.ElementsAmongusminecraftblockMod;

@ElementsAmongusminecraftblockMod.ModElement.Tag
public class TabBlocksskeld extends ElementsAmongusminecraftblockMod.ModElement {
	public TabBlocksskeld(ElementsAmongusminecraftblockMod instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabblocksskeld") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.FIREWORKS, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
