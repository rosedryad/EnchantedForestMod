package com.anacampserosrose.enchantedforestmod.items.tools;

import com.anacampserosrose.enchantedforestmod.EnchantedForestMod;
import com.anacampserosrose.enchantedforestmod.init.ModItems;
import com.anacampserosrose.enchantedforestmod.util.IHasModel;

import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel {

	public ToolShovel(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(EnchantedForestMod.enchantedforesttab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		EnchantedForestMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}