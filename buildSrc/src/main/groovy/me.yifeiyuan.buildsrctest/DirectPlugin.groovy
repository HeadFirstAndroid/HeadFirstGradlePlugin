package me.yifeiyuan.buildsrctest

import org.gradle.api.Plugin
import org.gradle.api.Project

class DirectPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.task("DirectPlugin") {

            doLast {
                println("buildSrc - DirectPlugin")
            }
        }
    }
}