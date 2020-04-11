package com.anacampserosrose.enchantedforestmod.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.WeightedRandom.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class NBTHandler 
{
public static NBTTagCompound stackToNBT(ItemStack stack)
{
	NBTTagCompound compound = new NBTTagCompound();
	compound.setInteger("count", stack.getCount());
	compound.setString("item", stack.getItem().getRegistryName().toString());
	return compound;
}

public static ItemStack stackFromNBT(NBTTagCompound compound)
{
	net.minecraft.item.Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(compound.getString("item")));
	int count = compound.getInteger("count");
	return new ItemStack(item, count);
}
}