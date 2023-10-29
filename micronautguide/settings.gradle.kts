rootProject.name = "micronautguide"

plugins {
    id("org.gradle.toolchains.foojay-resolver") version "0.7.0"
}

toolchainManagement {
    jvm {
        javaRepositories {
            repository("foojay") {
                resolverClass.set(org.gradle.toolchains.foojay.FoojayToolchainResolver::class.java)
            }
        }
    }
}