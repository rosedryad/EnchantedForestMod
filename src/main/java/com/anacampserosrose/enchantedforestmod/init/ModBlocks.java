package com.anacampserosrose.enchantedforestmod.init;

import java.util.ArrayList;
import java.util.List;

import com.anacampserosrose.enchantedforestmod.blocks.FlowerPinkFairyHouse;
import com.anacampserosrose.enchantedforestmod.blocks.FlowerPurpleFairyHouse;
import com.anacampserosrose.enchantedforestmod.blocks.LawnFlamingoBlock;
import com.anacampserosrose.enchantedforestmod.blocks.LawnFlamingoDarkPinkBlock;
import com.anacampserosrose.enchantedforestmod.blocks.LawnFlamingoGrayBabyBlock;
import com.anacampserosrose.enchantedforestmod.blocks.LawnFlamingoPinkBabyBlock;
import com.anacampserosrose.enchantedforestmod.blocks.MushroomMagentaFairyHouse;
import com.anacampserosrose.enchantedforestmod.blocks.MushroomPurpleFairyHouse;
import com.anacampserosrose.enchantedforestmod.blocks.MushroomRedFairyHouse;
import com.anacampserosrose.enchantedforestmod.blocks.SproutPlanterBlackSheep;
import com.anacampserosrose.enchantedforestmod.blocks.FlowerBlueFairyHouse;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Lawn Flamingos
	public static final Block LAWN_FLAMINGO_BLOCK = new LawnFlamingoBlock("lawn_flamingo_block");
	public static final Block LAWN_FLAMINGO_DARK_PINK_BLOCK = new LawnFlamingoDarkPinkBlock("lawn_flamingo_dark_pink_block");
	public static final Block LAWN_FLAMINGO_GRAY_BABY_BLOCK = new LawnFlamingoGrayBabyBlock("lawn_flamingo_gray_baby_block");
	public static final Block LAWN_FLAMINGO_PINK_BABY_BLOCK = new LawnFlamingoPinkBabyBlock("lawn_flamingo_pink_baby_block");

	//Fairy Houses
	public static final Block FLOWER_BLUE_FAIRY_HOUSE = new FlowerBlueFairyHouse("flower_blue_fairy_house");
	public static final Block FLOWER_PINK_FAIRY_HOUSE = new FlowerPinkFairyHouse("flower_pink_fairy_house");
	public static final Block FLOWER_PURPLE_FAIRY_HOUSE = new FlowerPurpleFairyHouse("flower_purple_fairy_house");
	
	//Mushroom Fairy Houses
	public static final Block MUSHROOM_MAGENTA_FAIRY_HOUSE = new MushroomMagentaFairyHouse("mushroom_magenta_fairy_house");
	public static final Block MUSHROOM_PURPLE_FAIRY_HOUSE = new MushroomPurpleFairyHouse("mushroom_purple_fairy_house");
	public static final Block MUSHROOM_RED_FAIRY_HOUSE = new MushroomRedFairyHouse("mushroom_red_fairy_house");
	
	//Planters
	public static final Block SPROUT_PLANTER_BLACK_SHEEP = new SproutPlanterBlackSheep("sprout_planter_black_sheep");
/*	public static final Block SPROUT_PLANTER_BROWN_SHEEP = new SproutPlanterBrownSheep("sprout_planter_brown_sheep");
	public static final Block SPROUT_PLANTER_GRAY_SHEEP = new SproutPlanterGraySheep("sprout_planter_gray_sheep");
    public static final Block SPROUT_PLANTER_LIGHT_GRAY_SHEEP = new SproutPlanterLightGraySheep("sprout_planter_light_gray_sheep");
	public static final Block SPROUT_PLANTER_WHITE_SHEEP = new SproutPlanterWhiteSheep("sprout_planter_white_sheep");
	public static final Block SPROUT_PLANTER_RAINBOW_SHEEP = new SproutPlanterRainbowSheep("sprout_planter_rainbow_sheep");
	public static final Block SPROUT_PLANTER_RED_SHEEP = new SproutPlanterRedSheep("sprout_planter_red_sheep");
	public static final Block SPROUT_PLANTER_ORANGE_SHEEP = new SproutPlanterOrangeSheep("sprout_planter_orange_sheep");
	public static final Block SPROUT_PLANTER_YELLOW_SHEEP = new SproutPlanterYellowSheep("sprout_planter_yellow_sheep");
    public static final Block SPROUT_PLANTER_LIME_SHEEP = new SproutPlanterLimeSheep("sprout_planter_lime_sheep");
    public static final Block SPROUT_PLANTER_GREEN_SHEEP = new SproutPlanterGreenSheep("sprout_planter_green_sheep");
    public static final Block SPROUT_PLANTER_LIGHT_BLUE_SHEEP = new SproutPlanterLightBlueSheep("sprout_planter_light_blue_sheep");
 	public static final Block SPROUT_PLANTER_CYAN_SHEEP = new SproutPlanterCyanSheep("sprout_planter_cyan_sheep");
	public static final Block SPROUT_PLANTER_BLUE_SHEEP = new SproutPlanterBlueSheep("sprout_planter_blue_sheep");
    public static final Block SPROUT_PLANTER_PINK_SHEEP = new SproutPlanterPinkSheep("sprout_planter_pink_sheep");
	public static final Block SPROUT_PLANTER_MAGENTA_SHEEP = new SproutPlanterMagentaSheep("sprout_planter_magenta_sheep");
    public static final Block SPROUT_PLANTER_PURPLE_SHEEP = new SproutPlanterPurpleSheep("sprout_planter_purple_sheep");
    public static final Block SPROUT_PLANTER_COW = new SproutPlanterCow("sprout_planter_cow");
    public static final Block SPROUT_PLANTER_MOOSHROOM_COW = new SproutPlanterMooshroomCow("sprout_planter_mooshroom_cow");
    public static final Block SPROUT_PLANTER_OCELOT = new SproutPlanterOcelot("sprout_planter_ocelot");
    public static final Block SPROUT_PLANTER_PIG = new SproutPlanterPig("sprout_planter_pig");
    public static final Block SPROUT_PLANTER_VILLAGER = new SproutPlanterVillager("sprout_planter_villager");
    public static final Block SPROUT_PLANTER_ZOMBIE_VILLAGER = new SproutPlanterZombieVillager("sprout_planter_zombie_villager");
    public static final Block SPROUT_PLANTER_SPIDER = new SproutPlanterSpider("sprout_planter_spider");
    public static final Block SPROUT_PLANTER_CREEPER = new SproutPlanterCreeper("sprout_planter_creeper");
    public static final Block SPROUT_PLANTER_PINK_CREEPER = new SproutPlanterPinkCreeper("sprout_planter_pink_creeper");
    public static final Block SPROUT_PLANTER_ENDERMAN = new SproutPlanterEnderman("sprout_planter_enderman");
    public static final Block SPROUT_PLANTER_SKELETON = new SproutPlanterSkeleton("sprout_planter_skeleton");
    public static final Block SPROUT_PLANTER_WITHER_SKELETON = new SproutPlanterWitherSkeleton("sprout_planter_wither_skeleton");
    public static final Block SPROUT_PLANTER_ZOMBIE = new SproutPlanterZombie("sprout_planter_zombie");
    public static final Block SPROUT_PLANTER_ENDER_DRAGON = new SproutPlanterEnderDragon("sprout_planter_ender_dragon");

*/
}
