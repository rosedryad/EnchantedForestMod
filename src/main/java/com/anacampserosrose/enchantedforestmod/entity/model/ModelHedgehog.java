package com.anacampserosrose.enchantedforestmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Hedgehog
 * Created by Beethoven#2693 using Tabula 7.0.0
 */
@SideOnly(Side.CLIENT)
public class ModelHedgehog extends ModelBase {
    public double[] modelScale = new double[] { 1.3D, 1.3D, 1.3D };
    public ModelRenderer Body1;
    public ModelRenderer Leg1;
    public ModelRenderer Leg2;
    public ModelRenderer Leg3;
    public ModelRenderer Leg4;
    public ModelRenderer Head;
    public ModelRenderer Tail;
    public ModelRenderer Spikebed;
    public ModelRenderer Snout;

    public ModelHedgehog() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Leg2 = new ModelRenderer(this, 0, 0);
        this.Leg2.setRotationPoint(-2.0F, 1.0F, -2.0F);
        this.Leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.Leg3 = new ModelRenderer(this, 0, 0);
        this.Leg3.setRotationPoint(2.0F, 1.0F, 2.5F);
        this.Leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.Tail = new ModelRenderer(this, 24, 0);
        this.Tail.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.Tail.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Leg1 = new ModelRenderer(this, 0, 0);
        this.Leg1.setRotationPoint(2.0F, 1.0F, -2.0F);
        this.Leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.Leg4 = new ModelRenderer(this, 0, 0);
        this.Leg4.setRotationPoint(-2.0F, 1.0F, 2.5F);
        this.Leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.Head = new ModelRenderer(this, 32, 0);
        this.Head.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.Head.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 4, 0.0F);
        this.Body1 = new ModelRenderer(this, 2, 0);
        this.Body1.setRotationPoint(0.0F, 28.0F, 0.0F);
        this.Body1.addBox(-3.0F, -2.0F, -4.0F, 6, 4, 8, 0.0F);
        this.Spikebed = new ModelRenderer(this, 0, 14);
        this.Spikebed.setRotationPoint(0.0F, -2.6F, 1.0F);
        this.Spikebed.addBox(-2.5F, 0.0F, -3.0F, 5, 1, 6, 0.0F);
        this.Snout = new ModelRenderer(this, 50, 0);
        this.Snout.setRotationPoint(0.0F, -0.5F, -4.5F);
        this.Snout.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        this.Body1.addChild(this.Leg2);
        this.Body1.addChild(this.Leg3);
        this.Body1.addChild(this.Tail);
        this.Body1.addChild(this.Leg1);
        this.Body1.addChild(this.Leg4);
        this.Body1.addChild(this.Head);
        this.Body1.addChild(this.Spikebed);
        this.Head.addChild(this.Snout);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        this.Body1.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadXaw, float headPitch, float scaleFactor, Entity entityIn) {
        //   this.WingB.rotateAngleX = MathHelper.cos(limbSwing * 1.6668F) * 1.4F * limbSwingAmount;
        //   this.WingB_1.rotateAngleX = MathHelper.cos(limbSwing * -1.6668F) * 1.4F * limbSwingAmount;
           this.Leg1.rotateAngleX = MathHelper.cos(limbSwing * 1.6668F + (float)Math.PI) * 1.4F * limbSwingAmount;
           this.Leg2.rotateAngleX = MathHelper.cos(limbSwing * -1.6668F + (float)Math.PI) * 1.4F * limbSwingAmount;
           this.Leg3.rotateAngleX = MathHelper.cos(limbSwing * 1.6668F + (float)Math.PI) * 1.4F * limbSwingAmount;
           this.Leg4.rotateAngleX = MathHelper.cos(limbSwing * -1.6668F + (float)Math.PI) * 1.4F * limbSwingAmount;

           this.Head.rotateAngleY = netHeadXaw * 0.017453292F;
           this.Head.rotateAngleX = headPitch * 0.017453292F;
       }
}
