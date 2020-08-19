package io.github.haykam821.colorfulcut.block;

import io.github.haykam821.colorfulcut.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public enum ModBlocks {
	WHITE_CONCRETE_SLAB("white_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	ORANGE_CONCRETE_SLAB("orange_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.ORANGE_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	MAGENTA_CONCRETE_SLAB("magenta_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.MAGENTA_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	LIGHT_BLUE_CONCRETE_SLAB("light_blue_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	YELLOW_CONCRETE_SLAB("yellow_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.YELLOW_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	LIME_CONCRETE_SLAB("lime_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.LIME_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	PINK_CONCRETE_SLAB("pink_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.PINK_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	GRAY_CONCRETE_SLAB("gray_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.GRAY_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	LIGHT_GRAY_CONCRETE_SLAB("light_gray_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	CYAN_CONCRETE_SLAB("cyan_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.CYAN_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	PURPLE_CONCRETE_SLAB("purple_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.PURPLE_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	BLUE_CONCRETE_SLAB("blue_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BLUE_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	BROWN_CONCRETE_SLAB("brown_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BROWN_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	GREEN_CONCRETE_SLAB("green_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.GREEN_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	RED_CONCRETE_SLAB("red_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.RED_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	BLACK_CONCRETE_SLAB("black_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE)), ItemGroup.BUILDING_BLOCKS);

	public Block block;
	public BlockItem item;

	private ModBlocks(String path, Block block, ItemGroup group) {
		Identifier id = new Identifier(Main.MOD_ID, path);

		this.block = block;
		Registry.register(Registry.BLOCK, id, this.block);

		this.item = new BlockItem(block, new Item.Settings().group(group));
		Registry.register(Registry.ITEM, id, this.item);
	}

	public static ModBlocks initialize() {
		return null;
	}
}