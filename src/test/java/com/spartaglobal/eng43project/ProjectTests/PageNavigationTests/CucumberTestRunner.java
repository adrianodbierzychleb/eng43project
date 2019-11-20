package com.spartaglobal.eng43project.ProjectTests.PageNavigationTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty"},
       // tags = {"@ads"},
        features = "classpath:features/pageNavigationFeatures/ads.feature",
        glue = "com.spartaglobal.eng43project.StepDefs.PageNavigationStepDefs.AdsStepDefs"
)

public class CucumberTestRunner
{ }
