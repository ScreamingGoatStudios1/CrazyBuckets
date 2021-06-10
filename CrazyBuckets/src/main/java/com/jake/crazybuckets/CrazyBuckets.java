package com.jake.crazybuckets;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CrazyBuckets extends JavaPlugin {
    public static CrazyBuckets plugin;

    public static boolean isStarted = false;

    @Override
    public void onEnable() {
        getCommand("crazybuckets").setExecutor(new StartCommand());
        Bukkit.getPluginManager().registerEvents(new BucketListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
