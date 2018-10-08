package com.anacampserosrose.enchantedforestmod.blocks;

import java.util.Random;

import com.anacampserosrose.enchantedforestmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class AmethystOre extends BlockBase {

	public AmethystOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.AMETHYST_QUARTZ_CLUSTER;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 2;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
