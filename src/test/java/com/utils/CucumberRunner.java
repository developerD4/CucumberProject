package com.utils;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

//@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
	features = "./src/test/resources",
	glue = { "com.steps", "com.utils"},
	plugin = {	
					
					"pretty",
					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
			},
	tags="@ready"
)
public class CucumberRunner {
	

}
