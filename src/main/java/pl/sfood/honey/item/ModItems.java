package pl.sfood.honey.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pl.sfood.honey.SimpleFoods;

public class ModItems {
    public static final Item HOT_DOG = registerItem("hot_dog", new Item(new Item.Settings().food(ModFoodCompponents.HOT_DOG)));
    public static final Item ICE_CREAM_CHOCOLATE = registerItem("ice_cream_chocolate", new Item(new Item.Settings().food(ModFoodCompponents.ICE_CREAM_CHOCOLATE)));
    public static final Item ICE_CREAM_SALTED_CARMEL = registerItem("ice_cream_salted_carmel", new Item(new Item.Settings().food(ModFoodCompponents.ICE_CREAM_SALTED_CARMEL)));
    public static final Item ICE_CREAM_STRAWBERRY = registerItem("ice_cream_strawberry", new Item(new Item.Settings().food(ModFoodCompponents.ICE_CREAM_STRAWBERRY)));
    public static final Item ICE_CREAM_VANILLA = registerItem("ice_cream_vanilla", new Item(new Item.Settings().food(ModFoodCompponents.ICE_CREAM_VANILLA)));
    public static final Item BANANA_SHAKE = registerItem("banana_shake", new DrinkableItem(new Item.Settings().food(ModFoodCompponents.BANANA_SHAKE)));
    public static final Item BLUEBERRY_SHAKE = registerItem("blueberry_shake", new DrinkableItem(new Item.Settings().food(ModFoodCompponents.BLUEBERRY_SHAKE)));
    public static final Item CARMEL_SHAKE = registerItem("carmel_shake", new DrinkableItem(new Item.Settings().food(ModFoodCompponents.CARMEL_SHAKE)));
    public static final Item CHOCOLATE_SHAKE = registerItem("chocolate_shake", new DrinkableItem(new Item.Settings().food(ModFoodCompponents.CHOCOLATE_SHAKE)));
    public static final Item STRAWBERRY_SHAKE = registerItem("strawberry_shake", new DrinkableItem(new Item.Settings().food(ModFoodCompponents.STRAWBERRY_SHAKE)));
    public static final Item VANILLA_SHAKE = registerItem("vanilla_shake", new DrinkableItem(new Item.Settings().food(ModFoodCompponents.VANILLA_SHAKE)));
    public static final Item TEPICOLA = registerItem("tepicola", new DrinkableItem(new Item.Settings().food(ModFoodCompponents.TEPICOLA)));
    public static final Item OSHAWATA = registerItem("oshawata", new DrinkableItem(new Item.Settings().food(ModFoodCompponents.OSHAWATA)));
    public static final Item BOMBARDILOTOTODILO = registerItem("bombardilototodilo", new DrinkableItem(new Item.Settings().food(ModFoodCompponents.BOMBARDILOTOTODILO)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SimpleFoods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SimpleFoods.LOGGER.info("Registering Mod Items For " + SimpleFoods.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(HOT_DOG);
            entries.add(ICE_CREAM_CHOCOLATE);
            entries.add(ICE_CREAM_STRAWBERRY);
            entries.add(ICE_CREAM_SALTED_CARMEL);
            entries.add(ICE_CREAM_VANILLA);
            entries.add(BANANA_SHAKE);
            entries.add(BLUEBERRY_SHAKE);
            entries.add(CARMEL_SHAKE);
            entries.add(CHOCOLATE_SHAKE);
            entries.add(STRAWBERRY_SHAKE);
            entries.add(VANILLA_SHAKE);
            entries.add(TEPICOLA);
            entries.add(OSHAWATA);
            entries.add(BOMBARDILOTOTODILO);

        });
    }
}
