package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	WebDriver driver;
	@FindBy(linkText="Edit your account information")
		WebElement editYourAccountInformationOption;

	@FindBy(linkText="Logout")
	WebElement logoutUnderMyAccountDropMenu;
	
	 @FindBy(linkText="Change your password")
	  WebElement changeYourPassword;
	 
	 @FindBy(linkText="Modify your address book entries")
	 WebElement modifyYourAddress;
	 
	 @FindBy(linkText="Address Book")
	 WebElement AddressBook;
	 
	 @FindBy(linkText="Site Map")
	 WebElement siteMap;
	 
	 @FindBy(linkText="Logout")
	 WebElement logout;
	 
	 @FindBy(linkText="Edit Account")
	 WebElement editaccount;
	
	 @FindBy(xpath="//*[@id=\"content\"]/h2[1]")
	 WebElement myaccount;
	 
	 @FindBy(linkText="My Account")
	 WebElement myAccount;
	 
	 @FindBy(xpath="//*[@id=\"account-account\"]/div[1]")
		WebElement newsLetterSubscriptionOptionSuccessMessage;
	 
	 @FindBy(linkText="Order History")
	 WebElement clickOnOrderHistory;
	 
	 @FindBy(linkText="View your order history")
	 WebElement viewYourOrderHistory;
	 
	 @FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	 WebElement clickOnMyAccountDropMenu;
	 
	 @FindBy(linkText="Order History")
	 WebElement clickOnOrderHistoryRightColumnOptions;
	 
	 @FindBy(linkText="Site Map")
	 WebElement clickOnSiteMap;
	 
	 @FindBy(xpath="//input[@name='search']")
	 WebElement enterSearchFunctionality;
	 
	 @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	 WebElement clickOnSearchButton;
	 
	 @FindBy(linkText="Recurring payments")
	 WebElement recurringPaymentsLink;
	 
	 @FindBy(linkText="Recurring payments")
	 WebElement rightColumnRecurringPaymentsLink;
	 
	 @FindBy(linkText="Subscribe / unsubscribe to newsletter")
	 WebElement subscribeOrUnsubscribeLInk;
	 
	 @FindBy(linkText="Your Reward Points")
	 WebElement yourRewardPoints;
	 
	 @FindBy(linkText="Reward Points")
	 WebElement RightColumnOption;
	 
	 @FindBy(linkText="Your Transactions")
	 WebElement clickOnYourTransactions;
	 
	 @FindBy(linkText="Transactions")
	 WebElement selectTransactionOptionFromRightColumn;
	 
	 @FindBy(linkText="Show AllDesktops")
	 WebElement clickOnShowAllDesktops;
	 
	 @FindBy(linkText="Wish List")
	 WebElement clickOnWishListFromTheRightColumnOptions;
	 
	 @FindBy(linkText="Modify your wish list")
	 WebElement clickOnModifyYourWishList;
	 
	 @FindBy(linkText="Wish List")
	 WebElement clickOnWishListOptionFromTheFooter;
	 
	 @FindBy(xpath="//*[@id=\"wishlist-total\"]/i")
	 WebElement clickOnWishListHeaderOption;
	 
	 @FindBy(linkText="Password")
	 WebElement clickOnPasswordRightColumnOptions;
	 
	 @FindBy(xpath="//*[@id=\"account-account\"]/div[1]")
	 WebElement displaySuccessYourPasswordHasBeenSuccessfullyUpdated;
	 
	 @FindBy(linkText="Contact Us")
	 WebElement clickOnContactUs;
	 
	 @FindBy(linkText="Downloads")
	 WebElement clickOnDownloads;
	 
	 @FindBy(linkText="Downloads")
	 WebElement clickOnDownloadsOnAccountDropMenu;
	 
	 @FindBy(linkText="Downloads")
	 WebElement clickOnDownloadsOnRightColumnOptions;
	 
	 @FindBy(linkText="Gift Certificates")
	 WebElement clickOnGiftCertificates;
	 
	 @FindBy(linkText="Brands")
	 WebElement clickOnBrands;
	 
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public boolean getDisplayStatusOfEditYourAccountInformation() {
		boolean displayStatus=editYourAccountInformationOption.isDisplayed();
	return displayStatus;
	}
	
	
	public void clickOnChangeYourPassword() {
		changeYourPassword.click();
	}
	
	public void clickOnModifyYourAddressBookEntirePage() {
		modifyYourAddress.click();
	}
	
	public void clickOnAddressBook() {
		AddressBook.click();
	}
	
	public void clickOnSiteMap() {
		siteMap.click();
	}
	public void clickOnLogout() {
		logout.click();
	}
	public void clickOnEditAccount() {
		editaccount.click();
	}
	public void clickOnEditYourAccountInformationPage() {
		editYourAccountInformationOption.click();
	}
	public String getDisplayStatusOfMyAccount() {
		String status=myaccount.getText();
		return status;
	}
	public void clickOnMyAccount() {
		myAccount.click();
	}
	public boolean getDisplayNewsLetterSubscriptionSuccessMessage() {
		boolean displayStatus=newsLetterSubscriptionOptionSuccessMessage.isDisplayed();
		return displayStatus;
	}
	public void clickOnOrderHistory() {
		clickOnOrderHistory.click();
	}
	
	public void clickOnViewYourOrderHistory() {
		viewYourOrderHistory.click();
	}
	public void clickOnMyAccountDropMenu() {
		clickOnMyAccountDropMenu.click();
	}
	public void clickOnOrderHistoryFromRightColumnOptions() {
		clickOnOrderHistoryRightColumnOptions.click();
	}
	public void clickOnSiteMapFromFooterOption() {
		clickOnSiteMap.click();
	}
	public void enterSearchFunctionality(String product) {
		enterSearchFunctionality.sendKeys(product);
	}
	public void clickOnSearchButton() {
		clickOnSearchButton.click();
	}
	public void clickOnRecurringPaymentsLink() {
		recurringPaymentsLink.click();
	}
	public void clickOnRightColumnRecurringPaymentsLink() {
		rightColumnRecurringPaymentsLink.click();
	}
	public void clickOnSubscribeOrUnsubscribeLInk() {
		subscribeOrUnsubscribeLInk.click();
	}
	public void clickOnYourRewardPoints() {
		yourRewardPoints.click();
	}
	public void clickOnRewardPointRightColumnOption() {
		RightColumnOption.click();
	}
	public void clickOnYourTransactions() {
		clickOnYourTransactions.click();
	}
	public void selectTransactionOptionFromRightColumn() {
		selectTransactionOptionFromRightColumn.click();
	}
	public void clickOnShowAllDesktops() {
		clickOnShowAllDesktops.click();
	}
	public void clickOnWishListFromTheRightColumnOptions() {
		clickOnWishListFromTheRightColumnOptions.click();
	}
	public void clickOnModifyYourWishList() {
		clickOnModifyYourWishList.click();
	}
	public void clickOnWishListOptionFromTheFooter() {
		clickOnWishListOptionFromTheFooter.click();
	}
	public void clearEnterSearchFunctionality() {
		enterSearchFunctionality.clear();
	}
	public void clickOnWishListHeaderOption() {
		clickOnWishListHeaderOption.click();
	}
	public void clickOnPasswordRightColumnOptions() {
		clickOnPasswordRightColumnOptions.click();
	}
	public boolean getDisplaySuccessYourPasswordHasBeenSuccessfullyUpdated() {
		boolean displayStatus=displaySuccessYourPasswordHasBeenSuccessfullyUpdated.isDisplayed();
		return displayStatus;
	}
	public void clickOnContactUs() {
		clickOnContactUs.click();
	}
	public void clickOnDownloads() {
		clickOnDownloads.click();
	}
	public void clickOnDownloadsOnMyAccountDropMenu() {
		clickOnDownloadsOnAccountDropMenu.click();
	}
	public void clickOnDownloadsOnRightColumnOptions() {
		clickOnDownloadsOnRightColumnOptions.click();
	}
	public void clickOnGiftCertificates() {
		clickOnGiftCertificates.click();
	}
	public void clickOnBrands() {
		clickOnBrands.click();
	}
	public void clickOnlogoutUnderMyAccountDropMenu() {
		logoutUnderMyAccountDropMenu.click();
	}
}
