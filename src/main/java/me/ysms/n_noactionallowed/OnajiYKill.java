package me.ysms.n_noactionallowed;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class OnajiYKill implements Listener {
    @EventHandler(ignoreCancelled = true)
    public void onPlayerMoveEvent(PlayerMoveEvent e) {
        int y = (int)e.getTo().getY();
        e.getPlayer().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("Y : " + y));
        Boolean getToggle = CommandKit.isToggle;
        if (!getToggle) return;
        for (Player p : e.getFrom().getWorld().getPlayers()) {
            if (p.getUniqueId() == e.getPlayer().getUniqueId()) continue;
            int pY = (int)p.getY();
            if (y == pY) {
                e.getPlayer().setHealth(0.0);
                p.setHealth(0.0);
            }
        }
    }
}
