package com.pages;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(name = "username")
	public WebElement usernameId;
	
	@FindBy(name = "password")
	public WebElement passwordId;
	
	@FindBy(tagName="button")
	public WebElement loginBtn;	
	
	public void setName(String user) {
		wait.until(ExpectedConditions.visibilityOf(usernameId));
        usernameId.clear();
		usernameId.sendKeys(user);
	}
	public void setPassword(String passw) {
		wait.until(ExpectedConditions.visibilityOf(passwordId));
        passwordId.clear();
		passwordId.sendKeys(passw);
	}
	public void loginButton() {
		loginBtn.click();
	}

	public void loginCre(String username, String password) {
		setName(username);
		setPassword(password);
	}
}

//WebElement usernameId = driver.findElement(By.name("username"));
//usernameId.sendKeys(username);
//WebElement passwordId = driver.findElement(By.name("password"));
//passwordId.sendKeys(password);
//driver.findElement(By.tagName("button")).click();
