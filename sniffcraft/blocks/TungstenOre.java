package narigudoBR.sniffcraft.blocks;

import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class TungstenOre extends BlockOre {

	public TungstenOre(int par1) {
		super(par1);
		
		this.setHardness(2.0F);
		this.setStepSound(soundStoneFootstep);
		this.setUnlocalizedName("tungstenOre");
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	@Override
	public void registerIcons(IconRegister reg)
	
	{
		this.blockIcon = reg.registerIcon("sniffcraft:Tungsten_Ore");
		
		
	}

}
