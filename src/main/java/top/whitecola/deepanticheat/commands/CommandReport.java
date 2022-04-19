package top.whitecola.deepanticheat.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import top.whitecola.annotations.ItsACommand;
import top.whitecola.commandhandler.ICommand;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@ItsACommand(CommandNmae = "report",premission = "dlac.report")
public class CommandReport implements ICommand{
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {


        return true;
    }

    public List<String> getArgs() {
        return Arrays.asList("[player]");
    }

    public List<String> handleArg(CommandSender sender, String handleArg) {
        if (handleArg.equalsIgnoreCase("[player]")) {
            return Bukkit.getOnlinePlayers().stream().map(i->i.getName()).collect(Collectors.toList());
        }
        return Arrays.asList("");

    }

    public String getUsage() {
        return "/ac report";
    }

    public String getUsageDescripition() {
        return "Report player.";
    }

}
