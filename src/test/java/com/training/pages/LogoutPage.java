package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.training.utils.TestBase;

public class LogoutPage extends TestBase {
	
	@FindBy(xpath = "//div[text()='My Naukri']")
	public WebElement myNaukri;

	@FindBy(xpath = "//a[@title='Logout']")
	public WebElement logout;

	
	public void logoutNaukriApp(WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(myNaukri).build().perform();
		waitForElementClick(logout, 10);
		
		logout.click();
		Thread.sleep(4000);
		
		Assert.assertEquals(driver.getTitle(),"Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com","page title not matched");
		
		
		
	}
	
}
