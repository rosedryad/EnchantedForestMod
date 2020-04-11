package com.anacampserosrose.enchantedforestmod.blocks;

import java.util.Random;

import com.anacampserosrose.enchantedforestmod.EnchantedForestMod;
import com.anacampserosrose.enchantedforestmod.init.ModBlocks;
import com.anacampserosrose.enchantedforestmod.init.ModItems;
import com.anacampserosrose.enchantedforestmod.util.IMetaName;
import com.anacampserosrose.enchantedforestmod.util.ItemBlockVariants;
import com.anacampserosrose.enchantedforestmod.util.handlers.EnumHandler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

public class BlockEnchantedGrass extends BlockBase
{

	public BlockEnchantedGrass(String name,  Material material) 
	{
		super(name, Material.GRASS);
		setSoundType(SoundType.GROUND);
		setLightLevel(0.1F);
		setHarvestLevel("shovel", 1);

	}
	
	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) 
	{
		return true;
	}

	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		return true;
	}

	@Override
	public int quantityDropped(Random random) {
		return 0;
	}
	
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
    {
        return true;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        return true;
    }
    
	@Override
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand) {
	if (world.isRemote) 
		world.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, pos.getX() + 0.0D, pos.getY() + 0.5D, pos.getZ() + 1.0D, 
				1.0D, 0.0D, 1.0D, new int[1]);
}
	/*public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		return null;
	}
*/
	
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
		if (entityIn instanceof EntityLivingBase) {
		    EntityLivingBase entityLivingBase = (EntityLivingBase) entityIn;
		    ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 20, 1));
			}
    }
	
	/*
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		if (entity instanceof EntityLivingBase && !world.isRemote) {
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 60, 1));
		}
	}
	*/
	
/*	
	public IBlockState getStateForEntityRender(IBlockState state) {
		return state;
	}
*/
}