package com.anacampserosrose.enchantedforestmod.entity.render;

import com.anacampserosrose.enchantedforestmod.entity.EntityFlamingo;
import com.anacampserosrose.enchantedforestmod.entity.model.ModelFlamingo;
import com.anacampserosrose.enchantedforestmod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderFlamingo extends RenderLiving<EntityFlamingo>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/flamingo.png");

    public RenderFlamingo(RenderManager manager)
    {
        super(manager, new ModelFlamingo(), 0.4F);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(EntityFlamingo entity)
    {
    	return TEXTURES;
    }
    
  	@Override
	protected void applyRotations(EntityFlamingo entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}    
}