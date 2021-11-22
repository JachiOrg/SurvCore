package org.jachi.whirss.survcore;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[SurvCore] Plugin enabled (www.survcraft.org)");
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[SurvCore] Plugin disabled (www.survcraft.org)");
    }

    public void RegisterEvents() {
        //PluginManager pm = getServer().getPluginManager();
        //pm.registerEvents(new Event(this), this);
    }

    public void RegisterPluginCommands() {
        //this.getCommand("command").setExecutor(new CommandClass(this));
    }
}
