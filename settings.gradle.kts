pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
include("kotlin-app")
rootProject.name = "JVM Builds with Gradle Build Tool"