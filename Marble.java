package sniffcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class Marble extends Block {
  public Marble(int id,Material par1)
	{
		super(id,par1);

	}
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("sniffcraft:Marble");
				
				
		
	}
	
}
