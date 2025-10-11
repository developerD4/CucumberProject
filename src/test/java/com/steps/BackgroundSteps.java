package com.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class BackgroundSteps {
		@Given("a new user account is created")
		public void a_new_user_account_is_created() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("Account Created");
		}
	
		@Given("the user is on the login page")
		public void the_user_is_on_the_login_page() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("User on the login page");
		}
		
		@Given("the user is on valid login page")
		public void the_user_is_on_valid_login_page() {
		    System.out.println("valid logins");
		}

		@When("the user enters a valid username and password")
		public void the_user_enters_a_valid_username_and_password() {
		    
		}

		@Given("the user is on invalid login page")
		public void the_user_is_on_invalid_login_page() {
			System.out.println("invalid logins");
		}

		@When("the user enters a invalid username and password")
		public void the_user_enters_a_invalid_username_and_password() {
		    
		}
}
