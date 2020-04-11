package com.anacampserosrose.enchantedforestmod.entity.render;


import com.anacampserosrose.enchantedforestmod.entity.EntityHedgehog;
import com.anacampserosrose.enchantedforestmod.entity.model.ModelHedgehog;
import com.anacampserosrose.enchantedforestmod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderHedgehog extends RenderLiving<EntityHedgehog>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/hedgehog.png");

    public RenderHedgehog(RenderManager manager)
    {
        super(manager, new ModelHedgehog(), 0.1F);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(EntityHedgehog entity)
    {
    	return TEXTURES;
    }
    
  	@Override
	protected void applyRotations(EntityHedgehog entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}    
}