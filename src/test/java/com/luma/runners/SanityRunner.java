package com.luma.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/luma",
        tags = " @sanity",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)

public class SanityRunner {
}
