package com.utils;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",            
        glue = {"com.steps"},          
        plugin = {
                "pretty",                            
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" 
        },
        monochrome = true,                            
        tags="@ready"
)
public class CucumberRunner {
	
}

