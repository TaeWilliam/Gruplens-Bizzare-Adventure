
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gba.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.gba.GbaMod;

public class GbaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GbaMod.MODID);
	public static final RegistryObject<SoundEvent> GRUPLEN_SANG1 = REGISTRY.register("gruplen_sang1", () -> new SoundEvent(new ResourceLocation("gba", "gruplen_sang1")));
	public static final RegistryObject<SoundEvent> GRUPLENSANG2 = REGISTRY.register("gruplensang2", () -> new SoundEvent(new ResourceLocation("gba", "gruplensang2")));
	public static final RegistryObject<SoundEvent> GRUPLENSANG3 = REGISTRY.register("gruplensang3", () -> new SoundEvent(new ResourceLocation("gba", "gruplensang3")));
	public static final RegistryObject<SoundEvent> GRUPLENSANG4 = REGISTRY.register("gruplensang4", () -> new SoundEvent(new ResourceLocation("gba", "gruplensang4")));
	public static final RegistryObject<SoundEvent> GRUPLENSANG5 = REGISTRY.register("gruplensang5", () -> new SoundEvent(new ResourceLocation("gba", "gruplensang5")));
}
