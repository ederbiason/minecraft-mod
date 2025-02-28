package net.ederbiason.firstmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .m_38762_(new MobEffectInstance(MobEffects.INVISIBILITY, 400), 0.20f).build();

    public static final FoodProperties PROFITEROLE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .m_38762_(new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.50f).build();
}
