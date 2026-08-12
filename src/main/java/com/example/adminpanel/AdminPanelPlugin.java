package com.example.adminpanel;

import org.bukkit.plugin.java.JavaPlugin;

public final class AdminPanelPlugin extends JavaPlugin {
    private static AdminPanelPlugin instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("[AdminPanel] AdminPanel Platform basariyla yuklendi!");
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static AdminPanelPlugin getInstance() { return instance; }
}
