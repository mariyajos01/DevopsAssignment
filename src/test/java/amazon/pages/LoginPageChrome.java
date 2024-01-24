package amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageChrome {

	private WebDriver driver;

	// Initialize Driver
	public LoginPageChrome(WebDriver driver) {
		this.driver = driver;
	}

	// locators
	private By signin_email = By.xpath("//input[@id='ap_email']");
	private By continue_button = By.xpath("//input[@id='continue']");
	private By signin_password = By.xpath("//input[@id='ap_password']");
	private By signin_button = By.xpath("//input[@id='signInSubmit']");

	// methods+action
	public void SignInEmail(String SignInEmail) {

		driver.findElement(signin_email).sendKeys("ub.testexample@gmail.com");
		driver.findElement(continue_button).click();

	}

	public void SignInPassword(String SignInpsw) {

		driver.findElement(signin_password).sendKeys("Ubtestexample123*");
		Assert.assertTrue(driver.getCurrentUrl().contains("signin"), "Password failed");
		System.out.println("Successfully entered password! ");
		driver.findElement(signin_button).click();
		driver.navigate().to("https://www.amazon.in/");

	}

}
