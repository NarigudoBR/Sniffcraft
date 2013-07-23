ackage sniffcraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLLoadEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "sniffcraft", name = "Sniffcraft", version = "alpha 0.2")
@NetworkMod(clientSideRequired = true,serverSideRequired = false)
public class main
{
// instancia do mod
  public static main instance; 
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		
	
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
