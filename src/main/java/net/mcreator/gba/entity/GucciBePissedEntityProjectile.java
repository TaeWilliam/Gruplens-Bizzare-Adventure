
package net.mcreator.gba.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

import net.mcreator.gba.init.GbaModItems;
import net.mcreator.gba.init.GbaModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class GucciBePissedEntityProjectile extends AbstractArrow implements ItemSupplier {
	public GucciBePissedEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(GbaModEntities.GUCCI_BE_PISSED_PROJECTILE.get(), world);
	}

	public GucciBePissedEntityProjectile(EntityType<? extends GucciBePissedEntityProjectile> type, Level world) {
		super(type, world);
	}

	public GucciBePissedEntityProjectile(EntityType<? extends GucciBePissedEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public GucciBePissedEntityProjectile(EntityType<? extends GucciBePissedEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(GbaModItems.ENGI_GLOCK.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(GbaModItems.ENGI_GLOCK.get());
	}
}
