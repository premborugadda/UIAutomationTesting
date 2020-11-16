package pageObjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BrowserSetup;

public class SignUpPage extends BrowserSetup{
	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h3[contains(text(),'Signup')]")
	WebElement SignupText;
	
	@FindBy(xpath = "//span[contains(text(),'Must be valid email')]")
	WebElement InvalidEmail;
	
	@FindBy(name = "Email")
	WebElement EmailTextBox;
	
	@FindBy(name = "confirmEmail")
	WebElement ConfirmEmailTextBox;
	
	@FindBy(name = "Password")
	WebElement PasswordTextBox;
	
	@FindBy(name = "ConfirmPassword")
	WebElement ConfirmPasswordTextBox;
	
	@FindBy(name = "Country")
	WebElement CountryList;
	
	//@FindBy(xpath = "//input[@type='submit']")
	@FindBy(xpath = "//input[@class='button sm-btn green-btn']")
	WebElement SubmitButton;
	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	WebElement PrivacyLink;
	
	@FindBy(xpath = "//span[contains(text(),'The email field is required.')]")
	WebElement EmailRequired;
	
	@FindBy(xpath = "//h1[contains(text(),'Privacy Policy')]")
	WebElement PrivacyPolicyPage;
	
	public boolean isSignupDisplayed() {

		try {
			if (new WebDriverWait(webDriver, 1000, 15000).until(ExpectedConditions.visibilityOf(this.SignupText))
					.isDisplayed()) {
				System.out.println("Singup Page Is Visible");
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean isSubmitButtonDisplayed() {

		try {
			if (new WebDriverWait(webDriver, 1000, 15000).until(ExpectedConditions.visibilityOf(this.SubmitButton))
					.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public void clickSubmitButton() throws InterruptedException {

		if (isSubmitButtonDisplayed()) {			
			Thread.sleep(2000);
			JavascriptExecutor executor = (JavascriptExecutor)webDriver;
			executor.executeScript("arguments[0].click();", SubmitButton);
		}

	}
	
	public boolean isEmailRequiredDisplayed() {
		
		try {
			if (new WebDriverWait(webDriver, 1000, 15000).until(ExpectedConditions.visibilityOf(this.EmailRequired))
					.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean isPrivacyLinkDisplayed() {
		
		try {
			if (new WebDriverWait(webDriver, 1000, 15000).until(ExpectedConditions.visibilityOf(this.PrivacyLink))
					.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
		
	}
	
	public void clickPrivacyLink() throws InterruptedException {
		
		if (isPrivacyLinkDisplayed()) {
			Thread.sleep(2000);
			JavascriptExecutor executor = (JavascriptExecutor)webDriver;
			executor.executeScript("arguments[0].click();", PrivacyLink);
		}
	}
	
	
	public boolean isPrivacyPageDisplayed() {
		
		try {
			if (new WebDriverWait(webDriver, 1000, 15000).until(ExpectedConditions.visibilityOf(this.PrivacyPolicyPage))
					.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
		
	}
	
	public boolean isEmailIDDisplayed() {
		
		try {
			if (new WebDriverWait(webDriver, 1000, 15000).until(ExpectedConditions.visibilityOf(this.EmailTextBox))
					.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
		
	}

	public void enterEmailID(String email) {
		
		if (isEmailIDDisplayed()) {
			this.EmailTextBox.sendKeys(email);
		}
	}
	
	public boolean isInvalidEmail() {
		
		try {
			if (new WebDriverWait(webDriver, 1000, 15000).until(ExpectedConditions.visibilityOf(this.InvalidEmail))
					.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
		
	}
	
}


