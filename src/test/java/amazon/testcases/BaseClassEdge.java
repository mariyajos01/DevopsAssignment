package amazon.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import amazon.pages.ExploreAmazonEdge;
import amazon.pages.LoginPageEdge;
import amazon.pages.RegisterPageEdge;

public class BaseClassEdge {

	public WebDriver driver;
	public EdgeOptions options;
	public RegisterPageEdge rp1;
	public LoginPageEdge lp1;
	public ExploreAmazonEdge ea1;

	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {

		options= new EdgeOptions();
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
		
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		System.out.println("The title is: "+driver.getTitle());
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']//span[@class='nav-icon nav-arrow']")).click();
		//driver.findElement(By.xpath("(//a[text()='Start here.'])[1]")).click();
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		rp1 = new RegisterPageEdge(driver);
		lp1=new LoginPageEdge(driver);
		ea1=new ExploreAmazonEdge(driver);
	}
	
	
	
	  @AfterClass 
	  public void teardown() {
	  
	  driver.quit(); }
	 
	 

}
