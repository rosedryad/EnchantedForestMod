package com.anacampserosrose.enchantedforestmod.entity;

import java.util.Set;

import javax.annotation.Nullable;

import com.anacampserosrose.enchantedforestmod.EnchantedForestMod;
import com.anacampserosrose.enchantedforestmod.init.ModItems;
import com.anacampserosrose.enchantedforestmod.init.ModLootTable;
import com.anacampserosrose.enchantedforestmod.init.ModSounds;
import com.google.common.collect.Sets;
import com.jcraft.jorbis.Block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollow;
import net.minecraft.entity.ai.EntityAIFollowOwnerFlying;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityFlamingo extends EntityAnimal implements IAnimals{
    private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(Items.FISH, Items.COOKED_FISH);
	private static final DataParameter<Byte> TYPE = EntityDataManager.<Byte>createKey(EntityFlamingo.class, DataSerializers.BYTE);
	private float ageHeight;
	
	public EntityFlamingo(World worldIn) {
		super(worldIn);
		this.setSize(0.9F, 2.8F);
	}
	   
    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(TYPE, Byte.valueOf((byte)0));
    }
	
    @Override
	protected void initEntityAI()
	    {
	        this.tasks.addTask(0, new EntityAIPanic(this, 2.0D));
	        this.tasks.addTask(1, new EntityAISwimming(this));
	        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
	        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, false, TEMPTATION_ITEMS));
	        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
	        this.tasks.addTask(5, new EntityAIFollow(this, 1.0D, 3.0F, 7.0F));
	        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(7, new EntityAILookIdle(this));
	    }
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(7.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.15D);
    }
    
    @Override
    protected SoundEvent getHurtSound(DamageSource source)
    {
        return ModSounds.ENTITY_FLAMINGO_HURT;
    }
    
    @Override
    protected SoundEvent getAmbientSound()
    {
        return ModSounds.ENTITY_FLAMINGO_AMBIENT;
    }
    
    @Override
    protected SoundEvent getDeathSound()
    {
        return ModSounds.ENTITY_FLAMINGO_DEAD;
    }
    
    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(ModSounds.ENTITY_FLAMINGO_STEP, 0.15F, 1.0F);
    }
    
    
    @Override
    public EntityFlamingo createChild(EntityAgeable ageable)
    {
        return new EntityFlamingo(this.world);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack)
    {
        return TEMPTATION_ITEMS.contains(stack.getItem());
    }
    
    @Nullable
    @Override
    protected ResourceLocation getLootTable()
    {
        return ModLootTable.FLAMINGO_LOOT;
    }
    
  
    
    @Override
    public void fall(float distance, float damageMultiplier)
    {
    }
    
    
    @Override
    public void writeEntityToNBT(NBTTagCompound tagCompound)
    {
        super.writeEntityToNBT(tagCompound);
        tagCompound.setInteger("FlamingoType", this.getFlamingoType());
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tagCompund)
    {
        super.readEntityFromNBT(tagCompund);
        this.setFlamingoType(tagCompund.getInteger("FlamingoType"));
    }
    
    protected boolean canMate()
    {
        return !this.isChild() && this.getHealth() >= this.getMaxHealth() && this.isInLove();
    }
    
    @Override
    public boolean canMateWith(EntityAnimal otherAnimal)
    {
        if (otherAnimal instanceof EntityFlamingo)
        {
            EntityFlamingo flamingo = ((EntityFlamingo)otherAnimal);
            if (this.getFlamingoType() != flamingo.getFlamingoType())
            {
                return this.canMate() && flamingo.canMate();
            }
        }
        
        return true;
    }
    
    @Override
    public boolean attackEntityAsMob(Entity entityIn)
    {
        return entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), 3.0F);
    }
    
    public int getFlamingoType()
    {
        return (int) this.dataManager.get(TYPE);
    }
    
    public void setFlamingoType(int flamingoTypeId)
    {
        this.dataManager.set(TYPE, Byte.valueOf((byte)flamingoTypeId));
    }
    
    public static class FlamingoTypeData implements IEntityLivingData
    {
        public int typeData;

        public FlamingoTypeData(int type)
        {
            this.typeData = type;
        }

}
    
}
