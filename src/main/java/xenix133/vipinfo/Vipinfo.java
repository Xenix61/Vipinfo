package xenix133.vipinfo;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xenix133.vipinfo.commands.Svip;
import xenix133.vipinfo.commands.Vip;
import xenix133.vipinfo.commands.Vipplus;
import xenix133.vipinfo.menager.ConfigMenager;

public final class Vipinfo extends JavaPlugin implements Listener {
    //łączenie z ConfigMenager
    private ConfigMenager configMenager;

    @Override
    public void onEnable() {

        configMenager = new ConfigMenager(getConfig());
        initConfig();

        getLogger().info("Vipinfo is enabled");
        getServer().getPluginManager().registerEvents(this, this);
        //przekierowanie komend do odpowiednich plików
        getCommand("vip").setExecutor(new Vip(configMenager));
        getCommand("vip+").setExecutor(new Vipplus(configMenager));
        getCommand("svip").setExecutor(new Svip(configMenager));
    }

    @Override
    public void onDisable() {
        getLogger().info("Vipinfo is disabled");
        saveConfig();
    }


    //zapis configu po włączeniu
    private void initConfig() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }
}
