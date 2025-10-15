package com.test;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks1 {

	public static WebDriver driver;
    
	@Before
    public void beforeScenario() {
      System.out.println("=== Before Scenario: Initialize test data or environment ===");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void afterScenario() {
        System.out.println("=== After Scenario: Clean up test data or reset environment ===");
        driver.quit();
    }
    
	public static WebDriver getDriver() {
		return driver;
	}
}
