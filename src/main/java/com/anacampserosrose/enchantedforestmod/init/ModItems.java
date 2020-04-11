package com.anacampserosrose.enchantedforestmod.init;

import java.util.ArrayList;
import java.util.List;

import com.anacampserosrose.enchantedforestmod.items.ItemBase;
import com.anacampserosrose.enchantedforestmod.items.ItemFlamingoFeather;
import com.anacampserosrose.enchantedforestmod.items.armor.ArmorBase;
import com.anacampserosrose.enchantedforestmod.items.tools.ItemTransformationWand;
import com.anacampserosrose.enchantedforestmod.items.tools.ToolAxe;
import com.anacampserosrose.enchantedforestmod.items.tools.ToolFlamingoSword;
import com.anacampserosrose.enchantedforestmod.items.tools.ToolHoe;
import com.anacampserosrose.enchantedforestmod.items.tools.ToolPickaxe;
import com.anacampserosrose.enchantedforestmod.items.tools.ToolShovel;
import com.anacampserosrose.enchantedforestmod.items.tools.ToolSword;
import com.anacampserosrose.enchantedforestmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Tool Materials
	//
	public static final ToolMaterial MATERIAL_AMETHYST = EnumHelper.addToolMaterial("material_amethyst", 3, 1721, 9.0F, 3.5F, 15);
	public static final ToolMaterial MATERIAL_FLAMINGO = EnumHelper.addToolMaterial("material_flamingo", 3, 3000, 9.0F, 5F, 20);
	
	
	//Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_AMETHYST = EnumHelper.addArmorMaterial("armor_material_amethyst", Reference.MOD_ID + ":amethyst", 14, 
			new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Armor
	public static final Item AMETHYST_HELMET = new ArmorBase("amethyst_helmet", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.HEAD);
	public static final Item AMETHYST_CHESTPLATE = new ArmorBase("amethyst_chestplate", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.CHEST);
	public static final Item AMETHYST_LEGGINGS = new ArmorBase("amethyst_leggings", ARMOR_MATERIAL_AMETHYST, 2, EntityEquipmentSlot.LEGS);
	public static final Item AMETHYST_BOOTS = new ArmorBase("amethyst_boots", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.FEET);
	
	//Tools
	public static final Item TRANSFORMATION_WAND = new ItemTransformationWand("transformation_wand");
	public static final Item FLAMINGO_SWORD = new ToolFlamingoSword("flamingo_sword", MATERIAL_FLAMINGO);
	public static final ItemSword AMETHYST_SWORD = new ToolSword("amethyst_sword", MATERIAL_AMETHYST);
	public static final ItemSpade AMETHYST_SHOVEL = new ToolShovel("amethyst_shovel", MATERIAL_AMETHYST);
	public static final ItemPickaxe AMETHYST_PICKAXE = new ToolPickaxe("amethyst_pickaxe", MATERIAL_AMETHYST);
	public static final ItemAxe AMETHYST_AXE = new ToolAxe("amethyst_axe", MATERIAL_AMETHYST);
	public static final ItemHoe AMETHYST_HOE = new ToolHoe("amethyst_hoe", MATERIAL_AMETHYST);
	
	//Items
	public static final Item FLAMINGO_FEATHER = new ItemFlamingoFeather("flamingo_feather");
	
	//Food
	//TODO: raw shrimp and cooked shrimp as taming items for flamingo
}
