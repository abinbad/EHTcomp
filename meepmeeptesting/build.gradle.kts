plugins {
    id("java-library")
}
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    maven("https://jitpack.io")
    maven("https://maven.brott.dev/")
}

dependencies {
    implementation("com.github.rh-robotics:MeepMeep:v1.1.0")
}