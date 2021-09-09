package com.github.huanxisa.plugintry.services

import com.intellij.openapi.project.Project
import com.github.huanxisa.plugintry.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
