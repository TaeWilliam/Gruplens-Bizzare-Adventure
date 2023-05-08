
package net.mcreator.gba.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.gba.procedures.EngisPvPGlockProjectileHitsBlockProcedure;
import net.mcreator.gba.init.GbaModItems;
import net.mcreator.gba.init.GbaModEntities;
import net.mcreator.gba.init.GbaModBlocks;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class EngisPvPGlockEntity extends AbstractArrow implements ItemSupplier {
	public EngisPvPGlockEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(GbaModEntities.ENGIS_PV_P_GLOCK.get(), world);
	}

	public EngisPvPGlockEntity(EntityType<? extends EngisPvPGlockEntity> type, Level world) {
		super(type, world);
	}

	public EngisPvPGlockEntity(EntityType<? extends EngisPvPGlockEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public EngisPvPGlockEntity(EntityType<? extends EngisPvPGlockEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(GbaModBlocks.ENGI_MINE.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(GbaModItems.SMALL_BULLET.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		EngisPvPGlockProjectileHitsBlockProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		EngisPvPGlockProjectileHitsBlockProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		EngisPvPGlockProjectileHitsBlockProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static EngisPvPGlockEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		EngisPvPGlockEntity entityarrow = new EngisPvPGlockEntity(GbaModEntities.ENGIS_PV_P_GLOCK.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static EngisPvPGlockEntity shoot(LivingEntity entity, LivingEntity target) {
		EngisPvPGlockEntity entityarrow = new EngisPvPGlockEntity(GbaModEntities.ENGIS_PV_P_GLOCK.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 19f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0);
		entityarrow.setKnockback(10);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
