
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
	public static final RegistryObject<SoundEvent> STEELPIPE = REGISTRY.register("steelpipe", () -> new SoundEvent(new ResourceLocation("gba", "steelpipe")));
	public static final RegistryObject<SoundEvent> ROADROLLER = REGISTRY.register("roadroller", () -> new SoundEvent(new ResourceLocation("gba", "roadroller")));
	public static final RegistryObject<SoundEvent> IHAVEADREAM = REGISTRY.register("ihaveadream", () -> new SoundEvent(new ResourceLocation("gba", "ihaveadream")));
	public static final RegistryObject<SoundEvent> NANOMACHINE = REGISTRY.register("nanomachine", () -> new SoundEvent(new ResourceLocation("gba", "nanomachine")));
	public static final RegistryObject<SoundEvent> DETBLVNODTTILATVR = REGISTRY.register("detblvnodttilatvr", () -> new SoundEvent(new ResourceLocation("gba", "detblvnodttilatvr")));
	public static final RegistryObject<SoundEvent> CAESAR = REGISTRY.register("caesar", () -> new SoundEvent(new ResourceLocation("gba", "caesar")));
}
