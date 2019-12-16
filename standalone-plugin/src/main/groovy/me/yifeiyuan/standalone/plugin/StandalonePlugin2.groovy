package me.yifeiyuan.standalone.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project


class StandalonePlugin2 implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("StandalonePlugin2") {
            doLast {
                println("StandalonePlugin 2 apply")
            }
        }
    }
}