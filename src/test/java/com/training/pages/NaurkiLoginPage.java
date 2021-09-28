package com.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.utils.TestBase;

public class NaurkiLoginPage {
	
	
	@FindBy(xpath = "//a[@id='login_Layer']/div[text()='Login']")
	public WebElement login;
	
	@FindBy(css= "input[placeholder='Enter your active Email ID / Username']")
	public WebElement username;
	
	@FindBy(css = "input[placeholder='Enter your password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	
	public void clickLogin() {
		TestBase tb= new TestBase();
		tb.waitForElementClick(login,10);
		login.click();
	}
	public void loginToNaukri() {
		username.sendKeys("javacampus.selenium@gmail.com");
		password.sendKeys("Testing@123");
		submit.click();
	}

}
