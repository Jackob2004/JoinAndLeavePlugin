package me.shadow_warrior_.joinandleaveplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinAndLeavePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
