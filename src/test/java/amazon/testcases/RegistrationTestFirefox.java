package amazon.testcases;

import org.testng.annotations.Test;

public class RegistrationTestFirefox extends BaseClassFirefox {

	@Test
	public void registerDetails() {

		rp1.RegisterDetails("Mariya", "8089653167", "ub.testexample@gmail.com", "Ubtestexample123*");

	}
}
