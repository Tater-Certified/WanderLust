package io.github.crumcreators.wanderlust.UI;

import io.github.crumcreators.wanderlust.Wanderlust;
import io.github.crumcreators.wanderlust.blocks.Modblocks;
import io.github.crumcreators.wanderlust.blocks.Modores;
import io.github.crumcreators.wanderlust.items.Modmagic;
import io.github.crumcreators.wanderlust.items.Modweapons;
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
            .icon(() -> new ItemStack(Modblocks.SOULSTIUM_BLOCK))
            .build();

    public static final ItemGroup WANDERLUST_COMBAT = FabricItemGroupBuilder.create(
                    new Identifier(Wanderlust.MOD_ID, "combat_group"))
            .icon(() -> new ItemStack(Modweapons.BLEAM))
            .build();

    public static final ItemGroup WANDERLUST_MISC = FabricItemGroupBuilder.create(
                    new Identifier(Wanderlust.MOD_ID, "misc_group"))
            .icon(() -> new ItemStack(null))
            .build();
    public static final ItemGroup WANDERLUST_ORE = FabricItemGroupBuilder.create(
                    new Identifier(Wanderlust.MOD_ID, "ore_group"))
            .icon(() -> new ItemStack(Modores.EXPERIUM_ORE))
            .build();
    public static final ItemGroup WANDERLUST_MAGIC = FabricItemGroupBuilder.create(
                    new Identifier(Wanderlust.MOD_ID, "magic_group"))
            .icon(() -> new ItemStack(Modmagic.PRISM))
            .build();
}

