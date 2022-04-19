package top.whitecola.deepanticheat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import top.whitecola.commandhandler.HiCommand;
import top.whitecola.confighandler.HiConfig;
import top.whitecola.deepanticheat.commands.CommandReport;
import top.whitecola.deepanticheat.commands.CommandVersion;
import top.whitecola.deepanticheat.configs.struct.PluginConfig;
import top.whitecola.deepanticheat.detecting.DetectorManager;
import top.whitecola.deepanticheat.listeners.PlayerListener;

import java.nio.charset.Charset;

public class DeepAntiCheat extends JavaPlugin {
    private static DeepAntiCheat instacne;
    {
        instacne = this;
    }
    private String pluginName = "plugin";

    private HiCommand commands = new HiCommand(this,"ac");
    private HiConfig<PluginConfig> config1 = new HiConfig<>(this.getDataFolder()+"/Config.json",PluginConfig.class, Charset.forName("utf8"),this);
    private DetectorManager detector = new DetectorManager();

    @Override
    public void onEnable() {
        init();
        super.onEnable();
    }

    @Override
    public void onLoad() {
        super.onLoad();
    }

    public void init(){
        registerListener();
        registerCommands();
    }

    public void registerListener(){
        Bukkit.getPluginManager().registerEvents(new PlayerListener(),this);
    }

    public void registerCommands(){
        commands.addCommand(new CommandReport());
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static DeepAntiCheat getInstacne() {
        return instacne;
    }


    public HiCommand getCommands() {
        return commands;
    }


    public HiConfig<PluginConfig> getConfig1() {
        return config1;
    }
}
