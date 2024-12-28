package fleet.nostromoUI.frontendImpl

import fleet.dock.api.ThemeId
import fleet.frontend.theme.registerTheme
import fleet.kernel.plugins.ContributionScope
import fleet.kernel.plugins.Plugin
import fleet.kernel.plugins.PluginScope

class NostromoUITheme : Plugin<Unit> {
    companion object : Plugin.Key<Unit>

    override val key: Plugin.Key<Unit> = NostromoUITheme

    override fun ContributionScope.load(pluginScope: PluginScope) {
        registerTheme(ThemeId(id = "nostromo-ui"))
    }
}
