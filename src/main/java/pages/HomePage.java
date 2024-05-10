package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
	
	//objects
@FindBy(linkText="My Account")
private WebElement myAccountDropMenu;
 @FindBy(linkText="Login")
 private WebElement loginOption;
 

	 @FindBy(linkText="Logout")
	 private WebElement logoutOption;
	 
	 @FindBy(xpath="//*[@id=\"account-login\"]/ul")
	 WebElement breadCrumb;
	 
 @FindBy(tagName="h1")
	 WebElement headingPage;

 
 @FindBy(linkText="Register")
 WebElement register;
 
 @FindBy(name="search")
 WebElement Search;
 
 @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
 WebElement searchButton;
 
 @FindBy(linkText="Show AllDesktops")
 WebElement clickOnShowAllDesktops;
 
 @FindBy(xpath="//button[@data-original-title='Compare this Product'][1]")
 WebElement compareThisProductInFeaturedSection;
 
 @FindBy(xpath="//div[contains(@class,alert-dismissible)]/i")
 WebElement successYouHaveAddedProductToYourProductComparision;
 
 @FindBy(linkText="product comparison")
 WebElement clickOnProductComparisionLinkInHomePageSuccessMessage;
 
 @FindBy(linkText="Site Map")
 WebElement clickOnSiteMapLinkInFooterOption;
 
 @FindBy(xpath="//*[@id=\"cart\"]/button/i")
 WebElement CartButton;

 @FindBy(xpath="//*[@id=\"cart\"]/ul/li/p")
 WebElement YourShopplingCartIsEmpty;
 
 @FindBy(xpath="//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong/i")
 WebElement viewCart;
 
 @FindBy(linkText="Specials")
 WebElement clickOnSpecialsOnFooterOptions;
 
 @FindBy(id="wishlist-total")
 WebElement WishListInHeaderOption;
 
 @FindBy(xpath="//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]")
 WebElement clickOnAddToCartOnMacbook;
 
 @FindBy(xpath="//*[@id=\"common-home\"]/div[1]")
 WebElement displaySuccessYouHaveAddedProductToShoppingCart;
 
 @FindBy(linkText="shopping cart")
 WebElement clickOnShoppingCartLinkInSuccessMessage;
 
 @FindBy(linkText="Checkout")
 WebElement clickOnCheckOutHeaderOption;
 
 @FindBy(linkText="Contact Us")
 WebElement clickOnContactUsLinkInFooterOptions;
 
 @FindBy(id="form-currency")
 WebElement clickOnCurrency;
 
 @FindBy(name="EUR")
 WebElement clickOnEuro;
 
 @FindBy(xpath="//*[@id=\"form-currency\"]/div/button/strong")
 WebElement displayEuroDollar;
 
 @FindBy(name="GBP")
 WebElement clickOnPoundSterling;
 
 @FindBy(xpath="//*[@id=\"form-currency\"]/div/button/strong")
 WebElement displayPoundSterling;
 
 @FindBy(name="USD")
 WebElement clickOnUSDollar;
 
 @FindBy(xpath="//*[@id=\"form-currency\"]/div/button/strong")
 WebElement displayUSDollar;
 
 @FindBy(linkText="Gift Certificates")
 WebElement clickOnGiftCerticate;
 
 @FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/a/i")
 WebElement contactIcon;
 
 @FindBy(linkText="About Us")
 WebElement clickOnAboutUs;
 
 @FindBy(linkText="Delivery Information")
 WebElement clickOnDeliveryInformation;
 
 @FindBy(linkText="Privacy Policy")
 WebElement clickOnPrivacyPolicy;
 
 @FindBy(linkText="Terms & Conditions")
 WebElement clickOnTermsAndConditions;
 
 @FindBy(linkText="Brands")
 WebElement clickOnBrands;
 
 @FindBy(xpath="//*[@id=\"content\"]/h3")
 WebElement dsiplayFeatured;
 
 @FindBy(xpath="//*[@id=\"content\"]/div[1]/div[3]/div[2]")
 WebElement clickTheHeroImageOnTheLeftSliderOptions;
 
 @FindBy(xpath="//*[@id=\"content\"]/div[1]/div[3]/div[1]")
 WebElement clickTheHeroImageOnTheRightSliderOptions;
 
 @FindBy(xpath="//*[@id=\"content\"]/div[1]/div[2]/span[1]")
 WebElement clickTheUnderHeroImageOnTheLeftDotOptions;
 
 @FindBy(xpath="//*[@id=\"content\"]/div[1]/div[2]/span[2]")
 WebElement clickTheUnderHeroImageOnTheRighttDotOptions;
 
 @FindBy(xpath="//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")
 WebElement displayfirstImage;
 
 @FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img")
 WebElement displaySecondImage;
 
 @FindBy(xpath="//*[@id=\"content\"]/div[2]/div[3]/div/div[1]/a/img")
 WebElement displayThirdImage;
 
 @FindBy(xpath="//*[@id=\"content\"]/div[2]/div[4]/div/div[1]/a/img")
 WebElement displayFourthImage;
 
 @FindBy(linkText="MacBook")
 WebElement clickOnMacBook;
 
 @FindBy(xpath="//*[@id=\"content\"]/div[3]/div[3]/div[2]")
 WebElement clickOnVariousLeftOptions;
 
 @FindBy(xpath="//*[@id=\"content\"]/div[3]/div[3]/div[1]")
 WebElement clickOnVariousRightOptions;
 
 public HomePage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
 //Actions

 public LoginPage selectLoginOption() {
	 loginOption.click();
	 return new LoginPage(driver);
 }
 public void clickOnMyAccountDropMenu() {
		myAccountDropMenu.click();
	}
	public void clickOnLogout() {
		logoutOption.click();
	}
	public boolean getDisplayLogout() {
	boolean status=	logoutOption.isDisplayed();
	return status;
	}
 
	public boolean getDisplayBreadCrumb() {
	boolean status=	breadCrumb.isDisplayed();
	return status;
	}
	
	public WebElement getDisplayHeadingPage() {
		
		return headingPage;
}
	
	
	
//	public RegisterPage clickOnRegister() {
//		register.click();
//		return new RegisterPage(driver);
//	}
	public void enterSearchFunctionality(String search) {
		Search.sendKeys(search);
	}
	public SearchPage clickOnSeacrhButton() {
		searchButton.click();
		return new SearchPage(driver);
	}
	public void clickOnShowAllDesktops() {
		clickOnShowAllDesktops.click();
}
	public boolean getDisplayCompareThisProductInFeaturedSection() {
		boolean displayStatus=compareThisProductInFeaturedSection.isDisplayed();
		return displayStatus;
	}
	public void clickOnCompareThisProductInFeaturedSection() {
		compareThisProductInFeaturedSection.click();
	}
	public boolean getDisplaySuccessfullyYouHaveAddedProductToYourProductComparision() {
		boolean displayStatus=successYouHaveAddedProductToYourProductComparision.isDisplayed();
		return displayStatus;
	}
	public void clickOnProductComparisionLinkInHomePageSuccessMessage() {
		clickOnProductComparisionLinkInHomePageSuccessMessage.click();
	}
	public boolean getDisplaySearchFunctionality() {
		boolean displayStatus=Search.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplaySearchButton() {
		boolean displayStatus=searchButton.isDisplayed();
		return displayStatus;
	}
	public void clickOnSiteMapLinkInFooterOption() {
		clickOnSiteMapLinkInFooterOption.click();
	}
	public void clickOnCartButton() {
		CartButton.click();
	}
	public boolean getDisplayYourShopplingCartIsEmpty() {
		boolean displayStatus=YourShopplingCartIsEmpty.isDisplayed();
		return displayStatus;
	}
	public void clickOnViewCart() {
		viewCart.click();
	}
	public void clickOnSpecialsOnFooterOptions() {
		clickOnSpecialsOnFooterOptions.click();
	}
	public boolean getDisplayWishListInHeaderOption() {
		boolean displayStatus=WishListInHeaderOption.isDisplayed();
		return displayStatus;
	}
	public void clickOnAddToCartOnMacbook() {
		clickOnAddToCartOnMacbook.click();
	}
	public boolean gettDisplaySuccessYouHaveAddedProductToShoppingCart() {
		boolean diplayStatus=displaySuccessYouHaveAddedProductToShoppingCart.isDisplayed();
		return diplayStatus;
	}
	public void clickOnShoppingCartLinkInSuccessMessage() {
		clickOnShoppingCartLinkInSuccessMessage.click();
	}
	public void clickOnCheckOutHeaderOption() {
		clickOnCheckOutHeaderOption.click();
	}
	public void clickOnContactUsLinkInFooterOptions() {
		clickOnContactUsLinkInFooterOptions.click();
	}
	public void clickOnCurrency() {
		clickOnCurrency.click();
	}
	public void clickOnEuro() {
		clickOnEuro.click();
	}
	public boolean getDisplayEuroDollar() {
		boolean displayStatus=displayEuroDollar.isDisplayed();
		return displayStatus;
	}
	public void clickOnPoundSterling() {
		clickOnPoundSterling.click();
	}
	public boolean getDisplayPoundSterling() {
		boolean displayStatus=displayPoundSterling.isDisplayed();
		return displayStatus;
	}
	public void clickOnUsDollar() {
		clickOnUSDollar.click();
	}
	public boolean getDisplayUSDollar() {
		boolean displayStatus=displayUSDollar.isDisplayed();
		return displayStatus;
	}
	public void clickOnGiftCerticate() {
		clickOnGiftCerticate.click();
	}
	public boolean getDisplayContactUsIcon() {
		boolean displayStatus=contactIcon.isDisplayed();
		return displayStatus;
	}
	public void clickOnAboutUs() {
		clickOnAboutUs.click();
	}
	public void clickOnDeliveryInformation() {
		clickOnDeliveryInformation.click();
	}
	public void clickOnPrivacyPolicy() {
		clickOnPrivacyPolicy.click();
	}
	public void clickOnTermsAndConditions() {
		clickOnTermsAndConditions.click();
	}
	public void clickOnBrands() {
		clickOnBrands.click();
	}
	public boolean displayFeaturedSection() {
		boolean displayStatus=dsiplayFeatured.isDisplayed();
		return displayStatus;
	}
	public void clickTheHeroImageOnTheLeftSliderOptions() {
		clickTheHeroImageOnTheLeftSliderOptions.click();
	}
	public void clickTheHeroImageOnTheRightSliderOptions() {
		clickTheHeroImageOnTheRightSliderOptions.click();
	}
	public void clickTheUnderHeroImageOnTheLeftDotOptions() {
		clickTheUnderHeroImageOnTheLeftDotOptions.click();
	}
	public void clickTheUnderHeroImageOnTheRighttDotOptions() {
		clickTheUnderHeroImageOnTheRighttDotOptions.click();
	}
	public boolean getDisplayfirstImage() {
		boolean displayStatus=displayfirstImage.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplaySecondImage() {
		boolean displayStatus=displaySecondImage.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplayThirdImage() {
		boolean displayStatus=displayThirdImage.isDisplayed();
		return displayStatus;
	}
	public boolean getDisplayFourthImage() {
		boolean dsiplayStatus=displayFourthImage.isDisplayed();
		return dsiplayStatus;
	}
	public void clickOnMacBook() {
		clickOnMacBook.click();
	}
	public void clickOnVariousLeftOption() {
		clickOnVariousLeftOptions.click();
	}
	public void clickOnVariousRightOptions() {
		clickOnVariousRightOptions.click();
	}
}
