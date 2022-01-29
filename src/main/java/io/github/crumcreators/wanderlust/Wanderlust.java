package io.github.crumcreators.wanderlust;

import io.github.crumcreators.wanderlust.items.Modmagic;
import io.github.crumcreators.wanderlust.items.Modweapons;
import net.fabricmc.api.ModInitializer;
import io.github.crumcreators.wanderlust.blocks.Modblocks;

public class Wanderlust implements ModInitializer {
    public static String MOD_ID = "wanderlust";
    @Override
    public void onInitialize() {
        Modblocks.initializeBlocks();
        Modweapons.initializeWeapons();
        Modmagic.initializeMagic();
    }
}
