package amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ExploreAmazonEdge {
	
	public WebDriver driver;

	// Initialize Driver
	public ExploreAmazonEdge(WebDriver driver) {
		this.driver = driver;
	}

	// locators
	By all_dropdown = By.xpath("//select[@title='Search in']");
	By select_one_option = By.xpath("//option[text()='Amazon Devices']");
	By search = By.xpath("//input[@aria-label='Search Amazon.in']");
	By search_button= By.xpath("//input[@id='nav-search-submit-button']");
	

	// methods+action
	public void exploreAmazon() {

		driver.findElement(all_dropdown).click();
		driver.findElement(select_one_option).click();
		driver.findElement(search).sendKeys("Mobiles");
		driver.findElement(search_button).click();
		
	}

}
