package me.ysms.n_noactionallowed;

import org.bukkit.plugin.java.JavaPlugin;

public final class N_NoActionAllowed extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OnajiYKill(), this);
        getCommand("naa").setExecutor(new CommandKit());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
