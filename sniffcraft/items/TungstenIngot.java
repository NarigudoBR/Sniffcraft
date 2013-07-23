package narigudoBR.sniffcraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TungstenIngot extends Item {

	public TungstenIngot(int par1) {
		super(par1);
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName("tungstenIngot");
	}
	@Override
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("sniffcraft:tungstenIngot");
	}
	

}
