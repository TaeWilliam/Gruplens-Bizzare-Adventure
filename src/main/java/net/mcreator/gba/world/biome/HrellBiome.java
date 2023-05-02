
package net.mcreator.gba.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.AmbientAdditionsSettings;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;

public class HrellBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-12112384).waterColor(-12112384).waterFogColor(-12112384).skyColor(-12112384).foliageColorOverride(-12112384).grassColorOverride(-12112384)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("block.slime_block.hit"))).ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("entity.slime.squish")), 6000, 8, 2))
				.ambientAdditionsSound(new AmbientAdditionsSettings(new SoundEvent(new ResourceLocation("entity.slime.jump")), 0.0111D)).backgroundMusic(new Music(new SoundEvent(new ResourceLocation("block.slime_block.fall")), 12000, 24000, true))
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.SOUL, 0.005f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).temperature(0f).downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
