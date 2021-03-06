package fluke.hexlands;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import fluke.hexlands.proxy.CommonProxy;
import fluke.hexlands.util.Reference;
import fluke.hexlands.world.WorldTypeATest;
import fluke.hexlands.world.WorldTypeFluke;
import fluke.hexlands.world.biomeEditor;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptableRemoteVersions="*")
public class Main 
{
	public static WorldTypeFluke worldTypeFluke;
	public static WorldTypeATest aTest;
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		worldTypeFluke = new WorldTypeFluke();
		//aTest = new WorldTypeATest();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		biomeEditor.removeBlacklistBiomes();
	}
	
}
