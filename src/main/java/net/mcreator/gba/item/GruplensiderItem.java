
package net.mcreator.gba.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.gba.procedures.GruplensiderPlayerFinishesUsingItemProcedure;

import java.util.List;

public class GruplensiderItem extends Item {
	public GruplensiderItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(12).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Kan bruges til at hidkalde en hj\u00E6lpende ven"));
		list.add(Component.literal("(du kan ogs\u00E5 bare spise den men plz kun spis en af gangen)"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GruplensiderPlayerFinishesUsingItemProcedure.execute(world, entity);
		return retval;
	}
}
