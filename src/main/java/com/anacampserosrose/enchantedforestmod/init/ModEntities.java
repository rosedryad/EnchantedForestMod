package com.anacampserosrose.enchantedforestmod.init;

import com.anacampserosrose.enchantedforestmod.EnchantedForestMod;
import com.anacampserosrose.enchantedforestmod.entity.EntityFlamingo;
import com.anacampserosrose.enchantedforestmod.entity.EntityHedgehog;
import com.anacampserosrose.enchantedforestmod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	public static void registerEntities()
	{
		registerEntity("flamingo", EntityFlamingo.class, Reference.ENTITY_FLAMINGO, 50, 16756425, 16728190);
		registerEntity("hedgehog", EntityHedgehog.class, Reference.ENTITY_HEDGEHOG, 30, 15194293, 4011817);
	}
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, EnchantedForestMod.instance, range, 1, true, color1, color2);
	}
	
	
}
