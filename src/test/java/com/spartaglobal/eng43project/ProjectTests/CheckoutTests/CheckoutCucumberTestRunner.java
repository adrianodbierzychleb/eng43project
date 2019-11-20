package com.spartaglobal.eng43project.ProjectTests.CheckoutTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty", "html:reports/report.html"},
        tags = {""},
        features = "classpath:features/checkoutFeatures",
        glue = "com.spartaglobal.eng43project.StepDefs.CheckoutStepDefs"
)

public class CheckoutCucumberTestRunner
{ }

