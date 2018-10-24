package com.anacampserosrose.enchantedforestmod.tabs;

import com.anacampserosrose.enchantedforestmod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EnchantedForestTab extends CreativeTabs {

		public EnchantedForestTab(String label) {
			super("enchantedforesttab");
			
		}
		
		public ItemStack getTabIconItem() { 
			return new ItemStack(ModBlocks.FLOWER_PINK_FAIRY_HOUSE); 
			
		}
		
	}