package com.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
	features = "./src/test/resources",
	plugin = {
					"pretty", "html:target/htmltestreport.html"
			},
	tags="@ready"
)
public class CucumberRunner {
	

}
