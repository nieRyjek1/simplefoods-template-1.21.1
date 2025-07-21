package pl.sfood.honey;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.sfood.honey.block.ModBlock;
import pl.sfood.honey.item.ModItems;

public class SimpleFoods implements ModInitializer {
	public static final String MOD_ID = "simplefoods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlock.registerModBlocks();
	}
}