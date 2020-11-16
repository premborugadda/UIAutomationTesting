package testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SignUpPage;
import utilities.BrowserSetup;

public class TestCases extends BrowserSetup{
	
	
		String url = "https://www.carbonite.com/backup-software/safe-personal-trial";
		SignUpPage signup;
		BrowserSetup browser;		
		
		@Test
		// test case 1
		public void verifySignUpPageDisplay() throws InterruptedException, IOException {
			browser = new BrowserSetup();
			BrowserSetup.openBrowser(url);
			
			signup = new SignUpPage(webDriver);
			
			Assert.assertTrue(signup.isSignupDisplayed(), "Signup page is Not Displayed");
			browser.closeDriver();
			
		}
		
		@Test
		// test case 3
		public void verifyDetailsEntered() throws InterruptedException, IOException {
			browser = new BrowserSetup();
			BrowserSetup.openBrowser(url);
			
			signup = new SignUpPage(webDriver);
			
			signup.clickSubmitButton();			
			Assert.assertTrue(signup.isEmailRequiredDisplayed(), "Email required error is Not Displayed");
			browser.closeDriver();
			
		}

		@Test
		// test case 6
		public void verifyPrivacyPolicyPage() throws InterruptedException, IOException {
			browser = new BrowserSetup();
			BrowserSetup.openBrowser(url);
			
			signup = new SignUpPage(webDriver);
			
			signup.clickPrivacyLink();	
			Assert.assertTrue(signup.isPrivacyPageDisplayed(), "Privacy Page is Not Displayed");
			browser.closeDriver();
			
		}
		
		@Test
		// test case 7
		public void EnterInvalidEmail() throws InterruptedException, IOException {
			browser = new BrowserSetup();
			BrowserSetup.openBrowser(url);
			
			signup = new SignUpPage(webDriver);
			
			signup.enterEmailID("test");	
			Assert.assertTrue(signup.isInvalidEmail(), "Must be valid email is Not Displayed");
			browser.closeDriver();
			
		}
		
		
}


