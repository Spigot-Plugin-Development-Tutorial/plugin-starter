package me.myname;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginStarter extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Plugin disabled!");
    }
}
