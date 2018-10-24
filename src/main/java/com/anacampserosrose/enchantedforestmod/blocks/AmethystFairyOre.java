package com.anacampserosrose.enchantedforestmod.blocks;

import java.util.Random;

import com.anacampserosrose.enchantedforestmod.init.ModBlocks;
import com.anacampserosrose.enchantedforestmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class AmethystFairyOre extends BlockBase {

	public AmethystFairyOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 1;
		int min = 1;
		return rand.nextInt(max) + min;
	}
	
	@Override
	//Particle to show rarity; different from the regular amethyst ore
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand) {
	if (world.isRemote) 
		world.spawnParticle(EnumParticleTypes.REDSTONE, pos.getX() + 0.0D, pos.getY() + 0.5D, pos.getZ() + 2.0D, 
				1.0D, 0.0D, 1.0D, new int[1]);
}
	
	
}