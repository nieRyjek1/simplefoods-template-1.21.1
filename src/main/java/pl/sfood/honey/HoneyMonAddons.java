package pl.sfood.honey;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.sfood.honey.block.ModBlock;
import pl.sfood.honey.item.ModItemGroups;
import pl.sfood.honey.item.ModItems;

public class HoneyMonAddons implements ModInitializer {
	public static final String MOD_ID = "honeymonaddons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlock.registerModBlocks();
	}
}