package com.training.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.training.utils.TestBase;

/**
 * Class for Profile page locators and methods
 * 
 * @author Chinna.Putha
 *
 */
public class ProfilePage {

	TestBase tb= new TestBase();

	@FindBy(xpath = "//div[@class='updateProfile']/descendant::div[text()='UPDATE PROFILE']")
	public WebElement updateProfile;

	@FindBy(xpath = "//em[@class='icon edit']")
	public WebElement profileEditIcon;

	@FindBy(xpath = "//button[@id='saveBasicDetailsBtn']")
	public WebElement saveButton;
	
	@FindBy(xpath = "(//div[@class='profilePage'])/div/div[2]/descendant::span")
	public List<WebElement> profileUpdation;
	
	

	/**
	 * Method to click on Upadate profile button
	 */
	public void clickUpdateProfileButton() {
		updateProfile.click();
		tb.waitForElementClick(profileEditIcon, 10);
	}

	public void updateProfile(WebDriver driver) {
		profileEditIcon.click();
		tb.waitForElementClick(saveButton, 10);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveButton);
		//saveButton.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);
		System.out.println("total elemetns-->" + profileUpdation.size());

		System.out.println("profile info-->" + profileUpdation.get(0).getText());
		System.out.println("profile info2-->" + profileUpdation.get(1).getText());
		
		Assert.assertEquals(profileUpdation.get(1).getText(), "today", "Profile not updated today");
	}

}
