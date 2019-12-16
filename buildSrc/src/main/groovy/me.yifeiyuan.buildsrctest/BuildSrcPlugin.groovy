package me.yifeiyuan.buildsrctest
import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildSrcPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("hi22") {
            doLast {
                println("Hi from buildSrc project")
            }
        }
    }
}