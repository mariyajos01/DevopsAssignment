package amazon.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class BrowseAmazonTestFirefox extends BaseClassFirefox {

	@BeforeClass
	public void pageSetUp() {

		rp1.RegisterDetails("Mariya", "8089653167", "ub.testexample@gmail.com", "Ubtestexample123*");
		lp1.SignInEmail("ub.testexample@gmail.com");
		lp1.SignInPassword("Ubtestexample123*");
	}

	@Test
	public void BrowseApplication() throws InterruptedException {

		
			Thread.sleep(5000);
			ea1.exploreAmazon();
			System.out.println("Successfully Browsed!");
	

	}
}
