package me.islandscout.sshd;

import org.bukkit.plugin.java.JavaPlugin;

public class SSHDPlugin extends JavaPlugin {

    private LagCompensator lagCompensator;

    @Override
    public void onEnable() {
        lagCompensator = new LagCompensator(this);
        new HitListener(this);
        saveConfig();
        getLogger().info("ServerSideHitDetection enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("ServerSideHitDetection disabled");
    }

    public LagCompensator getLagCompensator() {
        return lagCompensator;
    }
}
