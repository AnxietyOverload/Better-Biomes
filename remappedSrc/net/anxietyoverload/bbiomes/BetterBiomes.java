package net.anxietyoverload.bbiomes;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;

public class BetterBiomes implements ModInitializer {
	public static final String MOD_ID = "bbiomes";
	public static final Logger LOGGER = (Logger) LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
