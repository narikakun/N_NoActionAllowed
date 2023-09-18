package me.ysms.n_noactionallowed;

import net.kyori.adventure.title.TitlePart;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandKit implements CommandExecutor {

    public static boolean isToggle;

    @Override
    public boolean onCommand(@NotNull CommandSender sender, Command command, @NotNull String label, String[] args) {
        if (command.getName().equalsIgnoreCase("naa")) {
            if (args.length == 0) {
                sender.sendMessage("引数を指定してください。");
                return true;
            }
            if (args[0].equalsIgnoreCase("start")) {
                isToggle = true;
                sender.sendMessage("スタートしました！");
                for (Player p : sender.getServer().getOnlinePlayers()) {
                    p.sendTitle("§aスタート!!", "同じ座標になってはいけない", 6, 20, 6);
                }
            } else if (args[0].equalsIgnoreCase("end")) {
                isToggle = false;
                sender.sendMessage("終了しました！");
                for (Player p : sender.getServer().getOnlinePlayers()) {
                    p.sendTitle("§c終了～!!", "おつかれ～", 6, 20, 6);
                }
            } else {
                sender.sendMessage("引数を指定が正しくありません。");
            }
            return true;
        }
        return false;
    }
}