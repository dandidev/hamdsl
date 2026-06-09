plugins {
    kotlin("jvm") version "2.3.0"
    `maven-publish`
    signing
}

group = "io.github.dandidev"
version = "0.1.0-beta.1"

base {
    archivesName.set("hamdsl")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

java {
    withSourcesJar()
    withJavadocJar()
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            artifactId = "hamdsl"

            pom {
                name.set("HamDsl")
                description.set("Type-safe Kotlin library for amateur radio calculations.")
                url.set("https://github.com/dandidev/hamdsl")

                licenses {
                    license {
                        name.set("GNU General Public License v3.0")
                        url.set("https://www.gnu.org/licenses/gpl-3.0.html")
                    }
                }

                developers {
                    developer {
                        id.set("dandidev")
                        name.set("Roland Dandi")
                    }
                }

                scm {
                    url.set("https://github.com/dandidev/hamdsl")
                    connection.set("scm:git:https://github.com/dandidev/hamdsl.git")
                    developerConnection.set("scm:git:ssh://git@github.com/dandidev/hamdsl.git")
                }
            }
        }
    }
}

signing {
    useGpgCmd()
    sign(publishing.publications["maven"])
}

tasks.withType<Sign>().configureEach {
    onlyIf { !gradle.taskGraph.hasTask(":publishToMavenLocal") }
}