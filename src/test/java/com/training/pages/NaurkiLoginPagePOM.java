package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.objectmap.NaukriLocators;
import com.training.utils.TestBase;
/**
 * Class to perform POM using normal approch
 * @author Chinna.Putha
 *
 */
public class NaurkiLoginPagePOM {
	
	WebDriver driver;
	
	public NaurkiLoginPagePOM(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clickLogin() {
		TestBase tb= new TestBase();
		tb.waitForElementClick(NaukriLocators.NARUKRI_HOME_XPATH,10);
		driver.findElement(By.xpath(NaukriLocators.NARUKRI_HOME_XPATH)).click();
	}
	public void loginToNaukri() {
		driver.findElement(By.cssSelector(NaukriLocators.NAURKRI_LOGIN_USERNAME_CSS)).sendKeys("javacampus.selenium@gmail.com");
		driver.findElement(By.cssSelector(NaukriLocators.NAURKRI_LOGIN_PWD_CSS)).sendKeys("Testing@123");
		driver.findElement(By.xpath(NaukriLocators.NAURKRI_LOGIN_XPATH)).click();
	}

}
