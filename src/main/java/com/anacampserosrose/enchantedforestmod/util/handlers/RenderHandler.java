package com.anacampserosrose.enchantedforestmod.util.handlers;

import com.anacampserosrose.enchantedforestmod.entity.EntityFlamingo;
import com.anacampserosrose.enchantedforestmod.entity.render.RenderFlamingo;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityFlamingo.class, new IRenderFactory<EntityFlamingo>()
		{
			@Override
			public Render<? super EntityFlamingo> createRenderFor(RenderManager manager) 
			{
				return new RenderFlamingo(manager);
			}
		});
	}
}