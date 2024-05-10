package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement registerAccount;
	
	@FindBy(linkText="login page")
	WebElement loginPage;
	

	@FindBy(linkText="Login")
	WebElement login;
	
	@FindBy(linkText="Address Book")
	WebElement clickOnAddressBook;
	
	@FindBy(id="input-email")
	WebElement emailField;
	
	@FindBy(id="input-password")
	WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginButton;
	
	@FindBy(id="input-firstname")
	WebElement firstName;
	
	 @FindBy(id="input-lastname")
	WebElement lastName;
	 
	 @FindBy(id="input-email")
	 WebElement inputEmail;
	 
	 @FindBy(id="input-telephone")
	 WebElement inputTelephone;
	 
	 @FindBy(id="input-password")
	 WebElement inputPassword;
	 
	 @FindBy(id="input-confirm")
	 WebElement inputConfirmPassword;
	 
	 @FindBy(name="agree")
	 WebElement agree;
	 
	 @FindBy(xpath="//input[@value='Continue']")
	 WebElement Continue;
	
	 @FindBy(xpath="//input[@name='newsletter' and @value='1']")
	 WebElement clickOnYesNewsLetterOption;
	 
	 @FindBy(xpath="//input[@name='newsletter' and @value='0']")
	 WebElement clickOnNoNewsLetterButton;
	 
	 @FindBy(linkText="Order History")
	 WebElement clickOnOrderHistoryFromRegisterPage;
	 
	 @FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	 WebElement warningYouMustAgreeToPrivacyPolicy;
	 
	@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
	WebElement firstNamewarning;
	
	@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
	WebElement lastNameWarning;
	
	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	WebElement emailWarning;
	
	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	WebElement telephoneWarning;
	
	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	WebElement inputPasswordWarning;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement displsyRegisterAccount;
	 
	@FindBy(xpath="//input[@id='input-confirm']/following::div")
	WebElement warningInputConfirmPassword;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	WebElement warningEmailAddressIsAlreadyExisted;
	
	@FindBy(xpath="//*[@id=\"account\"]/div[4]/div/div")
	WebElement EmailAddressDoesNotAppearToBeValid;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement displayRegisterAccountPage;
	
	@FindBy(linkText="Reward Points")
	WebElement clickOnRewardPoints;
	
	@FindBy(linkText="Transactions")
	WebElement selectTransactionOptionsFromRightColumn;
	
	@FindBy(linkText="Downloads")
	WebElement clickOnDownloadsRightColumnOptions;
	
	@FindBy(linkText="Register")
	WebElement displayBreadCrumbOfRegsiterPage;
	
	
		public RegisterPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	
	public boolean getDisplayYourAccountHasBeenCreated() {
		boolean status=registerAccount.isDisplayed();
		return status;
	}
	
	public void clickOnLoginPage() {
		loginPage.click();
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public void clickOnAddressBook() {
		clickOnAddressBook.click();
	}
	
	public void clickOnEmailField(String email) {
		emailField.sendKeys(email);
	}
	public void clickOnPasswordField(String password) {
		passwordField.sendKeys(password);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public void enterFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	public void enterInputEmail(String email) {
		inputEmail.sendKeys(email);
	}
	public void enterInputTelephone(String telephone) {
		inputTelephone.sendKeys(telephone);
	}
	public void enterInputPassword(String password) {
		inputPassword.sendKeys(password);
	}
	public void enterInputConfirmPassword(String confirmpassword) {
		inputConfirmPassword.sendKeys(confirmpassword);
	}
	public void clickOnAgreeButton() {
		agree.click();
	}
	public void clickOnContinueButton() {
		Continue.click();
	}
	public void clickOnYesNewsLetterOption() {
		clickOnYesNewsLetterOption.click();
	}
	public void clickOnNoNewsLetterOption() {
		clickOnNoNewsLetterButton.click();
	}
	public void clickOnOrderHistoryFromRegisterRightColumnOptions() {
		clickOnOrderHistoryFromRegisterPage.click();
	}
	public boolean getDisplayYouMustAgreeToPrivacyPolicy() {
		boolean displaySatus=warningYouMustAgreeToPrivacyPolicy.isDisplayed();
		return displaySatus;
	}
	public boolean getDisplayFirstNameWarning() {
		boolean displayStatus=firstNamewarning.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplayLastNameWarning() {
		boolean displayStatus=lastNameWarning.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplayEmailWarning() {
		boolean displayStatus=emailWarning.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplayTelephoneWarning() {
		boolean displayStatus=telephoneWarning.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplayInputPasswordWarning() {
		boolean displayStatus=inputPasswordWarning.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplayRegisterAccount() {
		boolean displayStatus=displsyRegisterAccount.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplayWarningInputConfirmPassword() {
		boolean displayStatus=warningInputConfirmPassword.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplayWarningEmailAddressIsAlreadyExisted() {
		boolean displayStatus=warningEmailAddressIsAlreadyExisted.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplayEmailAddressDoesNotAppearToBeValid() {
		boolean displayStatus=EmailAddressDoesNotAppearToBeValid.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplaydiRegisterAccountPage() {
		boolean displayStatus=displayRegisterAccountPage.isDisplayed();
		return displayStatus;
	}
	public void clickOnRewardPoints() {
		clickOnRewardPoints.click();
	}
	public void selectTransactionOptionsFromRightColumn() {
		selectTransactionOptionsFromRightColumn.click();
	}
	public void clickOnDownloadsRightColumnOptions() {
		clickOnDownloadsRightColumnOptions.click();
	}
	public boolean getDisplayBreadCrumbOfRegsiterPage() {
		boolean displayStaus=displayBreadCrumbOfRegsiterPage.isDisplayed();
		return displayStaus;
	}
	
	
}
