package sparks.mod.potioncrackers.items.food;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionUtils;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FoodEffectBase extends FoodBase 
{

	PotionEffect effect;
	
	
	public FoodEffectBase(String name, int amount, float saturation, boolean isWolfFood, PotionEffect effect) 
	{
		
		super(name, amount, saturation, isWolfFood);
		setAlwaysEdible();
		this.effect = effect;
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		if (!worldIn.isRemote)
        {
            player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), 
            		effect.getIsAmbient(), effect.doesShowParticles()));
        }
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}

}
