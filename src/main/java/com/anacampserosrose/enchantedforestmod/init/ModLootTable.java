package com.anacampserosrose.enchantedforestmod.init;

import com.anacampserosrose.enchantedforestmod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class ModLootTable
{
	public static ResourceLocation FLAMINGO_LOOT;
	public static ResourceLocation HEDGEHOG_LOOT;
    
    public static void init()
    {
        FLAMINGO_LOOT = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "entities/flamingo"));
        HEDGEHOG_LOOT = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "entities/hedgehog"));
    }
}