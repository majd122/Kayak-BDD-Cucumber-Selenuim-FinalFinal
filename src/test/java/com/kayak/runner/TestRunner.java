package com.kayak.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"com.kayak.stepdefinitions", "com.kayak.hooks"},
        plugin = {"pretty", "html:target/Kayak-report-final.html",
                "rerun:target/failed_scenarios.txt",
                "json:target/Kayak-report.json",
                "me.jvt.cucumber.report.PrettyReports:target/Kayak-report",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:target/test-output-thread/"
        },
       tags="@run",
        dryRun = false
)
public class TestRunner{
}
