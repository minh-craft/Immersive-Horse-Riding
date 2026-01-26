package com.leclowndu93150.horseimprovements;

import com.leclowndu93150.horseimprovements.config.HorseImprovementsConfig;
import net.fabricmc.api.ModInitializer;

public class Horseimprovements implements ModInitializer {

    @Override
    public void onInitialize() {
        HorseImprovementsConfig.load();
    }
}
