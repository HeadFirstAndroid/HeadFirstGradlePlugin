plugins {
    `java-gradle-plugin`
//    kotlin("android")
//    `kotlin-dsl`
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61")
}

gradlePlugin {
    plugins {
        create("ktPlugin") {
            id = "me.yifeiyuan.ktPlugin"
            implementationClass = "me.yifeiyuan.ktplugin.KotlinPlugin"
        }
    }
}