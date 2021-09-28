package com.training.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.pages.LogoutPage;
import com.training.pages.NaurkiLoginPage;
import com.training.pages.ProfilePage;
import com.training.utils.TestBase;

public class NaukriTest extends TestBase {

	@Test
	@Parameters({"appURL","browser"})
	public void launchApplication(String appURL,String browser) {
		openApplication(appURL, browser);
	}
	
	@Test(dependsOnMethods = "launchApplication")
	public void loginToNaukriApp() {
		NaurkiLoginPage np=PageFactory.initElements(driver, NaurkiLoginPage.class);
		np.clickLogin();
		np.loginToNaukri();
	}
	
	
	@Test(dependsOnMethods = "loginToNaukriApp")
	public void updateProfile() {
		ProfilePage pp=PageFactory.initElements(driver, ProfilePage.class);
		pp.clickUpdateProfileButton();
		pp.updateProfile(driver);
	}
	
	@Test(dependsOnMethods = "updateProfile")
	public void logoutApp() throws Exception {
		LogoutPage lp=PageFactory.initElements(driver, LogoutPage.class);
		lp.logoutNaukriApp(driver);
	}
	
	
	
	
	
}
