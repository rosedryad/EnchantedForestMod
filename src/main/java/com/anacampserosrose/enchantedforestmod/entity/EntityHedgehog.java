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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityHedgehog extends EntityAnimal implements IAnimals{
    private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(Items.FISH, Items.COOKED_FISH, Items.EGG, Items.APPLE, Items.MELON);
	private static final DataParameter<Byte> TYPE = EntityDataManager.<Byte>createKey(EntityHedgehog.class, DataSerializers.BYTE);
	private float ageHeight;
	
	public EntityHedgehog(World worldIn) {
		super(worldIn);
		this.setSize(1.3F, 1.3F);
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
	        this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(6, new EntityAILookIdle(this));
	    }
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.16D);
    }
    
    @Override
    protected SoundEvent getHurtSound(DamageSource source)
    {
        return ModSounds.ENTITY_HEDGEHOG_HURT;
    }
    
    @Override
    protected SoundEvent getAmbientSound()
    {
        return ModSounds.ENTITY_HEDGEHOG_AMBIENT;
    }
    
    @Override
    protected SoundEvent getDeathSound()
    {
        return ModSounds.ENTITY_HEDGEHOG_DEAD;
    }
    
    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(ModSounds.ENTITY_HEDGEHOG_STEP, 0.15F, 1.0F);
    }
    
    @Override
    public EntityHedgehog createChild(EntityAgeable ageable)
    {
        return new EntityHedgehog(this.world);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack)
    {
        return TEMPTATION_ITEMS.contains(stack.getItem());
    }
    /*
    @Nullable
    @Override
    protected ResourceLocation getLootTable()
    {
        return ModLootTable.HEDGEHOG_LOOT;
    }
    */
  
    
    @Override
    public void fall(float distance, float damageMultiplier)
    {
    }
    
    
    @Override
    public void writeEntityToNBT(NBTTagCompound tagCompound)
    {
        super.writeEntityToNBT(tagCompound);
        tagCompound.setInteger("HedgehogType", this.getHedgehogType());
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tagCompund)
    {
        super.readEntityFromNBT(tagCompund);
        this.setHedgehogType(tagCompund.getInteger("HedgehogType"));
    }
    
    protected boolean canMate()
    {
        return !this.isChild() && this.getHealth() >= this.getMaxHealth() && this.isInLove();
    }
    
    @Override
    public boolean canMateWith(EntityAnimal otherAnimal)
    {
        if (otherAnimal instanceof EntityHedgehog)
        {
            EntityHedgehog hedgehog = ((EntityHedgehog)otherAnimal);
            if (this.getHedgehogType() != hedgehog.getHedgehogType())
            {
                return this.canMate() && hedgehog.canMate();
            }
        }
        
        return true;
    }
    
    @Override
    public boolean attackEntityAsMob(Entity entityIn)
    {
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)((int)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));

        if (flag)
        {
            this.applyEnchantments(this, entityIn);
        }

        return flag;
    }
    
    /*
    
    @Override
    public boolean attackEntityAsMob(Entity entityIn)
    {
        return entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), 3.0F);
    }
    
    */
    
    public int getHedgehogType()
    {
        return (int) this.dataManager.get(TYPE);
    }
    
    public void setHedgehogType(int hedgehogTypeId)
    {
        this.dataManager.set(TYPE, Byte.valueOf((byte)hedgehogTypeId));
    }
    
    public static class HedgehogTypeData implements IEntityLivingData
    {
        public int typeData;

        public HedgehogTypeData(int type)
        {
            this.typeData = type;
        }

}
    
}
