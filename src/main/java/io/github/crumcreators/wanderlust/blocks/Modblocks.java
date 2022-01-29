package io.github.crumcreators.wanderlust.blocks;

import io.github.crumcreators.wanderlust.Wanderlust;
import eu.pb4.polymer.api.block.PolymerBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Modblocks {
    //Block Settings
    public static final Block SOULSTIUM_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(20.0f, 50.0f));
    public static final Block HELLSTONE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(5.0f, 15.0f));
    public static final Block DARKNESS_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(30.0f, 10.0f));
    public static final Block LUMINANCE_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(30.0f, 10.0f));

    public static void ModBlocks() {
        initializeBlocks();
    }
    //Register Blocks
    public static void initializeBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Wanderlust.MOD_ID,"soulstium_block"), SOULSTIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "soulstium_block"), new BlockItem(SOULSTIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(Wanderlust.MOD_ID,"hellstone"), HELLSTONE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "hellstone"), new BlockItem(HELLSTONE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(Wanderlust.MOD_ID,"darkness_block"), DARKNESS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "darkness_block"), new BlockItem(DARKNESS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(Wanderlust.MOD_ID,"luminance_block"), LUMINANCE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "luminance_block"), new BlockItem(LUMINANCE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
// This code still needs to implement Polymer