package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element Library( Techfios Approach)
	/*
	 * @FindBy(id = "username") WebElement USER_NAME_ELEMENT;
	 * 
	 * @FindBy(how = How.ID, using = "username") WebElement USER_NAME_ELEMENT;
	 * 
	 * @FindBy(how = How.ID, using = "password") WebElement USER_PASSWORD_ELEMENT;
	 * 
	 * @FindBy(how = How.NAME, using = "login") WebElement SIGN_IN_BUTTON_ELEMENT;
	 */
	// Element Library (Udemy Approach)
	@FindBy(id = "username")
	WebElement USER_NAME_ELEMENT;
	@FindBy(id = "password")
	WebElement USER_PASSWORD_ELEMENT;
	@FindBy(name = "login")
	WebElement SIGN_IN_BUTTON_ELEMENT;

	// Interactive methods
	public void enterUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}

	public void enterPassword(String password) {
		USER_PASSWORD_ELEMENT.sendKeys(password);
	}

	public void clickSignInButton() {
		SIGN_IN_BUTTON_ELEMENT.click();
	}

	/// html/body/div/div/div/div[2]

	// Element library
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/div[2]")
	WebElement LOGIN_VALIDATION_ELEMENT;

	/*
	 * public void validateLogIn() { String alert =
	 * LOGIN_VALIDATION_ELEMENT.getText(); Assert.assertEquals(alert,
	 * "Invalid Username or Password", "Bug In loginPage");
	 */
	// LOGIN_VALIDATION_ELEMENT.click();

	// }

	public String getPageTitle() {
		return driver.getTitle();
	}

	
	  public void enterCredentials(String userName, String password) {
	  USER_NAME_ELEMENT.sendKeys(userName);
	  USER_PASSWORD_ELEMENT.sendKeys(password);
	  
	  }
	 

	public void takeScreenshotAtEndOfTest() throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("user" + "/screenshots" + System.currentTimeMillis() + ".png"));
	}
}
