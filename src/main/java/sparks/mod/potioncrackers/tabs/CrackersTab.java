package sparks.mod.potioncrackers.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import sparks.mod.potioncrackers.init.ModItems;

public class CrackersTab extends CreativeTabs 
{
	
	public CrackersTab(String label)
	{
		super("crackerstab");
//		this.setBackgroundImageName("tab_items.png");
	}

	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.BASE_CRACKER);
	}

}
