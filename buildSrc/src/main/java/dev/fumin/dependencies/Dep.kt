package dev.fumin.dependencies

object Dep {

    object Plugin {
        object SpringBoot {
            const val dependencyManagement = "io.spring.gradle:dependency-management-plugin:1.1.3"
            const val core = "org.springframework.boot:spring-boot-gradle-plugin:3.1.5"

            object Id {
                const val dependencyManagement = "io.spring.dependency-management"
                const val core = "org.springframework.boot"
            }
        }
        object GraalVM {
            const val plugin = "org.graalvm.buildtools:native-gradle-plugin:0.9.28"
            const val id = "org.graalvm.buildtools.native"
        }
    }

}
