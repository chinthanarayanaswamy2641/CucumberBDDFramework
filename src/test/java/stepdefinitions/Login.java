package stepdefinitions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myhooks.Hook;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.interactions.Actions;

import utils.DriverFactory;
import utils.ExcelFileUtils;
import utils.Utilities;
import pages.LoginPage;
import pages.RegisterPage;
import pages.HomePage;
import pages.AccountPage;
import pages.ForgotPasswordPage;
public class Login {
	
 WebDriver driver;
 HomePage homepage;
 LoginPage loginpage;
 AccountPage accountpage;
 ForgotPasswordPage forgotpasswordpage;
 RegisterPage registerpage;
	
@Given("User has navigated to login page")
public void user_has_navigated_to_login_page() throws Throwable {
	 driver=DriverFactory.getDriver();
	 homepage=new HomePage(driver);
	 homepage.clickOnMyAccountDropMenu();
	loginpage=homepage.selectLoginOption();
}
@When("User enters valid emial into email field")
public void user_enters_valid_emial_into_email_field() throws Throwable {

	loginpage.enterEmailAddress(ExcelFileUtils.getData("Vaishnav",1,1));
}
@And("User enters valid password into the password field")
public void user_enters_valid_password_into_the_password_field() {
	loginpage.enterPasswordlAddress(ExcelFileUtils.getData("Vaishnav",2,1));
}
@Then("User clicks on Login button")
public void user_clicks_on_login_button() {
	accountpage=loginpage.clickOnLoginButton();
}
@Then("User should get logged")
public void user_should_get_logged() {
	
	 Assert.assertTrue(accountpage.getDisplayStatusOfEditYourAccountInformation());
}
@When("User enters invalid emial into email field")
public void user_enters_invalid_emial_into_email_field() {
	loginpage.enterEmailAddress(Utilities.generateEmailWithTimeStamp());
	//core
}

@And("User enters invaid password into the password field")
public void user_enters_invaid_password_into_the_password_field() {
	loginpage.enterPasswordlAddress(ExcelFileUtils.getData("Vaishnav",4,1));
}

@Then("User should get proper warning message about credentials mismatch")
public void user_should_get_proper_warning_message_about_credentials_mismatch() {
	Assert.assertTrue(loginpage.retrieveEmailPasswordNotMatchingWarningMessageText().contains("Warning: No match for E-Mail Address and/or Password."));
}
@When("user clicks on forgotten password link")
public void user_clicks_on_forgotten_password_link() {
	forgotpasswordpage=loginpage.clickOnForgotPassword();
}

@Then("User should be taken to forgotten password page")
public void user_should_be_taken_to_forgotten_password_page() {
	Assert.assertTrue(forgotpasswordpage.getDisplayForgottenPasswordPageHeaderOption());
	  
}
@When("User enters the login details using keyboard keys")
public void user_enters_the_login_details_using_keyboard_keys() {
	Actions act=new Actions(driver);
	accountpage=loginpage.enterEmailAddress(ExcelFileUtils.getData("Vaishnav",1,1));
	act.sendKeys(Keys.TAB)
	.sendKeys(ExcelFileUtils.getData("Vaishnav",2,1))
	.sendKeys(Keys.TAB)
	.sendKeys(Keys.TAB)
	.sendKeys(Keys.ENTER)
	.build().perform();
}
@When("User verify email place holder text")
public void user_verify_email_place_holder_text() {
	WebElement emailField = loginpage.enterEmailText();
	Assert.assertTrue(emailField.getAttribute("placeholder").contains("E-Mail Address"));
}

@When("User verify password place holder text")
public void user_verify_password_place_holder_text() {
	WebElement passwordField =loginpage.enterPasswordText();
	    Assert.assertTrue(passwordField.getAttribute("placeholder").contains("Password"));
}
@When("User click on back button")
public void user_click_on_back_button() {
   driver.navigate().back();
}

@Then("User should not logged")
public void user_should_not_logged() {
    Assert.assertTrue(driver.getTitle().contains("My Account"));
}
@When("User click on my account drop menu")
public void user_click_on_my_account_drop_menu() {
	accountpage.clickOnMyAccountDropMenu();
}

@When("User click on logout button on under my account drop menu")
public void user_click_on_logout_button_on_under_my_account_drop_menu() {
	accountpage.clickOnlogoutUnderMyAccountDropMenu();
}

@Then("User should get login page")
public void user_should_get_login_page() {
	String expectedLoginPageTitle =ExcelFileUtils.getData("Vaishnav",10,1);
	System.out.println("expected"+expectedLoginPageTitle);
    String actualTitle = driver.getTitle();
    System.out.println(actualTitle);
    Assert.assertTrue(actualTitle.equals(expectedLoginPageTitle), "Account Login page is not displayed");
}
@When("User click on continue button under new customer in login page")
public void user_click_on_continue_button_under_new_customer_in_login_page() {
	registerpage=loginpage.clickOnContinueButton();
}

@When("User click on login page link in Register page")
public void user_click_on_login_page_link_in_register_page() {
	registerpage.clickOnLoginPage();
}

@When("User click on login option in right column options")
public void user_click_on_login_option_in_right_column_options() {
	registerpage.clickOnLogin();
}

@When("User verify the heading page of the login page")
public void user_verify_the_heading_page_of_the_login_page() {
Assert.assertTrue(loginpage.getDisplayHeadingPage());
}

@When("User verify the page tittle of the login page")
public void user_verify_the_page_tittle_of_the_login_page() {
	String actualTitle = driver.getTitle();
    String expectedTitle = "Account Login"; 
 Assert.assertTrue(actualTitle.equals(expectedTitle),"didn't match");
}

@When("User verify the bread crumb of the login page")
public void user_verify_the_bread_crumb_of_the_login_page() {
    Assert.assertTrue(loginpage.getDisplayBreadCrumbOfLogin());
}

@Then("user verify the url of the login page")
public void user_verify_the_url_of_the_login_page() {
	 Assert.assertTrue(driver.getCurrentUrl().contains("https://tutorialsninja.com/demo/index.php?route=account/login"));
}
@When("User verify ui of the login page")
public void user_verify_ui_of_the_login_page() {
    Assert.assertTrue(loginpage.getDisplayUiOfTheInputEmail());
    Assert.assertTrue(loginpage.getDisplayUIOfThePassword());
    Assert.assertTrue(loginpage.getDisplayUIOfTheLogin());
}

}
