
package net.mcreator.gba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gba.entity.SenatorArmstaerkEntity;
import net.mcreator.gba.client.model.Modelsenator;

public class SenatorArmstaerkRenderer extends MobRenderer<SenatorArmstaerkEntity, Modelsenator<SenatorArmstaerkEntity>> {
	public SenatorArmstaerkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsenator(context.bakeLayer(Modelsenator.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SenatorArmstaerkEntity entity) {
		return new ResourceLocation("gba:textures/entities/senatorr.png");
	}
}
