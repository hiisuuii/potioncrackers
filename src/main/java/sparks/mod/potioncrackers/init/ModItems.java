package sparks.mod.potioncrackers.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import sparks.mod.potioncrackers.items.food.FoodBase;
import sparks.mod.potioncrackers.items.food.FoodEffectBase;
import sparks.mod.potioncrackers.items.food.FoodMultiEffect;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//items
	
	//food
	public static final Item HEALING_CRACKER = new FoodEffectBase("healing_cracker", 4, 1.5F, false, new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 1, false, true));
	public static final Item REGEN_CRACKER = new FoodEffectBase("regen_cracker", 4, 1.5F, false, new PotionEffect(MobEffects.REGENERATION, 240, 1, false, true));
	public static final Item SPEED_CRACKER = new FoodEffectBase("speed_cracker", 4, 1.5F, false, new PotionEffect(MobEffects.SPEED, 2400, 0, false, true));;
	public static final Item STRENGTH_CRACKER = new FoodEffectBase("strength_cracker", 4, 1.5F, false, new PotionEffect(MobEffects.STRENGTH, 2400, 0, false, true));
	public static final Item RESISTANCE_CRACKER = new FoodEffectBase("resistance_cracker", 4, 1.5F, false, new PotionEffect(MobEffects.RESISTANCE, 2400, 1, false, true));
	public static final Item HASTE_CRACKER = new FoodEffectBase("haste_cracker", 4, 1.5F, false, new PotionEffect(MobEffects.HASTE, 2400, 1, false, true));
	public static final Item FIRERESISTANCE_CRACKER = new FoodEffectBase("fireresistance_cracker", 4, 1.5F, false, new PotionEffect(MobEffects.FIRE_RESISTANCE, 2400, 0, false, true));
	public static final Item NIGHTVISION_CRACKER = new FoodEffectBase("nightvision_cracker", 4, 1.5F, false, new PotionEffect(MobEffects.NIGHT_VISION, 2400, 0, false, true));
	public static final Item BREATH_CRACKER = new FoodEffectBase("breath_cracker", 4, 1.5F, false, new PotionEffect(MobEffects.WATER_BREATHING, 2400, 0, false, true));
	public static final Item INVIS_CRACKER = new FoodEffectBase("invis_cracker", 4, 1.5F, false, new PotionEffect(MobEffects.INVISIBILITY, 2400, 0, false, true));
	public static final Item JUMP_CRACKER = new FoodEffectBase("jump_cracker", 4, 1.5F, false, new PotionEffect(MobEffects.JUMP_BOOST, 2400, 0, false, true));
	public static final Item ABSORB_CRACKER = new FoodEffectBase("absorb_cracker", 4, 1.5F, false, new PotionEffect(MobEffects.ABSORPTION, 2400, 0, false, true));
	public static final Item BASE_CRACKER = new FoodBase("base_cracker", 2, 2.0F, false);
	public static final Item CHEESE = new FoodBase("cheese", 6, 0.6F, false);
	public static final Item ENCHANTED_CHEESE = new FoodMultiEffect("enchanted_cheese", 8, 1.25F, false);
}
