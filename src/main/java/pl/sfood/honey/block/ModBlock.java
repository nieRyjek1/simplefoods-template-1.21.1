package pl.sfood.honey.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import pl.sfood.honey.SimpleFoods;
import pl.sfood.honey.block.custom.FridgeBlock;

public class ModBlock {

    public static final Block FRIDGE = registerBlock("fridge",
            new FridgeBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GLASS).nonOpaque()));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SimpleFoods.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SimpleFoods.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static  void registerModBlocks() {
        SimpleFoods.LOGGER.info("Registering Mod Blocks for" + SimpleFoods.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlock.FRIDGE);
        });

    }
}
