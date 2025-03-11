plugins {
    id("java")
    id ("org.openapi.generator") version "7.7.0"
    id("org.springframework.boot") version "3.4.3"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //implementation("org.springframework:spring-context:6.2.0")
    implementation("org.springframework.boot:spring-boot-starter-web")
    //implementation("org.springframework:spring-web:6.0.11")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}