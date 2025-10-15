//package com.utils;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//public class TestBase {
//	private static WebDriver driver;
//	public String baseURL = ReadConfig.readPropertyFileData("baseUrl", "config");
//	public String username = ReadConfig.readPropertyFileData("userName", "config");
//	public String password = ReadConfig.readPropertyFileData("password", "config");
//	
//    @Before
//    public void setUp() {
//        System.out.println(">>> Launching browser and navigating to OrangeHRM...");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        driver = new ChromeDriver(options);
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    }
//
//    @After
//    public void tearDown() {
//        System.out.println(">>> Closing browser...");
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
//
//    public static WebDriver getDriver() {
//        return driver;
//    }
//}
