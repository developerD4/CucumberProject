package com.utils;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

//@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
	features = "./src/test/resources",
	glue = "com.steps",
	plugin = {	
					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
					"pretty", "html:target/htmltestreport.html"	
			},
	tags="@ready"
)
public class CucumberRunner {
	

}
