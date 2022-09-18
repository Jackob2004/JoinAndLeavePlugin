package me.shadow_warrior_.joinandleaveplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    JoinAndLeavePlugin plugin = JoinAndLeavePlugin.getPlugin(JoinAndLeavePlugin.class);

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        String join = plugin.getConfig().getString("Join");
        String fjoin = plugin.getConfig().getString("Firstjoin");

        if (player.hasPlayedBefore()){
            e.setJoinMessage(ChatColor.WHITE + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + join);
        }else e.setJoinMessage(ChatColor.RED + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + fjoin);
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();
        String leave = plugin.getConfig().getString("Leave");

        e.setQuitMessage(ChatColor.WHITE + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + leave);

    }

}
