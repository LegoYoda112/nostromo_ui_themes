module fleet.nostromoUI.frontendImpl {
    requires fleet.frontend;
    requires fleet.kernel;
    requires fleet.util.logging.api;
    requires fleet.rhizomedb;
    requires fleet.frontend.ui;

    exports fleet.nostromoUI.frontendImpl;
    provides fleet.kernel.plugins.Plugin with fleet.nostromoUI.frontendImpl.NostromoUITheme;
}