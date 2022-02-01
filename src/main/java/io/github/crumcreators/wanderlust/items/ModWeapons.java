package io.github.crumcreators.wanderlust.items;

import io.github.crumcreators.wanderlust.ui.ModItemGroups;
import io.github.crumcreators.wanderlust.Wanderlust;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModWeapons {
    public static final Item DAGGER = new Item(new FabricItemSettings().group(ModItemGroups.WANDERLUST_COMBAT));
    public static final Item LONG_SWORD = new Item(new FabricItemSettings().group(ModItemGroups.WANDERLUST_COMBAT));
    public static final Item WAR_HAMMER = new Item(new FabricItemSettings().group(ModItemGroups.WANDERLUST_COMBAT));
    public static final Item BLEAM = new Item(new FabricItemSettings().group(ModItemGroups.WANDERLUST_COMBAT));

    public static void initializeWeapons() {
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "dagger"), DAGGER);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "long_sword"), LONG_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "war_hammer"), WAR_HAMMER);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "bleam"), BLEAM);
    }
}
// This code still needs to implement Polymer