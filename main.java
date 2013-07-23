package sniffcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLLoadEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "sniffcraft", name = "Sniffcraft", version = "alpha 0.2")
@NetworkMod(clientSideRequired = true,serverSideRequired = false)
public class main
{
	
//seção dos blocos
	public final static Block marbleBlock = new Marble(501,Material.rock)
	.setHardness(1.0F)
	.setStepSound(Block.soundStoneFootstep)
	.setUnlocalizedName("Marble")
	.setCreativeTab(CreativeTabs.tabBlock);
			
	
// instancia do mod
	public static main instance; 
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//local do marmore
		LanguageRegistry.addName(marbleBlock, "Marble");
		MinecraftForge.setBlockHarvestLevel(marbleBlock, "picaxe", 1);
		GameRegistry.registerBlock(marbleBlock,"Marble");
		
		
	
    }
	@EventHandler
	public void load(FMLLoadEvent event)
	{
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	@EventHandler
	public void serverStart(FMLServerStartingEvent event)
	{
		
	}
}
