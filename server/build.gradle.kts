plugins {
    id("org.springframework.boot") version "3.3.3" // ou a versão mais nova
    id("io.spring.dependency-management") version "1.1.6"
    kotlin("jvm") version "2.0.21" // mesma versão que você usa no projeto
    kotlin("plugin.spring") version "2.0.20"
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("ch.qos.logback:logback-classic:1.4.11")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.0")
}

configurations.all {
    resolutionStrategy {
        force("org.apache.commons:commons-compress:1.26.0")
    }
}