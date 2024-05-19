package xenix133.vipinfo.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xenix133.vipinfo.menager.Msg;
import xenix133.vipinfo.menager.ConfigMenager;


public class Svip implements CommandExecutor {
    //łączenie z ConfigMenager
    private ConfigMenager configMenager;

    public Svip(ConfigMenager configMenager){
        this.configMenager = configMenager;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("svip")) {
            Player player = (Player) sender;
            //wysyłanie wiadomości ustawionej w config'u
            Msg.send(player, configMenager.getSvipMessage());
            return true;
        }
        return true;
    }
}

