plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.fleet.plugin.layer)
}

kotlin {
    jvmToolchain(17)
}