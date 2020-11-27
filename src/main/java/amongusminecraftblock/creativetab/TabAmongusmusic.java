
package amongusminecraftblock.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import amongusminecraftblock.ElementsAmongusminecraftblockMod;

@ElementsAmongusminecraftblockMod.ModElement.Tag
public class TabAmongusmusic extends ElementsAmongusminecraftblockMod.ModElement {
	public TabAmongusmusic(ElementsAmongusminecraftblockMod instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabamongusmusic") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.RECORD_STRAD, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
