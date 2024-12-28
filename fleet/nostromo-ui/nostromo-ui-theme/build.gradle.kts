plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {
    id = "nostromo.ui.theme"

    metadata {
        readableName = "Nostromo UI"
        description = "Color Theme based on some of the landing UI from Alien's Nostromo spacecraft."

        icons {
            default.set(project.layout.projectDirectory.file("pluginIcon.svg"))
            dark.set(project.layout.projectDirectory.file("pluginIcon.svg"))
        }
    }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }

    //publishing {
    //    vendorId = "..."
    //}
}