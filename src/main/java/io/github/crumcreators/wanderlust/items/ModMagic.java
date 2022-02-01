package io.github.crumcreators.wanderlust.items;

import io.github.crumcreators.wanderlust.ui.ModItemGroups;
import io.github.crumcreators.wanderlust.Wanderlust;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModMagic {
    public static final Item MAGICAL_TWIG = new Item(new FabricItemSettings().group(ModItemGroups.WANDERLUST_MAGIC));
    public static final Item MAGIC_WAND = new Item(new FabricItemSettings().group(ModItemGroups.WANDERLUST_MAGIC));
    public static final Item STAFF = new Item(new FabricItemSettings().group(ModItemGroups.WANDERLUST_MAGIC));
    public static final Item PRISM = new Item(new FabricItemSettings().group(ModItemGroups.WANDERLUST_MAGIC));

    public static void initializeMagic() {
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "magic_twig"), MAGICAL_TWIG);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "wand"), MAGIC_WAND);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "staff"), STAFF);
        Registry.register(Registry.ITEM, new Identifier(Wanderlust.MOD_ID, "prism"), PRISM);
    }
}
// This code still needs to implement Polymer