package amazon.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import amazon.pages.ExploreAmazonFirefox;

import amazon.pages.LoginPageFirefox;

import amazon.pages.RegisterPageFirefox;

public class BaseClassFirefox {

	public WebDriver driver;
	public FirefoxOptions options;
	public RegisterPageFirefox rp1;
	public LoginPageFirefox lp1;
	public ExploreAmazonFirefox ea1;

	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {

		options= new FirefoxOptions();
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
		
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		System.out.println("The title is: "+driver.getTitle());
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']//span[@class='nav-icon nav-arrow']")).click();
		//driver.findElement(By.xpath("(//a[text()='Start here.'])[1]")).click();
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		rp1 = new RegisterPageFirefox(driver);
		lp1=new LoginPageFirefox(driver);
		ea1=new ExploreAmazonFirefox(driver);
	}
	
	
	  @AfterClass 
	  public void teardown() {
	  
	  driver.quit(); }
	 
}
