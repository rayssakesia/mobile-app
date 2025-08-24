plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}
java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21
    }
}

//plugins {
//    kotlin("jvm")
//    kotlin("plugin.serialization") version "1.9.0"
//}
//
//repositories {
//    mavenCentral()
//}

dependencies {
    implementation("io.ktor:ktor-client-core:2.3.2")
    implementation("io.ktor:ktor-client-okhttp:2.3.2")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
}
