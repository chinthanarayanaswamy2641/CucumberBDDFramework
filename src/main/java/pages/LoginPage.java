package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(id="input-email")
		private WebElement emailAddressField;
		@FindBy(id="input-password")	
	private WebElement passwordAddressField;
		
		@FindBy(xpath="//input[@value='Login']")	
		private WebElement logginButton;
	
		@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
		private WebElement emaiPasswordNotMatchingWarning;
		
		@FindBy(linkText="Forgotten Password")
		WebElement forgotPassword;
		
		@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
		WebElement emailWithAConfirmationLink;
		
		@FindBy(xpath="//*[@id=\"account-login\"]/div[1]")
		WebElement emailNotMacth;
		
			
		
		@FindBy(linkText="Continue")
		WebElement continueButton;
		
		@FindBy(linkText="Login")
		WebElement login;
		
		@FindBy(xpath="//*[@id=\"content\"]/h2[1]")
		WebElement WarningLoginWithNewEmailAddres;
		
		@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/h2")
		WebElement returningCustomer;
		
		@FindBy(linkText="Register")
		WebElement clickOnRegisterOnRightColumnOptions;
		
		@FindBy(xpath="//*[@id=\"account-login\"]/div[1]/i")
		WebElement diaplayAnEmailWithConfirmationLinkHasBeenSentToYourEmailAddress;
		
		@FindBy(xpath="//*[@id=\"account-login\"]/div[1]/i")
		WebElement displayWarningYourAccountHasExceededAlloweNumberOfLoginAttempts;
		
		@FindBy(linkText="Qafox.com")
		WebElement headingPage;
		
		 public LoginPage(WebDriver driver) {
			 this.driver=driver;
			 PageFactory.initElements(driver, this);
		 }
		 public AccountPage enterEmailAddress(String emailText) {
			 emailAddressField.sendKeys(emailText);
			return new AccountPage(driver);
		 }
		 public void enterEmailAddress() {
			 emailAddressField.clear();
		 }
		 
		 
		 
		 public void enterPasswordlAddress(String passwordText) {
			 passwordAddressField.sendKeys(passwordText);
		 }
		 
		 public void enterPasswordlAddress() {
			 passwordAddressField.clear();
		 }
		 
		 public AccountPage clickOnLoginButton() {
			 logginButton.click();
			 return new AccountPage(driver);
		 }
		 public String retrieveEmailPasswordNotMatchingWarningMessageText() {
				String warningText=emaiPasswordNotMatchingWarning.getText();
			return warningText;
			}
		 
		 public ForgotPasswordPage clickOnForgotPassword() {
				forgotPassword.click();
				return new ForgotPasswordPage(driver);
			}
		
		 public String getDisplayStatusOfEmailWithAConfirmationLink() {
				String displayStatus=emailWithAConfirmationLink.getText();
				return displayStatus;
			}
		 public WebElement enterEmailText() {
			return  emailAddressField;
			
		 }
		 public WebElement enterPasswordText() {
				return  passwordAddressField;
				
			 }
		 
		 public WebElement clickOnLoggin() {
			 return logginButton;
		 }
		 
		 public boolean getDisplayNoMatchEmai() {
			boolean status= emailNotMacth.isDisplayed();
			return status;
		 }
		 
		 public RegisterPage clickOnContinueButton() {
			 continueButton.click();
			return new RegisterPage(driver);
		 }
		 
		 public boolean getDisplayBreadCrumbOfLogin() {
			boolean status= login.isDisplayed();
			return status;
		 }
		 
		 public boolean userAbleToLoginWithNewEmailWarningText() {
			boolean status= WarningLoginWithNewEmailAddres.isDisplayed();
			return status;
		 }
		
		 public boolean getDisplayReturningCustomer() {
				boolean displayStatus=returningCustomer.isDisplayed();
				return displayStatus;
			}
		 public void clickOnRegisterOnRightColumnOptions() {
				clickOnRegisterOnRightColumnOptions.click();
			}
		 public boolean getDisplayContinueButton() {
			 boolean displayStatus=continueButton.isDisplayed();
			 return displayStatus;
		 }
		 public boolean getDiaplayAnEmailWithConfirmationLinkHasBeenSentToYourEmailAddress() {
				boolean displayStatus=diaplayAnEmailWithConfirmationLinkHasBeenSentToYourEmailAddress.isDisplayed();
				return displayStatus;
			}
		 public boolean getDisplayWarningYourAccountHasExceededAlloweNumberOfLoginAttempts() {
			 boolean displayStatus=displayWarningYourAccountHasExceededAlloweNumberOfLoginAttempts.isDisplayed();
			 return displayStatus;
		 }
		 public boolean getDisplayEmailPasswordNotMatchingWarning() {
			 boolean displayStatus=emaiPasswordNotMatchingWarning.isDisplayed();
			 return displayStatus;
		 }
		 public boolean getDisplayHeadingPage() {
			 boolean displayStatus=headingPage.isDisplayed();
			 return displayStatus;
		 }
		 public boolean getDisplayUiOfTheInputEmail() {
			 boolean displayStatus=emailAddressField.isDisplayed();
			return displayStatus;
		 }
		 public boolean getDisplayUIOfThePassword() {
			 boolean displayStatus=passwordAddressField.isDisplayed();
			return displayStatus;
		 }
		public boolean getDisplayUIOfTheLogin() {
			boolean displayStatus=logginButton.isDisplayed();
			return displayStatus;
			
		}
}
