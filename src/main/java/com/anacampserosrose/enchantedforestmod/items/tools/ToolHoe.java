package com.anacampserosrose.enchantedforestmod.items.tools;

import com.anacampserosrose.enchantedforestmod.EnchantedForestMod;
import com.anacampserosrose.enchantedforestmod.init.ModItems;

import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe {

	public ToolHoe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(EnchantedForestMod.enchantedforesttab);
		
		ModItems.ITEMS.add(this);
	}
	
}