rootProject.name = "Nostromo UI"

include(":nostromo-ui-theme")
include(":nostromo-ui-theme:frontendImpl")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
        maven("https://packages.jetbrains.team/maven/p/fleet/fleet-sdk")
    }
}