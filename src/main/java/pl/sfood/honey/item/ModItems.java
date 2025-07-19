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
    public static final Item ICE_CREAM_CHOCOLATE = registerItem("ice_cream_chocolate", new Item(new Item.Settings()));
    public static final Item ICE_CREAM_SALTED_CARMEL = registerItem("ice_cream_salted_carmel", new Item(new Item.Settings()));
    public static final Item ICE_CREAM_STRAWBERRY = registerItem("ice_cream_strawberry", new Item(new Item.Settings()));
    public static final Item ICE_CREAM_VANILLA = registerItem("ice_cream_vanilla", new Item(new Item.Settings()));




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

        });
    }
}
