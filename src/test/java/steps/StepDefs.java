package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class StepDefs {
	WebDriver driver;
	LoginPage login;
	

	@Before
	public void before_run() {
		driver = BrowserFactory.init();
		login = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the TechFios Login Page$")
	public void user_is_on_the_TechFios_Login_Page() throws Throwable {
		driver.get("http://www.techfios.com/billing/?ng=admin/");

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String userName) throws Throwable {
		login.enterUserName(userName);
	}

	@When("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String password) throws Throwable {
		login.enterPassword(password);
	}

	@When("^User clicks on Signin Button$")
	public void user_clicks_on_Signin_Button() throws Throwable {
		login.clickSignInButton();
	}
	
	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String userName, String password) throws Throwable {
	   login.enterCredentials(userName, password);
	}

	@Then("^User should land on Dashboard Page$")
	public void user_should_land_on_Dashboard_Page() throws Throwable {
		//login.getPageTitle();
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = login.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		login.takeScreenshotAtEndOfTest();
	}
    
	@After
	public void tear_down() {
		driver.close();
		driver.quit();
	}
}
