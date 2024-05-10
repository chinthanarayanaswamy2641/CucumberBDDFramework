package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]")
	 public WebElement addToCart;

	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img")
	WebElement clickOnProductDisplayedInTheSearchResults;

	@FindBy(linkText="shopping cart")
	WebElement shoppingCart;

	@FindBy(xpath="//button[@class='btn btn-default'][2]")
	WebElement compareThisProduct;
	 
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[3]/i")
	WebElement comparethisProducts;

	@FindBy(xpath="//*[@id=\"list-view\"]/i")
	WebElement clickOnImacResultsInListView;

	@FindBy(linkText="iMac")
	WebElement clickOnProductNameLinkInSearchField;

	@FindBy(xpath="//button[@data-original-title='Compare this Product']")
	WebElement compareThisProductInTheImacList;


		
	@FindBy(xpath="//div[contains(@class,alert-dismissible)]/i")
	WebElement successYouHaveAddedImacToYourProductComparisionInSearchpage;

	@FindBy(linkText="product comparison")
	WebElement clickOnProductComparisionLinkInImacSuccesMessageInSearchPage;

	@FindBy(xpath="//*[@id=\"grid-view\"]/i")
	WebElement clickOnImacResultsInGridView;

	@FindBy(xpath="//button[@data-original-title='Compare this Product']")
	WebElement compareThisProductInTheImacGridView;

	@FindBy(linkText="Product Compare (0)")
	WebElement productCompareLink;

	@FindBy(xpath="//button[@data-original-title='Compare this Product']")
	WebElement clickOnCompareThisProductSearchResults;

	@FindBy(xpath="//*[@id=\"product-search\"]/div[1]/i")
	WebElement SuccessYouHaveAddedMacBookAirToYourProductComarision;

	@FindBy(xpath="//div[contains(@class,alert-dismissible)]/i")
	WebElement successYouHaveAddedProductToYoutShoppingCart;

	@FindBy(linkText="login")
	WebElement clickOnLogin;

	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	WebElement CartButton;

	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img")
	WebElement clickOnProductImageInTheDisplayedToggleBox;

	@FindBy(linkText="iMac")
	WebElement productNameLinkInTheDisplayedToggleBox;

	@FindBy(linkText="iMac")
	WebElement displayProductNameLinkInSearchField;

	@FindBy(xpath="//input[@id='button-search']/following-sibling::p")
	WebElement displayThereIsNoProductThatMatches;

	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]")
	WebElement displayMoreThanOneProductShouldBeDisplayed;

	@FindBy(id="input-search")
	WebElement enterInSearchCriteriaField;

	@FindBy(id="button-search")
	WebElement clickOnSearchCriteriaButton;

	@FindBy(linkText="iMac")
	WebElement displaySearchProduct;

	@FindBy(id="description")
	WebElement clickOnSearchInProductDescription;

	@FindBy(name="sub_category")
	WebElement clickOnSeachSubCategories;

	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]")
	WebElement displaySigleProductShouldBeDisplayed;

	@FindBy(linkText="Search")
	WebElement displsyBreadCrumbOfSearch;

	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/i")
	WebElement AddToCart;

	@FindBy(id="cart-total")
	WebElement cartButton;

	@FindBy(xpath="//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong/i")
	WebElement viewCart;

	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[2]/i")
	WebElement clickOnAddToWishList;

	@FindBy(xpath="//*[@id=\"product-search\"]/div[1]/i")
	WebElement displaySuccessYouHaveAddedToWishList;

	@FindBy(linkText="wish list")
	WebElement clickOnWishListInSuccesMessage;

	@FindBy(xpath="//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button/i")
	WebElement clickOnRemoveIcon;

		public SearchPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		public void clickOnAddToCartButton() {
			addToCart.click();
		}
		public void clickOnShoppingCartLink() {
			shoppingCart.click();
		}
		public void clickOnTheProductDisplayedInTheSearchResults() {
			clickOnProductDisplayedInTheSearchResults.click();
		}
		public boolean getDisplayToolTipCompareThisProduct() {
			boolean displayStatus=compareThisProduct.isDisplayed();
			return displayStatus;
		}
		public void clickOnImacResultsInListView() {
			clickOnImacResultsInListView.click();
		}
		public boolean getDisplayCompareThisProductInTheImacList() {
			boolean displayStatus=compareThisProductInTheImacList.isDisplayed();
			return displayStatus;
		}
		public void clickOnCompareThisProductInTheImacList() {
			compareThisProductInTheImacList.click();
		}
		public boolean getDisPlaySuccessYouHaveAddedImacToYourProductComparisionInSearchPage() {
			boolean displayStatus=successYouHaveAddedImacToYourProductComparisionInSearchpage.isDisplayed();
			return displayStatus;
		}
		public void clickOnProductComparisionLinkInImacSuccesMessageInSearchPage() {
			clickOnProductComparisionLinkInImacSuccesMessageInSearchPage.click();
		}
		public void clickOnImacResultsInGridView() {
			clickOnImacResultsInGridView.click();
		}
		public void clickOnCompareThisProductInTheImacGridView() {
			compareThisProductInTheImacGridView.click();
		}
		public boolean getDisplayCompareThisProductInTheImacGridView() {
			boolean displayStatus=compareThisProductInTheImacGridView.isDisplayed();
			return displayStatus;
		}
		public void clickOnProductCompareLink() {
			productCompareLink.click();
		}
		public void clickOnCompareThisProductSearchResults() {
			clickOnCompareThisProductSearchResults.click();
		}
		public boolean getDisplaySuccessYouHaveAddedProductToYoutShoppingCart() {
			boolean displayStatus=successYouHaveAddedProductToYoutShoppingCart.isDisplayed();
			return displayStatus;
		}
		public void clickOnCompareThisProduct() {
			comparethisProducts.click();
		}
		public boolean getDisplayCompareThisProduct() {
			boolean displayStatus=comparethisProducts.isDisplayed();
			return displayStatus;
		}
		public boolean getDisplayProductComparision() {
			boolean displayStatus=clickOnProductComparisionLinkInImacSuccesMessageInSearchPage.isDisplayed();
			return displayStatus;
		}
		public void clickOnLogin() {
			clickOnLogin.click();
		}
		
		public void clickOnProductImageInTheDisplayedToggleBox() {
			clickOnProductImageInTheDisplayedToggleBox.click();
		}
		public void ClickOnProductNameLinkInTheDisplayedToggleBox() {
			productNameLinkInTheDisplayedToggleBox.click();
		}
		public boolean getDisplayProductNameLinkInSearchField() {
			boolean displayStatus=displayProductNameLinkInSearchField.isDisplayed();
		    return displayStatus;
		}
		public boolean getDisplayThereIsNoProductThatMatches() {
			boolean displayStatus=displayThereIsNoProductThatMatches.isDisplayed();
			return displayStatus;
		}
		public boolean getDisplayMoreThanOneProductShouldBeDisplayed() {
			boolean displayStatus=displayMoreThanOneProductShouldBeDisplayed.isDisplayed();
			return displayStatus;
		}
		public void enterInSearchCriteriaField(String search) {
			enterInSearchCriteriaField.sendKeys(search);
		}
		public void clickOnSearchCriteriaButton() {
			clickOnSearchCriteriaButton.click();
		}
		public boolean getDisplaySearchProduct() {
			boolean displayStatus=displaySearchProduct.isDisplayed();
			return displayStatus;
		}
		public void clickOnSearchInProductDescription() {
			clickOnSearchInProductDescription.click();
		}
		public void clickOnSeachSubCategories() {
			clickOnSeachSubCategories.click();
		}
		public boolean getDisplaySigleProductDisplayed() {
			boolean displayStatus=displaySigleProductShouldBeDisplayed.isDisplayed();
			return displayStatus;
		}
		public void clickOnProductNameLinkInSearchField() {
			clickOnProductNameLinkInSearchField.click();
		}
		public boolean displsyBreadCrumbOfSearch() {
			boolean displayStatus=displsyBreadCrumbOfSearch.isDisplayed();
			return displayStatus;
		}
		public void clickOnAddToCart() {
			AddToCart.click();
		}
		public void clickOnViewCart() {
			viewCart.click();
		}
		public void clickOnCartButton() {
			cartButton.click();
		}
		public void clickOnAddToWishList() {
			clickOnAddToWishList.click();
		}
		public boolean getDisplaySuccessYouHaveAddedToWishList() {
			boolean displayStatus=displaySuccessYouHaveAddedToWishList.isDisplayed();
			return displayStatus;
		}
		public void clickOnWishListInSuccesMessage() {
			clickOnWishListInSuccesMessage.click();
		}
		public void clickOnRemoveIcon() {
			clickOnRemoveIcon.click();
		}
		
		
		
}
