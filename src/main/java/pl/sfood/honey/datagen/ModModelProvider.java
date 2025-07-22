package pl.sfood.honey.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import pl.sfood.honey.block.ModBlock;
import pl.sfood.honey.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlock.FRIDGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlock.FRIDGE_BOTTOM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlock.FRIDGE_TOP);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
