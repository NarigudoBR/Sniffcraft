package narigudoBR.sniffcraft;

import narigudoBR.sniffcraft.blocks.Marble;
import narigudoBR.sniffcraft.blocks.MarbleBrick;
import narigudoBR.sniffcraft.blocks.TungstenOre;
import narigudoBR.sniffcraft.items.TungstenIngot;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
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
	//seção de id de blocos
	int marbleBlockID;
	int tungstenOreBlockID;
	int tungstenItemID;
	int marbleBrickID;
	//seção de id de items
	//seção de id de armaduras

	//seção dos blocos
	public static Block marbleBlock;
	public static Block tungstenOre;
	public static Item  tungstenIngot;
	public static Block marbleBrick;
	
	
			
	
// instancia do mod
	public static main instance; 
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		
		//configuração
		
		marbleBlockID = config.get("Block IDs","marbleBlock ID",1000).getInt();
		tungstenOreBlockID = config.get("Block IDS", "tungstenOre ID", 1001).getInt();
		tungstenItemID = config.get("Material IDs", "tungstenIngot", 1002).getInt();
		marbleBrickID = config.get("Block IDs", "marbleBrick", 1003).getInt();
		
		config.save();
		//iniciar os blocos 
		this.marbleBlock = new Marble(marbleBlockID,Material.rock);
		this.tungstenOre = new TungstenOre(tungstenOreBlockID);
		this.tungstenIngot = new TungstenIngot(tungstenItemID);
		this.marbleBrick = new MarbleBrick(marbleBrickID,Material.rock);

   //local do marmore
   LanguageRegistry.addName(marbleBlock, "Marble");
   MinecraftForge.setBlockHarvestLevel(marbleBlock, "picaxe", 1);
   GameRegistry.registerBlock(marbleBlock,"Marble");

   //local do minerio de tungstenio
    LanguageRegistry.addName(tungstenOre, "Tungsten ore");
    MinecraftForge.setBlockHarvestLevel(tungstenOre, "picaxe", 2);   
    GameRegistry.registerBlock(tungstenOre,"Tungsten Ore");
   
      //local da barra de tungstenio
    GameRegistry.registerItem(tungstenIngot, "Tungsten ingot");
    LanguageRegistry.addName(tungstenIngot,"Tungsten ingot");
    //local do bloco de marmore
    LanguageRegistry.addName(marbleBrick, "Marble Brick");    
    MinecraftForge.setBlockHarvestLevel(marbleBrick, "picaxe", 1);
    GameRegistry.registerBlock(marbleBrick, "Marble Brick");
    //receitas na fornalha
    GameRegistry.addSmelting(tungstenOreBlockID,new ItemStack (tungstenIngot), 0.7f);
    //receitas em crafting
    GameRegistry.addShapedRecipe(new ItemStack (marbleBlock),"xx ","xx ","   ",'x',Block.cobblestone);
    GameRegistry.addShapedRecipe(new ItemStack (marbleBrick),"xx ","xx ","   ",'x',marbleBlock);
    GameRegistry.addShapedRecipe(new ItemStack (marbleBrick),"   ","xx ","xx ",'x',marbleBlock);		 
    GameRegistry.addShapedRecipe(new ItemStack (marbleBrick)," xx"," xx","   ",'x',marbleBlock);		
    GameRegistry.addShapedRecipe(new ItemStack (marbleBrick),"   ","xx ","xx ",'x',marbleBlock);
    GameRegistry.addShapedRecipe(new ItemStack (marbleBlock),"   ","xx ","xx ",'x',Block.cobblestone);
    GameRegistry.addShapedRecipe(new ItemStack (marbleBlock)," xx"," xx","   ",'x',Block.cobblestone);
    GameRegistry.addShapedRecipe(new ItemStack (marbleBlock),"   "," xx"," xx",'x',Block.cobblestone);
    GameRegistry.addShapedRecipe(new ItemStack (marbleBlock),"   ","xx ","xx ",'x',Block.cobblestone);
   
			
			
			
		
		
		
	
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
