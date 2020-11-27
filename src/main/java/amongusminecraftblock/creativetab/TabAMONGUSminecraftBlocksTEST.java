
package amongusminecraftblock.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import amongusminecraftblock.ElementsAmongusminecraftblockMod;

@ElementsAmongusminecraftblockMod.ModElement.Tag
public class TabAMONGUSminecraftBlocksTEST extends ElementsAmongusminecraftblockMod.ModElement {
	public TabAMONGUSminecraftBlocksTEST(ElementsAmongusminecraftblockMod instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabamongusminecraftblockstest") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.STRUCTURE_VOID, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
