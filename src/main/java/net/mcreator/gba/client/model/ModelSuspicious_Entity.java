package net.mcreator.gba.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSuspicious_Entity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("gba", "model_suspicious_entity"), "main");
	public final ModelPart Model;

	public ModelSuspicious_Entity(ModelPart root) {
		this.Model = root.getChild("Model");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Model = partdefinition.addOrReplaceChild("Model", CubeListBuilder.create(), PartPose.offset(0.0F, -177.0F, 25.0F));
		PartDefinition mid = Model.addOrReplaceChild("mid", CubeListBuilder.create(), PartPose.offset(0.0F, -93.0F, 216.0F));
		PartDefinition Torso = mid.addOrReplaceChild("Torso", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, -39.0F));
		PartDefinition ShoulderMid_r1 = Torso.addOrReplaceChild("ShoulderMid_r1", CubeListBuilder.create().texOffs(-106, -106).addBox(-144.0F, -125.8824F, -39.9463F, 263.0F, 161.0F, 115.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -81.0F, -358.0F, 1.3963F, 0.0F, 0.0F));
		PartDefinition Torso_r1 = Torso.addOrReplaceChild("Torso_r1", CubeListBuilder.create().texOffs(-106, -106).addBox(-116.0F, -381.6008F, -30.0773F, 219.0F, 331.0F, 115.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 39.0F, 1.3526F, 0.0F, 0.0F));
		PartDefinition Ribs = Torso.addOrReplaceChild("Ribs", CubeListBuilder.create(), PartPose.offset(0.0F, -34.0F, -283.0F));
		PartDefinition Right_Ribs = Ribs.addOrReplaceChild("Right_Ribs", CubeListBuilder.create(), PartPose.offset(-27.0F, 8.0F, 211.0F));
		PartDefinition cube_r1 = Right_Ribs.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(-73, -73).mirror().addBox(-97.0F, -112.6008F, -110.0773F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(-73, -73).mirror()
						.addBox(-97.0F, -235.6008F, -112.0773F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(-73, -73).mirror().addBox(-90.0F, -381.6008F, -113.0773F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3526F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Right_Ribs.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-73, -73).mirror().addBox(-7.0F, 231.6758F, -88.5084F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-90.0F, 33.0F, -362.0F, 1.3967F, -0.1321F, -0.6429F));
		PartDefinition cube_r3 = Right_Ribs.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(-26, -26).mirror().addBox(-48.6784F, 93.3086F, -24.9895F, 44.0F, 60.0F, 35.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-15.0F, 104.0F, -362.0F, 1.4862F, -0.2013F, -1.1695F));
		PartDefinition cube_r4 = Right_Ribs.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(-73, -73).mirror().addBox(-10.0F, 108.6758F, -88.5084F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-90.0F, 33.0F, -362.0F, 1.3725F, -0.0916F, -0.4272F));
		PartDefinition cube_r5 = Right_Ribs.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-66, -66).mirror().addBox(1.3816F, -52.9392F, -68.4497F, 44.0F, 63.0F, 75.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-80.0F, 130.0F, -362.0F, 1.4277F, -0.0983F, -0.8598F));
		PartDefinition cube_r6 = Right_Ribs.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-73, -73).mirror().addBox(-1.0F, -36.3242F, -88.5084F, 44.0F, 63.0F, 82.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-90.0F, 33.0F, -362.0F, 1.3989F, 0.0235F, -0.1272F));
		PartDefinition Left_Ribs = Ribs.addOrReplaceChild("Left_Ribs", CubeListBuilder.create(), PartPose.offset(27.0F, 8.0F, 211.0F));
		PartDefinition cube_r7 = Left_Ribs.addOrReplaceChild(
				"cube_r7", CubeListBuilder.create().texOffs(-73, -73).addBox(53.0F, -112.6008F, -110.0773F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)).texOffs(-73, -73)
						.addBox(53.0F, -235.6008F, -112.0773F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)).texOffs(-73, -73).addBox(46.0F, -381.6008F, -113.0773F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3526F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Left_Ribs.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-73, -73).addBox(-37.0F, 231.6758F, -88.5084F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(90.0F, 33.0F, -362.0F, 1.3967F, 0.1321F, 0.6429F));
		PartDefinition cube_r9 = Left_Ribs.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(-26, -26).addBox(4.6784F, 93.3086F, -24.9895F, 44.0F, 60.0F, 35.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, 104.0F, -362.0F, 1.4862F, 0.2013F, 1.1695F));
		PartDefinition cube_r10 = Left_Ribs.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(-73, -73).addBox(-34.0F, 108.6758F, -88.5084F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(90.0F, 33.0F, -362.0F, 1.3725F, 0.0916F, 0.4272F));
		PartDefinition cube_r11 = Left_Ribs.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(-66, -66).addBox(-45.3816F, -52.9392F, -68.4497F, 44.0F, 63.0F, 75.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(80.0F, 130.0F, -362.0F, 1.4277F, 0.0983F, 0.8598F));
		PartDefinition cube_r12 = Left_Ribs.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-73, -73).addBox(-43.0F, -36.3242F, -88.5084F, 44.0F, 63.0F, 82.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(90.0F, 33.0F, -362.0F, 1.3989F, -0.0235F, 0.1272F));
		PartDefinition Head = Torso.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -152.0F, -457.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition ShoulderMid_r2 = Head.addOrReplaceChild("ShoulderMid_r2", CubeListBuilder.create().texOffs(-135, -135).addBox(-80.0F, -185.6609F, -71.6115F, 150.0F, 164.0F, 144.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 23.0F, -23.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition Left_horn = Head.addOrReplaceChild("Left_horn", CubeListBuilder.create(), PartPose.offset(0.0F, 458.0F, 926.0F));
		PartDefinition ShoulderMid_r3 = Left_horn.addOrReplaceChild("ShoulderMid_r3", CubeListBuilder.create().texOffs(-29, -29).addBox(-36.0F, -165.9139F, 27.1009F, 37.0F, 179.0F, 38.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-76.0F, -514.0F, -1044.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition Right_horn = Head.addOrReplaceChild("Right_horn", CubeListBuilder.create(), PartPose.offset(0.0F, 458.0F, 926.0F));
		PartDefinition ShoulderMid_r4 = Right_horn.addOrReplaceChild("ShoulderMid_r4", CubeListBuilder.create().texOffs(-29, -29).mirror().addBox(-1.0F, -173.9139F, 27.1009F, 37.0F, 187.0F, 38.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(76.0F, -514.0F, -1044.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition Shoulders = Torso.addOrReplaceChild("Shoulders", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 39.0F));
		PartDefinition Left_shoulder = Shoulders.addOrReplaceChild("Left_shoulder", CubeListBuilder.create(), PartPose.offset(117.0F, -124.0F, -444.0F));
		PartDefinition Left_Shoulder2_r1 = Left_shoulder.addOrReplaceChild("Left_Shoulder2_r1", CubeListBuilder.create().texOffs(-106, -106).addBox(-2.0F, -72.8824F, -4.9463F, 274.0F, 94.0F, 115.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -32.0F, 47.0F, 1.5708F, 0.5672F, 1.5708F));
		PartDefinition Left_arm = Left_shoulder.addOrReplaceChild("Left_arm", CubeListBuilder.create(), PartPose.offset(61.0F, 164.0F, -125.0F));
		PartDefinition Left_albow_r1 = Left_arm.addOrReplaceChild("Left_albow_r1", CubeListBuilder.create().texOffs(-106, -106).addBox(4.5657F, -97.3287F, -61.9463F, 274.0F, 94.0F, 115.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 41.0F, 50.0F, 1.5708F, 0.9599F, 1.5708F));
		PartDefinition Left_Wrist = Left_arm.addOrReplaceChild("Left_Wrist", CubeListBuilder.create(), PartPose.offset(1.0F, 154.0F, -207.0F));
		PartDefinition Left_Wrist2_r1 = Left_Wrist.addOrReplaceChild("Left_Wrist2_r1", CubeListBuilder.create().texOffs(-94, -94).addBox(3.4614F, -33.1427F, -54.9463F, 42.0F, 59.0F, 103.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 1.5708F, 0.4363F, 1.5708F));
		PartDefinition Left_hand = Left_Wrist.addOrReplaceChild("Left_hand", CubeListBuilder.create(), PartPose.offset(-1.0F, 52.0F, -28.0F));
		PartDefinition Left_hand2_r1 = Left_hand.addOrReplaceChild("Left_hand2_r1", CubeListBuilder.create().texOffs(-95, -95).addBox(-7.01F, -21.9733F, -62.9463F, 104.0F, 34.0F, 104.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -5.0F, 7.0F, 1.5708F, 1.4399F, 1.5708F));
		PartDefinition Left_Thumb = Left_hand.addOrReplaceChild("Left_Thumb", CubeListBuilder.create(), PartPose.offset(-50.0F, -5.0F, 7.0F));
		PartDefinition Left_Joint2_r1 = Left_Thumb.addOrReplaceChild("Left_Joint2_r1", CubeListBuilder.create().texOffs(-46, -46).addBox(5.766F, -5.8762F, -55.9463F, 28.0F, 31.0F, 55.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -14.0F, 6.0F, 1.5708F, 1.4399F, 1.5708F));
		PartDefinition Left_Thumb_tip = Left_Thumb.addOrReplaceChild("Left_Thumb_tip", CubeListBuilder.create(), PartPose.offset(-49.0F, -14.0F, 3.0F));
		PartDefinition Left_thumb_tip2_r1 = Left_Thumb_tip.addOrReplaceChild("Left_thumb_tip2_r1", CubeListBuilder.create().texOffs(-33, -33).addBox(4.766F, -1.8762F, -98.9463F, 23.0F, 25.0F, 42.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(56.0F, 0.0F, 3.0F, 1.5708F, 1.4399F, 1.5708F));
		PartDefinition Left_Middle = Left_hand.addOrReplaceChild("Left_Middle", CubeListBuilder.create(), PartPose.offset(-20.0F, -8.0F, -86.0F));
		PartDefinition Left_middle2_r1 = Left_Middle.addOrReplaceChild("Left_middle2_r1", CubeListBuilder.create().texOffs(-57, -57).addBox(21.6387F, 4.4375F, -66.9463F, 23.0F, 31.0F, 66.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, -11.0F, -3.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Left_middlemid = Left_Middle.addOrReplaceChild("Left_middlemid", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -64.0F));
		PartDefinition Left_middlemid2_r1 = Left_middlemid.addOrReplaceChild("Left_middlemid2_r1", CubeListBuilder.create().texOffs(-73, -73).addBox(21.6387F, 4.4375F, -148.9463F, 23.0F, 31.0F, 82.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, -18.0F, 61.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Left_middletip = Left_middlemid.addOrReplaceChild("Left_middletip", CubeListBuilder.create(), PartPose.offset(-3.0F, 10.0F, -87.0F));
		PartDefinition Left_middletip2_r1 = Left_middletip.addOrReplaceChild("Left_middletip2_r1", CubeListBuilder.create().texOffs(-18, -18).addBox(21.6387F, 5.4375F, -175.9463F, 23.0F, 30.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.0F, -28.0F, 148.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Left_Ring = Left_hand.addOrReplaceChild("Left_Ring", CubeListBuilder.create(), PartPose.offset(18.0F, -4.0F, -91.0F));
		PartDefinition Left_ring2_r1 = Left_Ring.addOrReplaceChild("Left_ring2_r1", CubeListBuilder.create().texOffs(-52, -52).addBox(49.6387F, 5.4375F, -61.9463F, 23.0F, 30.0F, 61.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-61.0F, -15.0F, 2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition left_ringmid = Left_Ring.addOrReplaceChild("left_ringmid", CubeListBuilder.create(), PartPose.offset(-10.0F, 4.0F, -54.0F));
		PartDefinition Left_ringmid2_r1 = left_ringmid.addOrReplaceChild("Left_ringmid2_r1", CubeListBuilder.create().texOffs(-52, -52).addBox(49.6387F, 5.4375F, -122.9463F, 23.0F, 30.0F, 61.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-51.0F, -19.0F, 56.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Left_ringtip = left_ringmid.addOrReplaceChild("Left_ringtip", CubeListBuilder.create(), PartPose.offset(2.0F, 8.0F, -60.0F));
		PartDefinition Left_ringtip2_r1 = Left_ringtip.addOrReplaceChild("Left_ringtip2_r1", CubeListBuilder.create().texOffs(-33, -33).addBox(49.6387F, 5.4375F, -163.9463F, 23.0F, 30.0F, 42.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-53.0F, -27.0F, 116.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Left_Small = Left_hand.addOrReplaceChild("Left_Small", CubeListBuilder.create(), PartPose.offset(-50.0F, -52.0F, 28.0F));
		PartDefinition Left_smallStart_r1 = Left_Small.addOrReplaceChild("Left_smallStart_r1", CubeListBuilder.create().texOffs(-46, -46).addBox(78.6387F, 12.4375F, -55.9463F, 18.0F, 23.0F, 55.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 33.0F, -117.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Left_smallmid = Left_Small.addOrReplaceChild("Left_smallmid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Left_smallmid2_r1 = Left_smallmid.addOrReplaceChild("Left_smallmid2_r1", CubeListBuilder.create().texOffs(-23, -23).addBox(78.6387F, 12.4375F, -86.9463F, 18.0F, 23.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 33.0F, -117.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Left_Smalltip = Left_smallmid.addOrReplaceChild("Left_Smalltip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Left_Smalltip2_r1 = Left_Smalltip.addOrReplaceChild("Left_Smalltip2_r1", CubeListBuilder.create().texOffs(-23, -23).addBox(78.6387F, 12.4375F, -118.9463F, 18.0F, 23.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 33.0F, -117.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Left_Pointy = Left_hand.addOrReplaceChild("Left_Pointy", CubeListBuilder.create(), PartPose.offset(-50.0F, -52.0F, 26.0F));
		PartDefinition Left_pointyStart_r1 = Left_Pointy.addOrReplaceChild("Left_pointyStart_r1", CubeListBuilder.create().texOffs(-46, -46).addBox(-5.3613F, 7.4375F, -55.9463F, 23.0F, 28.0F, 55.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 33.0F, -117.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Left_pointy_mid = Left_Pointy.addOrReplaceChild("Left_pointy_mid", CubeListBuilder.create(), PartPose.offset(3.0F, 56.0F, -168.0F));
		PartDefinition Left_pointy_m2id_r1 = Left_pointy_mid.addOrReplaceChild("Left_pointy_m2id_r1", CubeListBuilder.create().texOffs(-47, -47).addBox(-5.3613F, 7.4375F, -110.9463F, 23.0F, 28.0F, 56.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -23.0F, 51.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Left_pointyTip = Left_pointy_mid.addOrReplaceChild("Left_pointyTip", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 5.0F, -54.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition Left_pointy_tip2_r1 = Left_pointyTip.addOrReplaceChild("Left_pointy_tip2_r1", CubeListBuilder.create().texOffs(-27, -27).addBox(-5.3613F, 7.4375F, -146.9463F, 23.0F, 28.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -28.0F, 105.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Right_shoulder = Shoulders.addOrReplaceChild("Right_shoulder", CubeListBuilder.create(), PartPose.offset(-117.0F, -120.0F, -448.0F));
		PartDefinition Left_Shoulder3_r1 = Right_shoulder.addOrReplaceChild("Left_Shoulder3_r1",
				CubeListBuilder.create().texOffs(-106, -106).mirror().addBox(-272.0F, -72.8824F, -4.9463F, 274.0F, 94.0F, 115.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0F, -36.0F, 51.0F, 1.5708F, -0.5672F, -1.5708F));
		PartDefinition Right_arm = Right_shoulder.addOrReplaceChild("Right_arm", CubeListBuilder.create(), PartPose.offset(-57.0F, 147.0F, -126.0F));
		PartDefinition Left_albow_r2 = Right_arm.addOrReplaceChild("Left_albow_r2", CubeListBuilder.create().texOffs(-106, -106).mirror().addBox(-278.5657F, -97.3287F, -61.9463F, 274.0F, 94.0F, 115.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0F, 54.0F, 55.0F, 1.5708F, -0.9599F, -1.5708F));
		PartDefinition Right_Wrist = Right_arm.addOrReplaceChild("Right_Wrist", CubeListBuilder.create(), PartPose.offset(-5.0F, 167.0F, -202.0F));
		PartDefinition Left_Wrist3_r1 = Right_Wrist.addOrReplaceChild("Left_Wrist3_r1", CubeListBuilder.create().texOffs(-94, -94).mirror().addBox(-45.4614F, -33.1427F, -50.9463F, 42.0F, 59.0F, 103.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 1.5708F, -0.4363F, -1.5708F));
		PartDefinition Right_hand = Right_Wrist.addOrReplaceChild("Right_hand", CubeListBuilder.create(), PartPose.offset(2.0F, 43.0F, -8.0F));
		PartDefinition Left_hand3_r1 = Right_hand.addOrReplaceChild("Left_hand3_r1", CubeListBuilder.create().texOffs(-95, -95).mirror().addBox(-96.99F, -21.9733F, -47.9463F, 104.0F, 34.0F, 104.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 4.0F, -13.0F, 1.5708F, -1.4399F, -1.5708F));
		PartDefinition Right_Thumb = Right_hand.addOrReplaceChild("Right_Thumb", CubeListBuilder.create(), PartPose.offset(49.0F, 4.0F, -13.0F));
		PartDefinition Left_Joint3_r1 = Right_Thumb.addOrReplaceChild("Left_Joint3_r1", CubeListBuilder.create().texOffs(-46, -46).mirror().addBox(-33.766F, -5.8762F, -55.9463F, 28.0F, 31.0F, 55.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0F, -14.0F, 6.0F, 1.5708F, -1.4399F, -1.5708F));
		PartDefinition Right_Thumb_tip = Right_Thumb.addOrReplaceChild("Right_Thumb_tip", CubeListBuilder.create(), PartPose.offset(49.0F, -14.0F, 3.0F));
		PartDefinition Left_thumb_tip3_r1 = Right_Thumb_tip.addOrReplaceChild("Left_thumb_tip3_r1",
				CubeListBuilder.create().texOffs(-33, -33).mirror().addBox(-27.766F, -1.8762F, -98.9463F, 23.0F, 25.0F, 42.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-56.0F, 0.0F, 3.0F, 1.5708F, -1.4399F, -1.5708F));
		PartDefinition Right_Middle = Right_hand.addOrReplaceChild("Right_Middle", CubeListBuilder.create(), PartPose.offset(19.0F, 1.0F, -106.0F));
		PartDefinition Left_middle3_r1 = Right_Middle.addOrReplaceChild("Left_middle3_r1", CubeListBuilder.create().texOffs(-57, -57).mirror().addBox(-44.6387F, 4.4375F, -66.9463F, 23.0F, 31.0F, 66.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(23.0F, -11.0F, -3.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Right_middlemid = Right_Middle.addOrReplaceChild("Right_middlemid", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -64.0F));
		PartDefinition Left_middlemid3_r1 = Right_middlemid.addOrReplaceChild("Left_middlemid3_r1",
				CubeListBuilder.create().texOffs(-73, -73).mirror().addBox(-44.6387F, 4.4375F, -148.9463F, 23.0F, 31.0F, 82.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(23.0F, -18.0F, 61.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Right_middletip = Right_middlemid.addOrReplaceChild("Right_middletip", CubeListBuilder.create(), PartPose.offset(3.0F, 10.0F, -87.0F));
		PartDefinition Left_middletip3_r1 = Right_middletip.addOrReplaceChild("Left_middletip3_r1",
				CubeListBuilder.create().texOffs(-18, -18).mirror().addBox(-44.6387F, 5.4375F, -175.9463F, 23.0F, 30.0F, 27.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(20.0F, -28.0F, 148.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Right_Ring = Right_hand.addOrReplaceChild("Right_Ring", CubeListBuilder.create(), PartPose.offset(-19.0F, 5.0F, -111.0F));
		PartDefinition Left_ring3_r1 = Right_Ring.addOrReplaceChild("Left_ring3_r1", CubeListBuilder.create().texOffs(-52, -52).mirror().addBox(-72.6387F, 5.4375F, -61.9463F, 23.0F, 30.0F, 61.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(61.0F, -15.0F, 2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition right_ringmid = Right_Ring.addOrReplaceChild("right_ringmid", CubeListBuilder.create(), PartPose.offset(10.0F, 4.0F, -54.0F));
		PartDefinition Left_ringmid3_r1 = right_ringmid.addOrReplaceChild("Left_ringmid3_r1", CubeListBuilder.create().texOffs(-52, -52).mirror().addBox(-72.6387F, 5.4375F, -122.9463F, 23.0F, 30.0F, 61.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(51.0F, -19.0F, 56.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Right_ringtip = right_ringmid.addOrReplaceChild("Right_ringtip", CubeListBuilder.create(), PartPose.offset(-2.0F, 8.0F, -60.0F));
		PartDefinition Left_ringtip3_r1 = Right_ringtip.addOrReplaceChild("Left_ringtip3_r1", CubeListBuilder.create().texOffs(-33, -33).mirror().addBox(-72.6387F, 5.4375F, -163.9463F, 23.0F, 30.0F, 42.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(53.0F, -27.0F, 116.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Right_Small = Right_hand.addOrReplaceChild("Right_Small", CubeListBuilder.create(), PartPose.offset(49.0F, -43.0F, 8.0F));
		PartDefinition Left_smallStart_r2 = Right_Small.addOrReplaceChild("Left_smallStart_r2", CubeListBuilder.create().texOffs(-46, -46).mirror().addBox(-96.6387F, 12.4375F, -55.9463F, 18.0F, 23.0F, 55.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0F, 33.0F, -117.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Right_smallmid = Right_Small.addOrReplaceChild("Right_smallmid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Left_smallmid3_r1 = Right_smallmid.addOrReplaceChild("Left_smallmid3_r1", CubeListBuilder.create().texOffs(-23, -23).mirror().addBox(-96.6387F, 12.4375F, -86.9463F, 18.0F, 23.0F, 32.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0F, 33.0F, -117.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Right_Smalltip = Right_smallmid.addOrReplaceChild("Right_Smalltip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Left_Smalltip3_r1 = Right_Smalltip.addOrReplaceChild("Left_Smalltip3_r1",
				CubeListBuilder.create().texOffs(-23, -23).mirror().addBox(-96.6387F, 12.4375F, -118.9463F, 18.0F, 23.0F, 32.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0F, 33.0F, -117.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Right_Pointy = Right_hand.addOrReplaceChild("Right_Pointy", CubeListBuilder.create(), PartPose.offset(49.0F, -43.0F, 6.0F));
		PartDefinition Left_pointyStart_r2 = Right_Pointy.addOrReplaceChild("Left_pointyStart_r2",
				CubeListBuilder.create().texOffs(-46, -46).mirror().addBox(-17.6387F, 7.4375F, -55.9463F, 23.0F, 28.0F, 55.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0F, 33.0F, -117.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Right_pointy_mid = Right_Pointy.addOrReplaceChild("Right_pointy_mid", CubeListBuilder.create(), PartPose.offset(-3.0F, 56.0F, -168.0F));
		PartDefinition Left_pointy_m2id_r2 = Right_pointy_mid.addOrReplaceChild("Left_pointy_m2id_r2",
				CubeListBuilder.create().texOffs(-47, -47).mirror().addBox(-17.6387F, 7.4375F, -110.9463F, 23.0F, 28.0F, 56.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, -23.0F, 51.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Right_pointyTip = Right_pointy_mid.addOrReplaceChild("Right_pointyTip", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 5.0F, -54.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition Left_pointy_tip3_r1 = Right_pointyTip.addOrReplaceChild("Left_pointy_tip3_r1",
				CubeListBuilder.create().texOffs(-27, -27).mirror().addBox(-17.6387F, 7.4375F, -146.9463F, 23.0F, 28.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -28.0F, 105.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Pelvis = Torso.addOrReplaceChild("Pelvis", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 39.0F));
		PartDefinition Pelvis_r1 = Pelvis.addOrReplaceChild("Pelvis_r1", CubeListBuilder.create().texOffs(-106, -106).addBox(-116.0F, -86.4117F, -53.7831F, 226.0F, 164.0F, 115.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 35.0F, 1.0472F, 0.0F, 0.0F));
		PartDefinition Ribs2 = Pelvis.addOrReplaceChild("Ribs2", CubeListBuilder.create(), PartPose.offset(0.0F, -16.0F, -73.0F));
		PartDefinition Left_Pelvisribs = Ribs2.addOrReplaceChild("Left_Pelvisribs", CubeListBuilder.create(), PartPose.offsetAndRotation(85.0F, 45.0F, 34.0F, -0.3478F, -0.0298F, -0.082F));
		PartDefinition cube_r13 = Left_Pelvisribs.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(-73, -73).addBox(-36.0F, 360.6758F, -88.5084F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -12.0F, -396.0F, 1.4221F, 0.1603F, 0.8171F));
		PartDefinition cube_r14 = Left_Pelvisribs.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(-73, -73).addBox(53.0F, 14.3992F, -113.0773F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-85.0F, -45.0F, -34.0F, 1.3526F, 0.0F, 0.0F));
		PartDefinition Right_Pelvisribs = Ribs2.addOrReplaceChild("Right_Pelvisribs", CubeListBuilder.create(), PartPose.offsetAndRotation(-85.0F, 45.0F, 34.0F, -0.3478F, 0.0298F, 0.082F));
		PartDefinition cube_r15 = Right_Pelvisribs.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(-73, -73).mirror().addBox(-8.0F, 360.6758F, -88.5084F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, -12.0F, -396.0F, 1.4221F, -0.1603F, -0.8171F));
		PartDefinition cube_r16 = Right_Pelvisribs.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(-73, -73).mirror().addBox(-97.0F, 14.3992F, -113.0773F, 44.0F, 60.0F, 82.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(85.0F, -45.0F, -34.0F, 1.3526F, 0.0F, 0.0F));
		PartDefinition bottom = Model.addOrReplaceChild("bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 193.0F, 646.0F));
		PartDefinition Right_Leg = bottom.addOrReplaceChild("Right_Leg", CubeListBuilder.create(), PartPose.offset(-123.0F, -23.0F, -116.0F));
		PartDefinition Right_thigh = Right_Leg.addOrReplaceChild("Right_thigh", CubeListBuilder.create(), PartPose.offset(0.0F, -266.0F, -330.0F));
		PartDefinition Left_Thigh_r1 = Right_thigh.addOrReplaceChild("Left_Thigh_r1", CubeListBuilder.create().texOffs(-73, -73).mirror().addBox(-44.0F, -4.4308F, -22.9512F, 68.0F, 450.0F, 82.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.0F, 0.0F, 0.0F, 0.9163F, 0.0F, 0.0F));
		PartDefinition Right_knee = Right_thigh.addOrReplaceChild("Right_knee", CubeListBuilder.create(), PartPose.offset(0.0F, 266.0F, 330.0F));
		PartDefinition Left_knee_r1 = Right_knee.addOrReplaceChild("Left_knee_r1", CubeListBuilder.create().texOffs(-73, -73).mirror().addBox(-34.0F, -3.9075F, -23.2992F, 68.0F, 403.0F, 82.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 30.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition Left_Leg = bottom.addOrReplaceChild("Left_Leg", CubeListBuilder.create(), PartPose.offset(123.0F, -282.0F, -419.0F));
		PartDefinition Left_thigh = Left_Leg.addOrReplaceChild("Left_thigh", CubeListBuilder.create(), PartPose.offset(0.0F, 13.0F, 11.0F));
		PartDefinition Left_Thigh_r2 = Left_thigh.addOrReplaceChild("Left_Thigh_r2", CubeListBuilder.create().texOffs(-73, -73).addBox(-19.0F, -4.4308F, -22.9512F, 68.0F, 450.0F, 82.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, -20.0F, -38.0F, 0.9163F, 0.0F, 0.0F));
		PartDefinition Left_knee = Left_thigh.addOrReplaceChild("Left_knee", CubeListBuilder.create(), PartPose.offset(0.0F, 246.0F, 322.0F));
		PartDefinition Left_knee_r2 = Left_knee.addOrReplaceChild("Left_knee_r2", CubeListBuilder.create().texOffs(-73, -73).addBox(-34.0F, -3.9075F, -23.2992F, 68.0F, 403.0F, 82.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition Top = Model.addOrReplaceChild("Top", CubeListBuilder.create(), PartPose.offset(0.0F, -93.0F, 216.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Model.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
