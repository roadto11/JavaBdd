package com.demo.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			format = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"},
			features = "src/test/resources",
			tags = {"@Scenario2"}		
		)
public class RunnerTest {

}
