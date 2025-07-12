package net.melonunity.ez_engine.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.3f).build();

    public static final FoodProperties BURGER = new FoodProperties.Builder().nutrition(5)
            .saturationMod(0.8f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 150), 0.6f).build();
}
