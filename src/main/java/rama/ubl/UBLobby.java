package rama.ubl;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public final class UBLobby extends Plugin{

    @Override
    public void onEnable() {
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Lobby());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
