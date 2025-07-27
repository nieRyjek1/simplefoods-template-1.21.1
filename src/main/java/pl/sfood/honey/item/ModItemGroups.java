package pl.sfood.honey.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import pl.sfood.honey.HoneyMonAddons;
import pl.sfood.honey.block.ModBlock;

public class ModItemGroups {
    public static final ItemGroup SIMPLE_FOODS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HoneyMonAddons.MOD_ID, "simple_foods_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.HOT_DOG))
                    .displayName(Text.translatable("itemgroup.honeymonaddons.simple_foods_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HOT_DOG);
                        entries.add(ModItems.ICE_CREAM_CHOCOLATE);
                        entries.add(ModItems.ICE_CREAM_STRAWBERRY);
                        entries.add(ModItems.ICE_CREAM_SALTED_CARMEL);
                        entries.add(ModItems.ICE_CREAM_VANILLA);
                        entries.add(ModItems.BANANA_SHAKE);
                        entries.add(ModItems.BLUEBERRY_SHAKE);
                        entries.add(ModItems.CARMEL_SHAKE);
                        entries.add(ModItems.CHOCOLATE_SHAKE);
                        entries.add(ModItems.STRAWBERRY_SHAKE);
                        entries.add(ModItems.VANILLA_SHAKE);
                        entries.add(ModItems.TEPICOLA);
                        entries.add(ModItems.OSHAWATA);
                        entries.add(ModItems.BOMBARDILOTOTODILO);
                    }).build());
    public static final ItemGroup SIMPLE_FOODS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HoneyMonAddons.MOD_ID, "simple_foods_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlock.COFFEEMACHINE))
                    .displayName(Text.translatable("itemgroup.honeymonaddons.simple_foods_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlock.COFFEEMACHINE);
                        entries.add(ModBlock.SHELFBLOCK);
                        entries.add(ModBlock.FRIDGE_BOTTOM);
                    }).build());




    public static void registerItemGroups(){
        HoneyMonAddons.LOGGER.info("Registering Item Groups for"+ HoneyMonAddons.MOD_ID);
    }
}
