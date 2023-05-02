
package net.mcreator.gba.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gba.entity.DAMPTROMLEEEntity;
import net.mcreator.gba.client.model.Modelroadroller;

public class DAMPTROMLEERenderer extends MobRenderer<DAMPTROMLEEEntity, Modelroadroller<DAMPTROMLEEEntity>> {
	public DAMPTROMLEERenderer(EntityRendererProvider.Context context) {
		super(context, new Modelroadroller(context.bakeLayer(Modelroadroller.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DAMPTROMLEEEntity entity) {
		return new ResourceLocation("gba:textures/entities/roadrollerrr.png");
	}
}
