package com.anacampserosrose.enchantedforestmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Flamingo
 * Created by Beethoven#2693 using Tabula 7.0.0
 */
@SideOnly(Side.CLIENT)
public class ModelFlamingo extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LegB1;
    public ModelRenderer LegA1;
    public ModelRenderer Neck1;
    public ModelRenderer WingB;
    public ModelRenderer WingB_1;
    public ModelRenderer Tail;
    public ModelRenderer LegB2;
    public ModelRenderer LegA2;
    public ModelRenderer Neck2;
    public ModelRenderer Neck3;
    public ModelRenderer Head;
    public ModelRenderer Beak;

    public ModelFlamingo() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.WingB = new ModelRenderer(this, 40, 0);
        this.WingB.setRotationPoint(3.1F, -0.5F, 0.0F);
        this.WingB.addBox(0.0F, -1.0F, -3.0F, 0, 6, 6, 0.0F);
        this.Neck2 = new ModelRenderer(this, 0, 30);
        this.Neck2.setRotationPoint(0.0F, -2.0F, 0.5F);
        this.Neck2.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.Neck1 = new ModelRenderer(this, 0, 30);
        this.Neck1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.Neck1.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.WingB_1 = new ModelRenderer(this, 40, 0);
        this.WingB_1.setRotationPoint(-3.1F, -0.5F, 0.0F);
        this.WingB_1.addBox(0.0F, -1.0F, -3.0F, 0, 6, 6, 0.0F);
        this.LegA1 = new ModelRenderer(this, 22, 0);
        this.LegA1.setRotationPoint(-2.5F, 3.5F, 0.0F);
        this.LegA1.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(LegA1, 0.2617993877991494F, 0.0F, 0.0F);
        this.LegA2 = new ModelRenderer(this, 30, 0);
        this.LegA2.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.LegA2.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(LegA2, -0.2617993877991494F, 0.0F, 0.0F);
        this.LegB1 = new ModelRenderer(this, 22, 0);
        this.LegB1.setRotationPoint(2.5F, 3.5F, 0.0F);
        this.LegB1.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(LegB1, 0.2617993877991494F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 20);
        this.Head.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Head.addBox(-2.0F, -1.0F, -3.0F, 4, 4, 4, 0.0F);
        this.Tail = new ModelRenderer(this, 0, 56);
        this.Tail.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.Tail.addBox(-2.5F, -2.0F, -1.0F, 5, 4, 2, 0.0F);
        this.LegB2 = new ModelRenderer(this, 30, 0);
        this.LegB2.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.LegB2.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(LegB2, -0.2617993877991494F, 0.0F, 0.0F);
        this.Neck3 = new ModelRenderer(this, 0, 30);
        this.Neck3.setRotationPoint(0.0F, -2.0F, 0.5F);
        this.Neck3.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.Body.addBox(-3.0F, -2.0F, -4.0F, 6, 6, 8, 0.0F);
        this.Beak = new ModelRenderer(this, 0, 40);
        this.Beak.setRotationPoint(0.0F, 1.0F, -5.5F);
        this.Beak.addBox(-2.0F, -1.0F, -2.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(Beak, 0.31869712141416456F, 0.0F, 0.0F);
        this.Body.addChild(this.WingB);
        this.Neck1.addChild(this.Neck2);
        this.Body.addChild(this.Neck1);
        this.Body.addChild(this.WingB_1);
        this.Body.addChild(this.LegA1);
        this.LegA1.addChild(this.LegA2);
        this.Body.addChild(this.LegB1);
        this.Neck3.addChild(this.Head);
        this.Body.addChild(this.Tail);
        this.LegB1.addChild(this.LegB2);
        this.Neck2.addChild(this.Neck3);
        this.Head.addChild(this.Beak);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
     //   this.WingB.rotateAngleX = MathHelper.cos(limbSwing * 1.6668F) * 1.4F * limbSwingAmount;
     //   this.WingB_1.rotateAngleX = MathHelper.cos(limbSwing * -1.6668F) * 1.4F * limbSwingAmount;
        this.LegA1.rotateAngleX = MathHelper.cos(limbSwing * 1.6668F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LegB2.rotateAngleX = MathHelper.cos(limbSwing * -1.6668F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.Head.rotateAngleX = headPitch * 0.017453292F;
    }
}
