package io.github.crumcreators.wanderlust;

import io.github.crumcreators.wanderlust.blocks.ModOres;
import io.github.crumcreators.wanderlust.items.ModMagic;
import io.github.crumcreators.wanderlust.items.ModRanged;
import io.github.crumcreators.wanderlust.items.ModWeapons;
import net.fabricmc.api.ModInitializer;
import io.github.crumcreators.wanderlust.blocks.ModBlocks;

public class Wanderlust implements ModInitializer {
    public static String MOD_ID = "wanderlust";
    @Override
    public void onInitialize() {
        ModBlocks.initializeBlocks();
        ModWeapons.initializeWeapons();
        ModMagic.initializeMagic();
        ModOres.initializeOres();
        ModRanged.initializeRanged();
    }
}
