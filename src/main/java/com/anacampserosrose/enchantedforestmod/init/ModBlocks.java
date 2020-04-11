package com.anacampserosrose.enchantedforestmod.init;

import java.util.ArrayList;
import java.util.List;

import com.anacampserosrose.enchantedforestmod.blocks.LawnFlamingoBlock;
import com.anacampserosrose.enchantedforestmod.blocks.MushroomFairyHouse;
import com.anacampserosrose.enchantedforestmod.blocks.ClearQuartzOre;
import com.anacampserosrose.enchantedforestmod.blocks.CrystalBlock;
import com.anacampserosrose.enchantedforestmod.blocks.CrystalCluster;
import com.anacampserosrose.enchantedforestmod.blocks.SignPost;
import com.anacampserosrose.enchantedforestmod.blocks.SproutPlanter;
import com.anacampserosrose.enchantedforestmod.blocks.slab.EFBlockDoubleSlab;
import com.anacampserosrose.enchantedforestmod.blocks.slab.EFBlockHalfSlab;
import com.anacampserosrose.enchantedforestmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

import com.anacampserosrose.enchantedforestmod.blocks.AmethystFairyOre;
import com.anacampserosrose.enchantedforestmod.blocks.AmethystOre;
import com.anacampserosrose.enchantedforestmod.blocks.BlockEnchantedDirt;
import com.anacampserosrose.enchantedforestmod.blocks.BlockEnchantedGrass;
import com.anacampserosrose.enchantedforestmod.blocks.BlockLeaf;
import com.anacampserosrose.enchantedforestmod.blocks.BlockLogs;
import com.anacampserosrose.enchantedforestmod.blocks.BlockPlank;
import com.anacampserosrose.enchantedforestmod.blocks.BlockSaplings;
import com.anacampserosrose.enchantedforestmod.blocks.ClearCrystalCluster;
import com.anacampserosrose.enchantedforestmod.blocks.EFFlower;
import com.anacampserosrose.enchantedforestmod.blocks.EFPlushies;
import com.anacampserosrose.enchantedforestmod.blocks.IvyVines;
import com.anacampserosrose.enchantedforestmod.blocks.FlowerFairyHouse;


public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static EFBlockHalfSlab custom_slab_half;
	public static EFBlockDoubleSlab custom_slab_double;
	public static Block ivy_planks;
	public static Block purple_wisteria_planks;
	public static EFBlockHalfSlab ivy_slab_half;
	public static EFBlockHalfSlab purple_wisteria_slab_half;
	public static EFBlockDoubleSlab ivy_slab_double;
	public static EFBlockDoubleSlab purple_wisteria_slab_double;

	
	//Grass
	public static final Block DIRT_ENCHANTED = new BlockEnchantedDirt("dirt_enchanted", Material.GRASS);
	public static final Block GRASS_ENCHANTED = new BlockEnchantedGrass("grass_enchanted", Material.GRASS);
	
	//Trees
	public static final Block PlANKS = new BlockPlank("planks");
	public static final Block LOGS = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLINGS = new BlockSaplings("sapling");
	//TODO: Add ivy vine to WorldGenIvyTree
	public static final Block IVY_VINE = new IvyVines("ivy_vine", Material.VINE);

	//TODO: Slabs
	//
	//
	//
	
	//TODO: Stairs
	//
	//
	//
	
	//TODO: Doors
	//
	//
	//
	
	//Ores
	public static final Block CLEAR_QUARTZ_ORE = new ClearQuartzOre("clear_quartz_ore", Material.ROCK);
	public static final Block AMETHYST_ORE = new AmethystOre("amethyst_ore", Material.ROCK);
	public static final Block AMETHYST_FAIRY_ORE = new AmethystFairyOre("amethyst_fairy_ore", Material.ROCK);
	
	//Crystal Clusters
	public static final Block CLEAR_QUARTZ_CLUSTER = new ClearCrystalCluster("clear_quartz_cluster", Material.ROCK);
	public static final Block AMETHYST_QUARTZ_CLUSTER = new CrystalCluster("amethyst_quartz_cluster", Material.ROCK);
	public static final Block RAINBOW_AURA_QUARTZ_CLUSTER = new CrystalCluster("rainbow_aura_quartz_cluster", Material.ROCK);
	public static final Block TITANIUM_AURA_QUARTZ_CLUSTER = new CrystalCluster("titanium_aura_quartz_cluster", Material.ROCK);
	public static final Block AMETHYST_FAIRY_QUARTZ_CLUSTER = new CrystalCluster("amethyst_fairy_quartz_cluster", Material.ROCK);
	
	//Crystal Blocks
	public static final Block CLEAR_QUARTZ_BLOCK = new CrystalBlock("clear_quartz_block", Material.ROCK);
	public static final Block AMETHYST_QUARTZ_BLOCK = new CrystalBlock("amethyst_quartz_block", Material.ROCK);
	public static final Block RAINBOW_AURA_QUARTZ_BLOCK = new CrystalBlock("rainbow_aura_quartz_block", Material.ROCK);
	public static final Block TITANIUM_AURA_QUARTZ_BLOCK = new CrystalBlock("titanium_aura_quartz_block", Material.ROCK);
	
	//Plushies
	public static final Block PLUSHIE_HEDGEHOG = new EFPlushies("plushie_hedgehog");
	
	//Lawn Flamingos
	public static final Block LAWN_FLAMINGO_BLOCK = new LawnFlamingoBlock("lawn_flamingo_block");
	public static final Block LAWN_FLAMINGO_DARK_PINK_BLOCK = new LawnFlamingoBlock("lawn_flamingo_dark_pink_block");
	public static final Block LAWN_FLAMINGO_GRAY_BABY_BLOCK = new LawnFlamingoBlock("lawn_flamingo_gray_baby_block");
	public static final Block LAWN_FLAMINGO_PINK_BABY_BLOCK = new LawnFlamingoBlock("lawn_flamingo_pink_baby_block");

	//Flower Fairy Houses
	public static final Block FLOWER_BLUE_FAIRY_HOUSE = new FlowerFairyHouse("flower_blue_fairy_house");
	public static final Block FLOWER_PINK_FAIRY_HOUSE = new FlowerFairyHouse("flower_pink_fairy_house");
	public static final Block FLOWER_PURPLE_FAIRY_HOUSE = new FlowerFairyHouse("flower_purple_fairy_house");
	
	//Mushroom Fairy Houses
	public static final Block MUSHROOM_MAGENTA_FAIRY_HOUSE = new MushroomFairyHouse("mushroom_magenta_fairy_house");
	public static final Block MUSHROOM_PURPLE_FAIRY_HOUSE = new MushroomFairyHouse("mushroom_purple_fairy_house");
	public static final Block MUSHROOM_RED_FAIRY_HOUSE = new MushroomFairyHouse("mushroom_red_fairy_house");
	
	//Sprout Planters
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
	
	//Sign Posts
    //TODO: Make writeable
	public static final Block FLOWER_SIGN_POST_LEFT = new SignPost("flower_sign_post_left");
	public static final Block FLOWER_SIGN_POST_RIGHT = new SignPost("flower_sign_post_right");

	//Flowers
	//TODO: Make FlowerGen
	public static final Block SMALL_ROSE_BUSH = new EFFlower("small_rose_bush", Material.PLANTS);
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