package com.anacampserosrose.enchantedforestmod.util.handlers;

import com.anacampserosrose.enchantedforestmod.entity.EntityFlamingo;
import com.anacampserosrose.enchantedforestmod.entity.EntityHedgehog;
import com.anacampserosrose.enchantedforestmod.entity.render.RenderFlamingo;
import com.anacampserosrose.enchantedforestmod.entity.render.RenderHedgehog;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
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
			RenderingRegistry.registerEntityRenderingHandler(EntityHedgehog.class, new IRenderFactory<EntityHedgehog>()
			{
				@Override
				public Render<? super EntityHedgehog> createRenderFor(RenderManager manager) 
				{
					return new RenderHedgehog(manager);
				}
		});
	}
	}