package com.anacampserosrose.enchantedforestmod.items.tools;

import javax.annotation.Nonnull;

import com.anacampserosrose.enchantedforestmod.EnchantedForestMod;
import com.anacampserosrose.enchantedforestmod.items.ItemBase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemTransformationWand extends ItemBase {

		private int maxStackSize;

		public ItemTransformationWand(String name) {
			super(name);
			this.maxStackSize = 1;
			//this.setCreativeTab(EnchantedForestMod.enchantedforesttab);
		}
		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
			ItemStack stack = player.getHeldItem(hand);

			if (stack.getItemDamage() == stack.getMaxDamage()) {
				return ActionResult.newResult(EnumActionResult.FAIL, player.getHeldItem(hand));
			} else {
				player.playSound(SoundEvents.ENTITY_ZOMBIE_VILLAGER_CURE, 1.0F, (world.rand.nextFloat() - world.rand.nextFloat()) * 0.2F + 1.0F);

				if (!world.isRemote) {
					stack.damageItem(1, player);
				}

				return ActionResult.newResult(EnumActionResult.SUCCESS, player.getHeldItem(hand));
			}
		}
	@Nonnull
	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.RARE;
	}
	@Override
	public boolean hasContainerItem(ItemStack stack){
		return stack.getItemDamage() < stack.getMaxDamage();
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack){
	ItemStack ret = new ItemStack(itemStack.getItem());
	ret.setItemDamage(itemStack.getItemDamage()+1);
	return ret;
	}

		
}
