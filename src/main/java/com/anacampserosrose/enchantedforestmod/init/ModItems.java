package com.anacampserosrose.enchantedforestmod.init;

import java.util.ArrayList;
import java.util.List;

import com.anacampserosrose.enchantedforestmod.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item FLAMINGO = new ItemBase("flamingo");
	
	//Crystal Clusters
	public static final Item CLEAR_QUARTZ_CLUSTER = new ItemBase("clear_quartz_cluster");
	public static final Item AMETHYST_QUARTZ_CLUSTER = new ItemBase("amethyst_quartz_cluster");
	public static final Item RAINBOW_AURA_QUARTZ_CLUSTER = new ItemBase("rainbow_aura_quartz_cluster");
	public static final Item TITANIUM_AURA_QUARTZ_CLUSTER = new ItemBase("titanium_aura_quartz_cluster");
	
}
