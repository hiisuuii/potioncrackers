package sparks.mod.potioncrackers.items;

import net.minecraft.item.Item;
import sparks.mod.potioncrackers.Main;
import sparks.mod.potioncrackers.init.ModItems;
import sparks.mod.potioncrackers.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{
	
	public ItemBase(String name)
	{
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.crackerstab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

	
	
}
