plugins {
    id("leafpile.library")
}

version = "1.2.4-kers.1-SNAPSHOT"

dependencies {
    api(project(":common"))
    api(libs.it.unimi.dsi.fastutil)
    implementation(libs.org.slf4j.slf4j.api)
    implementation(libs.net.java.dev.jna)
}

// Consumers may use VarHandles to access Minecraft, mod, or other GAMELIBRARY
// classes. NeoForge must load this JAR as a game library for that access to work.
tasks.jar {
    manifest {
        attributes("FMLModType" to "GAMELIBRARY")
    }
}
