package com.anacampserosrose.enchantedforestmod.blocks;

import java.util.Random;

import com.anacampserosrose.enchantedforestmod.EnchantedForestMod;
import com.anacampserosrose.enchantedforestmod.init.ModBlocks;
import com.anacampserosrose.enchantedforestmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(EnchantedForestMod.enchantedforesttab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public IBlockState getStateForEntityRender(IBlockState state) {
		return state;
	}


}
