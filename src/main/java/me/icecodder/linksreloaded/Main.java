package me.icecodder.linksreloaded;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin Disabled!");
    }
}
