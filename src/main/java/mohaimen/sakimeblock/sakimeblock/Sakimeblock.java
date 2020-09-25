package mohaimen.sakimeblock.sakimeblock;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Sakimeblock extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("sakimeブロッガーを起動しました(:3っ)っ -=三[布団]");
        Bukkit.getPluginManager().registerEvents(this, this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("sakimeブロッガーを停止しました(:3っ[布団] ﾖｲｼｮ");
    }
    @EventHandler
    public void onChat(PlayerChatEvent event) {
        if (event.getMessage().indexOf("sakime") == -1) {
            event.getPlayer().kickPlayer("ええかげんにせえよほんま");
            return;
        }
    }
}
