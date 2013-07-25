package NarigudoBR.sniffcraft;

import java.util.Random;

import NarigudoBR.sniffcraft.blocks.Marble;
import NarigudoBR.sniffcraft.blocks.MarbleBrick;
import NarigudoBR.sniffcraft.blocks.RubiOre;
import NarigudoBR.sniffcraft.blocks.TungstenBlock;
import NarigudoBR.sniffcraft.blocks.TungstenOre;
import NarigudoBR.sniffcraft.creativetab.Sniffcraftcreativetab;
import NarigudoBR.sniffcraft.items.TungstenIngot;
import NarigudoBR.sniffcraft.tools.RubiAxe;
import NarigudoBR.sniffcraft.tools.RubiHoe;
import NarigudoBR.sniffcraft.tools.RubiPickaxe;
import NarigudoBR.sniffcraft.tools.RubiShovel;
import NarigudoBR.sniffcraft.tools.RubiSword;
import NarigudoBR.sniffcraft.world.WorldGeneration;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
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
@NetworkMod(clientSideRequired = true,serverSideRequired = true)
public class main
{
	//secao de id
	int marbleBlockID;
	int tungstenOreBlockID;
	int tungstenItemID;
	int marbleBrickID;
	int gemRubiID;
	int rubiOreID;
	int tungstenBlockID;
	int rubiPickaxeID;
	int rubiSwordID;
	int rubiShovelID;
	int rubiHoeID;
	int rubiAxeID;
	
	
	
	
	//secao dos blocos
	public static Block marbleBlock;
	public static Block tungstenOre;	
	public static Block marbleBrick;
	public static Block tungstenBlock;
	public static Block rubiOre;

	//secao dos items
	public static Item  tungstenIngot;
	public static Item gemRubi;
	//secao das ferramentas
	public static Item rubiPickaxe;
	public static Item rubiSword;
	public static Item rubiShovel;
	public static Item rubiHoe;
	public static Item rubiAxe;
	//secao da creative tab
	public static CreativeTabs tabSniffcrat = new CreativeTabs("Sniffcraft");
	//secao materiais
	public static EnumToolMaterial Rubi= EnumHelper.addToolMaterial("Rubi", 3, 250, 8.0F,8.0F , 14);
       
        
	
	
	
		
     
	
	
			

 
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
	
		
		
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		
		//configuracao
		
		marbleBlockID = config.get("Block IDs","marbleBlock ID",1000).getInt();
		tungstenOreBlockID = config.get("Block IDS", "tungstenOre ID", 1001).getInt();
		tungstenItemID = config.get("Material IDs", "tungstenIngot", 1002).getInt();
		marbleBrickID = config.get("Block IDs", "marbleBrick", 1003).getInt();
		gemRubiID = config.get("Material IDs", "gemRubi", 1004).getInt();
		rubiOreID = config.get("Block IDs", "rubiOre", 1005).getInt();
		tungstenBlockID = config.get("ToolsIDs", "tungstenBlock", 1006).getInt();
		rubiShovelID = config.get("BlockIDs","rubiShovel", 1007).getInt();
		rubiSwordID = config.get("ToolsIDs", "rubiSword", 1008).getInt();
		rubiPickaxeID = config.get("ToolsIDs", "rubiPickaxe", 1009).getInt();
		rubiHoeID = config.get("ToolsIDs", "rubiHoe", 1010).getInt();
		rubiAxeID = config.get("ToolsIDs", "rubiAxe", 1011).getInt();
		
		config.save();
		//iniciar  
		this.marbleBlock = new Marble(marbleBlockID,Material.rock);
		this.tungstenOre = new TungstenOre(tungstenOreBlockID);
		this.tungstenIngot = new TungstenIngot(tungstenItemID);
		this.marbleBrick = new MarbleBrick(marbleBrickID,Material.rock);
		this.gemRubi = new NarigudoBR.sniffcraft.items.gemRubi(gemRubiID);
		this.rubiOre = new RubiOre(rubiOreID);
		this.tungstenBlock = new TungstenBlock(tungstenBlockID,Material.rock);
		this.rubiPickaxe = new RubiPickaxe(rubiPickaxeID,Rubi);
		this.rubiShovel = new RubiShovel(rubiShovelID,Rubi);
		this.rubiSword = new RubiSword(rubiSwordID,Rubi);
		this.rubiHoe = new RubiHoe(rubiHoeID,Rubi);
		this.rubiAxe = new RubiAxe(rubiAxeID,Rubi);
		//iniciar creative tab
		
		

   //local do marmore
   LanguageRegistry.addName(marbleBlock, "Marble");
   MinecraftForge.setBlockHarvestLevel(marbleBlock, "picaxe", 1);
   GameRegistry.registerBlock(marbleBlock,"Marble");

   //local do minerio de tungstenio
    LanguageRegistry.addName(tungstenOre, "Tungsten ore");
    MinecraftForge.setBlockHarvestLevel(tungstenOre, "pickaxe", 4);   
    GameRegistry.registerBlock(tungstenOre,"Tungsten Ore");
   
      //local da barra de tungstenio
    GameRegistry.registerItem(tungstenIngot, "Tungsten ingot");
    LanguageRegistry.addName(tungstenIngot,"Tungsten ingot");
    //local do bloco de marmore
    LanguageRegistry.addName(marbleBrick, "Marble Brick");    
    MinecraftForge.setBlockHarvestLevel(marbleBrick, "pickaxe", 1);
    GameRegistry.registerBlock(marbleBrick, "Marble Brick");
    //local do bloco de tungstenio
    GameRegistry.registerBlock(tungstenBlock,"Block of tungsten");
    LanguageRegistry.addName(tungstenBlock, "Block of tungsten");
    //local do minerio de rubi
    LanguageRegistry.addName(rubiOre, "Rubi Ore");
    GameRegistry.registerBlock(rubiOre,"Rubi Ore");  
    MinecraftForge.setBlockHarvestLevel(rubiOre, "pickaxe", 2);
    //local da gema de rubi
    GameRegistry.registerItem(gemRubi,"Rubi");
    LanguageRegistry.addName(gemRubi, "Rubi");
    //local das ferramentas de rubi
    GameRegistry.registerItem(rubiPickaxe, "Rubi Pickaxe");
    LanguageRegistry.addName(rubiPickaxe, "Rubi Pickaxe");
    GameRegistry.registerItem(rubiShovel, "Rubi Shovel");
    GameRegistry.registerItem(rubiAxe, "Rubi Axe");
    GameRegistry.registerItem(rubiHoe, "Rubi Hoe");
    GameRegistry.registerItem(rubiSword, "Rubi Sword");
    LanguageRegistry.addName(rubiAxe, "Rubi Axe");
    LanguageRegistry.addName(rubiHoe, "Rubi Hoe");
    LanguageRegistry.addName(rubiPickaxe, "Rubi Shovel");
    LanguageRegistry.addName(rubiPickaxe, "Rubi Sword");
    
    
    
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
    GameRegistry.addShapedRecipe(new ItemStack (rubiPickaxe),"xxx"," y "," y ",'x',gemRubi,'y',Item.stick);
    GameRegistry.addShapedRecipe(new ItemStack (rubiHoe),"xx "," y "," y ",'x',gemRubi,'y',Item.stick);
    GameRegistry.addShapedRecipe(new ItemStack (rubiAxe),"xx ","xy "," y ",'x',gemRubi,'y',Item.stick);
    GameRegistry.addShapedRecipe(new ItemStack (rubiSword)," x "," x "," y ",'x',gemRubi,'y',Item.stick);
    GameRegistry.addShapedRecipe(new ItemStack (rubiShovel)," x "," y "," y ",'x',gemRubi,'y',Item.stick);
    LanguageRegistry.instance().addStringLocalization("itemGroup.tabSniffcraft", "Sniffcraft");
    //area de geracao de mundo
    GameRegistry.registerWorldGenerator(new WorldGeneration());
    
   
    
			
			
		
		
		
	
    }
	private static Material Material(String string, int i, int j, float f,
			int k, int l) {
		// TODO Auto-generated method stub
		return null;
	}
	private CreativeTabs Sniffcraftcreativetab(int nextID, String string) {
		// TODO Auto-generated method stub
		return null;
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
