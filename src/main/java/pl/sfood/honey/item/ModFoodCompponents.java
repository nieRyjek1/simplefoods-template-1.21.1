package pl.sfood.honey.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodCompponents {
    public static final FoodComponent HOT_DOG = new FoodComponent.Builder().nutrition(7).saturationModifier(0.25f).build();
    public static final FoodComponent ICE_CREAM_CHOCOLATE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 0.15f).build();
    public static final FoodComponent ICE_CREAM_STRAWBERRY = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 0.15f).build();
    public static final FoodComponent ICE_CREAM_SALTED_CARMEL = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 0.15f).build();
    public static final FoodComponent ICE_CREAM_VANILLA = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 0.15f).build();
    public static final FoodComponent BANANA_SHAKE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 0.15f).build();
    public static final FoodComponent BLUEBERRY_SHAKE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 0.15f).build();
    public static final FoodComponent CARMEL_SHAKE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 0.15f).build();
    public static final FoodComponent CHOCOLATE_SHAKE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 0.15f).build();
    public static final FoodComponent STRAWBERRY_SHAKE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 0.15f).build();
    public static final FoodComponent VANILLA_SHAKE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 0.15f).build();
    public static final FoodComponent TEPICOLA = new FoodComponent.Builder().nutrition(4).saturationModifier(0.25f).build();
    public static final FoodComponent OSHAWATA = new FoodComponent.Builder().nutrition(4).saturationModifier(0.25f).build();
    public static final FoodComponent BOMBARDILOTOTODILO = new FoodComponent.Builder().nutrition(4).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 250), 0.25f).build();
}
