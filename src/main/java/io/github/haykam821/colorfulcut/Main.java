package io.github.haykam821.colorfulcut;

import io.github.haykam821.colorfulcut.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
	public static final String MOD_ID = "colorfulcut";

	@Override
	public void onInitialize() {
		ModBlocks.initialize();
	}
}