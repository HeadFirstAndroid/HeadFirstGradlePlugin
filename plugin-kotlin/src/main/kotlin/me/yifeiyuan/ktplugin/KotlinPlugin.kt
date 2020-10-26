package me.yifeiyuan.ktplugin

import org.gradle.api.Project

open class KotlinPlugin : org.gradle.api.Plugin<Project> {
    override fun apply(target: Project) {

        target.task("ktplugin"){
            doLast {
                println("hi ktplugin")
            }
        }
    }


}