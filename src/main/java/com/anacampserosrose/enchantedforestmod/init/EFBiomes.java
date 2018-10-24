package com.anacampserosrose.enchantedforestmod.init;

import com.anacampserosrose.enchantedforestmod.world.biomes.BiomeMagic;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class EFBiomes {

public static final Biome MAGIC = new BiomeMagic();

	public static void registerBiomes()
{
	initBiome(MAGIC, "Magic", BiomeType.WARM, Type.FOREST, Type.LUSH, Type.MAGICAL, Type.HILLS, Type.RIVER, Type.MUSHROOM, Type.WATER);
}

private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)	
{
	biome.setRegistryName(name);
	ForgeRegistries.BIOMES.register(biome);
	System.out.println("Biome Registered");
	BiomeDictionary.addTypes(biome, types);
	BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
	BiomeManager.addSpawnBiome(biome);
	return biome;
}
}