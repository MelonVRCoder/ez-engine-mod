package net.melonunity.ez_engine.event;

import net.melonunity.ez_engine.EzEngine;
import net.melonunity.ez_engine.entity.ModEntities;
import net.melonunity.ez_engine.entity.custom.RhinoEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EzEngine.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RHINO.get(), RhinoEntity.createAttributes().build());
    }



}
