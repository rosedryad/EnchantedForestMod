package com.anacampserosrose.enchantedforestmod.init;

//import com.anacampserosrose.enchantedforestmod.api.EFSounds.*;

import com.anacampserosrose.enchantedforestmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSounds 
{
public static SoundEvent ENTITY_FLAMINGO_AMBIENT, ENTITY_FLAMINGO_HURT, ENTITY_FLAMINGO_DEAD, ENTITY_FLAMINGO_STEP;

    public static void init()
    {
        ENTITY_FLAMINGO_AMBIENT = registerSound("entity.flamingo.ambient");
        ENTITY_FLAMINGO_HURT = registerSound("entity.flamingo.hurt");
        ENTITY_FLAMINGO_DEAD = registerSound("entity.flamingo.dead");
        ENTITY_FLAMINGO_STEP = SoundEvents.ENTITY_CHICKEN_STEP;

    }
    
    private static SoundEvent registerSound(String name)
    {
        ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}