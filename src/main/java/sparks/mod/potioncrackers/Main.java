package sparks.mod.potioncrackers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sparks.mod.potioncrackers.init.ModRecipes;
import sparks.mod.potioncrackers.proxy.CommonProxy;
import sparks.mod.potioncrackers.tabs.CrackersTab;
import sparks.mod.potioncrackers.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static final CreativeTabs crackerstab = new CrackersTab("crackerstab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	
	//event handlers for init
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}

	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
		ModRecipes.init();
		
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	
}
