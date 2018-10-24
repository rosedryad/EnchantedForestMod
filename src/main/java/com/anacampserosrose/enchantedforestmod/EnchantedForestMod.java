/*******************************************************************************
 * Credits:
 * 
 * Beethoven#2693:
 * Flamingo Entity Model and Texture
 * Hedgehog Entity Model and Texture
 * Crystal Armor Texture
 * 
 * Flamingo Ambient Sound - http://sound-effects-hunter.com/free-flamingo-sounds/
 ******************************************************************************/

package com.anacampserosrose.enchantedforestmod;

import com.anacampserosrose.enchantedforestmod.init.EFBiomes;
import com.anacampserosrose.enchantedforestmod.init.ModEntities;
import com.anacampserosrose.enchantedforestmod.init.ModLootTable;
import com.anacampserosrose.enchantedforestmod.init.ModRecipes;
import com.anacampserosrose.enchantedforestmod.init.ModSounds;
import com.anacampserosrose.enchantedforestmod.proxy.CommonProxy;
import com.anacampserosrose.enchantedforestmod.tabs.EnchantedForestTab;
import com.anacampserosrose.enchantedforestmod.util.Reference;
import com.anacampserosrose.enchantedforestmod.util.handlers.MobDropsHandler;
import com.anacampserosrose.enchantedforestmod.util.handlers.RenderHandler;
import com.anacampserosrose.enchantedforestmod.world.WorldGenEFOres;
import com.anacampserosrose.enchantedforestmod.world.WorldGenEFTrees;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class EnchantedForestMod {
	
	@Instance
	public static EnchantedForestMod instance;
	
	public static final CreativeTabs enchantedforesttab = new EnchantedForestTab("enchantedforesttab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new WorldGenEFOres(), 3);
		GameRegistry.registerWorldGenerator(new WorldGenEFTrees(), 3);
		
		EFBiomes.registerBiomes();
		
		ModEntities.registerEntities();
		RenderHandler.registerEntityRenders();
	
		MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
		ModLootTable.init();
		ModSounds.init();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
	}
	

}
