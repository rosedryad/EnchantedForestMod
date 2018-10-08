package com.anacampserosrose.enchantedforestmod;

import com.anacampserosrose.enchantedforestmod.proxy.CommonProxy;
import com.anacampserosrose.enchantedforestmod.util.Reference;
import com.anacampserosrose.enchantedforestmod.worldgen.WorldGenEFOres;
import com.anacampserosrose.enchantedforestmod.worldgen.WorldGenEFTrees;

import handlers.MobDropsHandler;
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
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new WorldGenEFOres(), 3);
		GameRegistry.registerWorldGenerator(new WorldGenEFTrees(), 3);
		MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
	}

}
