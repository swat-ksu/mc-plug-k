package ksu.swat.mcPlugK

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class PlayerListener(private val plugin: McPlugK) : Listener {

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        val player = event.player

        event.joinMessage(
            Component.text("${player.name} joined", NamedTextColor.GREEN)
        )

        player.sendMessage(Component.text("Welcome to SwAT KSU"))
        plugin.logger.info("${player.name} joined.")
    }
}