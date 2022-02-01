package io.github.crumcreators.wanderlust.ui;

import io.github.crumcreators.wanderlust.Wanderlust;
import io.github.crumcreators.wanderlust.blocks.ModBlocks;
import io.github.crumcreators.wanderlust.blocks.ModOres;
import io.github.crumcreators.wanderlust.items.ModMagic;
import io.github.crumcreators.wanderlust.items.ModWeapons;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public abstract class ModItemGroups {
    public static final ItemGroup WANDERLUST_ITEMS = FabricItemGroupBuilder.build(
            new Identifier(Wanderlust.MOD_ID, "item_group"),
            () -> new ItemStack(null));

    public static final ItemGroup WANDERLUST_BLOCKS = FabricItemGroupBuilder.create(
                    new Identifier(Wanderlust.MOD_ID, "block_group"))
            .icon(() -> new ItemStack(ModBlocks.SOULSTIUM_BLOCK))
            .build();

    public static final ItemGroup WANDERLUST_COMBAT = FabricItemGroupBuilder.create(
                    new Identifier(Wanderlust.MOD_ID, "combat_group"))
            .icon(() -> new ItemStack(ModWeapons.BLEAM))
            .build();

    public static final ItemGroup WANDERLUST_MISC = FabricItemGroupBuilder.create(
                    new Identifier(Wanderlust.MOD_ID, "misc_group"))
            .icon(() -> new ItemStack(null))
            .build();
    public static final ItemGroup WANDERLUST_ORE = FabricItemGroupBuilder.create(
                    new Identifier(Wanderlust.MOD_ID, "ore_group"))
            .icon(() -> new ItemStack(ModOres.EXPERIUM_ORE))
            .build();
    public static final ItemGroup WANDERLUST_MAGIC = FabricItemGroupBuilder.create(
                    new Identifier(Wanderlust.MOD_ID, "magic_group"))
            .icon(() -> new ItemStack(ModMagic.PRISM))
            .build();
}

