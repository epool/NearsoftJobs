package com.nearsoft.nearsoftjobs.data

import com.nearsoft.nearsoftjobs.model.Job
import java.util.*

/**
 * Created by epool on 7/14/16.
 */
object JobData {

    val JOBS: MutableList<Job> = ArrayList()

    init {
        val androidEngineer = Job(name = "Android Engineer", pageId = "android")
        JOBS.add(androidEngineer)

        val angularJsEngineer = Job("AngularJS Engineer", "angular")
        JOBS.add(angularJsEngineer)

        val fullStackFrontEndEngineer = Job("Full Stack Front End Engineer", "front-end-full-stack")
        JOBS.add(fullStackFrontEndEngineer)

        val iOsEngineer = Job("iOS Engineer", "ios")
        JOBS.add(iOsEngineer)

        val fullStackJavaEngineer = Job("Full Stack Java Engineer", "java-full-stack")
        JOBS.add(fullStackJavaEngineer)

        val javaEngineer = Job("Java Engineer", "java")
        JOBS.add(javaEngineer)

        val nodeJsEngineer = Job("Node.js Engineer", "node")
        JOBS.add(nodeJsEngineer)

        val qAEngineer = Job("QA Engineer", "qa")
        JOBS.add(qAEngineer)

        val qAAutomationEngineer = Job("QA Automation", "qa-automation")
        JOBS.add(qAAutomationEngineer)

        val rubyOnRailsEngineer = Job("Ruby on Rails Engineer", "ror")
        JOBS.add(rubyOnRailsEngineer)
    }

}
