package narigudoBR.sniffcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Marble extends Block {
	public Marble(int id,Material par1)
	{
		super(id,par1);
		this.setHardness(1.0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("Marble");
		this.setCreativeTab(CreativeTabs.tabBlock);

	}
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("sniffcraft:Marble");
				
				
		
	}
	
}
