package ksu.swat.mcPlugK


import org.bukkit.plugin.java.JavaPlugin

class McPlugK : JavaPlugin() {

    override fun onEnable() {
        this.logger.info("SwAT KSU mc plugin (K), starting up!")

        server.pluginManager.registerEvents(PlayerListener(this), this)
    }

    override fun onDisable() {
        this.logger.info("SwAT KSU mc plugin (K), shutting down.")
    }
}
