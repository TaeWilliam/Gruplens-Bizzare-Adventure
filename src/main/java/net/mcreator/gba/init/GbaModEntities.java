
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
import net.mcreator.gba.entity.TrueBrondbyEntity;
import net.mcreator.gba.entity.SvenskerEntity;
import net.mcreator.gba.entity.SuspiciusthingEntity;
import net.mcreator.gba.entity.SenatorArmstaerkEntity;
import net.mcreator.gba.entity.STOPEntity;
import net.mcreator.gba.entity.ROADROLLEREntity;
import net.mcreator.gba.entity.PointEntity;
import net.mcreator.gba.entity.GucciBePissedEntity;
import net.mcreator.gba.entity.GlockEntity;
import net.mcreator.gba.entity.FriendlyGucciEntity;
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
	public static final RegistryObject<EntityType<PointEntity>> POINT = register("projectile_point",
			EntityType.Builder.<PointEntity>of(PointEntity::new, MobCategory.MISC).setCustomClientFactory(PointEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

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
	}
}
