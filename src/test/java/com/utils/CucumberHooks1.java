package com.utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks1 {

	static WebDriver driver;
	public String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    
	@Before
    public void beforeScenario() {
        System.out.println("=== Before Scenario: Initialize test data or environment ===");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
    }

    @After
    public void afterScenario() {
        System.out.println("=== After Scenario: Clean up test data or reset environment ===");
        driver.quit();
    }
}
