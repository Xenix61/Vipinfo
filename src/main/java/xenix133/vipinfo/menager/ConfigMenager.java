package xenix133.vipinfo.menager;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigMenager{
    //łączenie z plikiem config.yml
    private FileConfiguration config;

    public ConfigMenager(FileConfiguration config){
        this.config = config;
        config.options().copyDefaults(true);
    }

    //funkcje config'u

    //pobiera wiadomosc dla komendy vip
    public String getVipMessage() {
        return config.getString("messages.vip");
    }

    //pobiera wiadomosc dla komendy vip+
    public String getVipplusMessage() {
        return config.getString("messages.vipplus");
    }

    //pobiera wiadomosc dla komendy svip
    public String getSvipMessage() {
        return config.getString("messages.svip");
    }
}