package com.nearsoft.nearsoftjobs.data;

import com.nearsoft.nearsoftjobs.model.Job;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by epool on 7/14/16.
 */
public class JobData {

    public static final List<Job> JOBS = new ArrayList<Job>() {{
        Job androidEngineer = new Job();
        androidEngineer.setName("Android Engineer");
        androidEngineer.setPageId("android");
        add(androidEngineer);

        Job angularJsEngineer = new Job();
        angularJsEngineer.setName("AngularJS Engineer");
        angularJsEngineer.setPageId("angular");
        add(angularJsEngineer);

        Job fullStackFrontEndEngineer = new Job();
        fullStackFrontEndEngineer.setName("Full Stack Front End Engineer");
        fullStackFrontEndEngineer.setPageId("front-end-full-stack");
        add(fullStackFrontEndEngineer);

        Job iOsEngineer = new Job();
        iOsEngineer.setName("iOS Engineer");
        iOsEngineer.setPageId("ios");
        add(iOsEngineer);

        Job fullStackJavaEngineer = new Job();
        fullStackJavaEngineer.setName("Full Stack Java Engineer");
        fullStackJavaEngineer.setPageId("java-full-stack");
        add(fullStackJavaEngineer);

        Job javaEngineer = new Job();
        javaEngineer.setName("Java Engineer");
        javaEngineer.setPageId("java");
        add(javaEngineer);

        Job nodeJsEngineer = new Job();
        nodeJsEngineer.setName("Node.js Engineer");
        nodeJsEngineer.setPageId("node");
        add(nodeJsEngineer);

        Job qAEngineer = new Job();
        qAEngineer.setName("QA Engineer");
        qAEngineer.setPageId("qa");
        add(qAEngineer);

        Job qAAutomationEngineer = new Job();
        qAAutomationEngineer.setName("QA Automation");
        qAAutomationEngineer.setPageId("qa-automation");
        add(qAAutomationEngineer);

        Job rubyOnRailsEngineer = new Job();
        rubyOnRailsEngineer.setName("Ruby on Rails Engineer");
        rubyOnRailsEngineer.setPageId("ror");
        add(rubyOnRailsEngineer);
    }};

}
