package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber-report.json"
        },
        features = "src/test/resources/features" ,
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@AC4"
)
public class CukesRunner {
}