package sparks.mod.potioncrackers.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import sparks.mod.potioncrackers.init.ModItems;

public class FoodMultiEffect extends FoodBase
{

	public FoodMultiEffect(String name, int amount, float saturation, boolean isWolfFood) {
		super(name, amount, saturation, isWolfFood);
		setAlwaysEdible();
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		if (!worldIn.isRemote)
        {
            if(this == ModItems.ENCHANTED_CHEESE)
            {
            	player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1200, 1, false, true));
            	player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 1200, 1, false, true));
            	player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 80, 1, false, true));
            }
        }
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}

}
