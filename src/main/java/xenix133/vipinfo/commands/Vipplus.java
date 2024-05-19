package xenix133.vipinfo.commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xenix133.vipinfo.menager.Msg;
import xenix133.vipinfo.menager.ConfigMenager;


public class Vipplus implements CommandExecutor {
    //łączenie z ConfigMenager
    private ConfigMenager configMenager;

    public Vipplus(ConfigMenager configMenager){
        this.configMenager = configMenager;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("vip+")) {
            Player player = (Player) sender;
            //wysyłanie wiadomości ustawionej w config'u
            Msg.send(player, configMenager.getVipplusMessage());
            return true;
        }
        if (label.equalsIgnoreCase("vipplus")) {
            Player player = (Player) sender;
            //wysyłanie wiadomości ustawionej w config'u
            Msg.send(player, configMenager.getVipplusMessage());
            return true;
        }
        return true;
    }
}