package amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTestEdge extends BaseClassEdge {
	
	@BeforeClass
	public void pageSetUp() {

		rp1.RegisterDetails("Mariya", "8089653167", "ub.testexample@gmail.com", "Ubtestexample123**");
	}

	@Test(priority=1)
	public void LoginWithEmail() {
		try {
			Thread.sleep(1000);
			lp1.SignInEmail("ub.testexample@gmail.com");
			Assert.assertTrue(driver.getCurrentUrl().contains("signin"), "Redirection to password field failed");
			System.out.println("Successfully redirected to password entering page ");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test(priority=2)
	public void LoginWithPassword() {

		lp1.SignInPassword("Ubtestexample123*");
		/*
		 * try { Thread.sleep(1000);
		 * Assert.assertTrue(driver.getCurrentUrl().contains("nav_ya_signin"),
		 * "SignIn failed");
		 * System.out.println("Successfully SignIn to Amazon Application! ");
		 * 
		 * } catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

	}

}
