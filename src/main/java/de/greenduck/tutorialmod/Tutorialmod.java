package de.greenduck.tutorialmod;

import de.greenduck.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class Tutorialmod implements ModInitializer {

    public static String MOD_ID = "tutorialmod";

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}