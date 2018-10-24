package com.anacampserosrose.enchantedforestmod.world.biomes;

import java.util.Random;

import com.anacampserosrose.enchantedforestmod.entity.EntityFlamingo;
import com.anacampserosrose.enchantedforestmod.init.ModBlocks;
import com.anacampserosrose.enchantedforestmod.world.trees.WorldGenPurpleWisteriaTree;

import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeMagic extends Biome {
	
	protected static final WorldGenAbstractTree TREE = new WorldGenPurpleWisteriaTree(false);

	public BiomeMagic() {
		super(new BiomeProperties("Magic").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(0.8F).setRainfall(0.4F).setWaterColor(11139050));
		
		topBlock = ModBlocks.GRASS_ENCHANTED.getDefaultState();
		fillerBlock = ModBlocks.DIRT_ENCHANTED.getDefaultState();
		
		this.decorator.treesPerChunk = 2;

		this.spawnableCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityFlamingo.class, 12, 2, 7));
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntitySheep.class, 5, 2, 5));
	}
	

			@Override
			public WorldGenAbstractTree getRandomTreeFeature(Random rand)
			{
				return TREE;
			}
			

		
	}
