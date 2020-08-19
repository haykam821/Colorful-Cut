package io.github.haykam821.colorfulcut.block;

import io.github.haykam821.colorfulcut.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
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
	BLACK_CONCRETE_SLAB("black_concrete_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	WHITE_CONCRETE_STAIRS("white_concrete_stairs", new ColorfulStairsBlock(Blocks.WHITE_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	ORANGE_CONCRETE_STAIRS("orange_concrete_stairs", new ColorfulStairsBlock(Blocks.ORANGE_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	MAGENTA_CONCRETE_STAIRS("magenta_concrete_stairs", new ColorfulStairsBlock(Blocks.MAGENTA_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	LIGHT_BLUE_CONCRETE_STAIRS("light_blue_concrete_stairs", new ColorfulStairsBlock(Blocks.LIGHT_BLUE_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	YELLOW_CONCRETE_STAIRS("yellow_concrete_stairs", new ColorfulStairsBlock(Blocks.YELLOW_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	LIME_CONCRETE_STAIRS("lime_concrete_stairs", new ColorfulStairsBlock(Blocks.LIME_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	PINK_CONCRETE_STAIRS("pink_concrete_stairs", new ColorfulStairsBlock(Blocks.PINK_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	GRAY_CONCRETE_STAIRS("gray_concrete_stairs", new ColorfulStairsBlock(Blocks.GRAY_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	LIGHT_GRAY_CONCRETE_STAIRS("light_gray_concrete_stairs", new ColorfulStairsBlock(Blocks.LIGHT_GRAY_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	CYAN_CONCRETE_STAIRS("cyan_concrete_stairs", new ColorfulStairsBlock(Blocks.CYAN_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	PURPLE_CONCRETE_STAIRS("purple_concrete_stairs", new ColorfulStairsBlock(Blocks.PURPLE_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	BLUE_CONCRETE_STAIRS("blue_concrete_stairs", new ColorfulStairsBlock(Blocks.BLUE_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	BROWN_CONCRETE_STAIRS("brown_concrete_stairs", new ColorfulStairsBlock(Blocks.BROWN_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	GREEN_CONCRETE_STAIRS("green_concrete_stairs", new ColorfulStairsBlock(Blocks.GREEN_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	RED_CONCRETE_STAIRS("red_concrete_stairs", new ColorfulStairsBlock(Blocks.RED_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	BLACK_CONCRETE_STAIRS("black_concrete_stairs", new ColorfulStairsBlock(Blocks.BLACK_CONCRETE), ItemGroup.BUILDING_BLOCKS),
	WHITE_CONCRETE_WALL("white_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	ORANGE_CONCRETE_WALL("orange_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.ORANGE_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	MAGENTA_CONCRETE_WALL("magenta_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.MAGENTA_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	LIGHT_BLUE_CONCRETE_WALL("light_blue_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	YELLOW_CONCRETE_WALL("yellow_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.YELLOW_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	LIME_CONCRETE_WALL("lime_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.LIME_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	PINK_CONCRETE_WALL("pink_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.PINK_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	GRAY_CONCRETE_WALL("gray_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.GRAY_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	LIGHT_GRAY_CONCRETE_WALL("light_gray_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	CYAN_CONCRETE_WALL("cyan_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.CYAN_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	PURPLE_CONCRETE_WALL("purple_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.PURPLE_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	BLUE_CONCRETE_WALL("blue_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BLUE_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	BROWN_CONCRETE_WALL("brown_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BROWN_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	GREEN_CONCRETE_WALL("green_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.GREEN_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	RED_CONCRETE_WALL("red_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.RED_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	BLACK_CONCRETE_WALL("black_concrete_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE)), ItemGroup.BUILDING_BLOCKS),
	TERRACOTTA_SLAB("terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	WHITE_TERRACOTTA_SLAB("white_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.WHITE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	ORANGE_TERRACOTTA_SLAB("orange_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.ORANGE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	MAGENTA_TERRACOTTA_SLAB("magenta_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.MAGENTA_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	LIGHT_BLUE_TERRACOTTA_SLAB("light_blue_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	YELLOW_TERRACOTTA_SLAB("yellow_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.YELLOW_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	LIME_TERRACOTTA_SLAB("lime_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.LIME_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	PINK_TERRACOTTA_SLAB("pink_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.PINK_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	GRAY_TERRACOTTA_SLAB("gray_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.GRAY_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	LIGHT_GRAY_TERRACOTTA_SLAB("light_gray_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	CYAN_TERRACOTTA_SLAB("cyan_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.CYAN_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	PURPLE_TERRACOTTA_SLAB("purple_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.PURPLE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	BLUE_TERRACOTTA_SLAB("blue_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BLUE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	BROWN_TERRACOTTA_SLAB("brown_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BROWN_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	GREEN_TERRACOTTA_SLAB("green_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.GREEN_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	RED_TERRACOTTA_SLAB("red_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.RED_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	BLACK_TERRACOTTA_SLAB("black_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BLACK_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	TERRACOTTA_STAIRS("terracotta_stairs", new ColorfulStairsBlock(Blocks.TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	WHITE_TERRACOTTA_STAIRS("white_terracotta_stairs", new ColorfulStairsBlock(Blocks.WHITE_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	ORANGE_TERRACOTTA_STAIRS("orange_terracotta_stairs", new ColorfulStairsBlock(Blocks.ORANGE_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	MAGENTA_TERRACOTTA_STAIRS("magenta_terracotta_stairs", new ColorfulStairsBlock(Blocks.MAGENTA_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	LIGHT_BLUE_TERRACOTTA_STAIRS("light_blue_terracotta_stairs", new ColorfulStairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	YELLOW_TERRACOTTA_STAIRS("yellow_terracotta_stairs", new ColorfulStairsBlock(Blocks.YELLOW_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	LIME_TERRACOTTA_STAIRS("lime_terracotta_stairs", new ColorfulStairsBlock(Blocks.LIME_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	PINK_TERRACOTTA_STAIRS("pink_terracotta_stairs", new ColorfulStairsBlock(Blocks.PINK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	GRAY_TERRACOTTA_STAIRS("gray_terracotta_stairs", new ColorfulStairsBlock(Blocks.GRAY_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	LIGHT_GRAY_TERRACOTTA_STAIRS("light_gray_terracotta_stairs", new ColorfulStairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	CYAN_TERRACOTTA_STAIRS("cyan_terracotta_stairs", new ColorfulStairsBlock(Blocks.CYAN_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	PURPLE_TERRACOTTA_STAIRS("purple_terracotta_stairs", new ColorfulStairsBlock(Blocks.PURPLE_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	BLUE_TERRACOTTA_STAIRS("blue_terracotta_stairs", new ColorfulStairsBlock(Blocks.BLUE_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	BROWN_TERRACOTTA_STAIRS("brown_terracotta_stairs", new ColorfulStairsBlock(Blocks.BROWN_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	GREEN_TERRACOTTA_STAIRS("green_terracotta_stairs", new ColorfulStairsBlock(Blocks.GREEN_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	RED_TERRACOTTA_STAIRS("red_terracotta_stairs", new ColorfulStairsBlock(Blocks.RED_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	BLACK_TERRACOTTA_STAIRS("black_terracotta_stairs", new ColorfulStairsBlock(Blocks.BLACK_TERRACOTTA), ItemGroup.BUILDING_BLOCKS),
	TERRACOTTA_WALL("terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	WHITE_TERRACOTTA_WALL("white_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.WHITE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	ORANGE_TERRACOTTA_WALL("orange_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.ORANGE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	MAGENTA_TERRACOTTA_WALL("magenta_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.MAGENTA_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	LIGHT_BLUE_TERRACOTTA_WALL("light_blue_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	YELLOW_TERRACOTTA_WALL("yellow_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.YELLOW_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	LIME_TERRACOTTA_WALL("lime_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.LIME_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	PINK_TERRACOTTA_WALL("pink_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.PINK_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	GRAY_TERRACOTTA_WALL("gray_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.GRAY_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	LIGHT_GRAY_TERRACOTTA_WALL("light_gray_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	CYAN_TERRACOTTA_WALL("cyan_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.CYAN_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	PURPLE_TERRACOTTA_WALL("purple_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.PURPLE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	BLUE_TERRACOTTA_WALL("blue_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BLUE_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	BROWN_TERRACOTTA_WALL("brown_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BROWN_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	GREEN_TERRACOTTA_WALL("green_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.GREEN_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	RED_TERRACOTTA_WALL("red_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.RED_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS),
	BLACK_TERRACOTTA_WALL("black_terracotta_wall", new WallBlock(FabricBlockSettings.copy(Blocks.BLACK_TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);

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