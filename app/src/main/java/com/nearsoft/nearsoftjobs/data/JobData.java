package com.nearsoft.nearsoftjobs.data;

import com.nearsoft.nearsoftjobs.model.Job;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by epool on 7/14/16.
 */
public class JobData {

    public static final List<Job> JOBS = new ArrayList<>();

    static {
        Job androidEngineer = new Job();
        androidEngineer.setName("Android Engineer");
        androidEngineer.setPageId("android");
        JOBS.add(androidEngineer);

        Job angularJsEngineer = new Job();
        angularJsEngineer.setName("AngularJS Engineer");
        angularJsEngineer.setPageId("angular");
        JOBS.add(angularJsEngineer);

        Job fullStackFrontEndEngineer = new Job();
        fullStackFrontEndEngineer.setName("Full Stack Front End Engineer");
        fullStackFrontEndEngineer.setPageId("front-end-full-stack");
        JOBS.add(fullStackFrontEndEngineer);

        Job iOsEngineer = new Job();
        iOsEngineer.setName("iOS Engineer");
        iOsEngineer.setPageId("ios");
        JOBS.add(iOsEngineer);

        Job fullStackJavaEngineer = new Job();
        fullStackJavaEngineer.setName("Full Stack Java Engineer");
        fullStackJavaEngineer.setPageId("java-full-stack");
        JOBS.add(fullStackJavaEngineer);

        Job javaEngineer = new Job();
        javaEngineer.setName("Java Engineer");
        javaEngineer.setPageId("java");
        JOBS.add(javaEngineer);

        Job nodeJsEngineer = new Job();
        nodeJsEngineer.setName("Node.js Engineer");
        nodeJsEngineer.setPageId("node");
        JOBS.add(nodeJsEngineer);

        Job qAEngineer = new Job();
        qAEngineer.setName("QA Engineer");
        qAEngineer.setPageId("qa");
        JOBS.add(qAEngineer);

        Job qAAutomationEngineer = new Job();
        qAAutomationEngineer.setName("QA Automation");
        qAAutomationEngineer.setPageId("qa-automation");
        JOBS.add(qAAutomationEngineer);

        Job rubyOnRailsEngineer = new Job();
        rubyOnRailsEngineer.setName("Ruby on Rails Engineer");
        rubyOnRailsEngineer.setPageId("ror");
        JOBS.add(rubyOnRailsEngineer);
    }

}
