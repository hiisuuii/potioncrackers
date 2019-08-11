package sparks.mod.potioncrackers.items.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import sparks.mod.potioncrackers.Main;
import sparks.mod.potioncrackers.init.ModItems;
import sparks.mod.potioncrackers.util.IHasModel;

public class FoodBase extends ItemFood implements IHasModel 
{

	public FoodBase(String name, int amount, float saturation, boolean isWolfFood) 
	{
		
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
        setCreativeTab(Main.crackerstab);
        
        ModItems.ITEMS.add(this);
	}
	
	public int getMaxItemUseDuration(ItemStack stack)
    {
        if(this == ModItems.BASE_CRACKER)
        {
        	return 16;
        }
        else 
        {
        	return 32;
        }
    }

	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
