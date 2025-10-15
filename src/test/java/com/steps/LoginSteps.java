package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;
import com.test.CucumberHooks1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    WebDriver driver;
    LoginPage lp;

    @Given("the user is on the OrangeHRM login page")
    public void the_user_is_on_the_orange_hrm_login_page() { 
    	driver = new ChromeDriver();
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        lp = new LoginPage(driver);           
        System.out.println(lp.siteTitle());
        System.out.println("Login Page Title displayed");
    }

    @When("the user enters a valid username {string} and password {string}")
    public void the_user_enters_a_valid_username_and_password(String username, String password) {
        lp.loginCre(username, password);
        System.out.println("Login performed with " + username);
    }

    @Then("the user should be redirected to the OrangeHRM dashboard with {string}")
    public void the_user_should_be_redirected_to_the_orange_hrm_dashboard(String welcomeMsg) {
        // You can add verification step here
        System.out.println("User on Dashboard: " + welcomeMsg);
    }
}















//@Given("the user is on the OrangeHRM login page")
//public void the_user_is_on_the_orange_hrm_login_page(DataTable datatable) {
//    System.out.println(datatable);
//    
//    System.out.println(datatable.asMaps());
//	System.out.println("Login Page");
//}