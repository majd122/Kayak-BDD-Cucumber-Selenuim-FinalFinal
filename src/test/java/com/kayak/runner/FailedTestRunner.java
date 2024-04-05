package com.kayak.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"@target/failed_scenarios.txt"},// path for failed sce
        glue = {"com.kayak.stepdefinitions","com.kayak.hooks"}
)
public class FailedTestRunner {
}
