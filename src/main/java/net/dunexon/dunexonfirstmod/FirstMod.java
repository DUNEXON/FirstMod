package net.dunexon.dunexonfirstmod;

import net.fabricmc.api.ModInitializer;
import net.dunexon.dunexonfirstmod.item.FirstModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static final String MOD_ID = "dunexonfirstmod";
	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		FirstModItems.init();
	}
}
