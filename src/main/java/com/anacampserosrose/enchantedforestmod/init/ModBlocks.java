package com.anacampserosrose.enchantedforestmod.init;

import java.util.ArrayList;
import java.util.List;

import com.anacampserosrose.enchantedforestmod.blocks.LawnFlamingoBlock;
import com.anacampserosrose.enchantedforestmod.blocks.MushroomFairyHouse;
import com.anacampserosrose.enchantedforestmod.blocks.ClearQuartzOre;
import com.anacampserosrose.enchantedforestmod.blocks.SignPost;
import com.anacampserosrose.enchantedforestmod.blocks.SproutPlanter;
import com.anacampserosrose.enchantedforestmod.util.Reference;
import com.anacampserosrose.enchantedforestmod.blocks.AmethystOre;
import com.anacampserosrose.enchantedforestmod.blocks.BlockLeaf;
import com.anacampserosrose.enchantedforestmod.blocks.BlockLogs;
import com.anacampserosrose.enchantedforestmod.blocks.BlockPlank;
import com.anacampserosrose.enchantedforestmod.blocks.BlockSaplings;
import com.anacampserosrose.enchantedforestmod.blocks.EFFlower;
import com.anacampserosrose.enchantedforestmod.blocks.FlowerFairyHouse;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Trees
	public static final Block PlANKS = new BlockPlank("planks");
	public static final Block LOGS = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLINGS = new BlockSaplings("sapling");
	
	//Ores
	public static final Block CLEAR_QUARTZ_ORE = new ClearQuartzOre("clear_quartz_ore", Material.ROCK);
	public static final Block AMETHYST_ORE = new AmethystOre("amethyst_ore", Material.ROCK);
	
	//Lawn Flamingos
	public static final Block LAWN_FLAMINGO_BLOCK = new LawnFlamingoBlock("lawn_flamingo_block");
	public static final Block LAWN_FLAMINGO_DARK_PINK_BLOCK = new LawnFlamingoBlock("lawn_flamingo_dark_pink_block");
	public static final Block LAWN_FLAMINGO_GRAY_BABY_BLOCK = new LawnFlamingoBlock("lawn_flamingo_gray_baby_block");
	public static final Block LAWN_FLAMINGO_PINK_BABY_BLOCK = new LawnFlamingoBlock("lawn_flamingo_pink_baby_block");

	//Fairy Houses
	public static final Block FLOWER_BLUE_FAIRY_HOUSE = new FlowerFairyHouse("flower_blue_fairy_house");
	public static final Block FLOWER_PINK_FAIRY_HOUSE = new FlowerFairyHouse("flower_pink_fairy_house");
	public static final Block FLOWER_PURPLE_FAIRY_HOUSE = new FlowerFairyHouse("flower_purple_fairy_house");
	
	//Mushroom Fairy Houses
	public static final Block MUSHROOM_MAGENTA_FAIRY_HOUSE = new MushroomFairyHouse("mushroom_magenta_fairy_house");
	public static final Block MUSHROOM_PURPLE_FAIRY_HOUSE = new MushroomFairyHouse("mushroom_purple_fairy_house");
	public static final Block MUSHROOM_RED_FAIRY_HOUSE = new MushroomFairyHouse("mushroom_red_fairy_house");
	
	//Planters
	public static final Block SPROUT_PLANTER_BLACK_SHEEP = new SproutPlanter("sprout_planter_black_sheep");
	public static final Block SPROUT_PLANTER_BROWN_SHEEP = new SproutPlanter("sprout_planter_brown_sheep");
	public static final Block SPROUT_PLANTER_GRAY_SHEEP = new SproutPlanter("sprout_planter_gray_sheep");
    public static final Block SPROUT_PLANTER_LIGHT_GRAY_SHEEP = new SproutPlanter("sprout_planter_light_gray_sheep");
	public static final Block SPROUT_PLANTER_WHITE_SHEEP = new SproutPlanter("sprout_planter_white_sheep");
	public static final Block SPROUT_PLANTER_RAINBOW_SHEEP = new SproutPlanter("sprout_planter_rainbow_sheep");
	public static final Block SPROUT_PLANTER_RED_SHEEP = new SproutPlanter("sprout_planter_red_sheep");
	public static final Block SPROUT_PLANTER_ORANGE_SHEEP = new SproutPlanter("sprout_planter_orange_sheep");
	public static final Block SPROUT_PLANTER_YELLOW_SHEEP = new SproutPlanter("sprout_planter_yellow_sheep");
    public static final Block SPROUT_PLANTER_LIME_SHEEP = new SproutPlanter("sprout_planter_lime_sheep");
    public static final Block SPROUT_PLANTER_GREEN_SHEEP = new SproutPlanter("sprout_planter_green_sheep");
    public static final Block SPROUT_PLANTER_LIGHT_BLUE_SHEEP = new SproutPlanter("sprout_planter_light_blue_sheep");
 	public static final Block SPROUT_PLANTER_CYAN_SHEEP = new SproutPlanter("sprout_planter_cyan_sheep");
	public static final Block SPROUT_PLANTER_BLUE_SHEEP = new SproutPlanter("sprout_planter_blue_sheep");
    public static final Block SPROUT_PLANTER_PINK_SHEEP = new SproutPlanter("sprout_planter_pink_sheep");
	public static final Block SPROUT_PLANTER_MAGENTA_SHEEP = new SproutPlanter("sprout_planter_magenta_sheep");
    public static final Block SPROUT_PLANTER_PURPLE_SHEEP = new SproutPlanter("sprout_planter_purple_sheep");
    public static final Block SPROUT_PLANTER_COW = new SproutPlanter("sprout_planter_cow");
    public static final Block SPROUT_PLANTER_MOOSHROOM_COW = new SproutPlanter("sprout_planter_mooshroom_cow");
    public static final Block SPROUT_PLANTER_OCELOT = new SproutPlanter("sprout_planter_ocelot");
    public static final Block SPROUT_PLANTER_PIG = new SproutPlanter("sprout_planter_pig");
    public static final Block SPROUT_PLANTER_VILLAGER = new SproutPlanter("sprout_planter_villager");
    public static final Block SPROUT_PLANTER_ZOMBIE_VILLAGER = new SproutPlanter("sprout_planter_zombie_villager");
    public static final Block SPROUT_PLANTER_SPIDER = new SproutPlanter("sprout_planter_spider");
    public static final Block SPROUT_PLANTER_CREEPER = new SproutPlanter("sprout_planter_creeper");
    public static final Block SPROUT_PLANTER_PINK_CREEPER = new SproutPlanter("sprout_planter_pink_creeper");
    public static final Block SPROUT_PLANTER_ENDERMAN = new SproutPlanter("sprout_planter_enderman");
    public static final Block SPROUT_PLANTER_SKELETON = new SproutPlanter("sprout_planter_skeleton");
    public static final Block SPROUT_PLANTER_WITHER_SKELETON = new SproutPlanter("sprout_planter_wither_skeleton");
    public static final Block SPROUT_PLANTER_ZOMBIE = new SproutPlanter("sprout_planter_zombie");
    public static final Block SPROUT_PLANTER_ENDER_DRAGON = new SproutPlanter("sprout_planter_ender_dragon");
	
	//Sign Posts - not functional yet
	public static final Block FLOWER_RIGHT_SIGN_POST = new SignPost("flower_right_sign_post");

	//Flowers - does not generate yet
	public static final Block SMALL_ROSE_BUSH = new EFFlower("small_rose_bush", Material.PLANTS);
	//redo succulent png?
	public static final Block SUCCULENT = new EFFlower("succulent", Material.PLANTS);
	public static final Block HYDRANGEA_PINK = new EFFlower("hydrangea_pink", Material.PLANTS);
	public static final Block HYDRANGEA_PURPLE = new EFFlower("hydrangea_purple", Material.PLANTS);
	public static final Block HYDRANGEA_BLUE_PURPLE = new EFFlower("hydrangea_blue_purple", Material.PLANTS);
	public static final Block CAT_FLOWER = new EFFlower("cat_flower", Material.PLANTS);
	public static final Block FAIRY_WINGS_PLANT = new EFFlower("fairy_wings_plant", Material.PLANTS);
	public static final Block FORGET_ME_NOT = new EFFlower("forget_me_not", Material.PLANTS);
	public static final Block PURPLE_CONEFLOWER = new EFFlower("purple_coneflower", Material.PLANTS);
	public static final Block PURPLE_ROCK_CRESS = new EFFlower("purple_rock_cress", Material.PLANTS);
	public static final Block YELLOW_GERBERA_DAISY = new EFFlower("yellow_gerbera_daisy", Material.PLANTS);
	
}
