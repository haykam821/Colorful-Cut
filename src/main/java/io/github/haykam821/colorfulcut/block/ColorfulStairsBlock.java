package io.github.haykam821.colorfulcut.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

public class ColorfulStairsBlock extends StairsBlock {
	public ColorfulStairsBlock(Block base) {
		super(base.getDefaultState(), FabricBlockSettings.copy(base));
	}
}
