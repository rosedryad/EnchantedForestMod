package com.anacampserosrose.enchantedforestmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		
		GameRegistry.addSmelting(ModBlocks.AMETHYST_ORE, new ItemStack(ModBlocks.AMETHYST_QUARTZ_CLUSTER, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.CLEAR_QUARTZ_ORE, new ItemStack(ModBlocks.CLEAR_QUARTZ_CLUSTER, 3), 1.5F);
		GameRegistry.addSmelting(ModBlocks.AMETHYST_FAIRY_ORE, new ItemStack(ModBlocks.AMETHYST_FAIRY_QUARTZ_CLUSTER, 1), 3F);
		
	}
}
