plugins {
    id("java")
    id("org.sonarqube") version "4.4.1.3373"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

sonarqube {
    properties {
        property("sonar.projectKey", "zepic-sonar_gradle-sonar-sample")
        property("sonar.organization", "zepic-sonar-1")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}
