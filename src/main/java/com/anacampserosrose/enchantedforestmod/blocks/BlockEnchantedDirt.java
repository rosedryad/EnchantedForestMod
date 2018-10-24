package com.anacampserosrose.enchantedforestmod.blocks;

import com.anacampserosrose.enchantedforestmod.EnchantedForestMod;
import com.anacampserosrose.enchantedforestmod.init.ModBlocks;
import com.anacampserosrose.enchantedforestmod.init.ModItems;
import com.anacampserosrose.enchantedforestmod.util.IHasModel;


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

public class BlockEnchantedDirt extends BlockBase implements IHasModel
{

	public BlockEnchantedDirt(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.GROUND);
		setLightLevel(0.1F);
	}
	
	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) 
	{
		return true;
	}

	@Override
	public void registerModels() 
	{
		EnchantedForestMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	public IBlockState getStateForEntityRender(IBlockState state) {
		return state;
	}

}