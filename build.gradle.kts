// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${BuildDependenciesVersions.GRADLE_ANDROID}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${BuildDependenciesVersions.KOTLIN}")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${BuildDependenciesVersions.NAVIGATION}")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}