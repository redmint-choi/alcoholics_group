pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "mpex2025"
include(":mpex01")
include(":mpex04")
include(":mpex05")
include(":mpex06")
include(":mpex0701")
include(":mpex0702")
include(":mpex0703_jukebox_service")
include(":mpex0703_jukebox_player")
include(":mpex0704")
include(":mpex0705")
include(":mpex0801")
include(":mpex0802")
include(":mpex0901")
include(":mpex1001")
