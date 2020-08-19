package com.ldshadowlady.disney.client.model.bambiHat;
// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;

public class bambiHat extends BipedModel<LivingEntity> {
	private final ModelRenderer group;
	private final ModelRenderer bone;

	public bambiHat() {
		textureWidth = 16;
		textureHeight = 16;

		group = new ModelRenderer(this);
		group.setRotationPoint(-8.0F, 16.0F, 8.0F);
		group.setTextureOffset(14, 12).addBox(2.5F, -4.0F, -8.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(0, 12).addBox(12.5F, -4.0F, -8.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(2, 11).addBox(3.5F, -5.0F, -8.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		group.setTextureOffset(2, 11).addBox(11.5F, -5.0F, -8.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		group.setTextureOffset(12, 12).addBox(5.5F, -3.0F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(12, 12).addBox(9.5F, -3.0F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(12, 12).addBox(4.5F, -4.0F, -8.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(1, 12).addBox(10.5F, -4.0F, -8.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(9, 12).addBox(-3.5F, -10.0F, -4.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(6, 4).addBox(-3.5F, -10.0F, 3.5F, 7.0F, 1.0F, 1.0F, 0.0F, true);
		bone.setTextureOffset(9, 6).addBox(-4.5F, -10.0F, -3.5F, 9.0F, 1.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(3, 8).addBox(-4.5F, -9.0F, -4.5F, 9.0F, 4.0F, 9.0F, 0.0F, false);
		bone.setTextureOffset(8, 13).addBox(-1.5F, -7.0F, -6.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(8, 13).addBox(-2.5F, -7.0F, -5.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		group.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}