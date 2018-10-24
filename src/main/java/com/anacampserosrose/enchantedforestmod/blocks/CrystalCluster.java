package com.anacampserosrose.enchantedforestmod.blocks;

import com.anacampserosrose.enchantedforestmod.EnchantedForestMod;
import com.anacampserosrose.enchantedforestmod.init.ModBlocks;
import com.anacampserosrose.enchantedforestmod.init.ModItems;
import com.anacampserosrose.enchantedforestmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CrystalCluster extends BlockBush implements IHasModel {

	public CrystalCluster(String name, Material plants) 
    {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(EnchantedForestMod.enchantedforesttab);
		setLightLevel(0.5F);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

	@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return super.getBoundingBox(state, source, pos).offset(state.getOffset(source, pos));
    }

    @Override
    public Block.EnumOffsetType getOffsetType()
    {
        return Block.EnumOffsetType.XZ;
    }	

    @Override
	public void registerModels() 
	{
		EnchantedForestMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	public IBlockState getStateForEntityRender(IBlockState state) {
		return state;
	}
	@Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {

		return super.canPlaceBlockAt(worldIn, pos) ? this.canBlockStay(worldIn, pos, getBlockState()) : true;
		
    }
	private boolean canBlockStay(World worldIn, BlockPos pos, BlockStateContainer blockState) {
		
		return true;
		
	}
		@Override
	    protected boolean canSustainBush(IBlockState state) {
	    	
        return state.getBlock() == Blocks.GRASS || state.getBlock() == Blocks.DIRT || state.getBlock() == Blocks.FARMLAND || state.getBlock() == Blocks.COBBLESTONE || state.getBlock() == Blocks.WOOL || state.getBlock() == Blocks.STONE;
	    }
}
