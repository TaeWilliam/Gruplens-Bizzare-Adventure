
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gba.init;

import org.lwjgl.system.windows.POINT;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.gba.entity.WarmGlockEntity;
import net.mcreator.gba.entity.UncontrollableMininukeEntity;
import net.mcreator.gba.entity.TrueBrondbyEntity;
import net.mcreator.gba.entity.TheTeamEntity;
import net.mcreator.gba.entity.SvenskerEntity;
import net.mcreator.gba.entity.SuspiciusthingEntity;
import net.mcreator.gba.entity.SpyEntity;
import net.mcreator.gba.entity.SoldierEntity;
import net.mcreator.gba.entity.SniperentityEntity;
import net.mcreator.gba.entity.SniperEntity;
import net.mcreator.gba.entity.SenatorArmstaerkEntity;
import net.mcreator.gba.entity.ScoutEntity;
import net.mcreator.gba.entity.STOPEntity;
import net.mcreator.gba.entity.ROADROLLEREntity;
import net.mcreator.gba.entity.PyroGunEntity;
import net.mcreator.gba.entity.PyroEntityProjectile;
import net.mcreator.gba.entity.PyroEntity;
import net.mcreator.gba.entity.PointEntity;
import net.mcreator.gba.entity.InvisibleCreeperEntity;
import net.mcreator.gba.entity.HordeEntity;
import net.mcreator.gba.entity.HeavyEntityProjectile;
import net.mcreator.gba.entity.HeavyEntity;
import net.mcreator.gba.entity.GucciBePissedEntityProjectile;
import net.mcreator.gba.entity.GucciBePissedEntity;
import net.mcreator.gba.entity.GlockEntity;
import net.mcreator.gba.entity.FurryEntity;
import net.mcreator.gba.entity.FriendlyGucciEntity;
import net.mcreator.gba.entity.EngisPvPGlockEntity;
import net.mcreator.gba.entity.EngiGlockEntity;
import net.mcreator.gba.entity.DAMPTROMLEEEntity;
import net.mcreator.gba.entity.CAESAREntity;
import net.mcreator.gba.entity.BrondbyEntity;
import net.mcreator.gba.GbaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GbaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GbaMod.MODID);
	public static final RegistryObject<EntityType<GlockEntity>> GLOCK = register("projectile_glock",
			EntityType.Builder.<GlockEntity>of(GlockEntity::new, MobCategory.MISC).setCustomClientFactory(GlockEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WarmGlockEntity>> WARM_GLOCK = register("projectile_warm_glock",
			EntityType.Builder.<WarmGlockEntity>of(WarmGlockEntity::new, MobCategory.MISC).setCustomClientFactory(WarmGlockEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EngiGlockEntity>> ENGI_GLOCK = register("projectile_engi_glock",
			EntityType.Builder.<EngiGlockEntity>of(EngiGlockEntity::new, MobCategory.MISC).setCustomClientFactory(EngiGlockEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<STOPEntity>> STOP = register("projectile_stop",
			EntityType.Builder.<STOPEntity>of(STOPEntity::new, MobCategory.MISC).setCustomClientFactory(STOPEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ROADROLLEREntity>> ROADROLLER = register("projectile_roadroller",
			EntityType.Builder.<ROADROLLEREntity>of(ROADROLLEREntity::new, MobCategory.MISC).setCustomClientFactory(ROADROLLEREntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DAMPTROMLEEEntity>> DAMPTROMLEE = register("damptromlee",
			EntityType.Builder.<DAMPTROMLEEEntity>of(DAMPTROMLEEEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DAMPTROMLEEEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FriendlyGucciEntity>> FRIENDLY_GUCCI = register("friendly_gucci",
			EntityType.Builder.<FriendlyGucciEntity>of(FriendlyGucciEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FriendlyGucciEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SenatorArmstaerkEntity>> SENATOR_ARMSTAERK = register("senator_armstaerk",
			EntityType.Builder.<SenatorArmstaerkEntity>of(SenatorArmstaerkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SenatorArmstaerkEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CAESAREntity>> CAESAR = register("projectile_caesar",
			EntityType.Builder.<CAESAREntity>of(CAESAREntity::new, MobCategory.MISC).setCustomClientFactory(CAESAREntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SvenskerEntity>> SVENSKER = register("svensker",
			EntityType.Builder.<SvenskerEntity>of(SvenskerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SvenskerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BrondbyEntity>> BRONDBY = register("brondby",
			EntityType.Builder.<BrondbyEntity>of(BrondbyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BrondbyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TrueBrondbyEntity>> TRUE_BRONDBY = register("true_brondby",
			EntityType.Builder.<TrueBrondbyEntity>of(TrueBrondbyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrueBrondbyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SuspiciusthingEntity>> SUSPICIUSTHING = register("suspiciusthing",
			EntityType.Builder.<SuspiciusthingEntity>of(SuspiciusthingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(SuspiciusthingEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GucciBePissedEntity>> GUCCI_BE_PISSED = register("gucci_be_pissed",
			EntityType.Builder.<GucciBePissedEntity>of(GucciBePissedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GucciBePissedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GucciBePissedEntityProjectile>> GUCCI_BE_PISSED_PROJECTILE = register("projectile_gucci_be_pissed",
			EntityType.Builder.<GucciBePissedEntityProjectile>of(GucciBePissedEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(GucciBePissedEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PointEntity>> POINT = register("projectile_point",
			EntityType.Builder.<PointEntity>of(PointEntity::new, MobCategory.MISC).setCustomClientFactory(PointEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ScoutEntity>> SCOUT = register("scout",
			EntityType.Builder.<ScoutEntity>of(ScoutEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScoutEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HeavyEntity>> HEAVY = register("heavy",
			EntityType.Builder.<HeavyEntity>of(HeavyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HeavyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HeavyEntityProjectile>> HEAVY_PROJECTILE = register("projectile_heavy", EntityType.Builder.<HeavyEntityProjectile>of(HeavyEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(HeavyEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SniperentityEntity>> SNIPERENTITY = register("projectile_sniperentity",
			EntityType.Builder.<SniperentityEntity>of(SniperentityEntity::new, MobCategory.MISC).setCustomClientFactory(SniperentityEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SniperEntity>> SNIPER = register("sniper",
			EntityType.Builder.<SniperEntity>of(SniperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SniperEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SoldierEntity>> SOLDIER = register("soldier",
			EntityType.Builder.<SoldierEntity>of(SoldierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SoldierEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpyEntity>> SPY = register("spy",
			EntityType.Builder.<SpyEntity>of(SpyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TheTeamEntity>> THE_TEAM = register("projectile_the_team",
			EntityType.Builder.<TheTeamEntity>of(TheTeamEntity::new, MobCategory.MISC).setCustomClientFactory(TheTeamEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FurryEntity>> FURRY = register("furry",
			EntityType.Builder.<FurryEntity>of(FurryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FurryEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HordeEntity>> HORDE = register("projectile_horde",
			EntityType.Builder.<HordeEntity>of(HordeEntity::new, MobCategory.MISC).setCustomClientFactory(HordeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PyroGunEntity>> PYRO_GUN = register("projectile_pyro_gun",
			EntityType.Builder.<PyroGunEntity>of(PyroGunEntity::new, MobCategory.MISC).setCustomClientFactory(PyroGunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PyroEntity>> PYRO = register("pyro",
			EntityType.Builder.<PyroEntity>of(PyroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PyroEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PyroEntityProjectile>> PYRO_PROJECTILE = register("projectile_pyro",
			EntityType.Builder.<PyroEntityProjectile>of(PyroEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(PyroEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<UncontrollableMininukeEntity>> UNCONTROLLABLE_MININUKE = register("projectile_uncontrollable_mininuke",
			EntityType.Builder.<UncontrollableMininukeEntity>of(UncontrollableMininukeEntity::new, MobCategory.MISC).setCustomClientFactory(UncontrollableMininukeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<InvisibleCreeperEntity>> INVISIBLE_CREEPER = register("invisible_creeper",
			EntityType.Builder.<InvisibleCreeperEntity>of(InvisibleCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InvisibleCreeperEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<EngisPvPGlockEntity>> ENGIS_PV_P_GLOCK = register("projectile_engis_pv_p_glock",
			EntityType.Builder.<EngisPvPGlockEntity>of(EngisPvPGlockEntity::new, MobCategory.MISC).setCustomClientFactory(EngisPvPGlockEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DAMPTROMLEEEntity.init();
			FriendlyGucciEntity.init();
			SenatorArmstaerkEntity.init();
			SvenskerEntity.init();
			BrondbyEntity.init();
			TrueBrondbyEntity.init();
			SuspiciusthingEntity.init();
			GucciBePissedEntity.init();
			ScoutEntity.init();
			HeavyEntity.init();
			SniperEntity.init();
			SoldierEntity.init();
			SpyEntity.init();
			FurryEntity.init();
			PyroEntity.init();
			InvisibleCreeperEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DAMPTROMLEE.get(), DAMPTROMLEEEntity.createAttributes().build());
		event.put(FRIENDLY_GUCCI.get(), FriendlyGucciEntity.createAttributes().build());
		event.put(SENATOR_ARMSTAERK.get(), SenatorArmstaerkEntity.createAttributes().build());
		event.put(SVENSKER.get(), SvenskerEntity.createAttributes().build());
		event.put(BRONDBY.get(), BrondbyEntity.createAttributes().build());
		event.put(TRUE_BRONDBY.get(), TrueBrondbyEntity.createAttributes().build());
		event.put(SUSPICIUSTHING.get(), SuspiciusthingEntity.createAttributes().build());
		event.put(GUCCI_BE_PISSED.get(), GucciBePissedEntity.createAttributes().build());
		event.put(SCOUT.get(), ScoutEntity.createAttributes().build());
		event.put(HEAVY.get(), HeavyEntity.createAttributes().build());
		event.put(SNIPER.get(), SniperEntity.createAttributes().build());
		event.put(SOLDIER.get(), SoldierEntity.createAttributes().build());
		event.put(SPY.get(), SpyEntity.createAttributes().build());
		event.put(FURRY.get(), FurryEntity.createAttributes().build());
		event.put(PYRO.get(), PyroEntity.createAttributes().build());
		event.put(INVISIBLE_CREEPER.get(), InvisibleCreeperEntity.createAttributes().build());
	}
}
