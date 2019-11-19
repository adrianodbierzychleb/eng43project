package com.spartaglobal.eng43project.ProjectTests.SignUpTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty", "html:reports/report.html"},
        tags = {""},
        features = "classpath:features",
        glue = "com.spartaglobal.eng43project.StepDefs.SignUpStepDefs"
)

public class CucumberTestRunner
{ }
