package com.steps;

import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;
import com.utils.TestBase;

//import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;

public class LoginSteps {

		WebDriver driver = TestBase.getDriver();
		public String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    
		@Given("the user is on the OrangeHRM login page")
		@Step("Navigate to OrangeHRM login page")
		public void the_user_is_on_the_orange_hrm_login_page() {
			System.out.println("Login Page");
		}	

		@When("the user enters a valid username {string} and password {string}")
		@Step("Enter username: {0} and password: {1}")
		public void the_user_enters_a_valid_username_and_password(String username, String password) {
		System.out.println(username + " " + password);
		LoginPage lp = new LoginPage(driver);
		driver.get(baseURL);
		lp.loginCre(username, password);
		}
		

		@Then("the user should be redirected to the OrangeHRM dashboard with {string}")
		@Step("Verify dashboard welcome message: {0}")
		public void the_user_should_be_redirected_to_the_orange_hrm_dashboard(String Welcome) {
		    System.out.println("The user on OrangeHRM dashboard with " + Welcome);
		}
}














//@Given("the user is on the OrangeHRM login page")
//public void the_user_is_on_the_orange_hrm_login_page(DataTable datatable) {
//    System.out.println(datatable);
//    
//    System.out.println(datatable.asMaps());
//	System.out.println("Login Page");
//}