
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gba.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.gba.client.renderer.TrueBrondbyRenderer;
import net.mcreator.gba.client.renderer.SvenskerRenderer;
import net.mcreator.gba.client.renderer.SuspiciusthingRenderer;
import net.mcreator.gba.client.renderer.SenatorArmstaerkRenderer;
import net.mcreator.gba.client.renderer.ROADROLLERRenderer;
import net.mcreator.gba.client.renderer.GucciBePissedRenderer;
import net.mcreator.gba.client.renderer.FriendlyGucciRenderer;
import net.mcreator.gba.client.renderer.DAMPTROMLEERenderer;
import net.mcreator.gba.client.renderer.BrondbyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GbaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GbaModEntities.GLOCK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GbaModEntities.WARM_GLOCK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GbaModEntities.ENGI_GLOCK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GbaModEntities.STOP.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GbaModEntities.ROADROLLER.get(), ROADROLLERRenderer::new);
		event.registerEntityRenderer(GbaModEntities.DAMPTROMLEE.get(), DAMPTROMLEERenderer::new);
		event.registerEntityRenderer(GbaModEntities.FRIENDLY_GUCCI.get(), FriendlyGucciRenderer::new);
		event.registerEntityRenderer(GbaModEntities.SENATOR_ARMSTAERK.get(), SenatorArmstaerkRenderer::new);
		event.registerEntityRenderer(GbaModEntities.CAESAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GbaModEntities.SVENSKER.get(), SvenskerRenderer::new);
		event.registerEntityRenderer(GbaModEntities.BRONDBY.get(), BrondbyRenderer::new);
		event.registerEntityRenderer(GbaModEntities.TRUE_BRONDBY.get(), TrueBrondbyRenderer::new);
		event.registerEntityRenderer(GbaModEntities.SUSPICIUSTHING.get(), SuspiciusthingRenderer::new);
		event.registerEntityRenderer(GbaModEntities.GUCCI_BE_PISSED.get(), GucciBePissedRenderer::new);
		event.registerEntityRenderer(GbaModEntities.POINT.get(), ThrownItemRenderer::new);
	}
}
