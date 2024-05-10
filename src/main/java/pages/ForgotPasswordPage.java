package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	WebDriver driver;
	@FindBy(id="input-email")
	WebElement emailAddress;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueButton;
	@FindBy(xpath="//*[@id=\"account-login\"]/div[1]/text()")
	WebElement diaplayAnEmailWithConfirmationLinkHasBeenSentToYourEmailAddress;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement displayForgottenPasswordPageHeaderOption;
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	public void enterEmailAddress(String emailText) {
		emailAddress.sendKeys(emailText);
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public boolean getDisplayForgottenPasswordPageHeaderOption() {
		boolean displayStatus=displayForgottenPasswordPageHeaderOption.isDisplayed();
		return displayStatus;
	}
	
}
