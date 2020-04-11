package com.anacampserosrose.enchantedforestmod.blocks;

import javax.annotation.Nullable;

import com.anacampserosrose.enchantedforestmod.EnchantedForestMod;
import com.anacampserosrose.enchantedforestmod.init.ModBlocks;
import com.anacampserosrose.enchantedforestmod.init.ModItems;
import com.anacampserosrose.enchantedforestmod.util.ItemBlockVariants;

import net.minecraft.block.BlockVine;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IShearable;

public class IvyVines extends BlockVine implements IShearable {
	
    public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");
    public static final PropertyBool[] ALL_FACES = new PropertyBool[] {UP, NORTH, SOUTH, WEST, EAST};
    protected static final AxisAlignedBB UP_AABB = new AxisAlignedBB(0.0D, 0.9375D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.0625D, 1.0D, 1.0D);
    protected static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.9375D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.0625D);
    protected static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.9375D, 1.0D, 1.0D, 1.0D);
    
	public IvyVines(String name, Material material) {
		
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(UP, Boolean.valueOf(false)).withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)));
        this.setTickRandomly(true);
		setCreativeTab(EnchantedForestMod.enchantedforesttab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

	}
	   @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
	    }

	    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	    {
	        state = state.getActualState(source, pos);
	        int i = 0;
	        AxisAlignedBB axisalignedbb = FULL_BLOCK_AABB;

	        if (((Boolean)state.getValue(UP)).booleanValue())
	        {
	            axisalignedbb = UP_AABB;
	            ++i;
	        }

	        if (((Boolean)state.getValue(NORTH)).booleanValue())
	        {
	            axisalignedbb = NORTH_AABB;
	            ++i;
	        }

	        if (((Boolean)state.getValue(EAST)).booleanValue())
	        {
	            axisalignedbb = EAST_AABB;
	            ++i;
	        }

	        if (((Boolean)state.getValue(SOUTH)).booleanValue())
	        {
	            axisalignedbb = SOUTH_AABB;
	            ++i;
	        }

	        if (((Boolean)state.getValue(WEST)).booleanValue())
	        {
	            axisalignedbb = WEST_AABB;
	            ++i;
	        }

	        return i == 1 ? axisalignedbb : FULL_BLOCK_AABB;
	    }

	    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        BlockPos blockpos = pos.up();
	        return state.withProperty(UP, Boolean.valueOf(worldIn.getBlockState(blockpos).getBlockFaceShape(worldIn, blockpos, EnumFacing.DOWN) == BlockFaceShape.SOLID));
	    }

	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}


}

