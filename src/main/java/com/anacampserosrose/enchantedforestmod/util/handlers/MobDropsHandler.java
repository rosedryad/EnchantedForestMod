package com.anacampserosrose.enchantedforestmod.util.handlers;

import com.anacampserosrose.enchantedforestmod.init.ModBlocks;
import com.anacampserosrose.enchantedforestmod.init.ModItems;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler
{
    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent event)
    {   if (event.getSource().getDamageType().equals("player")) 
        if (event.getEntity() instanceof EntitySheep)
        {
           // event.drops.clear();
 
            ItemStack stack = new ItemStack(ModBlocks.FORGET_ME_NOT);
            EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
            setRarity(EnumRarity.RARE);
            event.getDrops().add(drop);
        }
    }

	private void setRarity(EnumRarity rare) {
		
	}
}