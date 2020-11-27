
package amongusminecraftblock.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import amongusminecraftblock.creativetab.TabBlockspolus;

import amongusminecraftblock.ElementsAmongusminecraftblockMod;

@ElementsAmongusminecraftblockMod.ModElement.Tag
public class BlockWallpolusoutside2 extends ElementsAmongusminecraftblockMod.ModElement {
	@GameRegistry.ObjectHolder("amongusminecraftblock:wallpolusoutside2")
	public static final Block block = null;
	public BlockWallpolusoutside2(ElementsAmongusminecraftblockMod instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("wallpolusoutside2"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("amongusminecraftblock:wallpolusoutside2", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("wallpolusoutside2");
			setSoundType(SoundType.STONE);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabBlockspolus.tab);
		}
	}
}
