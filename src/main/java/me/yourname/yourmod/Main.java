package me.yourname.yourmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ProgressManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "template", name = "template", version = "0.0.0")
public class Main {
    public static Main instance;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ProgressManager.ProgressBar progressBar = ProgressManager.push("Template Mod", 1);
        progressBar.step("Making mods! Please change this too lol");
        instance = this;
        ProgressManager.pop(progressBar);
    }
}
