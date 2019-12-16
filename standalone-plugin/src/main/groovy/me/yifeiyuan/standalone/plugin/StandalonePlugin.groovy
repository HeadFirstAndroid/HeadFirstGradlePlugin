package me.yifeiyuan.standalone.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project


class StandalonePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("StandalonePlugin"){

            println("StandalonePlugin apply")
        }
    }
}