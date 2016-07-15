package com.nearsoft.nearsoftjobs.data

import com.nearsoft.nearsoftjobs.model.Job
import java.util.*

/**
 * Created by epool on 7/14/16.
 */
object JobData {

    val JOBS: MutableList<Job> = ArrayList()

    init {
        val androidEngineer = Job()
        androidEngineer.name = "Android Engineer"
        androidEngineer.pageId = "android"
        JOBS.add(androidEngineer)

        val angularJsEngineer = Job()
        angularJsEngineer.name = "AngularJS Engineer"
        angularJsEngineer.pageId = "angular"
        JOBS.add(angularJsEngineer)

        val fullStackFrontEndEngineer = Job()
        fullStackFrontEndEngineer.name = "Full Stack Front End Engineer"
        fullStackFrontEndEngineer.pageId = "front-end-full-stack"
        JOBS.add(fullStackFrontEndEngineer)

        val iOsEngineer = Job()
        iOsEngineer.name = "iOS Engineer"
        iOsEngineer.pageId = "ios"
        JOBS.add(iOsEngineer)

        val fullStackJavaEngineer = Job()
        fullStackJavaEngineer.name = "Full Stack Java Engineer"
        fullStackJavaEngineer.pageId = "java-full-stack"
        JOBS.add(fullStackJavaEngineer)

        val javaEngineer = Job()
        javaEngineer.name = "Java Engineer"
        javaEngineer.pageId = "java"
        JOBS.add(javaEngineer)

        val nodeJsEngineer = Job()
        nodeJsEngineer.name = "Node.js Engineer"
        nodeJsEngineer.pageId = "node"
        JOBS.add(nodeJsEngineer)

        val qAEngineer = Job()
        qAEngineer.name = "QA Engineer"
        qAEngineer.pageId = "qa"
        JOBS.add(qAEngineer)

        val qAAutomationEngineer = Job()
        qAAutomationEngineer.name = "QA Automation"
        qAAutomationEngineer.pageId = "qa-automation"
        JOBS.add(qAAutomationEngineer)

        val rubyOnRailsEngineer = Job()
        rubyOnRailsEngineer.name = "Ruby on Rails Engineer"
        rubyOnRailsEngineer.pageId = "ror"
        JOBS.add(rubyOnRailsEngineer)
    }

}
