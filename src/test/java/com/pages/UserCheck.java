package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCheck {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
	private WebElement admin;
	//username = 1234567, userrole = Admin, Emp Name = Peter Anderson, status= Enabled
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
	private WebElement Username;
	//*[@id="app"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
	private WebElement UserRole;
	
	public void clickAdmin() {
		admin.click();
		System.out.println("button clicked");
	}
	public UserCheck(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void userNameVal(String uName) {
		Username.sendKeys(uName);
	}
	public void sendValues(String uName, String uRole, String empName, String status) {
		
	}
}
