package pl.sfood.honey.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import pl.sfood.honey.HoneyMonAddons;
import pl.sfood.honey.block.custom.CoffeeMachineBlock;
import pl.sfood.honey.block.custom.FridgeBottomBlock;
import pl.sfood.honey.block.custom.FridgeTopBlock;
import pl.sfood.honey.block.custom.ShelfBlock;

public class ModBlock {

    public static final Block COFFEEMACHINE = registerBlock("coffeemachine",
            new CoffeeMachineBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.METAL).nonOpaque()));


    public static final Block FRIDGE_BOTTOM = registerBlock("fridge_bottom",
            new FridgeBottomBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.METAL).strength(2.0f).nonOpaque()));


    public static final Block SHELFBLOCK = registerBlock("shelf",
            new ShelfBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD).strength(2.0f).nonOpaque()));

    public static final Block FRIDGE_TOP = registerBlockWithoutItem("fridge_top",
            new FridgeTopBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.METAL).strength(2.0f).nonOpaque()));




    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(HoneyMonAddons.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(HoneyMonAddons.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(HoneyMonAddons.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static  void registerModBlocks() {
        HoneyMonAddons.LOGGER.info("Registering Mod Blocks for" + HoneyMonAddons.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
        });

    }
}
