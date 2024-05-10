package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LogoutPage;
import utils.DriverFactory;
public class Logout {

	WebDriver driver;
	LogoutPage logoutpage;
	@When("User click on continue button on logout page")
	public void user_click_on_continue_button_on_logout_page() {
		driver=DriverFactory.getDriver();
	    logoutpage=new LogoutPage(driver);
	    logoutpage.clickOnContinue();
		//driver.findElement(By.linkText("Continue")).click();
	}

	@Then("User should get display home page title")
	public void user_should_get_display_home_page_title() {
	   Assert.assertTrue(driver.getTitle().contains("Your Store"));
	}



}
