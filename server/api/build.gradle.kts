// TODO WIll be extracted to root
buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()

        maven("http://repo.spring.io/plugins-release")
        maven("https://plugins.gradle.org/m2/")
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.3.RELEASE")
    }
}

plugins {
    base
    application
    java
    idea
    eclipse
}

apply {
    plugin("org.springframework.boot")
    plugin("io.spring.dependency-management")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    jcenter()
}

dependencies {
    compile("org.springframework.boot:spring-boot-starter-web")
}
