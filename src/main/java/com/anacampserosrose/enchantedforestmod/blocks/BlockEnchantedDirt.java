package com.anacampserosrose.enchantedforestmod.blocks;

import com.anacampserosrose.enchantedforestmod.EnchantedForestMod;
import com.anacampserosrose.enchantedforestmod.init.ModBlocks;
import com.anacampserosrose.enchantedforestmod.init.ModItems;


import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IPlantable;

public class BlockEnchantedDirt extends BlockBase
{

	public BlockEnchantedDirt(String name, Material material) 
	{
		super(name, Material.GROUND);
		setSoundType(SoundType.GROUND);
		setLightLevel(0.1F);
		setHarvestLevel("shovel", 1);
	}
	
	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) 
	{
		return true;
	}

	public IBlockState getStateForEntityRender(IBlockState state) {
		return state;
	}

}