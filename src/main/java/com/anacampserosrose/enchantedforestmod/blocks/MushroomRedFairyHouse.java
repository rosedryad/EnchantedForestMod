package com.anacampserosrose.enchantedforestmod.blocks;

import com.anacampserosrose.enchantedforestmod.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class MushroomRedFairyHouse extends BlockBase {

	public static final PropertyDirection FACING = PropertyDirection.create("facing",EnumFacing.Plane.HORIZONTAL);
	
	public MushroomRedFairyHouse(String name)
	{
		super(name, Material.PLANTS);
		setHardness(0.8f);
		setSoundType(SoundType.PLANT);
		setResistance(1.0f);
		setDefaultState(blockState.getBaseState().withProperty(FACING,EnumFacing.NORTH));
		setCreativeTab(CreativeTabs.DECORATIONS);
	}

	 @Override
	  public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	  {
	    return NULL_AABB;
	  }
	 
	
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	public static final PropertyDirection PROPERTYFACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	  
	  @Override
	  public IBlockState getStateFromMeta(int meta)
	  {
	    EnumFacing facing = EnumFacing.getHorizontal(meta);
	    return this.getDefaultState().withProperty(PROPERTYFACING, facing);
	  }

	  @Override
	  public int getMetaFromState(IBlockState state)
	  {
	    EnumFacing facing = (EnumFacing)state.getValue(PROPERTYFACING);

	    int facingbits = facing.getHorizontalIndex();
	    return facingbits;
	  }
	  
	  @Override
	  public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	  {
	    return state;
	  }
	  
	  @Override
	  protected BlockStateContainer createBlockState()
	  {
	    return new BlockStateContainer(this, new IProperty[] {PROPERTYFACING});
	  }
	  
	  @Override
	  public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing blockFaceClickedOn, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	  {
	    EnumFacing enumfacing = (placer == null) ? EnumFacing.NORTH : EnumFacing.fromAngle(placer.rotationYaw);

	    return this.getDefaultState().withProperty(PROPERTYFACING, enumfacing);
	  }

}
