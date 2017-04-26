import org.gradle.script.lang.kotlin.*
import org.jetbrains.intellij.IntelliJPluginExtension

buildscript {
    repositories {
        gradleScriptKotlin()
        maven { setUrl("https://dl.bintray.com/jetbrains/intellij-plugin-service") }
    }

    dependencies {
        classpath(kotlinModule("gradle-plugin"))
    }
}

plugins {
    id("org.jetbrains.intellij") version "0.2.7"
}

apply {
    plugin("org.jetbrains.intellij")
    plugin("kotlin")
}

configure<IntelliJPluginExtension> {
    pluginName = "GIDSPlugin"
    updateSinceUntilBuild = false
}

group = "com.gids"
version = "1.0"