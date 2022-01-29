package io.github.crumcreators.wanderlust.items;

import io.github.crumcreators.wanderlust.UI.ModItemGroups;
import io.github.crumcreators.wanderlust.Wanderlust;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Modranged {
    public static final Item LONG_BOW = new Item(new FabricItemSettings().group(ModItemGroups.WANDERLUST_COMBAT));
    public static final Item SCOPED_CROSSBOW = new Item(new FabricItemSettings().group(ModItemGroups.WANDERLUST_COMBAT));
    public static final Item CUPIDIOUS = new Item(new FabricItemSettings().group(ModItemGroups.WANDERLUST_COMBAT));

    public static void ModRanged() {
        initializeRanged();
    }
    //Register Ranged Weapons
    public static void initializeRanged() {
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "long_bow"), LONG_BOW);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "scoped_crossbow"), SCOPED_CROSSBOW);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "cupidious"), CUPIDIOUS);
    }

}
// This code still needs to implement Polymer