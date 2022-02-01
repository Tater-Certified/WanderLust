package io.github.crumcreators.wanderlust.blocks;

import io.github.crumcreators.wanderlust.ui.ModItemGroups;
import io.github.crumcreators.wanderlust.Wanderlust;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModOres {
    //Ore Settings
    public static final OreBlock EXPERIUM_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(10.0f, 6.0f));

    public static void initializeOres() {
        Registry.register(Registry.BLOCK, new Identifier(Wanderlust.MOD_ID,"experium_ore"), EXPERIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "experium_ore"), new BlockItem(EXPERIUM_ORE, new Item.Settings().group(ModItemGroups.WANDERLUST_ORE)));
    }
}
// This code still needs to implement Polymer