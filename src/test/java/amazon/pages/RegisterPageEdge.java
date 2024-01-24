package amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPageEdge {
	
	private WebDriver driver;

	// Initialize Driver
	public RegisterPageEdge(WebDriver driver) {
		this.driver = driver;
	}

	// locators
	private By name = By.xpath("//input[@id='ap_customer_name']");
	private By phonenumber = By.xpath("//input[@id='ap_phone_number']");
	private By email = By.xpath("//input[@id='ap_email']");
	private By password = By.xpath("//input[@id='ap_password']");
	private By verify = By.xpath("//span[@id='auth-continue']");

	// public methods_actions

	public void RegisterDetails(String Name, String Phno, String Email, String Password) {

		driver.findElement(name).sendKeys("Mariya");
		driver.findElement(phonenumber).sendKeys("8089653167");
		driver.findElement(email).sendKeys("ub.testexample@gmail.com");
		driver.findElement(password).sendKeys("Ubtestexample123*");
		driver.findElement(verify).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("register"), "Signup failed");
		System.out.println("Signup success ");
		
		//sign in link from create an account page
		driver.findElement(By.xpath("(//a[@class='a-link-emphasis'])[1]")).click();
		System.out.println("Redirected to Login Page");
		
	}


}
